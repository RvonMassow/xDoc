package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xdoc.XDocStandaloneSetup;
import org.eclipse.xtext.xdoc.xDoc.Chapter;
import org.eclipse.xtext.xdoc.xDoc.Document;
import org.eclipse.xtext.xdoc.xDoc.Emphasize;
import org.eclipse.xtext.xdoc.xDoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xDoc.TextPart;

public class ParserTest extends AbstractXtextTests {
	
	private static final String TEST_FILE_DIR = "testfiles" + File.separatorChar;

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
		String text = "\\chapter["+title +"]\r\n\r\n" +
				firstPart+"\\emph["+emphasized+"]" +
				secondPart+"\n\n";
		System.out.println(text);
		Document model = (Document)getModel(text);
		Chapter chapter = model.getChapters().get(0);
		assertEquals(title,((TextPart)(((TextOrMarkup)chapter.getTitle()).getContents().get(0))).getText());
		assertEquals(1,chapter.getContents().size());
		TextOrMarkup p = (TextOrMarkup) chapter.getContents().get(0);
		assertEquals(firstPart, ((TextPart)p.getContents().get(0)).getText());
		assertEquals(emphasized, ((TextPart)(((TextOrMarkup)((Emphasize)p.getContents().get(1)).getContents().get(0)).getContents().get(0))).getText());
		assertEquals(secondPart, ((TextPart)p.getContents().get(2)).getText());
	}
	
	public void testsmallestDoc() throws Exception {
		getDoc("\\chapter[foo]\n\n bar");
		getDoc("\\section[foo]\n\n bar");
		getDoc("\\subsection[foo]\n\n bar");
	}
	
	public void testAnchoredReference() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "aRefTest.xdoc");
	}

	public void testCodeRef() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "codeRef.xdoc");
	}

	public void testCode() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "codeTest.xdoc");
	}

	public void testComment() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "commentTest.xdoc");
	}
	
	public void testLink() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "linkTest.xdoc");
	}
	
	public void testNamedReference() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "namedRefTest.xdoc");
	}

	public void testNestedList() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "nestedListTest.xdoc");
	}
	
	public void testSimpleRef() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "simpleRefTest.xdoc");
	}

	public void testEscape() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "testEscape.xdoc");
	}


	public void testTwoChapters() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "twoChapters.xdoc");
	}


	public void testUL() throws Exception {
		getDocFromFile(TEST_FILE_DIR + "ulTest.xdoc");
	}

	protected Document getDoc(String string) throws Exception {
		return (Document) getModel(string);
	}
	
	protected Document getDocFromFile(String string) throws FileNotFoundException, Exception {
		return (Document) getModel(new FileInputStream(string));
	}
}
