package org.eclipse.xtext.xdoc

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.util.StopWatch
import org.eclipse.xtext.xdoc.generator.util.Utils
import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.LangDef
import org.eclipse.xtext.xdoc.xdoc.XdocFactory
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XdocInjectorProvider))
public class UtilityTest {

	String testStringSplitting =
	"&nbsp;grammar&nbsp;org.eclipse.xtext.common.Terminals&nbsp;<br />\n" +
	"&nbsp;hidden(WS,&nbsp;ML_COMMENT,&nbsp;SL_COMMENT)<br />\n" +
	"import&nbsp;\"http://www.eclipse.org/emf/2002/Ecore\"&nbsp;as&nbsp;ecore<br />\n" +
	"terminal&nbsp;ID&nbsp;:&nbsp;<br />\n" +
	"&nbsp;&apos;^&apos;?(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;)&nbsp;(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;|&apos;0&apos;..&apos;9&apos;)*&nbsp;;<br />\n" +
	"terminal&nbsp;INT&nbsp;returns&nbsp;ecore::EInt:&nbsp;(&apos;0&apos;..&apos;9&apos;)+&nbsp;;<br />\n" +
	"terminal&nbsp;STRING&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;<br />\n" +
	"&nbsp;&apos;\"&apos;&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\&apos;|&apos;\"&apos;)&nbsp;)*&nbsp;&apos;\"&apos;&nbsp;|<br />\n" +
	"&nbsp;\"&apos;\"&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\\\&apos;|\"&apos;\")&nbsp;)*&nbsp;\"&apos;\";&nbsp;<br />\n" +
	"terminal&nbsp;ML_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;/*&apos;&nbsp;-&gt;&nbsp;&apos;*/&apos;&nbsp;;<br />\n" +
	"terminal&nbsp;SL_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;//&apos;&nbsp;!(&apos;\\n&apos;|&apos;\\r&apos;)*&nbsp;(&apos;\\r&apos;?&nbsp;&apos;\\n&apos;)?&nbsp;;<br />\n" +
	"terminal&nbsp;WS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;(&apos;&nbsp;&apos;|&apos;\\t&apos;|&apos\\;\\r&apos;|&apos;\\n&apos;)+&nbsp;;<br />\n" +
	"terminal&nbsp;ANY_OTHER:&nbsp;&nbsp;&nbsp;&nbsp;.&nbsp;;"


	LangDef testLangDef

	private String[] testKeyWords = newArrayList("grammar", "with", "import", "terminal", "returns")

	private String testCodeString =	
	'''
	class Foo{
		static int foo = 13;
	}	
	
	  '''.toString

	private String expectationCodeString = 
		'''
		class Foo{
			static int foo = 13;
		}'''.toString

	private CodeBlock testCodeBlock

	@Before
	def void setUp() {
		this.testLangDef = XdocFactory::eINSTANCE.createLangDef
		testLangDef.keywords += testKeyWords

		this.testCodeBlock = XdocFactory::eINSTANCE.createCodeBlock
		val testCode = XdocFactory::eINSTANCE.createCode
		testCode.contents = testCodeString
		testCodeBlock.contents += testCode
	}

/* TODO: replace Utils test
	@Test
	def testRemoveIndent() {
		val result = StringFormatter::removeIndent(this.testCodeBlock)
		1.assertEquals(result.contents.size)
		(result.contents.head instanceof Code).assertTrue
		val resultCode = result.contents.head as Code
		expectationCodeString.assertEquals(resultCode.contents)
	}
*/
	@Test	
	def testFormatCode() {
		val utils = new Utils()
		var code = ""
		val watch = new StopWatch()
		for (i : 0..1) {
			code = utils.formatCode("mein foo ist bar nicht baz.", langDef)
		}
		watch.resetAndLog("keywords")
		"mein&nbsp;<span class=\"keyword\">foo</span>&nbsp;ist&nbsp;<span class=\"keyword\">bar</span>&nbsp;nicht&nbsp;<span class=\"keyword\">baz</span>."
			.assertEquals(code)
	}

	@Test
	def testFormatCode_01() {
		val utils = new Utils();
		val code = utils.formatCode("/* mein foo ist bar nicht baz.*/", langDef)
		"<span class=\"comment\">/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.*/</span>"
			.assertEquals(code)
	}
	
	@Test
	def testFormatCode_02() {
		val utils = new Utils()
		val code = utils.formatCode("' mein foo ist bar nicht baz.'", langDef)
		"<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.&apos;</span>"
			.assertEquals(code)
	}
	
	@Test
	def testFormatCode_03() {
		val utils = new Utils()
		val code = utils.formatCode("' mein foo ist bar nicht baz.", null)
		"<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.</span>"
			.assertEquals(code)
	}

	@Test	
	def testFormatCode_04() {
		val utils = new Utils()
		val code = utils.formatCode("/* mein foo ist bar nicht baz.", null)
		"/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz."
		 	.assertEquals(code)
	}

	@Test
	def testFormatCode_05() {
		val utils = new Utils()
		val code = utils.formatCode("'\\[mein\\]'", null)
		"<span class=\"string\">&apos;\\[mein\\]&apos;</span>".assertEquals(code)
	}

	def create XdocFactory::eINSTANCE.createLangDef langDef() {
		langDef.keywords += newArrayList("foo", "bar", "baz", "dfsdf", "wweee", "dsfsd")
	}
}
