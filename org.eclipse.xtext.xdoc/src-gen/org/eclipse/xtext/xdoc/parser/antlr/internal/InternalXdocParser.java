package org.eclipse.xtext.xdoc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.xdoc.services.XdocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'document['", "']'", "'subtitle['", "'authors['", "'part:'", "'['", "'part['", "'part-ref['", "'gloss-entry['", "','", "'chapter:'", "'chapter['", "'chapter-ref['", "'section:'", "'section['", "'section-ref['", "'section2:'", "'section2['", "'section2-ref['", "'section3:'", "'section3['", "'section4:'", "'section4['", "'\\\\['", "'\\\\]'", "'-'", "'table['", "'tr['", "'td['", "'e['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'img['", "'code['", "'todo['", "'codelanguage-def['"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__51=51;
    public static final int T__13=13;
    public static final int T__47=47;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__17=17;
    public static final int RULE_MULTI_NL=5;
    public static final int T__27=27;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int T__10=10;
    public static final int T__48=48;
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
     	
        public InternalXdocParser(TokenStream input, XdocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:67:1: entryRuleXdocFile returns [EObject current=null] : iv_ruleXdocFile= ruleXdocFile EOF ;
    public final EObject entryRuleXdocFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXdocFile = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:68:2: (iv_ruleXdocFile= ruleXdocFile EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:69:2: iv_ruleXdocFile= ruleXdocFile EOF
            {
             newCompositeNode(grammarAccess.getXdocFileRule()); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:76:1: ruleXdocFile returns [EObject current=null] : ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) ;
    public final EObject ruleXdocFile() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        EObject lv_mainSection_3_1 = null;

        EObject lv_mainSection_3_2 = null;

        EObject lv_mainSection_3_3 = null;

        EObject lv_mainSection_3_4 = null;

        EObject lv_mainSection_3_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:79:28: ( ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:1: ( () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:2: () (this_WS_1= RULE_WS )? (this_MULTI_NL_2= RULE_MULTI_NL )? ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:80:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getXdocFileAccess().getXdocFileAction_0(),
                        current);
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:2: (this_WS_1= RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:86:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleXdocFile131); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getXdocFileAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:90:3: (this_MULTI_NL_2= RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:90:4: this_MULTI_NL_2= RULE_MULTI_NL
                    {
                    this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144); 
                     
                        newLeafNode(this_MULTI_NL_2, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:3: ( ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10||LA5_0==14||(LA5_0>=16 && LA5_0<=17)||(LA5_0>=20 && LA5_0<=28)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:94:4: ( ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:95:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:95:1: ( (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:96:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:96:1: (lv_mainSection_3_1= ruleDocument | lv_mainSection_3_2= rulePart | lv_mainSection_3_3= ruleChapter | lv_mainSection_3_4= ruleSection | lv_mainSection_3_5= ruleSection2 )
                    int alt3=5;
                    switch ( input.LA(1) ) {
                    case 10:
                        {
                        alt3=1;
                        }
                        break;
                    case 14:
                    case 16:
                    case 17:
                        {
                        alt3=2;
                        }
                        break;
                    case 20:
                    case 21:
                    case 22:
                        {
                        alt3=3;
                        }
                        break;
                    case 23:
                    case 24:
                    case 25:
                        {
                        alt3=4;
                        }
                        break;
                    case 26:
                    case 27:
                    case 28:
                        {
                        alt3=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:97:3: lv_mainSection_3_1= ruleDocument
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionDocumentParserRuleCall_3_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocument_in_ruleXdocFile169);
                            lv_mainSection_3_1=ruleDocument();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_1, 
                                    		"Document");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:112:8: lv_mainSection_3_2= rulePart
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionPartParserRuleCall_3_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_rulePart_in_ruleXdocFile188);
                            lv_mainSection_3_2=rulePart();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_2, 
                                    		"Part");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 3 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:127:8: lv_mainSection_3_3= ruleChapter
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionChapterParserRuleCall_3_0_0_2()); 
                            	    
                            pushFollow(FOLLOW_ruleChapter_in_ruleXdocFile207);
                            lv_mainSection_3_3=ruleChapter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_3, 
                                    		"Chapter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 4 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:142:8: lv_mainSection_3_4= ruleSection
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionSectionParserRuleCall_3_0_0_3()); 
                            	    
                            pushFollow(FOLLOW_ruleSection_in_ruleXdocFile226);
                            lv_mainSection_3_4=ruleSection();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_4, 
                                    		"Section");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 5 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:157:8: lv_mainSection_3_5= ruleSection2
                            {
                             
                            	        newCompositeNode(grammarAccess.getXdocFileAccess().getMainSectionSection2ParserRuleCall_3_0_0_4()); 
                            	    
                            pushFollow(FOLLOW_ruleSection2_in_ruleXdocFile245);
                            lv_mainSection_3_5=ruleSection2();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXdocFileRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mainSection",
                                    		lv_mainSection_3_5, 
                                    		"Section2");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:175:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_MULTI_NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:175:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleXdocFile260); 
                             
                                newLeafNode(this_MULTI_NL_4, grammarAccess.getXdocFileAccess().getMULTI_NLTerminalRuleCall_3_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:187:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:188:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:189:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument299);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument309); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:196:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )? (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? ) ) ;
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
        Token this_MULTI_NL_15=null;
        Token this_MULTI_NL_17=null;
        Token this_MULTI_NL_20=null;
        EObject lv_title_1_0 = null;

        EObject lv_subtitle_5_0 = null;

        EObject lv_authors_9_0 = null;

        EObject lv_langDefs_12_0 = null;

        EObject lv_glossary_14_0 = null;

        EObject lv_chapters_16_0 = null;

        EObject lv_chapters_18_0 = null;

        EObject lv_parts_19_0 = null;

        EObject lv_parts_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:199:28: ( (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )? (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:200:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )? (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:200:1: (otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )? (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:200:3: otherlv_0= 'document[' ( (lv_title_1_0= ruleTextOrMarkup ) ) otherlv_2= ']' (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )? (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )* (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )? (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? )
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleDocument346); 

                	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDocumentKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:204:1: ( (lv_title_1_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:205:1: (lv_title_1_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:205:1: (lv_title_1_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:206:3: lv_title_1_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument367);
            lv_title_1_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleDocument379); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:226:1: (this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_MULTI_NL) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==12) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:226:2: this_MULTI_NL_3= RULE_MULTI_NL otherlv_4= 'subtitle[' ( (lv_subtitle_5_0= ruleTextOrMarkup ) ) otherlv_6= ']'
                    {
                    this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument391); 
                     
                        newLeafNode(this_MULTI_NL_3, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0()); 
                        
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDocument402); 

                        	newLeafNode(otherlv_4, grammarAccess.getDocumentAccess().getSubtitleKeyword_3_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:234:1: ( (lv_subtitle_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:235:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:235:1: (lv_subtitle_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:236:3: lv_subtitle_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getSubtitleTextOrMarkupParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument423);
                    lv_subtitle_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"subtitle",
                            		lv_subtitle_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleDocument435); 

                        	newLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:256:3: (this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_MULTI_NL) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==13) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:256:4: this_MULTI_NL_7= RULE_MULTI_NL otherlv_8= 'authors[' ( (lv_authors_9_0= ruleTextOrMarkup ) ) otherlv_10= ']'
                    {
                    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument449); 
                     
                        newLeafNode(this_MULTI_NL_7, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_4_0()); 
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDocument460); 

                        	newLeafNode(otherlv_8, grammarAccess.getDocumentAccess().getAuthorsKeyword_4_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:264:1: ( (lv_authors_9_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:265:1: (lv_authors_9_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:265:1: (lv_authors_9_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:266:3: lv_authors_9_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getAuthorsTextOrMarkupParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleDocument481);
                    lv_authors_9_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"authors",
                            		lv_authors_9_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleDocument493); 

                        	newLeafNode(otherlv_10, grammarAccess.getDocumentAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:286:3: (this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_MULTI_NL) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==51) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:286:4: this_MULTI_NL_11= RULE_MULTI_NL ( (lv_langDefs_12_0= ruleLangDef ) )
            	    {
            	    this_MULTI_NL_11=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument507); 
            	     
            	        newLeafNode(this_MULTI_NL_11, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_5_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:290:1: ( (lv_langDefs_12_0= ruleLangDef ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:291:1: (lv_langDefs_12_0= ruleLangDef )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:291:1: (lv_langDefs_12_0= ruleLangDef )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:292:3: lv_langDefs_12_0= ruleLangDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getLangDefsLangDefParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLangDef_in_ruleDocument527);
            	    lv_langDefs_12_0=ruleLangDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"langDefs",
            	            		lv_langDefs_12_0, 
            	            		"LangDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:308:4: (this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_MULTI_NL) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_MULTI_NL) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==18) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:308:5: this_MULTI_NL_13= RULE_MULTI_NL ( (lv_glossary_14_0= ruleGlossary ) )
                    {
                    this_MULTI_NL_13=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument541); 
                     
                        newLeafNode(this_MULTI_NL_13, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_6_0()); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:312:1: ( (lv_glossary_14_0= ruleGlossary ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:313:1: (lv_glossary_14_0= ruleGlossary )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:313:1: (lv_glossary_14_0= ruleGlossary )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:314:3: lv_glossary_14_0= ruleGlossary
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getGlossaryGlossaryParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGlossary_in_ruleDocument561);
                    lv_glossary_14_0=ruleGlossary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"glossary",
                            		lv_glossary_14_0, 
                            		"Glossary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:330:4: (this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:330:5: this_MULTI_NL_15= RULE_MULTI_NL ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )?
            {
            this_MULTI_NL_15=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument575); 
             
                newLeafNode(this_MULTI_NL_15, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_7_0()); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:334:1: ( ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* ) | ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=20 && LA12_0<=22)) ) {
                alt12=1;
            }
            else if ( (LA12_0==14||(LA12_0>=16 && LA12_0<=17)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:334:2: ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:334:2: ( ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:334:3: ( (lv_chapters_16_0= ruleChapter ) ) (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:334:3: ( (lv_chapters_16_0= ruleChapter ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:335:1: (lv_chapters_16_0= ruleChapter )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:335:1: (lv_chapters_16_0= ruleChapter )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:336:3: lv_chapters_16_0= ruleChapter
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_7_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChapter_in_ruleDocument597);
                    lv_chapters_16_0=ruleChapter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"chapters",
                            		lv_chapters_16_0, 
                            		"Chapter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:352:2: (this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_MULTI_NL) ) {
                            int LA10_1 = input.LA(2);

                            if ( ((LA10_1>=20 && LA10_1<=22)) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:352:3: this_MULTI_NL_17= RULE_MULTI_NL ( (lv_chapters_18_0= ruleChapter ) )
                    	    {
                    	    this_MULTI_NL_17=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument609); 
                    	     
                    	        newLeafNode(this_MULTI_NL_17, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_7_1_0_1_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:356:1: ( (lv_chapters_18_0= ruleChapter ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:357:1: (lv_chapters_18_0= ruleChapter )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:357:1: (lv_chapters_18_0= ruleChapter )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:358:3: lv_chapters_18_0= ruleChapter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_7_1_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument629);
                    	    lv_chapters_18_0=ruleChapter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"chapters",
                    	            		lv_chapters_18_0, 
                    	            		"Chapter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:6: ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:6: ( ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:7: ( (lv_parts_19_0= rulePart ) ) (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:375:7: ( (lv_parts_19_0= rulePart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:376:1: (lv_parts_19_0= rulePart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:376:1: (lv_parts_19_0= rulePart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:377:3: lv_parts_19_0= rulePart
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentAccess().getPartsPartParserRuleCall_7_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePart_in_ruleDocument660);
                    lv_parts_19_0=rulePart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	        }
                           		add(
                           			current, 
                           			"parts",
                            		lv_parts_19_0, 
                            		"Part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:393:2: (this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_MULTI_NL) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==14||(LA11_1>=16 && LA11_1<=17)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:393:3: this_MULTI_NL_20= RULE_MULTI_NL ( (lv_parts_21_0= rulePart ) )
                    	    {
                    	    this_MULTI_NL_20=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument672); 
                    	     
                    	        newLeafNode(this_MULTI_NL_20, grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_7_1_1_1_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:397:1: ( (lv_parts_21_0= rulePart ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:398:1: (lv_parts_21_0= rulePart )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:398:1: (lv_parts_21_0= rulePart )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:399:3: lv_parts_21_0= rulePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDocumentAccess().getPartsPartParserRuleCall_7_1_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePart_in_ruleDocument692);
                    	    lv_parts_21_0=rulePart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parts",
                    	            		lv_parts_21_0, 
                    	            		"Part");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGlossary"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:423:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:424:2: (iv_ruleGlossary= ruleGlossary EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:425:2: iv_ruleGlossary= ruleGlossary EOF
            {
             newCompositeNode(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_ruleGlossary_in_entryRuleGlossary734);
            iv_ruleGlossary=ruleGlossary();

            state._fsp--;

             current =iv_ruleGlossary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossary744); 

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
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:432:1: ruleGlossary returns [EObject current=null] : (this_MULTI_NL_0= RULE_MULTI_NL ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) ) )+ ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token this_MULTI_NL_0=null;
        EObject lv_glossaryEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:435:28: ( (this_MULTI_NL_0= RULE_MULTI_NL ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) ) )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:436:1: (this_MULTI_NL_0= RULE_MULTI_NL ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) ) )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:436:1: (this_MULTI_NL_0= RULE_MULTI_NL ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_MULTI_NL) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==18) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:436:2: this_MULTI_NL_0= RULE_MULTI_NL ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) )
            	    {
            	    this_MULTI_NL_0=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleGlossary780); 
            	     
            	        newLeafNode(this_MULTI_NL_0, grammarAccess.getGlossaryAccess().getMULTI_NLTerminalRuleCall_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:440:1: ( (lv_glossaryEntry_1_0= ruleGlossaryEntry ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:441:1: (lv_glossaryEntry_1_0= ruleGlossaryEntry )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:441:1: (lv_glossaryEntry_1_0= ruleGlossaryEntry )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:442:3: lv_glossaryEntry_1_0= ruleGlossaryEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryAccess().getGlossaryEntryGlossaryEntryParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlossaryEntry_in_ruleGlossary800);
            	    lv_glossaryEntry_1_0=ruleGlossaryEntry();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlossaryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"glossaryEntry",
            	            		lv_glossaryEntry_1_0, 
            	            		"GlossaryEntry");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRulePart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:466:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:467:2: (iv_rulePart= rulePart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:468:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart837);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart847); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:475:1: rulePart returns [EObject current=null] : (this_PartRef_0= rulePartRef | ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        EObject this_PartRef_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_chapters_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:478:28: ( (this_PartRef_0= rulePartRef | ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:479:1: (this_PartRef_0= rulePartRef | ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:479:1: (this_PartRef_0= rulePartRef | ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            else if ( (LA16_0==14||LA16_0==16) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:480:5: this_PartRef_0= rulePartRef
                    {
                     
                            newCompositeNode(grammarAccess.getPartAccess().getPartRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePartRef_in_rulePart894);
                    this_PartRef_0=rulePartRef();

                    state._fsp--;

                     
                            current = this_PartRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:6: ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:6: ( ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:7: ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:7: ( (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'part[' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==14) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==16) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:8: (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:8: (otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:489:10: otherlv_1= 'part:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePart914); 

                                	newLeafNode(otherlv_1, grammarAccess.getPartAccess().getPartKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:493:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:494:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:494:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:495:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePart931); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getPartAccess().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPartRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePart948); 

                                	newLeafNode(otherlv_3, grammarAccess.getPartAccess().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:516:7: otherlv_4= 'part['
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePart967); 

                                	newLeafNode(otherlv_4, grammarAccess.getPartAccess().getPartKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:520:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:521:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:521:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:522:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getPartAccess().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_rulePart989);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPartRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_rulePart1001); 

                        	newLeafNode(otherlv_6, grammarAccess.getPartAccess().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:542:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_MULTI_NL) ) {
                            int LA15_1 = input.LA(2);

                            if ( ((LA15_1>=20 && LA15_1<=22)) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:542:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_chapters_8_0= ruleChapter ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rulePart1013); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getPartAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:546:1: ( (lv_chapters_8_0= ruleChapter ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:547:1: (lv_chapters_8_0= ruleChapter )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:547:1: (lv_chapters_8_0= ruleChapter )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:548:3: lv_chapters_8_0= ruleChapter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPartAccess().getChaptersChapterParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleChapter_in_rulePart1033);
                    	    lv_chapters_8_0=ruleChapter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPartRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"chapters",
                    	            		lv_chapters_8_0, 
                    	            		"Chapter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRulePartRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:572:1: entryRulePartRef returns [EObject current=null] : iv_rulePartRef= rulePartRef EOF ;
    public final EObject entryRulePartRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:573:2: (iv_rulePartRef= rulePartRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:574:2: iv_rulePartRef= rulePartRef EOF
            {
             newCompositeNode(grammarAccess.getPartRefRule()); 
            pushFollow(FOLLOW_rulePartRef_in_entryRulePartRef1072);
            iv_rulePartRef=rulePartRef();

            state._fsp--;

             current =iv_rulePartRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartRef1082); 

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
    // $ANTLR end "entryRulePartRef"


    // $ANTLR start "rulePartRef"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:581:1: rulePartRef returns [EObject current=null] : (otherlv_0= 'part-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject rulePartRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:584:28: ( (otherlv_0= 'part-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:585:1: (otherlv_0= 'part-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:585:1: (otherlv_0= 'part-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:585:3: otherlv_0= 'part-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePartRef1119); 

                	newLeafNode(otherlv_0, grammarAccess.getPartRefAccess().getPartRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:589:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:590:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:590:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:591:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartRef1139); 

            		newLeafNode(otherlv_1, grammarAccess.getPartRefAccess().getPartPartCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_rulePartRef1151); 

                	newLeafNode(otherlv_2, grammarAccess.getPartRefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartRef"


    // $ANTLR start "entryRuleGlossaryEntry"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:614:1: entryRuleGlossaryEntry returns [EObject current=null] : iv_ruleGlossaryEntry= ruleGlossaryEntry EOF ;
    public final EObject entryRuleGlossaryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossaryEntry = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:615:2: (iv_ruleGlossaryEntry= ruleGlossaryEntry EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:616:2: iv_ruleGlossaryEntry= ruleGlossaryEntry EOF
            {
             newCompositeNode(grammarAccess.getGlossaryEntryRule()); 
            pushFollow(FOLLOW_ruleGlossaryEntry_in_entryRuleGlossaryEntry1187);
            iv_ruleGlossaryEntry=ruleGlossaryEntry();

            state._fsp--;

             current =iv_ruleGlossaryEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlossaryEntry1197); 

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
    // $ANTLR end "entryRuleGlossaryEntry"


    // $ANTLR start "ruleGlossaryEntry"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:623:1: ruleGlossaryEntry returns [EObject current=null] : (otherlv_0= 'gloss-entry[' ( (lv_name_1_0= ruleUnpunctText ) ) (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )* otherlv_6= ']' ( ruleANY_WS )* otherlv_8= '[' ( (lv_description_9_0= ruleTextOrMarkup ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )* otherlv_12= ']' ) ;
    public final EObject ruleGlossaryEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_MULTI_NL_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;

        EObject lv_description_9_0 = null;

        EObject lv_description_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:626:28: ( (otherlv_0= 'gloss-entry[' ( (lv_name_1_0= ruleUnpunctText ) ) (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )* otherlv_6= ']' ( ruleANY_WS )* otherlv_8= '[' ( (lv_description_9_0= ruleTextOrMarkup ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )* otherlv_12= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:627:1: (otherlv_0= 'gloss-entry[' ( (lv_name_1_0= ruleUnpunctText ) ) (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )* otherlv_6= ']' ( ruleANY_WS )* otherlv_8= '[' ( (lv_description_9_0= ruleTextOrMarkup ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )* otherlv_12= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:627:1: (otherlv_0= 'gloss-entry[' ( (lv_name_1_0= ruleUnpunctText ) ) (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )* otherlv_6= ']' ( ruleANY_WS )* otherlv_8= '[' ( (lv_description_9_0= ruleTextOrMarkup ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )* otherlv_12= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:627:3: otherlv_0= 'gloss-entry[' ( (lv_name_1_0= ruleUnpunctText ) ) (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )* otherlv_6= ']' ( ruleANY_WS )* otherlv_8= '[' ( (lv_description_9_0= ruleTextOrMarkup ) ) (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )* otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleGlossaryEntry1234); 

                	newLeafNode(otherlv_0, grammarAccess.getGlossaryEntryAccess().getGlossEntryKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:631:1: ( (lv_name_1_0= ruleUnpunctText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:632:1: (lv_name_1_0= ruleUnpunctText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:632:1: (lv_name_1_0= ruleUnpunctText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:633:3: lv_name_1_0= ruleUnpunctText
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryEntryAccess().getNameUnpunctTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnpunctText_in_ruleGlossaryEntry1255);
            lv_name_1_0=ruleUnpunctText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlossaryEntryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"UnpunctText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:649:2: (otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )* )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:649:4: otherlv_2= ',' ( ruleANY_WS )* ( (lv_alias_4_0= ruleUnpunctText ) ) ( ruleANY_WS )*
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGlossaryEntry1268); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGlossaryEntryAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:653:1: ( ruleANY_WS )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>=RULE_WS && LA17_0<=RULE_MULTI_NL)||LA17_0==RULE_SINGLE_NL) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:654:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getGlossaryEntryAccess().getANY_WSParserRuleCall_2_1()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1285);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:661:3: ( (lv_alias_4_0= ruleUnpunctText ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:662:1: (lv_alias_4_0= ruleUnpunctText )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:662:1: (lv_alias_4_0= ruleUnpunctText )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:663:3: lv_alias_4_0= ruleUnpunctText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryEntryAccess().getAliasUnpunctTextParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnpunctText_in_ruleGlossaryEntry1307);
            	    lv_alias_4_0=ruleUnpunctText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlossaryEntryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alias",
            	            		lv_alias_4_0, 
            	            		"UnpunctText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:679:2: ( ruleANY_WS )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>=RULE_WS && LA18_0<=RULE_MULTI_NL)||LA18_0==RULE_SINGLE_NL) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:680:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getGlossaryEntryAccess().getANY_WSParserRuleCall_2_3()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1324);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleGlossaryEntry1339); 

                	newLeafNode(otherlv_6, grammarAccess.getGlossaryEntryAccess().getRightSquareBracketKeyword_3());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:691:1: ( ruleANY_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WS && LA20_0<=RULE_MULTI_NL)||LA20_0==RULE_SINGLE_NL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:692:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGlossaryEntryAccess().getANY_WSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1356);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleGlossaryEntry1369); 

                	newLeafNode(otherlv_8, grammarAccess.getGlossaryEntryAccess().getLeftSquareBracketKeyword_5());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:703:1: ( (lv_description_9_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:704:1: (lv_description_9_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:704:1: (lv_description_9_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:705:3: lv_description_9_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getGlossaryEntryAccess().getDescriptionTextOrMarkupParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleGlossaryEntry1390);
            lv_description_9_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlossaryEntryRule());
            	        }
                   		add(
                   			current, 
                   			"description",
                    		lv_description_9_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:721:2: (this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTI_NL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:721:3: this_MULTI_NL_10= RULE_MULTI_NL ( (lv_description_11_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_10=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleGlossaryEntry1402); 
            	     
            	        newLeafNode(this_MULTI_NL_10, grammarAccess.getGlossaryEntryAccess().getMULTI_NLTerminalRuleCall_7_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:725:1: ( (lv_description_11_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:726:1: (lv_description_11_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:726:1: (lv_description_11_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:727:3: lv_description_11_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlossaryEntryAccess().getDescriptionTextOrMarkupParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleGlossaryEntry1422);
            	    lv_description_11_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlossaryEntryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"description",
            	            		lv_description_11_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_12=(Token)match(input,11,FOLLOW_11_in_ruleGlossaryEntry1436); 

                	newLeafNode(otherlv_12, grammarAccess.getGlossaryEntryAccess().getRightSquareBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlossaryEntry"


    // $ANTLR start "entryRuleChapter"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:755:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:756:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:757:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter1472);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter1482); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:764:1: ruleChapter returns [EObject current=null] : (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:767:28: ( (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:768:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:768:1: (this_ChapterRef_0= ruleChapterRef | ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=20 && LA25_0<=21)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:769:5: this_ChapterRef_0= ruleChapterRef
                    {
                     
                            newCompositeNode(grammarAccess.getChapterAccess().getChapterRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChapterRef_in_ruleChapter1529);
                    this_ChapterRef_0=ruleChapterRef();

                    state._fsp--;

                     
                            current = this_ChapterRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:6: ( ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:7: ( (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'chapter[' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==20) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==21) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:8: (otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:778:10: otherlv_1= 'chapter:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleChapter1549); 

                                	newLeafNode(otherlv_1, grammarAccess.getChapterAccess().getChapterKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:782:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:783:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:783:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:784:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter1566); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getChapterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleChapter1583); 

                                	newLeafNode(otherlv_3, grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:805:7: otherlv_4= 'chapter['
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleChapter1602); 

                                	newLeafNode(otherlv_4, grammarAccess.getChapterAccess().getChapterKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:809:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:810:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:810:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:811:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter1624);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleChapter1636); 

                        	newLeafNode(otherlv_6, grammarAccess.getChapterAccess().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:831:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_MULTI_NL) ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==RULE_WS||(LA23_1>=RULE_ID && LA23_1<=RULE_ANY_OTHER)||LA23_1==19||(LA23_1>=33 && LA23_1<=36)||(LA23_1>=39 && LA23_1<=43)||(LA23_1>=45 && LA23_1<=50)) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:831:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter1648); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:835:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:836:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:836:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:837:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter1668);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_8_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:853:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_MULTI_NL) ) {
                            int LA24_1 = input.LA(2);

                            if ( ((LA24_1>=23 && LA24_1<=25)) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:853:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter1682); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:857:1: ( (lv_subSections_10_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:858:1: (lv_subSections_10_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:858:1: (lv_subSections_10_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:859:3: lv_subSections_10_0= ruleSection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChapterAccess().getSubSectionsSectionParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleChapter1702);
                    	    lv_subSections_10_0=ruleSection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
                    	            		"Section");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:883:1: entryRuleChapterRef returns [EObject current=null] : iv_ruleChapterRef= ruleChapterRef EOF ;
    public final EObject entryRuleChapterRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapterRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:884:2: (iv_ruleChapterRef= ruleChapterRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:885:2: iv_ruleChapterRef= ruleChapterRef EOF
            {
             newCompositeNode(grammarAccess.getChapterRefRule()); 
            pushFollow(FOLLOW_ruleChapterRef_in_entryRuleChapterRef1741);
            iv_ruleChapterRef=ruleChapterRef();

            state._fsp--;

             current =iv_ruleChapterRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapterRef1751); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:892:1: ruleChapterRef returns [EObject current=null] : (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleChapterRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:895:28: ( (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:896:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:896:1: (otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:896:3: otherlv_0= 'chapter-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleChapterRef1788); 

                	newLeafNode(otherlv_0, grammarAccess.getChapterRefAccess().getChapterRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:900:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:901:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:901:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:902:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChapterRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapterRef1808); 

            		newLeafNode(otherlv_1, grammarAccess.getChapterRefAccess().getChapterChapterCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleChapterRef1820); 

                	newLeafNode(otherlv_2, grammarAccess.getChapterRefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:925:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:926:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:927:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection1856);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection1866); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:934:1: ruleSection returns [EObject current=null] : (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:937:28: ( (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:938:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:938:1: (this_SectionRef_0= ruleSectionRef | ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=23 && LA29_0<=24)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:939:5: this_SectionRef_0= ruleSectionRef
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getSectionRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSectionRef_in_ruleSection1913);
                    this_SectionRef_0=ruleSectionRef();

                    state._fsp--;

                     
                            current = this_SectionRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:6: ( ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:7: ( (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section[' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==23) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==24) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:8: (otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:948:10: otherlv_1= 'section:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSection1933); 

                                	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:952:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:953:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:953:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:954:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection1950); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSectionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSection1967); 

                                	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:975:7: otherlv_4= 'section['
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSection1986); 

                                	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getSectionKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:979:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:980:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:980:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:981:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection2008);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleSection2020); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1001:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_MULTI_NL) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==RULE_WS||(LA27_1>=RULE_ID && LA27_1<=RULE_ANY_OTHER)||LA27_1==19||(LA27_1>=33 && LA27_1<=36)||(LA27_1>=39 && LA27_1<=43)||(LA27_1>=45 && LA27_1<=50)) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1001:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection2032); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1005:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1006:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1006:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1007:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection2052);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_8_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1023:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_MULTI_NL) ) {
                            int LA28_1 = input.LA(2);

                            if ( ((LA28_1>=26 && LA28_1<=28)) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1023:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection2 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection2066); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1027:1: ( (lv_subSections_10_0= ruleSection2 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1028:1: (lv_subSections_10_0= ruleSection2 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1028:1: (lv_subSections_10_0= ruleSection2 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1029:3: lv_subSections_10_0= ruleSection2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSectionAccess().getSubSectionsSection2ParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection2_in_ruleSection2086);
                    	    lv_subSections_10_0=ruleSection2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
                    	            		"Section2");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1053:1: entryRuleSectionRef returns [EObject current=null] : iv_ruleSectionRef= ruleSectionRef EOF ;
    public final EObject entryRuleSectionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1054:2: (iv_ruleSectionRef= ruleSectionRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1055:2: iv_ruleSectionRef= ruleSectionRef EOF
            {
             newCompositeNode(grammarAccess.getSectionRefRule()); 
            pushFollow(FOLLOW_ruleSectionRef_in_entryRuleSectionRef2125);
            iv_ruleSectionRef=ruleSectionRef();

            state._fsp--;

             current =iv_ruleSectionRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionRef2135); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1062:1: ruleSectionRef returns [EObject current=null] : (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSectionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1065:28: ( (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:1: (otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1066:3: otherlv_0= 'section-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSectionRef2172); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionRefAccess().getSectionRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1070:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1071:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1071:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1072:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSectionRef2192); 

            		newLeafNode(otherlv_1, grammarAccess.getSectionRefAccess().getSectionSectionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSectionRef2204); 

                	newLeafNode(otherlv_2, grammarAccess.getSectionRefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1095:1: entryRuleSection2 returns [EObject current=null] : iv_ruleSection2= ruleSection2 EOF ;
    public final EObject entryRuleSection2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1096:2: (iv_ruleSection2= ruleSection2 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1097:2: iv_ruleSection2= ruleSection2 EOF
            {
             newCompositeNode(grammarAccess.getSection2Rule()); 
            pushFollow(FOLLOW_ruleSection2_in_entryRuleSection22240);
            iv_ruleSection2=ruleSection2();

            state._fsp--;

             current =iv_ruleSection2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection22250); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1104:1: ruleSection2 returns [EObject current=null] : (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) ) ;
    public final EObject ruleSection2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_MULTI_NL_7=null;
        Token this_MULTI_NL_9=null;
        EObject this_Section2Ref_0 = null;

        EObject lv_title_5_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_subSections_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1107:28: ( (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1108:1: (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1108:1: (this_Section2Ref_0= ruleSection2Ref | ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=26 && LA33_0<=27)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1109:5: this_Section2Ref_0= ruleSection2Ref
                    {
                     
                            newCompositeNode(grammarAccess.getSection2Access().getSection2RefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSection2Ref_in_ruleSection22297);
                    this_Section2Ref_0=ruleSection2Ref();

                    state._fsp--;

                     
                            current = this_Section2Ref_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:6: ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:6: ( ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:7: ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' ) ( (lv_title_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:7: ( (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ) | otherlv_4= 'section2[' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==26) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==27) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:8: (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:8: (otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1118:10: otherlv_1= 'section2:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '['
                            {
                            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSection22317); 

                                	newLeafNode(otherlv_1, grammarAccess.getSection2Access().getSection2Keyword_1_0_0_0());
                                
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1122:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1123:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1123:1: (lv_name_2_0= RULE_ID )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1124:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection22334); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getSection2Access().getNameIDTerminalRuleCall_1_0_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSection2Rule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSection22351); 

                                	newLeafNode(otherlv_3, grammarAccess.getSection2Access().getLeftSquareBracketKeyword_1_0_0_2());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1145:7: otherlv_4= 'section2['
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleSection22370); 

                                	newLeafNode(otherlv_4, grammarAccess.getSection2Access().getSection2Keyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1149:2: ( (lv_title_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1150:1: (lv_title_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1150:1: (lv_title_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1151:3: lv_title_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection22392);
                    lv_title_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleSection22404); 

                        	newLeafNode(otherlv_6, grammarAccess.getSection2Access().getRightSquareBracketKeyword_1_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1171:1: (this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_MULTI_NL) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==RULE_WS||(LA31_1>=RULE_ID && LA31_1<=RULE_ANY_OTHER)||LA31_1==19||(LA31_1>=33 && LA31_1<=36)||(LA31_1>=39 && LA31_1<=43)||(LA31_1>=45 && LA31_1<=50)) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1171:2: this_MULTI_NL_7= RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_7=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection22416); 
                    	     
                    	        newLeafNode(this_MULTI_NL_7, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_1_3_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1175:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1176:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1176:1: (lv_contents_8_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1177:3: lv_contents_8_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection22436);
                    	    lv_contents_8_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_8_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1193:4: (this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_MULTI_NL) ) {
                            int LA32_1 = input.LA(2);

                            if ( ((LA32_1>=29 && LA32_1<=30)) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1193:5: this_MULTI_NL_9= RULE_MULTI_NL ( (lv_subSections_10_0= ruleSection3 ) )
                    	    {
                    	    this_MULTI_NL_9=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection22450); 
                    	     
                    	        newLeafNode(this_MULTI_NL_9, grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_1_4_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1197:1: ( (lv_subSections_10_0= ruleSection3 ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1198:1: (lv_subSections_10_0= ruleSection3 )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1198:1: (lv_subSections_10_0= ruleSection3 )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1199:3: lv_subSections_10_0= ruleSection3
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection3_in_ruleSection22470);
                    	    lv_subSections_10_0=ruleSection3();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSection2Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSections",
                    	            		lv_subSections_10_0, 
                    	            		"Section3");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSection2Ref"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1223:1: entryRuleSection2Ref returns [EObject current=null] : iv_ruleSection2Ref= ruleSection2Ref EOF ;
    public final EObject entryRuleSection2Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection2Ref = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1224:2: (iv_ruleSection2Ref= ruleSection2Ref EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1225:2: iv_ruleSection2Ref= ruleSection2Ref EOF
            {
             newCompositeNode(grammarAccess.getSection2RefRule()); 
            pushFollow(FOLLOW_ruleSection2Ref_in_entryRuleSection2Ref2509);
            iv_ruleSection2Ref=ruleSection2Ref();

            state._fsp--;

             current =iv_ruleSection2Ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection2Ref2519); 

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
    // $ANTLR end "entryRuleSection2Ref"


    // $ANTLR start "ruleSection2Ref"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1232:1: ruleSection2Ref returns [EObject current=null] : (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleSection2Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1235:28: ( (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1236:1: (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1236:1: (otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1236:3: otherlv_0= 'section2-ref[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSection2Ref2556); 

                	newLeafNode(otherlv_0, grammarAccess.getSection2RefAccess().getSection2RefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1240:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1241:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1241:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1242:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSection2RefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection2Ref2576); 

            		newLeafNode(otherlv_1, grammarAccess.getSection2RefAccess().getSection2Section2CrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSection2Ref2588); 

                	newLeafNode(otherlv_2, grammarAccess.getSection2RefAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection2Ref"


    // $ANTLR start "entryRuleSection3"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1265:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1266:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1267:2: iv_ruleSection3= ruleSection3 EOF
            {
             newCompositeNode(grammarAccess.getSection3Rule()); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection32624);
            iv_ruleSection3=ruleSection3();

            state._fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection32634); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1274:1: ruleSection3 returns [EObject current=null] : ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1277:28: ( ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:1: ( ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:2: ( (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section3[' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            else if ( (LA34_0==30) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:3: (otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1278:5: otherlv_0= 'section3:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSection32673); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection3Access().getSection3Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1282:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1283:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1283:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1284:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection32690); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSection3Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection32707); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1305:7: otherlv_3= 'section3['
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleSection32726); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection3Access().getSection3Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1309:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1310:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1310:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1311:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection32748);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection32760); 

                	newLeafNode(otherlv_5, grammarAccess.getSection3Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1331:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_MULTI_NL) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==RULE_WS||(LA35_1>=RULE_ID && LA35_1<=RULE_ANY_OTHER)||LA35_1==19||(LA35_1>=33 && LA35_1<=36)||(LA35_1>=39 && LA35_1<=43)||(LA35_1>=45 && LA35_1<=50)) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1331:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection32772); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1335:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1336:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1336:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1337:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection32792);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_7_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1353:4: (this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_MULTI_NL) ) {
                    int LA36_1 = input.LA(2);

                    if ( ((LA36_1>=31 && LA36_1<=32)) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1353:5: this_MULTI_NL_8= RULE_MULTI_NL ( (lv_subSections_9_0= ruleSection4 ) )
            	    {
            	    this_MULTI_NL_8=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection32806); 
            	     
            	        newLeafNode(this_MULTI_NL_8, grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1357:1: ( (lv_subSections_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1358:1: (lv_subSections_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1358:1: (lv_subSections_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1359:3: lv_subSections_9_0= ruleSection4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection32826);
            	    lv_subSections_9_0=ruleSection4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subSections",
            	            		lv_subSections_9_0, 
            	            		"Section4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1383:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1384:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1385:2: iv_ruleSection4= ruleSection4 EOF
            {
             newCompositeNode(grammarAccess.getSection4Rule()); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection42864);
            iv_ruleSection4=ruleSection4();

            state._fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection42874); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1392:1: ruleSection4 returns [EObject current=null] : ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1395:28: ( ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:1: ( ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' ) ( (lv_title_4_0= ruleTextOrMarkup ) ) otherlv_5= ']' (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:2: ( (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ) | otherlv_3= 'section4[' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            else if ( (LA37_0==32) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:3: (otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1396:5: otherlv_0= 'section4:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '['
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSection42913); 

                        	newLeafNode(otherlv_0, grammarAccess.getSection4Access().getSection4Keyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1400:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1401:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1401:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1402:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection42930); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSection4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSection42947); 

                        	newLeafNode(otherlv_2, grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1423:7: otherlv_3= 'section4['
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleSection42966); 

                        	newLeafNode(otherlv_3, grammarAccess.getSection4Access().getSection4Keyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1427:2: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1428:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1428:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1429:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        newCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection42988);
            lv_title_4_0=ruleTextOrMarkup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSection4Rule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"TextOrMarkup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleSection43000); 

                	newLeafNode(otherlv_5, grammarAccess.getSection4Access().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1449:1: (this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_MULTI_NL) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_WS||(LA38_1>=RULE_ID && LA38_1<=RULE_ANY_OTHER)||LA38_1==19||(LA38_1>=33 && LA38_1<=36)||(LA38_1>=39 && LA38_1<=43)||(LA38_1>=45 && LA38_1<=50)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1449:2: this_MULTI_NL_6= RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    this_MULTI_NL_6=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection43012); 
            	     
            	        newLeafNode(this_MULTI_NL_6, grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1453:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1454:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1454:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1455:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection43032);
            	    lv_contents_7_0=ruleTextOrMarkup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSection4Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_7_0, 
            	            		"TextOrMarkup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1479:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1480:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1481:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             newCompositeNode(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup3070);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();

            state._fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup3080); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1488:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1491:28: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_WS||(LA43_0>=RULE_ID && LA43_0<=RULE_ANY_OTHER)||LA43_0==19||(LA43_0>=33 && LA43_0<=35)) ) {
                alt43=1;
            }
            else if ( (LA43_0==36||(LA43_0>=39 && LA43_0<=43)||(LA43_0>=45 && LA43_0<=50)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1492:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1493:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1493:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1494:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup3127);
                    lv_contents_0_0=ruleTextPart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_0_0, 
                            		"TextPart");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==36||(LA40_0>=39 && LA40_0<=43)||(LA40_0>=45 && LA40_0<=50)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1510:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1511:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1511:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1512:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup3149);
                    	    lv_contents_1_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_1_0, 
                    	            		"MarkUp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1528:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==RULE_WS||(LA39_0>=RULE_ID && LA39_0<=RULE_ANY_OTHER)||LA39_0==19||(LA39_0>=33 && LA39_0<=35)) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1529:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1529:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1530:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup3170);
                    	            lv_contents_2_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_2_0, 
                    	                    		"TextPart");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==36||(LA42_0>=39 && LA42_0<=43)||(LA42_0>=45 && LA42_0<=50)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1547:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1548:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1548:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1549:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup3202);
                    	    lv_contents_3_0=ruleMarkUp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_3_0, 
                    	            		"MarkUp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1565:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==RULE_WS||(LA41_0>=RULE_ID && LA41_0<=RULE_ANY_OTHER)||LA41_0==19||(LA41_0>=33 && LA41_0<=35)) ) {
                    	        alt41=1;
                    	    }
                    	    switch (alt41) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1566:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1566:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1567:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup3223);
                    	            lv_contents_4_0=ruleTextPart();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTextOrMarkupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_4_0, 
                    	                    		"TextPart");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1591:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1592:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1593:2: iv_ruleTextPart= ruleTextPart EOF
            {
             newCompositeNode(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart3262);
            iv_ruleTextPart=ruleTextPart();

            state._fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart3272); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1600:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1603:28: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1604:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1604:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1605:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1605:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1606:3: lv_text_0_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart3317);
            lv_text_0_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextPartRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1630:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1631:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1632:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3353);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3364); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1639:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1642:28: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1643:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1643:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt44=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt44=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt44=4;
                    }
                    break;
                case 33:
                    {
                    alt44=5;
                    }
                    break;
                case 34:
                    {
                    alt44=6;
                    }
                    break;
                case 19:
                    {
                    alt44=7;
                    }
                    break;
                case 35:
                    {
                    alt44=8;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1643:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText3404); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1651:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText3430); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1659:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText3456); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_2, grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1667:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText3482); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_3, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1676:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleText3506); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1683:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleText3525); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1690:2: kw= ','
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleText3544); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getCommaKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1697:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleText3563); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTextAccess().getHyphenMinusKeyword_7()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleUnpunctText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1710:1: entryRuleUnpunctText returns [String current=null] : iv_ruleUnpunctText= ruleUnpunctText EOF ;
    public final String entryRuleUnpunctText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnpunctText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1711:2: (iv_ruleUnpunctText= ruleUnpunctText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1712:2: iv_ruleUnpunctText= ruleUnpunctText EOF
            {
             newCompositeNode(grammarAccess.getUnpunctTextRule()); 
            pushFollow(FOLLOW_ruleUnpunctText_in_entryRuleUnpunctText3605);
            iv_ruleUnpunctText=ruleUnpunctText();

            state._fsp--;

             current =iv_ruleUnpunctText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnpunctText3616); 

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
    // $ANTLR end "entryRuleUnpunctText"


    // $ANTLR start "ruleUnpunctText"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1719:1: ruleUnpunctText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+ (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )* ) ;
    public final AntlrDatatypeRuleToken ruleUnpunctText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token kw=null;
        Token this_WS_5=null;
        Token this_ID_6=null;
        Token this_ANY_OTHER_7=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1722:28: ( ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+ (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:1: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+ (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:1: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+ (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+ (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )*
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt45=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt45=2;
                    }
                    break;
                case 33:
                    {
                    alt45=3;
                    }
                    break;
                case 34:
                    {
                    alt45=4;
                    }
                    break;
                case 35:
                    {
                    alt45=5;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1723:7: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnpunctText3657); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getUnpunctTextAccess().getIDTerminalRuleCall_0_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1731:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleUnpunctText3683); 

            	    		current.merge(this_ANY_OTHER_1);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_1, grammarAccess.getUnpunctTextAccess().getANY_OTHERTerminalRuleCall_0_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1740:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleUnpunctText3707); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getReverseSolidusLeftSquareBracketKeyword_0_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1747:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleUnpunctText3726); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getReverseSolidusRightSquareBracketKeyword_0_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1754:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleUnpunctText3745); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getHyphenMinusKeyword_0_4()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1759:3: (this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_WS) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_ID||LA47_2==RULE_ANY_OTHER||(LA47_2>=33 && LA47_2<=35)) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1759:8: this_WS_5= RULE_WS (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleUnpunctText3763); 

            	    		current.merge(this_WS_5);
            	        
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getUnpunctTextAccess().getWSTerminalRuleCall_1_0()); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1766:1: (this_ID_6= RULE_ID | this_ANY_OTHER_7= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= '-' )
            	    int alt46=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case RULE_ANY_OTHER:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt46=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt46=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt46=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt46) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1766:6: this_ID_6= RULE_ID
            	            {
            	            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnpunctText3784); 

            	            		current.merge(this_ID_6);
            	                
            	             
            	                newLeafNode(this_ID_6, grammarAccess.getUnpunctTextAccess().getIDTerminalRuleCall_1_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1774:10: this_ANY_OTHER_7= RULE_ANY_OTHER
            	            {
            	            this_ANY_OTHER_7=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleUnpunctText3810); 

            	            		current.merge(this_ANY_OTHER_7);
            	                
            	             
            	                newLeafNode(this_ANY_OTHER_7, grammarAccess.getUnpunctTextAccess().getANY_OTHERTerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1783:2: kw= '\\\\['
            	            {
            	            kw=(Token)match(input,33,FOLLOW_33_in_ruleUnpunctText3834); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getReverseSolidusLeftSquareBracketKeyword_1_1_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1790:2: kw= '\\\\]'
            	            {
            	            kw=(Token)match(input,34,FOLLOW_34_in_ruleUnpunctText3853); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getReverseSolidusRightSquareBracketKeyword_1_1_3()); 
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1797:2: kw= '-'
            	            {
            	            kw=(Token)match(input,35,FOLLOW_35_in_ruleUnpunctText3872); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getUnpunctTextAccess().getHyphenMinusKeyword_1_1_4()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnpunctText"


    // $ANTLR start "entryRuleMarkUp"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1810:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1811:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1812:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             newCompositeNode(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp3915);
            iv_ruleMarkUp=ruleMarkUp();

            state._fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp3925); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1819:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) ;
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


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1822:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1823:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1823:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef | this_Table_9= ruleTable | this_Todo_10= ruleTodo )
            int alt48=11;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt48=1;
                }
                break;
            case 40:
                {
                alt48=2;
                }
                break;
            case 41:
                {
                alt48=3;
                }
                break;
            case 42:
                {
                alt48=4;
                }
                break;
            case 43:
                {
                alt48=5;
                }
                break;
            case 49:
                {
                alt48=6;
                }
                break;
            case 45:
                {
                alt48=7;
                }
                break;
            case 46:
                {
                alt48=8;
                }
                break;
            case 47:
            case 48:
                {
                alt48=9;
                }
                break;
            case 36:
                {
                alt48=10;
                }
                break;
            case 50:
                {
                alt48=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1824:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp3972);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1834:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp3999);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1844:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp4026);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1854:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp4053);
                    this_OrderedList_3=ruleOrderedList();

                    state._fsp--;

                     
                            current = this_OrderedList_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1864:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp4080);
                    this_UnorderedList_4=ruleUnorderedList();

                    state._fsp--;

                     
                            current = this_UnorderedList_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1874:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp4107);
                    this_CodeBlock_5=ruleCodeBlock();

                    state._fsp--;

                     
                            current = this_CodeBlock_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1884:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp4134);
                    this_CodeRef_6=ruleCodeRef();

                    state._fsp--;

                     
                            current = this_CodeRef_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1894:5: this_Link_7= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp4161);
                    this_Link_7=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1904:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp4188);
                    this_ImageRef_8=ruleImageRef();

                    state._fsp--;

                     
                            current = this_ImageRef_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1914:5: this_Table_9= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTableParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTable_in_ruleMarkUp4215);
                    this_Table_9=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1924:5: this_Todo_10= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkUpAccess().getTodoParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkUp4242);
                    this_Todo_10=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1940:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1941:2: (iv_ruleTable= ruleTable EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1942:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable4277);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable4287); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1949:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1952:28: ( ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1953:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1953:1: ( () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1953:2: () otherlv_1= 'table[' ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1953:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1954:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableAccess().getTableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleTable4333); 

                	newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1963:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1963:2: ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1963:2: ( ruleANY_WS )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( ((LA49_0>=RULE_WS && LA49_0<=RULE_MULTI_NL)||LA49_0==RULE_SINGLE_NL) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1964:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable4351);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1971:3: ( (lv_rows_3_0= ruleTableRow ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1972:1: (lv_rows_3_0= ruleTableRow )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1972:1: (lv_rows_3_0= ruleTableRow )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1973:3: lv_rows_3_0= ruleTableRow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTable4373);
            	    lv_rows_3_0=ruleTableRow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_3_0, 
            	            		"TableRow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1989:4: ( ruleANY_WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_MULTI_NL)||LA51_0==RULE_SINGLE_NL) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:1990:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTable4392);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTable4405); 

                	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2009:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2010:2: (iv_ruleTableRow= ruleTableRow EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2011:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_ruleTableRow_in_entryRuleTableRow4441);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableRow4451); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2018:1: ruleTableRow returns [EObject current=null] : ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_data_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2021:28: ( ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2022:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2022:1: ( () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2022:2: () otherlv_1= 'tr[' ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2022:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2023:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableRowAccess().getTableRowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleTableRow4497); 

                	newLeafNode(otherlv_1, grammarAccess.getTableRowAccess().getTrKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2032:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2032:2: ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2032:2: ( ruleANY_WS )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_MULTI_NL)||LA52_0==RULE_SINGLE_NL) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2033:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow4515);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2040:3: ( (lv_data_3_0= ruleTableData ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2041:1: (lv_data_3_0= ruleTableData )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2041:1: (lv_data_3_0= ruleTableData )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2042:3: lv_data_3_0= ruleTableData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableRowAccess().getDataTableDataParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableData_in_ruleTableRow4537);
            	    lv_data_3_0=ruleTableData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_3_0, 
            	            		"TableData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2058:4: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_MULTI_NL)||LA54_0==RULE_SINGLE_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2059:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTableRowAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleTableRow4556);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleTableRow4569); 

                	newLeafNode(otherlv_5, grammarAccess.getTableRowAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2078:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2079:2: (iv_ruleTableData= ruleTableData EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2080:2: iv_ruleTableData= ruleTableData EOF
            {
             newCompositeNode(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData4605);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData4615); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2087:1: ruleTableData returns [EObject current=null] : ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleTableData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2090:28: ( ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2091:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2091:1: ( () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2091:2: () otherlv_1= 'td[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2091:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2092:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableDataAccess().getTableDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTableData4661); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDataAccess().getTdKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2101:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_ANY_OTHER)||LA57_0==19||(LA57_0>=33 && LA57_0<=36)||(LA57_0>=39 && LA57_0<=43)||(LA57_0>=45 && LA57_0<=50)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2101:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2101:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_MULTI_NL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2101:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData4674); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2105:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2106:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2106:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2107:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData4696);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_MULTI_NL) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2123:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleTableData4708); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getTableDataAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2127:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2128:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2128:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2129:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableDataAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleTableData4728);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_5_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleTableData4744); 

                	newLeafNode(otherlv_6, grammarAccess.getTableDataAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2157:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2158:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2159:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             newCompositeNode(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize4780);
            iv_ruleEmphasize=ruleEmphasize();

            state._fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize4790); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2166:1: ruleEmphasize returns [EObject current=null] : ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_5=null;
        EObject lv_contents_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2169:28: ( ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2170:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2170:1: ( () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2170:2: () otherlv_1= 'e[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )? otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2170:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2171:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEmphasizeAccess().getEmphasizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEmphasize4836); 

                	newLeafNode(otherlv_1, grammarAccess.getEmphasizeAccess().getEKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2180:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_WS && LA60_0<=RULE_ANY_OTHER)||LA60_0==19||(LA60_0>=33 && LA60_0<=36)||(LA60_0>=39 && LA60_0<=43)||(LA60_0>=45 && LA60_0<=50)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2180:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2180:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_MULTI_NL) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2180:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize4849); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2184:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2185:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2185:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2186:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize4871);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEmphasizeRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2202:2: (this_MULTI_NL_4= RULE_MULTI_NL )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_MULTI_NL) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2202:3: this_MULTI_NL_4= RULE_MULTI_NL
                            {
                            this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize4883); 
                             
                                newLeafNode(this_MULTI_NL_4, grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2_2()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleEmphasize4898); 

                	newLeafNode(otherlv_5, grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2218:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2219:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2220:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor4934);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor4944); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2227:1: ruleAnchor returns [EObject current=null] : (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2230:28: ( (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2231:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2231:1: (otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2231:3: otherlv_0= 'a[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleAnchor4981); 

                	newLeafNode(otherlv_0, grammarAccess.getAnchorAccess().getAKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2235:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2236:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2236:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2237:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor4998); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnchorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleAnchor5015); 

                	newLeafNode(otherlv_2, grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2265:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2266:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2267:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef5051);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef5061); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2274:1: ruleRef returns [EObject current=null] : (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_MULTI_NL_3=null;
        Token this_MULTI_NL_5=null;
        Token otherlv_6=null;
        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2277:28: ( (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2278:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2278:1: (otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2278:3: otherlv_0= 'ref:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleRef5098); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2282:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2283:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2283:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2284:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef5118); 

            		newLeafNode(otherlv_1, grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            	

            }


            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2295:2: (otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==15) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2295:4: otherlv_2= '[' (this_MULTI_NL_3= RULE_MULTI_NL )? ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRef5131); 

                        	newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2299:1: (this_MULTI_NL_3= RULE_MULTI_NL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_MULTI_NL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2299:2: this_MULTI_NL_3= RULE_MULTI_NL
                            {
                            this_MULTI_NL_3=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef5143); 
                             
                                newLeafNode(this_MULTI_NL_3, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_1()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2303:3: ( ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )? )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_WS||(LA63_0>=RULE_ID && LA63_0<=RULE_ANY_OTHER)||LA63_0==19||(LA63_0>=33 && LA63_0<=36)||(LA63_0>=39 && LA63_0<=43)||(LA63_0>=45 && LA63_0<=50)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2303:4: ( (lv_contents_4_0= ruleTextOrMarkup ) ) (this_MULTI_NL_5= RULE_MULTI_NL )?
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2303:4: ( (lv_contents_4_0= ruleTextOrMarkup ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2304:1: (lv_contents_4_0= ruleTextOrMarkup )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2304:1: (lv_contents_4_0= ruleTextOrMarkup )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2305:3: lv_contents_4_0= ruleTextOrMarkup
                            {
                             
                            	        newCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_2_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef5166);
                            lv_contents_4_0=ruleTextOrMarkup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"contents",
                                    		lv_contents_4_0, 
                                    		"TextOrMarkup");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2321:2: (this_MULTI_NL_5= RULE_MULTI_NL )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==RULE_MULTI_NL) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2321:3: this_MULTI_NL_5= RULE_MULTI_NL
                                    {
                                    this_MULTI_NL_5=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef5178); 
                                     
                                        newLeafNode(this_MULTI_NL_5, grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_2_2_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleRef5193); 

                        	newLeafNode(otherlv_6, grammarAccess.getRefAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2337:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2338:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2339:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             newCompositeNode(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList5231);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList5241); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2346:1: ruleOrderedList returns [EObject current=null] : ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2349:28: ( ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2350:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2350:1: ( () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2350:2: () otherlv_1= 'ol[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2350:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrderedListAccess().getOrderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOrderedList5287); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderedListAccess().getOlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2360:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2360:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2360:2: ( ruleANY_WS )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( ((LA65_0>=RULE_WS && LA65_0<=RULE_MULTI_NL)||LA65_0==RULE_SINGLE_NL) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2361:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList5305);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2368:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2369:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2369:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2370:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList5327);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2386:4: ( ruleANY_WS )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_WS && LA67_0<=RULE_MULTI_NL)||LA67_0==RULE_SINGLE_NL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2387:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList5346);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleOrderedList5359); 

                	newLeafNode(otherlv_5, grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2406:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2407:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2408:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList5395);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList5405); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2415:1: ruleUnorderedList returns [EObject current=null] : ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2418:28: ( ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:1: ( () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:2: () otherlv_1= 'ul[' ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )* ( ruleANY_WS )* otherlv_5= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2419:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2420:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnorderedListAccess().getUnorderedListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleUnorderedList5451); 

                	newLeafNode(otherlv_1, grammarAccess.getUnorderedListAccess().getUlKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*
            loop69:
            do {
                int alt69=2;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:2: ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2429:2: ( ruleANY_WS )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( ((LA68_0>=RULE_WS && LA68_0<=RULE_MULTI_NL)||LA68_0==RULE_SINGLE_NL) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2430:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList5469);
            	    	    ruleANY_WS();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop68;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2437:3: ( (lv_items_3_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2438:1: (lv_items_3_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2438:1: (lv_items_3_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2439:3: lv_items_3_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList5491);
            	    lv_items_3_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2455:4: ( ruleANY_WS )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_WS && LA70_0<=RULE_MULTI_NL)||LA70_0==RULE_SINGLE_NL) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2456:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList5510);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleUnorderedList5523); 

                	newLeafNode(otherlv_5, grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2475:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2476:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2477:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem5559);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem5569); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2484:1: ruleItem returns [EObject current=null] : ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_MULTI_NL_2=null;
        Token this_MULTI_NL_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2487:28: ( ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2488:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2488:1: ( () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2488:2: () otherlv_1= 'item[' ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )? otherlv_6= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2488:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2489:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getItemAccess().getItemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleItem5615); 

                	newLeafNode(otherlv_1, grammarAccess.getItemAccess().getItemKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:1: ( (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_WS && LA73_0<=RULE_ANY_OTHER)||LA73_0==19||(LA73_0>=33 && LA73_0<=36)||(LA73_0>=39 && LA73_0<=43)||(LA73_0>=45 && LA73_0<=50)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:2: (this_MULTI_NL_2= RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:2: (this_MULTI_NL_2= RULE_MULTI_NL )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_MULTI_NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2498:3: this_MULTI_NL_2= RULE_MULTI_NL
                            {
                            this_MULTI_NL_2=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem5628); 
                             
                                newLeafNode(this_MULTI_NL_2, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_0()); 
                                

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2502:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2503:1: (lv_contents_3_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2503:1: (lv_contents_3_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2504:3: lv_contents_3_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem5650);
                    lv_contents_3_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_3_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2520:2: (this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_MULTI_NL) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2520:3: this_MULTI_NL_4= RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    {
                    	    this_MULTI_NL_4=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem5662); 
                    	     
                    	        newLeafNode(this_MULTI_NL_4, grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2524:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2525:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2525:1: (lv_contents_5_0= ruleTextOrMarkup )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2526:3: lv_contents_5_0= ruleTextOrMarkup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem5682);
                    	    lv_contents_5_0=ruleTextOrMarkup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_5_0, 
                    	            		"TextOrMarkup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleItem5698); 

                	newLeafNode(otherlv_6, grammarAccess.getItemAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2554:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2555:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2556:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             newCompositeNode(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef5734);
            iv_ruleCodeRef=ruleCodeRef();

            state._fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef5744); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2563:1: ruleCodeRef returns [EObject current=null] : ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_altText_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2566:28: ( ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2567:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2567:1: ( () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2567:2: () otherlv_1= 'codeRef[' ( ( ruleText ) )? otherlv_3= ']' (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2567:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2568:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeRefAccess().getCodeRefAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleCodeRef5790); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeRefAccess().getCodeRefKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2577:1: ( ( ruleText ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_WS||(LA74_0>=RULE_ID && LA74_0<=RULE_ANY_OTHER)||LA74_0==19||(LA74_0>=33 && LA74_0<=35)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2578:1: ( ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2578:1: ( ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2579:3: ruleText
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeRefRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmDeclaredTypeCrossReference_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleCodeRef5813);
                    ruleText();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleCodeRef5826); 

                	newLeafNode(otherlv_3, grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2596:1: (otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==15) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2596:3: otherlv_4= '[' ( (lv_altText_5_0= ruleTextOrMarkup ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCodeRef5839); 

                        	newLeafNode(otherlv_4, grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2600:1: ( (lv_altText_5_0= ruleTextOrMarkup ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2601:1: (lv_altText_5_0= ruleTextOrMarkup )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2601:1: (lv_altText_5_0= ruleTextOrMarkup )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2602:3: lv_altText_5_0= ruleTextOrMarkup
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodeRefAccess().getAltTextTextOrMarkupParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleCodeRef5860);
                    lv_altText_5_0=ruleTextOrMarkup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodeRefRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_5_0, 
                            		"TextOrMarkup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleCodeRef5872); 

                        	newLeafNode(otherlv_6, grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_4_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2630:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2631:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2632:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink5910);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink5920); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2639:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_text_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2642:28: ( ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:1: ( () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:2: () otherlv_1= 'link[' ( (lv_url_2_0= ruleText ) )? otherlv_3= ']' ( ruleANY_WS )* otherlv_5= '[' ( (lv_text_6_0= ruleText ) )? otherlv_7= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2643:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2644:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkAccess().getLinkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleLink5966); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2653:1: ( (lv_url_2_0= ruleText ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_WS||(LA76_0>=RULE_ID && LA76_0<=RULE_ANY_OTHER)||LA76_0==19||(LA76_0>=33 && LA76_0<=35)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2654:1: (lv_url_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2654:1: (lv_url_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2655:3: lv_url_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink5987);
                    lv_url_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_2_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleLink6000); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2675:1: ( ruleANY_WS )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_WS && LA77_0<=RULE_MULTI_NL)||LA77_0==RULE_SINGLE_NL) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2676:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink6017);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLink6030); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_5());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2687:1: ( (lv_text_6_0= ruleText ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_WS||(LA78_0>=RULE_ID && LA78_0<=RULE_ANY_OTHER)||LA78_0==19||(LA78_0>=33 && LA78_0<=35)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2688:1: (lv_text_6_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2688:1: (lv_text_6_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2689:3: lv_text_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleLink6051);
                    lv_text_6_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_6_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleLink6064); 

                	newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2717:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2718:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2719:2: iv_ruleImageRef= ruleImageRef EOF
            {
             newCompositeNode(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef6100);
            iv_ruleImageRef=ruleImageRef();

            state._fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef6110); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2726:1: ruleImageRef returns [EObject current=null] : ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) ;
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

        AntlrDatatypeRuleToken lv_caption_10_0 = null;

        AntlrDatatypeRuleToken lv_clazz_14_0 = null;

        AntlrDatatypeRuleToken lv_style_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2729:28: ( ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:1: ( ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' ) ( (lv_path_6_0= ruleText ) ) otherlv_7= ']' ( ruleANY_WS )* otherlv_9= '[' ( (lv_caption_10_0= ruleText ) )? otherlv_11= ']' ( ruleANY_WS )* otherlv_13= '[' ( (lv_clazz_14_0= ruleText ) )? otherlv_15= ']' ( ruleANY_WS )* otherlv_17= '[' ( (lv_style_18_0= ruleText ) )? otherlv_19= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:2: ( (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' ) | otherlv_5= 'img[' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==47) ) {
                alt81=1;
            }
            else if ( (LA81_0==48) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:3: (otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '[' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2730:5: otherlv_0= 'img:' ( ruleANY_WS )* ( (lv_name_2_0= RULE_ID ) ) ( ruleANY_WS )* otherlv_4= '['
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleImageRef6149); 

                        	newLeafNode(otherlv_0, grammarAccess.getImageRefAccess().getImgKeyword_0_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2734:1: ( ruleANY_WS )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=RULE_WS && LA79_0<=RULE_MULTI_NL)||LA79_0==RULE_SINGLE_NL) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2735:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef6166);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2742:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2743:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2743:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2744:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef6184); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2760:2: ( ruleANY_WS )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=RULE_WS && LA80_0<=RULE_MULTI_NL)||LA80_0==RULE_SINGLE_NL) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2761:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef6206);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImageRef6219); 

                        	newLeafNode(otherlv_4, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2773:7: otherlv_5= 'img['
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleImageRef6238); 

                        	newLeafNode(otherlv_5, grammarAccess.getImageRefAccess().getImgKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2777:2: ( (lv_path_6_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2778:1: (lv_path_6_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2778:1: (lv_path_6_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2779:3: lv_path_6_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef6260);
            lv_path_6_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRefRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_6_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleImageRef6272); 

                	newLeafNode(otherlv_7, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2799:1: ( ruleANY_WS )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=RULE_WS && LA82_0<=RULE_MULTI_NL)||LA82_0==RULE_SINGLE_NL) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2800:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef6289);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleImageRef6302); 

                	newLeafNode(otherlv_9, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2811:1: ( (lv_caption_10_0= ruleText ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_WS||(LA83_0>=RULE_ID && LA83_0<=RULE_ANY_OTHER)||LA83_0==19||(LA83_0>=33 && LA83_0<=35)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:1: (lv_caption_10_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2812:1: (lv_caption_10_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2813:3: lv_caption_10_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef6323);
                    lv_caption_10_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"caption",
                            		lv_caption_10_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,11,FOLLOW_11_in_ruleImageRef6336); 

                	newLeafNode(otherlv_11, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2833:1: ( ruleANY_WS )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=RULE_WS && LA84_0<=RULE_MULTI_NL)||LA84_0==RULE_SINGLE_NL) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2834:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef6353);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleImageRef6366); 

                	newLeafNode(otherlv_13, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2845:1: ( (lv_clazz_14_0= ruleText ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_WS||(LA85_0>=RULE_ID && LA85_0<=RULE_ANY_OTHER)||LA85_0==19||(LA85_0>=33 && LA85_0<=35)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2846:1: (lv_clazz_14_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2846:1: (lv_clazz_14_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2847:3: lv_clazz_14_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef6387);
                    lv_clazz_14_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"clazz",
                            		lv_clazz_14_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,11,FOLLOW_11_in_ruleImageRef6400); 

                	newLeafNode(otherlv_15, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2867:1: ( ruleANY_WS )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=RULE_WS && LA86_0<=RULE_MULTI_NL)||LA86_0==RULE_SINGLE_NL) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2868:5: ruleANY_WS
            	    {
            	     
            	            newCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef6417);
            	    ruleANY_WS();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleImageRef6430); 

                	newLeafNode(otherlv_17, grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2879:1: ( (lv_style_18_0= ruleText ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_WS||(LA87_0>=RULE_ID && LA87_0<=RULE_ANY_OTHER)||LA87_0==19||(LA87_0>=33 && LA87_0<=35)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2880:1: (lv_style_18_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2880:1: (lv_style_18_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2881:3: lv_style_18_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_13_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleImageRef6451);
                    lv_style_18_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRefRule());
                    	        }
                           		set(
                           			current, 
                           			"style",
                            		lv_style_18_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,11,FOLLOW_11_in_ruleImageRef6464); 

                	newLeafNode(otherlv_19, grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2909:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2910:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2911:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock6500);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock6510); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2918:1: ruleCodeBlock returns [EObject current=null] : ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;

        EObject lv_contents_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2921:28: ( ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2922:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2922:1: ( () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2922:2: () otherlv_1= 'code[' ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )? ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )? otherlv_13= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2922:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCodeBlockAccess().getCodeBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleCodeBlock6556); 

                	newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getCodeKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:2: ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '['
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2932:2: ( ruleANY_WS )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( ((LA88_0>=RULE_WS && LA88_0<=RULE_MULTI_NL)||LA88_0==RULE_SINGLE_NL) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2933:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock6574);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2940:3: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2941:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2941:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2942:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCodeBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock6595); 

                    		newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getLanguageLangDefCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2953:2: ( ruleANY_WS )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( ((LA89_0>=RULE_WS && LA89_0<=RULE_MULTI_NL)||LA89_0==RULE_SINGLE_NL) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2954:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock6612);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock6625); 

                        	newLeafNode(otherlv_5, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_3());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2965:1: ( ruleANY_WS )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( ((LA90_0>=RULE_WS && LA90_0<=RULE_MULTI_NL)||LA90_0==RULE_SINGLE_NL) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2966:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_4()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock6642);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCodeBlock6655); 

                        	newLeafNode(otherlv_7, grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2977:3: ( ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* ) | ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+ )?
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_WS && LA96_0<=RULE_ANY_OTHER)||LA96_0==19||(LA96_0>=33 && LA96_0<=35)) ) {
                alt96=1;
            }
            else if ( ((LA96_0>=39 && LA96_0<=41)||LA96_0==50) ) {
                alt96=2;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2977:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2977:4: ( ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2977:5: ( (lv_contents_8_0= ruleCode ) ) ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2977:5: ( (lv_contents_8_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2978:1: (lv_contents_8_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2978:1: (lv_contents_8_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2979:3: lv_contents_8_0= ruleCode
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock6680);
                    lv_contents_8_0=ruleCode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_8_0, 
                            		"Code");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:2: ( ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )? )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=39 && LA93_0<=41)||LA93_0==50) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:3: ( (lv_contents_9_0= ruleMarkupInCode ) ) ( (lv_contents_10_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2995:3: ( (lv_contents_9_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2996:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2996:1: (lv_contents_9_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:2997:3: lv_contents_9_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock6702);
                    	    lv_contents_9_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_9_0, 
                    	            		"MarkupInCode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3013:2: ( (lv_contents_10_0= ruleCode ) )?
                    	    int alt92=2;
                    	    int LA92_0 = input.LA(1);

                    	    if ( ((LA92_0>=RULE_WS && LA92_0<=RULE_ANY_OTHER)||LA92_0==19||(LA92_0>=33 && LA92_0<=35)) ) {
                    	        alt92=1;
                    	    }
                    	    switch (alt92) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3014:1: (lv_contents_10_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3014:1: (lv_contents_10_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3015:3: lv_contents_10_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock6723);
                    	            lv_contents_10_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_10_0, 
                    	                    		"Code");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3032:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3032:6: ( ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )? )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( ((LA95_0>=39 && LA95_0<=41)||LA95_0==50) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3032:7: ( (lv_contents_11_0= ruleMarkupInCode ) ) ( (lv_contents_12_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3032:7: ( (lv_contents_11_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3033:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3033:1: (lv_contents_11_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3034:3: lv_contents_11_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_3_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock6755);
                    	    lv_contents_11_0=ruleMarkupInCode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_11_0, 
                    	            		"MarkupInCode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3050:2: ( (lv_contents_12_0= ruleCode ) )?
                    	    int alt94=2;
                    	    int LA94_0 = input.LA(1);

                    	    if ( ((LA94_0>=RULE_WS && LA94_0<=RULE_ANY_OTHER)||LA94_0==19||(LA94_0>=33 && LA94_0<=35)) ) {
                    	        alt94=1;
                    	    }
                    	    switch (alt94) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3051:1: (lv_contents_12_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3051:1: (lv_contents_12_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3052:3: lv_contents_12_0= ruleCode
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock6776);
                    	            lv_contents_12_0=ruleCode();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getCodeBlockRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"contents",
                    	                    		lv_contents_12_0, 
                    	                    		"Code");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }


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
                    break;

            }

            otherlv_13=(Token)match(input,11,FOLLOW_11_in_ruleCodeBlock6793); 

                	newLeafNode(otherlv_13, grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3080:1: entryRuleTodo returns [EObject current=null] : iv_ruleTodo= ruleTodo EOF ;
    public final EObject entryRuleTodo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTodo = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3081:2: (iv_ruleTodo= ruleTodo EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3082:2: iv_ruleTodo= ruleTodo EOF
            {
             newCompositeNode(grammarAccess.getTodoRule()); 
            pushFollow(FOLLOW_ruleTodo_in_entryRuleTodo6829);
            iv_ruleTodo=ruleTodo();

            state._fsp--;

             current =iv_ruleTodo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTodo6839); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3089:1: ruleTodo returns [EObject current=null] : ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) ;
    public final EObject ruleTodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3092:28: ( ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3093:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3093:1: ( () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3093:2: () otherlv_1= 'todo[' ( (lv_text_2_0= ruleText ) )? otherlv_3= ']'
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3093:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTodoAccess().getTodoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleTodo6885); 

                	newLeafNode(otherlv_1, grammarAccess.getTodoAccess().getTodoKeyword_1());
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3103:1: ( (lv_text_2_0= ruleText ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_WS||(LA97_0>=RULE_ID && LA97_0<=RULE_ANY_OTHER)||LA97_0==19||(LA97_0>=33 && LA97_0<=35)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3104:1: (lv_text_2_0= ruleText )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3104:1: (lv_text_2_0= ruleText )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3105:3: lv_text_2_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getTodoAccess().getTextTextParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleTodo6906);
                    lv_text_2_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTodoRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_2_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleTodo6919); 

                	newLeafNode(otherlv_3, grammarAccess.getTodoAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3133:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3134:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3135:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode6955);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode6965); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3142:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3145:28: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3146:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3146:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3147:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3147:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3148:3: lv_contents_0_0= ruleCodeText
            {
             
            	        newCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode7010);
            lv_contents_0_0=ruleCodeText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	        }
                   		set(
                   			current, 
                   			"contents",
                    		lv_contents_0_0, 
                    		"CodeText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3172:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3173:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3174:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             newCompositeNode(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode7045);
            iv_ruleMarkupInCode=ruleMarkupInCode();

            state._fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode7055); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3181:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;

        EObject this_Todo_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3184:28: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3185:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3185:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_Todo_3= ruleTodo )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt98=1;
                }
                break;
            case 40:
                {
                alt98=2;
                }
                break;
            case 41:
                {
                alt98=3;
                }
                break;
            case 50:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3186:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode7102);
                    this_Emphasize_0=ruleEmphasize();

                    state._fsp--;

                     
                            current = this_Emphasize_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3196:5: this_Anchor_1= ruleAnchor
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode7129);
                    this_Anchor_1=ruleAnchor();

                    state._fsp--;

                     
                            current = this_Anchor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3206:5: this_Ref_2= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode7156);
                    this_Ref_2=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3216:5: this_Todo_3= ruleTodo
                    {
                     
                            newCompositeNode(grammarAccess.getMarkupInCodeAccess().getTodoParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTodo_in_ruleMarkupInCode7183);
                    this_Todo_3=ruleTodo();

                    state._fsp--;

                     
                            current = this_Todo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3232:1: entryRuleLangDef returns [EObject current=null] : iv_ruleLangDef= ruleLangDef EOF ;
    public final EObject entryRuleLangDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLangDef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3233:2: (iv_ruleLangDef= ruleLangDef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3234:2: iv_ruleLangDef= ruleLangDef EOF
            {
             newCompositeNode(grammarAccess.getLangDefRule()); 
            pushFollow(FOLLOW_ruleLangDef_in_entryRuleLangDef7218);
            iv_ruleLangDef=ruleLangDef();

            state._fsp--;

             current =iv_ruleLangDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLangDef7228); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3241:1: ruleLangDef returns [EObject current=null] : ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) ) ;
    public final EObject ruleLangDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_keywords_6_0 = null;

        AntlrDatatypeRuleToken lv_keywords_10_0 = null;

        AntlrDatatypeRuleToken lv_keywords_16_0 = null;

        AntlrDatatypeRuleToken lv_keywords_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3244:28: ( ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3245:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3245:1: ( (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' ) | ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==51) ) {
                int LA112_1 = input.LA(2);

                if ( ((LA112_1>=RULE_WS && LA112_1<=RULE_MULTI_NL)||LA112_1==RULE_SINGLE_NL||LA112_1==11||LA112_1==35) ) {
                    alt112=2;
                }
                else if ( (LA112_1==RULE_ID) ) {
                    int LA112_3 = input.LA(3);

                    if ( (LA112_3==11) ) {
                        switch ( input.LA(4) ) {
                        case RULE_MULTI_NL:
                            {
                            switch ( input.LA(5) ) {
                            case EOF:
                            case 14:
                            case 16:
                            case 17:
                            case 20:
                            case 21:
                            case 22:
                            case 51:
                                {
                                alt112=2;
                                }
                                break;
                            case RULE_MULTI_NL:
                                {
                                int LA112_7 = input.LA(6);

                                if ( (LA112_7==EOF||LA112_7==18) ) {
                                    alt112=2;
                                }
                                else if ( ((LA112_7>=RULE_WS && LA112_7<=RULE_MULTI_NL)||LA112_7==RULE_SINGLE_NL||LA112_7==15) ) {
                                    alt112=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 112, 7, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case RULE_WS:
                            case RULE_SINGLE_NL:
                            case 15:
                                {
                                alt112=1;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 112, 5, input);

                                throw nvae;
                            }

                            }
                            break;
                        case EOF:
                            {
                            alt112=2;
                            }
                            break;
                        case RULE_WS:
                        case RULE_SINGLE_NL:
                        case 15:
                            {
                            alt112=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 112, 4, input);

                            throw nvae;
                        }

                    }
                    else if ( ((LA112_3>=RULE_WS && LA112_3<=RULE_SINGLE_NL)||LA112_3==19||LA112_3==35) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3245:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3245:2: (otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3245:4: otherlv_0= 'codelanguage-def[' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ']' ( ruleANY_WS )* otherlv_4= '[' ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_12= ']'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleLangDef7266); 

                        	newLeafNode(otherlv_0, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_0_0());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3249:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3250:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3250:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3251:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLangDef7283); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getLangDefAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLangDefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleLangDef7300); 

                        	newLeafNode(otherlv_2, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3271:1: ( ruleANY_WS )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( ((LA99_0>=RULE_WS && LA99_0<=RULE_MULTI_NL)||LA99_0==RULE_SINGLE_NL) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3272:5: ruleANY_WS
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7317);
                    	    ruleANY_WS();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleLangDef7330); 

                        	newLeafNode(otherlv_4, grammarAccess.getLangDefAccess().getLeftSquareBracketKeyword_0_4());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3283:1: ( ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( ((LA105_0>=RULE_WS && LA105_0<=RULE_SINGLE_NL)||LA105_0==35) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3283:2: ( ruleANY_WS )* ( (lv_keywords_6_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3283:2: ( ruleANY_WS )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( ((LA100_0>=RULE_WS && LA100_0<=RULE_MULTI_NL)||LA100_0==RULE_SINGLE_NL) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3284:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7348);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3291:3: ( (lv_keywords_6_0= ruleKeyWord ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3292:1: (lv_keywords_6_0= ruleKeyWord )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3292:1: (lv_keywords_6_0= ruleKeyWord )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3293:3: lv_keywords_6_0= ruleKeyWord
                            {
                             
                            	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef7370);
                            lv_keywords_6_0=ruleKeyWord();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"keywords",
                                    		lv_keywords_6_0, 
                                    		"KeyWord");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3309:2: ( ruleANY_WS )*
                            loop101:
                            do {
                                int alt101=2;
                                int LA101_0 = input.LA(1);

                                if ( ((LA101_0>=RULE_WS && LA101_0<=RULE_MULTI_NL)||LA101_0==RULE_SINGLE_NL) ) {
                                    alt101=1;
                                }


                                switch (alt101) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3310:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_2()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7387);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop101;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3317:3: (otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==19) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3317:5: otherlv_8= ',' ( ruleANY_WS )* ( (lv_keywords_10_0= ruleKeyWord ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleLangDef7401); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getLangDefAccess().getCommaKeyword_0_5_3_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3321:1: ( ruleANY_WS )*
                            	    loop102:
                            	    do {
                            	        int alt102=2;
                            	        int LA102_0 = input.LA(1);

                            	        if ( ((LA102_0>=RULE_WS && LA102_0<=RULE_MULTI_NL)||LA102_0==RULE_SINGLE_NL) ) {
                            	            alt102=1;
                            	        }


                            	        switch (alt102) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3322:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_3_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7418);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop102;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3329:3: ( (lv_keywords_10_0= ruleKeyWord ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3330:1: (lv_keywords_10_0= ruleKeyWord )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3330:1: (lv_keywords_10_0= ruleKeyWord )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3331:3: lv_keywords_10_0= ruleKeyWord
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_0_5_3_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef7440);
                            	    lv_keywords_10_0=ruleKeyWord();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_10_0, 
                            	            		"KeyWord");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3347:2: ( ruleANY_WS )*
                            	    loop103:
                            	    do {
                            	        int alt103=2;
                            	        int LA103_0 = input.LA(1);

                            	        if ( ((LA103_0>=RULE_WS && LA103_0<=RULE_MULTI_NL)||LA103_0==RULE_SINGLE_NL) ) {
                            	            alt103=1;
                            	        }


                            	        switch (alt103) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3348:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_0_5_3_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7457);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop103;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop104;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,11,FOLLOW_11_in_ruleLangDef7474); 

                        	newLeafNode(otherlv_12, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3360:6: ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3360:6: ( () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']' )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3360:7: () otherlv_14= 'codelanguage-def[' ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )? otherlv_22= ']'
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3360:7: ()
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3361:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLangDefAccess().getLangDefAction_1_0(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,51,FOLLOW_51_in_ruleLangDef7503); 

                        	newLeafNode(otherlv_14, grammarAccess.getLangDefAccess().getCodelanguageDefKeyword_1_1());
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3370:1: ( ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )* )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( ((LA111_0>=RULE_WS && LA111_0<=RULE_SINGLE_NL)||LA111_0==35) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3370:2: ( ruleANY_WS )* ( (lv_keywords_16_0= ruleKeyWord ) ) ( ruleANY_WS )* (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3370:2: ( ruleANY_WS )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( ((LA106_0>=RULE_WS && LA106_0<=RULE_MULTI_NL)||LA106_0==RULE_SINGLE_NL) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3371:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_0()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7521);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop106;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3378:3: ( (lv_keywords_16_0= ruleKeyWord ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3379:1: (lv_keywords_16_0= ruleKeyWord )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3379:1: (lv_keywords_16_0= ruleKeyWord )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3380:3: lv_keywords_16_0= ruleKeyWord
                            {
                             
                            	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef7543);
                            lv_keywords_16_0=ruleKeyWord();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"keywords",
                                    		lv_keywords_16_0, 
                                    		"KeyWord");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3396:2: ( ruleANY_WS )*
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( ((LA107_0>=RULE_WS && LA107_0<=RULE_MULTI_NL)||LA107_0==RULE_SINGLE_NL) ) {
                                    alt107=1;
                                }


                                switch (alt107) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3397:5: ruleANY_WS
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_2()); 
                            	        
                            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7560);
                            	    ruleANY_WS();

                            	    state._fsp--;

                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop107;
                                }
                            } while (true);

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3404:3: (otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )* )*
                            loop110:
                            do {
                                int alt110=2;
                                int LA110_0 = input.LA(1);

                                if ( (LA110_0==19) ) {
                                    alt110=1;
                                }


                                switch (alt110) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3404:5: otherlv_18= ',' ( ruleANY_WS )* ( (lv_keywords_20_0= ruleKeyWord ) ) ( ruleANY_WS )*
                            	    {
                            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleLangDef7574); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getLangDefAccess().getCommaKeyword_1_2_3_0());
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3408:1: ( ruleANY_WS )*
                            	    loop108:
                            	    do {
                            	        int alt108=2;
                            	        int LA108_0 = input.LA(1);

                            	        if ( ((LA108_0>=RULE_WS && LA108_0<=RULE_MULTI_NL)||LA108_0==RULE_SINGLE_NL) ) {
                            	            alt108=1;
                            	        }


                            	        switch (alt108) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3409:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_3_1()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7591);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop108;
                            	        }
                            	    } while (true);

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3416:3: ( (lv_keywords_20_0= ruleKeyWord ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3417:1: (lv_keywords_20_0= ruleKeyWord )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3417:1: (lv_keywords_20_0= ruleKeyWord )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3418:3: lv_keywords_20_0= ruleKeyWord
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLangDefAccess().getKeywordsKeyWordParserRuleCall_1_2_3_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleKeyWord_in_ruleLangDef7613);
                            	    lv_keywords_20_0=ruleKeyWord();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLangDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"keywords",
                            	            		lv_keywords_20_0, 
                            	            		"KeyWord");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3434:2: ( ruleANY_WS )*
                            	    loop109:
                            	    do {
                            	        int alt109=2;
                            	        int LA109_0 = input.LA(1);

                            	        if ( ((LA109_0>=RULE_WS && LA109_0<=RULE_MULTI_NL)||LA109_0==RULE_SINGLE_NL) ) {
                            	            alt109=1;
                            	        }


                            	        switch (alt109) {
                            	    	case 1 :
                            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3435:5: ruleANY_WS
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getLangDefAccess().getANY_WSParserRuleCall_1_2_3_3()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLangDef7630);
                            	    	    ruleANY_WS();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop109;
                            	        }
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop110;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,11,FOLLOW_11_in_ruleLangDef7647); 

                        	newLeafNode(otherlv_22, grammarAccess.getLangDefAccess().getRightSquareBracketKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3454:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3455:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3456:2: iv_ruleCodeText= ruleCodeText EOF
            {
             newCompositeNode(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText7685);
            iv_ruleCodeText=ruleCodeText();

            state._fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText7696); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3463:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_SINGLE_NL_3=null;
        Token this_ANY_OTHER_4=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3466:28: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3467:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3467:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ',' | kw= '-' )+
            int cnt113=0;
            loop113:
            do {
                int alt113=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt113=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt113=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt113=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt113=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt113=5;
                    }
                    break;
                case 33:
                    {
                    alt113=6;
                    }
                    break;
                case 34:
                    {
                    alt113=7;
                    }
                    break;
                case 19:
                    {
                    alt113=8;
                    }
                    break;
                case 35:
                    {
                    alt113=9;
                    }
                    break;

                }

                switch (alt113) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3467:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText7736); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3475:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText7762); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        newLeafNode(this_MULTI_NL_1, grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3483:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText7788); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3491:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText7814); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        newLeafNode(this_SINGLE_NL_3, grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3499:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText7840); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3508:2: kw= '\\\\['
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleCodeText7864); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3515:2: kw= '\\\\]'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleCodeText7883); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3522:2: kw= ','
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleCodeText7902); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getCommaKeyword_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3529:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleCodeText7921); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCodeTextAccess().getHyphenMinusKeyword_8()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            }

             leaveRule(); 
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3542:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3543:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3544:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             newCompositeNode(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS7963);
            iv_ruleANY_WS=ruleANY_WS();

            state._fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS7974); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3551:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3554:28: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3555:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3555:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt114=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt114=2;
                }
                break;
            case RULE_WS:
                {
                alt114=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3555:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS8014); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        newLeafNode(this_MULTI_NL_0, grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3563:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS8040); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        newLeafNode(this_SINGLE_NL_1, grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3571:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS8066); 

                    		current.merge(this_WS_2);
                        
                     
                        newLeafNode(this_WS_2, grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleKeyWord"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3586:1: entryRuleKeyWord returns [String current=null] : iv_ruleKeyWord= ruleKeyWord EOF ;
    public final String entryRuleKeyWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyWord = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3587:2: (iv_ruleKeyWord= ruleKeyWord EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3588:2: iv_ruleKeyWord= ruleKeyWord EOF
            {
             newCompositeNode(grammarAccess.getKeyWordRule()); 
            pushFollow(FOLLOW_ruleKeyWord_in_entryRuleKeyWord8112);
            iv_ruleKeyWord=ruleKeyWord();

            state._fsp--;

             current =iv_ruleKeyWord.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyWord8123); 

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
    // $ANTLR end "entryRuleKeyWord"


    // $ANTLR start "ruleKeyWord"
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3595:1: ruleKeyWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken ruleKeyWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3598:28: ( (this_ID_0= RULE_ID | kw= '-' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3599:1: (this_ID_0= RULE_ID | kw= '-' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3599:1: (this_ID_0= RULE_ID | kw= '-' )+
            int cnt115=0;
            loop115:
            do {
                int alt115=3;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==RULE_ID) ) {
                    alt115=1;
                }
                else if ( (LA115_0==35) ) {
                    alt115=2;
                }


                switch (alt115) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3599:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyWord8163); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getKeyWordAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXdoc.g:3608:2: kw= '-'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleKeyWord8187); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getKeyWordAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt115 >= 1 ) break loop115;
                        EarlyExitException eee =
                            new EarlyExitException(115, input);
                        throw eee;
                }
                cnt115++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyWord"

    // Delegated rules


    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA50_eotS =
        "\6\uffff";
    static final String DFA50_eofS =
        "\6\uffff";
    static final String DFA50_minS =
        "\4\4\2\uffff";
    static final String DFA50_maxS =
        "\4\45\2\uffff";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA50_specialS =
        "\6\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\31\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\31\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\31\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\31\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 1963:1: ( ( ruleANY_WS )* ( (lv_rows_3_0= ruleTableRow ) ) )*";
        }
    }
    static final String DFA53_eotS =
        "\6\uffff";
    static final String DFA53_eofS =
        "\6\uffff";
    static final String DFA53_minS =
        "\4\4\2\uffff";
    static final String DFA53_maxS =
        "\4\46\2\uffff";
    static final String DFA53_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA53_specialS =
        "\6\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\32\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\32\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\32\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\32\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 2032:1: ( ( ruleANY_WS )* ( (lv_data_3_0= ruleTableData ) ) )*";
        }
    }
    static final String DFA66_eotS =
        "\6\uffff";
    static final String DFA66_eofS =
        "\6\uffff";
    static final String DFA66_minS =
        "\4\4\2\uffff";
    static final String DFA66_maxS =
        "\4\54\2\uffff";
    static final String DFA66_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA66_specialS =
        "\6\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "()* loopback of 2360:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA69_eotS =
        "\6\uffff";
    static final String DFA69_eofS =
        "\6\uffff";
    static final String DFA69_minS =
        "\4\4\2\uffff";
    static final String DFA69_maxS =
        "\4\54\2\uffff";
    static final String DFA69_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA69_specialS =
        "\6\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\3\uffff\1\4\40\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "()* loopback of 2429:1: ( ( ruleANY_WS )* ( (lv_items_3_0= ruleItem ) ) )*";
        }
    }
    static final String DFA91_eotS =
        "\21\uffff";
    static final String DFA91_eofS =
        "\11\uffff\4\5\1\uffff\3\5";
    static final String DFA91_minS =
        "\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA91_maxS =
        "\5\62\1\uffff\7\62\1\uffff\3\62";
    static final String DFA91_acceptS =
        "\5\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA91_specialS =
        "\21\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\7\uffff\1\5\15\uffff\3\5\3"+
            "\uffff\3\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\7\uffff\1\5\15\uffff\3\5\3"+
            "\uffff\3\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\7\uffff\1\5\15\uffff\3\5\3"+
            "\uffff\3\5\10\uffff\1\5",
            "\1\3\1\1\1\4\1\2\1\5\2\uffff\1\5\7\uffff\1\5\15\uffff\3\5\3"+
            "\uffff\3\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\7\uffff\1\5\15\uffff\3\5"+
            "\3\uffff\3\5\10\uffff\1\5",
            "",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\7\uffff\1\5\15\uffff\3\5"+
            "\3\uffff\3\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\7\uffff\1\5\15\uffff\3\5"+
            "\3\uffff\3\5\10\uffff\1\5",
            "\1\10\1\6\1\5\1\7\1\5\2\uffff\1\11\7\uffff\1\5\15\uffff\3\5"+
            "\3\uffff\3\5\10\uffff\1\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\3\uffff\1"+
            "\5\15\uffff\4\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\3\uffff\1"+
            "\5\15\uffff\4\5\2\uffff\5\5\1\uffff\6\5",
            "\1\12\1\14\1\5\1\13\1\5\2\uffff\1\5\3\uffff\1\15\3\uffff\1"+
            "\5\15\uffff\4\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\2\uffff\1\5\2\uffff\1\5\1\15\2\5\1"+
            "\uffff\22\5\2\uffff\5\5\1\uffff\6\5",
            "",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\3\uffff\1"+
            "\5\15\uffff\4\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\20\1\5\1\17\1\5\2\uffff\1\5\3\uffff\1\15\3\uffff\1"+
            "\5\15\uffff\4\5\2\uffff\5\5\1\uffff\6\5",
            "\1\16\1\15\1\5\1\17\1\5\5\uffff\1\5\1\15\2\5\1\uffff\22\5\2"+
            "\uffff\5\5\1\uffff\6\5"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "2932:1: ( ( ruleANY_WS )* ( (otherlv_3= RULE_ID ) ) ( ruleANY_WS )* otherlv_5= ']' ( ruleANY_WS )* otherlv_7= '[' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleXdocFile_in_entryRuleXdocFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXdocFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleXdocFile131 = new BitSet(new long[]{0x000000001FF34422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile144 = new BitSet(new long[]{0x000000001FF34402L});
    public static final BitSet FOLLOW_ruleDocument_in_ruleXdocFile169 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePart_in_ruleXdocFile188 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleXdocFile207 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleXdocFile226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleXdocFile245 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleXdocFile260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDocument346 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument367 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDocument402 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument423 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument449 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDocument460 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleDocument481 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDocument493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument507 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleLangDef_in_ruleDocument527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleGlossary_in_ruleDocument561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument575 = new BitSet(new long[]{0x0000000000734002L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument597 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument609 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument629 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePart_in_ruleDocument660 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument672 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_rulePart_in_ruleDocument692 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleGlossary_in_entryRuleGlossary734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossary744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleGlossary780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleGlossaryEntry_in_ruleGlossary800 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartRef_in_rulePart894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePart914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePart931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePart948 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_16_in_rulePart967 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rulePart989 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePart1001 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rulePart1013 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleChapter_in_rulePart1033 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePartRef_in_entryRulePartRef1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartRef1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePartRef1119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartRef1139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePartRef1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlossaryEntry_in_entryRuleGlossaryEntry1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlossaryEntry1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGlossaryEntry1234 = new BitSet(new long[]{0x0000000E00000140L});
    public static final BitSet FOLLOW_ruleUnpunctText_in_ruleGlossaryEntry1255 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_19_in_ruleGlossaryEntry1268 = new BitSet(new long[]{0x0000000E000001F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1285 = new BitSet(new long[]{0x0000000E000001F0L});
    public static final BitSet FOLLOW_ruleUnpunctText_in_ruleGlossaryEntry1307 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1324 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_11_in_ruleGlossaryEntry1339 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleGlossaryEntry1356 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleGlossaryEntry1369 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleGlossaryEntry1390 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleGlossaryEntry1402 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleGlossaryEntry1422 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleGlossaryEntry1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapterRef_in_ruleChapter1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleChapter1549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter1566 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChapter1583 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_21_in_ruleChapter1602 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter1624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter1636 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter1648 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter1668 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter1682 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter1702 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleChapterRef_in_entryRuleChapterRef1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapterRef1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleChapterRef1788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapterRef1808 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapterRef1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionRef_in_ruleSection1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSection1933 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection1950 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection1967 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_24_in_ruleSection1986 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection2008 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection2020 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection2032 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection2052 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection2066 = new BitSet(new long[]{0x000000001FF34400L});
    public static final BitSet FOLLOW_ruleSection2_in_ruleSection2086 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSectionRef_in_entryRuleSectionRef2125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionRef2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSectionRef2172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSectionRef2192 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSectionRef2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_entryRuleSection22240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection22250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2Ref_in_ruleSection22297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSection22317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection22334 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection22351 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_27_in_ruleSection22370 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection22392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection22404 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection22416 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection22436 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection22450 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSection22470 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection2Ref_in_entryRuleSection2Ref2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection2Ref2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSection2Ref2556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection2Ref2576 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection2Ref2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection32624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection32634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSection32673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection32690 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection32707 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_30_in_ruleSection32726 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection32748 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection32760 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection32772 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection32792 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection32806 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection32826 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection42864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection42874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSection42913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection42930 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSection42947 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_32_in_ruleSection42966 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection42988 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection43000 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection43012 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection43032 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup3070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup3127 = new BitSet(new long[]{0x0007EF9E000801D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup3149 = new BitSet(new long[]{0x0007EF9E000801D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup3170 = new BitSet(new long[]{0x0007EF9E000801D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup3202 = new BitSet(new long[]{0x0007EF9E000801D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup3223 = new BitSet(new long[]{0x0007EF9E000801D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart3262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText3404 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText3430 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText3456 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText3482 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_33_in_ruleText3506 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_34_in_ruleText3525 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_19_in_ruleText3544 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_35_in_ruleText3563 = new BitSet(new long[]{0x0000000E000801D2L});
    public static final BitSet FOLLOW_ruleUnpunctText_in_entryRuleUnpunctText3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnpunctText3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnpunctText3657 = new BitSet(new long[]{0x0000000E00000152L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleUnpunctText3683 = new BitSet(new long[]{0x0000000E00000152L});
    public static final BitSet FOLLOW_33_in_ruleUnpunctText3707 = new BitSet(new long[]{0x0000000E00000152L});
    public static final BitSet FOLLOW_34_in_ruleUnpunctText3726 = new BitSet(new long[]{0x0000000E00000152L});
    public static final BitSet FOLLOW_35_in_ruleUnpunctText3745 = new BitSet(new long[]{0x0000000E00000152L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleUnpunctText3763 = new BitSet(new long[]{0x0000000E00000140L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnpunctText3784 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleUnpunctText3810 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_33_in_ruleUnpunctText3834 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34_in_ruleUnpunctText3853 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35_in_ruleUnpunctText3872 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp3915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleMarkUp4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkUp4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable4277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTable4333 = new BitSet(new long[]{0x00000020000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable4351 = new BitSet(new long[]{0x00000020000000B0L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTable4373 = new BitSet(new long[]{0x00000020000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTable4392 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTable4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableRow_in_entryRuleTableRow4441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableRow4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTableRow4497 = new BitSet(new long[]{0x00000040000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow4515 = new BitSet(new long[]{0x00000040000000B0L});
    public static final BitSet FOLLOW_ruleTableData_in_ruleTableRow4537 = new BitSet(new long[]{0x00000040000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleTableRow4556 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleTableRow4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData4605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTableData4661 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData4674 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData4696 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleTableData4708 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleTableData4728 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleTableData4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize4780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEmphasize4836 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize4849 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize4871 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize4883 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor4934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnchor4981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor4998 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAnchor5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef5051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRef5098 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef5118 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRef5131 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef5143 = new BitSet(new long[]{0x0007EF9E000809D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef5166 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef5178 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOrderedList5287 = new BitSet(new long[]{0x00001000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList5305 = new BitSet(new long[]{0x00001000000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList5327 = new BitSet(new long[]{0x00001000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList5346 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList5395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUnorderedList5451 = new BitSet(new long[]{0x00001000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList5469 = new BitSet(new long[]{0x00001000000000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList5491 = new BitSet(new long[]{0x00001000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList5510 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem5559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleItem5615 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem5628 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem5650 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem5662 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem5682 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_11_in_ruleItem5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef5734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCodeRef5790 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef5813 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef5826 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleCodeRef5839 = new BitSet(new long[]{0x0007EF9E000801D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleCodeRef5860 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink5910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLink5966 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink5987 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink6000 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink6017 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLink6030 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink6051 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef6100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleImageRef6149 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef6166 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef6184 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef6206 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef6219 = new BitSet(new long[]{0x0000000E000801D0L});
    public static final BitSet FOLLOW_48_in_ruleImageRef6238 = new BitSet(new long[]{0x0000000E000801D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef6260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef6272 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef6289 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef6302 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef6323 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef6336 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef6353 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef6366 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef6387 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef6400 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef6417 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleImageRef6430 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef6451 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock6500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCodeBlock6556 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock6574 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock6595 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock6612 = new BitSet(new long[]{0x00000000000008B0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock6625 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock6642 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleCodeBlock6655 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock6680 = new BitSet(new long[]{0x0007EF9E000809D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock6702 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock6723 = new BitSet(new long[]{0x0007EF9E000809D0L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock6755 = new BitSet(new long[]{0x0007EF9E000809F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock6776 = new BitSet(new long[]{0x0007EF9E000809D0L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_entryRuleTodo6829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTodo6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTodo6885 = new BitSet(new long[]{0x0000000E000809D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleTodo6906 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleTodo6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode6955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTodo_in_ruleMarkupInCode7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLangDef_in_entryRuleLangDef7218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLangDef7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLangDef7266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLangDef7283 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLangDef7300 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7317 = new BitSet(new long[]{0x00000000000080B0L});
    public static final BitSet FOLLOW_15_in_ruleLangDef7330 = new BitSet(new long[]{0x00000008000008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7348 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef7370 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7387 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_19_in_ruleLangDef7401 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7418 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef7440 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7457 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLangDef7503 = new BitSet(new long[]{0x00000008000008F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7521 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef7543 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7560 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_19_in_ruleLangDef7574 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7591 = new BitSet(new long[]{0x00000008000000F0L});
    public static final BitSet FOLLOW_ruleKeyWord_in_ruleLangDef7613 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLangDef7630 = new BitSet(new long[]{0x00000000000808B0L});
    public static final BitSet FOLLOW_11_in_ruleLangDef7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText7685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText7736 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText7762 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText7788 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText7814 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText7840 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_33_in_ruleCodeText7864 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_34_in_ruleCodeText7883 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_19_in_ruleCodeText7902 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_35_in_ruleCodeText7921 = new BitSet(new long[]{0x0000000E000801F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyWord_in_entryRuleKeyWord8112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyWord8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyWord8163 = new BitSet(new long[]{0x0000000800000042L});
    public static final BitSet FOLLOW_35_in_ruleKeyWord8187 = new BitSet(new long[]{0x0000000800000042L});

}