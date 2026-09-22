/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loadable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ===========================================================================
 * PROVENANCE
 * ===========================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Loadable#getLoads <em>Loads</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getLoadable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Loadable extends EObject {
	/**
	 * Returns the value of the '<em><b>Loads</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Load}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loads</em>' containment reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getLoadable_Loads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Load> getLoads();

} // Loadable
