package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdocLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=8;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int RULE_MULTI_NL=5;
    public static final int T43=43;
    public static final int Tokens=47;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_SINGLE_NL=7;
    public static final int T44=44;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=4;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalXdocLexer() {;} 
    public InternalXdocLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:10:5: ( 'document[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:10:7: 'document['
            {
            match("document["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:11:5: ( ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:11:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:12:5: ( 'subtitle[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:12:7: 'subtitle['
            {
            match("subtitle["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:13:5: ( 'authors[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:13:7: 'authors['
            {
            match("authors["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:14:5: ( 'defaultcodelanguage[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:14:7: 'defaultcodelanguage['
            {
            match("defaultcodelanguage["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:15:5: ( 'chapter:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:15:7: 'chapter:'
            {
            match("chapter:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:16:5: ( '[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:16:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:17:5: ( 'chapter[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:17:7: 'chapter['
            {
            match("chapter["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:18:5: ( 'chapter-ref[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:18:7: 'chapter-ref['
            {
            match("chapter-ref["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:19:5: ( 'section:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:19:7: 'section:'
            {
            match("section:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:20:5: ( 'section[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:20:7: 'section['
            {
            match("section["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:21:5: ( 'section-ref[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:21:7: 'section-ref['
            {
            match("section-ref["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:22:5: ( 'section2:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:22:7: 'section2:'
            {
            match("section2:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:23:5: ( 'section2[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:23:7: 'section2['
            {
            match("section2["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:24:5: ( 'section3:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:24:7: 'section3:'
            {
            match("section3:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:25:5: ( 'section3[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:25:7: 'section3['
            {
            match("section3["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:26:5: ( 'section4:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:26:7: 'section4:'
            {
            match("section4:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:27:5: ( 'section4[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:27:7: 'section4['
            {
            match("section4["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:28:5: ( '\\\\[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:28:7: '\\\\['
            {
            match("\\["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:29:5: ( '\\\\]' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:29:7: '\\\\]'
            {
            match("\\]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:30:5: ( ',' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:30:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:31:5: ( 'table[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:31:7: 'table['
            {
            match("table["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:32:5: ( 'tr[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:32:7: 'tr['
            {
            match("tr["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:33:5: ( 'td[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:33:7: 'td['
            {
            match("td["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:34:5: ( 'e[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:34:7: 'e['
            {
            match("e["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:35:5: ( 'a[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:35:7: 'a['
            {
            match("a["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:36:5: ( 'ref:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:36:7: 'ref:'
            {
            match("ref:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:37:5: ( 'ol[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:37:7: 'ol['
            {
            match("ol["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:38:5: ( 'ul[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:38:7: 'ul['
            {
            match("ul["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:39:5: ( 'item[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:39:7: 'item['
            {
            match("item["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:40:5: ( 'codeRef[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:40:7: 'codeRef['
            {
            match("codeRef["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:41:5: ( 'link[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:41:7: 'link['
            {
            match("link["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:42:5: ( 'img:' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:42:7: 'img:'
            {
            match("img:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:43:5: ( 'img[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:43:7: 'img['
            {
            match("img["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:44:5: ( 'code[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:44:7: 'code['
            {
            match("code["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:45:5: ( 'todo[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:45:7: 'todo['
            {
            match("todo["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:46:5: ( 'codelanguage-def[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:46:7: 'codelanguage-def['
            {
            match("codelanguage-def["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3560:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3560:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3560:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:17: ( '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:19: '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("%%"); 

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:40: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3562:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_MULTI_NL
    public final void mRULE_MULTI_NL() throws RecognitionException {
        try {
            int _type = RULE_MULTI_NL;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:15: ( ( '\\r' )? '\\n' ( ( '\\r' )? '\\n' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:17: ( '\\r' )? '\\n' ( ( '\\r' )? '\\n' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:17: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:28: ( ( '\\r' )? '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:29: ( '\\r' )? '\\n'
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:29: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3564:29: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MULTI_NL

    // $ANTLR start RULE_SINGLE_NL
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3566:16: ( ( '\\r' )? '\\n' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3566:18: ( '\\r' )? '\\n'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3566:18: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3566:18: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SINGLE_NL

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3568:9: ( ( ' ' | '\\t' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3568:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3570:16: ( . )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3570:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:8: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt8=43;
        int LA8_0 = input.LA(1);

        if ( (LA8_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA8_22 = input.LA(3);

                if ( (LA8_22=='c') ) {
                    int LA8_52 = input.LA(4);

                    if ( (LA8_52=='u') ) {
                        int LA8_69 = input.LA(5);

                        if ( (LA8_69=='m') ) {
                            int LA8_83 = input.LA(6);

                            if ( (LA8_83=='e') ) {
                                int LA8_96 = input.LA(7);

                                if ( (LA8_96=='n') ) {
                                    int LA8_105 = input.LA(8);

                                    if ( (LA8_105=='t') ) {
                                        int LA8_113 = input.LA(9);

                                        if ( (LA8_113=='[') ) {
                                            alt8=1;
                                        }
                                        else {
                                            alt8=38;}
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            case 'e':
                {
                int LA8_23 = input.LA(3);

                if ( (LA8_23=='f') ) {
                    int LA8_53 = input.LA(4);

                    if ( (LA8_53=='a') ) {
                        int LA8_70 = input.LA(5);

                        if ( (LA8_70=='u') ) {
                            int LA8_84 = input.LA(6);

                            if ( (LA8_84=='l') ) {
                                int LA8_97 = input.LA(7);

                                if ( (LA8_97=='t') ) {
                                    int LA8_106 = input.LA(8);

                                    if ( (LA8_106=='c') ) {
                                        int LA8_114 = input.LA(9);

                                        if ( (LA8_114=='o') ) {
                                            int LA8_129 = input.LA(10);

                                            if ( (LA8_129=='d') ) {
                                                int LA8_138 = input.LA(11);

                                                if ( (LA8_138=='e') ) {
                                                    int LA8_140 = input.LA(12);

                                                    if ( (LA8_140=='l') ) {
                                                        int LA8_142 = input.LA(13);

                                                        if ( (LA8_142=='a') ) {
                                                            int LA8_144 = input.LA(14);

                                                            if ( (LA8_144=='n') ) {
                                                                int LA8_146 = input.LA(15);

                                                                if ( (LA8_146=='g') ) {
                                                                    int LA8_147 = input.LA(16);

                                                                    if ( (LA8_147=='u') ) {
                                                                        int LA8_148 = input.LA(17);

                                                                        if ( (LA8_148=='a') ) {
                                                                            int LA8_149 = input.LA(18);

                                                                            if ( (LA8_149=='g') ) {
                                                                                int LA8_150 = input.LA(19);

                                                                                if ( (LA8_150=='e') ) {
                                                                                    int LA8_151 = input.LA(20);

                                                                                    if ( (LA8_151=='[') ) {
                                                                                        alt8=5;
                                                                                    }
                                                                                    else {
                                                                                        alt8=38;}
                                                                                }
                                                                                else {
                                                                                    alt8=38;}
                                                                            }
                                                                            else {
                                                                                alt8=38;}
                                                                        }
                                                                        else {
                                                                            alt8=38;}
                                                                    }
                                                                    else {
                                                                        alt8=38;}
                                                                }
                                                                else {
                                                                    alt8=38;}
                                                            }
                                                            else {
                                                                alt8=38;}
                                                        }
                                                        else {
                                                            alt8=38;}
                                                    }
                                                    else {
                                                        alt8=38;}
                                                }
                                                else {
                                                    alt8=38;}
                                            }
                                            else {
                                                alt8=38;}
                                        }
                                        else {
                                            alt8=38;}
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0==']') ) {
            alt8=2;
        }
        else if ( (LA8_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA8_26 = input.LA(3);

                if ( (LA8_26=='b') ) {
                    int LA8_54 = input.LA(4);

                    if ( (LA8_54=='t') ) {
                        int LA8_71 = input.LA(5);

                        if ( (LA8_71=='i') ) {
                            int LA8_85 = input.LA(6);

                            if ( (LA8_85=='t') ) {
                                int LA8_98 = input.LA(7);

                                if ( (LA8_98=='l') ) {
                                    int LA8_107 = input.LA(8);

                                    if ( (LA8_107=='e') ) {
                                        int LA8_115 = input.LA(9);

                                        if ( (LA8_115=='[') ) {
                                            alt8=3;
                                        }
                                        else {
                                            alt8=38;}
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            case 'e':
                {
                int LA8_27 = input.LA(3);

                if ( (LA8_27=='c') ) {
                    int LA8_55 = input.LA(4);

                    if ( (LA8_55=='t') ) {
                        int LA8_72 = input.LA(5);

                        if ( (LA8_72=='i') ) {
                            int LA8_86 = input.LA(6);

                            if ( (LA8_86=='o') ) {
                                int LA8_99 = input.LA(7);

                                if ( (LA8_99=='n') ) {
                                    switch ( input.LA(8) ) {
                                    case ':':
                                        {
                                        alt8=10;
                                        }
                                        break;
                                    case '2':
                                        {
                                        switch ( input.LA(9) ) {
                                        case '[':
                                            {
                                            alt8=14;
                                            }
                                            break;
                                        case ':':
                                            {
                                            alt8=13;
                                            }
                                            break;
                                        default:
                                            alt8=38;}

                                        }
                                        break;
                                    case '4':
                                        {
                                        switch ( input.LA(9) ) {
                                        case '[':
                                            {
                                            alt8=18;
                                            }
                                            break;
                                        case ':':
                                            {
                                            alt8=17;
                                            }
                                            break;
                                        default:
                                            alt8=38;}

                                        }
                                        break;
                                    case '-':
                                        {
                                        alt8=12;
                                        }
                                        break;
                                    case '3':
                                        {
                                        switch ( input.LA(9) ) {
                                        case '[':
                                            {
                                            alt8=16;
                                            }
                                            break;
                                        case ':':
                                            {
                                            alt8=15;
                                            }
                                            break;
                                        default:
                                            alt8=38;}

                                        }
                                        break;
                                    case '[':
                                        {
                                        alt8=11;
                                        }
                                        break;
                                    default:
                                        alt8=38;}

                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0=='a') ) {
            switch ( input.LA(2) ) {
            case '[':
                {
                alt8=26;
                }
                break;
            case 'u':
                {
                int LA8_29 = input.LA(3);

                if ( (LA8_29=='t') ) {
                    int LA8_56 = input.LA(4);

                    if ( (LA8_56=='h') ) {
                        int LA8_73 = input.LA(5);

                        if ( (LA8_73=='o') ) {
                            int LA8_87 = input.LA(6);

                            if ( (LA8_87=='r') ) {
                                int LA8_100 = input.LA(7);

                                if ( (LA8_100=='s') ) {
                                    int LA8_109 = input.LA(8);

                                    if ( (LA8_109=='[') ) {
                                        alt8=4;
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA8_30 = input.LA(3);

                if ( (LA8_30=='a') ) {
                    int LA8_57 = input.LA(4);

                    if ( (LA8_57=='p') ) {
                        int LA8_74 = input.LA(5);

                        if ( (LA8_74=='t') ) {
                            int LA8_88 = input.LA(6);

                            if ( (LA8_88=='e') ) {
                                int LA8_101 = input.LA(7);

                                if ( (LA8_101=='r') ) {
                                    switch ( input.LA(8) ) {
                                    case '[':
                                        {
                                        alt8=8;
                                        }
                                        break;
                                    case '-':
                                        {
                                        alt8=9;
                                        }
                                        break;
                                    case ':':
                                        {
                                        alt8=6;
                                        }
                                        break;
                                    default:
                                        alt8=38;}

                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            case 'o':
                {
                int LA8_31 = input.LA(3);

                if ( (LA8_31=='d') ) {
                    int LA8_58 = input.LA(4);

                    if ( (LA8_58=='e') ) {
                        switch ( input.LA(5) ) {
                        case '[':
                            {
                            alt8=35;
                            }
                            break;
                        case 'l':
                            {
                            int LA8_90 = input.LA(6);

                            if ( (LA8_90=='a') ) {
                                int LA8_102 = input.LA(7);

                                if ( (LA8_102=='n') ) {
                                    int LA8_111 = input.LA(8);

                                    if ( (LA8_111=='g') ) {
                                        int LA8_126 = input.LA(9);

                                        if ( (LA8_126=='u') ) {
                                            int LA8_137 = input.LA(10);

                                            if ( (LA8_137=='a') ) {
                                                int LA8_139 = input.LA(11);

                                                if ( (LA8_139=='g') ) {
                                                    int LA8_141 = input.LA(12);

                                                    if ( (LA8_141=='e') ) {
                                                        int LA8_143 = input.LA(13);

                                                        if ( (LA8_143=='-') ) {
                                                            alt8=37;
                                                        }
                                                        else {
                                                            alt8=38;}
                                                    }
                                                    else {
                                                        alt8=38;}
                                                }
                                                else {
                                                    alt8=38;}
                                            }
                                            else {
                                                alt8=38;}
                                        }
                                        else {
                                            alt8=38;}
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                            }
                            break;
                        case 'R':
                            {
                            int LA8_91 = input.LA(6);

                            if ( (LA8_91=='e') ) {
                                int LA8_103 = input.LA(7);

                                if ( (LA8_103=='f') ) {
                                    int LA8_112 = input.LA(8);

                                    if ( (LA8_112=='[') ) {
                                        alt8=31;
                                    }
                                    else {
                                        alt8=38;}
                                }
                                else {
                                    alt8=38;}
                            }
                            else {
                                alt8=38;}
                            }
                            break;
                        default:
                            alt8=38;}

                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0=='[') ) {
            alt8=7;
        }
        else if ( (LA8_0=='\\') ) {
            switch ( input.LA(2) ) {
            case '[':
                {
                alt8=19;
                }
                break;
            case ']':
                {
                alt8=20;
                }
                break;
            default:
                alt8=43;}

        }
        else if ( (LA8_0==',') ) {
            alt8=21;
        }
        else if ( (LA8_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA8_36 = input.LA(3);

                if ( (LA8_36=='b') ) {
                    int LA8_59 = input.LA(4);

                    if ( (LA8_59=='l') ) {
                        int LA8_76 = input.LA(5);

                        if ( (LA8_76=='e') ) {
                            int LA8_92 = input.LA(6);

                            if ( (LA8_92=='[') ) {
                                alt8=22;
                            }
                            else {
                                alt8=38;}
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            case 'r':
                {
                int LA8_37 = input.LA(3);

                if ( (LA8_37=='[') ) {
                    alt8=23;
                }
                else {
                    alt8=38;}
                }
                break;
            case 'd':
                {
                int LA8_38 = input.LA(3);

                if ( (LA8_38=='[') ) {
                    alt8=24;
                }
                else {
                    alt8=38;}
                }
                break;
            case 'o':
                {
                int LA8_39 = input.LA(3);

                if ( (LA8_39=='d') ) {
                    int LA8_62 = input.LA(4);

                    if ( (LA8_62=='o') ) {
                        int LA8_77 = input.LA(5);

                        if ( (LA8_77=='[') ) {
                            alt8=36;
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0=='e') ) {
            int LA8_10 = input.LA(2);

            if ( (LA8_10=='[') ) {
                alt8=25;
            }
            else {
                alt8=38;}
        }
        else if ( (LA8_0=='r') ) {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='e') ) {
                int LA8_41 = input.LA(3);

                if ( (LA8_41=='f') ) {
                    int LA8_63 = input.LA(4);

                    if ( (LA8_63==':') ) {
                        alt8=27;
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
            }
            else {
                alt8=38;}
        }
        else if ( (LA8_0=='o') ) {
            int LA8_12 = input.LA(2);

            if ( (LA8_12=='l') ) {
                int LA8_42 = input.LA(3);

                if ( (LA8_42=='[') ) {
                    alt8=28;
                }
                else {
                    alt8=38;}
            }
            else {
                alt8=38;}
        }
        else if ( (LA8_0=='u') ) {
            int LA8_13 = input.LA(2);

            if ( (LA8_13=='l') ) {
                int LA8_43 = input.LA(3);

                if ( (LA8_43=='[') ) {
                    alt8=29;
                }
                else {
                    alt8=38;}
            }
            else {
                alt8=38;}
        }
        else if ( (LA8_0=='i') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA8_44 = input.LA(3);

                if ( (LA8_44=='e') ) {
                    int LA8_66 = input.LA(4);

                    if ( (LA8_66=='m') ) {
                        int LA8_79 = input.LA(5);

                        if ( (LA8_79=='[') ) {
                            alt8=30;
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
                }
                break;
            case 'm':
                {
                int LA8_45 = input.LA(3);

                if ( (LA8_45=='g') ) {
                    switch ( input.LA(4) ) {
                    case ':':
                        {
                        alt8=33;
                        }
                        break;
                    case '[':
                        {
                        alt8=34;
                        }
                        break;
                    default:
                        alt8=38;}

                }
                else {
                    alt8=38;}
                }
                break;
            default:
                alt8=38;}

        }
        else if ( (LA8_0=='l') ) {
            int LA8_15 = input.LA(2);

            if ( (LA8_15=='i') ) {
                int LA8_46 = input.LA(3);

                if ( (LA8_46=='n') ) {
                    int LA8_68 = input.LA(4);

                    if ( (LA8_68=='k') ) {
                        int LA8_82 = input.LA(5);

                        if ( (LA8_82=='[') ) {
                            alt8=32;
                        }
                        else {
                            alt8=38;}
                    }
                    else {
                        alt8=38;}
                }
                else {
                    alt8=38;}
            }
            else {
                alt8=38;}
        }
        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||LA8_0=='b'||(LA8_0>='f' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='k')||(LA8_0>='m' && LA8_0<='n')||(LA8_0>='p' && LA8_0<='q')||(LA8_0>='v' && LA8_0<='z')) ) {
            alt8=38;
        }
        else if ( (LA8_0=='%') ) {
            int LA8_17 = input.LA(2);

            if ( (LA8_17=='%') ) {
                alt8=39;
            }
            else {
                alt8=43;}
        }
        else if ( (LA8_0=='\r') ) {
            int LA8_18 = input.LA(2);

            if ( (LA8_18=='\n') ) {
                int LA8_48 = input.LA(3);

                if ( (LA8_48=='\n'||LA8_48=='\r') ) {
                    alt8=40;
                }
                else {
                    alt8=41;}
            }
            else {
                alt8=43;}
        }
        else if ( (LA8_0=='\n') ) {
            int LA8_19 = input.LA(2);

            if ( (LA8_19=='\n'||LA8_19=='\r') ) {
                alt8=40;
            }
            else {
                alt8=41;}
        }
        else if ( (LA8_0=='\t'||LA8_0==' ') ) {
            alt8=42;
        }
        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||(LA8_0>='!' && LA8_0<='$')||(LA8_0>='&' && LA8_0<='+')||(LA8_0>='-' && LA8_0<='@')||LA8_0=='^'||LA8_0=='`'||(LA8_0>='{' && LA8_0<='\uFFFE')) ) {
            alt8=43;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_WS | RULE_ANY_OTHER );", 8, 0, input);

            throw nvae;
        }
        switch (alt8) {
            case 1 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:134: T41
                {
                mT41(); 

                }
                break;
            case 33 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:138: T42
                {
                mT42(); 

                }
                break;
            case 34 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:142: T43
                {
                mT43(); 

                }
                break;
            case 35 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:146: T44
                {
                mT44(); 

                }
                break;
            case 36 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:150: T45
                {
                mT45(); 

                }
                break;
            case 37 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:154: T46
                {
                mT46(); 

                }
                break;
            case 38 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:166: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:182: RULE_MULTI_NL
                {
                mRULE_MULTI_NL(); 

                }
                break;
            case 41 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:196: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 42 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:211: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1:219: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}