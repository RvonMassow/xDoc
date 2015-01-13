/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Ref#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Ref#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getRef()
 * @model
 * @generated
 */
public interface Ref extends MarkUp, MarkupInCode
{
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Identifiable)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getRef_Ref()
	 * @model
	 * @generated
	 */
	Identifiable getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.Ref#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Identifiable value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.TextOrMarkup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getRef_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextOrMarkup> getContents();

} // Ref
