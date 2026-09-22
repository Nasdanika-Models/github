/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A file attached to a release. GitHub is a distribution channel here, and
 * download counts are the only usage signal it gives, which makes them worth
 * keeping despite being soft.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getDownloads <em>Downloads</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.ReleaseAsset#getUploader <em>Uploader</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset()
 * @model
 * @generated
 */
public interface ReleaseAsset extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_ContentType()
	 * @model unique="false"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_Size()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Downloads</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downloads</em>' attribute.
	 * @see #setDownloads(int)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_Downloads()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getDownloads();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getDownloads <em>Downloads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downloads</em>' attribute.
	 * @see #getDownloads()
	 * @generated
	 */
	void setDownloads(int value);

	/**
	 * Returns the value of the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Url</em>' attribute.
	 * @see #setDownloadUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_DownloadUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getDownloadUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getDownloadUrl <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Url</em>' attribute.
	 * @see #getDownloadUrl()
	 * @generated
	 */
	void setDownloadUrl(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_CreatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_UpdatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Uploader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploader</em>' reference.
	 * @see #setUploader(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getReleaseAsset_Uploader()
	 * @model
	 * @generated
	 */
	AbstractAccount getUploader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.ReleaseAsset#getUploader <em>Uploader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploader</em>' reference.
	 * @see #getUploader()
	 * @generated
	 */
	void setUploader(AbstractAccount value);

} // ReleaseAsset
