/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getAltText <em>Alt Text</em>}</li>
 * </ul>
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
	 * @see #setElement(JvmDeclaredType)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getCodeRef_Element()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(JvmDeclaredType value);

	/**
	 * Returns the value of the '<em><b>Alt Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Text</em>' containment reference.
	 * @see #setAltText(TextOrMarkup)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getCodeRef_AltText()
	 * @model containment="true"
	 * @generated
	 */
	TextOrMarkup getAltText();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getAltText <em>Alt Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Text</em>' containment reference.
	 * @see #getAltText()
	 * @generated
	 */
	void setAltText(TextOrMarkup value);

} // CodeRef
