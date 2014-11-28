package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;

@SuppressWarnings("all")
public class JavaDocExtension {
  public String genJavaDocLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
      String _qualifiedName = ie.getQualifiedName();
      boolean _equals = Objects.equal(_qualifiedName, null);
      if (_equals) {
        return null;
      }
      String _qualifiedName_1 = ie.getQualifiedName();
      String _replaceAll = _qualifiedName_1.replaceAll("\\.", "/");
      final String file = _replaceAll.replaceAll("\\$", ".");
      String _switchResult = null;
      String _qualifiedName_2 = ie.getQualifiedName();
      final String name = _qualifiedName_2;
      boolean _matched = false;
      if (!_matched) {
        boolean _startsWith = name.startsWith("org.eclipse.emf.mwe");
        if (_startsWith) {
          _matched=true;
          _switchResult = "http://download.eclipse.org/modeling/emft/mwe/javadoc/2.7/";
        }
      }
      if (!_matched) {
        boolean _or = false;
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.");
        if (_startsWith_1) {
          _or = true;
        } else {
          boolean _startsWith_2 = name.startsWith("org.eclipse.xtend2");
          _or = _startsWith_2;
        }
        if (_or) {
          _matched=true;
          _switchResult = "http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.7/";
        }
      }
      if (!_matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtend.");
        if (_startsWith_3) {
          _matched=true;
          _switchResult = "http://www.eclipse.org/xtend/api/2.7.0/";
        }
      }
      if (!_matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.emf.");
        if (_startsWith_4) {
          _matched=true;
          _switchResult = "http://download.eclipse.org/modeling/emf/emf/javadoc/2.10.0/";
        }
      }
      if (!_matched) {
        boolean _startsWith_5 = name.startsWith("com.google.inject.");
        if (_startsWith_5) {
          _matched=true;
          _switchResult = "https://google.github.io/guice/api-docs/latest/javadoc/";
        }
      }
      if (!_matched) {
        boolean _startsWith_6 = name.startsWith("com.google.common.");
        if (_startsWith_6) {
          _matched=true;
          _switchResult = "http://docs.guava-libraries.googlecode.com/git-history/v17.0/javadoc/";
        }
      }
      if (!_matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.jdt.");
        if (_startsWith_7) {
          _matched=true;
          _switchResult = "http://help.eclipse.org/helios/topic/org.eclipse.jdt.doc.isv/reference/api/";
        }
      }
      if (!_matched) {
        boolean _startsWith_8 = name.startsWith("java.");
        if (_startsWith_8) {
          _matched=true;
          _switchResult = "http://docs.oracle.com/javase/8/docs/api/";
        }
      }
      if (!_matched) {
        boolean _startsWith_9 = name.startsWith("javax.servlet.");
        if (_startsWith_9) {
          _matched=true;
          _switchResult = "http://docs.oracle.com/javaee/5/api/";
        }
      }
      if (!_matched) {
        boolean _startsWith_10 = name.startsWith("com.mongodb.");
        if (_startsWith_10) {
          _matched=true;
          _switchResult = "http://api.mongodb.org/java/2.6/";
        }
      }
      if (!_matched) {
        boolean _startsWith_11 = name.startsWith("org.junit.");
        if (_startsWith_11) {
          _matched=true;
          _switchResult = "http://junit.sourceforge.net/javadoc/";
        }
      }
      if (!_matched) {
        boolean _startsWith_12 = name.startsWith("org.eclipse.");
        if (_startsWith_12) {
          _matched=true;
          _switchResult = "http://help.eclipse.org/helios/topic/org.eclipse.platform.doc.isv/reference/api/";
        }
      }
      if (!_matched) {
        _switchResult = "";
      }
      final String prefix = _switchResult;
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(prefix, ""));
      if (_notEquals) {
        _xifexpression = ((prefix + file) + ".html");
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
