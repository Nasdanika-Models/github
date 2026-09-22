/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.LanguageUsage;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.LanguageUsageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LanguageUsageImpl#getBytes <em>Bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageUsageImpl extends ModelElementImpl implements LanguageUsage {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long BYTES_EDEFAULT = -1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.LANGUAGE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return (String)eDynamicGet(GithubPackage.LANGUAGE_USAGE__LANGUAGE, GithubPackage.Literals.LANGUAGE_USAGE__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		eDynamicSet(GithubPackage.LANGUAGE_USAGE__LANGUAGE, GithubPackage.Literals.LANGUAGE_USAGE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBytes() {
		return (Long)eDynamicGet(GithubPackage.LANGUAGE_USAGE__BYTES, GithubPackage.Literals.LANGUAGE_USAGE__BYTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(long newBytes) {
		eDynamicSet(GithubPackage.LANGUAGE_USAGE__BYTES, GithubPackage.Literals.LANGUAGE_USAGE__BYTES, newBytes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.LANGUAGE_USAGE__LANGUAGE:
				return getLanguage();
			case GithubPackage.LANGUAGE_USAGE__BYTES:
				return getBytes();
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
			case GithubPackage.LANGUAGE_USAGE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GithubPackage.LANGUAGE_USAGE__BYTES:
				setBytes((Long)newValue);
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
			case GithubPackage.LANGUAGE_USAGE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GithubPackage.LANGUAGE_USAGE__BYTES:
				setBytes(BYTES_EDEFAULT);
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
			case GithubPackage.LANGUAGE_USAGE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case GithubPackage.LANGUAGE_USAGE__BYTES:
				return getBytes() != BYTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LanguageUsageImpl
