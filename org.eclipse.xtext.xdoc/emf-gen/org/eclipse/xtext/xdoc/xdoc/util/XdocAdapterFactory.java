/**
 */
package org.eclipse.xtext.xdoc.xdoc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xdoc.xdoc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage
 * @generated
 */
public class XdocAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XdocPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XdocAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = XdocPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XdocSwitch<Adapter> modelSwitch =
		new XdocSwitch<Adapter>()
		{
			@Override
			public Adapter caseXdocFile(XdocFile object)
			{
				return createXdocFileAdapter();
			}
			@Override
			public Adapter caseDocument(Document object)
			{
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseChapter(Chapter object)
			{
				return createChapterAdapter();
			}
			@Override
			public Adapter caseChapterRef(ChapterRef object)
			{
				return createChapterRefAdapter();
			}
			@Override
			public Adapter caseSection(Section object)
			{
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSectionRef(SectionRef object)
			{
				return createSectionRefAdapter();
			}
			@Override
			public Adapter caseSection2(Section2 object)
			{
				return createSection2Adapter();
			}
			@Override
			public Adapter caseSection2Ref(Section2Ref object)
			{
				return createSection2RefAdapter();
			}
			@Override
			public Adapter caseSection3(Section3 object)
			{
				return createSection3Adapter();
			}
			@Override
			public Adapter caseSection4(Section4 object)
			{
				return createSection4Adapter();
			}
			@Override
			public Adapter caseAbstractSection(AbstractSection object)
			{
				return createAbstractSectionAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object)
			{
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseTextOrMarkup(TextOrMarkup object)
			{
				return createTextOrMarkupAdapter();
			}
			@Override
			public Adapter caseTextPart(TextPart object)
			{
				return createTextPartAdapter();
			}
			@Override
			public Adapter caseMarkUp(MarkUp object)
			{
				return createMarkUpAdapter();
			}
			@Override
			public Adapter caseTable(Table object)
			{
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object)
			{
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseTableData(TableData object)
			{
				return createTableDataAdapter();
			}
			@Override
			public Adapter caseEmphasize(Emphasize object)
			{
				return createEmphasizeAdapter();
			}
			@Override
			public Adapter caseAnchor(Anchor object)
			{
				return createAnchorAdapter();
			}
			@Override
			public Adapter caseRef(Ref object)
			{
				return createRefAdapter();
			}
			@Override
			public Adapter caseOrderedList(OrderedList object)
			{
				return createOrderedListAdapter();
			}
			@Override
			public Adapter caseUnorderedList(UnorderedList object)
			{
				return createUnorderedListAdapter();
			}
			@Override
			public Adapter caseItem(Item object)
			{
				return createItemAdapter();
			}
			@Override
			public Adapter caseCodeRef(CodeRef object)
			{
				return createCodeRefAdapter();
			}
			@Override
			public Adapter caseLink(Link object)
			{
				return createLinkAdapter();
			}
			@Override
			public Adapter caseImageRef(ImageRef object)
			{
				return createImageRefAdapter();
			}
			@Override
			public Adapter caseCodeBlock(CodeBlock object)
			{
				return createCodeBlockAdapter();
			}
			@Override
			public Adapter caseCode(Code object)
			{
				return createCodeAdapter();
			}
			@Override
			public Adapter caseMarkupInCode(MarkupInCode object)
			{
				return createMarkupInCodeAdapter();
			}
			@Override
			public Adapter caseTodo(Todo object)
			{
				return createTodoAdapter();
			}
			@Override
			public Adapter caseLangDef(LangDef object)
			{
				return createLangDefAdapter();
			}
			@Override
			public Adapter caseGlossaryEntry(GlossaryEntry object)
			{
				return createGlossaryEntryAdapter();
			}
			@Override
			public Adapter caseGlossary(Glossary object)
			{
				return createGlossaryAdapter();
			}
			@Override
			public Adapter casePart(Part object)
			{
				return createPartAdapter();
			}
			@Override
			public Adapter casePartRef(PartRef object)
			{
				return createPartRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.XdocFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.XdocFile
	 * @generated
	 */
	public Adapter createXdocFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Chapter
	 * @generated
	 */
	public Adapter createChapterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.ChapterRef <em>Chapter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.ChapterRef
	 * @generated
	 */
	public Adapter createChapterRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section
	 * @generated
	 */
	public Adapter createSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.SectionRef <em>Section Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.SectionRef
	 * @generated
	 */
	public Adapter createSectionRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Section2 <em>Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2
	 * @generated
	 */
	public Adapter createSection2Adapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Section2Ref <em>Section2 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section2Ref
	 * @generated
	 */
	public Adapter createSection2RefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Section3 <em>Section3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section3
	 * @generated
	 */
	public Adapter createSection3Adapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Section4 <em>Section4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Section4
	 * @generated
	 */
	public Adapter createSection4Adapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.AbstractSection <em>Abstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.AbstractSection
	 * @generated
	 */
	public Adapter createAbstractSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.TextOrMarkup <em>Text Or Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
	 * @generated
	 */
	public Adapter createTextOrMarkupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.TextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.TextPart
	 * @generated
	 */
	public Adapter createTextPartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.MarkUp <em>Mark Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.MarkUp
	 * @generated
	 */
	public Adapter createMarkUpAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Table
	 * @generated
	 */
	public Adapter createTableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.TableData <em>Table Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.TableData
	 * @generated
	 */
	public Adapter createTableDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Emphasize <em>Emphasize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Emphasize
	 * @generated
	 */
	public Adapter createEmphasizeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Anchor
	 * @generated
	 */
	public Adapter createAnchorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Ref
	 * @generated
	 */
	public Adapter createRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.OrderedList
	 * @generated
	 */
	public Adapter createOrderedListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.UnorderedList
	 * @generated
	 */
	public Adapter createUnorderedListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Item
	 * @generated
	 */
	public Adapter createItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.CodeRef <em>Code Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeRef
	 * @generated
	 */
	public Adapter createCodeRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Link
	 * @generated
	 */
	public Adapter createLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.ImageRef <em>Image Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.ImageRef
	 * @generated
	 */
	public Adapter createImageRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Code
	 * @generated
	 */
	public Adapter createCodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.MarkupInCode <em>Markup In Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.MarkupInCode
	 * @generated
	 */
	public Adapter createMarkupInCodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Todo <em>Todo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Todo
	 * @generated
	 */
	public Adapter createTodoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.LangDef <em>Lang Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.LangDef
	 * @generated
	 */
	public Adapter createLangDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.GlossaryEntry
	 * @generated
	 */
	public Adapter createGlossaryEntryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Glossary
	 * @generated
	 */
	public Adapter createGlossaryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.Part
	 * @generated
	 */
	public Adapter createPartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xdoc.xdoc.PartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xdoc.xdoc.PartRef
	 * @generated
	 */
	public Adapter createPartRefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //XdocAdapterFactory
