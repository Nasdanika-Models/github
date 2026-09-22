/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.github.Branch;
import org.nasdanika.models.github.BranchProtection;
import org.nasdanika.models.github.GithubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.BranchImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchImpl#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchImpl#getProtection <em>Protection</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchImpl#getAhead <em>Ahead</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchImpl#getBehind <em>Behind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends RefImpl implements Branch {
	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProtected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROTECTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getAhead() <em>Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAhead()
	 * @generated
	 * @ordered
	 */
	protected static final int AHEAD_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getBehind() <em>Behind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehind()
	 * @generated
	 * @ordered
	 */
	protected static final int BEHIND_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH__DEFAULT, GithubPackage.Literals.BRANCH__DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		eDynamicSet(GithubPackage.BRANCH__DEFAULT, GithubPackage.Literals.BRANCH__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProtected() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH__PROTECTED, GithubPackage.Literals.BRANCH__PROTECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(boolean newProtected) {
		eDynamicSet(GithubPackage.BRANCH__PROTECTED, GithubPackage.Literals.BRANCH__PROTECTED, newProtected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchProtection getProtection() {
		return (BranchProtection)eDynamicGet(GithubPackage.BRANCH__PROTECTION, GithubPackage.Literals.BRANCH__PROTECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtection(BranchProtection newProtection, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProtection, GithubPackage.BRANCH__PROTECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtection(BranchProtection newProtection) {
		eDynamicSet(GithubPackage.BRANCH__PROTECTION, GithubPackage.Literals.BRANCH__PROTECTION, newProtection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAhead() {
		return (Integer)eDynamicGet(GithubPackage.BRANCH__AHEAD, GithubPackage.Literals.BRANCH__AHEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAhead(int newAhead) {
		eDynamicSet(GithubPackage.BRANCH__AHEAD, GithubPackage.Literals.BRANCH__AHEAD, newAhead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBehind() {
		return (Integer)eDynamicGet(GithubPackage.BRANCH__BEHIND, GithubPackage.Literals.BRANCH__BEHIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehind(int newBehind) {
		eDynamicSet(GithubPackage.BRANCH__BEHIND, GithubPackage.Literals.BRANCH__BEHIND, newBehind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.BRANCH__PROTECTION:
				return basicSetProtection(null, msgs);
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
			case GithubPackage.BRANCH__DEFAULT:
				return isDefault();
			case GithubPackage.BRANCH__PROTECTED:
				return isProtected();
			case GithubPackage.BRANCH__PROTECTION:
				return getProtection();
			case GithubPackage.BRANCH__AHEAD:
				return getAhead();
			case GithubPackage.BRANCH__BEHIND:
				return getBehind();
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
			case GithubPackage.BRANCH__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case GithubPackage.BRANCH__PROTECTED:
				setProtected((Boolean)newValue);
				return;
			case GithubPackage.BRANCH__PROTECTION:
				setProtection((BranchProtection)newValue);
				return;
			case GithubPackage.BRANCH__AHEAD:
				setAhead((Integer)newValue);
				return;
			case GithubPackage.BRANCH__BEHIND:
				setBehind((Integer)newValue);
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
			case GithubPackage.BRANCH__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case GithubPackage.BRANCH__PROTECTED:
				setProtected(PROTECTED_EDEFAULT);
				return;
			case GithubPackage.BRANCH__PROTECTION:
				setProtection((BranchProtection)null);
				return;
			case GithubPackage.BRANCH__AHEAD:
				setAhead(AHEAD_EDEFAULT);
				return;
			case GithubPackage.BRANCH__BEHIND:
				setBehind(BEHIND_EDEFAULT);
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
			case GithubPackage.BRANCH__DEFAULT:
				return isDefault() != DEFAULT_EDEFAULT;
			case GithubPackage.BRANCH__PROTECTED:
				return isProtected() != PROTECTED_EDEFAULT;
			case GithubPackage.BRANCH__PROTECTION:
				return getProtection() != null;
			case GithubPackage.BRANCH__AHEAD:
				return getAhead() != AHEAD_EDEFAULT;
			case GithubPackage.BRANCH__BEHIND:
				return getBehind() != BEHIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
