package org.eclipse.xtext.xdoc.tests;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

public class EclipseHelpGeneratorTest extends AbstractXdocGeneratorTest {

	private static final String RESULT_FILE = RESULT_DIR + "mytestmodel.xdoc.html";

	@Override
	public void testGenCodeWithLanguage() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeWithLanguageTest.xdoc");
		Document doc = (Document) file.getMainSection();
		generate(doc);
		generate(doc.getChapters().get(0));
		validate(EXPECTATION_DIR + "codeWithLanguage.html", RESULT_FILE);
	}

	@Override
	public void testGenCode() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeTest.xdoc");
		Document doc = (Document) file.getMainSection();
		generate(doc);
		generate(doc.getChapters().get(0));
		validate(EXPECTATION_DIR + "code.html", RESULT_FILE);
	}

	@Override
	public void testARef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "aRefTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "aRefExp.html", RESULT_FILE);
	}

	@Override
	public void testCodeRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeRef.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "codeRef.html", RESULT_FILE);
	}

	@Override
	public void testComment() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "commentTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "commentTest.html", RESULT_FILE);
	}

	@Override
	public void testImg() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "imgTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "imgTest.html", RESULT_FILE);
		validate(EXPECTATION_DIR + "test.png", RESULT_DIR + "test.png");
	}

	@Override
	public void testLink() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "linkTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "linkTest.html", RESULT_FILE);
	}

	@Override
	public void testRefText() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "namedRefAndTextTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "namedRefTextTest.html", RESULT_FILE);
	}

	@Override
	public void testNestedList() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "nestedListTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "nestedListTest.html", RESULT_FILE);
	}

	@Override
	public void testSimpleRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "simpleRefTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "simpleRefTest.html", RESULT_FILE);
	}

	@Override
	public void testEscape() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "testEscape.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "escapeTest.html", RESULT_FILE);
	}

	@Override
	public void testTable() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "table.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "table.html", RESULT_FILE);
	}

	@Override
	public void testTwoChapters() throws Exception {
		XtextResourceSet set = get(XtextResourceSet.class);
		set.getResource(URI.createURI(ParserTest.TEST_FILE_DIR + "01-twoChapters.xdoc"), true);
		set.getResource(URI.createURI(ParserTest.TEST_FILE_DIR + "02-twoChapters.xdoc"), true);
		XdocFile file = (XdocFile) getModel((XtextResource)set.getResource(URI.createURI(ParserTest.TEST_FILE_DIR + "twoChaptersDoc.xdoc"), true));
		Document doc = (Document) file.getMainSection();
		for(int i = 0; i < doc.getChapters().size(); i++) {
			Chapter chapter = doc.getChapters().get(i);
			generate(chapter);
		}
		generate(doc);
		validate(EXPECTATION_DIR + "01-twoChapters.xdoc.html", RESULT_DIR + "01-twoChapters.xdoc.html");
		validate(EXPECTATION_DIR + "02-twoChapters.xdoc.html", RESULT_DIR + "02-twoChapters.xdoc.html");
		validate(EXPECTATION_DIR + "twoChaptersTOC.xml", RESULT_DIR + "toc.xml");
	}

	@Override
	public void testFullHirarchy () throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "downToSection4Test.xdoc");
		// gen toc.xml
		generate(file);
		generate(((Document)file.getMainSection()).getChapters().get(0));
		validate(EXPECTATION_DIR + "fullHirarchyTOC.xml", RESULT_DIR + "toc.xml");
		validate(EXPECTATION_DIR + "fullHirarchy.xdoc.html", RESULT_FILE);
	}

	@Override
	protected void generate(EObject eObject)  {
		XpandFacade.create(getXpandCtx()).evaluate(
				"templates::eclipsehelp::Main::main", eObject);
	}

}
