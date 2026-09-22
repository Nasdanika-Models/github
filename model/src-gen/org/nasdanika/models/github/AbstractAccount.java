/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * ACCOUNTS
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.AbstractAccount#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getAbstractAccount()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractAccount extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The account identity: what appears in github.com/<login>. Declared here
	 * rather than on Account so that a reference to an unloaded account is
	 * still resolvable by login, and so that containment can key on it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see org.nasdanika.models.github.GithubPackage#getAbstractAccount_Login()
	 * @model unique="false"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.AbstractAccount#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

} // AbstractAccount
