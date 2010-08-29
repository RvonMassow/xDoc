lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : 'chapter[' ;
T11 : 'section[' ;
T12 : 'section2[' ;
T13 : 'section3[' ;
T14 : 'section4[' ;
T15 : '\\[' ;
T16 : '\\]' ;
T17 : 'img[' ;
T18 : ']' ;
T19 : 'chapter:' ;
T20 : '[' ;
T21 : 'section:' ;
T22 : 'section2:' ;
T23 : 'section3:' ;
T24 : 'section4:' ;
T25 : 'emph[' ;
T26 : 'a[' ;
T27 : 'ref:' ;
T28 : 'ol[' ;
T29 : 'ul[' ;
T30 : 'item[' ;
T31 : 'codeRef[' ;
T32 : 'link[' ;
T33 : 'img:' ;
T34 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7149
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7151
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7153
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7155
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7157
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7159
RULE_ANY_OTHER : .;


