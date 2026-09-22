/**
 */
package org.nasdanika.models.github.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Load;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#getEtag <em>Etag</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.LoadImpl#isComplete <em>Complete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadImpl extends ModelElementImpl implements Load {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEtag() <em>Etag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtag()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eDynamicGet(GithubPackage.LOAD__SOURCE, GithubPackage.Literals.LOAD__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eDynamicSet(GithubPackage.LOAD__SOURCE, GithubPackage.Literals.LOAD__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return (String)eDynamicGet(GithubPackage.LOAD__REFERENCE, GithubPackage.Literals.LOAD__REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		eDynamicSet(GithubPackage.LOAD__REFERENCE, GithubPackage.Literals.LOAD__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eDynamicGet(GithubPackage.LOAD__START, GithubPackage.Literals.LOAD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eDynamicSet(GithubPackage.LOAD__START, GithubPackage.Literals.LOAD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eDynamicGet(GithubPackage.LOAD__END, GithubPackage.Literals.LOAD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eDynamicSet(GithubPackage.LOAD__END, GithubPackage.Literals.LOAD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eDynamicGet(GithubPackage.LOAD__SIZE, GithubPackage.Literals.LOAD__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eDynamicSet(GithubPackage.LOAD__SIZE, GithubPackage.Literals.LOAD__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return (String)eDynamicGet(GithubPackage.LOAD__ERROR, GithubPackage.Literals.LOAD__ERROR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		eDynamicSet(GithubPackage.LOAD__ERROR, GithubPackage.Literals.LOAD__ERROR, newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtag() {
		return (String)eDynamicGet(GithubPackage.LOAD__ETAG, GithubPackage.Literals.LOAD__ETAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtag(String newEtag) {
		eDynamicSet(GithubPackage.LOAD__ETAG, GithubPackage.Literals.LOAD__ETAG, newEtag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() {
		return (Boolean)eDynamicGet(GithubPackage.LOAD__COMPLETE, GithubPackage.Literals.LOAD__COMPLETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(boolean newComplete) {
		eDynamicSet(GithubPackage.LOAD__COMPLETE, GithubPackage.Literals.LOAD__COMPLETE, newComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.LOAD__SOURCE:
				return getSource();
			case GithubPackage.LOAD__REFERENCE:
				return getReference();
			case GithubPackage.LOAD__START:
				return getStart();
			case GithubPackage.LOAD__END:
				return getEnd();
			case GithubPackage.LOAD__SIZE:
				return getSize();
			case GithubPackage.LOAD__ERROR:
				return getError();
			case GithubPackage.LOAD__ETAG:
				return getEtag();
			case GithubPackage.LOAD__COMPLETE:
				return isComplete();
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
			case GithubPackage.LOAD__SOURCE:
				setSource((String)newValue);
				return;
			case GithubPackage.LOAD__REFERENCE:
				setReference((String)newValue);
				return;
			case GithubPackage.LOAD__START:
				setStart((Date)newValue);
				return;
			case GithubPackage.LOAD__END:
				setEnd((Date)newValue);
				return;
			case GithubPackage.LOAD__SIZE:
				setSize((Integer)newValue);
				return;
			case GithubPackage.LOAD__ERROR:
				setError((String)newValue);
				return;
			case GithubPackage.LOAD__ETAG:
				setEtag((String)newValue);
				return;
			case GithubPackage.LOAD__COMPLETE:
				setComplete((Boolean)newValue);
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
			case GithubPackage.LOAD__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case GithubPackage.LOAD__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case GithubPackage.LOAD__START:
				setStart(START_EDEFAULT);
				return;
			case GithubPackage.LOAD__END:
				setEnd(END_EDEFAULT);
				return;
			case GithubPackage.LOAD__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GithubPackage.LOAD__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case GithubPackage.LOAD__ETAG:
				setEtag(ETAG_EDEFAULT);
				return;
			case GithubPackage.LOAD__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
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
			case GithubPackage.LOAD__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case GithubPackage.LOAD__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case GithubPackage.LOAD__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case GithubPackage.LOAD__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case GithubPackage.LOAD__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case GithubPackage.LOAD__ERROR:
				return ERROR_EDEFAULT == null ? getError() != null : !ERROR_EDEFAULT.equals(getError());
			case GithubPackage.LOAD__ETAG:
				return ETAG_EDEFAULT == null ? getEtag() != null : !ETAG_EDEFAULT.equals(getEtag());
			case GithubPackage.LOAD__COMPLETE:
				return isComplete() != COMPLETE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LoadImpl
