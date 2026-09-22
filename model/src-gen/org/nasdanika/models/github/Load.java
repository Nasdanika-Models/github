/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One load of one thing: the containing element itself, or one of its
 * references.
 * 
 * Absence of a Load for a reference means "never loaded", which is a
 * different fact from "loaded and empty", and the difference matters in every
 * report built on a partial scan. An empty branches list with no Load beside
 * it means nobody looked.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Load#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#getEtag <em>Etag</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Load#isComplete <em>Complete</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Source system: the API base URL, optionally with the account used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the reference loaded. Empty means the containing element itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Reference()
	 * @model unique="false"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Start()
	 * @model unique="false"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_End()
	 * @model unique="false"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of elements loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Size()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Set when the load failed or was truncated; the partial result is kept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Error()
	 * @model unique="false"
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Etag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ETag returned by the API, so the next refresh can be a conditional
	 * request. A 304 costs no rate limit, which is the difference between
	 * rescanning a hundred repositories hourly and doing it once a day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Etag</em>' attribute.
	 * @see #setEtag(String)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Etag()
	 * @model unique="false"
	 * @generated
	 */
	String getEtag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#getEtag <em>Etag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etag</em>' attribute.
	 * @see #getEtag()
	 * @generated
	 */
	void setEtag(String value);

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  False when pagination stopped early: a page limit, a rate limit, an error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getLoad_Complete()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Load#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

} // Load
