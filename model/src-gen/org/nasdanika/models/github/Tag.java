/**
 */
package org.nasdanika.models.github;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tag. Annotated tags carry a tagger and a message and are themselves git
 * objects; lightweight tags are just a name. The distinction matters for
 * signed releases, so it is recorded.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Tag#isAnnotated <em>Annotated</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Tag#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Tag#getTagger <em>Tagger</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Tag#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Tag#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Ref {
	/**
	 * Returns the value of the '<em><b>Annotated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated</em>' attribute.
	 * @see #setAnnotated(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getTag_Annotated()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAnnotated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Tag#isAnnotated <em>Annotated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated</em>' attribute.
	 * @see #isAnnotated()
	 * @generated
	 */
	void setAnnotated(boolean value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.nasdanika.models.github.GithubPackage#getTag_Message()
	 * @model unique="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Tag#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Tagger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagger</em>' reference.
	 * @see #setTagger(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getTag_Tagger()
	 * @model
	 * @generated
	 */
	AbstractAccount getTagger();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Tag#getTagger <em>Tagger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagger</em>' reference.
	 * @see #getTagger()
	 * @generated
	 */
	void setTagger(AbstractAccount value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getTag_Date()
	 * @model unique="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Tag#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.github.Release#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Set when a release was cut from this tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.nasdanika.models.github.GithubPackage#getTag_Release()
	 * @see org.nasdanika.models.github.Release#getTag
	 * @model opposite="tag"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Tag#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // Tag
