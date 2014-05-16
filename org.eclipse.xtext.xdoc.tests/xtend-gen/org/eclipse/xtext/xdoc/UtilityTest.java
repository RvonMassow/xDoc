package org.eclipse.xtext.xdoc;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.StopWatch;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IntegerRange;
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

@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
@SuppressWarnings("all")
public class UtilityTest {
  private String testStringSplitting = (((((((((((("&nbsp;grammar&nbsp;org.eclipse.xtext.common.Terminals&nbsp;<br />\n" + 
    "&nbsp;hidden(WS,&nbsp;ML_COMMENT,&nbsp;SL_COMMENT)<br />\n") + 
    "import&nbsp;\"http://www.eclipse.org/emf/2002/Ecore\"&nbsp;as&nbsp;ecore<br />\n") + 
    "terminal&nbsp;ID&nbsp;:&nbsp;<br />\n") + 
    "&nbsp;&apos;^&apos;?(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;)&nbsp;(&apos;a&apos;..&apos;z&apos;|&apos;A&apos;..&apos;Z&apos;|&apos;_&apos;|&apos;0&apos;..&apos;9&apos;)*&nbsp;;<br />\n") + 
    "terminal&nbsp;INT&nbsp;returns&nbsp;ecore::EInt:&nbsp;(&apos;0&apos;..&apos;9&apos;)+&nbsp;;<br />\n") + 
    "terminal&nbsp;STRING&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;<br />\n") + 
    "&nbsp;&apos;\"&apos;&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\&apos;|&apos;\"&apos;)&nbsp;)*&nbsp;&apos;\"&apos;&nbsp;|<br />\n") + 
    "&nbsp;\"&apos;\"&nbsp;(&nbsp;&apos;\\\\&apos;&nbsp;(&apos;b&apos;|&apos;t&apos;|&apos;n&apos;|&apos;f&apos;|&apos;r&apos;|&apos;\"&apos;|\"&apos;\"|&apos;\\\\&apos;)&nbsp;|&nbsp;!(&apos;\\\\&apos;|\"&apos;\")&nbsp;)*&nbsp;\"&apos;\";&nbsp;<br />\n") + 
    "terminal&nbsp;ML_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;/*&apos;&nbsp;-&gt;&nbsp;&apos;*/&apos;&nbsp;;<br />\n") + 
    "terminal&nbsp;SL_COMMENT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&apos;//&apos;&nbsp;!(&apos;\\n&apos;|&apos;\\r&apos;)*&nbsp;(&apos;\\r&apos;?&nbsp;&apos;\\n&apos;)?&nbsp;;<br />\n") + 
    "terminal&nbsp;WS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;(&apos;&nbsp;&apos;|&apos;\\t&apos;|&apos\\;\\r&apos;|&apos;\\n&apos;)+&nbsp;;<br />\n") + 
    "terminal&nbsp;ANY_OTHER:&nbsp;&nbsp;&nbsp;&nbsp;.&nbsp;;");
  
  private LangDef testLangDef;
  
  private String[] testKeyWords = ((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList("grammar", "with", "import", "terminal", "returns"), String.class));
  
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
    Iterables.<String>addAll(_keywords, ((Iterable<? extends String>)Conversions.doWrapArray(this.testKeyWords)));
    CodeBlock _createCodeBlock = XdocFactory.eINSTANCE.createCodeBlock();
    this.testCodeBlock = _createCodeBlock;
    final Code testCode = XdocFactory.eINSTANCE.createCode();
    testCode.setContents(this.testCodeString);
    EList<EObject> _contents = this.testCodeBlock.getContents();
    _contents.add(testCode);
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
    final Utils utils = new Utils();
    String code = "";
    final StopWatch watch = new StopWatch();
    IntegerRange _upTo = new IntegerRange(0, 1);
    for (final Integer i : _upTo) {
      LangDef _langDef = this.langDef();
      String _formatCode = utils.formatCode("mein foo ist bar nicht baz.", _langDef);
      code = _formatCode;
    }
    watch.resetAndLog("keywords");
    Assert.assertEquals("mein&nbsp;<span class=\"keyword\">foo</span>&nbsp;ist&nbsp;<span class=\"keyword\">bar</span>&nbsp;nicht&nbsp;<span class=\"keyword\">baz</span>.", code);
  }
  
  @Test
  public void testFormatCode_01() {
    final Utils utils = new Utils();
    LangDef _langDef = this.langDef();
    final String code = utils.formatCode("/* mein foo ist bar nicht baz.*/", _langDef);
    Assert.assertEquals("<span class=\"comment\">/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.*/</span>", code);
  }
  
  @Test
  public void testFormatCode_02() {
    final Utils utils = new Utils();
    LangDef _langDef = this.langDef();
    final String code = utils.formatCode("\' mein foo ist bar nicht baz.\'", _langDef);
    Assert.assertEquals("<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.&apos;</span>", code);
  }
  
  @Test
  public void testFormatCode_03() {
    final Utils utils = new Utils();
    final String code = utils.formatCode("\' mein foo ist bar nicht baz.", null);
    Assert.assertEquals("<span class=\"string\">&apos;&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.</span>", code);
  }
  
  @Test
  public void testFormatCode_04() {
    final Utils utils = new Utils();
    final String code = utils.formatCode("/* mein foo ist bar nicht baz.", null);
    Assert.assertEquals("/*&nbsp;mein&nbsp;foo&nbsp;ist&nbsp;bar&nbsp;nicht&nbsp;baz.", code);
  }
  
  @Test
  public void testFormatCode_05() {
    final Utils utils = new Utils();
    final String code = utils.formatCode("\'\\[mein\\]\'", null);
    Assert.assertEquals("<span class=\"string\">&apos;\\[mein\\]&apos;</span>", code);
  }
  
  public LangDef langDef() {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList();
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
  
  private final HashMap<ArrayList<?>, LangDef> _createCache_langDef = CollectionLiterals.newHashMap();
  
  private void _init_langDef(final LangDef it) {
    LangDef _langDef = this.langDef();
    EList<String> _keywords = _langDef.getKeywords();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("foo", "bar", "baz", "dfsdf", "wweee", "dsfsd");
    Iterables.<String>addAll(_keywords, _newArrayList);
  }
}
