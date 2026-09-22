/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Membership;
import org.nasdanika.models.github.MembershipRole;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.MembershipImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.MembershipImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.MembershipImpl#isPublicized <em>Publicized</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.MembershipImpl#isPending <em>Pending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends ModelElementImpl implements Membership {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final MembershipRole ROLE_EDEFAULT = MembershipRole.MEMBER;

	/**
	 * The default value of the '{@link #isPublicized() <em>Publicized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLICIZED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPending() <em>Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENDING_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.MEMBERSHIP__ACCOUNT, GithubPackage.Literals.MEMBERSHIP__ACCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.MEMBERSHIP__ACCOUNT, GithubPackage.Literals.MEMBERSHIP__ACCOUNT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(AbstractAccount newAccount) {
		eDynamicSet(GithubPackage.MEMBERSHIP__ACCOUNT, GithubPackage.Literals.MEMBERSHIP__ACCOUNT, newAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipRole getRole() {
		return (MembershipRole)eDynamicGet(GithubPackage.MEMBERSHIP__ROLE, GithubPackage.Literals.MEMBERSHIP__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(MembershipRole newRole) {
		eDynamicSet(GithubPackage.MEMBERSHIP__ROLE, GithubPackage.Literals.MEMBERSHIP__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublicized() {
		return (Boolean)eDynamicGet(GithubPackage.MEMBERSHIP__PUBLICIZED, GithubPackage.Literals.MEMBERSHIP__PUBLICIZED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicized(boolean newPublicized) {
		eDynamicSet(GithubPackage.MEMBERSHIP__PUBLICIZED, GithubPackage.Literals.MEMBERSHIP__PUBLICIZED, newPublicized);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPending() {
		return (Boolean)eDynamicGet(GithubPackage.MEMBERSHIP__PENDING, GithubPackage.Literals.MEMBERSHIP__PENDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPending(boolean newPending) {
		eDynamicSet(GithubPackage.MEMBERSHIP__PENDING, GithubPackage.Literals.MEMBERSHIP__PENDING, newPending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.MEMBERSHIP__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case GithubPackage.MEMBERSHIP__ROLE:
				return getRole();
			case GithubPackage.MEMBERSHIP__PUBLICIZED:
				return isPublicized();
			case GithubPackage.MEMBERSHIP__PENDING:
				return isPending();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.MEMBERSHIP__ACCOUNT:
				setAccount((AbstractAccount)newValue);
				return;
			case GithubPackage.MEMBERSHIP__ROLE:
				setRole((MembershipRole)newValue);
				return;
			case GithubPackage.MEMBERSHIP__PUBLICIZED:
				setPublicized((Boolean)newValue);
				return;
			case GithubPackage.MEMBERSHIP__PENDING:
				setPending((Boolean)newValue);
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
			case GithubPackage.MEMBERSHIP__ACCOUNT:
				setAccount((AbstractAccount)null);
				return;
			case GithubPackage.MEMBERSHIP__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GithubPackage.MEMBERSHIP__PUBLICIZED:
				setPublicized(PUBLICIZED_EDEFAULT);
				return;
			case GithubPackage.MEMBERSHIP__PENDING:
				setPending(PENDING_EDEFAULT);
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
			case GithubPackage.MEMBERSHIP__ACCOUNT:
				return basicGetAccount() != null;
			case GithubPackage.MEMBERSHIP__ROLE:
				return getRole() != ROLE_EDEFAULT;
			case GithubPackage.MEMBERSHIP__PUBLICIZED:
				return isPublicized() != PUBLICIZED_EDEFAULT;
			case GithubPackage.MEMBERSHIP__PENDING:
				return isPending() != PENDING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MembershipImpl
