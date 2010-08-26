package org.eclipse.xtext.xdoc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.xdoc.services.XDocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDocParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "RULE_MULTI_NL", "RULE_SL_COMMENT", "'\\\\['", "'\\\\]'", "':'", "'\\\\chapter'", "'['", "']'", "'\\\\section'", "'\\\\subsection'", "'\\\\section3'", "'\\\\section4'", "'\\\\emph'", "'\\\\a'", "'\\\\ref'", "'\\\\ol'", "'\\\\ul'", "'\\\\item'", "'\\\\codeRef'", "'\\\\link'", "'\\\\img'", "'\\\\code'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_WS=5;
    public static final int RULE_MULTI_NL=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalXDocParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g"; }


     
     	private XDocGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XDocGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleDocument
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:61:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:62:1: ( ruleDocument EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:63:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();
            _fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDocument


    // $ANTLR start ruleDocument
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:70:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:74:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:75:1: ( ( rule__Document__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:75:1: ( ( rule__Document__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:76:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:77:1: ( rule__Document__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:77:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDocument


    // $ANTLR start entryRuleChapter
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:89:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:90:1: ( ruleChapter EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:91:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_ruleChapter_in_entryRuleChapter121);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getChapterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChapter128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleChapter


    // $ANTLR start ruleChapter
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:98:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:102:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:103:1: ( ( rule__Chapter__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:103:1: ( ( rule__Chapter__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:104:1: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:105:1: ( rule__Chapter__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:105:2: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0_in_ruleChapter154);
            rule__Chapter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleChapter


    // $ANTLR start entryRuleSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:117:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:118:1: ( ruleSection EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:119:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection181);
            ruleSection();
            _fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection


    // $ANTLR start ruleSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:126:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:130:2: ( ( ( rule__Section__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:131:1: ( ( rule__Section__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:131:1: ( ( rule__Section__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:132:1: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:133:1: ( rule__Section__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:133:2: rule__Section__Group__0
            {
            pushFollow(FOLLOW_rule__Section__Group__0_in_ruleSection214);
            rule__Section__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection


    // $ANTLR start entryRuleSubSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:145:1: entryRuleSubSection : ruleSubSection EOF ;
    public final void entryRuleSubSection() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:146:1: ( ruleSubSection EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:147:1: ruleSubSection EOF
            {
             before(grammarAccess.getSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection241);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSubSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSubSection


    // $ANTLR start ruleSubSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:154:1: ruleSubSection : ( ( rule__SubSection__Group__0 ) ) ;
    public final void ruleSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:158:2: ( ( ( rule__SubSection__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__SubSection__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__SubSection__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:160:1: ( rule__SubSection__Group__0 )
            {
             before(grammarAccess.getSubSectionAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:1: ( rule__SubSection__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:2: rule__SubSection__Group__0
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274);
            rule__SubSection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSubSection


    // $ANTLR start entryRuleSection3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:173:1: entryRuleSection3 : ruleSection3 EOF ;
    public final void entryRuleSection3() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:174:1: ( ruleSection3 EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:175:1: ruleSection3 EOF
            {
             before(grammarAccess.getSection3Rule()); 
            pushFollow(FOLLOW_ruleSection3_in_entryRuleSection3301);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSection3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection3308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection3


    // $ANTLR start ruleSection3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:182:1: ruleSection3 : ( ( rule__Section3__Group__0 ) ) ;
    public final void ruleSection3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:186:2: ( ( ( rule__Section3__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:187:1: ( ( rule__Section3__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:187:1: ( ( rule__Section3__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:188:1: ( rule__Section3__Group__0 )
            {
             before(grammarAccess.getSection3Access().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:189:1: ( rule__Section3__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:189:2: rule__Section3__Group__0
            {
            pushFollow(FOLLOW_rule__Section3__Group__0_in_ruleSection3334);
            rule__Section3__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection3


    // $ANTLR start entryRuleSection4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:201:1: entryRuleSection4 : ruleSection4 EOF ;
    public final void entryRuleSection4() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:202:1: ( ruleSection4 EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:203:1: ruleSection4 EOF
            {
             before(grammarAccess.getSection4Rule()); 
            pushFollow(FOLLOW_ruleSection4_in_entryRuleSection4361);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection4368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSection4


    // $ANTLR start ruleSection4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:210:1: ruleSection4 : ( ( rule__Section4__Group__0 ) ) ;
    public final void ruleSection4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:214:2: ( ( ( rule__Section4__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:215:1: ( ( rule__Section4__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:215:1: ( ( rule__Section4__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:216:1: ( rule__Section4__Group__0 )
            {
             before(grammarAccess.getSection4Access().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:217:1: ( rule__Section4__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:217:2: rule__Section4__Group__0
            {
            pushFollow(FOLLOW_rule__Section4__Group__0_in_ruleSection4394);
            rule__Section4__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection4


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:231:1: entryRuleTextOrMarkup : ruleTextOrMarkup EOF ;
    public final void entryRuleTextOrMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:232:1: ( ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:233:1: ruleTextOrMarkup EOF
            {
             before(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup423);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getTextOrMarkupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextOrMarkup


    // $ANTLR start ruleTextOrMarkup
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:240:1: ruleTextOrMarkup : ( ( rule__TextOrMarkup__Group__0 ) ) ;
    public final void ruleTextOrMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:244:2: ( ( ( rule__TextOrMarkup__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:246:1: ( rule__TextOrMarkup__Group__0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:1: ( rule__TextOrMarkup__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:2: rule__TextOrMarkup__Group__0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group__0_in_ruleTextOrMarkup456);
            rule__TextOrMarkup__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextOrMarkup


    // $ANTLR start entryRuleTextOrMarkupLine
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:259:1: entryRuleTextOrMarkupLine : ruleTextOrMarkupLine EOF ;
    public final void entryRuleTextOrMarkupLine() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:260:1: ( ruleTextOrMarkupLine EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:261:1: ruleTextOrMarkupLine EOF
            {
             before(grammarAccess.getTextOrMarkupLineRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_entryRuleTextOrMarkupLine483);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkupLine490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextOrMarkupLine


    // $ANTLR start ruleTextOrMarkupLine
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:268:1: ruleTextOrMarkupLine : ( ( rule__TextOrMarkupLine__Alternatives ) ) ;
    public final void ruleTextOrMarkupLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:272:2: ( ( ( rule__TextOrMarkupLine__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextOrMarkupLine__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextOrMarkupLine__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:274:1: ( rule__TextOrMarkupLine__Alternatives )
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:1: ( rule__TextOrMarkupLine__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:2: rule__TextOrMarkupLine__Alternatives
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Alternatives_in_ruleTextOrMarkupLine516);
            rule__TextOrMarkupLine__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupLineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextOrMarkupLine


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:287:1: entryRuleMarkUp : ruleMarkUp EOF ;
    public final void entryRuleMarkUp() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:288:1: ( ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:289:1: ruleMarkUp EOF
            {
             before(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp543);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getMarkUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMarkUp


    // $ANTLR start ruleMarkUp
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:296:1: ruleMarkUp : ( ( rule__MarkUp__Alternatives ) ) ;
    public final void ruleMarkUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:300:2: ( ( ( rule__MarkUp__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( rule__MarkUp__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( rule__MarkUp__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( rule__MarkUp__Alternatives )
            {
             before(grammarAccess.getMarkUpAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:1: ( rule__MarkUp__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:2: rule__MarkUp__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp576);
            rule__MarkUp__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMarkUpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMarkUp


    // $ANTLR start entryRuleEmphasize
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:315:1: entryRuleEmphasize : ruleEmphasize EOF ;
    public final void entryRuleEmphasize() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:316:1: ( ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:317:1: ruleEmphasize EOF
            {
             before(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize603);
            ruleEmphasize();
            _fsp--;

             after(grammarAccess.getEmphasizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEmphasize


    // $ANTLR start ruleEmphasize
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:324:1: ruleEmphasize : ( ( rule__Emphasize__Group__0 ) ) ;
    public final void ruleEmphasize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:328:2: ( ( ( rule__Emphasize__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:329:1: ( ( rule__Emphasize__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:329:1: ( ( rule__Emphasize__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:330:1: ( rule__Emphasize__Group__0 )
            {
             before(grammarAccess.getEmphasizeAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:331:1: ( rule__Emphasize__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:331:2: rule__Emphasize__Group__0
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize636);
            rule__Emphasize__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEmphasize


    // $ANTLR start entryRuleAnchor
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:343:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:344:1: ( ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:345:1: ruleAnchor EOF
            {
             before(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor663);
            ruleAnchor();
            _fsp--;

             after(grammarAccess.getAnchorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAnchor


    // $ANTLR start ruleAnchor
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:352:1: ruleAnchor : ( ( rule__Anchor__Group__0 ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:356:2: ( ( ( rule__Anchor__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:357:1: ( ( rule__Anchor__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:357:1: ( ( rule__Anchor__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:358:1: ( rule__Anchor__Group__0 )
            {
             before(grammarAccess.getAnchorAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:359:1: ( rule__Anchor__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:359:2: rule__Anchor__Group__0
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0_in_ruleAnchor696);
            rule__Anchor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnchor


    // $ANTLR start entryRuleRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:371:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:372:1: ( ruleRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:373:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef723);
            ruleRef();
            _fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRef


    // $ANTLR start ruleRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:380:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:384:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:385:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:385:1: ( ( rule__Ref__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:386:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:387:1: ( rule__Ref__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:387:2: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_rule__Ref__Group__0_in_ruleRef756);
            rule__Ref__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRef


    // $ANTLR start entryRuleOrderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:399:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:400:1: ( ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:401:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList783);
            ruleOrderedList();
            _fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOrderedList


    // $ANTLR start ruleOrderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:408:1: ruleOrderedList : ( ( rule__OrderedList__Group__0 ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:412:2: ( ( ( rule__OrderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:413:1: ( ( rule__OrderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:413:1: ( ( rule__OrderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:414:1: ( rule__OrderedList__Group__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:415:1: ( rule__OrderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:415:2: rule__OrderedList__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList816);
            rule__OrderedList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrderedList


    // $ANTLR start entryRuleUnorderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:427:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:428:1: ( ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:429:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList843);
            ruleUnorderedList();
            _fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUnorderedList


    // $ANTLR start ruleUnorderedList
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:436:1: ruleUnorderedList : ( ( rule__UnorderedList__Group__0 ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:440:2: ( ( ( rule__UnorderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:441:1: ( ( rule__UnorderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:441:1: ( ( rule__UnorderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:442:1: ( rule__UnorderedList__Group__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:443:1: ( rule__UnorderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:443:2: rule__UnorderedList__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList876);
            rule__UnorderedList__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnorderedList


    // $ANTLR start entryRuleItem
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:455:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:456:1: ( ruleItem EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:457:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem903);
            ruleItem();
            _fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleItem


    // $ANTLR start ruleItem
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:464:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:468:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:469:1: ( ( rule__Item__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:469:1: ( ( rule__Item__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:470:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:471:1: ( rule__Item__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:471:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem936);
            rule__Item__Group__0();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleItem


    // $ANTLR start entryRuleCodeRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:483:1: entryRuleCodeRef : ruleCodeRef EOF ;
    public final void entryRuleCodeRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:484:1: ( ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:485:1: ruleCodeRef EOF
            {
             before(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef963);
            ruleCodeRef();
            _fsp--;

             after(grammarAccess.getCodeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeRef


    // $ANTLR start ruleCodeRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:492:1: ruleCodeRef : ( ( rule__CodeRef__Group__0 ) ) ;
    public final void ruleCodeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:496:2: ( ( ( rule__CodeRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:497:1: ( ( rule__CodeRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:497:1: ( ( rule__CodeRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:498:1: ( rule__CodeRef__Group__0 )
            {
             before(grammarAccess.getCodeRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:499:1: ( rule__CodeRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:499:2: rule__CodeRef__Group__0
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef996);
            rule__CodeRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeRef


    // $ANTLR start entryRuleLink
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:511:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:512:1: ( ruleLink EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:513:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1023);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:520:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:524:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:525:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:525:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:526:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:527:1: ( rule__Link__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:527:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1056);
            rule__Link__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleImageRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:539:1: entryRuleImageRef : ruleImageRef EOF ;
    public final void entryRuleImageRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:540:1: ( ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:541:1: ruleImageRef EOF
            {
             before(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef1083);
            ruleImageRef();
            _fsp--;

             after(grammarAccess.getImageRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImageRef


    // $ANTLR start ruleImageRef
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:548:1: ruleImageRef : ( ( rule__ImageRef__Group__0 ) ) ;
    public final void ruleImageRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:552:2: ( ( ( rule__ImageRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:553:1: ( ( rule__ImageRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:553:1: ( ( rule__ImageRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:554:1: ( rule__ImageRef__Group__0 )
            {
             before(grammarAccess.getImageRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:555:1: ( rule__ImageRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:555:2: rule__ImageRef__Group__0
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1116);
            rule__ImageRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImageRef


    // $ANTLR start entryRuleCodeBlock
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:567:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:568:1: ( ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:569:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1143);
            ruleCodeBlock();
            _fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeBlock


    // $ANTLR start ruleCodeBlock
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:576:1: ruleCodeBlock : ( ( rule__CodeBlock__Group__0 ) ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:580:2: ( ( ( rule__CodeBlock__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:581:1: ( ( rule__CodeBlock__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:581:1: ( ( rule__CodeBlock__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:582:1: ( rule__CodeBlock__Group__0 )
            {
             before(grammarAccess.getCodeBlockAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:583:1: ( rule__CodeBlock__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:583:2: rule__CodeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1176);
            rule__CodeBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeBlock


    // $ANTLR start entryRuleParBreak
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:595:1: entryRuleParBreak : ruleParBreak EOF ;
    public final void entryRuleParBreak() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:596:1: ( ruleParBreak EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:597:1: ruleParBreak EOF
            {
             before(grammarAccess.getParBreakRule()); 
            pushFollow(FOLLOW_ruleParBreak_in_entryRuleParBreak1203);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getParBreakRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParBreak1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParBreak


    // $ANTLR start ruleParBreak
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:604:1: ruleParBreak : ( ( rule__ParBreak__CAssignment ) ) ;
    public final void ruleParBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:608:2: ( ( ( rule__ParBreak__CAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:609:1: ( ( rule__ParBreak__CAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:609:1: ( ( rule__ParBreak__CAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:610:1: ( rule__ParBreak__CAssignment )
            {
             before(grammarAccess.getParBreakAccess().getCAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:611:1: ( rule__ParBreak__CAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:611:2: rule__ParBreak__CAssignment
            {
            pushFollow(FOLLOW_rule__ParBreak__CAssignment_in_ruleParBreak1236);
            rule__ParBreak__CAssignment();
            _fsp--;


            }

             after(grammarAccess.getParBreakAccess().getCAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParBreak


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:623:1: entryRuleTextPart : ruleTextPart EOF ;
    public final void entryRuleTextPart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:624:1: ( ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:625:1: ruleTextPart EOF
            {
             before(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart1263);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextPart


    // $ANTLR start ruleTextPart
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:632:1: ruleTextPart : ( ( rule__TextPart__TextAssignment ) ) ;
    public final void ruleTextPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:636:2: ( ( ( rule__TextPart__TextAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:637:1: ( ( rule__TextPart__TextAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:637:1: ( ( rule__TextPart__TextAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:638:1: ( rule__TextPart__TextAssignment )
            {
             before(grammarAccess.getTextPartAccess().getTextAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:639:1: ( rule__TextPart__TextAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:639:2: rule__TextPart__TextAssignment
            {
            pushFollow(FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart1296);
            rule__TextPart__TextAssignment();
            _fsp--;


            }

             after(grammarAccess.getTextPartAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextPart


    // $ANTLR start entryRuleText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:651:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:652:1: ( ruleText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:653:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1323);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:660:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:664:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:665:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:665:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:666:1: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:666:1: ( ( rule__Text__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:667:1: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:668:1: ( rule__Text__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:668:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText1358);
            rule__Text__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:671:1: ( ( rule__Text__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:673:1: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=9 && LA1_0<=11)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:673:2: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText1370);
            	    rule__Text__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleText


    // $ANTLR start entryRuleCodeText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:686:1: entryRuleCodeText : ruleCodeText EOF ;
    public final void entryRuleCodeText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:687:1: ( ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:688:1: ruleCodeText EOF
            {
             before(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText1400);
            ruleCodeText();
            _fsp--;

             after(grammarAccess.getCodeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText1407); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCodeText


    // $ANTLR start ruleCodeText
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:695:1: ruleCodeText : ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) ;
    public final void ruleCodeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:699:2: ( ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:701:1: ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:701:1: ( ( rule__CodeText__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:702:1: ( rule__CodeText__Alternatives )
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:703:1: ( rule__CodeText__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:703:2: rule__CodeText__Alternatives
            {
            pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435);
            rule__CodeText__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCodeTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:706:1: ( ( rule__CodeText__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:707:1: ( rule__CodeText__Alternatives )*
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:708:1: ( rule__CodeText__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_MULTI_NL)||(LA2_0>=9 && LA2_0<=11)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:708:2: rule__CodeText__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447);
            	    rule__CodeText__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCodeTextAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCodeText


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:721:1: entryRuleMarkupInCode : ruleMarkupInCode EOF ;
    public final void entryRuleMarkupInCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:722:1: ( ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:723:1: ruleMarkupInCode EOF
            {
             before(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1477);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getMarkupInCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode1484); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMarkupInCode


    // $ANTLR start ruleMarkupInCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:730:1: ruleMarkupInCode : ( ( rule__MarkupInCode__Alternatives ) ) ;
    public final void ruleMarkupInCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:734:2: ( ( ( rule__MarkupInCode__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__MarkupInCode__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__MarkupInCode__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:736:1: ( rule__MarkupInCode__Alternatives )
            {
             before(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:1: ( rule__MarkupInCode__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:2: rule__MarkupInCode__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1510);
            rule__MarkupInCode__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMarkupInCode


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:749:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:750:1: ( ruleCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:751:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode1537);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode1544); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCode


    // $ANTLR start ruleCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:758:1: ruleCode : ( ( rule__Code__ContentsAssignment ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:2: ( ( ( rule__Code__ContentsAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:763:1: ( ( rule__Code__ContentsAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:763:1: ( ( rule__Code__ContentsAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:764:1: ( rule__Code__ContentsAssignment )
            {
             before(grammarAccess.getCodeAccess().getContentsAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:765:1: ( rule__Code__ContentsAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:765:2: rule__Code__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1570);
            rule__Code__ContentsAssignment();
            _fsp--;


            }

             after(grammarAccess.getCodeAccess().getContentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCode


    // $ANTLR start rule__Document__Alternatives_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:777:1: rule__Document__Alternatives_1 : ( ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) ) | ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) ) | ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) ) );
    public final void rule__Document__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:781:1: ( ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) ) | ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) ) | ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt6=1;
                    }
                    break;
                case 16:
                    {
                    alt6=3;
                    }
                    break;
                case 15:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("777:1: rule__Document__Alternatives_1 : ( ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) ) | ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) ) | ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) ) );", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("777:1: rule__Document__Alternatives_1 : ( ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) ) | ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) ) | ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( ( rule__Document__Group_1_0__0 ) ) ( ( rule__Document__Group_1_0__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( ( rule__Document__Group_1_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:1: ( rule__Document__Group_1_0__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:785:1: ( rule__Document__Group_1_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:785:2: rule__Document__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_1_0__0_in_rule__Document__Alternatives_11608);
                    rule__Document__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_1_0()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:1: ( ( rule__Document__Group_1_0__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:1: ( rule__Document__Group_1_0__0 )*
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:1: ( rule__Document__Group_1_0__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_MULTI_NL) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==12) ) {
                                alt3=1;
                            }


                        }
                        else if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:2: rule__Document__Group_1_0__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Document__Group_1_0__0_in_rule__Document__Alternatives_11620);
                    	    rule__Document__Group_1_0__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getDocumentAccess().getGroup_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:795:6: ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:795:6: ( ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:796:1: ( ( rule__Document__Group_1_1__0 ) ) ( ( rule__Document__Group_1_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:796:1: ( ( rule__Document__Group_1_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:797:1: ( rule__Document__Group_1_1__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:798:1: ( rule__Document__Group_1_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:798:2: rule__Document__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_1_1__0_in_rule__Document__Alternatives_11643);
                    rule__Document__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_1_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:801:1: ( ( rule__Document__Group_1_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:802:1: ( rule__Document__Group_1_1__0 )*
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:803:1: ( rule__Document__Group_1_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_MULTI_NL) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==15) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:803:2: rule__Document__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Document__Group_1_1__0_in_rule__Document__Alternatives_11655);
                    	    rule__Document__Group_1_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getDocumentAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:6: ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:6: ( ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:809:1: ( ( rule__Document__Group_1_2__0 ) ) ( ( rule__Document__Group_1_2__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:809:1: ( ( rule__Document__Group_1_2__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:810:1: ( rule__Document__Group_1_2__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_2()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:811:1: ( rule__Document__Group_1_2__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:811:2: rule__Document__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_1_2__0_in_rule__Document__Alternatives_11678);
                    rule__Document__Group_1_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_1_2()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:814:1: ( ( rule__Document__Group_1_2__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:815:1: ( rule__Document__Group_1_2__0 )*
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_1_2()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:816:1: ( rule__Document__Group_1_2__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_MULTI_NL) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==16) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:816:2: rule__Document__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Document__Group_1_2__0_in_rule__Document__Alternatives_11690);
                    	    rule__Document__Group_1_2__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getDocumentAccess().getGroup_1_2()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Alternatives_1


    // $ANTLR start rule__TextOrMarkup__Alternatives_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:827:1: rule__TextOrMarkup__Alternatives_1 : ( ( ( rule__TextOrMarkup__Group_1_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* ) ) );
    public final void rule__TextOrMarkup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:831:1: ( ( ( rule__TextOrMarkup__Group_1_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ANY_OTHER)||(LA8_0>=9 && LA8_0<=11)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=19 && LA8_0<=23)||(LA8_0>=25 && LA8_0<=28)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("827:1: rule__TextOrMarkup__Alternatives_1 : ( ( ( rule__TextOrMarkup__Group_1_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:1: ( ( rule__TextOrMarkup__Group_1_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:1: ( ( rule__TextOrMarkup__Group_1_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:833:1: ( rule__TextOrMarkup__Group_1_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:834:1: ( rule__TextOrMarkup__Group_1_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:834:2: rule__TextOrMarkup__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0__0_in_rule__TextOrMarkup__Alternatives_11727);
                    rule__TextOrMarkup__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:838:6: ( ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:838:6: ( ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:839:1: ( ( rule__TextOrMarkup__Group_1_1__0 ) ) ( ( rule__TextOrMarkup__Group_1_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:839:1: ( ( rule__TextOrMarkup__Group_1_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:840:1: ( rule__TextOrMarkup__Group_1_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:841:1: ( rule__TextOrMarkup__Group_1_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:841:2: rule__TextOrMarkup__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_1__0_in_rule__TextOrMarkup__Alternatives_11747);
                    rule__TextOrMarkup__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:844:1: ( ( rule__TextOrMarkup__Group_1_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:845:1: ( rule__TextOrMarkup__Group_1_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:846:1: ( rule__TextOrMarkup__Group_1_1__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=19 && LA7_0<=23)||(LA7_0>=25 && LA7_0<=28)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:846:2: rule__TextOrMarkup__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_1__0_in_rule__TextOrMarkup__Alternatives_11759);
                    	    rule__TextOrMarkup__Group_1_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Alternatives_1


    // $ANTLR start rule__TextOrMarkupLine__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:856:1: rule__TextOrMarkupLine__Alternatives : ( ( ( rule__TextOrMarkupLine__Group_0__0 ) ) | ( ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* ) ) );
    public final void rule__TextOrMarkupLine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:1: ( ( ( rule__TextOrMarkupLine__Group_0__0 ) ) | ( ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ANY_OTHER)||(LA10_0>=9 && LA10_0<=11)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=19 && LA10_0<=23)||(LA10_0>=25 && LA10_0<=28)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("856:1: rule__TextOrMarkupLine__Alternatives : ( ( ( rule__TextOrMarkupLine__Group_0__0 ) ) | ( ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:861:1: ( ( rule__TextOrMarkupLine__Group_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:861:1: ( ( rule__TextOrMarkupLine__Group_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:862:1: ( rule__TextOrMarkupLine__Group_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupLineAccess().getGroup_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:863:1: ( rule__TextOrMarkupLine__Group_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:863:2: rule__TextOrMarkupLine__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0__0_in_rule__TextOrMarkupLine__Alternatives1795);
                    rule__TextOrMarkupLine__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupLineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:867:6: ( ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:867:6: ( ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:868:1: ( ( rule__TextOrMarkupLine__Group_1__0 ) ) ( ( rule__TextOrMarkupLine__Group_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:868:1: ( ( rule__TextOrMarkupLine__Group_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:869:1: ( rule__TextOrMarkupLine__Group_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupLineAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:870:1: ( rule__TextOrMarkupLine__Group_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:870:2: rule__TextOrMarkupLine__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_1__0_in_rule__TextOrMarkupLine__Alternatives1815);
                    rule__TextOrMarkupLine__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupLineAccess().getGroup_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:873:1: ( ( rule__TextOrMarkupLine__Group_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:874:1: ( rule__TextOrMarkupLine__Group_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupLineAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:875:1: ( rule__TextOrMarkupLine__Group_1__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=19 && LA9_0<=23)||(LA9_0>=25 && LA9_0<=28)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:875:2: rule__TextOrMarkupLine__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_1__0_in_rule__TextOrMarkupLine__Alternatives1827);
                    	    rule__TextOrMarkupLine__Group_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getTextOrMarkupLineAccess().getGroup_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Alternatives


    // $ANTLR start rule__MarkUp__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:885:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );
    public final void rule__MarkUp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:889:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 28:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            case 26:
                {
                alt11=8;
                }
                break;
            case 27:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("885:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:890:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:890:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:891:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives1863);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:896:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:896:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:897:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives1880);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:902:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:902:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:903:1: ruleRef
                    {
                     before(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkUp__Alternatives1897);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:908:6: ( ruleOrderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:908:6: ( ruleOrderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:909:1: ruleOrderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives1914);
                    ruleOrderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:914:6: ( ruleUnorderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:914:6: ( ruleUnorderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:915:1: ruleUnorderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives1931);
                    ruleUnorderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:920:6: ( ruleCodeBlock )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:920:6: ( ruleCodeBlock )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:921:1: ruleCodeBlock
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives1948);
                    ruleCodeBlock();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:926:6: ( ruleCodeRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:926:6: ( ruleCodeRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:927:1: ruleCodeRef
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives1965);
                    ruleCodeRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:6: ( ruleLink )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:6: ( ruleLink )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:933:1: ruleLink
                    {
                     before(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__MarkUp__Alternatives1982);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( ruleImageRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( ruleImageRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:939:1: ruleImageRef
                    {
                     before(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives1999);
                    ruleImageRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkUp__Alternatives


    // $ANTLR start rule__CodeBlock__Alternatives_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:949:1: rule__CodeBlock__Alternatives_5 : ( ( ( rule__CodeBlock__Group_5_0__0 ) ) | ( ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* ) ) );
    public final void rule__CodeBlock__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:953:1: ( ( ( rule__CodeBlock__Group_5_0__0 ) ) | ( ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_MULTI_NL)||(LA13_0>=9 && LA13_0<=11)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=19 && LA13_0<=21)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("949:1: rule__CodeBlock__Alternatives_5 : ( ( ( rule__CodeBlock__Group_5_0__0 ) ) | ( ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:954:1: ( ( rule__CodeBlock__Group_5_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:954:1: ( ( rule__CodeBlock__Group_5_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:955:1: ( rule__CodeBlock__Group_5_0__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_5_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:1: ( rule__CodeBlock__Group_5_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:2: rule__CodeBlock__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_5_0__0_in_rule__CodeBlock__Alternatives_52031);
                    rule__CodeBlock__Group_5_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:960:6: ( ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:960:6: ( ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:961:1: ( ( rule__CodeBlock__Group_5_1__0 ) ) ( ( rule__CodeBlock__Group_5_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:961:1: ( ( rule__CodeBlock__Group_5_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:962:1: ( rule__CodeBlock__Group_5_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_5_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:963:1: ( rule__CodeBlock__Group_5_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:963:2: rule__CodeBlock__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_5_1__0_in_rule__CodeBlock__Alternatives_52051);
                    rule__CodeBlock__Group_5_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_5_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:966:1: ( ( rule__CodeBlock__Group_5_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:967:1: ( rule__CodeBlock__Group_5_1__0 )*
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_5_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:968:1: ( rule__CodeBlock__Group_5_1__0 )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=19 && LA12_0<=21)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:968:2: rule__CodeBlock__Group_5_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__CodeBlock__Group_5_1__0_in_rule__CodeBlock__Alternatives_52063);
                    	    rule__CodeBlock__Group_5_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                     after(grammarAccess.getCodeBlockAccess().getGroup_5_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Alternatives_5


    // $ANTLR start rule__Text__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:978:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:982:1: ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_WS:
                {
                alt14=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt14=3;
                }
                break;
            case 9:
                {
                alt14=4;
                }
                break;
            case 10:
                {
                alt14=5;
                }
                break;
            case 11:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("978:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:983:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:983:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:984:1: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Text__Alternatives2099); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:989:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:989:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:990:1: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Text__Alternatives2116); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:995:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:995:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:996:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2133); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1001:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1001:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1002:1: '\\\\['
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_3()); 
                    match(input,9,FOLLOW_9_in_rule__Text__Alternatives2151); 
                     after(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1009:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1009:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1010:1: '\\\\]'
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_4()); 
                    match(input,10,FOLLOW_10_in_rule__Text__Alternatives2171); 
                     after(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1017:6: ( ':' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1017:6: ( ':' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:1: ':'
                    {
                     before(grammarAccess.getTextAccess().getColonKeyword_5()); 
                    match(input,11,FOLLOW_11_in_rule__Text__Alternatives2191); 
                     after(grammarAccess.getTextAccess().getColonKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Alternatives


    // $ANTLR start rule__CodeText__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );
    public final void rule__CodeText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1034:1: ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_MULTI_NL:
                {
                alt15=2;
                }
                break;
            case RULE_WS:
                {
                alt15=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt15=4;
                }
                break;
            case 9:
                {
                alt15=5;
                }
                break;
            case 10:
                {
                alt15=6;
                }
                break;
            case 11:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1030:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1035:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1035:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1036:1: RULE_ID
                    {
                     before(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2225); 
                     after(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1041:6: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1041:6: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1042:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2242); 
                     after(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1047:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1047:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1048:1: RULE_WS
                    {
                     before(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2259); 
                     after(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1053:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1053:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1054:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2276); 
                     after(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1059:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1059:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1060:1: '\\\\['
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
                    match(input,9,FOLLOW_9_in_rule__CodeText__Alternatives2294); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1067:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1067:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1068:1: '\\\\]'
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
                    match(input,10,FOLLOW_10_in_rule__CodeText__Alternatives2314); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1075:6: ( ':' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1075:6: ( ':' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1076:1: ':'
                    {
                     before(grammarAccess.getCodeTextAccess().getColonKeyword_6()); 
                    match(input,11,FOLLOW_11_in_rule__CodeText__Alternatives2334); 
                     after(grammarAccess.getCodeTextAccess().getColonKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeText__Alternatives


    // $ANTLR start rule__MarkupInCode__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1088:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );
    public final void rule__MarkupInCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1092:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt16=1;
                }
                break;
            case 20:
                {
                alt16=2;
                }
                break;
            case 21:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1088:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1093:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1093:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1094:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2368);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1100:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2385);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1106:1: ruleRef
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2402);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MarkupInCode__Alternatives


    // $ANTLR start rule__Document__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1118:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1122:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1123:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02432);
            rule__Document__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02435);
            rule__Document__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__0


    // $ANTLR start rule__Document__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1130:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1134:1: ( ( () ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1135:1: ( () )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1135:1: ( () )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1136:1: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1137:1: ()
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:1: 
            {
            }

             after(grammarAccess.getDocumentAccess().getDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__0__Impl


    // $ANTLR start rule__Document__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1149:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1153:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1154:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12493);
            rule__Document__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12496);
            rule__Document__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__1


    // $ANTLR start rule__Document__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1161:1: rule__Document__Group__1__Impl : ( ( rule__Document__Alternatives_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1165:1: ( ( ( rule__Document__Alternatives_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1166:1: ( ( rule__Document__Alternatives_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1166:1: ( ( rule__Document__Alternatives_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1167:1: ( rule__Document__Alternatives_1 )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1168:1: ( rule__Document__Alternatives_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1168:2: rule__Document__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Document__Alternatives_1_in_rule__Document__Group__1__Impl2523);
            rule__Document__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__1__Impl


    // $ANTLR start rule__Document__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1178:1: rule__Document__Group__2 : rule__Document__Group__2__Impl ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1182:1: ( rule__Document__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1183:2: rule__Document__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22553);
            rule__Document__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__2


    // $ANTLR start rule__Document__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1189:1: rule__Document__Group__2__Impl : ( ( rule__Document__ContentsAssignment_2 )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1193:1: ( ( ( rule__Document__ContentsAssignment_2 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1194:1: ( ( rule__Document__ContentsAssignment_2 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1194:1: ( ( rule__Document__ContentsAssignment_2 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1195:1: ( rule__Document__ContentsAssignment_2 )?
            {
             before(grammarAccess.getDocumentAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1196:1: ( rule__Document__ContentsAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_MULTI_NL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1196:2: rule__Document__ContentsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Document__ContentsAssignment_2_in_rule__Document__Group__2__Impl2580);
                    rule__Document__ContentsAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getContentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__2__Impl


    // $ANTLR start rule__Document__Group_1_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1212:1: rule__Document__Group_1_0__0 : rule__Document__Group_1_0__0__Impl rule__Document__Group_1_0__1 ;
    public final void rule__Document__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1216:1: ( rule__Document__Group_1_0__0__Impl rule__Document__Group_1_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1217:2: rule__Document__Group_1_0__0__Impl rule__Document__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Document__Group_1_0__0__Impl_in_rule__Document__Group_1_0__02617);
            rule__Document__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_1_0__1_in_rule__Document__Group_1_0__02620);
            rule__Document__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_0__0


    // $ANTLR start rule__Document__Group_1_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1224:1: rule__Document__Group_1_0__0__Impl : ( ( rule__Document__ContentsAssignment_1_0_0 )? ) ;
    public final void rule__Document__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1228:1: ( ( ( rule__Document__ContentsAssignment_1_0_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1229:1: ( ( rule__Document__ContentsAssignment_1_0_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1229:1: ( ( rule__Document__ContentsAssignment_1_0_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1230:1: ( rule__Document__ContentsAssignment_1_0_0 )?
            {
             before(grammarAccess.getDocumentAccess().getContentsAssignment_1_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1231:1: ( rule__Document__ContentsAssignment_1_0_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_MULTI_NL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1231:2: rule__Document__ContentsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Document__ContentsAssignment_1_0_0_in_rule__Document__Group_1_0__0__Impl2647);
                    rule__Document__ContentsAssignment_1_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getContentsAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_0__0__Impl


    // $ANTLR start rule__Document__Group_1_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1241:1: rule__Document__Group_1_0__1 : rule__Document__Group_1_0__1__Impl ;
    public final void rule__Document__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1245:1: ( rule__Document__Group_1_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1246:2: rule__Document__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_1_0__1__Impl_in_rule__Document__Group_1_0__12678);
            rule__Document__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_0__1


    // $ANTLR start rule__Document__Group_1_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1252:1: rule__Document__Group_1_0__1__Impl : ( ( rule__Document__ChaptersAssignment_1_0_1 ) ) ;
    public final void rule__Document__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1256:1: ( ( ( rule__Document__ChaptersAssignment_1_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1257:1: ( ( rule__Document__ChaptersAssignment_1_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1257:1: ( ( rule__Document__ChaptersAssignment_1_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1258:1: ( rule__Document__ChaptersAssignment_1_0_1 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_1_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1259:1: ( rule__Document__ChaptersAssignment_1_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1259:2: rule__Document__ChaptersAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_1_0_1_in_rule__Document__Group_1_0__1__Impl2705);
            rule__Document__ChaptersAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getChaptersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_0__1__Impl


    // $ANTLR start rule__Document__Group_1_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1273:1: rule__Document__Group_1_1__0 : rule__Document__Group_1_1__0__Impl rule__Document__Group_1_1__1 ;
    public final void rule__Document__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1277:1: ( rule__Document__Group_1_1__0__Impl rule__Document__Group_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1278:2: rule__Document__Group_1_1__0__Impl rule__Document__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_1_1__0__Impl_in_rule__Document__Group_1_1__02739);
            rule__Document__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_1_1__1_in_rule__Document__Group_1_1__02742);
            rule__Document__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_1__0


    // $ANTLR start rule__Document__Group_1_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1285:1: rule__Document__Group_1_1__0__Impl : ( ( rule__Document__ContentsAssignment_1_1_0 )? ) ;
    public final void rule__Document__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1289:1: ( ( ( rule__Document__ContentsAssignment_1_1_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1290:1: ( ( rule__Document__ContentsAssignment_1_1_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1290:1: ( ( rule__Document__ContentsAssignment_1_1_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1291:1: ( rule__Document__ContentsAssignment_1_1_0 )?
            {
             before(grammarAccess.getDocumentAccess().getContentsAssignment_1_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1292:1: ( rule__Document__ContentsAssignment_1_1_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_MULTI_NL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1292:2: rule__Document__ContentsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Document__ContentsAssignment_1_1_0_in_rule__Document__Group_1_1__0__Impl2769);
                    rule__Document__ContentsAssignment_1_1_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getContentsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_1__0__Impl


    // $ANTLR start rule__Document__Group_1_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1302:1: rule__Document__Group_1_1__1 : rule__Document__Group_1_1__1__Impl ;
    public final void rule__Document__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1306:1: ( rule__Document__Group_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1307:2: rule__Document__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_1_1__1__Impl_in_rule__Document__Group_1_1__12800);
            rule__Document__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_1__1


    // $ANTLR start rule__Document__Group_1_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1313:1: rule__Document__Group_1_1__1__Impl : ( ( rule__Document__SectionsAssignment_1_1_1 ) ) ;
    public final void rule__Document__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1317:1: ( ( ( rule__Document__SectionsAssignment_1_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1318:1: ( ( rule__Document__SectionsAssignment_1_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1318:1: ( ( rule__Document__SectionsAssignment_1_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1319:1: ( rule__Document__SectionsAssignment_1_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1320:1: ( rule__Document__SectionsAssignment_1_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1320:2: rule__Document__SectionsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_1_1_1_in_rule__Document__Group_1_1__1__Impl2827);
            rule__Document__SectionsAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_1__1__Impl


    // $ANTLR start rule__Document__Group_1_2__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1334:1: rule__Document__Group_1_2__0 : rule__Document__Group_1_2__0__Impl rule__Document__Group_1_2__1 ;
    public final void rule__Document__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1338:1: ( rule__Document__Group_1_2__0__Impl rule__Document__Group_1_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1339:2: rule__Document__Group_1_2__0__Impl rule__Document__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Document__Group_1_2__0__Impl_in_rule__Document__Group_1_2__02861);
            rule__Document__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_1_2__1_in_rule__Document__Group_1_2__02864);
            rule__Document__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_2__0


    // $ANTLR start rule__Document__Group_1_2__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1346:1: rule__Document__Group_1_2__0__Impl : ( ( rule__Document__ContentsAssignment_1_2_0 )? ) ;
    public final void rule__Document__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1350:1: ( ( ( rule__Document__ContentsAssignment_1_2_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1351:1: ( ( rule__Document__ContentsAssignment_1_2_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1351:1: ( ( rule__Document__ContentsAssignment_1_2_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1352:1: ( rule__Document__ContentsAssignment_1_2_0 )?
            {
             before(grammarAccess.getDocumentAccess().getContentsAssignment_1_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1353:1: ( rule__Document__ContentsAssignment_1_2_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_MULTI_NL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1353:2: rule__Document__ContentsAssignment_1_2_0
                    {
                    pushFollow(FOLLOW_rule__Document__ContentsAssignment_1_2_0_in_rule__Document__Group_1_2__0__Impl2891);
                    rule__Document__ContentsAssignment_1_2_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getContentsAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_2__0__Impl


    // $ANTLR start rule__Document__Group_1_2__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1363:1: rule__Document__Group_1_2__1 : rule__Document__Group_1_2__1__Impl ;
    public final void rule__Document__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1367:1: ( rule__Document__Group_1_2__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1368:2: rule__Document__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_1_2__1__Impl_in_rule__Document__Group_1_2__12922);
            rule__Document__Group_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_2__1


    // $ANTLR start rule__Document__Group_1_2__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1374:1: rule__Document__Group_1_2__1__Impl : ( ( rule__Document__SubsectionsAssignment_1_2_1 ) ) ;
    public final void rule__Document__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1378:1: ( ( ( rule__Document__SubsectionsAssignment_1_2_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1379:1: ( ( rule__Document__SubsectionsAssignment_1_2_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1379:1: ( ( rule__Document__SubsectionsAssignment_1_2_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1380:1: ( rule__Document__SubsectionsAssignment_1_2_1 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_1_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1381:1: ( rule__Document__SubsectionsAssignment_1_2_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1381:2: rule__Document__SubsectionsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_1_2_1_in_rule__Document__Group_1_2__1__Impl2949);
            rule__Document__SubsectionsAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSubsectionsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_1_2__1__Impl


    // $ANTLR start rule__Chapter__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1395:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1399:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1400:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__02983);
            rule__Chapter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__02986);
            rule__Chapter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__0


    // $ANTLR start rule__Chapter__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1407:1: rule__Chapter__Group__0__Impl : ( '\\\\chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1411:1: ( ( '\\\\chapter' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1412:1: ( '\\\\chapter' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1412:1: ( '\\\\chapter' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1413:1: '\\\\chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Chapter__Group__0__Impl3014); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__0__Impl


    // $ANTLR start rule__Chapter__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1426:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1430:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1431:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13045);
            rule__Chapter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13048);
            rule__Chapter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__1


    // $ANTLR start rule__Chapter__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1438:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__Group_1__0 )? ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1442:1: ( ( ( rule__Chapter__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1443:1: ( ( rule__Chapter__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1443:1: ( ( rule__Chapter__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1444:1: ( rule__Chapter__Group_1__0 )?
            {
             before(grammarAccess.getChapterAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1445:1: ( rule__Chapter__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1445:2: rule__Chapter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_1__0_in_rule__Chapter__Group__1__Impl3075);
                    rule__Chapter__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__1__Impl


    // $ANTLR start rule__Chapter__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1455:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1459:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1460:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23106);
            rule__Chapter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23109);
            rule__Chapter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__2


    // $ANTLR start rule__Chapter__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1467:1: rule__Chapter__Group__2__Impl : ( '[' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1471:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1472:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1472:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1473:1: '['
            {
             before(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Chapter__Group__2__Impl3137); 
             after(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__2__Impl


    // $ANTLR start rule__Chapter__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1486:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1490:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1491:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33168);
            rule__Chapter__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33171);
            rule__Chapter__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__3


    // $ANTLR start rule__Chapter__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1498:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__TitleAssignment_3 ) ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1502:1: ( ( ( rule__Chapter__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1503:1: ( ( rule__Chapter__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1503:1: ( ( rule__Chapter__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1504:1: ( rule__Chapter__TitleAssignment_3 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1505:1: ( rule__Chapter__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1505:2: rule__Chapter__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Chapter__TitleAssignment_3_in_rule__Chapter__Group__3__Impl3198);
            rule__Chapter__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__3__Impl


    // $ANTLR start rule__Chapter__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1515:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1519:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1520:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43228);
            rule__Chapter__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__5_in_rule__Chapter__Group__43231);
            rule__Chapter__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__4


    // $ANTLR start rule__Chapter__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1527:1: rule__Chapter__Group__4__Impl : ( ']' ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1531:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1532:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1532:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1533:1: ']'
            {
             before(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Chapter__Group__4__Impl3259); 
             after(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__4__Impl


    // $ANTLR start rule__Chapter__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1546:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1550:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1551:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_rule__Chapter__Group__5__Impl_in_rule__Chapter__Group__53290);
            rule__Chapter__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__6_in_rule__Chapter__Group__53293);
            rule__Chapter__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__5


    // $ANTLR start rule__Chapter__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1558:1: rule__Chapter__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1562:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1563:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1563:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1564:1: ( RULE_WS )*
            {
             before(grammarAccess.getChapterAccess().getWSTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1565:1: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1565:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Chapter__Group__5__Impl3321); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__5__Impl


    // $ANTLR start rule__Chapter__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1575:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl rule__Chapter__Group__7 ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1579:1: ( rule__Chapter__Group__6__Impl rule__Chapter__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1580:2: rule__Chapter__Group__6__Impl rule__Chapter__Group__7
            {
            pushFollow(FOLLOW_rule__Chapter__Group__6__Impl_in_rule__Chapter__Group__63352);
            rule__Chapter__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__7_in_rule__Chapter__Group__63355);
            rule__Chapter__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__6


    // $ANTLR start rule__Chapter__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1587:1: rule__Chapter__Group__6__Impl : ( ( rule__Chapter__Group_6__0 )? ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1591:1: ( ( ( rule__Chapter__Group_6__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1592:1: ( ( rule__Chapter__Group_6__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1592:1: ( ( rule__Chapter__Group_6__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1593:1: ( rule__Chapter__Group_6__0 )?
            {
             before(grammarAccess.getChapterAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1594:1: ( rule__Chapter__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_MULTI_NL) ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>=RULE_ID && LA23_1<=RULE_ANY_OTHER)||(LA23_1>=9 && LA23_1<=11)||(LA23_1>=19 && LA23_1<=23)||(LA23_1>=25 && LA23_1<=28)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1594:2: rule__Chapter__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_6__0_in_rule__Chapter__Group__6__Impl3382);
                    rule__Chapter__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__6__Impl


    // $ANTLR start rule__Chapter__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1604:1: rule__Chapter__Group__7 : rule__Chapter__Group__7__Impl ;
    public final void rule__Chapter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1608:1: ( rule__Chapter__Group__7__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1609:2: rule__Chapter__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group__7__Impl_in_rule__Chapter__Group__73413);
            rule__Chapter__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__7


    // $ANTLR start rule__Chapter__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1615:1: rule__Chapter__Group__7__Impl : ( ( rule__Chapter__Group_7__0 )* ) ;
    public final void rule__Chapter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1619:1: ( ( ( rule__Chapter__Group_7__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1620:1: ( ( rule__Chapter__Group_7__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1620:1: ( ( rule__Chapter__Group_7__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1621:1: ( rule__Chapter__Group_7__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1622:1: ( rule__Chapter__Group_7__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==15) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1622:2: rule__Chapter__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_7__0_in_rule__Chapter__Group__7__Impl3440);
            	    rule__Chapter__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group__7__Impl


    // $ANTLR start rule__Chapter__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1648:1: rule__Chapter__Group_1__0 : rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1 ;
    public final void rule__Chapter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1652:1: ( rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1653:2: rule__Chapter__Group_1__0__Impl rule__Chapter__Group_1__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_1__0__Impl_in_rule__Chapter__Group_1__03487);
            rule__Chapter__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_1__1_in_rule__Chapter__Group_1__03490);
            rule__Chapter__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__0


    // $ANTLR start rule__Chapter__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1660:1: rule__Chapter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Chapter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1664:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1665:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1665:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1666:1: ':'
            {
             before(grammarAccess.getChapterAccess().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Chapter__Group_1__0__Impl3518); 
             after(grammarAccess.getChapterAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__0__Impl


    // $ANTLR start rule__Chapter__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1679:1: rule__Chapter__Group_1__1 : rule__Chapter__Group_1__1__Impl ;
    public final void rule__Chapter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1683:1: ( rule__Chapter__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1684:2: rule__Chapter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_1__1__Impl_in_rule__Chapter__Group_1__13549);
            rule__Chapter__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__1


    // $ANTLR start rule__Chapter__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1690:1: rule__Chapter__Group_1__1__Impl : ( ( rule__Chapter__NameAssignment_1_1 ) ) ;
    public final void rule__Chapter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1694:1: ( ( ( rule__Chapter__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1695:1: ( ( rule__Chapter__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1695:1: ( ( rule__Chapter__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1696:1: ( rule__Chapter__NameAssignment_1_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1697:1: ( rule__Chapter__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1697:2: rule__Chapter__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Chapter__NameAssignment_1_1_in_rule__Chapter__Group_1__1__Impl3576);
            rule__Chapter__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_1__1__Impl


    // $ANTLR start rule__Chapter__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1711:1: rule__Chapter__Group_6__0 : rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1 ;
    public final void rule__Chapter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1715:1: ( rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1716:2: rule__Chapter__Group_6__0__Impl rule__Chapter__Group_6__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6__0__Impl_in_rule__Chapter__Group_6__03610);
            rule__Chapter__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_6__1_in_rule__Chapter__Group_6__03613);
            rule__Chapter__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__0


    // $ANTLR start rule__Chapter__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1723:1: rule__Chapter__Group_6__0__Impl : ( ( rule__Chapter__Group_6_0__0 ) ) ;
    public final void rule__Chapter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1727:1: ( ( ( rule__Chapter__Group_6_0__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1728:1: ( ( rule__Chapter__Group_6_0__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1728:1: ( ( rule__Chapter__Group_6_0__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1729:1: ( rule__Chapter__Group_6_0__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup_6_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1730:1: ( rule__Chapter__Group_6_0__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1730:2: rule__Chapter__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6_0__0_in_rule__Chapter__Group_6__0__Impl3640);
            rule__Chapter__Group_6_0__0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__0__Impl


    // $ANTLR start rule__Chapter__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1740:1: rule__Chapter__Group_6__1 : rule__Chapter__Group_6__1__Impl ;
    public final void rule__Chapter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1744:1: ( rule__Chapter__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1745:2: rule__Chapter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6__1__Impl_in_rule__Chapter__Group_6__13670);
            rule__Chapter__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__1


    // $ANTLR start rule__Chapter__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1751:1: rule__Chapter__Group_6__1__Impl : ( ( rule__Chapter__ContentsAssignment_6_1 )* ) ;
    public final void rule__Chapter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1755:1: ( ( ( rule__Chapter__ContentsAssignment_6_1 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1756:1: ( ( rule__Chapter__ContentsAssignment_6_1 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1756:1: ( ( rule__Chapter__ContentsAssignment_6_1 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1757:1: ( rule__Chapter__ContentsAssignment_6_1 )*
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1758:1: ( rule__Chapter__ContentsAssignment_6_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_1 = input.LA(2);

                    if ( ((LA25_1>=RULE_ID && LA25_1<=RULE_ANY_OTHER)||(LA25_1>=9 && LA25_1<=11)||(LA25_1>=19 && LA25_1<=23)||(LA25_1>=25 && LA25_1<=28)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1758:2: rule__Chapter__ContentsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_6_1_in_rule__Chapter__Group_6__1__Impl3697);
            	    rule__Chapter__ContentsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6__1__Impl


    // $ANTLR start rule__Chapter__Group_6_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1772:1: rule__Chapter__Group_6_0__0 : rule__Chapter__Group_6_0__0__Impl rule__Chapter__Group_6_0__1 ;
    public final void rule__Chapter__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1776:1: ( rule__Chapter__Group_6_0__0__Impl rule__Chapter__Group_6_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1777:2: rule__Chapter__Group_6_0__0__Impl rule__Chapter__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6_0__0__Impl_in_rule__Chapter__Group_6_0__03732);
            rule__Chapter__Group_6_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_6_0__1_in_rule__Chapter__Group_6_0__03735);
            rule__Chapter__Group_6_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6_0__0


    // $ANTLR start rule__Chapter__Group_6_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1784:1: rule__Chapter__Group_6_0__0__Impl : ( ( rule__Chapter__ContentsAssignment_6_0_0 ) ) ;
    public final void rule__Chapter__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1788:1: ( ( ( rule__Chapter__ContentsAssignment_6_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1789:1: ( ( rule__Chapter__ContentsAssignment_6_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1789:1: ( ( rule__Chapter__ContentsAssignment_6_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1790:1: ( rule__Chapter__ContentsAssignment_6_0_0 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_6_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1791:1: ( rule__Chapter__ContentsAssignment_6_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1791:2: rule__Chapter__ContentsAssignment_6_0_0
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_6_0_0_in_rule__Chapter__Group_6_0__0__Impl3762);
            rule__Chapter__ContentsAssignment_6_0_0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6_0__0__Impl


    // $ANTLR start rule__Chapter__Group_6_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1801:1: rule__Chapter__Group_6_0__1 : rule__Chapter__Group_6_0__1__Impl ;
    public final void rule__Chapter__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1805:1: ( rule__Chapter__Group_6_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1806:2: rule__Chapter__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_6_0__1__Impl_in_rule__Chapter__Group_6_0__13792);
            rule__Chapter__Group_6_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6_0__1


    // $ANTLR start rule__Chapter__Group_6_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1812:1: rule__Chapter__Group_6_0__1__Impl : ( ( rule__Chapter__ContentsAssignment_6_0_1 ) ) ;
    public final void rule__Chapter__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1816:1: ( ( ( rule__Chapter__ContentsAssignment_6_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1817:1: ( ( rule__Chapter__ContentsAssignment_6_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1817:1: ( ( rule__Chapter__ContentsAssignment_6_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1818:1: ( rule__Chapter__ContentsAssignment_6_0_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_6_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1819:1: ( rule__Chapter__ContentsAssignment_6_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1819:2: rule__Chapter__ContentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_6_0_1_in_rule__Chapter__Group_6_0__1__Impl3819);
            rule__Chapter__ContentsAssignment_6_0_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_6_0__1__Impl


    // $ANTLR start rule__Chapter__Group_7__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1833:1: rule__Chapter__Group_7__0 : rule__Chapter__Group_7__0__Impl rule__Chapter__Group_7__1 ;
    public final void rule__Chapter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1837:1: ( rule__Chapter__Group_7__0__Impl rule__Chapter__Group_7__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1838:2: rule__Chapter__Group_7__0__Impl rule__Chapter__Group_7__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_7__0__Impl_in_rule__Chapter__Group_7__03853);
            rule__Chapter__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_7__1_in_rule__Chapter__Group_7__03856);
            rule__Chapter__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_7__0


    // $ANTLR start rule__Chapter__Group_7__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1845:1: rule__Chapter__Group_7__0__Impl : ( ( rule__Chapter__ContentsAssignment_7_0 )? ) ;
    public final void rule__Chapter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1849:1: ( ( ( rule__Chapter__ContentsAssignment_7_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1850:1: ( ( rule__Chapter__ContentsAssignment_7_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1850:1: ( ( rule__Chapter__ContentsAssignment_7_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1851:1: ( rule__Chapter__ContentsAssignment_7_0 )?
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_7_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1852:1: ( rule__Chapter__ContentsAssignment_7_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_MULTI_NL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1852:2: rule__Chapter__ContentsAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_7_0_in_rule__Chapter__Group_7__0__Impl3883);
                    rule__Chapter__ContentsAssignment_7_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_7__0__Impl


    // $ANTLR start rule__Chapter__Group_7__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1862:1: rule__Chapter__Group_7__1 : rule__Chapter__Group_7__1__Impl ;
    public final void rule__Chapter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1866:1: ( rule__Chapter__Group_7__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1867:2: rule__Chapter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_7__1__Impl_in_rule__Chapter__Group_7__13914);
            rule__Chapter__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_7__1


    // $ANTLR start rule__Chapter__Group_7__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1873:1: rule__Chapter__Group_7__1__Impl : ( ( rule__Chapter__ContentsAssignment_7_1 ) ) ;
    public final void rule__Chapter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1877:1: ( ( ( rule__Chapter__ContentsAssignment_7_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1878:1: ( ( rule__Chapter__ContentsAssignment_7_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1878:1: ( ( rule__Chapter__ContentsAssignment_7_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1879:1: ( rule__Chapter__ContentsAssignment_7_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_7_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1880:1: ( rule__Chapter__ContentsAssignment_7_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1880:2: rule__Chapter__ContentsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_7_1_in_rule__Chapter__Group_7__1__Impl3941);
            rule__Chapter__ContentsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_7__1__Impl


    // $ANTLR start rule__Section__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1894:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1898:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1899:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__03975);
            rule__Section__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__03978);
            rule__Section__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__0


    // $ANTLR start rule__Section__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1906:1: rule__Section__Group__0__Impl : ( '\\\\section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1910:1: ( ( '\\\\section' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1911:1: ( '\\\\section' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1911:1: ( '\\\\section' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1912:1: '\\\\section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Section__Group__0__Impl4006); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__0__Impl


    // $ANTLR start rule__Section__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1925:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1929:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1930:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14037);
            rule__Section__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14040);
            rule__Section__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__1


    // $ANTLR start rule__Section__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1937:1: rule__Section__Group__1__Impl : ( ( rule__Section__Group_1__0 )? ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1941:1: ( ( ( rule__Section__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1942:1: ( ( rule__Section__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1942:1: ( ( rule__Section__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1943:1: ( rule__Section__Group_1__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1944:1: ( rule__Section__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1944:2: rule__Section__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_1__0_in_rule__Section__Group__1__Impl4067);
                    rule__Section__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__1__Impl


    // $ANTLR start rule__Section__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1954:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1958:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1959:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24098);
            rule__Section__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24101);
            rule__Section__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__2


    // $ANTLR start rule__Section__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1966:1: rule__Section__Group__2__Impl : ( '[' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1970:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1971:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1971:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1972:1: '['
            {
             before(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Section__Group__2__Impl4129); 
             after(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__2__Impl


    // $ANTLR start rule__Section__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1985:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1989:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1990:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34160);
            rule__Section__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34163);
            rule__Section__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__3


    // $ANTLR start rule__Section__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1997:1: rule__Section__Group__3__Impl : ( ( rule__Section__TitleAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2001:1: ( ( ( rule__Section__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2002:1: ( ( rule__Section__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2002:1: ( ( rule__Section__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2003:1: ( rule__Section__TitleAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2004:1: ( rule__Section__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2004:2: rule__Section__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl4190);
            rule__Section__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__3__Impl


    // $ANTLR start rule__Section__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2014:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2018:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2019:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44220);
            rule__Section__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44223);
            rule__Section__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__4


    // $ANTLR start rule__Section__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2026:1: rule__Section__Group__4__Impl : ( ']' ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2030:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2031:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2031:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2032:1: ']'
            {
             before(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Section__Group__4__Impl4251); 
             after(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__4__Impl


    // $ANTLR start rule__Section__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2045:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2049:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2050:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54282);
            rule__Section__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54285);
            rule__Section__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__5


    // $ANTLR start rule__Section__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2057:1: rule__Section__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2061:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2062:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2062:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2063:1: ( RULE_WS )*
            {
             before(grammarAccess.getSectionAccess().getWSTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2064:1: ( RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2064:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Section__Group__5__Impl4313); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__5__Impl


    // $ANTLR start rule__Section__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2074:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2078:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2079:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64344);
            rule__Section__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__7_in_rule__Section__Group__64347);
            rule__Section__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__6


    // $ANTLR start rule__Section__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2086:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2090:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2091:1: ( ( rule__Section__Group_6__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2091:1: ( ( rule__Section__Group_6__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2092:1: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2093:1: ( rule__Section__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_MULTI_NL) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_ANY_OTHER)||(LA29_1>=9 && LA29_1<=11)||(LA29_1>=19 && LA29_1<=23)||(LA29_1>=25 && LA29_1<=28)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2093:2: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl4374);
                    rule__Section__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__6__Impl


    // $ANTLR start rule__Section__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2103:1: rule__Section__Group__7 : rule__Section__Group__7__Impl ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2107:1: ( rule__Section__Group__7__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2108:2: rule__Section__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__74405);
            rule__Section__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__7


    // $ANTLR start rule__Section__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2114:1: rule__Section__Group__7__Impl : ( ( rule__Section__Group_7__0 )* ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2118:1: ( ( ( rule__Section__Group_7__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2119:1: ( ( rule__Section__Group_7__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2119:1: ( ( rule__Section__Group_7__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2120:1: ( rule__Section__Group_7__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2121:1: ( rule__Section__Group_7__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==16) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2121:2: rule__Section__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_7__0_in_rule__Section__Group__7__Impl4432);
            	    rule__Section__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group__7__Impl


    // $ANTLR start rule__Section__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2147:1: rule__Section__Group_1__0 : rule__Section__Group_1__0__Impl rule__Section__Group_1__1 ;
    public final void rule__Section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2151:1: ( rule__Section__Group_1__0__Impl rule__Section__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2152:2: rule__Section__Group_1__0__Impl rule__Section__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section__Group_1__0__Impl_in_rule__Section__Group_1__04479);
            rule__Section__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_1__1_in_rule__Section__Group_1__04482);
            rule__Section__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__0


    // $ANTLR start rule__Section__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2159:1: rule__Section__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2163:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2164:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2164:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2165:1: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Section__Group_1__0__Impl4510); 
             after(grammarAccess.getSectionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__0__Impl


    // $ANTLR start rule__Section__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2178:1: rule__Section__Group_1__1 : rule__Section__Group_1__1__Impl ;
    public final void rule__Section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2182:1: ( rule__Section__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2183:2: rule__Section__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_1__1__Impl_in_rule__Section__Group_1__14541);
            rule__Section__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__1


    // $ANTLR start rule__Section__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2189:1: rule__Section__Group_1__1__Impl : ( ( rule__Section__NameAssignment_1_1 ) ) ;
    public final void rule__Section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2193:1: ( ( ( rule__Section__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2194:1: ( ( rule__Section__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2194:1: ( ( rule__Section__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2195:1: ( rule__Section__NameAssignment_1_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2196:1: ( rule__Section__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2196:2: rule__Section__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_1_1_in_rule__Section__Group_1__1__Impl4568);
            rule__Section__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_1__1__Impl


    // $ANTLR start rule__Section__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2210:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2214:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2215:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__04602);
            rule__Section__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__04605);
            rule__Section__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__0


    // $ANTLR start rule__Section__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2222:1: rule__Section__Group_6__0__Impl : ( ( rule__Section__Group_6_0__0 ) ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2226:1: ( ( ( rule__Section__Group_6_0__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2227:1: ( ( rule__Section__Group_6_0__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2227:1: ( ( rule__Section__Group_6_0__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2228:1: ( rule__Section__Group_6_0__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup_6_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2229:1: ( rule__Section__Group_6_0__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2229:2: rule__Section__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__Section__Group_6_0__0_in_rule__Section__Group_6__0__Impl4632);
            rule__Section__Group_6_0__0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__0__Impl


    // $ANTLR start rule__Section__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2239:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2243:1: ( rule__Section__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2244:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__14662);
            rule__Section__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__1


    // $ANTLR start rule__Section__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2250:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__ContentsAssignment_6_1 )* ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2254:1: ( ( ( rule__Section__ContentsAssignment_6_1 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2255:1: ( ( rule__Section__ContentsAssignment_6_1 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2255:1: ( ( rule__Section__ContentsAssignment_6_1 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2256:1: ( rule__Section__ContentsAssignment_6_1 )*
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2257:1: ( rule__Section__ContentsAssignment_6_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_ANY_OTHER)||(LA31_1>=9 && LA31_1<=11)||(LA31_1>=19 && LA31_1<=23)||(LA31_1>=25 && LA31_1<=28)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2257:2: rule__Section__ContentsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Section__ContentsAssignment_6_1_in_rule__Section__Group_6__1__Impl4689);
            	    rule__Section__ContentsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6__1__Impl


    // $ANTLR start rule__Section__Group_6_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2271:1: rule__Section__Group_6_0__0 : rule__Section__Group_6_0__0__Impl rule__Section__Group_6_0__1 ;
    public final void rule__Section__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2275:1: ( rule__Section__Group_6_0__0__Impl rule__Section__Group_6_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2276:2: rule__Section__Group_6_0__0__Impl rule__Section__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__Section__Group_6_0__0__Impl_in_rule__Section__Group_6_0__04724);
            rule__Section__Group_6_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_6_0__1_in_rule__Section__Group_6_0__04727);
            rule__Section__Group_6_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6_0__0


    // $ANTLR start rule__Section__Group_6_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2283:1: rule__Section__Group_6_0__0__Impl : ( ( rule__Section__ContentsAssignment_6_0_0 ) ) ;
    public final void rule__Section__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2287:1: ( ( ( rule__Section__ContentsAssignment_6_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2288:1: ( ( rule__Section__ContentsAssignment_6_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2288:1: ( ( rule__Section__ContentsAssignment_6_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2289:1: ( rule__Section__ContentsAssignment_6_0_0 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_6_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2290:1: ( rule__Section__ContentsAssignment_6_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2290:2: rule__Section__ContentsAssignment_6_0_0
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_6_0_0_in_rule__Section__Group_6_0__0__Impl4754);
            rule__Section__ContentsAssignment_6_0_0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6_0__0__Impl


    // $ANTLR start rule__Section__Group_6_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2300:1: rule__Section__Group_6_0__1 : rule__Section__Group_6_0__1__Impl ;
    public final void rule__Section__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2304:1: ( rule__Section__Group_6_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2305:2: rule__Section__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_6_0__1__Impl_in_rule__Section__Group_6_0__14784);
            rule__Section__Group_6_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6_0__1


    // $ANTLR start rule__Section__Group_6_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2311:1: rule__Section__Group_6_0__1__Impl : ( ( rule__Section__ContentsAssignment_6_0_1 ) ) ;
    public final void rule__Section__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2315:1: ( ( ( rule__Section__ContentsAssignment_6_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2316:1: ( ( rule__Section__ContentsAssignment_6_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2316:1: ( ( rule__Section__ContentsAssignment_6_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2317:1: ( rule__Section__ContentsAssignment_6_0_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_6_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2318:1: ( rule__Section__ContentsAssignment_6_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2318:2: rule__Section__ContentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_6_0_1_in_rule__Section__Group_6_0__1__Impl4811);
            rule__Section__ContentsAssignment_6_0_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_6_0__1__Impl


    // $ANTLR start rule__Section__Group_7__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2332:1: rule__Section__Group_7__0 : rule__Section__Group_7__0__Impl rule__Section__Group_7__1 ;
    public final void rule__Section__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2336:1: ( rule__Section__Group_7__0__Impl rule__Section__Group_7__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2337:2: rule__Section__Group_7__0__Impl rule__Section__Group_7__1
            {
            pushFollow(FOLLOW_rule__Section__Group_7__0__Impl_in_rule__Section__Group_7__04845);
            rule__Section__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_7__1_in_rule__Section__Group_7__04848);
            rule__Section__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_7__0


    // $ANTLR start rule__Section__Group_7__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2344:1: rule__Section__Group_7__0__Impl : ( ( rule__Section__ContentsAssignment_7_0 )? ) ;
    public final void rule__Section__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2348:1: ( ( ( rule__Section__ContentsAssignment_7_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2349:1: ( ( rule__Section__ContentsAssignment_7_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2349:1: ( ( rule__Section__ContentsAssignment_7_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2350:1: ( rule__Section__ContentsAssignment_7_0 )?
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_7_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2351:1: ( rule__Section__ContentsAssignment_7_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_MULTI_NL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2351:2: rule__Section__ContentsAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Section__ContentsAssignment_7_0_in_rule__Section__Group_7__0__Impl4875);
                    rule__Section__ContentsAssignment_7_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_7__0__Impl


    // $ANTLR start rule__Section__Group_7__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2361:1: rule__Section__Group_7__1 : rule__Section__Group_7__1__Impl ;
    public final void rule__Section__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2365:1: ( rule__Section__Group_7__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2366:2: rule__Section__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_7__1__Impl_in_rule__Section__Group_7__14906);
            rule__Section__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_7__1


    // $ANTLR start rule__Section__Group_7__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2372:1: rule__Section__Group_7__1__Impl : ( ( rule__Section__ContentsAssignment_7_1 ) ) ;
    public final void rule__Section__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2376:1: ( ( ( rule__Section__ContentsAssignment_7_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2377:1: ( ( rule__Section__ContentsAssignment_7_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2377:1: ( ( rule__Section__ContentsAssignment_7_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2378:1: ( rule__Section__ContentsAssignment_7_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_7_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2379:1: ( rule__Section__ContentsAssignment_7_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2379:2: rule__Section__ContentsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_7_1_in_rule__Section__Group_7__1__Impl4933);
            rule__Section__ContentsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_7__1__Impl


    // $ANTLR start rule__SubSection__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2393:1: rule__SubSection__Group__0 : rule__SubSection__Group__0__Impl rule__SubSection__Group__1 ;
    public final void rule__SubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2397:1: ( rule__SubSection__Group__0__Impl rule__SubSection__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2398:2: rule__SubSection__Group__0__Impl rule__SubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__04967);
            rule__SubSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__04970);
            rule__SubSection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__0


    // $ANTLR start rule__SubSection__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2405:1: rule__SubSection__Group__0__Impl : ( '\\\\subsection' ) ;
    public final void rule__SubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2409:1: ( ( '\\\\subsection' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2410:1: ( '\\\\subsection' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2410:1: ( '\\\\subsection' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2411:1: '\\\\subsection'
            {
             before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SubSection__Group__0__Impl4998); 
             after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__0__Impl


    // $ANTLR start rule__SubSection__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2424:1: rule__SubSection__Group__1 : rule__SubSection__Group__1__Impl rule__SubSection__Group__2 ;
    public final void rule__SubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2428:1: ( rule__SubSection__Group__1__Impl rule__SubSection__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2429:2: rule__SubSection__Group__1__Impl rule__SubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15029);
            rule__SubSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15032);
            rule__SubSection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__1


    // $ANTLR start rule__SubSection__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2436:1: rule__SubSection__Group__1__Impl : ( ( rule__SubSection__Group_1__0 )? ) ;
    public final void rule__SubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2440:1: ( ( ( rule__SubSection__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2441:1: ( ( rule__SubSection__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2441:1: ( ( rule__SubSection__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2442:1: ( rule__SubSection__Group_1__0 )?
            {
             before(grammarAccess.getSubSectionAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2443:1: ( rule__SubSection__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==11) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2443:2: rule__SubSection__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubSection__Group_1__0_in_rule__SubSection__Group__1__Impl5059);
                    rule__SubSection__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__1__Impl


    // $ANTLR start rule__SubSection__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2453:1: rule__SubSection__Group__2 : rule__SubSection__Group__2__Impl rule__SubSection__Group__3 ;
    public final void rule__SubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2457:1: ( rule__SubSection__Group__2__Impl rule__SubSection__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2458:2: rule__SubSection__Group__2__Impl rule__SubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25090);
            rule__SubSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25093);
            rule__SubSection__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__2


    // $ANTLR start rule__SubSection__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2465:1: rule__SubSection__Group__2__Impl : ( '[' ) ;
    public final void rule__SubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2469:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2470:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2470:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2471:1: '['
            {
             before(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__SubSection__Group__2__Impl5121); 
             after(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__2__Impl


    // $ANTLR start rule__SubSection__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2484:1: rule__SubSection__Group__3 : rule__SubSection__Group__3__Impl rule__SubSection__Group__4 ;
    public final void rule__SubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2488:1: ( rule__SubSection__Group__3__Impl rule__SubSection__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2489:2: rule__SubSection__Group__3__Impl rule__SubSection__Group__4
            {
            pushFollow(FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35152);
            rule__SubSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35155);
            rule__SubSection__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__3


    // $ANTLR start rule__SubSection__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2496:1: rule__SubSection__Group__3__Impl : ( ( rule__SubSection__TitleAssignment_3 ) ) ;
    public final void rule__SubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2500:1: ( ( ( rule__SubSection__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2501:1: ( ( rule__SubSection__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2501:1: ( ( rule__SubSection__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2502:1: ( rule__SubSection__TitleAssignment_3 )
            {
             before(grammarAccess.getSubSectionAccess().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2503:1: ( rule__SubSection__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2503:2: rule__SubSection__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__SubSection__TitleAssignment_3_in_rule__SubSection__Group__3__Impl5182);
            rule__SubSection__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__3__Impl


    // $ANTLR start rule__SubSection__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2513:1: rule__SubSection__Group__4 : rule__SubSection__Group__4__Impl rule__SubSection__Group__5 ;
    public final void rule__SubSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2517:1: ( rule__SubSection__Group__4__Impl rule__SubSection__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2518:2: rule__SubSection__Group__4__Impl rule__SubSection__Group__5
            {
            pushFollow(FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45212);
            rule__SubSection__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__5_in_rule__SubSection__Group__45215);
            rule__SubSection__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__4


    // $ANTLR start rule__SubSection__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2525:1: rule__SubSection__Group__4__Impl : ( ']' ) ;
    public final void rule__SubSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2529:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2530:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2530:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2531:1: ']'
            {
             before(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SubSection__Group__4__Impl5243); 
             after(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__4__Impl


    // $ANTLR start rule__SubSection__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2544:1: rule__SubSection__Group__5 : rule__SubSection__Group__5__Impl rule__SubSection__Group__6 ;
    public final void rule__SubSection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2548:1: ( rule__SubSection__Group__5__Impl rule__SubSection__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2549:2: rule__SubSection__Group__5__Impl rule__SubSection__Group__6
            {
            pushFollow(FOLLOW_rule__SubSection__Group__5__Impl_in_rule__SubSection__Group__55274);
            rule__SubSection__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__6_in_rule__SubSection__Group__55277);
            rule__SubSection__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__5


    // $ANTLR start rule__SubSection__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2556:1: rule__SubSection__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__SubSection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2560:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2561:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2561:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2562:1: ( RULE_WS )*
            {
             before(grammarAccess.getSubSectionAccess().getWSTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2563:1: ( RULE_WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2563:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__SubSection__Group__5__Impl5305); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__5__Impl


    // $ANTLR start rule__SubSection__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2573:1: rule__SubSection__Group__6 : rule__SubSection__Group__6__Impl rule__SubSection__Group__7 ;
    public final void rule__SubSection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2577:1: ( rule__SubSection__Group__6__Impl rule__SubSection__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2578:2: rule__SubSection__Group__6__Impl rule__SubSection__Group__7
            {
            pushFollow(FOLLOW_rule__SubSection__Group__6__Impl_in_rule__SubSection__Group__65336);
            rule__SubSection__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__7_in_rule__SubSection__Group__65339);
            rule__SubSection__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__6


    // $ANTLR start rule__SubSection__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2585:1: rule__SubSection__Group__6__Impl : ( ( rule__SubSection__Group_6__0 )? ) ;
    public final void rule__SubSection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2589:1: ( ( ( rule__SubSection__Group_6__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2590:1: ( ( rule__SubSection__Group_6__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2590:1: ( ( rule__SubSection__Group_6__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2591:1: ( rule__SubSection__Group_6__0 )?
            {
             before(grammarAccess.getSubSectionAccess().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2592:1: ( rule__SubSection__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_MULTI_NL) ) {
                int LA35_1 = input.LA(2);

                if ( ((LA35_1>=RULE_ID && LA35_1<=RULE_ANY_OTHER)||(LA35_1>=9 && LA35_1<=11)||(LA35_1>=19 && LA35_1<=23)||(LA35_1>=25 && LA35_1<=28)) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2592:2: rule__SubSection__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SubSection__Group_6__0_in_rule__SubSection__Group__6__Impl5366);
                    rule__SubSection__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__6__Impl


    // $ANTLR start rule__SubSection__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2602:1: rule__SubSection__Group__7 : rule__SubSection__Group__7__Impl ;
    public final void rule__SubSection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2606:1: ( rule__SubSection__Group__7__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2607:2: rule__SubSection__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group__7__Impl_in_rule__SubSection__Group__75397);
            rule__SubSection__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__7


    // $ANTLR start rule__SubSection__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2613:1: rule__SubSection__Group__7__Impl : ( ( rule__SubSection__Group_7__0 )* ) ;
    public final void rule__SubSection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2617:1: ( ( ( rule__SubSection__Group_7__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2618:1: ( ( rule__SubSection__Group_7__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2618:1: ( ( rule__SubSection__Group_7__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2619:1: ( rule__SubSection__Group_7__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2620:1: ( rule__SubSection__Group_7__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_MULTI_NL) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==17) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==17) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2620:2: rule__SubSection__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_7__0_in_rule__SubSection__Group__7__Impl5424);
            	    rule__SubSection__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group__7__Impl


    // $ANTLR start rule__SubSection__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2646:1: rule__SubSection__Group_1__0 : rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1 ;
    public final void rule__SubSection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2650:1: ( rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2651:2: rule__SubSection__Group_1__0__Impl rule__SubSection__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_1__0__Impl_in_rule__SubSection__Group_1__05471);
            rule__SubSection__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_1__1_in_rule__SubSection__Group_1__05474);
            rule__SubSection__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__0


    // $ANTLR start rule__SubSection__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2658:1: rule__SubSection__Group_1__0__Impl : ( ':' ) ;
    public final void rule__SubSection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2662:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2663:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2663:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2664:1: ':'
            {
             before(grammarAccess.getSubSectionAccess().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__SubSection__Group_1__0__Impl5502); 
             after(grammarAccess.getSubSectionAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__0__Impl


    // $ANTLR start rule__SubSection__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2677:1: rule__SubSection__Group_1__1 : rule__SubSection__Group_1__1__Impl ;
    public final void rule__SubSection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2681:1: ( rule__SubSection__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2682:2: rule__SubSection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_1__1__Impl_in_rule__SubSection__Group_1__15533);
            rule__SubSection__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__1


    // $ANTLR start rule__SubSection__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2688:1: rule__SubSection__Group_1__1__Impl : ( ( rule__SubSection__NameAssignment_1_1 ) ) ;
    public final void rule__SubSection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2692:1: ( ( ( rule__SubSection__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2693:1: ( ( rule__SubSection__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2693:1: ( ( rule__SubSection__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2694:1: ( rule__SubSection__NameAssignment_1_1 )
            {
             before(grammarAccess.getSubSectionAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2695:1: ( rule__SubSection__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2695:2: rule__SubSection__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubSection__NameAssignment_1_1_in_rule__SubSection__Group_1__1__Impl5560);
            rule__SubSection__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_1__1__Impl


    // $ANTLR start rule__SubSection__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2709:1: rule__SubSection__Group_6__0 : rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1 ;
    public final void rule__SubSection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2713:1: ( rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2714:2: rule__SubSection__Group_6__0__Impl rule__SubSection__Group_6__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6__0__Impl_in_rule__SubSection__Group_6__05594);
            rule__SubSection__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_6__1_in_rule__SubSection__Group_6__05597);
            rule__SubSection__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__0


    // $ANTLR start rule__SubSection__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2721:1: rule__SubSection__Group_6__0__Impl : ( ( rule__SubSection__Group_6_0__0 ) ) ;
    public final void rule__SubSection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2725:1: ( ( ( rule__SubSection__Group_6_0__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2726:1: ( ( rule__SubSection__Group_6_0__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2726:1: ( ( rule__SubSection__Group_6_0__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2727:1: ( rule__SubSection__Group_6_0__0 )
            {
             before(grammarAccess.getSubSectionAccess().getGroup_6_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2728:1: ( rule__SubSection__Group_6_0__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2728:2: rule__SubSection__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6_0__0_in_rule__SubSection__Group_6__0__Impl5624);
            rule__SubSection__Group_6_0__0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__0__Impl


    // $ANTLR start rule__SubSection__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2738:1: rule__SubSection__Group_6__1 : rule__SubSection__Group_6__1__Impl ;
    public final void rule__SubSection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2742:1: ( rule__SubSection__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2743:2: rule__SubSection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6__1__Impl_in_rule__SubSection__Group_6__15654);
            rule__SubSection__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__1


    // $ANTLR start rule__SubSection__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2749:1: rule__SubSection__Group_6__1__Impl : ( ( rule__SubSection__ContentsAssignment_6_1 )* ) ;
    public final void rule__SubSection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2753:1: ( ( ( rule__SubSection__ContentsAssignment_6_1 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2754:1: ( ( rule__SubSection__ContentsAssignment_6_1 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2754:1: ( ( rule__SubSection__ContentsAssignment_6_1 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2755:1: ( rule__SubSection__ContentsAssignment_6_1 )*
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2756:1: ( rule__SubSection__ContentsAssignment_6_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_MULTI_NL) ) {
                    int LA37_1 = input.LA(2);

                    if ( ((LA37_1>=RULE_ID && LA37_1<=RULE_ANY_OTHER)||(LA37_1>=9 && LA37_1<=11)||(LA37_1>=19 && LA37_1<=23)||(LA37_1>=25 && LA37_1<=28)) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2756:2: rule__SubSection__ContentsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_6_1_in_rule__SubSection__Group_6__1__Impl5681);
            	    rule__SubSection__ContentsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6__1__Impl


    // $ANTLR start rule__SubSection__Group_6_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2770:1: rule__SubSection__Group_6_0__0 : rule__SubSection__Group_6_0__0__Impl rule__SubSection__Group_6_0__1 ;
    public final void rule__SubSection__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2774:1: ( rule__SubSection__Group_6_0__0__Impl rule__SubSection__Group_6_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2775:2: rule__SubSection__Group_6_0__0__Impl rule__SubSection__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6_0__0__Impl_in_rule__SubSection__Group_6_0__05716);
            rule__SubSection__Group_6_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_6_0__1_in_rule__SubSection__Group_6_0__05719);
            rule__SubSection__Group_6_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6_0__0


    // $ANTLR start rule__SubSection__Group_6_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2782:1: rule__SubSection__Group_6_0__0__Impl : ( ( rule__SubSection__ContentsAssignment_6_0_0 ) ) ;
    public final void rule__SubSection__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2786:1: ( ( ( rule__SubSection__ContentsAssignment_6_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2787:1: ( ( rule__SubSection__ContentsAssignment_6_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2787:1: ( ( rule__SubSection__ContentsAssignment_6_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2788:1: ( rule__SubSection__ContentsAssignment_6_0_0 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_6_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2789:1: ( rule__SubSection__ContentsAssignment_6_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2789:2: rule__SubSection__ContentsAssignment_6_0_0
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_6_0_0_in_rule__SubSection__Group_6_0__0__Impl5746);
            rule__SubSection__ContentsAssignment_6_0_0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6_0__0__Impl


    // $ANTLR start rule__SubSection__Group_6_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2799:1: rule__SubSection__Group_6_0__1 : rule__SubSection__Group_6_0__1__Impl ;
    public final void rule__SubSection__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2803:1: ( rule__SubSection__Group_6_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2804:2: rule__SubSection__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_6_0__1__Impl_in_rule__SubSection__Group_6_0__15776);
            rule__SubSection__Group_6_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6_0__1


    // $ANTLR start rule__SubSection__Group_6_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2810:1: rule__SubSection__Group_6_0__1__Impl : ( ( rule__SubSection__ContentsAssignment_6_0_1 ) ) ;
    public final void rule__SubSection__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2814:1: ( ( ( rule__SubSection__ContentsAssignment_6_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2815:1: ( ( rule__SubSection__ContentsAssignment_6_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2815:1: ( ( rule__SubSection__ContentsAssignment_6_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2816:1: ( rule__SubSection__ContentsAssignment_6_0_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_6_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2817:1: ( rule__SubSection__ContentsAssignment_6_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2817:2: rule__SubSection__ContentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_6_0_1_in_rule__SubSection__Group_6_0__1__Impl5803);
            rule__SubSection__ContentsAssignment_6_0_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_6_0__1__Impl


    // $ANTLR start rule__SubSection__Group_7__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2831:1: rule__SubSection__Group_7__0 : rule__SubSection__Group_7__0__Impl rule__SubSection__Group_7__1 ;
    public final void rule__SubSection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2835:1: ( rule__SubSection__Group_7__0__Impl rule__SubSection__Group_7__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2836:2: rule__SubSection__Group_7__0__Impl rule__SubSection__Group_7__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_7__0__Impl_in_rule__SubSection__Group_7__05837);
            rule__SubSection__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_7__1_in_rule__SubSection__Group_7__05840);
            rule__SubSection__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_7__0


    // $ANTLR start rule__SubSection__Group_7__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2843:1: rule__SubSection__Group_7__0__Impl : ( ( rule__SubSection__ContentsAssignment_7_0 )? ) ;
    public final void rule__SubSection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2847:1: ( ( ( rule__SubSection__ContentsAssignment_7_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2848:1: ( ( rule__SubSection__ContentsAssignment_7_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2848:1: ( ( rule__SubSection__ContentsAssignment_7_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2849:1: ( rule__SubSection__ContentsAssignment_7_0 )?
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_7_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2850:1: ( rule__SubSection__ContentsAssignment_7_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_MULTI_NL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2850:2: rule__SubSection__ContentsAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_7_0_in_rule__SubSection__Group_7__0__Impl5867);
                    rule__SubSection__ContentsAssignment_7_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_7__0__Impl


    // $ANTLR start rule__SubSection__Group_7__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2860:1: rule__SubSection__Group_7__1 : rule__SubSection__Group_7__1__Impl ;
    public final void rule__SubSection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2864:1: ( rule__SubSection__Group_7__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2865:2: rule__SubSection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_7__1__Impl_in_rule__SubSection__Group_7__15898);
            rule__SubSection__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_7__1


    // $ANTLR start rule__SubSection__Group_7__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2871:1: rule__SubSection__Group_7__1__Impl : ( ( rule__SubSection__ContentsAssignment_7_1 ) ) ;
    public final void rule__SubSection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2875:1: ( ( ( rule__SubSection__ContentsAssignment_7_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2876:1: ( ( rule__SubSection__ContentsAssignment_7_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2876:1: ( ( rule__SubSection__ContentsAssignment_7_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2877:1: ( rule__SubSection__ContentsAssignment_7_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_7_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2878:1: ( rule__SubSection__ContentsAssignment_7_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2878:2: rule__SubSection__ContentsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_7_1_in_rule__SubSection__Group_7__1__Impl5925);
            rule__SubSection__ContentsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_7__1__Impl


    // $ANTLR start rule__Section3__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2892:1: rule__Section3__Group__0 : rule__Section3__Group__0__Impl rule__Section3__Group__1 ;
    public final void rule__Section3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2896:1: ( rule__Section3__Group__0__Impl rule__Section3__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2897:2: rule__Section3__Group__0__Impl rule__Section3__Group__1
            {
            pushFollow(FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05959);
            rule__Section3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05962);
            rule__Section3__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__0


    // $ANTLR start rule__Section3__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2904:1: rule__Section3__Group__0__Impl : ( '\\\\section3' ) ;
    public final void rule__Section3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2908:1: ( ( '\\\\section3' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2909:1: ( '\\\\section3' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2909:1: ( '\\\\section3' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2910:1: '\\\\section3'
            {
             before(grammarAccess.getSection3Access().getSection3Keyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Section3__Group__0__Impl5990); 
             after(grammarAccess.getSection3Access().getSection3Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__0__Impl


    // $ANTLR start rule__Section3__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2923:1: rule__Section3__Group__1 : rule__Section3__Group__1__Impl rule__Section3__Group__2 ;
    public final void rule__Section3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2927:1: ( rule__Section3__Group__1__Impl rule__Section3__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2928:2: rule__Section3__Group__1__Impl rule__Section3__Group__2
            {
            pushFollow(FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16021);
            rule__Section3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16024);
            rule__Section3__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__1


    // $ANTLR start rule__Section3__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2935:1: rule__Section3__Group__1__Impl : ( ( rule__Section3__Group_1__0 )? ) ;
    public final void rule__Section3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2939:1: ( ( ( rule__Section3__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2940:1: ( ( rule__Section3__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2940:1: ( ( rule__Section3__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2941:1: ( rule__Section3__Group_1__0 )?
            {
             before(grammarAccess.getSection3Access().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2942:1: ( rule__Section3__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==11) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2942:2: rule__Section3__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_1__0_in_rule__Section3__Group__1__Impl6051);
                    rule__Section3__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection3Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__1__Impl


    // $ANTLR start rule__Section3__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2952:1: rule__Section3__Group__2 : rule__Section3__Group__2__Impl rule__Section3__Group__3 ;
    public final void rule__Section3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2956:1: ( rule__Section3__Group__2__Impl rule__Section3__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2957:2: rule__Section3__Group__2__Impl rule__Section3__Group__3
            {
            pushFollow(FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26082);
            rule__Section3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26085);
            rule__Section3__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__2


    // $ANTLR start rule__Section3__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2964:1: rule__Section3__Group__2__Impl : ( '[' ) ;
    public final void rule__Section3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2968:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2969:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2969:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2970:1: '['
            {
             before(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Section3__Group__2__Impl6113); 
             after(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__2__Impl


    // $ANTLR start rule__Section3__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2983:1: rule__Section3__Group__3 : rule__Section3__Group__3__Impl rule__Section3__Group__4 ;
    public final void rule__Section3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2987:1: ( rule__Section3__Group__3__Impl rule__Section3__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2988:2: rule__Section3__Group__3__Impl rule__Section3__Group__4
            {
            pushFollow(FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36144);
            rule__Section3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36147);
            rule__Section3__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__3


    // $ANTLR start rule__Section3__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2995:1: rule__Section3__Group__3__Impl : ( ( rule__Section3__TitleAssignment_3 ) ) ;
    public final void rule__Section3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2999:1: ( ( ( rule__Section3__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3000:1: ( ( rule__Section3__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3000:1: ( ( rule__Section3__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3001:1: ( rule__Section3__TitleAssignment_3 )
            {
             before(grammarAccess.getSection3Access().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3002:1: ( rule__Section3__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3002:2: rule__Section3__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section3__TitleAssignment_3_in_rule__Section3__Group__3__Impl6174);
            rule__Section3__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__3__Impl


    // $ANTLR start rule__Section3__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3012:1: rule__Section3__Group__4 : rule__Section3__Group__4__Impl rule__Section3__Group__5 ;
    public final void rule__Section3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3016:1: ( rule__Section3__Group__4__Impl rule__Section3__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3017:2: rule__Section3__Group__4__Impl rule__Section3__Group__5
            {
            pushFollow(FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46204);
            rule__Section3__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__5_in_rule__Section3__Group__46207);
            rule__Section3__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__4


    // $ANTLR start rule__Section3__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3024:1: rule__Section3__Group__4__Impl : ( ']' ) ;
    public final void rule__Section3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3028:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3029:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3029:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3030:1: ']'
            {
             before(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Section3__Group__4__Impl6235); 
             after(grammarAccess.getSection3Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__4__Impl


    // $ANTLR start rule__Section3__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3043:1: rule__Section3__Group__5 : rule__Section3__Group__5__Impl rule__Section3__Group__6 ;
    public final void rule__Section3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3047:1: ( rule__Section3__Group__5__Impl rule__Section3__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3048:2: rule__Section3__Group__5__Impl rule__Section3__Group__6
            {
            pushFollow(FOLLOW_rule__Section3__Group__5__Impl_in_rule__Section3__Group__56266);
            rule__Section3__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__6_in_rule__Section3__Group__56269);
            rule__Section3__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__5


    // $ANTLR start rule__Section3__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3055:1: rule__Section3__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Section3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3059:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3060:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3060:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3061:1: ( RULE_WS )*
            {
             before(grammarAccess.getSection3Access().getWSTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3062:1: ( RULE_WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3062:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Section3__Group__5__Impl6297); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__5__Impl


    // $ANTLR start rule__Section3__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3072:1: rule__Section3__Group__6 : rule__Section3__Group__6__Impl rule__Section3__Group__7 ;
    public final void rule__Section3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3076:1: ( rule__Section3__Group__6__Impl rule__Section3__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3077:2: rule__Section3__Group__6__Impl rule__Section3__Group__7
            {
            pushFollow(FOLLOW_rule__Section3__Group__6__Impl_in_rule__Section3__Group__66328);
            rule__Section3__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__7_in_rule__Section3__Group__66331);
            rule__Section3__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__6


    // $ANTLR start rule__Section3__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3084:1: rule__Section3__Group__6__Impl : ( ( rule__Section3__Group_6__0 )? ) ;
    public final void rule__Section3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3088:1: ( ( ( rule__Section3__Group_6__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3089:1: ( ( rule__Section3__Group_6__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3089:1: ( ( rule__Section3__Group_6__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3090:1: ( rule__Section3__Group_6__0 )?
            {
             before(grammarAccess.getSection3Access().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3091:1: ( rule__Section3__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_MULTI_NL) ) {
                int LA41_1 = input.LA(2);

                if ( ((LA41_1>=RULE_ID && LA41_1<=RULE_ANY_OTHER)||(LA41_1>=9 && LA41_1<=11)||(LA41_1>=19 && LA41_1<=23)||(LA41_1>=25 && LA41_1<=28)) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3091:2: rule__Section3__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_6__0_in_rule__Section3__Group__6__Impl6358);
                    rule__Section3__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection3Access().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__6__Impl


    // $ANTLR start rule__Section3__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3101:1: rule__Section3__Group__7 : rule__Section3__Group__7__Impl ;
    public final void rule__Section3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3105:1: ( rule__Section3__Group__7__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3106:2: rule__Section3__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group__7__Impl_in_rule__Section3__Group__76389);
            rule__Section3__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__7


    // $ANTLR start rule__Section3__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3112:1: rule__Section3__Group__7__Impl : ( ( rule__Section3__Group_7__0 )* ) ;
    public final void rule__Section3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3116:1: ( ( ( rule__Section3__Group_7__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3117:1: ( ( rule__Section3__Group_7__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3117:1: ( ( rule__Section3__Group_7__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3118:1: ( rule__Section3__Group_7__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3119:1: ( rule__Section3__Group_7__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_MULTI_NL) ) {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==18) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==18) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3119:2: rule__Section3__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_7__0_in_rule__Section3__Group__7__Impl6416);
            	    rule__Section3__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group__7__Impl


    // $ANTLR start rule__Section3__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3145:1: rule__Section3__Group_1__0 : rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1 ;
    public final void rule__Section3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3149:1: ( rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3150:2: rule__Section3__Group_1__0__Impl rule__Section3__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_1__0__Impl_in_rule__Section3__Group_1__06463);
            rule__Section3__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_1__1_in_rule__Section3__Group_1__06466);
            rule__Section3__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__0


    // $ANTLR start rule__Section3__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3157:1: rule__Section3__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3161:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3162:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3162:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3163:1: ':'
            {
             before(grammarAccess.getSection3Access().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Section3__Group_1__0__Impl6494); 
             after(grammarAccess.getSection3Access().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__0__Impl


    // $ANTLR start rule__Section3__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3176:1: rule__Section3__Group_1__1 : rule__Section3__Group_1__1__Impl ;
    public final void rule__Section3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3180:1: ( rule__Section3__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3181:2: rule__Section3__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_1__1__Impl_in_rule__Section3__Group_1__16525);
            rule__Section3__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__1


    // $ANTLR start rule__Section3__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3187:1: rule__Section3__Group_1__1__Impl : ( ( rule__Section3__NameAssignment_1_1 ) ) ;
    public final void rule__Section3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3191:1: ( ( ( rule__Section3__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3192:1: ( ( rule__Section3__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3192:1: ( ( rule__Section3__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3193:1: ( rule__Section3__NameAssignment_1_1 )
            {
             before(grammarAccess.getSection3Access().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3194:1: ( rule__Section3__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3194:2: rule__Section3__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section3__NameAssignment_1_1_in_rule__Section3__Group_1__1__Impl6552);
            rule__Section3__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_1__1__Impl


    // $ANTLR start rule__Section3__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3208:1: rule__Section3__Group_6__0 : rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1 ;
    public final void rule__Section3__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3212:1: ( rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3213:2: rule__Section3__Group_6__0__Impl rule__Section3__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_6__0__Impl_in_rule__Section3__Group_6__06586);
            rule__Section3__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_6__1_in_rule__Section3__Group_6__06589);
            rule__Section3__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__0


    // $ANTLR start rule__Section3__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3220:1: rule__Section3__Group_6__0__Impl : ( ( rule__Section3__Group_6_0__0 ) ) ;
    public final void rule__Section3__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3224:1: ( ( ( rule__Section3__Group_6_0__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3225:1: ( ( rule__Section3__Group_6_0__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3225:1: ( ( rule__Section3__Group_6_0__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3226:1: ( rule__Section3__Group_6_0__0 )
            {
             before(grammarAccess.getSection3Access().getGroup_6_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3227:1: ( rule__Section3__Group_6_0__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3227:2: rule__Section3__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__Section3__Group_6_0__0_in_rule__Section3__Group_6__0__Impl6616);
            rule__Section3__Group_6_0__0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__0__Impl


    // $ANTLR start rule__Section3__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3237:1: rule__Section3__Group_6__1 : rule__Section3__Group_6__1__Impl ;
    public final void rule__Section3__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3241:1: ( rule__Section3__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3242:2: rule__Section3__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_6__1__Impl_in_rule__Section3__Group_6__16646);
            rule__Section3__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__1


    // $ANTLR start rule__Section3__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3248:1: rule__Section3__Group_6__1__Impl : ( ( rule__Section3__ContentsAssignment_6_1 )* ) ;
    public final void rule__Section3__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3252:1: ( ( ( rule__Section3__ContentsAssignment_6_1 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3253:1: ( ( rule__Section3__ContentsAssignment_6_1 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3253:1: ( ( rule__Section3__ContentsAssignment_6_1 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3254:1: ( rule__Section3__ContentsAssignment_6_1 )*
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3255:1: ( rule__Section3__ContentsAssignment_6_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_MULTI_NL) ) {
                    int LA43_1 = input.LA(2);

                    if ( ((LA43_1>=RULE_ID && LA43_1<=RULE_ANY_OTHER)||(LA43_1>=9 && LA43_1<=11)||(LA43_1>=19 && LA43_1<=23)||(LA43_1>=25 && LA43_1<=28)) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3255:2: rule__Section3__ContentsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Section3__ContentsAssignment_6_1_in_rule__Section3__Group_6__1__Impl6673);
            	    rule__Section3__ContentsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6__1__Impl


    // $ANTLR start rule__Section3__Group_6_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3269:1: rule__Section3__Group_6_0__0 : rule__Section3__Group_6_0__0__Impl rule__Section3__Group_6_0__1 ;
    public final void rule__Section3__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3273:1: ( rule__Section3__Group_6_0__0__Impl rule__Section3__Group_6_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3274:2: rule__Section3__Group_6_0__0__Impl rule__Section3__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_6_0__0__Impl_in_rule__Section3__Group_6_0__06708);
            rule__Section3__Group_6_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_6_0__1_in_rule__Section3__Group_6_0__06711);
            rule__Section3__Group_6_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6_0__0


    // $ANTLR start rule__Section3__Group_6_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3281:1: rule__Section3__Group_6_0__0__Impl : ( ( rule__Section3__ContentsAssignment_6_0_0 ) ) ;
    public final void rule__Section3__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3285:1: ( ( ( rule__Section3__ContentsAssignment_6_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3286:1: ( ( rule__Section3__ContentsAssignment_6_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3286:1: ( ( rule__Section3__ContentsAssignment_6_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3287:1: ( rule__Section3__ContentsAssignment_6_0_0 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_6_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3288:1: ( rule__Section3__ContentsAssignment_6_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3288:2: rule__Section3__ContentsAssignment_6_0_0
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_6_0_0_in_rule__Section3__Group_6_0__0__Impl6738);
            rule__Section3__ContentsAssignment_6_0_0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6_0__0__Impl


    // $ANTLR start rule__Section3__Group_6_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3298:1: rule__Section3__Group_6_0__1 : rule__Section3__Group_6_0__1__Impl ;
    public final void rule__Section3__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3302:1: ( rule__Section3__Group_6_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3303:2: rule__Section3__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_6_0__1__Impl_in_rule__Section3__Group_6_0__16768);
            rule__Section3__Group_6_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6_0__1


    // $ANTLR start rule__Section3__Group_6_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3309:1: rule__Section3__Group_6_0__1__Impl : ( ( rule__Section3__ContentsAssignment_6_0_1 ) ) ;
    public final void rule__Section3__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3313:1: ( ( ( rule__Section3__ContentsAssignment_6_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3314:1: ( ( rule__Section3__ContentsAssignment_6_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3314:1: ( ( rule__Section3__ContentsAssignment_6_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3315:1: ( rule__Section3__ContentsAssignment_6_0_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_6_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3316:1: ( rule__Section3__ContentsAssignment_6_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3316:2: rule__Section3__ContentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_6_0_1_in_rule__Section3__Group_6_0__1__Impl6795);
            rule__Section3__ContentsAssignment_6_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_6_0__1__Impl


    // $ANTLR start rule__Section3__Group_7__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3330:1: rule__Section3__Group_7__0 : rule__Section3__Group_7__0__Impl rule__Section3__Group_7__1 ;
    public final void rule__Section3__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3334:1: ( rule__Section3__Group_7__0__Impl rule__Section3__Group_7__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3335:2: rule__Section3__Group_7__0__Impl rule__Section3__Group_7__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_7__0__Impl_in_rule__Section3__Group_7__06829);
            rule__Section3__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_7__1_in_rule__Section3__Group_7__06832);
            rule__Section3__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_7__0


    // $ANTLR start rule__Section3__Group_7__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3342:1: rule__Section3__Group_7__0__Impl : ( ( rule__Section3__ContentsAssignment_7_0 )? ) ;
    public final void rule__Section3__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3346:1: ( ( ( rule__Section3__ContentsAssignment_7_0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3347:1: ( ( rule__Section3__ContentsAssignment_7_0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3347:1: ( ( rule__Section3__ContentsAssignment_7_0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3348:1: ( rule__Section3__ContentsAssignment_7_0 )?
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_7_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3349:1: ( rule__Section3__ContentsAssignment_7_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_MULTI_NL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3349:2: rule__Section3__ContentsAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Section3__ContentsAssignment_7_0_in_rule__Section3__Group_7__0__Impl6859);
                    rule__Section3__ContentsAssignment_7_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection3Access().getContentsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_7__0__Impl


    // $ANTLR start rule__Section3__Group_7__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3359:1: rule__Section3__Group_7__1 : rule__Section3__Group_7__1__Impl ;
    public final void rule__Section3__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3363:1: ( rule__Section3__Group_7__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3364:2: rule__Section3__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_7__1__Impl_in_rule__Section3__Group_7__16890);
            rule__Section3__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_7__1


    // $ANTLR start rule__Section3__Group_7__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:1: rule__Section3__Group_7__1__Impl : ( ( rule__Section3__ContentsAssignment_7_1 ) ) ;
    public final void rule__Section3__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3374:1: ( ( ( rule__Section3__ContentsAssignment_7_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3375:1: ( ( rule__Section3__ContentsAssignment_7_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3375:1: ( ( rule__Section3__ContentsAssignment_7_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3376:1: ( rule__Section3__ContentsAssignment_7_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_7_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3377:1: ( rule__Section3__ContentsAssignment_7_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3377:2: rule__Section3__ContentsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_7_1_in_rule__Section3__Group_7__1__Impl6917);
            rule__Section3__ContentsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_7__1__Impl


    // $ANTLR start rule__Section4__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3391:1: rule__Section4__Group__0 : rule__Section4__Group__0__Impl rule__Section4__Group__1 ;
    public final void rule__Section4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3395:1: ( rule__Section4__Group__0__Impl rule__Section4__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3396:2: rule__Section4__Group__0__Impl rule__Section4__Group__1
            {
            pushFollow(FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06951);
            rule__Section4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06954);
            rule__Section4__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__0


    // $ANTLR start rule__Section4__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3403:1: rule__Section4__Group__0__Impl : ( '\\\\section4' ) ;
    public final void rule__Section4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3407:1: ( ( '\\\\section4' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3408:1: ( '\\\\section4' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3408:1: ( '\\\\section4' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3409:1: '\\\\section4'
            {
             before(grammarAccess.getSection4Access().getSection4Keyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Section4__Group__0__Impl6982); 
             after(grammarAccess.getSection4Access().getSection4Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__0__Impl


    // $ANTLR start rule__Section4__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3422:1: rule__Section4__Group__1 : rule__Section4__Group__1__Impl rule__Section4__Group__2 ;
    public final void rule__Section4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3426:1: ( rule__Section4__Group__1__Impl rule__Section4__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3427:2: rule__Section4__Group__1__Impl rule__Section4__Group__2
            {
            pushFollow(FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__17013);
            rule__Section4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__17016);
            rule__Section4__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__1


    // $ANTLR start rule__Section4__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3434:1: rule__Section4__Group__1__Impl : ( ( rule__Section4__Group_1__0 )? ) ;
    public final void rule__Section4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3438:1: ( ( ( rule__Section4__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3439:1: ( ( rule__Section4__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3439:1: ( ( rule__Section4__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3440:1: ( rule__Section4__Group_1__0 )?
            {
             before(grammarAccess.getSection4Access().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3441:1: ( rule__Section4__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3441:2: rule__Section4__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_1__0_in_rule__Section4__Group__1__Impl7043);
                    rule__Section4__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection4Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__1__Impl


    // $ANTLR start rule__Section4__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3451:1: rule__Section4__Group__2 : rule__Section4__Group__2__Impl rule__Section4__Group__3 ;
    public final void rule__Section4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3455:1: ( rule__Section4__Group__2__Impl rule__Section4__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3456:2: rule__Section4__Group__2__Impl rule__Section4__Group__3
            {
            pushFollow(FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__27074);
            rule__Section4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__27077);
            rule__Section4__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__2


    // $ANTLR start rule__Section4__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3463:1: rule__Section4__Group__2__Impl : ( '[' ) ;
    public final void rule__Section4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3467:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3468:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3468:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3469:1: '['
            {
             before(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Section4__Group__2__Impl7105); 
             after(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__2__Impl


    // $ANTLR start rule__Section4__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3482:1: rule__Section4__Group__3 : rule__Section4__Group__3__Impl rule__Section4__Group__4 ;
    public final void rule__Section4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3486:1: ( rule__Section4__Group__3__Impl rule__Section4__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3487:2: rule__Section4__Group__3__Impl rule__Section4__Group__4
            {
            pushFollow(FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__37136);
            rule__Section4__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__4_in_rule__Section4__Group__37139);
            rule__Section4__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__3


    // $ANTLR start rule__Section4__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3494:1: rule__Section4__Group__3__Impl : ( ( rule__Section4__TitleAssignment_3 ) ) ;
    public final void rule__Section4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3498:1: ( ( ( rule__Section4__TitleAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3499:1: ( ( rule__Section4__TitleAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3499:1: ( ( rule__Section4__TitleAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3500:1: ( rule__Section4__TitleAssignment_3 )
            {
             before(grammarAccess.getSection4Access().getTitleAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3501:1: ( rule__Section4__TitleAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3501:2: rule__Section4__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section4__TitleAssignment_3_in_rule__Section4__Group__3__Impl7166);
            rule__Section4__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__3__Impl


    // $ANTLR start rule__Section4__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3511:1: rule__Section4__Group__4 : rule__Section4__Group__4__Impl rule__Section4__Group__5 ;
    public final void rule__Section4__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3515:1: ( rule__Section4__Group__4__Impl rule__Section4__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3516:2: rule__Section4__Group__4__Impl rule__Section4__Group__5
            {
            pushFollow(FOLLOW_rule__Section4__Group__4__Impl_in_rule__Section4__Group__47196);
            rule__Section4__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__5_in_rule__Section4__Group__47199);
            rule__Section4__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__4


    // $ANTLR start rule__Section4__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3523:1: rule__Section4__Group__4__Impl : ( ']' ) ;
    public final void rule__Section4__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3527:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3528:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3528:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3529:1: ']'
            {
             before(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Section4__Group__4__Impl7227); 
             after(grammarAccess.getSection4Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__4__Impl


    // $ANTLR start rule__Section4__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3542:1: rule__Section4__Group__5 : rule__Section4__Group__5__Impl rule__Section4__Group__6 ;
    public final void rule__Section4__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3546:1: ( rule__Section4__Group__5__Impl rule__Section4__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3547:2: rule__Section4__Group__5__Impl rule__Section4__Group__6
            {
            pushFollow(FOLLOW_rule__Section4__Group__5__Impl_in_rule__Section4__Group__57258);
            rule__Section4__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__6_in_rule__Section4__Group__57261);
            rule__Section4__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__5


    // $ANTLR start rule__Section4__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3554:1: rule__Section4__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Section4__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3558:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3559:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3559:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3560:1: ( RULE_WS )*
            {
             before(grammarAccess.getSection4Access().getWSTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3561:1: ( RULE_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_WS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3561:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Section4__Group__5__Impl7289); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSection4Access().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__5__Impl


    // $ANTLR start rule__Section4__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3571:1: rule__Section4__Group__6 : rule__Section4__Group__6__Impl ;
    public final void rule__Section4__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3575:1: ( rule__Section4__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3576:2: rule__Section4__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group__6__Impl_in_rule__Section4__Group__67320);
            rule__Section4__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__6


    // $ANTLR start rule__Section4__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3582:1: rule__Section4__Group__6__Impl : ( ( rule__Section4__Group_6__0 )? ) ;
    public final void rule__Section4__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3586:1: ( ( ( rule__Section4__Group_6__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3587:1: ( ( rule__Section4__Group_6__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3587:1: ( ( rule__Section4__Group_6__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3588:1: ( rule__Section4__Group_6__0 )?
            {
             before(grammarAccess.getSection4Access().getGroup_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3589:1: ( rule__Section4__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_MULTI_NL) ) {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=RULE_ID && LA47_1<=RULE_ANY_OTHER)||(LA47_1>=9 && LA47_1<=11)||(LA47_1>=19 && LA47_1<=23)||(LA47_1>=25 && LA47_1<=28)) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3589:2: rule__Section4__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_6__0_in_rule__Section4__Group__6__Impl7347);
                    rule__Section4__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSection4Access().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group__6__Impl


    // $ANTLR start rule__Section4__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3613:1: rule__Section4__Group_1__0 : rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1 ;
    public final void rule__Section4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3617:1: ( rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3618:2: rule__Section4__Group_1__0__Impl rule__Section4__Group_1__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_1__0__Impl_in_rule__Section4__Group_1__07392);
            rule__Section4__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_1__1_in_rule__Section4__Group_1__07395);
            rule__Section4__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__0


    // $ANTLR start rule__Section4__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3625:1: rule__Section4__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Section4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3629:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3630:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3630:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3631:1: ':'
            {
             before(grammarAccess.getSection4Access().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Section4__Group_1__0__Impl7423); 
             after(grammarAccess.getSection4Access().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__0__Impl


    // $ANTLR start rule__Section4__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3644:1: rule__Section4__Group_1__1 : rule__Section4__Group_1__1__Impl ;
    public final void rule__Section4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3648:1: ( rule__Section4__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3649:2: rule__Section4__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_1__1__Impl_in_rule__Section4__Group_1__17454);
            rule__Section4__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__1


    // $ANTLR start rule__Section4__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3655:1: rule__Section4__Group_1__1__Impl : ( ( rule__Section4__NameAssignment_1_1 ) ) ;
    public final void rule__Section4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3659:1: ( ( ( rule__Section4__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3660:1: ( ( rule__Section4__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3660:1: ( ( rule__Section4__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3661:1: ( rule__Section4__NameAssignment_1_1 )
            {
             before(grammarAccess.getSection4Access().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3662:1: ( rule__Section4__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3662:2: rule__Section4__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Section4__NameAssignment_1_1_in_rule__Section4__Group_1__1__Impl7481);
            rule__Section4__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_1__1__Impl


    // $ANTLR start rule__Section4__Group_6__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3676:1: rule__Section4__Group_6__0 : rule__Section4__Group_6__0__Impl rule__Section4__Group_6__1 ;
    public final void rule__Section4__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3680:1: ( rule__Section4__Group_6__0__Impl rule__Section4__Group_6__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3681:2: rule__Section4__Group_6__0__Impl rule__Section4__Group_6__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_6__0__Impl_in_rule__Section4__Group_6__07515);
            rule__Section4__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_6__1_in_rule__Section4__Group_6__07518);
            rule__Section4__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6__0


    // $ANTLR start rule__Section4__Group_6__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3688:1: rule__Section4__Group_6__0__Impl : ( ( rule__Section4__Group_6_0__0 ) ) ;
    public final void rule__Section4__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3692:1: ( ( ( rule__Section4__Group_6_0__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3693:1: ( ( rule__Section4__Group_6_0__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3693:1: ( ( rule__Section4__Group_6_0__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3694:1: ( rule__Section4__Group_6_0__0 )
            {
             before(grammarAccess.getSection4Access().getGroup_6_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3695:1: ( rule__Section4__Group_6_0__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3695:2: rule__Section4__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__Section4__Group_6_0__0_in_rule__Section4__Group_6__0__Impl7545);
            rule__Section4__Group_6_0__0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6__0__Impl


    // $ANTLR start rule__Section4__Group_6__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3705:1: rule__Section4__Group_6__1 : rule__Section4__Group_6__1__Impl ;
    public final void rule__Section4__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3709:1: ( rule__Section4__Group_6__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3710:2: rule__Section4__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_6__1__Impl_in_rule__Section4__Group_6__17575);
            rule__Section4__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6__1


    // $ANTLR start rule__Section4__Group_6__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3716:1: rule__Section4__Group_6__1__Impl : ( ( rule__Section4__ContentsAssignment_6_1 )* ) ;
    public final void rule__Section4__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3720:1: ( ( ( rule__Section4__ContentsAssignment_6_1 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3721:1: ( ( rule__Section4__ContentsAssignment_6_1 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3721:1: ( ( rule__Section4__ContentsAssignment_6_1 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3722:1: ( rule__Section4__ContentsAssignment_6_1 )*
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_6_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3723:1: ( rule__Section4__ContentsAssignment_6_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_MULTI_NL) ) {
                    int LA48_2 = input.LA(2);

                    if ( ((LA48_2>=RULE_ID && LA48_2<=RULE_ANY_OTHER)||(LA48_2>=9 && LA48_2<=11)||(LA48_2>=19 && LA48_2<=23)||(LA48_2>=25 && LA48_2<=28)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3723:2: rule__Section4__ContentsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Section4__ContentsAssignment_6_1_in_rule__Section4__Group_6__1__Impl7602);
            	    rule__Section4__ContentsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getSection4Access().getContentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6__1__Impl


    // $ANTLR start rule__Section4__Group_6_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3737:1: rule__Section4__Group_6_0__0 : rule__Section4__Group_6_0__0__Impl rule__Section4__Group_6_0__1 ;
    public final void rule__Section4__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3741:1: ( rule__Section4__Group_6_0__0__Impl rule__Section4__Group_6_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3742:2: rule__Section4__Group_6_0__0__Impl rule__Section4__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_6_0__0__Impl_in_rule__Section4__Group_6_0__07637);
            rule__Section4__Group_6_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_6_0__1_in_rule__Section4__Group_6_0__07640);
            rule__Section4__Group_6_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6_0__0


    // $ANTLR start rule__Section4__Group_6_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3749:1: rule__Section4__Group_6_0__0__Impl : ( ( rule__Section4__ContentsAssignment_6_0_0 ) ) ;
    public final void rule__Section4__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3753:1: ( ( ( rule__Section4__ContentsAssignment_6_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3754:1: ( ( rule__Section4__ContentsAssignment_6_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3754:1: ( ( rule__Section4__ContentsAssignment_6_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3755:1: ( rule__Section4__ContentsAssignment_6_0_0 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_6_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3756:1: ( rule__Section4__ContentsAssignment_6_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3756:2: rule__Section4__ContentsAssignment_6_0_0
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_6_0_0_in_rule__Section4__Group_6_0__0__Impl7667);
            rule__Section4__ContentsAssignment_6_0_0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getContentsAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6_0__0__Impl


    // $ANTLR start rule__Section4__Group_6_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3766:1: rule__Section4__Group_6_0__1 : rule__Section4__Group_6_0__1__Impl ;
    public final void rule__Section4__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3770:1: ( rule__Section4__Group_6_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3771:2: rule__Section4__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_6_0__1__Impl_in_rule__Section4__Group_6_0__17697);
            rule__Section4__Group_6_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6_0__1


    // $ANTLR start rule__Section4__Group_6_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3777:1: rule__Section4__Group_6_0__1__Impl : ( ( rule__Section4__ContentsAssignment_6_0_1 ) ) ;
    public final void rule__Section4__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3781:1: ( ( ( rule__Section4__ContentsAssignment_6_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3782:1: ( ( rule__Section4__ContentsAssignment_6_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3782:1: ( ( rule__Section4__ContentsAssignment_6_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3783:1: ( rule__Section4__ContentsAssignment_6_0_1 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_6_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3784:1: ( rule__Section4__ContentsAssignment_6_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3784:2: rule__Section4__ContentsAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_6_0_1_in_rule__Section4__Group_6_0__1__Impl7724);
            rule__Section4__ContentsAssignment_6_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getContentsAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_6_0__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3798:1: rule__TextOrMarkup__Group__0 : rule__TextOrMarkup__Group__0__Impl rule__TextOrMarkup__Group__1 ;
    public final void rule__TextOrMarkup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3802:1: ( rule__TextOrMarkup__Group__0__Impl rule__TextOrMarkup__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3803:2: rule__TextOrMarkup__Group__0__Impl rule__TextOrMarkup__Group__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group__0__Impl_in_rule__TextOrMarkup__Group__07758);
            rule__TextOrMarkup__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group__1_in_rule__TextOrMarkup__Group__07761);
            rule__TextOrMarkup__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group__0


    // $ANTLR start rule__TextOrMarkup__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3810:1: rule__TextOrMarkup__Group__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0 ) ) ;
    public final void rule__TextOrMarkup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3814:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3815:1: ( ( rule__TextOrMarkup__ContentsAssignment_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3815:1: ( ( rule__TextOrMarkup__ContentsAssignment_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3816:1: ( rule__TextOrMarkup__ContentsAssignment_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3817:1: ( rule__TextOrMarkup__ContentsAssignment_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3817:2: rule__TextOrMarkup__ContentsAssignment_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_in_rule__TextOrMarkup__Group__0__Impl7788);
            rule__TextOrMarkup__ContentsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3827:1: rule__TextOrMarkup__Group__1 : rule__TextOrMarkup__Group__1__Impl ;
    public final void rule__TextOrMarkup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3831:1: ( rule__TextOrMarkup__Group__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3832:2: rule__TextOrMarkup__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group__1__Impl_in_rule__TextOrMarkup__Group__17818);
            rule__TextOrMarkup__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group__1


    // $ANTLR start rule__TextOrMarkup__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3838:1: rule__TextOrMarkup__Group__1__Impl : ( ( rule__TextOrMarkup__Alternatives_1 ) ) ;
    public final void rule__TextOrMarkup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3842:1: ( ( ( rule__TextOrMarkup__Alternatives_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3843:1: ( ( rule__TextOrMarkup__Alternatives_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3843:1: ( ( rule__TextOrMarkup__Alternatives_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3844:1: ( rule__TextOrMarkup__Alternatives_1 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getAlternatives_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3845:1: ( rule__TextOrMarkup__Alternatives_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3845:2: rule__TextOrMarkup__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Alternatives_1_in_rule__TextOrMarkup__Group__1__Impl7845);
            rule__TextOrMarkup__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3859:1: rule__TextOrMarkup__Group_1_0__0 : rule__TextOrMarkup__Group_1_0__0__Impl rule__TextOrMarkup__Group_1_0__1 ;
    public final void rule__TextOrMarkup__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3863:1: ( rule__TextOrMarkup__Group_1_0__0__Impl rule__TextOrMarkup__Group_1_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3864:2: rule__TextOrMarkup__Group_1_0__0__Impl rule__TextOrMarkup__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0__0__Impl_in_rule__TextOrMarkup__Group_1_0__07879);
            rule__TextOrMarkup__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0__1_in_rule__TextOrMarkup__Group_1_0__07882);
            rule__TextOrMarkup__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0__0


    // $ANTLR start rule__TextOrMarkup__Group_1_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3871:1: rule__TextOrMarkup__Group_1_0__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3875:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3876:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3876:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3877:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3878:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3878:2: rule__TextOrMarkup__ContentsAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_0_in_rule__TextOrMarkup__Group_1_0__0__Impl7909);
            rule__TextOrMarkup__ContentsAssignment_1_0_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3888:1: rule__TextOrMarkup__Group_1_0__1 : rule__TextOrMarkup__Group_1_0__1__Impl ;
    public final void rule__TextOrMarkup__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3892:1: ( rule__TextOrMarkup__Group_1_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3893:2: rule__TextOrMarkup__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0__1__Impl_in_rule__TextOrMarkup__Group_1_0__17939);
            rule__TextOrMarkup__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0__1


    // $ANTLR start rule__TextOrMarkup__Group_1_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3899:1: rule__TextOrMarkup__Group_1_0__1__Impl : ( ( rule__TextOrMarkup__Group_1_0_1__0 )* ) ;
    public final void rule__TextOrMarkup__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3903:1: ( ( ( rule__TextOrMarkup__Group_1_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3904:1: ( ( rule__TextOrMarkup__Group_1_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3904:1: ( ( rule__TextOrMarkup__Group_1_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3905:1: ( rule__TextOrMarkup__Group_1_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup_1_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3906:1: ( rule__TextOrMarkup__Group_1_0_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=19 && LA49_0<=23)||(LA49_0>=25 && LA49_0<=28)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3906:2: rule__TextOrMarkup__Group_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0_1__0_in_rule__TextOrMarkup__Group_1_0__1__Impl7966);
            	    rule__TextOrMarkup__Group_1_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getTextOrMarkupAccess().getGroup_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3920:1: rule__TextOrMarkup__Group_1_0_1__0 : rule__TextOrMarkup__Group_1_0_1__0__Impl rule__TextOrMarkup__Group_1_0_1__1 ;
    public final void rule__TextOrMarkup__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3924:1: ( rule__TextOrMarkup__Group_1_0_1__0__Impl rule__TextOrMarkup__Group_1_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3925:2: rule__TextOrMarkup__Group_1_0_1__0__Impl rule__TextOrMarkup__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0_1__0__Impl_in_rule__TextOrMarkup__Group_1_0_1__08001);
            rule__TextOrMarkup__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0_1__1_in_rule__TextOrMarkup__Group_1_0_1__08004);
            rule__TextOrMarkup__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0_1__0


    // $ANTLR start rule__TextOrMarkup__Group_1_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3932:1: rule__TextOrMarkup__Group_1_0_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3936:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3937:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3937:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3938:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3939:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3939:2: rule__TextOrMarkup__ContentsAssignment_1_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_1_0_in_rule__TextOrMarkup__Group_1_0_1__0__Impl8031);
            rule__TextOrMarkup__ContentsAssignment_1_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3949:1: rule__TextOrMarkup__Group_1_0_1__1 : rule__TextOrMarkup__Group_1_0_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3953:1: ( rule__TextOrMarkup__Group_1_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3954:2: rule__TextOrMarkup__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_0_1__1__Impl_in_rule__TextOrMarkup__Group_1_0_1__18061);
            rule__TextOrMarkup__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0_1__1


    // $ANTLR start rule__TextOrMarkup__Group_1_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3960:1: rule__TextOrMarkup__Group_1_0_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3964:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3965:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3965:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3966:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3967:1: ( rule__TextOrMarkup__ContentsAssignment_1_0_1_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_ANY_OTHER)||(LA50_0>=9 && LA50_0<=11)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3967:2: rule__TextOrMarkup__ContentsAssignment_1_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_1_1_in_rule__TextOrMarkup__Group_1_0_1__1__Impl8088);
                    rule__TextOrMarkup__ContentsAssignment_1_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_0_1__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3981:1: rule__TextOrMarkup__Group_1_1__0 : rule__TextOrMarkup__Group_1_1__0__Impl rule__TextOrMarkup__Group_1_1__1 ;
    public final void rule__TextOrMarkup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3985:1: ( rule__TextOrMarkup__Group_1_1__0__Impl rule__TextOrMarkup__Group_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3986:2: rule__TextOrMarkup__Group_1_1__0__Impl rule__TextOrMarkup__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_1__0__Impl_in_rule__TextOrMarkup__Group_1_1__08123);
            rule__TextOrMarkup__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_1__1_in_rule__TextOrMarkup__Group_1_1__08126);
            rule__TextOrMarkup__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_1__0


    // $ANTLR start rule__TextOrMarkup__Group_1_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3993:1: rule__TextOrMarkup__Group_1_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3997:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3998:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3998:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3999:1: ( rule__TextOrMarkup__ContentsAssignment_1_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4000:1: ( rule__TextOrMarkup__ContentsAssignment_1_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4000:2: rule__TextOrMarkup__ContentsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_0_in_rule__TextOrMarkup__Group_1_1__0__Impl8153);
            rule__TextOrMarkup__ContentsAssignment_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4010:1: rule__TextOrMarkup__Group_1_1__1 : rule__TextOrMarkup__Group_1_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4014:1: ( rule__TextOrMarkup__Group_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4015:2: rule__TextOrMarkup__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1_1__1__Impl_in_rule__TextOrMarkup__Group_1_1__18183);
            rule__TextOrMarkup__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_1__1


    // $ANTLR start rule__TextOrMarkup__Group_1_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4021:1: rule__TextOrMarkup__Group_1_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4025:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4026:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4026:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4027:1: ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4028:1: ( rule__TextOrMarkup__ContentsAssignment_1_1_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_ANY_OTHER)||(LA51_0>=9 && LA51_0<=11)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4028:2: rule__TextOrMarkup__ContentsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_1_in_rule__TextOrMarkup__Group_1_1__1__Impl8210);
                    rule__TextOrMarkup__ContentsAssignment_1_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1_1__1__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4042:1: rule__TextOrMarkupLine__Group_0__0 : rule__TextOrMarkupLine__Group_0__0__Impl rule__TextOrMarkupLine__Group_0__1 ;
    public final void rule__TextOrMarkupLine__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4046:1: ( rule__TextOrMarkupLine__Group_0__0__Impl rule__TextOrMarkupLine__Group_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4047:2: rule__TextOrMarkupLine__Group_0__0__Impl rule__TextOrMarkupLine__Group_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0__0__Impl_in_rule__TextOrMarkupLine__Group_0__08245);
            rule__TextOrMarkupLine__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0__1_in_rule__TextOrMarkupLine__Group_0__08248);
            rule__TextOrMarkupLine__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0__0


    // $ANTLR start rule__TextOrMarkupLine__Group_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4054:1: rule__TextOrMarkupLine__Group_0__0__Impl : ( ( rule__TextOrMarkupLine__ContentsAssignment_0_0 ) ) ;
    public final void rule__TextOrMarkupLine__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4058:1: ( ( ( rule__TextOrMarkupLine__ContentsAssignment_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4059:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4059:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4060:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_0 )
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4061:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4061:2: rule__TextOrMarkupLine__ContentsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_0_in_rule__TextOrMarkupLine__Group_0__0__Impl8275);
            rule__TextOrMarkupLine__ContentsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0__0__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4071:1: rule__TextOrMarkupLine__Group_0__1 : rule__TextOrMarkupLine__Group_0__1__Impl ;
    public final void rule__TextOrMarkupLine__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4075:1: ( rule__TextOrMarkupLine__Group_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4076:2: rule__TextOrMarkupLine__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0__1__Impl_in_rule__TextOrMarkupLine__Group_0__18305);
            rule__TextOrMarkupLine__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0__1


    // $ANTLR start rule__TextOrMarkupLine__Group_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4082:1: rule__TextOrMarkupLine__Group_0__1__Impl : ( ( rule__TextOrMarkupLine__Group_0_1__0 )* ) ;
    public final void rule__TextOrMarkupLine__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4086:1: ( ( ( rule__TextOrMarkupLine__Group_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4087:1: ( ( rule__TextOrMarkupLine__Group_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4087:1: ( ( rule__TextOrMarkupLine__Group_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4088:1: ( rule__TextOrMarkupLine__Group_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getGroup_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4089:1: ( rule__TextOrMarkupLine__Group_0_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=19 && LA52_0<=23)||(LA52_0>=25 && LA52_0<=28)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4089:2: rule__TextOrMarkupLine__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0_1__0_in_rule__TextOrMarkupLine__Group_0__1__Impl8332);
            	    rule__TextOrMarkupLine__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getTextOrMarkupLineAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0__1__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4103:1: rule__TextOrMarkupLine__Group_0_1__0 : rule__TextOrMarkupLine__Group_0_1__0__Impl rule__TextOrMarkupLine__Group_0_1__1 ;
    public final void rule__TextOrMarkupLine__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4107:1: ( rule__TextOrMarkupLine__Group_0_1__0__Impl rule__TextOrMarkupLine__Group_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4108:2: rule__TextOrMarkupLine__Group_0_1__0__Impl rule__TextOrMarkupLine__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0_1__0__Impl_in_rule__TextOrMarkupLine__Group_0_1__08367);
            rule__TextOrMarkupLine__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0_1__1_in_rule__TextOrMarkupLine__Group_0_1__08370);
            rule__TextOrMarkupLine__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0_1__0


    // $ANTLR start rule__TextOrMarkupLine__Group_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4115:1: rule__TextOrMarkupLine__Group_0_1__0__Impl : ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 ) ) ;
    public final void rule__TextOrMarkupLine__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4119:1: ( ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4121:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4122:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4122:2: rule__TextOrMarkupLine__ContentsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_1_0_in_rule__TextOrMarkupLine__Group_0_1__0__Impl8397);
            rule__TextOrMarkupLine__ContentsAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0_1__0__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4132:1: rule__TextOrMarkupLine__Group_0_1__1 : rule__TextOrMarkupLine__Group_0_1__1__Impl ;
    public final void rule__TextOrMarkupLine__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4136:1: ( rule__TextOrMarkupLine__Group_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4137:2: rule__TextOrMarkupLine__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_0_1__1__Impl_in_rule__TextOrMarkupLine__Group_0_1__18427);
            rule__TextOrMarkupLine__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0_1__1


    // $ANTLR start rule__TextOrMarkupLine__Group_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4143:1: rule__TextOrMarkupLine__Group_0_1__1__Impl : ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )? ) ;
    public final void rule__TextOrMarkupLine__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4147:1: ( ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4148:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4148:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4149:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4150:1: ( rule__TextOrMarkupLine__ContentsAssignment_0_1_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_ANY_OTHER)||(LA53_0>=9 && LA53_0<=11)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4150:2: rule__TextOrMarkupLine__ContentsAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_1_1_in_rule__TextOrMarkupLine__Group_0_1__1__Impl8454);
                    rule__TextOrMarkupLine__ContentsAssignment_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_0_1__1__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4164:1: rule__TextOrMarkupLine__Group_1__0 : rule__TextOrMarkupLine__Group_1__0__Impl rule__TextOrMarkupLine__Group_1__1 ;
    public final void rule__TextOrMarkupLine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4168:1: ( rule__TextOrMarkupLine__Group_1__0__Impl rule__TextOrMarkupLine__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4169:2: rule__TextOrMarkupLine__Group_1__0__Impl rule__TextOrMarkupLine__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_1__0__Impl_in_rule__TextOrMarkupLine__Group_1__08489);
            rule__TextOrMarkupLine__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_1__1_in_rule__TextOrMarkupLine__Group_1__08492);
            rule__TextOrMarkupLine__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_1__0


    // $ANTLR start rule__TextOrMarkupLine__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4176:1: rule__TextOrMarkupLine__Group_1__0__Impl : ( ( rule__TextOrMarkupLine__ContentsAssignment_1_0 ) ) ;
    public final void rule__TextOrMarkupLine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4180:1: ( ( ( rule__TextOrMarkupLine__ContentsAssignment_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4181:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4181:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4182:1: ( rule__TextOrMarkupLine__ContentsAssignment_1_0 )
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4183:1: ( rule__TextOrMarkupLine__ContentsAssignment_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4183:2: rule__TextOrMarkupLine__ContentsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_1_0_in_rule__TextOrMarkupLine__Group_1__0__Impl8519);
            rule__TextOrMarkupLine__ContentsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_1__0__Impl


    // $ANTLR start rule__TextOrMarkupLine__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4193:1: rule__TextOrMarkupLine__Group_1__1 : rule__TextOrMarkupLine__Group_1__1__Impl ;
    public final void rule__TextOrMarkupLine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4197:1: ( rule__TextOrMarkupLine__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4198:2: rule__TextOrMarkupLine__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkupLine__Group_1__1__Impl_in_rule__TextOrMarkupLine__Group_1__18549);
            rule__TextOrMarkupLine__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_1__1


    // $ANTLR start rule__TextOrMarkupLine__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4204:1: rule__TextOrMarkupLine__Group_1__1__Impl : ( ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )? ) ;
    public final void rule__TextOrMarkupLine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4208:1: ( ( ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: ( ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4210:1: ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4211:1: ( rule__TextOrMarkupLine__ContentsAssignment_1_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_ANY_OTHER)||(LA54_0>=9 && LA54_0<=11)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4211:2: rule__TextOrMarkupLine__ContentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_1_1_in_rule__TextOrMarkupLine__Group_1__1__Impl8576);
                    rule__TextOrMarkupLine__ContentsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__Group_1__1__Impl


    // $ANTLR start rule__Emphasize__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4225:1: rule__Emphasize__Group__0 : rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 ;
    public final void rule__Emphasize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4229:1: ( rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4230:2: rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__08611);
            rule__Emphasize__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__08614);
            rule__Emphasize__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__0


    // $ANTLR start rule__Emphasize__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4237:1: rule__Emphasize__Group__0__Impl : ( '\\\\emph' ) ;
    public final void rule__Emphasize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4241:1: ( ( '\\\\emph' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4242:1: ( '\\\\emph' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4242:1: ( '\\\\emph' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4243:1: '\\\\emph'
            {
             before(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Emphasize__Group__0__Impl8642); 
             after(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__0__Impl


    // $ANTLR start rule__Emphasize__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4256:1: rule__Emphasize__Group__1 : rule__Emphasize__Group__1__Impl ;
    public final void rule__Emphasize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4260:1: ( rule__Emphasize__Group__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4261:2: rule__Emphasize__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__18673);
            rule__Emphasize__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__1


    // $ANTLR start rule__Emphasize__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4267:1: rule__Emphasize__Group__1__Impl : ( ( rule__Emphasize__Group_1__0 ) ) ;
    public final void rule__Emphasize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4271:1: ( ( ( rule__Emphasize__Group_1__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4272:1: ( ( rule__Emphasize__Group_1__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4272:1: ( ( rule__Emphasize__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4273:1: ( rule__Emphasize__Group_1__0 )
            {
             before(grammarAccess.getEmphasizeAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4274:1: ( rule__Emphasize__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4274:2: rule__Emphasize__Group_1__0
            {
            pushFollow(FOLLOW_rule__Emphasize__Group_1__0_in_rule__Emphasize__Group__1__Impl8700);
            rule__Emphasize__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__1__Impl


    // $ANTLR start rule__Emphasize__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4288:1: rule__Emphasize__Group_1__0 : rule__Emphasize__Group_1__0__Impl rule__Emphasize__Group_1__1 ;
    public final void rule__Emphasize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4292:1: ( rule__Emphasize__Group_1__0__Impl rule__Emphasize__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4293:2: rule__Emphasize__Group_1__0__Impl rule__Emphasize__Group_1__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group_1__0__Impl_in_rule__Emphasize__Group_1__08734);
            rule__Emphasize__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group_1__1_in_rule__Emphasize__Group_1__08737);
            rule__Emphasize__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__0


    // $ANTLR start rule__Emphasize__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4300:1: rule__Emphasize__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Emphasize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4304:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4305:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4305:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4306:1: '['
            {
             before(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Emphasize__Group_1__0__Impl8765); 
             after(grammarAccess.getEmphasizeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__0__Impl


    // $ANTLR start rule__Emphasize__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4319:1: rule__Emphasize__Group_1__1 : rule__Emphasize__Group_1__1__Impl rule__Emphasize__Group_1__2 ;
    public final void rule__Emphasize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4323:1: ( rule__Emphasize__Group_1__1__Impl rule__Emphasize__Group_1__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4324:2: rule__Emphasize__Group_1__1__Impl rule__Emphasize__Group_1__2
            {
            pushFollow(FOLLOW_rule__Emphasize__Group_1__1__Impl_in_rule__Emphasize__Group_1__18796);
            rule__Emphasize__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group_1__2_in_rule__Emphasize__Group_1__18799);
            rule__Emphasize__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__1


    // $ANTLR start rule__Emphasize__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4331:1: rule__Emphasize__Group_1__1__Impl : ( ( rule__Emphasize__ContentsAssignment_1_1 ) ) ;
    public final void rule__Emphasize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4335:1: ( ( ( rule__Emphasize__ContentsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4336:1: ( ( rule__Emphasize__ContentsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4336:1: ( ( rule__Emphasize__ContentsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4337:1: ( rule__Emphasize__ContentsAssignment_1_1 )
            {
             before(grammarAccess.getEmphasizeAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4338:1: ( rule__Emphasize__ContentsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4338:2: rule__Emphasize__ContentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Emphasize__ContentsAssignment_1_1_in_rule__Emphasize__Group_1__1__Impl8826);
            rule__Emphasize__ContentsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getContentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__1__Impl


    // $ANTLR start rule__Emphasize__Group_1__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4348:1: rule__Emphasize__Group_1__2 : rule__Emphasize__Group_1__2__Impl ;
    public final void rule__Emphasize__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4352:1: ( rule__Emphasize__Group_1__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4353:2: rule__Emphasize__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group_1__2__Impl_in_rule__Emphasize__Group_1__28856);
            rule__Emphasize__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__2


    // $ANTLR start rule__Emphasize__Group_1__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4359:1: rule__Emphasize__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Emphasize__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4363:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4364:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4364:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4365:1: ']'
            {
             before(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,14,FOLLOW_14_in_rule__Emphasize__Group_1__2__Impl8884); 
             after(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group_1__2__Impl


    // $ANTLR start rule__Anchor__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4384:1: rule__Anchor__Group__0 : rule__Anchor__Group__0__Impl rule__Anchor__Group__1 ;
    public final void rule__Anchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4388:1: ( rule__Anchor__Group__0__Impl rule__Anchor__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4389:2: rule__Anchor__Group__0__Impl rule__Anchor__Group__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08921);
            rule__Anchor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08924);
            rule__Anchor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__0


    // $ANTLR start rule__Anchor__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4396:1: rule__Anchor__Group__0__Impl : ( '\\\\a' ) ;
    public final void rule__Anchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4400:1: ( ( '\\\\a' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4401:1: ( '\\\\a' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4401:1: ( '\\\\a' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4402:1: '\\\\a'
            {
             before(grammarAccess.getAnchorAccess().getAKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Anchor__Group__0__Impl8952); 
             after(grammarAccess.getAnchorAccess().getAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__0__Impl


    // $ANTLR start rule__Anchor__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4415:1: rule__Anchor__Group__1 : rule__Anchor__Group__1__Impl rule__Anchor__Group__2 ;
    public final void rule__Anchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4419:1: ( rule__Anchor__Group__1__Impl rule__Anchor__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4420:2: rule__Anchor__Group__1__Impl rule__Anchor__Group__2
            {
            pushFollow(FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18983);
            rule__Anchor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18986);
            rule__Anchor__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__1


    // $ANTLR start rule__Anchor__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4427:1: rule__Anchor__Group__1__Impl : ( ':' ) ;
    public final void rule__Anchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4431:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4432:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4432:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4433:1: ':'
            {
             before(grammarAccess.getAnchorAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Anchor__Group__1__Impl9014); 
             after(grammarAccess.getAnchorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__1__Impl


    // $ANTLR start rule__Anchor__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:1: rule__Anchor__Group__2 : rule__Anchor__Group__2__Impl rule__Anchor__Group__3 ;
    public final void rule__Anchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4450:1: ( rule__Anchor__Group__2__Impl rule__Anchor__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4451:2: rule__Anchor__Group__2__Impl rule__Anchor__Group__3
            {
            pushFollow(FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__29045);
            rule__Anchor__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__3_in_rule__Anchor__Group__29048);
            rule__Anchor__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__2


    // $ANTLR start rule__Anchor__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4458:1: rule__Anchor__Group__2__Impl : ( ( rule__Anchor__NameAssignment_2 ) ) ;
    public final void rule__Anchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4462:1: ( ( ( rule__Anchor__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4463:1: ( ( rule__Anchor__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4463:1: ( ( rule__Anchor__NameAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4464:1: ( rule__Anchor__NameAssignment_2 )
            {
             before(grammarAccess.getAnchorAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4465:1: ( rule__Anchor__NameAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4465:2: rule__Anchor__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Anchor__NameAssignment_2_in_rule__Anchor__Group__2__Impl9075);
            rule__Anchor__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__2__Impl


    // $ANTLR start rule__Anchor__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4475:1: rule__Anchor__Group__3 : rule__Anchor__Group__3__Impl ;
    public final void rule__Anchor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4479:1: ( rule__Anchor__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4480:2: rule__Anchor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group__3__Impl_in_rule__Anchor__Group__39105);
            rule__Anchor__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__3


    // $ANTLR start rule__Anchor__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4486:1: rule__Anchor__Group__3__Impl : ( ( rule__Anchor__Group_3__0 )? ) ;
    public final void rule__Anchor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4490:1: ( ( ( rule__Anchor__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4491:1: ( ( rule__Anchor__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4491:1: ( ( rule__Anchor__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4492:1: ( rule__Anchor__Group_3__0 )?
            {
             before(grammarAccess.getAnchorAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4493:1: ( rule__Anchor__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4493:2: rule__Anchor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Anchor__Group_3__0_in_rule__Anchor__Group__3__Impl9132);
                    rule__Anchor__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnchorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group__3__Impl


    // $ANTLR start rule__Anchor__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4511:1: rule__Anchor__Group_3__0 : rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1 ;
    public final void rule__Anchor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4515:1: ( rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4516:2: rule__Anchor__Group_3__0__Impl rule__Anchor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group_3__0__Impl_in_rule__Anchor__Group_3__09171);
            rule__Anchor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group_3__1_in_rule__Anchor__Group_3__09174);
            rule__Anchor__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__0


    // $ANTLR start rule__Anchor__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4523:1: rule__Anchor__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Anchor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4527:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4528:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4528:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4529:1: '['
            {
             before(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Anchor__Group_3__0__Impl9202); 
             after(grammarAccess.getAnchorAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__0__Impl


    // $ANTLR start rule__Anchor__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4542:1: rule__Anchor__Group_3__1 : rule__Anchor__Group_3__1__Impl ;
    public final void rule__Anchor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4546:1: ( rule__Anchor__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4547:2: rule__Anchor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group_3__1__Impl_in_rule__Anchor__Group_3__19233);
            rule__Anchor__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__1


    // $ANTLR start rule__Anchor__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4553:1: rule__Anchor__Group_3__1__Impl : ( ']' ) ;
    public final void rule__Anchor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4557:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4558:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4558:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4559:1: ']'
            {
             before(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1()); 
            match(input,14,FOLLOW_14_in_rule__Anchor__Group_3__1__Impl9261); 
             after(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__Group_3__1__Impl


    // $ANTLR start rule__Ref__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4576:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4580:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4581:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__09296);
            rule__Ref__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__09299);
            rule__Ref__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__0


    // $ANTLR start rule__Ref__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4588:1: rule__Ref__Group__0__Impl : ( '\\\\ref' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4592:1: ( ( '\\\\ref' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4593:1: ( '\\\\ref' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4593:1: ( '\\\\ref' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4594:1: '\\\\ref'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Ref__Group__0__Impl9327); 
             after(grammarAccess.getRefAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__0__Impl


    // $ANTLR start rule__Ref__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4607:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4612:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__19358);
            rule__Ref__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__19361);
            rule__Ref__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__1


    // $ANTLR start rule__Ref__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4619:1: rule__Ref__Group__1__Impl : ( ':' ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4623:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4624:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4624:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4625:1: ':'
            {
             before(grammarAccess.getRefAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Ref__Group__1__Impl9389); 
             after(grammarAccess.getRefAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__1__Impl


    // $ANTLR start rule__Ref__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4638:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4642:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4643:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__29420);
            rule__Ref__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__29423);
            rule__Ref__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__2


    // $ANTLR start rule__Ref__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4650:1: rule__Ref__Group__2__Impl : ( ( rule__Ref__RefAssignment_2 ) ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4654:1: ( ( ( rule__Ref__RefAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4655:1: ( ( rule__Ref__RefAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4655:1: ( ( rule__Ref__RefAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4656:1: ( rule__Ref__RefAssignment_2 )
            {
             before(grammarAccess.getRefAccess().getRefAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4657:1: ( rule__Ref__RefAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4657:2: rule__Ref__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__Ref__RefAssignment_2_in_rule__Ref__Group__2__Impl9450);
            rule__Ref__RefAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__2__Impl


    // $ANTLR start rule__Ref__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4667:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4671:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__39480);
            rule__Ref__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__39483);
            rule__Ref__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__3


    // $ANTLR start rule__Ref__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4679:1: rule__Ref__Group__3__Impl : ( '[' ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4683:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4684:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4684:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4685:1: '['
            {
             before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Ref__Group__3__Impl9511); 
             after(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__3__Impl


    // $ANTLR start rule__Ref__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4698:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4702:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__49542);
            rule__Ref__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__49545);
            rule__Ref__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__4


    // $ANTLR start rule__Ref__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4710:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__ContentsAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4714:1: ( ( ( rule__Ref__ContentsAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4715:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4715:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4716:1: ( rule__Ref__ContentsAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getContentsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4717:1: ( rule__Ref__ContentsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4717:2: rule__Ref__ContentsAssignment_4
            {
            pushFollow(FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl9572);
            rule__Ref__ContentsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getContentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__4__Impl


    // $ANTLR start rule__Ref__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4727:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4731:1: ( rule__Ref__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4732:2: rule__Ref__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__59602);
            rule__Ref__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__5


    // $ANTLR start rule__Ref__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4738:1: rule__Ref__Group__5__Impl : ( ']' ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4742:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4743:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4743:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4744:1: ']'
            {
             before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Ref__Group__5__Impl9630); 
             after(grammarAccess.getRefAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__5__Impl


    // $ANTLR start rule__OrderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4769:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4773:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4774:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__09673);
            rule__OrderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__09676);
            rule__OrderedList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__0


    // $ANTLR start rule__OrderedList__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4781:1: rule__OrderedList__Group__0__Impl : ( '\\\\ol' ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4785:1: ( ( '\\\\ol' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4786:1: ( '\\\\ol' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4786:1: ( '\\\\ol' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4787:1: '\\\\ol'
            {
             before(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__OrderedList__Group__0__Impl9704); 
             after(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__0__Impl


    // $ANTLR start rule__OrderedList__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4800:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4804:1: ( rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4805:2: rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__19735);
            rule__OrderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__19738);
            rule__OrderedList__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__1


    // $ANTLR start rule__OrderedList__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4812:1: rule__OrderedList__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4816:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4817:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4817:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4818:1: ( RULE_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4819:1: ( RULE_WS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_WS) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4819:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__OrderedList__Group__1__Impl9766); 

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__1__Impl


    // $ANTLR start rule__OrderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4829:1: rule__OrderedList__Group__2 : rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 ;
    public final void rule__OrderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4833:1: ( rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4834:2: rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__29797);
            rule__OrderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__29800);
            rule__OrderedList__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__2


    // $ANTLR start rule__OrderedList__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4841:1: rule__OrderedList__Group__2__Impl : ( '[' ) ;
    public final void rule__OrderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4845:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4846:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4846:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4847:1: '['
            {
             before(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__OrderedList__Group__2__Impl9828); 
             after(grammarAccess.getOrderedListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__2__Impl


    // $ANTLR start rule__OrderedList__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4860:1: rule__OrderedList__Group__3 : rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4 ;
    public final void rule__OrderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4864:1: ( rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4865:2: rule__OrderedList__Group__3__Impl rule__OrderedList__Group__4
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__39859);
            rule__OrderedList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__4_in_rule__OrderedList__Group__39862);
            rule__OrderedList__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__3


    // $ANTLR start rule__OrderedList__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4872:1: rule__OrderedList__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__OrderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4876:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4877:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4877:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4878:1: ( RULE_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4879:1: ( RULE_WS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_WS) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4879:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__OrderedList__Group__3__Impl9890); 

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__3__Impl


    // $ANTLR start rule__OrderedList__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4889:1: rule__OrderedList__Group__4 : rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5 ;
    public final void rule__OrderedList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4893:1: ( rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4894:2: rule__OrderedList__Group__4__Impl rule__OrderedList__Group__5
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__4__Impl_in_rule__OrderedList__Group__49921);
            rule__OrderedList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__5_in_rule__OrderedList__Group__49924);
            rule__OrderedList__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__4


    // $ANTLR start rule__OrderedList__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4901:1: rule__OrderedList__Group__4__Impl : ( ( ( rule__OrderedList__ItemsAssignment_4 ) ) ( ( rule__OrderedList__ItemsAssignment_4 )* ) ) ;
    public final void rule__OrderedList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4905:1: ( ( ( ( rule__OrderedList__ItemsAssignment_4 ) ) ( ( rule__OrderedList__ItemsAssignment_4 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4906:1: ( ( ( rule__OrderedList__ItemsAssignment_4 ) ) ( ( rule__OrderedList__ItemsAssignment_4 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4906:1: ( ( ( rule__OrderedList__ItemsAssignment_4 ) ) ( ( rule__OrderedList__ItemsAssignment_4 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4907:1: ( ( rule__OrderedList__ItemsAssignment_4 ) ) ( ( rule__OrderedList__ItemsAssignment_4 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4907:1: ( ( rule__OrderedList__ItemsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4908:1: ( rule__OrderedList__ItemsAssignment_4 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4909:1: ( rule__OrderedList__ItemsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4909:2: rule__OrderedList__ItemsAssignment_4
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_4_in_rule__OrderedList__Group__4__Impl9953);
            rule__OrderedList__ItemsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_4()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4912:1: ( ( rule__OrderedList__ItemsAssignment_4 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4913:1: ( rule__OrderedList__ItemsAssignment_4 )*
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4914:1: ( rule__OrderedList__ItemsAssignment_4 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==24) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4914:2: rule__OrderedList__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_4_in_rule__OrderedList__Group__4__Impl9965);
            	    rule__OrderedList__ItemsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__4__Impl


    // $ANTLR start rule__OrderedList__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4925:1: rule__OrderedList__Group__5 : rule__OrderedList__Group__5__Impl ;
    public final void rule__OrderedList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4929:1: ( rule__OrderedList__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4930:2: rule__OrderedList__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__5__Impl_in_rule__OrderedList__Group__59998);
            rule__OrderedList__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__5


    // $ANTLR start rule__OrderedList__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4936:1: rule__OrderedList__Group__5__Impl : ( ']' ) ;
    public final void rule__OrderedList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4940:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4941:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4941:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4942:1: ']'
            {
             before(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__OrderedList__Group__5__Impl10026); 
             after(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group__5__Impl


    // $ANTLR start rule__UnorderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4967:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4971:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4972:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__010069);
            rule__UnorderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__010072);
            rule__UnorderedList__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__0


    // $ANTLR start rule__UnorderedList__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4979:1: rule__UnorderedList__Group__0__Impl : ( '\\\\ul' ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4983:1: ( ( '\\\\ul' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4984:1: ( '\\\\ul' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4984:1: ( '\\\\ul' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4985:1: '\\\\ul'
            {
             before(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__UnorderedList__Group__0__Impl10100); 
             after(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__0__Impl


    // $ANTLR start rule__UnorderedList__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4998:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5002:1: ( rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5003:2: rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__110131);
            rule__UnorderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__110134);
            rule__UnorderedList__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__1


    // $ANTLR start rule__UnorderedList__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5010:1: rule__UnorderedList__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5014:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5015:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5015:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5016:1: ( RULE_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5017:1: ( RULE_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_WS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5017:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__UnorderedList__Group__1__Impl10162); 

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__1__Impl


    // $ANTLR start rule__UnorderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5027:1: rule__UnorderedList__Group__2 : rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 ;
    public final void rule__UnorderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5031:1: ( rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5032:2: rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__210193);
            rule__UnorderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__210196);
            rule__UnorderedList__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__2


    // $ANTLR start rule__UnorderedList__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5039:1: rule__UnorderedList__Group__2__Impl : ( '[' ) ;
    public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5043:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5044:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5044:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5045:1: '['
            {
             before(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__UnorderedList__Group__2__Impl10224); 
             after(grammarAccess.getUnorderedListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__2__Impl


    // $ANTLR start rule__UnorderedList__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5058:1: rule__UnorderedList__Group__3 : rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4 ;
    public final void rule__UnorderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5062:1: ( rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5063:2: rule__UnorderedList__Group__3__Impl rule__UnorderedList__Group__4
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__310255);
            rule__UnorderedList__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__4_in_rule__UnorderedList__Group__310258);
            rule__UnorderedList__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__3


    // $ANTLR start rule__UnorderedList__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5070:1: rule__UnorderedList__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__UnorderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5074:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5075:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5075:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5076:1: ( RULE_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5077:1: ( RULE_WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_WS) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5077:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__UnorderedList__Group__3__Impl10286); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__3__Impl


    // $ANTLR start rule__UnorderedList__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5087:1: rule__UnorderedList__Group__4 : rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5 ;
    public final void rule__UnorderedList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5091:1: ( rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5092:2: rule__UnorderedList__Group__4__Impl rule__UnorderedList__Group__5
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__4__Impl_in_rule__UnorderedList__Group__410317);
            rule__UnorderedList__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__5_in_rule__UnorderedList__Group__410320);
            rule__UnorderedList__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__4


    // $ANTLR start rule__UnorderedList__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5099:1: rule__UnorderedList__Group__4__Impl : ( ( ( rule__UnorderedList__ItemsAssignment_4 ) ) ( ( rule__UnorderedList__ItemsAssignment_4 )* ) ) ;
    public final void rule__UnorderedList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5103:1: ( ( ( ( rule__UnorderedList__ItemsAssignment_4 ) ) ( ( rule__UnorderedList__ItemsAssignment_4 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5104:1: ( ( ( rule__UnorderedList__ItemsAssignment_4 ) ) ( ( rule__UnorderedList__ItemsAssignment_4 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5104:1: ( ( ( rule__UnorderedList__ItemsAssignment_4 ) ) ( ( rule__UnorderedList__ItemsAssignment_4 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5105:1: ( ( rule__UnorderedList__ItemsAssignment_4 ) ) ( ( rule__UnorderedList__ItemsAssignment_4 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5105:1: ( ( rule__UnorderedList__ItemsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5106:1: ( rule__UnorderedList__ItemsAssignment_4 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:1: ( rule__UnorderedList__ItemsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:2: rule__UnorderedList__ItemsAssignment_4
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_4_in_rule__UnorderedList__Group__4__Impl10349);
            rule__UnorderedList__ItemsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_4()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5110:1: ( ( rule__UnorderedList__ItemsAssignment_4 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5111:1: ( rule__UnorderedList__ItemsAssignment_4 )*
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5112:1: ( rule__UnorderedList__ItemsAssignment_4 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==24) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5112:2: rule__UnorderedList__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_4_in_rule__UnorderedList__Group__4__Impl10361);
            	    rule__UnorderedList__ItemsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__4__Impl


    // $ANTLR start rule__UnorderedList__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5123:1: rule__UnorderedList__Group__5 : rule__UnorderedList__Group__5__Impl ;
    public final void rule__UnorderedList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5127:1: ( rule__UnorderedList__Group__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5128:2: rule__UnorderedList__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__5__Impl_in_rule__UnorderedList__Group__510394);
            rule__UnorderedList__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__5


    // $ANTLR start rule__UnorderedList__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5134:1: rule__UnorderedList__Group__5__Impl : ( ']' ) ;
    public final void rule__UnorderedList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5138:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5139:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5139:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5140:1: ']'
            {
             before(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__UnorderedList__Group__5__Impl10422); 
             after(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group__5__Impl


    // $ANTLR start rule__Item__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5165:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5169:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5170:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__010465);
            rule__Item__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__010468);
            rule__Item__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__0


    // $ANTLR start rule__Item__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5177:1: rule__Item__Group__0__Impl : ( '\\\\item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5181:1: ( ( '\\\\item' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5182:1: ( '\\\\item' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5182:1: ( '\\\\item' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5183:1: '\\\\item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Item__Group__0__Impl10496); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__0__Impl


    // $ANTLR start rule__Item__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5196:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5200:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5201:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__110527);
            rule__Item__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__110530);
            rule__Item__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__1


    // $ANTLR start rule__Item__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5208:1: rule__Item__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5212:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5213:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5213:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5214:1: ( RULE_WS )*
            {
             before(grammarAccess.getItemAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5215:1: ( RULE_WS )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_WS) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5215:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Item__Group__1__Impl10558); 

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__1__Impl


    // $ANTLR start rule__Item__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5225:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5229:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5230:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__210589);
            rule__Item__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__3_in_rule__Item__Group__210592);
            rule__Item__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__2


    // $ANTLR start rule__Item__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5237:1: rule__Item__Group__2__Impl : ( '[' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5241:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5243:1: '['
            {
             before(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Item__Group__2__Impl10620); 
             after(grammarAccess.getItemAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__2__Impl


    // $ANTLR start rule__Item__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5256:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5260:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5261:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__310651);
            rule__Item__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__4_in_rule__Item__Group__310654);
            rule__Item__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__3


    // $ANTLR start rule__Item__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5268:1: rule__Item__Group__3__Impl : ( ( rule__Item__ContentsAssignment_3 ) ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5272:1: ( ( ( rule__Item__ContentsAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5273:1: ( ( rule__Item__ContentsAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5273:1: ( ( rule__Item__ContentsAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5274:1: ( rule__Item__ContentsAssignment_3 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5275:1: ( rule__Item__ContentsAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5275:2: rule__Item__ContentsAssignment_3
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_3_in_rule__Item__Group__3__Impl10681);
            rule__Item__ContentsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__3__Impl


    // $ANTLR start rule__Item__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5285:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5289:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5290:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__410711);
            rule__Item__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__5_in_rule__Item__Group__410714);
            rule__Item__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__4


    // $ANTLR start rule__Item__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5297:1: rule__Item__Group__4__Impl : ( ( rule__Item__Group_4__0 )* ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5301:1: ( ( ( rule__Item__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:1: ( ( rule__Item__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:1: ( ( rule__Item__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5303:1: ( rule__Item__Group_4__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5304:1: ( rule__Item__Group_4__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_MULTI_NL) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5304:2: rule__Item__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_4__0_in_rule__Item__Group__4__Impl10741);
            	    rule__Item__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__4__Impl


    // $ANTLR start rule__Item__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5314:1: rule__Item__Group__5 : rule__Item__Group__5__Impl rule__Item__Group__6 ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5318:1: ( rule__Item__Group__5__Impl rule__Item__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5319:2: rule__Item__Group__5__Impl rule__Item__Group__6
            {
            pushFollow(FOLLOW_rule__Item__Group__5__Impl_in_rule__Item__Group__510772);
            rule__Item__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__6_in_rule__Item__Group__510775);
            rule__Item__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__5


    // $ANTLR start rule__Item__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5326:1: rule__Item__Group__5__Impl : ( ']' ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5330:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5331:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5331:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5332:1: ']'
            {
             before(grammarAccess.getItemAccess().getRightSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Item__Group__5__Impl10803); 
             after(grammarAccess.getItemAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__5__Impl


    // $ANTLR start rule__Item__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5345:1: rule__Item__Group__6 : rule__Item__Group__6__Impl ;
    public final void rule__Item__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5349:1: ( rule__Item__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5350:2: rule__Item__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__6__Impl_in_rule__Item__Group__610834);
            rule__Item__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__6


    // $ANTLR start rule__Item__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5356:1: rule__Item__Group__6__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Item__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5360:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5361:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5361:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:1: ( RULE_WS )*
            {
             before(grammarAccess.getItemAccess().getWSTerminalRuleCall_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5363:1: ( RULE_WS )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_WS) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5363:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Item__Group__6__Impl10862); 

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getWSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group__6__Impl


    // $ANTLR start rule__Item__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5387:1: rule__Item__Group_4__0 : rule__Item__Group_4__0__Impl rule__Item__Group_4__1 ;
    public final void rule__Item__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5391:1: ( rule__Item__Group_4__0__Impl rule__Item__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5392:2: rule__Item__Group_4__0__Impl rule__Item__Group_4__1
            {
            pushFollow(FOLLOW_rule__Item__Group_4__0__Impl_in_rule__Item__Group_4__010907);
            rule__Item__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group_4__1_in_rule__Item__Group_4__010910);
            rule__Item__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_4__0


    // $ANTLR start rule__Item__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5399:1: rule__Item__Group_4__0__Impl : ( ( rule__Item__ContentsAssignment_4_0 ) ) ;
    public final void rule__Item__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5403:1: ( ( ( rule__Item__ContentsAssignment_4_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5404:1: ( ( rule__Item__ContentsAssignment_4_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5404:1: ( ( rule__Item__ContentsAssignment_4_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5405:1: ( rule__Item__ContentsAssignment_4_0 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_4_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5406:1: ( rule__Item__ContentsAssignment_4_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5406:2: rule__Item__ContentsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_4_0_in_rule__Item__Group_4__0__Impl10937);
            rule__Item__ContentsAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_4__0__Impl


    // $ANTLR start rule__Item__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5416:1: rule__Item__Group_4__1 : rule__Item__Group_4__1__Impl ;
    public final void rule__Item__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5420:1: ( rule__Item__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5421:2: rule__Item__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_4__1__Impl_in_rule__Item__Group_4__110967);
            rule__Item__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_4__1


    // $ANTLR start rule__Item__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5427:1: rule__Item__Group_4__1__Impl : ( ( rule__Item__ContentsAssignment_4_1 ) ) ;
    public final void rule__Item__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5431:1: ( ( ( rule__Item__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5432:1: ( ( rule__Item__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5432:1: ( ( rule__Item__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5433:1: ( rule__Item__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5434:1: ( rule__Item__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5434:2: rule__Item__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_4_1_in_rule__Item__Group_4__1__Impl10994);
            rule__Item__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_4__1__Impl


    // $ANTLR start rule__CodeRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5448:1: rule__CodeRef__Group__0 : rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 ;
    public final void rule__CodeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5452:1: ( rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5453:2: rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__011028);
            rule__CodeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__011031);
            rule__CodeRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__0


    // $ANTLR start rule__CodeRef__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5460:1: rule__CodeRef__Group__0__Impl : ( '\\\\codeRef' ) ;
    public final void rule__CodeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5464:1: ( ( '\\\\codeRef' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5465:1: ( '\\\\codeRef' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5465:1: ( '\\\\codeRef' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5466:1: '\\\\codeRef'
            {
             before(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__CodeRef__Group__0__Impl11059); 
             after(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__0__Impl


    // $ANTLR start rule__CodeRef__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5479:1: rule__CodeRef__Group__1 : rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 ;
    public final void rule__CodeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5483:1: ( rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5484:2: rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__111090);
            rule__CodeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__111093);
            rule__CodeRef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__1


    // $ANTLR start rule__CodeRef__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5491:1: rule__CodeRef__Group__1__Impl : ( '[' ) ;
    public final void rule__CodeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5495:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5496:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5496:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5497:1: '['
            {
             before(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__CodeRef__Group__1__Impl11121); 
             after(grammarAccess.getCodeRefAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__1__Impl


    // $ANTLR start rule__CodeRef__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5510:1: rule__CodeRef__Group__2 : rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3 ;
    public final void rule__CodeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5514:1: ( rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5515:2: rule__CodeRef__Group__2__Impl rule__CodeRef__Group__3
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__211152);
            rule__CodeRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__3_in_rule__CodeRef__Group__211155);
            rule__CodeRef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__2


    // $ANTLR start rule__CodeRef__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5522:1: rule__CodeRef__Group__2__Impl : ( ( rule__CodeRef__ElementAssignment_2 ) ) ;
    public final void rule__CodeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5526:1: ( ( ( rule__CodeRef__ElementAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: ( ( rule__CodeRef__ElementAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: ( ( rule__CodeRef__ElementAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5528:1: ( rule__CodeRef__ElementAssignment_2 )
            {
             before(grammarAccess.getCodeRefAccess().getElementAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5529:1: ( rule__CodeRef__ElementAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5529:2: rule__CodeRef__ElementAssignment_2
            {
            pushFollow(FOLLOW_rule__CodeRef__ElementAssignment_2_in_rule__CodeRef__Group__2__Impl11182);
            rule__CodeRef__ElementAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__2__Impl


    // $ANTLR start rule__CodeRef__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5539:1: rule__CodeRef__Group__3 : rule__CodeRef__Group__3__Impl ;
    public final void rule__CodeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5543:1: ( rule__CodeRef__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5544:2: rule__CodeRef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__3__Impl_in_rule__CodeRef__Group__311212);
            rule__CodeRef__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__3


    // $ANTLR start rule__CodeRef__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5550:1: rule__CodeRef__Group__3__Impl : ( ']' ) ;
    public final void rule__CodeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5554:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5555:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5555:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5556:1: ']'
            {
             before(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__CodeRef__Group__3__Impl11240); 
             after(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__Group__3__Impl


    // $ANTLR start rule__Link__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5577:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5581:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5582:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__011279);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__011282);
            rule__Link__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0


    // $ANTLR start rule__Link__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5589:1: rule__Link__Group__0__Impl : ( '\\\\link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5593:1: ( ( '\\\\link' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5594:1: ( '\\\\link' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5594:1: ( '\\\\link' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5595:1: '\\\\link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group__0__Impl11310); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0__Impl


    // $ANTLR start rule__Link__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5608:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5612:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5613:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__111341);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__111344);
            rule__Link__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1


    // $ANTLR start rule__Link__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5620:1: rule__Link__Group__1__Impl : ( '[' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5624:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5625:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5625:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5626:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Link__Group__1__Impl11372); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1__Impl


    // $ANTLR start rule__Link__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5639:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5643:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5644:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__211403);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__211406);
            rule__Link__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2


    // $ANTLR start rule__Link__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5651:1: rule__Link__Group__2__Impl : ( ( rule__Link__UrlAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5655:1: ( ( ( rule__Link__UrlAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5656:1: ( ( rule__Link__UrlAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5656:1: ( ( rule__Link__UrlAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5657:1: ( rule__Link__UrlAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5658:1: ( rule__Link__UrlAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5658:2: rule__Link__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_2_in_rule__Link__Group__2__Impl11433);
            rule__Link__UrlAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2__Impl


    // $ANTLR start rule__Link__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5668:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5672:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5673:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__311463);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__311466);
            rule__Link__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3


    // $ANTLR start rule__Link__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5680:1: rule__Link__Group__3__Impl : ( ']' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5684:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5685:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5685:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5686:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Link__Group__3__Impl11494); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3__Impl


    // $ANTLR start rule__Link__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5699:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5703:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5704:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__411525);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__411528);
            rule__Link__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__4


    // $ANTLR start rule__Link__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5711:1: rule__Link__Group__4__Impl : ( '[' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5715:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5716:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5716:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5717:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Link__Group__4__Impl11556); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__4__Impl


    // $ANTLR start rule__Link__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5730:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5734:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5735:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__511587);
            rule__Link__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__6_in_rule__Link__Group__511590);
            rule__Link__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5


    // $ANTLR start rule__Link__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5742:1: rule__Link__Group__5__Impl : ( ( rule__Link__TextAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5746:1: ( ( ( rule__Link__TextAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5747:1: ( ( rule__Link__TextAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5747:1: ( ( rule__Link__TextAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5748:1: ( rule__Link__TextAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5749:1: ( rule__Link__TextAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5749:2: rule__Link__TextAssignment_5
            {
            pushFollow(FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl11617);
            rule__Link__TextAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5__Impl


    // $ANTLR start rule__Link__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5759:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5763:1: ( rule__Link__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5764:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__611647);
            rule__Link__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__6


    // $ANTLR start rule__Link__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5770:1: rule__Link__Group__6__Impl : ( ']' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5774:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5775:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5775:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5776:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Link__Group__6__Impl11675); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__6__Impl


    // $ANTLR start rule__ImageRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5803:1: rule__ImageRef__Group__0 : rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 ;
    public final void rule__ImageRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5807:1: ( rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5808:2: rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__011720);
            rule__ImageRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__011723);
            rule__ImageRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__0


    // $ANTLR start rule__ImageRef__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5815:1: rule__ImageRef__Group__0__Impl : ( '\\\\img' ) ;
    public final void rule__ImageRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5819:1: ( ( '\\\\img' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5820:1: ( '\\\\img' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5820:1: ( '\\\\img' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5821:1: '\\\\img'
            {
             before(grammarAccess.getImageRefAccess().getImgKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ImageRef__Group__0__Impl11751); 
             after(grammarAccess.getImageRefAccess().getImgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__0__Impl


    // $ANTLR start rule__ImageRef__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5834:1: rule__ImageRef__Group__1 : rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 ;
    public final void rule__ImageRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5838:1: ( rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5839:2: rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__111782);
            rule__ImageRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__111785);
            rule__ImageRef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__1


    // $ANTLR start rule__ImageRef__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5846:1: rule__ImageRef__Group__1__Impl : ( ( rule__ImageRef__Group_1__0 )? ) ;
    public final void rule__ImageRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5850:1: ( ( ( rule__ImageRef__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5851:1: ( ( rule__ImageRef__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5851:1: ( ( rule__ImageRef__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5852:1: ( rule__ImageRef__Group_1__0 )?
            {
             before(grammarAccess.getImageRefAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5853:1: ( rule__ImageRef__Group_1__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==11) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5853:2: rule__ImageRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImageRef__Group_1__0_in_rule__ImageRef__Group__1__Impl11812);
                    rule__ImageRef__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageRefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__1__Impl


    // $ANTLR start rule__ImageRef__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5863:1: rule__ImageRef__Group__2 : rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 ;
    public final void rule__ImageRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5867:1: ( rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5868:2: rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__211843);
            rule__ImageRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__211846);
            rule__ImageRef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__2


    // $ANTLR start rule__ImageRef__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5875:1: rule__ImageRef__Group__2__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5879:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5880:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5880:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5881:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ImageRef__Group__2__Impl11874); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__2__Impl


    // $ANTLR start rule__ImageRef__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5894:1: rule__ImageRef__Group__3 : rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 ;
    public final void rule__ImageRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5898:1: ( rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5899:2: rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__311905);
            rule__ImageRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__311908);
            rule__ImageRef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__3


    // $ANTLR start rule__ImageRef__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5906:1: rule__ImageRef__Group__3__Impl : ( ( rule__ImageRef__PathAssignment_3 ) ) ;
    public final void rule__ImageRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5910:1: ( ( ( rule__ImageRef__PathAssignment_3 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5911:1: ( ( rule__ImageRef__PathAssignment_3 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5911:1: ( ( rule__ImageRef__PathAssignment_3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5912:1: ( rule__ImageRef__PathAssignment_3 )
            {
             before(grammarAccess.getImageRefAccess().getPathAssignment_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5913:1: ( rule__ImageRef__PathAssignment_3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5913:2: rule__ImageRef__PathAssignment_3
            {
            pushFollow(FOLLOW_rule__ImageRef__PathAssignment_3_in_rule__ImageRef__Group__3__Impl11935);
            rule__ImageRef__PathAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__3__Impl


    // $ANTLR start rule__ImageRef__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5923:1: rule__ImageRef__Group__4 : rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 ;
    public final void rule__ImageRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5927:1: ( rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5928:2: rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__411965);
            rule__ImageRef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__411968);
            rule__ImageRef__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__4


    // $ANTLR start rule__ImageRef__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5935:1: rule__ImageRef__Group__4__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5939:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5940:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5940:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5941:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__4__Impl11996); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__4__Impl


    // $ANTLR start rule__ImageRef__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5954:1: rule__ImageRef__Group__5 : rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 ;
    public final void rule__ImageRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5958:1: ( rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5959:2: rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__512027);
            rule__ImageRef__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__512030);
            rule__ImageRef__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__5


    // $ANTLR start rule__ImageRef__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5966:1: rule__ImageRef__Group__5__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5970:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5971:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5971:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5972:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__ImageRef__Group__5__Impl12058); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__5__Impl


    // $ANTLR start rule__ImageRef__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5985:1: rule__ImageRef__Group__6 : rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 ;
    public final void rule__ImageRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5989:1: ( rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5990:2: rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__612089);
            rule__ImageRef__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__612092);
            rule__ImageRef__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__6


    // $ANTLR start rule__ImageRef__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5997:1: rule__ImageRef__Group__6__Impl : ( ( rule__ImageRef__ClazzAssignment_6 ) ) ;
    public final void rule__ImageRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6001:1: ( ( ( rule__ImageRef__ClazzAssignment_6 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6002:1: ( ( rule__ImageRef__ClazzAssignment_6 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6002:1: ( ( rule__ImageRef__ClazzAssignment_6 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6003:1: ( rule__ImageRef__ClazzAssignment_6 )
            {
             before(grammarAccess.getImageRefAccess().getClazzAssignment_6()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6004:1: ( rule__ImageRef__ClazzAssignment_6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6004:2: rule__ImageRef__ClazzAssignment_6
            {
            pushFollow(FOLLOW_rule__ImageRef__ClazzAssignment_6_in_rule__ImageRef__Group__6__Impl12119);
            rule__ImageRef__ClazzAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getClazzAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__6__Impl


    // $ANTLR start rule__ImageRef__Group__7
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6014:1: rule__ImageRef__Group__7 : rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 ;
    public final void rule__ImageRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6018:1: ( rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6019:2: rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__712149);
            rule__ImageRef__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__712152);
            rule__ImageRef__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__7


    // $ANTLR start rule__ImageRef__Group__7__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6026:1: rule__ImageRef__Group__7__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6030:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6031:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6031:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6032:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__7__Impl12180); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__7__Impl


    // $ANTLR start rule__ImageRef__Group__8
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6045:1: rule__ImageRef__Group__8 : rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 ;
    public final void rule__ImageRef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6049:1: ( rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6050:2: rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__812211);
            rule__ImageRef__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__812214);
            rule__ImageRef__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__8


    // $ANTLR start rule__ImageRef__Group__8__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6057:1: rule__ImageRef__Group__8__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6061:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6062:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6062:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6063:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__ImageRef__Group__8__Impl12242); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__8__Impl


    // $ANTLR start rule__ImageRef__Group__9
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6076:1: rule__ImageRef__Group__9 : rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 ;
    public final void rule__ImageRef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6080:1: ( rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6081:2: rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__912273);
            rule__ImageRef__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__912276);
            rule__ImageRef__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__9


    // $ANTLR start rule__ImageRef__Group__9__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6088:1: rule__ImageRef__Group__9__Impl : ( ( rule__ImageRef__StyleAssignment_9 ) ) ;
    public final void rule__ImageRef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6092:1: ( ( ( rule__ImageRef__StyleAssignment_9 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6093:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6093:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6094:1: ( rule__ImageRef__StyleAssignment_9 )
            {
             before(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6095:1: ( rule__ImageRef__StyleAssignment_9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6095:2: rule__ImageRef__StyleAssignment_9
            {
            pushFollow(FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl12303);
            rule__ImageRef__StyleAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__9__Impl


    // $ANTLR start rule__ImageRef__Group__10
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6105:1: rule__ImageRef__Group__10 : rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 ;
    public final void rule__ImageRef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6109:1: ( rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6110:2: rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1012333);
            rule__ImageRef__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1012336);
            rule__ImageRef__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__10


    // $ANTLR start rule__ImageRef__Group__10__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6117:1: rule__ImageRef__Group__10__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6121:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6122:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6122:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6123:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__10__Impl12364); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__10__Impl


    // $ANTLR start rule__ImageRef__Group__11
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6136:1: rule__ImageRef__Group__11 : rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 ;
    public final void rule__ImageRef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6140:1: ( rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6141:2: rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1112395);
            rule__ImageRef__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1112398);
            rule__ImageRef__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__11


    // $ANTLR start rule__ImageRef__Group__11__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6148:1: rule__ImageRef__Group__11__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6152:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6153:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6153:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6154:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__ImageRef__Group__11__Impl12426); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__11__Impl


    // $ANTLR start rule__ImageRef__Group__12
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6167:1: rule__ImageRef__Group__12 : rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 ;
    public final void rule__ImageRef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6171:1: ( rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6172:2: rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1212457);
            rule__ImageRef__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1212460);
            rule__ImageRef__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__12


    // $ANTLR start rule__ImageRef__Group__12__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6179:1: rule__ImageRef__Group__12__Impl : ( ( rule__ImageRef__CaptionAssignment_12 ) ) ;
    public final void rule__ImageRef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6183:1: ( ( ( rule__ImageRef__CaptionAssignment_12 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6184:1: ( ( rule__ImageRef__CaptionAssignment_12 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6184:1: ( ( rule__ImageRef__CaptionAssignment_12 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6185:1: ( rule__ImageRef__CaptionAssignment_12 )
            {
             before(grammarAccess.getImageRefAccess().getCaptionAssignment_12()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6186:1: ( rule__ImageRef__CaptionAssignment_12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6186:2: rule__ImageRef__CaptionAssignment_12
            {
            pushFollow(FOLLOW_rule__ImageRef__CaptionAssignment_12_in_rule__ImageRef__Group__12__Impl12487);
            rule__ImageRef__CaptionAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getCaptionAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__12__Impl


    // $ANTLR start rule__ImageRef__Group__13
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6196:1: rule__ImageRef__Group__13 : rule__ImageRef__Group__13__Impl ;
    public final void rule__ImageRef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6200:1: ( rule__ImageRef__Group__13__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6201:2: rule__ImageRef__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1312517);
            rule__ImageRef__Group__13__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__13


    // $ANTLR start rule__ImageRef__Group__13__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6207:1: rule__ImageRef__Group__13__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6211:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6212:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6212:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6213:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13()); 
            match(input,14,FOLLOW_14_in_rule__ImageRef__Group__13__Impl12545); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__13__Impl


    // $ANTLR start rule__ImageRef__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6254:1: rule__ImageRef__Group_1__0 : rule__ImageRef__Group_1__0__Impl rule__ImageRef__Group_1__1 ;
    public final void rule__ImageRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6258:1: ( rule__ImageRef__Group_1__0__Impl rule__ImageRef__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6259:2: rule__ImageRef__Group_1__0__Impl rule__ImageRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_1__0__Impl_in_rule__ImageRef__Group_1__012604);
            rule__ImageRef__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_1__1_in_rule__ImageRef__Group_1__012607);
            rule__ImageRef__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_1__0


    // $ANTLR start rule__ImageRef__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6266:1: rule__ImageRef__Group_1__0__Impl : ( ':' ) ;
    public final void rule__ImageRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6270:1: ( ( ':' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6271:1: ( ':' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6271:1: ( ':' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6272:1: ':'
            {
             before(grammarAccess.getImageRefAccess().getColonKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__ImageRef__Group_1__0__Impl12635); 
             after(grammarAccess.getImageRefAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_1__0__Impl


    // $ANTLR start rule__ImageRef__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6285:1: rule__ImageRef__Group_1__1 : rule__ImageRef__Group_1__1__Impl ;
    public final void rule__ImageRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6289:1: ( rule__ImageRef__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6290:2: rule__ImageRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_1__1__Impl_in_rule__ImageRef__Group_1__112666);
            rule__ImageRef__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_1__1


    // $ANTLR start rule__ImageRef__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6296:1: rule__ImageRef__Group_1__1__Impl : ( ( rule__ImageRef__NameAssignment_1_1 ) ) ;
    public final void rule__ImageRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6300:1: ( ( ( rule__ImageRef__NameAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6301:1: ( ( rule__ImageRef__NameAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6301:1: ( ( rule__ImageRef__NameAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6302:1: ( rule__ImageRef__NameAssignment_1_1 )
            {
             before(grammarAccess.getImageRefAccess().getNameAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6303:1: ( rule__ImageRef__NameAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6303:2: rule__ImageRef__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ImageRef__NameAssignment_1_1_in_rule__ImageRef__Group_1__1__Impl12693);
            rule__ImageRef__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6317:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6321:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6322:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__012727);
            rule__CodeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__012730);
            rule__CodeBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__0


    // $ANTLR start rule__CodeBlock__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6329:1: rule__CodeBlock__Group__0__Impl : ( '\\\\code' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6333:1: ( ( '\\\\code' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6334:1: ( '\\\\code' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6334:1: ( '\\\\code' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6335:1: '\\\\code'
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__CodeBlock__Group__0__Impl12758); 
             after(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__0__Impl


    // $ANTLR start rule__CodeBlock__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6348:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6352:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6353:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__112789);
            rule__CodeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__112792);
            rule__CodeBlock__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__1


    // $ANTLR start rule__CodeBlock__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6360:1: rule__CodeBlock__Group__1__Impl : ( ( rule__CodeBlock__Group_1__0 )? ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6364:1: ( ( ( rule__CodeBlock__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( ( rule__CodeBlock__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( ( rule__CodeBlock__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6366:1: ( rule__CodeBlock__Group_1__0 )?
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6367:1: ( rule__CodeBlock__Group_1__0 )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6367:2: rule__CodeBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl12819);
                    rule__CodeBlock__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__1__Impl


    // $ANTLR start rule__CodeBlock__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6377:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6381:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6382:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__212850);
            rule__CodeBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__212853);
            rule__CodeBlock__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__2


    // $ANTLR start rule__CodeBlock__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6389:1: rule__CodeBlock__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6393:1: ( ( ( RULE_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6394:1: ( ( RULE_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6394:1: ( ( RULE_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( RULE_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getWSTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6396:1: ( RULE_WS )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_WS) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6396:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeBlock__Group__2__Impl12881); 

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__2__Impl


    // $ANTLR start rule__CodeBlock__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6406:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:1: ( rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6411:2: rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__312912);
            rule__CodeBlock__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__4_in_rule__CodeBlock__Group__312915);
            rule__CodeBlock__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__3


    // $ANTLR start rule__CodeBlock__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6418:1: rule__CodeBlock__Group__3__Impl : ( ( ruleParBreak )? ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6422:1: ( ( ( ruleParBreak )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6423:1: ( ( ruleParBreak )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6423:1: ( ( ruleParBreak )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6424:1: ( ruleParBreak )?
            {
             before(grammarAccess.getCodeBlockAccess().getParBreakParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:1: ( ruleParBreak )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_MULTI_NL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:3: ruleParBreak
                    {
                    pushFollow(FOLLOW_ruleParBreak_in_rule__CodeBlock__Group__3__Impl12943);
                    ruleParBreak();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getParBreakParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__3__Impl


    // $ANTLR start rule__CodeBlock__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6435:1: rule__CodeBlock__Group__4 : rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 ;
    public final void rule__CodeBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6439:1: ( rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6440:2: rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__4__Impl_in_rule__CodeBlock__Group__412974);
            rule__CodeBlock__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__5_in_rule__CodeBlock__Group__412977);
            rule__CodeBlock__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__4


    // $ANTLR start rule__CodeBlock__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6447:1: rule__CodeBlock__Group__4__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6451:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6452:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6452:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6453:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__CodeBlock__Group__4__Impl13005); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__4__Impl


    // $ANTLR start rule__CodeBlock__Group__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6466:1: rule__CodeBlock__Group__5 : rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6 ;
    public final void rule__CodeBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:1: ( rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6471:2: rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__5__Impl_in_rule__CodeBlock__Group__513036);
            rule__CodeBlock__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__6_in_rule__CodeBlock__Group__513039);
            rule__CodeBlock__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__5


    // $ANTLR start rule__CodeBlock__Group__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6478:1: rule__CodeBlock__Group__5__Impl : ( ( rule__CodeBlock__Alternatives_5 ) ) ;
    public final void rule__CodeBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6482:1: ( ( ( rule__CodeBlock__Alternatives_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6483:1: ( ( rule__CodeBlock__Alternatives_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6483:1: ( ( rule__CodeBlock__Alternatives_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6484:1: ( rule__CodeBlock__Alternatives_5 )
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:1: ( rule__CodeBlock__Alternatives_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:2: rule__CodeBlock__Alternatives_5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Alternatives_5_in_rule__CodeBlock__Group__5__Impl13066);
            rule__CodeBlock__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__5__Impl


    // $ANTLR start rule__CodeBlock__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6495:1: rule__CodeBlock__Group__6 : rule__CodeBlock__Group__6__Impl ;
    public final void rule__CodeBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6499:1: ( rule__CodeBlock__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6500:2: rule__CodeBlock__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__6__Impl_in_rule__CodeBlock__Group__613096);
            rule__CodeBlock__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__6


    // $ANTLR start rule__CodeBlock__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6506:1: rule__CodeBlock__Group__6__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6510:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6511:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6511:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6512:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__CodeBlock__Group__6__Impl13124); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group__6__Impl


    // $ANTLR start rule__CodeBlock__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6539:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6543:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6544:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__013169);
            rule__CodeBlock__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__013172);
            rule__CodeBlock__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__0


    // $ANTLR start rule__CodeBlock__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6551:1: rule__CodeBlock__Group_1__0__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6555:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6556:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6556:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6557:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__CodeBlock__Group_1__0__Impl13200); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6570:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6574:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6575:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__113231);
            rule__CodeBlock__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__113234);
            rule__CodeBlock__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__1


    // $ANTLR start rule__CodeBlock__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6582:1: rule__CodeBlock__Group_1__1__Impl : ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6586:1: ( ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6587:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6587:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6588:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6589:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6589:2: rule__CodeBlock__LanguageAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl13261);
            rule__CodeBlock__LanguageAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_1__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6599:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6603:1: ( rule__CodeBlock__Group_1__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6604:2: rule__CodeBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__213291);
            rule__CodeBlock__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__2


    // $ANTLR start rule__CodeBlock__Group_1__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6610:1: rule__CodeBlock__Group_1__2__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6614:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6616:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,14,FOLLOW_14_in_rule__CodeBlock__Group_1__2__Impl13319); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__2__Impl


    // $ANTLR start rule__CodeBlock__Group_5_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6635:1: rule__CodeBlock__Group_5_0__0 : rule__CodeBlock__Group_5_0__0__Impl rule__CodeBlock__Group_5_0__1 ;
    public final void rule__CodeBlock__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6639:1: ( rule__CodeBlock__Group_5_0__0__Impl rule__CodeBlock__Group_5_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6640:2: rule__CodeBlock__Group_5_0__0__Impl rule__CodeBlock__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0__0__Impl_in_rule__CodeBlock__Group_5_0__013356);
            rule__CodeBlock__Group_5_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0__1_in_rule__CodeBlock__Group_5_0__013359);
            rule__CodeBlock__Group_5_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0__0


    // $ANTLR start rule__CodeBlock__Group_5_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6647:1: rule__CodeBlock__Group_5_0__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_5_0_0 ) ) ;
    public final void rule__CodeBlock__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6651:1: ( ( ( rule__CodeBlock__ContentsAssignment_5_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6652:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6652:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6653:1: ( rule__CodeBlock__ContentsAssignment_5_0_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6654:1: ( rule__CodeBlock__ContentsAssignment_5_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6654:2: rule__CodeBlock__ContentsAssignment_5_0_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_0_in_rule__CodeBlock__Group_5_0__0__Impl13386);
            rule__CodeBlock__ContentsAssignment_5_0_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0__0__Impl


    // $ANTLR start rule__CodeBlock__Group_5_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6664:1: rule__CodeBlock__Group_5_0__1 : rule__CodeBlock__Group_5_0__1__Impl ;
    public final void rule__CodeBlock__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6668:1: ( rule__CodeBlock__Group_5_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6669:2: rule__CodeBlock__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0__1__Impl_in_rule__CodeBlock__Group_5_0__113416);
            rule__CodeBlock__Group_5_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0__1


    // $ANTLR start rule__CodeBlock__Group_5_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6675:1: rule__CodeBlock__Group_5_0__1__Impl : ( ( rule__CodeBlock__Group_5_0_1__0 )* ) ;
    public final void rule__CodeBlock__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6679:1: ( ( ( rule__CodeBlock__Group_5_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ( rule__CodeBlock__Group_5_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ( rule__CodeBlock__Group_5_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6681:1: ( rule__CodeBlock__Group_5_0_1__0 )*
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_5_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6682:1: ( rule__CodeBlock__Group_5_0_1__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=19 && LA69_0<=21)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6682:2: rule__CodeBlock__Group_5_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CodeBlock__Group_5_0_1__0_in_rule__CodeBlock__Group_5_0__1__Impl13443);
            	    rule__CodeBlock__Group_5_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getGroup_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0__1__Impl


    // $ANTLR start rule__CodeBlock__Group_5_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6696:1: rule__CodeBlock__Group_5_0_1__0 : rule__CodeBlock__Group_5_0_1__0__Impl rule__CodeBlock__Group_5_0_1__1 ;
    public final void rule__CodeBlock__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6700:1: ( rule__CodeBlock__Group_5_0_1__0__Impl rule__CodeBlock__Group_5_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6701:2: rule__CodeBlock__Group_5_0_1__0__Impl rule__CodeBlock__Group_5_0_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0_1__0__Impl_in_rule__CodeBlock__Group_5_0_1__013478);
            rule__CodeBlock__Group_5_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0_1__1_in_rule__CodeBlock__Group_5_0_1__013481);
            rule__CodeBlock__Group_5_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0_1__0


    // $ANTLR start rule__CodeBlock__Group_5_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6708:1: rule__CodeBlock__Group_5_0_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_5_0_1_0 ) ) ;
    public final void rule__CodeBlock__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6712:1: ( ( ( rule__CodeBlock__ContentsAssignment_5_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6713:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6713:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6714:1: ( rule__CodeBlock__ContentsAssignment_5_0_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6715:1: ( rule__CodeBlock__ContentsAssignment_5_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6715:2: rule__CodeBlock__ContentsAssignment_5_0_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_1_0_in_rule__CodeBlock__Group_5_0_1__0__Impl13508);
            rule__CodeBlock__ContentsAssignment_5_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_5_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: rule__CodeBlock__Group_5_0_1__1 : rule__CodeBlock__Group_5_0_1__1__Impl ;
    public final void rule__CodeBlock__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6729:1: ( rule__CodeBlock__Group_5_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6730:2: rule__CodeBlock__Group_5_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_0_1__1__Impl_in_rule__CodeBlock__Group_5_0_1__113538);
            rule__CodeBlock__Group_5_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0_1__1


    // $ANTLR start rule__CodeBlock__Group_5_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6736:1: rule__CodeBlock__Group_5_0_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )? ) ;
    public final void rule__CodeBlock__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6740:1: ( ( ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6741:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6741:1: ( ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6742:1: ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6743:1: ( rule__CodeBlock__ContentsAssignment_5_0_1_1 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_MULTI_NL)||(LA70_0>=9 && LA70_0<=11)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6743:2: rule__CodeBlock__ContentsAssignment_5_0_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_1_1_in_rule__CodeBlock__Group_5_0_1__1__Impl13565);
                    rule__CodeBlock__ContentsAssignment_5_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_0_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_5_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6757:1: rule__CodeBlock__Group_5_1__0 : rule__CodeBlock__Group_5_1__0__Impl rule__CodeBlock__Group_5_1__1 ;
    public final void rule__CodeBlock__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6761:1: ( rule__CodeBlock__Group_5_1__0__Impl rule__CodeBlock__Group_5_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6762:2: rule__CodeBlock__Group_5_1__0__Impl rule__CodeBlock__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_1__0__Impl_in_rule__CodeBlock__Group_5_1__013600);
            rule__CodeBlock__Group_5_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_5_1__1_in_rule__CodeBlock__Group_5_1__013603);
            rule__CodeBlock__Group_5_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_1__0


    // $ANTLR start rule__CodeBlock__Group_5_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6769:1: rule__CodeBlock__Group_5_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_5_1_0 ) ) ;
    public final void rule__CodeBlock__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6773:1: ( ( ( rule__CodeBlock__ContentsAssignment_5_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6774:1: ( ( rule__CodeBlock__ContentsAssignment_5_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6774:1: ( ( rule__CodeBlock__ContentsAssignment_5_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6775:1: ( rule__CodeBlock__ContentsAssignment_5_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6776:1: ( rule__CodeBlock__ContentsAssignment_5_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6776:2: rule__CodeBlock__ContentsAssignment_5_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_5_1_0_in_rule__CodeBlock__Group_5_1__0__Impl13630);
            rule__CodeBlock__ContentsAssignment_5_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_5_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6786:1: rule__CodeBlock__Group_5_1__1 : rule__CodeBlock__Group_5_1__1__Impl ;
    public final void rule__CodeBlock__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6790:1: ( rule__CodeBlock__Group_5_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6791:2: rule__CodeBlock__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_5_1__1__Impl_in_rule__CodeBlock__Group_5_1__113660);
            rule__CodeBlock__Group_5_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_1__1


    // $ANTLR start rule__CodeBlock__Group_5_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6797:1: rule__CodeBlock__Group_5_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_5_1_1 )? ) ;
    public final void rule__CodeBlock__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6801:1: ( ( ( rule__CodeBlock__ContentsAssignment_5_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6802:1: ( ( rule__CodeBlock__ContentsAssignment_5_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6802:1: ( ( rule__CodeBlock__ContentsAssignment_5_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6803:1: ( rule__CodeBlock__ContentsAssignment_5_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6804:1: ( rule__CodeBlock__ContentsAssignment_5_1_1 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_MULTI_NL)||(LA71_0>=9 && LA71_0<=11)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6804:2: rule__CodeBlock__ContentsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_5_1_1_in_rule__CodeBlock__Group_5_1__1__Impl13687);
                    rule__CodeBlock__ContentsAssignment_5_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_5_1__1__Impl


    // $ANTLR start rule__Document__ContentsAssignment_1_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6819:1: rule__Document__ContentsAssignment_1_0_0 : ( ruleParBreak ) ;
    public final void rule__Document__ContentsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6823:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6824:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6824:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6825:1: ruleParBreak
            {
             before(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_0_013727);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ContentsAssignment_1_0_0


    // $ANTLR start rule__Document__ChaptersAssignment_1_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6834:1: rule__Document__ChaptersAssignment_1_0_1 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6838:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6839:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6839:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6840:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_1_0_113758);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ChaptersAssignment_1_0_1


    // $ANTLR start rule__Document__ContentsAssignment_1_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6849:1: rule__Document__ContentsAssignment_1_1_0 : ( ruleParBreak ) ;
    public final void rule__Document__ContentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6853:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6854:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6854:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6855:1: ruleParBreak
            {
             before(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_1_013789);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ContentsAssignment_1_1_0


    // $ANTLR start rule__Document__SectionsAssignment_1_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: rule__Document__SectionsAssignment_1_1_1 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6868:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6869:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6869:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6870:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_1_1_113820);
            ruleSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_1_1_1


    // $ANTLR start rule__Document__ContentsAssignment_1_2_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6879:1: rule__Document__ContentsAssignment_1_2_0 : ( ruleParBreak ) ;
    public final void rule__Document__ContentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6883:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6884:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6884:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6885:1: ruleParBreak
            {
             before(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_2_013851);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ContentsAssignment_1_2_0


    // $ANTLR start rule__Document__SubsectionsAssignment_1_2_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6894:1: rule__Document__SubsectionsAssignment_1_2_1 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6898:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6899:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6899:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6900:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_1_2_113882);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SubsectionsAssignment_1_2_1


    // $ANTLR start rule__Document__ContentsAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6909:1: rule__Document__ContentsAssignment_2 : ( ruleParBreak ) ;
    public final void rule__Document__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6913:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6914:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6914:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6915:1: ruleParBreak
            {
             before(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_213913);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getContentsParBreakParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ContentsAssignment_2


    // $ANTLR start rule__Chapter__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6924:1: rule__Chapter__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6928:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6929:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6929:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6930:1: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_1_113944); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__NameAssignment_1_1


    // $ANTLR start rule__Chapter__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6939:1: rule__Chapter__TitleAssignment_3 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Chapter__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6945:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getChapterAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Chapter__TitleAssignment_313975);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getChapterAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__TitleAssignment_3


    // $ANTLR start rule__Chapter__ContentsAssignment_6_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6954:1: rule__Chapter__ContentsAssignment_6_0_0 : ( ruleParBreak ) ;
    public final void rule__Chapter__ContentsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6960:1: ruleParBreak
            {
             before(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Chapter__ContentsAssignment_6_0_014006);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_6_0_0


    // $ANTLR start rule__Chapter__ContentsAssignment_6_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6969:1: rule__Chapter__ContentsAssignment_6_0_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Chapter__ContentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6975:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Chapter__ContentsAssignment_6_0_114037);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_6_0_1


    // $ANTLR start rule__Chapter__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6984:1: rule__Chapter__ContentsAssignment_6_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6990:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_6_114068);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_6_1


    // $ANTLR start rule__Chapter__ContentsAssignment_7_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6999:1: rule__Chapter__ContentsAssignment_7_0 : ( ruleParBreak ) ;
    public final void rule__Chapter__ContentsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7005:1: ruleParBreak
            {
             before(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Chapter__ContentsAssignment_7_014099);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsParBreakParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_7_0


    // $ANTLR start rule__Chapter__ContentsAssignment_7_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7014:1: rule__Chapter__ContentsAssignment_7_1 : ( ruleSection ) ;
    public final void rule__Chapter__ContentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7020:1: ruleSection
            {
             before(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_7_114130);
            ruleSection();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_7_1


    // $ANTLR start rule__Section__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7029:1: rule__Section__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7035:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_1_114161); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__NameAssignment_1_1


    // $ANTLR start rule__Section__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7044:1: rule__Section__TitleAssignment_3 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7050:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section__TitleAssignment_314192);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__TitleAssignment_3


    // $ANTLR start rule__Section__ContentsAssignment_6_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7059:1: rule__Section__ContentsAssignment_6_0_0 : ( ruleParBreak ) ;
    public final void rule__Section__ContentsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7065:1: ruleParBreak
            {
             before(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Section__ContentsAssignment_6_0_014223);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_6_0_0


    // $ANTLR start rule__Section__ContentsAssignment_6_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7074:1: rule__Section__ContentsAssignment_6_0_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section__ContentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7080:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section__ContentsAssignment_6_0_114254);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_6_0_1


    // $ANTLR start rule__Section__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7089:1: rule__Section__ContentsAssignment_6_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7093:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7094:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7094:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7095:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_6_114285);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_6_1


    // $ANTLR start rule__Section__ContentsAssignment_7_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7104:1: rule__Section__ContentsAssignment_7_0 : ( ruleParBreak ) ;
    public final void rule__Section__ContentsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7108:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7109:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7109:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7110:1: ruleParBreak
            {
             before(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Section__ContentsAssignment_7_014316);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsParBreakParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_7_0


    // $ANTLR start rule__Section__ContentsAssignment_7_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7119:1: rule__Section__ContentsAssignment_7_1 : ( ruleSubSection ) ;
    public final void rule__Section__ContentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7123:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7124:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7124:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7125:1: ruleSubSection
            {
             before(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_7_114347);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_7_1


    // $ANTLR start rule__SubSection__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7134:1: rule__SubSection__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SubSection__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7138:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7139:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7139:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7140:1: RULE_ID
            {
             before(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_1_114378); 
             after(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__NameAssignment_1_1


    // $ANTLR start rule__SubSection__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7149:1: rule__SubSection__TitleAssignment_3 : ( ruleTextOrMarkupLine ) ;
    public final void rule__SubSection__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7153:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7154:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7154:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7155:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__SubSection__TitleAssignment_314409);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__TitleAssignment_3


    // $ANTLR start rule__SubSection__ContentsAssignment_6_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7164:1: rule__SubSection__ContentsAssignment_6_0_0 : ( ruleParBreak ) ;
    public final void rule__SubSection__ContentsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7168:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7169:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7169:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7170:1: ruleParBreak
            {
             before(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__SubSection__ContentsAssignment_6_0_014440);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_6_0_0


    // $ANTLR start rule__SubSection__ContentsAssignment_6_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7179:1: rule__SubSection__ContentsAssignment_6_0_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__SubSection__ContentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7183:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7184:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7184:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7185:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__SubSection__ContentsAssignment_6_0_114471);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_6_0_1


    // $ANTLR start rule__SubSection__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7194:1: rule__SubSection__ContentsAssignment_6_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7198:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7199:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7199:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7200:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_6_114502);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_6_1


    // $ANTLR start rule__SubSection__ContentsAssignment_7_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7209:1: rule__SubSection__ContentsAssignment_7_0 : ( ruleParBreak ) ;
    public final void rule__SubSection__ContentsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7213:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7214:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7214:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7215:1: ruleParBreak
            {
             before(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__SubSection__ContentsAssignment_7_014533);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsParBreakParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_7_0


    // $ANTLR start rule__SubSection__ContentsAssignment_7_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7224:1: rule__SubSection__ContentsAssignment_7_1 : ( ruleSection3 ) ;
    public final void rule__SubSection__ContentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7228:1: ( ( ruleSection3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7229:1: ( ruleSection3 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7229:1: ( ruleSection3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7230:1: ruleSection3
            {
             before(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_7_114564);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_7_1


    // $ANTLR start rule__Section3__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7239:1: rule__Section3__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section3__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7243:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7244:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7244:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7245:1: RULE_ID
            {
             before(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_1_114595); 
             after(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__NameAssignment_1_1


    // $ANTLR start rule__Section3__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7254:1: rule__Section3__TitleAssignment_3 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section3__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7258:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7259:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7259:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7260:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSection3Access().getTitleTextOrMarkupLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section3__TitleAssignment_314626);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSection3Access().getTitleTextOrMarkupLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__TitleAssignment_3


    // $ANTLR start rule__Section3__ContentsAssignment_6_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7269:1: rule__Section3__ContentsAssignment_6_0_0 : ( ruleParBreak ) ;
    public final void rule__Section3__ContentsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7273:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7274:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7274:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7275:1: ruleParBreak
            {
             before(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Section3__ContentsAssignment_6_0_014657);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_6_0_0


    // $ANTLR start rule__Section3__ContentsAssignment_6_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7284:1: rule__Section3__ContentsAssignment_6_0_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section3__ContentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7288:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7289:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7289:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7290:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section3__ContentsAssignment_6_0_114688);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_6_0_1


    // $ANTLR start rule__Section3__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7299:1: rule__Section3__ContentsAssignment_6_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7303:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7304:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7304:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7305:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_6_114719);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_6_1


    // $ANTLR start rule__Section3__ContentsAssignment_7_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7314:1: rule__Section3__ContentsAssignment_7_0 : ( ruleParBreak ) ;
    public final void rule__Section3__ContentsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7318:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7319:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7319:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7320:1: ruleParBreak
            {
             before(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Section3__ContentsAssignment_7_014750);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsParBreakParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_7_0


    // $ANTLR start rule__Section3__ContentsAssignment_7_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7329:1: rule__Section3__ContentsAssignment_7_1 : ( ruleSection4 ) ;
    public final void rule__Section3__ContentsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7333:1: ( ( ruleSection4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7334:1: ( ruleSection4 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7334:1: ( ruleSection4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7335:1: ruleSection4
            {
             before(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_7_114781);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_7_1


    // $ANTLR start rule__Section4__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7344:1: rule__Section4__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Section4__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7348:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7349:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7349:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7350:1: RULE_ID
            {
             before(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_1_114812); 
             after(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__NameAssignment_1_1


    // $ANTLR start rule__Section4__TitleAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7359:1: rule__Section4__TitleAssignment_3 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section4__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7363:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7364:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7364:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7365:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSection4Access().getTitleTextOrMarkupLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section4__TitleAssignment_314843);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSection4Access().getTitleTextOrMarkupLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__TitleAssignment_3


    // $ANTLR start rule__Section4__ContentsAssignment_6_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7374:1: rule__Section4__ContentsAssignment_6_0_0 : ( ruleParBreak ) ;
    public final void rule__Section4__ContentsAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7378:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7379:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7379:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7380:1: ruleParBreak
            {
             before(grammarAccess.getSection4Access().getContentsParBreakParserRuleCall_6_0_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Section4__ContentsAssignment_6_0_014874);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsParBreakParserRuleCall_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_6_0_0


    // $ANTLR start rule__Section4__ContentsAssignment_6_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7389:1: rule__Section4__ContentsAssignment_6_0_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Section4__ContentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7393:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7394:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7394:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7395:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Section4__ContentsAssignment_6_0_114905);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsTextOrMarkupLineParserRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_6_0_1


    // $ANTLR start rule__Section4__ContentsAssignment_6_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7404:1: rule__Section4__ContentsAssignment_6_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__ContentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7408:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7409:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7409:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7410:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_6_114936);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_6_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7419:1: rule__TextOrMarkup__ContentsAssignment_0 : ( ruleParBreak ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7423:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7424:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7424:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7425:1: ruleParBreak
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsParBreakParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__TextOrMarkup__ContentsAssignment_014967);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsParBreakParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7434:1: rule__TextOrMarkup__ContentsAssignment_1_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7438:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7439:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7439:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7440:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_0_014998);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_0_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7449:1: rule__TextOrMarkup__ContentsAssignment_1_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7453:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7454:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7454:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7455:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_0_1_015029);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_0_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7464:1: rule__TextOrMarkup__ContentsAssignment_1_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7468:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7469:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7469:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7470:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_0_1_115060);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_0_1_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7479:1: rule__TextOrMarkup__ContentsAssignment_1_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7483:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7484:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7484:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7485:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_1_015091);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7494:1: rule__TextOrMarkup__ContentsAssignment_1_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7498:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7499:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7499:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7500:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_1_115122);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_1_1


    // $ANTLR start rule__TextOrMarkupLine__ContentsAssignment_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7509:1: rule__TextOrMarkupLine__ContentsAssignment_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkupLine__ContentsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7513:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7514:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7514:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7515:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_0_015153);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__ContentsAssignment_0_0


    // $ANTLR start rule__TextOrMarkupLine__ContentsAssignment_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7524:1: rule__TextOrMarkupLine__ContentsAssignment_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkupLine__ContentsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7528:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7529:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7529:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7530:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkupLine__ContentsAssignment_0_1_015184);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__ContentsAssignment_0_1_0


    // $ANTLR start rule__TextOrMarkupLine__ContentsAssignment_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7539:1: rule__TextOrMarkupLine__ContentsAssignment_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkupLine__ContentsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7543:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7544:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7544:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7545:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_0_1_115215);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__ContentsAssignment_0_1_1


    // $ANTLR start rule__TextOrMarkupLine__ContentsAssignment_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7554:1: rule__TextOrMarkupLine__ContentsAssignment_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkupLine__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7558:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7559:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7559:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7560:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkupLine__ContentsAssignment_1_015246);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsMarkUpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__ContentsAssignment_1_0


    // $ANTLR start rule__TextOrMarkupLine__ContentsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7569:1: rule__TextOrMarkupLine__ContentsAssignment_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkupLine__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7573:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7574:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7574:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7575:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_1_115277);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupLineAccess().getContentsTextPartParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkupLine__ContentsAssignment_1_1


    // $ANTLR start rule__Emphasize__ContentsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7584:1: rule__Emphasize__ContentsAssignment_1_1 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Emphasize__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7588:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7589:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7589:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7590:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupLineParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Emphasize__ContentsAssignment_1_115308);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupLineParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__ContentsAssignment_1_1


    // $ANTLR start rule__Anchor__NameAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7599:1: rule__Anchor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Anchor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7603:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7604:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7604:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7605:1: RULE_ID
            {
             before(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_215339); 
             after(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__NameAssignment_2


    // $ANTLR start rule__Ref__RefAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7614:1: rule__Ref__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7618:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7619:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7619:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7620:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7621:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7622:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_215374); 
             after(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__RefAssignment_2


    // $ANTLR start rule__Ref__ContentsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7633:1: rule__Ref__ContentsAssignment_4 : ( ruleTextOrMarkupLine ) ;
    public final void rule__Ref__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7637:1: ( ( ruleTextOrMarkupLine ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7638:1: ( ruleTextOrMarkupLine )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7638:1: ( ruleTextOrMarkupLine )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7639:1: ruleTextOrMarkupLine
            {
             before(grammarAccess.getRefAccess().getContentsTextOrMarkupLineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkupLine_in_rule__Ref__ContentsAssignment_415409);
            ruleTextOrMarkupLine();
            _fsp--;

             after(grammarAccess.getRefAccess().getContentsTextOrMarkupLineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__ContentsAssignment_4


    // $ANTLR start rule__OrderedList__ItemsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7648:1: rule__OrderedList__ItemsAssignment_4 : ( ruleItem ) ;
    public final void rule__OrderedList__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7652:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7653:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7653:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7654:1: ruleItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_415440);
            ruleItem();
            _fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__ItemsAssignment_4


    // $ANTLR start rule__UnorderedList__ItemsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7663:1: rule__UnorderedList__ItemsAssignment_4 : ( ruleItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7667:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7668:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7668:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7669:1: ruleItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_415471);
            ruleItem();
            _fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__ItemsAssignment_4


    // $ANTLR start rule__Item__ContentsAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7678:1: rule__Item__ContentsAssignment_3 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7682:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7683:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7683:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7684:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_315502);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_3


    // $ANTLR start rule__Item__ContentsAssignment_4_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7693:1: rule__Item__ContentsAssignment_4_0 : ( ruleParBreak ) ;
    public final void rule__Item__ContentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7697:1: ( ( ruleParBreak ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7698:1: ( ruleParBreak )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7698:1: ( ruleParBreak )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7699:1: ruleParBreak
            {
             before(grammarAccess.getItemAccess().getContentsParBreakParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleParBreak_in_rule__Item__ContentsAssignment_4_015533);
            ruleParBreak();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsParBreakParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_4_0


    // $ANTLR start rule__Item__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7708:1: rule__Item__ContentsAssignment_4_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7712:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7713:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7713:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7714:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_4_115564);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_4_1


    // $ANTLR start rule__CodeRef__ElementAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7723:1: rule__CodeRef__ElementAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__CodeRef__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7727:1: ( ( ( ruleText ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7728:1: ( ( ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7728:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7729:1: ( ruleText )
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7730:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7731:1: ruleText
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_215599);
            ruleText();
            _fsp--;

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__ElementAssignment_2


    // $ANTLR start rule__Link__UrlAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7742:1: rule__Link__UrlAssignment_2 : ( ruleText ) ;
    public final void rule__Link__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7746:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7747:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7747:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7748:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__UrlAssignment_215634);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__UrlAssignment_2


    // $ANTLR start rule__Link__TextAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7757:1: rule__Link__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Link__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7761:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7762:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7762:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7763:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__TextAssignment_515665);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__TextAssignment_5


    // $ANTLR start rule__ImageRef__NameAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7772:1: rule__ImageRef__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ImageRef__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7776:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7777:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7777:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7778:1: RULE_ID
            {
             before(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_1_115696); 
             after(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__NameAssignment_1_1


    // $ANTLR start rule__ImageRef__PathAssignment_3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7787:1: rule__ImageRef__PathAssignment_3 : ( ruleText ) ;
    public final void rule__ImageRef__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7791:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7792:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7792:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7793:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_315727);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__PathAssignment_3


    // $ANTLR start rule__ImageRef__ClazzAssignment_6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7802:1: rule__ImageRef__ClazzAssignment_6 : ( ruleText ) ;
    public final void rule__ImageRef__ClazzAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7806:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7807:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7807:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7808:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_615758);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__ClazzAssignment_6


    // $ANTLR start rule__ImageRef__StyleAssignment_9
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7817:1: rule__ImageRef__StyleAssignment_9 : ( ruleText ) ;
    public final void rule__ImageRef__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7821:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7822:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7822:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7823:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_915789);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__StyleAssignment_9


    // $ANTLR start rule__ImageRef__CaptionAssignment_12
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7832:1: rule__ImageRef__CaptionAssignment_12 : ( ruleText ) ;
    public final void rule__ImageRef__CaptionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7836:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7837:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7837:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7838:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1215820);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__CaptionAssignment_12


    // $ANTLR start rule__CodeBlock__LanguageAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7847:1: rule__CodeBlock__LanguageAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CodeBlock__LanguageAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7851:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7852:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7852:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7853:1: RULE_ID
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_115851); 
             after(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__LanguageAssignment_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_5_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7862:1: rule__CodeBlock__ContentsAssignment_5_0_0 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7866:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7867:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7867:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7868:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_0_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_0_015882);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_5_0_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_5_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7877:1: rule__CodeBlock__ContentsAssignment_5_0_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_5_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7881:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7882:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7882:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7883:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_5_0_1_015913);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_5_0_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_5_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7892:1: rule__CodeBlock__ContentsAssignment_5_0_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7896:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7897:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7897:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7898:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_0_1_115944);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_5_0_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_5_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7907:1: rule__CodeBlock__ContentsAssignment_5_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7911:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7912:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7912:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7913:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_5_1_015975);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_5_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_5_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7922:1: rule__CodeBlock__ContentsAssignment_5_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7926:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7927:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7927:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7928:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_1_116006);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_5_1_1


    // $ANTLR start rule__ParBreak__CAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7937:1: rule__ParBreak__CAssignment : ( RULE_MULTI_NL ) ;
    public final void rule__ParBreak__CAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7941:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7942:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7942:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7943:1: RULE_MULTI_NL
            {
             before(grammarAccess.getParBreakAccess().getCMULTI_NLTerminalRuleCall_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__ParBreak__CAssignment16037); 
             after(grammarAccess.getParBreakAccess().getCMULTI_NLTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParBreak__CAssignment


    // $ANTLR start rule__TextPart__TextAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7952:1: rule__TextPart__TextAssignment : ( ruleText ) ;
    public final void rule__TextPart__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7956:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7957:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7957:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7958:1: ruleText
            {
             before(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__TextPart__TextAssignment16068);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextPart__TextAssignment


    // $ANTLR start rule__Code__ContentsAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7967:1: rule__Code__ContentsAssignment : ( ruleCodeText ) ;
    public final void rule__Code__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7971:1: ( ( ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7972:1: ( ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7972:1: ( ruleCodeText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7973:1: ruleCodeText
            {
             before(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment16099);
            ruleCodeText();
            _fsp--;

             after(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Code__ContentsAssignment


    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA66_eotS =
        "\11\uffff";
    static final String DFA66_eofS =
        "\4\uffff\3\2\1\uffff\1\2";
    static final String DFA66_minS =
        "\1\5\1\4\1\uffff\4\4\1\uffff\1\4";
    static final String DFA66_maxS =
        "\1\15\1\25\1\uffff\1\25\3\34\1\uffff\1\34";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\4\uffff\1\1\1\uffff";
    static final String DFA66_specialS =
        "\11\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\1\uffff\1\2\5\uffff\1\1",
            "\1\3\3\2\1\uffff\3\2\7\uffff\3\2",
            "",
            "\4\2\1\uffff\3\2\2\uffff\1\4\4\uffff\3\2",
            "\1\2\1\5\1\2\1\6\1\uffff\4\2\1\7\12\2\1\uffff\4\2",
            "\1\2\1\10\1\2\1\6\1\uffff\4\2\1\7\12\2\1\uffff\4\2",
            "\4\2\1\uffff\4\2\1\7\1\uffff\11\2\1\uffff\4\2",
            "",
            "\1\2\1\10\1\2\1\6\1\uffff\4\2\1\7\12\2\1\uffff\4\2"
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
            return "6367:1: ( rule__CodeBlock__Group_1__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_entryRuleChapter121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChapter128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0_in_ruleChapter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0_in_ruleSection214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0_in_ruleSection3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0_in_ruleSection4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group__0_in_ruleTextOrMarkup456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_entryRuleTextOrMarkupLine483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkupLine490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Alternatives_in_ruleTextOrMarkupLine516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0_in_ruleAnchor696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_entryRuleParBreak1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParBreak1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParBreak__CAssignment_in_ruleParBreak1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText1358 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText1370 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_0__0_in_rule__Document__Alternatives_11608 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_rule__Document__Group_1_0__0_in_rule__Document__Alternatives_11620 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_rule__Document__Group_1_1__0_in_rule__Document__Alternatives_11643 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Document__Group_1_1__0_in_rule__Document__Alternatives_11655 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Document__Group_1_2__0_in_rule__Document__Alternatives_11678 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__Document__Group_1_2__0_in_rule__Document__Alternatives_11690 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0__0_in_rule__TextOrMarkup__Alternatives_11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_1__0_in_rule__TextOrMarkup__Alternatives_11747 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_1__0_in_rule__TextOrMarkup__Alternatives_11759 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0__0_in_rule__TextOrMarkupLine__Alternatives1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_1__0_in_rule__TextOrMarkupLine__Alternatives1815 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_1__0_in_rule__TextOrMarkupLine__Alternatives1827 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkUp__Alternatives1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__MarkUp__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0__0_in_rule__CodeBlock__Alternatives_52031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_1__0_in_rule__CodeBlock__Alternatives_52051 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_1__0_in_rule__CodeBlock__Alternatives_52063 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Text__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Text__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Text__Alternatives2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Text__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Text__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__CodeText__Alternatives2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__CodeText__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CodeText__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02432 = new BitSet(new long[]{0x0000000000019080L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12493 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Alternatives_1_in_rule__Document__Group__1__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ContentsAssignment_2_in_rule__Document__Group__2__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_0__0__Impl_in_rule__Document__Group_1_0__02617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Document__Group_1_0__1_in_rule__Document__Group_1_0__02620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ContentsAssignment_1_0_0_in_rule__Document__Group_1_0__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_0__1__Impl_in_rule__Document__Group_1_0__12678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_1_0_1_in_rule__Document__Group_1_0__1__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_1__0__Impl_in_rule__Document__Group_1_1__02739 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Document__Group_1_1__1_in_rule__Document__Group_1_1__02742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ContentsAssignment_1_1_0_in_rule__Document__Group_1_1__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_1__1__Impl_in_rule__Document__Group_1_1__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_1_1_1_in_rule__Document__Group_1_1__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_2__0__Impl_in_rule__Document__Group_1_2__02861 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Document__Group_1_2__1_in_rule__Document__Group_1_2__02864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ContentsAssignment_1_2_0_in_rule__Document__Group_1_2__0__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_1_2__1__Impl_in_rule__Document__Group_1_2__12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_1_2_1_in_rule__Document__Group_1_2__1__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__02983 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__02986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Chapter__Group__0__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13045 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__0_in_rule__Chapter__Group__1__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23106 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Chapter__Group__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__TitleAssignment_3_in_rule__Chapter__Group__3__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43228 = new BitSet(new long[]{0x00000000000080A2L});
    public static final BitSet FOLLOW_rule__Chapter__Group__5_in_rule__Chapter__Group__43231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Chapter__Group__4__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__5__Impl_in_rule__Chapter__Group__53290 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Chapter__Group__6_in_rule__Chapter__Group__53293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Chapter__Group__5__Impl3321 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Chapter__Group__6__Impl_in_rule__Chapter__Group__63352 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Chapter__Group__7_in_rule__Chapter__Group__63355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__0_in_rule__Chapter__Group__6__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__7__Impl_in_rule__Chapter__Group__73413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_7__0_in_rule__Chapter__Group__7__Impl3440 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__0__Impl_in_rule__Chapter__Group_1__03487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__1_in_rule__Chapter__Group_1__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Chapter__Group_1__0__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_1__1__Impl_in_rule__Chapter__Group_1__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__NameAssignment_1_1_in_rule__Chapter__Group_1__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__0__Impl_in_rule__Chapter__Group_6__03610 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__1_in_rule__Chapter__Group_6__03613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6_0__0_in_rule__Chapter__Group_6__0__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6__1__Impl_in_rule__Chapter__Group_6__13670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_6_1_in_rule__Chapter__Group_6__1__Impl3697 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6_0__0__Impl_in_rule__Chapter__Group_6_0__03732 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6_0__1_in_rule__Chapter__Group_6_0__03735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_6_0_0_in_rule__Chapter__Group_6_0__0__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_6_0__1__Impl_in_rule__Chapter__Group_6_0__13792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_6_0_1_in_rule__Chapter__Group_6_0__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_7__0__Impl_in_rule__Chapter__Group_7__03853 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Chapter__Group_7__1_in_rule__Chapter__Group_7__03856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_7_0_in_rule__Chapter__Group_7__0__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_7__1__Impl_in_rule__Chapter__Group_7__13914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_7_1_in_rule__Chapter__Group_7__1__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__03975 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__03978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section__Group__0__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14037 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_1__0_in_rule__Section__Group__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24098 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section__Group__2__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34160 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44220 = new BitSet(new long[]{0x00000000000100A2L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__44223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section__Group__4__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__54282 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__54285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Section__Group__5__Impl4313 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__64344 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__Section__Group__7_in_rule__Section__Group__64347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0_in_rule__Section__Group__6__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__74405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_7__0_in_rule__Section__Group__7__Impl4432 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_rule__Section__Group_1__0__Impl_in_rule__Section__Group_1__04479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group_1__1_in_rule__Section__Group_1__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section__Group_1__0__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_1__1__Impl_in_rule__Section__Group_1__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_1_1_in_rule__Section__Group_1__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__0__Impl_in_rule__Section__Group_6__04602 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1_in_rule__Section__Group_6__04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6_0__0_in_rule__Section__Group_6__0__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6__1__Impl_in_rule__Section__Group_6__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_6_1_in_rule__Section__Group_6__1__Impl4689 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section__Group_6_0__0__Impl_in_rule__Section__Group_6_0__04724 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section__Group_6_0__1_in_rule__Section__Group_6_0__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_6_0_0_in_rule__Section__Group_6_0__0__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_6_0__1__Impl_in_rule__Section__Group_6_0__14784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_6_0_1_in_rule__Section__Group_6_0__1__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_7__0__Impl_in_rule__Section__Group_7__04845 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Section__Group_7__1_in_rule__Section__Group_7__04848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_7_0_in_rule__Section__Group_7__0__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_7__1__Impl_in_rule__Section__Group_7__14906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_7_1_in_rule__Section__Group_7__1__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__04967 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubSection__Group__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15029 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__0_in_rule__SubSection__Group__1__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25090 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubSection__Group__2__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__TitleAssignment_3_in_rule__SubSection__Group__3__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45212 = new BitSet(new long[]{0x00000000000200A2L});
    public static final BitSet FOLLOW_rule__SubSection__Group__5_in_rule__SubSection__Group__45215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubSection__Group__4__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__5__Impl_in_rule__SubSection__Group__55274 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__SubSection__Group__6_in_rule__SubSection__Group__55277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__SubSection__Group__5__Impl5305 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SubSection__Group__6__Impl_in_rule__SubSection__Group__65336 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__SubSection__Group__7_in_rule__SubSection__Group__65339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__0_in_rule__SubSection__Group__6__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__7__Impl_in_rule__SubSection__Group__75397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_7__0_in_rule__SubSection__Group__7__Impl5424 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__0__Impl_in_rule__SubSection__Group_1__05471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__1_in_rule__SubSection__Group_1__05474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SubSection__Group_1__0__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_1__1__Impl_in_rule__SubSection__Group_1__15533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__NameAssignment_1_1_in_rule__SubSection__Group_1__1__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__0__Impl_in_rule__SubSection__Group_6__05594 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__1_in_rule__SubSection__Group_6__05597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6_0__0_in_rule__SubSection__Group_6__0__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6__1__Impl_in_rule__SubSection__Group_6__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_6_1_in_rule__SubSection__Group_6__1__Impl5681 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6_0__0__Impl_in_rule__SubSection__Group_6_0__05716 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6_0__1_in_rule__SubSection__Group_6_0__05719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_6_0_0_in_rule__SubSection__Group_6_0__0__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_6_0__1__Impl_in_rule__SubSection__Group_6_0__15776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_6_0_1_in_rule__SubSection__Group_6_0__1__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_7__0__Impl_in_rule__SubSection__Group_7__05837 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_7__1_in_rule__SubSection__Group_7__05840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_7_0_in_rule__SubSection__Group_7__0__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_7__1__Impl_in_rule__SubSection__Group_7__15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_7_1_in_rule__SubSection__Group_7__1__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05959 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Section3__Group__0__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16021 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__0_in_rule__Section3__Group__1__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26082 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section3__Group__2__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__TitleAssignment_3_in_rule__Section3__Group__3__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46204 = new BitSet(new long[]{0x00000000000400A2L});
    public static final BitSet FOLLOW_rule__Section3__Group__5_in_rule__Section3__Group__46207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section3__Group__4__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__5__Impl_in_rule__Section3__Group__56266 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_rule__Section3__Group__6_in_rule__Section3__Group__56269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Section3__Group__5__Impl6297 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Section3__Group__6__Impl_in_rule__Section3__Group__66328 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_rule__Section3__Group__7_in_rule__Section3__Group__66331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__0_in_rule__Section3__Group__6__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__7__Impl_in_rule__Section3__Group__76389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_7__0_in_rule__Section3__Group__7__Impl6416 = new BitSet(new long[]{0x0000000000040082L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__0__Impl_in_rule__Section3__Group_1__06463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__1_in_rule__Section3__Group_1__06466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section3__Group_1__0__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_1__1__Impl_in_rule__Section3__Group_1__16525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__NameAssignment_1_1_in_rule__Section3__Group_1__1__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__0__Impl_in_rule__Section3__Group_6__06586 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__1_in_rule__Section3__Group_6__06589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6_0__0_in_rule__Section3__Group_6__0__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6__1__Impl_in_rule__Section3__Group_6__16646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_6_1_in_rule__Section3__Group_6__1__Impl6673 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section3__Group_6_0__0__Impl_in_rule__Section3__Group_6_0__06708 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section3__Group_6_0__1_in_rule__Section3__Group_6_0__06711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_6_0_0_in_rule__Section3__Group_6_0__0__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_6_0__1__Impl_in_rule__Section3__Group_6_0__16768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_6_0_1_in_rule__Section3__Group_6_0__1__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_7__0__Impl_in_rule__Section3__Group_7__06829 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section3__Group_7__1_in_rule__Section3__Group_7__06832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_7_0_in_rule__Section3__Group_7__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_7__1__Impl_in_rule__Section3__Group_7__16890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_7_1_in_rule__Section3__Group_7__1__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06951 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section4__Group__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__17013 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__17016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__0_in_rule__Section4__Group__1__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__27074 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__27077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section4__Group__2__Impl7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__37136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Section4__Group__4_in_rule__Section4__Group__37139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__TitleAssignment_3_in_rule__Section4__Group__3__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__4__Impl_in_rule__Section4__Group__47196 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_rule__Section4__Group__5_in_rule__Section4__Group__47199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section4__Group__4__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__5__Impl_in_rule__Section4__Group__57258 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section4__Group__6_in_rule__Section4__Group__57261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Section4__Group__5__Impl7289 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Section4__Group__6__Impl_in_rule__Section4__Group__67320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_6__0_in_rule__Section4__Group__6__Impl7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__0__Impl_in_rule__Section4__Group_1__07392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__1_in_rule__Section4__Group_1__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section4__Group_1__0__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_1__1__Impl_in_rule__Section4__Group_1__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__NameAssignment_1_1_in_rule__Section4__Group_1__1__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_6__0__Impl_in_rule__Section4__Group_6__07515 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section4__Group_6__1_in_rule__Section4__Group_6__07518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_6_0__0_in_rule__Section4__Group_6__0__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_6__1__Impl_in_rule__Section4__Group_6__17575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_6_1_in_rule__Section4__Group_6__1__Impl7602 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Section4__Group_6_0__0__Impl_in_rule__Section4__Group_6_0__07637 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Section4__Group_6_0__1_in_rule__Section4__Group_6_0__07640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_6_0_0_in_rule__Section4__Group_6_0__0__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_6_0__1__Impl_in_rule__Section4__Group_6_0__17697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_6_0_1_in_rule__Section4__Group_6_0__1__Impl7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group__0__Impl_in_rule__TextOrMarkup__Group__07758 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group__1_in_rule__TextOrMarkup__Group__07761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_in_rule__TextOrMarkup__Group__0__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group__1__Impl_in_rule__TextOrMarkup__Group__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Alternatives_1_in_rule__TextOrMarkup__Group__1__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0__0__Impl_in_rule__TextOrMarkup__Group_1_0__07879 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0__1_in_rule__TextOrMarkup__Group_1_0__07882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_0_in_rule__TextOrMarkup__Group_1_0__0__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0__1__Impl_in_rule__TextOrMarkup__Group_1_0__17939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0_1__0_in_rule__TextOrMarkup__Group_1_0__1__Impl7966 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0_1__0__Impl_in_rule__TextOrMarkup__Group_1_0_1__08001 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0_1__1_in_rule__TextOrMarkup__Group_1_0_1__08004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_1_0_in_rule__TextOrMarkup__Group_1_0_1__0__Impl8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_0_1__1__Impl_in_rule__TextOrMarkup__Group_1_0_1__18061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_1_1_in_rule__TextOrMarkup__Group_1_0_1__1__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_1__0__Impl_in_rule__TextOrMarkup__Group_1_1__08123 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_1__1_in_rule__TextOrMarkup__Group_1_1__08126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_0_in_rule__TextOrMarkup__Group_1_1__0__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1_1__1__Impl_in_rule__TextOrMarkup__Group_1_1__18183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_1_in_rule__TextOrMarkup__Group_1_1__1__Impl8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0__0__Impl_in_rule__TextOrMarkupLine__Group_0__08245 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0__1_in_rule__TextOrMarkupLine__Group_0__08248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_0_in_rule__TextOrMarkupLine__Group_0__0__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0__1__Impl_in_rule__TextOrMarkupLine__Group_0__18305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0_1__0_in_rule__TextOrMarkupLine__Group_0__1__Impl8332 = new BitSet(new long[]{0x000000001EF80002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0_1__0__Impl_in_rule__TextOrMarkupLine__Group_0_1__08367 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0_1__1_in_rule__TextOrMarkupLine__Group_0_1__08370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_1_0_in_rule__TextOrMarkupLine__Group_0_1__0__Impl8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_0_1__1__Impl_in_rule__TextOrMarkupLine__Group_0_1__18427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_0_1_1_in_rule__TextOrMarkupLine__Group_0_1__1__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_1__0__Impl_in_rule__TextOrMarkupLine__Group_1__08489 = new BitSet(new long[]{0x0000000000000E72L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_1__1_in_rule__TextOrMarkupLine__Group_1__08492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_1_0_in_rule__TextOrMarkupLine__Group_1__0__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__Group_1__1__Impl_in_rule__TextOrMarkupLine__Group_1__18549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkupLine__ContentsAssignment_1_1_in_rule__TextOrMarkupLine__Group_1__1__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__08611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__08614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Emphasize__Group__0__Impl8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__18673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__0_in_rule__Emphasize__Group__1__Impl8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__0__Impl_in_rule__Emphasize__Group_1__08734 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__1_in_rule__Emphasize__Group_1__08737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Emphasize__Group_1__0__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__1__Impl_in_rule__Emphasize__Group_1__18796 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__2_in_rule__Emphasize__Group_1__18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__ContentsAssignment_1_1_in_rule__Emphasize__Group_1__1__Impl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group_1__2__Impl_in_rule__Emphasize__Group_1__28856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Emphasize__Group_1__2__Impl8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08921 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Anchor__Group__0__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Anchor__Group__1__Impl9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__29045 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__3_in_rule__Anchor__Group__29048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__NameAssignment_2_in_rule__Anchor__Group__2__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__3__Impl_in_rule__Anchor__Group__39105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__0_in_rule__Anchor__Group__3__Impl9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__0__Impl_in_rule__Anchor__Group_3__09171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__1_in_rule__Anchor__Group_3__09174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Anchor__Group_3__0__Impl9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group_3__1__Impl_in_rule__Anchor__Group_3__19233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Anchor__Group_3__1__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__09296 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__09299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Ref__Group__0__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__19358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__19361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Ref__Group__1__Impl9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__29420 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__29423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__RefAssignment_2_in_rule__Ref__Group__2__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__39480 = new BitSet(new long[]{0x000000001EF80E70L});
    public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__39483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Ref__Group__3__Impl9511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__49542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__49545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__59602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Ref__Group__5__Impl9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__09673 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__09676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OrderedList__Group__0__Impl9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__19735 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__19738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__OrderedList__Group__1__Impl9766 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__29797 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__29800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OrderedList__Group__2__Impl9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__39859 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__4_in_rule__OrderedList__Group__39862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__OrderedList__Group__3__Impl9890 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__4__Impl_in_rule__OrderedList__Group__49921 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__5_in_rule__OrderedList__Group__49924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_4_in_rule__OrderedList__Group__4__Impl9953 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_4_in_rule__OrderedList__Group__4__Impl9965 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__5__Impl_in_rule__OrderedList__Group__59998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OrderedList__Group__5__Impl10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__010069 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__010072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnorderedList__Group__0__Impl10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__110131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__110134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__UnorderedList__Group__1__Impl10162 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__210193 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__210196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnorderedList__Group__2__Impl10224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__310255 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__4_in_rule__UnorderedList__Group__310258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__UnorderedList__Group__3__Impl10286 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__4__Impl_in_rule__UnorderedList__Group__410317 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__5_in_rule__UnorderedList__Group__410320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_4_in_rule__UnorderedList__Group__4__Impl10349 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_4_in_rule__UnorderedList__Group__4__Impl10361 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__5__Impl_in_rule__UnorderedList__Group__510394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnorderedList__Group__5__Impl10422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__010465 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__010468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Item__Group__0__Impl10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__110527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__110530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Item__Group__1__Impl10558 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__210589 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Item__Group__3_in_rule__Item__Group__210592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Item__Group__2__Impl10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__310651 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Item__Group__4_in_rule__Item__Group__310654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_3_in_rule__Item__Group__3__Impl10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__410711 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Item__Group__5_in_rule__Item__Group__410714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_4__0_in_rule__Item__Group__4__Impl10741 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Item__Group__5__Impl_in_rule__Item__Group__510772 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Item__Group__6_in_rule__Item__Group__510775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Item__Group__5__Impl10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__6__Impl_in_rule__Item__Group__610834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Item__Group__6__Impl10862 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Item__Group_4__0__Impl_in_rule__Item__Group_4__010907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Item__Group_4__1_in_rule__Item__Group_4__010910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_4_0_in_rule__Item__Group_4__0__Impl10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_4__1__Impl_in_rule__Item__Group_4__110967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_4_1_in_rule__Item__Group_4__1__Impl10994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__011028 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__011031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CodeRef__Group__0__Impl11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__111090 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__111093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CodeRef__Group__1__Impl11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__211152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__3_in_rule__CodeRef__Group__211155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__ElementAssignment_2_in_rule__CodeRef__Group__2__Impl11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__3__Impl_in_rule__CodeRef__Group__311212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeRef__Group__3__Impl11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__011279 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__011282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group__0__Impl11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__111341 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__111344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Link__Group__1__Impl11372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__211403 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__211406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_2_in_rule__Link__Group__2__Impl11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__311463 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__311466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Link__Group__3__Impl11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__411525 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__411528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Link__Group__4__Impl11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__511587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Link__Group__6_in_rule__Link__Group__511590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__611647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Link__Group__6__Impl11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__011720 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__011723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ImageRef__Group__0__Impl11751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__111782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__111785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_1__0_in_rule__ImageRef__Group__1__Impl11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__211843 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__211846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ImageRef__Group__2__Impl11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__311905 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__311908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__PathAssignment_3_in_rule__ImageRef__Group__3__Impl11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__411965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__411968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__4__Impl11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__512027 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__512030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ImageRef__Group__5__Impl12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__612089 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__612092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__ClazzAssignment_6_in_rule__ImageRef__Group__6__Impl12119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__712149 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__712152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__7__Impl12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__812211 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__812214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ImageRef__Group__8__Impl12242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__912273 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__912276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1012333 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1012336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__10__Impl12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1112395 = new BitSet(new long[]{0x0000000000000E70L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1112398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ImageRef__Group__11__Impl12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1212457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1212460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__CaptionAssignment_12_in_rule__ImageRef__Group__12__Impl12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1312517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImageRef__Group__13__Impl12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_1__0__Impl_in_rule__ImageRef__Group_1__012604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_1__1_in_rule__ImageRef__Group_1__012607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ImageRef__Group_1__0__Impl12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_1__1__Impl_in_rule__ImageRef__Group_1__112666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__NameAssignment_1_1_in_rule__ImageRef__Group_1__1__Impl12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__012727 = new BitSet(new long[]{0x00000000000020A0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__012730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CodeBlock__Group__0__Impl12758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__112789 = new BitSet(new long[]{0x00000000000020A0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__112792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__212850 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__212853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeBlock__Group__2__Impl12881 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__312912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__4_in_rule__CodeBlock__Group__312915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__CodeBlock__Group__3__Impl12943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__4__Impl_in_rule__CodeBlock__Group__412974 = new BitSet(new long[]{0x0000000000380EF0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__5_in_rule__CodeBlock__Group__412977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CodeBlock__Group__4__Impl13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__5__Impl_in_rule__CodeBlock__Group__513036 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__6_in_rule__CodeBlock__Group__513039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Alternatives_5_in_rule__CodeBlock__Group__5__Impl13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__6__Impl_in_rule__CodeBlock__Group__613096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeBlock__Group__6__Impl13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__013169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__013172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CodeBlock__Group_1__0__Impl13200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__113231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__113234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl13261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__213291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CodeBlock__Group_1__2__Impl13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0__0__Impl_in_rule__CodeBlock__Group_5_0__013356 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0__1_in_rule__CodeBlock__Group_5_0__013359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_0_in_rule__CodeBlock__Group_5_0__0__Impl13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0__1__Impl_in_rule__CodeBlock__Group_5_0__113416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0_1__0_in_rule__CodeBlock__Group_5_0__1__Impl13443 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0_1__0__Impl_in_rule__CodeBlock__Group_5_0_1__013478 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0_1__1_in_rule__CodeBlock__Group_5_0_1__013481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_1_0_in_rule__CodeBlock__Group_5_0_1__0__Impl13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_0_1__1__Impl_in_rule__CodeBlock__Group_5_0_1__113538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_5_0_1_1_in_rule__CodeBlock__Group_5_0_1__1__Impl13565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_1__0__Impl_in_rule__CodeBlock__Group_5_1__013600 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_1__1_in_rule__CodeBlock__Group_5_1__013603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_5_1_0_in_rule__CodeBlock__Group_5_1__0__Impl13630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_5_1__1__Impl_in_rule__CodeBlock__Group_5_1__113660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_5_1_1_in_rule__CodeBlock__Group_5_1__1__Impl13687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_0_013727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_1_0_113758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_1_013789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_1_1_113820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_1_2_013851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_1_2_113882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Document__ContentsAssignment_213913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_1_113944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Chapter__TitleAssignment_313975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Chapter__ContentsAssignment_6_0_014006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Chapter__ContentsAssignment_6_0_114037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_6_114068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Chapter__ContentsAssignment_7_014099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_7_114130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_1_114161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section__TitleAssignment_314192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Section__ContentsAssignment_6_0_014223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section__ContentsAssignment_6_0_114254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_6_114285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Section__ContentsAssignment_7_014316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_7_114347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_1_114378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__SubSection__TitleAssignment_314409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__SubSection__ContentsAssignment_6_0_014440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__SubSection__ContentsAssignment_6_0_114471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_6_114502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__SubSection__ContentsAssignment_7_014533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_7_114564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_1_114595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section3__TitleAssignment_314626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Section3__ContentsAssignment_6_0_014657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section3__ContentsAssignment_6_0_114688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_6_114719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Section3__ContentsAssignment_7_014750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_7_114781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_1_114812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section4__TitleAssignment_314843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Section4__ContentsAssignment_6_0_014874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Section4__ContentsAssignment_6_0_114905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_6_114936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__TextOrMarkup__ContentsAssignment_014967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_0_014998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_0_1_015029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_0_1_115060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_1_015091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_1_115122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_0_015153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkupLine__ContentsAssignment_0_1_015184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_0_1_115215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkupLine__ContentsAssignment_1_015246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkupLine__ContentsAssignment_1_115277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Emphasize__ContentsAssignment_1_115308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_215339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_215374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkupLine_in_rule__Ref__ContentsAssignment_415409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_415440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_415471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_315502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParBreak_in_rule__Item__ContentsAssignment_4_015533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_4_115564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_215599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__UrlAssignment_215634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__TextAssignment_515665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_1_115696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_315727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_615758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_915789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1215820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_115851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_0_015882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_5_0_1_015913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_0_1_115944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_5_1_015975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_5_1_116006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__ParBreak__CAssignment16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__TextPart__TextAssignment16068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment16099 = new BitSet(new long[]{0x0000000000000002L});

}