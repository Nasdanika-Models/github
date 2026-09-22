/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Protection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Branch protection: the rules that decide whether the history of a branch
 * can be trusted.
 * 
 * Worth modelling even though it is configuration, because it is the single
 * most useful governance dataset GitHub holds, and because "which of our
 * repositories require a review on the default branch" is a question that
 * currently takes a script per audit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#getRequiredApprovingReviews <em>Required Approving Reviews</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isRequireCodeOwnerReview <em>Require Code Owner Review</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isDismissStaleReviews <em>Dismiss Stale Reviews</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isRequireLinearHistory <em>Require Linear History</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isRequireSignedCommits <em>Require Signed Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isRequireConversationResolution <em>Require Conversation Resolution</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isEnforceAdmins <em>Enforce Admins</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isAllowForcePushes <em>Allow Force Pushes</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isAllowDeletions <em>Allow Deletions</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#getRequiredStatusChecks <em>Required Status Checks</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#isRequireUpToDateBranch <em>Require Up To Date Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#getPushAccounts <em>Push Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.github.BranchProtection#getPushTeams <em>Push Teams</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection()
 * @model
 * @generated
 */
public interface BranchProtection extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Required Approving Reviews</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Approving Reviews</em>' attribute.
	 * @see #setRequiredApprovingReviews(int)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequiredApprovingReviews()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getRequiredApprovingReviews();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#getRequiredApprovingReviews <em>Required Approving Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Approving Reviews</em>' attribute.
	 * @see #getRequiredApprovingReviews()
	 * @generated
	 */
	void setRequiredApprovingReviews(int value);

	/**
	 * Returns the value of the '<em><b>Require Code Owner Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Code Owner Review</em>' attribute.
	 * @see #setRequireCodeOwnerReview(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequireCodeOwnerReview()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequireCodeOwnerReview();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isRequireCodeOwnerReview <em>Require Code Owner Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Code Owner Review</em>' attribute.
	 * @see #isRequireCodeOwnerReview()
	 * @generated
	 */
	void setRequireCodeOwnerReview(boolean value);

	/**
	 * Returns the value of the '<em><b>Dismiss Stale Reviews</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dismiss Stale Reviews</em>' attribute.
	 * @see #setDismissStaleReviews(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_DismissStaleReviews()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDismissStaleReviews();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isDismissStaleReviews <em>Dismiss Stale Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dismiss Stale Reviews</em>' attribute.
	 * @see #isDismissStaleReviews()
	 * @generated
	 */
	void setDismissStaleReviews(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Linear History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Linear History</em>' attribute.
	 * @see #setRequireLinearHistory(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequireLinearHistory()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequireLinearHistory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isRequireLinearHistory <em>Require Linear History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Linear History</em>' attribute.
	 * @see #isRequireLinearHistory()
	 * @generated
	 */
	void setRequireLinearHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Signed Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Signed Commits</em>' attribute.
	 * @see #setRequireSignedCommits(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequireSignedCommits()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequireSignedCommits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isRequireSignedCommits <em>Require Signed Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Signed Commits</em>' attribute.
	 * @see #isRequireSignedCommits()
	 * @generated
	 */
	void setRequireSignedCommits(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Conversation Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Conversation Resolution</em>' attribute.
	 * @see #setRequireConversationResolution(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequireConversationResolution()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequireConversationResolution();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isRequireConversationResolution <em>Require Conversation Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Conversation Resolution</em>' attribute.
	 * @see #isRequireConversationResolution()
	 * @generated
	 */
	void setRequireConversationResolution(boolean value);

	/**
	 * Returns the value of the '<em><b>Enforce Admins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enforce Admins</em>' attribute.
	 * @see #setEnforceAdmins(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_EnforceAdmins()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnforceAdmins();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isEnforceAdmins <em>Enforce Admins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforce Admins</em>' attribute.
	 * @see #isEnforceAdmins()
	 * @generated
	 */
	void setEnforceAdmins(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Force Pushes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Force Pushes</em>' attribute.
	 * @see #setAllowForcePushes(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_AllowForcePushes()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowForcePushes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isAllowForcePushes <em>Allow Force Pushes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Force Pushes</em>' attribute.
	 * @see #isAllowForcePushes()
	 * @generated
	 */
	void setAllowForcePushes(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Deletions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Deletions</em>' attribute.
	 * @see #setAllowDeletions(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_AllowDeletions()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowDeletions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isAllowDeletions <em>Allow Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Deletions</em>' attribute.
	 * @see #isAllowDeletions()
	 * @generated
	 */
	void setAllowDeletions(boolean value);

	/**
	 * Returns the value of the '<em><b>Required Status Checks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Names of status checks that must pass. Checks themselves belong to the Actions model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Status Checks</em>' attribute list.
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequiredStatusChecks()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRequiredStatusChecks();

	/**
	 * Returns the value of the '<em><b>Require Up To Date Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Up To Date Branch</em>' attribute.
	 * @see #setRequireUpToDateBranch(boolean)
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_RequireUpToDateBranch()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequireUpToDateBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.github.BranchProtection#isRequireUpToDateBranch <em>Require Up To Date Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Up To Date Branch</em>' attribute.
	 * @see #isRequireUpToDateBranch()
	 * @generated
	 */
	void setRequireUpToDateBranch(boolean value);

	/**
	 * Returns the value of the '<em><b>Push Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Accounts and teams allowed to push, when pushes are restricted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Accounts</em>' reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_PushAccounts()
	 * @model
	 * @generated
	 */
	EList<AbstractAccount> getPushAccounts();

	/**
	 * Returns the value of the '<em><b>Push Teams</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.github.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push Teams</em>' reference list.
	 * @see org.nasdanika.models.github.GithubPackage#getBranchProtection_PushTeams()
	 * @model
	 * @generated
	 */
	EList<Team> getPushTeams();

} // BranchProtection
