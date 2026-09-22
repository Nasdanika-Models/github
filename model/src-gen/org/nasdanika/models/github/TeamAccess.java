/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A team's access to a repository, held on the team side.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.TeamAccess#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.nasdanika.models.github.TeamAccess#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getTeamAccess()
 * @model
 * @generated
 */
public interface TeamAccess extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(AbstractRepository)
	 * @see org.nasdanika.models.github.GithubPackage#getTeamAccess_Repository()
	 * @model
	 * @generated
	 */
	AbstractRepository getRepository();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.TeamAccess#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(AbstractRepository value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * The default value is <code>"READ"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.PermissionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #setPermission(PermissionLevel)
	 * @see org.nasdanika.models.github.GithubPackage#getTeamAccess_Permission()
	 * @model default="READ" unique="false"
	 * @generated
	 */
	PermissionLevel getPermission();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.TeamAccess#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(PermissionLevel value);

} // TeamAccess
