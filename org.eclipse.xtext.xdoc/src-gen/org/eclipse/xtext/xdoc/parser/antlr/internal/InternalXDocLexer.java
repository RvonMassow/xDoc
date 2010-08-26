package org.eclipse.xtext.xdoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=7;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T9=9;
    public static final int T25=25;
    public static final int RULE_MULTI_NL=6;
    public static final int Tokens=29;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=5;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalXDocLexer() {;} 
    public InternalXDocLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:10:4: ( '\\\\chapter' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:10:6: '\\\\chapter'
            {
            match("\\chapter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:11:5: ( ':' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:11:7: ':'
            {
            match(':'); 

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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:12:5: ( '[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:12:7: '['
            {
            match('['); 

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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:13:5: ( ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:13:7: ']'
            {
            match(']'); 

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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:14:5: ( '\\\\section' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:14:7: '\\\\section'
            {
            match("\\section"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:15:5: ( '\\\\subsection' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:15:7: '\\\\subsection'
            {
            match("\\subsection"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:16:5: ( '\\\\section3' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:16:7: '\\\\section3'
            {
            match("\\section3"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:17:5: ( '\\\\section4' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:17:7: '\\\\section4'
            {
            match("\\section4"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:18:5: ( '\\\\emph' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:18:7: '\\\\emph'
            {
            match("\\emph"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:19:5: ( '\\\\a' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:19:7: '\\\\a'
            {
            match("\\a"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:20:5: ( '\\\\ref' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:20:7: '\\\\ref'
            {
            match("\\ref"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:21:5: ( '\\\\ol' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:21:7: '\\\\ol'
            {
            match("\\ol"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:22:5: ( '\\\\ul' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:22:7: '\\\\ul'
            {
            match("\\ul"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:23:5: ( '\\\\item' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:23:7: '\\\\item'
            {
            match("\\item"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:24:5: ( '\\\\codeRef' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:24:7: '\\\\codeRef'
            {
            match("\\codeRef"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:25:5: ( '\\\\link' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:25:7: '\\\\link'
            {
            match("\\link"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:26:5: ( '\\\\img' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:26:7: '\\\\img'
            {
            match("\\img"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:27:5: ( '\\\\code' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:27:7: '\\\\code'
            {
            match("\\code"); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:28:5: ( '\\\\[' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:28:7: '\\\\['
            {
            match("\\["); 


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:29:5: ( '\\\\]' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:29:7: '\\\\]'
            {
            match("\\]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3022:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3022:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3022:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:17: ( '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:19: '%%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("%%"); 

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3024:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:15: ( ( '\\r' )? '\\n' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:17: ( '\\r' )? '\\n' ( ' ' | '\\t' )* ( '\\r' )? '\\n' ( RULE_WS )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:17: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:28: ( ' ' | '\\t' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:
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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:40: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:51: ( RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3026:51: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_MULTI_NL

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3028:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3028:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3030:16: ( . )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:3030:18: .
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
        // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER )
        int alt9=25;
        int LA9_0 = input.LA(1);

        if ( (LA9_0=='\\') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA9_11 = input.LA(3);

                if ( (LA9_11=='h') ) {
                    alt9=1;
                }
                else if ( (LA9_11=='o') ) {
                    int LA9_30 = input.LA(4);

                    if ( (LA9_30=='d') ) {
                        int LA9_35 = input.LA(5);

                        if ( (LA9_35=='e') ) {
                            int LA9_37 = input.LA(6);

                            if ( (LA9_37=='R') ) {
                                alt9=15;
                            }
                            else {
                                alt9=18;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 35, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 30, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 11, input);

                    throw nvae;
                }
                }
                break;
            case 's':
                {
                int LA9_12 = input.LA(3);

                if ( (LA9_12=='e') ) {
                    int LA9_31 = input.LA(4);

                    if ( (LA9_31=='c') ) {
                        int LA9_36 = input.LA(5);

                        if ( (LA9_36=='t') ) {
                            int LA9_38 = input.LA(6);

                            if ( (LA9_38=='i') ) {
                                int LA9_41 = input.LA(7);

                                if ( (LA9_41=='o') ) {
                                    int LA9_42 = input.LA(8);

                                    if ( (LA9_42=='n') ) {
                                        switch ( input.LA(9) ) {
                                        case '3':
                                            {
                                            alt9=7;
                                            }
                                            break;
                                        case '4':
                                            {
                                            alt9=8;
                                            }
                                            break;
                                        default:
                                            alt9=5;}

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 42, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 41, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 38, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 36, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 31, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_12=='u') ) {
                    alt9=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 12, input);

                    throw nvae;
                }
                }
                break;
            case 'r':
                {
                alt9=11;
                }
                break;
            case 'a':
                {
                alt9=10;
                }
                break;
            case 'e':
                {
                alt9=9;
                }
                break;
            case 'i':
                {
                int LA9_16 = input.LA(3);

                if ( (LA9_16=='m') ) {
                    alt9=17;
                }
                else if ( (LA9_16=='t') ) {
                    alt9=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 16, input);

                    throw nvae;
                }
                }
                break;
            case 'u':
                {
                alt9=13;
                }
                break;
            case 'o':
                {
                alt9=12;
                }
                break;
            case 'l':
                {
                alt9=16;
                }
                break;
            case ']':
                {
                alt9=20;
                }
                break;
            case '[':
                {
                alt9=19;
                }
                break;
            default:
                alt9=25;}

        }
        else if ( (LA9_0==':') ) {
            alt9=2;
        }
        else if ( (LA9_0=='[') ) {
            alt9=3;
        }
        else if ( (LA9_0==']') ) {
            alt9=4;
        }
        else if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
            alt9=21;
        }
        else if ( (LA9_0=='%') ) {
            int LA9_6 = input.LA(2);

            if ( (LA9_6=='%') ) {
                alt9=22;
            }
            else {
                alt9=25;}
        }
        else if ( (LA9_0=='\r') ) {
            int LA9_7 = input.LA(2);

            if ( (LA9_7=='\n') ) {
                alt9=23;
            }
            else {
                alt9=24;}
        }
        else if ( (LA9_0=='\n') ) {
            int LA9_8 = input.LA(2);

            if ( ((LA9_8>='\t' && LA9_8<='\n')||LA9_8=='\r'||LA9_8==' ') ) {
                alt9=23;
            }
            else {
                alt9=24;}
        }
        else if ( (LA9_0=='\t'||LA9_0==' ') ) {
            alt9=24;
        }
        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='$')||(LA9_0>='&' && LA9_0<='9')||(LA9_0>=';' && LA9_0<='@')||LA9_0=='^'||LA9_0=='`'||(LA9_0>='{' && LA9_0<='\uFFFE')) ) {
            alt9=25;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_SL_COMMENT | RULE_MULTI_NL | RULE_WS | RULE_ANY_OTHER );", 9, 0, input);

            throw nvae;
        }
        switch (alt9) {
            case 1 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:37: T16
                {
                mT16(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:41: T17
                {
                mT17(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:45: T18
                {
                mT18(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:49: T19
                {
                mT19(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:53: T20
                {
                mT20(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:57: T21
                {
                mT21(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:61: T22
                {
                mT22(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:65: T23
                {
                mT23(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:69: T24
                {
                mT24(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:73: T25
                {
                mT25(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:77: T26
                {
                mT26(); 

                }
                break;
            case 19 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:81: T27
                {
                mT27(); 

                }
                break;
            case 20 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:85: T28
                {
                mT28(); 

                }
                break;
            case 21 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:89: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:97: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:113: RULE_MULTI_NL
                {
                mRULE_MULTI_NL(); 

                }
                break;
            case 24 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:127: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1:135: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}