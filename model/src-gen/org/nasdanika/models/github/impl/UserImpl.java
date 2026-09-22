/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#getBio <em>Bio</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#getBlog <em>Blog</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#isSiteAdmin <em>Site Admin</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#isBot <em>Bot</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.UserImpl#isInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends AccountImpl implements User {
	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBio() <em>Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBio()
	 * @generated
	 * @ordered
	 */
	protected static final String BIO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBlog() <em>Blog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlog()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isSiteAdmin() <em>Site Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSiteAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SITE_ADMIN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isBot() <em>Bot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInactive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INACTIVE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return (String)eDynamicGet(GithubPackage.USER__COMPANY, GithubPackage.Literals.USER__COMPANY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		eDynamicSet(GithubPackage.USER__COMPANY, GithubPackage.Literals.USER__COMPANY, newCompany);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eDynamicGet(GithubPackage.USER__LOCATION, GithubPackage.Literals.USER__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eDynamicSet(GithubPackage.USER__LOCATION, GithubPackage.Literals.USER__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBio() {
		return (String)eDynamicGet(GithubPackage.USER__BIO, GithubPackage.Literals.USER__BIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBio(String newBio) {
		eDynamicSet(GithubPackage.USER__BIO, GithubPackage.Literals.USER__BIO, newBio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlog() {
		return (String)eDynamicGet(GithubPackage.USER__BLOG, GithubPackage.Literals.USER__BLOG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlog(String newBlog) {
		eDynamicSet(GithubPackage.USER__BLOG, GithubPackage.Literals.USER__BLOG, newBlog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSiteAdmin() {
		return (Boolean)eDynamicGet(GithubPackage.USER__SITE_ADMIN, GithubPackage.Literals.USER__SITE_ADMIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAdmin(boolean newSiteAdmin) {
		eDynamicSet(GithubPackage.USER__SITE_ADMIN, GithubPackage.Literals.USER__SITE_ADMIN, newSiteAdmin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBot() {
		return (Boolean)eDynamicGet(GithubPackage.USER__BOT, GithubPackage.Literals.USER__BOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBot(boolean newBot) {
		eDynamicSet(GithubPackage.USER__BOT, GithubPackage.Literals.USER__BOT, newBot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInactive() {
		return (Boolean)eDynamicGet(GithubPackage.USER__INACTIVE, GithubPackage.Literals.USER__INACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(boolean newInactive) {
		eDynamicSet(GithubPackage.USER__INACTIVE, GithubPackage.Literals.USER__INACTIVE, newInactive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.USER__COMPANY:
				return getCompany();
			case GithubPackage.USER__LOCATION:
				return getLocation();
			case GithubPackage.USER__BIO:
				return getBio();
			case GithubPackage.USER__BLOG:
				return getBlog();
			case GithubPackage.USER__SITE_ADMIN:
				return isSiteAdmin();
			case GithubPackage.USER__BOT:
				return isBot();
			case GithubPackage.USER__INACTIVE:
				return isInactive();
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
			case GithubPackage.USER__COMPANY:
				setCompany((String)newValue);
				return;
			case GithubPackage.USER__LOCATION:
				setLocation((String)newValue);
				return;
			case GithubPackage.USER__BIO:
				setBio((String)newValue);
				return;
			case GithubPackage.USER__BLOG:
				setBlog((String)newValue);
				return;
			case GithubPackage.USER__SITE_ADMIN:
				setSiteAdmin((Boolean)newValue);
				return;
			case GithubPackage.USER__BOT:
				setBot((Boolean)newValue);
				return;
			case GithubPackage.USER__INACTIVE:
				setInactive((Boolean)newValue);
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
			case GithubPackage.USER__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case GithubPackage.USER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GithubPackage.USER__BIO:
				setBio(BIO_EDEFAULT);
				return;
			case GithubPackage.USER__BLOG:
				setBlog(BLOG_EDEFAULT);
				return;
			case GithubPackage.USER__SITE_ADMIN:
				setSiteAdmin(SITE_ADMIN_EDEFAULT);
				return;
			case GithubPackage.USER__BOT:
				setBot(BOT_EDEFAULT);
				return;
			case GithubPackage.USER__INACTIVE:
				setInactive(INACTIVE_EDEFAULT);
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
			case GithubPackage.USER__COMPANY:
				return COMPANY_EDEFAULT == null ? getCompany() != null : !COMPANY_EDEFAULT.equals(getCompany());
			case GithubPackage.USER__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case GithubPackage.USER__BIO:
				return BIO_EDEFAULT == null ? getBio() != null : !BIO_EDEFAULT.equals(getBio());
			case GithubPackage.USER__BLOG:
				return BLOG_EDEFAULT == null ? getBlog() != null : !BLOG_EDEFAULT.equals(getBlog());
			case GithubPackage.USER__SITE_ADMIN:
				return isSiteAdmin() != SITE_ADMIN_EDEFAULT;
			case GithubPackage.USER__BOT:
				return isBot() != BOT_EDEFAULT;
			case GithubPackage.USER__INACTIVE:
				return isInactive() != INACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
