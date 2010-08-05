/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xDoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.Document#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.Document#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.Document#getSubsections <em>Subsections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Chapters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xDoc.Chapter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapters</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getDocument_Chapters()
   * @model containment="true"
   * @generated
   */
  EList<Chapter> getChapters();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xDoc.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getDocument_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

  /**
   * Returns the value of the '<em><b>Subsections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xdoc.xDoc.SubSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsections</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getDocument_Subsections()
   * @model containment="true"
   * @generated
   */
  EList<SubSection> getSubsections();

} // Document
