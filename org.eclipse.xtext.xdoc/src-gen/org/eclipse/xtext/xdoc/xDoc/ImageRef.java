/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xDoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xDoc.ImageRef#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getImageRef()
 * @model
 * @generated
 */
public interface ImageRef extends MarkUp
{
  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see org.eclipse.xtext.xdoc.xDoc.XDocPackage#getImageRef_Image()
   * @model
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.xdoc.xDoc.ImageRef#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

} // ImageRef
