/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.xtext.common.types.JvmIdentifyableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getCodeRef()
 * @model
 * @generated
 */
public interface CodeRef extends MarkUp
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(JvmIdentifyableElement)
   * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getCodeRef_Element()
   * @model
   * @generated
   */
  JvmIdentifyableElement getElement();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(JvmIdentifyableElement value);

} // CodeRef
