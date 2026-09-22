/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Ref;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.RefImpl#getRefName <em>Ref Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RefImpl#getCommitSha <em>Commit Sha</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RefImpl extends NamedElementImpl implements Ref {
	/**
	 * The default value of the '{@link #getRefName() <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommitSha() <em>Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMIT_SHA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefName() {
		return (String)eDynamicGet(GithubPackage.REF__REF_NAME, GithubPackage.Literals.REF__REF_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefName(String newRefName) {
		eDynamicSet(GithubPackage.REF__REF_NAME, GithubPackage.Literals.REF__REF_NAME, newRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommitSha() {
		return (String)eDynamicGet(GithubPackage.REF__COMMIT_SHA, GithubPackage.Literals.REF__COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitSha(String newCommitSha) {
		eDynamicSet(GithubPackage.REF__COMMIT_SHA, GithubPackage.Literals.REF__COMMIT_SHA, newCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.REF__REF_NAME:
				return getRefName();
			case GithubPackage.REF__COMMIT_SHA:
				return getCommitSha();
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
			case GithubPackage.REF__REF_NAME:
				setRefName((String)newValue);
				return;
			case GithubPackage.REF__COMMIT_SHA:
				setCommitSha((String)newValue);
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
			case GithubPackage.REF__REF_NAME:
				setRefName(REF_NAME_EDEFAULT);
				return;
			case GithubPackage.REF__COMMIT_SHA:
				setCommitSha(COMMIT_SHA_EDEFAULT);
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
			case GithubPackage.REF__REF_NAME:
				return REF_NAME_EDEFAULT == null ? getRefName() != null : !REF_NAME_EDEFAULT.equals(getRefName());
			case GithubPackage.REF__COMMIT_SHA:
				return COMMIT_SHA_EDEFAULT == null ? getCommitSha() != null : !COMMIT_SHA_EDEFAULT.equals(getCommitSha());
		}
		return super.eIsSet(featureID);
	}

} //RefImpl
