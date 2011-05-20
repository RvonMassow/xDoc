package org.eclipse.xtext.xdoc.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PlainText {
  
  protected CharSequence _genPlainText(final TextOrMarkup tom) {
    EList<EObject> _contents = tom.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<StringConcatenation,EObject,StringConcatenation> _function = new Function2<StringConcatenation,EObject,StringConcatenation>() {
        public StringConcatenation apply(final StringConcatenation e1 , final EObject e2) {
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
  
  protected CharSequence _genPlainText(final TextPart tp) {
    String _text = tp.getText();
    return _text;
  }
  
  protected CharSequence _genPlainText(final Emphasize em) {
    EList<TextOrMarkup> _contents = em.getContents();
    StringConcatenation _builder = new StringConcatenation();
    final Function2<StringConcatenation,TextOrMarkup,StringConcatenation> _function = new Function2<StringConcatenation,TextOrMarkup,StringConcatenation>() {
        public StringConcatenation apply(final StringConcatenation e1 , final TextOrMarkup e2) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(e1, "");
          CharSequence _genPlainText = PlainText.this.genPlainText(e2);
          _builder_1.append(_genPlainText, "");
          return _builder_1;
        }
      };
    StringConcatenation _fold = IterableExtensions.<TextOrMarkup, StringConcatenation>fold(_contents, _builder, _function);
    return _fold;
  }
  
  protected CharSequence _genPlainText(final Link l) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String _text = l.getText();
      _builder.append(_text, "");
      final StringConcatenation text = _builder;
      StringConcatenation _xifexpression = null;
      String _string = text.toString();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_string, text);
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
  
  protected CharSequence _genPlainText(final Ref ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        {
          EList<TextOrMarkup> _contents_1 = ref.getContents();
          for(TextOrMarkup e : _contents_1) {
            CharSequence _genPlainText = this.genPlainText(e);
            _builder.append(_genPlainText, "");
            _builder.newLineIfNotEmpty();
          }
        }} else {
        Identifiable _ref = ref.getRef();
        String _name = _ref.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genPlainText(final CodeRef cRef) {
    StringConcatenation _builder = new StringConcatenation();
    JvmDeclaredType _element = cRef.getElement();
    String _qualifiedName = _element.getQualifiedName();
    _builder.append(_qualifiedName, "");
    return _builder;
  }
  
  protected CharSequence _genPlainText(final CodeBlock cb) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = cb.getContents();
      for(EObject c : _contents) {
        CharSequence _genPlainText = this.genPlainText(c);
        _builder.append(_genPlainText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genPlainText(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence genPlainText(final Object cb) {
    if ((cb instanceof CodeBlock)) {
      return _genPlainText((CodeBlock)cb);
    } else if ((cb instanceof CodeRef)) {
      return _genPlainText((CodeRef)cb);
    } else if ((cb instanceof Emphasize)) {
      return _genPlainText((Emphasize)cb);
    } else if ((cb instanceof Link)) {
      return _genPlainText((Link)cb);
    } else if ((cb instanceof Ref)) {
      return _genPlainText((Ref)cb);
    } else if ((cb instanceof TextOrMarkup)) {
      return _genPlainText((TextOrMarkup)cb);
    } else if ((cb instanceof TextPart)) {
      return _genPlainText((TextPart)cb);
    } else if ((cb instanceof Object)) {
      return _genPlainText((Object)cb);
    } else {
      throw new IllegalArgumentException();
    }
  }
}