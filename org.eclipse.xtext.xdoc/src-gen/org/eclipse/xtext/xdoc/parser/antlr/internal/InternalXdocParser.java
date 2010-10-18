package org.eclipse.xtext.xdoc.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.xdoc.services.XdocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'document['", "']'", "'subtitle['", "'authors['", "'defaultcodelanguage['", "'chapter:'", "'['", "'chapter['", "'chapter-ref['", "'section:'", "'section['", "'section-ref['", "'section2:'", "'section2['", "'section3:'", "'section3['", "'section4:'", "'section4['", "'\\\\['", "'\\\\]'", "','", "'table['", "'tr['", "'td['", "'e['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'img['", "'code['", "'todo['", "'codelanguage-def['"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__13=13;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__17=17;
    public static final int T__27=27;
    public static final int RULE_MULTI_NL=5;
    public static final int T__24=24;
    public static final int T__10=10;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int RULE_ID=6;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__44=44;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__11=11;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_WS=4;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int RULE_SINGLE_NL=7;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__41=41;
    public static final int T__18=18;

    // delegates
    // delegators


        public InternalXdocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXdocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXdocParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g"; }



     	private XdocGrammarAccess grammarAccess;
     	
        public InternalXdocParser(TokenStream input, IAstFactory factory, XdocGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XdocFile";	
       	}
       	
       	@Override
       	protected XdocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXdocFile"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:71:1: entryRuleXdocFile returns [EObject current=null] : iv_ruleXdocFile= ruleXdocFile EOF ;
    public final EObject entryRuleXdocFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXdocFile = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:72:2: (iv_ruleXdocFile= ruleXdocFile EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:73:2: iv_ruleXdocFile= ruleXdocFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getXdocFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleXdocFile_in_entryRuleXdocFile75);
            iv_ruleXdocFile=ruleXdocFile();

            state._fsp--;

             current =iv_ruleXdocFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXdocFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXdocFile"


    // $ANTLR start "ruleXdocFile"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:1: ruleXdocFile returns [EObject current=null] : ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )? ) ;
    public final EObject ruleXdocFile() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_10=null;
        Token this_MULTI_NL_13=null;
        Token this_MULTI_NL_15=null;
        EObject lv_sections_3_0 = null;

        EObject lv_sections_5_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_8_0 = null;

        EObject lv_sections_9_0 = null;

        EObject lv_sections_11_0 = null;

        EObject lv_sections_12_0 = null;

        EObject lv_sections_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:85:6: ( ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:2: () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:87:5: 
            {
             
                    temp=factory.create(grammarAccess.getXdocFileAccess().getXdocFileAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getXdocFileAccess().getXdocFileAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:2: (this_WS_1= RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleXdocFile131); 
                     
                        createLeafNode(this_WS_1, grammarAccess.getXdocFileAccess().getWSTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:101:3: (this_MULTI_NL_2= RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:101:4: this_MULTI_NL_2= RULE_MULTI_NL
                    {
                    this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144); 
                     
                        createLeafNode(this_MULTI_NL_2, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:3: ( ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10||LA9_0==15||(LA9_0>=17 && LA9_0<=23)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:4: ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) ) (this_MULTI_NL_15= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:4: ( ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* ) | ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* ) | ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* ) | ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* ) )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 10:
                        {
                        alt7=1;
                        }
                        break;
                    case 15:
                    case 17:
                    case 18:
                        {
                        alt7=2;
                        }
                        break;
                    case 19:
                    case 20:
                    case 21:
                        {
                        alt7=3;
                        }
                        break;
                    case 22:
                    case 23:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:5: ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:5: ( ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:6: ( (lv_sections_3_0= ruleDocument ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:105:6: ( (lv_sections_3_0= ruleDocument ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:106:1: (lv_sections_3_0= ruleDocument )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:106:1: (lv_sections_3_0= ruleDocument )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:107:3: lv_sections_3_0= ruleDocument
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsDocumentParserRuleCall_3_0_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDocument_in_ruleXdocFile169);
                            lv_sections_3_0=ruleDocument();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_3_0, 
                            	        		"Document", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:129:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==RULE_MULTI_NL) ) {
                                    int LA3_1 = input.LA(2);

                                    if ( (LA3_1==10) ) {
                                        alt3=1;
                                    }


                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:129:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_sections_5_0= ruleDocument ) )
                            	    {
                            	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile181); 
                            	     
                            	        createLeafNode(this_MULTI_NL_4, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:133:1: ( (lv_sections_5_0= ruleDocument ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:134:1: (lv_sections_5_0= ruleDocument )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:134:1: (lv_sections_5_0= ruleDocument )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:135:3: lv_sections_5_0= ruleDocument
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsDocumentParserRuleCall_3_0_0_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDocument_in_ruleXdocFile201);
                            	    lv_sections_5_0=ruleDocument();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_5_0, 
                            	    	        		"Document", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:158:6: ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:158:6: ( ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:158:7: ( (lv_sections_6_0= ruleChapter ) ) (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:158:7: ( (lv_sections_6_0= ruleChapter ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:159:1: (lv_sections_6_0= ruleChapter )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:159:1: (lv_sections_6_0= ruleChapter )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:160:3: lv_sections_6_0= ruleChapter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsChapterParserRuleCall_3_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleChapter_in_ruleXdocFile232);
                            lv_sections_6_0=ruleChapter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_6_0, 
                            	        		"Chapter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:182:2: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==RULE_MULTI_NL) ) {
                                    int LA4_1 = input.LA(2);

                                    if ( (LA4_1==15||(LA4_1>=17 && LA4_1<=18)) ) {
                                        alt4=1;
                                    }


                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:182:3: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_sections_8_0= ruleChapter ) )
                            	    {
                            	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile244); 
                            	     
                            	        createLeafNode(this_MULTI_NL_7, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:186:1: ( (lv_sections_8_0= ruleChapter ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:187:1: (lv_sections_8_0= ruleChapter )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:187:1: (lv_sections_8_0= ruleChapter )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:188:3: lv_sections_8_0= ruleChapter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsChapterParserRuleCall_3_0_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleChapter_in_ruleXdocFile264);
                            	    lv_sections_8_0=ruleChapter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_8_0, 
                            	    	        		"Chapter", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:6: ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:6: ( ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:7: ( (lv_sections_9_0= ruleSection ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:211:7: ( (lv_sections_9_0= ruleSection ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:212:1: (lv_sections_9_0= ruleSection )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:212:1: (lv_sections_9_0= ruleSection )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:213:3: lv_sections_9_0= ruleSection
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsSectionParserRuleCall_3_0_2_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSection_in_ruleXdocFile295);
                            lv_sections_9_0=ruleSection();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_9_0, 
                            	        		"Section", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:235:2: (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_MULTI_NL) ) {
                                    int LA5_1 = input.LA(2);

                                    if ( ((LA5_1>=19 && LA5_1<=21)) ) {
                                        alt5=1;
                                    }


                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:235:3: this_MULTI_NL_10= RULE_MULTI_NL ( (lv_sections_11_0= ruleSection ) )
                            	    {
                            	    this_MULTI_NL_10=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile307); 
                            	     
                            	        createLeafNode(this_MULTI_NL_10, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:239:1: ( (lv_sections_11_0= ruleSection ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:240:1: (lv_sections_11_0= ruleSection )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:240:1: (lv_sections_11_0= ruleSection )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:241:3: lv_sections_11_0= ruleSection
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsSectionParserRuleCall_3_0_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSection_in_ruleXdocFile327);
                            	    lv_sections_11_0=ruleSection();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_11_0, 
                            	    	        		"Section", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 4 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:264:6: ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:264:6: ( ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:264:7: ( (lv_sections_12_0= ruleSection2 ) ) (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:264:7: ( (lv_sections_12_0= ruleSection2 ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:265:1: (lv_sections_12_0= ruleSection2 )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:265:1: (lv_sections_12_0= ruleSection2 )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:266:3: lv_sections_12_0= ruleSection2
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsSection2ParserRuleCall_3_0_3_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSection2_in_ruleXdocFile358);
                            lv_sections_12_0=ruleSection2();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_12_0, 
                            	        		"Section2", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:288:2: (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_MULTI_NL) ) {
                                    int LA6_1 = input.LA(2);

                                    if ( ((LA6_1>=22 && LA6_1<=23)) ) {
                                        alt6=1;
                                    }


                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:288:3: this_MULTI_NL_13= RULE_MULTI_NL ( (lv_sections_14_0= ruleSection2 ) )
                            	    {
                            	    this_MULTI_NL_13=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile370); 
                            	     
                            	        createLeafNode(this_MULTI_NL_13, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_0_3_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:292:1: ( (lv_sections_14_0= ruleSection2 ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:293:1: (lv_sections_14_0= ruleSection2 )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:293:1: (lv_sections_14_0= ruleSection2 )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:294:3: lv_sections_14_0= ruleSection2
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getXdocFileAccess().getSectionsSection2ParserRuleCall_3_0_3_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSection2_in_ruleXdocFile390);
                            	    lv_sections_14_0=ruleSection2();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getXdocFileRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_14_0, 
                            	    	        		"Section2", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:316:6: (this_MULTI_NL_15= RULE_MULTI_NL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_MULTI_NL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:316:7: this_MULTI_NL_15= RULE_MULTI_NL
                            {
                            this_MULTI_NL_15=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile406); 
                             
                                createLeafNode(this_MULTI_NL_15, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXdocFile"


    // $ANTLR start "entryRuleDocument"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:328:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:329:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:330:2: iv_ruleDocument= ruleDocument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDocumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument445);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument455); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:337:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )? (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_MULTI_NL_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_MULTI_NL_11=null;
        Token this_MULTI_NL_13=null;
        Token otherlv_14=null;
        Token lv_defaultLang_16_0=null;
        Token otherlv_18=null;
        Token this_MULTI_NL_19=null;
        EObject lv_title_1_0 = null;

        EObject lv_subtitle_5_0 = null;

        EObject lv_authors_9_0 = null;

        EObject lv_langDefs_12_0 = null;

        EObject lv_chapters_20_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:342:6: ( (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )? (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:343:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )? (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:343:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )? (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:343:3: otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )? (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )*
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleDocument492); 

                	createLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDocumentKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:347:1: ( (lv_title_1_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:348:1: (lv_title_1_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:348:1: (lv_title_1_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:349:3: lv_title_1_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument513);
            lv_title_1_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_1_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleDocument525); 

                	createLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:1: (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_MULTI_NL) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==12) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:2: this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']'
                    {
                    this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument537); 
                     
                        createLeafNode(this_MULTI_NL_3, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0(), null); 
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDocument548); 

                        	createLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getSubtitleKeyword_3_1(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:383:1: ( (lv_subtitle_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:384:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:384:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:385:3: lv_subtitle_5_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubtitleTextOrMarkupParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument569);
                    lv_subtitle_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"subtitle",
                    	        		lv_subtitle_5_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleDocument581); 

                        	createLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_3_3(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:411:3: (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_MULTI_NL) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==13) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:411:4: this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']'
                    {
                    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument595); 
                     
                        createLeafNode(this_MULTI_NL_7, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_4_0(), null); 
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDocument606); 

                        	createLeafNode(otherlv_8, grammarAccess.getDocumentAccess().getAuthorsKeyword_4_1(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:419:1: ( (lv_authors_9_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:420:1: (lv_authors_9_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:420:1: (lv_authors_9_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:421:3: lv_authors_9_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getAuthorsTextOrMarkupParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument627);
                    lv_authors_9_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"authors",
                    	        		lv_authors_9_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleDocument639); 

                        	createLeafNode(otherlv_10, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_4_3(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:447:3: (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_MULTI_NL) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==46) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:447:4: this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) )
            	    {
            	    this_MULTI_NL_11=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument653); 
            	     
            	        createLeafNode(this_MULTI_NL_11, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:451:1: ( (lv_langDefs_12_0= ruleLangDef ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:452:1: (lv_langDefs_12_0= ruleLangDef )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:452:1: (lv_langDefs_12_0= ruleLangDef )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:453:3: lv_langDefs_12_0= ruleLangDef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getLangDefsLangDefParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLangDef_in_ruleDocument673);
            	    lv_langDefs_12_0=ruleLangDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"langDefs",
            	    	        		lv_langDefs_12_0, 
            	    	        		"LangDef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:475:4: (this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_MULTI_NL) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==14) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:475:5: this_MULTI_NL_13= RULE_MULTI_NL otherlv_14= 'defaultcodelanguage[' ( ruleANY_WS )* ( (lv_defaultLang_16_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_18= ']'
                    {
                    this_MULTI_NL_13=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument687); 
                     
                        createLeafNode(this_MULTI_NL_13, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
                        
                    otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleDocument698); 

                        	createLeafNode(otherlv_14, grammarAccess.getDocumentAccess().getDefaultcodelanguageKeyword_6_1(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:483:1: ( ruleANY_WS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_WS && LA13_0<=RULE_MULTI_NL)||LA13_0==RULE_SINGLE_NL) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:484:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getANY_WSParserRuleCall_6_2(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleDocument715);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:491:3: ( (lv_defaultLang_16_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:492:1: (lv_defaultLang_16_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:492:1: (lv_defaultLang_16_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:493:3: lv_defaultLang_16_0= RULE_ID
                    {
                    lv_defaultLang_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDocument733); 

                    			createLeafNode(lv_defaultLang_16_0, grammarAccess.getDocumentAccess().getDefaultLangIDTerminalRuleCall_6_3_0(), "defaultLang"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultLang",
                    	        		lv_defaultLang_16_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:515:2: ( ruleANY_WS )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_WS && LA14_0<=RULE_MULTI_NL)||LA14_0==RULE_SINGLE_NL) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getANY_WSParserRuleCall_6_4(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleDocument755);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,11,FOLLOW_11_in_ruleDocument768); 

                        	createLeafNode(otherlv_18, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_6_5(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:527:3: (this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTI_NL) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==15||(LA16_1>=17 && LA16_1<=18)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:527:4: this_MULTI_NL_19= RULE_MULTI_NL ( (lv_chapters_20_0= ruleChapter ) )
            	    {
            	    this_MULTI_NL_19=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument782); 
            	     
            	        createLeafNode(this_MULTI_NL_19, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_7_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:531:1: ( (lv_chapters_20_0= ruleChapter ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:532:1: (lv_chapters_20_0= ruleChapter )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:532:1: (lv_chapters_20_0= ruleChapter )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:533:3: lv_chapters_20_0= ruleChapter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument802);
            	    lv_chapters_20_0=ruleChapter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"chapters",
            	    	        		lv_chapters_20_0, 
            	    	        		"Chapter", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleChapter"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:563:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:564:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:565:2: iv_ruleChapter= ruleChapter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChapterRule(), currentNode); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter840);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:572:1: ruleChapter returns [EObject current=null] : (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_ChapterRef_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:577:6: ( (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:578:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:578:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            else if ( (LA20_0==15||LA20_0==17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:579:5: this_ChapterRef_0= ruleChapterRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getChapterAccess().getChapterRefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleChapterRef_in_ruleChapter897);
                    this_ChapterRef_0=ruleChapterRef();

                    state._fsp--;

                     
                            current = this_ChapterRef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==15) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==17) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:588:10: otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleChapter917); 

                                	createLeafNode(otherlv_1, grammarAccess.getChapterAccess().getChapterKeyword_1_0_0_0(), null);
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:592:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:593:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:593:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:594:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter934); 

                            			createLeafNode(lv_name_2_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0_0_1_0(), "name"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"name",
                            	        		lv_name_2_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleChapter951); 

                                	createLeafNode(otherlv_3, grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_1_0_0_2(), null);
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:621:7: otherlv_4= 'chapter['
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleChapter970); 

                                	createLeafNode(otherlv_4, grammarAccess.getChapterAccess().getChapterKeyword_1_0_1(), null);
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:625:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:626:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:626:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:627:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter992);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleChapter1004); 

                        	createLeafNode(otherlv_6, grammarAccess.getChapterAccess().getRightSquareBracketKeyword_1_2(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:653:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_MULTI_NL) ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1==RULE_WS||(LA18_1>=RULE_ID && LA18_1<=RULE_ANY_OTHER)||(LA18_1>=28 && LA18_1<=31)||(LA18_1>=34 && LA18_1<=38)||(LA18_1>=40 && LA18_1<=45)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:653:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter1016); 
                    	     
                    	        createLeafNode(this_MULTI_NL_7, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_3_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:657:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:658:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:658:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:659:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter1036);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_8_0, 
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:681:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_MULTI_NL) ) {
                            int LA19_1 = input.LA(2);

                            if ( ((LA19_1>=19 && LA19_1<=21)) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:681:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter1050); 
                    	     
                    	        createLeafNode(this_MULTI_NL_9, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_4_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:685:1: ( (lv_subSections_10_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:1: (lv_subSections_10_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:686:1: (lv_subSections_10_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:687:3: lv_subSections_10_0= ruleSection
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getSubSectionsSectionParserRuleCall_1_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleChapter1070);
                    	    lv_subSections_10_0=ruleSection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subSections",
                    	    	        		lv_subSections_10_0, 
                    	    	        		"Section", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleChapterRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:717:1: entryRuleChapterRef returns [EObject current=null] : iv_ruleChapterRef= ruleChapterRef EOF ;
    public final EObject entryRuleChapterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:718:2: (iv_ruleChapterRef= ruleChapterRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:719:2: iv_ruleChapterRef= ruleChapterRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChapterRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleChapterRef_in_entryRuleChapterRef1109);
            iv_ruleChapterRef=ruleChapterRef();

            state._fsp--;

             current =iv_ruleChapterRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterRef1119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChapterRef"


    // $ANTLR start "ruleChapterRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:726:1: ruleChapterRef returns [EObject current=null] : (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleChapterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:731:6: ( (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:732:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:732:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:732:3: otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleChapterRef1156); 

                	createLeafNode(otherlv_0, grammarAccess.getChapterRefAccess().getChapterRefKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:736:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:737:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:737:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:738:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getChapterRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapterRef1176); 

            		createLeafNode(otherlv_1, grammarAccess.getChapterRefAccess().getChapterChapterCrossReference_1_0(), "chapter"); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleChapterRef1188); 

                	createLeafNode(otherlv_2, grammarAccess.getChapterRefAccess().getRightSquareBracketKeyword_2(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChapterRef"


    // $ANTLR start "entryRuleSection"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:762:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:763:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:764:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection1224);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:771:1: ruleSection returns [EObject current=null] : (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_SectionRef_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:776:6: ( (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:777:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:777:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=19 && LA24_0<=20)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:5: this_SectionRef_0= ruleSectionRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSectionAccess().getSectionRefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSectionRef_in_ruleSection1281);
                    this_SectionRef_0=ruleSectionRef();

                    state._fsp--;

                     
                            current = this_SectionRef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==19) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==20) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:787:10: otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSection1301); 

                                	createLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1_0_0_0(), null);
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:791:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:792:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:792:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:793:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection1318); 

                            			createLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0_0_1_0(), "name"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"name",
                            	        		lv_name_2_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSection1335); 

                                	createLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_1_0_0_2(), null);
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:820:7: otherlv_4= 'section['
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSection1354); 

                                	createLeafNode(otherlv_4, grammarAccess.getSectionAccess().getSectionKeyword_1_0_1(), null);
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:824:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:825:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:825:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:826:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection1376);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"title",
                    	        		lv_title_5_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleSection1388); 

                        	createLeafNode(otherlv_6, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_1_2(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:852:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_MULTI_NL) ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1==RULE_WS||(LA22_1>=RULE_ID && LA22_1<=RULE_ANY_OTHER)||(LA22_1>=28 && LA22_1<=31)||(LA22_1>=34 && LA22_1<=38)||(LA22_1>=40 && LA22_1<=45)) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:852:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1400); 
                    	     
                    	        createLeafNode(this_MULTI_NL_7, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_3_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:856:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:857:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:857:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:858:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection1420);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_8_0, 
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:880:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_MULTI_NL) ) {
                            int LA23_1 = input.LA(2);

                            if ( ((LA23_1>=22 && LA23_1<=23)) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:880:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection1434); 
                    	     
                    	        createLeafNode(this_MULTI_NL_9, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_4_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:884:1: ( (lv_subSections_10_0= ruleSection2 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:885:1: (lv_subSections_10_0= ruleSection2 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:885:1: (lv_subSections_10_0= ruleSection2 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:886:3: lv_subSections_10_0= ruleSection2
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getSubSectionsSection2ParserRuleCall_1_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection2_in_ruleSection1454);
                    	    lv_subSections_10_0=ruleSection2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subSections",
                    	    	        		lv_subSections_10_0, 
                    	    	        		"Section2", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:916:1: entryRuleSectionRef returns [EObject current=null] : iv_ruleSectionRef= ruleSectionRef EOF ;
    public final EObject entryRuleSectionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:917:2: (iv_ruleSectionRef= ruleSectionRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:918:2: iv_ruleSectionRef= ruleSectionRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleSectionRef_in_entryRuleSectionRef1493);
            iv_ruleSectionRef=ruleSectionRef();

            state._fsp--;

             current =iv_ruleSectionRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionRef1503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionRef"


    // $ANTLR start "ruleSectionRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:925:1: ruleSectionRef returns [EObject current=null] : (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSectionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:930:6: ( (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:931:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:931:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:931:3: otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSectionRef1540); 

                	createLeafNode(otherlv_0, grammarAccess.getSectionRefAccess().getSectionRefKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:935:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:936:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:936:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:937:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSectionRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSectionRef1560); 

            		createLeafNode(otherlv_1, grammarAccess.getSectionRefAccess().getSectionSectionCrossReference_1_0(), "section"); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSectionRef1572); 

                	createLeafNode(otherlv_2, grammarAccess.getSectionRefAccess().getRightSquareBracketKeyword_2(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionRef"


    // $ANTLR start "entryRuleSection2"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:961:1: entryRuleSection2 returns [EObject current=null] : iv_ruleSection2= ruleSection2 EOF ;
    public final EObject entryRuleSection2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:962:2: (iv_ruleSection2= ruleSection2 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:963:2: iv_ruleSection2= ruleSection2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection2Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection2_in_entryRuleSection21608);
            iv_ruleSection2=ruleSection2();

            state._fsp--;

             current =iv_ruleSection2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection21618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection2"


    // $ANTLR start "ruleSection2"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:970:1: ruleSection2 returns [EObject current=null] : ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSection2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        Token this_MULTI_NL_8=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_subSections_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:975:6: ( ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:1: ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:1: ( ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:2: ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:2: ( (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section2[' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( (LA25_0==23) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:3: (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:3: (otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:976:5: otherlv_0= 'section2:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSection21657); 

                        	createLeafNode(otherlv_0, grammarAccess.getSection2Access().getSection2Keyword_0_0_0(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:980:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:981:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:981:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:982:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection21674); 

                    			createLeafNode(lv_name_1_0, grammarAccess.getSection2Access().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection2Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSection21691); 

                        	createLeafNode(otherlv_2, grammarAccess.getSection2Access().getLeftSquareBracketKeyword_0_0_2(), null);
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1009:7: otherlv_3= 'section2['
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSection21710); 

                        	createLeafNode(otherlv_3, grammarAccess.getSection2Access().getSection2Keyword_0_1(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1013:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1014:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1014:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1015:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21732);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSection2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection21744); 

                	createLeafNode(otherlv_5, grammarAccess.getSection2Access().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1041:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_WS||(LA26_1>=RULE_ID && LA26_1<=RULE_ANY_OTHER)||(LA26_1>=28 && LA26_1<=31)||(LA26_1>=34 && LA26_1<=38)||(LA26_1>=40 && LA26_1<=45)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1041:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21756); 
            	     
            	        createLeafNode(this_MULTI_NL_6, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1045:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1046:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1046:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1047:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection21776);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection2Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1069:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_MULTI_NL) ) {
                    int LA27_1 = input.LA(2);

                    if ( ((LA27_1>=24 && LA27_1<=25)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1069:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection3 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection21790); 
            	     
            	        createLeafNode(this_MULTI_NL_8, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1073:1: ( (lv_subSections_9_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1074:1: (lv_subSections_9_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1074:1: (lv_subSections_9_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1075:3: lv_subSections_9_0= ruleSection3
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSection21810);
            	    lv_subSections_9_0=ruleSection3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection2Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"subSections",
            	    	        		lv_subSections_9_0, 
            	    	        		"Section3", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection2"


    // $ANTLR start "entryRuleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1105:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1106:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1107:2: iv_ruleSection3= ruleSection3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection3Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31848);
            iv_ruleSection3=ruleSection3();

            state._fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection3"


    // $ANTLR start "ruleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1114:1: ruleSection3 returns [EObject current=null] : ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        Token this_MULTI_NL_8=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_subSections_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1119:6: ( ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            else if ( (LA28_0==25) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1120:5: otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSection31897); 

                        	createLeafNode(otherlv_0, grammarAccess.getSection3Access().getSection3Keyword_0_0_0(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1124:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1125:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1125:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1126:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31914); 

                    			createLeafNode(lv_name_1_0, grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSection31931); 

                        	createLeafNode(otherlv_2, grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2(), null);
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1153:7: otherlv_3= 'section3['
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleSection31950); 

                        	createLeafNode(otherlv_3, grammarAccess.getSection3Access().getSection3Keyword_0_1(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1157:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1158:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1158:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1159:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31972);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection31984); 

                	createLeafNode(otherlv_5, grammarAccess.getSection3Access().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1185:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MULTI_NL) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_WS||(LA29_1>=RULE_ID && LA29_1<=RULE_ANY_OTHER)||(LA29_1>=28 && LA29_1<=31)||(LA29_1>=34 && LA29_1<=38)||(LA29_1>=40 && LA29_1<=45)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1185:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31996); 
            	     
            	        createLeafNode(this_MULTI_NL_6, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1189:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1190:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1190:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1191:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection32016);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1213:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=26 && LA30_1<=27)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1213:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection32030); 
            	     
            	        createLeafNode(this_MULTI_NL_8, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1217:1: ( (lv_subSections_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1218:1: (lv_subSections_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1218:1: (lv_subSections_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1219:3: lv_subSections_9_0= ruleSection4
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection32050);
            	    lv_subSections_9_0=ruleSection4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"subSections",
            	    	        		lv_subSections_9_0, 
            	    	        		"Section4", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection3"


    // $ANTLR start "entryRuleSection4"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1249:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1250:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1251:2: iv_ruleSection4= ruleSection4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection4Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection42088);
            iv_ruleSection4=ruleSection4();

            state._fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection42098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection4"


    // $ANTLR start "ruleSection4"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1258:1: ruleSection4 returns [EObject current=null] : ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_MULTI_NL_6=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1263:6: ( ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            else if ( (LA31_0==27) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1264:5: otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSection42137); 

                        	createLeafNode(otherlv_0, grammarAccess.getSection4Access().getSection4Keyword_0_0_0(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1268:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1269:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1269:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1270:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection42154); 

                    			createLeafNode(lv_name_1_0, grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSection42171); 

                        	createLeafNode(otherlv_2, grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2(), null);
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1297:7: otherlv_3= 'section4['
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSection42190); 

                        	createLeafNode(otherlv_3, grammarAccess.getSection4Access().getSection4Keyword_0_1(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1301:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1302:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1302:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1303:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection42212);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"title",
            	        		lv_title_4_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection42224); 

                	createLeafNode(otherlv_5, grammarAccess.getSection4Access().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1329:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MULTI_NL) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_WS||(LA32_1>=RULE_ID && LA32_1<=RULE_ANY_OTHER)||(LA32_1>=28 && LA32_1<=31)||(LA32_1>=34 && LA32_1<=38)||(LA32_1>=40 && LA32_1<=45)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1329:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection42236); 
            	     
            	        createLeafNode(this_MULTI_NL_6, grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1333:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1334:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1334:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1335:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection42256);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_7_0, 
            	    	        		"TextOrMarkup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection4"


    // $ANTLR start "entryRuleTextOrMarkup"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1365:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1366:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1367:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2294);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();

            state._fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup2304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextOrMarkup"


    // $ANTLR start "ruleTextOrMarkup"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1374:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1379:6: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS||(LA37_0>=RULE_ID && LA37_0<=RULE_ANY_OTHER)||(LA37_0>=28 && LA37_0<=30)) ) {
                alt37=1;
            }
            else if ( (LA37_0==31||(LA37_0>=34 && LA37_0<=38)||(LA37_0>=40 && LA37_0<=45)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1380:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1381:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1381:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1382:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2351);
                    lv_contents_0_0=ruleTextPart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_0_0, 
                    	        		"TextPart", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1404:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==31||(LA34_0>=34 && LA34_0<=38)||(LA34_0>=40 && LA34_0<=45)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1404:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1404:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1405:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1405:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1406:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2373);
                    	    lv_contents_1_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_1_0, 
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1428:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==RULE_WS||(LA33_0>=RULE_ID && LA33_0<=RULE_ANY_OTHER)||(LA33_0>=28 && LA33_0<=30)) ) {
                    	        alt33=1;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1429:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1429:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1430:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2394);
                    	            lv_contents_2_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_2_0, 
                    	            	        		"TextPart", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1453:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1453:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==31||(LA36_0>=34 && LA36_0<=38)||(LA36_0>=40 && LA36_0<=45)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1453:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1453:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1454:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1454:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1455:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2426);
                    	    lv_contents_3_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_3_0, 
                    	    	        		"MarkUp", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1477:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==RULE_WS||(LA35_0>=RULE_ID && LA35_0<=RULE_ANY_OTHER)||(LA35_0>=28 && LA35_0<=30)) ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1478:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1478:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1479:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup2447);
                    	            lv_contents_4_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getTextOrMarkupRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_4_0, 
                    	            	        		"TextPart", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextOrMarkup"


    // $ANTLR start "entryRuleTextPart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1509:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1511:2: iv_ruleTextPart= ruleTextPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart2486);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart2496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextPart"


    // $ANTLR start "ruleTextPart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1518:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1523:6: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1524:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1524:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1525:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1525:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1526:3: lv_text_0_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart2541);
            lv_text_0_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_0_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextPart"


    // $ANTLR start "entryRuleText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1556:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1557:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1558:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2577);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1565:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1570:6: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1571:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1571:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt38=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt38=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt38=4;
                    }
                    break;
                case 28:
                    {
                    alt38=5;
                    }
                    break;
                case 29:
                    {
                    alt38=6;
                    }
                    break;
                case 30:
                    {
                    alt38=7;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1571:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText2628); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1579:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText2654); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1587:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText2680); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        createLeafNode(this_SINGLE_NL_2, grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1595:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2706); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(this_ANY_OTHER_3, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1604:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleText2730); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1611:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleText2749); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1618:2: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleText2768); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getTextAccess().getCommaKeyword_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleMarkUp"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1631:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1632:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1633:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkUpRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp2809);
            iv_ruleMarkUp=ruleMarkUp();

            state._fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp2819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkUp"


    // $ANTLR start "ruleMarkUp"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1640:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) ;
    public final EObject ruleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_OrderedList_3 = null;

        EObject this_UnorderedList_4 = null;

        EObject this_CodeBlock_5 = null;

        EObject this_CodeRef_6 = null;

        EObject this_Link_7 = null;

        EObject this_ImageRef_8 = null;

        EObject this_Table_9 = null;

        EObject this_Todo_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1645:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1646:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1646:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            int alt39=11;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt39=1;
                }
                break;
            case 35:
                {
                alt39=2;
                }
                break;
            case 36:
                {
                alt39=3;
                }
                break;
            case 37:
                {
                alt39=4;
                }
                break;
            case 38:
                {
                alt39=5;
                }
                break;
            case 44:
                {
                alt39=6;
                }
                break;
            case 40:
                {
                alt39=7;
                }
                break;
            case 41:
                {
                alt39=8;
                }
                break;
            case 42:
            case 43:
                {
                alt39=9;
                }
                break;
            case 31:
                {
                alt39=10;
                }
                break;
            case 45:
                {
                alt39=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1647:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2866);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1657:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2893);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1667:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2920);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1677:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2947);
                    this_OrderedList_3=ruleOrderedList();

                    state._fsp--;

                     
                            current = this_OrderedList_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1687:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2974);
                    this_UnorderedList_4=ruleUnorderedList();

                    state._fsp--;

                     
                            current = this_UnorderedList_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1697:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp3001);
                    this_CodeBlock_5=ruleCodeBlock();

                    state._fsp--;

                     
                            current = this_CodeBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1707:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp3028);
                    this_CodeRef_6=ruleCodeRef();

                    state._fsp--;

                     
                            current = this_CodeRef_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1717:5: this_Link_7= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp3055);
                    this_Link_7=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1727:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp3082);
                    this_ImageRef_8=ruleImageRef();

                    state._fsp--;

                     
                            current = this_ImageRef_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1737:5: this_Table_9= ruleTable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getTableParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTable_in_ruleMarkUp3109);
                    this_Table_9=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1747:5: this_Todo_10= ruleTodo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getTodoParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkUp3136);
                    this_Todo_10=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkUp"


    // $ANTLR start "entryRuleTable"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1763:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1764:2: (iv_ruleTable= ruleTable EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1765:2: iv_ruleTable= ruleTable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableRule(), currentNode); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable3171);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable3181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1772:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_rows_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1777:6: ( ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1778:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1778:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1778:2: () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1778:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1779:5: 
            {
             
                    temp=factory.create(grammarAccess.getTableAccess().getTableAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTableAccess().getTableAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTable3227); 

                	createLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1793:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1793:2: ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1793:2: ( ruleANY_WS )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( ((LA40_0>=RULE_WS && LA40_0<=RULE_MULTI_NL)||LA40_0==RULE_SINGLE_NL) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1794:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3245);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1801:3: ( (lv_rows_3_0= ruleTableRow ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1802:1: (lv_rows_3_0= ruleTableRow )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1802:1: (lv_rows_3_0= ruleTableRow )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1803:3: lv_rows_3_0= ruleTableRow
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable3267);
            	    lv_rows_3_0=ruleTableRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rows",
            	    	        		lv_rows_3_0, 
            	    	        		"TableRow", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1825:4: ( ruleANY_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_WS && LA42_0<=RULE_MULTI_NL)||LA42_0==RULE_SINGLE_NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1826:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable3286);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTable3299); 

                	createLeafNode(otherlv_5, grammarAccess.getTableAccess().getRightSquareBracketKeyword_4(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1845:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1846:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1847:2: iv_ruleTableRow= ruleTableRow EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableRowRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow3335);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow3345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1854:1: ruleTableRow returns [EObject current=null] : ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_data_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1859:6: ( ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1860:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1860:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1860:2: () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1860:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1861:5: 
            {
             
                    temp=factory.create(grammarAccess.getTableRowAccess().getTableRowAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTableRowAccess().getTableRowAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTableRow3391); 

                	createLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getTrKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1875:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1875:2: ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1875:2: ( ruleANY_WS )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( ((LA43_0>=RULE_WS && LA43_0<=RULE_MULTI_NL)||LA43_0==RULE_SINGLE_NL) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1876:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3409);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1883:3: ( (lv_data_3_0= ruleTableData ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1884:1: (lv_data_3_0= ruleTableData )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1884:1: (lv_data_3_0= ruleTableData )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1885:3: lv_data_3_0= ruleTableData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTableRowAccess().getDataTableDataParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableData_in_ruleTableRow3431);
            	    lv_data_3_0=ruleTableData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTableRowRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"data",
            	    	        		lv_data_3_0, 
            	    	        		"TableData", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1907:4: ( ruleANY_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_WS && LA45_0<=RULE_MULTI_NL)||LA45_0==RULE_SINGLE_NL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1908:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow3450);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTableRow3463); 

                	createLeafNode(otherlv_5, grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_4(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableData"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1927:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1928:2: (iv_ruleTableData= ruleTableData EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1929:2: iv_ruleTableData= ruleTableData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTableDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData3499);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData3509); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableData"


    // $ANTLR start "ruleTableData"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1936:1: ruleTableData returns [EObject current=null] : ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleTableData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1941:6: ( ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1942:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1942:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1942:2: () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1942:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1943:5: 
            {
             
                    temp=factory.create(grammarAccess.getTableDataAccess().getTableDataAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTableDataAccess().getTableDataAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleTableData3555); 

                	createLeafNode(otherlv_1, grammarAccess.getTableDataAccess().getTdKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1957:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_WS && LA48_0<=RULE_ANY_OTHER)||(LA48_0>=28 && LA48_0<=31)||(LA48_0>=34 && LA48_0<=38)||(LA48_0>=40 && LA48_0<=45)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1957:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1957:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_MULTI_NL) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1957:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3568); 
                             
                                createLeafNode(this_MULTI_NL_2, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1961:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1962:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1962:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1963:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3590);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTableDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_3_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1985:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_MULTI_NL) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1985:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData3602); 
                    	     
                    	        createLeafNode(this_MULTI_NL_4, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1989:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1990:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1990:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1991:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData3622);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTableDataRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_5_0, 
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleTableData3638); 

                	createLeafNode(otherlv_6, grammarAccess.getTableDataAccess().getRightSquareBracketKeyword_3(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableData"


    // $ANTLR start "entryRuleEmphasize"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2025:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2026:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2027:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmphasizeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize3674);
            iv_ruleEmphasize=ruleEmphasize();

            state._fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize3684); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmphasize"


    // $ANTLR start "ruleEmphasize"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2034:1: ruleEmphasize returns [EObject current=null] : ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_5=null;
        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2039:6: ( ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2040:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2040:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2040:2: () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2040:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2041:5: 
            {
             
                    temp=factory.create(grammarAccess.getEmphasizeAccess().getEmphasizeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEmphasizeAccess().getEmphasizeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEmphasize3730); 

                	createLeafNode(otherlv_1, grammarAccess.getEmphasizeAccess().getEKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2055:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_ANY_OTHER)||(LA51_0>=28 && LA51_0<=31)||(LA51_0>=34 && LA51_0<=38)||(LA51_0>=40 && LA51_0<=45)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2055:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2055:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_MULTI_NL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2055:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3743); 
                             
                                createLeafNode(this_MULTI_NL_2, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2059:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2060:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2060:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2061:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3765);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmphasizeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_3_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2083:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_MULTI_NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2083:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3777); 
                             
                                createLeafNode(this_MULTI_NL_4, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_2(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleEmphasize3792); 

                	createLeafNode(otherlv_5, grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_3(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmphasize"


    // $ANTLR start "entryRuleAnchor"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2099:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2100:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2101:2: iv_ruleAnchor= ruleAnchor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnchorRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor3828);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor3838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2108:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2113:6: ( (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2114:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2114:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2114:3: otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAnchor3875); 

                	createLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2118:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2119:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2119:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2120:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor3892); 

            			createLeafNode(lv_name_1_0, grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnchorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleAnchor3909); 

                	createLeafNode(otherlv_2, grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2154:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2155:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2156:2: iv_ruleRef= ruleRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef3945);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef3955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2163:1: ruleRef returns [EObject current=null] : (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_MULTI_NL_3=null;
        Token this_MULTI_NL_5=null;
        Token otherlv_6=null;
        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2168:6: ( (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2169:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2169:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2169:3: otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRef3992); 

                	createLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2173:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2174:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2174:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2175:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef4012); 

            		createLeafNode(otherlv_1, grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0(), "ref"); 
            	

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2187:2: (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==16) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2187:4: otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRef4025); 

                        	createLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2_0(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2191:1: (this_MULTI_NL_3= RULE_MULTI_NL )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_MULTI_NL) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2191:2: this_MULTI_NL_3= RULE_MULTI_NL
                            {
                            this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef4037); 
                             
                                createLeafNode(this_MULTI_NL_3, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_1(), null); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2195:3: ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_WS||(LA54_0>=RULE_ID && LA54_0<=RULE_ANY_OTHER)||(LA54_0>=28 && LA54_0<=31)||(LA54_0>=34 && LA54_0<=38)||(LA54_0>=40 && LA54_0<=45)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2195:4: ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )?
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2195:4: ( (lv_contents_4_0= ruleTextOrMarkup ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2196:1: (lv_contents_4_0= ruleTextOrMarkup )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2196:1: (lv_contents_4_0= ruleTextOrMarkup )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2197:3: lv_contents_4_0= ruleTextOrMarkup
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_2_2_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef4060);
                            lv_contents_4_0=ruleTextOrMarkup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"contents",
                            	        		lv_contents_4_0, 
                            	        		"TextOrMarkup", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2219:2: (this_MULTI_NL_5= RULE_MULTI_NL )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_MULTI_NL) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2219:3: this_MULTI_NL_5= RULE_MULTI_NL
                                    {
                                    this_MULTI_NL_5=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef4072); 
                                     
                                        createLeafNode(this_MULTI_NL_5, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_2_1(), null); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleRef4087); 

                        	createLeafNode(otherlv_6, grammarAccess.getRefAccess().getRightSquareBracketKeyword_2_3(), null);
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleOrderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2235:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2236:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2237:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList4125);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList4135); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderedList"


    // $ANTLR start "ruleOrderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2244:1: ruleOrderedList returns [EObject current=null] : ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2249:6: ( ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2250:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2250:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2250:2: () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2250:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2251:5: 
            {
             
                    temp=factory.create(grammarAccess.getOrderedListAccess().getOrderedListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOrderedListAccess().getOrderedListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleOrderedList4181); 

                	createLeafNode(otherlv_1, grammarAccess.getOrderedListAccess().getOlKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2265:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2265:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2265:2: ( ruleANY_WS )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( ((LA56_0>=RULE_WS && LA56_0<=RULE_MULTI_NL)||LA56_0==RULE_SINGLE_NL) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2266:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList4199);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop56;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2273:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2274:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2274:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2275:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList4221);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_3_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2297:4: ( ruleANY_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_MULTI_NL)||LA58_0==RULE_SINGLE_NL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2298:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList4240);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleOrderedList4253); 

                	createLeafNode(otherlv_5, grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_4(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderedList"


    // $ANTLR start "entryRuleUnorderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2317:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2318:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2319:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnorderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4289);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList4299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnorderedList"


    // $ANTLR start "ruleUnorderedList"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2326:1: ruleUnorderedList returns [EObject current=null] : ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2331:6: ( ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2332:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2332:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2332:2: () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2332:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2333:5: 
            {
             
                    temp=factory.create(grammarAccess.getUnorderedListAccess().getUnorderedListAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUnorderedListAccess().getUnorderedListAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUnorderedList4345); 

                	createLeafNode(otherlv_1, grammarAccess.getUnorderedListAccess().getUlKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2347:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2347:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2347:2: ( ruleANY_WS )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( ((LA59_0>=RULE_WS && LA59_0<=RULE_MULTI_NL)||LA59_0==RULE_SINGLE_NL) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2348:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4363);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2355:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2356:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2356:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2357:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList4385);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUnorderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_3_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2379:4: ( ruleANY_WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_WS && LA61_0<=RULE_MULTI_NL)||LA61_0==RULE_SINGLE_NL) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2380:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList4404);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleUnorderedList4417); 

                	createLeafNode(otherlv_5, grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_4(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedList"


    // $ANTLR start "entryRuleItem"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2399:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2400:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2401:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem4453);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem4463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2408:1: ruleItem returns [EObject current=null] : ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2413:6: ( ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2414:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2414:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2414:2: () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2414:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2415:5: 
            {
             
                    temp=factory.create(grammarAccess.getItemAccess().getItemAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getItemAccess().getItemAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleItem4509); 

                	createLeafNode(otherlv_1, grammarAccess.getItemAccess().getItemKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_WS && LA64_0<=RULE_ANY_OTHER)||(LA64_0>=28 && LA64_0<=31)||(LA64_0>=34 && LA64_0<=38)||(LA64_0>=40 && LA64_0<=45)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_MULTI_NL) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4522); 
                             
                                createLeafNode(this_MULTI_NL_2, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2433:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2434:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2434:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2435:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4544);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_3_0, 
                    	        		"TextOrMarkup", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2457:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_MULTI_NL) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2457:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem4556); 
                    	     
                    	        createLeafNode(this_MULTI_NL_4, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_2_0(), null); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2461:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2462:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2462:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2463:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem4576);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_5_0, 
                    	    	        		"TextOrMarkup", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleItem4592); 

                	createLeafNode(otherlv_6, grammarAccess.getItemAccess().getRightSquareBracketKeyword_3(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleCodeRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2497:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2499:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef4628);
            iv_ruleCodeRef=ruleCodeRef();

            state._fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef4638); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeRef"


    // $ANTLR start "ruleCodeRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2506:1: ruleCodeRef returns [EObject current=null] : ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2511:6: ( ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2512:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2512:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2512:2: () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2512:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2513:5: 
            {
             
                    temp=factory.create(grammarAccess.getCodeRefAccess().getCodeRefAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCodeRefAccess().getCodeRefAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCodeRef4684); 

                	createLeafNode(otherlv_1, grammarAccess.getCodeRefAccess().getCodeRefKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2527:1: ( ( ruleText ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_WS||(LA65_0>=RULE_ID && LA65_0<=RULE_ANY_OTHER)||(LA65_0>=28 && LA65_0<=30)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2528:1: ( ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2528:1: ( ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2529:3: ruleText
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmDeclaredTypeCrossReference_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleCodeRef4707);
                    ruleText();

                    state._fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleCodeRef4720); 

                	createLeafNode(otherlv_3, grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeRef"


    // $ANTLR start "entryRuleLink"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2555:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2556:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2557:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4756);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2564:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_text_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2569:6: ( ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2570:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2570:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2570:2: () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2570:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2571:5: 
            {
             
                    temp=factory.create(grammarAccess.getLinkAccess().getLinkAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLinkAccess().getLinkAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLink4812); 

                	createLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2585:1: ( (lv_url_2_0= ruleText ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_WS||(LA66_0>=RULE_ID && LA66_0<=RULE_ANY_OTHER)||(LA66_0>=28 && LA66_0<=30)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2586:1: (lv_url_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2586:1: (lv_url_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2587:3: lv_url_2_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4833);
                    lv_url_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"url",
                    	        		lv_url_2_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleLink4846); 

                	createLeafNode(otherlv_3, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2613:1: ( ruleANY_WS )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_WS && LA67_0<=RULE_MULTI_NL)||LA67_0==RULE_SINGLE_NL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2614:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_4(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink4863);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleLink4876); 

                	createLeafNode(otherlv_5, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_5(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2625:1: ( (lv_text_6_0= ruleText ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_WS||(LA68_0>=RULE_ID && LA68_0<=RULE_ANY_OTHER)||(LA68_0>=28 && LA68_0<=30)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2626:1: (lv_text_6_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2626:1: (lv_text_6_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2627:3: lv_text_6_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink4897);
                    lv_text_6_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"text",
                    	        		lv_text_6_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleLink4910); 

                	createLeafNode(otherlv_7, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_7(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleImageRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2661:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2662:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2663:2: iv_ruleImageRef= ruleImageRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef4946);
            iv_ruleImageRef=ruleImageRef();

            state._fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef4956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageRef"


    // $ANTLR start "ruleImageRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2670:1: ruleImageRef returns [EObject current=null] : ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_clazz_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_style_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_caption_18_0= ruleText ) )? otherlv_19= ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_path_6_0 = null;

        AntlrDatatypeRuleToken lv_clazz_10_0 = null;

        AntlrDatatypeRuleToken lv_style_14_0 = null;

        AntlrDatatypeRuleToken lv_caption_18_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2675:6: ( ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_clazz_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_style_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_caption_18_0= ruleText ) )? otherlv_19= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_clazz_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_style_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_caption_18_0= ruleText ) )? otherlv_19= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_clazz_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_style_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_caption_18_0= ruleText ) )? otherlv_19= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_clazz_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_style_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_caption_18_0= ruleText ) )? otherlv_19= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            else if ( (LA71_0==43) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:5: otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '['
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleImageRef4995); 

                        	createLeafNode(otherlv_0, grammarAccess.getImageRefAccess().getImgKeyword_0_0_0(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2680:1: ( ruleANY_WS )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=RULE_WS && LA69_0<=RULE_MULTI_NL)||LA69_0==RULE_SINGLE_NL) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2681:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5012);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2688:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2689:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2689:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2690:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef5030); 

                    			createLeafNode(lv_name_2_0, grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2712:2: ( ruleANY_WS )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=RULE_WS && LA70_0<=RULE_MULTI_NL)||LA70_0==RULE_SINGLE_NL) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2713:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5052);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleImageRef5065); 

                        	createLeafNode(otherlv_4, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4(), null);
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2725:7: otherlv_5= 'img['
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleImageRef5084); 

                        	createLeafNode(otherlv_5, grammarAccess.getImageRefAccess().getImgKeyword_0_1(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2729:2: ( (lv_path_6_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:1: (lv_path_6_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:1: (lv_path_6_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2731:3: lv_path_6_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef5106);
            lv_path_6_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_6_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5118); 

                	createLeafNode(otherlv_7, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2757:1: ( ruleANY_WS )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_WS && LA72_0<=RULE_MULTI_NL)||LA72_0==RULE_SINGLE_NL) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2758:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5135);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleImageRef5148); 

                	createLeafNode(otherlv_9, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2769:1: ( (lv_clazz_10_0= ruleText ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_WS||(LA73_0>=RULE_ID && LA73_0<=RULE_ANY_OTHER)||(LA73_0>=28 && LA73_0<=30)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2770:1: (lv_clazz_10_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2770:1: (lv_clazz_10_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2771:3: lv_clazz_10_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5169);
                    lv_clazz_10_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"clazz",
                    	        		lv_clazz_10_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5182); 

                	createLeafNode(otherlv_11, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2797:1: ( ruleANY_WS )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_WS && LA74_0<=RULE_MULTI_NL)||LA74_0==RULE_SINGLE_NL) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2798:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5199);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleImageRef5212); 

                	createLeafNode(otherlv_13, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2809:1: ( (lv_style_14_0= ruleText ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_WS||(LA75_0>=RULE_ID && LA75_0<=RULE_ANY_OTHER)||(LA75_0>=28 && LA75_0<=30)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2810:1: (lv_style_14_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2810:1: (lv_style_14_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2811:3: lv_style_14_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5233);
                    lv_style_14_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"style",
                    	        		lv_style_14_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5246); 

                	createLeafNode(otherlv_15, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2837:1: ( ruleANY_WS )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=RULE_WS && LA76_0<=RULE_MULTI_NL)||LA76_0==RULE_SINGLE_NL) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2838:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef5263);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleImageRef5276); 

                	createLeafNode(otherlv_17, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2849:1: ( (lv_caption_18_0= ruleText ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_WS||(LA77_0>=RULE_ID && LA77_0<=RULE_ANY_OTHER)||(LA77_0>=28 && LA77_0<=30)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2850:1: (lv_caption_18_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2850:1: (lv_caption_18_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2851:3: lv_caption_18_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef5297);
                    lv_caption_18_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"caption",
                    	        		lv_caption_18_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,11,FOLLOW_11_in_ruleImageRef5310); 

                	createLeafNode(otherlv_19, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageRef"


    // $ANTLR start "entryRuleCodeBlock"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2885:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2886:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2887:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5346);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock5356); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2894:1: ruleCodeBlock returns [EObject current=null] : ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_language_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;

        EObject lv_contents_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2899:6: ( ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2900:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2900:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2900:2: () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2900:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2901:5: 
            {
             
                    temp=factory.create(grammarAccess.getCodeBlockAccess().getCodeBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCodeBlock5402); 

                	createLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getCodeKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2915:1: ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2915:2: ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '['
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2915:2: ( ruleANY_WS )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=RULE_WS && LA78_0<=RULE_MULTI_NL)||LA78_0==RULE_SINGLE_NL) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2916:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_0(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5420);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2923:3: ( (lv_language_3_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2924:1: (lv_language_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2924:1: (lv_language_3_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2925:3: lv_language_3_0= RULE_ID
                    {
                    lv_language_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock5438); 

                    			createLeafNode(lv_language_3_0, grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_2_1_0(), "language"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"language",
                    	        		lv_language_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2947:2: ( ruleANY_WS )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=RULE_WS && LA79_0<=RULE_MULTI_NL)||LA79_0==RULE_SINGLE_NL) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2948:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_2(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5460);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5473); 

                        	createLeafNode(otherlv_5, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_3(), null);
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2959:1: ( ruleANY_WS )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=RULE_WS && LA80_0<=RULE_MULTI_NL)||LA80_0==RULE_SINGLE_NL) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2960:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_4(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock5490);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCodeBlock5503); 

                        	createLeafNode(otherlv_7, grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_5(), null);
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:3: ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_WS && LA86_0<=RULE_ANY_OTHER)||(LA86_0>=28 && LA86_0<=30)) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=34 && LA86_0<=36)||LA86_0==45) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:5: ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2971:5: ( (lv_contents_8_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2972:1: (lv_contents_8_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2972:1: (lv_contents_8_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2973:3: lv_contents_8_0= ruleCode
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5528);
                    lv_contents_8_0=ruleCode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_8_0, 
                    	        		"Code", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:2: ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=34 && LA83_0<=36)||LA83_0==45) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:3: ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:3: ( (lv_contents_9_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2996:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2996:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2997:3: lv_contents_9_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5550);
                    	    lv_contents_9_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_9_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3019:2: ( (lv_contents_10_0= ruleCode ) )?
                    	    int alt82=2;
                    	    int LA82_0 = input.LA(1);

                    	    if ( ((LA82_0>=RULE_WS && LA82_0<=RULE_ANY_OTHER)||(LA82_0>=28 && LA82_0<=30)) ) {
                    	        alt82=1;
                    	    }
                    	    switch (alt82) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3020:1: (lv_contents_10_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3020:1: (lv_contents_10_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3021:3: lv_contents_10_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5571);
                    	            lv_contents_10_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_10_0, 
                    	            	        		"Code", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3044:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3044:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=34 && LA85_0<=36)||LA85_0==45) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3044:7: ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3044:7: ( (lv_contents_11_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3045:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3045:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3046:3: lv_contents_11_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5603);
                    	    lv_contents_11_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_11_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3068:2: ( (lv_contents_12_0= ruleCode ) )?
                    	    int alt84=2;
                    	    int LA84_0 = input.LA(1);

                    	    if ( ((LA84_0>=RULE_WS && LA84_0<=RULE_ANY_OTHER)||(LA84_0>=28 && LA84_0<=30)) ) {
                    	        alt84=1;
                    	    }
                    	    switch (alt84) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3069:1: (lv_contents_12_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3069:1: (lv_contents_12_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3070:3: lv_contents_12_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock5624);
                    	            lv_contents_12_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_12_0, 
                    	            	        		"Code", 
                    	            	        		currentNode);
                    	            	        } catch (ValueConverterException vce) {
                    	            				handleValueConverterException(vce);
                    	            	        }
                    	            	        currentNode = currentNode.getParent();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock5641); 

                	createLeafNode(otherlv_13, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_4(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleTodo"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3104:1: entryRuleTodo returns [EObject current=null] : iv_ruleTodo= ruleTodo EOF ;
    public final EObject entryRuleTodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTodo = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3105:2: (iv_ruleTodo= ruleTodo EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3106:2: iv_ruleTodo= ruleTodo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTodoRule(), currentNode); 
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo5677);
            iv_ruleTodo=ruleTodo();

            state._fsp--;

             current =iv_ruleTodo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo5687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTodo"


    // $ANTLR start "ruleTodo"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3113:1: ruleTodo returns [EObject current=null] : ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3118:6: ( ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3119:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3119:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3119:2: () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3119:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3120:5: 
            {
             
                    temp=factory.create(grammarAccess.getTodoAccess().getTodoAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTodoAccess().getTodoAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleTodo5733); 

                	createLeafNode(otherlv_1, grammarAccess.getTodoAccess().getTodoKeyword_1(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3134:1: ( (lv_text_2_0= ruleText ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_WS||(LA87_0>=RULE_ID && LA87_0<=RULE_ANY_OTHER)||(LA87_0>=28 && LA87_0<=30)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3135:1: (lv_text_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3135:1: (lv_text_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3136:3: lv_text_2_0= ruleText
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTodoAccess().getTextTextParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleTodo5754);
                    lv_text_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTodoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"text",
                    	        		lv_text_2_0, 
                    	        		"Text", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTodo5767); 

                	createLeafNode(otherlv_3, grammarAccess.getTodoAccess().getRightSquareBracketKeyword_3(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTodo"


    // $ANTLR start "entryRuleCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3170:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3171:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3172:2: iv_ruleCode= ruleCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode5803);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode5813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3179:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3184:6: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3185:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3185:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3186:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3186:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3187:3: lv_contents_0_0= ruleCodeText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode5858);
            lv_contents_0_0=ruleCodeText();

            state._fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"contents",
            	        		lv_contents_0_0, 
            	        		"CodeText", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleMarkupInCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3217:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3218:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3219:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkupInCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5893);
            iv_ruleMarkupInCode=ruleMarkupInCode();

            state._fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode5903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkupInCode"


    // $ANTLR start "ruleMarkupInCode"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3226:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_Todo_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3231:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3232:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3232:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            int alt88=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt88=1;
                }
                break;
            case 35:
                {
                alt88=2;
                }
                break;
            case 36:
                {
                alt88=3;
                }
                break;
            case 45:
                {
                alt88=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3233:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode5950);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3243:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode5977);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3253:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode6004);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3263:5: this_Todo_3= ruleTodo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getTodoParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkupInCode6031);
                    this_Todo_3=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkupInCode"


    // $ANTLR start "entryRuleLangDef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3279:1: entryRuleLangDef returns [EObject current=null] : iv_ruleLangDef= ruleLangDef EOF ;
    public final EObject entryRuleLangDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangDef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3280:2: (iv_ruleLangDef= ruleLangDef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3281:2: iv_ruleLangDef= ruleLangDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLangDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleLangDef_in_entryRuleLangDef6066);
            iv_ruleLangDef=ruleLangDef();

            state._fsp--;

             current =iv_ruleLangDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangDef6076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLangDef"


    // $ANTLR start "ruleLangDef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3288:1: ruleLangDef returns [EObject current=null] : (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) ;
    public final EObject ruleLangDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_keywords_6_0=null;
        Token otherlv_7=null;
        Token lv_keywords_9_0=null;
        Token otherlv_11=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3293:6: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3294:1: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3294:1: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_11= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3294:3: otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )? otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleLangDef6113); 

                	createLeafNode(otherlv_0, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_0(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3298:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3299:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3299:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3300:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6130); 

            			createLeafNode(lv_name_1_0, grammarAccess.getLangDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLangDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6147); 

                	createLeafNode(otherlv_2, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_2(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3326:1: ( ruleANY_WS )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=RULE_WS && LA89_0<=RULE_MULTI_NL)||LA89_0==RULE_SINGLE_NL) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3327:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_3(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6164);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleLangDef6177); 

                	createLeafNode(otherlv_4, grammarAccess.getLangDefAccess().getLeftSquareBracketKeyword_4(), null);
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3338:1: ( ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_WS && LA94_0<=RULE_SINGLE_NL)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3338:2: ( ruleANY_WS )* ( (lv_keywords_6_0= RULE_ID ) ) (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3338:2: ( ruleANY_WS )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( ((LA90_0>=RULE_WS && LA90_0<=RULE_MULTI_NL)||LA90_0==RULE_SINGLE_NL) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3339:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_5_0(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6195);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3346:3: ( (lv_keywords_6_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3347:1: (lv_keywords_6_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3347:1: (lv_keywords_6_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3348:3: lv_keywords_6_0= RULE_ID
                    {
                    lv_keywords_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6213); 

                    			createLeafNode(lv_keywords_6_0, grammarAccess.getLangDefAccess().getKeywordsIDTerminalRuleCall_5_1_0(), "keywords"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLangDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"keywords",
                    	        		lv_keywords_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3370:2: (otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )* )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==30) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3370:4: otherlv_7= ',' ( ruleANY_WS )* ( (lv_keywords_9_0= RULE_ID ) ) ( ruleANY_WS )*
                    	    {
                    	    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleLangDef6231); 

                    	        	createLeafNode(otherlv_7, grammarAccess.getLangDefAccess().getCommaKeyword_5_2_0(), null);
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3374:1: ( ruleANY_WS )*
                    	    loop91:
                    	    do {
                    	        int alt91=2;
                    	        int LA91_0 = input.LA(1);

                    	        if ( ((LA91_0>=RULE_WS && LA91_0<=RULE_MULTI_NL)||LA91_0==RULE_SINGLE_NL) ) {
                    	            alt91=1;
                    	        }


                    	        switch (alt91) {
                    	    	case 1 :
                    	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3375:5: ruleANY_WS
                    	    	    {
                    	    	     
                    	    	            currentNode=createCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_5_2_1(), currentNode); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6248);
                    	    	    ruleANY_WS();

                    	    	    state._fsp--;

                    	    	     
                    	    	            currentNode = currentNode.getParent();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop91;
                    	        }
                    	    } while (true);

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3382:3: ( (lv_keywords_9_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3383:1: (lv_keywords_9_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3383:1: (lv_keywords_9_0= RULE_ID )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3384:3: lv_keywords_9_0= RULE_ID
                    	    {
                    	    lv_keywords_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef6266); 

                    	    			createLeafNode(lv_keywords_9_0, grammarAccess.getLangDefAccess().getKeywordsIDTerminalRuleCall_5_2_2_0(), "keywords"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getLangDefRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"keywords",
                    	    	        		lv_keywords_9_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3406:2: ( ruleANY_WS )*
                    	    loop92:
                    	    do {
                    	        int alt92=2;
                    	        int LA92_0 = input.LA(1);

                    	        if ( ((LA92_0>=RULE_WS && LA92_0<=RULE_MULTI_NL)||LA92_0==RULE_SINGLE_NL) ) {
                    	            alt92=1;
                    	        }


                    	        switch (alt92) {
                    	    	case 1 :
                    	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3407:5: ruleANY_WS
                    	    	    {
                    	    	     
                    	    	            currentNode=createCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_5_2_3(), currentNode); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef6288);
                    	    	    ruleANY_WS();

                    	    	    state._fsp--;

                    	    	     
                    	    	            currentNode = currentNode.getParent();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop92;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleLangDef6305); 

                	createLeafNode(otherlv_11, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_6(), null);
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLangDef"


    // $ANTLR start "entryRuleCodeText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3426:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3427:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3428:2: iv_ruleCodeText= ruleCodeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText6342);
            iv_ruleCodeText=ruleCodeText();

            state._fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText6353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeText"


    // $ANTLR start "ruleCodeText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3435:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_SINGLE_NL_3=null;
        Token this_ANY_OTHER_4=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3440:6: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3441:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3441:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' )+
            int cnt95=0;
            loop95:
            do {
                int alt95=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt95=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt95=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt95=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt95=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt95=5;
                    }
                    break;
                case 28:
                    {
                    alt95=6;
                    }
                    break;
                case 29:
                    {
                    alt95=7;
                    }
                    break;
                case 30:
                    {
                    alt95=8;
                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3441:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText6393); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(this_ID_0, grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3449:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText6419); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        createLeafNode(this_MULTI_NL_1, grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3457:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText6445); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        createLeafNode(this_WS_2, grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3465:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6471); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        createLeafNode(this_SINGLE_NL_3, grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3473:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6497); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        createLeafNode(this_ANY_OTHER_4, grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3482:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleCodeText6521); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3489:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleCodeText6540); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6(), null); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3496:2: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleCodeText6559); 

            	            current.merge(kw);
            	            createLeafNode(kw, grammarAccess.getCodeTextAccess().getCommaKeyword_7(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeText"


    // $ANTLR start "entryRuleANY_WS"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3509:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3510:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3511:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getANY_WSRule(), currentNode); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS6601);
            iv_ruleANY_WS=ruleANY_WS();

            state._fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS6612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANY_WS"


    // $ANTLR start "ruleANY_WS"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3518:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3523:6: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3524:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3524:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt96=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt96=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt96=2;
                }
                break;
            case RULE_WS:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3524:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6652); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        createLeafNode(this_MULTI_NL_0, grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3532:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6678); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        createLeafNode(this_SINGLE_NL_1, grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3540:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS6704); 

                    		current.merge(this_WS_2);
                        
                     
                        createLeafNode(this_WS_2, grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANY_WS"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA41_eotS =
        "\6\uffff";
    static final String DFA41_eofS =
        "\6\uffff";
    static final String DFA41_minS =
        "\4\4\2\uffff";
    static final String DFA41_maxS =
        "\4\40\2\uffff";
    static final String DFA41_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA41_specialS =
        "\6\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\24\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 1793:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*";
        }
    }
    static final String DFA44_eotS =
        "\6\uffff";
    static final String DFA44_eofS =
        "\6\uffff";
    static final String DFA44_minS =
        "\4\4\2\uffff";
    static final String DFA44_maxS =
        "\4\41\2\uffff";
    static final String DFA44_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA44_specialS =
        "\6\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\25\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 1875:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*";
        }
    }
    static final String DFA57_eotS =
        "\6\uffff";
    static final String DFA57_eofS =
        "\6\uffff";
    static final String DFA57_minS =
        "\4\4\2\uffff";
    static final String DFA57_maxS =
        "\4\47\2\uffff";
    static final String DFA57_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA57_specialS =
        "\6\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 2265:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA60_eotS =
        "\6\uffff";
    static final String DFA60_eofS =
        "\6\uffff";
    static final String DFA60_minS =
        "\4\4\2\uffff";
    static final String DFA60_maxS =
        "\4\47\2\uffff";
    static final String DFA60_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA60_specialS =
        "\6\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\33\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "()* loopback of 2347:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA81_eotS =
        "\21\uffff";
    static final String DFA81_eofS =
        "\11\uffff\4\5\1\uffff\3\5";
    static final String DFA81_minS =
        "\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA81_maxS =
        "\5\55\1\uffff\7\55\1\uffff\3\55";
    static final String DFA81_acceptS =
        "\5\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA81_specialS =
        "\21\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\3\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\3\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\3\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\20\uffff\3\5\3\uffff\3\5\10"+
            "\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\3\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\3\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\3\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\20\uffff\3\5\3\uffff\3\5"+
            "\10\uffff\1\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\4\uffff\1\15\13\uffff\4"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\4\uffff\1\15\13\uffff\4"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\4\uffff\1\15\13\uffff\4"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\1\uffff\2\5\3\uffff\1\5\1\15\17\5\2"+
            "\uffff\5\5\1\uffff\6\5",
            "",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\4\uffff\1\15\13\uffff\4"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\4\uffff\1\15\13\uffff\4"+
            "\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\1\uffff\1\5\4\uffff\1\5\1\15\17\5\2"+
            "\uffff\5\5\1\uffff\6\5"
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "2915:1: ( ( ruleANY_WS )* ( (lv_language_3_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXdocFile_in_entryRuleXdocFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXdocFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleXdocFile131 = new BitSet(new long[]{0x0000000000FE8422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144 = new BitSet(new long[]{0x0000000000FE8402L});
    public static final BitSet FOLLOW_ruleDocument_in_ruleXdocFile169 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile181 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleDocument_in_ruleXdocFile201 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleXdocFile232 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile244 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleXdocFile264 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleXdocFile295 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile307 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleXdocFile327 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleXdocFile358 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile370 = new BitSet(new long[]{0x0000000000FE8400L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleXdocFile390 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDocument492 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument513 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument525 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDocument548 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument581 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument595 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDocument606 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument627 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument639 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument653 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleLangDef_in_ruleDocument673 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDocument698 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleDocument715 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDocument733 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleDocument755 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleDocument768 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument782 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument802 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterRef_in_ruleChapter897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleChapter917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChapter951 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_17_in_ruleChapter970 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter992 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter1004 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter1016 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter1036 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter1050 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter1070 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapterRef_in_entryRuleChapterRef1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterRef1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChapterRef1156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapterRef1176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapterRef1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionRef_in_ruleSection1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSection1301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection1318 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSection1335 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_20_in_ruleSection1354 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1376 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection1388 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1400 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection1420 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection1434 = new BitSet(new long[]{0x0000000000FE8400L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleSection1454 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSectionRef_in_entryRuleSectionRef1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionRef1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSectionRef1540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSectionRef1560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSectionRef1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_entryRuleSection21608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection21618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSection21657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection21674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSection21691 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_23_in_ruleSection21710 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21732 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection21744 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21756 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection21776 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection21790 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSection21810 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSection31897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31914 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSection31931 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_25_in_ruleSection31950 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31972 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31984 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31996 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection32016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection32030 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection32050 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection42088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection42098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSection42137 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection42154 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSection42171 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_27_in_ruleSection42190 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection42212 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection42224 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection42236 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection42256 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup2294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2351 = new BitSet(new long[]{0x00003F7CF00001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2373 = new BitSet(new long[]{0x00003F7CF00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2394 = new BitSet(new long[]{0x00003F7CF00001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup2426 = new BitSet(new long[]{0x00003F7CF00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup2447 = new BitSet(new long[]{0x00003F7CF00001D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText2628 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText2654 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText2680 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2706 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_28_in_ruleText2730 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_29_in_ruleText2749 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_30_in_ruleText2768 = new BitSet(new long[]{0x00000000700001D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleMarkUp3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkUp3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable3171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTable3227 = new BitSet(new long[]{0x00000001000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3245 = new BitSet(new long[]{0x00000001000000B0L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable3267 = new BitSet(new long[]{0x00000001000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable3286 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTable3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow3335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTableRow3391 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3409 = new BitSet(new long[]{0x00000002000000B0L});
    public static final BitSet FOLLOW_ruleTableData_in_ruleTableRow3431 = new BitSet(new long[]{0x00000002000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow3450 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTableRow3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData3499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTableData3555 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3568 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3590 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData3602 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData3622 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleTableData3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize3674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEmphasize3730 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3743 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize3765 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize3777 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor3828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAnchor3875 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor3892 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAnchor3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef3945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRef3992 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef4012 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleRef4025 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef4037 = new BitSet(new long[]{0x00003F7CF00009D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef4060 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef4072 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList4125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOrderedList4181 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList4199 = new BitSet(new long[]{0x00000080000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList4221 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList4240 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList4289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnorderedList4345 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4363 = new BitSet(new long[]{0x00000080000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList4385 = new BitSet(new long[]{0x00000080000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList4404 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem4453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleItem4509 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4522 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4544 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem4556 = new BitSet(new long[]{0x00003F7CF00001D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem4576 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleItem4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef4628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCodeRef4684 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef4707 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLink4812 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4833 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4846 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink4863 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleLink4876 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink4897 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef4946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleImageRef4995 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5012 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef5030 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5052 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleImageRef5065 = new BitSet(new long[]{0x00000000700001D0L});
    public static final BitSet FOLLOW_43_in_ruleImageRef5084 = new BitSet(new long[]{0x00000000700001D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5106 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5118 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5135 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleImageRef5148 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5169 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5182 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5199 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleImageRef5212 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5246 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef5263 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleImageRef5276 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef5297 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCodeBlock5402 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5420 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock5438 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5460 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5473 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock5490 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleCodeBlock5503 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5528 = new BitSet(new long[]{0x00003F7CF00009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5550 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5571 = new BitSet(new long[]{0x00003F7CF00009D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock5603 = new BitSet(new long[]{0x00003F7CF00009F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock5624 = new BitSet(new long[]{0x00003F7CF00009D0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTodo5733 = new BitSet(new long[]{0x00000000700009D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleTodo5754 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTodo5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode5803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode5893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkupInCode6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangDef_in_entryRuleLangDef6066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangDef6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLangDef6113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6147 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6164 = new BitSet(new long[]{0x00000000000100B0L});
    public static final BitSet FOLLOW_16_in_ruleLangDef6177 = new BitSet(new long[]{0x00000000000008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6195 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6213 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_30_in_ruleLangDef6231 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6248 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef6266 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef6288 = new BitSet(new long[]{0x00000000400008B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText6342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText6393 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText6419 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText6445 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText6471 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText6497 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_28_in_ruleCodeText6521 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_29_in_ruleCodeText6540 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_30_in_ruleCodeText6559 = new BitSet(new long[]{0x00000000700001F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS6601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS6704 = new BitSet(new long[]{0x0000000000000002L});

}