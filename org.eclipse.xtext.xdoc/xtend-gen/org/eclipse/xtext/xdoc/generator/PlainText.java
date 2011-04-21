package org.eclipse.xtext.xdoc.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PlainText {
  
  public CharSequence _genPlainText(final TextOrMarkup tom) {
    EList<EObject> _contents = tom.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<StringConcatenation,EObject,StringConcatenation> _function = new Function2<StringConcatenation,EObject,StringConcatenation>() {
        public StringConcatenation apply(StringConcatenation e1 , EObject e2) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(e1, "");
          CharSequence _genPlainText = PlainText.this.genPlainText(e2);
          _builder_1.append(_genPlainText, "");
          return _builder_1;
        }
      };
    StringConcatenation _fold = IterableExtensions.<EObject, StringConcatenation>fold(_contents, _builder, _function);
    return _fold;
  }
  
  public CharSequence _genPlainText(final TextPart tp) {
    String _text = tp.getText();
    return _text;
  }
  
  public CharSequence _genPlainText(final Emphasize em) {
    EList<TextOrMarkup> _contents = em.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<StringConcatenation,TextOrMarkup,StringConcatenation> _function = new Function2<StringConcatenation,TextOrMarkup,StringConcatenation>() {
        public StringConcatenation apply(StringConcatenation e1 , TextOrMarkup e2) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(e1, "");
          final TextOrMarkup typeConverted_e2 = (TextOrMarkup)e2;
          CharSequence _genPlainText = PlainText.this.genPlainText(typeConverted_e2);
          _builder_1.append(_genPlainText, "");
          return _builder_1;
        }
      };
    StringConcatenation _fold = IterableExtensions.<TextOrMarkup, StringConcatenation>fold(_contents, _builder, _function);
    return _fold;
  }
  
  public CharSequence _genPlainText(final Link l) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String _text = l.getText();
      _builder.append(_text, "");
      final StringConcatenation text = _builder;
      StringConcatenation _xifexpression = null;
      String _string = text.toString();
      final StringConcatenation typeConverted_text = (StringConcatenation)text;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_string, typeConverted_text);
      if (_operator_notEquals) {
        _xifexpression = text;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"");
        String _url = l.getUrl();
        _builder_1.append(_url, "");
        _builder_1.append("\"");
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public CharSequence genPlainText(final EObject em) {
    if ((em instanceof Emphasize)) {
      return _genPlainText((Emphasize)em);
    } else if ((em instanceof Link)) {
      return _genPlainText((Link)em);
    } else if ((em instanceof TextOrMarkup)) {
      return _genPlainText((TextOrMarkup)em);
    } else if ((em instanceof TextPart)) {
      return _genPlainText((TextPart)em);
    } else {
      throw new IllegalArgumentException();
    }
  }
}