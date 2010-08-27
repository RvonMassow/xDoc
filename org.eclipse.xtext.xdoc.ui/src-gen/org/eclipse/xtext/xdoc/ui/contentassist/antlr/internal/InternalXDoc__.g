lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : 'chapter[' ;
T11 : 'section[' ;
T12 : 'subsection[' ;
T13 : 'section3[' ;
T14 : 'section4[' ;
T15 : '\\[' ;
T16 : '\\]' ;
T17 : 'img[' ;
T18 : ':' ;
T19 : ']' ;
T20 : 'chapter:' ;
T21 : '[' ;
T22 : 'section:' ;
T23 : 'subsection:' ;
T24 : 'section3:' ;
T25 : 'section4:' ;
T26 : 'emph[' ;
T27 : 'a[' ;
T28 : 'ref:' ;
T29 : 'ol[' ;
T30 : 'ul[' ;
T31 : 'item[' ;
T32 : 'codeRef[' ;
T33 : 'link[' ;
T34 : 'img:' ;
T35 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7089
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7091
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7093
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7095
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7097
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7099
RULE_ANY_OTHER : .;


