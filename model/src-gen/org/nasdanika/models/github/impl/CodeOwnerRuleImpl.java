/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.CodeOwnerRule;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Team;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Owner Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl#getOwnerAccounts <em>Owner Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl#getOwnerTeams <em>Owner Teams</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeOwnerRuleImpl extends ModelElementImpl implements CodeOwnerRule {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeOwnerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.CODE_OWNER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return (String)eDynamicGet(GithubPackage.CODE_OWNER_RULE__PATTERN, GithubPackage.Literals.CODE_OWNER_RULE__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		eDynamicSet(GithubPackage.CODE_OWNER_RULE__PATTERN, GithubPackage.Literals.CODE_OWNER_RULE__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getOwners() {
		return (EList<String>)eDynamicGet(GithubPackage.CODE_OWNER_RULE__OWNERS, GithubPackage.Literals.CODE_OWNER_RULE__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getOwnerAccounts() {
		return (EList<AbstractAccount>)eDynamicGet(GithubPackage.CODE_OWNER_RULE__OWNER_ACCOUNTS, GithubPackage.Literals.CODE_OWNER_RULE__OWNER_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Team> getOwnerTeams() {
		return (EList<Team>)eDynamicGet(GithubPackage.CODE_OWNER_RULE__OWNER_TEAMS, GithubPackage.Literals.CODE_OWNER_RULE__OWNER_TEAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return (Integer)eDynamicGet(GithubPackage.CODE_OWNER_RULE__LINE, GithubPackage.Literals.CODE_OWNER_RULE__LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		eDynamicSet(GithubPackage.CODE_OWNER_RULE__LINE, GithubPackage.Literals.CODE_OWNER_RULE__LINE, newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.CODE_OWNER_RULE__PATTERN:
				return getPattern();
			case GithubPackage.CODE_OWNER_RULE__OWNERS:
				return getOwners();
			case GithubPackage.CODE_OWNER_RULE__OWNER_ACCOUNTS:
				return getOwnerAccounts();
			case GithubPackage.CODE_OWNER_RULE__OWNER_TEAMS:
				return getOwnerTeams();
			case GithubPackage.CODE_OWNER_RULE__LINE:
				return getLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.CODE_OWNER_RULE__PATTERN:
				setPattern((String)newValue);
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends String>)newValue);
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNER_ACCOUNTS:
				getOwnerAccounts().clear();
				getOwnerAccounts().addAll((Collection<? extends AbstractAccount>)newValue);
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNER_TEAMS:
				getOwnerTeams().clear();
				getOwnerTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case GithubPackage.CODE_OWNER_RULE__LINE:
				setLine((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubPackage.CODE_OWNER_RULE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNERS:
				getOwners().clear();
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNER_ACCOUNTS:
				getOwnerAccounts().clear();
				return;
			case GithubPackage.CODE_OWNER_RULE__OWNER_TEAMS:
				getOwnerTeams().clear();
				return;
			case GithubPackage.CODE_OWNER_RULE__LINE:
				setLine(LINE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubPackage.CODE_OWNER_RULE__PATTERN:
				return PATTERN_EDEFAULT == null ? getPattern() != null : !PATTERN_EDEFAULT.equals(getPattern());
			case GithubPackage.CODE_OWNER_RULE__OWNERS:
				return !getOwners().isEmpty();
			case GithubPackage.CODE_OWNER_RULE__OWNER_ACCOUNTS:
				return !getOwnerAccounts().isEmpty();
			case GithubPackage.CODE_OWNER_RULE__OWNER_TEAMS:
				return !getOwnerTeams().isEmpty();
			case GithubPackage.CODE_OWNER_RULE__LINE:
				return getLine() != LINE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CodeOwnerRuleImpl
