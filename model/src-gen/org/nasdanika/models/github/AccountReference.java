/**
 */
package org.nasdanika.models.github;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.AccountReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getAccountReference()
 * @model
 * @generated
 */
public interface AccountReference extends AbstractAccount {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Account)
	 * @see org.nasdanika.models.github.GithubPackage#getAccountReference_Target()
	 * @model
	 * @generated
	 */
	Account getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.AccountReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Account value);

} // AccountReference
