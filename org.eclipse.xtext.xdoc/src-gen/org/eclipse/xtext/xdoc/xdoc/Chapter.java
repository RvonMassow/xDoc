/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getChapter()
 * @model
 * @generated
 */
public interface Chapter extends Identifiable
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(TextOrMarkup)
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getChapter_Title()
   * @model containment="true"
   * @generated
   */
  TextOrMarkup getTitle();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(TextOrMarkup value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getChapter_Contents()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getContents();

} // Chapter
