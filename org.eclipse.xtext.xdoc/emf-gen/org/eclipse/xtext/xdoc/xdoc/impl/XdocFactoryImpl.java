/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xdoc.xdoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XdocFactoryImpl extends EFactoryImpl implements XdocFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XdocFactory init()
	{
		try
		{
			XdocFactory theXdocFactory = (XdocFactory)EPackage.Registry.INSTANCE.getEFactory(XdocPackage.eNS_URI);
			if (theXdocFactory != null)
			{
				return theXdocFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XdocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XdocFactoryImpl()
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
			case XdocPackage.XDOC_FILE: return createXdocFile();
			case XdocPackage.DOCUMENT: return createDocument();
			case XdocPackage.CHAPTER: return createChapter();
			case XdocPackage.CHAPTER_REF: return createChapterRef();
			case XdocPackage.SECTION: return createSection();
			case XdocPackage.SECTION_REF: return createSectionRef();
			case XdocPackage.SECTION2: return createSection2();
			case XdocPackage.SECTION2_REF: return createSection2Ref();
			case XdocPackage.SECTION3: return createSection3();
			case XdocPackage.SECTION4: return createSection4();
			case XdocPackage.ABSTRACT_SECTION: return createAbstractSection();
			case XdocPackage.IDENTIFIABLE: return createIdentifiable();
			case XdocPackage.TEXT_OR_MARKUP: return createTextOrMarkup();
			case XdocPackage.TEXT_PART: return createTextPart();
			case XdocPackage.MARK_UP: return createMarkUp();
			case XdocPackage.TABLE: return createTable();
			case XdocPackage.TABLE_ROW: return createTableRow();
			case XdocPackage.TABLE_DATA: return createTableData();
			case XdocPackage.EMPHASIZE: return createEmphasize();
			case XdocPackage.ANCHOR: return createAnchor();
			case XdocPackage.REF: return createRef();
			case XdocPackage.ORDERED_LIST: return createOrderedList();
			case XdocPackage.UNORDERED_LIST: return createUnorderedList();
			case XdocPackage.ITEM: return createItem();
			case XdocPackage.CODE_REF: return createCodeRef();
			case XdocPackage.LINK: return createLink();
			case XdocPackage.IMAGE_REF: return createImageRef();
			case XdocPackage.CODE_BLOCK: return createCodeBlock();
			case XdocPackage.CODE: return createCode();
			case XdocPackage.MARKUP_IN_CODE: return createMarkupInCode();
			case XdocPackage.TODO: return createTodo();
			case XdocPackage.LANG_DEF: return createLangDef();
			case XdocPackage.GLOSSARY_ENTRY: return createGlossaryEntry();
			case XdocPackage.GLOSSARY: return createGlossary();
			case XdocPackage.PART: return createPart();
			case XdocPackage.PART_REF: return createPartRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XdocFile createXdocFile()
	{
		XdocFileImpl xdocFile = new XdocFileImpl();
		return xdocFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument()
	{
		DocumentImplCustom document = new DocumentImplCustom();
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
	public ChapterRef createChapterRef()
	{
		ChapterRefImplCustom chapterRef = new ChapterRefImplCustom();
		return chapterRef;
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
	public SectionRef createSectionRef()
	{
		SectionRefImplCustom sectionRef = new SectionRefImplCustom();
		return sectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section2 createSection2()
	{
		Section2Impl section2 = new Section2Impl();
		return section2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section2Ref createSection2Ref()
	{
		Section2RefImplCustom section2Ref = new Section2RefImplCustom();
		return section2Ref;
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
	public AbstractSection createAbstractSection()
	{
		AbstractSectionImpl abstractSection = new AbstractSectionImpl();
		return abstractSection;
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
	public Table createTable()
	{
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow()
	{
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableData createTableData()
	{
		TableDataImpl tableData = new TableDataImpl();
		return tableData;
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
	public Todo createTodo()
	{
		TodoImpl todo = new TodoImpl();
		return todo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangDef createLangDef()
	{
		LangDefImpl langDef = new LangDefImpl();
		return langDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryEntry createGlossaryEntry()
	{
		GlossaryEntryImpl glossaryEntry = new GlossaryEntryImpl();
		return glossaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary createGlossary()
	{
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart()
	{
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartRef createPartRef()
	{
		PartRefImplCustom partRef = new PartRefImplCustom();
		return partRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XdocPackage getXdocPackage()
	{
		return (XdocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XdocPackage getPackage()
	{
		return XdocPackage.eINSTANCE;
	}

} //XdocFactoryImpl
