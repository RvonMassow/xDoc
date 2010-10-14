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
T14 : 'defaultcodelanguage[' ;
T15 : 'chapter:' ;
T16 : '[' ;
T17 : 'chapter[' ;
T18 : 'chapter-ref[' ;
T19 : 'section:' ;
T20 : 'section[' ;
T21 : 'section-ref[' ;
T22 : 'section2:' ;
T23 : 'section2[' ;
T24 : 'section3:' ;
T25 : 'section3[' ;
T26 : 'section4:' ;
T27 : 'section4[' ;
T28 : '\\[' ;
T29 : '\\]' ;
T30 : ',' ;
T31 : 'table[' ;
T32 : 'tr[' ;
T33 : 'td[' ;
T34 : 'e[' ;
T35 : 'a[' ;
T36 : 'ref:' ;
T37 : 'ol[' ;
T38 : 'ul[' ;
T39 : 'item[' ;
T40 : 'codeRef[' ;
T41 : 'link[' ;
T42 : 'img:' ;
T43 : 'img[' ;
T44 : 'code[' ;
T45 : 'todo[' ;
T46 : 'codelanguage-def[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3560
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3562
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3564
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3566
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3568
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g" 3570
RULE_ANY_OTHER : .;


