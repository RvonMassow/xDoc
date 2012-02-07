package org.eclipse.xtext.xdoc;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.XdocInjectorProvider;
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions;
import org.eclipse.xtext.xdoc.util.ParserTestConstants;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Item;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.OrderedList;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableData;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
public class ParserTest {
  @Inject
  private ParseHelperExtensions<XdocFile> _parseHelperExtensions;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSimple() {
    try {
      {
        final String title = "Title vom Kapitel";
        final String firstPart = "Hier kommt dann mal text ";
        final String emphasized = "manchmal fett";
        final String secondPart = " und manchmal nicht.\nNewlines und so gibt es auch.";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("chapter[");
        _builder.append(title, "");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append(firstPart, "");
        _builder.append("e[");
        _builder.append(emphasized, "");
        _builder.append("]");
        _builder.append(secondPart, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        final CharSequence text = _builder;
        String _string = text.toString();
        XdocFile _parse = this._parseHelperExtensions.parse(_string);
        final XdocFile model = _parse;
        this._validationTestHelper.assertNoErrors(model);
        AbstractSection _mainSection = model.getMainSection();
        final Chapter chapter = ((Chapter) _mainSection);
        TextOrMarkup _title = chapter.getTitle();
        EList<EObject> _contents = _title.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents);
        String _text = ((TextPart) _head).getText();
        Assert.assertEquals(title, _text);
        EList<TextOrMarkup> _contents_1 = chapter.getContents();
        int _size = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        EList<TextOrMarkup> _contents_2 = chapter.getContents();
        TextOrMarkup _head_1 = IterableExtensions.<TextOrMarkup>head(_contents_2);
        final TextOrMarkup p = _head_1;
        EList<EObject> _contents_3 = p.getContents();
        EObject _head_2 = IterableExtensions.<EObject>head(_contents_3);
        String _text_1 = ((TextPart) _head_2).getText();
        Assert.assertEquals(firstPart, _text_1);
        EList<EObject> _contents_4 = p.getContents();
        Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_4);
        EObject _head_3 = IterableExtensions.<EObject>head(_tail);
        EList<TextOrMarkup> _contents_5 = ((Emphasize) _head_3).getContents();
        TextOrMarkup _head_4 = IterableExtensions.<TextOrMarkup>head(_contents_5);
        EList<EObject> _contents_6 = _head_4.getContents();
        EObject _head_5 = IterableExtensions.<EObject>head(_contents_6);
        String _text_2 = ((TextPart) _head_5).getText();
        Assert.assertEquals(emphasized, _text_2);
        EList<EObject> _contents_7 = p.getContents();
        Iterable<EObject> _tail_1 = IterableExtensions.<EObject>tail(_contents_7);
        Iterable<EObject> _tail_2 = IterableExtensions.<EObject>tail(_tail_1);
        EObject _head_6 = IterableExtensions.<EObject>head(_tail_2);
        String _text_3 = ((TextPart) _head_6).getText();
        Assert.assertEquals(secondPart, _text_3);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testsmallestDoc() {
    try {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("chapter[foo bar]");
        XdocFile _parse = this._parseHelperExtensions.parse(_builder);
        this._validationTestHelper.assertNoErrors(_parse);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("section[foo]");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("bar");
        _builder_1.newLine();
        XdocFile _parse_1 = this._parseHelperExtensions.parse(_builder_1);
        this._validationTestHelper.assertNoErrors(_parse_1);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("section2[foo]");
        _builder_2.newLine();
        _builder_2.newLine();
        _builder_2.append("bar");
        _builder_2.newLine();
        XdocFile _parse_2 = this._parseHelperExtensions.parse(_builder_2);
        this._validationTestHelper.assertNoErrors(_parse_2);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnchoredReference() {
    try {
      {
        final String anchor = " a[refName]";
        final String fill = " Jump ";
        final String refText = " to ";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("ref:refName[");
        _builder.append(refText, " ");
        _builder.append("]");
        final CharSequence ref = _builder;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(ParserTestConstants.CHAPTER_HEAD, "");
        _builder_1.append(anchor, "");
        _builder_1.append(fill, "");
        _builder_1.append(ref, "");
        XdocFile _parse = this._parseHelperExtensions.parse(_builder_1);
        final XdocFile file = _parse;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
        final TextOrMarkup textOrMarkup = _head;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(4), Integer.valueOf(_size));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_2);
        EObject _head_1 = IterableExtensions.<EObject>head(_tail);
        final EObject a = _head_1;
        EList<EObject> _contents_3 = textOrMarkup.getContents();
        EObject _get = _contents_3.get(3);
        final Ref r = ((Ref) _get);
        Identifiable _ref = r.getRef();
        Assert.assertEquals(a, _ref);
        EList<TextOrMarkup> _contents_4 = r.getContents();
        TextOrMarkup _head_2 = IterableExtensions.<TextOrMarkup>head(_contents_4);
        EList<EObject> _contents_5 = _head_2.getContents();
        EObject _head_3 = IterableExtensions.<EObject>head(_contents_5);
        String _text = ((TextPart) _head_3).getText();
        Assert.assertEquals(refText, _text);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCode() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "codeTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final Document doc = ((Document) _mainSection);
        EList<Chapter> _chapters = doc.getChapters();
        Chapter _head = IterableExtensions.<Chapter>head(_chapters);
        EList<TextOrMarkup> _contents = _head.getContents();
        final EList<TextOrMarkup> contents = _contents;
        TextOrMarkup _head_1 = IterableExtensions.<TextOrMarkup>head(contents);
        TextOrMarkup textOrMarkup = _head_1;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _head_2 = IterableExtensions.<EObject>head(_contents_2);
        CodeBlock cb = ((CodeBlock) _head_2);
        EList<EObject> _contents_3 = cb.getContents();
        EObject _head_3 = IterableExtensions.<EObject>head(_contents_3);
        final Code code = ((Code) _head_3);
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("class Foo {");
        _builder.newLine();
        _builder.append("public static void main(String\\[\\] args){");
        _builder.newLine();
        _builder.append("System.out.println(\"Hello World\\n\");");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        String _string = _builder.toString();
        String _contents_4 = code.getContents();
        Assert.assertEquals(_string, _contents_4);
        Iterable<TextOrMarkup> _tail = IterableExtensions.<TextOrMarkup>tail(contents);
        TextOrMarkup _head_4 = IterableExtensions.<TextOrMarkup>head(_tail);
        textOrMarkup = _head_4;
        EList<EObject> _contents_5 = textOrMarkup.getContents();
        EObject _head_5 = IterableExtensions.<EObject>head(_contents_5);
        cb = ((CodeBlock) _head_5);
        EList<EObject> _contents_6 = cb.getContents();
        int _size_1 = _contents_6.size();
        Assert.assertEquals(Integer.valueOf(0), Integer.valueOf(_size_1));
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCodeWithLanguage() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "codeWithLanguageTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final Document abstractSection = ((Document) _mainSection);
        EList<Chapter> _chapters = abstractSection.getChapters();
        Chapter _get = _chapters.get(0);
        EList<TextOrMarkup> _contents = _get.getContents();
        TextOrMarkup _get_1 = _contents.get(0);
        final TextOrMarkup textOrMarkup = _get_1;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size = _contents_1.size();
        Assert.assertEquals(1, _size);
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _get_2 = _contents_2.get(0);
        final CodeBlock cb = ((CodeBlock) _get_2);
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("\t", "");
        _builder.append("/* a testclass */");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("class Foo {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public static void main(String\\[\\] args){");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("System.out.println(\"Hello World\"+\'\\n\'); // say \"hello\"");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        String _string = _builder.toString();
        EList<EObject> _contents_3 = cb.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents_3);
        String _contents_4 = ((Code) _head).getContents();
        Assert.assertEquals(_string, _contents_4);
        LangDef _language = cb.getLanguage();
        String _name = _language.getName();
        Assert.assertEquals("Java", _name);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComment() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "commentTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        int _size = _contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLink() throws Exception {
      String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "linkTest.xdoc");
      XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
      final XdocFile file = _docFromFile;
      AbstractSection _mainSection = file.getMainSection();
      EList<TextOrMarkup> _contents = _mainSection.getContents();
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
      EList<EObject> _contents_1 = _head.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
      final Link link = ((Link) _head_1);
      String _url = link.getUrl();
      URL _uRL = new URL(_url);
      final URL url = _uRL;
      URLConnection _openConnection = url.openConnection();
      final URLConnection connection = _openConnection;
      Assert.assertNotNull(connection);
  }
  
  @Test
  public void testNamedReference() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "namedRefAndTextTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
        EList<EObject> _contents_1 = _head.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
        final Ref r = ((Ref) _head_1);
        AbstractSection _mainSection_1 = file.getMainSection();
        Identifiable _ref = r.getRef();
        Assert.assertEquals(_mainSection_1, _ref);
        EList<TextOrMarkup> _contents_2 = r.getContents();
        TextOrMarkup _head_2 = IterableExtensions.<TextOrMarkup>head(_contents_2);
        EList<EObject> _contents_3 = _head_2.getContents();
        EObject _head_3 = IterableExtensions.<EObject>head(_contents_3);
        String _text = ((TextPart) _head_3).getText();
        Assert.assertEquals("a Chapter", _text);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNestedList() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "nestedListTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
        EList<EObject> _contents_1 = _head.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
        final UnorderedList outer = ((UnorderedList) _head_1);
        EList<Item> _items = outer.getItems();
        EList<Item> items = _items;
        int _size = items.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        Item _head_2 = IterableExtensions.<Item>head(items);
        EList<TextOrMarkup> _contents_2 = _head_2.getContents();
        EList<TextOrMarkup> itemContents = _contents_2;
        int _size_1 = itemContents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_1));
        TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(itemContents);
        EList<EObject> _contents_3 = _head_3.getContents();
        final EList<EObject> contents = _contents_3;
        int _size_2 = contents.size();
        Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(_size_2));
        EObject _head_4 = IterableExtensions.<EObject>head(contents);
        String _text = ((TextPart) _head_4).getText();
        boolean _matches = _text.matches("\\s+");
        Assert.assertTrue(_matches);
        EObject _get = contents.get(2);
        String _text_1 = ((TextPart) _get).getText();
        boolean _matches_1 = _text_1.matches("\\s+");
        Assert.assertTrue(_matches_1);
        Iterable<EObject> _tail = IterableExtensions.<EObject>tail(contents);
        EObject _head_5 = IterableExtensions.<EObject>head(_tail);
        final UnorderedList inner = ((UnorderedList) _head_5);
        EList<Item> _items_1 = inner.getItems();
        items = _items_1;
        int _size_3 = items.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_3));
        Item _head_6 = IterableExtensions.<Item>head(items);
        EList<TextOrMarkup> _contents_4 = _head_6.getContents();
        itemContents = _contents_4;
        int _size_4 = itemContents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_4));
        TextOrMarkup _head_7 = IterableExtensions.<TextOrMarkup>head(itemContents);
        EList<EObject> _contents_5 = _head_7.getContents();
        int _size_5 = _contents_5.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_5));
        TextOrMarkup _head_8 = IterableExtensions.<TextOrMarkup>head(itemContents);
        EList<EObject> _contents_6 = _head_8.getContents();
        EObject _head_9 = IterableExtensions.<EObject>head(_contents_6);
        String _text_2 = ((TextPart) _head_9).getText();
        Assert.assertEquals("some item", _text_2);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleRef() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "simpleRefTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final AbstractSection section = _mainSection;
        EList<TextOrMarkup> _contents = section.getContents();
        final EList<TextOrMarkup> contents = _contents;
        int _size = contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(contents);
        final TextOrMarkup textOrMarkup = _head;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size_1 = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_1));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_2);
        String _text = ((TextPart) _head_1).getText();
        Assert.assertEquals("This is ", _text);
        EList<EObject> _contents_3 = textOrMarkup.getContents();
        Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_3);
        EObject _head_2 = IterableExtensions.<EObject>head(_tail);
        Identifiable _ref = ((Ref) _head_2).getRef();
        Assert.assertEquals(section, _ref);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEscape() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "testEscape.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
        final TextOrMarkup textOrMarkup = _head;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_2);
        final TextPart p = ((TextPart) _head_1);
        String _text = p.getText();
        Assert.assertEquals("\\\\ \\[ \\]", _text);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testImg() {
    try {
      String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "imgTest.xdoc");
      XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
      this._validationTestHelper.assertNoErrors(_docFromFile);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUL() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "ulTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final Chapter chapter = ((Chapter) _mainSection);
        EList<TextOrMarkup> _contents = chapter.getContents();
        EList<TextOrMarkup> contents = _contents;
        int _size = contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(contents);
        TextOrMarkup textOrMarkup = _head;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size_1 = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_1));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_2);
        final UnorderedList list = ((UnorderedList) _head_1);
        EList<Item> _items = list.getItems();
        int _size_2 = _items.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_2));
        EList<Item> _items_1 = list.getItems();
        Item _head_2 = IterableExtensions.<Item>head(_items_1);
        EList<TextOrMarkup> _contents_3 = _head_2.getContents();
        contents = _contents_3;
        int _size_3 = contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_3));
        TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(contents);
        textOrMarkup = _head_3;
        EList<EObject> _contents_4 = textOrMarkup.getContents();
        int _size_4 = _contents_4.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_4));
        EList<EObject> _contents_5 = textOrMarkup.getContents();
        EObject _head_4 = IterableExtensions.<EObject>head(_contents_5);
        String _text = ((TextPart) _head_4).getText();
        Assert.assertEquals("An item", _text);
        EList<Item> _items_2 = list.getItems();
        Iterable<Item> _tail = IterableExtensions.<Item>tail(_items_2);
        Item _head_5 = IterableExtensions.<Item>head(_tail);
        EList<TextOrMarkup> _contents_6 = _head_5.getContents();
        contents = _contents_6;
        int _size_5 = contents.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_5));
        TextOrMarkup _head_6 = IterableExtensions.<TextOrMarkup>head(contents);
        textOrMarkup = _head_6;
        EList<EObject> _contents_7 = textOrMarkup.getContents();
        int _size_6 = _contents_7.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_6));
        EList<EObject> _contents_8 = textOrMarkup.getContents();
        EObject _head_7 = IterableExtensions.<EObject>head(_contents_8);
        String _text_1 = ((TextPart) _head_7).getText();
        Assert.assertEquals("A paragraph", _text_1);
        Iterable<TextOrMarkup> _tail_1 = IterableExtensions.<TextOrMarkup>tail(contents);
        TextOrMarkup _head_8 = IterableExtensions.<TextOrMarkup>head(_tail_1);
        textOrMarkup = _head_8;
        EList<EObject> _contents_9 = textOrMarkup.getContents();
        int _size_7 = _contents_9.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_7));
        EList<EObject> _contents_10 = textOrMarkup.getContents();
        EObject _head_9 = IterableExtensions.<EObject>head(_contents_10);
        String _text_2 = ((TextPart) _head_9).getText();
        Assert.assertEquals("\titem", _text_2);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOL() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "olTest.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final Chapter chapter = ((Chapter) _mainSection);
        EList<TextOrMarkup> _contents = chapter.getContents();
        EList<TextOrMarkup> contents = _contents;
        int _size = contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(contents);
        TextOrMarkup textOrMarkup = _head;
        EList<EObject> _contents_1 = textOrMarkup.getContents();
        int _size_1 = _contents_1.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_1));
        EList<EObject> _contents_2 = textOrMarkup.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_2);
        final OrderedList list = ((OrderedList) _head_1);
        EList<Item> _items = list.getItems();
        int _size_2 = _items.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_2));
        EList<Item> _items_1 = list.getItems();
        Item _head_2 = IterableExtensions.<Item>head(_items_1);
        EList<TextOrMarkup> _contents_3 = _head_2.getContents();
        contents = _contents_3;
        int _size_3 = contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_3));
        TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(contents);
        textOrMarkup = _head_3;
        EList<EObject> _contents_4 = textOrMarkup.getContents();
        int _size_4 = _contents_4.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_4));
        EList<EObject> _contents_5 = textOrMarkup.getContents();
        EObject _head_4 = IterableExtensions.<EObject>head(_contents_5);
        String _text = ((TextPart) _head_4).getText();
        Assert.assertEquals("An item", _text);
        EList<Item> _items_2 = list.getItems();
        Iterable<Item> _tail = IterableExtensions.<Item>tail(_items_2);
        Item _head_5 = IterableExtensions.<Item>head(_tail);
        EList<TextOrMarkup> _contents_6 = _head_5.getContents();
        contents = _contents_6;
        int _size_5 = contents.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_5));
        TextOrMarkup _head_6 = IterableExtensions.<TextOrMarkup>head(contents);
        textOrMarkup = _head_6;
        EList<EObject> _contents_7 = textOrMarkup.getContents();
        int _size_6 = _contents_7.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_6));
        EList<EObject> _contents_8 = textOrMarkup.getContents();
        EObject _head_7 = IterableExtensions.<EObject>head(_contents_8);
        String _text_1 = ((TextPart) _head_7).getText();
        Assert.assertEquals("A paragraph", _text_1);
        Iterable<TextOrMarkup> _tail_1 = IterableExtensions.<TextOrMarkup>tail(contents);
        TextOrMarkup _head_8 = IterableExtensions.<TextOrMarkup>head(_tail_1);
        textOrMarkup = _head_8;
        EList<EObject> _contents_9 = textOrMarkup.getContents();
        int _size_7 = _contents_9.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_7));
        EList<EObject> _contents_10 = textOrMarkup.getContents();
        EObject _head_9 = IterableExtensions.<EObject>head(_contents_10);
        String _text_2 = ((TextPart) _head_9).getText();
        Assert.assertEquals("\titem", _text_2);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTable() {
    try {
      {
        final String tableStart = "table[";
        final String row = "tr[";
        final String dataString = "this is";
        final String dataString2 = "a two paragraph table entry";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(ParserTestConstants.CHAPTER_HEAD, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append(tableStart, "");
        _builder.append(row, "");
        _builder.append("td[");
        _builder.append(dataString, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append(dataString2, "");
        _builder.append(ParserTestConstants.CLOSE_BRACKET, "");
        _builder.append("td[]");
        _builder.append(ParserTestConstants.CLOSE_BRACKET, "");
        _builder.append(ParserTestConstants.CLOSE_BRACKET, "");
        _builder.newLineIfNotEmpty();
        XdocFile _parse = this._parseHelperExtensions.parse(_builder);
        final XdocFile file = _parse;
        AbstractSection _mainSection = file.getMainSection();
        EList<TextOrMarkup> _contents = _mainSection.getContents();
        final EList<TextOrMarkup> textOrMarkup = _contents;
        int _size = textOrMarkup.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(textOrMarkup);
        EList<EObject> _contents_1 = _head.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
        final Table t = ((Table) _head_1);
        EList<TableRow> _rows = t.getRows();
        int _size_1 = _rows.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_1));
        EList<TableRow> _rows_1 = t.getRows();
        TableRow _head_2 = IterableExtensions.<TableRow>head(_rows_1);
        EList<TableData> _data = _head_2.getData();
        final EList<TableData> data = _data;
        int _size_2 = data.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_2));
        TableData _get = data.get(0);
        TableData td = _get;
        EList<TextOrMarkup> _contents_2 = td.getContents();
        final EList<TextOrMarkup> contents = _contents_2;
        int _size_3 = contents.size();
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(_size_3));
        TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(contents);
        EList<EObject> _contents_3 = _head_3.getContents();
        EObject _head_4 = IterableExtensions.<EObject>head(_contents_3);
        TextPart text = ((TextPart) _head_4);
        String _text = text.getText();
        Assert.assertEquals(dataString, _text);
        Iterable<TextOrMarkup> _tail = IterableExtensions.<TextOrMarkup>tail(contents);
        TextOrMarkup _head_5 = IterableExtensions.<TextOrMarkup>head(_tail);
        EList<EObject> _contents_4 = _head_5.getContents();
        EObject _head_6 = IterableExtensions.<EObject>head(_contents_4);
        text = ((TextPart) _head_6);
        String _text_1 = text.getText();
        Assert.assertEquals(dataString2, _text_1);
        Iterable<TableData> _tail_1 = IterableExtensions.<TableData>tail(data);
        TableData _head_7 = IterableExtensions.<TableData>head(_tail_1);
        td = _head_7;
        EList<TextOrMarkup> _contents_5 = td.getContents();
        int _size_4 = _contents_5.size();
        Assert.assertEquals(Integer.valueOf(0), Integer.valueOf(_size_4));
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCodeLangDef() {
    try {
      {
        final String name = "Java";
        ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("final", "const", "goto", "strictfp");
        final ArrayList<String> expectedKeywords = _newArrayList;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(ParserTestConstants.DOC_HEAD, "");
        _builder.append("codelanguage-def[");
        _builder.append(name, "");
        _builder.append("][");
        String _join = IterableExtensions.join(expectedKeywords, ",");
        _builder.append(_join, "");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("chapter[foo]");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        XdocFile _parse = this._parseHelperExtensions.parse(_builder);
        final XdocFile file = _parse;
        AbstractSection _mainSection = file.getMainSection();
        final Document doc = ((Document) _mainSection);
        EList<LangDef> _langDefs = doc.getLangDefs();
        final EList<LangDef> defs = _langDefs;
        int _size = defs.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        LangDef _head = IterableExtensions.<LangDef>head(defs);
        final LangDef def = _head;
        String _name = def.getName();
        Assert.assertEquals(name, _name);
        EList<String> _keywords = def.getKeywords();
        final EList<String> keywords = _keywords;
        int _size_1 = expectedKeywords.size();
        int _size_2 = keywords.size();
        Assert.assertEquals(Integer.valueOf(_size_1), Integer.valueOf(_size_2));
        int _size_3 = keywords.size();
        int _operator_minus = IntegerExtensions.operator_minus(_size_3, 1);
        Iterable<Integer> _operator_upTo = IntegerExtensions.operator_upTo(0, _operator_minus);
        for (final Integer i : _operator_upTo) {
          String _get = expectedKeywords.get((i).intValue());
          String _get_1 = keywords.get((i).intValue());
          Assert.assertEquals(_get, _get_1);
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFullSectionHirarchy() {
    try {
      {
        String _operator_plus = StringExtensions.operator_plus(ParserTestConstants.TEST_FILE_DIR, "downToSection4Test.xdoc");
        XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile(_operator_plus);
        final XdocFile file = _docFromFile;
        AbstractSection _mainSection = file.getMainSection();
        final Document doc = ((Document) _mainSection);
        TextOrMarkup _title = doc.getTitle();
        EList<EObject> _contents = _title.getContents();
        int _size = _contents.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size));
        TextOrMarkup _title_1 = doc.getTitle();
        EList<EObject> _contents_1 = _title_1.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents_1);
        TextPart textPart = ((TextPart) _head);
        String _text = textPart.getText();
        Assert.assertEquals("foo", _text);
        EList<Chapter> _chapters = doc.getChapters();
        int _size_1 = _chapters.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_1));
        EList<Chapter> _chapters_1 = doc.getChapters();
        Chapter _head_1 = IterableExtensions.<Chapter>head(_chapters_1);
        final Chapter chapter = _head_1;
        TextOrMarkup _title_2 = chapter.getTitle();
        EList<EObject> _contents_2 = _title_2.getContents();
        int _size_2 = _contents_2.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_2));
        TextOrMarkup _title_3 = chapter.getTitle();
        EList<EObject> _contents_3 = _title_3.getContents();
        EObject _head_2 = IterableExtensions.<EObject>head(_contents_3);
        textPart = ((TextPart) _head_2);
        String _text_1 = textPart.getText();
        Assert.assertEquals("bar", _text_1);
        EList<Section> _subSections = chapter.getSubSections();
        int _size_3 = _subSections.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_3));
        EList<Section> _subSections_1 = chapter.getSubSections();
        Section _head_3 = IterableExtensions.<Section>head(_subSections_1);
        final Section section = _head_3;
        TextOrMarkup _title_4 = section.getTitle();
        EList<EObject> _contents_4 = _title_4.getContents();
        int _size_4 = _contents_4.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_4));
        TextOrMarkup _title_5 = section.getTitle();
        EList<EObject> _contents_5 = _title_5.getContents();
        EObject _head_4 = IterableExtensions.<EObject>head(_contents_5);
        textPart = ((TextPart) _head_4);
        String _text_2 = textPart.getText();
        Assert.assertEquals("foo\u00DF", _text_2);
        EList<Section2> _subSections_2 = section.getSubSections();
        int _size_5 = _subSections_2.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_5));
        EList<Section2> _subSections_3 = section.getSubSections();
        Section2 _head_5 = IterableExtensions.<Section2>head(_subSections_3);
        final Section2 section2 = _head_5;
        TextOrMarkup _title_6 = section2.getTitle();
        EList<EObject> _contents_6 = _title_6.getContents();
        int _size_6 = _contents_6.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_6));
        TextOrMarkup _title_7 = section2.getTitle();
        EList<EObject> _contents_7 = _title_7.getContents();
        EObject _head_6 = IterableExtensions.<EObject>head(_contents_7);
        textPart = ((TextPart) _head_6);
        String _text_3 = textPart.getText();
        Assert.assertEquals("pilz", _text_3);
        EList<Section3> _subSections_4 = section2.getSubSections();
        int _size_7 = _subSections_4.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_7));
        EList<Section3> _subSections_5 = section2.getSubSections();
        Section3 _head_7 = IterableExtensions.<Section3>head(_subSections_5);
        final Section3 section3 = _head_7;
        TextOrMarkup _title_8 = section3.getTitle();
        EList<EObject> _contents_8 = _title_8.getContents();
        int _size_8 = _contents_8.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_8));
        TextOrMarkup _title_9 = section3.getTitle();
        EList<EObject> _contents_9 = _title_9.getContents();
        EObject _head_8 = IterableExtensions.<EObject>head(_contents_9);
        textPart = ((TextPart) _head_8);
        String _text_4 = textPart.getText();
        Assert.assertEquals("sna", _text_4);
        EList<Section4> _subSections_6 = section3.getSubSections();
        int _size_9 = _subSections_6.size();
        Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(_size_9));
        EList<Section4> _subSections_7 = section3.getSubSections();
        Section4 _head_9 = IterableExtensions.<Section4>head(_subSections_7);
        final Section4 section4 = _head_9;
        TextOrMarkup _title_10 = section4.getTitle();
        EList<EObject> _contents_10 = _title_10.getContents();
        int _size_10 = _contents_10.size();
        Assert.assertEquals(1, _size_10);
        TextOrMarkup _title_11 = section4.getTitle();
        EList<EObject> _contents_11 = _title_11.getContents();
        EObject _head_10 = IterableExtensions.<EObject>head(_contents_11);
        textPart = ((TextPart) _head_10);
        String _text_5 = textPart.getText();
        Assert.assertEquals("fu", _text_5);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
