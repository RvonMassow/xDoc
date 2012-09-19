/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.XdocFile#getMainSection <em>Main Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getXdocFile()
 * @model
 * @generated
 */
public interface XdocFile extends EObject
{
	/**
	 * Returns the value of the '<em><b>Main Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Section</em>' containment reference.
	 * @see #setMainSection(AbstractSection)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getXdocFile_MainSection()
	 * @model containment="true"
	 * @generated
	 */
	AbstractSection getMainSection();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.XdocFile#getMainSection <em>Main Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Section</em>' containment reference.
	 * @see #getMainSection()
	 * @generated
	 */
	void setMainSection(AbstractSection value);

} // XdocFile
