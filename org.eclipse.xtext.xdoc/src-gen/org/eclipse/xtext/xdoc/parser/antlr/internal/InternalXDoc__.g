lexer grammar InternalXDoc;
@header {
package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : 'chapter:' ;
T11 : '[' ;
T12 : 'chapter[' ;
T13 : ']' ;
T14 : 'section:' ;
T15 : 'section[' ;
T16 : 'section2:' ;
T17 : 'section2[' ;
T18 : 'section3:' ;
T19 : 'section3[' ;
T20 : 'section4:' ;
T21 : 'section4[' ;
T22 : '\\[' ;
T23 : '\\]' ;
T24 : 'table[' ;
T25 : 'tr[' ;
T26 : 'td[' ;
T27 : 'e[' ;
T28 : 'a[' ;
T29 : 'ref:' ;
T30 : 'ol[' ;
T31 : 'ul[' ;
T32 : 'item[' ;
T33 : 'codeRef[' ;
T34 : 'link[' ;
T35 : 'img:' ;
T36 : 'img[' ;
T37 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2879
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2881
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2883
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2885
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2887
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g" 2889
RULE_ANY_OTHER : .;


