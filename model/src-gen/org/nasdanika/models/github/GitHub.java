/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * ROOT
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.GitHub#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.GitHub#getApiUrl <em>Api Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.GitHub#isEnterpriseServer <em>Enterprise Server</em>}</li>
 *   <li>{@link org.nasdanika.models.github.GitHub#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getGitHub()
 * @model
 * @generated
 */
public interface GitHub extends NamedElement, Loadable {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Web base URL, e.g. https://github.com.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getGitHub_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.GitHub#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Api Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  API base URL, e.g. https://api.github.com.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Url</em>' attribute.
	 * @see #setApiUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getGitHub_ApiUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getApiUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.GitHub#getApiUrl <em>Api Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Url</em>' attribute.
	 * @see #getApiUrl()
	 * @generated
	 */
	void setApiUrl(String value);

	/**
	 * Returns the value of the '<em><b>Enterprise Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True for GitHub Enterprise Server, which differs in available features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterprise Server</em>' attribute.
	 * @see #setEnterpriseServer(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getGitHub_EnterpriseServer()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnterpriseServer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.GitHub#isEnterpriseServer <em>Enterprise Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Server</em>' attribute.
	 * @see #isEnterpriseServer()
	 * @generated
	 */
	void setEnterpriseServer(boolean value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getGitHub_Accounts()
	 * @model containment="true" keys="login"
	 *        annotation="urn:org.nasdanika logicalContainment='false'"
	 * @generated
	 */
	EList<AbstractAccount> getAccounts();

} // GitHub
