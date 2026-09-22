/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bytes of source per language, as GitHub detects them. A crude measure and
 * the only comparable one available across an estate, which is why it is
 * here: "how much TypeScript is there now" is a question with no other cheap
 * answer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.LanguageUsage#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.github.LanguageUsage#getBytes <em>Bytes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getLanguageUsage()
 * @model
 * @generated
 */
public interface LanguageUsage extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.models.github.GithubPackage#getLanguageUsage_Language()
	 * @model unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.LanguageUsage#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(long)
	 * @see org.nasdanika.models.github.GithubPackage#getLanguageUsage_Bytes()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	long getBytes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.LanguageUsage#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(long value);

} // LanguageUsage
