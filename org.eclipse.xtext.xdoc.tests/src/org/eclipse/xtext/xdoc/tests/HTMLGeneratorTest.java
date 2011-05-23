package org.eclipse.xtext.xdoc.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xdoc.generator.HtmlGenerator;
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;
import com.google.inject.Inject;

public class HTMLGeneratorTest extends AbstractXdocGeneratorTest {

	public static String HTML_SRC = "html" + File.separator;

	@Inject
	private HtmlGenerator generator;
	@Inject
	private HTMLNamingExtensions naming;
	@Inject
	private Utils utils;

	protected void generate(AbstractSection obj) throws Exception {
		AbstractFileSystemAccess fsa = new JavaIoFileSystemAccess();
		fsa.setOutputPath(System.getProperty("user.dir") + File.separatorChar+"test-gen"+ File.separatorChar+ "html" + File.separatorChar);
		generator.generate(obj, fsa);
	}

	public void testGenerationAllFilesFullHirarchy() throws Exception {
		String resName = "downToSection4Test";
		Document doc = createDocumentFrom(HTML_SRC + resName + ".xdoc");
		generate(doc);
		assertGenerated(doc);
		for (AbstractSection as : doc.getChapters()) {
			generate(as);
			assertGenerated(as);
			for(AbstractSection next: utils.subSection(as)){
				generate(next);
				assertGenerated(next);
			}
		}
	}

	public void testHeader() throws Exception {
		Document doc = initDoc("foo");
		String expected = "<head>\n" +
				"  <title>foo</title>\n" +
				"  <link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
				"  <link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
				"</head>\n";
		String actual = generator.header(doc.getTitle()).toString();
		assertEquals(expected, actual);
	}

	public void testEmptyBody() throws Exception {
		Document doc = initDoc("foo");
		String expected = "<body>\n" +
				"</body>\n";
		String actual = generator.body(doc).toString();
		assertEquals(expected, actual);
	}

	public void testToc() throws Exception {
		Document doc = createDocumentFrom(HTML_SRC+ "downToSection4Test.xdoc");
		String expected = "<div class=\"toc\" >\n" +
				"  <ol>\n" +
				"    <li><a href=\"downToSection4Test-0.html\" >bar</a>\n" +
				"    <ol>\n" +
				"      <li><a href=\"downToSection4Test-0-0.html\" >foo</a></li>\n" +
				"      <li><a href=\"downToSection4Test-0-1.html\" >atom</a></li>\n" +
				"    </ol>\n" +
				"    </li>\n" +
				"  </ol>\n" +
				"</div>\n";
		String actual = generator.toc(doc).toString();
		assertEquals(expected, actual);
	}

	public void testEm() throws Exception {
		XdocFactory fac = XdocFactory.eINSTANCE;
		Emphasize emphasize = fac.createEmphasize();
		TextOrMarkup textOrMarkup = fac.createTextOrMarkup();
		TextPart textPart = fac.createTextPart();
		textPart.setText("Testtext_");
		textOrMarkup.getContents().add(textPart);
		emphasize.getContents().add(textOrMarkup);
		String expected = "<em>Testtext_</em>";
		String actual = generator.genText(emphasize).toString();
		assertEquals(expected, actual);
		// and for two paragraphs in one em
		TextOrMarkup textOrMarkup2 = fac.createTextOrMarkup();
		TextPart textPart2 = fac.createTextPart();
		textPart2.setText("more test");
		textOrMarkup2.getContents().add(textPart2);
		emphasize.getContents().add(textOrMarkup2);
		expected = "<em>\n" +
				"<p>\n" +
				"Testtext_\n" +
				"</p>\n" +
				"<p>\n" +
				"more test\n" +
				"</p>\n" +
				"</em>";
		actual = generator.genText(emphasize).toString();
		assertEquals(expected, actual);
	}

	@Override
	public void testGenCodeWithLanguage() throws Exception {
		Document document = createDocumentFrom("codeWithLanguageTest.xdoc");
		generate(document);
		assertGenerated(document);
		generate(document.getChapters().get(0));
		assertGenerated(document.getChapters().get(0));
		validate("codeWithLanguageTest.html", naming.fileName(document.getChapters().get(0)));
	}

	@Override
	public void testGenCode() throws Exception {
		Document document = createDocumentFrom("codeTest.xdoc");
		generate(document);
		assertGenerated(document);
		generate(document.getChapters().get(0));
		assertGenerated(document.getChapters().get(0));
		validate("codeTest.html", naming.fileName(document.getChapters().get(0)));
	}

	@Override
	public void testARef() throws Exception {
		Document doc = initDoc("testARef");
		Chapter chapter = createChapterFrom("aRefTest.xdoc");
		doc.getChapters().add(chapter);
		generate(doc);
		assertGenerated(doc);
		validate("aRefTest.html", naming.fileName(chapter));
	}

	@Override
	public void testCodeRef() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testComment() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testImg() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testLink() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testRefText() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testNestedList() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testSimpleRef() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testEscape() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testTable() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testTwoChapters() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	protected Document initDocFromFile(String string, String filename)
			throws Exception {
		Document doc = super.initDocFromFile(string, HTML_SRC + filename);
		URI uri = doc.eResource().getURI();
		URI appendSegment = uri.trimSegments(1).appendSegment(string+".xdoc");
		doc.eResource().setURI(appendSegment);
		return doc;
	}

	@Override
	protected void generate(EObject eObject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void testFullHirarchy() throws Exception {
		// TODO Auto-generated method stub

	}

	public Chapter getChapter(String title) {
		Chapter chapter = XdocFactory.eINSTANCE.createChapter();
		TextPart tp = XdocFactory.eINSTANCE.createTextPart();
		tp.setText(title);
		TextOrMarkup tom = XdocFactory.eINSTANCE.createTextOrMarkup();
		tom.getContents().add(tp);
		chapter.setTitle(tom);
		return chapter;
	}

	public Section getSection(String title) {
		Section section = XdocFactory.eINSTANCE.createSection();
		TextPart tp = XdocFactory.eINSTANCE.createTextPart();
		tp.setText(title);
		TextOrMarkup tom = XdocFactory.eINSTANCE.createTextOrMarkup();
		tom.getContents().add(tp);
		section.setTitle(tom);
		return section;
	}

	public void assertGenerated(AbstractSection doc) {
		File file = new File(RESULT_DIR + HTML_SRC + naming.fileName(doc));
		boolean fileGenerated = file.exists();
		assertTrue(naming.fileName(doc) + " not generated", fileGenerated);
	}

	@Override
	protected void validate(String expected, String result) throws Exception {
		super.validate(EXPECTATION_DIR + HTML_SRC + expected, RESULT_DIR + HTML_SRC + result);
	}

}
