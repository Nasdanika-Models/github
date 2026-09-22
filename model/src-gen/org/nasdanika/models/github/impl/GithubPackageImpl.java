/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.AbstractRepository;
import org.nasdanika.models.github.Account;
import org.nasdanika.models.github.AccountReference;
import org.nasdanika.models.github.Branch;
import org.nasdanika.models.github.BranchProtection;
import org.nasdanika.models.github.CodeOwnerRule;
import org.nasdanika.models.github.Collaborator;
import org.nasdanika.models.github.Contribution;
import org.nasdanika.models.github.GitHub;
import org.nasdanika.models.github.GithubFactory;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.LanguageUsage;
import org.nasdanika.models.github.Load;
import org.nasdanika.models.github.Loadable;
import org.nasdanika.models.github.Membership;
import org.nasdanika.models.github.MembershipRole;
import org.nasdanika.models.github.Organization;
import org.nasdanika.models.github.PermissionLevel;
import org.nasdanika.models.github.PermissionSource;
import org.nasdanika.models.github.Ref;
import org.nasdanika.models.github.Release;
import org.nasdanika.models.github.ReleaseAsset;
import org.nasdanika.models.github.Repository;
import org.nasdanika.models.github.RepositoryReference;
import org.nasdanika.models.github.Tag;
import org.nasdanika.models.github.Team;
import org.nasdanika.models.github.TeamAccess;
import org.nasdanika.models.github.TeamPrivacy;
import org.nasdanika.models.github.User;
import org.nasdanika.models.github.Visibility;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubPackageImpl extends EPackageImpl implements GithubPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitHubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaboratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeOwnerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchProtectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum membershipRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum teamPrivacyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionSourceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.github.GithubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GithubPackageImpl() {
		super(eNS_URI, GithubFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GithubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GithubPackage init() {
		if (isInited) return (GithubPackage)EPackage.Registry.INSTANCE.getEPackage(GithubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGithubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GithubPackageImpl theGithubPackage = registeredGithubPackage instanceof GithubPackageImpl ? (GithubPackageImpl)registeredGithubPackage : new GithubPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGithubPackage.createPackageContents();

		// Initialize created meta-data
		theGithubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGithubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GithubPackage.eNS_URI, theGithubPackage);
		return theGithubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadable() {
		return loadableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadable_Loads() {
		return (EReference)loadableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Source() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Reference() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Start() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_End() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Size() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Error() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Etag() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Complete() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitHub() {
		return gitHubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHub_Url() {
		return (EAttribute)gitHubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHub_ApiUrl() {
		return (EAttribute)gitHubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitHub_EnterpriseServer() {
		return (EAttribute)gitHubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGitHub_Accounts() {
		return (EReference)gitHubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAccount() {
		return abstractAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAccount_Login() {
		return (EAttribute)abstractAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_NodeId() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_DatabaseId() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_HtmlUrl() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_AvatarUrl() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Email() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_CreatedAt() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_UpdatedAt() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Repositories() {
		return (EReference)accountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Company() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Location() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Bio() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Blog() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_SiteAdmin() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Bot() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Inactive() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_BillingEmail() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_DefaultRepositoryPermission() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Teams() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Members() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountReference() {
		return accountReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountReference_Target() {
		return (EReference)accountReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembership() {
		return membershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_Account() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_Role() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_Publicized() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_Pending() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Slug() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_NodeId() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_DatabaseId() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_HtmlUrl() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Privacy() {
		return (EAttribute)teamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Parent() {
		return (EReference)teamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Children() {
		return (EReference)teamEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Members() {
		return (EReference)teamEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Access() {
		return (EReference)teamEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRepository() {
		return abstractRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRepository_FullName() {
		return (EAttribute)abstractRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_NodeId() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_DatabaseId() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Description() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Homepage() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_HtmlUrl() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_CloneUrl() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_SshUrl() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Visibility() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Archived() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Disabled() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Template() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Fork() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Parent() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Source() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_DefaultBranchName() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_DefaultBranch() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_License() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Topics() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_PrimaryLanguage() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_CreatedAt() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_UpdatedAt() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_PushedAt() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Size() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Stargazers() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Watchers() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Forks() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_OpenIssues() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Languages() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Branches() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Tags() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Releases() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Collaborators() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Contributions() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_CodeOwners() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryReference() {
		return repositoryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryReference_Target() {
		return (EReference)repositoryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageUsage() {
		return languageUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageUsage_Language() {
		return (EAttribute)languageUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageUsage_Bytes() {
		return (EAttribute)languageUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_Account() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Commits() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_FirstCommit() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_LastCommit() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborator() {
		return collaboratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborator_Account() {
		return (EReference)collaboratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborator_Permission() {
		return (EAttribute)collaboratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborator_Source() {
		return (EAttribute)collaboratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborator_Outside() {
		return (EAttribute)collaboratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborator_Team() {
		return (EReference)collaboratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamAccess() {
		return teamAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamAccess_Repository() {
		return (EReference)teamAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamAccess_Permission() {
		return (EAttribute)teamAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeOwnerRule() {
		return codeOwnerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeOwnerRule_Pattern() {
		return (EAttribute)codeOwnerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeOwnerRule_Owners() {
		return (EAttribute)codeOwnerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeOwnerRule_OwnerAccounts() {
		return (EReference)codeOwnerRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeOwnerRule_OwnerTeams() {
		return (EReference)codeOwnerRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeOwnerRule_Line() {
		return (EAttribute)codeOwnerRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRef() {
		return refEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRef_RefName() {
		return (EAttribute)refEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRef_CommitSha() {
		return (EAttribute)refEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Default() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Protected() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Protection() {
		return (EReference)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Ahead() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Behind() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Annotated() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Message() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Tagger() {
		return (EReference)tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Date() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Release() {
		return (EReference)tagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchProtection() {
		return branchProtectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequiredApprovingReviews() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequireCodeOwnerReview() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_DismissStaleReviews() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequireLinearHistory() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequireSignedCommits() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequireConversationResolution() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_EnforceAdmins() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_AllowForcePushes() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_AllowDeletions() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequiredStatusChecks() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranchProtection_RequireUpToDateBranch() {
		return (EAttribute)branchProtectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchProtection_PushAccounts() {
		return (EReference)branchProtectionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchProtection_PushTeams() {
		return (EReference)branchProtectionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_NodeId() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_DatabaseId() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_TagName() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelease_Tag() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_TargetCommitish() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_Draft() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_PreRelease() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_HtmlUrl() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_CreatedAt() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_PublishedAt() {
		return (EAttribute)releaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelease_Author() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelease_Assets() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseAsset() {
		return releaseAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_Label() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_ContentType() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_Size() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_Downloads() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_DownloadUrl() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_CreatedAt() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseAsset_UpdatedAt() {
		return (EAttribute)releaseAssetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseAsset_Uploader() {
		return (EReference)releaseAssetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMembershipRole() {
		return membershipRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTeamPrivacy() {
		return teamPrivacyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissionLevel() {
		return permissionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermissionSource() {
		return permissionSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubFactory getGithubFactory() {
		return (GithubFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		loadableEClass = createEClass(LOADABLE);
		createEReference(loadableEClass, LOADABLE__LOADS);

		loadEClass = createEClass(LOAD);
		createEAttribute(loadEClass, LOAD__SOURCE);
		createEAttribute(loadEClass, LOAD__REFERENCE);
		createEAttribute(loadEClass, LOAD__START);
		createEAttribute(loadEClass, LOAD__END);
		createEAttribute(loadEClass, LOAD__SIZE);
		createEAttribute(loadEClass, LOAD__ERROR);
		createEAttribute(loadEClass, LOAD__ETAG);
		createEAttribute(loadEClass, LOAD__COMPLETE);

		gitHubEClass = createEClass(GIT_HUB);
		createEAttribute(gitHubEClass, GIT_HUB__URL);
		createEAttribute(gitHubEClass, GIT_HUB__API_URL);
		createEAttribute(gitHubEClass, GIT_HUB__ENTERPRISE_SERVER);
		createEReference(gitHubEClass, GIT_HUB__ACCOUNTS);

		abstractAccountEClass = createEClass(ABSTRACT_ACCOUNT);
		createEAttribute(abstractAccountEClass, ABSTRACT_ACCOUNT__LOGIN);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__NODE_ID);
		createEAttribute(accountEClass, ACCOUNT__DATABASE_ID);
		createEAttribute(accountEClass, ACCOUNT__HTML_URL);
		createEAttribute(accountEClass, ACCOUNT__AVATAR_URL);
		createEAttribute(accountEClass, ACCOUNT__EMAIL);
		createEAttribute(accountEClass, ACCOUNT__CREATED_AT);
		createEAttribute(accountEClass, ACCOUNT__UPDATED_AT);
		createEReference(accountEClass, ACCOUNT__REPOSITORIES);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__COMPANY);
		createEAttribute(userEClass, USER__LOCATION);
		createEAttribute(userEClass, USER__BIO);
		createEAttribute(userEClass, USER__BLOG);
		createEAttribute(userEClass, USER__SITE_ADMIN);
		createEAttribute(userEClass, USER__BOT);
		createEAttribute(userEClass, USER__INACTIVE);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__BILLING_EMAIL);
		createEAttribute(organizationEClass, ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION);
		createEReference(organizationEClass, ORGANIZATION__TEAMS);
		createEReference(organizationEClass, ORGANIZATION__MEMBERS);

		accountReferenceEClass = createEClass(ACCOUNT_REFERENCE);
		createEReference(accountReferenceEClass, ACCOUNT_REFERENCE__TARGET);

		membershipEClass = createEClass(MEMBERSHIP);
		createEReference(membershipEClass, MEMBERSHIP__ACCOUNT);
		createEAttribute(membershipEClass, MEMBERSHIP__ROLE);
		createEAttribute(membershipEClass, MEMBERSHIP__PUBLICIZED);
		createEAttribute(membershipEClass, MEMBERSHIP__PENDING);

		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__SLUG);
		createEAttribute(teamEClass, TEAM__NODE_ID);
		createEAttribute(teamEClass, TEAM__DATABASE_ID);
		createEAttribute(teamEClass, TEAM__HTML_URL);
		createEAttribute(teamEClass, TEAM__PRIVACY);
		createEReference(teamEClass, TEAM__PARENT);
		createEReference(teamEClass, TEAM__CHILDREN);
		createEReference(teamEClass, TEAM__MEMBERS);
		createEReference(teamEClass, TEAM__ACCESS);

		abstractRepositoryEClass = createEClass(ABSTRACT_REPOSITORY);
		createEAttribute(abstractRepositoryEClass, ABSTRACT_REPOSITORY__FULL_NAME);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__NODE_ID);
		createEAttribute(repositoryEClass, REPOSITORY__DATABASE_ID);
		createEAttribute(repositoryEClass, REPOSITORY__DESCRIPTION);
		createEAttribute(repositoryEClass, REPOSITORY__HOMEPAGE);
		createEAttribute(repositoryEClass, REPOSITORY__HTML_URL);
		createEAttribute(repositoryEClass, REPOSITORY__CLONE_URL);
		createEAttribute(repositoryEClass, REPOSITORY__SSH_URL);
		createEAttribute(repositoryEClass, REPOSITORY__VISIBILITY);
		createEAttribute(repositoryEClass, REPOSITORY__ARCHIVED);
		createEAttribute(repositoryEClass, REPOSITORY__DISABLED);
		createEAttribute(repositoryEClass, REPOSITORY__TEMPLATE);
		createEAttribute(repositoryEClass, REPOSITORY__FORK);
		createEReference(repositoryEClass, REPOSITORY__PARENT);
		createEReference(repositoryEClass, REPOSITORY__SOURCE);
		createEAttribute(repositoryEClass, REPOSITORY__DEFAULT_BRANCH_NAME);
		createEReference(repositoryEClass, REPOSITORY__DEFAULT_BRANCH);
		createEAttribute(repositoryEClass, REPOSITORY__LICENSE);
		createEAttribute(repositoryEClass, REPOSITORY__TOPICS);
		createEAttribute(repositoryEClass, REPOSITORY__PRIMARY_LANGUAGE);
		createEAttribute(repositoryEClass, REPOSITORY__CREATED_AT);
		createEAttribute(repositoryEClass, REPOSITORY__UPDATED_AT);
		createEAttribute(repositoryEClass, REPOSITORY__PUSHED_AT);
		createEAttribute(repositoryEClass, REPOSITORY__SIZE);
		createEAttribute(repositoryEClass, REPOSITORY__STARGAZERS);
		createEAttribute(repositoryEClass, REPOSITORY__WATCHERS);
		createEAttribute(repositoryEClass, REPOSITORY__FORKS);
		createEAttribute(repositoryEClass, REPOSITORY__OPEN_ISSUES);
		createEReference(repositoryEClass, REPOSITORY__LANGUAGES);
		createEReference(repositoryEClass, REPOSITORY__BRANCHES);
		createEReference(repositoryEClass, REPOSITORY__TAGS);
		createEReference(repositoryEClass, REPOSITORY__RELEASES);
		createEReference(repositoryEClass, REPOSITORY__COLLABORATORS);
		createEReference(repositoryEClass, REPOSITORY__CONTRIBUTIONS);
		createEReference(repositoryEClass, REPOSITORY__CODE_OWNERS);

		repositoryReferenceEClass = createEClass(REPOSITORY_REFERENCE);
		createEReference(repositoryReferenceEClass, REPOSITORY_REFERENCE__TARGET);

		languageUsageEClass = createEClass(LANGUAGE_USAGE);
		createEAttribute(languageUsageEClass, LANGUAGE_USAGE__LANGUAGE);
		createEAttribute(languageUsageEClass, LANGUAGE_USAGE__BYTES);

		contributionEClass = createEClass(CONTRIBUTION);
		createEReference(contributionEClass, CONTRIBUTION__ACCOUNT);
		createEAttribute(contributionEClass, CONTRIBUTION__COMMITS);
		createEAttribute(contributionEClass, CONTRIBUTION__FIRST_COMMIT);
		createEAttribute(contributionEClass, CONTRIBUTION__LAST_COMMIT);

		collaboratorEClass = createEClass(COLLABORATOR);
		createEReference(collaboratorEClass, COLLABORATOR__ACCOUNT);
		createEAttribute(collaboratorEClass, COLLABORATOR__PERMISSION);
		createEAttribute(collaboratorEClass, COLLABORATOR__SOURCE);
		createEAttribute(collaboratorEClass, COLLABORATOR__OUTSIDE);
		createEReference(collaboratorEClass, COLLABORATOR__TEAM);

		teamAccessEClass = createEClass(TEAM_ACCESS);
		createEReference(teamAccessEClass, TEAM_ACCESS__REPOSITORY);
		createEAttribute(teamAccessEClass, TEAM_ACCESS__PERMISSION);

		codeOwnerRuleEClass = createEClass(CODE_OWNER_RULE);
		createEAttribute(codeOwnerRuleEClass, CODE_OWNER_RULE__PATTERN);
		createEAttribute(codeOwnerRuleEClass, CODE_OWNER_RULE__OWNERS);
		createEReference(codeOwnerRuleEClass, CODE_OWNER_RULE__OWNER_ACCOUNTS);
		createEReference(codeOwnerRuleEClass, CODE_OWNER_RULE__OWNER_TEAMS);
		createEAttribute(codeOwnerRuleEClass, CODE_OWNER_RULE__LINE);

		refEClass = createEClass(REF);
		createEAttribute(refEClass, REF__REF_NAME);
		createEAttribute(refEClass, REF__COMMIT_SHA);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__DEFAULT);
		createEAttribute(branchEClass, BRANCH__PROTECTED);
		createEReference(branchEClass, BRANCH__PROTECTION);
		createEAttribute(branchEClass, BRANCH__AHEAD);
		createEAttribute(branchEClass, BRANCH__BEHIND);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__ANNOTATED);
		createEAttribute(tagEClass, TAG__MESSAGE);
		createEReference(tagEClass, TAG__TAGGER);
		createEAttribute(tagEClass, TAG__DATE);
		createEReference(tagEClass, TAG__RELEASE);

		branchProtectionEClass = createEClass(BRANCH_PROTECTION);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__DISMISS_STALE_REVIEWS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__ENFORCE_ADMINS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__ALLOW_FORCE_PUSHES);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__ALLOW_DELETIONS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS);
		createEAttribute(branchProtectionEClass, BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH);
		createEReference(branchProtectionEClass, BRANCH_PROTECTION__PUSH_ACCOUNTS);
		createEReference(branchProtectionEClass, BRANCH_PROTECTION__PUSH_TEAMS);

		releaseEClass = createEClass(RELEASE);
		createEAttribute(releaseEClass, RELEASE__NODE_ID);
		createEAttribute(releaseEClass, RELEASE__DATABASE_ID);
		createEAttribute(releaseEClass, RELEASE__TAG_NAME);
		createEReference(releaseEClass, RELEASE__TAG);
		createEAttribute(releaseEClass, RELEASE__TARGET_COMMITISH);
		createEAttribute(releaseEClass, RELEASE__DRAFT);
		createEAttribute(releaseEClass, RELEASE__PRE_RELEASE);
		createEAttribute(releaseEClass, RELEASE__HTML_URL);
		createEAttribute(releaseEClass, RELEASE__CREATED_AT);
		createEAttribute(releaseEClass, RELEASE__PUBLISHED_AT);
		createEReference(releaseEClass, RELEASE__AUTHOR);
		createEReference(releaseEClass, RELEASE__ASSETS);

		releaseAssetEClass = createEClass(RELEASE_ASSET);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__LABEL);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__CONTENT_TYPE);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__SIZE);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__DOWNLOADS);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__DOWNLOAD_URL);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__CREATED_AT);
		createEAttribute(releaseAssetEClass, RELEASE_ASSET__UPDATED_AT);
		createEReference(releaseAssetEClass, RELEASE_ASSET__UPLOADER);

		// Create enums
		membershipRoleEEnum = createEEnum(MEMBERSHIP_ROLE);
		teamPrivacyEEnum = createEEnum(TEAM_PRIVACY);
		visibilityEEnum = createEEnum(VISIBILITY);
		permissionLevelEEnum = createEEnum(PERMISSION_LEVEL);
		permissionSourceEEnum = createEEnum(PERMISSION_SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loadEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		gitHubEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		gitHubEClass.getESuperTypes().add(this.getLoadable());
		abstractAccountEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		accountEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		accountEClass.getESuperTypes().add(this.getAbstractAccount());
		accountEClass.getESuperTypes().add(this.getLoadable());
		userEClass.getESuperTypes().add(this.getAccount());
		organizationEClass.getESuperTypes().add(this.getAccount());
		accountReferenceEClass.getESuperTypes().add(this.getAbstractAccount());
		membershipEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		teamEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		teamEClass.getESuperTypes().add(this.getLoadable());
		abstractRepositoryEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		repositoryEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		repositoryEClass.getESuperTypes().add(this.getAbstractRepository());
		repositoryEClass.getESuperTypes().add(this.getLoadable());
		repositoryReferenceEClass.getESuperTypes().add(this.getAbstractRepository());
		languageUsageEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		contributionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		collaboratorEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		teamAccessEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		codeOwnerRuleEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		refEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		branchEClass.getESuperTypes().add(this.getRef());
		tagEClass.getESuperTypes().add(this.getRef());
		branchProtectionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		releaseEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		releaseEClass.getESuperTypes().add(this.getLoadable());
		releaseAssetEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(loadableEClass, Loadable.class, "Loadable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadable_Loads(), this.getLoad(), null, "loads", null, 0, -1, Loadable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoad_Source(), theEcorePackage.getEString(), "source", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Start(), theEcorePackage.getEDate(), "start", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_End(), theEcorePackage.getEDate(), "end", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Size(), theEcorePackage.getEInt(), "size", "-1", 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Error(), theEcorePackage.getEString(), "error", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Etag(), theEcorePackage.getEString(), "etag", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Complete(), theEcorePackage.getEBoolean(), "complete", "true", 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitHubEClass, GitHub.class, "GitHub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitHub_Url(), theEcorePackage.getEString(), "url", null, 0, 1, GitHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHub_ApiUrl(), theEcorePackage.getEString(), "apiUrl", null, 0, 1, GitHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitHub_EnterpriseServer(), theEcorePackage.getEBoolean(), "enterpriseServer", null, 0, 1, GitHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGitHub_Accounts(), this.getAbstractAccount(), null, "accounts", null, 0, -1, GitHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGitHub_Accounts().getEKeys().add(this.getAbstractAccount_Login());

		initEClass(abstractAccountEClass, AbstractAccount.class, "AbstractAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractAccount_Login(), theEcorePackage.getEString(), "login", null, 0, 1, AbstractAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_NodeId(), theEcorePackage.getEString(), "nodeId", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_DatabaseId(), theEcorePackage.getELong(), "databaseId", "-1", 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_HtmlUrl(), theEcorePackage.getEString(), "htmlUrl", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_AvatarUrl(), theEcorePackage.getEString(), "avatarUrl", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Email(), theEcorePackage.getEString(), "email", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_CreatedAt(), theEcorePackage.getEDate(), "createdAt", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_UpdatedAt(), theEcorePackage.getEDate(), "updatedAt", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_Repositories(), this.getAbstractRepository(), null, "repositories", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAccount_Repositories().getEKeys().add(this.getAbstractRepository_FullName());

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Company(), theEcorePackage.getEString(), "company", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Location(), theEcorePackage.getEString(), "location", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Bio(), theEcorePackage.getEString(), "bio", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Blog(), theEcorePackage.getEString(), "blog", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_SiteAdmin(), theEcorePackage.getEBoolean(), "siteAdmin", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Bot(), theEcorePackage.getEBoolean(), "bot", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Inactive(), theEcorePackage.getEBoolean(), "inactive", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganization_BillingEmail(), theEcorePackage.getEString(), "billingEmail", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_DefaultRepositoryPermission(), this.getPermissionLevel(), "defaultRepositoryPermission", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Teams(), this.getTeam(), null, "teams", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrganization_Teams().getEKeys().add(this.getTeam_Slug());
		initEReference(getOrganization_Members(), this.getMembership(), null, "members", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountReferenceEClass, AccountReference.class, "AccountReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountReference_Target(), this.getAccount(), null, "target", null, 0, 1, AccountReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMembership_Account(), this.getAbstractAccount(), null, "account", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_Role(), this.getMembershipRole(), "role", "MEMBER", 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_Publicized(), theEcorePackage.getEBoolean(), "publicized", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_Pending(), theEcorePackage.getEBoolean(), "pending", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Slug(), theEcorePackage.getEString(), "slug", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_NodeId(), theEcorePackage.getEString(), "nodeId", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_DatabaseId(), theEcorePackage.getELong(), "databaseId", "-1", 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_HtmlUrl(), theEcorePackage.getEString(), "htmlUrl", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_Privacy(), this.getTeamPrivacy(), "privacy", "VISIBLE", 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Parent(), this.getTeam(), null, "parent", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Children(), this.getTeam(), null, "children", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTeam_Children().getEKeys().add(this.getTeam_Slug());
		initEReference(getTeam_Members(), this.getMembership(), null, "members", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Access(), this.getTeamAccess(), null, "access", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRepositoryEClass, AbstractRepository.class, "AbstractRepository", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractRepository_FullName(), theEcorePackage.getEString(), "fullName", null, 0, 1, AbstractRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_NodeId(), theEcorePackage.getEString(), "nodeId", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_DatabaseId(), theEcorePackage.getELong(), "databaseId", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Homepage(), theEcorePackage.getEString(), "homepage", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_HtmlUrl(), theEcorePackage.getEString(), "htmlUrl", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_CloneUrl(), theEcorePackage.getEString(), "cloneUrl", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_SshUrl(), theEcorePackage.getEString(), "sshUrl", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Visibility(), this.getVisibility(), "visibility", "PUBLIC", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Archived(), theEcorePackage.getEBoolean(), "archived", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Template(), theEcorePackage.getEBoolean(), "template", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Fork(), theEcorePackage.getEBoolean(), "fork", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Parent(), this.getAbstractRepository(), null, "parent", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Source(), this.getAbstractRepository(), null, "source", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_DefaultBranchName(), theEcorePackage.getEString(), "defaultBranchName", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_DefaultBranch(), this.getBranch(), null, "defaultBranch", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_License(), theEcorePackage.getEString(), "license", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Topics(), theEcorePackage.getEString(), "topics", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_PrimaryLanguage(), theEcorePackage.getEString(), "primaryLanguage", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_CreatedAt(), theEcorePackage.getEDate(), "createdAt", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_UpdatedAt(), theEcorePackage.getEDate(), "updatedAt", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_PushedAt(), theEcorePackage.getEDate(), "pushedAt", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Size(), theEcorePackage.getELong(), "size", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Stargazers(), theEcorePackage.getEInt(), "stargazers", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Watchers(), theEcorePackage.getEInt(), "watchers", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Forks(), theEcorePackage.getEInt(), "forks", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_OpenIssues(), theEcorePackage.getEInt(), "openIssues", "-1", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Languages(), this.getLanguageUsage(), null, "languages", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Branches(), this.getBranch(), null, "branches", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Tags(), this.getTag(), null, "tags", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Releases(), this.getRelease(), null, "releases", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Collaborators(), this.getCollaborator(), null, "collaborators", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Contributions(), this.getContribution(), null, "contributions", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_CodeOwners(), this.getCodeOwnerRule(), null, "codeOwners", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryReferenceEClass, RepositoryReference.class, "RepositoryReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositoryReference_Target(), this.getRepository(), null, "target", null, 0, 1, RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageUsageEClass, LanguageUsage.class, "LanguageUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageUsage_Language(), theEcorePackage.getEString(), "language", null, 0, 1, LanguageUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageUsage_Bytes(), theEcorePackage.getELong(), "bytes", "-1", 0, 1, LanguageUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContribution_Account(), this.getAbstractAccount(), null, "account", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_Commits(), theEcorePackage.getEInt(), "commits", "-1", 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_FirstCommit(), theEcorePackage.getEDate(), "firstCommit", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_LastCommit(), theEcorePackage.getEDate(), "lastCommit", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaboratorEClass, Collaborator.class, "Collaborator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborator_Account(), this.getAbstractAccount(), null, "account", null, 0, 1, Collaborator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborator_Permission(), this.getPermissionLevel(), "permission", "READ", 0, 1, Collaborator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborator_Source(), this.getPermissionSource(), "source", "DIRECT", 0, 1, Collaborator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborator_Outside(), theEcorePackage.getEBoolean(), "outside", null, 0, 1, Collaborator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborator_Team(), this.getTeam(), null, "team", null, 0, 1, Collaborator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamAccessEClass, TeamAccess.class, "TeamAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamAccess_Repository(), this.getAbstractRepository(), null, "repository", null, 0, 1, TeamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamAccess_Permission(), this.getPermissionLevel(), "permission", "READ", 0, 1, TeamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeOwnerRuleEClass, CodeOwnerRule.class, "CodeOwnerRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeOwnerRule_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, CodeOwnerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeOwnerRule_Owners(), theEcorePackage.getEString(), "owners", null, 0, -1, CodeOwnerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeOwnerRule_OwnerAccounts(), this.getAbstractAccount(), null, "ownerAccounts", null, 0, -1, CodeOwnerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeOwnerRule_OwnerTeams(), this.getTeam(), null, "ownerTeams", null, 0, -1, CodeOwnerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeOwnerRule_Line(), theEcorePackage.getEInt(), "line", "-1", 0, 1, CodeOwnerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refEClass, Ref.class, "Ref", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRef_RefName(), theEcorePackage.getEString(), "refName", null, 0, 1, Ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRef_CommitSha(), theEcorePackage.getEString(), "commitSha", null, 0, 1, Ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Protected(), theEcorePackage.getEBoolean(), "protected", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Protection(), this.getBranchProtection(), null, "protection", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Ahead(), theEcorePackage.getEInt(), "ahead", "-1", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Behind(), theEcorePackage.getEInt(), "behind", "-1", 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Annotated(), theEcorePackage.getEBoolean(), "annotated", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Message(), theEcorePackage.getEString(), "message", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_Tagger(), this.getAbstractAccount(), null, "tagger", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_Release(), this.getRelease(), this.getRelease_Tag(), "release", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchProtectionEClass, BranchProtection.class, "BranchProtection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranchProtection_RequiredApprovingReviews(), theEcorePackage.getEInt(), "requiredApprovingReviews", "-1", 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequireCodeOwnerReview(), theEcorePackage.getEBoolean(), "requireCodeOwnerReview", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_DismissStaleReviews(), theEcorePackage.getEBoolean(), "dismissStaleReviews", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequireLinearHistory(), theEcorePackage.getEBoolean(), "requireLinearHistory", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequireSignedCommits(), theEcorePackage.getEBoolean(), "requireSignedCommits", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequireConversationResolution(), theEcorePackage.getEBoolean(), "requireConversationResolution", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_EnforceAdmins(), theEcorePackage.getEBoolean(), "enforceAdmins", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_AllowForcePushes(), theEcorePackage.getEBoolean(), "allowForcePushes", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_AllowDeletions(), theEcorePackage.getEBoolean(), "allowDeletions", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequiredStatusChecks(), theEcorePackage.getEString(), "requiredStatusChecks", null, 0, -1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchProtection_RequireUpToDateBranch(), theEcorePackage.getEBoolean(), "requireUpToDateBranch", null, 0, 1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchProtection_PushAccounts(), this.getAbstractAccount(), null, "pushAccounts", null, 0, -1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchProtection_PushTeams(), this.getTeam(), null, "pushTeams", null, 0, -1, BranchProtection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelease_NodeId(), theEcorePackage.getEString(), "nodeId", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_DatabaseId(), theEcorePackage.getELong(), "databaseId", "-1", 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_TagName(), theEcorePackage.getEString(), "tagName", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Tag(), this.getTag(), this.getTag_Release(), "tag", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_TargetCommitish(), theEcorePackage.getEString(), "targetCommitish", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_Draft(), theEcorePackage.getEBoolean(), "draft", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_PreRelease(), theEcorePackage.getEBoolean(), "preRelease", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_HtmlUrl(), theEcorePackage.getEString(), "htmlUrl", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_CreatedAt(), theEcorePackage.getEDate(), "createdAt", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelease_PublishedAt(), theEcorePackage.getEDate(), "publishedAt", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Author(), this.getAbstractAccount(), null, "author", null, 0, 1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelease_Assets(), this.getReleaseAsset(), null, "assets", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseAssetEClass, ReleaseAsset.class, "ReleaseAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseAsset_Label(), theEcorePackage.getEString(), "label", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_Size(), theEcorePackage.getELong(), "size", "-1", 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_Downloads(), theEcorePackage.getEInt(), "downloads", "-1", 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_DownloadUrl(), theEcorePackage.getEString(), "downloadUrl", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_CreatedAt(), theEcorePackage.getEDate(), "createdAt", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseAsset_UpdatedAt(), theEcorePackage.getEDate(), "updatedAt", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseAsset_Uploader(), this.getAbstractAccount(), null, "uploader", null, 0, 1, ReleaseAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(membershipRoleEEnum, MembershipRole.class, "MembershipRole");
		addEEnumLiteral(membershipRoleEEnum, MembershipRole.MEMBER);
		addEEnumLiteral(membershipRoleEEnum, MembershipRole.ADMIN);
		addEEnumLiteral(membershipRoleEEnum, MembershipRole.BILLING_MANAGER);
		addEEnumLiteral(membershipRoleEEnum, MembershipRole.MAINTAINER);

		initEEnum(teamPrivacyEEnum, TeamPrivacy.class, "TeamPrivacy");
		addEEnumLiteral(teamPrivacyEEnum, TeamPrivacy.VISIBLE);
		addEEnumLiteral(teamPrivacyEEnum, TeamPrivacy.SECRET);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.INTERNAL);

		initEEnum(permissionLevelEEnum, PermissionLevel.class, "PermissionLevel");
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.READ);
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.TRIAGE);
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.WRITE);
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.MAINTAIN);
		addEEnumLiteral(permissionLevelEEnum, PermissionLevel.ADMIN);

		initEEnum(permissionSourceEEnum, PermissionSource.class, "PermissionSource");
		addEEnumLiteral(permissionSourceEEnum, PermissionSource.DIRECT);
		addEEnumLiteral(permissionSourceEEnum, PermissionSource.TEAM);
		addEEnumLiteral(permissionSourceEEnum, PermissionSource.ORGANIZATION);
		addEEnumLiteral(permissionSourceEEnum, PermissionSource.FORK);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (loadableEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nPROVENANCE\n==========================================================================="
		   });
		addAnnotation
		  (loadEClass,
		   source,
		   new String[] {
			   "documentation", "One load of one thing: the containing element itself, or one of its\nreferences.\n\nAbsence of a Load for a reference means \"never loaded\", which is a\ndifferent fact from \"loaded and empty\", and the difference matters in every\nreport built on a partial scan. An empty branches list with no Load beside\nit means nobody looked."
		   });
		addAnnotation
		  (getLoad_Source(),
		   source,
		   new String[] {
			   "documentation", " Source system: the API base URL, optionally with the account used."
		   });
		addAnnotation
		  (getLoad_Reference(),
		   source,
		   new String[] {
			   "documentation", " Name of the reference loaded. Empty means the containing element itself."
		   });
		addAnnotation
		  (getLoad_Size(),
		   source,
		   new String[] {
			   "documentation", " Number of elements loaded."
		   });
		addAnnotation
		  (getLoad_Error(),
		   source,
		   new String[] {
			   "documentation", " Set when the load failed or was truncated; the partial result is kept."
		   });
		addAnnotation
		  (getLoad_Etag(),
		   source,
		   new String[] {
			   "documentation", "ETag returned by the API, so the next refresh can be a conditional\nrequest. A 304 costs no rate limit, which is the difference between\nrescanning a hundred repositories hourly and doing it once a day."
		   });
		addAnnotation
		  (getLoad_Complete(),
		   source,
		   new String[] {
			   "documentation", " False when pagination stopped early: a page limit, a rate limit, an error."
		   });
		addAnnotation
		  (gitHubEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nROOT\n==========================================================================="
		   });
		addAnnotation
		  (getGitHub_Url(),
		   source,
		   new String[] {
			   "documentation", " Web base URL, e.g. https://github.com."
		   });
		addAnnotation
		  (getGitHub_ApiUrl(),
		   source,
		   new String[] {
			   "documentation", " API base URL, e.g. https://api.github.com."
		   });
		addAnnotation
		  (getGitHub_EnterpriseServer(),
		   source,
		   new String[] {
			   "documentation", " True for GitHub Enterprise Server, which differs in available features."
		   });
		addAnnotation
		  (abstractAccountEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nACCOUNTS\n==========================================================================="
		   });
		addAnnotation
		  (getAbstractAccount_Login(),
		   source,
		   new String[] {
			   "documentation", "The account identity: what appears in github.com/<login>. Declared here\nrather than on Account so that a reference to an unloaded account is\nstill resolvable by login, and so that containment can key on it."
		   });
		addAnnotation
		  (accountEClass,
		   source,
		   new String[] {
			   "documentation", "A GitHub account: a user, an organization, or a bot. One class for what the\nAPI returns in a dozen shapes.\n\nname is the display name; login is the identity and the thing in URLs."
		   });
		addAnnotation
		  (getAccount_NodeId(),
		   source,
		   new String[] {
			   "documentation", " GraphQL global node id: the rename-safe identity."
		   });
		addAnnotation
		  (getAccount_DatabaseId(),
		   source,
		   new String[] {
			   "documentation", " REST numeric id."
		   });
		addAnnotation
		  (getAccount_Repositories(),
		   source,
		   new String[] {
			   "documentation", " Repositories owned by this account."
		   });
		addAnnotation
		  (getUser_Bio(),
		   source,
		   new String[] {
			   "documentation", " The profile blurb. Longer documentation uses the inherited documentation feature."
		   });
		addAnnotation
		  (getUser_Bot(),
		   source,
		   new String[] {
			   "documentation", " True for a bot account: dependabot, a GitHub App\'s actor, a service identity."
		   });
		addAnnotation
		  (getUser_Inactive(),
		   source,
		   new String[] {
			   "documentation", " Suspended or deleted upstream, but still referenced by history."
		   });
		addAnnotation
		  (getOrganization_DefaultRepositoryPermission(),
		   source,
		   new String[] {
			   "documentation", " Default permission granted to organization members on new repositories."
		   });
		addAnnotation
		  (getOrganization_Members(),
		   source,
		   new String[] {
			   "documentation", " Who belongs to this organization, and as what."
		   });
		addAnnotation
		  (membershipRoleEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " Team level: a member who can also manage the team."
		   });
		addAnnotation
		  (membershipEClass,
		   source,
		   new String[] {
			   "documentation", "An account\'s membership of an organization or a team, reified so the role\nhas somewhere to live. GitHub answers this across several endpoints with\ndifferent shapes; there is only one concept."
		   });
		addAnnotation
		  (getMembership_Publicized(),
		   source,
		   new String[] {
			   "documentation", " Publicly visible membership, as opposed to a private one."
		   });
		addAnnotation
		  (getMembership_Pending(),
		   source,
		   new String[] {
			   "documentation", " Invited but not yet accepted."
		   });
		addAnnotation
		  (teamEClass,
		   source,
		   new String[] {
			   "documentation", "A team: the unit organizations actually grant access with, and the reason\nrepository permissions are usually not attached to people.\n\nTeams nest, and nesting is inheritance of access, which is why the\nhierarchy has to be in the model for any access question to be answerable."
		   });
		addAnnotation
		  (getTeam_Slug(),
		   source,
		   new String[] {
			   "documentation", " URL safe identity within the organization."
		   });
		addAnnotation
		  (getTeam_Access(),
		   source,
		   new String[] {
			   "documentation", " Repositories this team has access to, and at what level."
		   });
		addAnnotation
		  (teamPrivacyEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " Visible to all organization members."
		   });
		addAnnotation
		  (abstractRepositoryEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nREPOSITORIES\n==========================================================================="
		   });
		addAnnotation
		  (getAbstractRepository_FullName(),
		   source,
		   new String[] {
			   "documentation", "owner/name, the identity everyone reads and types. Declared here for the\nsame reason login is: a reference to an unloaded repository still names\nit, and containment can key on it."
		   });
		addAnnotation
		  (visibilityEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Enterprise only: visible to all members of the enterprise."
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "documentation", "A repository.\n\nCounts sit directly on the class rather than in a dated statistics record,\nbecause the Load beside them already says when they were taken. That is the\npayoff of treating provenance as data instead of sprinkling timestamps."
		   });
		addAnnotation
		  (getRepository_Disabled(),
		   source,
		   new String[] {
			   "documentation", " Disabled by GitHub, e.g. for a terms violation or a billing lapse."
		   });
		addAnnotation
		  (getRepository_Template(),
		   source,
		   new String[] {
			   "documentation", " A template repository, which is generated from rather than forked."
		   });
		addAnnotation
		  (getRepository_Parent(),
		   source,
		   new String[] {
			   "documentation", " The repository this one was forked from, and the ultimate upstream."
		   });
		addAnnotation
		  (getRepository_DefaultBranchName(),
		   source,
		   new String[] {
			   "documentation", " Name of the default branch, e.g. main. Resolved to a Branch when branches are loaded."
		   });
		addAnnotation
		  (getRepository_License(),
		   source,
		   new String[] {
			   "documentation", " SPDX identifier of the detected license, e.g. EPL-2.0."
		   });
		addAnnotation
		  (getRepository_PrimaryLanguage(),
		   source,
		   new String[] {
			   "documentation", " The language with the most bytes, per GitHub\'s detection."
		   });
		addAnnotation
		  (getRepository_PushedAt(),
		   source,
		   new String[] {
			   "documentation", " Last push, which is the honest measure of activity; updatedAt moves when a star is added."
		   });
		addAnnotation
		  (getRepository_Size(),
		   source,
		   new String[] {
			   "documentation", " Size in kilobytes, as GitHub reports it."
		   });
		addAnnotation
		  (getRepository_OpenIssues(),
		   source,
		   new String[] {
			   "documentation", " Open issues, which GitHub counts including open pull requests."
		   });
		addAnnotation
		  (getRepository_CodeOwners(),
		   source,
		   new String[] {
			   "documentation", " Parsed CODEOWNERS rules; see the class documentation."
		   });
		addAnnotation
		  (languageUsageEClass,
		   source,
		   new String[] {
			   "documentation", "Bytes of source per language, as GitHub detects them. A crude measure and\nthe only comparable one available across an estate, which is why it is\nhere: \"how much TypeScript is there now\" is a question with no other cheap\nanswer."
		   });
		addAnnotation
		  (contributionEClass,
		   source,
		   new String[] {
			   "documentation", "Commits by one account in one repository. GitHub\'s contributor statistics,\nkept because contribution spread across an estate is a governance question\n(bus factor, dormant ownership) and a reporting one."
		   });
		addAnnotation
		  (permissionLevelEEnum,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nACCESS\n==========================================================================="
		   });
		addAnnotation
		  (permissionSourceEEnum,
		   source,
		   new String[] {
			   "documentation", "How an account came to have a permission. The interesting one is TEAM,\nbecause effective permission is the maximum over several sources and no\nsingle endpoint shows the derivation."
		   });
		addAnnotation
		  (collaboratorEClass,
		   source,
		   new String[] {
			   "documentation", " An account\'s access to the containing repository, with where it came from."
		   });
		addAnnotation
		  (getCollaborator_Outside(),
		   source,
		   new String[] {
			   "documentation", " Not a member of the owning organization."
		   });
		addAnnotation
		  (getCollaborator_Team(),
		   source,
		   new String[] {
			   "documentation", " The team the permission came from, when source is TEAM."
		   });
		addAnnotation
		  (teamAccessEClass,
		   source,
		   new String[] {
			   "documentation", " A team\'s access to a repository, held on the team side."
		   });
		addAnnotation
		  (codeOwnerRuleEClass,
		   source,
		   new String[] {
			   "documentation", "One line of a CODEOWNERS file, parsed.\n\nA file rather than an API object, and in the model anyway, because\nownership is a concept the platform implements through a file and every\nownership question needs it. The GitLab model made the same call. Loaders\nparse it from the default branch; the URI handler below is what fetches it."
		   });
		addAnnotation
		  (getCodeOwnerRule_Pattern(),
		   source,
		   new String[] {
			   "documentation", " Path pattern, gitignore syntax, e.g. /docs/ or *.java."
		   });
		addAnnotation
		  (getCodeOwnerRule_Owners(),
		   source,
		   new String[] {
			   "documentation", " Owning accounts and teams as written, e.g. @Nasdanika/core-team, resolved when loaded."
		   });
		addAnnotation
		  (getCodeOwnerRule_Line(),
		   source,
		   new String[] {
			   "documentation", " Line number in the source file, for round-tripping and for error reporting."
		   });
		addAnnotation
		  (refEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nREFS\n==========================================================================="
		   });
		addAnnotation
		  (getRef_RefName(),
		   source,
		   new String[] {
			   "documentation", " Full ref name, e.g. refs/heads/main. name holds the short form."
		   });
		addAnnotation
		  (getRef_CommitSha(),
		   source,
		   new String[] {
			   "documentation", " SHA the ref points at. Resolves into the Git model."
		   });
		addAnnotation
		  (getBranch_Default(),
		   source,
		   new String[] {
			   "documentation", " True for the repository\'s default branch."
		   });
		addAnnotation
		  (getBranch_Ahead(),
		   source,
		   new String[] {
			   "documentation", " Commits ahead of and behind the default branch, when computed."
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation", "A tag. Annotated tags carry a tagger and a message and are themselves git\nobjects; lightweight tags are just a name. The distinction matters for\nsigned releases, so it is recorded."
		   });
		addAnnotation
		  (getTag_Release(),
		   source,
		   new String[] {
			   "documentation", " Set when a release was cut from this tag."
		   });
		addAnnotation
		  (branchProtectionEClass,
		   source,
		   new String[] {
			   "documentation", "Branch protection: the rules that decide whether the history of a branch\ncan be trusted.\n\nWorth modelling even though it is configuration, because it is the single\nmost useful governance dataset GitHub holds, and because \"which of our\nrepositories require a review on the default branch\" is a question that\ncurrently takes a script per audit."
		   });
		addAnnotation
		  (getBranchProtection_RequiredStatusChecks(),
		   source,
		   new String[] {
			   "documentation", " Names of status checks that must pass. Checks themselves belong to the Actions model."
		   });
		addAnnotation
		  (getBranchProtection_PushAccounts(),
		   source,
		   new String[] {
			   "documentation", " Accounts and teams allowed to push, when pushes are restricted."
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nRELEASES\n==========================================================================="
		   });
		addAnnotation
		  (getRelease_TagName(),
		   source,
		   new String[] {
			   "documentation", " The tag this release is cut from, by name and, when loaded, by reference."
		   });
		addAnnotation
		  (getRelease_TargetCommitish(),
		   source,
		   new String[] {
			   "documentation", " The branch or SHA the tag was created from, when the tag did not exist yet."
		   });
		addAnnotation
		  (getRelease_PreRelease(),
		   source,
		   new String[] {
			   "documentation", " GitHub\'s pre-release flag. For SemVer products this should agree with the version\'s pre-release identifiers."
		   });
		addAnnotation
		  (releaseAssetEClass,
		   source,
		   new String[] {
			   "documentation", "A file attached to a release. GitHub is a distribution channel here, and\ndownload counts are the only usage signal it gives, which makes them worth\nkeeping despite being soft."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getGitHub_Accounts(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getAccount_Repositories(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
	}

} //GithubPackageImpl
