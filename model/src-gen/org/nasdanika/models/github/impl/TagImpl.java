/**
 */
package org.nasdanika.models.github.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.github.AbstractAccount;
import org.nasdanika.models.github.GithubPackage;
import org.nasdanika.models.github.Release;
import org.nasdanika.models.github.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.github.impl.TagImpl#isAnnotated <em>Annotated</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TagImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TagImpl#getTagger <em>Tagger</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TagImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.github.impl.TagImpl#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends RefImpl implements Tag {
	/**
	 * The default value of the '{@link #isAnnotated() <em>Annotated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnnotated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANNOTATED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnnotated() {
		return (Boolean)eDynamicGet(GithubPackage.TAG__ANNOTATED, GithubPackage.Literals.TAG__ANNOTATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotated(boolean newAnnotated) {
		eDynamicSet(GithubPackage.TAG__ANNOTATED, GithubPackage.Literals.TAG__ANNOTATED, newAnnotated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return (String)eDynamicGet(GithubPackage.TAG__MESSAGE, GithubPackage.Literals.TAG__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eDynamicSet(GithubPackage.TAG__MESSAGE, GithubPackage.Literals.TAG__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount getTagger() {
		return (AbstractAccount)eDynamicGet(GithubPackage.TAG__TAGGER, GithubPackage.Literals.TAG__TAGGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAccount basicGetTagger() {
		return (AbstractAccount)eDynamicGet(GithubPackage.TAG__TAGGER, GithubPackage.Literals.TAG__TAGGER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagger(AbstractAccount newTagger) {
		eDynamicSet(GithubPackage.TAG__TAGGER, GithubPackage.Literals.TAG__TAGGER, newTagger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eDynamicGet(GithubPackage.TAG__DATE, GithubPackage.Literals.TAG__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eDynamicSet(GithubPackage.TAG__DATE, GithubPackage.Literals.TAG__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release getRelease() {
		return (Release)eDynamicGet(GithubPackage.TAG__RELEASE, GithubPackage.Literals.TAG__RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release basicGetRelease() {
		return (Release)eDynamicGet(GithubPackage.TAG__RELEASE, GithubPackage.Literals.TAG__RELEASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelease(Release newRelease, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRelease, GithubPackage.TAG__RELEASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(Release newRelease) {
		eDynamicSet(GithubPackage.TAG__RELEASE, GithubPackage.Literals.TAG__RELEASE, newRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.TAG__RELEASE:
				Release release = basicGetRelease();
				if (release != null)
					msgs = ((InternalEObject)release).eInverseRemove(this, GithubPackage.RELEASE__TAG, Release.class, msgs);
				return basicSetRelease((Release)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.TAG__RELEASE:
				return basicSetRelease(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.TAG__ANNOTATED:
				return isAnnotated();
			case GithubPackage.TAG__MESSAGE:
				return getMessage();
			case GithubPackage.TAG__TAGGER:
				if (resolve) return getTagger();
				return basicGetTagger();
			case GithubPackage.TAG__DATE:
				return getDate();
			case GithubPackage.TAG__RELEASE:
				if (resolve) return getRelease();
				return basicGetRelease();
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
			case GithubPackage.TAG__ANNOTATED:
				setAnnotated((Boolean)newValue);
				return;
			case GithubPackage.TAG__MESSAGE:
				setMessage((String)newValue);
				return;
			case GithubPackage.TAG__TAGGER:
				setTagger((AbstractAccount)newValue);
				return;
			case GithubPackage.TAG__DATE:
				setDate((Date)newValue);
				return;
			case GithubPackage.TAG__RELEASE:
				setRelease((Release)newValue);
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
			case GithubPackage.TAG__ANNOTATED:
				setAnnotated(ANNOTATED_EDEFAULT);
				return;
			case GithubPackage.TAG__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case GithubPackage.TAG__TAGGER:
				setTagger((AbstractAccount)null);
				return;
			case GithubPackage.TAG__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GithubPackage.TAG__RELEASE:
				setRelease((Release)null);
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
			case GithubPackage.TAG__ANNOTATED:
				return isAnnotated() != ANNOTATED_EDEFAULT;
			case GithubPackage.TAG__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
			case GithubPackage.TAG__TAGGER:
				return basicGetTagger() != null;
			case GithubPackage.TAG__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case GithubPackage.TAG__RELEASE:
				return basicGetRelease() != null;
		}
		return super.eIsSet(featureID);
	}

} //TagImpl
