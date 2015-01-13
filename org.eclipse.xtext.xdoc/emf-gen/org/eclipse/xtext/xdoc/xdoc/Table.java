/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Table#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends MarkUp
{
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.TableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // Table
