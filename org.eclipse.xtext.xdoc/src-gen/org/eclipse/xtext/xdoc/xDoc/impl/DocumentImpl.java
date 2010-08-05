/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xDoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xdoc.xDoc.Chapter;
import org.eclipse.xtext.xdoc.xDoc.Document;
import org.eclipse.xtext.xdoc.xDoc.Section;
import org.eclipse.xtext.xdoc.xDoc.SubSection;
import org.eclipse.xtext.xdoc.xDoc.XDocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.impl.DocumentImpl#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.impl.DocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.impl.DocumentImpl#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document
{
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
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<Section> sections;

  /**
   * The cached value of the '{@link #getSubsections() <em>Subsections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsections()
   * @generated
   * @ordered
   */
  protected EList<SubSection> subsections;

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
    return XDocPackage.Literals.DOCUMENT;
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
      chapters = new EObjectContainmentEList<Chapter>(Chapter.class, this, XDocPackage.DOCUMENT__CHAPTERS);
    }
    return chapters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Section> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<Section>(Section.class, this, XDocPackage.DOCUMENT__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubSection> getSubsections()
  {
    if (subsections == null)
    {
      subsections = new EObjectContainmentEList<SubSection>(SubSection.class, this, XDocPackage.DOCUMENT__SUBSECTIONS);
    }
    return subsections;
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
      case XDocPackage.DOCUMENT__CHAPTERS:
        return ((InternalEList<?>)getChapters()).basicRemove(otherEnd, msgs);
      case XDocPackage.DOCUMENT__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
      case XDocPackage.DOCUMENT__SUBSECTIONS:
        return ((InternalEList<?>)getSubsections()).basicRemove(otherEnd, msgs);
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
      case XDocPackage.DOCUMENT__CHAPTERS:
        return getChapters();
      case XDocPackage.DOCUMENT__SECTIONS:
        return getSections();
      case XDocPackage.DOCUMENT__SUBSECTIONS:
        return getSubsections();
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
      case XDocPackage.DOCUMENT__CHAPTERS:
        getChapters().clear();
        getChapters().addAll((Collection<? extends Chapter>)newValue);
        return;
      case XDocPackage.DOCUMENT__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends Section>)newValue);
        return;
      case XDocPackage.DOCUMENT__SUBSECTIONS:
        getSubsections().clear();
        getSubsections().addAll((Collection<? extends SubSection>)newValue);
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
      case XDocPackage.DOCUMENT__CHAPTERS:
        getChapters().clear();
        return;
      case XDocPackage.DOCUMENT__SECTIONS:
        getSections().clear();
        return;
      case XDocPackage.DOCUMENT__SUBSECTIONS:
        getSubsections().clear();
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
      case XDocPackage.DOCUMENT__CHAPTERS:
        return chapters != null && !chapters.isEmpty();
      case XDocPackage.DOCUMENT__SECTIONS:
        return sections != null && !sections.isEmpty();
      case XDocPackage.DOCUMENT__SUBSECTIONS:
        return subsections != null && !subsections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DocumentImpl
