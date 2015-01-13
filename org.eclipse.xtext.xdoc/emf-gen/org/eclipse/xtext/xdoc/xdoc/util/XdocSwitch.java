/**
 */
package org.eclipse.xtext.xdoc.xdoc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xdoc.xdoc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xdoc.xdoc.XdocPackage
 * @generated
 */
public class XdocSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XdocPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XdocSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = XdocPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case XdocPackage.XDOC_FILE:
			{
				XdocFile xdocFile = (XdocFile)theEObject;
				T result = caseXdocFile(xdocFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.DOCUMENT:
			{
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseAbstractSection(document);
				if (result == null) result = caseIdentifiable(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.CHAPTER:
			{
				Chapter chapter = (Chapter)theEObject;
				T result = caseChapter(chapter);
				if (result == null) result = caseAbstractSection(chapter);
				if (result == null) result = caseIdentifiable(chapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.CHAPTER_REF:
			{
				ChapterRef chapterRef = (ChapterRef)theEObject;
				T result = caseChapterRef(chapterRef);
				if (result == null) result = caseChapter(chapterRef);
				if (result == null) result = caseAbstractSection(chapterRef);
				if (result == null) result = caseIdentifiable(chapterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION:
			{
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseAbstractSection(section);
				if (result == null) result = caseIdentifiable(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION_REF:
			{
				SectionRef sectionRef = (SectionRef)theEObject;
				T result = caseSectionRef(sectionRef);
				if (result == null) result = caseSection(sectionRef);
				if (result == null) result = caseAbstractSection(sectionRef);
				if (result == null) result = caseIdentifiable(sectionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION2:
			{
				Section2 section2 = (Section2)theEObject;
				T result = caseSection2(section2);
				if (result == null) result = caseAbstractSection(section2);
				if (result == null) result = caseIdentifiable(section2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION2_REF:
			{
				Section2Ref section2Ref = (Section2Ref)theEObject;
				T result = caseSection2Ref(section2Ref);
				if (result == null) result = caseSection2(section2Ref);
				if (result == null) result = caseAbstractSection(section2Ref);
				if (result == null) result = caseIdentifiable(section2Ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION3:
			{
				Section3 section3 = (Section3)theEObject;
				T result = caseSection3(section3);
				if (result == null) result = caseAbstractSection(section3);
				if (result == null) result = caseIdentifiable(section3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.SECTION4:
			{
				Section4 section4 = (Section4)theEObject;
				T result = caseSection4(section4);
				if (result == null) result = caseAbstractSection(section4);
				if (result == null) result = caseIdentifiable(section4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.ABSTRACT_SECTION:
			{
				AbstractSection abstractSection = (AbstractSection)theEObject;
				T result = caseAbstractSection(abstractSection);
				if (result == null) result = caseIdentifiable(abstractSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.IDENTIFIABLE:
			{
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TEXT_OR_MARKUP:
			{
				TextOrMarkup textOrMarkup = (TextOrMarkup)theEObject;
				T result = caseTextOrMarkup(textOrMarkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TEXT_PART:
			{
				TextPart textPart = (TextPart)theEObject;
				T result = caseTextPart(textPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.MARK_UP:
			{
				MarkUp markUp = (MarkUp)theEObject;
				T result = caseMarkUp(markUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TABLE:
			{
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseMarkUp(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TABLE_ROW:
			{
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TABLE_DATA:
			{
				TableData tableData = (TableData)theEObject;
				T result = caseTableData(tableData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.EMPHASIZE:
			{
				Emphasize emphasize = (Emphasize)theEObject;
				T result = caseEmphasize(emphasize);
				if (result == null) result = caseMarkUp(emphasize);
				if (result == null) result = caseMarkupInCode(emphasize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.ANCHOR:
			{
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = caseIdentifiable(anchor);
				if (result == null) result = caseMarkUp(anchor);
				if (result == null) result = caseMarkupInCode(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.REF:
			{
				Ref ref = (Ref)theEObject;
				T result = caseRef(ref);
				if (result == null) result = caseMarkUp(ref);
				if (result == null) result = caseMarkupInCode(ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.ORDERED_LIST:
			{
				OrderedList orderedList = (OrderedList)theEObject;
				T result = caseOrderedList(orderedList);
				if (result == null) result = caseMarkUp(orderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.UNORDERED_LIST:
			{
				UnorderedList unorderedList = (UnorderedList)theEObject;
				T result = caseUnorderedList(unorderedList);
				if (result == null) result = caseMarkUp(unorderedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.ITEM:
			{
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.CODE_REF:
			{
				CodeRef codeRef = (CodeRef)theEObject;
				T result = caseCodeRef(codeRef);
				if (result == null) result = caseMarkUp(codeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.LINK:
			{
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseMarkUp(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.IMAGE_REF:
			{
				ImageRef imageRef = (ImageRef)theEObject;
				T result = caseImageRef(imageRef);
				if (result == null) result = caseMarkUp(imageRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.CODE_BLOCK:
			{
				CodeBlock codeBlock = (CodeBlock)theEObject;
				T result = caseCodeBlock(codeBlock);
				if (result == null) result = caseMarkUp(codeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.CODE:
			{
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.MARKUP_IN_CODE:
			{
				MarkupInCode markupInCode = (MarkupInCode)theEObject;
				T result = caseMarkupInCode(markupInCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.TODO:
			{
				Todo todo = (Todo)theEObject;
				T result = caseTodo(todo);
				if (result == null) result = caseMarkUp(todo);
				if (result == null) result = caseMarkupInCode(todo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.LANG_DEF:
			{
				LangDef langDef = (LangDef)theEObject;
				T result = caseLangDef(langDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.GLOSSARY_ENTRY:
			{
				GlossaryEntry glossaryEntry = (GlossaryEntry)theEObject;
				T result = caseGlossaryEntry(glossaryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.GLOSSARY:
			{
				Glossary glossary = (Glossary)theEObject;
				T result = caseGlossary(glossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.PART:
			{
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = caseAbstractSection(part);
				if (result == null) result = caseIdentifiable(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XdocPackage.PART_REF:
			{
				PartRef partRef = (PartRef)theEObject;
				T result = casePartRef(partRef);
				if (result == null) result = casePart(partRef);
				if (result == null) result = caseAbstractSection(partRef);
				if (result == null) result = caseIdentifiable(partRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXdocFile(XdocFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapter(Chapter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterRef(ChapterRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionRef(SectionRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection2(Section2 object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section2 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section2 Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection2Ref(Section2Ref object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection3(Section3 object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection4(Section4 object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSection(AbstractSection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Or Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Or Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextOrMarkup(TextOrMarkup object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPart(TextPart object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkUp(MarkUp object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableData(TableData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasize(Emphasize object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRef(Ref object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedList(OrderedList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedList(UnorderedList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeRef(CodeRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageRef(ImageRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup In Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup In Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkupInCode(MarkupInCode object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Todo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Todo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTodo(Todo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangDef(LangDef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossaryEntry(GlossaryEntry object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossary(Glossary object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartRef(PartRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //XdocSwitch
