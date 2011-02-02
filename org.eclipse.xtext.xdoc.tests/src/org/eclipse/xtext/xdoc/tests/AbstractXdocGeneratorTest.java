package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderImpl;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.xdoc.XdocStandaloneSetup;

public abstract class AbstractXdocGeneratorTest extends AbstractXtextTests {

	protected static final String RESULT_DIR = "test-gen/";
	public static String EXPECTATION_DIR = "expectations/";
	public static String SRC_DIR = "testfiles/";
	protected ParserTest pTest;
	private XpandExecutionContextImpl xpandCtx;

	public AbstractXdocGeneratorTest() {
		super();
		File f = new File(RESULT_DIR);
		if(f.exists()) {
			deleteRecursive(f.listFiles());
		} else {
			f.mkdir();
		}
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new XdocStandaloneSetup());
		this.pTest = new ParserTest();
		this.pTest.setUp();

		Output output = new OutputImpl();
		Outlet outlet = new Outlet(RESULT_DIR);
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

	abstract protected void generate(EObject eObject);

	protected void validate(String expected, String result) throws Exception {
		FileChannel expF = new FileInputStream(expected).getChannel();
		FileChannel resultF = new FileInputStream(result).getChannel();
		ByteBuffer bExp = ByteBuffer.allocateDirect((int) expF.size());
		ByteBuffer bResult = ByteBuffer.allocateDirect((int) resultF.size());
		assertEquals(bExp.capacity(), bResult.capacity());
		expF.read(bExp);
		bExp.rewind();
		resultF.read(bResult);
		bResult.rewind();
		if(bExp.compareTo(bResult) != 0){
			for (int i = 0; bExp.hasRemaining() || bResult.hasRemaining(); i++) {
				char a = (char) bExp.get();
				char b = (char) bResult.get();
				if (a != b) {
					fail("Expected " + a +" but was " + b+ " at position " + bExp.position());
				}
			}
		}
	}

	protected XpandExecutionContext getXpandCtx() {
		return xpandCtx;
	}

	private void deleteRecursive(File... files) {
		for (File file : files) {
			if(file.isDirectory()) {
				deleteRecursive(file.listFiles());
				file.delete();
			}
			file.delete();
		}
	}

	public abstract void testGenCodeWithLanguage() throws Exception;

	public abstract void testGenCode() throws Exception;

	public abstract void testARef() throws Exception;

	public abstract void testCodeRef() throws Exception;

	public abstract void testComment() throws Exception;

	public abstract void testImg() throws Exception;

	public abstract void testLink() throws Exception;

	public abstract void testRefText() throws Exception;

	public abstract void testNestedList() throws Exception;

	public abstract void testSimpleRef() throws Exception;

	public abstract void testEscape() throws Exception;

	public abstract void testTable() throws Exception;

	public abstract void testTwoChapters() throws Exception;

	public abstract void testFullHirarchy() throws Exception;

}