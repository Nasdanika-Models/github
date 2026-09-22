/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Owner Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One line of a CODEOWNERS file, parsed.
 * 
 * A file rather than an API object, and in the model anyway, because
 * ownership is a concept the platform implements through a file and every
 * ownership question needs it. The GitLab model made the same call. Loaders
 * parse it from the default branch; the URI handler below is what fetches it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.CodeOwnerRule#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.github.CodeOwnerRule#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.models.github.CodeOwnerRule#getOwnerAccounts <em>Owner Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.github.CodeOwnerRule#getOwnerTeams <em>Owner Teams</em>}</li>
 *   <li>{@link org.nasdanika.models.github.CodeOwnerRule#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule()
 * @model
 * @generated
 */
public interface CodeOwnerRule extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Path pattern, gitignore syntax, e.g. /docs/ or *.java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule_Pattern()
	 * @model unique="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.CodeOwnerRule#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Owning accounts and teams as written, e.g. @Nasdanika/core-team, resolved when loaded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owners</em>' attribute list.
	 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule_Owners()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOwners();

	/**
	 * Returns the value of the '<em><b>Owner Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Accounts</em>' reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule_OwnerAccounts()
	 * @model
	 * @generated
	 */
	EList<AbstractAccount> getOwnerAccounts();

	/**
	 * Returns the value of the '<em><b>Owner Teams</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Teams</em>' reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule_OwnerTeams()
	 * @model
	 * @generated
	 */
	EList<Team> getOwnerTeams();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Line number in the source file, for round-tripping and for error reporting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.nasdanika.models.github.GithubPackage#getCodeOwnerRule_Line()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.CodeOwnerRule#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

} // CodeOwnerRule
