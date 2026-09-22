/**
 */
package org.nasdanika.models.github;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.github.GithubFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface GithubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "github";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.github";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GithubPackage eINSTANCE = org.nasdanika.models.github.impl.GithubPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.Loadable <em>Loadable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.Loadable
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLoadable()
	 * @generated
	 */
	int LOADABLE = 0;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE__LOADS = 0;

	/**
	 * The number of structural features of the '<em>Loadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Loadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.LoadImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__SOURCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__REFERENCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__START = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__END = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__SIZE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ERROR = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Etag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ETAG = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__COMPLETE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.GitHubImpl <em>Git Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.GitHubImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getGitHub()
	 * @generated
	 */
	int GIT_HUB = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__LOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__API_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enterprise Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__ENTERPRISE_SERVER = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB__ACCOUNTS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.AbstractAccount <em>Abstract Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.AbstractAccount
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAbstractAccount()
	 * @generated
	 */
	int ABSTRACT_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT__LOGIN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACCOUNT_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.AccountImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LOGIN = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NODE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DATABASE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__HTML_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__AVATAR_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EMAIL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CREATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__UPDATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__REPOSITORIES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.UserImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOCUMENTATION = ACCOUNT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOC_REF = ACCOUNT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOC_FORMAT = ACCOUNT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOC_CONTENTS = ACCOUNT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOC_SECTIONS = ACCOUNT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MARKERS = ACCOUNT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ICON = ACCOUNT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__URIS = ACCOUNT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = ACCOUNT__LOGIN;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOADS = ACCOUNT__LOADS;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NODE_ID = ACCOUNT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATABASE_ID = ACCOUNT__DATABASE_ID;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HTML_URL = ACCOUNT__HTML_URL;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AVATAR_URL = ACCOUNT__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ACCOUNT__EMAIL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_AT = ACCOUNT__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UPDATED_AT = ACCOUNT__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REPOSITORIES = ACCOUNT__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COMPANY = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOCATION = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIO = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BLOG = ACCOUNT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Site Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SITE_ADMIN = ACCOUNT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BOT = ACCOUNT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INACTIVE = ACCOUNT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___COLLECT__OBJECT_EREFERENCE_ELIST = ACCOUNT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GET_REFERRERS__EREFERENCE = ACCOUNT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.OrganizationImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOCUMENTATION = ACCOUNT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_REF = ACCOUNT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_FORMAT = ACCOUNT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_CONTENTS = ACCOUNT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DOC_SECTIONS = ACCOUNT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MARKERS = ACCOUNT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ICON = ACCOUNT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URIS = ACCOUNT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOGIN = ACCOUNT__LOGIN;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOADS = ACCOUNT__LOADS;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NODE_ID = ACCOUNT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DATABASE_ID = ACCOUNT__DATABASE_ID;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__HTML_URL = ACCOUNT__HTML_URL;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__AVATAR_URL = ACCOUNT__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EMAIL = ACCOUNT__EMAIL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CREATED_AT = ACCOUNT__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__UPDATED_AT = ACCOUNT__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__REPOSITORIES = ACCOUNT__REPOSITORIES;

	/**
	 * The feature id for the '<em><b>Billing Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__BILLING_EMAIL = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Repository Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TEAMS = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERS = ACCOUNT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___COLLECT__OBJECT_EREFERENCE_ELIST = ACCOUNT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_REFERRERS__EREFERENCE = ACCOUNT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.AccountReferenceImpl <em>Account Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.AccountReferenceImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAccountReference()
	 * @generated
	 */
	int ACCOUNT_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__ID = ABSTRACT_ACCOUNT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__DOCUMENTATION = ABSTRACT_ACCOUNT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__DOC_REF = ABSTRACT_ACCOUNT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__DOC_FORMAT = ABSTRACT_ACCOUNT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__DOC_CONTENTS = ABSTRACT_ACCOUNT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__DOC_SECTIONS = ABSTRACT_ACCOUNT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__MARKERS = ABSTRACT_ACCOUNT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__ICON = ABSTRACT_ACCOUNT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__URIS = ABSTRACT_ACCOUNT__URIS;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__LOGIN = ABSTRACT_ACCOUNT__LOGIN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE__TARGET = ABSTRACT_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Account Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE_FEATURE_COUNT = ABSTRACT_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_ACCOUNT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_ACCOUNT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Account Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_REFERENCE_OPERATION_COUNT = ABSTRACT_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.MembershipImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ACCOUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ROLE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publicized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__PUBLICIZED = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__PENDING = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.TeamImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SLUG = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NODE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DATABASE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__HTML_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Privacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PRIVACY = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PARENT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CHILDREN = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MEMBERS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ACCESS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.AbstractRepository <em>Abstract Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.AbstractRepository
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAbstractRepository()
	 * @generated
	 */
	int ABSTRACT_REPOSITORY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY__FULL_NAME = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Abstract Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REPOSITORY_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.RepositoryImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FULL_NAME = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NODE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DATABASE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DESCRIPTION = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HOMEPAGE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HTML_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clone Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CLONE_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ssh Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SSH_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__VISIBILITY = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ARCHIVED = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DISABLED = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TEMPLATE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORK = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PARENT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SOURCE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Default Branch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DEFAULT_BRANCH_NAME = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Default Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DEFAULT_BRANCH = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LICENSE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TOPICS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Primary Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PRIMARY_LANGUAGE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CREATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__UPDATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Pushed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PUSHED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SIZE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Stargazers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STARGAZERS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WATCHERS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORKS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Open Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPEN_ISSUES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LANGUAGES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BRANCHES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TAGS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__RELEASES = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Collaborators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COLLABORATORS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTRIBUTIONS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Code Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CODE_OWNERS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.RepositoryReferenceImpl <em>Repository Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.RepositoryReferenceImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRepositoryReference()
	 * @generated
	 */
	int REPOSITORY_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__ID = ABSTRACT_REPOSITORY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__DOCUMENTATION = ABSTRACT_REPOSITORY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__DOC_REF = ABSTRACT_REPOSITORY__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__DOC_FORMAT = ABSTRACT_REPOSITORY__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__DOC_CONTENTS = ABSTRACT_REPOSITORY__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__DOC_SECTIONS = ABSTRACT_REPOSITORY__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__MARKERS = ABSTRACT_REPOSITORY__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__ICON = ABSTRACT_REPOSITORY__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__URIS = ABSTRACT_REPOSITORY__URIS;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__FULL_NAME = ABSTRACT_REPOSITORY__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__TARGET = ABSTRACT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE_FEATURE_COUNT = ABSTRACT_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE___COLLECT__OBJECT_EREFERENCE_ELIST = ABSTRACT_REPOSITORY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE___GET_REFERRERS__EREFERENCE = ABSTRACT_REPOSITORY___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Repository Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE_OPERATION_COUNT = ABSTRACT_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.LanguageUsageImpl <em>Language Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.LanguageUsageImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLanguageUsage()
	 * @generated
	 */
	int LANGUAGE_USAGE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__LANGUAGE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE__BYTES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Language Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_USAGE_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.ContributionImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ACCOUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__COMMITS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__FIRST_COMMIT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Commit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__LAST_COMMIT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.CollaboratorImpl <em>Collaborator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.CollaboratorImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getCollaborator()
	 * @generated
	 */
	int COLLABORATOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__ACCOUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__PERMISSION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__SOURCE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__OUTSIDE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR__TEAM = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Collaborator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Collaborator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATOR_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.TeamAccessImpl <em>Team Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.TeamAccessImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeamAccess()
	 * @generated
	 */
	int TEAM_ACCESS = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__REPOSITORY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS__PERMISSION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Team Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Team Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ACCESS_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl <em>Code Owner Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.CodeOwnerRuleImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getCodeOwnerRule()
	 * @generated
	 */
	int CODE_OWNER_RULE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__PATTERN = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__OWNERS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__OWNER_ACCOUNTS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__OWNER_TEAMS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE__LINE = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Code Owner Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Code Owner Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_RULE_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.RefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.RefImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRef()
	 * @generated
	 */
	int REF = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__REF_NAME = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__COMMIT_SHA = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.BranchImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ID = REF__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOCUMENTATION = REF__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOC_REF = REF__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOC_FORMAT = REF__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOC_CONTENTS = REF__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOC_SECTIONS = REF__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MARKERS = REF__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ICON = REF__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__URIS = REF__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__REF_NAME = REF__REF_NAME;

	/**
	 * The feature id for the '<em><b>Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMIT_SHA = REF__COMMIT_SHA;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEFAULT = REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PROTECTED = REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PROTECTION = REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__AHEAD = REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Behind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BEHIND = REF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = REF_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___COLLECT__OBJECT_EREFERENCE_ELIST = REF___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___GET_REFERRERS__EREFERENCE = REF___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.TagImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = REF__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOCUMENTATION = REF__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOC_REF = REF__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOC_FORMAT = REF__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOC_CONTENTS = REF__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DOC_SECTIONS = REF__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__MARKERS = REF__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ICON = REF__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__URIS = REF__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = REF__NAME;

	/**
	 * The feature id for the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__REF_NAME = REF__REF_NAME;

	/**
	 * The feature id for the '<em><b>Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__COMMIT_SHA = REF__COMMIT_SHA;

	/**
	 * The feature id for the '<em><b>Annotated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ANNOTATED = REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__MESSAGE = REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tagger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAGGER = REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DATE = REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__RELEASE = REF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = REF_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___COLLECT__OBJECT_EREFERENCE_ELIST = REF___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_REFERRERS__EREFERENCE = REF___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.BranchProtectionImpl <em>Branch Protection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.BranchProtectionImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getBranchProtection()
	 * @generated
	 */
	int BRANCH_PROTECTION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__ID = NxcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DOCUMENTATION = NxcorePackage.MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DOC_REF = NxcorePackage.MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DOC_FORMAT = NxcorePackage.MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DOC_CONTENTS = NxcorePackage.MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DOC_SECTIONS = NxcorePackage.MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__MARKERS = NxcorePackage.MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__ICON = NxcorePackage.MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__URIS = NxcorePackage.MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Required Approving Reviews</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Require Code Owner Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dismiss Stale Reviews</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__DISMISS_STALE_REVIEWS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Require Linear History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Require Signed Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Require Conversation Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enforce Admins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__ENFORCE_ADMINS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allow Force Pushes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__ALLOW_FORCE_PUSHES = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Allow Deletions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__ALLOW_DELETIONS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required Status Checks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Require Up To Date Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Push Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__PUSH_ACCOUNTS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Push Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION__PUSH_TEAMS = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Branch Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION_FEATURE_COUNT = NxcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION___GET_REFERRERS__EREFERENCE = NxcorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Branch Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_PROTECTION_OPERATION_COUNT = NxcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.ReleaseImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__LOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NODE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DATABASE_ID = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__TAG_NAME = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__TAG = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Commitish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__TARGET_COMMITISH = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Draft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DRAFT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pre Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__PRE_RELEASE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__HTML_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CREATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Published At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__PUBLISHED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__AUTHOR = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__ASSETS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.impl.ReleaseAssetImpl <em>Release Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.impl.ReleaseAssetImpl
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getReleaseAsset()
	 * @generated
	 */
	int RELEASE_ASSET = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__ID = NxcorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOCUMENTATION = NxcorePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOC_REF = NxcorePackage.NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOC_FORMAT = NxcorePackage.NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOC_CONTENTS = NxcorePackage.NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOC_SECTIONS = NxcorePackage.NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__MARKERS = NxcorePackage.NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__ICON = NxcorePackage.NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__URIS = NxcorePackage.NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__NAME = NxcorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__LABEL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__CONTENT_TYPE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__SIZE = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Downloads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOWNLOADS = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__DOWNLOAD_URL = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__CREATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__UPDATED_AT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uploader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET__UPLOADER = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Release Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET_FEATURE_COUNT = NxcorePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Release Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ASSET_OPERATION_COUNT = NxcorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.MembershipRole <em>Membership Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.MembershipRole
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getMembershipRole()
	 * @generated
	 */
	int MEMBERSHIP_ROLE = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.TeamPrivacy <em>Team Privacy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.TeamPrivacy
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeamPrivacy()
	 * @generated
	 */
	int TEAM_PRIVACY = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.Visibility
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.PermissionLevel <em>Permission Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getPermissionLevel()
	 * @generated
	 */
	int PERMISSION_LEVEL = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.github.PermissionSource <em>Permission Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.github.PermissionSource
	 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getPermissionSource()
	 * @generated
	 */
	int PERMISSION_SOURCE = 28;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Loadable <em>Loadable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadable</em>'.
	 * @see org.nasdanika.models.github.Loadable
	 * @generated
	 */
	EClass getLoadable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Loadable#getLoads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loads</em>'.
	 * @see org.nasdanika.models.github.Loadable#getLoads()
	 * @see #getLoadable()
	 * @generated
	 */
	EReference getLoadable_Loads();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see org.nasdanika.models.github.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.github.Load#getSource()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.github.Load#getReference()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.models.github.Load#getStart()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.models.github.Load#getEnd()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_End();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.github.Load#getSize()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.nasdanika.models.github.Load#getError()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#getEtag <em>Etag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etag</em>'.
	 * @see org.nasdanika.models.github.Load#getEtag()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Etag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Load#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see org.nasdanika.models.github.Load#isComplete()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Complete();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.GitHub <em>Git Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub</em>'.
	 * @see org.nasdanika.models.github.GitHub
	 * @generated
	 */
	EClass getGitHub();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.GitHub#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.github.GitHub#getUrl()
	 * @see #getGitHub()
	 * @generated
	 */
	EAttribute getGitHub_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.GitHub#getApiUrl <em>Api Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Url</em>'.
	 * @see org.nasdanika.models.github.GitHub#getApiUrl()
	 * @see #getGitHub()
	 * @generated
	 */
	EAttribute getGitHub_ApiUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.GitHub#isEnterpriseServer <em>Enterprise Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enterprise Server</em>'.
	 * @see org.nasdanika.models.github.GitHub#isEnterpriseServer()
	 * @see #getGitHub()
	 * @generated
	 */
	EAttribute getGitHub_EnterpriseServer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.GitHub#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.nasdanika.models.github.GitHub#getAccounts()
	 * @see #getGitHub()
	 * @generated
	 */
	EReference getGitHub_Accounts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.AbstractAccount <em>Abstract Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Account</em>'.
	 * @see org.nasdanika.models.github.AbstractAccount
	 * @generated
	 */
	EClass getAbstractAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.AbstractAccount#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see org.nasdanika.models.github.AbstractAccount#getLogin()
	 * @see #getAbstractAccount()
	 * @generated
	 */
	EAttribute getAbstractAccount_Login();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.nasdanika.models.github.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.nasdanika.models.github.Account#getNodeId()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getDatabaseId <em>Database Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Id</em>'.
	 * @see org.nasdanika.models.github.Account#getDatabaseId()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_DatabaseId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getHtmlUrl <em>Html Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html Url</em>'.
	 * @see org.nasdanika.models.github.Account#getHtmlUrl()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_HtmlUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getAvatarUrl <em>Avatar Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Url</em>'.
	 * @see org.nasdanika.models.github.Account#getAvatarUrl()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_AvatarUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.nasdanika.models.github.Account#getEmail()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.github.Account#getCreatedAt()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Account#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.github.Account#getUpdatedAt()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_UpdatedAt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Account#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.nasdanika.models.github.Account#getRepositories()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Repositories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.models.github.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.nasdanika.models.github.User#getCompany()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.github.User#getLocation()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#getBio <em>Bio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bio</em>'.
	 * @see org.nasdanika.models.github.User#getBio()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Bio();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#getBlog <em>Blog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blog</em>'.
	 * @see org.nasdanika.models.github.User#getBlog()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Blog();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#isSiteAdmin <em>Site Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Admin</em>'.
	 * @see org.nasdanika.models.github.User#isSiteAdmin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_SiteAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#isBot <em>Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bot</em>'.
	 * @see org.nasdanika.models.github.User#isBot()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Bot();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.User#isInactive <em>Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive</em>'.
	 * @see org.nasdanika.models.github.User#isInactive()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Inactive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.models.github.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Organization#getBillingEmail <em>Billing Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Email</em>'.
	 * @see org.nasdanika.models.github.Organization#getBillingEmail()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_BillingEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Organization#getDefaultRepositoryPermission <em>Default Repository Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Repository Permission</em>'.
	 * @see org.nasdanika.models.github.Organization#getDefaultRepositoryPermission()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_DefaultRepositoryPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Organization#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see org.nasdanika.models.github.Organization#getTeams()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Organization#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.github.Organization#getMembers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.AccountReference <em>Account Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Reference</em>'.
	 * @see org.nasdanika.models.github.AccountReference
	 * @generated
	 */
	EClass getAccountReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.AccountReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.github.AccountReference#getTarget()
	 * @see #getAccountReference()
	 * @generated
	 */
	EReference getAccountReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see org.nasdanika.models.github.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Membership#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see org.nasdanika.models.github.Membership#getAccount()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Account();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Membership#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.models.github.Membership#getRole()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Membership#isPublicized <em>Publicized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publicized</em>'.
	 * @see org.nasdanika.models.github.Membership#isPublicized()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Publicized();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Membership#isPending <em>Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pending</em>'.
	 * @see org.nasdanika.models.github.Membership#isPending()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Pending();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see org.nasdanika.models.github.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Team#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see org.nasdanika.models.github.Team#getSlug()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Slug();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Team#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.nasdanika.models.github.Team#getNodeId()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Team#getDatabaseId <em>Database Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Id</em>'.
	 * @see org.nasdanika.models.github.Team#getDatabaseId()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_DatabaseId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Team#getHtmlUrl <em>Html Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html Url</em>'.
	 * @see org.nasdanika.models.github.Team#getHtmlUrl()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_HtmlUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Team#getPrivacy <em>Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy</em>'.
	 * @see org.nasdanika.models.github.Team#getPrivacy()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Privacy();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Team#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.models.github.Team#getParent()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Team#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.github.Team#getChildren()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Team#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.github.Team#getMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Team#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access</em>'.
	 * @see org.nasdanika.models.github.Team#getAccess()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Access();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.AbstractRepository <em>Abstract Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Repository</em>'.
	 * @see org.nasdanika.models.github.AbstractRepository
	 * @generated
	 */
	EClass getAbstractRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.AbstractRepository#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.nasdanika.models.github.AbstractRepository#getFullName()
	 * @see #getAbstractRepository()
	 * @generated
	 */
	EAttribute getAbstractRepository_FullName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.nasdanika.models.github.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.nasdanika.models.github.Repository#getNodeId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getDatabaseId <em>Database Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Id</em>'.
	 * @see org.nasdanika.models.github.Repository#getDatabaseId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_DatabaseId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.github.Repository#getDescription()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homepage</em>'.
	 * @see org.nasdanika.models.github.Repository#getHomepage()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Homepage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getHtmlUrl <em>Html Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html Url</em>'.
	 * @see org.nasdanika.models.github.Repository#getHtmlUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_HtmlUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getCloneUrl <em>Clone Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clone Url</em>'.
	 * @see org.nasdanika.models.github.Repository#getCloneUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_CloneUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getSshUrl <em>Ssh Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Url</em>'.
	 * @see org.nasdanika.models.github.Repository#getSshUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_SshUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.nasdanika.models.github.Repository#getVisibility()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#isArchived <em>Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archived</em>'.
	 * @see org.nasdanika.models.github.Repository#isArchived()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Archived();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.models.github.Repository#isDisabled()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#isTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see org.nasdanika.models.github.Repository#isTemplate()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#isFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fork</em>'.
	 * @see org.nasdanika.models.github.Repository#isFork()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Fork();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Repository#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.models.github.Repository#getParent()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Repository#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.github.Repository#getSource()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getDefaultBranchName <em>Default Branch Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Branch Name</em>'.
	 * @see org.nasdanika.models.github.Repository#getDefaultBranchName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_DefaultBranchName();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Repository#getDefaultBranch <em>Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Branch</em>'.
	 * @see org.nasdanika.models.github.Repository#getDefaultBranch()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_DefaultBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.nasdanika.models.github.Repository#getLicense()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_License();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.github.Repository#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Topics</em>'.
	 * @see org.nasdanika.models.github.Repository#getTopics()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Topics();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getPrimaryLanguage <em>Primary Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Language</em>'.
	 * @see org.nasdanika.models.github.Repository#getPrimaryLanguage()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_PrimaryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.github.Repository#getCreatedAt()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.github.Repository#getUpdatedAt()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getPushedAt <em>Pushed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pushed At</em>'.
	 * @see org.nasdanika.models.github.Repository#getPushedAt()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_PushedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.github.Repository#getSize()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getStargazers <em>Stargazers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stargazers</em>'.
	 * @see org.nasdanika.models.github.Repository#getStargazers()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Stargazers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getWatchers <em>Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watchers</em>'.
	 * @see org.nasdanika.models.github.Repository#getWatchers()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Watchers();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forks</em>'.
	 * @see org.nasdanika.models.github.Repository#getForks()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Forks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Repository#getOpenIssues <em>Open Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Issues</em>'.
	 * @see org.nasdanika.models.github.Repository#getOpenIssues()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_OpenIssues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see org.nasdanika.models.github.Repository#getLanguages()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.nasdanika.models.github.Repository#getBranches()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.nasdanika.models.github.Repository#getTags()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.models.github.Repository#getReleases()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Releases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getCollaborators <em>Collaborators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaborators</em>'.
	 * @see org.nasdanika.models.github.Repository#getCollaborators()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Collaborators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see org.nasdanika.models.github.Repository#getContributions()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Contributions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Repository#getCodeOwners <em>Code Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Owners</em>'.
	 * @see org.nasdanika.models.github.Repository#getCodeOwners()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_CodeOwners();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.RepositoryReference <em>Repository Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Reference</em>'.
	 * @see org.nasdanika.models.github.RepositoryReference
	 * @generated
	 */
	EClass getRepositoryReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.RepositoryReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.github.RepositoryReference#getTarget()
	 * @see #getRepositoryReference()
	 * @generated
	 */
	EReference getRepositoryReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.LanguageUsage <em>Language Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Usage</em>'.
	 * @see org.nasdanika.models.github.LanguageUsage
	 * @generated
	 */
	EClass getLanguageUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.LanguageUsage#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.models.github.LanguageUsage#getLanguage()
	 * @see #getLanguageUsage()
	 * @generated
	 */
	EAttribute getLanguageUsage_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.LanguageUsage#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.nasdanika.models.github.LanguageUsage#getBytes()
	 * @see #getLanguageUsage()
	 * @generated
	 */
	EAttribute getLanguageUsage_Bytes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.nasdanika.models.github.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Contribution#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see org.nasdanika.models.github.Contribution#getAccount()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Account();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Contribution#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commits</em>'.
	 * @see org.nasdanika.models.github.Contribution#getCommits()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Commits();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Contribution#getFirstCommit <em>First Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Commit</em>'.
	 * @see org.nasdanika.models.github.Contribution#getFirstCommit()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_FirstCommit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Contribution#getLastCommit <em>Last Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Commit</em>'.
	 * @see org.nasdanika.models.github.Contribution#getLastCommit()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_LastCommit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Collaborator <em>Collaborator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborator</em>'.
	 * @see org.nasdanika.models.github.Collaborator
	 * @generated
	 */
	EClass getCollaborator();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Collaborator#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see org.nasdanika.models.github.Collaborator#getAccount()
	 * @see #getCollaborator()
	 * @generated
	 */
	EReference getCollaborator_Account();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Collaborator#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see org.nasdanika.models.github.Collaborator#getPermission()
	 * @see #getCollaborator()
	 * @generated
	 */
	EAttribute getCollaborator_Permission();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Collaborator#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.github.Collaborator#getSource()
	 * @see #getCollaborator()
	 * @generated
	 */
	EAttribute getCollaborator_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Collaborator#isOutside <em>Outside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outside</em>'.
	 * @see org.nasdanika.models.github.Collaborator#isOutside()
	 * @see #getCollaborator()
	 * @generated
	 */
	EAttribute getCollaborator_Outside();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Collaborator#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see org.nasdanika.models.github.Collaborator#getTeam()
	 * @see #getCollaborator()
	 * @generated
	 */
	EReference getCollaborator_Team();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.TeamAccess <em>Team Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Access</em>'.
	 * @see org.nasdanika.models.github.TeamAccess
	 * @generated
	 */
	EClass getTeamAccess();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.TeamAccess#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.nasdanika.models.github.TeamAccess#getRepository()
	 * @see #getTeamAccess()
	 * @generated
	 */
	EReference getTeamAccess_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.TeamAccess#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see org.nasdanika.models.github.TeamAccess#getPermission()
	 * @see #getTeamAccess()
	 * @generated
	 */
	EAttribute getTeamAccess_Permission();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.CodeOwnerRule <em>Code Owner Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Owner Rule</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule
	 * @generated
	 */
	EClass getCodeOwnerRule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.CodeOwnerRule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule#getPattern()
	 * @see #getCodeOwnerRule()
	 * @generated
	 */
	EAttribute getCodeOwnerRule_Pattern();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.github.CodeOwnerRule#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Owners</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule#getOwners()
	 * @see #getCodeOwnerRule()
	 * @generated
	 */
	EAttribute getCodeOwnerRule_Owners();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.github.CodeOwnerRule#getOwnerAccounts <em>Owner Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Accounts</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule#getOwnerAccounts()
	 * @see #getCodeOwnerRule()
	 * @generated
	 */
	EReference getCodeOwnerRule_OwnerAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.github.CodeOwnerRule#getOwnerTeams <em>Owner Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Teams</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule#getOwnerTeams()
	 * @see #getCodeOwnerRule()
	 * @generated
	 */
	EReference getCodeOwnerRule_OwnerTeams();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.CodeOwnerRule#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.nasdanika.models.github.CodeOwnerRule#getLine()
	 * @see #getCodeOwnerRule()
	 * @generated
	 */
	EAttribute getCodeOwnerRule_Line();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see org.nasdanika.models.github.Ref
	 * @generated
	 */
	EClass getRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Ref#getRefName <em>Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Name</em>'.
	 * @see org.nasdanika.models.github.Ref#getRefName()
	 * @see #getRef()
	 * @generated
	 */
	EAttribute getRef_RefName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Ref#getCommitSha <em>Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Sha</em>'.
	 * @see org.nasdanika.models.github.Ref#getCommitSha()
	 * @see #getRef()
	 * @generated
	 */
	EAttribute getRef_CommitSha();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see org.nasdanika.models.github.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Branch#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.nasdanika.models.github.Branch#isDefault()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Branch#isProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.nasdanika.models.github.Branch#isProtected()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Protected();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.github.Branch#getProtection <em>Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protection</em>'.
	 * @see org.nasdanika.models.github.Branch#getProtection()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Protection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Branch#getAhead <em>Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ahead</em>'.
	 * @see org.nasdanika.models.github.Branch#getAhead()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Ahead();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Branch#getBehind <em>Behind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behind</em>'.
	 * @see org.nasdanika.models.github.Branch#getBehind()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Behind();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.models.github.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Tag#isAnnotated <em>Annotated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotated</em>'.
	 * @see org.nasdanika.models.github.Tag#isAnnotated()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Annotated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Tag#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.github.Tag#getMessage()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Message();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Tag#getTagger <em>Tagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tagger</em>'.
	 * @see org.nasdanika.models.github.Tag#getTagger()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Tagger();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Tag#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.github.Tag#getDate()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Date();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Tag#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Release</em>'.
	 * @see org.nasdanika.models.github.Tag#getRelease()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Release();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.BranchProtection <em>Branch Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Protection</em>'.
	 * @see org.nasdanika.models.github.BranchProtection
	 * @generated
	 */
	EClass getBranchProtection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#getRequiredApprovingReviews <em>Required Approving Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Approving Reviews</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#getRequiredApprovingReviews()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequiredApprovingReviews();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isRequireCodeOwnerReview <em>Require Code Owner Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Code Owner Review</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isRequireCodeOwnerReview()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequireCodeOwnerReview();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isDismissStaleReviews <em>Dismiss Stale Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dismiss Stale Reviews</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isDismissStaleReviews()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_DismissStaleReviews();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isRequireLinearHistory <em>Require Linear History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Linear History</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isRequireLinearHistory()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequireLinearHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isRequireSignedCommits <em>Require Signed Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Signed Commits</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isRequireSignedCommits()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequireSignedCommits();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isRequireConversationResolution <em>Require Conversation Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Conversation Resolution</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isRequireConversationResolution()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequireConversationResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isEnforceAdmins <em>Enforce Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enforce Admins</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isEnforceAdmins()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_EnforceAdmins();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isAllowForcePushes <em>Allow Force Pushes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Force Pushes</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isAllowForcePushes()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_AllowForcePushes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isAllowDeletions <em>Allow Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Deletions</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isAllowDeletions()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_AllowDeletions();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.github.BranchProtection#getRequiredStatusChecks <em>Required Status Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Status Checks</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#getRequiredStatusChecks()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequiredStatusChecks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.BranchProtection#isRequireUpToDateBranch <em>Require Up To Date Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Up To Date Branch</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#isRequireUpToDateBranch()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EAttribute getBranchProtection_RequireUpToDateBranch();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.github.BranchProtection#getPushAccounts <em>Push Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Push Accounts</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#getPushAccounts()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EReference getBranchProtection_PushAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.github.BranchProtection#getPushTeams <em>Push Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Push Teams</em>'.
	 * @see org.nasdanika.models.github.BranchProtection#getPushTeams()
	 * @see #getBranchProtection()
	 * @generated
	 */
	EReference getBranchProtection_PushTeams();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.models.github.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.nasdanika.models.github.Release#getNodeId()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getDatabaseId <em>Database Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Id</em>'.
	 * @see org.nasdanika.models.github.Release#getDatabaseId()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_DatabaseId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Name</em>'.
	 * @see org.nasdanika.models.github.Release#getTagName()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_TagName();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Release#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see org.nasdanika.models.github.Release#getTag()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getTargetCommitish <em>Target Commitish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Commitish</em>'.
	 * @see org.nasdanika.models.github.Release#getTargetCommitish()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_TargetCommitish();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#isDraft <em>Draft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draft</em>'.
	 * @see org.nasdanika.models.github.Release#isDraft()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Draft();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#isPreRelease <em>Pre Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Release</em>'.
	 * @see org.nasdanika.models.github.Release#isPreRelease()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_PreRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getHtmlUrl <em>Html Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html Url</em>'.
	 * @see org.nasdanika.models.github.Release#getHtmlUrl()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_HtmlUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.github.Release#getCreatedAt()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.Release#getPublishedAt <em>Published At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published At</em>'.
	 * @see org.nasdanika.models.github.Release#getPublishedAt()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_PublishedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.Release#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.github.Release#getAuthor()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.github.Release#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see org.nasdanika.models.github.Release#getAssets()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Assets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.github.ReleaseAsset <em>Release Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Asset</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset
	 * @generated
	 */
	EClass getReleaseAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getLabel()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getContentType()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getSize()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getDownloads <em>Downloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downloads</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getDownloads()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_Downloads();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getDownloadUrl <em>Download Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Url</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getDownloadUrl()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_DownloadUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getCreatedAt()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.github.ReleaseAsset#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getUpdatedAt()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EAttribute getReleaseAsset_UpdatedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.github.ReleaseAsset#getUploader <em>Uploader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uploader</em>'.
	 * @see org.nasdanika.models.github.ReleaseAsset#getUploader()
	 * @see #getReleaseAsset()
	 * @generated
	 */
	EReference getReleaseAsset_Uploader();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.github.MembershipRole <em>Membership Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Membership Role</em>'.
	 * @see org.nasdanika.models.github.MembershipRole
	 * @generated
	 */
	EEnum getMembershipRole();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.github.TeamPrivacy <em>Team Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Team Privacy</em>'.
	 * @see org.nasdanika.models.github.TeamPrivacy
	 * @generated
	 */
	EEnum getTeamPrivacy();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.github.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.nasdanika.models.github.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.github.PermissionLevel <em>Permission Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Level</em>'.
	 * @see org.nasdanika.models.github.PermissionLevel
	 * @generated
	 */
	EEnum getPermissionLevel();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.github.PermissionSource <em>Permission Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Source</em>'.
	 * @see org.nasdanika.models.github.PermissionSource
	 * @generated
	 */
	EEnum getPermissionSource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GithubFactory getGithubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.Loadable <em>Loadable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.Loadable
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLoadable()
		 * @generated
		 */
		EClass LOADABLE = eINSTANCE.getLoadable();

		/**
		 * The meta object literal for the '<em><b>Loads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADABLE__LOADS = eINSTANCE.getLoadable_Loads();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.LoadImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__SOURCE = eINSTANCE.getLoad_Source();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__REFERENCE = eINSTANCE.getLoad_Reference();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__START = eINSTANCE.getLoad_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__END = eINSTANCE.getLoad_End();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__SIZE = eINSTANCE.getLoad_Size();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ERROR = eINSTANCE.getLoad_Error();

		/**
		 * The meta object literal for the '<em><b>Etag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ETAG = eINSTANCE.getLoad_Etag();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__COMPLETE = eINSTANCE.getLoad_Complete();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.GitHubImpl <em>Git Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.GitHubImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getGitHub()
		 * @generated
		 */
		EClass GIT_HUB = eINSTANCE.getGitHub();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB__URL = eINSTANCE.getGitHub_Url();

		/**
		 * The meta object literal for the '<em><b>Api Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB__API_URL = eINSTANCE.getGitHub_ApiUrl();

		/**
		 * The meta object literal for the '<em><b>Enterprise Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB__ENTERPRISE_SERVER = eINSTANCE.getGitHub_EnterpriseServer();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_HUB__ACCOUNTS = eINSTANCE.getGitHub_Accounts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.AbstractAccount <em>Abstract Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.AbstractAccount
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAbstractAccount()
		 * @generated
		 */
		EClass ABSTRACT_ACCOUNT = eINSTANCE.getAbstractAccount();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACCOUNT__LOGIN = eINSTANCE.getAbstractAccount_Login();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.AccountImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NODE_ID = eINSTANCE.getAccount_NodeId();

		/**
		 * The meta object literal for the '<em><b>Database Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__DATABASE_ID = eINSTANCE.getAccount_DatabaseId();

		/**
		 * The meta object literal for the '<em><b>Html Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__HTML_URL = eINSTANCE.getAccount_HtmlUrl();

		/**
		 * The meta object literal for the '<em><b>Avatar Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__AVATAR_URL = eINSTANCE.getAccount_AvatarUrl();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__EMAIL = eINSTANCE.getAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__CREATED_AT = eINSTANCE.getAccount_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__UPDATED_AT = eINSTANCE.getAccount_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__REPOSITORIES = eINSTANCE.getAccount_Repositories();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.UserImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COMPANY = eINSTANCE.getUser_Company();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOCATION = eINSTANCE.getUser_Location();

		/**
		 * The meta object literal for the '<em><b>Bio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIO = eINSTANCE.getUser_Bio();

		/**
		 * The meta object literal for the '<em><b>Blog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BLOG = eINSTANCE.getUser_Blog();

		/**
		 * The meta object literal for the '<em><b>Site Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SITE_ADMIN = eINSTANCE.getUser_SiteAdmin();

		/**
		 * The meta object literal for the '<em><b>Bot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BOT = eINSTANCE.getUser_Bot();

		/**
		 * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__INACTIVE = eINSTANCE.getUser_Inactive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.OrganizationImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Billing Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__BILLING_EMAIL = eINSTANCE.getOrganization_BillingEmail();

		/**
		 * The meta object literal for the '<em><b>Default Repository Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__DEFAULT_REPOSITORY_PERMISSION = eINSTANCE.getOrganization_DefaultRepositoryPermission();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__TEAMS = eINSTANCE.getOrganization_Teams();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERS = eINSTANCE.getOrganization_Members();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.AccountReferenceImpl <em>Account Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.AccountReferenceImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAccountReference()
		 * @generated
		 */
		EClass ACCOUNT_REFERENCE = eINSTANCE.getAccountReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_REFERENCE__TARGET = eINSTANCE.getAccountReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.MembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.MembershipImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ACCOUNT = eINSTANCE.getMembership_Account();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__ROLE = eINSTANCE.getMembership_Role();

		/**
		 * The meta object literal for the '<em><b>Publicized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__PUBLICIZED = eINSTANCE.getMembership_Publicized();

		/**
		 * The meta object literal for the '<em><b>Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__PENDING = eINSTANCE.getMembership_Pending();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.TeamImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SLUG = eINSTANCE.getTeam_Slug();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NODE_ID = eINSTANCE.getTeam_NodeId();

		/**
		 * The meta object literal for the '<em><b>Database Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__DATABASE_ID = eINSTANCE.getTeam_DatabaseId();

		/**
		 * The meta object literal for the '<em><b>Html Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__HTML_URL = eINSTANCE.getTeam_HtmlUrl();

		/**
		 * The meta object literal for the '<em><b>Privacy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__PRIVACY = eINSTANCE.getTeam_Privacy();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PARENT = eINSTANCE.getTeam_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CHILDREN = eINSTANCE.getTeam_Children();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MEMBERS = eINSTANCE.getTeam_Members();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__ACCESS = eINSTANCE.getTeam_Access();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.AbstractRepository <em>Abstract Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.AbstractRepository
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getAbstractRepository()
		 * @generated
		 */
		EClass ABSTRACT_REPOSITORY = eINSTANCE.getAbstractRepository();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REPOSITORY__FULL_NAME = eINSTANCE.getAbstractRepository_FullName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.RepositoryImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NODE_ID = eINSTANCE.getRepository_NodeId();

		/**
		 * The meta object literal for the '<em><b>Database Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DATABASE_ID = eINSTANCE.getRepository_DatabaseId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DESCRIPTION = eINSTANCE.getRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HOMEPAGE = eINSTANCE.getRepository_Homepage();

		/**
		 * The meta object literal for the '<em><b>Html Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HTML_URL = eINSTANCE.getRepository_HtmlUrl();

		/**
		 * The meta object literal for the '<em><b>Clone Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CLONE_URL = eINSTANCE.getRepository_CloneUrl();

		/**
		 * The meta object literal for the '<em><b>Ssh Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SSH_URL = eINSTANCE.getRepository_SshUrl();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__VISIBILITY = eINSTANCE.getRepository_Visibility();

		/**
		 * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ARCHIVED = eINSTANCE.getRepository_Archived();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DISABLED = eINSTANCE.getRepository_Disabled();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TEMPLATE = eINSTANCE.getRepository_Template();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORK = eINSTANCE.getRepository_Fork();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PARENT = eINSTANCE.getRepository_Parent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SOURCE = eINSTANCE.getRepository_Source();

		/**
		 * The meta object literal for the '<em><b>Default Branch Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DEFAULT_BRANCH_NAME = eINSTANCE.getRepository_DefaultBranchName();

		/**
		 * The meta object literal for the '<em><b>Default Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__DEFAULT_BRANCH = eINSTANCE.getRepository_DefaultBranch();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LICENSE = eINSTANCE.getRepository_License();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TOPICS = eINSTANCE.getRepository_Topics();

		/**
		 * The meta object literal for the '<em><b>Primary Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PRIMARY_LANGUAGE = eINSTANCE.getRepository_PrimaryLanguage();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CREATED_AT = eINSTANCE.getRepository_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__UPDATED_AT = eINSTANCE.getRepository_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Pushed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PUSHED_AT = eINSTANCE.getRepository_PushedAt();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SIZE = eINSTANCE.getRepository_Size();

		/**
		 * The meta object literal for the '<em><b>Stargazers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__STARGAZERS = eINSTANCE.getRepository_Stargazers();

		/**
		 * The meta object literal for the '<em><b>Watchers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__WATCHERS = eINSTANCE.getRepository_Watchers();

		/**
		 * The meta object literal for the '<em><b>Forks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORKS = eINSTANCE.getRepository_Forks();

		/**
		 * The meta object literal for the '<em><b>Open Issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OPEN_ISSUES = eINSTANCE.getRepository_OpenIssues();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__LANGUAGES = eINSTANCE.getRepository_Languages();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__BRANCHES = eINSTANCE.getRepository_Branches();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TAGS = eINSTANCE.getRepository_Tags();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__RELEASES = eINSTANCE.getRepository_Releases();

		/**
		 * The meta object literal for the '<em><b>Collaborators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COLLABORATORS = eINSTANCE.getRepository_Collaborators();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTRIBUTIONS = eINSTANCE.getRepository_Contributions();

		/**
		 * The meta object literal for the '<em><b>Code Owners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CODE_OWNERS = eINSTANCE.getRepository_CodeOwners();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.RepositoryReferenceImpl <em>Repository Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.RepositoryReferenceImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRepositoryReference()
		 * @generated
		 */
		EClass REPOSITORY_REFERENCE = eINSTANCE.getRepositoryReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_REFERENCE__TARGET = eINSTANCE.getRepositoryReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.LanguageUsageImpl <em>Language Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.LanguageUsageImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getLanguageUsage()
		 * @generated
		 */
		EClass LANGUAGE_USAGE = eINSTANCE.getLanguageUsage();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_USAGE__LANGUAGE = eINSTANCE.getLanguageUsage_Language();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_USAGE__BYTES = eINSTANCE.getLanguageUsage_Bytes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.ContributionImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__ACCOUNT = eINSTANCE.getContribution_Account();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__COMMITS = eINSTANCE.getContribution_Commits();

		/**
		 * The meta object literal for the '<em><b>First Commit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__FIRST_COMMIT = eINSTANCE.getContribution_FirstCommit();

		/**
		 * The meta object literal for the '<em><b>Last Commit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__LAST_COMMIT = eINSTANCE.getContribution_LastCommit();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.CollaboratorImpl <em>Collaborator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.CollaboratorImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getCollaborator()
		 * @generated
		 */
		EClass COLLABORATOR = eINSTANCE.getCollaborator();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATOR__ACCOUNT = eINSTANCE.getCollaborator_Account();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATOR__PERMISSION = eINSTANCE.getCollaborator_Permission();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATOR__SOURCE = eINSTANCE.getCollaborator_Source();

		/**
		 * The meta object literal for the '<em><b>Outside</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATOR__OUTSIDE = eINSTANCE.getCollaborator_Outside();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATOR__TEAM = eINSTANCE.getCollaborator_Team();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.TeamAccessImpl <em>Team Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.TeamAccessImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeamAccess()
		 * @generated
		 */
		EClass TEAM_ACCESS = eINSTANCE.getTeamAccess();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_ACCESS__REPOSITORY = eINSTANCE.getTeamAccess_Repository();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_ACCESS__PERMISSION = eINSTANCE.getTeamAccess_Permission();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.CodeOwnerRuleImpl <em>Code Owner Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.CodeOwnerRuleImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getCodeOwnerRule()
		 * @generated
		 */
		EClass CODE_OWNER_RULE = eINSTANCE.getCodeOwnerRule();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_OWNER_RULE__PATTERN = eINSTANCE.getCodeOwnerRule_Pattern();

		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_OWNER_RULE__OWNERS = eINSTANCE.getCodeOwnerRule_Owners();

		/**
		 * The meta object literal for the '<em><b>Owner Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_OWNER_RULE__OWNER_ACCOUNTS = eINSTANCE.getCodeOwnerRule_OwnerAccounts();

		/**
		 * The meta object literal for the '<em><b>Owner Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_OWNER_RULE__OWNER_TEAMS = eINSTANCE.getCodeOwnerRule_OwnerTeams();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_OWNER_RULE__LINE = eINSTANCE.getCodeOwnerRule_Line();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.RefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.RefImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRef()
		 * @generated
		 */
		EClass REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em><b>Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF__REF_NAME = eINSTANCE.getRef_RefName();

		/**
		 * The meta object literal for the '<em><b>Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF__COMMIT_SHA = eINSTANCE.getRef_CommitSha();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.BranchImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DEFAULT = eINSTANCE.getBranch_Default();

		/**
		 * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__PROTECTED = eINSTANCE.getBranch_Protected();

		/**
		 * The meta object literal for the '<em><b>Protection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__PROTECTION = eINSTANCE.getBranch_Protection();

		/**
		 * The meta object literal for the '<em><b>Ahead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__AHEAD = eINSTANCE.getBranch_Ahead();

		/**
		 * The meta object literal for the '<em><b>Behind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BEHIND = eINSTANCE.getBranch_Behind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.TagImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Annotated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__ANNOTATED = eINSTANCE.getTag_Annotated();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__MESSAGE = eINSTANCE.getTag_Message();

		/**
		 * The meta object literal for the '<em><b>Tagger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__TAGGER = eINSTANCE.getTag_Tagger();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DATE = eINSTANCE.getTag_Date();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__RELEASE = eINSTANCE.getTag_Release();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.BranchProtectionImpl <em>Branch Protection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.BranchProtectionImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getBranchProtection()
		 * @generated
		 */
		EClass BRANCH_PROTECTION = eINSTANCE.getBranchProtection();

		/**
		 * The meta object literal for the '<em><b>Required Approving Reviews</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRED_APPROVING_REVIEWS = eINSTANCE.getBranchProtection_RequiredApprovingReviews();

		/**
		 * The meta object literal for the '<em><b>Require Code Owner Review</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRE_CODE_OWNER_REVIEW = eINSTANCE.getBranchProtection_RequireCodeOwnerReview();

		/**
		 * The meta object literal for the '<em><b>Dismiss Stale Reviews</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__DISMISS_STALE_REVIEWS = eINSTANCE.getBranchProtection_DismissStaleReviews();

		/**
		 * The meta object literal for the '<em><b>Require Linear History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRE_LINEAR_HISTORY = eINSTANCE.getBranchProtection_RequireLinearHistory();

		/**
		 * The meta object literal for the '<em><b>Require Signed Commits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRE_SIGNED_COMMITS = eINSTANCE.getBranchProtection_RequireSignedCommits();

		/**
		 * The meta object literal for the '<em><b>Require Conversation Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRE_CONVERSATION_RESOLUTION = eINSTANCE.getBranchProtection_RequireConversationResolution();

		/**
		 * The meta object literal for the '<em><b>Enforce Admins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__ENFORCE_ADMINS = eINSTANCE.getBranchProtection_EnforceAdmins();

		/**
		 * The meta object literal for the '<em><b>Allow Force Pushes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__ALLOW_FORCE_PUSHES = eINSTANCE.getBranchProtection_AllowForcePushes();

		/**
		 * The meta object literal for the '<em><b>Allow Deletions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__ALLOW_DELETIONS = eINSTANCE.getBranchProtection_AllowDeletions();

		/**
		 * The meta object literal for the '<em><b>Required Status Checks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRED_STATUS_CHECKS = eINSTANCE.getBranchProtection_RequiredStatusChecks();

		/**
		 * The meta object literal for the '<em><b>Require Up To Date Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_PROTECTION__REQUIRE_UP_TO_DATE_BRANCH = eINSTANCE.getBranchProtection_RequireUpToDateBranch();

		/**
		 * The meta object literal for the '<em><b>Push Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_PROTECTION__PUSH_ACCOUNTS = eINSTANCE.getBranchProtection_PushAccounts();

		/**
		 * The meta object literal for the '<em><b>Push Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_PROTECTION__PUSH_TEAMS = eINSTANCE.getBranchProtection_PushTeams();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.ReleaseImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__NODE_ID = eINSTANCE.getRelease_NodeId();

		/**
		 * The meta object literal for the '<em><b>Database Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__DATABASE_ID = eINSTANCE.getRelease_DatabaseId();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__TAG_NAME = eINSTANCE.getRelease_TagName();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__TAG = eINSTANCE.getRelease_Tag();

		/**
		 * The meta object literal for the '<em><b>Target Commitish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__TARGET_COMMITISH = eINSTANCE.getRelease_TargetCommitish();

		/**
		 * The meta object literal for the '<em><b>Draft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__DRAFT = eINSTANCE.getRelease_Draft();

		/**
		 * The meta object literal for the '<em><b>Pre Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__PRE_RELEASE = eINSTANCE.getRelease_PreRelease();

		/**
		 * The meta object literal for the '<em><b>Html Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__HTML_URL = eINSTANCE.getRelease_HtmlUrl();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__CREATED_AT = eINSTANCE.getRelease_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Published At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__PUBLISHED_AT = eINSTANCE.getRelease_PublishedAt();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__AUTHOR = eINSTANCE.getRelease_Author();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__ASSETS = eINSTANCE.getRelease_Assets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.impl.ReleaseAssetImpl <em>Release Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.impl.ReleaseAssetImpl
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getReleaseAsset()
		 * @generated
		 */
		EClass RELEASE_ASSET = eINSTANCE.getReleaseAsset();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__LABEL = eINSTANCE.getReleaseAsset_Label();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__CONTENT_TYPE = eINSTANCE.getReleaseAsset_ContentType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__SIZE = eINSTANCE.getReleaseAsset_Size();

		/**
		 * The meta object literal for the '<em><b>Downloads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__DOWNLOADS = eINSTANCE.getReleaseAsset_Downloads();

		/**
		 * The meta object literal for the '<em><b>Download Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__DOWNLOAD_URL = eINSTANCE.getReleaseAsset_DownloadUrl();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__CREATED_AT = eINSTANCE.getReleaseAsset_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_ASSET__UPDATED_AT = eINSTANCE.getReleaseAsset_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Uploader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_ASSET__UPLOADER = eINSTANCE.getReleaseAsset_Uploader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.MembershipRole <em>Membership Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.MembershipRole
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getMembershipRole()
		 * @generated
		 */
		EEnum MEMBERSHIP_ROLE = eINSTANCE.getMembershipRole();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.TeamPrivacy <em>Team Privacy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.TeamPrivacy
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getTeamPrivacy()
		 * @generated
		 */
		EEnum TEAM_PRIVACY = eINSTANCE.getTeamPrivacy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.Visibility
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.PermissionLevel <em>Permission Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.PermissionLevel
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getPermissionLevel()
		 * @generated
		 */
		EEnum PERMISSION_LEVEL = eINSTANCE.getPermissionLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.github.PermissionSource <em>Permission Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.github.PermissionSource
		 * @see org.nasdanika.models.github.impl.GithubPackageImpl#getPermissionSource()
		 * @generated
		 */
		EEnum PERMISSION_SOURCE = eINSTANCE.getPermissionSource();

	}

} //GithubPackage
