/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractRepository;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.PermissionLevel;
import org.nasdanika.models.github.TeamAccess;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.TeamAccessImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TeamAccessImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamAccessImpl extends ModelElementImpl implements TeamAccess {
	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionLevel PERMISSION_EDEFAULT = PermissionLevel.READ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.TEAM_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository getRepository() {
		return (AbstractRepository)eDynamicGet(GithubPackage.TEAM_ACCESS__REPOSITORY, GithubPackage.Literals.TEAM_ACCESS__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRepository basicGetRepository() {
		return (AbstractRepository)eDynamicGet(GithubPackage.TEAM_ACCESS__REPOSITORY, GithubPackage.Literals.TEAM_ACCESS__REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(AbstractRepository newRepository) {
		eDynamicSet(GithubPackage.TEAM_ACCESS__REPOSITORY, GithubPackage.Literals.TEAM_ACCESS__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel getPermission() {
		return (PermissionLevel)eDynamicGet(GithubPackage.TEAM_ACCESS__PERMISSION, GithubPackage.Literals.TEAM_ACCESS__PERMISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(PermissionLevel newPermission) {
		eDynamicSet(GithubPackage.TEAM_ACCESS__PERMISSION, GithubPackage.Literals.TEAM_ACCESS__PERMISSION, newPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.TEAM_ACCESS__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case GithubPackage.TEAM_ACCESS__PERMISSION:
				return getPermission();
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
			case GithubPackage.TEAM_ACCESS__REPOSITORY:
				setRepository((AbstractRepository)newValue);
				return;
			case GithubPackage.TEAM_ACCESS__PERMISSION:
				setPermission((PermissionLevel)newValue);
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
			case GithubPackage.TEAM_ACCESS__REPOSITORY:
				setRepository((AbstractRepository)null);
				return;
			case GithubPackage.TEAM_ACCESS__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
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
			case GithubPackage.TEAM_ACCESS__REPOSITORY:
				return basicGetRepository() != null;
			case GithubPackage.TEAM_ACCESS__PERMISSION:
				return getPermission() != PERMISSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TeamAccessImpl
