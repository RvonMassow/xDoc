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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_MULTI_NL", "RULE_SL_COMMENT", "'chapter['", "'section['", "'subsection['", "'section3['", "'section4['", "'\\\\['", "'\\\\]'", "'img['", "':'", "']'", "'chapter:'", "'['", "'section:'", "'subsection:'", "'section3:'", "'section4:'", "'emph['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'code['"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int EOF=-1;
    public static final int RULE_MULTI_NL=8;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_SL_COMMENT=9;

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:240:1: ruleTextOrMarkup : ( ( rule__TextOrMarkup__Alternatives ) ) ;
    public final void ruleTextOrMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:244:2: ( ( ( rule__TextOrMarkup__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( ( rule__TextOrMarkup__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:246:1: ( rule__TextOrMarkup__Alternatives )
            {
             before(grammarAccess.getTextOrMarkupAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:1: ( rule__TextOrMarkup__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:247:2: rule__TextOrMarkup__Alternatives
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup456);
            rule__TextOrMarkup__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleTextPart
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:259:1: entryRuleTextPart : ruleTextPart EOF ;
    public final void entryRuleTextPart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:260:1: ( ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:261:1: ruleTextPart EOF
            {
             before(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart483);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart490); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:268:1: ruleTextPart : ( ( rule__TextPart__TextAssignment ) ) ;
    public final void ruleTextPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:272:2: ( ( ( rule__TextPart__TextAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextPart__TextAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextPart__TextAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:274:1: ( rule__TextPart__TextAssignment )
            {
             before(grammarAccess.getTextPartAccess().getTextAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:1: ( rule__TextPart__TextAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:2: rule__TextPart__TextAssignment
            {
            pushFollow(FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart516);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:287:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:288:1: ( ruleText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:289:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText543);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText550); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:296:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:300:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( ( rule__Text__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:1: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:304:1: ( rule__Text__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:304:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText578);
            rule__Text__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:307:1: ( ( rule__Text__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:308:1: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:309:1: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:309:2: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText590);
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


    // $ANTLR start entryRuleMarkUp
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:322:1: entryRuleMarkUp : ruleMarkUp EOF ;
    public final void entryRuleMarkUp() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:323:1: ( ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:324:1: ruleMarkUp EOF
            {
             before(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp620);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getMarkUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp627); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:331:1: ruleMarkUp : ( ( rule__MarkUp__Alternatives ) ) ;
    public final void ruleMarkUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:335:2: ( ( ( rule__MarkUp__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:336:1: ( ( rule__MarkUp__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:336:1: ( ( rule__MarkUp__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:337:1: ( rule__MarkUp__Alternatives )
            {
             before(grammarAccess.getMarkUpAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:338:1: ( rule__MarkUp__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:338:2: rule__MarkUp__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp653);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:350:1: entryRuleEmphasize : ruleEmphasize EOF ;
    public final void entryRuleEmphasize() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:351:1: ( ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:352:1: ruleEmphasize EOF
            {
             before(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize680);
            ruleEmphasize();
            _fsp--;

             after(grammarAccess.getEmphasizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize687); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:359:1: ruleEmphasize : ( ( rule__Emphasize__Group__0 ) ) ;
    public final void ruleEmphasize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:363:2: ( ( ( rule__Emphasize__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__Emphasize__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__Emphasize__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:365:1: ( rule__Emphasize__Group__0 )
            {
             before(grammarAccess.getEmphasizeAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:1: ( rule__Emphasize__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:2: rule__Emphasize__Group__0
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize713);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:378:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:379:1: ( ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:380:1: ruleAnchor EOF
            {
             before(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor740);
            ruleAnchor();
            _fsp--;

             after(grammarAccess.getAnchorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor747); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:387:1: ruleAnchor : ( ( rule__Anchor__Group__0 ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:391:2: ( ( ( rule__Anchor__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Anchor__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Anchor__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:393:1: ( rule__Anchor__Group__0 )
            {
             before(grammarAccess.getAnchorAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:1: ( rule__Anchor__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:2: rule__Anchor__Group__0
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0_in_ruleAnchor773);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:406:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:407:1: ( ruleRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:408:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef800);
            ruleRef();
            _fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef807); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:415:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:419:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Ref__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:421:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:1: ( rule__Ref__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:2: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_rule__Ref__Group__0_in_ruleRef833);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:434:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:435:1: ( ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:436:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList860);
            ruleOrderedList();
            _fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList867); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:443:1: ruleOrderedList : ( ( rule__OrderedList__Group__0 ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:447:2: ( ( ( rule__OrderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__OrderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__OrderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:449:1: ( rule__OrderedList__Group__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:1: ( rule__OrderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:2: rule__OrderedList__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList893);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:462:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:463:1: ( ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:464:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList920);
            ruleUnorderedList();
            _fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList927); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:471:1: ruleUnorderedList : ( ( rule__UnorderedList__Group__0 ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:475:2: ( ( ( rule__UnorderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__UnorderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__UnorderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:477:1: ( rule__UnorderedList__Group__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:1: ( rule__UnorderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:2: rule__UnorderedList__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList953);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:490:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:491:1: ( ruleItem EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:492:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem980);
            ruleItem();
            _fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem987); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:499:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:503:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__Item__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__Item__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:505:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:1: ( rule__Item__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem1013);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:518:1: entryRuleCodeRef : ruleCodeRef EOF ;
    public final void entryRuleCodeRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:519:1: ( ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:520:1: ruleCodeRef EOF
            {
             before(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef1040);
            ruleCodeRef();
            _fsp--;

             after(grammarAccess.getCodeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef1047); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:527:1: ruleCodeRef : ( ( rule__CodeRef__Group__0 ) ) ;
    public final void ruleCodeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:531:2: ( ( ( rule__CodeRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__CodeRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__CodeRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:533:1: ( rule__CodeRef__Group__0 )
            {
             before(grammarAccess.getCodeRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:1: ( rule__CodeRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:2: rule__CodeRef__Group__0
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1073);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:546:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:547:1: ( ruleLink EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:548:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1100);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1107); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:555:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:559:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:561:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:1: ( rule__Link__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1133);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:574:1: entryRuleImageRef : ruleImageRef EOF ;
    public final void entryRuleImageRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:575:1: ( ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:576:1: ruleImageRef EOF
            {
             before(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef1160);
            ruleImageRef();
            _fsp--;

             after(grammarAccess.getImageRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef1167); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:583:1: ruleImageRef : ( ( rule__ImageRef__Group__0 ) ) ;
    public final void ruleImageRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:587:2: ( ( ( rule__ImageRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__ImageRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__ImageRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:589:1: ( rule__ImageRef__Group__0 )
            {
             before(grammarAccess.getImageRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:1: ( rule__ImageRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:2: rule__ImageRef__Group__0
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1193);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:602:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:603:1: ( ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:604:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1220);
            ruleCodeBlock();
            _fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock1227); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:611:1: ruleCodeBlock : ( ( rule__CodeBlock__Group__0 ) ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:615:2: ( ( ( rule__CodeBlock__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__CodeBlock__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__CodeBlock__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:617:1: ( rule__CodeBlock__Group__0 )
            {
             before(grammarAccess.getCodeBlockAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:1: ( rule__CodeBlock__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:2: rule__CodeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1253);
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


    // $ANTLR start entryRuleCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:630:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:631:1: ( ruleCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:632:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode1280);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode1287); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:639:1: ruleCode : ( ( rule__Code__ContentsAssignment ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:643:2: ( ( ( rule__Code__ContentsAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__Code__ContentsAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__Code__ContentsAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:645:1: ( rule__Code__ContentsAssignment )
            {
             before(grammarAccess.getCodeAccess().getContentsAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:1: ( rule__Code__ContentsAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:2: rule__Code__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1313);
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


    // $ANTLR start entryRuleMarkupInCode
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:658:1: entryRuleMarkupInCode : ruleMarkupInCode EOF ;
    public final void entryRuleMarkupInCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:659:1: ( ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:660:1: ruleMarkupInCode EOF
            {
             before(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1340);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getMarkupInCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode1347); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:667:1: ruleMarkupInCode : ( ( rule__MarkupInCode__Alternatives ) ) ;
    public final void ruleMarkupInCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:671:2: ( ( ( rule__MarkupInCode__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__MarkupInCode__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__MarkupInCode__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:673:1: ( rule__MarkupInCode__Alternatives )
            {
             before(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:1: ( rule__MarkupInCode__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:2: rule__MarkupInCode__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1373);
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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_MULTI_NL)||(LA2_0>=15 && LA2_0<=16)||LA2_0==18) ) {
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


    // $ANTLR start entryRuleANY_WS
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:721:1: entryRuleANY_WS : ruleANY_WS EOF ;
    public final void entryRuleANY_WS() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:722:1: ( ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:723:1: ruleANY_WS EOF
            {
             before(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS1477);
            ruleANY_WS();
            _fsp--;

             after(grammarAccess.getANY_WSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS1484); 

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
    // $ANTLR end entryRuleANY_WS


    // $ANTLR start ruleANY_WS
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:730:1: ruleANY_WS : ( ( rule__ANY_WS__Alternatives ) ) ;
    public final void ruleANY_WS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:734:2: ( ( ( rule__ANY_WS__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__ANY_WS__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( ( rule__ANY_WS__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:736:1: ( rule__ANY_WS__Alternatives )
            {
             before(grammarAccess.getANY_WSAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:1: ( rule__ANY_WS__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:737:2: rule__ANY_WS__Alternatives
            {
            pushFollow(FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1510);
            rule__ANY_WS__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getANY_WSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleANY_WS


    // $ANTLR start rule__Document__Alternatives_3_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:749:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );
    public final void rule__Document__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:753:1: ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 10:
            case 20:
                {
                alt3=1;
                }
                break;
            case 11:
            case 22:
                {
                alt3=2;
                }
                break;
            case 12:
            case 23:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("749:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:754:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:754:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:755:1: ( rule__Document__Group_3_0_0__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:756:1: ( rule__Document__Group_3_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:756:2: rule__Document__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01546);
                    rule__Document__Group_3_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:760:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:760:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:761:1: ( rule__Document__Group_3_0_1__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:1: ( rule__Document__Group_3_0_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:2: rule__Document__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01564);
                    rule__Document__Group_3_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:766:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:766:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:767:1: ( rule__Document__Group_3_0_2__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_2()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:768:1: ( rule__Document__Group_3_0_2__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:768:2: rule__Document__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01582);
                    rule__Document__Group_3_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_2()); 

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
    // $ANTLR end rule__Document__Alternatives_3_0


    // $ANTLR start rule__Chapter__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:777:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );
    public final void rule__Chapter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:781:1: ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("777:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( rule__Chapter__Group_0_0__0 )
                    {
                     before(grammarAccess.getChapterAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:1: ( rule__Chapter__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:2: rule__Chapter__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01615);
                    rule__Chapter__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( 'chapter[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( 'chapter[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:1: 'chapter['
                    {
                     before(grammarAccess.getChapterAccess().getChapterKeyword_0_1()); 
                    match(input,10,FOLLOW_10_in_rule__Chapter__Alternatives_01634); 
                     after(grammarAccess.getChapterAccess().getChapterKeyword_0_1()); 

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
    // $ANTLR end rule__Chapter__Alternatives_0


    // $ANTLR start rule__Section__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:801:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );
    public final void rule__Section__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:805:1: ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("801:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:806:1: ( ( rule__Section__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:806:1: ( ( rule__Section__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:807:1: ( rule__Section__Group_0_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:1: ( rule__Section__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:808:2: rule__Section__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01668);
                    rule__Section__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:6: ( 'section[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:6: ( 'section[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:813:1: 'section['
                    {
                     before(grammarAccess.getSectionAccess().getSectionKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Section__Alternatives_01687); 
                     after(grammarAccess.getSectionAccess().getSectionKeyword_0_1()); 

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
    // $ANTLR end rule__Section__Alternatives_0


    // $ANTLR start rule__SubSection__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:825:1: rule__SubSection__Alternatives_0 : ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) );
    public final void rule__SubSection__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:829:1: ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("825:1: rule__SubSection__Alternatives_0 : ( ( ( rule__SubSection__Group_0_0__0 ) ) | ( 'subsection[' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:1: ( ( rule__SubSection__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:830:1: ( ( rule__SubSection__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:831:1: ( rule__SubSection__Group_0_0__0 )
                    {
                     before(grammarAccess.getSubSectionAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:1: ( rule__SubSection__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:832:2: rule__SubSection__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__SubSection__Group_0_0__0_in_rule__SubSection__Alternatives_01721);
                    rule__SubSection__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSubSectionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( 'subsection[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:6: ( 'subsection[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:837:1: 'subsection['
                    {
                     before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__SubSection__Alternatives_01740); 
                     after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_1()); 

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
    // $ANTLR end rule__SubSection__Alternatives_0


    // $ANTLR start rule__Section3__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:849:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );
    public final void rule__Section3__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:853:1: ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("849:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:854:1: ( ( rule__Section3__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:854:1: ( ( rule__Section3__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:855:1: ( rule__Section3__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection3Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:856:1: ( rule__Section3__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:856:2: rule__Section3__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01774);
                    rule__Section3__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection3Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:6: ( 'section3[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:6: ( 'section3[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:861:1: 'section3['
                    {
                     before(grammarAccess.getSection3Access().getSection3Keyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Section3__Alternatives_01793); 
                     after(grammarAccess.getSection3Access().getSection3Keyword_0_1()); 

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
    // $ANTLR end rule__Section3__Alternatives_0


    // $ANTLR start rule__Section4__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:873:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );
    public final void rule__Section4__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:877:1: ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("873:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:878:1: ( ( rule__Section4__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:878:1: ( ( rule__Section4__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:879:1: ( rule__Section4__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection4Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:880:1: ( rule__Section4__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:880:2: rule__Section4__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01827);
                    rule__Section4__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection4Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:6: ( 'section4[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:6: ( 'section4[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:885:1: 'section4['
                    {
                     before(grammarAccess.getSection4Access().getSection4Keyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Section4__Alternatives_01846); 
                     after(grammarAccess.getSection4Access().getSection4Keyword_0_1()); 

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
    // $ANTLR end rule__Section4__Alternatives_0


    // $ANTLR start rule__TextOrMarkup__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:898:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );
    public final void rule__TextOrMarkup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:902:1: ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_ANY_OTHER)||(LA10_0>=15 && LA10_0<=16)) ) {
                alt10=1;
            }
            else if ( (LA10_0==17||(LA10_0>=26 && LA10_0<=30)||(LA10_0>=32 && LA10_0<=35)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("898:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:903:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:903:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:904:1: ( rule__TextOrMarkup__Group_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:905:1: ( rule__TextOrMarkup__Group_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:905:2: rule__TextOrMarkup__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1881);
                    rule__TextOrMarkup__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:909:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:909:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:910:1: ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:910:1: ( ( rule__TextOrMarkup__Group_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:911:1: ( rule__TextOrMarkup__Group_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:1: ( rule__TextOrMarkup__Group_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:2: rule__TextOrMarkup__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1901);
                    rule__TextOrMarkup__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:915:1: ( ( rule__TextOrMarkup__Group_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:916:1: ( rule__TextOrMarkup__Group_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:917:1: ( rule__TextOrMarkup__Group_1__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17||(LA9_0>=26 && LA9_0<=30)||(LA9_0>=32 && LA9_0<=35)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:917:2: rule__TextOrMarkup__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1913);
                    	    rule__TextOrMarkup__Group_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

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
    // $ANTLR end rule__TextOrMarkup__Alternatives


    // $ANTLR start rule__Text__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:927:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:931:1: ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_WS:
                {
                alt11=2;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt11=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt11=4;
                }
                break;
            case 15:
                {
                alt11=5;
                }
                break;
            case 16:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("927:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:932:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:933:1: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Text__Alternatives1949); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:938:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:939:1: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Text__Alternatives1966); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:944:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:944:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:945:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1983); 
                     after(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:950:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:950:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:951:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2000); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:956:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:957:1: '\\\\['
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Text__Alternatives2018); 
                     after(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:964:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:964:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:965:1: '\\\\]'
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Text__Alternatives2038); 
                     after(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 

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


    // $ANTLR start rule__MarkUp__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:977:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );
    public final void rule__MarkUp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:981:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 35:
                {
                alt12=6;
                }
                break;
            case 32:
                {
                alt12=7;
                }
                break;
            case 33:
                {
                alt12=8;
                }
                break;
            case 17:
            case 34:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("977:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:982:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:982:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:983:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2072);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:988:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:988:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:989:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2089);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:994:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:994:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:995:1: ruleRef
                    {
                     before(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2106);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:6: ( ruleOrderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:6: ( ruleOrderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1001:1: ruleOrderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2123);
                    ruleOrderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( ruleUnorderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( ruleUnorderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1007:1: ruleUnorderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2140);
                    ruleUnorderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( ruleCodeBlock )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( ruleCodeBlock )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1013:1: ruleCodeBlock
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2157);
                    ruleCodeBlock();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( ruleCodeRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( ruleCodeRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1019:1: ruleCodeRef
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2174);
                    ruleCodeRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( ruleLink )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( ruleLink )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1025:1: ruleLink
                    {
                     before(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2191);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:6: ( ruleImageRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1030:6: ( ruleImageRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1031:1: ruleImageRef
                    {
                     before(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2208);
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


    // $ANTLR start rule__ImageRef__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1041:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );
    public final void rule__ImageRef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1045:1: ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1041:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1046:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1046:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1047:1: ( rule__ImageRef__Group_0_0__0 )
                    {
                     before(grammarAccess.getImageRefAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1048:1: ( rule__ImageRef__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1048:2: rule__ImageRef__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02240);
                    rule__ImageRef__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getImageRefAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1052:6: ( 'img[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1052:6: ( 'img[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1053:1: 'img['
                    {
                     before(grammarAccess.getImageRefAccess().getImgKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ImageRef__Alternatives_02259); 
                     after(grammarAccess.getImageRefAccess().getImgKeyword_0_1()); 

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
    // $ANTLR end rule__ImageRef__Alternatives_0


    // $ANTLR start rule__CodeBlock__Alternatives_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1065:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );
    public final void rule__CodeBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1069:1: ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_MULTI_NL)||(LA15_0>=15 && LA15_0<=16)||LA15_0==18) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=26 && LA15_0<=28)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1070:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1070:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1071:1: ( rule__CodeBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1072:1: ( rule__CodeBlock__Group_2_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1072:2: rule__CodeBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22293);
                    rule__CodeBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1076:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1076:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1077:1: ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1077:1: ( ( rule__CodeBlock__Group_2_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1078:1: ( rule__CodeBlock__Group_2_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1079:1: ( rule__CodeBlock__Group_2_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1079:2: rule__CodeBlock__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22313);
                    rule__CodeBlock__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1082:1: ( ( rule__CodeBlock__Group_2_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1083:1: ( rule__CodeBlock__Group_2_1__0 )*
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1084:1: ( rule__CodeBlock__Group_2_1__0 )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=26 && LA14_0<=28)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1084:2: rule__CodeBlock__Group_2_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22325);
                    	    rule__CodeBlock__Group_2_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__CodeBlock__Alternatives_2


    // $ANTLR start rule__MarkupInCode__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1094:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );
    public final void rule__MarkupInCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1098:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1094:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1100:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2361);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1105:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1106:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2378);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1111:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1111:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1112:1: ruleRef
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2395);
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


    // $ANTLR start rule__CodeText__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1122:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );
    public final void rule__CodeText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1126:1: ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case RULE_MULTI_NL:
                {
                alt17=2;
                }
                break;
            case RULE_WS:
                {
                alt17=3;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt17=4;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt17=5;
                }
                break;
            case 15:
                {
                alt17=6;
                }
                break;
            case 16:
                {
                alt17=7;
                }
                break;
            case 18:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1122:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) | ( ':' ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1127:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1127:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1128:1: RULE_ID
                    {
                     before(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2427); 
                     after(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1133:6: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1133:6: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1134:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2444); 
                     after(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1140:1: RULE_WS
                    {
                     before(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2461); 
                     after(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1146:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2478); 
                     after(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1151:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1151:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1152:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2495); 
                     after(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1157:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1158:1: '\\\\['
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__CodeText__Alternatives2513); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1165:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1165:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1166:1: '\\\\]'
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
                    match(input,16,FOLLOW_16_in_rule__CodeText__Alternatives2533); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1173:6: ( ':' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1173:6: ( ':' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1174:1: ':'
                    {
                     before(grammarAccess.getCodeTextAccess().getColonKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__CodeText__Alternatives2553); 
                     after(grammarAccess.getCodeTextAccess().getColonKeyword_7()); 

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


    // $ANTLR start rule__ANY_WS__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1186:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );
    public final void rule__ANY_WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1190:1: ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt18=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt18=2;
                }
                break;
            case RULE_WS:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1186:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1191:1: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1191:1: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1192:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2587); 
                     after(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1197:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1197:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1198:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2604); 
                     after(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1203:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1203:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1204:1: RULE_WS
                    {
                     before(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2621); 
                     after(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 

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
    // $ANTLR end rule__ANY_WS__Alternatives


    // $ANTLR start rule__Document__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1216:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1220:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1221:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02651);
            rule__Document__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02654);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1228:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1232:1: ( ( () ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1233:1: ( () )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1233:1: ( () )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1234:1: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1235:1: ()
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1237:1: 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1247:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1251:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1252:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12712);
            rule__Document__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12715);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1259:1: rule__Document__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1263:1: ( ( ( RULE_WS )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1264:1: ( ( RULE_WS )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1264:1: ( ( RULE_WS )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1265:1: ( RULE_WS )?
            {
             before(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1266:1: ( RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1266:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2743); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1276:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1280:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1281:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22774);
            rule__Document__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22777);
            rule__Document__Group__3();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1288:1: rule__Document__Group__2__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1292:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1293:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1293:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1294:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1295:1: ( RULE_MULTI_NL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_MULTI_NL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1295:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2805); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Document__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1305:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1309:1: ( rule__Document__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1310:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32836);
            rule__Document__Group__3__Impl();
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
    // $ANTLR end rule__Document__Group__3


    // $ANTLR start rule__Document__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1316:1: rule__Document__Group__3__Impl : ( ( rule__Document__Group_3__0 )? ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1320:1: ( ( ( rule__Document__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1321:1: ( ( rule__Document__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1321:1: ( ( rule__Document__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1322:1: ( rule__Document__Group_3__0 )?
            {
             before(grammarAccess.getDocumentAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1323:1: ( rule__Document__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=10 && LA21_0<=12)||LA21_0==20||(LA21_0>=22 && LA21_0<=23)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1323:2: rule__Document__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2863);
                    rule__Document__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group__3__Impl


    // $ANTLR start rule__Document__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1341:1: rule__Document__Group_3__0 : rule__Document__Group_3__0__Impl rule__Document__Group_3__1 ;
    public final void rule__Document__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1345:1: ( rule__Document__Group_3__0__Impl rule__Document__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1346:2: rule__Document__Group_3__0__Impl rule__Document__Group_3__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02902);
            rule__Document__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02905);
            rule__Document__Group_3__1();
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
    // $ANTLR end rule__Document__Group_3__0


    // $ANTLR start rule__Document__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1353:1: rule__Document__Group_3__0__Impl : ( ( rule__Document__Alternatives_3_0 ) ) ;
    public final void rule__Document__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1357:1: ( ( ( rule__Document__Alternatives_3_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1358:1: ( ( rule__Document__Alternatives_3_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1358:1: ( ( rule__Document__Alternatives_3_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1359:1: ( rule__Document__Alternatives_3_0 )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1360:1: ( rule__Document__Alternatives_3_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1360:2: rule__Document__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2932);
            rule__Document__Alternatives_3_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__0__Impl


    // $ANTLR start rule__Document__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1370:1: rule__Document__Group_3__1 : rule__Document__Group_3__1__Impl ;
    public final void rule__Document__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1374:1: ( rule__Document__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1375:2: rule__Document__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12962);
            rule__Document__Group_3__1__Impl();
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
    // $ANTLR end rule__Document__Group_3__1


    // $ANTLR start rule__Document__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1381:1: rule__Document__Group_3__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1385:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1386:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1386:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1387:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1388:1: ( RULE_MULTI_NL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_MULTI_NL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1388:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2990); 

                    }
                    break;

            }

             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3__1__Impl


    // $ANTLR start rule__Document__Group_3_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1402:1: rule__Document__Group_3_0_0__0 : rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 ;
    public final void rule__Document__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1406:1: ( rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1407:2: rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03025);
            rule__Document__Group_3_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03028);
            rule__Document__Group_3_0_0__1();
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
    // $ANTLR end rule__Document__Group_3_0_0__0


    // $ANTLR start rule__Document__Group_3_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1414:1: rule__Document__Group_3_0_0__0__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) ;
    public final void rule__Document__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1418:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1419:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1419:1: ( ( rule__Document__ChaptersAssignment_3_0_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1420:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1421:1: ( rule__Document__ChaptersAssignment_3_0_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1421:2: rule__Document__ChaptersAssignment_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3055);
            rule__Document__ChaptersAssignment_3_0_0_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__0__Impl


    // $ANTLR start rule__Document__Group_3_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1431:1: rule__Document__Group_3_0_0__1 : rule__Document__Group_3_0_0__1__Impl ;
    public final void rule__Document__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1435:1: ( rule__Document__Group_3_0_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1436:2: rule__Document__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13085);
            rule__Document__Group_3_0_0__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_0__1


    // $ANTLR start rule__Document__Group_3_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1442:1: rule__Document__Group_3_0_0__1__Impl : ( ( rule__Document__Group_3_0_0_1__0 )* ) ;
    public final void rule__Document__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1446:1: ( ( ( rule__Document__Group_3_0_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1447:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1447:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1448:1: ( rule__Document__Group_3_0_0_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1449:1: ( rule__Document__Group_3_0_0_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_MULTI_NL) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==10||LA23_1==20) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1449:2: rule__Document__Group_3_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3112);
            	    rule__Document__Group_3_0_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0__1__Impl


    // $ANTLR start rule__Document__Group_3_0_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1463:1: rule__Document__Group_3_0_0_1__0 : rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 ;
    public final void rule__Document__Group_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1467:1: ( rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1468:2: rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03147);
            rule__Document__Group_3_0_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03150);
            rule__Document__Group_3_0_0_1__1();
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
    // $ANTLR end rule__Document__Group_3_0_0_1__0


    // $ANTLR start rule__Document__Group_3_0_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1475:1: rule__Document__Group_3_0_0_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1479:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1480:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1480:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1481:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3177); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1492:1: rule__Document__Group_3_0_0_1__1 : rule__Document__Group_3_0_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1496:1: ( rule__Document__Group_3_0_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1497:2: rule__Document__Group_3_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13206);
            rule__Document__Group_3_0_0_1__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_0_1__1


    // $ANTLR start rule__Document__Group_3_0_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1503:1: rule__Document__Group_3_0_0_1__1__Impl : ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) ;
    public final void rule__Document__Group_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1507:1: ( ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1508:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1508:1: ( ( rule__Document__ChaptersAssignment_3_0_0_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1509:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1510:1: ( rule__Document__ChaptersAssignment_3_0_0_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1510:2: rule__Document__ChaptersAssignment_3_0_0_1_1
            {
            pushFollow(FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3233);
            rule__Document__ChaptersAssignment_3_0_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getChaptersAssignment_3_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_0_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1524:1: rule__Document__Group_3_0_1__0 : rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 ;
    public final void rule__Document__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1528:1: ( rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1529:2: rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03267);
            rule__Document__Group_3_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03270);
            rule__Document__Group_3_0_1__1();
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
    // $ANTLR end rule__Document__Group_3_0_1__0


    // $ANTLR start rule__Document__Group_3_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1536:1: rule__Document__Group_3_0_1__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) ;
    public final void rule__Document__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1540:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1541:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1541:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1542:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1543:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1543:2: rule__Document__SectionsAssignment_3_0_1_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3297);
            rule__Document__SectionsAssignment_3_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1553:1: rule__Document__Group_3_0_1__1 : rule__Document__Group_3_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1557:1: ( rule__Document__Group_3_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1558:2: rule__Document__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13327);
            rule__Document__Group_3_0_1__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_1__1


    // $ANTLR start rule__Document__Group_3_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1564:1: rule__Document__Group_3_0_1__1__Impl : ( ( rule__Document__Group_3_0_1_1__0 )* ) ;
    public final void rule__Document__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1568:1: ( ( ( rule__Document__Group_3_0_1_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1569:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1569:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1570:1: ( rule__Document__Group_3_0_1_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1571:1: ( rule__Document__Group_3_0_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==11||LA24_1==22) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1571:2: rule__Document__Group_3_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3354);
            	    rule__Document__Group_3_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_1_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1585:1: rule__Document__Group_3_0_1_1__0 : rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 ;
    public final void rule__Document__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1589:1: ( rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1590:2: rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03389);
            rule__Document__Group_3_0_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03392);
            rule__Document__Group_3_0_1_1__1();
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
    // $ANTLR end rule__Document__Group_3_0_1_1__0


    // $ANTLR start rule__Document__Group_3_0_1_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1597:1: rule__Document__Group_3_0_1_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1601:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1602:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1602:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1603:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3419); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_1_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1614:1: rule__Document__Group_3_0_1_1__1 : rule__Document__Group_3_0_1_1__1__Impl ;
    public final void rule__Document__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1618:1: ( rule__Document__Group_3_0_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1619:2: rule__Document__Group_3_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13448);
            rule__Document__Group_3_0_1_1__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_1_1__1


    // $ANTLR start rule__Document__Group_3_0_1_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1625:1: rule__Document__Group_3_0_1_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) ;
    public final void rule__Document__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1629:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1630:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1630:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1631:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1632:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1632:2: rule__Document__SectionsAssignment_3_0_1_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3475);
            rule__Document__SectionsAssignment_3_0_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_1_1__1__Impl


    // $ANTLR start rule__Document__Group_3_0_2__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1646:1: rule__Document__Group_3_0_2__0 : rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 ;
    public final void rule__Document__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1650:1: ( rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1651:2: rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03509);
            rule__Document__Group_3_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03512);
            rule__Document__Group_3_0_2__1();
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
    // $ANTLR end rule__Document__Group_3_0_2__0


    // $ANTLR start rule__Document__Group_3_0_2__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1658:1: rule__Document__Group_3_0_2__0__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) ;
    public final void rule__Document__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1662:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1663:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1663:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1664:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1665:1: ( rule__Document__SubsectionsAssignment_3_0_2_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1665:2: rule__Document__SubsectionsAssignment_3_0_2_0
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3539);
            rule__Document__SubsectionsAssignment_3_0_2_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__0__Impl


    // $ANTLR start rule__Document__Group_3_0_2__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1675:1: rule__Document__Group_3_0_2__1 : rule__Document__Group_3_0_2__1__Impl ;
    public final void rule__Document__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1679:1: ( rule__Document__Group_3_0_2__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1680:2: rule__Document__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13569);
            rule__Document__Group_3_0_2__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_2__1


    // $ANTLR start rule__Document__Group_3_0_2__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1686:1: rule__Document__Group_3_0_2__1__Impl : ( ( rule__Document__Group_3_0_2_1__0 )* ) ;
    public final void rule__Document__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1690:1: ( ( ( rule__Document__Group_3_0_2_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1691:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1691:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1692:1: ( rule__Document__Group_3_0_2_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1693:1: ( rule__Document__Group_3_0_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==12||LA25_1==23) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1693:2: rule__Document__Group_3_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3596);
            	    rule__Document__Group_3_0_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2__1__Impl


    // $ANTLR start rule__Document__Group_3_0_2_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1707:1: rule__Document__Group_3_0_2_1__0 : rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 ;
    public final void rule__Document__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1711:1: ( rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1712:2: rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03631);
            rule__Document__Group_3_0_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03634);
            rule__Document__Group_3_0_2_1__1();
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
    // $ANTLR end rule__Document__Group_3_0_2_1__0


    // $ANTLR start rule__Document__Group_3_0_2_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1719:1: rule__Document__Group_3_0_2_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1723:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1724:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1724:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1725:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3661); 
             after(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__0__Impl


    // $ANTLR start rule__Document__Group_3_0_2_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1736:1: rule__Document__Group_3_0_2_1__1 : rule__Document__Group_3_0_2_1__1__Impl ;
    public final void rule__Document__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1740:1: ( rule__Document__Group_3_0_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1741:2: rule__Document__Group_3_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13690);
            rule__Document__Group_3_0_2_1__1__Impl();
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
    // $ANTLR end rule__Document__Group_3_0_2_1__1


    // $ANTLR start rule__Document__Group_3_0_2_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1747:1: rule__Document__Group_3_0_2_1__1__Impl : ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Document__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1751:1: ( ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1752:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1752:1: ( ( rule__Document__SubsectionsAssignment_3_0_2_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1753:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1754:1: ( rule__Document__SubsectionsAssignment_3_0_2_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1754:2: rule__Document__SubsectionsAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3717);
            rule__Document__SubsectionsAssignment_3_0_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSubsectionsAssignment_3_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__Group_3_0_2_1__1__Impl


    // $ANTLR start rule__Chapter__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1768:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1772:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1773:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03751);
            rule__Chapter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03754);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1780:1: rule__Chapter__Group__0__Impl : ( ( rule__Chapter__Alternatives_0 ) ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1784:1: ( ( ( rule__Chapter__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1785:1: ( ( rule__Chapter__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1785:1: ( ( rule__Chapter__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1786:1: ( rule__Chapter__Alternatives_0 )
            {
             before(grammarAccess.getChapterAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1787:1: ( rule__Chapter__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1787:2: rule__Chapter__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3781);
            rule__Chapter__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1797:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1801:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1802:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13811);
            rule__Chapter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13814);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1809:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__TitleAssignment_1 ) ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1813:1: ( ( ( rule__Chapter__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1814:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1814:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1815:1: ( rule__Chapter__TitleAssignment_1 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1816:1: ( rule__Chapter__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1816:2: rule__Chapter__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3841);
            rule__Chapter__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1826:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1830:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1831:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23871);
            rule__Chapter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23874);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1838:1: rule__Chapter__Group__2__Impl : ( ']' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1842:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1843:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1843:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1844:1: ']'
            {
             before(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Chapter__Group__2__Impl3902); 
             after(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1857:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1861:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1862:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33933);
            rule__Chapter__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33936);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1869:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__Group_3__0 )* ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1873:1: ( ( ( rule__Chapter__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1874:1: ( ( rule__Chapter__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1874:1: ( ( rule__Chapter__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1875:1: ( rule__Chapter__Group_3__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1876:1: ( rule__Chapter__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_ID && LA26_1<=RULE_ANY_OTHER)||(LA26_1>=15 && LA26_1<=17)||(LA26_1>=26 && LA26_1<=30)||(LA26_1>=32 && LA26_1<=35)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1876:2: rule__Chapter__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl3963);
            	    rule__Chapter__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1886:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1890:1: ( rule__Chapter__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1891:2: rule__Chapter__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43994);
            rule__Chapter__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1897:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__Group_4__0 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1901:1: ( ( ( rule__Chapter__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1902:1: ( ( rule__Chapter__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1902:1: ( ( rule__Chapter__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1903:1: ( rule__Chapter__Group_4__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1904:1: ( rule__Chapter__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_MULTI_NL) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==11||LA27_2==22) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1904:2: rule__Chapter__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4021);
            	    rule__Chapter__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Chapter__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1924:1: rule__Chapter__Group_0_0__0 : rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 ;
    public final void rule__Chapter__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1928:1: ( rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1929:2: rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04062);
            rule__Chapter__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04065);
            rule__Chapter__Group_0_0__1();
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
    // $ANTLR end rule__Chapter__Group_0_0__0


    // $ANTLR start rule__Chapter__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1936:1: rule__Chapter__Group_0_0__0__Impl : ( 'chapter:' ) ;
    public final void rule__Chapter__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1940:1: ( ( 'chapter:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1941:1: ( 'chapter:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1941:1: ( 'chapter:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1942:1: 'chapter:'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Chapter__Group_0_0__0__Impl4093); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__0__Impl


    // $ANTLR start rule__Chapter__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1955:1: rule__Chapter__Group_0_0__1 : rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 ;
    public final void rule__Chapter__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1959:1: ( rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1960:2: rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14124);
            rule__Chapter__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14127);
            rule__Chapter__Group_0_0__2();
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
    // $ANTLR end rule__Chapter__Group_0_0__1


    // $ANTLR start rule__Chapter__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1967:1: rule__Chapter__Group_0_0__1__Impl : ( ( rule__Chapter__NameAssignment_0_0_1 ) ) ;
    public final void rule__Chapter__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1971:1: ( ( ( rule__Chapter__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1972:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1972:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1973:1: ( rule__Chapter__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1974:1: ( rule__Chapter__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1974:2: rule__Chapter__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4154);
            rule__Chapter__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__1__Impl


    // $ANTLR start rule__Chapter__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1984:1: rule__Chapter__Group_0_0__2 : rule__Chapter__Group_0_0__2__Impl ;
    public final void rule__Chapter__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1988:1: ( rule__Chapter__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1989:2: rule__Chapter__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24184);
            rule__Chapter__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Chapter__Group_0_0__2


    // $ANTLR start rule__Chapter__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1995:1: rule__Chapter__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Chapter__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1999:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2000:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2000:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2001:1: '['
            {
             before(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Chapter__Group_0_0__2__Impl4212); 
             after(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_0_0__2__Impl


    // $ANTLR start rule__Chapter__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2020:1: rule__Chapter__Group_3__0 : rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 ;
    public final void rule__Chapter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2024:1: ( rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2025:2: rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04249);
            rule__Chapter__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04252);
            rule__Chapter__Group_3__1();
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
    // $ANTLR end rule__Chapter__Group_3__0


    // $ANTLR start rule__Chapter__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2032:1: rule__Chapter__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2036:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2037:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2037:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2038:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4279); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_3__0__Impl


    // $ANTLR start rule__Chapter__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2049:1: rule__Chapter__Group_3__1 : rule__Chapter__Group_3__1__Impl ;
    public final void rule__Chapter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2053:1: ( rule__Chapter__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2054:2: rule__Chapter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14308);
            rule__Chapter__Group_3__1__Impl();
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
    // $ANTLR end rule__Chapter__Group_3__1


    // $ANTLR start rule__Chapter__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2060:1: rule__Chapter__Group_3__1__Impl : ( ( rule__Chapter__ContentsAssignment_3_1 ) ) ;
    public final void rule__Chapter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2064:1: ( ( ( rule__Chapter__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2065:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2065:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2066:1: ( rule__Chapter__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2067:1: ( rule__Chapter__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2067:2: rule__Chapter__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4335);
            rule__Chapter__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_3__1__Impl


    // $ANTLR start rule__Chapter__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2081:1: rule__Chapter__Group_4__0 : rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 ;
    public final void rule__Chapter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2085:1: ( rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2086:2: rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04369);
            rule__Chapter__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04372);
            rule__Chapter__Group_4__1();
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
    // $ANTLR end rule__Chapter__Group_4__0


    // $ANTLR start rule__Chapter__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2093:1: rule__Chapter__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2097:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2098:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2098:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2099:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4399); 
             after(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_4__0__Impl


    // $ANTLR start rule__Chapter__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2110:1: rule__Chapter__Group_4__1 : rule__Chapter__Group_4__1__Impl ;
    public final void rule__Chapter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2114:1: ( rule__Chapter__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2115:2: rule__Chapter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14428);
            rule__Chapter__Group_4__1__Impl();
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
    // $ANTLR end rule__Chapter__Group_4__1


    // $ANTLR start rule__Chapter__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2121:1: rule__Chapter__Group_4__1__Impl : ( ( rule__Chapter__ContentsAssignment_4_1 ) ) ;
    public final void rule__Chapter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2125:1: ( ( ( rule__Chapter__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2126:1: ( ( rule__Chapter__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2126:1: ( ( rule__Chapter__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2127:1: ( rule__Chapter__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2128:1: ( rule__Chapter__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2128:2: rule__Chapter__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4455);
            rule__Chapter__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__Group_4__1__Impl


    // $ANTLR start rule__Section__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2142:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2146:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2147:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04489);
            rule__Section__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04492);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2154:1: rule__Section__Group__0__Impl : ( ( rule__Section__Alternatives_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2158:1: ( ( ( rule__Section__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2159:1: ( ( rule__Section__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2159:1: ( ( rule__Section__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2160:1: ( rule__Section__Alternatives_0 )
            {
             before(grammarAccess.getSectionAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2161:1: ( rule__Section__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2161:2: rule__Section__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4519);
            rule__Section__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2171:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2175:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2176:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14549);
            rule__Section__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14552);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2183:1: rule__Section__Group__1__Impl : ( ( rule__Section__TitleAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2187:1: ( ( ( rule__Section__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2188:1: ( ( rule__Section__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2188:1: ( ( rule__Section__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2189:1: ( rule__Section__TitleAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2190:1: ( rule__Section__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2190:2: rule__Section__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4579);
            rule__Section__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2200:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2204:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2205:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24609);
            rule__Section__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24612);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2212:1: rule__Section__Group__2__Impl : ( ']' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2216:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2217:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2217:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2218:1: ']'
            {
             before(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Section__Group__2__Impl4640); 
             after(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2231:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2235:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2236:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34671);
            rule__Section__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34674);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2243:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )* ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2247:1: ( ( ( rule__Section__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2248:1: ( ( rule__Section__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2248:1: ( ( rule__Section__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2249:1: ( rule__Section__Group_3__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2250:1: ( rule__Section__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTI_NL) ) {
                    int LA28_1 = input.LA(2);

                    if ( ((LA28_1>=RULE_ID && LA28_1<=RULE_ANY_OTHER)||(LA28_1>=15 && LA28_1<=17)||(LA28_1>=26 && LA28_1<=30)||(LA28_1>=32 && LA28_1<=35)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2250:2: rule__Section__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4701);
            	    rule__Section__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2260:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2264:1: ( rule__Section__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2265:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44732);
            rule__Section__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2271:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2275:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2276:1: ( ( rule__Section__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2276:1: ( ( rule__Section__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2277:1: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2278:1: ( rule__Section__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MULTI_NL) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==12||LA29_2==23) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2278:2: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4759);
            	    rule__Section__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Section__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2298:1: rule__Section__Group_0_0__0 : rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 ;
    public final void rule__Section__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2302:1: ( rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2303:2: rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04800);
            rule__Section__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04803);
            rule__Section__Group_0_0__1();
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
    // $ANTLR end rule__Section__Group_0_0__0


    // $ANTLR start rule__Section__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2310:1: rule__Section__Group_0_0__0__Impl : ( 'section:' ) ;
    public final void rule__Section__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2314:1: ( ( 'section:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2315:1: ( 'section:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2315:1: ( 'section:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2316:1: 'section:'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Section__Group_0_0__0__Impl4831); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__0__Impl


    // $ANTLR start rule__Section__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2329:1: rule__Section__Group_0_0__1 : rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 ;
    public final void rule__Section__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2333:1: ( rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2334:2: rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__14862);
            rule__Section__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__14865);
            rule__Section__Group_0_0__2();
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
    // $ANTLR end rule__Section__Group_0_0__1


    // $ANTLR start rule__Section__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2341:1: rule__Section__Group_0_0__1__Impl : ( ( rule__Section__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2345:1: ( ( ( rule__Section__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2346:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2346:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2347:1: ( rule__Section__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2348:1: ( rule__Section__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2348:2: rule__Section__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl4892);
            rule__Section__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__1__Impl


    // $ANTLR start rule__Section__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2358:1: rule__Section__Group_0_0__2 : rule__Section__Group_0_0__2__Impl ;
    public final void rule__Section__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2362:1: ( rule__Section__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2363:2: rule__Section__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__24922);
            rule__Section__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section__Group_0_0__2


    // $ANTLR start rule__Section__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2369:1: rule__Section__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2373:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2374:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2374:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2375:1: '['
            {
             before(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Section__Group_0_0__2__Impl4950); 
             after(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_0_0__2__Impl


    // $ANTLR start rule__Section__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2394:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2398:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2399:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__04987);
            rule__Section__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__04990);
            rule__Section__Group_3__1();
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
    // $ANTLR end rule__Section__Group_3__0


    // $ANTLR start rule__Section__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2406:1: rule__Section__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2410:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2411:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2411:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2412:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl5017); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_3__0__Impl


    // $ANTLR start rule__Section__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2423:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2427:1: ( rule__Section__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2428:2: rule__Section__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15046);
            rule__Section__Group_3__1__Impl();
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
    // $ANTLR end rule__Section__Group_3__1


    // $ANTLR start rule__Section__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2434:1: rule__Section__Group_3__1__Impl : ( ( rule__Section__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2438:1: ( ( ( rule__Section__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2439:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2439:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2440:1: ( rule__Section__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2441:1: ( rule__Section__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2441:2: rule__Section__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5073);
            rule__Section__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_3__1__Impl


    // $ANTLR start rule__Section__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2455:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2459:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2460:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05107);
            rule__Section__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05110);
            rule__Section__Group_4__1();
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
    // $ANTLR end rule__Section__Group_4__0


    // $ANTLR start rule__Section__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2467:1: rule__Section__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2471:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2472:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2472:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2473:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5137); 
             after(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_4__0__Impl


    // $ANTLR start rule__Section__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2484:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2488:1: ( rule__Section__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2489:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15166);
            rule__Section__Group_4__1__Impl();
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
    // $ANTLR end rule__Section__Group_4__1


    // $ANTLR start rule__Section__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2495:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ContentsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2499:1: ( ( ( rule__Section__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2500:1: ( ( rule__Section__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2500:1: ( ( rule__Section__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2501:1: ( rule__Section__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2502:1: ( rule__Section__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2502:2: rule__Section__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_4_1_in_rule__Section__Group_4__1__Impl5193);
            rule__Section__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__Group_4__1__Impl


    // $ANTLR start rule__SubSection__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2516:1: rule__SubSection__Group__0 : rule__SubSection__Group__0__Impl rule__SubSection__Group__1 ;
    public final void rule__SubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2520:1: ( rule__SubSection__Group__0__Impl rule__SubSection__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2521:2: rule__SubSection__Group__0__Impl rule__SubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05227);
            rule__SubSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05230);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2528:1: rule__SubSection__Group__0__Impl : ( ( rule__SubSection__Alternatives_0 ) ) ;
    public final void rule__SubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2532:1: ( ( ( rule__SubSection__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2533:1: ( ( rule__SubSection__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2533:1: ( ( rule__SubSection__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2534:1: ( rule__SubSection__Alternatives_0 )
            {
             before(grammarAccess.getSubSectionAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2535:1: ( rule__SubSection__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2535:2: rule__SubSection__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SubSection__Alternatives_0_in_rule__SubSection__Group__0__Impl5257);
            rule__SubSection__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2545:1: rule__SubSection__Group__1 : rule__SubSection__Group__1__Impl rule__SubSection__Group__2 ;
    public final void rule__SubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2549:1: ( rule__SubSection__Group__1__Impl rule__SubSection__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2550:2: rule__SubSection__Group__1__Impl rule__SubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15287);
            rule__SubSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15290);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2557:1: rule__SubSection__Group__1__Impl : ( ( rule__SubSection__TitleAssignment_1 ) ) ;
    public final void rule__SubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2561:1: ( ( ( rule__SubSection__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2562:1: ( ( rule__SubSection__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2562:1: ( ( rule__SubSection__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2563:1: ( rule__SubSection__TitleAssignment_1 )
            {
             before(grammarAccess.getSubSectionAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2564:1: ( rule__SubSection__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2564:2: rule__SubSection__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSection__TitleAssignment_1_in_rule__SubSection__Group__1__Impl5317);
            rule__SubSection__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2574:1: rule__SubSection__Group__2 : rule__SubSection__Group__2__Impl rule__SubSection__Group__3 ;
    public final void rule__SubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2578:1: ( rule__SubSection__Group__2__Impl rule__SubSection__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2579:2: rule__SubSection__Group__2__Impl rule__SubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25347);
            rule__SubSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25350);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2586:1: rule__SubSection__Group__2__Impl : ( ']' ) ;
    public final void rule__SubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2590:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2591:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2591:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2592:1: ']'
            {
             before(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__SubSection__Group__2__Impl5378); 
             after(grammarAccess.getSubSectionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2605:1: rule__SubSection__Group__3 : rule__SubSection__Group__3__Impl rule__SubSection__Group__4 ;
    public final void rule__SubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2609:1: ( rule__SubSection__Group__3__Impl rule__SubSection__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2610:2: rule__SubSection__Group__3__Impl rule__SubSection__Group__4
            {
            pushFollow(FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35409);
            rule__SubSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35412);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2617:1: rule__SubSection__Group__3__Impl : ( ( rule__SubSection__Group_3__0 )* ) ;
    public final void rule__SubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2621:1: ( ( ( rule__SubSection__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2622:1: ( ( rule__SubSection__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2622:1: ( ( rule__SubSection__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2623:1: ( rule__SubSection__Group_3__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2624:1: ( rule__SubSection__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_ANY_OTHER)||(LA30_1>=15 && LA30_1<=17)||(LA30_1>=26 && LA30_1<=30)||(LA30_1>=32 && LA30_1<=35)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2624:2: rule__SubSection__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_3__0_in_rule__SubSection__Group__3__Impl5439);
            	    rule__SubSection__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2634:1: rule__SubSection__Group__4 : rule__SubSection__Group__4__Impl ;
    public final void rule__SubSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2638:1: ( rule__SubSection__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2639:2: rule__SubSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45470);
            rule__SubSection__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2645:1: rule__SubSection__Group__4__Impl : ( ( rule__SubSection__Group_4__0 )* ) ;
    public final void rule__SubSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2649:1: ( ( ( rule__SubSection__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2650:1: ( ( rule__SubSection__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2650:1: ( ( rule__SubSection__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2651:1: ( rule__SubSection__Group_4__0 )*
            {
             before(grammarAccess.getSubSectionAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2652:1: ( rule__SubSection__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==13||LA31_2==24) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2652:2: rule__SubSection__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__Group_4__0_in_rule__SubSection__Group__4__Impl5497);
            	    rule__SubSection__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__SubSection__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2672:1: rule__SubSection__Group_0_0__0 : rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1 ;
    public final void rule__SubSection__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2676:1: ( rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2677:2: rule__SubSection__Group_0_0__0__Impl rule__SubSection__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__0__Impl_in_rule__SubSection__Group_0_0__05538);
            rule__SubSection__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_0_0__1_in_rule__SubSection__Group_0_0__05541);
            rule__SubSection__Group_0_0__1();
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
    // $ANTLR end rule__SubSection__Group_0_0__0


    // $ANTLR start rule__SubSection__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2684:1: rule__SubSection__Group_0_0__0__Impl : ( 'subsection:' ) ;
    public final void rule__SubSection__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2688:1: ( ( 'subsection:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2689:1: ( 'subsection:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2689:1: ( 'subsection:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2690:1: 'subsection:'
            {
             before(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_0_0()); 
            match(input,23,FOLLOW_23_in_rule__SubSection__Group_0_0__0__Impl5569); 
             after(grammarAccess.getSubSectionAccess().getSubsectionKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__0__Impl


    // $ANTLR start rule__SubSection__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2703:1: rule__SubSection__Group_0_0__1 : rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2 ;
    public final void rule__SubSection__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2707:1: ( rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2708:2: rule__SubSection__Group_0_0__1__Impl rule__SubSection__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__1__Impl_in_rule__SubSection__Group_0_0__15600);
            rule__SubSection__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_0_0__2_in_rule__SubSection__Group_0_0__15603);
            rule__SubSection__Group_0_0__2();
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
    // $ANTLR end rule__SubSection__Group_0_0__1


    // $ANTLR start rule__SubSection__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2715:1: rule__SubSection__Group_0_0__1__Impl : ( ( rule__SubSection__NameAssignment_0_0_1 ) ) ;
    public final void rule__SubSection__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2719:1: ( ( ( rule__SubSection__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2720:1: ( ( rule__SubSection__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2720:1: ( ( rule__SubSection__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2721:1: ( rule__SubSection__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSubSectionAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2722:1: ( rule__SubSection__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2722:2: rule__SubSection__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__SubSection__NameAssignment_0_0_1_in_rule__SubSection__Group_0_0__1__Impl5630);
            rule__SubSection__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__1__Impl


    // $ANTLR start rule__SubSection__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2732:1: rule__SubSection__Group_0_0__2 : rule__SubSection__Group_0_0__2__Impl ;
    public final void rule__SubSection__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2736:1: ( rule__SubSection__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2737:2: rule__SubSection__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_0_0__2__Impl_in_rule__SubSection__Group_0_0__25660);
            rule__SubSection__Group_0_0__2__Impl();
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
    // $ANTLR end rule__SubSection__Group_0_0__2


    // $ANTLR start rule__SubSection__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2743:1: rule__SubSection__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__SubSection__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2747:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2748:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2748:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2749:1: '['
            {
             before(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,21,FOLLOW_21_in_rule__SubSection__Group_0_0__2__Impl5688); 
             after(grammarAccess.getSubSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_0_0__2__Impl


    // $ANTLR start rule__SubSection__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2768:1: rule__SubSection__Group_3__0 : rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1 ;
    public final void rule__SubSection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2772:1: ( rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2773:2: rule__SubSection__Group_3__0__Impl rule__SubSection__Group_3__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_3__0__Impl_in_rule__SubSection__Group_3__05725);
            rule__SubSection__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_3__1_in_rule__SubSection__Group_3__05728);
            rule__SubSection__Group_3__1();
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
    // $ANTLR end rule__SubSection__Group_3__0


    // $ANTLR start rule__SubSection__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2780:1: rule__SubSection__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2784:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2785:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2785:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2786:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_3__0__Impl5755); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_3__0__Impl


    // $ANTLR start rule__SubSection__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2797:1: rule__SubSection__Group_3__1 : rule__SubSection__Group_3__1__Impl ;
    public final void rule__SubSection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2801:1: ( rule__SubSection__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2802:2: rule__SubSection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_3__1__Impl_in_rule__SubSection__Group_3__15784);
            rule__SubSection__Group_3__1__Impl();
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
    // $ANTLR end rule__SubSection__Group_3__1


    // $ANTLR start rule__SubSection__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2808:1: rule__SubSection__Group_3__1__Impl : ( ( rule__SubSection__ContentsAssignment_3_1 ) ) ;
    public final void rule__SubSection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2812:1: ( ( ( rule__SubSection__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2813:1: ( ( rule__SubSection__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2813:1: ( ( rule__SubSection__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2814:1: ( rule__SubSection__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2815:1: ( rule__SubSection__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2815:2: rule__SubSection__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_3_1_in_rule__SubSection__Group_3__1__Impl5811);
            rule__SubSection__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_3__1__Impl


    // $ANTLR start rule__SubSection__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2829:1: rule__SubSection__Group_4__0 : rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1 ;
    public final void rule__SubSection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2833:1: ( rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2834:2: rule__SubSection__Group_4__0__Impl rule__SubSection__Group_4__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group_4__0__Impl_in_rule__SubSection__Group_4__05845);
            rule__SubSection__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group_4__1_in_rule__SubSection__Group_4__05848);
            rule__SubSection__Group_4__1();
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
    // $ANTLR end rule__SubSection__Group_4__0


    // $ANTLR start rule__SubSection__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2841:1: rule__SubSection__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__SubSection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2845:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2846:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2846:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2847:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_4__0__Impl5875); 
             after(grammarAccess.getSubSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_4__0__Impl


    // $ANTLR start rule__SubSection__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2858:1: rule__SubSection__Group_4__1 : rule__SubSection__Group_4__1__Impl ;
    public final void rule__SubSection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2862:1: ( rule__SubSection__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2863:2: rule__SubSection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group_4__1__Impl_in_rule__SubSection__Group_4__15904);
            rule__SubSection__Group_4__1__Impl();
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
    // $ANTLR end rule__SubSection__Group_4__1


    // $ANTLR start rule__SubSection__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2869:1: rule__SubSection__Group_4__1__Impl : ( ( rule__SubSection__ContentsAssignment_4_1 ) ) ;
    public final void rule__SubSection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2873:1: ( ( ( rule__SubSection__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2874:1: ( ( rule__SubSection__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2874:1: ( ( rule__SubSection__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2875:1: ( rule__SubSection__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSubSectionAccess().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2876:1: ( rule__SubSection__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2876:2: rule__SubSection__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SubSection__ContentsAssignment_4_1_in_rule__SubSection__Group_4__1__Impl5931);
            rule__SubSection__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__Group_4__1__Impl


    // $ANTLR start rule__Section3__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2890:1: rule__Section3__Group__0 : rule__Section3__Group__0__Impl rule__Section3__Group__1 ;
    public final void rule__Section3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2894:1: ( rule__Section3__Group__0__Impl rule__Section3__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2895:2: rule__Section3__Group__0__Impl rule__Section3__Group__1
            {
            pushFollow(FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05965);
            rule__Section3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05968);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2902:1: rule__Section3__Group__0__Impl : ( ( rule__Section3__Alternatives_0 ) ) ;
    public final void rule__Section3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2906:1: ( ( ( rule__Section3__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2907:1: ( ( rule__Section3__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2907:1: ( ( rule__Section3__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2908:1: ( rule__Section3__Alternatives_0 )
            {
             before(grammarAccess.getSection3Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2909:1: ( rule__Section3__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2909:2: rule__Section3__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl5995);
            rule__Section3__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2919:1: rule__Section3__Group__1 : rule__Section3__Group__1__Impl rule__Section3__Group__2 ;
    public final void rule__Section3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2923:1: ( rule__Section3__Group__1__Impl rule__Section3__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2924:2: rule__Section3__Group__1__Impl rule__Section3__Group__2
            {
            pushFollow(FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16025);
            rule__Section3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16028);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2931:1: rule__Section3__Group__1__Impl : ( ( rule__Section3__TitleAssignment_1 ) ) ;
    public final void rule__Section3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2935:1: ( ( ( rule__Section3__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2936:1: ( ( rule__Section3__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2936:1: ( ( rule__Section3__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2937:1: ( rule__Section3__TitleAssignment_1 )
            {
             before(grammarAccess.getSection3Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2938:1: ( rule__Section3__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2938:2: rule__Section3__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6055);
            rule__Section3__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2948:1: rule__Section3__Group__2 : rule__Section3__Group__2__Impl rule__Section3__Group__3 ;
    public final void rule__Section3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2952:1: ( rule__Section3__Group__2__Impl rule__Section3__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2953:2: rule__Section3__Group__2__Impl rule__Section3__Group__3
            {
            pushFollow(FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26085);
            rule__Section3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26088);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2960:1: rule__Section3__Group__2__Impl : ( ']' ) ;
    public final void rule__Section3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2964:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2965:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2965:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2966:1: ']'
            {
             before(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Section3__Group__2__Impl6116); 
             after(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2979:1: rule__Section3__Group__3 : rule__Section3__Group__3__Impl rule__Section3__Group__4 ;
    public final void rule__Section3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2983:1: ( rule__Section3__Group__3__Impl rule__Section3__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2984:2: rule__Section3__Group__3__Impl rule__Section3__Group__4
            {
            pushFollow(FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36147);
            rule__Section3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36150);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2991:1: rule__Section3__Group__3__Impl : ( ( rule__Section3__Group_3__0 )* ) ;
    public final void rule__Section3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2995:1: ( ( ( rule__Section3__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2996:1: ( ( rule__Section3__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2996:1: ( ( rule__Section3__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2997:1: ( rule__Section3__Group_3__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2998:1: ( rule__Section3__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MULTI_NL) ) {
                    int LA32_1 = input.LA(2);

                    if ( ((LA32_1>=RULE_ID && LA32_1<=RULE_ANY_OTHER)||(LA32_1>=15 && LA32_1<=17)||(LA32_1>=26 && LA32_1<=30)||(LA32_1>=32 && LA32_1<=35)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2998:2: rule__Section3__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6177);
            	    rule__Section3__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3008:1: rule__Section3__Group__4 : rule__Section3__Group__4__Impl ;
    public final void rule__Section3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3012:1: ( rule__Section3__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3013:2: rule__Section3__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46208);
            rule__Section3__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3019:1: rule__Section3__Group__4__Impl : ( ( rule__Section3__Group_4__0 )* ) ;
    public final void rule__Section3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3023:1: ( ( ( rule__Section3__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3024:1: ( ( rule__Section3__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3024:1: ( ( rule__Section3__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3025:1: ( rule__Section3__Group_4__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3026:1: ( rule__Section3__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTI_NL) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==14||LA33_2==25) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3026:2: rule__Section3__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6235);
            	    rule__Section3__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSection3Access().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Section3__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3046:1: rule__Section3__Group_0_0__0 : rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 ;
    public final void rule__Section3__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3050:1: ( rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3051:2: rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06276);
            rule__Section3__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06279);
            rule__Section3__Group_0_0__1();
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
    // $ANTLR end rule__Section3__Group_0_0__0


    // $ANTLR start rule__Section3__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3058:1: rule__Section3__Group_0_0__0__Impl : ( 'section3:' ) ;
    public final void rule__Section3__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3062:1: ( ( 'section3:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3063:1: ( 'section3:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3063:1: ( 'section3:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3064:1: 'section3:'
            {
             before(grammarAccess.getSection3Access().getSection3Keyword_0_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Section3__Group_0_0__0__Impl6307); 
             after(grammarAccess.getSection3Access().getSection3Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__0__Impl


    // $ANTLR start rule__Section3__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3077:1: rule__Section3__Group_0_0__1 : rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 ;
    public final void rule__Section3__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3081:1: ( rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3082:2: rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16338);
            rule__Section3__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16341);
            rule__Section3__Group_0_0__2();
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
    // $ANTLR end rule__Section3__Group_0_0__1


    // $ANTLR start rule__Section3__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3089:1: rule__Section3__Group_0_0__1__Impl : ( ( rule__Section3__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section3__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3093:1: ( ( ( rule__Section3__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3094:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3094:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3095:1: ( rule__Section3__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection3Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3096:1: ( rule__Section3__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3096:2: rule__Section3__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6368);
            rule__Section3__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__1__Impl


    // $ANTLR start rule__Section3__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3106:1: rule__Section3__Group_0_0__2 : rule__Section3__Group_0_0__2__Impl ;
    public final void rule__Section3__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3110:1: ( rule__Section3__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3111:2: rule__Section3__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26398);
            rule__Section3__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section3__Group_0_0__2


    // $ANTLR start rule__Section3__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3117:1: rule__Section3__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section3__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3121:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3122:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3122:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3123:1: '['
            {
             before(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Section3__Group_0_0__2__Impl6426); 
             after(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_0_0__2__Impl


    // $ANTLR start rule__Section3__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3142:1: rule__Section3__Group_3__0 : rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 ;
    public final void rule__Section3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3146:1: ( rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3147:2: rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06463);
            rule__Section3__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06466);
            rule__Section3__Group_3__1();
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
    // $ANTLR end rule__Section3__Group_3__0


    // $ANTLR start rule__Section3__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3154:1: rule__Section3__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3158:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3159:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3159:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3160:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6493); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_3__0__Impl


    // $ANTLR start rule__Section3__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3171:1: rule__Section3__Group_3__1 : rule__Section3__Group_3__1__Impl ;
    public final void rule__Section3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3175:1: ( rule__Section3__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3176:2: rule__Section3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16522);
            rule__Section3__Group_3__1__Impl();
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
    // $ANTLR end rule__Section3__Group_3__1


    // $ANTLR start rule__Section3__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3182:1: rule__Section3__Group_3__1__Impl : ( ( rule__Section3__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3186:1: ( ( ( rule__Section3__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3187:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3187:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3188:1: ( rule__Section3__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3189:1: ( rule__Section3__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3189:2: rule__Section3__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6549);
            rule__Section3__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_3__1__Impl


    // $ANTLR start rule__Section3__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3203:1: rule__Section3__Group_4__0 : rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 ;
    public final void rule__Section3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3207:1: ( rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3208:2: rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06583);
            rule__Section3__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06586);
            rule__Section3__Group_4__1();
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
    // $ANTLR end rule__Section3__Group_4__0


    // $ANTLR start rule__Section3__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3215:1: rule__Section3__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3219:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3220:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3220:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3221:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6613); 
             after(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_4__0__Impl


    // $ANTLR start rule__Section3__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3232:1: rule__Section3__Group_4__1 : rule__Section3__Group_4__1__Impl ;
    public final void rule__Section3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3236:1: ( rule__Section3__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3237:2: rule__Section3__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16642);
            rule__Section3__Group_4__1__Impl();
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
    // $ANTLR end rule__Section3__Group_4__1


    // $ANTLR start rule__Section3__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3243:1: rule__Section3__Group_4__1__Impl : ( ( rule__Section3__ContentsAssignment_4_1 ) ) ;
    public final void rule__Section3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3247:1: ( ( ( rule__Section3__ContentsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3248:1: ( ( rule__Section3__ContentsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3248:1: ( ( rule__Section3__ContentsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3249:1: ( rule__Section3__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3250:1: ( rule__Section3__ContentsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3250:2: rule__Section3__ContentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6669);
            rule__Section3__ContentsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__Group_4__1__Impl


    // $ANTLR start rule__Section4__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3264:1: rule__Section4__Group__0 : rule__Section4__Group__0__Impl rule__Section4__Group__1 ;
    public final void rule__Section4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3268:1: ( rule__Section4__Group__0__Impl rule__Section4__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3269:2: rule__Section4__Group__0__Impl rule__Section4__Group__1
            {
            pushFollow(FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06703);
            rule__Section4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06706);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3276:1: rule__Section4__Group__0__Impl : ( ( rule__Section4__Alternatives_0 ) ) ;
    public final void rule__Section4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3280:1: ( ( ( rule__Section4__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3281:1: ( ( rule__Section4__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3281:1: ( ( rule__Section4__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3282:1: ( rule__Section4__Alternatives_0 )
            {
             before(grammarAccess.getSection4Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3283:1: ( rule__Section4__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3283:2: rule__Section4__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6733);
            rule__Section4__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3293:1: rule__Section4__Group__1 : rule__Section4__Group__1__Impl rule__Section4__Group__2 ;
    public final void rule__Section4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3297:1: ( rule__Section4__Group__1__Impl rule__Section4__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3298:2: rule__Section4__Group__1__Impl rule__Section4__Group__2
            {
            pushFollow(FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16763);
            rule__Section4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16766);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3305:1: rule__Section4__Group__1__Impl : ( ( rule__Section4__TitleAssignment_1 ) ) ;
    public final void rule__Section4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3309:1: ( ( ( rule__Section4__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:1: ( ( rule__Section4__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:1: ( ( rule__Section4__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3311:1: ( rule__Section4__TitleAssignment_1 )
            {
             before(grammarAccess.getSection4Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3312:1: ( rule__Section4__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3312:2: rule__Section4__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6793);
            rule__Section4__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getTitleAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3322:1: rule__Section4__Group__2 : rule__Section4__Group__2__Impl rule__Section4__Group__3 ;
    public final void rule__Section4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3326:1: ( rule__Section4__Group__2__Impl rule__Section4__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3327:2: rule__Section4__Group__2__Impl rule__Section4__Group__3
            {
            pushFollow(FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26823);
            rule__Section4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26826);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3334:1: rule__Section4__Group__2__Impl : ( ']' ) ;
    public final void rule__Section4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3338:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3339:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3339:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3340:1: ']'
            {
             before(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Section4__Group__2__Impl6854); 
             after(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3353:1: rule__Section4__Group__3 : rule__Section4__Group__3__Impl ;
    public final void rule__Section4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3357:1: ( rule__Section4__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3358:2: rule__Section4__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36885);
            rule__Section4__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3364:1: rule__Section4__Group__3__Impl : ( ( rule__Section4__Group_3__0 )* ) ;
    public final void rule__Section4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3368:1: ( ( ( rule__Section4__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3369:1: ( ( rule__Section4__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3369:1: ( ( rule__Section4__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:1: ( rule__Section4__Group_3__0 )*
            {
             before(grammarAccess.getSection4Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3371:1: ( rule__Section4__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MULTI_NL) ) {
                    int LA34_2 = input.LA(2);

                    if ( ((LA34_2>=RULE_ID && LA34_2<=RULE_ANY_OTHER)||(LA34_2>=15 && LA34_2<=17)||(LA34_2>=26 && LA34_2<=30)||(LA34_2>=32 && LA34_2<=35)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3371:2: rule__Section4__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl6912);
            	    rule__Section4__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSection4Access().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start rule__Section4__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3389:1: rule__Section4__Group_0_0__0 : rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 ;
    public final void rule__Section4__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3393:1: ( rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3394:2: rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__06951);
            rule__Section4__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__06954);
            rule__Section4__Group_0_0__1();
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
    // $ANTLR end rule__Section4__Group_0_0__0


    // $ANTLR start rule__Section4__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3401:1: rule__Section4__Group_0_0__0__Impl : ( 'section4:' ) ;
    public final void rule__Section4__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3405:1: ( ( 'section4:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3406:1: ( 'section4:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3406:1: ( 'section4:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3407:1: 'section4:'
            {
             before(grammarAccess.getSection4Access().getSection4Keyword_0_0_0()); 
            match(input,25,FOLLOW_25_in_rule__Section4__Group_0_0__0__Impl6982); 
             after(grammarAccess.getSection4Access().getSection4Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__0__Impl


    // $ANTLR start rule__Section4__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3420:1: rule__Section4__Group_0_0__1 : rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 ;
    public final void rule__Section4__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3424:1: ( rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3425:2: rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__17013);
            rule__Section4__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__17016);
            rule__Section4__Group_0_0__2();
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
    // $ANTLR end rule__Section4__Group_0_0__1


    // $ANTLR start rule__Section4__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3432:1: rule__Section4__Group_0_0__1__Impl : ( ( rule__Section4__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section4__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3436:1: ( ( ( rule__Section4__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3437:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3437:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3438:1: ( rule__Section4__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection4Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3439:1: ( rule__Section4__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3439:2: rule__Section4__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7043);
            rule__Section4__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__1__Impl


    // $ANTLR start rule__Section4__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3449:1: rule__Section4__Group_0_0__2 : rule__Section4__Group_0_0__2__Impl ;
    public final void rule__Section4__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3453:1: ( rule__Section4__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3454:2: rule__Section4__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27073);
            rule__Section4__Group_0_0__2__Impl();
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
    // $ANTLR end rule__Section4__Group_0_0__2


    // $ANTLR start rule__Section4__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3460:1: rule__Section4__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section4__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3464:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3465:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3465:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3466:1: '['
            {
             before(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Section4__Group_0_0__2__Impl7101); 
             after(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_0_0__2__Impl


    // $ANTLR start rule__Section4__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3485:1: rule__Section4__Group_3__0 : rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 ;
    public final void rule__Section4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3489:1: ( rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3490:2: rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07138);
            rule__Section4__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07141);
            rule__Section4__Group_3__1();
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
    // $ANTLR end rule__Section4__Group_3__0


    // $ANTLR start rule__Section4__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3497:1: rule__Section4__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3501:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3502:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3502:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3503:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7168); 
             after(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_3__0__Impl


    // $ANTLR start rule__Section4__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3514:1: rule__Section4__Group_3__1 : rule__Section4__Group_3__1__Impl ;
    public final void rule__Section4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3518:1: ( rule__Section4__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3519:2: rule__Section4__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17197);
            rule__Section4__Group_3__1__Impl();
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
    // $ANTLR end rule__Section4__Group_3__1


    // $ANTLR start rule__Section4__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3525:1: rule__Section4__Group_3__1__Impl : ( ( rule__Section4__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3529:1: ( ( ( rule__Section4__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3530:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3530:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3531:1: ( rule__Section4__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3532:1: ( rule__Section4__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3532:2: rule__Section4__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7224);
            rule__Section4__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSection4Access().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__Group_3__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3546:1: rule__TextOrMarkup__Group_0__0 : rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 ;
    public final void rule__TextOrMarkup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3550:1: ( rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3551:2: rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07258);
            rule__TextOrMarkup__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07261);
            rule__TextOrMarkup__Group_0__1();
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
    // $ANTLR end rule__TextOrMarkup__Group_0__0


    // $ANTLR start rule__TextOrMarkup__Group_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3558:1: rule__TextOrMarkup__Group_0__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3562:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3563:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3563:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3564:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3565:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3565:2: rule__TextOrMarkup__ContentsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7288);
            rule__TextOrMarkup__ContentsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3575:1: rule__TextOrMarkup__Group_0__1 : rule__TextOrMarkup__Group_0__1__Impl ;
    public final void rule__TextOrMarkup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3579:1: ( rule__TextOrMarkup__Group_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3580:2: rule__TextOrMarkup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17318);
            rule__TextOrMarkup__Group_0__1__Impl();
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
    // $ANTLR end rule__TextOrMarkup__Group_0__1


    // $ANTLR start rule__TextOrMarkup__Group_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3586:1: rule__TextOrMarkup__Group_0__1__Impl : ( ( rule__TextOrMarkup__Group_0_1__0 )* ) ;
    public final void rule__TextOrMarkup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3590:1: ( ( ( rule__TextOrMarkup__Group_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3591:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3591:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3592:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3593:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17||(LA35_0>=26 && LA35_0<=30)||(LA35_0>=32 && LA35_0<=35)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3593:2: rule__TextOrMarkup__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7345);
            	    rule__TextOrMarkup__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3607:1: rule__TextOrMarkup__Group_0_1__0 : rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 ;
    public final void rule__TextOrMarkup__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3611:1: ( rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3612:2: rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07380);
            rule__TextOrMarkup__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07383);
            rule__TextOrMarkup__Group_0_1__1();
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
    // $ANTLR end rule__TextOrMarkup__Group_0_1__0


    // $ANTLR start rule__TextOrMarkup__Group_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3619:1: rule__TextOrMarkup__Group_0_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3623:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3624:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3624:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3625:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3626:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3626:2: rule__TextOrMarkup__ContentsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7410);
            rule__TextOrMarkup__ContentsAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3636:1: rule__TextOrMarkup__Group_0_1__1 : rule__TextOrMarkup__Group_0_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3640:1: ( rule__TextOrMarkup__Group_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3641:2: rule__TextOrMarkup__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17440);
            rule__TextOrMarkup__Group_0_1__1__Impl();
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
    // $ANTLR end rule__TextOrMarkup__Group_0_1__1


    // $ANTLR start rule__TextOrMarkup__Group_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3647:1: rule__TextOrMarkup__Group_0_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3651:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3652:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3652:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3653:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3654:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_ANY_OTHER)||(LA36_0>=15 && LA36_0<=16)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3654:2: rule__TextOrMarkup__ContentsAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7467);
                    rule__TextOrMarkup__ContentsAssignment_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_0_1__1__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3668:1: rule__TextOrMarkup__Group_1__0 : rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 ;
    public final void rule__TextOrMarkup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3672:1: ( rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3673:2: rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07502);
            rule__TextOrMarkup__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07505);
            rule__TextOrMarkup__Group_1__1();
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
    // $ANTLR end rule__TextOrMarkup__Group_1__0


    // $ANTLR start rule__TextOrMarkup__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3680:1: rule__TextOrMarkup__Group_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3684:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3685:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3685:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3686:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3687:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3687:2: rule__TextOrMarkup__ContentsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7532);
            rule__TextOrMarkup__ContentsAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__0__Impl


    // $ANTLR start rule__TextOrMarkup__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3697:1: rule__TextOrMarkup__Group_1__1 : rule__TextOrMarkup__Group_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3701:1: ( rule__TextOrMarkup__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3702:2: rule__TextOrMarkup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17562);
            rule__TextOrMarkup__Group_1__1__Impl();
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
    // $ANTLR end rule__TextOrMarkup__Group_1__1


    // $ANTLR start rule__TextOrMarkup__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3708:1: rule__TextOrMarkup__Group_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3712:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3713:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3713:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3714:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3715:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_ANY_OTHER)||(LA37_0>=15 && LA37_0<=16)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3715:2: rule__TextOrMarkup__ContentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7589);
                    rule__TextOrMarkup__ContentsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__Group_1__1__Impl


    // $ANTLR start rule__Emphasize__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3729:1: rule__Emphasize__Group__0 : rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 ;
    public final void rule__Emphasize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3733:1: ( rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3734:2: rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07624);
            rule__Emphasize__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07627);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3741:1: rule__Emphasize__Group__0__Impl : ( 'emph[' ) ;
    public final void rule__Emphasize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3745:1: ( ( 'emph[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3746:1: ( 'emph[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3746:1: ( 'emph[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3747:1: 'emph['
            {
             before(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Emphasize__Group__0__Impl7655); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3760:1: rule__Emphasize__Group__1 : rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 ;
    public final void rule__Emphasize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3764:1: ( rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3765:2: rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17686);
            rule__Emphasize__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17689);
            rule__Emphasize__Group__2();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3772:1: rule__Emphasize__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3776:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3777:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3777:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3778:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3779:1: ( RULE_MULTI_NL )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_MULTI_NL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3779:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7717); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Emphasize__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3789:1: rule__Emphasize__Group__2 : rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 ;
    public final void rule__Emphasize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3793:1: ( rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3794:2: rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27748);
            rule__Emphasize__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27751);
            rule__Emphasize__Group__3();
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
    // $ANTLR end rule__Emphasize__Group__2


    // $ANTLR start rule__Emphasize__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3801:1: rule__Emphasize__Group__2__Impl : ( ( rule__Emphasize__ContentsAssignment_2 ) ) ;
    public final void rule__Emphasize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3805:1: ( ( ( rule__Emphasize__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3807:1: ( rule__Emphasize__ContentsAssignment_2 )
            {
             before(grammarAccess.getEmphasizeAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3808:1: ( rule__Emphasize__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3808:2: rule__Emphasize__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7778);
            rule__Emphasize__ContentsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEmphasizeAccess().getContentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__2__Impl


    // $ANTLR start rule__Emphasize__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3818:1: rule__Emphasize__Group__3 : rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 ;
    public final void rule__Emphasize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3822:1: ( rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3823:2: rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37808);
            rule__Emphasize__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37811);
            rule__Emphasize__Group__4();
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
    // $ANTLR end rule__Emphasize__Group__3


    // $ANTLR start rule__Emphasize__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3830:1: rule__Emphasize__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3834:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3835:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3835:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3836:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:1: ( RULE_MULTI_NL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_MULTI_NL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7839); 

                    }
                    break;

            }

             after(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__3__Impl


    // $ANTLR start rule__Emphasize__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3847:1: rule__Emphasize__Group__4 : rule__Emphasize__Group__4__Impl ;
    public final void rule__Emphasize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3851:1: ( rule__Emphasize__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3852:2: rule__Emphasize__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47870);
            rule__Emphasize__Group__4__Impl();
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
    // $ANTLR end rule__Emphasize__Group__4


    // $ANTLR start rule__Emphasize__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3858:1: rule__Emphasize__Group__4__Impl : ( ']' ) ;
    public final void rule__Emphasize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3862:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3863:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3863:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3864:1: ']'
            {
             before(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Emphasize__Group__4__Impl7898); 
             after(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__Group__4__Impl


    // $ANTLR start rule__Anchor__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3887:1: rule__Anchor__Group__0 : rule__Anchor__Group__0__Impl rule__Anchor__Group__1 ;
    public final void rule__Anchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3891:1: ( rule__Anchor__Group__0__Impl rule__Anchor__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3892:2: rule__Anchor__Group__0__Impl rule__Anchor__Group__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__07939);
            rule__Anchor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__07942);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3899:1: rule__Anchor__Group__0__Impl : ( 'a[' ) ;
    public final void rule__Anchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3903:1: ( ( 'a[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3904:1: ( 'a[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3904:1: ( 'a[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3905:1: 'a['
            {
             before(grammarAccess.getAnchorAccess().getAKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Anchor__Group__0__Impl7970); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3918:1: rule__Anchor__Group__1 : rule__Anchor__Group__1__Impl rule__Anchor__Group__2 ;
    public final void rule__Anchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3922:1: ( rule__Anchor__Group__1__Impl rule__Anchor__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3923:2: rule__Anchor__Group__1__Impl rule__Anchor__Group__2
            {
            pushFollow(FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18001);
            rule__Anchor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18004);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3930:1: rule__Anchor__Group__1__Impl : ( ( rule__Anchor__NameAssignment_1 ) ) ;
    public final void rule__Anchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3934:1: ( ( ( rule__Anchor__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3935:1: ( ( rule__Anchor__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3935:1: ( ( rule__Anchor__NameAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3936:1: ( rule__Anchor__NameAssignment_1 )
            {
             before(grammarAccess.getAnchorAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3937:1: ( rule__Anchor__NameAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3937:2: rule__Anchor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8031);
            rule__Anchor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAnchorAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3947:1: rule__Anchor__Group__2 : rule__Anchor__Group__2__Impl ;
    public final void rule__Anchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3951:1: ( rule__Anchor__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3952:2: rule__Anchor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28061);
            rule__Anchor__Group__2__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3958:1: rule__Anchor__Group__2__Impl : ( ']' ) ;
    public final void rule__Anchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3962:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3963:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3963:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3964:1: ']'
            {
             before(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Anchor__Group__2__Impl8089); 
             after(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Ref__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3983:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3987:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3988:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08126);
            rule__Ref__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08129);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3995:1: rule__Ref__Group__0__Impl : ( 'ref:' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3999:1: ( ( 'ref:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4000:1: ( 'ref:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4000:1: ( 'ref:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4001:1: 'ref:'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Ref__Group__0__Impl8157); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4014:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4018:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4019:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18188);
            rule__Ref__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18191);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4026:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__RefAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4030:1: ( ( ( rule__Ref__RefAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4031:1: ( ( rule__Ref__RefAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4031:1: ( ( rule__Ref__RefAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4032:1: ( rule__Ref__RefAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getRefAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4033:1: ( rule__Ref__RefAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4033:2: rule__Ref__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8218);
            rule__Ref__RefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRefAccess().getRefAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4043:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4047:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4048:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28248);
            rule__Ref__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28251);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4055:1: rule__Ref__Group__2__Impl : ( '[' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4059:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4060:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4060:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4061:1: '['
            {
             before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Ref__Group__2__Impl8279); 
             after(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4074:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4078:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4079:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38310);
            rule__Ref__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38313);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4086:1: rule__Ref__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4090:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4091:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4091:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4092:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:1: ( RULE_MULTI_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_MULTI_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8341); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4103:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4107:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4108:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48372);
            rule__Ref__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48375);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4115:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__ContentsAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4119:1: ( ( ( rule__Ref__ContentsAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4121:1: ( rule__Ref__ContentsAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getContentsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4122:1: ( rule__Ref__ContentsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4122:2: rule__Ref__ContentsAssignment_4
            {
            pushFollow(FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8402);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4132:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4136:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4137:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58432);
            rule__Ref__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58435);
            rule__Ref__Group__6();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4144:1: rule__Ref__Group__5__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4148:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4149:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4149:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4150:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4151:1: ( RULE_MULTI_NL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_MULTI_NL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4151:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8463); 

                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Ref__Group__6
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4161:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4165:1: ( rule__Ref__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4166:2: rule__Ref__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68494);
            rule__Ref__Group__6__Impl();
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
    // $ANTLR end rule__Ref__Group__6


    // $ANTLR start rule__Ref__Group__6__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4172:1: rule__Ref__Group__6__Impl : ( ']' ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4176:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4177:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4177:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4178:1: ']'
            {
             before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Ref__Group__6__Impl8522); 
             after(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__Group__6__Impl


    // $ANTLR start rule__OrderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4205:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4210:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08567);
            rule__OrderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08570);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4217:1: rule__OrderedList__Group__0__Impl : ( 'ol[' ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4221:1: ( ( 'ol[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4222:1: ( 'ol[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4222:1: ( 'ol[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4223:1: 'ol['
            {
             before(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__OrderedList__Group__0__Impl8598); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4236:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4240:1: ( rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4241:2: rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18629);
            rule__OrderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18632);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4248:1: rule__OrderedList__Group__1__Impl : ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4252:1: ( ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4253:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4253:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4254:1: ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4254:1: ( ( rule__OrderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4255:1: ( rule__OrderedList__Group_1__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4256:1: ( rule__OrderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4256:2: rule__OrderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8661);
            rule__OrderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4259:1: ( ( rule__OrderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4260:1: ( rule__OrderedList__Group_1__0 )*
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4261:1: ( rule__OrderedList__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4261:2: rule__OrderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8673);
            	    rule__OrderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getGroup_1()); 

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
    // $ANTLR end rule__OrderedList__Group__1__Impl


    // $ANTLR start rule__OrderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4272:1: rule__OrderedList__Group__2 : rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 ;
    public final void rule__OrderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4276:1: ( rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4277:2: rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28706);
            rule__OrderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28709);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4284:1: rule__OrderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4288:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4289:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4289:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4290:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4291:1: ( ruleANY_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_WS && LA43_0<=RULE_SINGLE_NL)||LA43_0==RULE_MULTI_NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4291:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8737);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4301:1: rule__OrderedList__Group__3 : rule__OrderedList__Group__3__Impl ;
    public final void rule__OrderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4305:1: ( rule__OrderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4306:2: rule__OrderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38768);
            rule__OrderedList__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4312:1: rule__OrderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__OrderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4316:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4317:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4317:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4318:1: ']'
            {
             before(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__OrderedList__Group__3__Impl8796); 
             after(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__OrderedList__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4339:1: rule__OrderedList__Group_1__0 : rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 ;
    public final void rule__OrderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4343:1: ( rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4344:2: rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08835);
            rule__OrderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08838);
            rule__OrderedList__Group_1__1();
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
    // $ANTLR end rule__OrderedList__Group_1__0


    // $ANTLR start rule__OrderedList__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4351:1: rule__OrderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4355:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4356:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4356:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4357:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4358:1: ( ruleANY_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_SINGLE_NL)||LA44_0==RULE_MULTI_NL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4358:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl8866);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_1__0__Impl


    // $ANTLR start rule__OrderedList__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4368:1: rule__OrderedList__Group_1__1 : rule__OrderedList__Group_1__1__Impl ;
    public final void rule__OrderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4372:1: ( rule__OrderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4373:2: rule__OrderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__18897);
            rule__OrderedList__Group_1__1__Impl();
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
    // $ANTLR end rule__OrderedList__Group_1__1


    // $ANTLR start rule__OrderedList__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4379:1: rule__OrderedList__Group_1__1__Impl : ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__OrderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4383:1: ( ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4384:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4384:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4385:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4386:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4386:2: rule__OrderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl8924);
            rule__OrderedList__ItemsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__Group_1__1__Impl


    // $ANTLR start rule__UnorderedList__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4400:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4404:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4405:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__08958);
            rule__UnorderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__08961);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4412:1: rule__UnorderedList__Group__0__Impl : ( 'ul[' ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4416:1: ( ( 'ul[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4417:1: ( 'ul[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4417:1: ( 'ul[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4418:1: 'ul['
            {
             before(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__UnorderedList__Group__0__Impl8989); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4431:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4435:1: ( rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4436:2: rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19020);
            rule__UnorderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19023);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4443:1: rule__UnorderedList__Group__1__Impl : ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4447:1: ( ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4448:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4448:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4449:1: ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4449:1: ( ( rule__UnorderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4450:1: ( rule__UnorderedList__Group_1__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4451:1: ( rule__UnorderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4451:2: rule__UnorderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9052);
            rule__UnorderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4454:1: ( ( rule__UnorderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4455:1: ( rule__UnorderedList__Group_1__0 )*
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4456:1: ( rule__UnorderedList__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4456:2: rule__UnorderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9064);
            	    rule__UnorderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getGroup_1()); 

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
    // $ANTLR end rule__UnorderedList__Group__1__Impl


    // $ANTLR start rule__UnorderedList__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4467:1: rule__UnorderedList__Group__2 : rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 ;
    public final void rule__UnorderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4471:1: ( rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4472:2: rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29097);
            rule__UnorderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29100);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4479:1: rule__UnorderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4483:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4484:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4484:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4485:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4486:1: ( ruleANY_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_WS && LA46_0<=RULE_SINGLE_NL)||LA46_0==RULE_MULTI_NL) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4486:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9128);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4496:1: rule__UnorderedList__Group__3 : rule__UnorderedList__Group__3__Impl ;
    public final void rule__UnorderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4500:1: ( rule__UnorderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4501:2: rule__UnorderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39159);
            rule__UnorderedList__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4507:1: rule__UnorderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__UnorderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4511:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4512:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4512:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4513:1: ']'
            {
             before(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__UnorderedList__Group__3__Impl9187); 
             after(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__UnorderedList__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4534:1: rule__UnorderedList__Group_1__0 : rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 ;
    public final void rule__UnorderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4538:1: ( rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4539:2: rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09226);
            rule__UnorderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09229);
            rule__UnorderedList__Group_1__1();
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
    // $ANTLR end rule__UnorderedList__Group_1__0


    // $ANTLR start rule__UnorderedList__Group_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4546:1: rule__UnorderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4550:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4551:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4551:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4552:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4553:1: ( ruleANY_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_WS && LA47_0<=RULE_SINGLE_NL)||LA47_0==RULE_MULTI_NL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4553:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9257);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_1__0__Impl


    // $ANTLR start rule__UnorderedList__Group_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4563:1: rule__UnorderedList__Group_1__1 : rule__UnorderedList__Group_1__1__Impl ;
    public final void rule__UnorderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4567:1: ( rule__UnorderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4568:2: rule__UnorderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19288);
            rule__UnorderedList__Group_1__1__Impl();
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
    // $ANTLR end rule__UnorderedList__Group_1__1


    // $ANTLR start rule__UnorderedList__Group_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4574:1: rule__UnorderedList__Group_1__1__Impl : ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__UnorderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4578:1: ( ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4579:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4579:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4580:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4581:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4581:2: rule__UnorderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9315);
            rule__UnorderedList__ItemsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__Group_1__1__Impl


    // $ANTLR start rule__Item__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4595:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4599:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4600:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09349);
            rule__Item__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09352);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4607:1: rule__Item__Group__0__Impl : ( 'item[' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( ( 'item[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4612:1: ( 'item[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4612:1: ( 'item[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4613:1: 'item['
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Item__Group__0__Impl9380); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4626:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4630:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4631:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19411);
            rule__Item__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19414);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4638:1: rule__Item__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4642:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4643:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4643:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4644:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4645:1: ( RULE_MULTI_NL )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_MULTI_NL) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4645:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9442); 

                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4655:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4659:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4660:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29473);
            rule__Item__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29476);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4667:1: rule__Item__Group__2__Impl : ( ( rule__Item__ContentsAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4671:1: ( ( ( rule__Item__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( ( rule__Item__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( ( rule__Item__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4673:1: ( rule__Item__ContentsAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4674:1: ( rule__Item__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4674:2: rule__Item__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9503);
            rule__Item__ContentsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4684:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4688:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4689:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39533);
            rule__Item__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39536);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4696:1: rule__Item__Group__3__Impl : ( ( rule__Item__Group_3__0 )* ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4700:1: ( ( ( rule__Item__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4701:1: ( ( rule__Item__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4701:1: ( ( rule__Item__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4702:1: ( rule__Item__Group_3__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:1: ( rule__Item__Group_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_MULTI_NL) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:2: rule__Item__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9563);
            	    rule__Item__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4713:1: rule__Item__Group__4 : rule__Item__Group__4__Impl ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4717:1: ( rule__Item__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4718:2: rule__Item__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49594);
            rule__Item__Group__4__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4724:1: rule__Item__Group__4__Impl : ( ']' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4728:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4729:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4729:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4730:1: ']'
            {
             before(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Item__Group__4__Impl9622); 
             after(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Item__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4753:1: rule__Item__Group_3__0 : rule__Item__Group_3__0__Impl rule__Item__Group_3__1 ;
    public final void rule__Item__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4757:1: ( rule__Item__Group_3__0__Impl rule__Item__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4758:2: rule__Item__Group_3__0__Impl rule__Item__Group_3__1
            {
            pushFollow(FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09663);
            rule__Item__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09666);
            rule__Item__Group_3__1();
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
    // $ANTLR end rule__Item__Group_3__0


    // $ANTLR start rule__Item__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4765:1: rule__Item__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Item__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4769:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4770:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4770:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4771:1: RULE_MULTI_NL
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9693); 
             after(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_3__0__Impl


    // $ANTLR start rule__Item__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4782:1: rule__Item__Group_3__1 : rule__Item__Group_3__1__Impl ;
    public final void rule__Item__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4786:1: ( rule__Item__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4787:2: rule__Item__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19722);
            rule__Item__Group_3__1__Impl();
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
    // $ANTLR end rule__Item__Group_3__1


    // $ANTLR start rule__Item__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4793:1: rule__Item__Group_3__1__Impl : ( ( rule__Item__ContentsAssignment_3_1 ) ) ;
    public final void rule__Item__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4797:1: ( ( ( rule__Item__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4798:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4798:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4799:1: ( rule__Item__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4800:1: ( rule__Item__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4800:2: rule__Item__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9749);
            rule__Item__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getItemAccess().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__Group_3__1__Impl


    // $ANTLR start rule__CodeRef__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4814:1: rule__CodeRef__Group__0 : rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 ;
    public final void rule__CodeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4818:1: ( rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4819:2: rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09783);
            rule__CodeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09786);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4826:1: rule__CodeRef__Group__0__Impl : ( 'codeRef[' ) ;
    public final void rule__CodeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4830:1: ( ( 'codeRef[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4831:1: ( 'codeRef[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4831:1: ( 'codeRef[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4832:1: 'codeRef['
            {
             before(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__CodeRef__Group__0__Impl9814); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4845:1: rule__CodeRef__Group__1 : rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 ;
    public final void rule__CodeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4849:1: ( rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4850:2: rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19845);
            rule__CodeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19848);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4857:1: rule__CodeRef__Group__1__Impl : ( ( rule__CodeRef__ElementAssignment_1 ) ) ;
    public final void rule__CodeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4861:1: ( ( ( rule__CodeRef__ElementAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4862:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4862:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4863:1: ( rule__CodeRef__ElementAssignment_1 )
            {
             before(grammarAccess.getCodeRefAccess().getElementAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4864:1: ( rule__CodeRef__ElementAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4864:2: rule__CodeRef__ElementAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl9875);
            rule__CodeRef__ElementAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCodeRefAccess().getElementAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4874:1: rule__CodeRef__Group__2 : rule__CodeRef__Group__2__Impl ;
    public final void rule__CodeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4878:1: ( rule__CodeRef__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4879:2: rule__CodeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__29905);
            rule__CodeRef__Group__2__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4885:1: rule__CodeRef__Group__2__Impl : ( ']' ) ;
    public final void rule__CodeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4889:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4890:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4890:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4891:1: ']'
            {
             before(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__CodeRef__Group__2__Impl9933); 
             after(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Link__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4910:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4914:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4915:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__09970);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__09973);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4922:1: rule__Link__Group__0__Impl : ( 'link[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4926:1: ( ( 'link[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4927:1: ( 'link[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4927:1: ( 'link[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4928:1: 'link['
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Link__Group__0__Impl10001); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4941:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4945:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4946:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110032);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110035);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4953:1: rule__Link__Group__1__Impl : ( ( rule__Link__UrlAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4957:1: ( ( ( rule__Link__UrlAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4958:1: ( ( rule__Link__UrlAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4958:1: ( ( rule__Link__UrlAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4959:1: ( rule__Link__UrlAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4960:1: ( rule__Link__UrlAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4960:2: rule__Link__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10062);
            rule__Link__UrlAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4970:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4974:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4975:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210092);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210095);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4982:1: rule__Link__Group__2__Impl : ( ']' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4986:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4987:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4987:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4988:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Link__Group__2__Impl10123); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5001:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5005:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5006:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310154);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310157);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5013:1: rule__Link__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5017:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5018:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5018:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5019:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5020:1: ( ruleANY_WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_WS && LA50_0<=RULE_SINGLE_NL)||LA50_0==RULE_MULTI_NL) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5020:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10185);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5030:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5034:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5035:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410216);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410219);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5042:1: rule__Link__Group__4__Impl : ( '[' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5046:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5047:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5047:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5048:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Link__Group__4__Impl10247); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5061:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5065:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5066:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510278);
            rule__Link__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510281);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5073:1: rule__Link__Group__5__Impl : ( ( rule__Link__TextAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5077:1: ( ( ( rule__Link__TextAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5078:1: ( ( rule__Link__TextAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5078:1: ( ( rule__Link__TextAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5079:1: ( rule__Link__TextAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:1: ( rule__Link__TextAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:2: rule__Link__TextAssignment_5
            {
            pushFollow(FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10308);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5090:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5094:1: ( rule__Link__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5095:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610338);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5101:1: rule__Link__Group__6__Impl : ( ']' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5105:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5106:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5106:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Link__Group__6__Impl10366); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5134:1: rule__ImageRef__Group__0 : rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 ;
    public final void rule__ImageRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5138:1: ( rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5139:2: rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010411);
            rule__ImageRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010414);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5146:1: rule__ImageRef__Group__0__Impl : ( ( rule__ImageRef__Alternatives_0 ) ) ;
    public final void rule__ImageRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5150:1: ( ( ( rule__ImageRef__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5151:1: ( ( rule__ImageRef__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5151:1: ( ( rule__ImageRef__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5152:1: ( rule__ImageRef__Alternatives_0 )
            {
             before(grammarAccess.getImageRefAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5153:1: ( rule__ImageRef__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5153:2: rule__ImageRef__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10441);
            rule__ImageRef__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5163:1: rule__ImageRef__Group__1 : rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 ;
    public final void rule__ImageRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5167:1: ( rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5168:2: rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110471);
            rule__ImageRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110474);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5175:1: rule__ImageRef__Group__1__Impl : ( ( rule__ImageRef__PathAssignment_1 ) ) ;
    public final void rule__ImageRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5179:1: ( ( ( rule__ImageRef__PathAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5180:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5180:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5181:1: ( rule__ImageRef__PathAssignment_1 )
            {
             before(grammarAccess.getImageRefAccess().getPathAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5182:1: ( rule__ImageRef__PathAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5182:2: rule__ImageRef__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10501);
            rule__ImageRef__PathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getPathAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5192:1: rule__ImageRef__Group__2 : rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 ;
    public final void rule__ImageRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5196:1: ( rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5197:2: rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210531);
            rule__ImageRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210534);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5204:1: rule__ImageRef__Group__2__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5208:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5209:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5209:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5210:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ImageRef__Group__2__Impl10562); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5223:1: rule__ImageRef__Group__3 : rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 ;
    public final void rule__ImageRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5227:1: ( rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5228:2: rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310593);
            rule__ImageRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310596);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5235:1: rule__ImageRef__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5239:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5240:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5240:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5241:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:1: ( ruleANY_WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_SINGLE_NL)||LA51_0==RULE_MULTI_NL) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10624);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5252:1: rule__ImageRef__Group__4 : rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 ;
    public final void rule__ImageRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5256:1: ( rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5257:2: rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410655);
            rule__ImageRef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410658);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5264:1: rule__ImageRef__Group__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5268:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5269:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5269:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5270:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__ImageRef__Group__4__Impl10686); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5283:1: rule__ImageRef__Group__5 : rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 ;
    public final void rule__ImageRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5287:1: ( rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5288:2: rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510717);
            rule__ImageRef__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510720);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5295:1: rule__ImageRef__Group__5__Impl : ( ( rule__ImageRef__ClazzAssignment_5 ) ) ;
    public final void rule__ImageRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5299:1: ( ( ( rule__ImageRef__ClazzAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5300:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5300:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5301:1: ( rule__ImageRef__ClazzAssignment_5 )
            {
             before(grammarAccess.getImageRefAccess().getClazzAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:1: ( rule__ImageRef__ClazzAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:2: rule__ImageRef__ClazzAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10747);
            rule__ImageRef__ClazzAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getClazzAssignment_5()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5312:1: rule__ImageRef__Group__6 : rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 ;
    public final void rule__ImageRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5316:1: ( rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5317:2: rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610777);
            rule__ImageRef__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610780);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5324:1: rule__ImageRef__Group__6__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5328:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5329:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5329:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5330:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__ImageRef__Group__6__Impl10808); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5343:1: rule__ImageRef__Group__7 : rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 ;
    public final void rule__ImageRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5347:1: ( rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5348:2: rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710839);
            rule__ImageRef__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710842);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5355:1: rule__ImageRef__Group__7__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5359:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5360:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5360:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5361:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:1: ( ruleANY_WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_SINGLE_NL)||LA52_0==RULE_MULTI_NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl10870);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5372:1: rule__ImageRef__Group__8 : rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 ;
    public final void rule__ImageRef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5376:1: ( rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5377:2: rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__810901);
            rule__ImageRef__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__810904);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5384:1: rule__ImageRef__Group__8__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5388:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5389:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5389:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5390:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__ImageRef__Group__8__Impl10932); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5403:1: rule__ImageRef__Group__9 : rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 ;
    public final void rule__ImageRef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5407:1: ( rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5408:2: rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__910963);
            rule__ImageRef__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__910966);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5415:1: rule__ImageRef__Group__9__Impl : ( ( rule__ImageRef__StyleAssignment_9 ) ) ;
    public final void rule__ImageRef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5419:1: ( ( ( rule__ImageRef__StyleAssignment_9 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5420:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5420:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5421:1: ( rule__ImageRef__StyleAssignment_9 )
            {
             before(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5422:1: ( rule__ImageRef__StyleAssignment_9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5422:2: rule__ImageRef__StyleAssignment_9
            {
            pushFollow(FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl10993);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5432:1: rule__ImageRef__Group__10 : rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 ;
    public final void rule__ImageRef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5436:1: ( rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5437:2: rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011023);
            rule__ImageRef__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011026);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5444:1: rule__ImageRef__Group__10__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5448:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5449:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5449:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5450:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__ImageRef__Group__10__Impl11054); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5463:1: rule__ImageRef__Group__11 : rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 ;
    public final void rule__ImageRef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5467:1: ( rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5468:2: rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111085);
            rule__ImageRef__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111088);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5475:1: rule__ImageRef__Group__11__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5479:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5480:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5480:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5481:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5482:1: ( ruleANY_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_SINGLE_NL)||LA53_0==RULE_MULTI_NL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5482:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11116);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5492:1: rule__ImageRef__Group__12 : rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 ;
    public final void rule__ImageRef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5496:1: ( rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5497:2: rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211147);
            rule__ImageRef__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211150);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5504:1: rule__ImageRef__Group__12__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5508:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5509:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5509:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5510:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12()); 
            match(input,21,FOLLOW_21_in_rule__ImageRef__Group__12__Impl11178); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5523:1: rule__ImageRef__Group__13 : rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 ;
    public final void rule__ImageRef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: ( rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5528:2: rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311209);
            rule__ImageRef__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311212);
            rule__ImageRef__Group__14();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5535:1: rule__ImageRef__Group__13__Impl : ( ( rule__ImageRef__CaptionAssignment_13 ) ) ;
    public final void rule__ImageRef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5539:1: ( ( ( rule__ImageRef__CaptionAssignment_13 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5540:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5540:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5541:1: ( rule__ImageRef__CaptionAssignment_13 )
            {
             before(grammarAccess.getImageRefAccess().getCaptionAssignment_13()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5542:1: ( rule__ImageRef__CaptionAssignment_13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5542:2: rule__ImageRef__CaptionAssignment_13
            {
            pushFollow(FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11239);
            rule__ImageRef__CaptionAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getCaptionAssignment_13()); 

            }


            }

        }
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


    // $ANTLR start rule__ImageRef__Group__14
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5552:1: rule__ImageRef__Group__14 : rule__ImageRef__Group__14__Impl ;
    public final void rule__ImageRef__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5556:1: ( rule__ImageRef__Group__14__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5557:2: rule__ImageRef__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411269);
            rule__ImageRef__Group__14__Impl();
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
    // $ANTLR end rule__ImageRef__Group__14


    // $ANTLR start rule__ImageRef__Group__14__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5563:1: rule__ImageRef__Group__14__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5567:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5568:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5568:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5569:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14()); 
            match(input,19,FOLLOW_19_in_rule__ImageRef__Group__14__Impl11297); 
             after(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group__14__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5612:1: rule__ImageRef__Group_0_0__0 : rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 ;
    public final void rule__ImageRef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5616:1: ( rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5617:2: rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011358);
            rule__ImageRef__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011361);
            rule__ImageRef__Group_0_0__1();
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
    // $ANTLR end rule__ImageRef__Group_0_0__0


    // $ANTLR start rule__ImageRef__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5624:1: rule__ImageRef__Group_0_0__0__Impl : ( 'img:' ) ;
    public final void rule__ImageRef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5628:1: ( ( 'img:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5629:1: ( 'img:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5629:1: ( 'img:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5630:1: 'img:'
            {
             before(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0()); 
            match(input,34,FOLLOW_34_in_rule__ImageRef__Group_0_0__0__Impl11389); 
             after(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__0__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5643:1: rule__ImageRef__Group_0_0__1 : rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 ;
    public final void rule__ImageRef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5647:1: ( rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5648:2: rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111420);
            rule__ImageRef__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111423);
            rule__ImageRef__Group_0_0__2();
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
    // $ANTLR end rule__ImageRef__Group_0_0__1


    // $ANTLR start rule__ImageRef__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5655:1: rule__ImageRef__Group_0_0__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5659:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5660:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5660:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5661:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5662:1: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_SINGLE_NL)||LA54_0==RULE_MULTI_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5662:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11451);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__1__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5672:1: rule__ImageRef__Group_0_0__2 : rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 ;
    public final void rule__ImageRef__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5676:1: ( rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5677:2: rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211482);
            rule__ImageRef__Group_0_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211485);
            rule__ImageRef__Group_0_0__3();
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
    // $ANTLR end rule__ImageRef__Group_0_0__2


    // $ANTLR start rule__ImageRef__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5684:1: rule__ImageRef__Group_0_0__2__Impl : ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) ;
    public final void rule__ImageRef__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5688:1: ( ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5689:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5689:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5690:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            {
             before(grammarAccess.getImageRefAccess().getNameAssignment_0_0_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5691:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5691:2: rule__ImageRef__NameAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11512);
            rule__ImageRef__NameAssignment_0_0_2();
            _fsp--;


            }

             after(grammarAccess.getImageRefAccess().getNameAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__2__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5701:1: rule__ImageRef__Group_0_0__3 : rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 ;
    public final void rule__ImageRef__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5705:1: ( rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5706:2: rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311542);
            rule__ImageRef__Group_0_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311545);
            rule__ImageRef__Group_0_0__4();
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
    // $ANTLR end rule__ImageRef__Group_0_0__3


    // $ANTLR start rule__ImageRef__Group_0_0__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5713:1: rule__ImageRef__Group_0_0__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5717:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5718:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5718:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5719:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5720:1: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_SINGLE_NL)||LA55_0==RULE_MULTI_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5720:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11573);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__3__Impl


    // $ANTLR start rule__ImageRef__Group_0_0__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5730:1: rule__ImageRef__Group_0_0__4 : rule__ImageRef__Group_0_0__4__Impl ;
    public final void rule__ImageRef__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5734:1: ( rule__ImageRef__Group_0_0__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5735:2: rule__ImageRef__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411604);
            rule__ImageRef__Group_0_0__4__Impl();
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
    // $ANTLR end rule__ImageRef__Group_0_0__4


    // $ANTLR start rule__ImageRef__Group_0_0__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5741:1: rule__ImageRef__Group_0_0__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5745:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5746:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5746:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5747:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4()); 
            match(input,21,FOLLOW_21_in_rule__ImageRef__Group_0_0__4__Impl11632); 
             after(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__Group_0_0__4__Impl


    // $ANTLR start rule__CodeBlock__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5770:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5774:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5775:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011673);
            rule__CodeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011676);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5782:1: rule__CodeBlock__Group__0__Impl : ( 'code[' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5786:1: ( ( 'code[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5787:1: ( 'code[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5787:1: ( 'code[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5788:1: 'code['
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__CodeBlock__Group__0__Impl11704); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5801:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5805:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5806:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111735);
            rule__CodeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111738);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5813:1: rule__CodeBlock__Group__1__Impl : ( ( rule__CodeBlock__Group_1__0 )? ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5817:1: ( ( ( rule__CodeBlock__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5818:1: ( ( rule__CodeBlock__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5818:1: ( ( rule__CodeBlock__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5819:1: ( rule__CodeBlock__Group_1__0 )?
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5820:1: ( rule__CodeBlock__Group_1__0 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5820:2: rule__CodeBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11765);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5830:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5834:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5835:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211796);
            rule__CodeBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211799);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5842:1: rule__CodeBlock__Group__2__Impl : ( ( rule__CodeBlock__Alternatives_2 ) ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5846:1: ( ( ( rule__CodeBlock__Alternatives_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5847:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5847:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5848:1: ( rule__CodeBlock__Alternatives_2 )
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5849:1: ( rule__CodeBlock__Alternatives_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5849:2: rule__CodeBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11826);
            rule__CodeBlock__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5859:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5863:1: ( rule__CodeBlock__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5864:2: rule__CodeBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311856);
            rule__CodeBlock__Group__3__Impl();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5870:1: rule__CodeBlock__Group__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5874:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5875:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5875:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5876:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__CodeBlock__Group__3__Impl11884); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start rule__CodeBlock__Group_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5897:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5901:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5902:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__011923);
            rule__CodeBlock__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__011926);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5909:1: rule__CodeBlock__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5913:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5914:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5914:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5915:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5916:1: ( ruleANY_WS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_WS && LA57_0<=RULE_SINGLE_NL)||LA57_0==RULE_MULTI_NL) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5916:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl11954);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5926:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5930:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5931:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__111985);
            rule__CodeBlock__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__111988);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5938:1: rule__CodeBlock__Group_1__1__Impl : ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5942:1: ( ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5943:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5943:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5944:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5945:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5945:2: rule__CodeBlock__LanguageAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl12015);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5955:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5959:1: ( rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5960:2: rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212045);
            rule__CodeBlock__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212048);
            rule__CodeBlock__Group_1__3();
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5967:1: rule__CodeBlock__Group_1__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5971:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5972:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5972:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5973:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5974:1: ( ruleANY_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_SINGLE_NL)||LA58_0==RULE_MULTI_NL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5974:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12076);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2()); 

            }


            }

        }
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


    // $ANTLR start rule__CodeBlock__Group_1__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5984:1: rule__CodeBlock__Group_1__3 : rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 ;
    public final void rule__CodeBlock__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5988:1: ( rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5989:2: rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312107);
            rule__CodeBlock__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312110);
            rule__CodeBlock__Group_1__4();
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
    // $ANTLR end rule__CodeBlock__Group_1__3


    // $ANTLR start rule__CodeBlock__Group_1__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5996:1: rule__CodeBlock__Group_1__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6000:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6001:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6001:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6002:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__CodeBlock__Group_1__3__Impl12138); 
             after(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__3__Impl


    // $ANTLR start rule__CodeBlock__Group_1__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6015:1: rule__CodeBlock__Group_1__4 : rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 ;
    public final void rule__CodeBlock__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6019:1: ( rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6020:2: rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412169);
            rule__CodeBlock__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412172);
            rule__CodeBlock__Group_1__5();
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
    // $ANTLR end rule__CodeBlock__Group_1__4


    // $ANTLR start rule__CodeBlock__Group_1__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6027:1: rule__CodeBlock__Group_1__4__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6031:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6032:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6032:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6033:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6034:1: ( ruleANY_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_WS && LA59_0<=RULE_SINGLE_NL)||LA59_0==RULE_MULTI_NL) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6034:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12200);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__4__Impl


    // $ANTLR start rule__CodeBlock__Group_1__5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6044:1: rule__CodeBlock__Group_1__5 : rule__CodeBlock__Group_1__5__Impl ;
    public final void rule__CodeBlock__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6048:1: ( rule__CodeBlock__Group_1__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6049:2: rule__CodeBlock__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512231);
            rule__CodeBlock__Group_1__5__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_1__5


    // $ANTLR start rule__CodeBlock__Group_1__5__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6055:1: rule__CodeBlock__Group_1__5__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6059:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6060:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6060:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6061:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5()); 
            match(input,21,FOLLOW_21_in_rule__CodeBlock__Group_1__5__Impl12259); 
             after(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_1__5__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6086:1: rule__CodeBlock__Group_2_0__0 : rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 ;
    public final void rule__CodeBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6090:1: ( rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6091:2: rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012302);
            rule__CodeBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012305);
            rule__CodeBlock__Group_2_0__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_0__0


    // $ANTLR start rule__CodeBlock__Group_2_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6098:1: rule__CodeBlock__Group_2_0__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6102:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6103:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6103:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6104:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6105:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6105:2: rule__CodeBlock__ContentsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12332);
            rule__CodeBlock__ContentsAssignment_2_0_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6115:1: rule__CodeBlock__Group_2_0__1 : rule__CodeBlock__Group_2_0__1__Impl ;
    public final void rule__CodeBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6119:1: ( rule__CodeBlock__Group_2_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6120:2: rule__CodeBlock__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112362);
            rule__CodeBlock__Group_2_0__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_0__1


    // $ANTLR start rule__CodeBlock__Group_2_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6126:1: rule__CodeBlock__Group_2_0__1__Impl : ( ( rule__CodeBlock__Group_2_0_1__0 )* ) ;
    public final void rule__CodeBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6130:1: ( ( ( rule__CodeBlock__Group_2_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6131:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6131:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6132:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_2_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6133:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=26 && LA60_0<=28)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6133:2: rule__CodeBlock__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12389);
            	    rule__CodeBlock__Group_2_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0__1__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6147:1: rule__CodeBlock__Group_2_0_1__0 : rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 ;
    public final void rule__CodeBlock__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6151:1: ( rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6152:2: rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012424);
            rule__CodeBlock__Group_2_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012427);
            rule__CodeBlock__Group_2_0_1__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_0_1__0


    // $ANTLR start rule__CodeBlock__Group_2_0_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6159:1: rule__CodeBlock__Group_2_0_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6163:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6164:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6164:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6165:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6166:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6166:2: rule__CodeBlock__ContentsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12454);
            rule__CodeBlock__ContentsAssignment_2_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_0_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6176:1: rule__CodeBlock__Group_2_0_1__1 : rule__CodeBlock__Group_2_0_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6180:1: ( rule__CodeBlock__Group_2_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6181:2: rule__CodeBlock__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112484);
            rule__CodeBlock__Group_2_0_1__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_0_1__1


    // $ANTLR start rule__CodeBlock__Group_2_0_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6187:1: rule__CodeBlock__Group_2_0_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6191:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6192:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6192:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6193:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6194:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_MULTI_NL)||(LA61_0>=15 && LA61_0<=16)||LA61_0==18) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6194:2: rule__CodeBlock__ContentsAssignment_2_0_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12511);
                    rule__CodeBlock__ContentsAssignment_2_0_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_0_1__1__Impl


    // $ANTLR start rule__CodeBlock__Group_2_1__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6208:1: rule__CodeBlock__Group_2_1__0 : rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 ;
    public final void rule__CodeBlock__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6212:1: ( rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6213:2: rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012546);
            rule__CodeBlock__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012549);
            rule__CodeBlock__Group_2_1__1();
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
    // $ANTLR end rule__CodeBlock__Group_2_1__0


    // $ANTLR start rule__CodeBlock__Group_2_1__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6220:1: rule__CodeBlock__Group_2_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6224:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6225:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6225:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6226:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6227:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6227:2: rule__CodeBlock__ContentsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12576);
            rule__CodeBlock__ContentsAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_1__0__Impl


    // $ANTLR start rule__CodeBlock__Group_2_1__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6237:1: rule__CodeBlock__Group_2_1__1 : rule__CodeBlock__Group_2_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6241:1: ( rule__CodeBlock__Group_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6242:2: rule__CodeBlock__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112606);
            rule__CodeBlock__Group_2_1__1__Impl();
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
    // $ANTLR end rule__CodeBlock__Group_2_1__1


    // $ANTLR start rule__CodeBlock__Group_2_1__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6248:1: rule__CodeBlock__Group_2_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6252:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6253:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6253:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6254:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6255:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_MULTI_NL)||(LA62_0>=15 && LA62_0<=16)||LA62_0==18) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6255:2: rule__CodeBlock__ContentsAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12633);
                    rule__CodeBlock__ContentsAssignment_2_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__Group_2_1__1__Impl


    // $ANTLR start rule__Document__ChaptersAssignment_3_0_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6270:1: rule__Document__ChaptersAssignment_3_0_0_0 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6274:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6275:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6275:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6276:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_012673);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ChaptersAssignment_3_0_0_0


    // $ANTLR start rule__Document__ChaptersAssignment_3_0_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6285:1: rule__Document__ChaptersAssignment_3_0_0_1_1 : ( ruleChapter ) ;
    public final void rule__Document__ChaptersAssignment_3_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6289:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6290:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6290:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6291:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_112704);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getChaptersChapterParserRuleCall_3_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__ChaptersAssignment_3_0_0_1_1


    // $ANTLR start rule__Document__SectionsAssignment_3_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6300:1: rule__Document__SectionsAssignment_3_0_1_0 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6304:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6305:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6305:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6306:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012735);
            ruleSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_1_0


    // $ANTLR start rule__Document__SectionsAssignment_3_0_1_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6315:1: rule__Document__SectionsAssignment_3_0_1_1_1 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6319:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6320:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6320:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6321:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112766);
            ruleSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_1_1_1


    // $ANTLR start rule__Document__SubsectionsAssignment_3_0_2_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6330:1: rule__Document__SubsectionsAssignment_3_0_2_0 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6334:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6335:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6335:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6336:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_012797);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SubsectionsAssignment_3_0_2_0


    // $ANTLR start rule__Document__SubsectionsAssignment_3_0_2_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6345:1: rule__Document__SubsectionsAssignment_3_0_2_1_1 : ( ruleSubSection ) ;
    public final void rule__Document__SubsectionsAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6349:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6350:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6350:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6351:1: ruleSubSection
            {
             before(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_112828);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSubsectionsSubSectionParserRuleCall_3_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SubsectionsAssignment_3_0_2_1_1


    // $ANTLR start rule__Chapter__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6360:1: rule__Chapter__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6364:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6366:1: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112859); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__NameAssignment_0_0_1


    // $ANTLR start rule__Chapter__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6375:1: rule__Chapter__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6379:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6380:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6380:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6381:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_112890);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__TitleAssignment_1


    // $ANTLR start rule__Chapter__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6390:1: rule__Chapter__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6394:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6396:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_112921);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_3_1


    // $ANTLR start rule__Chapter__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6405:1: rule__Chapter__ContentsAssignment_4_1 : ( ruleSection ) ;
    public final void rule__Chapter__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6409:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6411:1: ruleSection
            {
             before(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_4_112952);
            ruleSection();
            _fsp--;

             after(grammarAccess.getChapterAccess().getContentsSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__ContentsAssignment_4_1


    // $ANTLR start rule__Section__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6420:1: rule__Section__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6424:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6426:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_112983); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__NameAssignment_0_0_1


    // $ANTLR start rule__Section__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6435:1: rule__Section__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6439:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6440:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6440:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6441:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_113014);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__TitleAssignment_1


    // $ANTLR start rule__Section__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6450:1: rule__Section__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6454:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6455:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6455:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6456:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113045);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_3_1


    // $ANTLR start rule__Section__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6465:1: rule__Section__ContentsAssignment_4_1 : ( ruleSubSection ) ;
    public final void rule__Section__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6469:1: ( ( ruleSubSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:1: ( ruleSubSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:1: ( ruleSubSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6471:1: ruleSubSection
            {
             before(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_4_113076);
            ruleSubSection();
            _fsp--;

             after(grammarAccess.getSectionAccess().getContentsSubSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__ContentsAssignment_4_1


    // $ANTLR start rule__SubSection__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6480:1: rule__SubSection__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__SubSection__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6484:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6486:1: RULE_ID
            {
             before(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_0_0_113107); 
             after(grammarAccess.getSubSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__NameAssignment_0_0_1


    // $ANTLR start rule__SubSection__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6495:1: rule__SubSection__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6499:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6500:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6500:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6501:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_113138);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__TitleAssignment_1


    // $ANTLR start rule__SubSection__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6510:1: rule__SubSection__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__SubSection__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6514:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6515:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6515:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6516:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_3_113169);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_3_1


    // $ANTLR start rule__SubSection__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6525:1: rule__SubSection__ContentsAssignment_4_1 : ( ruleSection3 ) ;
    public final void rule__SubSection__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6529:1: ( ( ruleSection3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6530:1: ( ruleSection3 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6530:1: ( ruleSection3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6531:1: ruleSection3
            {
             before(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_4_113200);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSubSectionAccess().getContentsSection3ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubSection__ContentsAssignment_4_1


    // $ANTLR start rule__Section3__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6540:1: rule__Section3__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section3__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6544:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6545:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6545:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6546:1: RULE_ID
            {
             before(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113231); 
             after(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__NameAssignment_0_0_1


    // $ANTLR start rule__Section3__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6555:1: rule__Section3__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6559:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6560:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6560:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6561:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113262);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__TitleAssignment_1


    // $ANTLR start rule__Section3__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6570:1: rule__Section3__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6574:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6575:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6575:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6576:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113293);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_3_1


    // $ANTLR start rule__Section3__ContentsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6585:1: rule__Section3__ContentsAssignment_4_1 : ( ruleSection4 ) ;
    public final void rule__Section3__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6589:1: ( ( ruleSection4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6590:1: ( ruleSection4 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6590:1: ( ruleSection4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6591:1: ruleSection4
            {
             before(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_4_113324);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection3Access().getContentsSection4ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__ContentsAssignment_4_1


    // $ANTLR start rule__Section4__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6600:1: rule__Section4__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section4__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6604:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6605:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6605:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6606:1: RULE_ID
            {
             before(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113355); 
             after(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__NameAssignment_0_0_1


    // $ANTLR start rule__Section4__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:1: rule__Section4__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6619:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6620:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6620:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6621:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113386);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__TitleAssignment_1


    // $ANTLR start rule__Section4__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6630:1: rule__Section4__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6634:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6635:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6635:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6636:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113417);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section4__ContentsAssignment_3_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6645:1: rule__TextOrMarkup__ContentsAssignment_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6649:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6650:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6650:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6651:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013448);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6660:1: rule__TextOrMarkup__ContentsAssignment_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6664:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6665:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6665:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6666:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013479);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6675:1: rule__TextOrMarkup__ContentsAssignment_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6679:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6681:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113510);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_0_1_1


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6690:1: rule__TextOrMarkup__ContentsAssignment_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6694:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6695:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6695:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6696:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013541);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_0


    // $ANTLR start rule__TextOrMarkup__ContentsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6705:1: rule__TextOrMarkup__ContentsAssignment_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6709:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6710:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6710:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6711:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113572);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextOrMarkup__ContentsAssignment_1_1


    // $ANTLR start rule__TextPart__TextAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6720:1: rule__TextPart__TextAssignment : ( ruleText ) ;
    public final void rule__TextPart__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6724:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6726:1: ruleText
            {
             before(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__TextPart__TextAssignment13603);
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


    // $ANTLR start rule__Emphasize__ContentsAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6735:1: rule__Emphasize__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Emphasize__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6739:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6740:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6740:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6741:1: ruleTextOrMarkup
            {
             before(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213634);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emphasize__ContentsAssignment_2


    // $ANTLR start rule__Anchor__NameAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6750:1: rule__Anchor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Anchor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6754:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6755:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6755:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6756:1: RULE_ID
            {
             before(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113665); 
             after(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Anchor__NameAssignment_1


    // $ANTLR start rule__Ref__RefAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6765:1: rule__Ref__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6769:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6771:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6772:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6773:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113700); 
             after(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Ref__RefAssignment_1


    // $ANTLR start rule__Ref__ContentsAssignment_4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6784:1: rule__Ref__ContentsAssignment_4 : ( ruleTextOrMarkup ) ;
    public final void rule__Ref__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6788:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6789:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6789:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6790:1: ruleTextOrMarkup
            {
             before(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413735);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__OrderedList__ItemsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6799:1: rule__OrderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__OrderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6803:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6804:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6804:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6805:1: ruleItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113766);
            ruleItem();
            _fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrderedList__ItemsAssignment_1_1


    // $ANTLR start rule__UnorderedList__ItemsAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6814:1: rule__UnorderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6818:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6819:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6819:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6820:1: ruleItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113797);
            ruleItem();
            _fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnorderedList__ItemsAssignment_1_1


    // $ANTLR start rule__Item__ContentsAssignment_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6829:1: rule__Item__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6833:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6834:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6834:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6835:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213828);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_2


    // $ANTLR start rule__Item__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6844:1: rule__Item__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6848:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6849:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6849:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6850:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113859);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Item__ContentsAssignment_3_1


    // $ANTLR start rule__CodeRef__ElementAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6859:1: rule__CodeRef__ElementAssignment_1 : ( ( ruleText ) ) ;
    public final void rule__CodeRef__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6863:1: ( ( ( ruleText ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ( ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6865:1: ( ruleText )
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6866:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6867:1: ruleText
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_113894);
            ruleText();
            _fsp--;

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeRef__ElementAssignment_1


    // $ANTLR start rule__Link__UrlAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6878:1: rule__Link__UrlAssignment_1 : ( ruleText ) ;
    public final void rule__Link__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6882:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6883:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6883:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6884:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__UrlAssignment_113929);
            ruleText();
            _fsp--;

             after(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__UrlAssignment_1


    // $ANTLR start rule__Link__TextAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6893:1: rule__Link__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Link__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6897:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6898:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6898:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6899:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__TextAssignment_513960);
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


    // $ANTLR start rule__ImageRef__NameAssignment_0_0_2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6908:1: rule__ImageRef__NameAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__ImageRef__NameAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6912:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6913:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6913:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6914:1: RULE_ID
            {
             before(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_213991); 
             after(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__NameAssignment_0_0_2


    // $ANTLR start rule__ImageRef__PathAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6923:1: rule__ImageRef__PathAssignment_1 : ( ruleText ) ;
    public final void rule__ImageRef__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6927:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6928:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6928:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6929:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114022);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__PathAssignment_1


    // $ANTLR start rule__ImageRef__ClazzAssignment_5
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6938:1: rule__ImageRef__ClazzAssignment_5 : ( ruleText ) ;
    public final void rule__ImageRef__ClazzAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6942:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514053);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__ClazzAssignment_5


    // $ANTLR start rule__ImageRef__StyleAssignment_9
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6953:1: rule__ImageRef__StyleAssignment_9 : ( ruleText ) ;
    public final void rule__ImageRef__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6957:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914084);
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


    // $ANTLR start rule__ImageRef__CaptionAssignment_13
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6968:1: rule__ImageRef__CaptionAssignment_13 : ( ruleText ) ;
    public final void rule__ImageRef__CaptionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6972:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314115);
            ruleText();
            _fsp--;

             after(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ImageRef__CaptionAssignment_13


    // $ANTLR start rule__CodeBlock__LanguageAssignment_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6983:1: rule__CodeBlock__LanguageAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CodeBlock__LanguageAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6987:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: RULE_ID
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114146); 
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


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6998:1: rule__CodeBlock__ContentsAssignment_2_0_0 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7002:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014177);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7013:1: rule__CodeBlock__ContentsAssignment_2_0_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7017:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014208);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7028:1: rule__CodeBlock__ContentsAssignment_2_0_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7032:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114239);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_0_1_1


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7043:1: rule__CodeBlock__ContentsAssignment_2_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7047:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014270);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_1_0


    // $ANTLR start rule__CodeBlock__ContentsAssignment_2_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7058:1: rule__CodeBlock__ContentsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7062:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114301);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CodeBlock__ContentsAssignment_2_1_1


    // $ANTLR start rule__Code__ContentsAssignment
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7073:1: rule__Code__ContentsAssignment : ( ruleCodeText ) ;
    public final void rule__Code__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7077:1: ( ( ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ruleCodeText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ruleCodeText
            {
             before(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14332);
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


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA42_eotS =
        "\6\uffff";
    static final String DFA42_eofS =
        "\6\uffff";
    static final String DFA42_minS =
        "\4\5\2\uffff";
    static final String DFA42_maxS =
        "\4\37\2\uffff";
    static final String DFA42_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\6\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 4261:1: ( rule__OrderedList__Group_1__0 )*";
        }
    }
    static final String DFA45_eotS =
        "\6\uffff";
    static final String DFA45_eofS =
        "\6\uffff";
    static final String DFA45_minS =
        "\4\5\2\uffff";
    static final String DFA45_maxS =
        "\4\37\2\uffff";
    static final String DFA45_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA45_specialS =
        "\6\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\12\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 4456:1: ( rule__UnorderedList__Group_1__0 )*";
        }
    }
    static final String DFA56_eotS =
        "\31\uffff";
    static final String DFA56_eofS =
        "\15\uffff\4\5\1\uffff\7\5";
    static final String DFA56_minS =
        "\5\4\1\uffff\13\4\1\uffff\7\4";
    static final String DFA56_maxS =
        "\5\34\1\uffff\7\34\4\43\1\uffff\7\43";
    static final String DFA56_acceptS =
        "\5\uffff\1\2\13\uffff\1\1\7\uffff";
    static final String DFA56_specialS =
        "\31\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\4\1\3\1\2\1\5\1\1\6\uffff\2\5\1\uffff\1\5\7\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\5\1\14\1\13\1\5\1\12\6\uffff\2\5\1\uffff\1\5\1\15\6\uffff"+
            "\3\5",
            "",
            "\1\5\1\14\1\13\1\5\1\12\6\uffff\2\5\1\uffff\1\5\1\15\6\uffff"+
            "\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\6\1\10\1\11\1\5\1\7\6\uffff\2\5\1\uffff\2\5\6\uffff\3\5",
            "\1\5\1\14\1\13\1\5\1\12\6\uffff\2\5\1\uffff\1\5\1\15\6\uffff"+
            "\3\5",
            "\1\5\1\14\1\13\1\5\1\12\6\uffff\2\5\1\uffff\1\5\1\15\6\uffff"+
            "\3\5",
            "\1\5\1\14\1\13\1\5\1\12\6\uffff\2\5\1\uffff\1\5\1\15\6\uffff"+
            "\3\5",
            "\1\5\1\20\1\17\1\5\1\16\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\10\5\1\uffff\2\5\1\21\11\5\1"+
            "\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\3\5\1\uffff\1\5\1\uffff\1\21"+
            "\4\uffff\5\5\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\10\5\2\uffff\1\5\1\21\11\5\1"+
            "\uffff\4\5"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "5820:1: ( rule__CodeBlock__Group_1__0 )?";
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
    public static final BitSet FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText578 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText590 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0_in_ruleAnchor773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1435 = new BitSet(new long[]{0x00000000000581F2L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1447 = new BitSet(new long[]{0x00000000000581F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Chapter__Alternatives_01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section__Alternatives_01687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__0_in_rule__SubSection__Alternatives_01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SubSection__Alternatives_01740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section3__Alternatives_01793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section4__Alternatives_01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1901 = new BitSet(new long[]{0x0000000F7C020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives1913 = new BitSet(new long[]{0x0000000F7C020002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Text__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Text__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImageRef__Alternatives_02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22313 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22325 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeText__Alternatives2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CodeText__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeText__Alternatives2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02651 = new BitSet(new long[]{0x0000000000D01D22L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12712 = new BitSet(new long[]{0x0000000000D01D02L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22774 = new BitSet(new long[]{0x0000000000D01C02L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__02902 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__02905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03025 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3112 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03147 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ChaptersAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03267 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3354 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03389 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03509 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3596 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03631 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SubsectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03751 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13811 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__23871 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__23874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Chapter__Group__2__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__33933 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__33936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl3963 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__43994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4021 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Chapter__Group_0_0__0__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14124 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Chapter__Group_0_0__2__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04249 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04369 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04489 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24609 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section__Group__2__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34671 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4701 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4759 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Section__Group_0_0__0__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__14862 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__14865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__24922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section__Group_0_0__2__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__04987 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__04990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05107 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_4_1_in_rule__Section__Group_4__1__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__05227 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__05230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Alternatives_0_in_rule__SubSection__Group__0__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__15287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__TitleAssignment_1_in_rule__SubSection__Group__1__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__25347 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__25350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SubSection__Group__2__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__35409 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4_in_rule__SubSection__Group__35412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__0_in_rule__SubSection__Group__3__Impl5439 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group__4__Impl_in_rule__SubSection__Group__45470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__0_in_rule__SubSection__Group__4__Impl5497 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__0__Impl_in_rule__SubSection__Group_0_0__05538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__1_in_rule__SubSection__Group_0_0__05541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubSection__Group_0_0__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__1__Impl_in_rule__SubSection__Group_0_0__15600 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__2_in_rule__SubSection__Group_0_0__15603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__NameAssignment_0_0_1_in_rule__SubSection__Group_0_0__1__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_0_0__2__Impl_in_rule__SubSection__Group_0_0__25660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubSection__Group_0_0__2__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__0__Impl_in_rule__SubSection__Group_3__05725 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__1_in_rule__SubSection__Group_3__05728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_3__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_3__1__Impl_in_rule__SubSection__Group_3__15784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_3_1_in_rule__SubSection__Group_3__1__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__0__Impl_in_rule__SubSection__Group_4__05845 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__1_in_rule__SubSection__Group_4__05848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__SubSection__Group_4__0__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group_4__1__Impl_in_rule__SubSection__Group_4__15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentsAssignment_4_1_in_rule__SubSection__Group_4__1__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__05965 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__05968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16025 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26085 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section3__Group__2__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36147 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6177 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6235 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Section3__Group_0_0__0__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16338 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section3__Group_0_0__2__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06463 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06583 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06703 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26823 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Section4__Group__2__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__36885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl6912 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__06951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__06954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Section4__Group_0_0__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__17013 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__17016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section4__Group_0_0__2__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07138 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07258 = new BitSet(new long[]{0x0000000F7C020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7345 = new BitSet(new long[]{0x0000000F7C020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07380 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07502 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07624 = new BitSet(new long[]{0x0000000F7C0381F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Emphasize__Group__0__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17686 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27748 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__47870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Emphasize__Group__4__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__07939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__07942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Anchor__Group__0__Impl7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18001 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Anchor__Group__2__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Ref__Group__0__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18188 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28248 = new BitSet(new long[]{0x0000000F7C0381F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Ref__Group__2__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38310 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48372 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ref__Group__6__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08567 = new BitSet(new long[]{0x0000000080000160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OrderedList__Group__0__Impl8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18629 = new BitSet(new long[]{0x0000000000080160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8661 = new BitSet(new long[]{0x0000000080000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8673 = new BitSet(new long[]{0x0000000080000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28706 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8737 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OrderedList__Group__3__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08835 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl8866 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__18897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__08958 = new BitSet(new long[]{0x0000000080000160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__08961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UnorderedList__Group__0__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19020 = new BitSet(new long[]{0x0000000000080160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9052 = new BitSet(new long[]{0x0000000080000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9064 = new BitSet(new long[]{0x0000000080000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9128 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UnorderedList__Group__3__Impl9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09226 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9257 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09349 = new BitSet(new long[]{0x0000000F7C0381F0L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Item__Group__0__Impl9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19411 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29473 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39533 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9563 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Item__Group__4__Impl9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09663 = new BitSet(new long[]{0x0000000F7C0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09783 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CodeRef__Group__0__Impl9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__29905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CodeRef__Group__2__Impl9933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__09970 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__09973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Link__Group__0__Impl10001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210092 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Link__Group__2__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10185 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410216 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Link__Group__4__Impl10247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510278 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Link__Group__6__Impl10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010411 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110471 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210531 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImageRef__Group__2__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310593 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10624 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410655 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ImageRef__Group__4__Impl10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610777 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImageRef__Group__6__Impl10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710839 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl10870 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__810901 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__810904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ImageRef__Group__8__Impl10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__910963 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__910966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011023 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImageRef__Group__10__Impl11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111085 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11116 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211147 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ImageRef__Group__12__Impl11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ImageRef__Group__14__Impl11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011358 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ImageRef__Group_0_0__0__Impl11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11451 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211482 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311542 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11573 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ImageRef__Group_0_0__4__Impl11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011673 = new BitSet(new long[]{0x000000001C0581F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CodeBlock__Group__0__Impl11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111735 = new BitSet(new long[]{0x000000001C0581F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CodeBlock__Group__3__Impl11884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__011923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__011926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl11954 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__111985 = new BitSet(new long[]{0x0000000000080160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__111988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl12015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212045 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12076 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312107 = new BitSet(new long[]{0x0000000000200160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CodeBlock__Group_1__3__Impl12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12200 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CodeBlock__Group_1__5__Impl12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012302 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12389 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012424 = new BitSet(new long[]{0x00000000000581F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012546 = new BitSet(new long[]{0x00000000000581F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_012673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__ChaptersAssignment_3_0_0_1_112704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_012797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Document__SubsectionsAssignment_3_0_2_1_112828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_112890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_112921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Chapter__ContentsAssignment_4_112952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_112983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_113014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__Section__ContentsAssignment_4_113076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSection__NameAssignment_0_0_113107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__TitleAssignment_113138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__SubSection__ContentsAssignment_3_113169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__SubSection__ContentsAssignment_4_113200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__Section3__ContentsAssignment_4_113324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__TextPart__TextAssignment13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_113894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__UrlAssignment_113929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__TextAssignment_513960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_213991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14332 = new BitSet(new long[]{0x0000000000000002L});

}