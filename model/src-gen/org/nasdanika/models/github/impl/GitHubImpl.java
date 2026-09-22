/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.GitHub;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.GitHubImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.GitHubImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.GitHubImpl#getApiUrl <em>Api Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.GitHubImpl#isEnterpriseServer <em>Enterprise Server</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.GitHubImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitHubImpl extends NamedElementImpl implements GitHub {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApiUrl() <em>Api Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String API_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isEnterpriseServer() <em>Enterprise Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnterpriseServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTERPRISE_SERVER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitHubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.GIT_HUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GithubPackage.GIT_HUB__LOADS, GithubPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eDynamicGet(GithubPackage.GIT_HUB__URL, GithubPackage.Literals.GIT_HUB__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eDynamicSet(GithubPackage.GIT_HUB__URL, GithubPackage.Literals.GIT_HUB__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiUrl() {
		return (String)eDynamicGet(GithubPackage.GIT_HUB__API_URL, GithubPackage.Literals.GIT_HUB__API_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiUrl(String newApiUrl) {
		eDynamicSet(GithubPackage.GIT_HUB__API_URL, GithubPackage.Literals.GIT_HUB__API_URL, newApiUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnterpriseServer() {
		return (Boolean)eDynamicGet(GithubPackage.GIT_HUB__ENTERPRISE_SERVER, GithubPackage.Literals.GIT_HUB__ENTERPRISE_SERVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseServer(boolean newEnterpriseServer) {
		eDynamicSet(GithubPackage.GIT_HUB__ENTERPRISE_SERVER, GithubPackage.Literals.GIT_HUB__ENTERPRISE_SERVER, newEnterpriseServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getAccounts() {
		return (EList<AbstractAccount>)eDynamicGet(GithubPackage.GIT_HUB__ACCOUNTS, GithubPackage.Literals.GIT_HUB__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.GIT_HUB__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
			case GithubPackage.GIT_HUB__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
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
			case GithubPackage.GIT_HUB__LOADS:
				return getLoads();
			case GithubPackage.GIT_HUB__URL:
				return getUrl();
			case GithubPackage.GIT_HUB__API_URL:
				return getApiUrl();
			case GithubPackage.GIT_HUB__ENTERPRISE_SERVER:
				return isEnterpriseServer();
			case GithubPackage.GIT_HUB__ACCOUNTS:
				return getAccounts();
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
			case GithubPackage.GIT_HUB__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
				return;
			case GithubPackage.GIT_HUB__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.GIT_HUB__API_URL:
				setApiUrl((String)newValue);
				return;
			case GithubPackage.GIT_HUB__ENTERPRISE_SERVER:
				setEnterpriseServer((Boolean)newValue);
				return;
			case GithubPackage.GIT_HUB__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends AbstractAccount>)newValue);
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
			case GithubPackage.GIT_HUB__LOADS:
				getLoads().clear();
				return;
			case GithubPackage.GIT_HUB__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.GIT_HUB__API_URL:
				setApiUrl(API_URL_EDEFAULT);
				return;
			case GithubPackage.GIT_HUB__ENTERPRISE_SERVER:
				setEnterpriseServer(ENTERPRISE_SERVER_EDEFAULT);
				return;
			case GithubPackage.GIT_HUB__ACCOUNTS:
				getAccounts().clear();
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
			case GithubPackage.GIT_HUB__LOADS:
				return !getLoads().isEmpty();
			case GithubPackage.GIT_HUB__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case GithubPackage.GIT_HUB__API_URL:
				return API_URL_EDEFAULT == null ? getApiUrl() != null : !API_URL_EDEFAULT.equals(getApiUrl());
			case GithubPackage.GIT_HUB__ENTERPRISE_SERVER:
				return isEnterpriseServer() != ENTERPRISE_SERVER_EDEFAULT;
			case GithubPackage.GIT_HUB__ACCOUNTS:
				return !getAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Loadable.class) {
			switch (derivedFeatureID) {
				case GithubPackage.GIT_HUB__LOADS: return GithubPackage.LOADABLE__LOADS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Loadable.class) {
			switch (baseFeatureID) {
				case GithubPackage.LOADABLE__LOADS: return GithubPackage.GIT_HUB__LOADS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GitHubImpl
