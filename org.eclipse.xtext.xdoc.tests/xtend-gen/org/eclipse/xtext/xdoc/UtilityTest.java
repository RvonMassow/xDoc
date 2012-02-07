package org.eclipse.xtext.xdoc;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.StopWatch;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.XdocInjectorProvider;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
public class UtilityTest {
  private String testStringSplitting = new Function0<String>() {
    public String apply() {
      String _operator_plus = StringExtensions.operator_plus("&nbsp;grammar&nbsp;org.eclipse.xtext.common.Terminals&nbsp;<br />\n", "&nbsp;hidden(WS,&nbsp;ML_COMMENT,&nbsp;SL_COMMENT)<br />\n");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "import&nbsp;\"http://www.eclipse.org/emf/2002/Ecore\"&nbsp;as&nbsp;ecore<br />\n");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "terminal&nbsp;ID&nbsp;:&nbsp;<br />\n");
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "&nbsp;&apos;^&apos;?(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;)&nbsp;(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;|&apos;0&apos;..&apos;9&apos;)*&nbsp;;<br />\n");
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "terminal&nbsp;INT&nbsp;returns&nbsp;ecore::EInt:&nbsp;(&apos;0&apos;..&apos;9&apos;)+&nbsp;;<br />\n");
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "terminal&nbsp;STRING&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;<br />\n");
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "&nbsp;&apos;\"&apos;&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\&apos;|&apos;\"&apos;)&nbsp;)*&nbsp;&apos;\"&apos;&nbsp;|<br />\n");
      String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "&nbsp;\"&apos;\"&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\\\&apos;|\"&apos;\")&nbsp;)*&nbsp;\"&apos;\";&nbsp;<br />\n");
      String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, "terminal&nbsp;ML_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;/*&apos;&nbsp;-&gt;&nbsp;&apos;*/&apos;&nbsp;;<br />\n");
      String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "terminal&nbsp;SL_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;//&apos;&nbsp;!(&apos;\\n&apos;|&apos;\\r&apos;)*&nbsp;(&apos;\\r&apos;?&nbsp;&apos;\\n&apos;)?&nbsp;;<br />\n");
      String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, "terminal&nbsp;WS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;(&apos;&nbsp;&apos;|&apos;\\t&apos;|&apos\\;\\r&apos;|&apos;\\n&apos;)+&nbsp;;<br />\n");
      String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, "terminal&nbsp;ANY_OTHER:&nbsp;&nbsp;&nbsp;&nbsp;.&nbsp;;");
      return _operator_plus_11;
    }
  }.apply();
  
  private LangDef testLangDef;
  
  private String[] testKeyWords = new Function0<String[]>() {
    public String[] apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("grammar", "with", "import", "terminal", "returns");
      return ((String[])Conversions.unwrapArray(_newArrayList, String.class));
    }
  }.apply();
  
  private String testCodeString = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class Foo{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("static int foo = 13;");
      _builder.newLine();
      _builder.append("}\t");
      _builder.newLine();
      _builder.newLine();
      String _string = _builder.toString();
      return _string;
    }
  }.apply();
  
  private String expectationCodeString = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class Foo{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("static int foo = 13;");
      _builder.newLine();
      _builder.append("}");
      String _string = _builder.toString();
      return _string;
    }
  }.apply();
  
  private CodeBlock testCodeBlock;
  
  @Before
  public void setUp() {
      LangDef _createLangDef = XdocFactory.eINSTANCE.createLangDef();
      this.testLangDef = _createLangDef;
      EList<String> _keywords = this.testLangDef.getKeywords();
      CollectionExtensions.<String>operator_add(_keywords, ((Iterable<? extends String>)Conversions.doWrapArray(this.testKeyWords)));
      CodeBlock _createCodeBlock = XdocFactory.eINSTANCE.createCodeBlock();
      this.testCodeBlock = _createCodeBlock;
      Code _createCode = XdocFactory.eINSTANCE.createCode();
      final Code testCode = _createCode;
      testCode.setContents(this.testCodeString);
      EList<EObject> _contents = this.testCodeBlock.getContents();
      CollectionExtensions.<Code>operator_add(_contents, testCode);
  }
  
  /**
   * TODO: replace Utils test
   * @Test
   * def testRemoveIndent() {
   * val result = StringFormatter::removeIndent(this.testCodeBlock)
   * 1.assertEquals(result.contents.size)
   * (result.contents.head instanceof Code).assertTrue
   * val resultCode = result.contents.head as Code
   * expectationCodeString.assertEquals(resultCode.contents)
   * }
   */
  @Test
  public void testFormatCode() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      String code = "";
      StopWatch _stopWatch = new StopWatch();
      final StopWatch watch = _stopWatch;
      Iterable<Integer> _operator_upTo = IntegerExtensions.operator_upTo(0, 1);
      for (final Integer i : _operator_upTo) {
        LangDef _langDef = this.langDef();
        String _formatCode = utils.formatCode("mein foo ist bar nicht baz.", _langDef);
        code = _formatCode;
      }
      watch.resetAndLog("keywords");
      Assert.assertEquals("mein&nbsp;<span class=\"keyword\">foo</span>&nbsp;ist&nbsp;<span class=\"keyword\">bar</span>&nbsp;nicht&nbsp;<span class=\"keyword\">baz</span>.", code);
  }
  
  @Test
  public void testFormatCode_01() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      LangDef _langDef = this.langDef();
      String _formatCode = utils.formatCode("/* mein foo ist bar nicht baz.*/", _langDef);
      final String code = _formatCode;
      Assert.assertEquals("<span class=\"comment\">/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.*/</span>", code);
  }
  
  @Test
  public void testFormatCode_02() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      LangDef _langDef = this.langDef();
      String _formatCode = utils.formatCode("\' mein foo ist bar nicht baz.\'", _langDef);
      final String code = _formatCode;
      Assert.assertEquals("<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.&apos;</span>", code);
  }
  
  @Test
  public void testFormatCode_03() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      String _formatCode = utils.formatCode("\' mein foo ist bar nicht baz.", null);
      final String code = _formatCode;
      Assert.assertEquals("<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.</span>", code);
  }
  
  @Test
  public void testFormatCode_04() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      String _formatCode = utils.formatCode("/* mein foo ist bar nicht baz.", null);
      final String code = _formatCode;
      Assert.assertEquals("/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.", code);
  }
  
  @Test
  public void testFormatCode_05() {
      Utils _utils = new Utils();
      final Utils utils = _utils;
      String _formatCode = utils.formatCode("\'\\[mein\\]\'", null);
      final String code = _formatCode;
      Assert.assertEquals("<span class=\"string\">&apos;\\[mein\\]&apos;</span>", code);
  }
  
  public LangDef langDef() {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList();
    final LangDef _result;
    synchronized (_createCache_langDef) {
      if (_createCache_langDef.containsKey(_cacheKey)) {
        return _createCache_langDef.get(_cacheKey);
      }
      LangDef _createLangDef = XdocFactory.eINSTANCE.createLangDef();
      _result = _createLangDef;
      _createCache_langDef.put(_cacheKey, _result);
    }
    _init_langDef(_result);
    return _result;
  }
  
  private final HashMap<ArrayList<?>,LangDef> _createCache_langDef = CollectionLiterals.newHashMap();
  
  private void _init_langDef(final LangDef it) {
      LangDef _langDef = this.langDef();
      EList<String> _keywords = _langDef.getKeywords();
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("foo", "bar", "baz", "dfsdf", "wweee", "dsfsd");
      CollectionExtensions.<String>operator_add(_keywords, _newArrayList);
  }
}
