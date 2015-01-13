/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Glossary;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getLangDefs <em>Lang Defs</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends AbstractSectionImpl implements Document
{
	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected TextOrMarkup subtitle;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected TextOrMarkup authors;

	/**
	 * The cached value of the '{@link #getChapters() <em>Chapters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapters()
	 * @generated
	 * @ordered
	 */
	protected EList<Chapter> chapters;

	/**
	 * The cached value of the '{@link #getLangDefs() <em>Lang Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<LangDef> langDefs;

	/**
	 * The cached value of the '{@link #getGlossary() <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossary()
	 * @generated
	 * @ordered
	 */
	protected Glossary glossary;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl()
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
		return XdocPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrMarkup getSubtitle()
	{
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(TextOrMarkup newSubtitle, NotificationChain msgs)
	{
		TextOrMarkup oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__SUBTITLE, oldSubtitle, newSubtitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(TextOrMarkup newSubtitle)
	{
		if (newSubtitle != subtitle)
		{
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrMarkup getAuthors()
	{
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(TextOrMarkup newAuthors, NotificationChain msgs)
	{
		TextOrMarkup oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__AUTHORS, oldAuthors, newAuthors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthors(TextOrMarkup newAuthors)
	{
		if (newAuthors != authors)
		{
			NotificationChain msgs = null;
			if (authors != null)
				msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__AUTHORS, null, msgs);
			if (newAuthors != null)
				msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__AUTHORS, null, msgs);
			msgs = basicSetAuthors(newAuthors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__AUTHORS, newAuthors, newAuthors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chapter> getChapters()
	{
		if (chapters == null)
		{
			chapters = new EObjectContainmentEList<Chapter>(Chapter.class, this, XdocPackage.DOCUMENT__CHAPTERS);
		}
		return chapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LangDef> getLangDefs()
	{
		if (langDefs == null)
		{
			langDefs = new EObjectContainmentEList<LangDef>(LangDef.class, this, XdocPackage.DOCUMENT__LANG_DEFS);
		}
		return langDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary getGlossary()
	{
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(Glossary newGlossary, NotificationChain msgs)
	{
		Glossary oldGlossary = glossary;
		glossary = newGlossary;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__GLOSSARY, oldGlossary, newGlossary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlossary(Glossary newGlossary)
	{
		if (newGlossary != glossary)
		{
			NotificationChain msgs = null;
			if (glossary != null)
				msgs = ((InternalEObject)glossary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__GLOSSARY, null, msgs);
			if (newGlossary != null)
				msgs = ((InternalEObject)newGlossary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.DOCUMENT__GLOSSARY, null, msgs);
			msgs = basicSetGlossary(newGlossary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.DOCUMENT__GLOSSARY, newGlossary, newGlossary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts()
	{
		if (parts == null)
		{
			parts = new EObjectContainmentEList<Part>(Part.class, this, XdocPackage.DOCUMENT__PARTS);
		}
		return parts;
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
			case XdocPackage.DOCUMENT__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case XdocPackage.DOCUMENT__AUTHORS:
				return basicSetAuthors(null, msgs);
			case XdocPackage.DOCUMENT__CHAPTERS:
				return ((InternalEList<?>)getChapters()).basicRemove(otherEnd, msgs);
			case XdocPackage.DOCUMENT__LANG_DEFS:
				return ((InternalEList<?>)getLangDefs()).basicRemove(otherEnd, msgs);
			case XdocPackage.DOCUMENT__GLOSSARY:
				return basicSetGlossary(null, msgs);
			case XdocPackage.DOCUMENT__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case XdocPackage.DOCUMENT__SUBTITLE:
				return getSubtitle();
			case XdocPackage.DOCUMENT__AUTHORS:
				return getAuthors();
			case XdocPackage.DOCUMENT__CHAPTERS:
				return getChapters();
			case XdocPackage.DOCUMENT__LANG_DEFS:
				return getLangDefs();
			case XdocPackage.DOCUMENT__GLOSSARY:
				return getGlossary();
			case XdocPackage.DOCUMENT__PARTS:
				return getParts();
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
			case XdocPackage.DOCUMENT__SUBTITLE:
				setSubtitle((TextOrMarkup)newValue);
				return;
			case XdocPackage.DOCUMENT__AUTHORS:
				setAuthors((TextOrMarkup)newValue);
				return;
			case XdocPackage.DOCUMENT__CHAPTERS:
				getChapters().clear();
				getChapters().addAll((Collection<? extends Chapter>)newValue);
				return;
			case XdocPackage.DOCUMENT__LANG_DEFS:
				getLangDefs().clear();
				getLangDefs().addAll((Collection<? extends LangDef>)newValue);
				return;
			case XdocPackage.DOCUMENT__GLOSSARY:
				setGlossary((Glossary)newValue);
				return;
			case XdocPackage.DOCUMENT__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
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
			case XdocPackage.DOCUMENT__SUBTITLE:
				setSubtitle((TextOrMarkup)null);
				return;
			case XdocPackage.DOCUMENT__AUTHORS:
				setAuthors((TextOrMarkup)null);
				return;
			case XdocPackage.DOCUMENT__CHAPTERS:
				getChapters().clear();
				return;
			case XdocPackage.DOCUMENT__LANG_DEFS:
				getLangDefs().clear();
				return;
			case XdocPackage.DOCUMENT__GLOSSARY:
				setGlossary((Glossary)null);
				return;
			case XdocPackage.DOCUMENT__PARTS:
				getParts().clear();
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
			case XdocPackage.DOCUMENT__SUBTITLE:
				return subtitle != null;
			case XdocPackage.DOCUMENT__AUTHORS:
				return authors != null;
			case XdocPackage.DOCUMENT__CHAPTERS:
				return chapters != null && !chapters.isEmpty();
			case XdocPackage.DOCUMENT__LANG_DEFS:
				return langDefs != null && !langDefs.isEmpty();
			case XdocPackage.DOCUMENT__GLOSSARY:
				return glossary != null;
			case XdocPackage.DOCUMENT__PARTS:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
