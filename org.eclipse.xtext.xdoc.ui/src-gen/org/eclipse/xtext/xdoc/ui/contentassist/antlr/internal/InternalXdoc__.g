lexer grammar InternalXdoc;
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
T17 : ',' ;
T18 : 'img[' ;
T19 : 'document[' ;
T20 : ']' ;
T21 : 'subtitle[' ;
T22 : 'authors[' ;
T23 : 'defaultcodelanguage[' ;
T24 : 'chapter:' ;
T25 : '[' ;
T26 : 'chapter-ref[' ;
T27 : 'section:' ;
T28 : 'section-ref[' ;
T29 : 'section2:' ;
T30 : 'section3:' ;
T31 : 'section4:' ;
T32 : 'table[' ;
T33 : 'tr[' ;
T34 : 'td[' ;
T35 : 'e[' ;
T36 : 'a[' ;
T37 : 'ref:' ;
T38 : 'ol[' ;
T39 : 'ul[' ;
T40 : 'item[' ;
T41 : 'codeRef[' ;
T42 : 'link[' ;
T43 : 'img:' ;
T44 : 'code[' ;
T45 : 'todo[' ;
T46 : 'codelanguage-def[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10425
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10427
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10429
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10431
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10433
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 10435
RULE_ANY_OTHER : .;


