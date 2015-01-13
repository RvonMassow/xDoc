/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unordered List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.UnorderedList#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getUnorderedList()
 * @model
 * @generated
 */
public interface UnorderedList extends MarkUp
{
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getUnorderedList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // UnorderedList
