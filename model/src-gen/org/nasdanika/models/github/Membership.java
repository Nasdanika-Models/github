/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An account's membership of an organization or a team, reified so the role
 * has somewhere to live. GitHub answers this across several endpoints with
 * different shapes; there is only one concept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Membership#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Membership#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Membership#isPublicized <em>Publicized</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Membership#isPending <em>Pending</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getMembership_Account()
	 * @model
	 * @generated
	 */
	AbstractAccount getAccount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Membership#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(AbstractAccount value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"MEMBER"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.MembershipRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.models.github.MembershipRole
	 * @see #setRole(MembershipRole)
	 * @see org.nasdanika.models.github.GithubPackage#getMembership_Role()
	 * @model default="MEMBER" unique="false"
	 * @generated
	 */
	MembershipRole getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Membership#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.models.github.MembershipRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(MembershipRole value);

	/**
	 * Returns the value of the '<em><b>Publicized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Publicly visible membership, as opposed to a private one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publicized</em>' attribute.
	 * @see #setPublicized(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getMembership_Publicized()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPublicized();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Membership#isPublicized <em>Publicized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicized</em>' attribute.
	 * @see #isPublicized()
	 * @generated
	 */
	void setPublicized(boolean value);

	/**
	 * Returns the value of the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Invited but not yet accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pending</em>' attribute.
	 * @see #setPending(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getMembership_Pending()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPending();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Membership#isPending <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending</em>' attribute.
	 * @see #isPending()
	 * @generated
	 */
	void setPending(boolean value);

} // Membership
