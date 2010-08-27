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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_MULTI_NL", "RULE_ID", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "'\\\\chapter'", "':'", "'['", "']'", "'\\\\section'", "'\\\\subsection'", "'\\\\section3'", "'\\\\section4'", "'\\\\['", "'\\\\]'", "'\\\\emph'", "'\\\\a'", "'\\\\ref'", "'\\\\ol'", "'\\\\ul'", "'\\\\item'", "'\\\\codeRef'", "'\\\\link'", "'\\\\img'", "'\\\\code'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=4;
    public static final int EOF=-1;
    public static final int RULE_MULTI_NL=5;
    public static final int RULE_SINGLE_NL=7;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_SL_COMMENT=9;

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:86:1: ruleDocument returns [EObject current=null] : ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_chapters_3_0 = null;

        EObject lv_chapters_5_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_8_0 = null;

        EObject lv_subsections_9_0 = null;

        EObject lv_subsections_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:91:6: ( ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:1: ( () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:92:2: () ( RULE_WS )? ( RULE_MULTI_NL )? ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )?
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:2: ( RULE_WS )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_WS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:103:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleDocument129); 
                     
                        createLeafNode(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:107:3: ( RULE_MULTI_NL )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MULTI_NL) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:107:4: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument140); 
                     
                        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:3: ( ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==10||(LA8_0>=14 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) ) ( RULE_MULTI_NL )?
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 10:
                        {
                        alt6=1;
                        }
                        break;
                    case 14:
                        {
                        alt6=2;
                        }
                        break;
                    case 15:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("111:4: ( ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* ) | ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* ) | ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* ) )", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:5: ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:5: ( ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:6: ( (lv_chapters_3_0= ruleChapter ) ) ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:111:6: ( (lv_chapters_3_0= ruleChapter ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:112:1: (lv_chapters_3_0= ruleChapter )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:112:1: (lv_chapters_3_0= ruleChapter )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:113:3: lv_chapters_3_0= ruleChapter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleChapter_in_ruleDocument165);
                            lv_chapters_3_0=ruleChapter();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"chapters",
                            	        		lv_chapters_3_0, 
                            	        		"Chapter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:135:2: ( RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) ) )*
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
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:135:3: RULE_MULTI_NL ( (lv_chapters_5_0= ruleChapter ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument175); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:139:1: ( (lv_chapters_5_0= ruleChapter ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:140:1: (lv_chapters_5_0= ruleChapter )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:140:1: (lv_chapters_5_0= ruleChapter )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:141:3: lv_chapters_5_0= ruleChapter
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleChapter_in_ruleDocument195);
                            	    lv_chapters_5_0=ruleChapter();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"chapters",
                            	    	        		lv_chapters_5_0, 
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
                            	    break loop3;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:6: ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:6: ( ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:7: ( (lv_sections_6_0= ruleSection ) ) ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:164:7: ( (lv_sections_6_0= ruleSection ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:165:1: (lv_sections_6_0= ruleSection )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:165:1: (lv_sections_6_0= ruleSection )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:166:3: lv_sections_6_0= ruleSection
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSection_in_ruleDocument226);
                            lv_sections_6_0=ruleSection();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"sections",
                            	        		lv_sections_6_0, 
                            	        		"Section", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:188:2: ( RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==RULE_MULTI_NL) ) {
                                    int LA4_1 = input.LA(2);

                                    if ( (LA4_1==14) ) {
                                        alt4=1;
                                    }


                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:188:3: RULE_MULTI_NL ( (lv_sections_8_0= ruleSection ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument236); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:192:1: ( (lv_sections_8_0= ruleSection ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:193:1: (lv_sections_8_0= ruleSection )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:193:1: (lv_sections_8_0= ruleSection )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:194:3: lv_sections_8_0= ruleSection
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSection_in_ruleDocument256);
                            	    lv_sections_8_0=ruleSection();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"sections",
                            	    	        		lv_sections_8_0, 
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
                            	    break loop4;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:6: ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:6: ( ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )* )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:7: ( (lv_subsections_9_0= ruleSubSection ) ) ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )*
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:217:7: ( (lv_subsections_9_0= ruleSubSection ) )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:218:1: (lv_subsections_9_0= ruleSubSection )
                            {
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:218:1: (lv_subsections_9_0= ruleSubSection )
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:219:3: lv_subsections_9_0= ruleSubSection
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleSubSection_in_ruleDocument287);
                            lv_subsections_9_0=ruleSubSection();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"subsections",
                            	        		lv_subsections_9_0, 
                            	        		"SubSection", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:241:2: ( RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_MULTI_NL) ) {
                                    int LA5_1 = input.LA(2);

                                    if ( (LA5_1==15) ) {
                                        alt5=1;
                                    }


                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:241:3: RULE_MULTI_NL ( (lv_subsections_11_0= ruleSubSection ) )
                            	    {
                            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument297); 
                            	     
                            	        createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0(), null); 
                            	        
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:245:1: ( (lv_subsections_11_0= ruleSubSection ) )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:246:1: (lv_subsections_11_0= ruleSubSection )
                            	    {
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:246:1: (lv_subsections_11_0= ruleSubSection )
                            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:247:3: lv_subsections_11_0= ruleSubSection
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSubSection_in_ruleDocument317);
                            	    lv_subsections_11_0=ruleSubSection();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getDocumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"subsections",
                            	    	        		lv_subsections_11_0, 
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
                            	    break loop5;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:269:6: ( RULE_MULTI_NL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_MULTI_NL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:269:7: RULE_MULTI_NL
                            {
                            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleDocument331); 
                             
                                createLeafNode(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1(), null); 
                                

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
    // $ANTLR end ruleDocument


    // $ANTLR start entryRuleChapter
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:281:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:282:2: (iv_ruleChapter= ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:283:2: iv_ruleChapter= ruleChapter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChapterRule(), currentNode); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter370);
            iv_ruleChapter=ruleChapter();
            _fsp--;

             current =iv_ruleChapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter380); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:290:1: ruleChapter returns [EObject current=null] : ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:295:6: ( ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:1: ( '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:296:3: '\\\\chapter' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )*
            {
            match(input,10,FOLLOW_10_in_ruleChapter415); 

                    createLeafNode(grammarAccess.getChapterAccess().getChapterKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:300:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:300:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleChapter426); 

                            createLeafNode(grammarAccess.getChapterAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:304:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:305:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:305:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:306:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChapter443); 

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

            match(input,12,FOLLOW_12_in_ruleChapter460); 

                    createLeafNode(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:332:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:333:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:333:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:334:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter481);
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

            match(input,13,FOLLOW_13_in_ruleChapter491); 

                    createLeafNode(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:360:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_MULTI_NL) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_WS||(LA10_1>=RULE_ID && LA10_1<=RULE_ANY_OTHER)||LA10_1==11||(LA10_1>=18 && LA10_1<=24)||(LA10_1>=26 && LA10_1<=29)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:360:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter501); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:364:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:365:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:365:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:366:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleChapter521);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
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
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:388:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_MULTI_NL) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==14) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:388:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleChapter533); 
            	     
            	        createLeafNode(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:392:1: ( (lv_contents_9_0= ruleSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:393:1: (lv_contents_9_0= ruleSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:393:1: (lv_contents_9_0= ruleSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:394:3: lv_contents_9_0= ruleSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleChapter553);
            	    lv_contents_9_0=ruleSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getChapterRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
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
            	    break loop11;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:424:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:425:2: (iv_ruleSection= ruleSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:426:2: iv_ruleSection= ruleSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection591);
            iv_ruleSection=ruleSection();
            _fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection601); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:433:1: ruleSection returns [EObject current=null] : ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:438:6: ( ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:439:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:439:1: ( '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:439:3: '\\\\section' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )*
            {
            match(input,14,FOLLOW_14_in_ruleSection636); 

                    createLeafNode(grammarAccess.getSectionAccess().getSectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:443:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:443:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleSection647); 

                            createLeafNode(grammarAccess.getSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:447:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:448:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:448:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:449:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection664); 

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

            match(input,12,FOLLOW_12_in_ruleSection681); 

                    createLeafNode(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:475:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:476:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:476:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:477:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection702);
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

            match(input,13,FOLLOW_13_in_ruleSection712); 

                    createLeafNode(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:503:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_MULTI_NL) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_WS||(LA13_1>=RULE_ID && LA13_1<=RULE_ANY_OTHER)||LA13_1==11||(LA13_1>=18 && LA13_1<=24)||(LA13_1>=26 && LA13_1<=29)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:503:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection722); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:507:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:508:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:508:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:509:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection742);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
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
            	    break loop13;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:531:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_MULTI_NL) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==15) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:531:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSubSection ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection754); 
            	     
            	        createLeafNode(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:535:1: ( (lv_contents_9_0= ruleSubSection ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:536:1: (lv_contents_9_0= ruleSubSection )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:536:1: (lv_contents_9_0= ruleSubSection )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:537:3: lv_contents_9_0= ruleSubSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubSection_in_ruleSection774);
            	    lv_contents_9_0=ruleSubSection();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
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
            	    break loop14;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:567:1: entryRuleSubSection returns [EObject current=null] : iv_ruleSubSection= ruleSubSection EOF ;
    public final EObject entryRuleSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSection = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:568:2: (iv_ruleSubSection= ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:569:2: iv_ruleSubSection= ruleSubSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSubSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection812);
            iv_ruleSubSection=ruleSubSection();
            _fsp--;

             current =iv_ruleSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection822); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:576:1: ruleSubSection returns [EObject current=null] : ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* ) ;
    public final EObject ruleSubSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:581:6: ( ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:582:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:582:1: ( '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:582:3: '\\\\subsection' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )*
            {
            match(input,15,FOLLOW_15_in_ruleSubSection857); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:586:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:586:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleSubSection868); 

                            createLeafNode(grammarAccess.getSubSectionAccess().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:590:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:591:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:591:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:592:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSection885); 

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

            match(input,12,FOLLOW_12_in_ruleSubSection902); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:618:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:619:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:619:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:620:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection923);
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

            match(input,13,FOLLOW_13_in_ruleSubSection933); 

                    createLeafNode(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:646:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTI_NL) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_WS||(LA16_1>=RULE_ID && LA16_1<=RULE_ANY_OTHER)||LA16_1==11||(LA16_1>=18 && LA16_1<=24)||(LA16_1>=26 && LA16_1<=29)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:646:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection943); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:650:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:651:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:651:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:652:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSubSection963);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
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
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:674:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_MULTI_NL) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==16) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:674:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection3 ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSubSection975); 
            	     
            	        createLeafNode(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:678:1: ( (lv_contents_9_0= ruleSection3 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:679:1: (lv_contents_9_0= ruleSection3 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:679:1: (lv_contents_9_0= ruleSection3 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:680:3: lv_contents_9_0= ruleSection3
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection3_in_ruleSubSection995);
            	    lv_contents_9_0=ruleSection3();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSubSectionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
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
            	    break loop17;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:710:1: entryRuleSection3 returns [EObject current=null] : iv_ruleSection3= ruleSection3 EOF ;
    public final EObject entryRuleSection3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection3 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:711:2: (iv_ruleSection3= ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:712:2: iv_ruleSection3= ruleSection3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection3Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection31033);
            iv_ruleSection3=ruleSection3();
            _fsp--;

             current =iv_ruleSection3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection31043); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:719:1: ruleSection3 returns [EObject current=null] : ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* ) ;
    public final EObject ruleSection3() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;

        EObject lv_contents_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:724:6: ( ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:725:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:725:1: ( '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:725:3: '\\\\section3' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )*
            {
            match(input,16,FOLLOW_16_in_ruleSection31078); 

                    createLeafNode(grammarAccess.getSection3Access().getSection3Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:729:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:729:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleSection31089); 

                            createLeafNode(grammarAccess.getSection3Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:733:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:734:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:734:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:735:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection31106); 

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

            match(input,12,FOLLOW_12_in_ruleSection31123); 

                    createLeafNode(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:761:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:762:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:762:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:763:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31144);
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

            match(input,13,FOLLOW_13_in_ruleSection31154); 

                    createLeafNode(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:789:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_MULTI_NL) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_WS||(LA19_1>=RULE_ID && LA19_1<=RULE_ANY_OTHER)||LA19_1==11||(LA19_1>=18 && LA19_1<=24)||(LA19_1>=26 && LA19_1<=29)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:789:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31164); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:793:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:794:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:794:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:795:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection31184);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


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
            	    break loop19;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:817:4: ( RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTI_NL) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==17) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:817:5: RULE_MULTI_NL ( (lv_contents_9_0= ruleSection4 ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection31196); 
            	     
            	        createLeafNode(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_6_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:821:1: ( (lv_contents_9_0= ruleSection4 ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:822:1: (lv_contents_9_0= ruleSection4 )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:822:1: (lv_contents_9_0= ruleSection4 )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:823:3: lv_contents_9_0= ruleSection4
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_6_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection4_in_ruleSection31216);
            	    lv_contents_9_0=ruleSection4();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSection3Rule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_9_0, 
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
            	    break loop20;
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:853:1: entryRuleSection4 returns [EObject current=null] : iv_ruleSection4= ruleSection4 EOF ;
    public final EObject entryRuleSection4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection4 = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:854:2: (iv_ruleSection4= ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:855:2: iv_ruleSection4= ruleSection4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSection4Rule(), currentNode); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection41254);
            iv_ruleSection4=ruleSection4();
            _fsp--;

             current =iv_ruleSection4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection41264); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:862:1: ruleSection4 returns [EObject current=null] : ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) ;
    public final EObject ruleSection4() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_title_4_0 = null;

        EObject lv_contents_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:867:6: ( ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:868:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:868:1: ( '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )* )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:868:3: '\\\\section4' ( ':' ( (lv_name_2_0= RULE_ID ) ) )? '[' ( (lv_title_4_0= ruleTextOrMarkup ) ) ']' ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            {
            match(input,17,FOLLOW_17_in_ruleSection41299); 

                    createLeafNode(grammarAccess.getSection4Access().getSection4Keyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:1: ( ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:872:3: ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleSection41310); 

                            createLeafNode(grammarAccess.getSection4Access().getColonKeyword_1_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:876:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:877:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:878:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection41327); 

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

            match(input,12,FOLLOW_12_in_ruleSection41344); 

                    createLeafNode(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:904:1: ( (lv_title_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:905:1: (lv_title_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:905:1: (lv_title_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:906:3: lv_title_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41365);
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

            match(input,13,FOLLOW_13_in_ruleSection41375); 

                    createLeafNode(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:932:1: ( RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MULTI_NL) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_WS||(LA22_1>=RULE_ID && LA22_1<=RULE_ANY_OTHER)||LA22_1==11||(LA22_1>=18 && LA22_1<=24)||(LA22_1>=26 && LA22_1<=29)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:932:2: RULE_MULTI_NL ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleSection41385); 
            	     
            	        createLeafNode(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:936:1: ( (lv_contents_7_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:937:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:937:1: (lv_contents_7_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:938:3: lv_contents_7_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleSection41405);
            	    lv_contents_7_0=ruleTextOrMarkup();
            	    _fsp--;


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
            	    break loop22;
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
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:970:1: entryRuleTextOrMarkup returns [EObject current=null] : iv_ruleTextOrMarkup= ruleTextOrMarkup EOF ;
    public final EObject entryRuleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextOrMarkup = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:971:2: (iv_ruleTextOrMarkup= ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:972:2: iv_ruleTextOrMarkup= ruleTextOrMarkup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextOrMarkupRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1445);
            iv_ruleTextOrMarkup=ruleTextOrMarkup();
            _fsp--;

             current =iv_ruleTextOrMarkup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup1455); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:979:1: ruleTextOrMarkup returns [EObject current=null] : ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) ;
    public final EObject ruleTextOrMarkup() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_contents_2_0 = null;

        EObject lv_contents_3_0 = null;

        EObject lv_contents_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:984:6: ( ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS||(LA27_0>=RULE_ID && LA27_0<=RULE_ANY_OTHER)||LA27_0==11||(LA27_0>=18 && LA27_0<=19)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=20 && LA27_0<=24)||(LA27_0>=26 && LA27_0<=29)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("985:1: ( ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* ) | ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+ )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:2: ( ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:3: ( (lv_contents_0_0= ruleTextPart ) ) ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:985:3: ( (lv_contents_0_0= ruleTextPart ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:986:1: (lv_contents_0_0= ruleTextPart )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:986:1: (lv_contents_0_0= ruleTextPart )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:987:3: lv_contents_0_0= ruleTextPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1502);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1009:2: ( ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=20 && LA24_0<=24)||(LA24_0>=26 && LA24_0<=29)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1009:3: ( (lv_contents_1_0= ruleMarkUp ) ) ( (lv_contents_2_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1009:3: ( (lv_contents_1_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1010:1: (lv_contents_1_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1010:1: (lv_contents_1_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1011:3: lv_contents_1_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1524);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1033:2: ( (lv_contents_2_0= ruleTextPart ) )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_WS||(LA23_0>=RULE_ID && LA23_0<=RULE_ANY_OTHER)||LA23_0==11||(LA23_0>=18 && LA23_0<=19)) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1034:1: (lv_contents_2_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1034:1: (lv_contents_2_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1035:3: lv_contents_2_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1545);
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
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1058:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1058:6: ( ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )? )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=20 && LA26_0<=24)||(LA26_0>=26 && LA26_0<=29)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1058:7: ( (lv_contents_3_0= ruleMarkUp ) ) ( (lv_contents_4_0= ruleTextPart ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1058:7: ( (lv_contents_3_0= ruleMarkUp ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1059:1: (lv_contents_3_0= ruleMarkUp )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1059:1: (lv_contents_3_0= ruleMarkUp )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1060:3: lv_contents_3_0= ruleMarkUp
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1577);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1082:2: ( (lv_contents_4_0= ruleTextPart ) )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==RULE_WS||(LA25_0>=RULE_ID && LA25_0<=RULE_ANY_OTHER)||LA25_0==11||(LA25_0>=18 && LA25_0<=19)) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1083:1: (lv_contents_4_0= ruleTextPart )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1083:1: (lv_contents_4_0= ruleTextPart )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1084:3: lv_contents_4_0= ruleTextPart
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTextPart_in_ruleTextOrMarkup1598);
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
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1114:1: entryRuleTextPart returns [EObject current=null] : iv_ruleTextPart= ruleTextPart EOF ;
    public final EObject entryRuleTextPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextPart = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1115:2: (iv_ruleTextPart= ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1116:2: iv_ruleTextPart= ruleTextPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1637);
            iv_ruleTextPart=ruleTextPart();
            _fsp--;

             current =iv_ruleTextPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1647); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1123:1: ruleTextPart returns [EObject current=null] : ( (lv_text_0_0= ruleText ) ) ;
    public final EObject ruleTextPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1128:6: ( ( (lv_text_0_0= ruleText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1129:1: ( (lv_text_0_0= ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1129:1: ( (lv_text_0_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1130:1: (lv_text_0_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1130:1: (lv_text_0_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1131:3: lv_text_0_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTextPart1692);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1161:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1162:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1163:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1728);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1739); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1170:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_SINGLE_NL_2=null;
        Token this_ANY_OTHER_3=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1175:6: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1176:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1176:1: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SINGLE_NL_2= RULE_SINGLE_NL | this_ANY_OTHER_3= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt28=2;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt28=3;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt28=4;
                    }
                    break;
                case 18:
                    {
                    alt28=5;
                    }
                    break;
                case 19:
                    {
                    alt28=6;
                    }
                    break;
                case 11:
                    {
                    alt28=7;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1176:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1779); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1184:10: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleText1805); 

            	    		current.merge(this_WS_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getWSTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1192:10: this_SINGLE_NL_2= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_2=(Token)input.LT(1);
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleText1831); 

            	    		current.merge(this_SINGLE_NL_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1200:10: this_ANY_OTHER_3= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_3=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText1857); 

            	    		current.merge(this_ANY_OTHER_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1209:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,18,FOLLOW_18_in_ruleText1881); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1216:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,19,FOLLOW_19_in_ruleText1900); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1223:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleText1919); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getTextAccess().getColonKeyword_6(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1236:1: entryRuleMarkUp returns [EObject current=null] : iv_ruleMarkUp= ruleMarkUp EOF ;
    public final EObject entryRuleMarkUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkUp = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1237:2: (iv_ruleMarkUp= ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1238:2: iv_ruleMarkUp= ruleMarkUp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkUpRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp1960);
            iv_ruleMarkUp=ruleMarkUp();
            _fsp--;

             current =iv_ruleMarkUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp1970); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1245:1: ruleMarkUp returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1250:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1251:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1251:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt29=1;
                }
                break;
            case 21:
                {
                alt29=2;
                }
                break;
            case 22:
                {
                alt29=3;
                }
                break;
            case 23:
                {
                alt29=4;
                }
                break;
            case 24:
                {
                alt29=5;
                }
                break;
            case 29:
                {
                alt29=6;
                }
                break;
            case 26:
                {
                alt29=7;
                }
                break;
            case 27:
                {
                alt29=8;
                }
                break;
            case 28:
                {
                alt29=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1251:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef | this_OrderedList_3= ruleOrderedList | this_UnorderedList_4= ruleUnorderedList | this_CodeBlock_5= ruleCodeBlock | this_CodeRef_6= ruleCodeRef | this_Link_7= ruleLink | this_ImageRef_8= ruleImageRef )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1252:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkUp2017);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1262:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkUp2044);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1272:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkUp2071);
                    this_Ref_2=ruleRef();
                    _fsp--;

                     
                            current = this_Ref_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1282:5: this_OrderedList_3= ruleOrderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleMarkUp2098);
                    this_OrderedList_3=ruleOrderedList();
                    _fsp--;

                     
                            current = this_OrderedList_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1292:5: this_UnorderedList_4= ruleUnorderedList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleMarkUp2125);
                    this_UnorderedList_4=ruleUnorderedList();
                    _fsp--;

                     
                            current = this_UnorderedList_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1302:5: this_CodeBlock_5= ruleCodeBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleMarkUp2152);
                    this_CodeBlock_5=ruleCodeBlock();
                    _fsp--;

                     
                            current = this_CodeBlock_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1312:5: this_CodeRef_6= ruleCodeRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCodeRef_in_ruleMarkUp2179);
                    this_CodeRef_6=ruleCodeRef();
                    _fsp--;

                     
                            current = this_CodeRef_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1322:5: this_Link_7= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleMarkUp2206);
                    this_Link_7=ruleLink();
                    _fsp--;

                     
                            current = this_Link_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1332:5: this_ImageRef_8= ruleImageRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImageRef_in_ruleMarkUp2233);
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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1348:1: entryRuleEmphasize returns [EObject current=null] : iv_ruleEmphasize= ruleEmphasize EOF ;
    public final EObject entryRuleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasize = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1349:2: (iv_ruleEmphasize= ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1350:2: iv_ruleEmphasize= ruleEmphasize EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmphasizeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize2268);
            iv_ruleEmphasize=ruleEmphasize();
            _fsp--;

             current =iv_ruleEmphasize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize2278); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1357:1: ruleEmphasize returns [EObject current=null] : ( '\\\\emph' '[' ( RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) ;
    public final EObject ruleEmphasize() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1362:6: ( ( '\\\\emph' '[' ( RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1363:1: ( '\\\\emph' '[' ( RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1363:1: ( '\\\\emph' '[' ( RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1363:3: '\\\\emph' '[' ( RULE_MULTI_NL )? ( (lv_contents_3_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']'
            {
            match(input,20,FOLLOW_20_in_ruleEmphasize2313); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getEmphKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleEmphasize2323); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1371:1: ( RULE_MULTI_NL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_MULTI_NL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1371:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2333); 
                     
                        createLeafNode(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1375:3: ( (lv_contents_3_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1376:1: (lv_contents_3_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1376:1: (lv_contents_3_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1377:3: lv_contents_3_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2355);
            lv_contents_3_0=ruleTextOrMarkup();
            _fsp--;


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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1399:2: ( RULE_MULTI_NL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_MULTI_NL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1399:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2365); 
                     
                        createLeafNode(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_4(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleEmphasize2376); 

                    createLeafNode(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1415:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1416:2: (iv_ruleAnchor= ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1417:2: iv_ruleAnchor= ruleAnchor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnchorRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor2412);
            iv_ruleAnchor=ruleAnchor();
            _fsp--;

             current =iv_ruleAnchor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor2422); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1424:1: ruleAnchor returns [EObject current=null] : ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1429:6: ( ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1430:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1430:1: ( '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )? )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1430:3: '\\\\a' ':' ( (lv_name_2_0= RULE_ID ) ) ( '[' ']' )?
            {
            match(input,21,FOLLOW_21_in_ruleAnchor2457); 

                    createLeafNode(grammarAccess.getAnchorAccess().getAKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleAnchor2467); 

                    createLeafNode(grammarAccess.getAnchorAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1438:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1439:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1439:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1440:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnchor2484); 

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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1462:2: ( '[' ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1462:4: '[' ']'
                    {
                    match(input,12,FOLLOW_12_in_ruleAnchor2500); 

                            createLeafNode(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0(), null); 
                        
                    match(input,13,FOLLOW_13_in_ruleAnchor2510); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1478:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1479:2: (iv_ruleRef= ruleRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1480:2: iv_ruleRef= ruleRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef2548);
            iv_ruleRef=ruleRef();
            _fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef2558); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1487:1: ruleRef returns [EObject current=null] : ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_5_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1492:6: ( ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_5_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1493:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_5_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1493:1: ( '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_5_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1493:3: '\\\\ref' ':' ( ( RULE_ID ) ) '[' ( RULE_MULTI_NL )? ( (lv_contents_5_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL )? ']'
            {
            match(input,22,FOLLOW_22_in_ruleRef2593); 

                    createLeafNode(grammarAccess.getRefAccess().getRefKeyword_0(), null); 
                
            match(input,11,FOLLOW_11_in_ruleRef2603); 

                    createLeafNode(grammarAccess.getRefAccess().getColonKeyword_1(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1501:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1502:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1502:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1503:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef2621); 

            		createLeafNode(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0(), "ref"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_ruleRef2631); 

                    createLeafNode(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1519:1: ( RULE_MULTI_NL )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_MULTI_NL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1519:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef2641); 
                     
                        createLeafNode(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_4(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1523:3: ( (lv_contents_5_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1524:1: (lv_contents_5_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1524:1: (lv_contents_5_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1525:3: lv_contents_5_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleRef2663);
            lv_contents_5_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1547:2: ( RULE_MULTI_NL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_MULTI_NL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1547:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleRef2673); 
                     
                        createLeafNode(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_6(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleRef2684); 

                    createLeafNode(grammarAccess.getRefAccess().getRightSquareBracketKeyword_7(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1563:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1564:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1565:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList2720);
            iv_ruleOrderedList=ruleOrderedList();
            _fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList2730); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1572:1: ruleOrderedList returns [EObject current=null] : ( '\\\\ol' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1577:6: ( ( '\\\\ol' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1578:1: ( '\\\\ol' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1578:1: ( '\\\\ol' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1578:3: '\\\\ol' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']'
            {
            match(input,23,FOLLOW_23_in_ruleOrderedList2765); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getOlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1582:1: ( ruleANY_WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_WS && LA35_0<=RULE_MULTI_NL)||LA35_0==RULE_SINGLE_NL) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1583:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList2782);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleOrderedList2793); 

                    createLeafNode(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1594:1: ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1594:2: ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1594:2: ( ruleANY_WS )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( ((LA36_0>=RULE_WS && LA36_0<=RULE_MULTI_NL)||LA36_0==RULE_SINGLE_NL) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1595:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_3_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList2811);
            	    	    ruleANY_WS();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1602:3: ( (lv_items_4_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1603:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1603:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1604:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleOrderedList2833);
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


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1626:4: ( ruleANY_WS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WS && LA38_0<=RULE_MULTI_NL)||LA38_0==RULE_SINGLE_NL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1627:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_4(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleOrderedList2852);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleOrderedList2863); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1646:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1647:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1648:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnorderedListRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2899);
            iv_ruleUnorderedList=ruleUnorderedList();
            _fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList2909); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1655:1: ruleUnorderedList returns [EObject current=null] : ( '\\\\ul' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1660:6: ( ( '\\\\ul' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1661:1: ( '\\\\ul' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1661:1: ( '\\\\ul' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1661:3: '\\\\ul' ( ruleANY_WS )* '[' ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+ ( ruleANY_WS )* ']'
            {
            match(input,24,FOLLOW_24_in_ruleUnorderedList2944); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getUlKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1665:1: ( ruleANY_WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_WS && LA39_0<=RULE_MULTI_NL)||LA39_0==RULE_SINGLE_NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1666:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList2961);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleUnorderedList2972); 

                    createLeafNode(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1677:1: ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1677:2: ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1677:2: ( ruleANY_WS )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( ((LA40_0>=RULE_WS && LA40_0<=RULE_MULTI_NL)||LA40_0==RULE_SINGLE_NL) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1678:5: ruleANY_WS
            	    	    {
            	    	     
            	    	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_3_0(), currentNode); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList2990);
            	    	    ruleANY_WS();
            	    	    _fsp--;

            	    	     
            	    	            currentNode = currentNode.getParent();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1685:3: ( (lv_items_4_0= ruleItem ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1686:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1686:1: (lv_items_4_0= ruleItem )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1687:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleUnorderedList3012);
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1709:4: ( ruleANY_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_WS && LA42_0<=RULE_MULTI_NL)||LA42_0==RULE_SINGLE_NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1710:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_4(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleUnorderedList3031);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleUnorderedList3042); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1729:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1730:2: (iv_ruleItem= ruleItem EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1731:2: iv_ruleItem= ruleItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getItemRule(), currentNode); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem3078);
            iv_ruleItem=ruleItem();
            _fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem3088); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1738:1: ruleItem returns [EObject current=null] : ( '\\\\item' ( ruleANY_WS )* '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )* ']' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_4_0 = null;

        EObject lv_contents_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1743:6: ( ( '\\\\item' ( ruleANY_WS )* '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )* ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1744:1: ( '\\\\item' ( ruleANY_WS )* '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )* ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1744:1: ( '\\\\item' ( ruleANY_WS )* '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )* ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1744:3: '\\\\item' ( ruleANY_WS )* '[' ( RULE_MULTI_NL )? ( (lv_contents_4_0= ruleTextOrMarkup ) ) ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )* ']'
            {
            match(input,25,FOLLOW_25_in_ruleItem3123); 

                    createLeafNode(grammarAccess.getItemAccess().getItemKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1748:1: ( ruleANY_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_WS && LA43_0<=RULE_MULTI_NL)||LA43_0==RULE_SINGLE_NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1749:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getItemAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleItem3140);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleItem3151); 

                    createLeafNode(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1760:1: ( RULE_MULTI_NL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_MULTI_NL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1760:2: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem3161); 
                     
                        createLeafNode(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1764:3: ( (lv_contents_4_0= ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1765:1: (lv_contents_4_0= ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1765:1: (lv_contents_4_0= ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1766:3: lv_contents_4_0= ruleTextOrMarkup
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem3183);
            lv_contents_4_0=ruleTextOrMarkup();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
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

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:2: ( RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_MULTI_NL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1788:3: RULE_MULTI_NL ( (lv_contents_6_0= ruleTextOrMarkup ) )
            	    {
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleItem3193); 
            	     
            	        createLeafNode(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_5_0(), null); 
            	        
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1792:1: ( (lv_contents_6_0= ruleTextOrMarkup ) )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1793:1: (lv_contents_6_0= ruleTextOrMarkup )
            	    {
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1793:1: (lv_contents_6_0= ruleTextOrMarkup )
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1794:3: lv_contents_6_0= ruleTextOrMarkup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextOrMarkup_in_ruleItem3213);
            	    lv_contents_6_0=ruleTextOrMarkup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getItemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contents",
            	    	        		lv_contents_6_0, 
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
            	    break loop45;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleItem3225); 

                    createLeafNode(grammarAccess.getItemAccess().getRightSquareBracketKeyword_6(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1828:1: entryRuleCodeRef returns [EObject current=null] : iv_ruleCodeRef= ruleCodeRef EOF ;
    public final EObject entryRuleCodeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1829:2: (iv_ruleCodeRef= ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1830:2: iv_ruleCodeRef= ruleCodeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef3261);
            iv_ruleCodeRef=ruleCodeRef();
            _fsp--;

             current =iv_ruleCodeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef3271); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1837:1: ruleCodeRef returns [EObject current=null] : ( '\\\\codeRef' ( ruleANY_WS )* '[' ( ( ruleText ) ) ']' ) ;
    public final EObject ruleCodeRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1842:6: ( ( '\\\\codeRef' ( ruleANY_WS )* '[' ( ( ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1843:1: ( '\\\\codeRef' ( ruleANY_WS )* '[' ( ( ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1843:1: ( '\\\\codeRef' ( ruleANY_WS )* '[' ( ( ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1843:3: '\\\\codeRef' ( ruleANY_WS )* '[' ( ( ruleText ) ) ']'
            {
            match(input,26,FOLLOW_26_in_ruleCodeRef3306); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1847:1: ( ruleANY_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WS && LA46_0<=RULE_MULTI_NL)||LA46_0==RULE_SINGLE_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1848:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeRef3323);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleCodeRef3334); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1859:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1860:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1860:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1861:3: ruleText
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCodeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCodeRef3357);
            ruleText();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleCodeRef3367); 

                    createLeafNode(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_4(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1887:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1888:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1889:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink3403);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink3413); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1896:1: ruleLink returns [EObject current=null] : ( '\\\\link' ( ruleANY_WS )* '[' ( (lv_url_3_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_7_0= ruleText ) ) ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_text_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1901:6: ( ( '\\\\link' ( ruleANY_WS )* '[' ( (lv_url_3_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_7_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1902:1: ( '\\\\link' ( ruleANY_WS )* '[' ( (lv_url_3_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_7_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1902:1: ( '\\\\link' ( ruleANY_WS )* '[' ( (lv_url_3_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_7_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1902:3: '\\\\link' ( ruleANY_WS )* '[' ( (lv_url_3_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_text_7_0= ruleText ) ) ']'
            {
            match(input,27,FOLLOW_27_in_ruleLink3448); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1906:1: ( ruleANY_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_WS && LA47_0<=RULE_MULTI_NL)||LA47_0==RULE_SINGLE_NL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1907:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink3465);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleLink3476); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1918:1: ( (lv_url_3_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1919:1: (lv_url_3_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1919:1: (lv_url_3_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1920:3: lv_url_3_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3497);
            lv_url_3_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"url",
            	        		lv_url_3_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLink3507); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_4(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1946:1: ( ruleANY_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_WS && LA48_0<=RULE_MULTI_NL)||LA48_0==RULE_SINGLE_NL) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1947:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_5(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleLink3524);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleLink3535); 

                    createLeafNode(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_6(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1958:1: ( (lv_text_7_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1959:1: (lv_text_7_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1959:1: (lv_text_7_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1960:3: lv_text_7_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTextTextParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleLink3556);
            lv_text_7_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_7_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLink3566); 

                    createLeafNode(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_8(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1994:1: entryRuleImageRef returns [EObject current=null] : iv_ruleImageRef= ruleImageRef EOF ;
    public final EObject entryRuleImageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageRef = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1995:2: (iv_ruleImageRef= ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:1996:2: iv_ruleImageRef= ruleImageRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImageRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef3602);
            iv_ruleImageRef=ruleImageRef();
            _fsp--;

             current =iv_ruleImageRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef3612); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2003:1: ruleImageRef returns [EObject current=null] : ( '\\\\img' ( ruleANY_WS )* ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )? '[' ( (lv_path_7_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_11_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_15_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_19_0= ruleText ) ) ']' ) ;
    public final EObject ruleImageRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_path_7_0 = null;

        AntlrDatatypeRuleToken lv_clazz_11_0 = null;

        AntlrDatatypeRuleToken lv_style_15_0 = null;

        AntlrDatatypeRuleToken lv_caption_19_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2008:6: ( ( '\\\\img' ( ruleANY_WS )* ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )? '[' ( (lv_path_7_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_11_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_15_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_19_0= ruleText ) ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2009:1: ( '\\\\img' ( ruleANY_WS )* ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )? '[' ( (lv_path_7_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_11_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_15_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_19_0= ruleText ) ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2009:1: ( '\\\\img' ( ruleANY_WS )* ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )? '[' ( (lv_path_7_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_11_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_15_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_19_0= ruleText ) ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2009:3: '\\\\img' ( ruleANY_WS )* ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )? '[' ( (lv_path_7_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_clazz_11_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_style_15_0= ruleText ) ) ']' ( ruleANY_WS )* '[' ( (lv_caption_19_0= ruleText ) ) ']'
            {
            match(input,28,FOLLOW_28_in_ruleImageRef3647); 

                    createLeafNode(grammarAccess.getImageRefAccess().getImgKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2013:1: ( ruleANY_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_WS && LA49_0<=RULE_MULTI_NL)||LA49_0==RULE_SINGLE_NL) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2014:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3664);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2021:3: ( ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2021:5: ':' ( ruleANY_WS )* ( (lv_name_4_0= RULE_ID ) ) ( ruleANY_WS )*
                    {
                    match(input,11,FOLLOW_11_in_ruleImageRef3676); 

                            createLeafNode(grammarAccess.getImageRefAccess().getColonKeyword_2_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2025:1: ( ruleANY_WS )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_MULTI_NL)||LA50_0==RULE_SINGLE_NL) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2026:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_1(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3693);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2033:3: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2034:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2034:1: (lv_name_4_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2035:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageRef3711); 

                    			createLeafNode(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_2_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2057:2: ( ruleANY_WS )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_MULTI_NL)||LA51_0==RULE_SINGLE_NL) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2058:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_2_3(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3733);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleImageRef3746); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2069:1: ( (lv_path_7_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2070:1: (lv_path_7_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2070:1: (lv_path_7_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2071:3: lv_path_7_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3767);
            lv_path_7_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_7_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3777); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_5(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2097:1: ( ruleANY_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_MULTI_NL)||LA53_0==RULE_SINGLE_NL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2098:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_6(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3794);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleImageRef3805); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_7(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2109:1: ( (lv_clazz_11_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2110:1: (lv_clazz_11_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2110:1: (lv_clazz_11_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2111:3: lv_clazz_11_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3826);
            lv_clazz_11_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clazz",
            	        		lv_clazz_11_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3836); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_9(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2137:1: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_MULTI_NL)||LA54_0==RULE_SINGLE_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2138:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_10(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3853);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleImageRef3864); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2149:1: ( (lv_style_15_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2150:1: (lv_style_15_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2150:1: (lv_style_15_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2151:3: lv_style_15_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3885);
            lv_style_15_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"style",
            	        		lv_style_15_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3895); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2177:1: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_MULTI_NL)||LA55_0==RULE_SINGLE_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2178:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_14(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleImageRef3912);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleImageRef3923); 

                    createLeafNode(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_15(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2189:1: ( (lv_caption_19_0= ruleText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2190:1: (lv_caption_19_0= ruleText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2190:1: (lv_caption_19_0= ruleText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2191:3: lv_caption_19_0= ruleText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_16_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImageRef3944);
            lv_caption_19_0=ruleText();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImageRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"caption",
            	        		lv_caption_19_0, 
            	        		"Text", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleImageRef3954); 

                    createLeafNode(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_17(), null); 
                

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2225:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2226:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2227:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3990);
            iv_ruleCodeBlock=ruleCodeBlock();
            _fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock4000); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2234:1: ruleCodeBlock returns [EObject current=null] : ( '\\\\code' ( ruleANY_WS )* ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )? '[' ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ ) ']' ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token lv_language_4_0=null;
        EObject lv_contents_9_0 = null;

        EObject lv_contents_10_0 = null;

        EObject lv_contents_11_0 = null;

        EObject lv_contents_12_0 = null;

        EObject lv_contents_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2239:6: ( ( '\\\\code' ( ruleANY_WS )* ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )? '[' ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ ) ']' ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2240:1: ( '\\\\code' ( ruleANY_WS )* ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )? '[' ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ ) ']' )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2240:1: ( '\\\\code' ( ruleANY_WS )* ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )? '[' ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ ) ']' )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2240:3: '\\\\code' ( ruleANY_WS )* ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )? '[' ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ ) ']'
            {
            match(input,29,FOLLOW_29_in_ruleCodeBlock4035); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getCodeKeyword_0(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2244:1: ( ruleANY_WS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_WS && LA56_0<=RULE_MULTI_NL)||LA56_0==RULE_SINGLE_NL) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2245:5: ruleANY_WS
            	    {
            	     
            	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1(), currentNode); 
            	        
            	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock4052);
            	    ruleANY_WS();
            	    _fsp--;

            	     
            	            currentNode = currentNode.getParent();
            	        

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2252:3: ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2252:5: '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )*
                    {
                    match(input,12,FOLLOW_12_in_ruleCodeBlock4064); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_2_0(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2256:1: ( ruleANY_WS )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_MULTI_NL)||LA57_0==RULE_SINGLE_NL) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2257:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_1(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock4081);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2264:3: ( (lv_language_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2265:1: (lv_language_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2265:1: (lv_language_4_0= RULE_ID )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2266:3: lv_language_4_0= RULE_ID
                    {
                    lv_language_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeBlock4099); 

                    			createLeafNode(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_2_2_0(), "language"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"language",
                    	        		lv_language_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2288:2: ( ruleANY_WS )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_MULTI_NL)||LA58_0==RULE_SINGLE_NL) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2289:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_3(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock4121);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_ruleCodeBlock4132); 

                            createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_2_4(), null); 
                        
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2300:1: ( ruleANY_WS )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_WS && LA59_0<=RULE_MULTI_NL)||LA59_0==RULE_SINGLE_NL) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2301:5: ruleANY_WS
                    	    {
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_2_5(), currentNode); 
                    	        
                    	    pushFollow(FOLLOW_ruleANY_WS_in_ruleCodeBlock4149);
                    	    ruleANY_WS();
                    	    _fsp--;

                    	     
                    	            currentNode = currentNode.getParent();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleCodeBlock4162); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:1: ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_WS && LA65_0<=RULE_ANY_OTHER)||LA65_0==11||(LA65_0>=18 && LA65_0<=19)) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=20 && LA65_0<=22)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2312:1: ( ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* ) | ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+ )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:2: ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:2: ( ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )* )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:3: ( (lv_contents_9_0= ruleCode ) ) ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )*
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2312:3: ( (lv_contents_9_0= ruleCode ) )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: (lv_contents_9_0= ruleCode )
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2313:1: (lv_contents_9_0= ruleCode )
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2314:3: lv_contents_9_0= ruleCode
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4185);
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

                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2336:2: ( ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )? )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=20 && LA62_0<=22)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2336:3: ( (lv_contents_10_0= ruleMarkupInCode ) ) ( (lv_contents_11_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2336:3: ( (lv_contents_10_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2337:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2337:1: (lv_contents_10_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2338:3: lv_contents_10_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_0_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4207);
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

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2360:2: ( (lv_contents_11_0= ruleCode ) )?
                    	    int alt61=2;
                    	    int LA61_0 = input.LA(1);

                    	    if ( ((LA61_0>=RULE_WS && LA61_0<=RULE_ANY_OTHER)||LA61_0==11||(LA61_0>=18 && LA61_0<=19)) ) {
                    	        alt61=1;
                    	    }
                    	    switch (alt61) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2361:1: (lv_contents_11_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2361:1: (lv_contents_11_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2362:3: lv_contents_11_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_0_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4228);
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
                    	    break loop62;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2385:6: ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+
                    {
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2385:6: ( ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )? )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=20 && LA64_0<=22)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2385:7: ( (lv_contents_12_0= ruleMarkupInCode ) ) ( (lv_contents_13_0= ruleCode ) )?
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2385:7: ( (lv_contents_12_0= ruleMarkupInCode ) )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2386:1: (lv_contents_12_0= ruleMarkupInCode )
                    	    {
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2386:1: (lv_contents_12_0= ruleMarkupInCode )
                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2387:3: lv_contents_12_0= ruleMarkupInCode
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_4_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4260);
                    	    lv_contents_12_0=ruleMarkupInCode();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"contents",
                    	    	        		lv_contents_12_0, 
                    	    	        		"MarkupInCode", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2409:2: ( (lv_contents_13_0= ruleCode ) )?
                    	    int alt63=2;
                    	    int LA63_0 = input.LA(1);

                    	    if ( ((LA63_0>=RULE_WS && LA63_0<=RULE_ANY_OTHER)||LA63_0==11||(LA63_0>=18 && LA63_0<=19)) ) {
                    	        alt63=1;
                    	    }
                    	    switch (alt63) {
                    	        case 1 :
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2410:1: (lv_contents_13_0= ruleCode )
                    	            {
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2410:1: (lv_contents_13_0= ruleCode )
                    	            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2411:3: lv_contents_13_0= ruleCode
                    	            {
                    	             
                    	            	        currentNode=createCompositeNode(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_4_1_1_0(), currentNode); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleCode_in_ruleCodeBlock4281);
                    	            lv_contents_13_0=ruleCode();
                    	            _fsp--;


                    	            	        if (current==null) {
                    	            	            current = factory.create(grammarAccess.getCodeBlockRule().getType().getClassifier());
                    	            	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	            	        }
                    	            	        try {
                    	            	       		add(
                    	            	       			current, 
                    	            	       			"contents",
                    	            	        		lv_contents_13_0, 
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
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleCodeBlock4295); 

                    createLeafNode(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2445:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2446:2: (iv_ruleCode= ruleCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2447:2: iv_ruleCode= ruleCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode4331);
            iv_ruleCode=ruleCode();
            _fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode4341); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2454:1: ruleCode returns [EObject current=null] : ( (lv_contents_0_0= ruleCodeText ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contents_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2459:6: ( ( (lv_contents_0_0= ruleCodeText ) ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2460:1: ( (lv_contents_0_0= ruleCodeText ) )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2460:1: ( (lv_contents_0_0= ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2461:1: (lv_contents_0_0= ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2461:1: (lv_contents_0_0= ruleCodeText )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2462:3: lv_contents_0_0= ruleCodeText
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCodeText_in_ruleCode4386);
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


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2492:1: entryRuleMarkupInCode returns [EObject current=null] : iv_ruleMarkupInCode= ruleMarkupInCode EOF ;
    public final EObject entryRuleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkupInCode = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2493:2: (iv_ruleMarkupInCode= ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2494:2: iv_ruleMarkupInCode= ruleMarkupInCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarkupInCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4421);
            iv_ruleMarkupInCode=ruleMarkupInCode();
            _fsp--;

             current =iv_ruleMarkupInCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode4431); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2501:1: ruleMarkupInCode returns [EObject current=null] : (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) ;
    public final EObject ruleMarkupInCode() throws RecognitionException {
        EObject current = null;

        EObject this_Emphasize_0 = null;

        EObject this_Anchor_1 = null;

        EObject this_Ref_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2506:6: ( (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2507:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2507:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt66=1;
                }
                break;
            case 21:
                {
                alt66=2;
                }
                break;
            case 22:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2507:1: (this_Emphasize_0= ruleEmphasize | this_Anchor_1= ruleAnchor | this_Ref_2= ruleRef )", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2508:5: this_Emphasize_0= ruleEmphasize
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmphasize_in_ruleMarkupInCode4478);
                    this_Emphasize_0=ruleEmphasize();
                    _fsp--;

                     
                            current = this_Emphasize_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2518:5: this_Anchor_1= ruleAnchor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnchor_in_ruleMarkupInCode4505);
                    this_Anchor_1=ruleAnchor();
                    _fsp--;

                     
                            current = this_Anchor_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2528:5: this_Ref_2= ruleRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRef_in_ruleMarkupInCode4532);
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


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2544:1: entryRuleCodeText returns [String current=null] : iv_ruleCodeText= ruleCodeText EOF ;
    public final String entryRuleCodeText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeText = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2545:2: (iv_ruleCodeText= ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2546:2: iv_ruleCodeText= ruleCodeText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodeTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText4568);
            iv_ruleCodeText=ruleCodeText();
            _fsp--;

             current =iv_ruleCodeText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText4579); 

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
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2553:1: ruleCodeText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ ;
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
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2558:6: ( (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+ )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2559:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2559:1: (this_ID_0= RULE_ID | this_MULTI_NL_1= RULE_MULTI_NL | this_WS_2= RULE_WS | this_SINGLE_NL_3= RULE_SINGLE_NL | this_ANY_OTHER_4= RULE_ANY_OTHER | kw= '\\\\[' | kw= '\\\\]' | kw= ':' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=9;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt67=1;
                    }
                    break;
                case RULE_MULTI_NL:
                    {
                    alt67=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt67=3;
                    }
                    break;
                case RULE_SINGLE_NL:
                    {
                    alt67=4;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt67=5;
                    }
                    break;
                case 18:
                    {
                    alt67=6;
                    }
                    break;
                case 19:
                    {
                    alt67=7;
                    }
                    break;
                case 11:
                    {
                    alt67=8;
                    }
                    break;

                }

                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2559:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeText4619); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0(), null); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2567:10: this_MULTI_NL_1= RULE_MULTI_NL
            	    {
            	    this_MULTI_NL_1=(Token)input.LT(1);
            	    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleCodeText4645); 

            	    		current.merge(this_MULTI_NL_1);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1(), null); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2575:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)input.LT(1);
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCodeText4671); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2(), null); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2583:10: this_SINGLE_NL_3= RULE_SINGLE_NL
            	    {
            	    this_SINGLE_NL_3=(Token)input.LT(1);
            	    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleCodeText4697); 

            	    		current.merge(this_SINGLE_NL_3);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3(), null); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2591:10: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_4=(Token)input.LT(1);
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4723); 

            	    		current.merge(this_ANY_OTHER_4);
            	        
            	     
            	        createLeafNode(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4(), null); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2600:2: kw= '\\\\['
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,18,FOLLOW_18_in_ruleCodeText4747); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5(), null); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2607:2: kw= '\\\\]'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,19,FOLLOW_19_in_ruleCodeText4766); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6(), null); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2614:2: kw= ':'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleCodeText4785); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getCodeTextAccess().getColonKeyword_7(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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


    // $ANTLR start entryRuleANY_WS
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2627:1: entryRuleANY_WS returns [String current=null] : iv_ruleANY_WS= ruleANY_WS EOF ;
    public final String entryRuleANY_WS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_WS = null;


        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2628:2: (iv_ruleANY_WS= ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2629:2: iv_ruleANY_WS= ruleANY_WS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getANY_WSRule(), currentNode); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS4827);
            iv_ruleANY_WS=ruleANY_WS();
            _fsp--;

             current =iv_ruleANY_WS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS4838); 

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
    // $ANTLR end entryRuleANY_WS


    // $ANTLR start ruleANY_WS
    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2636:1: ruleANY_WS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) ;
    public final AntlrDatatypeRuleToken ruleANY_WS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTI_NL_0=null;
        Token this_SINGLE_NL_1=null;
        Token this_WS_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2641:6: ( (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS ) )
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2642:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            {
            // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2642:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )
            int alt68=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt68=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt68=2;
                }
                break;
            case RULE_WS:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2642:1: (this_MULTI_NL_0= RULE_MULTI_NL | this_SINGLE_NL_1= RULE_SINGLE_NL | this_WS_2= RULE_WS )", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2642:6: this_MULTI_NL_0= RULE_MULTI_NL
                    {
                    this_MULTI_NL_0=(Token)input.LT(1);
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_ruleANY_WS4878); 

                    		current.merge(this_MULTI_NL_0);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2650:10: this_SINGLE_NL_1= RULE_SINGLE_NL
                    {
                    this_SINGLE_NL_1=(Token)input.LT(1);
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS4904); 

                    		current.merge(this_SINGLE_NL_1);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc/src-gen/org/eclipse/xtext/xdoc/parser/antlr/internal/InternalXDoc.g:2658:10: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)input.LT(1);
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleANY_WS4930); 

                    		current.merge(this_WS_2);
                        
                     
                        createLeafNode(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2(), null); 
                        

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
    // $ANTLR end ruleANY_WS


    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA37_eotS =
        "\6\uffff";
    static final String DFA37_eofS =
        "\6\uffff";
    static final String DFA37_minS =
        "\4\4\2\uffff";
    static final String DFA37_maxS =
        "\4\31\2\uffff";
    static final String DFA37_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA37_specialS =
        "\6\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1594:1: ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+";
        }
    }
    static final String DFA41_eotS =
        "\6\uffff";
    static final String DFA41_eofS =
        "\6\uffff";
    static final String DFA41_minS =
        "\4\4\2\uffff";
    static final String DFA41_maxS =
        "\4\31\2\uffff";
    static final String DFA41_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA41_specialS =
        "\6\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
            "\1\3\1\1\1\uffff\1\2\5\uffff\1\4\13\uffff\1\5",
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
            return "()+ loopback of 1677:1: ( ( ruleANY_WS )* ( (lv_items_4_0= ruleItem ) ) )+";
        }
    }
    static final String DFA60_eotS =
        "\22\uffff";
    static final String DFA60_eofS =
        "\12\uffff\4\6\1\uffff\3\6";
    static final String DFA60_minS =
        "\1\14\5\4\1\uffff\7\4\1\uffff\3\4";
    static final String DFA60_maxS =
        "\1\14\5\26\1\uffff\3\26\4\35\1\uffff\3\35";
    static final String DFA60_acceptS =
        "\6\uffff\1\2\7\uffff\1\1\3\uffff";
    static final String DFA60_specialS =
        "\22\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1",
            "\1\4\1\2\1\5\1\3\1\6\2\uffff\1\6\6\uffff\5\6",
            "\1\4\1\2\1\5\1\3\1\6\2\uffff\1\6\1\uffff\1\6\4\uffff\5\6",
            "\1\4\1\2\1\5\1\3\1\6\2\uffff\1\6\1\uffff\1\6\4\uffff\5\6",
            "\1\4\1\2\1\5\1\3\1\6\2\uffff\1\6\1\uffff\1\6\4\uffff\5\6",
            "\1\11\1\7\1\6\1\10\1\6\2\uffff\1\6\1\uffff\1\12\4\uffff\5\6",
            "",
            "\1\11\1\7\1\6\1\10\1\6\2\uffff\1\6\1\uffff\1\12\4\uffff\5\6",
            "\1\11\1\7\1\6\1\10\1\6\2\uffff\1\6\1\uffff\1\12\4\uffff\5\6",
            "\1\11\1\7\1\6\1\10\1\6\2\uffff\1\6\1\uffff\1\12\4\uffff\5\6",
            "\1\13\1\15\1\6\1\14\1\6\2\uffff\1\6\1\16\1\6\4\uffff\7\6\1\uffff"+
            "\4\6",
            "\1\13\1\15\1\6\1\14\1\6\2\uffff\1\6\1\16\1\6\4\uffff\7\6\1\uffff"+
            "\4\6",
            "\1\13\1\15\1\6\1\14\1\6\2\uffff\1\6\1\16\1\6\4\uffff\7\6\1\uffff"+
            "\4\6",
            "\1\17\1\16\1\6\1\20\1\6\1\uffff\2\6\1\16\14\6\1\uffff\4\6",
            "",
            "\1\17\1\21\1\6\1\20\1\6\2\uffff\1\6\1\16\1\6\4\uffff\7\6\1\uffff"+
            "\4\6",
            "\1\17\1\21\1\6\1\20\1\6\2\uffff\1\6\1\16\1\6\4\uffff\7\6\1\uffff"+
            "\4\6",
            "\1\17\1\16\1\6\1\20\1\6\1\uffff\2\6\1\16\1\uffff\13\6\1\uffff"+
            "\4\6"
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
            return "2252:3: ( '[' ( ruleANY_WS )* ( (lv_language_4_0= RULE_ID ) ) ( ruleANY_WS )* ']' ( ruleANY_WS )* )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleDocument129 = new BitSet(new long[]{0x000000000000C422L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument140 = new BitSet(new long[]{0x000000000000C402L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument165 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument175 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleChapter_in_ruleDocument195 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument226 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDocument256 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument287 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument297 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleDocument317 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleDocument331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleChapter415 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleChapter426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChapter443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleChapter460 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChapter491 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter501 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleChapter521 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleChapter533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleChapter553 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSection636 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleSection647 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection681 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection712 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection722 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection742 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection754 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleSection774 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubSection857 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleSubSection868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSection885 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSubSection902 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubSection933 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection943 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSubSection963 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSubSection975 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSection3_in_ruleSubSection995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection31033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection31043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSection31078 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleSection31089 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection31106 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection31123 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection31154 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31164 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection31184 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection31196 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSection4_in_ruleSection31216 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection41254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection41264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSection41299 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_ruleSection41310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection41327 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSection41344 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSection41375 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleSection41385 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleSection41405 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1502 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1524 = new BitSet(new long[]{0x000000003DFC09D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1545 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_ruleTextOrMarkup1577 = new BitSet(new long[]{0x000000003DFC09D2L});
    public static final BitSet FOLLOW_ruleTextPart_in_ruleTextOrMarkup1598 = new BitSet(new long[]{0x000000003DF00002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleTextPart1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1779 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleText1805 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleText1831 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText1857 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_18_in_ruleText1881 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_19_in_ruleText1900 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_11_in_ruleText1919 = new BitSet(new long[]{0x00000000000C09D2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkUp2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkUp2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkUp2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleMarkUp2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleMarkUp2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleMarkUp2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_ruleMarkUp2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleMarkUp2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_ruleMarkUp2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEmphasize2313 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEmphasize2323 = new BitSet(new long[]{0x000000003DFC09F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2333 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleEmphasize2355 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleEmphasize2365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEmphasize2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAnchor2457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAnchor2467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnchor2484 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleAnchor2500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnchor2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRef2593 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleRef2603 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef2621 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRef2631 = new BitSet(new long[]{0x000000003DFC09F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef2641 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleRef2663 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleRef2673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRef2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOrderedList2765 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList2782 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleOrderedList2793 = new BitSet(new long[]{0x00000000020000B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList2811 = new BitSet(new long[]{0x00000000020000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleOrderedList2833 = new BitSet(new long[]{0x00000000020020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleOrderedList2852 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleOrderedList2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUnorderedList2944 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList2961 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleUnorderedList2972 = new BitSet(new long[]{0x00000000020000B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList2990 = new BitSet(new long[]{0x00000000020000B0L});
    public static final BitSet FOLLOW_ruleItem_in_ruleUnorderedList3012 = new BitSet(new long[]{0x00000000020020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleUnorderedList3031 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleUnorderedList3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleItem3123 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleItem3140 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleItem3151 = new BitSet(new long[]{0x000000003DFC09F0L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem3161 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem3183 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleItem3193 = new BitSet(new long[]{0x000000003DFC09D0L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_ruleItem3213 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13_in_ruleItem3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef3261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCodeRef3306 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeRef3323 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleCodeRef3334 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleCodeRef3357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCodeRef3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink3403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLink3448 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink3465 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleLink3476 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink3507 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleLink3524 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleLink3535 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleLink3556 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLink3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleImageRef3647 = new BitSet(new long[]{0x00000000000018B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3664 = new BitSet(new long[]{0x00000000000018B0L});
    public static final BitSet FOLLOW_11_in_ruleImageRef3676 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3693 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageRef3711 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3733 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3746 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3767 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3777 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3794 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3805 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3826 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3836 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3853 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3864 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3885 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3895 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleImageRef3912 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleImageRef3923 = new BitSet(new long[]{0x00000000000C09D0L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageRef3944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageRef3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock3990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCodeBlock4035 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock4052 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock4064 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock4081 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeBlock4099 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock4121 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_13_in_ruleCodeBlock4132 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_ruleANY_WS_in_ruleCodeBlock4149 = new BitSet(new long[]{0x00000000000010B0L});
    public static final BitSet FOLLOW_12_in_ruleCodeBlock4162 = new BitSet(new long[]{0x00000000007C09F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4185 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4207 = new BitSet(new long[]{0x00000000007C29F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4228 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_ruleCodeBlock4260 = new BitSet(new long[]{0x00000000007C29F0L});
    public static final BitSet FOLLOW_ruleCode_in_ruleCodeBlock4281 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_13_in_ruleCodeBlock4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode4331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_ruleCode4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_ruleMarkupInCode4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_ruleMarkupInCode4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_ruleMarkupInCode4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText4568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeText4619 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleCodeText4645 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCodeText4671 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleCodeText4697 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleCodeText4723 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_18_in_ruleCodeText4747 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_19_in_ruleCodeText4766 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_11_in_ruleCodeText4785 = new BitSet(new long[]{0x00000000000C09F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS4827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_ruleANY_WS4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_ruleANY_WS4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleANY_WS4930 = new BitSet(new long[]{0x0000000000000002L});

}