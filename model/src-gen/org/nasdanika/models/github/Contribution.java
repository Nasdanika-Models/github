/**
 */
package org.nasdanika.models.github;

import java.util.Date;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Commits by one account in one repository. GitHub's contributor statistics,
 * kept because contribution spread across an estate is a governance question
 * (bus factor, dormant ownership) and a reporting one.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.Contribution#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Contribution#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Contribution#getFirstCommit <em>First Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.github.Contribution#getLastCommit <em>Last Commit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(AbstractAccount)
	 * @see org.nasdanika.models.github.GithubPackage#getContribution_Account()
	 * @model
	 * @generated
	 */
	AbstractAccount getAccount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Contribution#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(AbstractAccount value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' attribute.
	 * @see #setCommits(int)
	 * @see org.nasdanika.models.github.GithubPackage#getContribution_Commits()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getCommits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Contribution#getCommits <em>Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commits</em>' attribute.
	 * @see #getCommits()
	 * @generated
	 */
	void setCommits(int value);

	/**
	 * Returns the value of the '<em><b>First Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Commit</em>' attribute.
	 * @see #setFirstCommit(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getContribution_FirstCommit()
	 * @model unique="false"
	 * @generated
	 */
	Date getFirstCommit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Contribution#getFirstCommit <em>First Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Commit</em>' attribute.
	 * @see #getFirstCommit()
	 * @generated
	 */
	void setFirstCommit(Date value);

	/**
	 * Returns the value of the '<em><b>Last Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Commit</em>' attribute.
	 * @see #setLastCommit(Date)
	 * @see org.nasdanika.models.github.GithubPackage#getContribution_LastCommit()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastCommit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.Contribution#getLastCommit <em>Last Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Commit</em>' attribute.
	 * @see #getLastCommit()
	 * @generated
	 */
	void setLastCommit(Date value);

} // Contribution
