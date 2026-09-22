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
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;
import org.nasdanika.models.github.Membership;
import org.nasdanika.models.github.Team;
import org.nasdanika.models.github.TeamAccess;
import org.nasdanika.models.github.TeamPrivacy;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getSlug <em>Slug</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getPrivacy <em>Privacy</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends NamedElementImpl implements Team {
	/**
	 * The default value of the '{@link #getSlug() <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlug()
	 * @generated
	 * @ordered
	 */
	protected static final String SLUG_EDEFAULT = null;

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
	 * The default value of the '{@link #getPrivacy() <em>Privacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacy()
	 * @generated
	 * @ordered
	 */
	protected static final TeamPrivacy PRIVACY_EDEFAULT = TeamPrivacy.VISIBLE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GithubPackage.TEAM__LOADS, GithubPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlug() {
		return (String)eDynamicGet(GithubPackage.TEAM__SLUG, GithubPackage.Literals.TEAM__SLUG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlug(String newSlug) {
		eDynamicSet(GithubPackage.TEAM__SLUG, GithubPackage.Literals.TEAM__SLUG, newSlug);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return (String)eDynamicGet(GithubPackage.TEAM__NODE_ID, GithubPackage.Literals.TEAM__NODE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		eDynamicSet(GithubPackage.TEAM__NODE_ID, GithubPackage.Literals.TEAM__NODE_ID, newNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDatabaseId() {
		return (Long)eDynamicGet(GithubPackage.TEAM__DATABASE_ID, GithubPackage.Literals.TEAM__DATABASE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseId(long newDatabaseId) {
		eDynamicSet(GithubPackage.TEAM__DATABASE_ID, GithubPackage.Literals.TEAM__DATABASE_ID, newDatabaseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtmlUrl() {
		return (String)eDynamicGet(GithubPackage.TEAM__HTML_URL, GithubPackage.Literals.TEAM__HTML_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlUrl(String newHtmlUrl) {
		eDynamicSet(GithubPackage.TEAM__HTML_URL, GithubPackage.Literals.TEAM__HTML_URL, newHtmlUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamPrivacy getPrivacy() {
		return (TeamPrivacy)eDynamicGet(GithubPackage.TEAM__PRIVACY, GithubPackage.Literals.TEAM__PRIVACY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacy(TeamPrivacy newPrivacy) {
		eDynamicSet(GithubPackage.TEAM__PRIVACY, GithubPackage.Literals.TEAM__PRIVACY, newPrivacy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getParent() {
		return (Team)eDynamicGet(GithubPackage.TEAM__PARENT, GithubPackage.Literals.TEAM__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetParent() {
		return (Team)eDynamicGet(GithubPackage.TEAM__PARENT, GithubPackage.Literals.TEAM__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Team newParent) {
		eDynamicSet(GithubPackage.TEAM__PARENT, GithubPackage.Literals.TEAM__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Team> getChildren() {
		return (EList<Team>)eDynamicGet(GithubPackage.TEAM__CHILDREN, GithubPackage.Literals.TEAM__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Membership> getMembers() {
		return (EList<Membership>)eDynamicGet(GithubPackage.TEAM__MEMBERS, GithubPackage.Literals.TEAM__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TeamAccess> getAccess() {
		return (EList<TeamAccess>)eDynamicGet(GithubPackage.TEAM__ACCESS, GithubPackage.Literals.TEAM__ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.TEAM__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
			case GithubPackage.TEAM__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case GithubPackage.TEAM__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case GithubPackage.TEAM__ACCESS:
				return ((InternalEList<?>)getAccess()).basicRemove(otherEnd, msgs);
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
			case GithubPackage.TEAM__LOADS:
				return getLoads();
			case GithubPackage.TEAM__SLUG:
				return getSlug();
			case GithubPackage.TEAM__NODE_ID:
				return getNodeId();
			case GithubPackage.TEAM__DATABASE_ID:
				return getDatabaseId();
			case GithubPackage.TEAM__HTML_URL:
				return getHtmlUrl();
			case GithubPackage.TEAM__PRIVACY:
				return getPrivacy();
			case GithubPackage.TEAM__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GithubPackage.TEAM__CHILDREN:
				return getChildren();
			case GithubPackage.TEAM__MEMBERS:
				return getMembers();
			case GithubPackage.TEAM__ACCESS:
				return getAccess();
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
			case GithubPackage.TEAM__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
				return;
			case GithubPackage.TEAM__SLUG:
				setSlug((String)newValue);
				return;
			case GithubPackage.TEAM__NODE_ID:
				setNodeId((String)newValue);
				return;
			case GithubPackage.TEAM__DATABASE_ID:
				setDatabaseId((Long)newValue);
				return;
			case GithubPackage.TEAM__HTML_URL:
				setHtmlUrl((String)newValue);
				return;
			case GithubPackage.TEAM__PRIVACY:
				setPrivacy((TeamPrivacy)newValue);
				return;
			case GithubPackage.TEAM__PARENT:
				setParent((Team)newValue);
				return;
			case GithubPackage.TEAM__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Team>)newValue);
				return;
			case GithubPackage.TEAM__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Membership>)newValue);
				return;
			case GithubPackage.TEAM__ACCESS:
				getAccess().clear();
				getAccess().addAll((Collection<? extends TeamAccess>)newValue);
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
			case GithubPackage.TEAM__LOADS:
				getLoads().clear();
				return;
			case GithubPackage.TEAM__SLUG:
				setSlug(SLUG_EDEFAULT);
				return;
			case GithubPackage.TEAM__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.TEAM__DATABASE_ID:
				setDatabaseId(DATABASE_ID_EDEFAULT);
				return;
			case GithubPackage.TEAM__HTML_URL:
				setHtmlUrl(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.TEAM__PRIVACY:
				setPrivacy(PRIVACY_EDEFAULT);
				return;
			case GithubPackage.TEAM__PARENT:
				setParent((Team)null);
				return;
			case GithubPackage.TEAM__CHILDREN:
				getChildren().clear();
				return;
			case GithubPackage.TEAM__MEMBERS:
				getMembers().clear();
				return;
			case GithubPackage.TEAM__ACCESS:
				getAccess().clear();
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
			case GithubPackage.TEAM__LOADS:
				return !getLoads().isEmpty();
			case GithubPackage.TEAM__SLUG:
				return SLUG_EDEFAULT == null ? getSlug() != null : !SLUG_EDEFAULT.equals(getSlug());
			case GithubPackage.TEAM__NODE_ID:
				return NODE_ID_EDEFAULT == null ? getNodeId() != null : !NODE_ID_EDEFAULT.equals(getNodeId());
			case GithubPackage.TEAM__DATABASE_ID:
				return getDatabaseId() != DATABASE_ID_EDEFAULT;
			case GithubPackage.TEAM__HTML_URL:
				return HTML_URL_EDEFAULT == null ? getHtmlUrl() != null : !HTML_URL_EDEFAULT.equals(getHtmlUrl());
			case GithubPackage.TEAM__PRIVACY:
				return getPrivacy() != PRIVACY_EDEFAULT;
			case GithubPackage.TEAM__PARENT:
				return basicGetParent() != null;
			case GithubPackage.TEAM__CHILDREN:
				return !getChildren().isEmpty();
			case GithubPackage.TEAM__MEMBERS:
				return !getMembers().isEmpty();
			case GithubPackage.TEAM__ACCESS:
				return !getAccess().isEmpty();
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
				case GithubPackage.TEAM__LOADS: return GithubPackage.LOADABLE__LOADS;
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
				case GithubPackage.LOADABLE__LOADS: return GithubPackage.TEAM__LOADS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TeamImpl
