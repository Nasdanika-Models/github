/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.github.AbstractRepository;
import org.nasdanika.models.github.Branch;
import org.nasdanika.models.github.CodeOwnerRule;
import org.nasdanika.models.github.Collaborator;
import org.nasdanika.models.github.Contribution;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.LanguageUsage;
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;
import org.nasdanika.models.github.Release;
import org.nasdanika.models.github.Repository;
import org.nasdanika.models.github.Tag;
import org.nasdanika.models.github.Visibility;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getCloneUrl <em>Clone Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getSshUrl <em>Ssh Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#isArchived <em>Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#isFork <em>Fork</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getDefaultBranchName <em>Default Branch Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getDefaultBranch <em>Default Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getPrimaryLanguage <em>Primary Language</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getPushedAt <em>Pushed At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getStargazers <em>Stargazers</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getForks <em>Forks</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getOpenIssues <em>Open Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getCollaborators <em>Collaborators</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryImpl#getCodeOwners <em>Code Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatabaseId() <em>Database Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseId()
	 * @generated
	 * @ordered
	 */
	protected static final long DATABASE_ID_EDEFAULT = -1L;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOMEPAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHtmlUrl() <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCloneUrl() <em>Clone Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CLONE_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSshUrl() <em>Ssh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

	/**
	 * The default value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPLATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORK_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDefaultBranchName() <em>Default Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBranchName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BRANCH_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrimaryLanguage() <em>Primary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_LANGUAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPushedAt() <em>Pushed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUSHED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = -1L;

	/**
	 * The default value of the '{@link #getStargazers() <em>Stargazers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers()
	 * @generated
	 * @ordered
	 */
	protected static final int STARGAZERS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getWatchers() <em>Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchers()
	 * @generated
	 * @ordered
	 */
	protected static final int WATCHERS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getForks() <em>Forks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks()
	 * @generated
	 * @ordered
	 */
	protected static final int FORKS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getOpenIssues() <em>Open Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenIssues()
	 * @generated
	 * @ordered
	 */
	protected static final int OPEN_ISSUES_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__FULL_NAME, GithubPackage.Literals.ABSTRACT_REPOSITORY__FULL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		eDynamicSet(GithubPackage.REPOSITORY__FULL_NAME, GithubPackage.Literals.ABSTRACT_REPOSITORY__FULL_NAME, newFullName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GithubPackage.REPOSITORY__LOADS, GithubPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__NODE_ID, GithubPackage.Literals.REPOSITORY__NODE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		eDynamicSet(GithubPackage.REPOSITORY__NODE_ID, GithubPackage.Literals.REPOSITORY__NODE_ID, newNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDatabaseId() {
		return (Long)eDynamicGet(GithubPackage.REPOSITORY__DATABASE_ID, GithubPackage.Literals.REPOSITORY__DATABASE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseId(long newDatabaseId) {
		eDynamicSet(GithubPackage.REPOSITORY__DATABASE_ID, GithubPackage.Literals.REPOSITORY__DATABASE_ID, newDatabaseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__DESCRIPTION, GithubPackage.Literals.REPOSITORY__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(GithubPackage.REPOSITORY__DESCRIPTION, GithubPackage.Literals.REPOSITORY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomepage() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__HOMEPAGE, GithubPackage.Literals.REPOSITORY__HOMEPAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomepage(String newHomepage) {
		eDynamicSet(GithubPackage.REPOSITORY__HOMEPAGE, GithubPackage.Literals.REPOSITORY__HOMEPAGE, newHomepage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtmlUrl() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__HTML_URL, GithubPackage.Literals.REPOSITORY__HTML_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlUrl(String newHtmlUrl) {
		eDynamicSet(GithubPackage.REPOSITORY__HTML_URL, GithubPackage.Literals.REPOSITORY__HTML_URL, newHtmlUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloneUrl() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__CLONE_URL, GithubPackage.Literals.REPOSITORY__CLONE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloneUrl(String newCloneUrl) {
		eDynamicSet(GithubPackage.REPOSITORY__CLONE_URL, GithubPackage.Literals.REPOSITORY__CLONE_URL, newCloneUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshUrl() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__SSH_URL, GithubPackage.Literals.REPOSITORY__SSH_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshUrl(String newSshUrl) {
		eDynamicSet(GithubPackage.REPOSITORY__SSH_URL, GithubPackage.Literals.REPOSITORY__SSH_URL, newSshUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(GithubPackage.REPOSITORY__VISIBILITY, GithubPackage.Literals.REPOSITORY__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(GithubPackage.REPOSITORY__VISIBILITY, GithubPackage.Literals.REPOSITORY__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		return (Boolean)eDynamicGet(GithubPackage.REPOSITORY__ARCHIVED, GithubPackage.Literals.REPOSITORY__ARCHIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchived(boolean newArchived) {
		eDynamicSet(GithubPackage.REPOSITORY__ARCHIVED, GithubPackage.Literals.REPOSITORY__ARCHIVED, newArchived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(GithubPackage.REPOSITORY__DISABLED, GithubPackage.Literals.REPOSITORY__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(GithubPackage.REPOSITORY__DISABLED, GithubPackage.Literals.REPOSITORY__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return (Boolean)eDynamicGet(GithubPackage.REPOSITORY__TEMPLATE, GithubPackage.Literals.REPOSITORY__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(boolean newTemplate) {
		eDynamicSet(GithubPackage.REPOSITORY__TEMPLATE, GithubPackage.Literals.REPOSITORY__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFork() {
		return (Boolean)eDynamicGet(GithubPackage.REPOSITORY__FORK, GithubPackage.Literals.REPOSITORY__FORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(boolean newFork) {
		eDynamicSet(GithubPackage.REPOSITORY__FORK, GithubPackage.Literals.REPOSITORY__FORK, newFork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository getParent() {
		return (AbstractRepository)eDynamicGet(GithubPackage.REPOSITORY__PARENT, GithubPackage.Literals.REPOSITORY__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository basicGetParent() {
		return (AbstractRepository)eDynamicGet(GithubPackage.REPOSITORY__PARENT, GithubPackage.Literals.REPOSITORY__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AbstractRepository newParent) {
		eDynamicSet(GithubPackage.REPOSITORY__PARENT, GithubPackage.Literals.REPOSITORY__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository getSource() {
		return (AbstractRepository)eDynamicGet(GithubPackage.REPOSITORY__SOURCE, GithubPackage.Literals.REPOSITORY__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository basicGetSource() {
		return (AbstractRepository)eDynamicGet(GithubPackage.REPOSITORY__SOURCE, GithubPackage.Literals.REPOSITORY__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractRepository newSource) {
		eDynamicSet(GithubPackage.REPOSITORY__SOURCE, GithubPackage.Literals.REPOSITORY__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultBranchName() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME, GithubPackage.Literals.REPOSITORY__DEFAULT_BRANCH_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBranchName(String newDefaultBranchName) {
		eDynamicSet(GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME, GithubPackage.Literals.REPOSITORY__DEFAULT_BRANCH_NAME, newDefaultBranchName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getDefaultBranch() {
		return (Branch)eDynamicGet(GithubPackage.REPOSITORY__DEFAULT_BRANCH, GithubPackage.Literals.REPOSITORY__DEFAULT_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetDefaultBranch() {
		return (Branch)eDynamicGet(GithubPackage.REPOSITORY__DEFAULT_BRANCH, GithubPackage.Literals.REPOSITORY__DEFAULT_BRANCH, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBranch(Branch newDefaultBranch) {
		eDynamicSet(GithubPackage.REPOSITORY__DEFAULT_BRANCH, GithubPackage.Literals.REPOSITORY__DEFAULT_BRANCH, newDefaultBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__LICENSE, GithubPackage.Literals.REPOSITORY__LICENSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		eDynamicSet(GithubPackage.REPOSITORY__LICENSE, GithubPackage.Literals.REPOSITORY__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTopics() {
		return (EList<String>)eDynamicGet(GithubPackage.REPOSITORY__TOPICS, GithubPackage.Literals.REPOSITORY__TOPICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryLanguage() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY__PRIMARY_LANGUAGE, GithubPackage.Literals.REPOSITORY__PRIMARY_LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryLanguage(String newPrimaryLanguage) {
		eDynamicSet(GithubPackage.REPOSITORY__PRIMARY_LANGUAGE, GithubPackage.Literals.REPOSITORY__PRIMARY_LANGUAGE, newPrimaryLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GithubPackage.REPOSITORY__CREATED_AT, GithubPackage.Literals.REPOSITORY__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GithubPackage.REPOSITORY__CREATED_AT, GithubPackage.Literals.REPOSITORY__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GithubPackage.REPOSITORY__UPDATED_AT, GithubPackage.Literals.REPOSITORY__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GithubPackage.REPOSITORY__UPDATED_AT, GithubPackage.Literals.REPOSITORY__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPushedAt() {
		return (Date)eDynamicGet(GithubPackage.REPOSITORY__PUSHED_AT, GithubPackage.Literals.REPOSITORY__PUSHED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPushedAt(Date newPushedAt) {
		eDynamicSet(GithubPackage.REPOSITORY__PUSHED_AT, GithubPackage.Literals.REPOSITORY__PUSHED_AT, newPushedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return (Long)eDynamicGet(GithubPackage.REPOSITORY__SIZE, GithubPackage.Literals.REPOSITORY__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		eDynamicSet(GithubPackage.REPOSITORY__SIZE, GithubPackage.Literals.REPOSITORY__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStargazers() {
		return (Integer)eDynamicGet(GithubPackage.REPOSITORY__STARGAZERS, GithubPackage.Literals.REPOSITORY__STARGAZERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStargazers(int newStargazers) {
		eDynamicSet(GithubPackage.REPOSITORY__STARGAZERS, GithubPackage.Literals.REPOSITORY__STARGAZERS, newStargazers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWatchers() {
		return (Integer)eDynamicGet(GithubPackage.REPOSITORY__WATCHERS, GithubPackage.Literals.REPOSITORY__WATCHERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatchers(int newWatchers) {
		eDynamicSet(GithubPackage.REPOSITORY__WATCHERS, GithubPackage.Literals.REPOSITORY__WATCHERS, newWatchers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getForks() {
		return (Integer)eDynamicGet(GithubPackage.REPOSITORY__FORKS, GithubPackage.Literals.REPOSITORY__FORKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForks(int newForks) {
		eDynamicSet(GithubPackage.REPOSITORY__FORKS, GithubPackage.Literals.REPOSITORY__FORKS, newForks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpenIssues() {
		return (Integer)eDynamicGet(GithubPackage.REPOSITORY__OPEN_ISSUES, GithubPackage.Literals.REPOSITORY__OPEN_ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenIssues(int newOpenIssues) {
		eDynamicSet(GithubPackage.REPOSITORY__OPEN_ISSUES, GithubPackage.Literals.REPOSITORY__OPEN_ISSUES, newOpenIssues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LanguageUsage> getLanguages() {
		return (EList<LanguageUsage>)eDynamicGet(GithubPackage.REPOSITORY__LANGUAGES, GithubPackage.Literals.REPOSITORY__LANGUAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Branch> getBranches() {
		return (EList<Branch>)eDynamicGet(GithubPackage.REPOSITORY__BRANCHES, GithubPackage.Literals.REPOSITORY__BRANCHES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eDynamicGet(GithubPackage.REPOSITORY__TAGS, GithubPackage.Literals.REPOSITORY__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(GithubPackage.REPOSITORY__RELEASES, GithubPackage.Literals.REPOSITORY__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Collaborator> getCollaborators() {
		return (EList<Collaborator>)eDynamicGet(GithubPackage.REPOSITORY__COLLABORATORS, GithubPackage.Literals.REPOSITORY__COLLABORATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contribution> getContributions() {
		return (EList<Contribution>)eDynamicGet(GithubPackage.REPOSITORY__CONTRIBUTIONS, GithubPackage.Literals.REPOSITORY__CONTRIBUTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CodeOwnerRule> getCodeOwners() {
		return (EList<CodeOwnerRule>)eDynamicGet(GithubPackage.REPOSITORY__CODE_OWNERS, GithubPackage.Literals.REPOSITORY__CODE_OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__COLLABORATORS:
				return ((InternalEList<?>)getCollaborators()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
			case GithubPackage.REPOSITORY__CODE_OWNERS:
				return ((InternalEList<?>)getCodeOwners()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__FULL_NAME:
				return getFullName();
			case GithubPackage.REPOSITORY__LOADS:
				return getLoads();
			case GithubPackage.REPOSITORY__NODE_ID:
				return getNodeId();
			case GithubPackage.REPOSITORY__DATABASE_ID:
				return getDatabaseId();
			case GithubPackage.REPOSITORY__DESCRIPTION:
				return getDescription();
			case GithubPackage.REPOSITORY__HOMEPAGE:
				return getHomepage();
			case GithubPackage.REPOSITORY__HTML_URL:
				return getHtmlUrl();
			case GithubPackage.REPOSITORY__CLONE_URL:
				return getCloneUrl();
			case GithubPackage.REPOSITORY__SSH_URL:
				return getSshUrl();
			case GithubPackage.REPOSITORY__VISIBILITY:
				return getVisibility();
			case GithubPackage.REPOSITORY__ARCHIVED:
				return isArchived();
			case GithubPackage.REPOSITORY__DISABLED:
				return isDisabled();
			case GithubPackage.REPOSITORY__TEMPLATE:
				return isTemplate();
			case GithubPackage.REPOSITORY__FORK:
				return isFork();
			case GithubPackage.REPOSITORY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GithubPackage.REPOSITORY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME:
				return getDefaultBranchName();
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				if (resolve) return getDefaultBranch();
				return basicGetDefaultBranch();
			case GithubPackage.REPOSITORY__LICENSE:
				return getLicense();
			case GithubPackage.REPOSITORY__TOPICS:
				return getTopics();
			case GithubPackage.REPOSITORY__PRIMARY_LANGUAGE:
				return getPrimaryLanguage();
			case GithubPackage.REPOSITORY__CREATED_AT:
				return getCreatedAt();
			case GithubPackage.REPOSITORY__UPDATED_AT:
				return getUpdatedAt();
			case GithubPackage.REPOSITORY__PUSHED_AT:
				return getPushedAt();
			case GithubPackage.REPOSITORY__SIZE:
				return getSize();
			case GithubPackage.REPOSITORY__STARGAZERS:
				return getStargazers();
			case GithubPackage.REPOSITORY__WATCHERS:
				return getWatchers();
			case GithubPackage.REPOSITORY__FORKS:
				return getForks();
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				return getOpenIssues();
			case GithubPackage.REPOSITORY__LANGUAGES:
				return getLanguages();
			case GithubPackage.REPOSITORY__BRANCHES:
				return getBranches();
			case GithubPackage.REPOSITORY__TAGS:
				return getTags();
			case GithubPackage.REPOSITORY__RELEASES:
				return getReleases();
			case GithubPackage.REPOSITORY__COLLABORATORS:
				return getCollaborators();
			case GithubPackage.REPOSITORY__CONTRIBUTIONS:
				return getContributions();
			case GithubPackage.REPOSITORY__CODE_OWNERS:
				return getCodeOwners();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__FULL_NAME:
				setFullName((String)newValue);
				return;
			case GithubPackage.REPOSITORY__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
				return;
			case GithubPackage.REPOSITORY__NODE_ID:
				setNodeId((String)newValue);
				return;
			case GithubPackage.REPOSITORY__DATABASE_ID:
				setDatabaseId((Long)newValue);
				return;
			case GithubPackage.REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GithubPackage.REPOSITORY__HOMEPAGE:
				setHomepage((String)newValue);
				return;
			case GithubPackage.REPOSITORY__HTML_URL:
				setHtmlUrl((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CLONE_URL:
				setCloneUrl((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SSH_URL:
				setSshUrl((String)newValue);
				return;
			case GithubPackage.REPOSITORY__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case GithubPackage.REPOSITORY__ARCHIVED:
				setArchived((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__TEMPLATE:
				setTemplate((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__FORK:
				setFork((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__PARENT:
				setParent((AbstractRepository)newValue);
				return;
			case GithubPackage.REPOSITORY__SOURCE:
				setSource((AbstractRepository)newValue);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME:
				setDefaultBranchName((String)newValue);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				setDefaultBranch((Branch)newValue);
				return;
			case GithubPackage.REPOSITORY__LICENSE:
				setLicense((String)newValue);
				return;
			case GithubPackage.REPOSITORY__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends String>)newValue);
				return;
			case GithubPackage.REPOSITORY__PRIMARY_LANGUAGE:
				setPrimaryLanguage((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GithubPackage.REPOSITORY__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GithubPackage.REPOSITORY__PUSHED_AT:
				setPushedAt((Date)newValue);
				return;
			case GithubPackage.REPOSITORY__SIZE:
				setSize((Long)newValue);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS:
				setStargazers((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__WATCHERS:
				setWatchers((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__FORKS:
				setForks((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				setOpenIssues((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends LanguageUsage>)newValue);
				return;
			case GithubPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
				return;
			case GithubPackage.REPOSITORY__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case GithubPackage.REPOSITORY__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case GithubPackage.REPOSITORY__COLLABORATORS:
				getCollaborators().clear();
				getCollaborators().addAll((Collection<? extends Collaborator>)newValue);
				return;
			case GithubPackage.REPOSITORY__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contribution>)newValue);
				return;
			case GithubPackage.REPOSITORY__CODE_OWNERS:
				getCodeOwners().clear();
				getCodeOwners().addAll((Collection<? extends CodeOwnerRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LOADS:
				getLoads().clear();
				return;
			case GithubPackage.REPOSITORY__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DATABASE_ID:
				setDatabaseId(DATABASE_ID_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HOMEPAGE:
				setHomepage(HOMEPAGE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HTML_URL:
				setHtmlUrl(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CLONE_URL:
				setCloneUrl(CLONE_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SSH_URL:
				setSshUrl(SSH_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORK:
				setFork(FORK_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__PARENT:
				setParent((AbstractRepository)null);
				return;
			case GithubPackage.REPOSITORY__SOURCE:
				setSource((AbstractRepository)null);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME:
				setDefaultBranchName(DEFAULT_BRANCH_NAME_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				setDefaultBranch((Branch)null);
				return;
			case GithubPackage.REPOSITORY__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__TOPICS:
				getTopics().clear();
				return;
			case GithubPackage.REPOSITORY__PRIMARY_LANGUAGE:
				setPrimaryLanguage(PRIMARY_LANGUAGE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__PUSHED_AT:
				setPushedAt(PUSHED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS:
				setStargazers(STARGAZERS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__WATCHERS:
				setWatchers(WATCHERS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORKS:
				setForks(FORKS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				setOpenIssues(OPEN_ISSUES_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LANGUAGES:
				getLanguages().clear();
				return;
			case GithubPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				return;
			case GithubPackage.REPOSITORY__TAGS:
				getTags().clear();
				return;
			case GithubPackage.REPOSITORY__RELEASES:
				getReleases().clear();
				return;
			case GithubPackage.REPOSITORY__COLLABORATORS:
				getCollaborators().clear();
				return;
			case GithubPackage.REPOSITORY__CONTRIBUTIONS:
				getContributions().clear();
				return;
			case GithubPackage.REPOSITORY__CODE_OWNERS:
				getCodeOwners().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
			case GithubPackage.REPOSITORY__LOADS:
				return !getLoads().isEmpty();
			case GithubPackage.REPOSITORY__NODE_ID:
				return NODE_ID_EDEFAULT == null ? getNodeId() != null : !NODE_ID_EDEFAULT.equals(getNodeId());
			case GithubPackage.REPOSITORY__DATABASE_ID:
				return getDatabaseId() != DATABASE_ID_EDEFAULT;
			case GithubPackage.REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GithubPackage.REPOSITORY__HOMEPAGE:
				return HOMEPAGE_EDEFAULT == null ? getHomepage() != null : !HOMEPAGE_EDEFAULT.equals(getHomepage());
			case GithubPackage.REPOSITORY__HTML_URL:
				return HTML_URL_EDEFAULT == null ? getHtmlUrl() != null : !HTML_URL_EDEFAULT.equals(getHtmlUrl());
			case GithubPackage.REPOSITORY__CLONE_URL:
				return CLONE_URL_EDEFAULT == null ? getCloneUrl() != null : !CLONE_URL_EDEFAULT.equals(getCloneUrl());
			case GithubPackage.REPOSITORY__SSH_URL:
				return SSH_URL_EDEFAULT == null ? getSshUrl() != null : !SSH_URL_EDEFAULT.equals(getSshUrl());
			case GithubPackage.REPOSITORY__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case GithubPackage.REPOSITORY__ARCHIVED:
				return isArchived() != ARCHIVED_EDEFAULT;
			case GithubPackage.REPOSITORY__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case GithubPackage.REPOSITORY__TEMPLATE:
				return isTemplate() != TEMPLATE_EDEFAULT;
			case GithubPackage.REPOSITORY__FORK:
				return isFork() != FORK_EDEFAULT;
			case GithubPackage.REPOSITORY__PARENT:
				return basicGetParent() != null;
			case GithubPackage.REPOSITORY__SOURCE:
				return basicGetSource() != null;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH_NAME:
				return DEFAULT_BRANCH_NAME_EDEFAULT == null ? getDefaultBranchName() != null : !DEFAULT_BRANCH_NAME_EDEFAULT.equals(getDefaultBranchName());
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				return basicGetDefaultBranch() != null;
			case GithubPackage.REPOSITORY__LICENSE:
				return LICENSE_EDEFAULT == null ? getLicense() != null : !LICENSE_EDEFAULT.equals(getLicense());
			case GithubPackage.REPOSITORY__TOPICS:
				return !getTopics().isEmpty();
			case GithubPackage.REPOSITORY__PRIMARY_LANGUAGE:
				return PRIMARY_LANGUAGE_EDEFAULT == null ? getPrimaryLanguage() != null : !PRIMARY_LANGUAGE_EDEFAULT.equals(getPrimaryLanguage());
			case GithubPackage.REPOSITORY__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GithubPackage.REPOSITORY__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GithubPackage.REPOSITORY__PUSHED_AT:
				return PUSHED_AT_EDEFAULT == null ? getPushedAt() != null : !PUSHED_AT_EDEFAULT.equals(getPushedAt());
			case GithubPackage.REPOSITORY__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case GithubPackage.REPOSITORY__STARGAZERS:
				return getStargazers() != STARGAZERS_EDEFAULT;
			case GithubPackage.REPOSITORY__WATCHERS:
				return getWatchers() != WATCHERS_EDEFAULT;
			case GithubPackage.REPOSITORY__FORKS:
				return getForks() != FORKS_EDEFAULT;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				return getOpenIssues() != OPEN_ISSUES_EDEFAULT;
			case GithubPackage.REPOSITORY__LANGUAGES:
				return !getLanguages().isEmpty();
			case GithubPackage.REPOSITORY__BRANCHES:
				return !getBranches().isEmpty();
			case GithubPackage.REPOSITORY__TAGS:
				return !getTags().isEmpty();
			case GithubPackage.REPOSITORY__RELEASES:
				return !getReleases().isEmpty();
			case GithubPackage.REPOSITORY__COLLABORATORS:
				return !getCollaborators().isEmpty();
			case GithubPackage.REPOSITORY__CONTRIBUTIONS:
				return !getContributions().isEmpty();
			case GithubPackage.REPOSITORY__CODE_OWNERS:
				return !getCodeOwners().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractRepository.class) {
			switch (derivedFeatureID) {
				case GithubPackage.REPOSITORY__FULL_NAME: return GithubPackage.ABSTRACT_REPOSITORY__FULL_NAME;
				default: return -1;
			}
		}
		if (baseClass == Loadable.class) {
			switch (derivedFeatureID) {
				case GithubPackage.REPOSITORY__LOADS: return GithubPackage.LOADABLE__LOADS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractRepository.class) {
			switch (baseFeatureID) {
				case GithubPackage.ABSTRACT_REPOSITORY__FULL_NAME: return GithubPackage.REPOSITORY__FULL_NAME;
				default: return -1;
			}
		}
		if (baseClass == Loadable.class) {
			switch (baseFeatureID) {
				case GithubPackage.LOADABLE__LOADS: return GithubPackage.REPOSITORY__LOADS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RepositoryImpl
