/**
 */
package org.eclipse.xtext.xdoc.xdoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.SectionRef#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getSectionRef()
 * @model
 * @generated
 */
public interface SectionRef extends Section
{
	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(Section)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getSectionRef_Section()
	 * @model
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.SectionRef#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

} // SectionRef
