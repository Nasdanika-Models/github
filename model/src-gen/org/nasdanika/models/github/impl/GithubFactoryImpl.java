/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.github.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubFactoryImpl extends EFactoryImpl implements GithubFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GithubFactory init() {
		try {
			GithubFactory theGithubFactory = (GithubFactory)EPackage.Registry.INSTANCE.getEFactory(GithubPackage.eNS_URI);
			if (theGithubFactory != null) {
				return theGithubFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GithubFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GithubPackage.LOAD: return createLoad();
			case GithubPackage.GIT_HUB: return createGitHub();
			case GithubPackage.USER: return createUser();
			case GithubPackage.ORGANIZATION: return createOrganization();
			case GithubPackage.ACCOUNT_REFERENCE: return createAccountReference();
			case GithubPackage.MEMBERSHIP: return createMembership();
			case GithubPackage.TEAM: return createTeam();
			case GithubPackage.REPOSITORY: return createRepository();
			case GithubPackage.REPOSITORY_REFERENCE: return createRepositoryReference();
			case GithubPackage.LANGUAGE_USAGE: return createLanguageUsage();
			case GithubPackage.CONTRIBUTION: return createContribution();
			case GithubPackage.COLLABORATOR: return createCollaborator();
			case GithubPackage.TEAM_ACCESS: return createTeamAccess();
			case GithubPackage.CODE_OWNER_RULE: return createCodeOwnerRule();
			case GithubPackage.BRANCH: return createBranch();
			case GithubPackage.TAG: return createTag();
			case GithubPackage.BRANCH_PROTECTION: return createBranchProtection();
			case GithubPackage.RELEASE: return createRelease();
			case GithubPackage.RELEASE_ASSET: return createReleaseAsset();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GithubPackage.MEMBERSHIP_ROLE:
				return createMembershipRoleFromString(eDataType, initialValue);
			case GithubPackage.TEAM_PRIVACY:
				return createTeamPrivacyFromString(eDataType, initialValue);
			case GithubPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case GithubPackage.PERMISSION_LEVEL:
				return createPermissionLevelFromString(eDataType, initialValue);
			case GithubPackage.PERMISSION_SOURCE:
				return createPermissionSourceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GithubPackage.MEMBERSHIP_ROLE:
				return convertMembershipRoleToString(eDataType, instanceValue);
			case GithubPackage.TEAM_PRIVACY:
				return convertTeamPrivacyToString(eDataType, instanceValue);
			case GithubPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case GithubPackage.PERMISSION_LEVEL:
				return convertPermissionLevelToString(eDataType, instanceValue);
			case GithubPackage.PERMISSION_SOURCE:
				return convertPermissionSourceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitHub createGitHub() {
		GitHubImpl gitHub = new GitHubImpl();
		return gitHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountReference createAccountReference() {
		AccountReferenceImpl accountReference = new AccountReferenceImpl();
		return accountReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership createMembership() {
		MembershipImpl membership = new MembershipImpl();
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryReference createRepositoryReference() {
		RepositoryReferenceImpl repositoryReference = new RepositoryReferenceImpl();
		return repositoryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageUsage createLanguageUsage() {
		LanguageUsageImpl languageUsage = new LanguageUsageImpl();
		return languageUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaborator createCollaborator() {
		CollaboratorImpl collaborator = new CollaboratorImpl();
		return collaborator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamAccess createTeamAccess() {
		TeamAccessImpl teamAccess = new TeamAccessImpl();
		return teamAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeOwnerRule createCodeOwnerRule() {
		CodeOwnerRuleImpl codeOwnerRule = new CodeOwnerRuleImpl();
		return codeOwnerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchProtection createBranchProtection() {
		BranchProtectionImpl branchProtection = new BranchProtectionImpl();
		return branchProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseAsset createReleaseAsset() {
		ReleaseAssetImpl releaseAsset = new ReleaseAssetImpl();
		return releaseAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipRole createMembershipRoleFromString(EDataType eDataType, String initialValue) {
		MembershipRole result = MembershipRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembershipRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamPrivacy createTeamPrivacyFromString(EDataType eDataType, String initialValue) {
		TeamPrivacy result = TeamPrivacy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTeamPrivacyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel createPermissionLevelFromString(EDataType eDataType, String initialValue) {
		PermissionLevel result = PermissionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionSource createPermissionSourceFromString(EDataType eDataType, String initialValue) {
		PermissionSource result = PermissionSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubPackage getGithubPackage() {
		return (GithubPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GithubPackage getPackage() {
		return GithubPackage.eINSTANCE;
	}

} //GithubFactoryImpl
