package org.eclipse.xtext.xdoc.tests;

import java.io.File;
import java.net.URLDecoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xdoc.XdocInjectorProvider;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.HtmlGenerator;
import org.eclipse.xtext.xdoc.generator.Outlets;
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Test;

import com.google.inject.Inject;

@InjectWith(XdocInjectorProvider.class)
public class HTMLGeneratorTest extends AbstractXdocGeneratorTest {

	public static String HTML_SRC = "html" + File.separator;

	@Inject
	private HtmlGenerator generator;
	@Inject
	private HTMLNamingExtensions naming;
	@Inject
	private AbstractSectionExtension utils;
	@Inject
	JavaIoFileSystemAccess fsa;

	protected void generate(Document obj) throws Exception {
		fsa.setOutputPath(Outlets.WEB_SITE, Outlets.WEB_SITE_PATH_NAME);
		fsa.setOutputPath(System.getProperty("user.dir") + File.separatorChar + "test-gen" + File.separatorChar
				+ "html" + File.separatorChar);
		generator.generate(obj, fsa);
	}

	@Test
	public void testGenerationAllFilesFullHirarchy() throws Exception {
		String resName = "downToSection4Test";
		Document doc = createDocumentFrom(HTML_SRC + resName + ".xdoc");
		generate(doc);
		assertGenerated(doc);
		for (AbstractSection as : doc.getChapters()) {
			generate(as);
			assertGenerated(as);
			for (AbstractSection next : utils.sections(as)) {
				generate(next);
				assertGenerated(next);
			}
		}
	}

	// public void testHeader() throws Exception {
	// Document doc = initDoc("foo");
	// String expected = "<head>\n" +
	// "  <META http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n"
	// +
	// "  <title>foo</title>\n" +
	// "  <link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
	// "  <link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
	// "</head>\n";
	// String actual = generator.header(doc.getTitle()).toString();
	// assertEquals(expected, actual);
	// }

	// public void testEmptyBody() throws Exception {
	// Document doc = initDoc("foo");
	// String expected = "<body>\n" +
	// "</body>\n";
	// String actual = generator.body(doc).toString();
	// assertEquals(expected, actual);
	// }
	@Test
	public void testToc() throws Exception {
		Document doc = createDocumentFrom(HTML_SRC + "downToSection4Test.xdoc");
		String expected = "<div class=\"toc\" >\n" + "  <ol>\n"
				+ "    <li><a href=\"downToSection4Test-0.html\" >bar</a>\n" + "    <ol>\n"
				+ "      <li><a href=\"downToSection4Test-0-0.html\" >foo</a></li>\n"
				+ "      <li><a href=\"downToSection4Test-0-1.html\" >atom</a></li>\n" + "    </ol>\n" + "    </li>\n"
				+ "  </ol>\n" + "</div>\n";
		String actual = generator.toc(doc).toString();
		assertEquals(expected, actual);
	}

	@Test
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
		expected = "<em>\n" + "<p>\n" + "Testtext_\n" + "</p>\n" + "<p>\n" + "more test\n" + "</p>\n" + "</em>";
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
		validate("codeWithLanguageTest.html", name(document.getChapters().get(0)));
	}

	@Override
	public void testGenCode() throws Exception {
		Document document = createDocumentFrom("codeTest.xdoc");
		generate(document);
		assertGenerated(document);
		generate(document.getChapters().get(0));
		assertGenerated(document.getChapters().get(0));
		validate("codeTest.html", name(document.getChapters().get(0)));
	}

	@SuppressWarnings("deprecation")
	private String name(Identifiable id) {
		return URLDecoder.decode(naming.getResourceURL(id));
	}

	@Override
	public void testARef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "aRefTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("aRefTest.html", name(file.getMainSection()));
	}

	@Override
	public void testCodeRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "codeRef.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("codeRefTest.html", name(file.getMainSection()));
	}

	@Override
	public void testComment() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "commentTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("commentTest.html", name(file.getMainSection()));
	}

	@Override
	public void testLink() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "linkTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("linkTest.html", name(file.getMainSection()));
	}

	@Override
	public void testRefText() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "namedRefAndTextTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("namedRefAndTextTest.html", name(file.getMainSection()));
	}

	@Override
	public void testNestedList() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "nestedListTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("nestedListTest.html", name(file.getMainSection()));
	}

	@Override
	public void testSimpleRef() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "simpleRefTest.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("simpleRefTest.html", name(file.getMainSection()));
	}

	@Override
	public void testTable() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "table.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("table.html", name(file.getMainSection()));
	}

	@Override
	public void testTwoChapters() throws Exception {
		XtextResourceSet set = get(XtextResourceSet.class);
		Resource res = set.getResource(URI.createURI(ParserTest.TEST_FILE_DIR + "01-twoChapters.xdoc"), true);
		Chapter chapter0 = (Chapter) ((XdocFile) getModel((XtextResource) res)).getMainSection();
		res = set.getResource(URI.createURI(ParserTest.TEST_FILE_DIR + "02-twoChapters.xdoc"), true);
		Chapter chapter1 = (Chapter) ((XdocFile) getModel((XtextResource) res)).getMainSection();
		XdocFile file = (XdocFile) getModel((XtextResource) set.getResource(
				URI.createURI(ParserTest.TEST_FILE_DIR + "twoChaptersDoc.xdoc"), true));
		Document doc = (Document) file.getMainSection();
		for (int i = 0; i < doc.getChapters().size(); i++) {
			Chapter chapter = doc.getChapters().get(i);
			generate(chapter);
		}
		generate(doc);
		validate("01-twoChapters.html", name(chapter0));
		validate("02-twoChapters.html", name(chapter1));
		validate("twoChaptersDoc.html", name(doc));
	}

	@Override
	public void testImg() throws Exception {
		assertTrue("Implement", false);
	}

	@Override
	public void testEscape() throws Exception {
		XdocFile file = pTest.getDocFromFile(ParserTest.TEST_FILE_DIR + "testEscape.xdoc");
		generate(file.getMainSection());
		assertGenerated(file.getMainSection());
		validate("testEscape.html", name(file.getMainSection()));
	}

	@Override
	protected Document initDocFromFile(String string, String filename) throws Exception {
		Document doc = super.initDocFromFile(string, HTML_SRC + filename);
		URI uri = doc.eResource().getURI();
		URI appendSegment = uri.trimSegments(1).appendSegment(string + ".xdoc");
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
		File file = new File(RESULT_DIR + HTML_SRC + name(doc));
		boolean fileGenerated = file.exists();
		assertTrue(name(doc) + " not generated", fileGenerated);
	}

	@Override
	protected void validate(String expected, String result) throws Exception {
		super.validate(EXPECTATION_DIR + HTML_SRC + expected, RESULT_DIR + HTML_SRC + result);
	}

}
