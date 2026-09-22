
```drawio-resource
../github.drawio
```

[TOC levels=6]

# Nasdanika GitHub Model

> **Draft.** This document and [`github.xcore`](github.xcore) describe a design, not a shipped
> module. See [`assessment.md`](assessment.md) for scope, sizing and the build-or-adopt argument,
> and [`marketing-plan.md`](marketing-plan.md) for the writing this leads to.

An [Ecore](https://www.eclipse.org/modeling/emf/) model of what GitHub holds: accounts,
organizations, teams, repositories, branches, tags, releases, access and code ownership. Defined in
[`github.xcore`](github.xcore). Loaded with [hub4j/github-api](https://github.com/hub4j/github-api),
and shipping a `GitHubURIHandler` so EMF resources can be read from and written back to a repository
without cloning it.

It is a sibling of the [GitLab model](https://gitlab.models.nasdanika.org/) and differs from it in
one deliberate way: **it is logical rather than physical.**

## Logical rather than physical

**A physical model follows the wire.** One class per payload shape, one attribute per JSON field,
the API's own duplication preserved. It is mechanical to produce, faithful to one version of one
API, and unpleasant to query, because the questions people ask do not have the shape of the
endpoints that answer them.

**A logical model follows the concepts.** One class per thing that exists, in the form it actually
has, with the transport's artifacts left at the loader. More work to author, much better to read,
query, diff and cross-reference.

Concretely, in this model:

| Physical would give you | This model gives you |
|---|---|
| `SimpleUser`, `PrivateUser`, `PublicUser`, `Collaborator`, `Contributor` | One `User`, with what has been loaded recorded as data |
| Seventeen `*_url` fields per repository | `htmlUrl`, `cloneUrl`, `sshUrl`; the rest are derivable |
| `owner` as an untyped object, or two nullable fields | `Account`, which is a `User` or an `Organization` |
| Separate branch, tag and ref payloads | `Ref`, with `Branch` and `Tag` on top of it |
| Permissions spread across four endpoints | `Collaborator`, `TeamAccess` and `Membership`, each with a role and a source |
| A copy of every commit | `commitSha`, which resolves into the [Git model](https://github.com/Nasdanika-Models/git) |
| Nullable fields you interpret | `Load` records that say what was fetched, when, and whether it finished |

The one place the transport is allowed to show through is provenance, and it earns its place. See
[Loading is data](#loading-is-data).

## Scope

| | |
|---|---|
| **In** | Instances, accounts (users, organizations, bots), teams and nesting, memberships, repositories with their counts and languages, branches, tags, branch protection, releases and assets, collaborators and team access, parsed CODEOWNERS, contribution counts |
| **Out: Actions** | Workflows, runs, jobs, steps, runners, artifacts, environments, secrets. A bigger object graph than everything above put together, a different change rate, a different audience. A separate model that pairs with build and pipeline concerns |
| **Out: collaboration** | Issues, pull requests, reviews, comments, labels, milestones, projects. The other large area, where the row counts are, and the place the [work model](https://work.models.nasdanika.org/) already has a vocabulary. A sibling model whose job is mostly projection |
| **Out: git** | Commits, trees, blobs. Referenced by SHA, never restated |
| **Out: packages** | GitHub Packages is a publishing destination, and destinations are the [release model](../release/readme.md)'s `Registry` |

The split is not squeamishness about size, it is the micro-model rule: a model should be small
enough to read in a sitting, and each of those areas is a model's worth of concepts on its own.
[`assessment.md`](assessment.md) argues the boundaries in detail.

## Identity

Three identities exist and all three are kept, because they answer different questions.

| Identity | Example | Property |
|---|---|---|
| `login` / `fullName` | `Nasdanika`, `Nasdanika/core` | What humans read and every URL contains. **Mutable**: accounts get renamed, repositories get transferred |
| `nodeId` | GraphQL global node id | Durable across renames. The right key for a join that has to survive a year |
| `databaseId` | REST numeric id | What most tooling and most logs carry |

Recommended [NxCore](https://nxcore.models.nasdanika.org/) URI forms, so an estate model, a release
model and a report all name the same repository the same way:

| Element | URI |
|---|---|
| Account | `github:account/<login>` |
| Repository | `github:repository/<owner>/<name>` |
| Branch | `github:branch/<owner>/<name>#<branch>` |
| Tag | `github:tag/<owner>/<name>#<tag>` |
| Release | `github:release/<owner>/<name>#<tag>` |
| Team | `github:team/<organization>/<slug>` |

`login` and `fullName` sit on `AbstractAccount` and `AbstractRepository` rather than on the concrete
classes, so a reference to something that was never loaded still names it, and containment can key
on it. That is the Abstract and Reference pattern from the GitLab and product management models:
a loaded model routinely mentions accounts and repositories it does not hold, and a reference is how
that is said without inventing a half populated object.

## Loading is data

Every model built from an API is a snapshot of a moving system, and a snapshot that does not say
when it was taken or how much of it succeeded is a liability.

`Loadable` carries `Load` records: the source, which reference was loaded, when it started and
ended, how many elements arrived, what failed, and the ETag. Three consequences worth stating:

* **Empty and unloaded are different facts.** A repository with no branches and no `Load` for
  `branches` means nobody looked. A repository with no branches and a completed `Load` means the
  repository is empty. Every report built on a partial scan needs that distinction, and a model
  without it silently reports absence as zero.
* **Counts need no timestamps of their own.** Stargazers, size and open issues sit directly on
  `Repository`, because the `Load` beside them already says when they were taken. Provenance as a
  first-class record is what buys that simplicity.
* **Refresh is conditional.** The stored ETag turns the next scan into a conditional request, and a
  304 costs no rate limit. Across a hundred repositories that is the difference between scanning
  hourly and scanning daily.

`complete` is false when pagination stopped early, which happens for reasons that are not errors: a
page limit, a rate limit, a deliberately shallow scan.

## Model overview

| Area | Types |
|---|---|
| Provenance | `Loadable`, `Load` (source, reference, start, end, size, error, etag, complete) |
| Root | `GitHub` (url, apiUrl, `enterpriseServer`, accounts) |
| Accounts | `AbstractAccount`, `Account` (login, nodeId, databaseId, repositories), `User`, `Organization`, `AccountReference`, `Team`, `Membership`, `MembershipRole`, `TeamPrivacy` |
| Repositories | `AbstractRepository`, `Repository`, `RepositoryReference`, `LanguageUsage`, `Contribution`, `Visibility` |
| Access | `Collaborator`, `TeamAccess`, `PermissionLevel`, `PermissionSource`, `CodeOwnerRule` |
| Refs | `Ref`, `Branch`, `Tag`, `BranchProtection` |
| Releases | `Release`, `ReleaseAsset` |
| Reused, not redefined | NxCore `ModelElement`, `NamedElement` |

Three shape decisions worth knowing before reading the xcore:

* **Release notes live in the inherited `documentation`**, not in a `body` attribute. That is what
  NxCore's `Documented` is for, and it puts generated and hand written notes in the same place.
* **Branch protection is in the model although it is configuration**, because it is the single most
  useful governance dataset GitHub holds. "Which of our repositories require a review on the default
  branch" currently takes a script per audit.
* **CODEOWNERS is parsed into `CodeOwnerRule`**, a file rather than an API object, and in the model
  anyway, because ownership is a concept the platform happens to implement as a file. The GitLab
  model made the same call.

## Loading with hub4j

[hub4j/github-api](https://github.com/hub4j/github-api) is the mature Java client and the right
supplier: it covers far more of the API than this model needs, handles pagination, conditional
requests and abuse-rate backoff, and supports app and installation authentication as well as tokens.

The loader is a mapping layer, and it is deliberately the only place that knows about `GH*` types.
The order that keeps rate limit spend honest:

1. Organizations for the instance, then repositories per organization. One page each, cheap.
2. Per repository: branches, tags, releases in parallel, each recording its own `Load`.
3. Per repository, on request only: collaborators, contributions, branch protection, CODEOWNERS.
   These are the expensive calls, and most reports do not need them.

Two things a loader has to get right and one it should refuse to do:

* **Record partial loads rather than failing.** A 403 on branch protection for a repository you can
  read but not administer is normal, and the right outcome is a `Load` with an error, not a lost
  scan.
* **Resolve references after loading, not during.** Load logins and full names first, resolve
  `AccountReference` and `RepositoryReference` targets in a second pass, so the order repositories
  arrive in does not change the result.
* **Do not paper over the fork and parent chain.** `parent` is the immediate upstream and `source`
  is the ultimate one, and conflating them makes fork analysis wrong in exactly the estates that
  have interesting forks.

## GitHubURIHandler

An EMF [`URIHandler`](https://download.eclipse.org/modeling/emf/emf/javadoc/2.4.3/org/eclipse/emf/ecore/resource/URIHandler.html)
that reads repository content through the API, so a resource set can load a model that lives in a
repository without cloning it. The counterpart of
[`GitLabURIHandler`](https://github.com/Nasdanika-Models/gitlab/blob/main/model/src/main/java/org/nasdanika/models/gitlab/util/GitLabURIHandler.java).

**URI format**, chosen to mirror `raw.githubusercontent.com` so that a URI is recognisable at sight:

```
github://<host alias>/<owner>/<repository>/<ref>/<path>[/!<jar path>]
```

```
github://github.com/Nasdanika/core/main/pom.xml
github://github.com/Nasdanika/core/v1.0.0/model/model.xmi
github://internal/platform/estate/main/estate.json
```

The host alias is an authority the handler maps to a `GitHub` API client, which is what makes
github.com and an enterprise server usable in the same resource set. A directory URI, one ending in
a separator, loads as a tree of `Tree` and `Blob`-equivalent entries the way the GitLab handler
does, so a resource set can list before it reads.

```java
try (GitHub gitHub = new GitHubBuilder().withOAuthToken(token).build()) {
    GitHubURIHandler handler = new GitHubURIHandler(Map.of("github.com", gitHub));
    resourceSet.getURIConverter().getURIHandlers().add(handler);

    Resource resource = resourceSet.getResource(
        URI.createURI("github://github.com/Nasdanika/core/main/pom.xml"), true);
}
```

Combined with a dispatching resource factory, this is how a `pom.xml` loads through the
[Maven model](https://maven.models.nasdanika.org/) and a `module-info.java` through the Java model,
straight from a hundred repositories, with no working copies on disk.

**Writing back is where GitHub is better than GitLab, and the handler should exploit it.** The
GitLab handler buffers changes and commits them through GitLab's multi-file commit endpoint. GitHub
has no single equivalent endpoint, but it has the Git Data API, which is strictly more capable: a
`GitHubTransaction` buffers modified resources, then creates blobs, builds one tree, creates one
commit and updates the ref, optionally on a new branch with a pull request opened against the
default one. That is an atomic, reviewable, multi-file commit, which is the shape model-driven
generation actually wants: **a generator run becomes a pull request**.

The handler should not commit implicitly on `save()`. Buffer, and let the caller commit inside the
client's try-with-resources block, the way the GitLab handler does, so one logical change is one
commit rather than one commit per resource.

## Relation to other Nasdanika work

Base classes come from [NxCore](https://nxcore.models.nasdanika.org/), and nothing else is imported.

| Model | Relationship |
|---|---|
| [Release](../release/readme.md) | This model is the **source**, the release model the **target**. Load the four organizations, project repositories into the release model's repository catalog, and read tags and releases back when cutting a release. Neither depends on the other's shape |
| [Git](https://github.com/Nasdanika-Models/git) | `commitSha` resolves into commits and trees. This model holds the GitHub layer above git, not git |
| [GitLab](https://gitlab.models.nasdanika.org/) | Sibling, same problem, physical where this is logical. A neutral projection over both is the eventual answer for a multi-forge estate |
| [Maven](https://maven.models.nasdanika.org/) | `pom.xml` loaded through the URI handler and parsed by the Maven model is how repository content becomes typed data |
| [Work](https://work.models.nasdanika.org/) | Where issues and pull requests will project to, when the collaboration model arrives |
| [Cypher](../cypher/readme.md) | The query surface. An estate of a hundred repositories with teams, permissions and ownership is a graph, and every interesting question about it is a traversal |
| [Architecture](../architecture/README.md) | Architecture as code: repositories carrying the models that describe the systems they build |

The first instance model is the Nasdanika estate itself: four organizations, roughly a hundred
repositories, loaded programmatically, published as JSON, and browsable in the reflective viewer.
That is both the proof and the demo.
