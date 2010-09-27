lexer grammar InternalXdoc;
@header {
package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : 'document[' ;
T11 : ']' ;
T12 : 'subtitle[' ;
T13 : 'authors[' ;
T14 : 'chapter:' ;
T15 : '[' ;
T16 : 'chapter[' ;
T17 : 'chapter-ref[' ;
T18 : 'section:' ;
T19 : 'section[' ;
T20 : 'section-ref[' ;
T21 : 'section2:' ;
T22 : 'section2[' ;
T23 : 'section3:' ;
T24 : 'section3[' ;
T25 : 'section4:' ;
T26 : 'section4[' ;
T27 : '\\[' ;
T28 : '\\]' ;
T29 : 'table[' ;
T30 : 'tr[' ;
T31 : 'td[' ;
T32 : 'e[' ;
T33 : 'a[' ;
T34 : 'ref:' ;
T35 : 'ol[' ;
T36 : 'ul[' ;
T37 : 'item[' ;
T38 : 'codeRef[' ;
T39 : 'link[' ;
T40 : 'img:' ;
T41 : 'img[' ;
T42 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3123
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3125
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3127
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3129
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3131
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3133
RULE_ANY_OTHER : .;


