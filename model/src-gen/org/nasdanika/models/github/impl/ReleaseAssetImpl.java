/**
 */
package org.nasdanika.models.github.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.ReleaseAsset;

import org.nasdanika.models.nxcore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getDownloads <em>Downloads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ReleaseAssetImpl#getUploader <em>Uploader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseAssetImpl extends NamedElementImpl implements ReleaseAsset {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = -1L;

	/**
	 * The default value of the '{@link #getDownloads() <em>Downloads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloads()
	 * @generated
	 * @ordered
	 */
	protected static final int DOWNLOADS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getDownloadUrl() <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_URL_EDEFAULT = null;

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
	protected ReleaseAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.RELEASE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(GithubPackage.RELEASE_ASSET__LABEL, GithubPackage.Literals.RELEASE_ASSET__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__LABEL, GithubPackage.Literals.RELEASE_ASSET__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return (String)eDynamicGet(GithubPackage.RELEASE_ASSET__CONTENT_TYPE, GithubPackage.Literals.RELEASE_ASSET__CONTENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__CONTENT_TYPE, GithubPackage.Literals.RELEASE_ASSET__CONTENT_TYPE, newContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return (Long)eDynamicGet(GithubPackage.RELEASE_ASSET__SIZE, GithubPackage.Literals.RELEASE_ASSET__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__SIZE, GithubPackage.Literals.RELEASE_ASSET__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDownloads() {
		return (Integer)eDynamicGet(GithubPackage.RELEASE_ASSET__DOWNLOADS, GithubPackage.Literals.RELEASE_ASSET__DOWNLOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloads(int newDownloads) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__DOWNLOADS, GithubPackage.Literals.RELEASE_ASSET__DOWNLOADS, newDownloads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadUrl() {
		return (String)eDynamicGet(GithubPackage.RELEASE_ASSET__DOWNLOAD_URL, GithubPackage.Literals.RELEASE_ASSET__DOWNLOAD_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadUrl(String newDownloadUrl) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__DOWNLOAD_URL, GithubPackage.Literals.RELEASE_ASSET__DOWNLOAD_URL, newDownloadUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GithubPackage.RELEASE_ASSET__CREATED_AT, GithubPackage.Literals.RELEASE_ASSET__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__CREATED_AT, GithubPackage.Literals.RELEASE_ASSET__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GithubPackage.RELEASE_ASSET__UPDATED_AT, GithubPackage.Literals.RELEASE_ASSET__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__UPDATED_AT, GithubPackage.Literals.RELEASE_ASSET__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getUploader() {
		return (AbstractAccount)eDynamicGet(GithubPackage.RELEASE_ASSET__UPLOADER, GithubPackage.Literals.RELEASE_ASSET__UPLOADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetUploader() {
		return (AbstractAccount)eDynamicGet(GithubPackage.RELEASE_ASSET__UPLOADER, GithubPackage.Literals.RELEASE_ASSET__UPLOADER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploader(AbstractAccount newUploader) {
		eDynamicSet(GithubPackage.RELEASE_ASSET__UPLOADER, GithubPackage.Literals.RELEASE_ASSET__UPLOADER, newUploader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.RELEASE_ASSET__LABEL:
				return getLabel();
			case GithubPackage.RELEASE_ASSET__CONTENT_TYPE:
				return getContentType();
			case GithubPackage.RELEASE_ASSET__SIZE:
				return getSize();
			case GithubPackage.RELEASE_ASSET__DOWNLOADS:
				return getDownloads();
			case GithubPackage.RELEASE_ASSET__DOWNLOAD_URL:
				return getDownloadUrl();
			case GithubPackage.RELEASE_ASSET__CREATED_AT:
				return getCreatedAt();
			case GithubPackage.RELEASE_ASSET__UPDATED_AT:
				return getUpdatedAt();
			case GithubPackage.RELEASE_ASSET__UPLOADER:
				if (resolve) return getUploader();
				return basicGetUploader();
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
			case GithubPackage.RELEASE_ASSET__LABEL:
				setLabel((String)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__SIZE:
				setSize((Long)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__DOWNLOADS:
				setDownloads((Integer)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__DOWNLOAD_URL:
				setDownloadUrl((String)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GithubPackage.RELEASE_ASSET__UPLOADER:
				setUploader((AbstractAccount)newValue);
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
			case GithubPackage.RELEASE_ASSET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__DOWNLOADS:
				setDownloads(DOWNLOADS_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__DOWNLOAD_URL:
				setDownloadUrl(DOWNLOAD_URL_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GithubPackage.RELEASE_ASSET__UPLOADER:
				setUploader((AbstractAccount)null);
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
			case GithubPackage.RELEASE_ASSET__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case GithubPackage.RELEASE_ASSET__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? getContentType() != null : !CONTENT_TYPE_EDEFAULT.equals(getContentType());
			case GithubPackage.RELEASE_ASSET__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case GithubPackage.RELEASE_ASSET__DOWNLOADS:
				return getDownloads() != DOWNLOADS_EDEFAULT;
			case GithubPackage.RELEASE_ASSET__DOWNLOAD_URL:
				return DOWNLOAD_URL_EDEFAULT == null ? getDownloadUrl() != null : !DOWNLOAD_URL_EDEFAULT.equals(getDownloadUrl());
			case GithubPackage.RELEASE_ASSET__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GithubPackage.RELEASE_ASSET__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GithubPackage.RELEASE_ASSET__UPLOADER:
				return basicGetUploader() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseAssetImpl
