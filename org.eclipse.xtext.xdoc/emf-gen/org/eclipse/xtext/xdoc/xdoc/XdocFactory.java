/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage
 * @generated
 */
public interface XdocFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XdocFactory eINSTANCE = org.eclipse.xtext.xdoc.xdoc.impl.XdocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	XdocFile createXdocFile();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chapter</em>'.
	 * @generated
	 */
	Chapter createChapter();

	/**
	 * Returns a new object of class '<em>Chapter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chapter Ref</em>'.
	 * @generated
	 */
	ChapterRef createChapterRef();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Section Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Ref</em>'.
	 * @generated
	 */
	SectionRef createSectionRef();

	/**
	 * Returns a new object of class '<em>Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section2</em>'.
	 * @generated
	 */
	Section2 createSection2();

	/**
	 * Returns a new object of class '<em>Section2 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section2 Ref</em>'.
	 * @generated
	 */
	Section2Ref createSection2Ref();

	/**
	 * Returns a new object of class '<em>Section3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section3</em>'.
	 * @generated
	 */
	Section3 createSection3();

	/**
	 * Returns a new object of class '<em>Section4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section4</em>'.
	 * @generated
	 */
	Section4 createSection4();

	/**
	 * Returns a new object of class '<em>Abstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Section</em>'.
	 * @generated
	 */
	AbstractSection createAbstractSection();

	/**
	 * Returns a new object of class '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifiable</em>'.
	 * @generated
	 */
	Identifiable createIdentifiable();

	/**
	 * Returns a new object of class '<em>Text Or Markup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Or Markup</em>'.
	 * @generated
	 */
	TextOrMarkup createTextOrMarkup();

	/**
	 * Returns a new object of class '<em>Text Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Part</em>'.
	 * @generated
	 */
	TextPart createTextPart();

	/**
	 * Returns a new object of class '<em>Mark Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Up</em>'.
	 * @generated
	 */
	MarkUp createMarkUp();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns a new object of class '<em>Table Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Data</em>'.
	 * @generated
	 */
	TableData createTableData();

	/**
	 * Returns a new object of class '<em>Emphasize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emphasize</em>'.
	 * @generated
	 */
	Emphasize createEmphasize();

	/**
	 * Returns a new object of class '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anchor</em>'.
	 * @generated
	 */
	Anchor createAnchor();

	/**
	 * Returns a new object of class '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref</em>'.
	 * @generated
	 */
	Ref createRef();

	/**
	 * Returns a new object of class '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered List</em>'.
	 * @generated
	 */
	OrderedList createOrderedList();

	/**
	 * Returns a new object of class '<em>Unordered List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unordered List</em>'.
	 * @generated
	 */
	UnorderedList createUnorderedList();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Code Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Ref</em>'.
	 * @generated
	 */
	CodeRef createCodeRef();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Image Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Ref</em>'.
	 * @generated
	 */
	ImageRef createImageRef();

	/**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
	CodeBlock createCodeBlock();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

	/**
	 * Returns a new object of class '<em>Markup In Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup In Code</em>'.
	 * @generated
	 */
	MarkupInCode createMarkupInCode();

	/**
	 * Returns a new object of class '<em>Todo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Todo</em>'.
	 * @generated
	 */
	Todo createTodo();

	/**
	 * Returns a new object of class '<em>Lang Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Def</em>'.
	 * @generated
	 */
	LangDef createLangDef();

	/**
	 * Returns a new object of class '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary Entry</em>'.
	 * @generated
	 */
	GlossaryEntry createGlossaryEntry();

	/**
	 * Returns a new object of class '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary</em>'.
	 * @generated
	 */
	Glossary createGlossary();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Ref</em>'.
	 * @generated
	 */
	PartRef createPartRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XdocPackage getXdocPackage();

} //XdocFactory
