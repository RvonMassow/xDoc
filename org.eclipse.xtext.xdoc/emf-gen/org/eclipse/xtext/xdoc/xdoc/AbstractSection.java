/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getAbstractSection()
 * @model
 * @generated
 */
public interface AbstractSection extends Identifiable
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
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getAbstractSection_Title()
	 * @model containment="true"
	 * @generated
	 */
	TextOrMarkup getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TextOrMarkup value);

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
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getAbstractSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextOrMarkup> getContents();

} // AbstractSection
