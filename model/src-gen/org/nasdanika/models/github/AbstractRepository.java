/**
 */
package org.nasdanika.models.github;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * REPOSITORIES
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.AbstractRepository#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getAbstractRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractRepository extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * owner/name, the identity everyone reads and types. Declared here for the
	 * same reason login is: a reference to an unloaded repository still names
	 * it, and containment can key on it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see org.nasdanika.models.github.GithubPackage#getAbstractRepository_FullName()
	 * @model unique="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.AbstractRepository#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

} // AbstractRepository
