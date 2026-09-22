/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A repository.
 * 
 * Counts sit directly on the class rather than in a dated statistics record,
 * because the Load beside them already says when they were taken. That is the
 * payoff of treating provenance as data instead of sprinkling timestamps.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Repository#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getCloneUrl <em>Clone Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getSshUrl <em>Ssh Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#isArchived <em>Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#isFork <em>Fork</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getDefaultBranchName <em>Default Branch Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getDefaultBranch <em>Default Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getPrimaryLanguage <em>Primary Language</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getPushedAt <em>Pushed At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getStargazers <em>Stargazers</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getForks <em>Forks</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getOpenIssues <em>Open Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getCollaborators <em>Collaborators</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Repository#getCodeOwners <em>Code Owners</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedElement, AbstractRepository, Loadable {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_NodeId()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Database Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Id</em>' attribute.
	 * @see #setDatabaseId(long)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_DatabaseId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getDatabaseId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getDatabaseId <em>Database Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Id</em>' attribute.
	 * @see #getDatabaseId()
	 * @generated
	 */
	void setDatabaseId(long value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' attribute.
	 * @see #setHomepage(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Homepage()
	 * @model unique="false"
	 * @generated
	 */
	String getHomepage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getHomepage <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' attribute.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(String value);

	/**
	 * Returns the value of the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Url</em>' attribute.
	 * @see #setHtmlUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_HtmlUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getHtmlUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getHtmlUrl <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Url</em>' attribute.
	 * @see #getHtmlUrl()
	 * @generated
	 */
	void setHtmlUrl(String value);

	/**
	 * Returns the value of the '<em><b>Clone Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone Url</em>' attribute.
	 * @see #setCloneUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_CloneUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getCloneUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getCloneUrl <em>Clone Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clone Url</em>' attribute.
	 * @see #getCloneUrl()
	 * @generated
	 */
	void setCloneUrl(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Url</em>' attribute.
	 * @see #setSshUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_SshUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getSshUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getSshUrl <em>Ssh Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Url</em>' attribute.
	 * @see #getSshUrl()
	 * @generated
	 */
	void setSshUrl(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"PUBLIC"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.github.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Visibility()
	 * @model default="PUBLIC" unique="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.github.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archived</em>' attribute.
	 * @see #setArchived(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Archived()
	 * @model unique="false"
	 * @generated
	 */
	boolean isArchived();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#isArchived <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived</em>' attribute.
	 * @see #isArchived()
	 * @generated
	 */
	void setArchived(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Disabled by GitHub, e.g. for a terms violation or a billing lapse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A template repository, which is generated from rather than forked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Template()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#isTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #isTemplate()
	 * @generated
	 */
	void setTemplate(boolean value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' attribute.
	 * @see #setFork(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Fork()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFork();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#isFork <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' attribute.
	 * @see #isFork()
	 * @generated
	 */
	void setFork(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The repository this one was forked from, and the ultimate upstream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(AbstractRepository)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Parent()
	 * @model
	 * @generated
	 */
	AbstractRepository getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractRepository value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractRepository)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Source()
	 * @model
	 * @generated
	 */
	AbstractRepository getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractRepository value);

	/**
	 * Returns the value of the '<em><b>Default Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the default branch, e.g. main. Resolved to a Branch when branches are loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Branch Name</em>' attribute.
	 * @see #setDefaultBranchName(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_DefaultBranchName()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultBranchName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getDefaultBranchName <em>Default Branch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Branch Name</em>' attribute.
	 * @see #getDefaultBranchName()
	 * @generated
	 */
	void setDefaultBranchName(String value);

	/**
	 * Returns the value of the '<em><b>Default Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Branch</em>' reference.
	 * @see #setDefaultBranch(Branch)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_DefaultBranch()
	 * @model
	 * @generated
	 */
	Branch getDefaultBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getDefaultBranch <em>Default Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Branch</em>' reference.
	 * @see #getDefaultBranch()
	 * @generated
	 */
	void setDefaultBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SPDX identifier of the detected license, e.g. EPL-2.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_License()
	 * @model unique="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' attribute list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Topics()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTopics();

	/**
	 * Returns the value of the '<em><b>Primary Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The language with the most bytes, per GitHub's detection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Language</em>' attribute.
	 * @see #setPrimaryLanguage(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_PrimaryLanguage()
	 * @model unique="false"
	 * @generated
	 */
	String getPrimaryLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getPrimaryLanguage <em>Primary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Language</em>' attribute.
	 * @see #getPrimaryLanguage()
	 * @generated
	 */
	void setPrimaryLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_CreatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_UpdatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Pushed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Last push, which is the honest measure of activity; updatedAt moves when a star is added.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pushed At</em>' attribute.
	 * @see #setPushedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_PushedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getPushedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getPushedAt <em>Pushed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pushed At</em>' attribute.
	 * @see #getPushedAt()
	 * @generated
	 */
	void setPushedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Size in kilobytes, as GitHub reports it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Size()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Stargazers</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stargazers</em>' attribute.
	 * @see #setStargazers(int)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Stargazers()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getStargazers();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getStargazers <em>Stargazers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stargazers</em>' attribute.
	 * @see #getStargazers()
	 * @generated
	 */
	void setStargazers(int value);

	/**
	 * Returns the value of the '<em><b>Watchers</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watchers</em>' attribute.
	 * @see #setWatchers(int)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Watchers()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getWatchers();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getWatchers <em>Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watchers</em>' attribute.
	 * @see #getWatchers()
	 * @generated
	 */
	void setWatchers(int value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' attribute.
	 * @see #setForks(int)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Forks()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getForks();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getForks <em>Forks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forks</em>' attribute.
	 * @see #getForks()
	 * @generated
	 */
	void setForks(int value);

	/**
	 * Returns the value of the '<em><b>Open Issues</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Open issues, which GitHub counts including open pull requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Issues</em>' attribute.
	 * @see #setOpenIssues(int)
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_OpenIssues()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getOpenIssues();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Repository#getOpenIssues <em>Open Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Issues</em>' attribute.
	 * @see #getOpenIssues()
	 * @generated
	 */
	void setOpenIssues(int value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.LanguageUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguageUsage> getLanguages();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Release}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Collaborators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Collaborator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborators</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Collaborators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collaborator> getCollaborators();

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Contribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_Contributions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contribution> getContributions();

	/**
	 * Returns the value of the '<em><b>Code Owners</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.CodeOwnerRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Parsed CODEOWNERS rules; see the class documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Owners</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRepository_CodeOwners()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeOwnerRule> getCodeOwners();

} // Repository
