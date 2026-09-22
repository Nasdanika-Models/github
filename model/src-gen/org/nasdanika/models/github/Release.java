/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * RELEASES
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Release#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getDatabaseId <em>Database Id</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getTargetCommitish <em>Target Commitish</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#isDraft <em>Draft</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#isPreRelease <em>Pre Release</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getPublishedAt <em>Published At</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Release#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends NamedElement, Loadable {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_NodeId()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Database Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Id</em>' attribute.
	 * @see #setDatabaseId(long)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_DatabaseId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getDatabaseId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getDatabaseId <em>Database Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Id</em>' attribute.
	 * @see #getDatabaseId()
	 * @generated
	 */
	void setDatabaseId(long value);

	/**
	 * Returns the value of the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The tag this release is cut from, by name and, when loaded, by reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Name</em>' attribute.
	 * @see #setTagName(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_TagName()
	 * @model unique="false"
	 * @generated
	 */
	String getTagName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getTagName <em>Tag Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Name</em>' attribute.
	 * @see #getTagName()
	 * @generated
	 */
	void setTagName(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.github.Tag#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_Tag()
	 * @see org.nasdanika.models.github.Tag#getRelease
	 * @model opposite="release"
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

	/**
	 * Returns the value of the '<em><b>Target Commitish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The branch or SHA the tag was created from, when the tag did not exist yet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Commitish</em>' attribute.
	 * @see #setTargetCommitish(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_TargetCommitish()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetCommitish();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getTargetCommitish <em>Target Commitish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Commitish</em>' attribute.
	 * @see #getTargetCommitish()
	 * @generated
	 */
	void setTargetCommitish(String value);

	/**
	 * Returns the value of the '<em><b>Draft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draft</em>' attribute.
	 * @see #setDraft(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_Draft()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDraft();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#isDraft <em>Draft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draft</em>' attribute.
	 * @see #isDraft()
	 * @generated
	 */
	void setDraft(boolean value);

	/**
	 * Returns the value of the '<em><b>Pre Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  GitHub's pre-release flag. For SemVer products this should agree with the version's pre-release identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Release</em>' attribute.
	 * @see #setPreRelease(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_PreRelease()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPreRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#isPreRelease <em>Pre Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Release</em>' attribute.
	 * @see #isPreRelease()
	 * @generated
	 */
	void setPreRelease(boolean value);

	/**
	 * Returns the value of the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Url</em>' attribute.
	 * @see #setHtmlUrl(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_HtmlUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getHtmlUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getHtmlUrl <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Url</em>' attribute.
	 * @see #getHtmlUrl()
	 * @generated
	 */
	void setHtmlUrl(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_CreatedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Published At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published At</em>' attribute.
	 * @see #setPublishedAt(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_PublishedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getPublishedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getPublishedAt <em>Published At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published At</em>' attribute.
	 * @see #getPublishedAt()
	 * @generated
	 */
	void setPublishedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_Author()
	 * @model
	 * @generated
	 */
	AbstractAccount getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Release#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AbstractAccount value);

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.ReleaseAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getRelease_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReleaseAsset> getAssets();

} // Release
