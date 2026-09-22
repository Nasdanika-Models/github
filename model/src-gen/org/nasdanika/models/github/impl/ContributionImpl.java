/**
 */
package org.nasdanika.models.github.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.Contribution;
import org.nasdanika.models.github.GithubPackage;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.ContributionImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ContributionImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ContributionImpl#getFirstCommit <em>First Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.ContributionImpl#getLastCommit <em>Last Commit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributionImpl extends ModelElementImpl implements Contribution {
	/**
	 * The default value of the '{@link #getCommits() <em>Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMITS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getFirstCommit() <em>First Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCommit()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_COMMIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastCommit() <em>Last Commit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCommit()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_COMMIT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.CONTRIBUTION__ACCOUNT, GithubPackage.Literals.CONTRIBUTION__ACCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.CONTRIBUTION__ACCOUNT, GithubPackage.Literals.CONTRIBUTION__ACCOUNT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(AbstractAccount newAccount) {
		eDynamicSet(GithubPackage.CONTRIBUTION__ACCOUNT, GithubPackage.Literals.CONTRIBUTION__ACCOUNT, newAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommits() {
		return (Integer)eDynamicGet(GithubPackage.CONTRIBUTION__COMMITS, GithubPackage.Literals.CONTRIBUTION__COMMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommits(int newCommits) {
		eDynamicSet(GithubPackage.CONTRIBUTION__COMMITS, GithubPackage.Literals.CONTRIBUTION__COMMITS, newCommits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFirstCommit() {
		return (Date)eDynamicGet(GithubPackage.CONTRIBUTION__FIRST_COMMIT, GithubPackage.Literals.CONTRIBUTION__FIRST_COMMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstCommit(Date newFirstCommit) {
		eDynamicSet(GithubPackage.CONTRIBUTION__FIRST_COMMIT, GithubPackage.Literals.CONTRIBUTION__FIRST_COMMIT, newFirstCommit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastCommit() {
		return (Date)eDynamicGet(GithubPackage.CONTRIBUTION__LAST_COMMIT, GithubPackage.Literals.CONTRIBUTION__LAST_COMMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCommit(Date newLastCommit) {
		eDynamicSet(GithubPackage.CONTRIBUTION__LAST_COMMIT, GithubPackage.Literals.CONTRIBUTION__LAST_COMMIT, newLastCommit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.CONTRIBUTION__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case GithubPackage.CONTRIBUTION__COMMITS:
				return getCommits();
			case GithubPackage.CONTRIBUTION__FIRST_COMMIT:
				return getFirstCommit();
			case GithubPackage.CONTRIBUTION__LAST_COMMIT:
				return getLastCommit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.CONTRIBUTION__ACCOUNT:
				setAccount((AbstractAccount)newValue);
				return;
			case GithubPackage.CONTRIBUTION__COMMITS:
				setCommits((Integer)newValue);
				return;
			case GithubPackage.CONTRIBUTION__FIRST_COMMIT:
				setFirstCommit((Date)newValue);
				return;
			case GithubPackage.CONTRIBUTION__LAST_COMMIT:
				setLastCommit((Date)newValue);
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
			case GithubPackage.CONTRIBUTION__ACCOUNT:
				setAccount((AbstractAccount)null);
				return;
			case GithubPackage.CONTRIBUTION__COMMITS:
				setCommits(COMMITS_EDEFAULT);
				return;
			case GithubPackage.CONTRIBUTION__FIRST_COMMIT:
				setFirstCommit(FIRST_COMMIT_EDEFAULT);
				return;
			case GithubPackage.CONTRIBUTION__LAST_COMMIT:
				setLastCommit(LAST_COMMIT_EDEFAULT);
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
			case GithubPackage.CONTRIBUTION__ACCOUNT:
				return basicGetAccount() != null;
			case GithubPackage.CONTRIBUTION__COMMITS:
				return getCommits() != COMMITS_EDEFAULT;
			case GithubPackage.CONTRIBUTION__FIRST_COMMIT:
				return FIRST_COMMIT_EDEFAULT == null ? getFirstCommit() != null : !FIRST_COMMIT_EDEFAULT.equals(getFirstCommit());
			case GithubPackage.CONTRIBUTION__LAST_COMMIT:
				return LAST_COMMIT_EDEFAULT == null ? getLastCommit() != null : !LAST_COMMIT_EDEFAULT.equals(getLastCommit());
		}
		return super.eIsSet(featureID);
	}

} //ContributionImpl
