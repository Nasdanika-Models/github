/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.AbstractRepository;
import org.nasdanika.models.github.Account;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.AccountImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccountImpl extends NamedElementImpl implements Account {
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
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatabaseId() <em>Database Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseId()
	 * @generated
	 * @ordered
	 */
	protected static final long DATABASE_ID_EDEFAULT = -1L;

	/**
	 * The default value of the '{@link #getHtmlUrl() <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAvatarUrl() <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT__LOGIN, GithubPackage.Literals.ABSTRACT_ACCOUNT__LOGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		eDynamicSet(GithubPackage.ACCOUNT__LOGIN, GithubPackage.Literals.ABSTRACT_ACCOUNT__LOGIN, newLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GithubPackage.ACCOUNT__LOADS, GithubPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT__NODE_ID, GithubPackage.Literals.ACCOUNT__NODE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		eDynamicSet(GithubPackage.ACCOUNT__NODE_ID, GithubPackage.Literals.ACCOUNT__NODE_ID, newNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDatabaseId() {
		return (Long)eDynamicGet(GithubPackage.ACCOUNT__DATABASE_ID, GithubPackage.Literals.ACCOUNT__DATABASE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseId(long newDatabaseId) {
		eDynamicSet(GithubPackage.ACCOUNT__DATABASE_ID, GithubPackage.Literals.ACCOUNT__DATABASE_ID, newDatabaseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtmlUrl() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT__HTML_URL, GithubPackage.Literals.ACCOUNT__HTML_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlUrl(String newHtmlUrl) {
		eDynamicSet(GithubPackage.ACCOUNT__HTML_URL, GithubPackage.Literals.ACCOUNT__HTML_URL, newHtmlUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvatarUrl() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT__AVATAR_URL, GithubPackage.Literals.ACCOUNT__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(GithubPackage.ACCOUNT__AVATAR_URL, GithubPackage.Literals.ACCOUNT__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)eDynamicGet(GithubPackage.ACCOUNT__EMAIL, GithubPackage.Literals.ACCOUNT__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		eDynamicSet(GithubPackage.ACCOUNT__EMAIL, GithubPackage.Literals.ACCOUNT__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GithubPackage.ACCOUNT__CREATED_AT, GithubPackage.Literals.ACCOUNT__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GithubPackage.ACCOUNT__CREATED_AT, GithubPackage.Literals.ACCOUNT__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GithubPackage.ACCOUNT__UPDATED_AT, GithubPackage.Literals.ACCOUNT__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GithubPackage.ACCOUNT__UPDATED_AT, GithubPackage.Literals.ACCOUNT__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractRepository> getRepositories() {
		return (EList<AbstractRepository>)eDynamicGet(GithubPackage.ACCOUNT__REPOSITORIES, GithubPackage.Literals.ACCOUNT__REPOSITORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.ACCOUNT__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
			case GithubPackage.ACCOUNT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
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
			case GithubPackage.ACCOUNT__LOGIN:
				return getLogin();
			case GithubPackage.ACCOUNT__LOADS:
				return getLoads();
			case GithubPackage.ACCOUNT__NODE_ID:
				return getNodeId();
			case GithubPackage.ACCOUNT__DATABASE_ID:
				return getDatabaseId();
			case GithubPackage.ACCOUNT__HTML_URL:
				return getHtmlUrl();
			case GithubPackage.ACCOUNT__AVATAR_URL:
				return getAvatarUrl();
			case GithubPackage.ACCOUNT__EMAIL:
				return getEmail();
			case GithubPackage.ACCOUNT__CREATED_AT:
				return getCreatedAt();
			case GithubPackage.ACCOUNT__UPDATED_AT:
				return getUpdatedAt();
			case GithubPackage.ACCOUNT__REPOSITORIES:
				return getRepositories();
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
			case GithubPackage.ACCOUNT__LOGIN:
				setLogin((String)newValue);
				return;
			case GithubPackage.ACCOUNT__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
				return;
			case GithubPackage.ACCOUNT__NODE_ID:
				setNodeId((String)newValue);
				return;
			case GithubPackage.ACCOUNT__DATABASE_ID:
				setDatabaseId((Long)newValue);
				return;
			case GithubPackage.ACCOUNT__HTML_URL:
				setHtmlUrl((String)newValue);
				return;
			case GithubPackage.ACCOUNT__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case GithubPackage.ACCOUNT__EMAIL:
				setEmail((String)newValue);
				return;
			case GithubPackage.ACCOUNT__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GithubPackage.ACCOUNT__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GithubPackage.ACCOUNT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends AbstractRepository>)newValue);
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
			case GithubPackage.ACCOUNT__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__LOADS:
				getLoads().clear();
				return;
			case GithubPackage.ACCOUNT__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__DATABASE_ID:
				setDatabaseId(DATABASE_ID_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__HTML_URL:
				setHtmlUrl(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GithubPackage.ACCOUNT__REPOSITORIES:
				getRepositories().clear();
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
			case GithubPackage.ACCOUNT__LOGIN:
				return LOGIN_EDEFAULT == null ? getLogin() != null : !LOGIN_EDEFAULT.equals(getLogin());
			case GithubPackage.ACCOUNT__LOADS:
				return !getLoads().isEmpty();
			case GithubPackage.ACCOUNT__NODE_ID:
				return NODE_ID_EDEFAULT == null ? getNodeId() != null : !NODE_ID_EDEFAULT.equals(getNodeId());
			case GithubPackage.ACCOUNT__DATABASE_ID:
				return getDatabaseId() != DATABASE_ID_EDEFAULT;
			case GithubPackage.ACCOUNT__HTML_URL:
				return HTML_URL_EDEFAULT == null ? getHtmlUrl() != null : !HTML_URL_EDEFAULT.equals(getHtmlUrl());
			case GithubPackage.ACCOUNT__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case GithubPackage.ACCOUNT__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case GithubPackage.ACCOUNT__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GithubPackage.ACCOUNT__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GithubPackage.ACCOUNT__REPOSITORIES:
				return !getRepositories().isEmpty();
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
		if (baseClass == AbstractAccount.class) {
			switch (derivedFeatureID) {
				case GithubPackage.ACCOUNT__LOGIN: return GithubPackage.ABSTRACT_ACCOUNT__LOGIN;
				default: return -1;
			}
		}
		if (baseClass == Loadable.class) {
			switch (derivedFeatureID) {
				case GithubPackage.ACCOUNT__LOADS: return GithubPackage.LOADABLE__LOADS;
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
		if (baseClass == AbstractAccount.class) {
			switch (baseFeatureID) {
				case GithubPackage.ABSTRACT_ACCOUNT__LOGIN: return GithubPackage.ACCOUNT__LOGIN;
				default: return -1;
			}
		}
		if (baseClass == Loadable.class) {
			switch (baseFeatureID) {
				case GithubPackage.LOADABLE__LOADS: return GithubPackage.ACCOUNT__LOADS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AccountImpl
