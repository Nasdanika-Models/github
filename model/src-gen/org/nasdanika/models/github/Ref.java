/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * REFS
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Ref#getRefName <em>Ref Name</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Ref#getCommitSha <em>Commit Sha</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getRef()
 * @model abstract="true"
 * @generated
 */
public interface Ref extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Full ref name, e.g. refs/heads/main. name holds the short form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Name</em>' attribute.
	 * @see #setRefName(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRef_RefName()
	 * @model unique="false"
	 * @generated
	 */
	String getRefName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Ref#getRefName <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Name</em>' attribute.
	 * @see #getRefName()
	 * @generated
	 */
	void setRefName(String value);

	/**
	 * Returns the value of the '<em><b>Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SHA the ref points at. Resolves into the Git model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commit Sha</em>' attribute.
	 * @see #setCommitSha(String)
	 * @see org.nasdanika.models.github.GithubPackage#getRef_CommitSha()
	 * @model unique="false"
	 * @generated
	 */
	String getCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Ref#getCommitSha <em>Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Sha</em>' attribute.
	 * @see #getCommitSha()
	 * @generated
	 */
	void setCommitSha(String value);

} // Ref
