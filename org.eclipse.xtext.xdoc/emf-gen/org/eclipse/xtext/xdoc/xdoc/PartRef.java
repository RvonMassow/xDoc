/**
 */
package org.eclipse.xtext.xdoc.xdoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.PartRef#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getPartRef()
 * @model
 * @generated
 */
public interface PartRef extends Part
{
	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Part)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getPartRef_Part()
	 * @model
	 * @generated
	 */
	Part getPart();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.PartRef#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Part value);

} // PartRef
