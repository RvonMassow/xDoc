// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g 2012-06-12 11:31:37

package org.eclipse.xtext.xdoc.generator.util.lexer;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.eclipse.xtext.parser.antlr.Lexer;

public class Common extends Lexer {
    public static final int RICH_TEXT=5;
    public static final int INT=12;
    public static final int IN_RICH_STRING=4;
    public static final int RICH_TEXT_INBETWEEN=8;
    public static final int ID=14;
    public static final int EOF=-1;
    public static final int ANY_OTHER=19;
    public static final int ML_COMMENT=16;
    public static final int WS=18;
    public static final int DECIMAL=13;
    public static final int HEX=11;
    public static final int RICH_TEXT_END=7;
    public static final int SL_COMMENT=17;
    public static final int COMMENT_RICH_TEXT_END=10;
    public static final int RICH_TEXT_START=6;
    public static final int COMMENT_RICH_TEXT_INBETWEEN=9;
    public static final int STRING=15;

    // delegates
    // delegators

    public Common() {;} 
    public Common(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Common(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g"; }

    // $ANTLR start "RICH_TEXT"
    public final void mRICH_TEXT() throws RecognitionException {
        try {
            int _type = RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:10:11: ( '\\'\\'\\'' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:2: '\\'\\'\\'' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:11: ( IN_RICH_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='&')||(LA1_4>='(' && LA1_4<='\u00AA')||(LA1_4>='\u00AC' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\u00AA')||(LA1_1>='\u00AC' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\u00AA')||(LA1_0>='\u00AC' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:11: IN_RICH_STRING
            	    {
            	    mIN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:11:27: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\'') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='\'') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    alt4=2;}
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:12:3: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:3: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:13:3: ( '\\'' ( '\\'' )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\'') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:14:4: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:14:9: ( '\\'' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\'') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:14:9: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RICH_TEXT"

    // $ANTLR start "RICH_TEXT_START"
    public final void mRICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:19:17: ( '\\'\\'\\'' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:20:2: '\\'\\'\\'' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:20:11: ( IN_RICH_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='&')||(LA5_4>='(' && LA5_4<='\u00AA')||(LA5_4>='\u00AC' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='&')||(LA5_1>='(' && LA5_1<='\u00AA')||(LA5_1>='\u00AC' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\u00AA')||(LA5_0>='\u00AC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:20:11: IN_RICH_STRING
            	    {
            	    mIN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:20:27: ( '\\'' ( '\\'' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:3: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:8: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:21:8: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RICH_TEXT_START"

    // $ANTLR start "RICH_TEXT_END"
    public final void mRICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:25:15: ( '\\u00BB' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:26:2: '\\u00BB' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:26:11: ( IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:26:11: IN_RICH_STRING
            	    {
            	    mIN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:26:27: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:27:3: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:28:3: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:28:3: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:29:4: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:29:9: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:29:9: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RICH_TEXT_END"

    // $ANTLR start "RICH_TEXT_INBETWEEN"
    public final void mRICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:34:21: ( '\\u00BB' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:35:2: '\\u00BB' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:35:11: ( IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:35:11: IN_RICH_STRING
            	    {
            	    mIN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:35:27: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:36:3: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:36:8: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:36:8: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RICH_TEXT_INBETWEEN"

    // $ANTLR start "COMMENT_RICH_TEXT_INBETWEEN"
    public final void mCOMMENT_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = COMMENT_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:40:29: ( '\\u00AB\\u00AB' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )? )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:41:2: '\\u00AB\\u00AB' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            {
            match("\u00AB\u00AB"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:41:17: (~ ( '\\n' | '\\r' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:41:17: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:44:5: ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:3: ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:3: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:3: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:14: ( IN_RICH_STRING )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\'') ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='\'') ) {
                                int LA17_4 = input.LA(3);

                                if ( ((LA17_4>='\u0000' && LA17_4<='&')||(LA17_4>='(' && LA17_4<='\u00AA')||(LA17_4>='\u00AC' && LA17_4<='\uFFFF')) ) {
                                    alt17=1;
                                }


                            }
                            else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\u00AA')||(LA17_1>='\u00AC' && LA17_1<='\uFFFF')) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\u00AA')||(LA17_0>='\u00AC' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:14: IN_RICH_STRING
                    	    {
                    	    mIN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:45:30: ( '\\'' ( '\\'' )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:46:4: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:46:9: ( '\\'' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='\'') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:46:9: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match('\u00AB'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_RICH_TEXT_INBETWEEN"

    // $ANTLR start "COMMENT_RICH_TEXT_END"
    public final void mCOMMENT_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = COMMENT_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:51:23: ( '\\u00AB\\u00AB' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF ) )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:52:2: '\\u00AB\\u00AB' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            {
            match("\u00AB\u00AB"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:52:17: (~ ( '\\n' | '\\r' ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:52:17: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:55:5: ( ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) | EOF )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            else {
                alt27=2;}
            switch (alt27) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:3: ( '\\r' )? '\\n' ( IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:3: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:3: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:14: ( IN_RICH_STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\'') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\'') ) {
                                int LA23_4 = input.LA(3);

                                if ( ((LA23_4>='\u0000' && LA23_4<='&')||(LA23_4>='(' && LA23_4<='\u00AA')||(LA23_4>='\u00AC' && LA23_4<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='&')||(LA23_1>='(' && LA23_1<='\u00AA')||(LA23_1>='\u00AC' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='\u00AA')||(LA23_0>='\u00AC' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:14: IN_RICH_STRING
                    	    {
                    	    mIN_RICH_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:56:30: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\'') ) {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1=='\'') ) {
                            int LA26_3 = input.LA(3);

                            if ( (LA26_3=='\'') ) {
                                alt26=1;
                            }
                            else {
                                alt26=2;}
                        }
                        else {
                            alt26=2;}
                    }
                    else {
                        alt26=2;}
                    switch (alt26) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:57:4: '\\'\\'\\''
                            {
                            match("'''"); 


                            }
                            break;
                        case 2 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:58:4: ( '\\'' ( '\\'' )? )? EOF
                            {
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:58:4: ( '\\'' ( '\\'' )? )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0=='\'') ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:59:5: '\\'' ( '\\'' )?
                                    {
                                    match('\''); 
                                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:59:10: ( '\\'' )?
                                    int alt24=2;
                                    int LA24_0 = input.LA(1);

                                    if ( (LA24_0=='\'') ) {
                                        alt24=1;
                                    }
                                    switch (alt24) {
                                        case 1 :
                                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:59:10: '\\''
                                            {
                                            match('\''); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            match(EOF); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:62:3: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_RICH_TEXT_END"

    // $ANTLR start "IN_RICH_STRING"
    public final void mIN_RICH_STRING() throws RecognitionException {
        try {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:66:25: ( '\\'\\'' ~ ( '\\u00AB' | '\\'' ) | '\\'' ~ ( '\\u00AB' | '\\'' ) | ~ ( '\\u00AB' | '\\'' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\'') ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='\'') ) {
                    alt28=1;
                }
                else if ( ((LA28_1>='\u0000' && LA28_1<='&')||(LA28_1>='(' && LA28_1<='\u00AA')||(LA28_1>='\u00AC' && LA28_1<='\uFFFF')) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='\u00AA')||(LA28_0>='\u00AC' && LA28_0<='\uFFFF')) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:67:2: '\\'\\'' ~ ( '\\u00AB' | '\\'' )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:71:2: '\\'' ~ ( '\\u00AB' | '\\'' )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:75:2: ~ ( '\\u00AB' | '\\'' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "IN_RICH_STRING"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:81:5: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:82:2: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:82:2: ( '0x' | '0X' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='0') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='x') ) {
                    alt29=1;
                }
                else if ( (LA29_1=='X') ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:83:3: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:84:3: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:85:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='F')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='f')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:90:5: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='#') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:91:3: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:91:7: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='B'||LA31_0=='b') ) {
                        alt31=1;
                    }
                    else if ( (LA31_0=='L'||LA31_0=='l') ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:92:4: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:99:4: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:107:5: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:108:2: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:108:13: ( '0' .. '9' | '_' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||LA33_0=='_') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:114:9: ( INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:115:2: INT ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mINT(); 
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:115:6: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='E'||LA35_0=='e') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:116:3: ( 'e' | 'E' ) ( '+' | '-' )? INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:119:5: ( '+' | '-' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='+'||LA34_0=='-') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mINT(); 

                    }
                    break;

            }

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:123:5: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='B'||LA36_0=='b') ) {
                alt36=1;
            }
            else if ( (LA36_0=='D'||LA36_0=='F'||LA36_0=='L'||LA36_0=='d'||LA36_0=='f'||LA36_0=='l') ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:124:3: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:133:3: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:144:4: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:145:2: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:145:2: ( '^' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='^') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:145:2: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:150:4: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='$'||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:159:8: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\"') ) {
                alt41=1;
            }
            else if ( (LA41_0=='\'') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:160:2: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:160:6: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\\') ) {
                            alt39=1;
                        }
                        else if ( ((LA39_0>='\u0000' && LA39_0<='!')||(LA39_0>='#' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:161:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:172:3: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:177:2: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:177:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='&')||(LA40_0>='(' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:178:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:189:3: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:196:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:197:2: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:197:7: ( options {greedy=false; } : . )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0=='*') ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1=='/') ) {
                        alt42=2;
                    }
                    else if ( ((LA42_1>='\u0000' && LA42_1<='.')||(LA42_1>='0' && LA42_1<='\uFFFF')) ) {
                        alt42=1;
                    }


                }
                else if ( ((LA42_0>='\u0000' && LA42_0<=')')||(LA42_0>='+' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:198:34: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:202:12: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )? )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:203:2: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:203:7: (~ ( '\\n' | '\\r' ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='\u0000' && LA43_0<='\t')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\uFFFF')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:203:7: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:206:5: ( ( '\\r' )? '\\n' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\n'||LA45_0=='\r') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:207:3: ( '\\r' )? '\\n'
                    {
                    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:207:3: ( '\\r' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='\r') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:207:3: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:211:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:212:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:212:2: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ANY_OTHER"
    public final void mANY_OTHER() throws RecognitionException {
        try {
            int _type = ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:220:11: ( . )
            // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:221:2: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:8: ( RICH_TEXT | RICH_TEXT_START | RICH_TEXT_END | RICH_TEXT_INBETWEEN | COMMENT_RICH_TEXT_INBETWEEN | COMMENT_RICH_TEXT_END | HEX | INT | DECIMAL | ID | STRING | ML_COMMENT | SL_COMMENT | WS | ANY_OTHER )
        int alt47=15;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:10: RICH_TEXT
                {
                mRICH_TEXT(); 

                }
                break;
            case 2 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:20: RICH_TEXT_START
                {
                mRICH_TEXT_START(); 

                }
                break;
            case 3 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:36: RICH_TEXT_END
                {
                mRICH_TEXT_END(); 

                }
                break;
            case 4 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:50: RICH_TEXT_INBETWEEN
                {
                mRICH_TEXT_INBETWEEN(); 

                }
                break;
            case 5 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:70: COMMENT_RICH_TEXT_INBETWEEN
                {
                mCOMMENT_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 6 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:98: COMMENT_RICH_TEXT_END
                {
                mCOMMENT_RICH_TEXT_END(); 

                }
                break;
            case 7 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:120: HEX
                {
                mHEX(); 

                }
                break;
            case 8 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:124: INT
                {
                mINT(); 

                }
                break;
            case 9 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:128: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 10 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:136: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:139: STRING
                {
                mSTRING(); 

                }
                break;
            case 12 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:146: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 13 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:157: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 14 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:168: WS
                {
                mWS(); 

                }
                break;
            case 15 :
                // /Users/efftinge/Workspaces/ws-xtext/xDoc/org.eclipse.xtext.xdoc/bin/org/eclipse/xtext/xdoc/generator/util/lexer/Common.g:1:171: ANY_OTHER
                {
                mANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\1\uffff\1\13\1\20\1\13\2\25\1\13\1\uffff\2\13\2\uffff\1\15\1\uffff"+
        "\2\20\2\uffff\1\41\1\uffff\1\25\6\uffff\1\45\2\20\1\41\1\uffff\1"+
        "\51\1\uffff\2\45\2\uffff\1\20\2\51\1\uffff\2\45\2\51\1\45\1\51";
    static final String DFA47_eofS =
        "\60\uffff";
    static final String DFA47_minS =
        "\3\0\1\u00ab\2\60\1\44\1\uffff\1\0\1\52\2\uffff\1\47\1\uffff\2\0"+
        "\2\uffff\1\0\1\uffff\1\60\6\uffff\4\0\1\12\1\0\1\uffff\2\0\2\uffff"+
        "\3\0\1\uffff\6\0";
    static final String DFA47_maxS =
        "\3\uffff\1\u00ab\1\170\1\154\1\172\1\uffff\1\uffff\1\57\2\uffff"+
        "\1\47\1\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\154\6\uffff\4\uffff"+
        "\1\12\1\uffff\1\uffff\2\uffff\2\uffff\3\uffff\1\uffff\6\uffff";
    static final String DFA47_acceptS =
        "\7\uffff\1\12\2\uffff\1\16\1\17\1\uffff\1\13\2\uffff\1\3\1\4\1\uffff"+
        "\1\7\1\uffff\1\10\1\11\1\12\1\14\1\15\1\16\6\uffff\1\5\2\uffff\1"+
        "\2\1\1\3\uffff\1\6\6\uffff";
    static final String DFA47_specialS =
        "\1\17\1\21\1\14\5\uffff\1\6\5\uffff\1\2\1\7\2\uffff\1\25\10\uffff"+
        "\1\24\1\22\1\5\1\13\1\uffff\1\3\1\uffff\1\20\1\16\2\uffff\1\1\1"+
        "\26\1\0\1\uffff\1\23\1\12\1\4\1\15\1\10\1\11}>";
    static final String[] DFA47_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\10\1\13\1\7\2\13\1\1"+
            "\7\13\1\11\1\4\11\5\7\13\32\7\3\13\1\6\1\7\1\13\32\7\60\13\1"+
            "\3\17\13\1\2\uff44\13",
            "\47\15\1\14\uffd8\15",
            "\47\17\1\16\u0083\17\1\21\uff54\17",
            "\1\22",
            "\12\24\10\uffff\1\26\1\uffff\3\26\5\uffff\1\26\13\uffff\1\23"+
            "\6\uffff\1\24\2\uffff\1\26\1\uffff\3\26\5\uffff\1\26\13\uffff"+
            "\1\23",
            "\12\24\10\uffff\1\26\1\uffff\3\26\5\uffff\1\26\22\uffff\1\24"+
            "\2\uffff\1\26\1\uffff\3\26\5\uffff\1\26",
            "\1\27\34\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\15",
            "\1\30\4\uffff\1\31",
            "",
            "",
            "\1\33",
            "",
            "\47\35\1\34\u0083\35\1\21\uff54\35",
            "\47\17\1\16\u0083\17\1\21\uff54\17",
            "",
            "",
            "\12\36\1\40\2\36\1\37\ufff2\36",
            "",
            "\12\24\10\uffff\1\26\1\uffff\3\26\5\uffff\1\26\22\uffff\1\24"+
            "\2\uffff\1\26\1\uffff\3\26\5\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\43\1\42\u0083\43\1\44\uff54\43",
            "\47\46\1\uffff\u0083\46\1\21\uff54\46",
            "\47\17\1\16\u0083\17\1\21\uff54\17",
            "\12\36\1\40\2\36\1\37\ufff2\36",
            "\1\40",
            "\47\50\1\47\u0083\50\1\41\uff54\50",
            "",
            "\47\53\1\52\u0083\53\1\44\uff54\53",
            "\47\43\1\42\u0083\43\1\44\uff54\43",
            "",
            "",
            "\47\17\1\16\u0083\17\1\21\uff54\17",
            "\47\55\1\54\u0083\55\1\41\uff54\55",
            "\47\50\1\47\u0083\50\1\41\uff54\50",
            "",
            "\47\56\1\uffff\u0083\56\1\44\uff54\56",
            "\47\43\1\42\u0083\43\1\44\uff54\43",
            "\47\57\1\uffff\u0083\57\1\41\uff54\57",
            "\47\50\1\47\u0083\50\1\41\uff54\50",
            "\47\43\1\42\u0083\43\1\44\uff54\43",
            "\47\50\1\47\u0083\50\1\41\uff54\50"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RICH_TEXT | RICH_TEXT_START | RICH_TEXT_END | RICH_TEXT_INBETWEEN | COMMENT_RICH_TEXT_INBETWEEN | COMMENT_RICH_TEXT_END | HEX | INT | DECIMAL | ID | STRING | ML_COMMENT | SL_COMMENT | WS | ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_40 = input.LA(1);

                        s = -1;
                        if ( (LA47_40=='\'') ) {s = 39;}

                        else if ( (LA47_40=='\u00AB') ) {s = 33;}

                        else if ( ((LA47_40>='\u0000' && LA47_40<='&')||(LA47_40>='(' && LA47_40<='\u00AA')||(LA47_40>='\u00AC' && LA47_40<='\uFFFF')) ) {s = 40;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_38 = input.LA(1);

                        s = -1;
                        if ( (LA47_38=='\'') ) {s = 14;}

                        else if ( ((LA47_38>='\u0000' && LA47_38<='&')||(LA47_38>='(' && LA47_38<='\u00AA')||(LA47_38>='\u00AC' && LA47_38<='\uFFFF')) ) {s = 15;}

                        else if ( (LA47_38=='\u00AB') ) {s = 17;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_14 = input.LA(1);

                        s = -1;
                        if ( (LA47_14=='\'') ) {s = 28;}

                        else if ( ((LA47_14>='\u0000' && LA47_14<='&')||(LA47_14>='(' && LA47_14<='\u00AA')||(LA47_14>='\u00AC' && LA47_14<='\uFFFF')) ) {s = 29;}

                        else if ( (LA47_14=='\u00AB') ) {s = 17;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_32 = input.LA(1);

                        s = -1;
                        if ( (LA47_32=='\'') ) {s = 39;}

                        else if ( ((LA47_32>='\u0000' && LA47_32<='&')||(LA47_32>='(' && LA47_32<='\u00AA')||(LA47_32>='\u00AC' && LA47_32<='\uFFFF')) ) {s = 40;}

                        else if ( (LA47_32=='\u00AB') ) {s = 33;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_44 = input.LA(1);

                        s = -1;
                        if ( ((LA47_44>='\u0000' && LA47_44<='&')||(LA47_44>='(' && LA47_44<='\u00AA')||(LA47_44>='\u00AC' && LA47_44<='\uFFFF')) ) {s = 47;}

                        else if ( (LA47_44=='\u00AB') ) {s = 33;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_29 = input.LA(1);

                        s = -1;
                        if ( (LA47_29=='\'') ) {s = 14;}

                        else if ( (LA47_29=='\u00AB') ) {s = 17;}

                        else if ( ((LA47_29>='\u0000' && LA47_29<='&')||(LA47_29>='(' && LA47_29<='\u00AA')||(LA47_29>='\u00AC' && LA47_29<='\uFFFF')) ) {s = 15;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_8 = input.LA(1);

                        s = -1;
                        if ( ((LA47_8>='\u0000' && LA47_8<='\uFFFF')) ) {s = 13;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_15 = input.LA(1);

                        s = -1;
                        if ( (LA47_15=='\'') ) {s = 14;}

                        else if ( ((LA47_15>='\u0000' && LA47_15<='&')||(LA47_15>='(' && LA47_15<='\u00AA')||(LA47_15>='\u00AC' && LA47_15<='\uFFFF')) ) {s = 15;}

                        else if ( (LA47_15=='\u00AB') ) {s = 17;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_46 = input.LA(1);

                        s = -1;
                        if ( (LA47_46=='\'') ) {s = 34;}

                        else if ( ((LA47_46>='\u0000' && LA47_46<='&')||(LA47_46>='(' && LA47_46<='\u00AA')||(LA47_46>='\u00AC' && LA47_46<='\uFFFF')) ) {s = 35;}

                        else if ( (LA47_46=='\u00AB') ) {s = 36;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_47 = input.LA(1);

                        s = -1;
                        if ( (LA47_47=='\'') ) {s = 39;}

                        else if ( (LA47_47=='\u00AB') ) {s = 33;}

                        else if ( ((LA47_47>='\u0000' && LA47_47<='&')||(LA47_47>='(' && LA47_47<='\u00AA')||(LA47_47>='\u00AC' && LA47_47<='\uFFFF')) ) {s = 40;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_43 = input.LA(1);

                        s = -1;
                        if ( (LA47_43=='\'') ) {s = 34;}

                        else if ( ((LA47_43>='\u0000' && LA47_43<='&')||(LA47_43>='(' && LA47_43<='\u00AA')||(LA47_43>='\u00AC' && LA47_43<='\uFFFF')) ) {s = 35;}

                        else if ( (LA47_43=='\u00AB') ) {s = 36;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_30 = input.LA(1);

                        s = -1;
                        if ( (LA47_30=='\r') ) {s = 31;}

                        else if ( (LA47_30=='\n') ) {s = 32;}

                        else if ( ((LA47_30>='\u0000' && LA47_30<='\t')||(LA47_30>='\u000B' && LA47_30<='\f')||(LA47_30>='\u000E' && LA47_30<='\uFFFF')) ) {s = 30;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_2 = input.LA(1);

                        s = -1;
                        if ( (LA47_2=='\'') ) {s = 14;}

                        else if ( ((LA47_2>='\u0000' && LA47_2<='&')||(LA47_2>='(' && LA47_2<='\u00AA')||(LA47_2>='\u00AC' && LA47_2<='\uFFFF')) ) {s = 15;}

                        else if ( (LA47_2=='\u00AB') ) {s = 17;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_45 = input.LA(1);

                        s = -1;
                        if ( (LA47_45=='\'') ) {s = 39;}

                        else if ( ((LA47_45>='\u0000' && LA47_45<='&')||(LA47_45>='(' && LA47_45<='\u00AA')||(LA47_45>='\u00AC' && LA47_45<='\uFFFF')) ) {s = 40;}

                        else if ( (LA47_45=='\u00AB') ) {s = 33;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_35 = input.LA(1);

                        s = -1;
                        if ( (LA47_35=='\'') ) {s = 34;}

                        else if ( (LA47_35=='\u00AB') ) {s = 36;}

                        else if ( ((LA47_35>='\u0000' && LA47_35<='&')||(LA47_35>='(' && LA47_35<='\u00AA')||(LA47_35>='\u00AC' && LA47_35<='\uFFFF')) ) {s = 35;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_0 = input.LA(1);

                        s = -1;
                        if ( (LA47_0=='\'') ) {s = 1;}

                        else if ( (LA47_0=='\u00BB') ) {s = 2;}

                        else if ( (LA47_0=='\u00AB') ) {s = 3;}

                        else if ( (LA47_0=='0') ) {s = 4;}

                        else if ( ((LA47_0>='1' && LA47_0<='9')) ) {s = 5;}

                        else if ( (LA47_0=='^') ) {s = 6;}

                        else if ( (LA47_0=='$'||(LA47_0>='A' && LA47_0<='Z')||LA47_0=='_'||(LA47_0>='a' && LA47_0<='z')) ) {s = 7;}

                        else if ( (LA47_0=='\"') ) {s = 8;}

                        else if ( (LA47_0=='/') ) {s = 9;}

                        else if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {s = 10;}

                        else if ( ((LA47_0>='\u0000' && LA47_0<='\b')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\u001F')||LA47_0=='!'||LA47_0=='#'||(LA47_0>='%' && LA47_0<='&')||(LA47_0>='(' && LA47_0<='.')||(LA47_0>=':' && LA47_0<='@')||(LA47_0>='[' && LA47_0<=']')||LA47_0=='`'||(LA47_0>='{' && LA47_0<='\u00AA')||(LA47_0>='\u00AC' && LA47_0<='\u00BA')||(LA47_0>='\u00BC' && LA47_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_34 = input.LA(1);

                        s = -1;
                        if ( (LA47_34=='\'') ) {s = 42;}

                        else if ( ((LA47_34>='\u0000' && LA47_34<='&')||(LA47_34>='(' && LA47_34<='\u00AA')||(LA47_34>='\u00AC' && LA47_34<='\uFFFF')) ) {s = 43;}

                        else if ( (LA47_34=='\u00AB') ) {s = 36;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_1 = input.LA(1);

                        s = -1;
                        if ( (LA47_1=='\'') ) {s = 12;}

                        else if ( ((LA47_1>='\u0000' && LA47_1<='&')||(LA47_1>='(' && LA47_1<='\uFFFF')) ) {s = 13;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_28 = input.LA(1);

                        s = -1;
                        if ( ((LA47_28>='\u0000' && LA47_28<='&')||(LA47_28>='(' && LA47_28<='\u00AA')||(LA47_28>='\u00AC' && LA47_28<='\uFFFF')) ) {s = 38;}

                        else if ( (LA47_28=='\u00AB') ) {s = 17;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_42 = input.LA(1);

                        s = -1;
                        if ( ((LA47_42>='\u0000' && LA47_42<='&')||(LA47_42>='(' && LA47_42<='\u00AA')||(LA47_42>='\u00AC' && LA47_42<='\uFFFF')) ) {s = 46;}

                        else if ( (LA47_42=='\u00AB') ) {s = 36;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_27 = input.LA(1);

                        s = -1;
                        if ( (LA47_27=='\'') ) {s = 34;}

                        else if ( ((LA47_27>='\u0000' && LA47_27<='&')||(LA47_27>='(' && LA47_27<='\u00AA')||(LA47_27>='\u00AC' && LA47_27<='\uFFFF')) ) {s = 35;}

                        else if ( (LA47_27=='\u00AB') ) {s = 36;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_18 = input.LA(1);

                        s = -1;
                        if ( ((LA47_18>='\u0000' && LA47_18<='\t')||(LA47_18>='\u000B' && LA47_18<='\f')||(LA47_18>='\u000E' && LA47_18<='\uFFFF')) ) {s = 30;}

                        else if ( (LA47_18=='\r') ) {s = 31;}

                        else if ( (LA47_18=='\n') ) {s = 32;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_39 = input.LA(1);

                        s = -1;
                        if ( (LA47_39=='\'') ) {s = 44;}

                        else if ( ((LA47_39>='\u0000' && LA47_39<='&')||(LA47_39>='(' && LA47_39<='\u00AA')||(LA47_39>='\u00AC' && LA47_39<='\uFFFF')) ) {s = 45;}

                        else if ( (LA47_39=='\u00AB') ) {s = 33;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}