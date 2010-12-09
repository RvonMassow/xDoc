package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xdoc.XdocStandaloneSetup;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

public class GeneratorTest extends AbstractXtextTests {

	private static final String RESULT_FILE = "test-gen/mytestmodel.xdoc.html";

	public static String EXPECTATION_DIR = "expectations/";

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
		xpandCtx = new XpandExecutionContextImpl(output, null);
		xpandCtx.registerMetaModel(new JavaBeansMetaModel());
	}

	public void testGenCodeWithLanguage() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeWithLanguageTest.xdoc");
		Document doc = (Document) file.getMainSection();
		generate(doc);
		generate(doc.getChapters().get(0));
		validate(EXPECTATION_DIR + "codeWithLanguage.html", RESULT_FILE);
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
