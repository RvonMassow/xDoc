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
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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

@RunWith(XtextRunner.class)
@InjectWith(XdocInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  @Extension
  private ParseHelperExtensions<XdocFile> _parseHelperExtensions;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSimple() {
    try {
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
      final String text = _builder.toString();
      String _string = text.toString();
      final XdocFile model = this._parseHelperExtensions.parse(_string);
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
      Assert.assertEquals(1, _size);
      EList<TextOrMarkup> _contents_2 = chapter.getContents();
      final TextOrMarkup p = IterableExtensions.<TextOrMarkup>head(_contents_2);
      EList<EObject> _contents_3 = p.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_3);
      String _text_1 = ((TextPart) _head_1).getText();
      Assert.assertEquals(firstPart, _text_1);
      EList<EObject> _contents_4 = p.getContents();
      Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_4);
      EObject _head_2 = IterableExtensions.<EObject>head(_tail);
      EList<TextOrMarkup> _contents_5 = ((Emphasize) _head_2).getContents();
      TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(_contents_5);
      EList<EObject> _contents_6 = _head_3.getContents();
      EObject _head_4 = IterableExtensions.<EObject>head(_contents_6);
      String _text_2 = ((TextPart) _head_4).getText();
      Assert.assertEquals(emphasized, _text_2);
      EList<EObject> _contents_7 = p.getContents();
      Iterable<EObject> _tail_1 = IterableExtensions.<EObject>tail(_contents_7);
      Iterable<EObject> _tail_2 = IterableExtensions.<EObject>tail(_tail_1);
      EObject _head_5 = IterableExtensions.<EObject>head(_tail_2);
      String _text_3 = ((TextPart) _head_5).getText();
      Assert.assertEquals(secondPart, _text_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testsmallestDoc() {
    try {
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnchoredReference() {
    try {
      final String anchor = " a[refName]";
      final String fill = " Jump ";
      final String refText = " to ";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("ref:refName[");
      _builder.append(refText, " ");
      _builder.append("]");
      final String ref = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(ParserTestConstants.CHAPTER_HEAD, "");
      _builder_1.append(anchor, "");
      _builder_1.append(fill, "");
      _builder_1.append(ref, "");
      final XdocFile file = this._parseHelperExtensions.parse(_builder_1);
      AbstractSection _mainSection = file.getMainSection();
      EList<TextOrMarkup> _contents = _mainSection.getContents();
      final TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(_contents);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      int _size = _contents_1.size();
      Assert.assertEquals(4, _size);
      EList<EObject> _contents_2 = textOrMarkup.getContents();
      Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_2);
      final EObject a = IterableExtensions.<EObject>head(_tail);
      EList<EObject> _contents_3 = textOrMarkup.getContents();
      EObject _get = _contents_3.get(3);
      final Ref r = ((Ref) _get);
      Identifiable _ref = r.getRef();
      Assert.assertEquals(a, _ref);
      EList<TextOrMarkup> _contents_4 = r.getContents();
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents_4);
      EList<EObject> _contents_5 = _head.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_5);
      String _text = ((TextPart) _head_1).getText();
      Assert.assertEquals(refText, _text);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCode() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "codeTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Document doc = ((Document) _mainSection);
      EList<Chapter> _chapters = doc.getChapters();
      Chapter _head = IterableExtensions.<Chapter>head(_chapters);
      final EList<TextOrMarkup> contents = _head.getContents();
      TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(contents);
      EList<EObject> _contents = textOrMarkup.getContents();
      int _size = _contents.size();
      Assert.assertEquals(1, _size);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
      CodeBlock cb = ((CodeBlock) _head_1);
      EList<EObject> _contents_2 = cb.getContents();
      EObject _head_2 = IterableExtensions.<EObject>head(_contents_2);
      final Code code = ((Code) _head_2);
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
      String _contents_3 = code.getContents();
      Assert.assertEquals(_string, _contents_3);
      Iterable<TextOrMarkup> _tail = IterableExtensions.<TextOrMarkup>tail(contents);
      TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(_tail);
      textOrMarkup = _head_3;
      EList<EObject> _contents_4 = textOrMarkup.getContents();
      EObject _head_4 = IterableExtensions.<EObject>head(_contents_4);
      cb = ((CodeBlock) _head_4);
      EList<EObject> _contents_5 = cb.getContents();
      int _size_1 = _contents_5.size();
      Assert.assertEquals(0, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCodeWithLanguage() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile(
        (ParserTestConstants.TEST_FILE_DIR + "codeWithLanguageTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Document abstractSection = ((Document) _mainSection);
      EList<Chapter> _chapters = abstractSection.getChapters();
      Chapter _get = _chapters.get(0);
      EList<TextOrMarkup> _contents = _get.getContents();
      final TextOrMarkup textOrMarkup = _contents.get(0);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      int _size = _contents_1.size();
      Assert.assertEquals(1, _size);
      EList<EObject> _contents_2 = textOrMarkup.getContents();
      EObject _get_1 = _contents_2.get(0);
      final CodeBlock cb = ((CodeBlock) _get_1);
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComment() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "commentTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      EList<TextOrMarkup> _contents = _mainSection.getContents();
      int _size = _contents.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLink() throws Exception {
    final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "linkTest.xdoc"));
    AbstractSection _mainSection = file.getMainSection();
    EList<TextOrMarkup> _contents = _mainSection.getContents();
    TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
    EList<EObject> _contents_1 = _head.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    final Link link = ((Link) _head_1);
    String _url = link.getUrl();
    final URL url = new URL(_url);
    final URLConnection connection = url.openConnection();
    Assert.assertNotNull(connection);
  }
  
  @Test
  public void testNamedReference() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile(
        (ParserTestConstants.TEST_FILE_DIR + "namedRefAndTextTest.xdoc"));
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNestedList() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "nestedListTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      EList<TextOrMarkup> _contents = _mainSection.getContents();
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
      EList<EObject> _contents_1 = _head.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
      final UnorderedList outer = ((UnorderedList) _head_1);
      EList<Item> items = outer.getItems();
      int _size = items.size();
      Assert.assertEquals(1, _size);
      Item _head_2 = IterableExtensions.<Item>head(items);
      EList<TextOrMarkup> itemContents = _head_2.getContents();
      int _size_1 = itemContents.size();
      Assert.assertEquals(1, _size_1);
      TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(itemContents);
      final EList<EObject> contents = _head_3.getContents();
      int _size_2 = contents.size();
      Assert.assertEquals(3, _size_2);
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
      EList<Item> _items = inner.getItems();
      items = _items;
      int _size_3 = items.size();
      Assert.assertEquals(1, _size_3);
      Item _head_6 = IterableExtensions.<Item>head(items);
      EList<TextOrMarkup> _contents_2 = _head_6.getContents();
      itemContents = _contents_2;
      int _size_4 = itemContents.size();
      Assert.assertEquals(1, _size_4);
      TextOrMarkup _head_7 = IterableExtensions.<TextOrMarkup>head(itemContents);
      EList<EObject> _contents_3 = _head_7.getContents();
      int _size_5 = _contents_3.size();
      Assert.assertEquals(1, _size_5);
      TextOrMarkup _head_8 = IterableExtensions.<TextOrMarkup>head(itemContents);
      EList<EObject> _contents_4 = _head_8.getContents();
      EObject _head_9 = IterableExtensions.<EObject>head(_contents_4);
      String _text_2 = ((TextPart) _head_9).getText();
      Assert.assertEquals("some item", _text_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleRef() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "simpleRefTest.xdoc"));
      final AbstractSection section = file.getMainSection();
      final EList<TextOrMarkup> contents = section.getContents();
      int _size = contents.size();
      Assert.assertEquals(1, _size);
      final TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(contents);
      EList<EObject> _contents = textOrMarkup.getContents();
      int _size_1 = _contents.size();
      Assert.assertEquals(2, _size_1);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      String _text = ((TextPart) _head).getText();
      Assert.assertEquals("This is ", _text);
      EList<EObject> _contents_2 = textOrMarkup.getContents();
      Iterable<EObject> _tail = IterableExtensions.<EObject>tail(_contents_2);
      EObject _head_1 = IterableExtensions.<EObject>head(_tail);
      Identifiable _ref = ((Ref) _head_1).getRef();
      Assert.assertEquals(section, _ref);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEscape() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "testEscape.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      EList<TextOrMarkup> _contents = _mainSection.getContents();
      final TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(_contents);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      int _size = _contents_1.size();
      Assert.assertEquals(1, _size);
      EList<EObject> _contents_2 = textOrMarkup.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_2);
      final TextPart p = ((TextPart) _head);
      String _text = p.getText();
      Assert.assertEquals("\\\\ \\[ \\]", _text);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testImg() {
    try {
      XdocFile _docFromFile = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "imgTest.xdoc"));
      this._validationTestHelper.assertNoErrors(_docFromFile);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUL() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "ulTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Chapter chapter = ((Chapter) _mainSection);
      EList<TextOrMarkup> contents = chapter.getContents();
      int _size = contents.size();
      Assert.assertEquals(1, _size);
      TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(contents);
      EList<EObject> _contents = textOrMarkup.getContents();
      int _size_1 = _contents.size();
      Assert.assertEquals(1, _size_1);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      final UnorderedList list = ((UnorderedList) _head);
      EList<Item> _items = list.getItems();
      int _size_2 = _items.size();
      Assert.assertEquals(2, _size_2);
      EList<Item> _items_1 = list.getItems();
      Item _head_1 = IterableExtensions.<Item>head(_items_1);
      EList<TextOrMarkup> _contents_2 = _head_1.getContents();
      contents = _contents_2;
      int _size_3 = contents.size();
      Assert.assertEquals(1, _size_3);
      TextOrMarkup _head_2 = IterableExtensions.<TextOrMarkup>head(contents);
      textOrMarkup = _head_2;
      EList<EObject> _contents_3 = textOrMarkup.getContents();
      int _size_4 = _contents_3.size();
      Assert.assertEquals(1, _size_4);
      EList<EObject> _contents_4 = textOrMarkup.getContents();
      EObject _head_3 = IterableExtensions.<EObject>head(_contents_4);
      String _text = ((TextPart) _head_3).getText();
      Assert.assertEquals("An item", _text);
      EList<Item> _items_2 = list.getItems();
      Iterable<Item> _tail = IterableExtensions.<Item>tail(_items_2);
      Item _head_4 = IterableExtensions.<Item>head(_tail);
      EList<TextOrMarkup> _contents_5 = _head_4.getContents();
      contents = _contents_5;
      int _size_5 = contents.size();
      Assert.assertEquals(2, _size_5);
      TextOrMarkup _head_5 = IterableExtensions.<TextOrMarkup>head(contents);
      textOrMarkup = _head_5;
      EList<EObject> _contents_6 = textOrMarkup.getContents();
      int _size_6 = _contents_6.size();
      Assert.assertEquals(1, _size_6);
      EList<EObject> _contents_7 = textOrMarkup.getContents();
      EObject _head_6 = IterableExtensions.<EObject>head(_contents_7);
      String _text_1 = ((TextPart) _head_6).getText();
      Assert.assertEquals("A paragraph", _text_1);
      Iterable<TextOrMarkup> _tail_1 = IterableExtensions.<TextOrMarkup>tail(contents);
      TextOrMarkup _head_7 = IterableExtensions.<TextOrMarkup>head(_tail_1);
      textOrMarkup = _head_7;
      EList<EObject> _contents_8 = textOrMarkup.getContents();
      int _size_7 = _contents_8.size();
      Assert.assertEquals(1, _size_7);
      EList<EObject> _contents_9 = textOrMarkup.getContents();
      EObject _head_8 = IterableExtensions.<EObject>head(_contents_9);
      String _text_2 = ((TextPart) _head_8).getText();
      Assert.assertEquals("\titem", _text_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOL() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "olTest.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Chapter chapter = ((Chapter) _mainSection);
      EList<TextOrMarkup> contents = chapter.getContents();
      int _size = contents.size();
      Assert.assertEquals(1, _size);
      TextOrMarkup textOrMarkup = IterableExtensions.<TextOrMarkup>head(contents);
      EList<EObject> _contents = textOrMarkup.getContents();
      int _size_1 = _contents.size();
      Assert.assertEquals(1, _size_1);
      EList<EObject> _contents_1 = textOrMarkup.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      final OrderedList list = ((OrderedList) _head);
      EList<Item> _items = list.getItems();
      int _size_2 = _items.size();
      Assert.assertEquals(2, _size_2);
      EList<Item> _items_1 = list.getItems();
      Item _head_1 = IterableExtensions.<Item>head(_items_1);
      EList<TextOrMarkup> _contents_2 = _head_1.getContents();
      contents = _contents_2;
      int _size_3 = contents.size();
      Assert.assertEquals(1, _size_3);
      TextOrMarkup _head_2 = IterableExtensions.<TextOrMarkup>head(contents);
      textOrMarkup = _head_2;
      EList<EObject> _contents_3 = textOrMarkup.getContents();
      int _size_4 = _contents_3.size();
      Assert.assertEquals(1, _size_4);
      EList<EObject> _contents_4 = textOrMarkup.getContents();
      EObject _head_3 = IterableExtensions.<EObject>head(_contents_4);
      String _text = ((TextPart) _head_3).getText();
      Assert.assertEquals("An item", _text);
      EList<Item> _items_2 = list.getItems();
      Iterable<Item> _tail = IterableExtensions.<Item>tail(_items_2);
      Item _head_4 = IterableExtensions.<Item>head(_tail);
      EList<TextOrMarkup> _contents_5 = _head_4.getContents();
      contents = _contents_5;
      int _size_5 = contents.size();
      Assert.assertEquals(2, _size_5);
      TextOrMarkup _head_5 = IterableExtensions.<TextOrMarkup>head(contents);
      textOrMarkup = _head_5;
      EList<EObject> _contents_6 = textOrMarkup.getContents();
      int _size_6 = _contents_6.size();
      Assert.assertEquals(1, _size_6);
      EList<EObject> _contents_7 = textOrMarkup.getContents();
      EObject _head_6 = IterableExtensions.<EObject>head(_contents_7);
      String _text_1 = ((TextPart) _head_6).getText();
      Assert.assertEquals("A paragraph", _text_1);
      Iterable<TextOrMarkup> _tail_1 = IterableExtensions.<TextOrMarkup>tail(contents);
      TextOrMarkup _head_7 = IterableExtensions.<TextOrMarkup>head(_tail_1);
      textOrMarkup = _head_7;
      EList<EObject> _contents_8 = textOrMarkup.getContents();
      int _size_7 = _contents_8.size();
      Assert.assertEquals(1, _size_7);
      EList<EObject> _contents_9 = textOrMarkup.getContents();
      EObject _head_8 = IterableExtensions.<EObject>head(_contents_9);
      String _text_2 = ((TextPart) _head_8).getText();
      Assert.assertEquals("\titem", _text_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTable() {
    try {
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
      final XdocFile file = this._parseHelperExtensions.parse(_builder);
      AbstractSection _mainSection = file.getMainSection();
      final EList<TextOrMarkup> textOrMarkup = _mainSection.getContents();
      int _size = textOrMarkup.size();
      Assert.assertEquals(1, _size);
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(textOrMarkup);
      EList<EObject> _contents = _head.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents);
      final Table t = ((Table) _head_1);
      EList<TableRow> _rows = t.getRows();
      int _size_1 = _rows.size();
      Assert.assertEquals(1, _size_1);
      EList<TableRow> _rows_1 = t.getRows();
      TableRow _head_2 = IterableExtensions.<TableRow>head(_rows_1);
      final EList<TableData> data = _head_2.getData();
      int _size_2 = data.size();
      Assert.assertEquals(2, _size_2);
      TableData td = data.get(0);
      final EList<TextOrMarkup> contents = td.getContents();
      int _size_3 = contents.size();
      Assert.assertEquals(2, _size_3);
      TextOrMarkup _head_3 = IterableExtensions.<TextOrMarkup>head(contents);
      EList<EObject> _contents_1 = _head_3.getContents();
      EObject _head_4 = IterableExtensions.<EObject>head(_contents_1);
      TextPart text = ((TextPart) _head_4);
      String _text = text.getText();
      Assert.assertEquals(dataString, _text);
      Iterable<TextOrMarkup> _tail = IterableExtensions.<TextOrMarkup>tail(contents);
      TextOrMarkup _head_5 = IterableExtensions.<TextOrMarkup>head(_tail);
      EList<EObject> _contents_2 = _head_5.getContents();
      EObject _head_6 = IterableExtensions.<EObject>head(_contents_2);
      text = ((TextPart) _head_6);
      String _text_1 = text.getText();
      Assert.assertEquals(dataString2, _text_1);
      Iterable<TableData> _tail_1 = IterableExtensions.<TableData>tail(data);
      TableData _head_7 = IterableExtensions.<TableData>head(_tail_1);
      td = _head_7;
      EList<TextOrMarkup> _contents_3 = td.getContents();
      int _size_4 = _contents_3.size();
      Assert.assertEquals(0, _size_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCodeLangDef() {
    try {
      final String name = "Java";
      final ArrayList<String> expectedKeywords = CollectionLiterals.<String>newArrayList("final", "const", "goto", "strictfp");
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
      final XdocFile file = this._parseHelperExtensions.parse(_builder);
      AbstractSection _mainSection = file.getMainSection();
      final Document doc = ((Document) _mainSection);
      final EList<LangDef> defs = doc.getLangDefs();
      int _size = defs.size();
      Assert.assertEquals(1, _size);
      final LangDef def = IterableExtensions.<LangDef>head(defs);
      String _name = def.getName();
      Assert.assertEquals(name, _name);
      final EList<String> keywords = def.getKeywords();
      int _size_1 = expectedKeywords.size();
      int _size_2 = keywords.size();
      Assert.assertEquals(_size_1, _size_2);
      int _size_3 = keywords.size();
      int _minus = (_size_3 - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        String _get = expectedKeywords.get((i).intValue());
        String _get_1 = keywords.get((i).intValue());
        Assert.assertEquals(_get, _get_1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFullSectionHirarchy() {
    try {
      final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "downToSection4Test.xdoc"));
      AbstractSection _mainSection = file.getMainSection();
      final Document doc = ((Document) _mainSection);
      TextOrMarkup _title = doc.getTitle();
      EList<EObject> _contents = _title.getContents();
      int _size = _contents.size();
      Assert.assertEquals(1, _size);
      TextOrMarkup _title_1 = doc.getTitle();
      EList<EObject> _contents_1 = _title_1.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      TextPart textPart = ((TextPart) _head);
      String _text = textPart.getText();
      Assert.assertEquals("foo", _text);
      EList<Chapter> _chapters = doc.getChapters();
      int _size_1 = _chapters.size();
      Assert.assertEquals(1, _size_1);
      EList<Chapter> _chapters_1 = doc.getChapters();
      final Chapter chapter = IterableExtensions.<Chapter>head(_chapters_1);
      TextOrMarkup _title_2 = chapter.getTitle();
      EList<EObject> _contents_2 = _title_2.getContents();
      int _size_2 = _contents_2.size();
      Assert.assertEquals(1, _size_2);
      TextOrMarkup _title_3 = chapter.getTitle();
      EList<EObject> _contents_3 = _title_3.getContents();
      EObject _head_1 = IterableExtensions.<EObject>head(_contents_3);
      textPart = ((TextPart) _head_1);
      String _text_1 = textPart.getText();
      Assert.assertEquals("bar", _text_1);
      EList<Section> _subSections = chapter.getSubSections();
      int _size_3 = _subSections.size();
      Assert.assertEquals(1, _size_3);
      EList<Section> _subSections_1 = chapter.getSubSections();
      final Section section = IterableExtensions.<Section>head(_subSections_1);
      TextOrMarkup _title_4 = section.getTitle();
      EList<EObject> _contents_4 = _title_4.getContents();
      int _size_4 = _contents_4.size();
      Assert.assertEquals(1, _size_4);
      TextOrMarkup _title_5 = section.getTitle();
      EList<EObject> _contents_5 = _title_5.getContents();
      EObject _head_2 = IterableExtensions.<EObject>head(_contents_5);
      textPart = ((TextPart) _head_2);
      String _text_2 = textPart.getText();
      Assert.assertEquals("fooﬂ", _text_2);
      EList<Section2> _subSections_2 = section.getSubSections();
      int _size_5 = _subSections_2.size();
      Assert.assertEquals(1, _size_5);
      EList<Section2> _subSections_3 = section.getSubSections();
      final Section2 section2 = IterableExtensions.<Section2>head(_subSections_3);
      TextOrMarkup _title_6 = section2.getTitle();
      EList<EObject> _contents_6 = _title_6.getContents();
      int _size_6 = _contents_6.size();
      Assert.assertEquals(1, _size_6);
      TextOrMarkup _title_7 = section2.getTitle();
      EList<EObject> _contents_7 = _title_7.getContents();
      EObject _head_3 = IterableExtensions.<EObject>head(_contents_7);
      textPart = ((TextPart) _head_3);
      String _text_3 = textPart.getText();
      Assert.assertEquals("pilz", _text_3);
      EList<Section3> _subSections_4 = section2.getSubSections();
      int _size_7 = _subSections_4.size();
      Assert.assertEquals(1, _size_7);
      EList<Section3> _subSections_5 = section2.getSubSections();
      final Section3 section3 = IterableExtensions.<Section3>head(_subSections_5);
      TextOrMarkup _title_8 = section3.getTitle();
      EList<EObject> _contents_8 = _title_8.getContents();
      int _size_8 = _contents_8.size();
      Assert.assertEquals(1, _size_8);
      TextOrMarkup _title_9 = section3.getTitle();
      EList<EObject> _contents_9 = _title_9.getContents();
      EObject _head_4 = IterableExtensions.<EObject>head(_contents_9);
      textPart = ((TextPart) _head_4);
      String _text_4 = textPart.getText();
      Assert.assertEquals("sna", _text_4);
      EList<Section4> _subSections_6 = section3.getSubSections();
      int _size_9 = _subSections_6.size();
      Assert.assertEquals(1, _size_9);
      EList<Section4> _subSections_7 = section3.getSubSections();
      final Section4 section4 = IterableExtensions.<Section4>head(_subSections_7);
      TextOrMarkup _title_10 = section4.getTitle();
      EList<EObject> _contents_10 = _title_10.getContents();
      int _size_10 = _contents_10.size();
      Assert.assertEquals(1, _size_10);
      TextOrMarkup _title_11 = section4.getTitle();
      EList<EObject> _contents_11 = _title_11.getContents();
      EObject _head_5 = IterableExtensions.<EObject>head(_contents_11);
      textPart = ((TextPart) _head_5);
      String _text_5 = textPart.getText();
      Assert.assertEquals("fu", _text_5);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
