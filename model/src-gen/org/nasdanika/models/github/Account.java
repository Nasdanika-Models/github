/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GitHub account: a user, an organization, or a bot. One class for what the
 * API returns in a dozen shapes.
 * 
 * name is the display name; login is the identity and the thing in URLs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Account#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getEmail <em>Email</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Account#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getAccount()
 * @model abstract="true"
 * @generated
 */
public interface Account extends NamedElement, AbstractAccount, Loadable {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  GraphQL global node id: the rename-safe identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_NodeId()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getNodeId <em>Node Id</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 *  REST numeric id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Id</em>' attribute.
	 * @see #setDatabaseId(long)
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_DatabaseId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getDatabaseId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getDatabaseId <em>Database Id</em>}' attribute.
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
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_HtmlUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getHtmlUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getHtmlUrl <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Url</em>' attribute.
	 * @see #getHtmlUrl()
	 * @generated
	 */
	void setHtmlUrl(String value);

	/**
	 * Returns the value of the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Url</em>' attribute.
	 * @see #setAvatarUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_AvatarUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getAvatarUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getAvatarUrl <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Url</em>' attribute.
	 * @see #getAvatarUrl()
	 * @generated
	 */
	void setAvatarUrl(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_CreatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getCreatedAt <em>Created At</em>}' attribute.
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
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_UpdatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Account#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.AbstractRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Repositories owned by this account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getAccount_Repositories()
	 * @model containment="true" keys="fullName"
	 *        annotation="urn:org.nasdanika logicalContainment='false'"
	 * @generated
	 */
	EList<AbstractRepository> getRepositories();

} // Account
