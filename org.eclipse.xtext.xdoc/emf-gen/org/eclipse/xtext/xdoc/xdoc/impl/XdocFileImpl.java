/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.XdocFileImpl#getMainSection <em>Main Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XdocFileImpl extends MinimalEObjectImpl.Container implements XdocFile
{
	/**
	 * The cached value of the '{@link #getMainSection() <em>Main Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainSection()
	 * @generated
	 * @ordered
	 */
	protected AbstractSection mainSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XdocFileImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return XdocPackage.Literals.XDOC_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSection getMainSection()
	{
		return mainSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainSection(AbstractSection newMainSection, NotificationChain msgs)
	{
		AbstractSection oldMainSection = mainSection;
		mainSection = newMainSection;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.XDOC_FILE__MAIN_SECTION, oldMainSection, newMainSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainSection(AbstractSection newMainSection)
	{
		if (newMainSection != mainSection)
		{
			NotificationChain msgs = null;
			if (mainSection != null)
				msgs = ((InternalEObject)mainSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.XDOC_FILE__MAIN_SECTION, null, msgs);
			if (newMainSection != null)
				msgs = ((InternalEObject)newMainSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.XDOC_FILE__MAIN_SECTION, null, msgs);
			msgs = basicSetMainSection(newMainSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.XDOC_FILE__MAIN_SECTION, newMainSection, newMainSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case XdocPackage.XDOC_FILE__MAIN_SECTION:
				return basicSetMainSection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case XdocPackage.XDOC_FILE__MAIN_SECTION:
				return getMainSection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XdocPackage.XDOC_FILE__MAIN_SECTION:
				setMainSection((AbstractSection)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case XdocPackage.XDOC_FILE__MAIN_SECTION:
				setMainSection((AbstractSection)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case XdocPackage.XDOC_FILE__MAIN_SECTION:
				return mainSection != null;
		}
		return super.eIsSet(featureID);
	}

} //XdocFileImpl
