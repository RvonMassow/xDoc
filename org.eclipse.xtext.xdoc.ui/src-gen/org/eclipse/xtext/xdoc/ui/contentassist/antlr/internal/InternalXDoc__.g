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
T25 : 'table[' ;
T26 : 'tr[' ;
T27 : 'td[' ;
T28 : 'e[' ;
T29 : 'a[' ;
T30 : 'ref:' ;
T31 : 'ol[' ;
T32 : 'ul[' ;
T33 : 'item[' ;
T34 : 'codeRef[' ;
T35 : 'link[' ;
T36 : 'img:' ;
T37 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7968
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7970
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7972
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7974
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7976
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g" 7978
RULE_ANY_OTHER : .;


