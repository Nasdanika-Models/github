/**
 */
package org.nasdanika.models.github.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.Collaborator;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.PermissionLevel;
import org.nasdanika.models.github.PermissionSource;
import org.nasdanika.models.github.Team;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.CollaboratorImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CollaboratorImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CollaboratorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CollaboratorImpl#isOutside <em>Outside</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.CollaboratorImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaboratorImpl extends ModelElementImpl implements Collaborator {
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
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionSource SOURCE_EDEFAULT = PermissionSource.DIRECT;

	/**
	 * The default value of the '{@link #isOutside() <em>Outside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutside()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTSIDE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaboratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.COLLABORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.COLLABORATOR__ACCOUNT, GithubPackage.Literals.COLLABORATOR__ACCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetAccount() {
		return (AbstractAccount)eDynamicGet(GithubPackage.COLLABORATOR__ACCOUNT, GithubPackage.Literals.COLLABORATOR__ACCOUNT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(AbstractAccount newAccount) {
		eDynamicSet(GithubPackage.COLLABORATOR__ACCOUNT, GithubPackage.Literals.COLLABORATOR__ACCOUNT, newAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel getPermission() {
		return (PermissionLevel)eDynamicGet(GithubPackage.COLLABORATOR__PERMISSION, GithubPackage.Literals.COLLABORATOR__PERMISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(PermissionLevel newPermission) {
		eDynamicSet(GithubPackage.COLLABORATOR__PERMISSION, GithubPackage.Literals.COLLABORATOR__PERMISSION, newPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionSource getSource() {
		return (PermissionSource)eDynamicGet(GithubPackage.COLLABORATOR__SOURCE, GithubPackage.Literals.COLLABORATOR__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PermissionSource newSource) {
		eDynamicSet(GithubPackage.COLLABORATOR__SOURCE, GithubPackage.Literals.COLLABORATOR__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutside() {
		return (Boolean)eDynamicGet(GithubPackage.COLLABORATOR__OUTSIDE, GithubPackage.Literals.COLLABORATOR__OUTSIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutside(boolean newOutside) {
		eDynamicSet(GithubPackage.COLLABORATOR__OUTSIDE, GithubPackage.Literals.COLLABORATOR__OUTSIDE, newOutside);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		return (Team)eDynamicGet(GithubPackage.COLLABORATOR__TEAM, GithubPackage.Literals.COLLABORATOR__TEAM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return (Team)eDynamicGet(GithubPackage.COLLABORATOR__TEAM, GithubPackage.Literals.COLLABORATOR__TEAM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		eDynamicSet(GithubPackage.COLLABORATOR__TEAM, GithubPackage.Literals.COLLABORATOR__TEAM, newTeam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.COLLABORATOR__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case GithubPackage.COLLABORATOR__PERMISSION:
				return getPermission();
			case GithubPackage.COLLABORATOR__SOURCE:
				return getSource();
			case GithubPackage.COLLABORATOR__OUTSIDE:
				return isOutside();
			case GithubPackage.COLLABORATOR__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
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
			case GithubPackage.COLLABORATOR__ACCOUNT:
				setAccount((AbstractAccount)newValue);
				return;
			case GithubPackage.COLLABORATOR__PERMISSION:
				setPermission((PermissionLevel)newValue);
				return;
			case GithubPackage.COLLABORATOR__SOURCE:
				setSource((PermissionSource)newValue);
				return;
			case GithubPackage.COLLABORATOR__OUTSIDE:
				setOutside((Boolean)newValue);
				return;
			case GithubPackage.COLLABORATOR__TEAM:
				setTeam((Team)newValue);
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
			case GithubPackage.COLLABORATOR__ACCOUNT:
				setAccount((AbstractAccount)null);
				return;
			case GithubPackage.COLLABORATOR__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
			case GithubPackage.COLLABORATOR__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case GithubPackage.COLLABORATOR__OUTSIDE:
				setOutside(OUTSIDE_EDEFAULT);
				return;
			case GithubPackage.COLLABORATOR__TEAM:
				setTeam((Team)null);
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
			case GithubPackage.COLLABORATOR__ACCOUNT:
				return basicGetAccount() != null;
			case GithubPackage.COLLABORATOR__PERMISSION:
				return getPermission() != PERMISSION_EDEFAULT;
			case GithubPackage.COLLABORATOR__SOURCE:
				return getSource() != SOURCE_EDEFAULT;
			case GithubPackage.COLLABORATOR__OUTSIDE:
				return isOutside() != OUTSIDE_EDEFAULT;
			case GithubPackage.COLLABORATOR__TEAM:
				return basicGetTeam() != null;
		}
		return super.eIsSet(featureID);
	}

} //CollaboratorImpl
