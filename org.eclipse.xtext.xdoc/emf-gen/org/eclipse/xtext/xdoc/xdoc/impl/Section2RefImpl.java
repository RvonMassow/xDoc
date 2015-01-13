/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section2 Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.Section2RefImpl#getSection2 <em>Section2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Section2RefImpl extends Section2Impl implements Section2Ref
{
	/**
	 * The cached value of the '{@link #getSection2() <em>Section2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection2()
	 * @generated
	 * @ordered
	 */
	protected Section2 section2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Section2RefImpl()
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
		return XdocPackage.Literals.SECTION2_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section2 getSection2()
	{
		if (section2 != null && section2.eIsProxy())
		{
			InternalEObject oldSection2 = (InternalEObject)section2;
			section2 = (Section2)eResolveProxy(oldSection2);
			if (section2 != oldSection2)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdocPackage.SECTION2_REF__SECTION2, oldSection2, section2));
			}
		}
		return section2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section2 basicGetSection2()
	{
		return section2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection2(Section2 newSection2)
	{
		Section2 oldSection2 = section2;
		section2 = newSection2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.SECTION2_REF__SECTION2, oldSection2, section2));
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
			case XdocPackage.SECTION2_REF__SECTION2:
				if (resolve) return getSection2();
				return basicGetSection2();
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
			case XdocPackage.SECTION2_REF__SECTION2:
				setSection2((Section2)newValue);
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
			case XdocPackage.SECTION2_REF__SECTION2:
				setSection2((Section2)null);
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
			case XdocPackage.SECTION2_REF__SECTION2:
				return section2 != null;
		}
		return super.eIsSet(featureID);
	}

} //Section2RefImpl
