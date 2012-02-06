package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JavaDocExtension {
  public String genJavaDocLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
      String _qualifiedName = ie.getQualifiedName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_qualifiedName, null);
      if (_operator_equals) {
        return null;
      }
      String _qualifiedName_1 = ie.getQualifiedName();
      String _replaceAll = _qualifiedName_1.replaceAll("\\.", "/");
      String _replaceAll_1 = _replaceAll.replaceAll("\\$", ".");
      final String file = _replaceAll_1;
      String _switchResult = null;
      String _qualifiedName_2 = ie.getQualifiedName();
      final String name = _qualifiedName_2;
      boolean matched = false;
      if (!matched) {
        boolean _startsWith = name.startsWith("org.eclipse.emf.mwe");
        if (_startsWith) {
          matched=true;
          _switchResult = "";
        }
      }
      if (!matched) {
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.");
        if (_startsWith_1) {
          matched=true;
          _switchResult = "http://download.eclipse.org/modeling/tmf/xtext/javadoc/2.3/";
        }
      }
      if (!matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtend.");
        if (_startsWith_2) {
          matched=true;
          _switchResult = "http://download.eclipse.org/xtend/javadoc/2.3/";
        }
      }
      if (!matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.emf.");
        if (_startsWith_3) {
          matched=true;
          _switchResult = "http://download.eclipse.org/modeling/emf/emf/javadoc/2.6.0/";
        }
      }
      if (!matched) {
        boolean _startsWith_4 = name.startsWith("com.google.inject.");
        if (_startsWith_4) {
          matched=true;
          _switchResult = "http://google-guice.googlecode.com/svn/trunk/javadoc/";
        }
      }
      if (!matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.jdt.");
        if (_startsWith_5) {
          matched=true;
          _switchResult = "http://help.eclipse.org/helios/topic/org.eclipse.jdt.doc.isv/reference/api/";
        }
      }
      if (!matched) {
        boolean _startsWith_6 = name.startsWith("java.");
        if (_startsWith_6) {
          matched=true;
          _switchResult = "http://download.oracle.com/javase/1.5.0/docs/api/";
        }
      }
      if (!matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.");
        if (_startsWith_7) {
          matched=true;
          _switchResult = "http://help.eclipse.org/helios/topic/org.eclipse.platform.doc.isv/reference/api/";
        }
      }
      if (!matched) {
        _switchResult = "";
      }
      final String prefix = _switchResult;
      String _xifexpression = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(prefix, "");
      if (_operator_notEquals) {
        String _operator_plus = StringExtensions.operator_plus(prefix, file);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".html");
        _xifexpression = _operator_plus_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
