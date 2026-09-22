/**
 */
package org.nasdanika.models.github;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.User#getCompany <em>Company</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#getBio <em>Bio</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#getBlog <em>Blog</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#isSiteAdmin <em>Site Admin</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#isBot <em>Bot</em>}</li>
 *   <li>{@link org.nasdanika.models.github.User#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Account {
	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Company()
	 * @model unique="false"
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The profile blurb. Longer documentation uses the inherited documentation feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bio</em>' attribute.
	 * @see #setBio(String)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Bio()
	 * @model unique="false"
	 * @generated
	 */
	String getBio();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#getBio <em>Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bio</em>' attribute.
	 * @see #getBio()
	 * @generated
	 */
	void setBio(String value);

	/**
	 * Returns the value of the '<em><b>Blog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blog</em>' attribute.
	 * @see #setBlog(String)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Blog()
	 * @model unique="false"
	 * @generated
	 */
	String getBlog();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#getBlog <em>Blog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blog</em>' attribute.
	 * @see #getBlog()
	 * @generated
	 */
	void setBlog(String value);

	/**
	 * Returns the value of the '<em><b>Site Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Admin</em>' attribute.
	 * @see #setSiteAdmin(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_SiteAdmin()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSiteAdmin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#isSiteAdmin <em>Site Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Admin</em>' attribute.
	 * @see #isSiteAdmin()
	 * @generated
	 */
	void setSiteAdmin(boolean value);

	/**
	 * Returns the value of the '<em><b>Bot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True for a bot account: dependabot, a GitHub App's actor, a service identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bot</em>' attribute.
	 * @see #setBot(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Bot()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBot();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#isBot <em>Bot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bot</em>' attribute.
	 * @see #isBot()
	 * @generated
	 */
	void setBot(boolean value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Suspended or deleted upstream, but still referenced by history.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactive</em>' attribute.
	 * @see #setInactive(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getUser_Inactive()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInactive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.User#isInactive <em>Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' attribute.
	 * @see #isInactive()
	 * @generated
	 */
	void setInactive(boolean value);

} // User
