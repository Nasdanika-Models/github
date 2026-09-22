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
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;
import org.nasdanika.models.github.Release;
import org.nasdanika.models.github.ReleaseAsset;
import org.nasdanika.models.github.Tag;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getLoads <em>Loads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getTargetCommitish <em>Target Commitish</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#isDraft <em>Draft</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#isPreRelease <em>Pre Release</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getPublishedAt <em>Published At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends NamedElementImpl implements Release {
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
	 * The default value of the '{@link #getTagName() <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetCommitish() <em>Target Commitish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCommitish()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COMMITISH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDraft() <em>Draft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRAFT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPreRelease() <em>Pre Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreRelease()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_RELEASE_EDEFAULT = false;

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
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublishedAt() <em>Published At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBLISHED_AT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GithubPackage.RELEASE__LOADS, GithubPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return (String)eDynamicGet(GithubPackage.RELEASE__NODE_ID, GithubPackage.Literals.RELEASE__NODE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		eDynamicSet(GithubPackage.RELEASE__NODE_ID, GithubPackage.Literals.RELEASE__NODE_ID, newNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDatabaseId() {
		return (Long)eDynamicGet(GithubPackage.RELEASE__DATABASE_ID, GithubPackage.Literals.RELEASE__DATABASE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseId(long newDatabaseId) {
		eDynamicSet(GithubPackage.RELEASE__DATABASE_ID, GithubPackage.Literals.RELEASE__DATABASE_ID, newDatabaseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagName() {
		return (String)eDynamicGet(GithubPackage.RELEASE__TAG_NAME, GithubPackage.Literals.RELEASE__TAG_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagName(String newTagName) {
		eDynamicSet(GithubPackage.RELEASE__TAG_NAME, GithubPackage.Literals.RELEASE__TAG_NAME, newTagName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getTag() {
		return (Tag)eDynamicGet(GithubPackage.RELEASE__TAG, GithubPackage.Literals.RELEASE__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag basicGetTag() {
		return (Tag)eDynamicGet(GithubPackage.RELEASE__TAG, GithubPackage.Literals.RELEASE__TAG, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTag(Tag newTag, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTag, GithubPackage.RELEASE__TAG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(Tag newTag) {
		eDynamicSet(GithubPackage.RELEASE__TAG, GithubPackage.Literals.RELEASE__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCommitish() {
		return (String)eDynamicGet(GithubPackage.RELEASE__TARGET_COMMITISH, GithubPackage.Literals.RELEASE__TARGET_COMMITISH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCommitish(String newTargetCommitish) {
		eDynamicSet(GithubPackage.RELEASE__TARGET_COMMITISH, GithubPackage.Literals.RELEASE__TARGET_COMMITISH, newTargetCommitish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDraft() {
		return (Boolean)eDynamicGet(GithubPackage.RELEASE__DRAFT, GithubPackage.Literals.RELEASE__DRAFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraft(boolean newDraft) {
		eDynamicSet(GithubPackage.RELEASE__DRAFT, GithubPackage.Literals.RELEASE__DRAFT, newDraft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreRelease() {
		return (Boolean)eDynamicGet(GithubPackage.RELEASE__PRE_RELEASE, GithubPackage.Literals.RELEASE__PRE_RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreRelease(boolean newPreRelease) {
		eDynamicSet(GithubPackage.RELEASE__PRE_RELEASE, GithubPackage.Literals.RELEASE__PRE_RELEASE, newPreRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtmlUrl() {
		return (String)eDynamicGet(GithubPackage.RELEASE__HTML_URL, GithubPackage.Literals.RELEASE__HTML_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlUrl(String newHtmlUrl) {
		eDynamicSet(GithubPackage.RELEASE__HTML_URL, GithubPackage.Literals.RELEASE__HTML_URL, newHtmlUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GithubPackage.RELEASE__CREATED_AT, GithubPackage.Literals.RELEASE__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GithubPackage.RELEASE__CREATED_AT, GithubPackage.Literals.RELEASE__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPublishedAt() {
		return (Date)eDynamicGet(GithubPackage.RELEASE__PUBLISHED_AT, GithubPackage.Literals.RELEASE__PUBLISHED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedAt(Date newPublishedAt) {
		eDynamicSet(GithubPackage.RELEASE__PUBLISHED_AT, GithubPackage.Literals.RELEASE__PUBLISHED_AT, newPublishedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getAuthor() {
		return (AbstractAccount)eDynamicGet(GithubPackage.RELEASE__AUTHOR, GithubPackage.Literals.RELEASE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetAuthor() {
		return (AbstractAccount)eDynamicGet(GithubPackage.RELEASE__AUTHOR, GithubPackage.Literals.RELEASE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(AbstractAccount newAuthor) {
		eDynamicSet(GithubPackage.RELEASE__AUTHOR, GithubPackage.Literals.RELEASE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ReleaseAsset> getAssets() {
		return (EList<ReleaseAsset>)eDynamicGet(GithubPackage.RELEASE__ASSETS, GithubPackage.Literals.RELEASE__ASSETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.RELEASE__TAG:
				Tag tag = basicGetTag();
				if (tag != null)
					msgs = ((InternalEObject)tag).eInverseRemove(this, GithubPackage.TAG__RELEASE, Tag.class, msgs);
				return basicSetTag((Tag)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.RELEASE__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
			case GithubPackage.RELEASE__TAG:
				return basicSetTag(null, msgs);
			case GithubPackage.RELEASE__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case GithubPackage.RELEASE__LOADS:
				return getLoads();
			case GithubPackage.RELEASE__NODE_ID:
				return getNodeId();
			case GithubPackage.RELEASE__DATABASE_ID:
				return getDatabaseId();
			case GithubPackage.RELEASE__TAG_NAME:
				return getTagName();
			case GithubPackage.RELEASE__TAG:
				if (resolve) return getTag();
				return basicGetTag();
			case GithubPackage.RELEASE__TARGET_COMMITISH:
				return getTargetCommitish();
			case GithubPackage.RELEASE__DRAFT:
				return isDraft();
			case GithubPackage.RELEASE__PRE_RELEASE:
				return isPreRelease();
			case GithubPackage.RELEASE__HTML_URL:
				return getHtmlUrl();
			case GithubPackage.RELEASE__CREATED_AT:
				return getCreatedAt();
			case GithubPackage.RELEASE__PUBLISHED_AT:
				return getPublishedAt();
			case GithubPackage.RELEASE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case GithubPackage.RELEASE__ASSETS:
				return getAssets();
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
			case GithubPackage.RELEASE__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
				return;
			case GithubPackage.RELEASE__NODE_ID:
				setNodeId((String)newValue);
				return;
			case GithubPackage.RELEASE__DATABASE_ID:
				setDatabaseId((Long)newValue);
				return;
			case GithubPackage.RELEASE__TAG_NAME:
				setTagName((String)newValue);
				return;
			case GithubPackage.RELEASE__TAG:
				setTag((Tag)newValue);
				return;
			case GithubPackage.RELEASE__TARGET_COMMITISH:
				setTargetCommitish((String)newValue);
				return;
			case GithubPackage.RELEASE__DRAFT:
				setDraft((Boolean)newValue);
				return;
			case GithubPackage.RELEASE__PRE_RELEASE:
				setPreRelease((Boolean)newValue);
				return;
			case GithubPackage.RELEASE__HTML_URL:
				setHtmlUrl((String)newValue);
				return;
			case GithubPackage.RELEASE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GithubPackage.RELEASE__PUBLISHED_AT:
				setPublishedAt((Date)newValue);
				return;
			case GithubPackage.RELEASE__AUTHOR:
				setAuthor((AbstractAccount)newValue);
				return;
			case GithubPackage.RELEASE__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends ReleaseAsset>)newValue);
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
			case GithubPackage.RELEASE__LOADS:
				getLoads().clear();
				return;
			case GithubPackage.RELEASE__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.RELEASE__DATABASE_ID:
				setDatabaseId(DATABASE_ID_EDEFAULT);
				return;
			case GithubPackage.RELEASE__TAG_NAME:
				setTagName(TAG_NAME_EDEFAULT);
				return;
			case GithubPackage.RELEASE__TAG:
				setTag((Tag)null);
				return;
			case GithubPackage.RELEASE__TARGET_COMMITISH:
				setTargetCommitish(TARGET_COMMITISH_EDEFAULT);
				return;
			case GithubPackage.RELEASE__DRAFT:
				setDraft(DRAFT_EDEFAULT);
				return;
			case GithubPackage.RELEASE__PRE_RELEASE:
				setPreRelease(PRE_RELEASE_EDEFAULT);
				return;
			case GithubPackage.RELEASE__HTML_URL:
				setHtmlUrl(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.RELEASE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.RELEASE__PUBLISHED_AT:
				setPublishedAt(PUBLISHED_AT_EDEFAULT);
				return;
			case GithubPackage.RELEASE__AUTHOR:
				setAuthor((AbstractAccount)null);
				return;
			case GithubPackage.RELEASE__ASSETS:
				getAssets().clear();
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
			case GithubPackage.RELEASE__LOADS:
				return !getLoads().isEmpty();
			case GithubPackage.RELEASE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? getNodeId() != null : !NODE_ID_EDEFAULT.equals(getNodeId());
			case GithubPackage.RELEASE__DATABASE_ID:
				return getDatabaseId() != DATABASE_ID_EDEFAULT;
			case GithubPackage.RELEASE__TAG_NAME:
				return TAG_NAME_EDEFAULT == null ? getTagName() != null : !TAG_NAME_EDEFAULT.equals(getTagName());
			case GithubPackage.RELEASE__TAG:
				return basicGetTag() != null;
			case GithubPackage.RELEASE__TARGET_COMMITISH:
				return TARGET_COMMITISH_EDEFAULT == null ? getTargetCommitish() != null : !TARGET_COMMITISH_EDEFAULT.equals(getTargetCommitish());
			case GithubPackage.RELEASE__DRAFT:
				return isDraft() != DRAFT_EDEFAULT;
			case GithubPackage.RELEASE__PRE_RELEASE:
				return isPreRelease() != PRE_RELEASE_EDEFAULT;
			case GithubPackage.RELEASE__HTML_URL:
				return HTML_URL_EDEFAULT == null ? getHtmlUrl() != null : !HTML_URL_EDEFAULT.equals(getHtmlUrl());
			case GithubPackage.RELEASE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GithubPackage.RELEASE__PUBLISHED_AT:
				return PUBLISHED_AT_EDEFAULT == null ? getPublishedAt() != null : !PUBLISHED_AT_EDEFAULT.equals(getPublishedAt());
			case GithubPackage.RELEASE__AUTHOR:
				return basicGetAuthor() != null;
			case GithubPackage.RELEASE__ASSETS:
				return !getAssets().isEmpty();
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
				case GithubPackage.RELEASE__LOADS: return GithubPackage.LOADABLE__LOADS;
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
				case GithubPackage.LOADABLE__LOADS: return GithubPackage.RELEASE__LOADS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReleaseImpl
