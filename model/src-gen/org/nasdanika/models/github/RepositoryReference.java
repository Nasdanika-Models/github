/**
 */
package org.nasdanika.models.github;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.RepositoryReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getRepositoryReference()
 * @model
 * @generated
 */
public interface RepositoryReference extends AbstractRepository {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Repository)
	 * @see org.nasdanika.models.github.GithubPackage#getRepositoryReference_Target()
	 * @model
	 * @generated
	 */
	Repository getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.RepositoryReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Repository value);

} // RepositoryReference
