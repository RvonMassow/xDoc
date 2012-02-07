package org.eclipse.xtext.xdoc

import java.net.URL
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions
import org.eclipse.xtext.xdoc.xdoc.Chapter
import org.eclipse.xtext.xdoc.xdoc.Code
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.OrderedList
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.Table
import org.eclipse.xtext.xdoc.xdoc.TextPart
import org.eclipse.xtext.xdoc.xdoc.UnorderedList
import org.eclipse.xtext.xdoc.xdoc.XdocFile
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.xdoc.util.ParserTestConstants.*

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XdocInjectorProvider))
class ParserTest {
	
	@Inject extension ParseHelperExtensions<XdocFile>
	@Inject extension ValidationTestHelper

	@Test
	def testSimple() {
		val title = "Title vom Kapitel"
		val firstPart = "Hier kommt dann mal text "
		val emphasized = "manchmal fett"
		val secondPart = " und manchmal nicht.\nNewlines und so gibt es auch."
		val text = '''
		chapter[« title »]
		
		«firstPart »e[«emphasized»]«secondPart»
		
		'''
		//System.out.println(text);
		val model = text.toString.parse
		model.assertNoErrors
		val chapter = model.mainSection as Chapter;
		title.assertEquals(((chapter.title.contents
						.head)as TextPart).text)
		1.assertEquals(chapter.contents.size)
		val p = chapter.contents.head
		firstPart.assertEquals((p.getContents().head as TextPart).text)
		emphasized.assertEquals(
				((( p.contents
						.tail.head  as Emphasize).contents.head).contents.head as TextPart)
						.text)
		assertEquals(secondPart,  (p.contents.tail.tail.head as TextPart).text);
	}

	@Test
	def testsmallestDoc() {
		'''chapter[foo bar]'''.parse.assertNoErrors
		'''
		section[foo]
		
		bar
		'''.parse.assertNoErrors
		'''
		section2[foo]
		
		bar
		'''.parse.assertNoErrors
	}

	@Test
	def testAnchoredReference() {
		val anchor = " a[refName]";
		val fill = " Jump ";
		val refText = " to ";
		val ref = ''' ref:refName[« refText »]'''
		val file = '''«CHAPTER_HEAD»«anchor»«fill»«ref»'''.parse
		val textOrMarkup = file.mainSection.contents.head
		4.assertEquals(textOrMarkup.contents.size)
		val a = textOrMarkup.contents.tail.head
		val r = textOrMarkup.contents.get(3) as Ref
		a.assertEquals(r.ref)
		refText.assertEquals((r.contents.head.contents.head as TextPart).text)
	}

	@Test
	def testCode() {
		val file = getDocFromFile(TEST_FILE_DIR + "codeTest.xdoc")
		val doc =  file.mainSection as Document
		val contents = doc.chapters.head.contents
		var textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		var cb = textOrMarkup.contents.head as CodeBlock
		val code = cb.contents.head as Code
		'''
		
		class Foo {
		public static void main(String\[\] args){
		System.out.println("Hello World\n");
		}
		}
		'''.toString.assertEquals(
				code.contents)
		textOrMarkup = contents.tail.head;
		cb = textOrMarkup.contents.head as CodeBlock;
		0.assertEquals(cb.contents.size);
	}

	@Test
	def testCodeWithLanguage() {
		val file = getDocFromFile(TEST_FILE_DIR
				+ "codeWithLanguageTest.xdoc");
		val abstractSection = file.mainSection as Document
		val textOrMarkup = abstractSection.chapters.get(0).getContents().get(0);
		assertEquals(1, textOrMarkup.contents.size)
		val cb =  textOrMarkup.getContents().get(0) as CodeBlock
		'''
			
			«"\t"»/* a testclass */
				class Foo {
					public static void main(String\[\] args){
						System.out.println("Hello World"+'\n'); // say "hello"
					}
				}
		'''.toString.assertEquals(
				(cb.contents.head as Code).contents);
		"Java".assertEquals(cb.language.name);
	}

	@Test
	def testComment() {
		val file = getDocFromFile(TEST_FILE_DIR + "commentTest.xdoc");
		1.assertEquals(file.mainSection.contents.size);
	}

	@Test
	def testLink() throws Exception {
		val file = getDocFromFile(TEST_FILE_DIR + "linkTest.xdoc")
		val link = file.mainSection.contents.head.contents.head as Link
		val url =  new URL(link.url)
		val connection = url.openConnection
		connection.assertNotNull;
	}

	@Test
	def testNamedReference() {
		val file = getDocFromFile(TEST_FILE_DIR
				+ "namedRefAndTextTest.xdoc")
		val r =  file.mainSection.contents.head.contents.head as Ref;
		file.mainSection.assertEquals(r.ref)
		"a Chapter".assertEquals((r.contents.head.contents.head as TextPart).text)
	}

	@Test
	def testNestedList() {
		val file = getDocFromFile(TEST_FILE_DIR + "nestedListTest.xdoc")
		val outer =  file.mainSection.contents.head.contents.head as UnorderedList 
		var items = outer.items
		1.assertEquals(items.size)
		var itemContents = items.head.contents
		1.assertEquals(itemContents.size)
		val contents = itemContents.head.contents
		// we have text parts for indentations
		3.assertEquals(contents.size);
		assertTrue((contents.head as TextPart).text.matches("\\s+"))
		assertTrue((contents.get(2) as TextPart).text.matches("\\s+"))
		val inner =  contents.tail.head as UnorderedList
		items = inner.items
		1.assertEquals(items.size)
		itemContents = items.head.contents
		1.assertEquals(itemContents.size)
		1.assertEquals(itemContents.head.contents.size);
		"some item".assertEquals((itemContents.head.contents.head as TextPart).text);
	}

	@Test
	def testSimpleRef() {
		val file = getDocFromFile(TEST_FILE_DIR + "simpleRefTest.xdoc");
		val section = file.mainSection
		val contents = section.contents
		1.assertEquals(contents.size)
		val textOrMarkup = contents.head
		2.assertEquals(textOrMarkup.contents.size)
		assertEquals("This is ", (textOrMarkup.contents.head as TextPart).text)
		section.assertEquals((textOrMarkup.contents.tail.head as Ref).ref)
	}

	@Test
	def testEscape() {
		val file = getDocFromFile(TEST_FILE_DIR + "testEscape.xdoc")
		val textOrMarkup = file.mainSection.contents.head
		1.assertEquals(textOrMarkup.contents.size)
		val p = textOrMarkup.contents.head as TextPart
		"\\\\ \\[ \\]".assertEquals(p.text)
	}

	@Test
	def testImg() {
		getDocFromFile(TEST_FILE_DIR + "imgTest.xdoc").assertNoErrors;
	}

	@Test
	def testUL() {
		val file = getDocFromFile(TEST_FILE_DIR + "ulTest.xdoc");
		val chapter = file.mainSection as Chapter
		var contents = chapter.contents
		1.assertEquals(contents.size)
		var textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size);
		val list = textOrMarkup.contents.head as UnorderedList
		2.assertEquals(list.items.size)
		//test first item
		contents = list.items.head.contents
		1.assertEquals(contents.size)
		textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		"An item".assertEquals((textOrMarkup.contents.head as TextPart).text)
		// test second item
		contents = list.items.tail.head.contents
		2.assertEquals(contents.size)
		textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		"A paragraph".assertEquals((textOrMarkup.contents.head as TextPart).text)
		textOrMarkup = contents.tail.head;
		1.assertEquals(textOrMarkup.contents.size)
		assertEquals("\titem", (textOrMarkup.contents.head as TextPart).text)
	}

	@Test
	def testOL() {
		val file = getDocFromFile(TEST_FILE_DIR + "olTest.xdoc")
		val chapter = file.mainSection as Chapter
		var contents = chapter.contents
		1.assertEquals(contents.size)
		var textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		val list = textOrMarkup.contents.head as OrderedList
		2.assertEquals(list.items.size)
		//test first item
		contents = list.items.head.contents
		1.assertEquals(contents.size)
		textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		"An item".assertEquals((textOrMarkup.contents.head as TextPart).text)
		// test second item
		contents = list.items.tail.head.contents
		2.assertEquals(contents.size)
		textOrMarkup = contents.head
		1.assertEquals(textOrMarkup.contents.size)
		"A paragraph".assertEquals((textOrMarkup.contents.head as TextPart).text)
		textOrMarkup = contents.tail.head
		1.assertEquals(textOrMarkup.contents.size)
		"\titem".assertEquals((textOrMarkup.contents.head as TextPart).text)
	}

	@Test
	def testTable() {
		val tableStart = "table["
		val row = "tr["
		val dataString = "this is"
		val dataString2 = "a two paragraph table entry"
		val file = 
		'''
		«CHAPTER_HEAD»
		
		«tableStart»«row»td[«dataString»
		
		«dataString2»«CLOSE_BRACKET»td[]«CLOSE_BRACKET»«CLOSE_BRACKET»
		'''.parse
		val textOrMarkup = file.mainSection.contents
		1.assertEquals(textOrMarkup.size)
		val t = textOrMarkup.head.contents.head as Table
		1.assertEquals(t.rows.size)
		val data = t.rows.head.data
		2.assertEquals(data.size)
		var td = data.get(0);
		val contents = td.contents
		2.assertEquals(contents.size);
		var text = contents.head.contents.head as TextPart
		dataString.assertEquals(text.text);
		text = contents.tail.head.contents.head as TextPart
		dataString2.assertEquals(text.text);
		td = data.tail.head;
		0.assertEquals(td.contents.size);
	}

	@Test
	def testCodeLangDef() {
		val name = "Java";
		val expectedKeywords = newArrayList("final", "const", "goto", "strictfp")
		val file = 
		'''
		«DOC_HEAD»codelanguage-def[«name»][«expectedKeywords.join(",")»]
		chapter[foo]
		
		
		'''.parse
		val doc = file.mainSection as Document
		val defs = doc.langDefs
		1.assertEquals(defs.size)
		val ^def = defs.head
		name.assertEquals(^def.name)
		val keywords = ^def.keywords
		expectedKeywords.size.assertEquals(keywords.size);
		for (i : 0 .. keywords.size -1) {
			assertEquals(expectedKeywords.get(i), keywords.get(i));
		}
	}

	@Test
	def testFullSectionHirarchy() {
		val file = getDocFromFile(TEST_FILE_DIR + "downToSection4Test.xdoc");
		val doc = file.mainSection as Document
		1.assertEquals(doc.title.contents.size)
		var textPart = doc.title.contents.head as TextPart;
		"foo".assertEquals(textPart.text)
		1.assertEquals(doc.chapters.size)
		val chapter = doc.chapters.head
		1.assertEquals(chapter.title.contents.size)
		textPart = chapter.title.contents.head as TextPart
		"bar".assertEquals(textPart.text)
		1.assertEquals(chapter.subSections.size)
		val section = chapter.subSections.head
		1.assertEquals(section.title.contents.size)
		textPart = section.title.contents.head as TextPart
		"fooß".assertEquals(textPart.text)
		1.assertEquals(section.subSections.size)
		val section2 = section.subSections.head
		1.assertEquals(section2.title.contents.size)
		textPart = section2.title.contents.head as TextPart
		"pilz".assertEquals(textPart.text)
		1.assertEquals(section2.subSections.size)
		val section3 = section2.subSections.head
		1.assertEquals(section3.title.contents.size)
		textPart = section3.title.contents.head as TextPart
		"sna".assertEquals(textPart.text)
		1.assertEquals(section3.subSections.size);
		val section4 = section3.subSections.head
		assertEquals(1, section4.title.contents.size);
		textPart = section4.title.contents.head as TextPart
		"fu".assertEquals(textPart.text)
	}
}