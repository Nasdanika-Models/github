/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Membership;
import org.nasdanika.models.github.Organization;
import org.nasdanika.models.github.PermissionLevel;
import org.nasdanika.models.github.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.OrganizationImpl#getBillingEmail <em>Billing Email</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.OrganizationImpl#getDefaultRepositoryPermission <em>Default Repository Permission</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.OrganizationImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.OrganizationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends AccountImpl implements Organization {
	/**
	 * The default value of the '{@link #getBillingEmail() <em>Billing Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefaultRepositoryPermission() <em>Default Repository Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRepositoryPermission()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionLevel DEFAULT_REPOSITORY_PERMISSION_EDEFAULT = PermissionLevel.READ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillingEmail() {
		return (String)eDynamicGet(GithubPackage.ORGANIZATION__BILLING_EMAIL, GithubPackage.Literals.ORGANIZATION__BILLING_EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingEmail(String newBillingEmail) {
		eDynamicSet(GithubPackage.ORGANIZATION__BILLING_EMAIL, GithubPackage.Literals.ORGANIZATION__BILLING_EMAIL, newBillingEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel getDefaultRepositoryPermission() {
		return (PermissionLevel)eDynamicGet(GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION, GithubPackage.Literals.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRepositoryPermission(PermissionLevel newDefaultRepositoryPermission) {
		eDynamicSet(GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION, GithubPackage.Literals.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION, newDefaultRepositoryPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Team> getTeams() {
		return (EList<Team>)eDynamicGet(GithubPackage.ORGANIZATION__TEAMS, GithubPackage.Literals.ORGANIZATION__TEAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Membership> getMembers() {
		return (EList<Membership>)eDynamicGet(GithubPackage.ORGANIZATION__MEMBERS, GithubPackage.Literals.ORGANIZATION__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.ORGANIZATION__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case GithubPackage.ORGANIZATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.ORGANIZATION__BILLING_EMAIL:
				return getBillingEmail();
			case GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION:
				return getDefaultRepositoryPermission();
			case GithubPackage.ORGANIZATION__TEAMS:
				return getTeams();
			case GithubPackage.ORGANIZATION__MEMBERS:
				return getMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.ORGANIZATION__BILLING_EMAIL:
				setBillingEmail((String)newValue);
				return;
			case GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION:
				setDefaultRepositoryPermission((PermissionLevel)newValue);
				return;
			case GithubPackage.ORGANIZATION__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case GithubPackage.ORGANIZATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Membership>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubPackage.ORGANIZATION__BILLING_EMAIL:
				setBillingEmail(BILLING_EMAIL_EDEFAULT);
				return;
			case GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION:
				setDefaultRepositoryPermission(DEFAULT_REPOSITORY_PERMISSION_EDEFAULT);
				return;
			case GithubPackage.ORGANIZATION__TEAMS:
				getTeams().clear();
				return;
			case GithubPackage.ORGANIZATION__MEMBERS:
				getMembers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubPackage.ORGANIZATION__BILLING_EMAIL:
				return BILLING_EMAIL_EDEFAULT == null ? getBillingEmail() != null : !BILLING_EMAIL_EDEFAULT.equals(getBillingEmail());
			case GithubPackage.ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION:
				return getDefaultRepositoryPermission() != DEFAULT_REPOSITORY_PERMISSION_EDEFAULT;
			case GithubPackage.ORGANIZATION__TEAMS:
				return !getTeams().isEmpty();
			case GithubPackage.ORGANIZATION__MEMBERS:
				return !getMembers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
