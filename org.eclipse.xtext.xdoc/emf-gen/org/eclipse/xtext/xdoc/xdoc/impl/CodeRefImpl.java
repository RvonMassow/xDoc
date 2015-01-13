/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmDeclaredType;

import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl#getAltText <em>Alt Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeRefImpl extends MarkUpImpl implements CodeRef
{
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected JvmDeclaredType element;

	/**
	 * The cached value of the '{@link #getAltText() <em>Alt Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltText()
	 * @generated
	 * @ordered
	 */
	protected TextOrMarkup altText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeRefImpl()
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
		return XdocPackage.Literals.CODE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType getElement()
	{
		if (element != null && element.eIsProxy())
		{
			InternalEObject oldElement = (InternalEObject)element;
			element = (JvmDeclaredType)eResolveProxy(oldElement);
			if (element != oldElement)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XdocPackage.CODE_REF__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType basicGetElement()
	{
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(JvmDeclaredType newElement)
	{
		JvmDeclaredType oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.CODE_REF__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrMarkup getAltText()
	{
		return altText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltText(TextOrMarkup newAltText, NotificationChain msgs)
	{
		TextOrMarkup oldAltText = altText;
		altText = newAltText;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.CODE_REF__ALT_TEXT, oldAltText, newAltText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltText(TextOrMarkup newAltText)
	{
		if (newAltText != altText)
		{
			NotificationChain msgs = null;
			if (altText != null)
				msgs = ((InternalEObject)altText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.CODE_REF__ALT_TEXT, null, msgs);
			if (newAltText != null)
				msgs = ((InternalEObject)newAltText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.CODE_REF__ALT_TEXT, null, msgs);
			msgs = basicSetAltText(newAltText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.CODE_REF__ALT_TEXT, newAltText, newAltText));
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
			case XdocPackage.CODE_REF__ALT_TEXT:
				return basicSetAltText(null, msgs);
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
			case XdocPackage.CODE_REF__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case XdocPackage.CODE_REF__ALT_TEXT:
				return getAltText();
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
			case XdocPackage.CODE_REF__ELEMENT:
				setElement((JvmDeclaredType)newValue);
				return;
			case XdocPackage.CODE_REF__ALT_TEXT:
				setAltText((TextOrMarkup)newValue);
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
			case XdocPackage.CODE_REF__ELEMENT:
				setElement((JvmDeclaredType)null);
				return;
			case XdocPackage.CODE_REF__ALT_TEXT:
				setAltText((TextOrMarkup)null);
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
			case XdocPackage.CODE_REF__ELEMENT:
				return element != null;
			case XdocPackage.CODE_REF__ALT_TEXT:
				return altText != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeRefImpl
