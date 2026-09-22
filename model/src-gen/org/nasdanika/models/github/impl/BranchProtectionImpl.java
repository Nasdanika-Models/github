/**
 */
package org.nasdanika.models.github.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.BranchProtection;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Team;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Protection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#getRequiredApprovingReviews <em>Required Approving Reviews</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isRequireCodeOwnerReview <em>Require Code Owner Review</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isDismissStaleReviews <em>Dismiss Stale Reviews</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isRequireLinearHistory <em>Require Linear History</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isRequireSignedCommits <em>Require Signed Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isRequireConversationResolution <em>Require Conversation Resolution</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isEnforceAdmins <em>Enforce Admins</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isAllowForcePushes <em>Allow Force Pushes</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isAllowDeletions <em>Allow Deletions</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#getRequiredStatusChecks <em>Required Status Checks</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#isRequireUpToDateBranch <em>Require Up To Date Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#getPushAccounts <em>Push Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.BranchProtectionImpl#getPushTeams <em>Push Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchProtectionImpl extends ModelElementImpl implements BranchProtection {
	/**
	 * The default value of the '{@link #getRequiredApprovingReviews() <em>Required Approving Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredApprovingReviews()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_APPROVING_REVIEWS_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #isRequireCodeOwnerReview() <em>Require Code Owner Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCodeOwnerReview()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CODE_OWNER_REVIEW_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDismissStaleReviews() <em>Dismiss Stale Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDismissStaleReviews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISMISS_STALE_REVIEWS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequireLinearHistory() <em>Require Linear History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireLinearHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_LINEAR_HISTORY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequireSignedCommits() <em>Require Signed Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireSignedCommits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_SIGNED_COMMITS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequireConversationResolution() <em>Require Conversation Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireConversationResolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CONVERSATION_RESOLUTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEnforceAdmins() <em>Enforce Admins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnforceAdmins()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENFORCE_ADMINS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAllowForcePushes() <em>Allow Force Pushes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowForcePushes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FORCE_PUSHES_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAllowDeletions() <em>Allow Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDeletions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DELETIONS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequireUpToDateBranch() <em>Require Up To Date Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireUpToDateBranch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_UP_TO_DATE_BRANCH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchProtectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.BRANCH_PROTECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredApprovingReviews() {
		return (Integer)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredApprovingReviews(int newRequiredApprovingReviews) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS, newRequiredApprovingReviews);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireCodeOwnerReview() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireCodeOwnerReview(boolean newRequireCodeOwnerReview) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW, newRequireCodeOwnerReview);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDismissStaleReviews() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS, GithubPackage.Literals.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDismissStaleReviews(boolean newDismissStaleReviews) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS, GithubPackage.Literals.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS, newDismissStaleReviews);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireLinearHistory() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireLinearHistory(boolean newRequireLinearHistory) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY, newRequireLinearHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireSignedCommits() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireSignedCommits(boolean newRequireSignedCommits) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS, newRequireSignedCommits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireConversationResolution() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireConversationResolution(boolean newRequireConversationResolution) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION, newRequireConversationResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnforceAdmins() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS, GithubPackage.Literals.BRANCH_PROTECTION__ENFORCE_ADMINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnforceAdmins(boolean newEnforceAdmins) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS, GithubPackage.Literals.BRANCH_PROTECTION__ENFORCE_ADMINS, newEnforceAdmins);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowForcePushes() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES, GithubPackage.Literals.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowForcePushes(boolean newAllowForcePushes) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES, GithubPackage.Literals.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES, newAllowForcePushes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowDeletions() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS, GithubPackage.Literals.BRANCH_PROTECTION__ALLOW_DELETIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDeletions(boolean newAllowDeletions) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS, GithubPackage.Literals.BRANCH_PROTECTION__ALLOW_DELETIONS, newAllowDeletions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getRequiredStatusChecks() {
		return (EList<String>)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireUpToDateBranch() {
		return (Boolean)eDynamicGet(GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireUpToDateBranch(boolean newRequireUpToDateBranch) {
		eDynamicSet(GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH, GithubPackage.Literals.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH, newRequireUpToDateBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractAccount> getPushAccounts() {
		return (EList<AbstractAccount>)eDynamicGet(GithubPackage.BRANCH_PROTECTION__PUSH_ACCOUNTS, GithubPackage.Literals.BRANCH_PROTECTION__PUSH_ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Team> getPushTeams() {
		return (EList<Team>)eDynamicGet(GithubPackage.BRANCH_PROTECTION__PUSH_TEAMS, GithubPackage.Literals.BRANCH_PROTECTION__PUSH_TEAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS:
				return getRequiredApprovingReviews();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW:
				return isRequireCodeOwnerReview();
			case GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS:
				return isDismissStaleReviews();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY:
				return isRequireLinearHistory();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS:
				return isRequireSignedCommits();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION:
				return isRequireConversationResolution();
			case GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS:
				return isEnforceAdmins();
			case GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES:
				return isAllowForcePushes();
			case GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS:
				return isAllowDeletions();
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS:
				return getRequiredStatusChecks();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH:
				return isRequireUpToDateBranch();
			case GithubPackage.BRANCH_PROTECTION__PUSH_ACCOUNTS:
				return getPushAccounts();
			case GithubPackage.BRANCH_PROTECTION__PUSH_TEAMS:
				return getPushTeams();
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
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS:
				setRequiredApprovingReviews((Integer)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW:
				setRequireCodeOwnerReview((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS:
				setDismissStaleReviews((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY:
				setRequireLinearHistory((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS:
				setRequireSignedCommits((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION:
				setRequireConversationResolution((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS:
				setEnforceAdmins((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES:
				setAllowForcePushes((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS:
				setAllowDeletions((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS:
				getRequiredStatusChecks().clear();
				getRequiredStatusChecks().addAll((Collection<? extends String>)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH:
				setRequireUpToDateBranch((Boolean)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__PUSH_ACCOUNTS:
				getPushAccounts().clear();
				getPushAccounts().addAll((Collection<? extends AbstractAccount>)newValue);
				return;
			case GithubPackage.BRANCH_PROTECTION__PUSH_TEAMS:
				getPushTeams().clear();
				getPushTeams().addAll((Collection<? extends Team>)newValue);
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
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS:
				setRequiredApprovingReviews(REQUIRED_APPROVING_REVIEWS_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW:
				setRequireCodeOwnerReview(REQUIRE_CODE_OWNER_REVIEW_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS:
				setDismissStaleReviews(DISMISS_STALE_REVIEWS_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY:
				setRequireLinearHistory(REQUIRE_LINEAR_HISTORY_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS:
				setRequireSignedCommits(REQUIRE_SIGNED_COMMITS_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION:
				setRequireConversationResolution(REQUIRE_CONVERSATION_RESOLUTION_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS:
				setEnforceAdmins(ENFORCE_ADMINS_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES:
				setAllowForcePushes(ALLOW_FORCE_PUSHES_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS:
				setAllowDeletions(ALLOW_DELETIONS_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS:
				getRequiredStatusChecks().clear();
				return;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH:
				setRequireUpToDateBranch(REQUIRE_UP_TO_DATE_BRANCH_EDEFAULT);
				return;
			case GithubPackage.BRANCH_PROTECTION__PUSH_ACCOUNTS:
				getPushAccounts().clear();
				return;
			case GithubPackage.BRANCH_PROTECTION__PUSH_TEAMS:
				getPushTeams().clear();
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
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS:
				return getRequiredApprovingReviews() != REQUIRED_APPROVING_REVIEWS_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW:
				return isRequireCodeOwnerReview() != REQUIRE_CODE_OWNER_REVIEW_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__DISMISS_STALE_REVIEWS:
				return isDismissStaleReviews() != DISMISS_STALE_REVIEWS_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY:
				return isRequireLinearHistory() != REQUIRE_LINEAR_HISTORY_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS:
				return isRequireSignedCommits() != REQUIRE_SIGNED_COMMITS_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION:
				return isRequireConversationResolution() != REQUIRE_CONVERSATION_RESOLUTION_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__ENFORCE_ADMINS:
				return isEnforceAdmins() != ENFORCE_ADMINS_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_FORCE_PUSHES:
				return isAllowForcePushes() != ALLOW_FORCE_PUSHES_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__ALLOW_DELETIONS:
				return isAllowDeletions() != ALLOW_DELETIONS_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS:
				return !getRequiredStatusChecks().isEmpty();
			case GithubPackage.BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH:
				return isRequireUpToDateBranch() != REQUIRE_UP_TO_DATE_BRANCH_EDEFAULT;
			case GithubPackage.BRANCH_PROTECTION__PUSH_ACCOUNTS:
				return !getPushAccounts().isEmpty();
			case GithubPackage.BRANCH_PROTECTION__PUSH_TEAMS:
				return !getPushTeams().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchProtectionImpl
