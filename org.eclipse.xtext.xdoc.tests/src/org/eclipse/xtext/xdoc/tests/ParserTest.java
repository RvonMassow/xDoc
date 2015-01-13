package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xdoc.XdocStandaloneSetup;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Anchor;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Item;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.OrderedList;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableData;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Test;

public class ParserTest extends org.eclipse.xtext.junit4.AbstractXtextTests {

	public static final String TEST_FILE_DIR = "testfiles" + File.separatorChar;
	private static final String DNL = "\n\n";
	private static final String CHAPTER_HEAD = "chapter[foo]\n\n";
	private static final String DOC_HEAD = "document[foo]\n\n";
	private static final String CLOSE_BRACKET = "]";

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new XdocStandaloneSetup());
	}

	@Test
	public void testSimple() throws Exception {
		String title = "Title vom Kapitel";
		String firstPart = "Hier kommt dann mal text ";
		String emphasized = "manchmal fett";
		String secondPart = " und manchmal nicht.\nNewlines und so gibt es auch.";
		String text = "chapter[" + title + "]\r\n\r\n" + firstPart + "e[" + emphasized + "]" + secondPart + "\n\n";
		// System.out.println(text);
		XdocFile model = getDoc(text);
		Chapter chapter = (Chapter) model.getMainSection();
		assertEquals(title, ((TextPart) ((chapter.getTitle()).getContents().get(0))).getText());
		assertEquals(1, chapter.getContents().size());
		TextOrMarkup p = chapter.getContents().get(0);
		assertEquals(firstPart, ((TextPart) p.getContents().get(0)).getText());
		assertEquals(emphasized,
				((TextPart) ((((Emphasize) p.getContents().get(1)).getContents().get(0)).getContents().get(0)))
						.getText());
		assertEquals(secondPart, ((TextPart) p.getContents().get(2)).getText());
	}

	@Test
	public void testsmallestDoc() throws Exception {
		getDoc("chapter[foo]\n\n bar");
		getDoc("section[foo]\n\n bar");
		getDoc("section2[foo]\n\n bar");
	}

	@Test
	public void testAnchoredReference() throws Exception {
		String anchor = " a[refName]";
		String fill = " Jump ";
		String refText = " to ";
		String ref = " ref:refName[" + refText + "]";
		XdocFile file = getDoc(CHAPTER_HEAD + anchor + fill + ref);
		TextOrMarkup textOrMarkup = file.getMainSection().getContents().get(0);
		assertEquals(4, textOrMarkup.getContents().size());
		Anchor a = (Anchor) textOrMarkup.getContents().get(1);
		Ref r = (Ref) textOrMarkup.getContents().get(3);
		assertEquals(a, r.getRef());
		assertEquals(refText, ((TextPart) (r.getContents().get(0)).getContents().get(0)).getText());
	}

	// FIXME
	// public void testCodeRef() throws Exception {
	// getDocFromFile(TEST_FILE_DIR + "codeRef.xdoc");
	// }
	@Test
	public void testCode() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "codeTest.xdoc");
		Document doc = (Document) file.getMainSection();
		EList<TextOrMarkup> contents = doc.getChapters().get(0).getContents();
		TextOrMarkup textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		CodeBlock cb = (CodeBlock) textOrMarkup.getContents().get(0);
		Code code = (Code) cb.getContents().get(0);
		assertEquals("\nclass Foo {\n" + "public static void main(String\\[\\] args){\n"
				+ "System.out.println(\"Hello World\\n\");\n" + "}\n" + "}\n", code.getContents());
		textOrMarkup = contents.get(1);
		cb = (CodeBlock) textOrMarkup.getContents().get(0);
		assertEquals(0, cb.getContents().size());
	}

	@Test
	public void testCodeWithLanguage() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "codeWithLanguageTest.xdoc");
		Document abstractSection = (Document) file.getMainSection();
		TextOrMarkup textOrMarkup = abstractSection.getChapters().get(0).getContents().get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		CodeBlock cb = (CodeBlock) textOrMarkup.getContents().get(0);
		assertEquals("\n\t/* a testclass */\n" + "\tclass Foo {\n"
				+ "\t\tpublic static void main(String\\[\\] args){\n"
				+ "\t\t\tSystem.out.println(\"Hello World\"+'\\n'); // say \"hello\"\n" + "\t\t}\n" + "\t}\n",
				((Code) cb.getContents().get(0)).getContents());
		assertEquals("Java", cb.getLanguage().getName());
	}

	@Test
	public void testComment() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "commentTest.xdoc");
		assertEquals(1, file.getMainSection().getContents().size());
	}

	@Test
	public void testLink() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "linkTest.xdoc");
		Link link = (Link) (file.getMainSection().getContents().get(0)).getContents().get(0);
		URL url;
		url = new URL(link.getUrl());
		URLConnection c = url.openConnection();
		assertNotNull(c);
	}

	@Test
	public void testNamedReference() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "namedRefAndTextTest.xdoc");
		Ref r = (Ref) (file.getMainSection().getContents().get(0)).getContents().get(0);
		assertEquals(file.getMainSection(), r.getRef());
		assertEquals("a Chapter", ((TextPart) r.getContents().get(0).getContents().get(0)).getText());
	}

	@Test
	public void testNestedList() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "nestedListTest.xdoc");
		UnorderedList outer = (UnorderedList) (file.getMainSection().getContents().get(0)).getContents().get(0);
		List<Item> items = outer.getItems();
		assertEquals(1, items.size());
		List<TextOrMarkup> itemContents = items.get(0).getContents();
		assertEquals(1, itemContents.size());
		List<EObject> contents = itemContents.get(0).getContents();
		// we have text parts for indentations
		assertEquals(3, contents.size());
		assertTrue(((TextPart) contents.get(0)).getText().matches("\\s+"));
		assertTrue(((TextPart) contents.get(2)).getText().matches("\\s+"));
		UnorderedList inner = (UnorderedList) contents.get(1);
		items = inner.getItems();
		assertEquals(1, items.size());
		itemContents = items.get(0).getContents();
		assertEquals(1, itemContents.size());
		assertEquals(1, itemContents.get(0).getContents().size());
		assertEquals("some item", ((TextPart) itemContents.get(0).getContents().get(0)).getText());
	}

	@Test
	public void testSimpleRef() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "simpleRefTest.xdoc");
		AbstractSection section = file.getMainSection();
		List<TextOrMarkup> contents = section.getContents();
		assertEquals(1, contents.size());
		TextOrMarkup textOrMarkup = contents.get(0);
		assertEquals(2, textOrMarkup.getContents().size());
		assertEquals("This is ", ((TextPart) textOrMarkup.getContents().get(0)).getText());
		assertEquals(section, ((Ref) textOrMarkup.getContents().get(1)).getRef());
	}

	@Test
	public void testEscape() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "testEscape.xdoc");
		TextOrMarkup textOrMarkup = file.getMainSection().getContents().get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		TextPart p = (TextPart) textOrMarkup.getContents().get(0);
		assertEquals("\\\\ \\[ \\]", p.getText());
	}

	@Test
	public void testImg() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "imgTest.xdoc");
	}

	@Test
	public void testUL() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "ulTest.xdoc");
		Chapter chapter = (Chapter) file.getMainSection();
		List<TextOrMarkup> contents = chapter.getContents();
		assertEquals(1, contents.size());
		TextOrMarkup textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		UnorderedList list = (UnorderedList) textOrMarkup.getContents().get(0);
		assertEquals(2, list.getItems().size());
		// test first item
		contents = list.getItems().get(0).getContents();
		assertEquals(1, contents.size());
		textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("An item", ((TextPart) textOrMarkup.getContents().get(0)).getText());
		// test second item
		contents = list.getItems().get(1).getContents();
		assertEquals(2, contents.size());
		textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("A paragraph", ((TextPart) textOrMarkup.getContents().get(0)).getText());
		textOrMarkup = contents.get(1);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("\titem", ((TextPart) textOrMarkup.getContents().get(0)).getText());
	}

	@Test
	public void testOL() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "olTest.xdoc");
		Chapter chapter = (Chapter) file.getMainSection();
		List<TextOrMarkup> contents = chapter.getContents();
		assertEquals(1, contents.size());
		TextOrMarkup textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		OrderedList list = (OrderedList) textOrMarkup.getContents().get(0);
		assertEquals(2, list.getItems().size());
		// test first item
		contents = list.getItems().get(0).getContents();
		assertEquals(1, contents.size());
		textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("An item", ((TextPart) textOrMarkup.getContents().get(0)).getText());
		// test second item
		contents = list.getItems().get(1).getContents();
		assertEquals(2, contents.size());
		textOrMarkup = contents.get(0);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("A paragraph", ((TextPart) textOrMarkup.getContents().get(0)).getText());
		textOrMarkup = contents.get(1);
		assertEquals(1, textOrMarkup.getContents().size());
		assertEquals("\titem", ((TextPart) textOrMarkup.getContents().get(0)).getText());
	}

	@Test
	public void testTable() throws Exception {
		String tableStart = "table[";
		String row = "tr[";
		String dataString = "this is";
		String dataString2 = "a two paragraph table entry";
		String d = CHAPTER_HEAD + tableStart + row + "td[" + dataString + DNL + dataString2 + CLOSE_BRACKET + "td[]"
				+ CLOSE_BRACKET + CLOSE_BRACKET;
		XdocFile file = getDoc(d);
		EList<TextOrMarkup> textOrMarkup = file.getMainSection().getContents();
		assertEquals(1, textOrMarkup.size());
		Table t = (Table) textOrMarkup.get(0).getContents().get(0);
		assertEquals(1, t.getRows().size());
		EList<TableData> data = t.getRows().get(0).getData();
		assertEquals(2, data.size());
		TableData td = data.get(0);
		EList<TextOrMarkup> contents = td.getContents();
		assertEquals(2, contents.size());
		TextPart text = (TextPart) contents.get(0).getContents().get(0);
		assertEquals(dataString, text.getText());
		text = (TextPart) contents.get(1).getContents().get(0);
		assertEquals(dataString2, text.getText());
		td = data.get(1);
		assertEquals(0, td.getContents().size());
	}

	@Test
	public void testCodeLangDef() throws Exception {
		String name = "Java";
		String[] expectedKeywords = { "final", "const", "goto", "strictfp" };
		String d = DOC_HEAD + "codelanguage-def[" + name + "][" + expectedKeywords[0] + "," + expectedKeywords[1]
				+ " , " + expectedKeywords[2] + ", " + expectedKeywords[3] + "]\n\nchapter[foo]\n\n";
		XdocFile file = getDoc(d);
		Document doc = (Document) file.getMainSection();
		List<LangDef> defs = doc.getLangDefs();
		assertEquals(1, defs.size());
		LangDef def = defs.get(0);
		assertEquals(name, def.getName());
		List<String> keywords = def.getKeywords();
		assertEquals(expectedKeywords.length, keywords.size());
		for (int i = 0; i < expectedKeywords.length; i++) {
			assertEquals(expectedKeywords[i], keywords.get(i));
		}
	}

	@Test
	public void testFullSectionHirarchy() throws Exception {
		XdocFile file = getDocFromFile(TEST_FILE_DIR + "downToSection4Test.xdoc");
		Document doc = (Document) file.getMainSection();
		assertEquals(1, doc.getTitle().getContents().size());
		TextPart textPart = (TextPart) (doc.getTitle().getContents().get(0));
		assertEquals("foo", textPart.getText());
		assertEquals(1, doc.getChapters().size());
		Chapter chapter = doc.getChapters().get(0);
		assertEquals(1, chapter.getTitle().getContents().size());
		textPart = (TextPart) (chapter.getTitle().getContents().get(0));
		assertEquals("bar", textPart.getText());
		assertEquals(1, chapter.getSubSections().size());
		Section section = chapter.getSubSections().get(0);
		assertEquals(1, section.getTitle().getContents().size());
		textPart = (TextPart) section.getTitle().getContents().get(0);
		assertEquals("fooß", textPart.getText());
		assertEquals(1, section.getSubSections().size());
		Section2 section2 = section.getSubSections().get(0);
		assertEquals(1, section2.getTitle().getContents().size());
		textPart = (TextPart) section2.getTitle().getContents().get(0);
		assertEquals("pilz", textPart.getText());
		assertEquals(1, section2.getSubSections().size());
		Section3 section3 = section2.getSubSections().get(0);
		assertEquals(1, section3.getTitle().getContents().size());
		textPart = (TextPart) section3.getTitle().getContents().get(0);
		assertEquals("sna", textPart.getText());
		assertEquals(1, section3.getSubSections().size());
		Section4 section4 = section3.getSubSections().get(0);
		assertEquals(1, section4.getTitle().getContents().size());
		textPart = (TextPart) section4.getTitle().getContents().get(0);
		assertEquals("fu", textPart.getText());
	}

	protected XdocFile getDoc(String string) throws Exception {
		return (XdocFile) doGetResource(new StringInputStream(string), URI.createFileURI("mytestmodel.xdoc"))
				.getContents().get(0);
	}

	protected XdocFile getDocFromFile(String fileName) throws FileNotFoundException, Exception {
		return (XdocFile) doGetResource(new FileInputStream(fileName), URI.createFileURI(fileName)).getContents()
				.get(0);
	}
}
