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
import org.eclipse.xtext.xdoc.services.XDocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MULTI_NL", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'\\\\chapter'", "':'", "'['", "']'", "'\\\\section'", "'\\\\subsection'", "'\\\\section3'", "'\\\\section4'", "'\\\\emph'", "'\\\\a'", "'\\\\ref'", "'\\\\ol'", "'\\\\ul'", "'\\\\item'", "'\\\\codeRef'", "'\\\\link'", "'\\\\img'", "'\\\\code'", "'\\\\['", "'\\\\]'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_MULTI_NL=4;
    public static final int RULE_WS=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalXDocParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g"; }



     	private XDocGrammarAccess grammarAccess;
     	
        public InternalXDocParser(TokenStream input, IAstFactory factory, XDocGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected XDocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDocument
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:77:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:78:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:79:2: iv_ruleDocument= ruleDocument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDocumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();
            _fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end entryRuleDocument


    // $ANTLR start ruleDocument
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:86:1: ruleDocument returns [EObject current=null] : ( () ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( RULE_MULTI_NL )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_chapters_2_0 = null;

        EObject lv_sections_4_0 = null;

        EObject lv_subsections_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:91:6: ( ( () ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: () ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ ) ( RULE_MULTI_NL )?
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: ()
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getDocumentAccess().getDocumentAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getDocumentAccess().getDocumentAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:2: ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                switch ( input.LA(2) ) {
                case 9:
                    {
                    alt7=1;
                    }
                    break;
                case 13:
                    {
                    alt7=2;
                    }
                    break;
                case 14:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("103:2: ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )", 7, 1, input);

                    throw nvae;
                }

                }
                break;
            case 9:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("103:2: ( ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+ | ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+ )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: ( ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_MULTI_NL) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==9) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_0==9) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:4: ( RULE_MULTI_NL )? ( (lv_chapters_2_0= ruleChapter ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:4: ( RULE_MULTI_NL )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==RULE_MULTI_NL) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:5: RULE_MULTI_NL
                    	            {
                    	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument131); 
                    	             
                    	                createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_1_0_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:107:3: ( (lv_chapters_2_0= ruleChapter ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:108:1: (lv_chapters_2_0= ruleChapter )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:108:1: (lv_chapters_2_0= ruleChapter )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:109:3: lv_chapters_2_0= ruleChapter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument153);
                    	    lv_chapters_2_0=ruleChapter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"chapters",
                    	    	        		lv_chapters_2_0, 
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
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:132:6: ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:132:6: ( ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_MULTI_NL) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==13) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:132:7: ( RULE_MULTI_NL )? ( (lv_sections_4_0= ruleSection ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:132:7: ( RULE_MULTI_NL )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_MULTI_NL) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:132:8: RULE_MULTI_NL
                    	            {
                    	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument172); 
                    	             
                    	                createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_1_1_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:136:3: ( (lv_sections_4_0= ruleSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:137:1: (lv_sections_4_0= ruleSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:137:1: (lv_sections_4_0= ruleSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:138:3: lv_sections_4_0= ruleSection
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleDocument194);
                    	    lv_sections_4_0=ruleSection();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"sections",
                    	    	        		lv_sections_4_0, 
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:161:6: ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:161:6: ( ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_MULTI_NL) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==14) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:161:7: ( RULE_MULTI_NL )? ( (lv_subsections_6_0= ruleSubSection ) )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:161:7: ( RULE_MULTI_NL )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==RULE_MULTI_NL) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:161:8: RULE_MULTI_NL
                    	            {
                    	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument213); 
                    	             
                    	                createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_1_2_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:165:3: ( (lv_subsections_6_0= ruleSubSection ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:166:1: (lv_subsections_6_0= ruleSubSection )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:166:1: (lv_subsections_6_0= ruleSubSection )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:167:3: lv_subsections_6_0= ruleSubSection
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubSection_in_ruleDocument235);
                    	    lv_subsections_6_0=ruleSubSection();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subsections",
                    	    	        		lv_subsections_6_0, 
                    	    	        		"SubSection", 
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:189:5: ( RULE_MULTI_NL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_MULTI_NL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:189:6: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument248); 
                     
                        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2(), null); 
                        

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
    // $ANTLR end ruleDocument


    // $ANTLR start entryRuleChapter
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:201:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:202:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:203:2: iv_ruleChapter= ruleChapter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChapterRule(), currentNode); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter285);
            iv_ruleChapter=ruleChapter();
            _fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter295); 

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
    // $ANTLR end entryRuleChapter


    // $ANTLR start ruleChapter
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:210:1: ruleChapter returns [EObject current=null] : ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )* ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:215:6: ( ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:216:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:216:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:216:3: '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )*
            {
            match(input,9,FOLLOW_9_in_ruleChapter330); 

                    createLeafNode(grammarAccess.getChapterAccess().getChapterKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:220:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:220:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleChapter341); 

                            createLeafNode(grammarAccess.getChapterAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:224:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:225:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:225:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:226:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter358); 

                    			createLeafNode(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleChapter375); 

                    createLeafNode(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:252:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:253:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:253:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:254:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter396);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleChapter406); 

                    createLeafNode(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:280:1: ( RULE_WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:280:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChapter416); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:284:3: ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_MULTI_NL) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=RULE_ID && LA11_1<=RULE_ANY_OTHER)||LA11_1==10||(LA11_1>=17 && LA11_1<=21)||(LA11_1>=23 && LA11_1<=28)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:284:4: RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter427); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:288:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:289:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:289:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:290:3: lv_contents_8_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter447);
            	    lv_contents_8_0=ruleTextOrMarkup();
            	    _fsp--;


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
            	    break loop11;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:312:4: ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_MULTI_NL) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==13) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:312:5: ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:312:5: ( RULE_MULTI_NL )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_MULTI_NL) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:312:6: RULE_MULTI_NL
            	            {
            	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter460); 
            	             
            	                createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_7_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:316:3: ( (lv_contents_10_0= ruleSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:317:1: (lv_contents_10_0= ruleSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:317:1: (lv_contents_10_0= ruleSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:318:3: lv_contents_10_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleChapter482);
            	    lv_contents_10_0=ruleSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_10_0, 
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
            	    break loop13;
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
    // $ANTLR end ruleChapter


    // $ANTLR start entryRuleSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:348:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:349:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:350:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection520);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection530); 

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
    // $ANTLR end entryRuleSection


    // $ANTLR start ruleSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:357:1: ruleSection returns [EObject current=null] : ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:362:6: ( ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:363:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:363:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:363:3: '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )*
            {
            match(input,13,FOLLOW_13_in_ruleSection565); 

                    createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:367:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==10) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:367:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection576); 

                            createLeafNode(grammarAccess.getSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:371:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:372:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:372:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:373:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection593); 

                    			createLeafNode(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection610); 

                    createLeafNode(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:399:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:400:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:400:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:401:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection631);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleSection641); 

                    createLeafNode(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:427:1: ( RULE_WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:427:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection651); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:431:3: ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTI_NL) ) {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>=RULE_ID && LA16_1<=RULE_ANY_OTHER)||LA16_1==10||(LA16_1>=17 && LA16_1<=21)||(LA16_1>=23 && LA16_1<=28)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:431:4: RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection662); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:435:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:436:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:436:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:437:3: lv_contents_8_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection682);
            	    lv_contents_8_0=ruleTextOrMarkup();
            	    _fsp--;


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
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:459:4: ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_MULTI_NL) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==14) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:459:5: ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSubSection ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:459:5: ( RULE_MULTI_NL )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_MULTI_NL) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:459:6: RULE_MULTI_NL
            	            {
            	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection695); 
            	             
            	                createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_7_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:463:3: ( (lv_contents_10_0= ruleSubSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:464:1: (lv_contents_10_0= ruleSubSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:464:1: (lv_contents_10_0= ruleSubSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:465:3: lv_contents_10_0= ruleSubSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubSection_in_ruleSection717);
            	    lv_contents_10_0=ruleSubSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_10_0, 
            	    	        		"SubSection", 
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
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleSubSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:495:1: entryRuleSubSection returns [EObject current=null] : iv_ruleSubSection= ruleSubSection EOF ;
    public final EObject entryRuleSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:496:2: (iv_ruleSubSection= ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:497:2: iv_ruleSubSection= ruleSubSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection755);
            iv_ruleSubSection=ruleSubSection();
            _fsp--;

             current =iv_ruleSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection765); 

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
    // $ANTLR end entryRuleSubSection


    // $ANTLR start ruleSubSection
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:504:1: ruleSubSection returns [EObject current=null] : ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSubSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:509:6: ( ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:510:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:510:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:510:3: '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )*
            {
            match(input,14,FOLLOW_14_in_ruleSubSection800); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:514:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==10) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:514:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSubSection811); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:518:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:519:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:519:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:520:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSection828); 

                    			createLeafNode(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSubSection845); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:546:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:547:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:547:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:548:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection866);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
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

            match(input,12,FOLLOW_12_in_ruleSubSection876); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:574:1: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:574:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSubSection886); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:578:3: ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTI_NL) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=RULE_ID && LA21_1<=RULE_ANY_OTHER)||LA21_1==10||(LA21_1>=17 && LA21_1<=21)||(LA21_1>=23 && LA21_1<=28)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:578:4: RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection897); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:582:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:583:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:583:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:584:3: lv_contents_8_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection917);
            	    lv_contents_8_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
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
            	    break loop21;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:606:4: ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTI_NL) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==15) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:606:5: ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection3 ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:606:5: ( RULE_MULTI_NL )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_MULTI_NL) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:606:6: RULE_MULTI_NL
            	            {
            	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection930); 
            	             
            	                createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_7_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:610:3: ( (lv_contents_10_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:611:1: (lv_contents_10_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:611:1: (lv_contents_10_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:612:3: lv_contents_10_0= ruleSection3
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSubSection952);
            	    lv_contents_10_0=ruleSection3();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_10_0, 
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
            	    break loop23;
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
    // $ANTLR end ruleSubSection


    // $ANTLR start entryRuleSection3
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:642:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:643:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:644:2: iv_ruleSection3= ruleSection3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection3Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection3990);
            iv_ruleSection3=ruleSection3();
            _fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31000); 

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
    // $ANTLR end entryRuleSection3


    // $ANTLR start ruleSection3
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:651:1: ruleSection3 returns [EObject current=null] : ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:656:6: ( ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:657:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:657:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:657:3: '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )* ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )*
            {
            match(input,15,FOLLOW_15_in_ruleSection31035); 

                    createLeafNode(grammarAccess.getSection3Access().getSection3Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:661:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==10) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:661:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection31046); 

                            createLeafNode(grammarAccess.getSection3Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:665:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:666:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:666:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:667:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31063); 

                    			createLeafNode(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection31080); 

                    createLeafNode(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:693:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:694:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:694:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:695:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31101);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


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

            match(input,12,FOLLOW_12_in_ruleSection31111); 

                    createLeafNode(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:721:1: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:721:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection31121); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:725:3: ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_ID && LA26_1<=RULE_ANY_OTHER)||LA26_1==10||(LA26_1>=17 && LA26_1<=21)||(LA26_1>=23 && LA26_1<=28)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:725:4: RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31132); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:729:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:730:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:730:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:731:3: lv_contents_8_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31152);
            	    lv_contents_8_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
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
            	    break loop26;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:753:4: ( ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTI_NL) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==16) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:753:5: ( RULE_MULTI_NL )? ( (lv_contents_10_0= ruleSection4 ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:753:5: ( RULE_MULTI_NL )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==RULE_MULTI_NL) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:753:6: RULE_MULTI_NL
            	            {
            	            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31165); 
            	             
            	                createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_7_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:757:3: ( (lv_contents_10_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:758:1: (lv_contents_10_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:758:1: (lv_contents_10_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:759:3: lv_contents_10_0= ruleSection4
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31187);
            	    lv_contents_10_0=ruleSection4();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_10_0, 
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
            	    break loop28;
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
    // $ANTLR end ruleSection3


    // $ANTLR start entryRuleSection4
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:789:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:790:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:791:2: iv_ruleSection4= ruleSection4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection4Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41225);
            iv_ruleSection4=ruleSection4();
            _fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41235); 

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
    // $ANTLR end entryRuleSection4


    // $ANTLR start ruleSection4
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:798:1: ruleSection4 returns [EObject current=null] : ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+ ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:803:6: ( ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:804:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:804:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:804:3: '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_WS )* ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+
            {
            match(input,16,FOLLOW_16_in_ruleSection41270); 

                    createLeafNode(grammarAccess.getSection4Access().getSection4Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:808:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==10) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:808:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleSection41281); 

                            createLeafNode(grammarAccess.getSection4Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:812:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:813:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:813:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:814:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection41298); 

                    			createLeafNode(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleSection41315); 

                    createLeafNode(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:840:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:841:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:841:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:842:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41336);
            lv_title_4_0=ruleTextOrMarkup();
            _fsp--;


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

            match(input,12,FOLLOW_12_in_ruleSection41346); 

                    createLeafNode(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:868:1: ( RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:868:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSection41356); 
            	     
            	        createLeafNode(grammarAccess.getSection4Access().getWSTerminalRuleCall_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:3: ( RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_ANY_OTHER)||LA31_1==10||(LA31_1>=17 && LA31_1<=21)||(LA31_1>=23 && LA31_1<=28)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:4: RULE_MULTI_NL ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection41367); 
            	     
            	        createLeafNode(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:876:1: ( (lv_contents_8_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_contents_8_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:878:3: lv_contents_8_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41387);
            	    lv_contents_8_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection4Rule().getType().getClassifier());
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:910:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:911:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:912:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1427);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();
            _fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup1437); 

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
    // $ANTLR end entryRuleTextOrMarkup


    // $ANTLR start ruleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:919:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:924:6: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_ANY_OTHER)||LA36_0==10||(LA36_0>=27 && LA36_0<=28)) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=17 && LA36_0<=21)||(LA36_0>=23 && LA36_0<=26)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("925:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:925:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:926:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:926:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:927:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1484);
                    lv_contents_0_0=ruleTextPart();
                    _fsp--;


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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:949:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=17 && LA33_0<=21)||(LA33_0>=23 && LA33_0<=26)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:949:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:949:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:950:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:950:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:951:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1506);
                    	    lv_contents_1_0=ruleMarkUp();
                    	    _fsp--;


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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:973:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt32=2;
                    	    int LA32_0 = input.LA(1);

                    	    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_ANY_OTHER)||LA32_0==10||(LA32_0>=27 && LA32_0<=28)) ) {
                    	        alt32=1;
                    	    }
                    	    switch (alt32) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:974:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:974:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:975:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1527);
                    	            lv_contents_2_0=ruleTextPart();
                    	            _fsp--;


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
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=17 && LA35_0<=21)||(LA35_0>=23 && LA35_0<=26)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:998:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:999:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:999:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1000:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1559);
                    	    lv_contents_3_0=ruleMarkUp();
                    	    _fsp--;


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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1022:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_ANY_OTHER)||LA34_0==10||(LA34_0>=27 && LA34_0<=28)) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1023:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1023:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1024:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1580);
                    	            lv_contents_4_0=ruleTextPart();
                    	            _fsp--;


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
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
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
    // $ANTLR end ruleTextOrMarkup


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1054:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1055:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1056:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkUpRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp1619);
            iv_ruleMarkUp=ruleMarkUp();
            _fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp1629); 

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
    // $ANTLR end entryRuleMarkUp


    // $ANTLR start ruleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1063:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1068:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1069:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1069:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            int alt37=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt37=1;
                }
                break;
            case 18:
                {
                alt37=2;
                }
                break;
            case 19:
                {
                alt37=3;
                }
                break;
            case 20:
                {
                alt37=4;
                }
                break;
            case 21:
                {
                alt37=5;
                }
                break;
            case 26:
                {
                alt37=6;
                }
                break;
            case 23:
                {
                alt37=7;
                }
                break;
            case 24:
                {
                alt37=8;
                }
                break;
            case 25:
                {
                alt37=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1069:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1070:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp1676);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1080:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp1703);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1090:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp1730);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1100:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp1757);
                    this_OrderedList_3=ruleOrderedList();
                    _fsp--;

                     
                            current = this_OrderedList_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1110:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp1784);
                    this_UnorderedList_4=ruleUnorderedList();
                    _fsp--;

                     
                            current = this_UnorderedList_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1120:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp1811);
                    this_CodeBlock_5=ruleCodeBlock();
                    _fsp--;

                     
                            current = this_CodeBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1130:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp1838);
                    this_CodeRef_6=ruleCodeRef();
                    _fsp--;

                     
                            current = this_CodeRef_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1140:5: this_Link_7= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp1865);
                    this_Link_7=ruleLink();
                    _fsp--;

                     
                            current = this_Link_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1150:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp1892);
                    this_ImageRef_8=ruleImageRef();
                    _fsp--;

                     
                            current = this_ImageRef_8; 
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
    // $ANTLR end ruleMarkUp


    // $ANTLR start entryRuleEmphasize
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1166:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1167:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1168:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmphasizeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize1927);
            iv_ruleEmphasize=ruleEmphasize();
            _fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize1937); 

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
    // $ANTLR end entryRuleEmphasize


    // $ANTLR start ruleEmphasize
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1175:1: ruleEmphasize returns [EObject current=null] : ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' ) ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1180:6: ( ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:1: ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:1: ( '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1181:3: '\\\\emph' ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' )
            {
            match(input,17,FOLLOW_17_in_ruleEmphasize1972); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getEmphKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1185:1: ( '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1185:3: '[' ( (lv_contents_2_0= ruleTextOrMarkup ) ) ']'
            {
            match(input,11,FOLLOW_11_in_ruleEmphasize1983); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1189:1: ( (lv_contents_2_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1190:1: (lv_contents_2_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1190:1: (lv_contents_2_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1191:3: lv_contents_2_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_1_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2004);
            lv_contents_2_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmphasizeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"contents",
            	        		lv_contents_2_0, 
            	        		"TextOrMarkup", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleEmphasize2014); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_1_2(), null); 
                

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
    // $ANTLR end ruleEmphasize


    // $ANTLR start entryRuleAnchor
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1225:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1226:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1227:2: iv_ruleAnchor= ruleAnchor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnchorRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor2051);
            iv_ruleAnchor=ruleAnchor();
            _fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor2061); 

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
    // $ANTLR end entryRuleAnchor


    // $ANTLR start ruleAnchor
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1234:1: ruleAnchor returns [EObject current=null] : ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1239:6: ( ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1240:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1240:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1240:3: '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )?
            {
            match(input,18,FOLLOW_18_in_ruleAnchor2096); 

                    createLeafNode(grammarAccess.getAnchorAccess().getAKeyword_0(), null); 
                
            match(input,10,FOLLOW_10_in_ruleAnchor2106); 

                    createLeafNode(grammarAccess.getAnchorAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1248:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1249:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1249:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1250:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor2123); 

            			createLeafNode(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnchorRule().getType().getClassifier());
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1272:2: ( '[' ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==11) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1272:4: '[' ']'
                    {
                    match(input,11,FOLLOW_11_in_ruleAnchor2139); 

                            createLeafNode(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleAnchor2149); 

                            createLeafNode(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1(), null); 
                        

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
    // $ANTLR end ruleAnchor


    // $ANTLR start entryRuleRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1288:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1289:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1290:2: iv_ruleRef= ruleRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef2187);
            iv_ruleRef=ruleRef();
            _fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef2197); 

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
    // $ANTLR end entryRuleRef


    // $ANTLR start ruleRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1297:1: ruleRef returns [EObject current=null] : ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkup ) ) ']' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1302:6: ( ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkup ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1303:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkup ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1303:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkup ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1303:3: '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( (lv_contents_4_0= ruleTextOrMarkup ) ) ']'
            {
            match(input,19,FOLLOW_19_in_ruleRef2232); 

                    createLeafNode(grammarAccess.getRefAccess().getRefKeyword_0(), null); 
                
            match(input,10,FOLLOW_10_in_ruleRef2242); 

                    createLeafNode(grammarAccess.getRefAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1311:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1312:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1312:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1313:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef2260); 

            		createLeafNode(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0(), "ref"); 
            	

            }


            }

            match(input,11,FOLLOW_11_in_ruleRef2270); 

                    createLeafNode(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1329:1: ( (lv_contents_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1330:1: (lv_contents_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1330:1: (lv_contents_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1331:3: lv_contents_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef2291);
            lv_contents_4_0=ruleTextOrMarkup();
            _fsp--;


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

            match(input,12,FOLLOW_12_in_ruleRef2301); 

                    createLeafNode(grammarAccess.getRefAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleRef


    // $ANTLR start entryRuleOrderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1365:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1366:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1367:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList2337);
            iv_ruleOrderedList=ruleOrderedList();
            _fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList2347); 

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
    // $ANTLR end entryRuleOrderedList


    // $ANTLR start ruleOrderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1374:1: ruleOrderedList returns [EObject current=null] : ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1379:6: ( ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1380:1: ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1380:1: ( '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1380:3: '\\\\ol' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']'
            {
            match(input,20,FOLLOW_20_in_ruleOrderedList2382); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getOlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1384:1: ( RULE_WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_WS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1384:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrderedList2392); 
            	     
            	        createLeafNode(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleOrderedList2403); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1392:1: ( RULE_WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1392:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrderedList2413); 
            	     
            	        createLeafNode(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1396:3: ( (lv_items_4_0= ruleItem ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==22) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1397:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1397:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1398:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList2435);
            	    lv_items_4_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_4_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            match(input,12,FOLLOW_12_in_ruleOrderedList2446); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleOrderedList


    // $ANTLR start entryRuleUnorderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1432:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1433:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1434:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnorderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2482);
            iv_ruleUnorderedList=ruleUnorderedList();
            _fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList2492); 

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
    // $ANTLR end entryRuleUnorderedList


    // $ANTLR start ruleUnorderedList
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1441:1: ruleUnorderedList returns [EObject current=null] : ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1446:6: ( ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1447:1: ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1447:1: ( '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1447:3: '\\\\ul' ( RULE_WS )* '[' ( RULE_WS )* ( (lv_items_4_0= ruleItem ) )+ ']'
            {
            match(input,21,FOLLOW_21_in_ruleUnorderedList2527); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getUlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1451:1: ( RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1451:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleUnorderedList2537); 
            	     
            	        createLeafNode(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleUnorderedList2548); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1459:1: ( RULE_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_WS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1459:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleUnorderedList2558); 
            	     
            	        createLeafNode(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1463:3: ( (lv_items_4_0= ruleItem ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==22) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1464:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1464:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1465:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList2580);
            	    lv_items_4_0=ruleItem();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUnorderedListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"items",
            	    	        		lv_items_4_0, 
            	    	        		"Item", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


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

            match(input,12,FOLLOW_12_in_ruleUnorderedList2591); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleUnorderedList


    // $ANTLR start entryRuleItem
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1499:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1500:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1501:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem2627);
            iv_ruleItem=ruleItem();
            _fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem2637); 

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
    // $ANTLR end entryRuleItem


    // $ANTLR start ruleItem
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1508:1: ruleItem returns [EObject current=null] : ( '\\\\item' ( RULE_WS )* '[' ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* ']' ( RULE_WS )* ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1513:6: ( ( '\\\\item' ( RULE_WS )* '[' ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* ']' ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1514:1: ( '\\\\item' ( RULE_WS )* '[' ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* ']' ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1514:1: ( '\\\\item' ( RULE_WS )* '[' ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* ']' ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1514:3: '\\\\item' ( RULE_WS )* '[' ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )* ']' ( RULE_WS )*
            {
            match(input,22,FOLLOW_22_in_ruleItem2672); 

                    createLeafNode(grammarAccess.getItemAccess().getItemKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1518:1: ( RULE_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_WS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1518:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleItem2682); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_ruleItem2693); 

                    createLeafNode(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1526:1: ( (lv_contents_3_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1527:1: (lv_contents_3_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1527:1: (lv_contents_3_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1528:3: lv_contents_3_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem2714);
            lv_contents_3_0=ruleTextOrMarkup();
            _fsp--;


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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1550:2: ( RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_MULTI_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1550:3: RULE_MULTI_NL ( (lv_contents_5_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem2724); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_4_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1554:1: ( (lv_contents_5_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1555:1: (lv_contents_5_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1555:1: (lv_contents_5_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1556:3: lv_contents_5_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem2744);
            	    lv_contents_5_0=ruleTextOrMarkup();
            	    _fsp--;


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
            	    break loop46;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleItem2756); 

                    createLeafNode(grammarAccess.getItemAccess().getRightSquareBracketKeyword_5(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1582:1: ( RULE_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_WS) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1582:2: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleItem2766); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getWSTerminalRuleCall_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleCodeRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1594:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1595:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1596:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef2803);
            iv_ruleCodeRef=ruleCodeRef();
            _fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef2813); 

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
    // $ANTLR end entryRuleCodeRef


    // $ANTLR start ruleCodeRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1603:1: ruleCodeRef returns [EObject current=null] : ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1608:6: ( ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1609:1: ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1609:1: ( '\\\\codeRef' '[' ( ( ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1609:3: '\\\\codeRef' '[' ( ( ruleText ) ) ']'
            {
            match(input,23,FOLLOW_23_in_ruleCodeRef2848); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleCodeRef2858); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1617:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1618:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1618:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1619:3: ruleText
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCodeRef2881);
            ruleText();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleCodeRef2891); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleCodeRef


    // $ANTLR start entryRuleLink
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1645:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1646:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1647:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink2927);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink2937); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1654:1: ruleLink returns [EObject current=null] : ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_2_0 = null;

        AntlrDatatypeRuleToken lv_text_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1659:6: ( ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1660:1: ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1660:1: ( '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1660:3: '\\\\link' '[' ( (lv_url_2_0= ruleText ) ) ']' '[' ( (lv_text_5_0= ruleText ) ) ']'
            {
            match(input,24,FOLLOW_24_in_ruleLink2972); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleLink2982); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1668:1: ( (lv_url_2_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1669:1: (lv_url_2_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1669:1: (lv_url_2_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1670:3: lv_url_2_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3003);
            lv_url_2_0=ruleText();
            _fsp--;


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

            match(input,12,FOLLOW_12_in_ruleLink3013); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3(), null); 
                
            match(input,11,FOLLOW_11_in_ruleLink3023); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1700:1: ( (lv_text_5_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1701:1: (lv_text_5_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1701:1: (lv_text_5_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1702:3: lv_text_5_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3044);
            lv_text_5_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_5_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleLink3054); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleImageRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1736:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1737:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1738:2: iv_ruleImageRef= ruleImageRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef3090);
            iv_ruleImageRef=ruleImageRef();
            _fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef3100); 

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
    // $ANTLR end entryRuleImageRef


    // $ANTLR start ruleImageRef
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1745:1: ruleImageRef returns [EObject current=null] : ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_path_4_0 = null;

        AntlrDatatypeRuleToken lv_clazz_7_0 = null;

        AntlrDatatypeRuleToken lv_style_10_0 = null;

        AntlrDatatypeRuleToken lv_caption_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1750:6: ( ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1751:1: ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1751:1: ( '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1751:3: '\\\\img' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_path_4_0= ruleText ) ) ']' '[' ( (lv_clazz_7_0= ruleText ) ) ']' '[' ( (lv_style_10_0= ruleText ) ) ']' '[' ( (lv_caption_13_0= ruleText ) ) ']'
            {
            match(input,25,FOLLOW_25_in_ruleImageRef3135); 

                    createLeafNode(grammarAccess.getImageRefAccess().getImgKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1755:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==10) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1755:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,10,FOLLOW_10_in_ruleImageRef3146); 

                            createLeafNode(grammarAccess.getImageRefAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1759:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1760:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1760:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1761:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef3163); 

                    			createLeafNode(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

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


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleImageRef3180); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1787:1: ( (lv_path_4_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:1: (lv_path_4_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:1: (lv_path_4_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1789:3: lv_path_4_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3201);
            lv_path_4_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_4_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3211); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_4(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3221); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1819:1: ( (lv_clazz_7_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1820:1: (lv_clazz_7_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1820:1: (lv_clazz_7_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1821:3: lv_clazz_7_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3242);
            lv_clazz_7_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clazz",
            	        		lv_clazz_7_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3252); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_7(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3262); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1851:1: ( (lv_style_10_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1852:1: (lv_style_10_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1852:1: (lv_style_10_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1853:3: lv_style_10_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3283);
            lv_style_10_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"style",
            	        		lv_style_10_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3293); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10(), null); 
                
            match(input,11,FOLLOW_11_in_ruleImageRef3303); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1883:1: ( (lv_caption_13_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1884:1: (lv_caption_13_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1884:1: (lv_caption_13_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1885:3: lv_caption_13_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3324);
            lv_caption_13_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"caption",
            	        		lv_caption_13_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleImageRef3334); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13(), null); 
                

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
    // $ANTLR end ruleImageRef


    // $ANTLR start entryRuleCodeBlock
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1919:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1920:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1921:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3370);
            iv_ruleCodeBlock=ruleCodeBlock();
            _fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock3380); 

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
    // $ANTLR end entryRuleCodeBlock


    // $ANTLR start ruleCodeBlock
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1928:1: ruleCodeBlock returns [EObject current=null] : ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* ( RULE_MULTI_NL )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token lv_language_2_0=null;
        EObject lv_contents_7_0 = null;

        EObject lv_contents_8_0 = null;

        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1933:6: ( ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* ( RULE_MULTI_NL )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1934:1: ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* ( RULE_MULTI_NL )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1934:1: ( '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* ( RULE_MULTI_NL )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1934:3: '\\\\code' ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )? ( RULE_WS )* ( RULE_MULTI_NL )? '[' ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ ) ']'
            {
            match(input,26,FOLLOW_26_in_ruleCodeBlock3415); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getCodeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1938:1: ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1938:3: '[' ( (lv_language_2_0= RULE_ID ) ) ']'
                    {
                    match(input,11,FOLLOW_11_in_ruleCodeBlock3426); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1942:1: ( (lv_language_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1943:1: (lv_language_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1943:1: (lv_language_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1944:3: lv_language_2_0= RULE_ID
                    {
                    lv_language_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock3443); 

                    			createLeafNode(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0(), "language"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"language",
                    	        		lv_language_2_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleCodeBlock3458); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1970:3: ( RULE_WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_WS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1970:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeBlock3470); 
            	     
            	        createLeafNode(grammarAccess.getCodeBlockAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1974:3: ( RULE_MULTI_NL )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_MULTI_NL) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1974:4: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeBlock3481); 
                     
                        createLeafNode(grammarAccess.getCodeBlockAccess().getMULTI_NLTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleCodeBlock3492); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:1: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_MULTI_NL && LA56_0<=RULE_ANY_OTHER)||LA56_0==10||(LA56_0>=27 && LA56_0<=28)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=17 && LA56_0<=19)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1982:1: ( ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* ) | ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+ )", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:2: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:2: ( ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:3: ( (lv_contents_7_0= ruleCode ) ) ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1982:3: ( (lv_contents_7_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1983:1: (lv_contents_7_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1983:1: (lv_contents_7_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1984:3: lv_contents_7_0= ruleCode
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock3515);
                    lv_contents_7_0=ruleCode();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"contents",
                    	        		lv_contents_7_0, 
                    	        		"Code", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2006:2: ( ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )? )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=17 && LA53_0<=19)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2006:3: ( (lv_contents_8_0= ruleMarkupInCode ) ) ( (lv_contents_9_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2006:3: ( (lv_contents_8_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2007:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2007:1: (lv_contents_8_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2008:3: lv_contents_8_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock3537);
                    	    lv_contents_8_0=ruleMarkupInCode();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_8_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2030:2: ( (lv_contents_9_0= ruleCode ) )?
                    	    int alt52=2;
                    	    int LA52_0 = input.LA(1);

                    	    if ( ((LA52_0>=RULE_MULTI_NL && LA52_0<=RULE_ANY_OTHER)||LA52_0==10||(LA52_0>=27 && LA52_0<=28)) ) {
                    	        alt52=1;
                    	    }
                    	    switch (alt52) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2031:1: (lv_contents_9_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2031:1: (lv_contents_9_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2032:3: lv_contents_9_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock3558);
                    	            lv_contents_9_0=ruleCode();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_9_0, 
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
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2055:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2055:6: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=17 && LA55_0<=19)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2055:7: ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2055:7: ( (lv_contents_10_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2056:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2056:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2057:3: lv_contents_10_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock3590);
                    	    lv_contents_10_0=ruleMarkupInCode();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_10_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2079:2: ( (lv_contents_11_0= ruleCode ) )?
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( ((LA54_0>=RULE_MULTI_NL && LA54_0<=RULE_ANY_OTHER)||LA54_0==10||(LA54_0>=27 && LA54_0<=28)) ) {
                    	        alt54=1;
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2080:1: (lv_contents_11_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2080:1: (lv_contents_11_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2081:3: lv_contents_11_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock3611);
                    	            lv_contents_11_0=ruleCode();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_11_0, 
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
                    	    if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleCodeBlock3625); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleCodeBlock


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2115:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2116:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2117:2: iv_ruleTextPart= ruleTextPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart3661);
            iv_ruleTextPart=ruleTextPart();
            _fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart3671); 

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
    // $ANTLR end entryRuleTextPart


    // $ANTLR start ruleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2124:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2129:6: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2130:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2130:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2131:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2131:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2132:3: lv_text_0_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart3716);
            lv_text_0_0=ruleText();
            _fsp--;


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
    // $ANTLR end ruleTextPart


    // $ANTLR start entryRuleText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2162:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2163:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2164:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3752);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3763); 

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
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2171:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ANY_OTHER_2=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2176:6: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt57=0;
            loop57:
            do {
                int alt57=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt57=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt57=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt57=3;
                    }
                    break;
                case 27:
                    {
                    alt57=4;
                    }
                    break;
                case 28:
                    {
                    alt57=5;
                    }
                    break;
                case 10:
                    {
                    alt57=6;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText3803); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2185:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText3829); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2193:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText3855); 

            	    		current.merge(this_ANY_OTHER_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2202:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,27,FOLLOW_27_in_ruleText3879); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2209:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleText3898); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2216:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,10,FOLLOW_10_in_ruleText3917); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getColonKeyword_5(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
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
    // $ANTLR end ruleText


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2229:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2230:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2231:2: iv_ruleCodeText= ruleCodeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText3959);
            iv_ruleCodeText=ruleCodeText();
            _fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText3970); 

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
    // $ANTLR end entryRuleCodeText


    // $ANTLR start ruleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2238:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleCodeText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_MULTI_NL_1=null;
        Token this_WS_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2243:6: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2244:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2244:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt58=0;
            loop58:
            do {
                int alt58=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt58=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt58=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt58=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt58=4;
                    }
                    break;
                case 27:
                    {
                    alt58=5;
                    }
                    break;
                case 28:
                    {
                    alt58=6;
                    }
                    break;
                case 10:
                    {
                    alt58=7;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2244:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText4010); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2252:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)input.LT(1);
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText4036); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2260:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText4062); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2268:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4088); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2277:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,27,FOLLOW_27_in_ruleCodeText4112); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2284:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleCodeText4131); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2291:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,10,FOLLOW_10_in_ruleCodeText4150); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getColonKeyword_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // $ANTLR end ruleCodeText


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2304:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2305:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2306:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkupInCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4191);
            iv_ruleMarkupInCode=ruleMarkupInCode();
            _fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode4201); 

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
    // $ANTLR end entryRuleMarkupInCode


    // $ANTLR start ruleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2318:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2319:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2319:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt59=1;
                }
                break;
            case 18:
                {
                alt59=2;
                }
                break;
            case 19:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2319:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2320:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode4248);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2330:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode4275);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2340:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode4302);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
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
    // $ANTLR end ruleMarkupInCode


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2356:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2357:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2358:2: iv_ruleCode= ruleCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode4337);
            iv_ruleCode=ruleCode();
            _fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode4347); 

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
    // $ANTLR end entryRuleCode


    // $ANTLR start ruleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2365:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2370:6: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2371:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2371:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2372:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2372:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2373:3: lv_contents_0_0= ruleCodeText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode4392);
            lv_contents_0_0=ruleCodeText();
            _fsp--;


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
    // $ANTLR end ruleCode


    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA49_eotS =
        "\10\uffff";
    static final String DFA49_eofS =
        "\4\uffff\3\2\1\uffff";
    static final String DFA49_minS =
        "\2\4\1\uffff\3\4\1\5\1\uffff";
    static final String DFA49_maxS =
        "\1\13\1\34\1\uffff\4\34\1\uffff";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\4\uffff\1\1";
    static final String DFA49_specialS =
        "\10\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\1\uffff\1\2\4\uffff\1\1",
            "\1\2\1\3\2\2\2\uffff\1\2\6\uffff\3\2\7\uffff\2\2",
            "",
            "\4\2\2\uffff\1\2\1\uffff\1\4\4\uffff\3\2\7\uffff\2\2",
            "\1\6\1\2\1\5\1\2\1\uffff\2\2\1\7\12\2\1\uffff\6\2",
            "\1\6\1\2\1\5\1\2\1\uffff\2\2\1\7\12\2\1\uffff\6\2",
            "\3\2\1\uffff\2\2\1\7\1\uffff\11\2\1\uffff\6\2",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1938:1: ( '[' ( (lv_language_2_0= RULE_ID ) ) ']' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument131 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument153 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument194 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument213 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument235 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleChapter330 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleChapter341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter358 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleChapter375 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter396 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChapter406 = new BitSet(new long[]{0x0000000000002052L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChapter416 = new BitSet(new long[]{0x0000000000002052L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter427 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter447 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter482 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSection565 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection593 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection610 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection631 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection641 = new BitSet(new long[]{0x0000000000004052L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection651 = new BitSet(new long[]{0x0000000000004052L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection662 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection682 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection695 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleSection717 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubSection800 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSubSection811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSection828 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSubSection845 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection866 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSubSection876 = new BitSet(new long[]{0x0000000000008052L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSubSection886 = new BitSet(new long[]{0x0000000000008052L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection897 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection917 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection930 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSubSection952 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection3990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSection31035 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection31046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31063 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection31080 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31101 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection31111 = new BitSet(new long[]{0x0000000000010052L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection31121 = new BitSet(new long[]{0x0000000000010052L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31132 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31152 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31165 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31187 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSection41270 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleSection41281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection41298 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSection41315 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41336 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection41346 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSection41356 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection41367 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41387 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1484 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1506 = new BitSet(new long[]{0x000000001FBE04E2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1527 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1559 = new BitSet(new long[]{0x000000001FBE04E2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1580 = new BitSet(new long[]{0x0000000007BE0002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEmphasize1972 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEmphasize1983 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2004 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmphasize2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAnchor2096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleAnchor2106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor2123 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleAnchor2139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnchor2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef2187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRef2232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleRef2242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef2260 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef2270 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef2291 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRef2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrderedList2382 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrderedList2392 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_ruleOrderedList2403 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrderedList2413 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList2435 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleOrderedList2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUnorderedList2527 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleUnorderedList2537 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_ruleUnorderedList2548 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleUnorderedList2558 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList2580 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleUnorderedList2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleItem2672 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleItem2682 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_11_in_ruleItem2693 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem2714 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem2724 = new BitSet(new long[]{0x000000001FBE04E0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem2744 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleItem2756 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleItem2766 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCodeRef2848 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeRef2858 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef2881 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCodeRef2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink2927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLink2972 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink2982 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3003 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLink3013 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleLink3023 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3044 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLink3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef3090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleImageRef3135 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_ruleImageRef3146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef3163 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3180 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3221 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3252 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3262 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3283 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3303 = new BitSet(new long[]{0x00000000180004E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3324 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCodeBlock3415 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock3426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock3443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock3458 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeBlock3470 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeBlock3481 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCodeBlock3492 = new BitSet(new long[]{0x00000000180E04F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock3515 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock3537 = new BitSet(new long[]{0x00000000180E14F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock3558 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock3590 = new BitSet(new long[]{0x00000000180E14F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock3611 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText3803 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText3829 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText3855 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_27_in_ruleText3879 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_28_in_ruleText3898 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_10_in_ruleText3917 = new BitSet(new long[]{0x00000000180004E2L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText3959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText4010 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText4036 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText4062 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4088 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_27_in_ruleCodeText4112 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_28_in_ruleCodeText4131 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_10_in_ruleCodeText4150 = new BitSet(new long[]{0x00000000180004F2L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode4337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode4392 = new BitSet(new long[]{0x0000000000000002L});

}