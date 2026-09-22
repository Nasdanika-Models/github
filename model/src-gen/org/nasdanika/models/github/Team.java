/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A team: the unit organizations actually grant access with, and the reason
 * repository permissions are usually not attached to people.
 * 
 * Teams nest, and nesting is inheritance of access, which is why the
 * hierarchy has to be in the model for any access question to be answerable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Team#getSlug <em>Slug</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getPrivacy <em>Privacy</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Team#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends NamedElement, Loadable {
	/**
	 * Returns the value of the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL safe identity within the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slug</em>' attribute.
	 * @see #setSlug(String)
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Slug()
	 * @model unique="false"
	 * @generated
	 */
	String getSlug();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getSlug <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slug</em>' attribute.
	 * @see #getSlug()
	 * @generated
	 */
	void setSlug(String value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_NodeId()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getNodeId <em>Node Id</em>}' attribute.
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
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_DatabaseId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getDatabaseId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getDatabaseId <em>Database Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Id</em>' attribute.
	 * @see #getDatabaseId()
	 * @generated
	 */
	void setDatabaseId(long value);

	/**
	 * Returns the value of the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Url</em>' attribute.
	 * @see #setHtmlUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_HtmlUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getHtmlUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getHtmlUrl <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Url</em>' attribute.
	 * @see #getHtmlUrl()
	 * @generated
	 */
	void setHtmlUrl(String value);

	/**
	 * Returns the value of the '<em><b>Privacy</b></em>' attribute.
	 * The default value is <code>"VISIBLE"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.TeamPrivacy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy</em>' attribute.
	 * @see org.nasdanika.models.github.TeamPrivacy
	 * @see #setPrivacy(TeamPrivacy)
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Privacy()
	 * @model default="VISIBLE" unique="false"
	 * @generated
	 */
	TeamPrivacy getPrivacy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getPrivacy <em>Privacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy</em>' attribute.
	 * @see org.nasdanika.models.github.TeamPrivacy
	 * @see #getPrivacy()
	 * @generated
	 */
	void setPrivacy(TeamPrivacy value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Team)
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Parent()
	 * @model
	 * @generated
	 */
	Team getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Team#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Team value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Children()
	 * @model containment="true" keys="slug"
	 * @generated
	 */
	EList<Team> getChildren();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Membership}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Membership> getMembers();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.TeamAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Repositories this team has access to, and at what level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getTeam_Access()
	 * @model containment="true"
	 * @generated
	 */
	EList<TeamAccess> getAccess();

} // Team
