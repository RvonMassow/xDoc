package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderImpl;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xdoc.XdocStandaloneSetup;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

public class GeneratorTest extends AbstractXtextTests {

	private static final String RESULT_DIR = "test-gen/";

	private static final String RESULT_FILE = RESULT_DIR + "mytestmodel.xdoc.html";

	public static String EXPECTATION_DIR = "expectations/";

	public static String SRC_DIR = "testfiles/";

	private ParserTest pTest;
	private XpandExecutionContextImpl xpandCtx;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new XdocStandaloneSetup());
		this.pTest = new ParserTest();
		this.pTest.setUp();

		File f = new File("test-gen/");
		if(f.exists()) {
			f.delete();
		}
		f.mkdir();

		Output output = new OutputImpl();
		Outlet outlet = new Outlet("test-gen/");
		output.addOutlet(outlet);

		ResourceLoaderFactory.setCurrentThreadResourceLoader(new ResourceLoaderImpl(getClass().getClassLoader()));
		xpandCtx = new XpandExecutionContextImpl(output, null);
		Map<String, Variable> variables = xpandCtx.getGlobalVariables();
		Variable srcDir = new Variable("srcDir", SRC_DIR);
		variables.put("srcDir", srcDir);
		Variable dir = new Variable("dir", RESULT_DIR);
		variables.put("dir", dir);
		xpandCtx.registerMetaModel(new JavaBeansMetaModel());
		ResourceLoaderFactory.setCurrentThreadResourceLoader(null);
	}

	public void testGenCodeWithLanguage() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeWithLanguageTest.xdoc");
		Document doc = (Document) file.getMainSection();
		generate(doc);
		generate(doc.getChapters().get(0));
		validate(EXPECTATION_DIR + "codeWithLanguage.html", RESULT_FILE);
	}

	public void testGenCode() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeTest.xdoc");
		Document doc = (Document) file.getMainSection();
		generate(doc);
		generate(doc.getChapters().get(0));
		validate(EXPECTATION_DIR + "code.html", RESULT_FILE);
	}

	public void testARef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "aRefTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "aRefExp.html", RESULT_FILE);
	}

	public void testCodeRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeRef.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "codeRef.html", RESULT_FILE);
	}

	public void testComment() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "commentTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "commentTest.html", RESULT_FILE);
	}

	public void testImg() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "imgTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "imgTest.html", RESULT_FILE);
		validate(EXPECTATION_DIR + "test.png", RESULT_DIR + "test.png");
	}

	public void testLink() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "linkTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "linkTest.html", RESULT_FILE);
	}

	public void testRefText() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "namedRefAndTextTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "namedRefTextTest.html", RESULT_FILE);
	}

	public void testNestedList() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "nestedListTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "nestedListTest.html", RESULT_FILE);
	}

	public void testSimpleRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "simpleRefTest.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "simpleRefTest.html", RESULT_FILE);
	}

	public void testEscape() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "testEscape.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "escapeTest.html", RESULT_FILE);
	}

	public void testTable() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "table.xdoc");
		generate(file);
		validate(EXPECTATION_DIR + "table.html", RESULT_FILE);
	}

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

	public void testFullHirarchy () throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "downToSection4Test.xdoc");
		// gen toc.xml
		generate(file);
		generate(((Document)file.getMainSection()).getChapters().get(0));
		validate(EXPECTATION_DIR + "fullHirarchyTOC.xml", RESULT_DIR + "toc.xml");
		validate(EXPECTATION_DIR + "fullHirarchy.xdoc.html", RESULT_FILE);
	}

	protected void generate(EObject eObject) {
		XpandFacade.create(this.xpandCtx).evaluate(
				"templates::eclipsehelp::Main::main", eObject);
	}

	private void validate(String expected, String result) throws Exception {
		FileChannel expF = new FileInputStream(expected).getChannel();
		FileChannel resultF = new FileInputStream(result).getChannel();
		ByteBuffer bExp = ByteBuffer.allocateDirect((int) expF.size());
		ByteBuffer bResult = ByteBuffer.allocateDirect((int) resultF.size());
		assertEquals(bExp.capacity(), bResult.capacity());
		expF.read(bExp);
		bExp.rewind();
		resultF.read(bResult);
		bResult.rewind();
		assertEquals(0, bExp.compareTo(bResult));
	}
}
