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
T17 : 'img[' ;
T18 : 'document[' ;
T19 : ']' ;
T20 : 'subtitle[' ;
T21 : 'authors[' ;
T22 : 'chapter:' ;
T23 : '[' ;
T24 : 'chapter-ref[' ;
T25 : 'section:' ;
T26 : 'section-ref[' ;
T27 : 'section2:' ;
T28 : 'section3:' ;
T29 : 'section4:' ;
T30 : 'table[' ;
T31 : 'tr[' ;
T32 : 'td[' ;
T33 : 'e[' ;
T34 : 'a[' ;
T35 : 'ref:' ;
T36 : 'ol[' ;
T37 : 'ul[' ;
T38 : 'item[' ;
T39 : 'codeRef[' ;
T40 : 'link[' ;
T41 : 'img:' ;
T42 : 'code[' ;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9336
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9338
RULE_SL_COMMENT : '%%' ~(('\n'|'\r'))* '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9340
RULE_MULTI_NL : '\r'? '\n' ('\r'? '\n')+;

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9342
RULE_SINGLE_NL : '\r'? '\n';

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9344
RULE_WS : (' '|'\t');

// $ANTLR src "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXdoc.g" 9346
RULE_ANY_OTHER : .;


