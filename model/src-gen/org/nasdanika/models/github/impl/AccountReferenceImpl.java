/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.Account;
import org.nasdanika.models.github.AccountReference;
import org.nasdanika.models.github.GithubPackage;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.AccountReferenceImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountReferenceImpl extends ModelElementImpl implements AccountReference {
	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.ACCOUNT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT_REFERENCE__LOGIN, GithubPackage.Literals.ABSTRACT_ACCOUNT__LOGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		eDynamicSet(GithubPackage.ACCOUNT_REFERENCE__LOGIN, GithubPackage.Literals.ABSTRACT_ACCOUNT__LOGIN, newLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getTarget() {
		return (Account)eDynamicGet(GithubPackage.ACCOUNT_REFERENCE__TARGET, GithubPackage.Literals.ACCOUNT_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetTarget() {
		return (Account)eDynamicGet(GithubPackage.ACCOUNT_REFERENCE__TARGET, GithubPackage.Literals.ACCOUNT_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Account newTarget) {
		eDynamicSet(GithubPackage.ACCOUNT_REFERENCE__TARGET, GithubPackage.Literals.ACCOUNT_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.ACCOUNT_REFERENCE__LOGIN:
				return getLogin();
			case GithubPackage.ACCOUNT_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case GithubPackage.ACCOUNT_REFERENCE__LOGIN:
				setLogin((String)newValue);
				return;
			case GithubPackage.ACCOUNT_REFERENCE__TARGET:
				setTarget((Account)newValue);
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
			case GithubPackage.ACCOUNT_REFERENCE__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT_REFERENCE__TARGET:
				setTarget((Account)null);
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
			case GithubPackage.ACCOUNT_REFERENCE__LOGIN:
				return LOGIN_EDEFAULT == null ? getLogin() != null : !LOGIN_EDEFAULT.equals(getLogin());
			case GithubPackage.ACCOUNT_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountReferenceImpl
