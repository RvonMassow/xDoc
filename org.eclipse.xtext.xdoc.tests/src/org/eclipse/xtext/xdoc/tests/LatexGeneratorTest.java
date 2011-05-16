package org.eclipse.xtext.xdoc.tests;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xdoc.generator.LatexGenerator;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;

import com.google.inject.Inject;

public class LatexGeneratorTest extends AbstractXdocGeneratorTest {

	@Inject
	LatexGenerator gen;

	public void testSimpleDoc() throws Exception {
		Document doc = initDoc("Simple Doc");
		generate(doc);
	}

	@Override
	public void testFullHirarchy() throws Exception {
		Document doc = initDocFromFile("downToSection4Test", "downToSection4Test.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "fullHirarchy.tex", RESULT_DIR + "foo.tex");
	}

	@Override
	public void testGenCode() throws Exception {
		Document doc = initDocFromFile("code", "codeTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR+"codeTest.tex", RESULT_DIR+"Main.tex");
	}

	@Override
	public void testGenCodeWithLanguage() throws Exception {
		Document doc = initDocFromFile("codeWithLanguage", "codeWithLanguageTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "codeWithLanguage.tex", RESULT_DIR + "Main.tex");
	}

	@Override
	public void testARef() throws Exception {
		Document doc = initDocFromFile("aRefTest", "aRefTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR+"aRefTest.tex", RESULT_DIR+"aRefTest.tex");
	}

	@Override
	public void testCodeRef() throws Exception {
		Document doc = initDocFromFile("codeRef", "codeRef.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "codeRef.tex", RESULT_DIR + "codeRef.tex");
	}

	@Override
	public void testComment() throws Exception {
		Document doc = initDocFromFile("commentTest", "commentTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "commentTest.tex", RESULT_DIR + "commentTest.tex");
	}

	@Override
	public void testImg() throws Exception {
		Document doc = initDocFromFile("imgTest", "imgTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "imgTest.tex", RESULT_DIR + "imgTest.tex");
	}

	@Override
	public void testLink() throws Exception {
		Document doc = initDocFromFile("linkTest", "linkTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "linkTest.tex", RESULT_DIR + "linkTest.tex");
	}

	@Override
	public void testRefText() throws Exception {
		Document doc = initDocFromFile("namedRefAndTextTest", "namedRefAndTextTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "namedRefAndTextTest.tex", RESULT_DIR + "namedRefAndTextTest.tex");
	}

	@Override
	public void testNestedList() throws Exception {
		Document doc = initDocFromFile("nestedListTest", "nestedListTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "nestedListTest.tex", RESULT_DIR + "nestedListTest.tex");
	}

	@Override
	public void testSimpleRef() throws Exception {
		Document doc = initDocFromFile("simpleRefTest", "simpleRefTest.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "simpleRefTest.tex", RESULT_DIR + "simpleRefTest.tex");
	}

	@Override
	public void testEscape() throws Exception {
		Document doc = initDocFromFile("testEscape", "testEscape.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "testEscape.tex", RESULT_DIR + "testEscape.tex");
	}

	@Override
	public void testTable() throws Exception {
		Document doc = initDocFromFile("table", "table.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "table.tex", RESULT_DIR + "table.tex");
	}

	@Override
	public void testTwoChapters() throws Exception {
		Document doc = initDocFromFile("twoChapters", "twoChapters.xdoc");
		generate(doc);
		validate(EXPECTATION_DIR + "twoChapters.tex", RESULT_DIR + "Foo Title.tex");
	}

	private Document initDocFromFile(String string, String filename) throws Exception {
		XdocFile file = pTest.getDocFromFile(SRC_DIR + filename);
		AbstractSection mainSection = file.getMainSection();
		if(mainSection instanceof Document) {
			return (Document) mainSection;
		} else if(mainSection instanceof Chapter) {
			Document doc = initDoc(string);
			doc.getChapters().add((Chapter) mainSection);
			return doc;
		}
		return null;
	}

	private Document initDoc(String name) {
		Document result = XdocFactory.eINSTANCE.createDocument();
		TextOrMarkup tomTitle = XdocFactory.eINSTANCE.createTextOrMarkup();
		TextPart title = XdocFactory.eINSTANCE.createTextPart();
		title.setText(name);
		tomTitle.getContents().add(title);
		result.setTitle(tomTitle);
		return result;
	}

	@Override
	protected void generate(EObject eObject) {
		generate(eObject, "false");
	}

	private void generate(EObject obj, String release) {
		AbstractFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath(System.getProperty("user.dir")+File.separatorChar+"test-gen");
		gen.doGenerate(obj, fsa);
//		Map<String, Variable> vars = getXpandCtx().getGlobalVariables();
//		Variable var = new Variable("release", release);
//		vars.put("release", var);
//		XpandFacade.create(getXpandCtx()).evaluate(
//				"templates::Template::main", obj);
	}

}
