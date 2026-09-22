/**
 */
package org.nasdanika.models.github;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Branch#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Branch#isProtected <em>Protected</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Branch#getProtection <em>Protection</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Branch#getAhead <em>Ahead</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Branch#getBehind <em>Behind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Ref {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  True for the repository's default branch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranch_Default()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Branch#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see #setProtected(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranch_Protected()
	 * @model unique="false"
	 * @generated
	 */
	boolean isProtected();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Branch#isProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see #isProtected()
	 * @generated
	 */
	void setProtected(boolean value);

	/**
	 * Returns the value of the '<em><b>Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection</em>' containment reference.
	 * @see #setProtection(BranchProtection)
	 * @see org.nasdanika.models.github.GithubPackage#getBranch_Protection()
	 * @model containment="true"
	 * @generated
	 */
	BranchProtection getProtection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Branch#getProtection <em>Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection</em>' containment reference.
	 * @see #getProtection()
	 * @generated
	 */
	void setProtection(BranchProtection value);

	/**
	 * Returns the value of the '<em><b>Ahead</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Commits ahead of and behind the default branch, when computed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ahead</em>' attribute.
	 * @see #setAhead(int)
	 * @see org.nasdanika.models.github.GithubPackage#getBranch_Ahead()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getAhead();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Branch#getAhead <em>Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ahead</em>' attribute.
	 * @see #getAhead()
	 * @generated
	 */
	void setAhead(int value);

	/**
	 * Returns the value of the '<em><b>Behind</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behind</em>' attribute.
	 * @see #setBehind(int)
	 * @see org.nasdanika.models.github.GithubPackage#getBranch_Behind()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getBehind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Branch#getBehind <em>Behind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behind</em>' attribute.
	 * @see #getBehind()
	 * @generated
	 */
	void setBehind(int value);

} // Branch
