/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xdoc.xdoc.Glossary;
import org.eclipse.xtext.xdoc.xdoc.GlossaryEntry;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.GlossaryImpl#getGlossaryEntry <em>Glossary Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryImpl extends MinimalEObjectImpl.Container implements Glossary
{
	/**
	 * The cached value of the '{@link #getGlossaryEntry() <em>Glossary Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossaryEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossaryEntry> glossaryEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryImpl()
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
		return XdocPackage.Literals.GLOSSARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlossaryEntry> getGlossaryEntry()
	{
		if (glossaryEntry == null)
		{
			glossaryEntry = new EObjectContainmentEList<GlossaryEntry>(GlossaryEntry.class, this, XdocPackage.GLOSSARY__GLOSSARY_ENTRY);
		}
		return glossaryEntry;
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
			case XdocPackage.GLOSSARY__GLOSSARY_ENTRY:
				return ((InternalEList<?>)getGlossaryEntry()).basicRemove(otherEnd, msgs);
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
			case XdocPackage.GLOSSARY__GLOSSARY_ENTRY:
				return getGlossaryEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XdocPackage.GLOSSARY__GLOSSARY_ENTRY:
				getGlossaryEntry().clear();
				getGlossaryEntry().addAll((Collection<? extends GlossaryEntry>)newValue);
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
			case XdocPackage.GLOSSARY__GLOSSARY_ENTRY:
				getGlossaryEntry().clear();
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
			case XdocPackage.GLOSSARY__GLOSSARY_ENTRY:
				return glossaryEntry != null && !glossaryEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlossaryImpl
