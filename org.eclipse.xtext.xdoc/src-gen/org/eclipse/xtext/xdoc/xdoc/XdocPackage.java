/**
 * <copyright>
 * </copyright>
 *
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
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__CHAPTERS = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__SECTIONS = 1;

  /**
   * The feature id for the '<em><b>Subsections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__SUBSECTIONS = 2;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl <em>Identifiable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.IdentifiableImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getIdentifiable()
   * @generated
   */
  int IDENTIFIABLE = 6;

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
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl <em>Chapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.ChapterImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getChapter()
   * @generated
   */
  int CHAPTER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__NAME = IDENTIFIABLE__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Chapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.SectionImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection()
   * @generated
   */
  int SECTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = IDENTIFIABLE__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SubSectionImpl <em>Sub Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.SubSectionImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSubSection()
   * @generated
   */
  int SUB_SECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION__NAME = IDENTIFIABLE__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SECTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl <em>Section3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.Section3Impl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection3()
   * @generated
   */
  int SECTION3 = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION3__NAME = IDENTIFIABLE__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION3__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION3__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Section3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION3_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl <em>Section4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.Section4Impl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSection4()
   * @generated
   */
  int SECTION4 = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION4__NAME = IDENTIFIABLE__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION4__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION4__CONTENTS = IDENTIFIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Section4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION4_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl <em>Text Or Markup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.TextOrMarkupImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getTextOrMarkup()
   * @generated
   */
  int TEXT_OR_MARKUP = 7;

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
  int TEXT_PART = 8;

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
  int MARK_UP = 9;

  /**
   * The number of structural features of the '<em>Mark Up</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARK_UP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl <em>Emphasize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.EmphasizeImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getEmphasize()
   * @generated
   */
  int EMPHASIZE = 10;

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
  int ANCHOR = 11;

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
  int REF = 12;

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
  int ORDERED_LIST = 13;

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
  int UNORDERED_LIST = 14;

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
  int ITEM = 15;

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
  int CODE_REF = 16;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_REF__ELEMENT = MARK_UP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_REF_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.LinkImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getLink()
   * @generated
   */
  int LINK = 17;

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
  int IMAGE_REF = 18;

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
   * The number of structural features of the '<em>Image Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_REF_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl <em>Code Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl
   * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeBlock()
   * @generated
   */
  int CODE_BLOCK = 19;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_BLOCK__LANGUAGE = MARK_UP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_BLOCK__CONTENTS = MARK_UP_FEATURE_COUNT + 1;

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
  int CODE = 20;

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
  int MARKUP_IN_CODE = 21;

  /**
   * The number of structural features of the '<em>Markup In Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_IN_CODE_FEATURE_COUNT = 0;


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
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Document#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Document#getSections()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Sections();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Document#getSubsections <em>Subsections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsections</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Document#getSubsections()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Subsections();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Chapter#getTitle()
   * @see #getChapter()
   * @generated
   */
  EReference getChapter_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Chapter#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Chapter#getContents()
   * @see #getChapter()
   * @generated
   */
  EReference getChapter_Contents();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Section#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section#getTitle()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section#getContents()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.SubSection <em>Sub Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Section</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.SubSection
   * @generated
   */
  EClass getSubSection();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.SubSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.SubSection#getTitle()
   * @see #getSubSection()
   * @generated
   */
  EReference getSubSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.SubSection#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.SubSection#getContents()
   * @see #getSubSection()
   * @generated
   */
  EReference getSubSection_Contents();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Section3#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section3#getTitle()
   * @see #getSection3()
   * @generated
   */
  EReference getSection3_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section3#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section3#getContents()
   * @see #getSection3()
   * @generated
   */
  EReference getSection3_Contents();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.xdoc.xdoc.Section4#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section4#getTitle()
   * @see #getSection4()
   * @generated
   */
  EReference getSection4_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xdoc.xdoc.Section4#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.Section4#getContents()
   * @see #getSection4()
   * @generated
   */
  EReference getSection4_Contents();

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
   * Returns the meta object for class '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock <em>Code Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Block</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock
   * @generated
   */
  EClass getCodeBlock();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock#getLanguage()
   * @see #getCodeBlock()
   * @generated
   */
  EAttribute getCodeBlock_Language();

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
     * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.xdoc.xdoc.impl.DocumentImpl
     * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Chapters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__CHAPTERS = eINSTANCE.getDocument_Chapters();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__SECTIONS = eINSTANCE.getDocument_Sections();

    /**
     * The meta object literal for the '<em><b>Subsections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__SUBSECTIONS = eINSTANCE.getDocument_Subsections();

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
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAPTER__TITLE = eINSTANCE.getChapter_Title();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHAPTER__CONTENTS = eINSTANCE.getChapter_Contents();

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
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__TITLE = eINSTANCE.getSection_Title();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.SubSectionImpl <em>Sub Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.xdoc.xdoc.impl.SubSectionImpl
     * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getSubSection()
     * @generated
     */
    EClass SUB_SECTION = eINSTANCE.getSubSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SECTION__TITLE = eINSTANCE.getSubSection_Title();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SECTION__CONTENTS = eINSTANCE.getSubSection_Contents();

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
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION3__TITLE = eINSTANCE.getSection3_Title();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION3__CONTENTS = eINSTANCE.getSection3_Contents();

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
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION4__TITLE = eINSTANCE.getSection4_Title();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION4__CONTENTS = eINSTANCE.getSection4_Contents();

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
     * The meta object literal for the '{@link org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl <em>Code Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.xdoc.xdoc.impl.CodeBlockImpl
     * @see org.eclipse.xtext.xdoc.xdoc.impl.XdocPackageImpl#getCodeBlock()
     * @generated
     */
    EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_BLOCK__LANGUAGE = eINSTANCE.getCodeBlock_Language();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_BLOCK__CONTENTS = eINSTANCE.getCodeBlock_Contents();

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

  }

} //XdocPackage
