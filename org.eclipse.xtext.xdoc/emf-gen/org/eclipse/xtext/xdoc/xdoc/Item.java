/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Item#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
{
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
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getItem_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextOrMarkup> getContents();

} // Item
