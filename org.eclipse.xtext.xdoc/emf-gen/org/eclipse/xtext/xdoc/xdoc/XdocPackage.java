/**
 */
package org.eclipse.xtext.xdoc.xdoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xdoc.xdoc.XdocFactory
 * @model kind="package"
 * @generated
 */
public interface XdocPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xdoc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xtext/xdoc/Xdoc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xdoc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XdocPackage eINSTANCE = org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.XdocFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocFileImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getXdocFile()
	 * @generated
	 */
	int XDOC_FILE = 0;

	/**
	 * The feature id for the '<em><b>Main Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDOC_FILE__MAIN_SECTION = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDOC_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl <em>Abstract Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getAbstractSection()
	 * @generated
	 */
	int ABSTRACT_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECTION__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECTION__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECTION__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SECTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SUBTITLE = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHORS = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CHAPTERS = ABSTRACT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LANG_DEFS = ABSTRACT_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GLOSSARY = ABSTRACT_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PARTS = ABSTRACT_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl <em>Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getChapter()
	 * @generated
	 */
	int CHAPTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__SUB_SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ChapterRefImpl <em>Chapter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.ChapterRefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getChapterRef()
	 * @generated
	 */
	int CHAPTER_REF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF__NAME = CHAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF__TITLE = CHAPTER__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF__CONTENTS = CHAPTER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF__SUB_SECTIONS = CHAPTER__SUB_SECTIONS;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF__CHAPTER = CHAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chapter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_REF_FEATURE_COUNT = CHAPTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SectionRefImpl <em>Section Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.SectionRefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSectionRef()
	 * @generated
	 */
	int SECTION_REF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF__NAME = SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF__TITLE = SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF__CONTENTS = SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF__SUB_SECTIONS = SECTION__SUB_SECTIONS;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF__SECTION = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REF_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section2Impl <em>Section2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section2Impl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection2()
	 * @generated
	 */
	int SECTION2 = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2__SUB_SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section2RefImpl <em>Section2 Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section2RefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection2Ref()
	 * @generated
	 */
	int SECTION2_REF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF__NAME = SECTION2__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF__TITLE = SECTION2__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF__CONTENTS = SECTION2__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF__SUB_SECTIONS = SECTION2__SUB_SECTIONS;

	/**
	 * The feature id for the '<em><b>Section2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF__SECTION2 = SECTION2_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section2 Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION2_REF_FEATURE_COUNT = SECTION2_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl <em>Section3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection3()
	 * @generated
	 */
	int SECTION3 = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION3__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION3__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION3__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION3__SUB_SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION3_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl <em>Section4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection4()
	 * @generated
	 */
	int SECTION4 = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION4__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION4__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION4__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The number of structural features of the '<em>Section4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION4_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl <em>Text Or Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTextOrMarkup()
	 * @generated
	 */
	int TEXT_OR_MARKUP = 12;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OR_MARKUP__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Text Or Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OR_MARKUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TextPartImpl <em>Text Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TextPartImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTextPart()
	 * @generated
	 */
	int TEXT_PART = 13;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.MarkUpImpl <em>Mark Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.MarkUpImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getMarkUp()
	 * @generated
	 */
	int MARK_UP = 14;

	/**
	 * The number of structural features of the '<em>Mark Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_UP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 15;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableRowImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 16;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__DATA = 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableDataImpl <em>Table Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableDataImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTableData()
	 * @generated
	 */
	int TABLE_DATA = 17;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Table Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl <em>Emphasize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getEmphasize()
	 * @generated
	 */
	int EMPHASIZE = 18;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZE__CONTENTS = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Emphasize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIZE_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.AnchorImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__NAME = IDENTIFIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.RefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.RefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getRef()
	 * @generated
	 */
	int REF = 20;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__REF = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF__CONTENTS = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.OrderedListImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 21;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ITEMS = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.UnorderedListImpl <em>Unordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.UnorderedListImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getUnorderedList()
	 * @generated
	 */
	int UNORDERED_LIST = 22;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ITEMS = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.ItemImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 23;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl <em>Code Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeRef()
	 * @generated
	 */
	int CODE_REF = 24;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REF__ELEMENT = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REF__ALT_TEXT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REF_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 25;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ImageRefImpl <em>Image Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.ImageRefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getImageRef()
	 * @generated
	 */
	int IMAGE_REF = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__NAME = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__PATH = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__CLAZZ = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__STYLE = MARK_UP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__CAPTION = MARK_UP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF__IMAGE = MARK_UP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Image Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REF_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 27;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CONTENTS = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__LANGUAGE = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 28;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.MarkupInCodeImpl <em>Markup In Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.MarkupInCodeImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getMarkupInCode()
	 * @generated
	 */
	int MARKUP_IN_CODE = 29;

	/**
	 * The number of structural features of the '<em>Markup In Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_IN_CODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TodoImpl <em>Todo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.TodoImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTodo()
	 * @generated
	 */
	int TODO = 30;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODO__TEXT = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Todo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODO_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.LangDefImpl <em>Lang Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.LangDefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getLangDef()
	 * @generated
	 */
	int LANG_DEF = 31;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_DEF__KEYWORDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_DEF__NAME = 1;

	/**
	 * The number of structural features of the '<em>Lang Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_DEF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.GlossaryEntryImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getGlossaryEntry()
	 * @generated
	 */
	int GLOSSARY_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.GlossaryImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 33;

	/**
	 * The feature id for the '<em><b>Glossary Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__GLOSSARY_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.PartImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getPart()
	 * @generated
	 */
	int PART = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = ABSTRACT_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TITLE = ABSTRACT_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CONTENTS = ABSTRACT_SECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CHAPTERS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.PartRefImpl <em>Part Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.PartRefImpl
	 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getPartRef()
	 * @generated
	 */
	int PART_REF = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF__TITLE = PART__TITLE;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF__CONTENTS = PART__CONTENTS;

	/**
	 * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF__CHAPTERS = PART__CHAPTERS;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF__PART = PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_REF_FEATURE_COUNT = PART_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.XdocFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocFile
	 * @generated
	 */
	EClass getXdocFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.XdocFile#getMainSection <em>Main Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Section</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocFile#getMainSection()
	 * @see #getXdocFile()
	 * @generated
	 */
	EReference getXdocFile_MainSection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Document#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getSubtitle()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Subtitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Document#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getAuthors()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Authors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Document#getChapters <em>Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapters</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getChapters()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Chapters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Document#getLangDefs <em>Lang Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lang Defs</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getLangDefs()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_LangDefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Document#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glossary</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getGlossary()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Glossary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Document#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document#getParts()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Parts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Chapter
	 * @generated
	 */
	EClass getChapter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Chapter#getSubSections()
	 * @see #getChapter()
	 * @generated
	 */
	EReference getChapter_SubSections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.ChapterRef <em>Chapter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ChapterRef
	 * @generated
	 */
	EClass getChapterRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.ChapterRef#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chapter</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ChapterRef#getChapter()
	 * @see #getChapterRef()
	 * @generated
	 */
	EReference getChapterRef_Chapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section#getSubSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubSections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.SectionRef <em>Section Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.SectionRef
	 * @generated
	 */
	EClass getSectionRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.SectionRef#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.SectionRef#getSection()
	 * @see #getSectionRef()
	 * @generated
	 */
	EReference getSectionRef_Section();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Section2 <em>Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section2</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2
	 * @generated
	 */
	EClass getSection2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section2#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2#getSubSections()
	 * @see #getSection2()
	 * @generated
	 */
	EReference getSection2_SubSections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Section2Ref <em>Section2 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section2 Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2Ref
	 * @generated
	 */
	EClass getSection2Ref();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.Section2Ref#getSection2 <em>Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section2</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2Ref#getSection2()
	 * @see #getSection2Ref()
	 * @generated
	 */
	EReference getSection2Ref_Section2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Section3 <em>Section3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section3</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section3
	 * @generated
	 */
	EClass getSection3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section3#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section3#getSubSections()
	 * @see #getSection3()
	 * @generated
	 */
	EReference getSection3_SubSections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Section4 <em>Section4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section4</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section4
	 * @generated
	 */
	EClass getSection4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection <em>Abstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Section</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.AbstractSection
	 * @generated
	 */
	EClass getAbstractSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.AbstractSection#getTitle()
	 * @see #getAbstractSection()
	 * @generated
	 */
	EReference getAbstractSection_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.AbstractSection#getContents()
	 * @see #getAbstractSection()
	 * @generated
	 */
	EReference getAbstractSection_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.TextOrMarkup <em>Text Or Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Or Markup</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
	 * @generated
	 */
	EClass getTextOrMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.TextOrMarkup#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextOrMarkup#getContents()
	 * @see #getTextOrMarkup()
	 * @generated
	 */
	EReference getTextOrMarkup_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.TextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Part</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextPart
	 * @generated
	 */
	EClass getTextPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.TextPart#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextPart#getText()
	 * @see #getTextPart()
	 * @generated
	 */
	EAttribute getTextPart_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.MarkUp <em>Mark Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Up</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.MarkUp
	 * @generated
	 */
	EClass getMarkUp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.TableRow#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableRow#getData()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.TableData <em>Table Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Data</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableData
	 * @generated
	 */
	EClass getTableData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.TableData#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableData#getContents()
	 * @see #getTableData()
	 * @generated
	 */
	EReference getTableData_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Emphasize <em>Emphasize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasize</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Emphasize
	 * @generated
	 */
	EClass getEmphasize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Emphasize#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Emphasize#getContents()
	 * @see #getEmphasize()
	 * @generated
	 */
	EReference getEmphasize_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Ref
	 * @generated
	 */
	EClass getRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.Ref#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Ref#getRef()
	 * @see #getRef()
	 * @generated
	 */
	EReference getRef_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Ref#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Ref#getContents()
	 * @see #getRef()
	 * @generated
	 */
	EReference getRef_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.OrderedList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.OrderedList#getItems()
	 * @see #getOrderedList()
	 * @generated
	 */
	EReference getOrderedList_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.UnorderedList
	 * @generated
	 */
	EClass getUnorderedList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.UnorderedList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.UnorderedList#getItems()
	 * @see #getUnorderedList()
	 * @generated
	 */
	EReference getUnorderedList_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Item#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Item#getContents()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef <em>Code Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeRef
	 * @generated
	 */
	EClass getCodeRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeRef#getElement()
	 * @see #getCodeRef()
	 * @generated
	 */
	EReference getCodeRef_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef#getAltText <em>Alt Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt Text</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeRef#getAltText()
	 * @see #getCodeRef()
	 * @generated
	 */
	EReference getCodeRef_AltText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.Link#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Link#getUrl()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef
	 * @generated
	 */
	EClass getImageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getName()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getPath()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getClazz()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getStyle()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getCaption()
	 * @see #getImageRef()
	 * @generated
	 */
	EAttribute getImageRef_Caption();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef#getImage()
	 * @see #getImageRef()
	 * @generated
	 */
	EReference getImageRef_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock#getContents()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Contents();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock#getLanguage()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Language();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.Code#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Code#getContents()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.MarkupInCode <em>Markup In Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup In Code</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.MarkupInCode
	 * @generated
	 */
	EClass getMarkupInCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Todo <em>Todo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Todo</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Todo
	 * @generated
	 */
	EClass getTodo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.Todo#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Todo#getText()
	 * @see #getTodo()
	 * @generated
	 */
	EAttribute getTodo_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.LangDef <em>Lang Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang Def</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.LangDef
	 * @generated
	 */
	EClass getLangDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xtext.xdoc.xdoc.LangDef#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.LangDef#getKeywords()
	 * @see #getLangDef()
	 * @generated
	 */
	EAttribute getLangDef_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.LangDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.LangDef#getName()
	 * @see #getLangDef()
	 * @generated
	 */
	EAttribute getLangDef_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary Entry</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.GlossaryEntry
	 * @generated
	 */
	EClass getGlossaryEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getName()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getAlias()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.GlossaryEntry#getDescription()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EReference getGlossaryEntry_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Glossary#getGlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glossary Entry</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Glossary#getGlossaryEntry()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_GlossaryEntry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Part#getChapters <em>Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapters</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.Part#getChapters()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Chapters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.PartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Ref</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.PartRef
	 * @generated
	 */
	EClass getPartRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.xdoc.xdoc.PartRef#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see org.eclipse.xtext.xdoc.xdoc.PartRef#getPart()
	 * @see #getPartRef()
	 * @generated
	 */
	EReference getPartRef_Part();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XdocFactory getXdocFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.XdocFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocFileImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getXdocFile()
		 * @generated
		 */
		EClass XDOC_FILE = eINSTANCE.getXdocFile();

		/**
		 * The meta object literal for the '<em><b>Main Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDOC_FILE__MAIN_SECTION = eINSTANCE.getXdocFile_MainSection();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SUBTITLE = eINSTANCE.getDocument_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__AUTHORS = eINSTANCE.getDocument_Authors();

		/**
		 * The meta object literal for the '<em><b>Chapters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CHAPTERS = eINSTANCE.getDocument_Chapters();

		/**
		 * The meta object literal for the '<em><b>Lang Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__LANG_DEFS = eINSTANCE.getDocument_LangDefs();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__GLOSSARY = eINSTANCE.getDocument_Glossary();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PARTS = eINSTANCE.getDocument_Parts();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl <em>Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getChapter()
		 * @generated
		 */
		EClass CHAPTER = eINSTANCE.getChapter();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER__SUB_SECTIONS = eINSTANCE.getChapter_SubSections();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ChapterRefImpl <em>Chapter Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.ChapterRefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getChapterRef()
		 * @generated
		 */
		EClass CHAPTER_REF = eINSTANCE.getChapterRef();

		/**
		 * The meta object literal for the '<em><b>Chapter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_REF__CHAPTER = eINSTANCE.getChapterRef_Chapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_SECTIONS = eINSTANCE.getSection_SubSections();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SectionRefImpl <em>Section Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.SectionRefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSectionRef()
		 * @generated
		 */
		EClass SECTION_REF = eINSTANCE.getSectionRef();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_REF__SECTION = eINSTANCE.getSectionRef_Section();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section2Impl <em>Section2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section2Impl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection2()
		 * @generated
		 */
		EClass SECTION2 = eINSTANCE.getSection2();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION2__SUB_SECTIONS = eINSTANCE.getSection2_SubSections();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section2RefImpl <em>Section2 Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section2RefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection2Ref()
		 * @generated
		 */
		EClass SECTION2_REF = eINSTANCE.getSection2Ref();

		/**
		 * The meta object literal for the '<em><b>Section2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION2_REF__SECTION2 = eINSTANCE.getSection2Ref_Section2();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl <em>Section3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection3()
		 * @generated
		 */
		EClass SECTION3 = eINSTANCE.getSection3();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION3__SUB_SECTIONS = eINSTANCE.getSection3_SubSections();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl <em>Section4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection4()
		 * @generated
		 */
		EClass SECTION4 = eINSTANCE.getSection4();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl <em>Abstract Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getAbstractSection()
		 * @generated
		 */
		EClass ABSTRACT_SECTION = eINSTANCE.getAbstractSection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SECTION__TITLE = eINSTANCE.getAbstractSection_Title();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SECTION__CONTENTS = eINSTANCE.getAbstractSection_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl <em>Text Or Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTextOrMarkup()
		 * @generated
		 */
		EClass TEXT_OR_MARKUP = eINSTANCE.getTextOrMarkup();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_OR_MARKUP__CONTENTS = eINSTANCE.getTextOrMarkup_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TextPartImpl <em>Text Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TextPartImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTextPart()
		 * @generated
		 */
		EClass TEXT_PART = eINSTANCE.getTextPart();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PART__TEXT = eINSTANCE.getTextPart_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.MarkUpImpl <em>Mark Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.MarkUpImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getMarkUp()
		 * @generated
		 */
		EClass MARK_UP = eINSTANCE.getMarkUp();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableRowImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__DATA = eINSTANCE.getTableRow_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TableDataImpl <em>Table Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TableDataImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTableData()
		 * @generated
		 */
		EClass TABLE_DATA = eINSTANCE.getTableData();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DATA__CONTENTS = eINSTANCE.getTableData_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl <em>Emphasize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getEmphasize()
		 * @generated
		 */
		EClass EMPHASIZE = eINSTANCE.getEmphasize();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIZE__CONTENTS = eINSTANCE.getEmphasize_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.AnchorImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.RefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.RefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getRef()
		 * @generated
		 */
		EClass REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF__REF = eINSTANCE.getRef_Ref();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF__CONTENTS = eINSTANCE.getRef_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.OrderedListImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST__ITEMS = eINSTANCE.getOrderedList_Items();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.UnorderedListImpl <em>Unordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.UnorderedListImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getUnorderedList()
		 * @generated
		 */
		EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNORDERED_LIST__ITEMS = eINSTANCE.getUnorderedList_Items();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.ItemImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CONTENTS = eINSTANCE.getItem_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl <em>Code Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeRefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeRef()
		 * @generated
		 */
		EClass CODE_REF = eINSTANCE.getCodeRef();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_REF__ELEMENT = eINSTANCE.getCodeRef_Element();

		/**
		 * The meta object literal for the '<em><b>Alt Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_REF__ALT_TEXT = eINSTANCE.getCodeRef_AltText();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URL = eINSTANCE.getLink_Url();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ImageRefImpl <em>Image Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.ImageRefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getImageRef()
		 * @generated
		 */
		EClass IMAGE_REF = eINSTANCE.getImageRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__NAME = eINSTANCE.getImageRef_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__PATH = eINSTANCE.getImageRef_Path();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__CLAZZ = eINSTANCE.getImageRef_Clazz();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__STYLE = eINSTANCE.getImageRef_Style();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REF__CAPTION = eINSTANCE.getImageRef_Caption();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_REF__IMAGE = eINSTANCE.getImageRef_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CONTENTS = eINSTANCE.getCodeBlock_Contents();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__LANGUAGE = eINSTANCE.getCodeBlock_Language();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CONTENTS = eINSTANCE.getCode_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.MarkupInCodeImpl <em>Markup In Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.MarkupInCodeImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getMarkupInCode()
		 * @generated
		 */
		EClass MARKUP_IN_CODE = eINSTANCE.getMarkupInCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TodoImpl <em>Todo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.TodoImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTodo()
		 * @generated
		 */
		EClass TODO = eINSTANCE.getTodo();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TODO__TEXT = eINSTANCE.getTodo_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.LangDefImpl <em>Lang Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.LangDefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getLangDef()
		 * @generated
		 */
		EClass LANG_DEF = eINSTANCE.getLangDef();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_DEF__KEYWORDS = eINSTANCE.getLangDef_Keywords();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_DEF__NAME = eINSTANCE.getLangDef_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.GlossaryEntryImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getGlossaryEntry()
		 * @generated
		 */
		EClass GLOSSARY_ENTRY = eINSTANCE.getGlossaryEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__NAME = eINSTANCE.getGlossaryEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__ALIAS = eINSTANCE.getGlossaryEntry_Alias();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_ENTRY__DESCRIPTION = eINSTANCE.getGlossaryEntry_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.GlossaryImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Glossary Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__GLOSSARY_ENTRY = eINSTANCE.getGlossary_GlossaryEntry();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.PartImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Chapters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__CHAPTERS = eINSTANCE.getPart_Chapters();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.PartRefImpl <em>Part Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.PartRefImpl
		 * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getPartRef()
		 * @generated
		 */
		EClass PART_REF = eINSTANCE.getPartRef();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_REF__PART = eINSTANCE.getPartRef_Part();

	}

} //XdocPackage
