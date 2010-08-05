/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.xdoc.xDoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xdoc.xDoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDocFactoryImpl extends EFactoryImpl implements XDocFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XDocFactory init()
  {
    try
    {
      XDocFactory theXDocFactory = (XDocFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/xdoc/XDoc"); 
      if (theXDocFactory != null)
      {
        return theXDocFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XDocFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDocFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XDocPackage.DOCUMENT: return createDocument();
      case XDocPackage.CHAPTER: return createChapter();
      case XDocPackage.SECTION: return createSection();
      case XDocPackage.SUB_SECTION: return createSubSection();
      case XDocPackage.SECTION3: return createSection3();
      case XDocPackage.SECTION4: return createSection4();
      case XDocPackage.IDENTIFIABLE: return createIdentifiable();
      case XDocPackage.TEXT_OR_MARKUP: return createTextOrMarkup();
      case XDocPackage.MARK_UP: return createMarkUp();
      case XDocPackage.EMPHASIZE: return createEmphasize();
      case XDocPackage.ANCHOR: return createAnchor();
      case XDocPackage.REF: return createRef();
      case XDocPackage.ORDERED_LIST: return createOrderedList();
      case XDocPackage.UNORDERED_LIST: return createUnorderedList();
      case XDocPackage.ITEM: return createItem();
      case XDocPackage.CODE_REF: return createCodeRef();
      case XDocPackage.LINK: return createLink();
      case XDocPackage.IMAGE_REF: return createImageRef();
      case XDocPackage.CODE_BLOCK: return createCodeBlock();
      case XDocPackage.TEXT_PART: return createTextPart();
      case XDocPackage.MARKUP_IN_CODE: return createMarkupInCode();
      case XDocPackage.CODE: return createCode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chapter createChapter()
  {
    ChapterImpl chapter = new ChapterImpl();
    return chapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubSection createSubSection()
  {
    SubSectionImpl subSection = new SubSectionImpl();
    return subSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section3 createSection3()
  {
    Section3Impl section3 = new Section3Impl();
    return section3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section4 createSection4()
  {
    Section4Impl section4 = new Section4Impl();
    return section4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifiable createIdentifiable()
  {
    IdentifiableImpl identifiable = new IdentifiableImpl();
    return identifiable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextOrMarkup createTextOrMarkup()
  {
    TextOrMarkupImpl textOrMarkup = new TextOrMarkupImpl();
    return textOrMarkup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkUp createMarkUp()
  {
    MarkUpImpl markUp = new MarkUpImpl();
    return markUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emphasize createEmphasize()
  {
    EmphasizeImpl emphasize = new EmphasizeImpl();
    return emphasize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anchor createAnchor()
  {
    AnchorImpl anchor = new AnchorImpl();
    return anchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedList createOrderedList()
  {
    OrderedListImpl orderedList = new OrderedListImpl();
    return orderedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnorderedList createUnorderedList()
  {
    UnorderedListImpl unorderedList = new UnorderedListImpl();
    return unorderedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeRef createCodeRef()
  {
    CodeRefImpl codeRef = new CodeRefImpl();
    return codeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageRef createImageRef()
  {
    ImageRefImpl imageRef = new ImageRefImpl();
    return imageRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock createCodeBlock()
  {
    CodeBlockImpl codeBlock = new CodeBlockImpl();
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextPart createTextPart()
  {
    TextPartImpl textPart = new TextPartImpl();
    return textPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupInCode createMarkupInCode()
  {
    MarkupInCodeImpl markupInCode = new MarkupInCodeImpl();
    return markupInCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Code createCode()
  {
    CodeImpl code = new CodeImpl();
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDocPackage getXDocPackage()
  {
    return (XDocPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XDocPackage getPackage()
  {
    return XDocPackage.eINSTANCE;
  }

} //XDocFactoryImpl
