package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocLexer extends Lexer {
    public static final int T21=21;
    public static final int T14=14;
    public static final int T29=29;
    public static final int RULE_ID=4;
    public static final int T33=33;
    public static final int T22=22;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T34=34;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=5;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int RULE_MULTI_NL=8;
    public static final int T32=32;
    public static final int RULE_SINGLE_NL=6;
    public static final int T17=17;
    public static final int Tokens=35;
    public static final int T31=31;
    public static final int RULE_ANY_OTHER=7;
    public static final int T16=16;
    public static final int T27=27;
    public static final int RULE_SL_COMMENT=9;
    public static final int T30=30;
    public static final int T24=24;
    public static final int T19=19;
    public InternalXDocLexer() {;} 
    public InternalXDocLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:10:5: ( 'chapter[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:10:7: 'chapter['
            {
            match("chapter["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:11:5: ( 'section[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:11:7: 'section['
            {
            match("section["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:12:5: ( 'section2[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:12:7: 'section2['
            {
            match("section2["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:13:5: ( 'section3[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:13:7: 'section3['
            {
            match("section3["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:14:5: ( 'section4[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:14:7: 'section4['
            {
            match("section4["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:15:5: ( '\\\\[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:15:7: '\\\\['
            {
            match("\\["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:16:5: ( '\\\\]' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:16:7: '\\\\]'
            {
            match("\\]"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:17:5: ( 'img[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:17:7: 'img['
            {
            match("img["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:18:5: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:18:7: ']'
            {
            match(']'); 

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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:19:5: ( 'chapter:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:19:7: 'chapter:'
            {
            match("chapter:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:20:5: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:20:7: '['
            {
            match('['); 

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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:21:5: ( 'section:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:21:7: 'section:'
            {
            match("section:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:22:5: ( 'section2:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:22:7: 'section2:'
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:23:5: ( 'section3:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:23:7: 'section3:'
            {
            match("section3:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:24:5: ( 'section4:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:24:7: 'section4:'
            {
            match("section4:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:25:5: ( 'e[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:25:7: 'e['
            {
            match("e["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:26:5: ( 'a[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:26:7: 'a['
            {
            match("a["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:27:5: ( 'ref:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:27:7: 'ref:'
            {
            match("ref:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:28:5: ( 'ol[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:28:7: 'ol['
            {
            match("ol["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:29:5: ( 'ul[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:29:7: 'ul['
            {
            match("ul["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:30:5: ( 'item[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:30:7: 'item['
            {
            match("item["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:31:5: ( 'codeRef[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:31:7: 'codeRef['
            {
            match("codeRef["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:32:5: ( 'link[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:32:7: 'link['
            {
            match("link["); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:33:5: ( 'img:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:33:7: 'img:'
            {
            match("img:"); 


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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:34:5: ( 'code[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:34:7: 'code['
            {
            match("code["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7149:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7149:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7149:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:17: ( '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:19: '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? '\\n'
            {
            match("%%"); 

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:40: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7151:40: '\\r'
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:15: ( ( '\\r' )? '\\n' ( ( '\\r' )? '\\n' )+ )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:17: ( '\\r' )? '\\n' ( ( '\\r' )? '\\n' )+
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:17: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:28: ( ( '\\r' )? '\\n' )+
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
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:29: ( '\\r' )? '\\n'
            	    {
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:29: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:29: '\\r'
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:16: ( ( '\\r' )? '\\n' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:18: ( '\\r' )? '\\n'
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:18: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:18: '\\r'
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7157:9: ( ( ' ' | '\\t' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7157:11: ( ' ' | '\\t' )
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
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7159:16: ( . )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7159:18: .
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
        // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:8: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt8=31;
        int LA8_0 = input.LA(1);

        if ( (LA8_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA8_19 = input.LA(3);

                if ( (LA8_19=='d') ) {
                    int LA8_40 = input.LA(4);

                    if ( (LA8_40=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'R':
                            {
                            int LA8_57 = input.LA(6);

                            if ( (LA8_57=='e') ) {
                                int LA8_63 = input.LA(7);

                                if ( (LA8_63=='f') ) {
                                    int LA8_66 = input.LA(8);

                                    if ( (LA8_66=='[') ) {
                                        alt8=22;
                                    }
                                    else {
                                        alt8=26;}
                                }
                                else {
                                    alt8=26;}
                            }
                            else {
                                alt8=26;}
                            }
                            break;
                        case '[':
                            {
                            alt8=25;
                            }
                            break;
                        default:
                            alt8=26;}

                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
                }
                break;
            case 'h':
                {
                int LA8_20 = input.LA(3);

                if ( (LA8_20=='a') ) {
                    int LA8_41 = input.LA(4);

                    if ( (LA8_41=='p') ) {
                        int LA8_50 = input.LA(5);

                        if ( (LA8_50=='t') ) {
                            int LA8_59 = input.LA(6);

                            if ( (LA8_59=='e') ) {
                                int LA8_64 = input.LA(7);

                                if ( (LA8_64=='r') ) {
                                    switch ( input.LA(8) ) {
                                    case '[':
                                        {
                                        alt8=1;
                                        }
                                        break;
                                    case ':':
                                        {
                                        alt8=10;
                                        }
                                        break;
                                    default:
                                        alt8=26;}

                                }
                                else {
                                    alt8=26;}
                            }
                            else {
                                alt8=26;}
                        }
                        else {
                            alt8=26;}
                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
                }
                break;
            default:
                alt8=26;}

        }
        else if ( (LA8_0=='s') ) {
            int LA8_2 = input.LA(2);

            if ( (LA8_2=='e') ) {
                int LA8_22 = input.LA(3);

                if ( (LA8_22=='c') ) {
                    int LA8_42 = input.LA(4);

                    if ( (LA8_42=='t') ) {
                        int LA8_51 = input.LA(5);

                        if ( (LA8_51=='i') ) {
                            int LA8_60 = input.LA(6);

                            if ( (LA8_60=='o') ) {
                                int LA8_65 = input.LA(7);

                                if ( (LA8_65=='n') ) {
                                    switch ( input.LA(8) ) {
                                    case '2':
                                        {
                                        switch ( input.LA(9) ) {
                                        case '[':
                                            {
                                            alt8=3;
                                            }
                                            break;
                                        case ':':
                                            {
                                            alt8=13;
                                            }
                                            break;
                                        default:
                                            alt8=26;}

                                        }
                                        break;
                                    case '4':
                                        {
                                        switch ( input.LA(9) ) {
                                        case '[':
                                            {
                                            alt8=5;
                                            }
                                            break;
                                        case ':':
                                            {
                                            alt8=15;
                                            }
                                            break;
                                        default:
                                            alt8=26;}

                                        }
                                        break;
                                    case '3':
                                        {
                                        switch ( input.LA(9) ) {
                                        case ':':
                                            {
                                            alt8=14;
                                            }
                                            break;
                                        case '[':
                                            {
                                            alt8=4;
                                            }
                                            break;
                                        default:
                                            alt8=26;}

                                        }
                                        break;
                                    case '[':
                                        {
                                        alt8=2;
                                        }
                                        break;
                                    case ':':
                                        {
                                        alt8=12;
                                        }
                                        break;
                                    default:
                                        alt8=26;}

                                }
                                else {
                                    alt8=26;}
                            }
                            else {
                                alt8=26;}
                        }
                        else {
                            alt8=26;}
                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='\\') ) {
            switch ( input.LA(2) ) {
            case '[':
                {
                alt8=6;
                }
                break;
            case ']':
                {
                alt8=7;
                }
                break;
            default:
                alt8=31;}

        }
        else if ( (LA8_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA8_25 = input.LA(3);

                if ( (LA8_25=='g') ) {
                    switch ( input.LA(4) ) {
                    case ':':
                        {
                        alt8=24;
                        }
                        break;
                    case '[':
                        {
                        alt8=8;
                        }
                        break;
                    default:
                        alt8=26;}

                }
                else {
                    alt8=26;}
                }
                break;
            case 't':
                {
                int LA8_26 = input.LA(3);

                if ( (LA8_26=='e') ) {
                    int LA8_44 = input.LA(4);

                    if ( (LA8_44=='m') ) {
                        int LA8_54 = input.LA(5);

                        if ( (LA8_54=='[') ) {
                            alt8=21;
                        }
                        else {
                            alt8=26;}
                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
                }
                break;
            default:
                alt8=26;}

        }
        else if ( (LA8_0==']') ) {
            alt8=9;
        }
        else if ( (LA8_0=='[') ) {
            alt8=11;
        }
        else if ( (LA8_0=='e') ) {
            int LA8_7 = input.LA(2);

            if ( (LA8_7=='[') ) {
                alt8=16;
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='a') ) {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='[') ) {
                alt8=17;
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='r') ) {
            int LA8_9 = input.LA(2);

            if ( (LA8_9=='e') ) {
                int LA8_31 = input.LA(3);

                if ( (LA8_31=='f') ) {
                    int LA8_45 = input.LA(4);

                    if ( (LA8_45==':') ) {
                        alt8=18;
                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='o') ) {
            int LA8_10 = input.LA(2);

            if ( (LA8_10=='l') ) {
                int LA8_32 = input.LA(3);

                if ( (LA8_32=='[') ) {
                    alt8=19;
                }
                else {
                    alt8=26;}
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='u') ) {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='l') ) {
                int LA8_33 = input.LA(3);

                if ( (LA8_33=='[') ) {
                    alt8=20;
                }
                else {
                    alt8=26;}
            }
            else {
                alt8=26;}
        }
        else if ( (LA8_0=='l') ) {
            int LA8_12 = input.LA(2);

            if ( (LA8_12=='i') ) {
                int LA8_34 = input.LA(3);

                if ( (LA8_34=='n') ) {
                    int LA8_48 = input.LA(4);

                    if ( (LA8_48=='k') ) {
                        int LA8_56 = input.LA(5);

                        if ( (LA8_56=='[') ) {
                            alt8=23;
                        }
                        else {
                            alt8=26;}
                    }
                    else {
                        alt8=26;}
                }
                else {
                    alt8=26;}
            }
            else {
                alt8=26;}
        }
        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||LA8_0=='b'||LA8_0=='d'||(LA8_0>='f' && LA8_0<='h')||(LA8_0>='j' && LA8_0<='k')||(LA8_0>='m' && LA8_0<='n')||(LA8_0>='p' && LA8_0<='q')||LA8_0=='t'||(LA8_0>='v' && LA8_0<='z')) ) {
            alt8=26;
        }
        else if ( (LA8_0=='%') ) {
            int LA8_14 = input.LA(2);

            if ( (LA8_14=='%') ) {
                alt8=27;
            }
            else {
                alt8=31;}
        }
        else if ( (LA8_0=='\r') ) {
            int LA8_15 = input.LA(2);

            if ( (LA8_15=='\n') ) {
                int LA8_36 = input.LA(3);

                if ( (LA8_36=='\n'||LA8_36=='\r') ) {
                    alt8=28;
                }
                else {
                    alt8=29;}
            }
            else {
                alt8=31;}
        }
        else if ( (LA8_0=='\n') ) {
            int LA8_16 = input.LA(2);

            if ( (LA8_16=='\n'||LA8_16=='\r') ) {
                alt8=28;
            }
            else {
                alt8=29;}
        }
        else if ( (LA8_0=='\t'||LA8_0==' ') ) {
            alt8=30;
        }
        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||(LA8_0>='!' && LA8_0<='$')||(LA8_0>='&' && LA8_0<='@')||LA8_0=='^'||LA8_0=='`'||(LA8_0>='{' && LA8_0<='\uFFFE')) ) {
            alt8=31;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_WS | RULE_ANY_OTHER );", 8, 0, input);

            throw nvae;
        }
        switch (alt8) {
            case 1 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:110: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:118: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:134: RULE_MULTI_NL
                {
                mRULE_MULTI_NL(); 

                }
                break;
            case 29 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:148: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 30 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}