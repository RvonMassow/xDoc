/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.Document#getChapters <em>Chapters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends AbstractSection
{
	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(TextOrMarkup)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Subtitle()
	 * @model containment="true"
	 * @generated
	 */
	TextOrMarkup getSubtitle();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.Document#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(TextOrMarkup value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(TextOrMarkup)
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Authors()
	 * @model containment="true"
	 * @generated
	 */
	TextOrMarkup getAuthors();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.xdoc.xdoc.Document#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(TextOrMarkup value);

	/**
	 * Returns the value of the '<em><b>Chapters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xdoc.xdoc.Chapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapters</em>' containment reference list.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage#getDocument_Chapters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chapter> getChapters();

} // Document
