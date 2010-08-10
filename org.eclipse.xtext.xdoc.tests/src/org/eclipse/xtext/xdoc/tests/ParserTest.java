package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xdoc.XDocStandaloneSetup;
import org.eclipse.xtext.xdoc.xDoc.Anchor;
import org.eclipse.xtext.xdoc.xDoc.Chapter;
import org.eclipse.xtext.xdoc.xDoc.Code;
import org.eclipse.xtext.xdoc.xDoc.CodeBlock;
import org.eclipse.xtext.xdoc.xDoc.Document;
import org.eclipse.xtext.xdoc.xDoc.Emphasize;
import org.eclipse.xtext.xdoc.xDoc.Identifiable;
import org.eclipse.xtext.xdoc.xDoc.Link;
import org.eclipse.xtext.xdoc.xDoc.Ref;
import org.eclipse.xtext.xdoc.xDoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xDoc.TextPart;

public class ParserTest extends AbstractXtextTests {

	private static final String TEST_FILE_DIR = "testfiles"
			+ File.separatorChar;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new XDocStandaloneSetup());
	}

	public void testSimple() throws Exception {
		String title = "Title vom Kapitel";
		String firstPart = "Hier kommt dann mal text ";
		String emphasized = "manchmal fett";
		String secondPart = " und manchmal nicht.\n Newlines und so gibt es auch.";
		String text = "\\chapter[" + title + "]\r\n\r\n" + firstPart
				+ "\\emph[" + emphasized + "]" + secondPart + "\n\n";
		System.out.println(text);
		Document model = (Document) getModel(text);
		Chapter chapter = model.getChapters().get(0);
		assertEquals(title,
				((TextPart) (((TextOrMarkup) chapter.getTitle()).getContents()
						.get(0))).getText());
		assertEquals(1, chapter.getContents().size());
		TextOrMarkup p = (TextOrMarkup) chapter.getContents().get(0);
		assertEquals(firstPart, ((TextPart) p.getContents().get(0)).getText());
		assertEquals(emphasized,
				((TextPart) (((TextOrMarkup) ((Emphasize) p.getContents()
						.get(1)).getContents().get(0)).getContents().get(0)))
						.getText());
		assertEquals(secondPart, ((TextPart) p.getContents().get(2)).getText());
	}

	public void testsmallestDoc() throws Exception {
		getDoc("\\chapter[foo]\n\n bar");
		getDoc("\\section[foo]\n\n bar");
		getDoc("\\subsection[foo]\n\n bar");
	}

	public void testAnchoredReference() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "aRefTest.xdoc");
		Anchor a = (Anchor) ((TextOrMarkup) doc.getChapters().get(0)
				.getContents().get(0)).getContents().get(0);
		Ref r = (Ref) ((TextOrMarkup) doc.getChapters().get(0).getContents()
				.get(0)).getContents().get(2);
		assertEquals(a, r.getRef());
	}

	public void testCodeRef() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "codeRef.xdoc");
	}

	public void testCode() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "codeTest.xdoc");
		CodeBlock cb = (CodeBlock) ((TextOrMarkup) doc.getChapters().get(0)
				.getContents().get(0)).getContents().get(0);
		assertEquals("\nclass Foo {\n"
				+ "\tpublic static void main(String\\[\\] args){\n"
				+ "\t\tSystem.out.println(\"Hello World\\n\");\n" + "\t}\n"
				+ "}\n", ((Code) cb.getContents().get(0)).getContents());
	}
	
	public void testCodeWithLanguage() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "codeWithLanguageTest.xdoc");
		CodeBlock cb = (CodeBlock) ((TextOrMarkup) doc.getChapters().get(0)
				.getContents().get(0)).getContents().get(0);
		assertEquals("\nclass Foo {\n"
				+ "\tpublic static void main(String\\[\\] args){\n"
				+ "\t\tSystem.out.println(\"Hello World\\n\");\n" + "\t}\n"
				+ "}\n", ((Code) cb.getContents().get(0)).getContents());
		assertEquals("Java", cb.getLanguage());
	}

	public void testComment() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "commentTest.xdoc");
	}

	public void testLink() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "linkTest.xdoc");
		Link link = (Link) ((TextOrMarkup) doc.getChapters().get(0)
				.getContents().get(0)).getContents().get(0);
		URL url;
		url = new URL(link.getLink());
		URLConnection c = url.openConnection();
		assertNotNull(c);
	}

	public void testNamedReference() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "namedRefTest.xdoc");
		Ref r = (Ref) ((TextOrMarkup) doc.getChapters().get(0).getContents()
				.get(0)).getContents().get(0);
		assertEquals(doc.getChapters().get(0), r.getRef());
		assertEquals("a Chapter", ((TextPart) r.getContents().get(0)
				.getContents().get(0)).getText());
	}

	public void testNestedList() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "nestedListTest.xdoc");
	}

	public void testSimpleRef() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "simpleRefTest.xdoc");
	}

	public void testEscape() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "testEscape.xdoc");
		TextPart p = (TextPart) ((TextOrMarkup)doc.getChapters().get(0).getContents().get(0)).getContents().get(0);
		assertEquals("\\\\ \\[ \\]", p.getText());
	}

	public void testTwoChaptersXRef() throws Exception {
		Document doc = getDocFromFile(TEST_FILE_DIR + "twoChapters.xdoc");
		assertEquals(2, doc.getChapters().size());
		Chapter chapter1 = doc.getChapters().get(1);
		Identifiable chapterRef = ((Ref) ((TextOrMarkup) chapter1.getContents()
				.get(0)).getContents().get(1)).getRef();
		Chapter chapter0 = doc.getChapters().get(0);
		assertEquals(chapter0, chapterRef);
		EObject anchor = ((TextOrMarkup) chapter0.getContents().get(0))
				.getContents().get(1);
		Identifiable anchorRef = ((Ref) ((TextOrMarkup) chapter1.getContents()
				.get(0)).getContents().get(3)).getRef();
		assertEquals(anchor, anchorRef);
	}


	public void testImg() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "imgTest.xdoc");
	}
	
	public void testUL() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "ulTest.xdoc");
	}

	protected Document getDoc(String string) throws Exception {
		return (Document) getModel(string);
	}

	protected Document getDocFromFile(String string)
			throws FileNotFoundException, Exception {
		return (Document) getModel(new FileInputStream(string));
	}
}
