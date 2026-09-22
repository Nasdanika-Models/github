/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Organization#getBillingEmail <em>Billing Email</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Organization#getDefaultRepositoryPermission <em>Default Repository Permission</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Organization#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Organization#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends Account {
	/**
	 * Returns the value of the '<em><b>Billing Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Email</em>' attribute.
	 * @see #setBillingEmail(String)
	 * @see org.nasdanika.models.github.GithubPackage#getOrganization_BillingEmail()
	 * @model unique="false"
	 * @generated
	 */
	String getBillingEmail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Organization#getBillingEmail <em>Billing Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Email</em>' attribute.
	 * @see #getBillingEmail()
	 * @generated
	 */
	void setBillingEmail(String value);

	/**
	 * Returns the value of the '<em><b>Default Repository Permission</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.github.PermissionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Default permission granted to organization members on new repositories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Repository Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #setDefaultRepositoryPermission(PermissionLevel)
	 * @see org.nasdanika.models.github.GithubPackage#getOrganization_DefaultRepositoryPermission()
	 * @model unique="false"
	 * @generated
	 */
	PermissionLevel getDefaultRepositoryPermission();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Organization#getDefaultRepositoryPermission <em>Default Repository Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Repository Permission</em>' attribute.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see #getDefaultRepositoryPermission()
	 * @generated
	 */
	void setDefaultRepositoryPermission(PermissionLevel value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getOrganization_Teams()
	 * @model containment="true" keys="slug"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Membership}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Who belongs to this organization, and as what.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getOrganization_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Membership> getMembers();

} // Organization
