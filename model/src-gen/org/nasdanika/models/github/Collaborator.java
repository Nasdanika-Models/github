/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  An account's access to the containing repository, with where it came from.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Collaborator#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Collaborator#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Collaborator#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Collaborator#isOutside <em>Outside</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Collaborator#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getCollaborator()
 * @model
 * @generated
 */
public interface Collaborator extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getCollaborator_Account()
	 * @model
	 * @generated
	 */
	AbstractAccount getAccount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Collaborator#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(AbstractAccount value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * The default value is <code>"READ"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.PermissionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #setPermission(PermissionLevel)
	 * @see org.nasdanika.models.github.GithubPackage#getCollaborator_Permission()
	 * @model default="READ" unique="false"
	 * @generated
	 */
	PermissionLevel getPermission();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Collaborator#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(PermissionLevel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The default value is <code>"DIRECT"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.PermissionSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionSource
	 * @see #setSource(PermissionSource)
	 * @see org.nasdanika.models.github.GithubPackage#getCollaborator_Source()
	 * @model default="DIRECT" unique="false"
	 * @generated
	 */
	PermissionSource getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Collaborator#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionSource
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PermissionSource value);

	/**
	 * Returns the value of the '<em><b>Outside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Not a member of the owning organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outside</em>' attribute.
	 * @see #setOutside(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getCollaborator_Outside()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOutside();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Collaborator#isOutside <em>Outside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside</em>' attribute.
	 * @see #isOutside()
	 * @generated
	 */
	void setOutside(boolean value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The team the permission came from, when source is TEAM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see org.nasdanika.models.github.GithubPackage#getCollaborator_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Collaborator#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Collaborator
