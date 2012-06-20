package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class GitExtensions {
  private final static String XTEXT_BASE_DIR = "https://github.com/eclipse/xtext/blob/v2.3.0/plugins/";
  
  private final static String XTEND_BASE_DIR = "https://github.com/eclipse/xtend/blob/v2.3.0/plugins/";
  
  private final static String EMF_BASE_DIR = "https://github.com/eclipse/emf/blob/R2_8_0/plugins/";
  
  private final static String SEVENLANGUAGES_BASEDIR = "https://github.com/xtext-dev/seven-languages-xtext/blob/master/";
  
  public String gitLink(final JvmIdentifiableElement ie) {
    String _xblockexpression = null;
    {
      final HashSet<String> xtendFiles = CollectionLiterals.<String>newHashSet("org.eclipse.xtext.xbase.compiler.JvmModelGenerator");
      final HashSet<String> xtextEmfGen = CollectionLiterals.<String>newHashSet("AbstractElement", "Assignment", "EnumRule", "ParserRule", "UntilToken", "AbstractMetamodelDeclaration", "CharacterRange", "GeneratedMetamodel", "ReferencedMetamodel", "Wildcard", "AbstractNegatedToken", "CompoundElement", "Grammar", "RuleCall", "XtextFactory", "AbstractRule", "CrossReference", "Group", "TerminalRule", "XtextPackage", "Action", "EOF", "Keyword", "TypeRef", "Alternatives", "EnumLiteralDeclaration", "NegatedToken", "UnorderedGroup");
      final HashSet<String> ctEmfGen = CollectionLiterals.<String>newHashSet("JvmAnnotationAnnotationValue", "JvmConstraintOwner", "JvmFloatAnnotationValue", "JvmPrimitiveType", "JvmUpperBound", "JvmAnnotationReference", "JvmConstructor", "JvmFormalParameter", "JvmShortAnnotationValue", "JvmVisibility", "JvmAnnotationTarget", "JvmCustomAnnotationValue", "JvmGenericArrayTypeReference", "JvmSpecializedTypeReference", "JvmVoid", "JvmAnnotationType", "JvmDeclaredType", "JvmGenericType", "JvmStringAnnotationValue", "JvmWildcardTypeReference", "JvmAnnotationValue", "JvmDelegateTypeReference", "JvmIdentifiableElement", "JvmSynonymTypeReference", "TypesFactory", "JvmAnyTypeReference", "JvmDoubleAnnotationValue", "JvmIntAnnotationValue", "JvmType", "TypesPackage", "JvmArrayType", "JvmEnumAnnotationValue", "JvmLongAnnotationValue", "JvmTypeAnnotationValue", "JvmBooleanAnnotationValue", "JvmEnumerationLiteral", "JvmLowerBound", "JvmTypeConstraint", "JvmByteAnnotationValue", "JvmEnumerationType", "JvmMember", "JvmTypeParameter", "JvmCharAnnotationValue", "JvmExecutable", "JvmMultiTypeReference", "JvmTypeParameterDeclarator", "JvmComponentType", "JvmFeature", "JvmOperation", "JvmTypeReference", "JvmCompoundTypeReference", "JvmField", "JvmParameterizedTypeReference", "JvmUnknownTypeReference");
      CharSequence _switchResult = null;
      String _qualifiedName = ie.getQualifiedName();
      final String name = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(name,null)) {
          _matched=true;
          return ("broken-link in " + ie);
        }
      }
      if (!_matched) {
        boolean _startsWith = name.startsWith("org.eclipse.xtext.common.types.xtext.ui");
        if (_startsWith) {
          _matched=true;
          String _plus = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types.ui/src/");
          _switchResult = _plus;
        }
      }
      if (!_matched) {
        boolean _and = false;
        boolean _startsWith_1 = name.startsWith("org.eclipse.xtext.common.types.");
        if (!_startsWith_1) {
          _and = false;
        } else {
          String _simpleName = ie.getSimpleName();
          boolean _contains = ctEmfGen.contains(_simpleName);
          _and = (_startsWith_1 && _contains);
        }
        if (_and) {
          _matched=true;
          String _plus_1 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/emf-gen/");
          _switchResult = _plus_1;
        }
      }
      if (!_matched) {
        boolean _startsWith_2 = name.startsWith("org.eclipse.xtext.common.types.");
        if (_startsWith_2) {
          _matched=true;
          String _plus_2 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.common.types/src/");
          _switchResult = _plus_2;
        }
      }
      if (!_matched) {
        boolean _startsWith_3 = name.startsWith("org.eclipse.xtext.ui.shared.");
        if (_startsWith_3) {
          _matched=true;
          String _plus_3 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui.shared/src/");
          _switchResult = _plus_3;
        }
      }
      if (!_matched) {
        boolean _startsWith_4 = name.startsWith("org.eclipse.xtext.xtend2.lib.");
        if (_startsWith_4) {
          _matched=true;
          String _plus_4 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.lib/src/");
          _switchResult = _plus_4;
        }
      }
      if (!_matched) {
        boolean _startsWith_5 = name.startsWith("org.eclipse.xtext.xtend2.ui.");
        if (_startsWith_5) {
          _matched=true;
          String _plus_5 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2.ui/src/");
          _switchResult = _plus_5;
        }
      }
      if (!_matched) {
        boolean _startsWith_6 = name.startsWith("org.eclipse.xtext.xtend2.");
        if (_startsWith_6) {
          _matched=true;
          String _plus_6 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xtend2/src/");
          _switchResult = _plus_6;
        }
      }
      if (!_matched) {
        boolean _startsWith_7 = name.startsWith("org.eclipse.xtext.xbase.ui.");
        if (_startsWith_7) {
          _matched=true;
          String _plus_7 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.ui/src/");
          _switchResult = _plus_7;
        }
      }
      if (!_matched) {
        boolean _startsWith_8 = name.startsWith("org.eclipse.xtext.xbase.lib.");
        if (_startsWith_8) {
          _matched=true;
          String _plus_8 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase.lib/src/");
          _switchResult = _plus_8;
        }
      }
      if (!_matched) {
        boolean _startsWith_9 = name.startsWith("org.eclipse.xtext.xbase.");
        if (_startsWith_9) {
          _matched=true;
          String _plus_9 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.xbase/src/");
          _switchResult = _plus_9;
        }
      }
      if (!_matched) {
        boolean _or = false;
        boolean _startsWith_10 = name.startsWith("org.eclipse.xtext.generator-");
        if (_startsWith_10) {
          _or = true;
        } else {
          boolean _startsWith_11 = name.startsWith("org.eclipse.xtext.ui.generator.");
          _or = (_startsWith_10 || _startsWith_11);
        }
        if (_or) {
          _matched=true;
          String _plus_10 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.generator/src/");
          _switchResult = _plus_10;
        }
      }
      if (!_matched) {
        boolean _startsWith_12 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_12) {
          _matched=true;
          String _plus_11 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
          _switchResult = _plus_11;
        }
      }
      if (!_matched) {
        boolean _startsWith_13 = name.startsWith("org.eclipse.xtext.junit4.");
        if (_startsWith_13) {
          _matched=true;
          String _plus_12 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit4/src/");
          _switchResult = _plus_12;
        }
      }
      if (!_matched) {
        boolean _startsWith_14 = name.startsWith("org.eclipse.xtext.junit.");
        if (_startsWith_14) {
          _matched=true;
          String _plus_13 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.junit/src/");
          _switchResult = _plus_13;
        }
      }
      if (!_matched) {
        boolean _startsWith_15 = name.startsWith("org.eclipse.xtext.ui.");
        if (_startsWith_15) {
          _matched=true;
          String _plus_14 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.ui/src/");
          _switchResult = _plus_14;
        }
      }
      if (!_matched) {
        boolean _startsWith_16 = name.startsWith("org.eclipse.xtext.util.");
        if (_startsWith_16) {
          _matched=true;
          String _plus_15 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext.util/src/");
          _switchResult = _plus_15;
        }
      }
      if (!_matched) {
        boolean _and_1 = false;
        boolean _startsWith_17 = name.startsWith("org.eclipse.xtext.");
        if (!_startsWith_17) {
          _and_1 = false;
        } else {
          String _simpleName_1 = ie.getSimpleName();
          boolean _contains_1 = xtextEmfGen.contains(_simpleName_1);
          _and_1 = (_startsWith_17 && _contains_1);
        }
        if (_and_1) {
          _matched=true;
          String _plus_16 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/emf-gen/");
          _switchResult = _plus_16;
        }
      }
      if (!_matched) {
        boolean _startsWith_18 = name.startsWith("org.eclipse.xtext.");
        if (_startsWith_18) {
          _matched=true;
          String _plus_17 = (GitExtensions.XTEXT_BASE_DIR + "org.eclipse.xtext/src/");
          _switchResult = _plus_17;
        }
      }
      if (!_matched) {
        boolean _startsWith_19 = name.startsWith("org.eclipse.emf.common.");
        if (_startsWith_19) {
          _matched=true;
          String _plus_18 = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.common/src/");
          _switchResult = _plus_18;
        }
      }
      if (!_matched) {
        boolean _startsWith_20 = name.startsWith("org.eclipse.emf.");
        if (_startsWith_20) {
          _matched=true;
          String _plus_19 = (GitExtensions.EMF_BASE_DIR + "org.eclipse.emf.ecore/src/");
          _switchResult = _plus_19;
        }
      }
      if (!_matched) {
        boolean _startsWith_21 = name.startsWith("com.google.inject.");
        if (_startsWith_21) {
          _matched=true;
          _switchResult = "http://code.google.com/p/google-guice/source/browse/core/src";
        }
      }
      if (!_matched) {
        boolean _startsWith_22 = name.startsWith("org.xtext.");
        if (_startsWith_22) {
          _matched=true;
          CharSequence _xblockexpression_1 = null;
          {
            String[] _split = name.split("\\.");
            final String languageID = ((List<String>)Conversions.doWrapArray(_split)).get(2);
            String[] _split_1 = name.split("\\.");
            final String pluginSuffix = ((List<String>)Conversions.doWrapArray(_split_1)).get(3);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append(GitExtensions.SEVENLANGUAGES_BASEDIR, "");
            _builder.append(languageID, "");
            _builder.append("/org.xtext.");
            _builder.append(languageID, "");
            _builder.append(".");
            _builder.append(pluginSuffix, "");
            _builder.append("/src/");
            _xblockexpression_1 = (_builder);
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        _switchResult = "";
      }
      final CharSequence prefix = _switchResult;
      String _xifexpression = null;
      int _length = prefix.length();
      boolean _notEquals = (_length != 0);
      if (_notEquals) {
        String _xblockexpression_2 = null;
        {
          String _xifexpression_1 = null;
          String _qualifiedName_1 = ie.getQualifiedName();
          boolean _contains_2 = xtendFiles.contains(_qualifiedName_1);
          if (_contains_2) {
            _xifexpression_1 = ".xtend";
          } else {
            _xifexpression_1 = ".java";
          }
          final String ext = _xifexpression_1;
          String _qualifiedName_2 = ie.getQualifiedName();
          String _replaceAll = _qualifiedName_2.replaceAll("\\.", "/");
          String _replaceAll_1 = _replaceAll.replaceAll("\\$.*$", "");
          String _plus_20 = (prefix + _replaceAll_1);
          String _plus_21 = (_plus_20 + ext);
          _xblockexpression_2 = (_plus_21);
        }
        _xifexpression = _xblockexpression_2;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String compilationUnitName(final JvmIdentifiableElement ie) {
    String _simpleName = ie.getSimpleName();
    return _simpleName;
  }
}
