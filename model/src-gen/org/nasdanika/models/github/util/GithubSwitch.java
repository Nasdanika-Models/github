/**
 */
package org.nasdanika.models.github.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.github.*;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.github.GithubPackage
 * @generated
 */
public class GithubSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GithubPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubSwitch() {
		if (modelPackage == null) {
			modelPackage = GithubPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GithubPackage.LOADABLE: {
				Loadable loadable = (Loadable)theEObject;
				T result = caseLoadable(loadable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseModelElement(load);
				if (result == null) result = caseStringIdentity(load);
				if (result == null) result = caseDocumented(load);
				if (result == null) result = caseMarked(load);
				if (result == null) result = caseReferrable(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.GIT_HUB: {
				GitHub gitHub = (GitHub)theEObject;
				T result = caseGitHub(gitHub);
				if (result == null) result = caseNamedElement(gitHub);
				if (result == null) result = caseLoadable(gitHub);
				if (result == null) result = caseModelElement(gitHub);
				if (result == null) result = caseStringIdentity(gitHub);
				if (result == null) result = caseDocumented(gitHub);
				if (result == null) result = caseMarked(gitHub);
				if (result == null) result = caseReferrable(gitHub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.ABSTRACT_ACCOUNT: {
				AbstractAccount abstractAccount = (AbstractAccount)theEObject;
				T result = caseAbstractAccount(abstractAccount);
				if (result == null) result = caseModelElement(abstractAccount);
				if (result == null) result = caseStringIdentity(abstractAccount);
				if (result == null) result = caseDocumented(abstractAccount);
				if (result == null) result = caseMarked(abstractAccount);
				if (result == null) result = caseReferrable(abstractAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseNamedElement(account);
				if (result == null) result = caseAbstractAccount(account);
				if (result == null) result = caseLoadable(account);
				if (result == null) result = caseModelElement(account);
				if (result == null) result = caseStringIdentity(account);
				if (result == null) result = caseDocumented(account);
				if (result == null) result = caseMarked(account);
				if (result == null) result = caseReferrable(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseAccount(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = caseAbstractAccount(user);
				if (result == null) result = caseLoadable(user);
				if (result == null) result = caseModelElement(user);
				if (result == null) result = caseStringIdentity(user);
				if (result == null) result = caseDocumented(user);
				if (result == null) result = caseMarked(user);
				if (result == null) result = caseReferrable(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseAccount(organization);
				if (result == null) result = caseNamedElement(organization);
				if (result == null) result = caseAbstractAccount(organization);
				if (result == null) result = caseLoadable(organization);
				if (result == null) result = caseModelElement(organization);
				if (result == null) result = caseStringIdentity(organization);
				if (result == null) result = caseDocumented(organization);
				if (result == null) result = caseMarked(organization);
				if (result == null) result = caseReferrable(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.ACCOUNT_REFERENCE: {
				AccountReference accountReference = (AccountReference)theEObject;
				T result = caseAccountReference(accountReference);
				if (result == null) result = caseAbstractAccount(accountReference);
				if (result == null) result = caseModelElement(accountReference);
				if (result == null) result = caseStringIdentity(accountReference);
				if (result == null) result = caseDocumented(accountReference);
				if (result == null) result = caseMarked(accountReference);
				if (result == null) result = caseReferrable(accountReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.MEMBERSHIP: {
				Membership membership = (Membership)theEObject;
				T result = caseMembership(membership);
				if (result == null) result = caseModelElement(membership);
				if (result == null) result = caseStringIdentity(membership);
				if (result == null) result = caseDocumented(membership);
				if (result == null) result = caseMarked(membership);
				if (result == null) result = caseReferrable(membership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.TEAM: {
				Team team = (Team)theEObject;
				T result = caseTeam(team);
				if (result == null) result = caseNamedElement(team);
				if (result == null) result = caseLoadable(team);
				if (result == null) result = caseModelElement(team);
				if (result == null) result = caseStringIdentity(team);
				if (result == null) result = caseDocumented(team);
				if (result == null) result = caseMarked(team);
				if (result == null) result = caseReferrable(team);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.ABSTRACT_REPOSITORY: {
				AbstractRepository abstractRepository = (AbstractRepository)theEObject;
				T result = caseAbstractRepository(abstractRepository);
				if (result == null) result = caseModelElement(abstractRepository);
				if (result == null) result = caseStringIdentity(abstractRepository);
				if (result == null) result = caseDocumented(abstractRepository);
				if (result == null) result = caseMarked(abstractRepository);
				if (result == null) result = caseReferrable(abstractRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedElement(repository);
				if (result == null) result = caseAbstractRepository(repository);
				if (result == null) result = caseLoadable(repository);
				if (result == null) result = caseModelElement(repository);
				if (result == null) result = caseStringIdentity(repository);
				if (result == null) result = caseDocumented(repository);
				if (result == null) result = caseMarked(repository);
				if (result == null) result = caseReferrable(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.REPOSITORY_REFERENCE: {
				RepositoryReference repositoryReference = (RepositoryReference)theEObject;
				T result = caseRepositoryReference(repositoryReference);
				if (result == null) result = caseAbstractRepository(repositoryReference);
				if (result == null) result = caseModelElement(repositoryReference);
				if (result == null) result = caseStringIdentity(repositoryReference);
				if (result == null) result = caseDocumented(repositoryReference);
				if (result == null) result = caseMarked(repositoryReference);
				if (result == null) result = caseReferrable(repositoryReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.LANGUAGE_USAGE: {
				LanguageUsage languageUsage = (LanguageUsage)theEObject;
				T result = caseLanguageUsage(languageUsage);
				if (result == null) result = caseModelElement(languageUsage);
				if (result == null) result = caseStringIdentity(languageUsage);
				if (result == null) result = caseDocumented(languageUsage);
				if (result == null) result = caseMarked(languageUsage);
				if (result == null) result = caseReferrable(languageUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = caseModelElement(contribution);
				if (result == null) result = caseStringIdentity(contribution);
				if (result == null) result = caseDocumented(contribution);
				if (result == null) result = caseMarked(contribution);
				if (result == null) result = caseReferrable(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.COLLABORATOR: {
				Collaborator collaborator = (Collaborator)theEObject;
				T result = caseCollaborator(collaborator);
				if (result == null) result = caseModelElement(collaborator);
				if (result == null) result = caseStringIdentity(collaborator);
				if (result == null) result = caseDocumented(collaborator);
				if (result == null) result = caseMarked(collaborator);
				if (result == null) result = caseReferrable(collaborator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.TEAM_ACCESS: {
				TeamAccess teamAccess = (TeamAccess)theEObject;
				T result = caseTeamAccess(teamAccess);
				if (result == null) result = caseModelElement(teamAccess);
				if (result == null) result = caseStringIdentity(teamAccess);
				if (result == null) result = caseDocumented(teamAccess);
				if (result == null) result = caseMarked(teamAccess);
				if (result == null) result = caseReferrable(teamAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.CODE_OWNER_RULE: {
				CodeOwnerRule codeOwnerRule = (CodeOwnerRule)theEObject;
				T result = caseCodeOwnerRule(codeOwnerRule);
				if (result == null) result = caseModelElement(codeOwnerRule);
				if (result == null) result = caseStringIdentity(codeOwnerRule);
				if (result == null) result = caseDocumented(codeOwnerRule);
				if (result == null) result = caseMarked(codeOwnerRule);
				if (result == null) result = caseReferrable(codeOwnerRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.REF: {
				Ref ref = (Ref)theEObject;
				T result = caseRef(ref);
				if (result == null) result = caseNamedElement(ref);
				if (result == null) result = caseModelElement(ref);
				if (result == null) result = caseStringIdentity(ref);
				if (result == null) result = caseDocumented(ref);
				if (result == null) result = caseMarked(ref);
				if (result == null) result = caseReferrable(ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = caseRef(branch);
				if (result == null) result = caseNamedElement(branch);
				if (result == null) result = caseModelElement(branch);
				if (result == null) result = caseStringIdentity(branch);
				if (result == null) result = caseDocumented(branch);
				if (result == null) result = caseMarked(branch);
				if (result == null) result = caseReferrable(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseRef(tag);
				if (result == null) result = caseNamedElement(tag);
				if (result == null) result = caseModelElement(tag);
				if (result == null) result = caseStringIdentity(tag);
				if (result == null) result = caseDocumented(tag);
				if (result == null) result = caseMarked(tag);
				if (result == null) result = caseReferrable(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.BRANCH_PROTECTION: {
				BranchProtection branchProtection = (BranchProtection)theEObject;
				T result = caseBranchProtection(branchProtection);
				if (result == null) result = caseModelElement(branchProtection);
				if (result == null) result = caseStringIdentity(branchProtection);
				if (result == null) result = caseDocumented(branchProtection);
				if (result == null) result = caseMarked(branchProtection);
				if (result == null) result = caseReferrable(branchProtection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = caseNamedElement(release);
				if (result == null) result = caseLoadable(release);
				if (result == null) result = caseModelElement(release);
				if (result == null) result = caseStringIdentity(release);
				if (result == null) result = caseDocumented(release);
				if (result == null) result = caseMarked(release);
				if (result == null) result = caseReferrable(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GithubPackage.RELEASE_ASSET: {
				ReleaseAsset releaseAsset = (ReleaseAsset)theEObject;
				T result = caseReleaseAsset(releaseAsset);
				if (result == null) result = caseNamedElement(releaseAsset);
				if (result == null) result = caseModelElement(releaseAsset);
				if (result == null) result = caseStringIdentity(releaseAsset);
				if (result == null) result = caseDocumented(releaseAsset);
				if (result == null) result = caseMarked(releaseAsset);
				if (result == null) result = caseReferrable(releaseAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadable(Loadable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Hub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Hub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitHub(GitHub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAccount(AbstractAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountReference(AccountReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembership(Membership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeam(Team object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRepository(AbstractRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryReference(RepositoryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageUsage(LanguageUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborator(Collaborator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamAccess(TeamAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Owner Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Owner Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeOwnerRule(CodeOwnerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRef(Ref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Protection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Protection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchProtection(BranchProtection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseAsset(ReleaseAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GithubSwitch
