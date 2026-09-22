/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Repository;
import org.nasdanika.models.github.RepositoryReference;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryReferenceImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.RepositoryReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryReferenceImpl extends ModelElementImpl implements RepositoryReference {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.REPOSITORY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return (String)eDynamicGet(GithubPackage.REPOSITORY_REFERENCE__FULL_NAME, GithubPackage.Literals.ABSTRACT_REPOSITORY__FULL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		eDynamicSet(GithubPackage.REPOSITORY_REFERENCE__FULL_NAME, GithubPackage.Literals.ABSTRACT_REPOSITORY__FULL_NAME, newFullName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getTarget() {
		return (Repository)eDynamicGet(GithubPackage.REPOSITORY_REFERENCE__TARGET, GithubPackage.Literals.REPOSITORY_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetTarget() {
		return (Repository)eDynamicGet(GithubPackage.REPOSITORY_REFERENCE__TARGET, GithubPackage.Literals.REPOSITORY_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Repository newTarget) {
		eDynamicSet(GithubPackage.REPOSITORY_REFERENCE__TARGET, GithubPackage.Literals.REPOSITORY_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.REPOSITORY_REFERENCE__FULL_NAME:
				return getFullName();
			case GithubPackage.REPOSITORY_REFERENCE__TARGET:
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
			case GithubPackage.REPOSITORY_REFERENCE__FULL_NAME:
				setFullName((String)newValue);
				return;
			case GithubPackage.REPOSITORY_REFERENCE__TARGET:
				setTarget((Repository)newValue);
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
			case GithubPackage.REPOSITORY_REFERENCE__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY_REFERENCE__TARGET:
				setTarget((Repository)null);
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
			case GithubPackage.REPOSITORY_REFERENCE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
			case GithubPackage.REPOSITORY_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositoryReferenceImpl
