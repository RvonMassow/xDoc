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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_SINGLE_NL", "RULE_ANY_OTHER", "RULE_MULTI_NL", "RULE_SL_COMMENT", "'chapter['", "'section['", "'section2['", "'section3['", "'section4['", "'\\\\['", "'\\\\]'", "'img['", "']'", "'chapter:'", "'['", "'section:'", "'section2:'", "'section3:'", "'section4:'", "'emph['", "'a['", "'ref:'", "'ol['", "'ul['", "'item['", "'codeRef['", "'link['", "'img:'", "'code['"
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


    // $ANTLR start entryRuleSection2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:145:1: entryRuleSection2 : ruleSection2 EOF ;
    public final void entryRuleSection2() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:146:1: ( ruleSection2 EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:147:1: ruleSection2 EOF
            {
             before(grammarAccess.getSection2Rule()); 
            pushFollow(FOLLOW_ruleSection2_in_entryRuleSection2241);
            ruleSection2();
            _fsp--;

             after(grammarAccess.getSection2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection2248); 

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
    // $ANTLR end entryRuleSection2


    // $ANTLR start ruleSection2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:154:1: ruleSection2 : ( ( rule__Section2__Group__0 ) ) ;
    public final void ruleSection2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:158:2: ( ( ( rule__Section2__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__Section2__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:159:1: ( ( rule__Section2__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:160:1: ( rule__Section2__Group__0 )
            {
             before(grammarAccess.getSection2Access().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:1: ( rule__Section2__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:161:2: rule__Section2__Group__0
            {
            pushFollow(FOLLOW_rule__Section2__Group__0_in_ruleSection2274);
            rule__Section2__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSection2


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


    // $ANTLR start entryRuleAbstractSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:229:1: entryRuleAbstractSection : ruleAbstractSection EOF ;
    public final void entryRuleAbstractSection() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:230:1: ( ruleAbstractSection EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:231:1: ruleAbstractSection EOF
            {
             before(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection421);
            ruleAbstractSection();
            _fsp--;

             after(grammarAccess.getAbstractSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection428); 

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
    // $ANTLR end entryRuleAbstractSection


    // $ANTLR start ruleAbstractSection
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:238:1: ruleAbstractSection : ( ( rule__AbstractSection__Alternatives ) ) ;
    public final void ruleAbstractSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:242:2: ( ( ( rule__AbstractSection__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:243:1: ( ( rule__AbstractSection__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:243:1: ( ( rule__AbstractSection__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:244:1: ( rule__AbstractSection__Alternatives )
            {
             before(grammarAccess.getAbstractSectionAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:1: ( rule__AbstractSection__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:245:2: rule__AbstractSection__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection454);
            rule__AbstractSection__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAbstractSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractSection


    // $ANTLR start entryRuleTextOrMarkup
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:259:1: entryRuleTextOrMarkup : ruleTextOrMarkup EOF ;
    public final void entryRuleTextOrMarkup() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:260:1: ( ruleTextOrMarkup EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:261:1: ruleTextOrMarkup EOF
            {
             before(grammarAccess.getTextOrMarkupRule()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup483);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getTextOrMarkupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextOrMarkup490); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:268:1: ruleTextOrMarkup : ( ( rule__TextOrMarkup__Alternatives ) ) ;
    public final void ruleTextOrMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:272:2: ( ( ( rule__TextOrMarkup__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextOrMarkup__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:273:1: ( ( rule__TextOrMarkup__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:274:1: ( rule__TextOrMarkup__Alternatives )
            {
             before(grammarAccess.getTextOrMarkupAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:1: ( rule__TextOrMarkup__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:275:2: rule__TextOrMarkup__Alternatives
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup516);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:287:1: entryRuleTextPart : ruleTextPart EOF ;
    public final void entryRuleTextPart() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:288:1: ( ruleTextPart EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:289:1: ruleTextPart EOF
            {
             before(grammarAccess.getTextPartRule()); 
            pushFollow(FOLLOW_ruleTextPart_in_entryRuleTextPart543);
            ruleTextPart();
            _fsp--;

             after(grammarAccess.getTextPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextPart550); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:296:1: ruleTextPart : ( ( rule__TextPart__TextAssignment ) ) ;
    public final void ruleTextPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:300:2: ( ( ( rule__TextPart__TextAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( rule__TextPart__TextAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:301:1: ( ( rule__TextPart__TextAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:302:1: ( rule__TextPart__TextAssignment )
            {
             before(grammarAccess.getTextPartAccess().getTextAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:1: ( rule__TextPart__TextAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:303:2: rule__TextPart__TextAssignment
            {
            pushFollow(FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart576);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:315:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:316:1: ( ruleText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:317:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText603);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText610); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:324:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:328:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:329:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:329:1: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:330:1: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:330:1: ( ( rule__Text__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:331:1: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:332:1: ( rule__Text__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:332:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText638);
            rule__Text__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:335:1: ( ( rule__Text__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:336:1: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:337:1: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:337:2: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText650);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:350:1: entryRuleMarkUp : ruleMarkUp EOF ;
    public final void entryRuleMarkUp() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:351:1: ( ruleMarkUp EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:352:1: ruleMarkUp EOF
            {
             before(grammarAccess.getMarkUpRule()); 
            pushFollow(FOLLOW_ruleMarkUp_in_entryRuleMarkUp680);
            ruleMarkUp();
            _fsp--;

             after(grammarAccess.getMarkUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkUp687); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:359:1: ruleMarkUp : ( ( rule__MarkUp__Alternatives ) ) ;
    public final void ruleMarkUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:363:2: ( ( ( rule__MarkUp__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__MarkUp__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:364:1: ( ( rule__MarkUp__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:365:1: ( rule__MarkUp__Alternatives )
            {
             before(grammarAccess.getMarkUpAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:1: ( rule__MarkUp__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:366:2: rule__MarkUp__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp713);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:378:1: entryRuleEmphasize : ruleEmphasize EOF ;
    public final void entryRuleEmphasize() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:379:1: ( ruleEmphasize EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:380:1: ruleEmphasize EOF
            {
             before(grammarAccess.getEmphasizeRule()); 
            pushFollow(FOLLOW_ruleEmphasize_in_entryRuleEmphasize740);
            ruleEmphasize();
            _fsp--;

             after(grammarAccess.getEmphasizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmphasize747); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:387:1: ruleEmphasize : ( ( rule__Emphasize__Group__0 ) ) ;
    public final void ruleEmphasize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:391:2: ( ( ( rule__Emphasize__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Emphasize__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:392:1: ( ( rule__Emphasize__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:393:1: ( rule__Emphasize__Group__0 )
            {
             before(grammarAccess.getEmphasizeAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:1: ( rule__Emphasize__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:394:2: rule__Emphasize__Group__0
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize773);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:406:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:407:1: ( ruleAnchor EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:408:1: ruleAnchor EOF
            {
             before(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_ruleAnchor_in_entryRuleAnchor800);
            ruleAnchor();
            _fsp--;

             after(grammarAccess.getAnchorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnchor807); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:415:1: ruleAnchor : ( ( rule__Anchor__Group__0 ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:419:2: ( ( ( rule__Anchor__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Anchor__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:420:1: ( ( rule__Anchor__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:421:1: ( rule__Anchor__Group__0 )
            {
             before(grammarAccess.getAnchorAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:1: ( rule__Anchor__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:422:2: rule__Anchor__Group__0
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0_in_ruleAnchor833);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:434:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:435:1: ( ruleRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:436:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef860);
            ruleRef();
            _fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef867); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:443:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:447:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:448:1: ( ( rule__Ref__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:449:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:1: ( rule__Ref__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:450:2: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_rule__Ref__Group__0_in_ruleRef893);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:462:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:463:1: ( ruleOrderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:464:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList920);
            ruleOrderedList();
            _fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList927); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:471:1: ruleOrderedList : ( ( rule__OrderedList__Group__0 ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:475:2: ( ( ( rule__OrderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__OrderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:476:1: ( ( rule__OrderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:477:1: ( rule__OrderedList__Group__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:1: ( rule__OrderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:478:2: rule__OrderedList__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList953);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:490:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:491:1: ( ruleUnorderedList EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:492:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList980);
            ruleUnorderedList();
            _fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList987); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:499:1: ruleUnorderedList : ( ( rule__UnorderedList__Group__0 ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:503:2: ( ( ( rule__UnorderedList__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__UnorderedList__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:504:1: ( ( rule__UnorderedList__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:505:1: ( rule__UnorderedList__Group__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:1: ( rule__UnorderedList__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:506:2: rule__UnorderedList__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList1013);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:518:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:519:1: ( ruleItem EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:520:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem1040);
            ruleItem();
            _fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem1047); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:527:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:531:2: ( ( ( rule__Item__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__Item__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:532:1: ( ( rule__Item__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:533:1: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:1: ( rule__Item__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:534:2: rule__Item__Group__0
            {
            pushFollow(FOLLOW_rule__Item__Group__0_in_ruleItem1073);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:546:1: entryRuleCodeRef : ruleCodeRef EOF ;
    public final void entryRuleCodeRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:547:1: ( ruleCodeRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:548:1: ruleCodeRef EOF
            {
             before(grammarAccess.getCodeRefRule()); 
            pushFollow(FOLLOW_ruleCodeRef_in_entryRuleCodeRef1100);
            ruleCodeRef();
            _fsp--;

             after(grammarAccess.getCodeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeRef1107); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:555:1: ruleCodeRef : ( ( rule__CodeRef__Group__0 ) ) ;
    public final void ruleCodeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:559:2: ( ( ( rule__CodeRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__CodeRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:560:1: ( ( rule__CodeRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:561:1: ( rule__CodeRef__Group__0 )
            {
             before(grammarAccess.getCodeRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:1: ( rule__CodeRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:562:2: rule__CodeRef__Group__0
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1133);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:574:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:575:1: ( ruleLink EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:576:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1160);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1167); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:583:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:587:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:588:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:589:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:1: ( rule__Link__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:590:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink1193);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:602:1: entryRuleImageRef : ruleImageRef EOF ;
    public final void entryRuleImageRef() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:603:1: ( ruleImageRef EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:604:1: ruleImageRef EOF
            {
             before(grammarAccess.getImageRefRule()); 
            pushFollow(FOLLOW_ruleImageRef_in_entryRuleImageRef1220);
            ruleImageRef();
            _fsp--;

             after(grammarAccess.getImageRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageRef1227); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:611:1: ruleImageRef : ( ( rule__ImageRef__Group__0 ) ) ;
    public final void ruleImageRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:615:2: ( ( ( rule__ImageRef__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__ImageRef__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:616:1: ( ( rule__ImageRef__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:617:1: ( rule__ImageRef__Group__0 )
            {
             before(grammarAccess.getImageRefAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:1: ( rule__ImageRef__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:618:2: rule__ImageRef__Group__0
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1253);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:630:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:631:1: ( ruleCodeBlock EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:632:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1280);
            ruleCodeBlock();
            _fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock1287); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:639:1: ruleCodeBlock : ( ( rule__CodeBlock__Group__0 ) ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:643:2: ( ( ( rule__CodeBlock__Group__0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__CodeBlock__Group__0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:644:1: ( ( rule__CodeBlock__Group__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:645:1: ( rule__CodeBlock__Group__0 )
            {
             before(grammarAccess.getCodeBlockAccess().getGroup()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:1: ( rule__CodeBlock__Group__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:646:2: rule__CodeBlock__Group__0
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1313);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:658:1: entryRuleCode : ruleCode EOF ;
    public final void entryRuleCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:659:1: ( ruleCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:660:1: ruleCode EOF
            {
             before(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode1340);
            ruleCode();
            _fsp--;

             after(grammarAccess.getCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode1347); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:667:1: ruleCode : ( ( rule__Code__ContentsAssignment ) ) ;
    public final void ruleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:671:2: ( ( ( rule__Code__ContentsAssignment ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__Code__ContentsAssignment ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:672:1: ( ( rule__Code__ContentsAssignment ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:673:1: ( rule__Code__ContentsAssignment )
            {
             before(grammarAccess.getCodeAccess().getContentsAssignment()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:1: ( rule__Code__ContentsAssignment )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:674:2: rule__Code__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1373);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:686:1: entryRuleMarkupInCode : ruleMarkupInCode EOF ;
    public final void entryRuleMarkupInCode() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:687:1: ( ruleMarkupInCode EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:688:1: ruleMarkupInCode EOF
            {
             before(grammarAccess.getMarkupInCodeRule()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1400);
            ruleMarkupInCode();
            _fsp--;

             after(grammarAccess.getMarkupInCodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkupInCode1407); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:695:1: ruleMarkupInCode : ( ( rule__MarkupInCode__Alternatives ) ) ;
    public final void ruleMarkupInCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:699:2: ( ( ( rule__MarkupInCode__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( rule__MarkupInCode__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:700:1: ( ( rule__MarkupInCode__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:701:1: ( rule__MarkupInCode__Alternatives )
            {
             before(grammarAccess.getMarkupInCodeAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:702:1: ( rule__MarkupInCode__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:702:2: rule__MarkupInCode__Alternatives
            {
            pushFollow(FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1433);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:714:1: entryRuleCodeText : ruleCodeText EOF ;
    public final void entryRuleCodeText() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:715:1: ( ruleCodeText EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:716:1: ruleCodeText EOF
            {
             before(grammarAccess.getCodeTextRule()); 
            pushFollow(FOLLOW_ruleCodeText_in_entryRuleCodeText1460);
            ruleCodeText();
            _fsp--;

             after(grammarAccess.getCodeTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeText1467); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:723:1: ruleCodeText : ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) ;
    public final void ruleCodeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:727:2: ( ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:728:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:728:1: ( ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:729:1: ( ( rule__CodeText__Alternatives ) ) ( ( rule__CodeText__Alternatives )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:729:1: ( ( rule__CodeText__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:730:1: ( rule__CodeText__Alternatives )
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:731:1: ( rule__CodeText__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:731:2: rule__CodeText__Alternatives
            {
            pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1495);
            rule__CodeText__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCodeTextAccess().getAlternatives()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:734:1: ( ( rule__CodeText__Alternatives )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:735:1: ( rule__CodeText__Alternatives )*
            {
             before(grammarAccess.getCodeTextAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:736:1: ( rule__CodeText__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_MULTI_NL)||(LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:736:2: rule__CodeText__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1507);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:749:1: entryRuleANY_WS : ruleANY_WS EOF ;
    public final void entryRuleANY_WS() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:750:1: ( ruleANY_WS EOF )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:751:1: ruleANY_WS EOF
            {
             before(grammarAccess.getANY_WSRule()); 
            pushFollow(FOLLOW_ruleANY_WS_in_entryRuleANY_WS1537);
            ruleANY_WS();
            _fsp--;

             after(grammarAccess.getANY_WSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANY_WS1544); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:758:1: ruleANY_WS : ( ( rule__ANY_WS__Alternatives ) ) ;
    public final void ruleANY_WS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:762:2: ( ( ( rule__ANY_WS__Alternatives ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:763:1: ( ( rule__ANY_WS__Alternatives ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:763:1: ( ( rule__ANY_WS__Alternatives ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:764:1: ( rule__ANY_WS__Alternatives )
            {
             before(grammarAccess.getANY_WSAccess().getAlternatives()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:765:1: ( rule__ANY_WS__Alternatives )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:765:2: rule__ANY_WS__Alternatives
            {
            pushFollow(FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1570);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:777:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );
    public final void rule__Document__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:781:1: ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 10:
            case 19:
                {
                alt3=1;
                }
                break;
            case 11:
            case 21:
                {
                alt3=2;
                }
                break;
            case 12:
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("777:1: rule__Document__Alternatives_3_0 : ( ( ( rule__Document__Group_3_0_0__0 ) ) | ( ( rule__Document__Group_3_0_1__0 ) ) | ( ( rule__Document__Group_3_0_2__0 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:782:1: ( ( rule__Document__Group_3_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:783:1: ( rule__Document__Group_3_0_0__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:1: ( rule__Document__Group_3_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:784:2: rule__Document__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01606);
                    rule__Document__Group_3_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:788:6: ( ( rule__Document__Group_3_0_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:789:1: ( rule__Document__Group_3_0_1__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:1: ( rule__Document__Group_3_0_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:790:2: rule__Document__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01624);
                    rule__Document__Group_3_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDocumentAccess().getGroup_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:794:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:794:6: ( ( rule__Document__Group_3_0_2__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:795:1: ( rule__Document__Group_3_0_2__0 )
                    {
                     before(grammarAccess.getDocumentAccess().getGroup_3_0_2()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:796:1: ( rule__Document__Group_3_0_2__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:796:2: rule__Document__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01642);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:805:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );
    public final void rule__Chapter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:809:1: ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==10) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("805:1: rule__Chapter__Alternatives_0 : ( ( ( rule__Chapter__Group_0_0__0 ) ) | ( 'chapter[' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:810:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:810:1: ( ( rule__Chapter__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:811:1: ( rule__Chapter__Group_0_0__0 )
                    {
                     before(grammarAccess.getChapterAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:1: ( rule__Chapter__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:812:2: rule__Chapter__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01675);
                    rule__Chapter__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:816:6: ( 'chapter[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:816:6: ( 'chapter[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:817:1: 'chapter['
                    {
                     before(grammarAccess.getChapterAccess().getChapterKeyword_0_1()); 
                    match(input,10,FOLLOW_10_in_rule__Chapter__Alternatives_01694); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:829:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );
    public final void rule__Section__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:833:1: ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("829:1: rule__Section__Alternatives_0 : ( ( ( rule__Section__Group_0_0__0 ) ) | ( 'section[' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:834:1: ( ( rule__Section__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:834:1: ( ( rule__Section__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:835:1: ( rule__Section__Group_0_0__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:1: ( rule__Section__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:836:2: rule__Section__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01728);
                    rule__Section__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:840:6: ( 'section[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:840:6: ( 'section[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:841:1: 'section['
                    {
                     before(grammarAccess.getSectionAccess().getSectionKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Section__Alternatives_01747); 
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


    // $ANTLR start rule__Section2__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:853:1: rule__Section2__Alternatives_0 : ( ( ( rule__Section2__Group_0_0__0 ) ) | ( 'section2[' ) );
    public final void rule__Section2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:857:1: ( ( ( rule__Section2__Group_0_0__0 ) ) | ( 'section2[' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("853:1: rule__Section2__Alternatives_0 : ( ( ( rule__Section2__Group_0_0__0 ) ) | ( 'section2[' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:858:1: ( ( rule__Section2__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:858:1: ( ( rule__Section2__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:859:1: ( rule__Section2__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection2Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:1: ( rule__Section2__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:860:2: rule__Section2__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section2__Group_0_0__0_in_rule__Section2__Alternatives_01781);
                    rule__Section2__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection2Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:864:6: ( 'section2[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:864:6: ( 'section2[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:865:1: 'section2['
                    {
                     before(grammarAccess.getSection2Access().getSection2Keyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Section2__Alternatives_01800); 
                     after(grammarAccess.getSection2Access().getSection2Keyword_0_1()); 

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
    // $ANTLR end rule__Section2__Alternatives_0


    // $ANTLR start rule__Section3__Alternatives_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:877:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );
    public final void rule__Section3__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:881:1: ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("877:1: rule__Section3__Alternatives_0 : ( ( ( rule__Section3__Group_0_0__0 ) ) | ( 'section3[' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:882:1: ( ( rule__Section3__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:882:1: ( ( rule__Section3__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:883:1: ( rule__Section3__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection3Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:1: ( rule__Section3__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:884:2: rule__Section3__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01834);
                    rule__Section3__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection3Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:888:6: ( 'section3[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:888:6: ( 'section3[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:889:1: 'section3['
                    {
                     before(grammarAccess.getSection3Access().getSection3Keyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Section3__Alternatives_01853); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:901:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );
    public final void rule__Section4__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:905:1: ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("901:1: rule__Section4__Alternatives_0 : ( ( ( rule__Section4__Group_0_0__0 ) ) | ( 'section4[' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:906:1: ( ( rule__Section4__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:906:1: ( ( rule__Section4__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:907:1: ( rule__Section4__Group_0_0__0 )
                    {
                     before(grammarAccess.getSection4Access().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:908:1: ( rule__Section4__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:908:2: rule__Section4__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01887);
                    rule__Section4__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSection4Access().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:6: ( 'section4[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:912:6: ( 'section4[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:913:1: 'section4['
                    {
                     before(grammarAccess.getSection4Access().getSection4Keyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Section4__Alternatives_01906); 
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


    // $ANTLR start rule__AbstractSection__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:925:1: rule__AbstractSection__Alternatives : ( ( ruleChapter ) | ( ruleSection ) | ( ruleSection2 ) | ( ruleSection3 ) | ( ruleSection4 ) );
    public final void rule__AbstractSection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:929:1: ( ( ruleChapter ) | ( ruleSection ) | ( ruleSection2 ) | ( ruleSection3 ) | ( ruleSection4 ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 10:
            case 19:
                {
                alt9=1;
                }
                break;
            case 11:
            case 21:
                {
                alt9=2;
                }
                break;
            case 12:
            case 22:
                {
                alt9=3;
                }
                break;
            case 13:
            case 23:
                {
                alt9=4;
                }
                break;
            case 14:
            case 24:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("925:1: rule__AbstractSection__Alternatives : ( ( ruleChapter ) | ( ruleSection ) | ( ruleSection2 ) | ( ruleSection3 ) | ( ruleSection4 ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:930:1: ( ruleChapter )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:930:1: ( ruleChapter )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:931:1: ruleChapter
                    {
                     before(grammarAccess.getAbstractSectionAccess().getChapterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChapter_in_rule__AbstractSection__Alternatives1940);
                    ruleChapter();
                    _fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getChapterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:936:6: ( ruleSection )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:936:6: ( ruleSection )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:937:1: ruleSection
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSection_in_rule__AbstractSection__Alternatives1957);
                    ruleSection();
                    _fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:942:6: ( ruleSection2 )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:942:6: ( ruleSection2 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:943:1: ruleSection2
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSection2ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSection2_in_rule__AbstractSection__Alternatives1974);
                    ruleSection2();
                    _fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSection2ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:948:6: ( ruleSection3 )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:948:6: ( ruleSection3 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:949:1: ruleSection3
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSection3ParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSection3_in_rule__AbstractSection__Alternatives1991);
                    ruleSection3();
                    _fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSection3ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:954:6: ( ruleSection4 )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:954:6: ( ruleSection4 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:955:1: ruleSection4
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSection4ParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSection4_in_rule__AbstractSection__Alternatives2008);
                    ruleSection4();
                    _fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSection4ParserRuleCall_4()); 

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
    // $ANTLR end rule__AbstractSection__Alternatives


    // $ANTLR start rule__TextOrMarkup__Alternatives
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:966:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );
    public final void rule__TextOrMarkup__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:970:1: ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ANY_OTHER)||(LA11_0>=15 && LA11_0<=16)) ) {
                alt11=1;
            }
            else if ( (LA11_0==17||(LA11_0>=25 && LA11_0<=29)||(LA11_0>=31 && LA11_0<=34)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("966:1: rule__TextOrMarkup__Alternatives : ( ( ( rule__TextOrMarkup__Group_0__0 ) ) | ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:971:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:971:1: ( ( rule__TextOrMarkup__Group_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:972:1: ( rule__TextOrMarkup__Group_0__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:973:1: ( rule__TextOrMarkup__Group_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:973:2: rule__TextOrMarkup__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives2041);
                    rule__TextOrMarkup__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:977:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:977:6: ( ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:978:1: ( ( rule__TextOrMarkup__Group_1__0 ) ) ( ( rule__TextOrMarkup__Group_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:978:1: ( ( rule__TextOrMarkup__Group_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:979:1: ( rule__TextOrMarkup__Group_1__0 )
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:980:1: ( rule__TextOrMarkup__Group_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:980:2: rule__TextOrMarkup__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives2061);
                    rule__TextOrMarkup__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:983:1: ( ( rule__TextOrMarkup__Group_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:984:1: ( rule__TextOrMarkup__Group_1__0 )*
                    {
                     before(grammarAccess.getTextOrMarkupAccess().getGroup_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:985:1: ( rule__TextOrMarkup__Group_1__0 )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17||(LA10_0>=25 && LA10_0<=29)||(LA10_0>=31 && LA10_0<=34)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:985:2: rule__TextOrMarkup__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives2073);
                    	    rule__TextOrMarkup__Group_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:995:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:999:1: ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_WS:
                {
                alt12=2;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt12=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt12=4;
                }
                break;
            case 15:
                {
                alt12=5;
                }
                break;
            case 16:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("995:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1000:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1001:1: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Text__Alternatives2109); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1006:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1007:1: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Text__Alternatives2126); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1012:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1013:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives2143); 
                     after(grammarAccess.getTextAccess().getSINGLE_NLTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1018:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1019:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2160); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1024:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1025:1: '\\\\['
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Text__Alternatives2178); 
                     after(grammarAccess.getTextAccess().getReverseSolidusLeftSquareBracketKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1032:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1032:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1033:1: '\\\\]'
                    {
                     before(grammarAccess.getTextAccess().getReverseSolidusRightSquareBracketKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Text__Alternatives2198); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1045:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );
    public final void rule__MarkUp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1049:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            case 31:
                {
                alt13=7;
                }
                break;
            case 32:
                {
                alt13=8;
                }
                break;
            case 17:
            case 33:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1045:1: rule__MarkUp__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) | ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleCodeBlock ) | ( ruleCodeRef ) | ( ruleLink ) | ( ruleImageRef ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1050:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1050:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1051:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2232);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1056:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1056:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1057:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2249);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1062:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1062:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1063:1: ruleRef
                    {
                     before(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2266);
                    ruleRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1068:6: ( ruleOrderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1068:6: ( ruleOrderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1069:1: ruleOrderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2283);
                    ruleOrderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getOrderedListParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1074:6: ( ruleUnorderedList )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1074:6: ( ruleUnorderedList )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1075:1: ruleUnorderedList
                    {
                     before(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2300);
                    ruleUnorderedList();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getUnorderedListParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1080:6: ( ruleCodeBlock )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1080:6: ( ruleCodeBlock )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1081:1: ruleCodeBlock
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2317);
                    ruleCodeBlock();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeBlockParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1086:6: ( ruleCodeRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1086:6: ( ruleCodeRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1087:1: ruleCodeRef
                    {
                     before(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2334);
                    ruleCodeRef();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getCodeRefParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1092:6: ( ruleLink )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1092:6: ( ruleLink )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1093:1: ruleLink
                    {
                     before(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2351);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getMarkUpAccess().getLinkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1098:6: ( ruleImageRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1098:6: ( ruleImageRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1099:1: ruleImageRef
                    {
                     before(grammarAccess.getMarkUpAccess().getImageRefParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2368);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1109:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );
    public final void rule__ImageRef__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1113:1: ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1109:1: rule__ImageRef__Alternatives_0 : ( ( ( rule__ImageRef__Group_0_0__0 ) ) | ( 'img[' ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1114:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1114:1: ( ( rule__ImageRef__Group_0_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1115:1: ( rule__ImageRef__Group_0_0__0 )
                    {
                     before(grammarAccess.getImageRefAccess().getGroup_0_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1116:1: ( rule__ImageRef__Group_0_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1116:2: rule__ImageRef__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02400);
                    rule__ImageRef__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getImageRefAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1120:6: ( 'img[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1120:6: ( 'img[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1121:1: 'img['
                    {
                     before(grammarAccess.getImageRefAccess().getImgKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__ImageRef__Alternatives_02419); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1133:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );
    public final void rule__CodeBlock__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1137:1: ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_MULTI_NL)||(LA16_0>=15 && LA16_0<=16)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=25 && LA16_0<=27)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1133:1: rule__CodeBlock__Alternatives_2 : ( ( ( rule__CodeBlock__Group_2_0__0 ) ) | ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1138:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1138:1: ( ( rule__CodeBlock__Group_2_0__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1139:1: ( rule__CodeBlock__Group_2_0__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1140:1: ( rule__CodeBlock__Group_2_0__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1140:2: rule__CodeBlock__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22453);
                    rule__CodeBlock__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1144:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1144:6: ( ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:1: ( ( rule__CodeBlock__Group_2_1__0 ) ) ( ( rule__CodeBlock__Group_2_1__0 )* )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1145:1: ( ( rule__CodeBlock__Group_2_1__0 ) )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1146:1: ( rule__CodeBlock__Group_2_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1147:1: ( rule__CodeBlock__Group_2_1__0 )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1147:2: rule__CodeBlock__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22473);
                    rule__CodeBlock__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 

                    }

                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1150:1: ( ( rule__CodeBlock__Group_2_1__0 )* )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1151:1: ( rule__CodeBlock__Group_2_1__0 )*
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_2_1()); 
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1152:1: ( rule__CodeBlock__Group_2_1__0 )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=25 && LA15_0<=27)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1152:2: rule__CodeBlock__Group_2_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22485);
                    	    rule__CodeBlock__Group_2_1__0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1162:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );
    public final void rule__MarkupInCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1166:1: ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1162:1: rule__MarkupInCode__Alternatives : ( ( ruleEmphasize ) | ( ruleAnchor ) | ( ruleRef ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1167:1: ( ruleEmphasize )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1167:1: ( ruleEmphasize )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1168:1: ruleEmphasize
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2521);
                    ruleEmphasize();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getEmphasizeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1173:6: ( ruleAnchor )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1173:6: ( ruleAnchor )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1174:1: ruleAnchor
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2538);
                    ruleAnchor();
                    _fsp--;

                     after(grammarAccess.getMarkupInCodeAccess().getAnchorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1179:6: ( ruleRef )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1179:6: ( ruleRef )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1180:1: ruleRef
                    {
                     before(grammarAccess.getMarkupInCodeAccess().getRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2555);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1190:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );
    public final void rule__CodeText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1194:1: ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_MULTI_NL:
                {
                alt18=2;
                }
                break;
            case RULE_WS:
                {
                alt18=3;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt18=4;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt18=5;
                }
                break;
            case 15:
                {
                alt18=6;
                }
                break;
            case 16:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1190:1: rule__CodeText__Alternatives : ( ( RULE_ID ) | ( RULE_MULTI_NL ) | ( RULE_WS ) | ( RULE_SINGLE_NL ) | ( RULE_ANY_OTHER ) | ( '\\\\[' ) | ( '\\\\]' ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1195:1: ( RULE_ID )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1195:1: ( RULE_ID )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1196:1: RULE_ID
                    {
                     before(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2587); 
                     after(grammarAccess.getCodeTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1201:6: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1201:6: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1202:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2604); 
                     after(grammarAccess.getCodeTextAccess().getMULTI_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1207:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1207:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1208:1: RULE_WS
                    {
                     before(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2621); 
                     after(grammarAccess.getCodeTextAccess().getWSTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1213:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1213:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1214:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2638); 
                     after(grammarAccess.getCodeTextAccess().getSINGLE_NLTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1219:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1219:6: ( RULE_ANY_OTHER )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1220:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2655); 
                     after(grammarAccess.getCodeTextAccess().getANY_OTHERTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1225:6: ( '\\\\[' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1225:6: ( '\\\\[' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1226:1: '\\\\['
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__CodeText__Alternatives2673); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusLeftSquareBracketKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1233:6: ( '\\\\]' )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1233:6: ( '\\\\]' )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1234:1: '\\\\]'
                    {
                     before(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 
                    match(input,16,FOLLOW_16_in_rule__CodeText__Alternatives2693); 
                     after(grammarAccess.getCodeTextAccess().getReverseSolidusRightSquareBracketKeyword_6()); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1246:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );
    public final void rule__ANY_WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1250:1: ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_MULTI_NL:
                {
                alt19=1;
                }
                break;
            case RULE_SINGLE_NL:
                {
                alt19=2;
                }
                break;
            case RULE_WS:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1246:1: rule__ANY_WS__Alternatives : ( ( RULE_MULTI_NL ) | ( RULE_SINGLE_NL ) | ( RULE_WS ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1251:1: ( RULE_MULTI_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1251:1: ( RULE_MULTI_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1252:1: RULE_MULTI_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2727); 
                     after(grammarAccess.getANY_WSAccess().getMULTI_NLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1257:6: ( RULE_SINGLE_NL )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1257:6: ( RULE_SINGLE_NL )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1258:1: RULE_SINGLE_NL
                    {
                     before(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 
                    match(input,RULE_SINGLE_NL,FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2744); 
                     after(grammarAccess.getANY_WSAccess().getSINGLE_NLTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1263:6: ( RULE_WS )
                    {
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1263:6: ( RULE_WS )
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1264:1: RULE_WS
                    {
                     before(grammarAccess.getANY_WSAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2761); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1276:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1280:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1281:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02791);
            rule__Document__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02794);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1288:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1292:1: ( ( () ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1293:1: ( () )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1293:1: ( () )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1294:1: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1295:1: ()
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1297:1: 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1307:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1311:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1312:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12852);
            rule__Document__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12855);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1319:1: rule__Document__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1323:1: ( ( ( RULE_WS )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1324:1: ( ( RULE_WS )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1324:1: ( ( RULE_WS )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1325:1: ( RULE_WS )?
            {
             before(grammarAccess.getDocumentAccess().getWSTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1326:1: ( RULE_WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1326:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2883); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1336:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1340:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1341:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22914);
            rule__Document__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22917);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1348:1: rule__Document__Group__2__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1352:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1353:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1353:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1354:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1355:1: ( RULE_MULTI_NL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_MULTI_NL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1355:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2945); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1365:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1369:1: ( rule__Document__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1370:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32976);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1376:1: rule__Document__Group__3__Impl : ( ( rule__Document__Group_3__0 )? ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1380:1: ( ( ( rule__Document__Group_3__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1381:1: ( ( rule__Document__Group_3__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1381:1: ( ( rule__Document__Group_3__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1382:1: ( rule__Document__Group_3__0 )?
            {
             before(grammarAccess.getDocumentAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1383:1: ( rule__Document__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=10 && LA22_0<=12)||LA22_0==19||(LA22_0>=21 && LA22_0<=22)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1383:2: rule__Document__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl3003);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1401:1: rule__Document__Group_3__0 : rule__Document__Group_3__0__Impl rule__Document__Group_3__1 ;
    public final void rule__Document__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1405:1: ( rule__Document__Group_3__0__Impl rule__Document__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1406:2: rule__Document__Group_3__0__Impl rule__Document__Group_3__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__03042);
            rule__Document__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__03045);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1413:1: rule__Document__Group_3__0__Impl : ( ( rule__Document__Alternatives_3_0 ) ) ;
    public final void rule__Document__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1417:1: ( ( ( rule__Document__Alternatives_3_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1418:1: ( ( rule__Document__Alternatives_3_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1418:1: ( ( rule__Document__Alternatives_3_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1419:1: ( rule__Document__Alternatives_3_0 )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives_3_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1420:1: ( rule__Document__Alternatives_3_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1420:2: rule__Document__Alternatives_3_0
            {
            pushFollow(FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl3072);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1430:1: rule__Document__Group_3__1 : rule__Document__Group_3__1__Impl ;
    public final void rule__Document__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1434:1: ( rule__Document__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1435:2: rule__Document__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__13102);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1441:1: rule__Document__Group_3__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Document__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1445:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1446:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1446:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1447:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1448:1: ( RULE_MULTI_NL )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_MULTI_NL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1448:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl3130); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1462:1: rule__Document__Group_3_0_0__0 : rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 ;
    public final void rule__Document__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1466:1: ( rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1467:2: rule__Document__Group_3_0_0__0__Impl rule__Document__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03165);
            rule__Document__Group_3_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03168);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1474:1: rule__Document__Group_3_0_0__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_0_0 ) ) ;
    public final void rule__Document__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1478:1: ( ( ( rule__Document__SectionsAssignment_3_0_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1479:1: ( ( rule__Document__SectionsAssignment_3_0_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1479:1: ( ( rule__Document__SectionsAssignment_3_0_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1480:1: ( rule__Document__SectionsAssignment_3_0_0_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1481:1: ( rule__Document__SectionsAssignment_3_0_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1481:2: rule__Document__SectionsAssignment_3_0_0_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3195);
            rule__Document__SectionsAssignment_3_0_0_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_0_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1491:1: rule__Document__Group_3_0_0__1 : rule__Document__Group_3_0_0__1__Impl ;
    public final void rule__Document__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1495:1: ( rule__Document__Group_3_0_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1496:2: rule__Document__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13225);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1502:1: rule__Document__Group_3_0_0__1__Impl : ( ( rule__Document__Group_3_0_0_1__0 )* ) ;
    public final void rule__Document__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1506:1: ( ( ( rule__Document__Group_3_0_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1507:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1507:1: ( ( rule__Document__Group_3_0_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1508:1: ( rule__Document__Group_3_0_0_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1509:1: ( rule__Document__Group_3_0_0_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MULTI_NL) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==10||LA24_1==19) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1509:2: rule__Document__Group_3_0_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3252);
            	    rule__Document__Group_3_0_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1523:1: rule__Document__Group_3_0_0_1__0 : rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 ;
    public final void rule__Document__Group_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1527:1: ( rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1528:2: rule__Document__Group_3_0_0_1__0__Impl rule__Document__Group_3_0_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03287);
            rule__Document__Group_3_0_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03290);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1535:1: rule__Document__Group_3_0_0_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1539:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1540:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1540:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1541:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3317); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1552:1: rule__Document__Group_3_0_0_1__1 : rule__Document__Group_3_0_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1556:1: ( rule__Document__Group_3_0_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1557:2: rule__Document__Group_3_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13346);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1563:1: rule__Document__Group_3_0_0_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_0_1_1 ) ) ;
    public final void rule__Document__Group_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1567:1: ( ( ( rule__Document__SectionsAssignment_3_0_0_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1568:1: ( ( rule__Document__SectionsAssignment_3_0_0_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1568:1: ( ( rule__Document__SectionsAssignment_3_0_0_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1569:1: ( rule__Document__SectionsAssignment_3_0_0_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1570:1: ( rule__Document__SectionsAssignment_3_0_0_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1570:2: rule__Document__SectionsAssignment_3_0_0_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3373);
            rule__Document__SectionsAssignment_3_0_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_0_1_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1584:1: rule__Document__Group_3_0_1__0 : rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 ;
    public final void rule__Document__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1588:1: ( rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1589:2: rule__Document__Group_3_0_1__0__Impl rule__Document__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03407);
            rule__Document__Group_3_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03410);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1596:1: rule__Document__Group_3_0_1__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) ;
    public final void rule__Document__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1600:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1601:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1601:1: ( ( rule__Document__SectionsAssignment_3_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1602:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1603:1: ( rule__Document__SectionsAssignment_3_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1603:2: rule__Document__SectionsAssignment_3_0_1_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3437);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1613:1: rule__Document__Group_3_0_1__1 : rule__Document__Group_3_0_1__1__Impl ;
    public final void rule__Document__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1617:1: ( rule__Document__Group_3_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1618:2: rule__Document__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13467);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1624:1: rule__Document__Group_3_0_1__1__Impl : ( ( rule__Document__Group_3_0_1_1__0 )* ) ;
    public final void rule__Document__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1628:1: ( ( ( rule__Document__Group_3_0_1_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1629:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1629:1: ( ( rule__Document__Group_3_0_1_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1630:1: ( rule__Document__Group_3_0_1_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1631:1: ( rule__Document__Group_3_0_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MULTI_NL) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==11||LA25_1==21) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1631:2: rule__Document__Group_3_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3494);
            	    rule__Document__Group_3_0_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1645:1: rule__Document__Group_3_0_1_1__0 : rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 ;
    public final void rule__Document__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1649:1: ( rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1650:2: rule__Document__Group_3_0_1_1__0__Impl rule__Document__Group_3_0_1_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03529);
            rule__Document__Group_3_0_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03532);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1657:1: rule__Document__Group_3_0_1_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1661:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1662:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1662:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1663:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3559); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1674:1: rule__Document__Group_3_0_1_1__1 : rule__Document__Group_3_0_1_1__1__Impl ;
    public final void rule__Document__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1678:1: ( rule__Document__Group_3_0_1_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1679:2: rule__Document__Group_3_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13588);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1685:1: rule__Document__Group_3_0_1_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) ;
    public final void rule__Document__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1689:1: ( ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1690:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1690:1: ( ( rule__Document__SectionsAssignment_3_0_1_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1691:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_1_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1692:1: ( rule__Document__SectionsAssignment_3_0_1_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1692:2: rule__Document__SectionsAssignment_3_0_1_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3615);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1706:1: rule__Document__Group_3_0_2__0 : rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 ;
    public final void rule__Document__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1710:1: ( rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1711:2: rule__Document__Group_3_0_2__0__Impl rule__Document__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03649);
            rule__Document__Group_3_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03652);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1718:1: rule__Document__Group_3_0_2__0__Impl : ( ( rule__Document__SectionsAssignment_3_0_2_0 ) ) ;
    public final void rule__Document__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1722:1: ( ( ( rule__Document__SectionsAssignment_3_0_2_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1723:1: ( ( rule__Document__SectionsAssignment_3_0_2_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1723:1: ( ( rule__Document__SectionsAssignment_3_0_2_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1724:1: ( rule__Document__SectionsAssignment_3_0_2_0 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_2_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1725:1: ( rule__Document__SectionsAssignment_3_0_2_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1725:2: rule__Document__SectionsAssignment_3_0_2_0
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3679);
            rule__Document__SectionsAssignment_3_0_2_0();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_2_0()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1735:1: rule__Document__Group_3_0_2__1 : rule__Document__Group_3_0_2__1__Impl ;
    public final void rule__Document__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1739:1: ( rule__Document__Group_3_0_2__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1740:2: rule__Document__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13709);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1746:1: rule__Document__Group_3_0_2__1__Impl : ( ( rule__Document__Group_3_0_2_1__0 )* ) ;
    public final void rule__Document__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1750:1: ( ( ( rule__Document__Group_3_0_2_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1751:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1751:1: ( ( rule__Document__Group_3_0_2_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1752:1: ( rule__Document__Group_3_0_2_1__0 )*
            {
             before(grammarAccess.getDocumentAccess().getGroup_3_0_2_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1753:1: ( rule__Document__Group_3_0_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_MULTI_NL) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==12||LA26_1==22) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1753:2: rule__Document__Group_3_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3736);
            	    rule__Document__Group_3_0_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1767:1: rule__Document__Group_3_0_2_1__0 : rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 ;
    public final void rule__Document__Group_3_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1771:1: ( rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1772:2: rule__Document__Group_3_0_2_1__0__Impl rule__Document__Group_3_0_2_1__1
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03771);
            rule__Document__Group_3_0_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03774);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1779:1: rule__Document__Group_3_0_2_1__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Document__Group_3_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1783:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1784:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1784:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1785:1: RULE_MULTI_NL
            {
             before(grammarAccess.getDocumentAccess().getMULTI_NLTerminalRuleCall_3_0_2_1_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3801); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1796:1: rule__Document__Group_3_0_2_1__1 : rule__Document__Group_3_0_2_1__1__Impl ;
    public final void rule__Document__Group_3_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1800:1: ( rule__Document__Group_3_0_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1801:2: rule__Document__Group_3_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13830);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1807:1: rule__Document__Group_3_0_2_1__1__Impl : ( ( rule__Document__SectionsAssignment_3_0_2_1_1 ) ) ;
    public final void rule__Document__Group_3_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1811:1: ( ( ( rule__Document__SectionsAssignment_3_0_2_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1812:1: ( ( rule__Document__SectionsAssignment_3_0_2_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1812:1: ( ( rule__Document__SectionsAssignment_3_0_2_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1813:1: ( rule__Document__SectionsAssignment_3_0_2_1_1 )
            {
             before(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1814:1: ( rule__Document__SectionsAssignment_3_0_2_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1814:2: rule__Document__SectionsAssignment_3_0_2_1_1
            {
            pushFollow(FOLLOW_rule__Document__SectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3857);
            rule__Document__SectionsAssignment_3_0_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSectionsAssignment_3_0_2_1_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1828:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1832:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1833:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03891);
            rule__Chapter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03894);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1840:1: rule__Chapter__Group__0__Impl : ( ( rule__Chapter__Alternatives_0 ) ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1844:1: ( ( ( rule__Chapter__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1845:1: ( ( rule__Chapter__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1845:1: ( ( rule__Chapter__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1846:1: ( rule__Chapter__Alternatives_0 )
            {
             before(grammarAccess.getChapterAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1847:1: ( rule__Chapter__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1847:2: rule__Chapter__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3921);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1857:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1861:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1862:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13951);
            rule__Chapter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13954);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1869:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__TitleAssignment_1 ) ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1873:1: ( ( ( rule__Chapter__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1874:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1874:1: ( ( rule__Chapter__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1875:1: ( rule__Chapter__TitleAssignment_1 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1876:1: ( rule__Chapter__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1876:2: rule__Chapter__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3981);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1886:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1890:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1891:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__24011);
            rule__Chapter__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__24014);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1898:1: rule__Chapter__Group__2__Impl : ( ']' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1902:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1903:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1903:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1904:1: ']'
            {
             before(grammarAccess.getChapterAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Chapter__Group__2__Impl4042); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1917:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1921:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1922:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__34073);
            rule__Chapter__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__34076);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1929:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__Group_3__0 )* ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1933:1: ( ( ( rule__Chapter__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1934:1: ( ( rule__Chapter__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1934:1: ( ( rule__Chapter__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1935:1: ( rule__Chapter__Group_3__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1936:1: ( rule__Chapter__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_MULTI_NL) ) {
                    int LA27_1 = input.LA(2);

                    if ( ((LA27_1>=RULE_ID && LA27_1<=RULE_ANY_OTHER)||(LA27_1>=15 && LA27_1<=17)||(LA27_1>=25 && LA27_1<=29)||(LA27_1>=31 && LA27_1<=34)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1936:2: rule__Chapter__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl4103);
            	    rule__Chapter__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1946:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1950:1: ( rule__Chapter__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1951:2: rule__Chapter__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__44134);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1957:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__Group_4__0 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1961:1: ( ( ( rule__Chapter__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1962:1: ( ( rule__Chapter__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1962:1: ( ( rule__Chapter__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1963:1: ( rule__Chapter__Group_4__0 )*
            {
             before(grammarAccess.getChapterAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:1: ( rule__Chapter__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTI_NL) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==11||LA28_2==21) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1964:2: rule__Chapter__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4161);
            	    rule__Chapter__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1984:1: rule__Chapter__Group_0_0__0 : rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 ;
    public final void rule__Chapter__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1988:1: ( rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1989:2: rule__Chapter__Group_0_0__0__Impl rule__Chapter__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04202);
            rule__Chapter__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04205);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:1996:1: rule__Chapter__Group_0_0__0__Impl : ( 'chapter:' ) ;
    public final void rule__Chapter__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2000:1: ( ( 'chapter:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2001:1: ( 'chapter:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2001:1: ( 'chapter:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2002:1: 'chapter:'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Chapter__Group_0_0__0__Impl4233); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2015:1: rule__Chapter__Group_0_0__1 : rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 ;
    public final void rule__Chapter__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2019:1: ( rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2020:2: rule__Chapter__Group_0_0__1__Impl rule__Chapter__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14264);
            rule__Chapter__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14267);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2027:1: rule__Chapter__Group_0_0__1__Impl : ( ( rule__Chapter__NameAssignment_0_0_1 ) ) ;
    public final void rule__Chapter__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2031:1: ( ( ( rule__Chapter__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2032:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2032:1: ( ( rule__Chapter__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2033:1: ( rule__Chapter__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2034:1: ( rule__Chapter__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2034:2: rule__Chapter__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4294);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2044:1: rule__Chapter__Group_0_0__2 : rule__Chapter__Group_0_0__2__Impl ;
    public final void rule__Chapter__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2048:1: ( rule__Chapter__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2049:2: rule__Chapter__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24324);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2055:1: rule__Chapter__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Chapter__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2059:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2060:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2060:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2061:1: '['
            {
             before(grammarAccess.getChapterAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Chapter__Group_0_0__2__Impl4352); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2080:1: rule__Chapter__Group_3__0 : rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 ;
    public final void rule__Chapter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2084:1: ( rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2085:2: rule__Chapter__Group_3__0__Impl rule__Chapter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04389);
            rule__Chapter__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04392);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2092:1: rule__Chapter__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2096:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2097:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2097:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2098:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4419); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2109:1: rule__Chapter__Group_3__1 : rule__Chapter__Group_3__1__Impl ;
    public final void rule__Chapter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2113:1: ( rule__Chapter__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2114:2: rule__Chapter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14448);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2120:1: rule__Chapter__Group_3__1__Impl : ( ( rule__Chapter__ContentsAssignment_3_1 ) ) ;
    public final void rule__Chapter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2124:1: ( ( ( rule__Chapter__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2125:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2125:1: ( ( rule__Chapter__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2126:1: ( rule__Chapter__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getChapterAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2127:1: ( rule__Chapter__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2127:2: rule__Chapter__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4475);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2141:1: rule__Chapter__Group_4__0 : rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 ;
    public final void rule__Chapter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2145:1: ( rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2146:2: rule__Chapter__Group_4__0__Impl rule__Chapter__Group_4__1
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04509);
            rule__Chapter__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04512);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2153:1: rule__Chapter__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Chapter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2157:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2158:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2158:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2159:1: RULE_MULTI_NL
            {
             before(grammarAccess.getChapterAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4539); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2170:1: rule__Chapter__Group_4__1 : rule__Chapter__Group_4__1__Impl ;
    public final void rule__Chapter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2174:1: ( rule__Chapter__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2175:2: rule__Chapter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14568);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2181:1: rule__Chapter__Group_4__1__Impl : ( ( rule__Chapter__SubSectionsAssignment_4_1 ) ) ;
    public final void rule__Chapter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2185:1: ( ( ( rule__Chapter__SubSectionsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2186:1: ( ( rule__Chapter__SubSectionsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2186:1: ( ( rule__Chapter__SubSectionsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2187:1: ( rule__Chapter__SubSectionsAssignment_4_1 )
            {
             before(grammarAccess.getChapterAccess().getSubSectionsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2188:1: ( rule__Chapter__SubSectionsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2188:2: rule__Chapter__SubSectionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Chapter__SubSectionsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4595);
            rule__Chapter__SubSectionsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getChapterAccess().getSubSectionsAssignment_4_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2202:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2206:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2207:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04629);
            rule__Section__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04632);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2214:1: rule__Section__Group__0__Impl : ( ( rule__Section__Alternatives_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2218:1: ( ( ( rule__Section__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2219:1: ( ( rule__Section__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2219:1: ( ( rule__Section__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2220:1: ( rule__Section__Alternatives_0 )
            {
             before(grammarAccess.getSectionAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2221:1: ( rule__Section__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2221:2: rule__Section__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4659);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2231:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2235:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2236:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14689);
            rule__Section__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14692);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2243:1: rule__Section__Group__1__Impl : ( ( rule__Section__TitleAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2247:1: ( ( ( rule__Section__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2248:1: ( ( rule__Section__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2248:1: ( ( rule__Section__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2249:1: ( rule__Section__TitleAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2250:1: ( rule__Section__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2250:2: rule__Section__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4719);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2260:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2264:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2265:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24749);
            rule__Section__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24752);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2272:1: rule__Section__Group__2__Impl : ( ']' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2276:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2277:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2277:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2278:1: ']'
            {
             before(grammarAccess.getSectionAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section__Group__2__Impl4780); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2291:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2295:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2296:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34811);
            rule__Section__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34814);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2303:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )* ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2307:1: ( ( ( rule__Section__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2308:1: ( ( rule__Section__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2308:1: ( ( rule__Section__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2309:1: ( rule__Section__Group_3__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2310:1: ( rule__Section__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MULTI_NL) ) {
                    int LA29_1 = input.LA(2);

                    if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_ANY_OTHER)||(LA29_1>=15 && LA29_1<=17)||(LA29_1>=25 && LA29_1<=29)||(LA29_1>=31 && LA29_1<=34)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2310:2: rule__Section__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4841);
            	    rule__Section__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2320:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2324:1: ( rule__Section__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2325:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44872);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2331:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2335:1: ( ( ( rule__Section__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2336:1: ( ( rule__Section__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2336:1: ( ( rule__Section__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2337:1: ( rule__Section__Group_4__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2338:1: ( rule__Section__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_MULTI_NL) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==12||LA30_2==22) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2338:2: rule__Section__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4899);
            	    rule__Section__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2358:1: rule__Section__Group_0_0__0 : rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 ;
    public final void rule__Section__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2362:1: ( rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2363:2: rule__Section__Group_0_0__0__Impl rule__Section__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04940);
            rule__Section__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04943);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2370:1: rule__Section__Group_0_0__0__Impl : ( 'section:' ) ;
    public final void rule__Section__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2374:1: ( ( 'section:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2375:1: ( 'section:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2375:1: ( 'section:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2376:1: 'section:'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Section__Group_0_0__0__Impl4971); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2389:1: rule__Section__Group_0_0__1 : rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 ;
    public final void rule__Section__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2393:1: ( rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2394:2: rule__Section__Group_0_0__1__Impl rule__Section__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__15002);
            rule__Section__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__15005);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2401:1: rule__Section__Group_0_0__1__Impl : ( ( rule__Section__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2405:1: ( ( ( rule__Section__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2406:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2406:1: ( ( rule__Section__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2407:1: ( rule__Section__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2408:1: ( rule__Section__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2408:2: rule__Section__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl5032);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2418:1: rule__Section__Group_0_0__2 : rule__Section__Group_0_0__2__Impl ;
    public final void rule__Section__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2422:1: ( rule__Section__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2423:2: rule__Section__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__25062);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2429:1: rule__Section__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2433:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2434:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2434:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2435:1: '['
            {
             before(grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section__Group_0_0__2__Impl5090); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2454:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2458:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2459:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__05127);
            rule__Section__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__05130);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2466:1: rule__Section__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2470:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2471:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2471:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2472:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl5157); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2483:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2487:1: ( rule__Section__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2488:2: rule__Section__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15186);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2494:1: rule__Section__Group_3__1__Impl : ( ( rule__Section__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2498:1: ( ( ( rule__Section__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2499:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2499:1: ( ( rule__Section__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2500:1: ( rule__Section__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSectionAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2501:1: ( rule__Section__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2501:2: rule__Section__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5213);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2515:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2519:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2520:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05247);
            rule__Section__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05250);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2527:1: rule__Section__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2531:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2532:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2532:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2533:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSectionAccess().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5277); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2544:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2548:1: ( rule__Section__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2549:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15306);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2555:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__SubSectionsAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2559:1: ( ( ( rule__Section__SubSectionsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2560:1: ( ( rule__Section__SubSectionsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2560:1: ( ( rule__Section__SubSectionsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2561:1: ( rule__Section__SubSectionsAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getSubSectionsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2562:1: ( rule__Section__SubSectionsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2562:2: rule__Section__SubSectionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__SubSectionsAssignment_4_1_in_rule__Section__Group_4__1__Impl5333);
            rule__Section__SubSectionsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSectionAccess().getSubSectionsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Section2__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2576:1: rule__Section2__Group__0 : rule__Section2__Group__0__Impl rule__Section2__Group__1 ;
    public final void rule__Section2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2580:1: ( rule__Section2__Group__0__Impl rule__Section2__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2581:2: rule__Section2__Group__0__Impl rule__Section2__Group__1
            {
            pushFollow(FOLLOW_rule__Section2__Group__0__Impl_in_rule__Section2__Group__05367);
            rule__Section2__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group__1_in_rule__Section2__Group__05370);
            rule__Section2__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__0


    // $ANTLR start rule__Section2__Group__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2588:1: rule__Section2__Group__0__Impl : ( ( rule__Section2__Alternatives_0 ) ) ;
    public final void rule__Section2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2592:1: ( ( ( rule__Section2__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2593:1: ( ( rule__Section2__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2593:1: ( ( rule__Section2__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2594:1: ( rule__Section2__Alternatives_0 )
            {
             before(grammarAccess.getSection2Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2595:1: ( rule__Section2__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2595:2: rule__Section2__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section2__Alternatives_0_in_rule__Section2__Group__0__Impl5397);
            rule__Section2__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__0__Impl


    // $ANTLR start rule__Section2__Group__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2605:1: rule__Section2__Group__1 : rule__Section2__Group__1__Impl rule__Section2__Group__2 ;
    public final void rule__Section2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2609:1: ( rule__Section2__Group__1__Impl rule__Section2__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2610:2: rule__Section2__Group__1__Impl rule__Section2__Group__2
            {
            pushFollow(FOLLOW_rule__Section2__Group__1__Impl_in_rule__Section2__Group__15427);
            rule__Section2__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group__2_in_rule__Section2__Group__15430);
            rule__Section2__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__1


    // $ANTLR start rule__Section2__Group__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2617:1: rule__Section2__Group__1__Impl : ( ( rule__Section2__TitleAssignment_1 ) ) ;
    public final void rule__Section2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2621:1: ( ( ( rule__Section2__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2622:1: ( ( rule__Section2__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2622:1: ( ( rule__Section2__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2623:1: ( rule__Section2__TitleAssignment_1 )
            {
             before(grammarAccess.getSection2Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2624:1: ( rule__Section2__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2624:2: rule__Section2__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section2__TitleAssignment_1_in_rule__Section2__Group__1__Impl5457);
            rule__Section2__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__1__Impl


    // $ANTLR start rule__Section2__Group__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2634:1: rule__Section2__Group__2 : rule__Section2__Group__2__Impl rule__Section2__Group__3 ;
    public final void rule__Section2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2638:1: ( rule__Section2__Group__2__Impl rule__Section2__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2639:2: rule__Section2__Group__2__Impl rule__Section2__Group__3
            {
            pushFollow(FOLLOW_rule__Section2__Group__2__Impl_in_rule__Section2__Group__25487);
            rule__Section2__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group__3_in_rule__Section2__Group__25490);
            rule__Section2__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__2


    // $ANTLR start rule__Section2__Group__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2646:1: rule__Section2__Group__2__Impl : ( ']' ) ;
    public final void rule__Section2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2650:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2651:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2651:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2652:1: ']'
            {
             before(grammarAccess.getSection2Access().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section2__Group__2__Impl5518); 
             after(grammarAccess.getSection2Access().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__2__Impl


    // $ANTLR start rule__Section2__Group__3
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2665:1: rule__Section2__Group__3 : rule__Section2__Group__3__Impl rule__Section2__Group__4 ;
    public final void rule__Section2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2669:1: ( rule__Section2__Group__3__Impl rule__Section2__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2670:2: rule__Section2__Group__3__Impl rule__Section2__Group__4
            {
            pushFollow(FOLLOW_rule__Section2__Group__3__Impl_in_rule__Section2__Group__35549);
            rule__Section2__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group__4_in_rule__Section2__Group__35552);
            rule__Section2__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__3


    // $ANTLR start rule__Section2__Group__3__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2677:1: rule__Section2__Group__3__Impl : ( ( rule__Section2__Group_3__0 )* ) ;
    public final void rule__Section2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2681:1: ( ( ( rule__Section2__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2682:1: ( ( rule__Section2__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2682:1: ( ( rule__Section2__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2683:1: ( rule__Section2__Group_3__0 )*
            {
             before(grammarAccess.getSection2Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2684:1: ( rule__Section2__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTI_NL) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_ANY_OTHER)||(LA31_1>=15 && LA31_1<=17)||(LA31_1>=25 && LA31_1<=29)||(LA31_1>=31 && LA31_1<=34)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2684:2: rule__Section2__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section2__Group_3__0_in_rule__Section2__Group__3__Impl5579);
            	    rule__Section2__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSection2Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__3__Impl


    // $ANTLR start rule__Section2__Group__4
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2694:1: rule__Section2__Group__4 : rule__Section2__Group__4__Impl ;
    public final void rule__Section2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2698:1: ( rule__Section2__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2699:2: rule__Section2__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section2__Group__4__Impl_in_rule__Section2__Group__45610);
            rule__Section2__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__4


    // $ANTLR start rule__Section2__Group__4__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2705:1: rule__Section2__Group__4__Impl : ( ( rule__Section2__Group_4__0 )* ) ;
    public final void rule__Section2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2709:1: ( ( ( rule__Section2__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2710:1: ( ( rule__Section2__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2710:1: ( ( rule__Section2__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2711:1: ( rule__Section2__Group_4__0 )*
            {
             before(grammarAccess.getSection2Access().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2712:1: ( rule__Section2__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_MULTI_NL) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==13||LA32_2==23) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2712:2: rule__Section2__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section2__Group_4__0_in_rule__Section2__Group__4__Impl5637);
            	    rule__Section2__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSection2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group__4__Impl


    // $ANTLR start rule__Section2__Group_0_0__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2732:1: rule__Section2__Group_0_0__0 : rule__Section2__Group_0_0__0__Impl rule__Section2__Group_0_0__1 ;
    public final void rule__Section2__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2736:1: ( rule__Section2__Group_0_0__0__Impl rule__Section2__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2737:2: rule__Section2__Group_0_0__0__Impl rule__Section2__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section2__Group_0_0__0__Impl_in_rule__Section2__Group_0_0__05678);
            rule__Section2__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group_0_0__1_in_rule__Section2__Group_0_0__05681);
            rule__Section2__Group_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__0


    // $ANTLR start rule__Section2__Group_0_0__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2744:1: rule__Section2__Group_0_0__0__Impl : ( 'section2:' ) ;
    public final void rule__Section2__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2748:1: ( ( 'section2:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2749:1: ( 'section2:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2749:1: ( 'section2:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2750:1: 'section2:'
            {
             before(grammarAccess.getSection2Access().getSection2Keyword_0_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Section2__Group_0_0__0__Impl5709); 
             after(grammarAccess.getSection2Access().getSection2Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__0__Impl


    // $ANTLR start rule__Section2__Group_0_0__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2763:1: rule__Section2__Group_0_0__1 : rule__Section2__Group_0_0__1__Impl rule__Section2__Group_0_0__2 ;
    public final void rule__Section2__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2767:1: ( rule__Section2__Group_0_0__1__Impl rule__Section2__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2768:2: rule__Section2__Group_0_0__1__Impl rule__Section2__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section2__Group_0_0__1__Impl_in_rule__Section2__Group_0_0__15740);
            rule__Section2__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group_0_0__2_in_rule__Section2__Group_0_0__15743);
            rule__Section2__Group_0_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__1


    // $ANTLR start rule__Section2__Group_0_0__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2775:1: rule__Section2__Group_0_0__1__Impl : ( ( rule__Section2__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section2__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2779:1: ( ( ( rule__Section2__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2780:1: ( ( rule__Section2__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2780:1: ( ( rule__Section2__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2781:1: ( rule__Section2__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection2Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2782:1: ( rule__Section2__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2782:2: rule__Section2__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section2__NameAssignment_0_0_1_in_rule__Section2__Group_0_0__1__Impl5770);
            rule__Section2__NameAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getNameAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__1__Impl


    // $ANTLR start rule__Section2__Group_0_0__2
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2792:1: rule__Section2__Group_0_0__2 : rule__Section2__Group_0_0__2__Impl ;
    public final void rule__Section2__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2796:1: ( rule__Section2__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2797:2: rule__Section2__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section2__Group_0_0__2__Impl_in_rule__Section2__Group_0_0__25800);
            rule__Section2__Group_0_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__2


    // $ANTLR start rule__Section2__Group_0_0__2__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2803:1: rule__Section2__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section2__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2807:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2808:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2808:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2809:1: '['
            {
             before(grammarAccess.getSection2Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section2__Group_0_0__2__Impl5828); 
             after(grammarAccess.getSection2Access().getLeftSquareBracketKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_0_0__2__Impl


    // $ANTLR start rule__Section2__Group_3__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2828:1: rule__Section2__Group_3__0 : rule__Section2__Group_3__0__Impl rule__Section2__Group_3__1 ;
    public final void rule__Section2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2832:1: ( rule__Section2__Group_3__0__Impl rule__Section2__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2833:2: rule__Section2__Group_3__0__Impl rule__Section2__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section2__Group_3__0__Impl_in_rule__Section2__Group_3__05865);
            rule__Section2__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group_3__1_in_rule__Section2__Group_3__05868);
            rule__Section2__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_3__0


    // $ANTLR start rule__Section2__Group_3__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2840:1: rule__Section2__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2844:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2845:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2845:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2846:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section2__Group_3__0__Impl5895); 
             after(grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_3__0__Impl


    // $ANTLR start rule__Section2__Group_3__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2857:1: rule__Section2__Group_3__1 : rule__Section2__Group_3__1__Impl ;
    public final void rule__Section2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2861:1: ( rule__Section2__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2862:2: rule__Section2__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section2__Group_3__1__Impl_in_rule__Section2__Group_3__15924);
            rule__Section2__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_3__1


    // $ANTLR start rule__Section2__Group_3__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2868:1: rule__Section2__Group_3__1__Impl : ( ( rule__Section2__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2872:1: ( ( ( rule__Section2__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2873:1: ( ( rule__Section2__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2873:1: ( ( rule__Section2__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2874:1: ( rule__Section2__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection2Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2875:1: ( rule__Section2__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2875:2: rule__Section2__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section2__ContentsAssignment_3_1_in_rule__Section2__Group_3__1__Impl5951);
            rule__Section2__ContentsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getContentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_3__1__Impl


    // $ANTLR start rule__Section2__Group_4__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2889:1: rule__Section2__Group_4__0 : rule__Section2__Group_4__0__Impl rule__Section2__Group_4__1 ;
    public final void rule__Section2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2893:1: ( rule__Section2__Group_4__0__Impl rule__Section2__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2894:2: rule__Section2__Group_4__0__Impl rule__Section2__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section2__Group_4__0__Impl_in_rule__Section2__Group_4__05985);
            rule__Section2__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section2__Group_4__1_in_rule__Section2__Group_4__05988);
            rule__Section2__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_4__0


    // $ANTLR start rule__Section2__Group_4__0__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2901:1: rule__Section2__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2905:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2906:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2906:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2907:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section2__Group_4__0__Impl6015); 
             after(grammarAccess.getSection2Access().getMULTI_NLTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_4__0__Impl


    // $ANTLR start rule__Section2__Group_4__1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2918:1: rule__Section2__Group_4__1 : rule__Section2__Group_4__1__Impl ;
    public final void rule__Section2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2922:1: ( rule__Section2__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2923:2: rule__Section2__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section2__Group_4__1__Impl_in_rule__Section2__Group_4__16044);
            rule__Section2__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_4__1


    // $ANTLR start rule__Section2__Group_4__1__Impl
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2929:1: rule__Section2__Group_4__1__Impl : ( ( rule__Section2__SubSectionsAssignment_4_1 ) ) ;
    public final void rule__Section2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2933:1: ( ( ( rule__Section2__SubSectionsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2934:1: ( ( rule__Section2__SubSectionsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2934:1: ( ( rule__Section2__SubSectionsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2935:1: ( rule__Section2__SubSectionsAssignment_4_1 )
            {
             before(grammarAccess.getSection2Access().getSubSectionsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2936:1: ( rule__Section2__SubSectionsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2936:2: rule__Section2__SubSectionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section2__SubSectionsAssignment_4_1_in_rule__Section2__Group_4__1__Impl6071);
            rule__Section2__SubSectionsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSection2Access().getSubSectionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__Group_4__1__Impl


    // $ANTLR start rule__Section3__Group__0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2950:1: rule__Section3__Group__0 : rule__Section3__Group__0__Impl rule__Section3__Group__1 ;
    public final void rule__Section3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2954:1: ( rule__Section3__Group__0__Impl rule__Section3__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2955:2: rule__Section3__Group__0__Impl rule__Section3__Group__1
            {
            pushFollow(FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__06105);
            rule__Section3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__06108);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2962:1: rule__Section3__Group__0__Impl : ( ( rule__Section3__Alternatives_0 ) ) ;
    public final void rule__Section3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2966:1: ( ( ( rule__Section3__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2967:1: ( ( rule__Section3__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2967:1: ( ( rule__Section3__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2968:1: ( rule__Section3__Alternatives_0 )
            {
             before(grammarAccess.getSection3Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2969:1: ( rule__Section3__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2969:2: rule__Section3__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl6135);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2979:1: rule__Section3__Group__1 : rule__Section3__Group__1__Impl rule__Section3__Group__2 ;
    public final void rule__Section3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2983:1: ( rule__Section3__Group__1__Impl rule__Section3__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2984:2: rule__Section3__Group__1__Impl rule__Section3__Group__2
            {
            pushFollow(FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16165);
            rule__Section3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16168);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2991:1: rule__Section3__Group__1__Impl : ( ( rule__Section3__TitleAssignment_1 ) ) ;
    public final void rule__Section3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2995:1: ( ( ( rule__Section3__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2996:1: ( ( rule__Section3__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2996:1: ( ( rule__Section3__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2997:1: ( rule__Section3__TitleAssignment_1 )
            {
             before(grammarAccess.getSection3Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2998:1: ( rule__Section3__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:2998:2: rule__Section3__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6195);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3008:1: rule__Section3__Group__2 : rule__Section3__Group__2__Impl rule__Section3__Group__3 ;
    public final void rule__Section3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3012:1: ( rule__Section3__Group__2__Impl rule__Section3__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3013:2: rule__Section3__Group__2__Impl rule__Section3__Group__3
            {
            pushFollow(FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26225);
            rule__Section3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26228);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3020:1: rule__Section3__Group__2__Impl : ( ']' ) ;
    public final void rule__Section3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3024:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3025:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3025:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3026:1: ']'
            {
             before(grammarAccess.getSection3Access().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section3__Group__2__Impl6256); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3039:1: rule__Section3__Group__3 : rule__Section3__Group__3__Impl rule__Section3__Group__4 ;
    public final void rule__Section3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3043:1: ( rule__Section3__Group__3__Impl rule__Section3__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3044:2: rule__Section3__Group__3__Impl rule__Section3__Group__4
            {
            pushFollow(FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36287);
            rule__Section3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36290);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3051:1: rule__Section3__Group__3__Impl : ( ( rule__Section3__Group_3__0 )* ) ;
    public final void rule__Section3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3055:1: ( ( ( rule__Section3__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3056:1: ( ( rule__Section3__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3056:1: ( ( rule__Section3__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3057:1: ( rule__Section3__Group_3__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3058:1: ( rule__Section3__Group_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTI_NL) ) {
                    int LA33_1 = input.LA(2);

                    if ( ((LA33_1>=RULE_ID && LA33_1<=RULE_ANY_OTHER)||(LA33_1>=15 && LA33_1<=17)||(LA33_1>=25 && LA33_1<=29)||(LA33_1>=31 && LA33_1<=34)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3058:2: rule__Section3__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6317);
            	    rule__Section3__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3068:1: rule__Section3__Group__4 : rule__Section3__Group__4__Impl ;
    public final void rule__Section3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3072:1: ( rule__Section3__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3073:2: rule__Section3__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46348);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3079:1: rule__Section3__Group__4__Impl : ( ( rule__Section3__Group_4__0 )* ) ;
    public final void rule__Section3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3083:1: ( ( ( rule__Section3__Group_4__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3084:1: ( ( rule__Section3__Group_4__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3084:1: ( ( rule__Section3__Group_4__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3085:1: ( rule__Section3__Group_4__0 )*
            {
             before(grammarAccess.getSection3Access().getGroup_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3086:1: ( rule__Section3__Group_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MULTI_NL) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==14||LA34_2==24) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3086:2: rule__Section3__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6375);
            	    rule__Section3__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3106:1: rule__Section3__Group_0_0__0 : rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 ;
    public final void rule__Section3__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3110:1: ( rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3111:2: rule__Section3__Group_0_0__0__Impl rule__Section3__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06416);
            rule__Section3__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06419);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3118:1: rule__Section3__Group_0_0__0__Impl : ( 'section3:' ) ;
    public final void rule__Section3__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3122:1: ( ( 'section3:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3123:1: ( 'section3:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3123:1: ( 'section3:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3124:1: 'section3:'
            {
             before(grammarAccess.getSection3Access().getSection3Keyword_0_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Section3__Group_0_0__0__Impl6447); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3137:1: rule__Section3__Group_0_0__1 : rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 ;
    public final void rule__Section3__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3141:1: ( rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3142:2: rule__Section3__Group_0_0__1__Impl rule__Section3__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16478);
            rule__Section3__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16481);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3149:1: rule__Section3__Group_0_0__1__Impl : ( ( rule__Section3__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section3__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3153:1: ( ( ( rule__Section3__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3154:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3154:1: ( ( rule__Section3__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3155:1: ( rule__Section3__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection3Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3156:1: ( rule__Section3__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3156:2: rule__Section3__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6508);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3166:1: rule__Section3__Group_0_0__2 : rule__Section3__Group_0_0__2__Impl ;
    public final void rule__Section3__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3170:1: ( rule__Section3__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3171:2: rule__Section3__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26538);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3177:1: rule__Section3__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section3__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3181:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3182:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3182:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3183:1: '['
            {
             before(grammarAccess.getSection3Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section3__Group_0_0__2__Impl6566); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3202:1: rule__Section3__Group_3__0 : rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 ;
    public final void rule__Section3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3206:1: ( rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3207:2: rule__Section3__Group_3__0__Impl rule__Section3__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06603);
            rule__Section3__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06606);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3214:1: rule__Section3__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3218:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3219:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3219:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3220:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6633); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3231:1: rule__Section3__Group_3__1 : rule__Section3__Group_3__1__Impl ;
    public final void rule__Section3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3235:1: ( rule__Section3__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3236:2: rule__Section3__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16662);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3242:1: rule__Section3__Group_3__1__Impl : ( ( rule__Section3__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3246:1: ( ( ( rule__Section3__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3247:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3247:1: ( ( rule__Section3__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3248:1: ( rule__Section3__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection3Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3249:1: ( rule__Section3__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3249:2: rule__Section3__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6689);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3263:1: rule__Section3__Group_4__0 : rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 ;
    public final void rule__Section3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3267:1: ( rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3268:2: rule__Section3__Group_4__0__Impl rule__Section3__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06723);
            rule__Section3__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06726);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3275:1: rule__Section3__Group_4__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3279:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3280:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3280:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3281:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection3Access().getMULTI_NLTerminalRuleCall_4_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6753); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3292:1: rule__Section3__Group_4__1 : rule__Section3__Group_4__1__Impl ;
    public final void rule__Section3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3296:1: ( rule__Section3__Group_4__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3297:2: rule__Section3__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16782);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3303:1: rule__Section3__Group_4__1__Impl : ( ( rule__Section3__SubSectionsAssignment_4_1 ) ) ;
    public final void rule__Section3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3307:1: ( ( ( rule__Section3__SubSectionsAssignment_4_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3308:1: ( ( rule__Section3__SubSectionsAssignment_4_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3308:1: ( ( rule__Section3__SubSectionsAssignment_4_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3309:1: ( rule__Section3__SubSectionsAssignment_4_1 )
            {
             before(grammarAccess.getSection3Access().getSubSectionsAssignment_4_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:1: ( rule__Section3__SubSectionsAssignment_4_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3310:2: rule__Section3__SubSectionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section3__SubSectionsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6809);
            rule__Section3__SubSectionsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSection3Access().getSubSectionsAssignment_4_1()); 

            }


            }

        }
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3324:1: rule__Section4__Group__0 : rule__Section4__Group__0__Impl rule__Section4__Group__1 ;
    public final void rule__Section4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3328:1: ( rule__Section4__Group__0__Impl rule__Section4__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3329:2: rule__Section4__Group__0__Impl rule__Section4__Group__1
            {
            pushFollow(FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06843);
            rule__Section4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06846);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3336:1: rule__Section4__Group__0__Impl : ( ( rule__Section4__Alternatives_0 ) ) ;
    public final void rule__Section4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3340:1: ( ( ( rule__Section4__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3341:1: ( ( rule__Section4__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3341:1: ( ( rule__Section4__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3342:1: ( rule__Section4__Alternatives_0 )
            {
             before(grammarAccess.getSection4Access().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3343:1: ( rule__Section4__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3343:2: rule__Section4__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6873);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3353:1: rule__Section4__Group__1 : rule__Section4__Group__1__Impl rule__Section4__Group__2 ;
    public final void rule__Section4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3357:1: ( rule__Section4__Group__1__Impl rule__Section4__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3358:2: rule__Section4__Group__1__Impl rule__Section4__Group__2
            {
            pushFollow(FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16903);
            rule__Section4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16906);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3365:1: rule__Section4__Group__1__Impl : ( ( rule__Section4__TitleAssignment_1 ) ) ;
    public final void rule__Section4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3369:1: ( ( ( rule__Section4__TitleAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:1: ( ( rule__Section4__TitleAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3370:1: ( ( rule__Section4__TitleAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3371:1: ( rule__Section4__TitleAssignment_1 )
            {
             before(grammarAccess.getSection4Access().getTitleAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3372:1: ( rule__Section4__TitleAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3372:2: rule__Section4__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6933);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3382:1: rule__Section4__Group__2 : rule__Section4__Group__2__Impl rule__Section4__Group__3 ;
    public final void rule__Section4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3386:1: ( rule__Section4__Group__2__Impl rule__Section4__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3387:2: rule__Section4__Group__2__Impl rule__Section4__Group__3
            {
            pushFollow(FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26963);
            rule__Section4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26966);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3394:1: rule__Section4__Group__2__Impl : ( ']' ) ;
    public final void rule__Section4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3398:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3399:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3399:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3400:1: ']'
            {
             before(grammarAccess.getSection4Access().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Section4__Group__2__Impl6994); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3413:1: rule__Section4__Group__3 : rule__Section4__Group__3__Impl ;
    public final void rule__Section4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3417:1: ( rule__Section4__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3418:2: rule__Section4__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__37025);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3424:1: rule__Section4__Group__3__Impl : ( ( rule__Section4__Group_3__0 )* ) ;
    public final void rule__Section4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3428:1: ( ( ( rule__Section4__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:1: ( ( rule__Section4__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3429:1: ( ( rule__Section4__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3430:1: ( rule__Section4__Group_3__0 )*
            {
             before(grammarAccess.getSection4Access().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3431:1: ( rule__Section4__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_MULTI_NL) ) {
                    int LA35_2 = input.LA(2);

                    if ( ((LA35_2>=RULE_ID && LA35_2<=RULE_ANY_OTHER)||(LA35_2>=15 && LA35_2<=17)||(LA35_2>=25 && LA35_2<=29)||(LA35_2>=31 && LA35_2<=34)) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3431:2: rule__Section4__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl7052);
            	    rule__Section4__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3449:1: rule__Section4__Group_0_0__0 : rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 ;
    public final void rule__Section4__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3453:1: ( rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3454:2: rule__Section4__Group_0_0__0__Impl rule__Section4__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__07091);
            rule__Section4__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__07094);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3461:1: rule__Section4__Group_0_0__0__Impl : ( 'section4:' ) ;
    public final void rule__Section4__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3465:1: ( ( 'section4:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3466:1: ( 'section4:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3466:1: ( 'section4:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3467:1: 'section4:'
            {
             before(grammarAccess.getSection4Access().getSection4Keyword_0_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Section4__Group_0_0__0__Impl7122); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3480:1: rule__Section4__Group_0_0__1 : rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 ;
    public final void rule__Section4__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3484:1: ( rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3485:2: rule__Section4__Group_0_0__1__Impl rule__Section4__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__17153);
            rule__Section4__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__17156);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3492:1: rule__Section4__Group_0_0__1__Impl : ( ( rule__Section4__NameAssignment_0_0_1 ) ) ;
    public final void rule__Section4__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3496:1: ( ( ( rule__Section4__NameAssignment_0_0_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3497:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3497:1: ( ( rule__Section4__NameAssignment_0_0_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3498:1: ( rule__Section4__NameAssignment_0_0_1 )
            {
             before(grammarAccess.getSection4Access().getNameAssignment_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3499:1: ( rule__Section4__NameAssignment_0_0_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3499:2: rule__Section4__NameAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7183);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3509:1: rule__Section4__Group_0_0__2 : rule__Section4__Group_0_0__2__Impl ;
    public final void rule__Section4__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3513:1: ( rule__Section4__Group_0_0__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3514:2: rule__Section4__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27213);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3520:1: rule__Section4__Group_0_0__2__Impl : ( '[' ) ;
    public final void rule__Section4__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3524:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3525:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3525:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3526:1: '['
            {
             before(grammarAccess.getSection4Access().getLeftSquareBracketKeyword_0_0_2()); 
            match(input,20,FOLLOW_20_in_rule__Section4__Group_0_0__2__Impl7241); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3545:1: rule__Section4__Group_3__0 : rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 ;
    public final void rule__Section4__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3549:1: ( rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3550:2: rule__Section4__Group_3__0__Impl rule__Section4__Group_3__1
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07278);
            rule__Section4__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07281);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3557:1: rule__Section4__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Section4__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3561:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3562:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3562:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3563:1: RULE_MULTI_NL
            {
             before(grammarAccess.getSection4Access().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7308); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3574:1: rule__Section4__Group_3__1 : rule__Section4__Group_3__1__Impl ;
    public final void rule__Section4__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3578:1: ( rule__Section4__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3579:2: rule__Section4__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17337);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3585:1: rule__Section4__Group_3__1__Impl : ( ( rule__Section4__ContentsAssignment_3_1 ) ) ;
    public final void rule__Section4__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3589:1: ( ( ( rule__Section4__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3590:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3590:1: ( ( rule__Section4__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3591:1: ( rule__Section4__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getSection4Access().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3592:1: ( rule__Section4__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3592:2: rule__Section4__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7364);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3606:1: rule__TextOrMarkup__Group_0__0 : rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 ;
    public final void rule__TextOrMarkup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3610:1: ( rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3611:2: rule__TextOrMarkup__Group_0__0__Impl rule__TextOrMarkup__Group_0__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07398);
            rule__TextOrMarkup__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07401);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3618:1: rule__TextOrMarkup__Group_0__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3622:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3623:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3623:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3624:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3625:1: ( rule__TextOrMarkup__ContentsAssignment_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3625:2: rule__TextOrMarkup__ContentsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7428);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3635:1: rule__TextOrMarkup__Group_0__1 : rule__TextOrMarkup__Group_0__1__Impl ;
    public final void rule__TextOrMarkup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3639:1: ( rule__TextOrMarkup__Group_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3640:2: rule__TextOrMarkup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17458);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3646:1: rule__TextOrMarkup__Group_0__1__Impl : ( ( rule__TextOrMarkup__Group_0_1__0 )* ) ;
    public final void rule__TextOrMarkup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3650:1: ( ( ( rule__TextOrMarkup__Group_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3651:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3651:1: ( ( rule__TextOrMarkup__Group_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3652:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            {
             before(grammarAccess.getTextOrMarkupAccess().getGroup_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3653:1: ( rule__TextOrMarkup__Group_0_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17||(LA36_0>=25 && LA36_0<=29)||(LA36_0>=31 && LA36_0<=34)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3653:2: rule__TextOrMarkup__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7485);
            	    rule__TextOrMarkup__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3667:1: rule__TextOrMarkup__Group_0_1__0 : rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 ;
    public final void rule__TextOrMarkup__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3671:1: ( rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3672:2: rule__TextOrMarkup__Group_0_1__0__Impl rule__TextOrMarkup__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07520);
            rule__TextOrMarkup__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07523);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3679:1: rule__TextOrMarkup__Group_0_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3683:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3684:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3684:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3685:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3686:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3686:2: rule__TextOrMarkup__ContentsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7550);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3696:1: rule__TextOrMarkup__Group_0_1__1 : rule__TextOrMarkup__Group_0_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3700:1: ( rule__TextOrMarkup__Group_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3701:2: rule__TextOrMarkup__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17580);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3707:1: rule__TextOrMarkup__Group_0_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3711:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3712:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3712:1: ( ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3713:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3714:1: ( rule__TextOrMarkup__ContentsAssignment_0_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_ANY_OTHER)||(LA37_0>=15 && LA37_0<=16)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3714:2: rule__TextOrMarkup__ContentsAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7607);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3728:1: rule__TextOrMarkup__Group_1__0 : rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 ;
    public final void rule__TextOrMarkup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3732:1: ( rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3733:2: rule__TextOrMarkup__Group_1__0__Impl rule__TextOrMarkup__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07642);
            rule__TextOrMarkup__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07645);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3740:1: rule__TextOrMarkup__Group_1__0__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) ;
    public final void rule__TextOrMarkup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3744:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3745:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3745:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3746:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3747:1: ( rule__TextOrMarkup__ContentsAssignment_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3747:2: rule__TextOrMarkup__ContentsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7672);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3757:1: rule__TextOrMarkup__Group_1__1 : rule__TextOrMarkup__Group_1__1__Impl ;
    public final void rule__TextOrMarkup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3761:1: ( rule__TextOrMarkup__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3762:2: rule__TextOrMarkup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17702);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3768:1: rule__TextOrMarkup__Group_1__1__Impl : ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) ;
    public final void rule__TextOrMarkup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3772:1: ( ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3773:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3773:1: ( ( rule__TextOrMarkup__ContentsAssignment_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3774:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3775:1: ( rule__TextOrMarkup__ContentsAssignment_1_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_ANY_OTHER)||(LA38_0>=15 && LA38_0<=16)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3775:2: rule__TextOrMarkup__ContentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7729);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3789:1: rule__Emphasize__Group__0 : rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 ;
    public final void rule__Emphasize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3793:1: ( rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3794:2: rule__Emphasize__Group__0__Impl rule__Emphasize__Group__1
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07764);
            rule__Emphasize__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07767);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3801:1: rule__Emphasize__Group__0__Impl : ( 'emph[' ) ;
    public final void rule__Emphasize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3805:1: ( ( 'emph[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( 'emph[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3806:1: ( 'emph[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3807:1: 'emph['
            {
             before(grammarAccess.getEmphasizeAccess().getEmphKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Emphasize__Group__0__Impl7795); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3820:1: rule__Emphasize__Group__1 : rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 ;
    public final void rule__Emphasize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3824:1: ( rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3825:2: rule__Emphasize__Group__1__Impl rule__Emphasize__Group__2
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17826);
            rule__Emphasize__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17829);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3832:1: rule__Emphasize__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3836:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3837:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3838:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3839:1: ( RULE_MULTI_NL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_MULTI_NL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3839:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7857); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3849:1: rule__Emphasize__Group__2 : rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 ;
    public final void rule__Emphasize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3853:1: ( rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3854:2: rule__Emphasize__Group__2__Impl rule__Emphasize__Group__3
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27888);
            rule__Emphasize__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27891);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3861:1: rule__Emphasize__Group__2__Impl : ( ( rule__Emphasize__ContentsAssignment_2 ) ) ;
    public final void rule__Emphasize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3865:1: ( ( ( rule__Emphasize__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3866:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3866:1: ( ( rule__Emphasize__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3867:1: ( rule__Emphasize__ContentsAssignment_2 )
            {
             before(grammarAccess.getEmphasizeAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3868:1: ( rule__Emphasize__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3868:2: rule__Emphasize__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7918);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3878:1: rule__Emphasize__Group__3 : rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 ;
    public final void rule__Emphasize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3882:1: ( rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3883:2: rule__Emphasize__Group__3__Impl rule__Emphasize__Group__4
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37948);
            rule__Emphasize__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37951);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3890:1: rule__Emphasize__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Emphasize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3894:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3895:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3895:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3896:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getEmphasizeAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3897:1: ( RULE_MULTI_NL )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_MULTI_NL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3897:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7979); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3907:1: rule__Emphasize__Group__4 : rule__Emphasize__Group__4__Impl ;
    public final void rule__Emphasize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3911:1: ( rule__Emphasize__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3912:2: rule__Emphasize__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__48010);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3918:1: rule__Emphasize__Group__4__Impl : ( ']' ) ;
    public final void rule__Emphasize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3922:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3923:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3923:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3924:1: ']'
            {
             before(grammarAccess.getEmphasizeAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Emphasize__Group__4__Impl8038); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3947:1: rule__Anchor__Group__0 : rule__Anchor__Group__0__Impl rule__Anchor__Group__1 ;
    public final void rule__Anchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3951:1: ( rule__Anchor__Group__0__Impl rule__Anchor__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3952:2: rule__Anchor__Group__0__Impl rule__Anchor__Group__1
            {
            pushFollow(FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08079);
            rule__Anchor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08082);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3959:1: rule__Anchor__Group__0__Impl : ( 'a[' ) ;
    public final void rule__Anchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3963:1: ( ( 'a[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3964:1: ( 'a[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3964:1: ( 'a[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3965:1: 'a['
            {
             before(grammarAccess.getAnchorAccess().getAKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Anchor__Group__0__Impl8110); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3978:1: rule__Anchor__Group__1 : rule__Anchor__Group__1__Impl rule__Anchor__Group__2 ;
    public final void rule__Anchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3982:1: ( rule__Anchor__Group__1__Impl rule__Anchor__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3983:2: rule__Anchor__Group__1__Impl rule__Anchor__Group__2
            {
            pushFollow(FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18141);
            rule__Anchor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18144);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3990:1: rule__Anchor__Group__1__Impl : ( ( rule__Anchor__NameAssignment_1 ) ) ;
    public final void rule__Anchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3994:1: ( ( ( rule__Anchor__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3995:1: ( ( rule__Anchor__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3995:1: ( ( rule__Anchor__NameAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3996:1: ( rule__Anchor__NameAssignment_1 )
            {
             before(grammarAccess.getAnchorAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3997:1: ( rule__Anchor__NameAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:3997:2: rule__Anchor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8171);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4007:1: rule__Anchor__Group__2 : rule__Anchor__Group__2__Impl ;
    public final void rule__Anchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4011:1: ( rule__Anchor__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4012:2: rule__Anchor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28201);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4018:1: rule__Anchor__Group__2__Impl : ( ']' ) ;
    public final void rule__Anchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4022:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4023:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4023:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4024:1: ']'
            {
             before(grammarAccess.getAnchorAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Anchor__Group__2__Impl8229); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4043:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4047:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4048:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08266);
            rule__Ref__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08269);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4055:1: rule__Ref__Group__0__Impl : ( 'ref:' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4059:1: ( ( 'ref:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4060:1: ( 'ref:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4060:1: ( 'ref:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4061:1: 'ref:'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Ref__Group__0__Impl8297); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4074:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4078:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4079:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18328);
            rule__Ref__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18331);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4086:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__RefAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4090:1: ( ( ( rule__Ref__RefAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4091:1: ( ( rule__Ref__RefAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4091:1: ( ( rule__Ref__RefAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4092:1: ( rule__Ref__RefAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getRefAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:1: ( rule__Ref__RefAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4093:2: rule__Ref__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8358);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4103:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4107:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4108:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28388);
            rule__Ref__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28391);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4115:1: rule__Ref__Group__2__Impl : ( '[' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4119:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4120:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4121:1: '['
            {
             before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Ref__Group__2__Impl8419); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4134:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4138:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4139:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38450);
            rule__Ref__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38453);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4146:1: rule__Ref__Group__3__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4150:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4151:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4151:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4152:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4153:1: ( RULE_MULTI_NL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_MULTI_NL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4153:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8481); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4163:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4167:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4168:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48512);
            rule__Ref__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48515);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4175:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__ContentsAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4179:1: ( ( ( rule__Ref__ContentsAssignment_4 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4180:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4180:1: ( ( rule__Ref__ContentsAssignment_4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4181:1: ( rule__Ref__ContentsAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getContentsAssignment_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4182:1: ( rule__Ref__ContentsAssignment_4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4182:2: rule__Ref__ContentsAssignment_4
            {
            pushFollow(FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8542);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4192:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4196:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4197:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58572);
            rule__Ref__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58575);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4204:1: rule__Ref__Group__5__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4208:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4209:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4210:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getRefAccess().getMULTI_NLTerminalRuleCall_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4211:1: ( RULE_MULTI_NL )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_MULTI_NL) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4211:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8603); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4221:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4225:1: ( rule__Ref__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4226:2: rule__Ref__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68634);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4232:1: rule__Ref__Group__6__Impl : ( ']' ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4236:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4237:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4237:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4238:1: ']'
            {
             before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Ref__Group__6__Impl8662); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4265:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4269:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4270:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08707);
            rule__OrderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08710);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4277:1: rule__OrderedList__Group__0__Impl : ( 'ol[' ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4281:1: ( ( 'ol[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4282:1: ( 'ol[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4282:1: ( 'ol[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4283:1: 'ol['
            {
             before(grammarAccess.getOrderedListAccess().getOlKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__OrderedList__Group__0__Impl8738); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4296:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4300:1: ( rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4301:2: rule__OrderedList__Group__1__Impl rule__OrderedList__Group__2
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18769);
            rule__OrderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18772);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4308:1: rule__OrderedList__Group__1__Impl : ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4312:1: ( ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4313:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4313:1: ( ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4314:1: ( ( rule__OrderedList__Group_1__0 ) ) ( ( rule__OrderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4314:1: ( ( rule__OrderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4315:1: ( rule__OrderedList__Group_1__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4316:1: ( rule__OrderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4316:2: rule__OrderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8801);
            rule__OrderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4319:1: ( ( rule__OrderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4320:1: ( rule__OrderedList__Group_1__0 )*
            {
             before(grammarAccess.getOrderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4321:1: ( rule__OrderedList__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4321:2: rule__OrderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8813);
            	    rule__OrderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4332:1: rule__OrderedList__Group__2 : rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 ;
    public final void rule__OrderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4336:1: ( rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4337:2: rule__OrderedList__Group__2__Impl rule__OrderedList__Group__3
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28846);
            rule__OrderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28849);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4344:1: rule__OrderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4348:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4349:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4349:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4350:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4351:1: ( ruleANY_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_WS && LA44_0<=RULE_SINGLE_NL)||LA44_0==RULE_MULTI_NL) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4351:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8877);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4361:1: rule__OrderedList__Group__3 : rule__OrderedList__Group__3__Impl ;
    public final void rule__OrderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4365:1: ( rule__OrderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4366:2: rule__OrderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38908);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4372:1: rule__OrderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__OrderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4376:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4377:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4377:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4378:1: ']'
            {
             before(grammarAccess.getOrderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__OrderedList__Group__3__Impl8936); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4399:1: rule__OrderedList__Group_1__0 : rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 ;
    public final void rule__OrderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4403:1: ( rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4404:2: rule__OrderedList__Group_1__0__Impl rule__OrderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08975);
            rule__OrderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08978);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4411:1: rule__OrderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__OrderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4415:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4416:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4416:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4417:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getOrderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4418:1: ( ruleANY_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_WS && LA45_0<=RULE_SINGLE_NL)||LA45_0==RULE_MULTI_NL) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4418:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl9006);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4428:1: rule__OrderedList__Group_1__1 : rule__OrderedList__Group_1__1__Impl ;
    public final void rule__OrderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4432:1: ( rule__OrderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4433:2: rule__OrderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__19037);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4439:1: rule__OrderedList__Group_1__1__Impl : ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__OrderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4443:1: ( ( ( rule__OrderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4444:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4444:1: ( ( rule__OrderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4445:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:1: ( rule__OrderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4446:2: rule__OrderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl9064);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4460:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4464:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4465:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__09098);
            rule__UnorderedList__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__09101);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4472:1: rule__UnorderedList__Group__0__Impl : ( 'ul[' ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4476:1: ( ( 'ul[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4477:1: ( 'ul[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4477:1: ( 'ul[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4478:1: 'ul['
            {
             before(grammarAccess.getUnorderedListAccess().getUlKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__UnorderedList__Group__0__Impl9129); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4491:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4495:1: ( rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4496:2: rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19160);
            rule__UnorderedList__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19163);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4503:1: rule__UnorderedList__Group__1__Impl : ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4507:1: ( ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4508:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4508:1: ( ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4509:1: ( ( rule__UnorderedList__Group_1__0 ) ) ( ( rule__UnorderedList__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4509:1: ( ( rule__UnorderedList__Group_1__0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4510:1: ( rule__UnorderedList__Group_1__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4511:1: ( rule__UnorderedList__Group_1__0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4511:2: rule__UnorderedList__Group_1__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9192);
            rule__UnorderedList__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup_1()); 

            }

            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4514:1: ( ( rule__UnorderedList__Group_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4515:1: ( rule__UnorderedList__Group_1__0 )*
            {
             before(grammarAccess.getUnorderedListAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4516:1: ( rule__UnorderedList__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4516:2: rule__UnorderedList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9204);
            	    rule__UnorderedList__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4527:1: rule__UnorderedList__Group__2 : rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 ;
    public final void rule__UnorderedList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4531:1: ( rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4532:2: rule__UnorderedList__Group__2__Impl rule__UnorderedList__Group__3
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29237);
            rule__UnorderedList__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29240);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4539:1: rule__UnorderedList__Group__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4543:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4544:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4544:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4545:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4546:1: ( ruleANY_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_WS && LA47_0<=RULE_SINGLE_NL)||LA47_0==RULE_MULTI_NL) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4546:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9268);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4556:1: rule__UnorderedList__Group__3 : rule__UnorderedList__Group__3__Impl ;
    public final void rule__UnorderedList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4560:1: ( rule__UnorderedList__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4561:2: rule__UnorderedList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39299);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4567:1: rule__UnorderedList__Group__3__Impl : ( ']' ) ;
    public final void rule__UnorderedList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4571:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4572:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4572:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4573:1: ']'
            {
             before(grammarAccess.getUnorderedListAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__UnorderedList__Group__3__Impl9327); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4594:1: rule__UnorderedList__Group_1__0 : rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 ;
    public final void rule__UnorderedList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4598:1: ( rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4599:2: rule__UnorderedList__Group_1__0__Impl rule__UnorderedList__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09366);
            rule__UnorderedList__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09369);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4606:1: rule__UnorderedList__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__UnorderedList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4610:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4611:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4612:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getUnorderedListAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4613:1: ( ruleANY_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_WS && LA48_0<=RULE_SINGLE_NL)||LA48_0==RULE_MULTI_NL) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4613:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9397);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4623:1: rule__UnorderedList__Group_1__1 : rule__UnorderedList__Group_1__1__Impl ;
    public final void rule__UnorderedList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4627:1: ( rule__UnorderedList__Group_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4628:2: rule__UnorderedList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19428);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4634:1: rule__UnorderedList__Group_1__1__Impl : ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) ;
    public final void rule__UnorderedList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4638:1: ( ( ( rule__UnorderedList__ItemsAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4639:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4639:1: ( ( rule__UnorderedList__ItemsAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4640:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4641:1: ( rule__UnorderedList__ItemsAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4641:2: rule__UnorderedList__ItemsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9455);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4655:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4659:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4660:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09489);
            rule__Item__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09492);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4667:1: rule__Item__Group__0__Impl : ( 'item[' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4671:1: ( ( 'item[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( 'item[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4672:1: ( 'item[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4673:1: 'item['
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Item__Group__0__Impl9520); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4686:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4690:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4691:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19551);
            rule__Item__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19554);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4698:1: rule__Item__Group__1__Impl : ( ( RULE_MULTI_NL )? ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4702:1: ( ( ( RULE_MULTI_NL )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:1: ( ( RULE_MULTI_NL )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4703:1: ( ( RULE_MULTI_NL )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4704:1: ( RULE_MULTI_NL )?
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4705:1: ( RULE_MULTI_NL )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_MULTI_NL) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4705:3: RULE_MULTI_NL
                    {
                    match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9582); 

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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4715:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4719:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4720:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29613);
            rule__Item__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29616);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4727:1: rule__Item__Group__2__Impl : ( ( rule__Item__ContentsAssignment_2 ) ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4731:1: ( ( ( rule__Item__ContentsAssignment_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4732:1: ( ( rule__Item__ContentsAssignment_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4732:1: ( ( rule__Item__ContentsAssignment_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4733:1: ( rule__Item__ContentsAssignment_2 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4734:1: ( rule__Item__ContentsAssignment_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4734:2: rule__Item__ContentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9643);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4744:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4748:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4749:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39673);
            rule__Item__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39676);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4756:1: rule__Item__Group__3__Impl : ( ( rule__Item__Group_3__0 )* ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4760:1: ( ( ( rule__Item__Group_3__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4761:1: ( ( rule__Item__Group_3__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4761:1: ( ( rule__Item__Group_3__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4762:1: ( rule__Item__Group_3__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4763:1: ( rule__Item__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_MULTI_NL) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4763:2: rule__Item__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9703);
            	    rule__Item__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4773:1: rule__Item__Group__4 : rule__Item__Group__4__Impl ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4777:1: ( rule__Item__Group__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4778:2: rule__Item__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49734);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4784:1: rule__Item__Group__4__Impl : ( ']' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4788:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4789:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4789:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4790:1: ']'
            {
             before(grammarAccess.getItemAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Item__Group__4__Impl9762); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4813:1: rule__Item__Group_3__0 : rule__Item__Group_3__0__Impl rule__Item__Group_3__1 ;
    public final void rule__Item__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4817:1: ( rule__Item__Group_3__0__Impl rule__Item__Group_3__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4818:2: rule__Item__Group_3__0__Impl rule__Item__Group_3__1
            {
            pushFollow(FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09803);
            rule__Item__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09806);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4825:1: rule__Item__Group_3__0__Impl : ( RULE_MULTI_NL ) ;
    public final void rule__Item__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4829:1: ( ( RULE_MULTI_NL ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4830:1: ( RULE_MULTI_NL )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4830:1: ( RULE_MULTI_NL )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4831:1: RULE_MULTI_NL
            {
             before(grammarAccess.getItemAccess().getMULTI_NLTerminalRuleCall_3_0()); 
            match(input,RULE_MULTI_NL,FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9833); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4842:1: rule__Item__Group_3__1 : rule__Item__Group_3__1__Impl ;
    public final void rule__Item__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4846:1: ( rule__Item__Group_3__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4847:2: rule__Item__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19862);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4853:1: rule__Item__Group_3__1__Impl : ( ( rule__Item__ContentsAssignment_3_1 ) ) ;
    public final void rule__Item__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4857:1: ( ( ( rule__Item__ContentsAssignment_3_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4858:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4858:1: ( ( rule__Item__ContentsAssignment_3_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4859:1: ( rule__Item__ContentsAssignment_3_1 )
            {
             before(grammarAccess.getItemAccess().getContentsAssignment_3_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4860:1: ( rule__Item__ContentsAssignment_3_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4860:2: rule__Item__ContentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9889);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4874:1: rule__CodeRef__Group__0 : rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 ;
    public final void rule__CodeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4878:1: ( rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4879:2: rule__CodeRef__Group__0__Impl rule__CodeRef__Group__1
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09923);
            rule__CodeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09926);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4886:1: rule__CodeRef__Group__0__Impl : ( 'codeRef[' ) ;
    public final void rule__CodeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4890:1: ( ( 'codeRef[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4891:1: ( 'codeRef[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4891:1: ( 'codeRef[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4892:1: 'codeRef['
            {
             before(grammarAccess.getCodeRefAccess().getCodeRefKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__CodeRef__Group__0__Impl9954); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4905:1: rule__CodeRef__Group__1 : rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 ;
    public final void rule__CodeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4909:1: ( rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4910:2: rule__CodeRef__Group__1__Impl rule__CodeRef__Group__2
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19985);
            rule__CodeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19988);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4917:1: rule__CodeRef__Group__1__Impl : ( ( rule__CodeRef__ElementAssignment_1 ) ) ;
    public final void rule__CodeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4921:1: ( ( ( rule__CodeRef__ElementAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4922:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4922:1: ( ( rule__CodeRef__ElementAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4923:1: ( rule__CodeRef__ElementAssignment_1 )
            {
             before(grammarAccess.getCodeRefAccess().getElementAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4924:1: ( rule__CodeRef__ElementAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4924:2: rule__CodeRef__ElementAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl10015);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4934:1: rule__CodeRef__Group__2 : rule__CodeRef__Group__2__Impl ;
    public final void rule__CodeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4938:1: ( rule__CodeRef__Group__2__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4939:2: rule__CodeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__210045);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4945:1: rule__CodeRef__Group__2__Impl : ( ']' ) ;
    public final void rule__CodeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4949:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4950:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4950:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4951:1: ']'
            {
             before(grammarAccess.getCodeRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__CodeRef__Group__2__Impl10073); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4970:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4974:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4975:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__010110);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__010113);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4982:1: rule__Link__Group__0__Impl : ( 'link[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4986:1: ( ( 'link[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4987:1: ( 'link[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4987:1: ( 'link[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:4988:1: 'link['
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Link__Group__0__Impl10141); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5001:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5005:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5006:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110172);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110175);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5013:1: rule__Link__Group__1__Impl : ( ( rule__Link__UrlAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5017:1: ( ( ( rule__Link__UrlAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5018:1: ( ( rule__Link__UrlAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5018:1: ( ( rule__Link__UrlAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5019:1: ( rule__Link__UrlAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5020:1: ( rule__Link__UrlAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5020:2: rule__Link__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10202);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5030:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5034:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5035:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210232);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210235);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5042:1: rule__Link__Group__2__Impl : ( ']' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5046:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5047:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5047:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5048:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Link__Group__2__Impl10263); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5061:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5065:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5066:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310294);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310297);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5073:1: rule__Link__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5077:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5078:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5078:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5079:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getLinkAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:1: ( ruleANY_WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_WS && LA51_0<=RULE_SINGLE_NL)||LA51_0==RULE_MULTI_NL) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5080:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10325);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5090:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5094:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5095:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410356);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410359);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5102:1: rule__Link__Group__4__Impl : ( '[' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5106:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5107:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5108:1: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Link__Group__4__Impl10387); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5121:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5125:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5126:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510418);
            rule__Link__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510421);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5133:1: rule__Link__Group__5__Impl : ( ( rule__Link__TextAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5137:1: ( ( ( rule__Link__TextAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5138:1: ( ( rule__Link__TextAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5138:1: ( ( rule__Link__TextAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5139:1: ( rule__Link__TextAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5140:1: ( rule__Link__TextAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5140:2: rule__Link__TextAssignment_5
            {
            pushFollow(FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10448);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5150:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5154:1: ( rule__Link__Group__6__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5155:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610478);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5161:1: rule__Link__Group__6__Impl : ( ']' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5165:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5166:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5166:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5167:1: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Link__Group__6__Impl10506); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5194:1: rule__ImageRef__Group__0 : rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 ;
    public final void rule__ImageRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5198:1: ( rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5199:2: rule__ImageRef__Group__0__Impl rule__ImageRef__Group__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010551);
            rule__ImageRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010554);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5206:1: rule__ImageRef__Group__0__Impl : ( ( rule__ImageRef__Alternatives_0 ) ) ;
    public final void rule__ImageRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5210:1: ( ( ( rule__ImageRef__Alternatives_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5211:1: ( ( rule__ImageRef__Alternatives_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5211:1: ( ( rule__ImageRef__Alternatives_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5212:1: ( rule__ImageRef__Alternatives_0 )
            {
             before(grammarAccess.getImageRefAccess().getAlternatives_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5213:1: ( rule__ImageRef__Alternatives_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5213:2: rule__ImageRef__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10581);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5223:1: rule__ImageRef__Group__1 : rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 ;
    public final void rule__ImageRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5227:1: ( rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5228:2: rule__ImageRef__Group__1__Impl rule__ImageRef__Group__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110611);
            rule__ImageRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110614);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5235:1: rule__ImageRef__Group__1__Impl : ( ( rule__ImageRef__PathAssignment_1 ) ) ;
    public final void rule__ImageRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5239:1: ( ( ( rule__ImageRef__PathAssignment_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5240:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5240:1: ( ( rule__ImageRef__PathAssignment_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5241:1: ( rule__ImageRef__PathAssignment_1 )
            {
             before(grammarAccess.getImageRefAccess().getPathAssignment_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:1: ( rule__ImageRef__PathAssignment_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5242:2: rule__ImageRef__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10641);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5252:1: rule__ImageRef__Group__2 : rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 ;
    public final void rule__ImageRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5256:1: ( rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5257:2: rule__ImageRef__Group__2__Impl rule__ImageRef__Group__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210671);
            rule__ImageRef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210674);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5264:1: rule__ImageRef__Group__2__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5268:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5269:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5269:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5270:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__2__Impl10702); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5283:1: rule__ImageRef__Group__3 : rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 ;
    public final void rule__ImageRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5287:1: ( rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5288:2: rule__ImageRef__Group__3__Impl rule__ImageRef__Group__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310733);
            rule__ImageRef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310736);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5295:1: rule__ImageRef__Group__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5299:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5300:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5300:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5301:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:1: ( ruleANY_WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_SINGLE_NL)||LA52_0==RULE_MULTI_NL) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5302:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10764);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5312:1: rule__ImageRef__Group__4 : rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 ;
    public final void rule__ImageRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5316:1: ( rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5317:2: rule__ImageRef__Group__4__Impl rule__ImageRef__Group__5
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410795);
            rule__ImageRef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410798);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5324:1: rule__ImageRef__Group__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5328:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5329:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5329:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5330:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__4__Impl10826); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5343:1: rule__ImageRef__Group__5 : rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 ;
    public final void rule__ImageRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5347:1: ( rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5348:2: rule__ImageRef__Group__5__Impl rule__ImageRef__Group__6
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510857);
            rule__ImageRef__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510860);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5355:1: rule__ImageRef__Group__5__Impl : ( ( rule__ImageRef__ClazzAssignment_5 ) ) ;
    public final void rule__ImageRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5359:1: ( ( ( rule__ImageRef__ClazzAssignment_5 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5360:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5360:1: ( ( rule__ImageRef__ClazzAssignment_5 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5361:1: ( rule__ImageRef__ClazzAssignment_5 )
            {
             before(grammarAccess.getImageRefAccess().getClazzAssignment_5()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:1: ( rule__ImageRef__ClazzAssignment_5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5362:2: rule__ImageRef__ClazzAssignment_5
            {
            pushFollow(FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10887);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5372:1: rule__ImageRef__Group__6 : rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 ;
    public final void rule__ImageRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5376:1: ( rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5377:2: rule__ImageRef__Group__6__Impl rule__ImageRef__Group__7
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610917);
            rule__ImageRef__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610920);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5384:1: rule__ImageRef__Group__6__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5388:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5389:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5389:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5390:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__6__Impl10948); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5403:1: rule__ImageRef__Group__7 : rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 ;
    public final void rule__ImageRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5407:1: ( rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5408:2: rule__ImageRef__Group__7__Impl rule__ImageRef__Group__8
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710979);
            rule__ImageRef__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710982);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5415:1: rule__ImageRef__Group__7__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5419:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5420:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5420:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5421:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_7()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5422:1: ( ruleANY_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_WS && LA53_0<=RULE_SINGLE_NL)||LA53_0==RULE_MULTI_NL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5422:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl11010);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5432:1: rule__ImageRef__Group__8 : rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 ;
    public final void rule__ImageRef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5436:1: ( rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5437:2: rule__ImageRef__Group__8__Impl rule__ImageRef__Group__9
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__811041);
            rule__ImageRef__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__811044);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5444:1: rule__ImageRef__Group__8__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5448:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5449:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5449:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5450:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__8__Impl11072); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5463:1: rule__ImageRef__Group__9 : rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 ;
    public final void rule__ImageRef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5467:1: ( rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5468:2: rule__ImageRef__Group__9__Impl rule__ImageRef__Group__10
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__911103);
            rule__ImageRef__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__911106);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5475:1: rule__ImageRef__Group__9__Impl : ( ( rule__ImageRef__StyleAssignment_9 ) ) ;
    public final void rule__ImageRef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5479:1: ( ( ( rule__ImageRef__StyleAssignment_9 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5480:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5480:1: ( ( rule__ImageRef__StyleAssignment_9 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5481:1: ( rule__ImageRef__StyleAssignment_9 )
            {
             before(grammarAccess.getImageRefAccess().getStyleAssignment_9()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5482:1: ( rule__ImageRef__StyleAssignment_9 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5482:2: rule__ImageRef__StyleAssignment_9
            {
            pushFollow(FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl11133);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5492:1: rule__ImageRef__Group__10 : rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 ;
    public final void rule__ImageRef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5496:1: ( rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5497:2: rule__ImageRef__Group__10__Impl rule__ImageRef__Group__11
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011163);
            rule__ImageRef__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011166);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5504:1: rule__ImageRef__Group__10__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5508:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5509:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5509:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5510:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__10__Impl11194); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5523:1: rule__ImageRef__Group__11 : rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 ;
    public final void rule__ImageRef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5527:1: ( rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5528:2: rule__ImageRef__Group__11__Impl rule__ImageRef__Group__12
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111225);
            rule__ImageRef__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111228);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5535:1: rule__ImageRef__Group__11__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5539:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5540:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5540:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5541:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_11()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5542:1: ( ruleANY_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_SINGLE_NL)||LA54_0==RULE_MULTI_NL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5542:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11256);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5552:1: rule__ImageRef__Group__12 : rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 ;
    public final void rule__ImageRef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5556:1: ( rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5557:2: rule__ImageRef__Group__12__Impl rule__ImageRef__Group__13
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211287);
            rule__ImageRef__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211290);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5564:1: rule__ImageRef__Group__12__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5568:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5569:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5569:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5570:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_12()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group__12__Impl11318); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5583:1: rule__ImageRef__Group__13 : rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 ;
    public final void rule__ImageRef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5587:1: ( rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5588:2: rule__ImageRef__Group__13__Impl rule__ImageRef__Group__14
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311349);
            rule__ImageRef__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311352);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5595:1: rule__ImageRef__Group__13__Impl : ( ( rule__ImageRef__CaptionAssignment_13 ) ) ;
    public final void rule__ImageRef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5599:1: ( ( ( rule__ImageRef__CaptionAssignment_13 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5600:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5600:1: ( ( rule__ImageRef__CaptionAssignment_13 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5601:1: ( rule__ImageRef__CaptionAssignment_13 )
            {
             before(grammarAccess.getImageRefAccess().getCaptionAssignment_13()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5602:1: ( rule__ImageRef__CaptionAssignment_13 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5602:2: rule__ImageRef__CaptionAssignment_13
            {
            pushFollow(FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11379);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5612:1: rule__ImageRef__Group__14 : rule__ImageRef__Group__14__Impl ;
    public final void rule__ImageRef__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5616:1: ( rule__ImageRef__Group__14__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5617:2: rule__ImageRef__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411409);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5623:1: rule__ImageRef__Group__14__Impl : ( ']' ) ;
    public final void rule__ImageRef__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5627:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5628:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5628:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5629:1: ']'
            {
             before(grammarAccess.getImageRefAccess().getRightSquareBracketKeyword_14()); 
            match(input,18,FOLLOW_18_in_rule__ImageRef__Group__14__Impl11437); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5672:1: rule__ImageRef__Group_0_0__0 : rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 ;
    public final void rule__ImageRef__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5676:1: ( rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5677:2: rule__ImageRef__Group_0_0__0__Impl rule__ImageRef__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011498);
            rule__ImageRef__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011501);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5684:1: rule__ImageRef__Group_0_0__0__Impl : ( 'img:' ) ;
    public final void rule__ImageRef__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5688:1: ( ( 'img:' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5689:1: ( 'img:' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5689:1: ( 'img:' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5690:1: 'img:'
            {
             before(grammarAccess.getImageRefAccess().getImgKeyword_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__ImageRef__Group_0_0__0__Impl11529); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5703:1: rule__ImageRef__Group_0_0__1 : rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 ;
    public final void rule__ImageRef__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5707:1: ( rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5708:2: rule__ImageRef__Group_0_0__1__Impl rule__ImageRef__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111560);
            rule__ImageRef__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111563);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5715:1: rule__ImageRef__Group_0_0__1__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5719:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5720:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5720:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5721:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5722:1: ( ruleANY_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_WS && LA55_0<=RULE_SINGLE_NL)||LA55_0==RULE_MULTI_NL) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5722:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11591);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5732:1: rule__ImageRef__Group_0_0__2 : rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 ;
    public final void rule__ImageRef__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5736:1: ( rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5737:2: rule__ImageRef__Group_0_0__2__Impl rule__ImageRef__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211622);
            rule__ImageRef__Group_0_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211625);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5744:1: rule__ImageRef__Group_0_0__2__Impl : ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) ;
    public final void rule__ImageRef__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5748:1: ( ( ( rule__ImageRef__NameAssignment_0_0_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5749:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5749:1: ( ( rule__ImageRef__NameAssignment_0_0_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5750:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            {
             before(grammarAccess.getImageRefAccess().getNameAssignment_0_0_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5751:1: ( rule__ImageRef__NameAssignment_0_0_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5751:2: rule__ImageRef__NameAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11652);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5761:1: rule__ImageRef__Group_0_0__3 : rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 ;
    public final void rule__ImageRef__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5765:1: ( rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5766:2: rule__ImageRef__Group_0_0__3__Impl rule__ImageRef__Group_0_0__4
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311682);
            rule__ImageRef__Group_0_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311685);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5773:1: rule__ImageRef__Group_0_0__3__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__ImageRef__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5777:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5778:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5778:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5779:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getImageRefAccess().getANY_WSParserRuleCall_0_0_3()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5780:1: ( ruleANY_WS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_WS && LA56_0<=RULE_SINGLE_NL)||LA56_0==RULE_MULTI_NL) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5780:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11713);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5790:1: rule__ImageRef__Group_0_0__4 : rule__ImageRef__Group_0_0__4__Impl ;
    public final void rule__ImageRef__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5794:1: ( rule__ImageRef__Group_0_0__4__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5795:2: rule__ImageRef__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411744);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5801:1: rule__ImageRef__Group_0_0__4__Impl : ( '[' ) ;
    public final void rule__ImageRef__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5805:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5806:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5806:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5807:1: '['
            {
             before(grammarAccess.getImageRefAccess().getLeftSquareBracketKeyword_0_0_4()); 
            match(input,20,FOLLOW_20_in_rule__ImageRef__Group_0_0__4__Impl11772); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5830:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5834:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5835:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011813);
            rule__CodeBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011816);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5842:1: rule__CodeBlock__Group__0__Impl : ( 'code[' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5846:1: ( ( 'code[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5847:1: ( 'code[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5847:1: ( 'code[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5848:1: 'code['
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__CodeBlock__Group__0__Impl11844); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5861:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5865:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5866:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111875);
            rule__CodeBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111878);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5873:1: rule__CodeBlock__Group__1__Impl : ( ( rule__CodeBlock__Group_1__0 )? ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5877:1: ( ( ( rule__CodeBlock__Group_1__0 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5878:1: ( ( rule__CodeBlock__Group_1__0 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5878:1: ( ( rule__CodeBlock__Group_1__0 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5879:1: ( rule__CodeBlock__Group_1__0 )?
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5880:1: ( rule__CodeBlock__Group_1__0 )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5880:2: rule__CodeBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11905);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5890:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5894:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5895:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211936);
            rule__CodeBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211939);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5902:1: rule__CodeBlock__Group__2__Impl : ( ( rule__CodeBlock__Alternatives_2 ) ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5906:1: ( ( ( rule__CodeBlock__Alternatives_2 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5907:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5907:1: ( ( rule__CodeBlock__Alternatives_2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5908:1: ( rule__CodeBlock__Alternatives_2 )
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives_2()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5909:1: ( rule__CodeBlock__Alternatives_2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5909:2: rule__CodeBlock__Alternatives_2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11966);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5919:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5923:1: ( rule__CodeBlock__Group__3__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5924:2: rule__CodeBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311996);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5930:1: rule__CodeBlock__Group__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5934:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5935:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5935:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5936:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__CodeBlock__Group__3__Impl12024); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5957:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5961:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5962:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__012063);
            rule__CodeBlock__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__012066);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5969:1: rule__CodeBlock__Group_1__0__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5973:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5974:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5974:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5975:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5976:1: ( ruleANY_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_SINGLE_NL)||LA58_0==RULE_MULTI_NL) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5976:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl12094);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5986:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5990:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5991:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__112125);
            rule__CodeBlock__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__112128);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:5998:1: rule__CodeBlock__Group_1__1__Impl : ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6002:1: ( ( ( rule__CodeBlock__LanguageAssignment_1_1 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6003:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6003:1: ( ( rule__CodeBlock__LanguageAssignment_1_1 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6004:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6005:1: ( rule__CodeBlock__LanguageAssignment_1_1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6005:2: rule__CodeBlock__LanguageAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl12155);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6015:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6019:1: ( rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6020:2: rule__CodeBlock__Group_1__2__Impl rule__CodeBlock__Group_1__3
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212185);
            rule__CodeBlock__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212188);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6027:1: rule__CodeBlock__Group_1__2__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6031:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6032:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6032:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6033:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_2()); 
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
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12216);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6044:1: rule__CodeBlock__Group_1__3 : rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 ;
    public final void rule__CodeBlock__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6048:1: ( rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6049:2: rule__CodeBlock__Group_1__3__Impl rule__CodeBlock__Group_1__4
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312247);
            rule__CodeBlock__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312250);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6056:1: rule__CodeBlock__Group_1__3__Impl : ( ']' ) ;
    public final void rule__CodeBlock__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6060:1: ( ( ']' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6061:1: ( ']' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6061:1: ( ']' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6062:1: ']'
            {
             before(grammarAccess.getCodeBlockAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,18,FOLLOW_18_in_rule__CodeBlock__Group_1__3__Impl12278); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6075:1: rule__CodeBlock__Group_1__4 : rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 ;
    public final void rule__CodeBlock__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6079:1: ( rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6080:2: rule__CodeBlock__Group_1__4__Impl rule__CodeBlock__Group_1__5
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412309);
            rule__CodeBlock__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412312);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6087:1: rule__CodeBlock__Group_1__4__Impl : ( ( ruleANY_WS )* ) ;
    public final void rule__CodeBlock__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6091:1: ( ( ( ruleANY_WS )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6092:1: ( ( ruleANY_WS )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6092:1: ( ( ruleANY_WS )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6093:1: ( ruleANY_WS )*
            {
             before(grammarAccess.getCodeBlockAccess().getANY_WSParserRuleCall_1_4()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6094:1: ( ruleANY_WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_WS && LA60_0<=RULE_SINGLE_NL)||LA60_0==RULE_MULTI_NL) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6094:3: ruleANY_WS
            	    {
            	    pushFollow(FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12340);
            	    ruleANY_WS();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6104:1: rule__CodeBlock__Group_1__5 : rule__CodeBlock__Group_1__5__Impl ;
    public final void rule__CodeBlock__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6108:1: ( rule__CodeBlock__Group_1__5__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6109:2: rule__CodeBlock__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512371);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6115:1: rule__CodeBlock__Group_1__5__Impl : ( '[' ) ;
    public final void rule__CodeBlock__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6119:1: ( ( '[' ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6120:1: ( '[' )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6120:1: ( '[' )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6121:1: '['
            {
             before(grammarAccess.getCodeBlockAccess().getLeftSquareBracketKeyword_1_5()); 
            match(input,20,FOLLOW_20_in_rule__CodeBlock__Group_1__5__Impl12399); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6146:1: rule__CodeBlock__Group_2_0__0 : rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 ;
    public final void rule__CodeBlock__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6150:1: ( rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6151:2: rule__CodeBlock__Group_2_0__0__Impl rule__CodeBlock__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012442);
            rule__CodeBlock__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012445);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6158:1: rule__CodeBlock__Group_2_0__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6162:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6163:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6163:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6164:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6165:1: ( rule__CodeBlock__ContentsAssignment_2_0_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6165:2: rule__CodeBlock__ContentsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12472);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6175:1: rule__CodeBlock__Group_2_0__1 : rule__CodeBlock__Group_2_0__1__Impl ;
    public final void rule__CodeBlock__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6179:1: ( rule__CodeBlock__Group_2_0__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6180:2: rule__CodeBlock__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112502);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6186:1: rule__CodeBlock__Group_2_0__1__Impl : ( ( rule__CodeBlock__Group_2_0_1__0 )* ) ;
    public final void rule__CodeBlock__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6190:1: ( ( ( rule__CodeBlock__Group_2_0_1__0 )* ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6191:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6191:1: ( ( rule__CodeBlock__Group_2_0_1__0 )* )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6192:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            {
             before(grammarAccess.getCodeBlockAccess().getGroup_2_0_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6193:1: ( rule__CodeBlock__Group_2_0_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=25 && LA61_0<=27)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6193:2: rule__CodeBlock__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12529);
            	    rule__CodeBlock__Group_2_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6207:1: rule__CodeBlock__Group_2_0_1__0 : rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 ;
    public final void rule__CodeBlock__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6211:1: ( rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6212:2: rule__CodeBlock__Group_2_0_1__0__Impl rule__CodeBlock__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012564);
            rule__CodeBlock__Group_2_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012567);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6219:1: rule__CodeBlock__Group_2_0_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6223:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6224:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6224:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6225:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6226:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6226:2: rule__CodeBlock__ContentsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12594);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6236:1: rule__CodeBlock__Group_2_0_1__1 : rule__CodeBlock__Group_2_0_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6240:1: ( rule__CodeBlock__Group_2_0_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6241:2: rule__CodeBlock__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112624);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6247:1: rule__CodeBlock__Group_2_0_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6251:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6252:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6252:1: ( ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6253:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_0_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6254:1: ( rule__CodeBlock__ContentsAssignment_2_0_1_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_MULTI_NL)||(LA62_0>=15 && LA62_0<=16)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6254:2: rule__CodeBlock__ContentsAssignment_2_0_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12651);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6268:1: rule__CodeBlock__Group_2_1__0 : rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 ;
    public final void rule__CodeBlock__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6272:1: ( rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6273:2: rule__CodeBlock__Group_2_1__0__Impl rule__CodeBlock__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012686);
            rule__CodeBlock__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012689);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6280:1: rule__CodeBlock__Group_2_1__0__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) ;
    public final void rule__CodeBlock__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6284:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6285:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6285:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_0 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6286:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6287:1: ( rule__CodeBlock__ContentsAssignment_2_1_0 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6287:2: rule__CodeBlock__ContentsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12716);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6297:1: rule__CodeBlock__Group_2_1__1 : rule__CodeBlock__Group_2_1__1__Impl ;
    public final void rule__CodeBlock__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6301:1: ( rule__CodeBlock__Group_2_1__1__Impl )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6302:2: rule__CodeBlock__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112746);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6308:1: rule__CodeBlock__Group_2_1__1__Impl : ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) ;
    public final void rule__CodeBlock__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6312:1: ( ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6313:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6313:1: ( ( rule__CodeBlock__ContentsAssignment_2_1_1 )? )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6314:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            {
             before(grammarAccess.getCodeBlockAccess().getContentsAssignment_2_1_1()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6315:1: ( rule__CodeBlock__ContentsAssignment_2_1_1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_MULTI_NL)||(LA63_0>=15 && LA63_0<=16)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6315:2: rule__CodeBlock__ContentsAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12773);
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


    // $ANTLR start rule__Document__SectionsAssignment_3_0_0_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6330:1: rule__Document__SectionsAssignment_3_0_0_0 : ( ruleChapter ) ;
    public final void rule__Document__SectionsAssignment_3_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6334:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6335:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6335:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6336:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getSectionsChapterParserRuleCall_3_0_0_0_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__SectionsAssignment_3_0_0_012813);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsChapterParserRuleCall_3_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_0_0


    // $ANTLR start rule__Document__SectionsAssignment_3_0_0_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6345:1: rule__Document__SectionsAssignment_3_0_0_1_1 : ( ruleChapter ) ;
    public final void rule__Document__SectionsAssignment_3_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6349:1: ( ( ruleChapter ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6350:1: ( ruleChapter )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6350:1: ( ruleChapter )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6351:1: ruleChapter
            {
             before(grammarAccess.getDocumentAccess().getSectionsChapterParserRuleCall_3_0_0_1_1_0()); 
            pushFollow(FOLLOW_ruleChapter_in_rule__Document__SectionsAssignment_3_0_0_1_112844);
            ruleChapter();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsChapterParserRuleCall_3_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_0_1_1


    // $ANTLR start rule__Document__SectionsAssignment_3_0_1_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6360:1: rule__Document__SectionsAssignment_3_0_1_0 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6364:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6365:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6366:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_0_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012875);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6375:1: rule__Document__SectionsAssignment_3_0_1_1_1 : ( ruleSection ) ;
    public final void rule__Document__SectionsAssignment_3_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6379:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6380:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6380:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6381:1: ruleSection
            {
             before(grammarAccess.getDocumentAccess().getSectionsSectionParserRuleCall_3_0_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112906);
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


    // $ANTLR start rule__Document__SectionsAssignment_3_0_2_0
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6390:1: rule__Document__SectionsAssignment_3_0_2_0 : ( ruleSection2 ) ;
    public final void rule__Document__SectionsAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6394:1: ( ( ruleSection2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( ruleSection2 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6395:1: ( ruleSection2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6396:1: ruleSection2
            {
             before(grammarAccess.getDocumentAccess().getSectionsSection2ParserRuleCall_3_0_2_0_0()); 
            pushFollow(FOLLOW_ruleSection2_in_rule__Document__SectionsAssignment_3_0_2_012937);
            ruleSection2();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSection2ParserRuleCall_3_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_2_0


    // $ANTLR start rule__Document__SectionsAssignment_3_0_2_1_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6405:1: rule__Document__SectionsAssignment_3_0_2_1_1 : ( ruleSection2 ) ;
    public final void rule__Document__SectionsAssignment_3_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6409:1: ( ( ruleSection2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:1: ( ruleSection2 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6410:1: ( ruleSection2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6411:1: ruleSection2
            {
             before(grammarAccess.getDocumentAccess().getSectionsSection2ParserRuleCall_3_0_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSection2_in_rule__Document__SectionsAssignment_3_0_2_1_112968);
            ruleSection2();
            _fsp--;

             after(grammarAccess.getDocumentAccess().getSectionsSection2ParserRuleCall_3_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Document__SectionsAssignment_3_0_2_1_1


    // $ANTLR start rule__Chapter__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6420:1: rule__Chapter__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6424:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6425:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6426:1: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112999); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6435:1: rule__Chapter__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6439:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6440:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6440:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6441:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_113030);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6450:1: rule__Chapter__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Chapter__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6454:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6455:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6455:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6456:1: ruleTextOrMarkup
            {
             before(grammarAccess.getChapterAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_113061);
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


    // $ANTLR start rule__Chapter__SubSectionsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6465:1: rule__Chapter__SubSectionsAssignment_4_1 : ( ruleSection ) ;
    public final void rule__Chapter__SubSectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6469:1: ( ( ruleSection ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:1: ( ruleSection )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6470:1: ( ruleSection )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6471:1: ruleSection
            {
             before(grammarAccess.getChapterAccess().getSubSectionsSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Chapter__SubSectionsAssignment_4_113092);
            ruleSection();
            _fsp--;

             after(grammarAccess.getChapterAccess().getSubSectionsSectionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Chapter__SubSectionsAssignment_4_1


    // $ANTLR start rule__Section__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6480:1: rule__Section__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6484:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6485:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6486:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_113123); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6495:1: rule__Section__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6499:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6500:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6500:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6501:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_113154);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6510:1: rule__Section__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6514:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6515:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6515:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6516:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSectionAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113185);
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


    // $ANTLR start rule__Section__SubSectionsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6525:1: rule__Section__SubSectionsAssignment_4_1 : ( ruleSection2 ) ;
    public final void rule__Section__SubSectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6529:1: ( ( ruleSection2 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6530:1: ( ruleSection2 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6530:1: ( ruleSection2 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6531:1: ruleSection2
            {
             before(grammarAccess.getSectionAccess().getSubSectionsSection2ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection2_in_rule__Section__SubSectionsAssignment_4_113216);
            ruleSection2();
            _fsp--;

             after(grammarAccess.getSectionAccess().getSubSectionsSection2ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section__SubSectionsAssignment_4_1


    // $ANTLR start rule__Section2__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6540:1: rule__Section2__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section2__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6544:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6545:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6545:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6546:1: RULE_ID
            {
             before(grammarAccess.getSection2Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section2__NameAssignment_0_0_113247); 
             after(grammarAccess.getSection2Access().getNameIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__NameAssignment_0_0_1


    // $ANTLR start rule__Section2__TitleAssignment_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6555:1: rule__Section2__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section2__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6559:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6560:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6560:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6561:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section2__TitleAssignment_113278);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection2Access().getTitleTextOrMarkupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__TitleAssignment_1


    // $ANTLR start rule__Section2__ContentsAssignment_3_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6570:1: rule__Section2__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section2__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6574:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6575:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6575:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6576:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section2__ContentsAssignment_3_113309);
            ruleTextOrMarkup();
            _fsp--;

             after(grammarAccess.getSection2Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__ContentsAssignment_3_1


    // $ANTLR start rule__Section2__SubSectionsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6585:1: rule__Section2__SubSectionsAssignment_4_1 : ( ruleSection3 ) ;
    public final void rule__Section2__SubSectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6589:1: ( ( ruleSection3 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6590:1: ( ruleSection3 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6590:1: ( ruleSection3 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6591:1: ruleSection3
            {
             before(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection3_in_rule__Section2__SubSectionsAssignment_4_113340);
            ruleSection3();
            _fsp--;

             after(grammarAccess.getSection2Access().getSubSectionsSection3ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section2__SubSectionsAssignment_4_1


    // $ANTLR start rule__Section3__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6600:1: rule__Section3__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section3__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6604:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6605:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6605:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6606:1: RULE_ID
            {
             before(grammarAccess.getSection3Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113371); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6615:1: rule__Section3__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6619:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6620:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6620:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6621:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113402);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6630:1: rule__Section3__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section3__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6634:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6635:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6635:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6636:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection3Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113433);
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


    // $ANTLR start rule__Section3__SubSectionsAssignment_4_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6645:1: rule__Section3__SubSectionsAssignment_4_1 : ( ruleSection4 ) ;
    public final void rule__Section3__SubSectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6649:1: ( ( ruleSection4 ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6650:1: ( ruleSection4 )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6650:1: ( ruleSection4 )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6651:1: ruleSection4
            {
             before(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection4_in_rule__Section3__SubSectionsAssignment_4_113464);
            ruleSection4();
            _fsp--;

             after(grammarAccess.getSection3Access().getSubSectionsSection4ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Section3__SubSectionsAssignment_4_1


    // $ANTLR start rule__Section4__NameAssignment_0_0_1
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6660:1: rule__Section4__NameAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Section4__NameAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6664:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6665:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6665:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6666:1: RULE_ID
            {
             before(grammarAccess.getSection4Access().getNameIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113495); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6675:1: rule__Section4__TitleAssignment_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6679:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6680:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6681:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getTitleTextOrMarkupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113526);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6690:1: rule__Section4__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Section4__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6694:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6695:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6695:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6696:1: ruleTextOrMarkup
            {
             before(grammarAccess.getSection4Access().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113557);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6705:1: rule__TextOrMarkup__ContentsAssignment_0_0 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6709:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6710:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6710:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6711:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013588);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6720:1: rule__TextOrMarkup__ContentsAssignment_0_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6724:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6725:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6726:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013619);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6735:1: rule__TextOrMarkup__ContentsAssignment_0_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6739:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6740:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6740:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6741:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113650);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6750:1: rule__TextOrMarkup__ContentsAssignment_1_0 : ( ruleMarkUp ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6754:1: ( ( ruleMarkUp ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6755:1: ( ruleMarkUp )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6755:1: ( ruleMarkUp )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6756:1: ruleMarkUp
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsMarkUpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013681);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6765:1: rule__TextOrMarkup__ContentsAssignment_1_1 : ( ruleTextPart ) ;
    public final void rule__TextOrMarkup__ContentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6769:1: ( ( ruleTextPart ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ruleTextPart )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6770:1: ( ruleTextPart )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6771:1: ruleTextPart
            {
             before(grammarAccess.getTextOrMarkupAccess().getContentsTextPartParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113712);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6780:1: rule__TextPart__TextAssignment : ( ruleText ) ;
    public final void rule__TextPart__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6784:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6785:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6785:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6786:1: ruleText
            {
             before(grammarAccess.getTextPartAccess().getTextTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__TextPart__TextAssignment13743);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6795:1: rule__Emphasize__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Emphasize__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6799:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6800:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6800:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6801:1: ruleTextOrMarkup
            {
             before(grammarAccess.getEmphasizeAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213774);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6810:1: rule__Anchor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Anchor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6814:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6815:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6815:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6816:1: RULE_ID
            {
             before(grammarAccess.getAnchorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113805); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6825:1: rule__Ref__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6829:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6830:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6830:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6831:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6832:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6833:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefIdentifiableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113840); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6844:1: rule__Ref__ContentsAssignment_4 : ( ruleTextOrMarkup ) ;
    public final void rule__Ref__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6848:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6849:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6849:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6850:1: ruleTextOrMarkup
            {
             before(grammarAccess.getRefAccess().getContentsTextOrMarkupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413875);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6859:1: rule__OrderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__OrderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6863:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6864:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6865:1: ruleItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113906);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6874:1: rule__UnorderedList__ItemsAssignment_1_1 : ( ruleItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6878:1: ( ( ruleItem ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6879:1: ( ruleItem )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6879:1: ( ruleItem )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6880:1: ruleItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113937);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6889:1: rule__Item__ContentsAssignment_2 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6893:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6894:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6894:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6895:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213968);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6904:1: rule__Item__ContentsAssignment_3_1 : ( ruleTextOrMarkup ) ;
    public final void rule__Item__ContentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6908:1: ( ( ruleTextOrMarkup ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6909:1: ( ruleTextOrMarkup )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6909:1: ( ruleTextOrMarkup )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6910:1: ruleTextOrMarkup
            {
             before(grammarAccess.getItemAccess().getContentsTextOrMarkupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113999);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6919:1: rule__CodeRef__ElementAssignment_1 : ( ( ruleText ) ) ;
    public final void rule__CodeRef__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6923:1: ( ( ( ruleText ) ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6924:1: ( ( ruleText ) )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6924:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6925:1: ( ruleText )
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementCrossReference_1_0()); 
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6926:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6927:1: ruleText
            {
             before(grammarAccess.getCodeRefAccess().getElementJvmIdentifyableElementTextParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_114034);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6938:1: rule__Link__UrlAssignment_1 : ( ruleText ) ;
    public final void rule__Link__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6942:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6943:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6944:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getUrlTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__UrlAssignment_114069);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6953:1: rule__Link__TextAssignment_5 : ( ruleText ) ;
    public final void rule__Link__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6957:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6958:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6959:1: ruleText
            {
             before(grammarAccess.getLinkAccess().getTextTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Link__TextAssignment_514100);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6968:1: rule__ImageRef__NameAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__ImageRef__NameAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6972:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6973:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6974:1: RULE_ID
            {
             before(grammarAccess.getImageRefAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_214131); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6983:1: rule__ImageRef__PathAssignment_1 : ( ruleText ) ;
    public final void rule__ImageRef__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6987:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6988:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6989:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getPathTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114162);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:6998:1: rule__ImageRef__ClazzAssignment_5 : ( ruleText ) ;
    public final void rule__ImageRef__ClazzAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7002:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7003:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7004:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getClazzTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514193);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7013:1: rule__ImageRef__StyleAssignment_9 : ( ruleText ) ;
    public final void rule__ImageRef__StyleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7017:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7018:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7019:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getStyleTextParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914224);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7028:1: rule__ImageRef__CaptionAssignment_13 : ( ruleText ) ;
    public final void rule__ImageRef__CaptionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7032:1: ( ( ruleText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ruleText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7033:1: ( ruleText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7034:1: ruleText
            {
             before(grammarAccess.getImageRefAccess().getCaptionTextParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314255);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7043:1: rule__CodeBlock__LanguageAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__CodeBlock__LanguageAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7047:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7048:1: ( RULE_ID )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7049:1: RULE_ID
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114286); 
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7058:1: rule__CodeBlock__ContentsAssignment_2_0_0 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7062:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7063:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7064:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014317);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7073:1: rule__CodeBlock__ContentsAssignment_2_0_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7077:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7078:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7079:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014348);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7088:1: rule__CodeBlock__ContentsAssignment_2_0_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7092:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7093:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7093:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7094:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_0_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114379);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7103:1: rule__CodeBlock__ContentsAssignment_2_1_0 : ( ruleMarkupInCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7107:1: ( ( ruleMarkupInCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7108:1: ( ruleMarkupInCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7108:1: ( ruleMarkupInCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7109:1: ruleMarkupInCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsMarkupInCodeParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014410);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7118:1: rule__CodeBlock__ContentsAssignment_2_1_1 : ( ruleCode ) ;
    public final void rule__CodeBlock__ContentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7122:1: ( ( ruleCode ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7123:1: ( ruleCode )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7123:1: ( ruleCode )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7124:1: ruleCode
            {
             before(grammarAccess.getCodeBlockAccess().getContentsCodeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114441);
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
    // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7133:1: rule__Code__ContentsAssignment : ( ruleCodeText ) ;
    public final void rule__Code__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7137:1: ( ( ruleCodeText ) )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7138:1: ( ruleCodeText )
            {
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7138:1: ( ruleCodeText )
            // ../org.eclipse.xtext.xdoc.ui/src-gen/org/eclipse/xtext/xdoc/ui/contentassist/antlr/internal/InternalXDoc.g:7139:1: ruleCodeText
            {
             before(grammarAccess.getCodeAccess().getContentsCodeTextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14472);
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


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA43_eotS =
        "\6\uffff";
    static final String DFA43_eofS =
        "\6\uffff";
    static final String DFA43_minS =
        "\4\5\2\uffff";
    static final String DFA43_maxS =
        "\4\36\2\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA43_specialS =
        "\6\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 4321:1: ( rule__OrderedList__Group_1__0 )*";
        }
    }
    static final String DFA46_eotS =
        "\6\uffff";
    static final String DFA46_eofS =
        "\6\uffff";
    static final String DFA46_minS =
        "\4\5\2\uffff";
    static final String DFA46_maxS =
        "\4\36\2\uffff";
    static final String DFA46_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA46_specialS =
        "\6\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "\1\3\1\2\1\uffff\1\1\11\uffff\1\4\13\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()* loopback of 4516:1: ( rule__UnorderedList__Group_1__0 )*";
        }
    }
    static final String DFA57_eotS =
        "\31\uffff";
    static final String DFA57_eofS =
        "\15\uffff\4\5\1\uffff\7\5";
    static final String DFA57_minS =
        "\5\4\1\uffff\13\4\1\uffff\7\4";
    static final String DFA57_maxS =
        "\5\33\1\uffff\7\33\4\42\1\uffff\7\42";
    static final String DFA57_acceptS =
        "\5\uffff\1\2\13\uffff\1\1\7\uffff";
    static final String DFA57_specialS =
        "\31\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\4\1\3\1\2\1\5\1\1\6\uffff\2\5\10\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\6\1\11\1\10\1\5\1\7\6\uffff\2\5\1\uffff\1\5\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\13\1\14\1\5\1\12\6\uffff\2\5\1\uffff\1\15\6\uffff\3\5",
            "\1\5\1\20\1\17\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\12\5\1\21\11\5\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\24\1\25\1\5\1\16\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\26\1\27\1\5\1\30\6\uffff\4\5\1\uffff\1\21\4\uffff\5\5"+
            "\1\uffff\4\5",
            "\1\5\1\22\1\23\1\5\1\21\1\uffff\10\5\1\uffff\1\5\1\21\11\5\1"+
            "\uffff\4\5"
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
            return "5880:1: ( rule__CodeBlock__Group_1__0 )?";
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
    public static final BitSet FOLLOW_ruleSection2_in_entryRuleSection2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group__0_in_ruleSection2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_entryRuleSection3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0_in_ruleSection3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_entryRuleSection4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0_in_ruleSection4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_entryRuleTextOrMarkup483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextOrMarkup490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Alternatives_in_ruleTextOrMarkup516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_entryRuleTextPart543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextPart550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextPart__TextAssignment_in_ruleTextPart576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText638 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText650 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_ruleMarkUp_in_entryRuleMarkUp680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkUp687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkUp__Alternatives_in_ruleMarkUp713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_entryRuleEmphasize740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmphasize747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0_in_ruleEmphasize773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_entryRuleAnchor800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnchor807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0_in_ruleAnchor833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0_in_ruleItem1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_entryRuleCodeRef1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeRef1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0_in_ruleCodeRef1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_entryRuleImageRef1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageRef1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0_in_ruleImageRef1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0_in_ruleCodeBlock1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Code__ContentsAssignment_in_ruleCode1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_entryRuleMarkupInCode1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkupInCode1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupInCode__Alternatives_in_ruleMarkupInCode1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_entryRuleCodeText1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeText1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1495 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeText__Alternatives_in_ruleCodeText1507 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_ruleANY_WS_in_entryRuleANY_WS1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANY_WS1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANY_WS__Alternatives_in_ruleANY_WS1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0_in_rule__Document__Alternatives_3_01606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0_in_rule__Document__Alternatives_3_01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0_in_rule__Document__Alternatives_3_01642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0_in_rule__Chapter__Alternatives_01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Chapter__Alternatives_01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0_in_rule__Section__Alternatives_01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Section__Alternatives_01747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__0_in_rule__Section2__Alternatives_01781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Section2__Alternatives_01800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0_in_rule__Section3__Alternatives_01834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Section3__Alternatives_01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0_in_rule__Section4__Alternatives_01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Section4__Alternatives_01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__AbstractSection__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__AbstractSection__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_rule__AbstractSection__Alternatives1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__AbstractSection__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__AbstractSection__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0_in_rule__TextOrMarkup__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives2061 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0_in_rule__TextOrMarkup__Alternatives2073 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Text__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Text__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__Text__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Text__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Text__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Text__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkUp__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkUp__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkUp__Alternatives2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__MarkUp__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__MarkUp__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_rule__MarkUp__Alternatives2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeRef_in_rule__MarkUp__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__MarkUp__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageRef_in_rule__MarkUp__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0_in_rule__ImageRef__Alternatives_02400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImageRef__Alternatives_02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0_in_rule__CodeBlock__Alternatives_22453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22473 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0_in_rule__CodeBlock__Alternatives_22485 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ruleEmphasize_in_rule__MarkupInCode__Alternatives2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnchor_in_rule__MarkupInCode__Alternatives2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_rule__MarkupInCode__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeText__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__CodeText__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__CodeText__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__CodeText__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__CodeText__Alternatives2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CodeText__Alternatives2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CodeText__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__ANY_WS__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINGLE_NL_in_rule__ANY_WS__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ANY_WS__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02791 = new BitSet(new long[]{0x0000000000681D22L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12852 = new BitSet(new long[]{0x0000000000681D02L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Document__Group__1__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22914 = new BitSet(new long[]{0x0000000000681C02L});
    public static final BitSet FOLLOW_rule__Document__Group__3_in_rule__Document__Group__22917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group__2__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__3__Impl_in_rule__Document__Group__32976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0_in_rule__Document__Group__3__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__0__Impl_in_rule__Document__Group_3__03042 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1_in_rule__Document__Group_3__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Alternatives_3_0_in_rule__Document__Group_3__0__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3__1__Impl_in_rule__Document__Group_3__13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3__1__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__0__Impl_in_rule__Document__Group_3_0_0__03165 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1_in_rule__Document__Group_3_0_0__03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_0_0_in_rule__Document__Group_3_0_0__0__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0__1__Impl_in_rule__Document__Group_3_0_0__13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0_in_rule__Document__Group_3_0_0__1__Impl3252 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__0__Impl_in_rule__Document__Group_3_0_0_1__03287 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1_in_rule__Document__Group_3_0_0_1__03290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_0_1__0__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_0_1__1__Impl_in_rule__Document__Group_3_0_0_1__13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_0_1_1_in_rule__Document__Group_3_0_0_1__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__0__Impl_in_rule__Document__Group_3_0_1__03407 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1_in_rule__Document__Group_3_0_1__03410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_0_in_rule__Document__Group_3_0_1__0__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1__1__Impl_in_rule__Document__Group_3_0_1__13467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0_in_rule__Document__Group_3_0_1__1__Impl3494 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__0__Impl_in_rule__Document__Group_3_0_1_1__03529 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1_in_rule__Document__Group_3_0_1_1__03532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_1_1__0__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_1_1__1__Impl_in_rule__Document__Group_3_0_1_1__13588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_1_1_1_in_rule__Document__Group_3_0_1_1__1__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__0__Impl_in_rule__Document__Group_3_0_2__03649 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1_in_rule__Document__Group_3_0_2__03652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_2_0_in_rule__Document__Group_3_0_2__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2__1__Impl_in_rule__Document__Group_3_0_2__13709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0_in_rule__Document__Group_3_0_2__1__Impl3736 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__0__Impl_in_rule__Document__Group_3_0_2_1__03771 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1_in_rule__Document__Group_3_0_2_1__03774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Document__Group_3_0_2_1__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group_3_0_2_1__1__Impl_in_rule__Document__Group_3_0_2_1__13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SectionsAssignment_3_0_2_1_1_in_rule__Document__Group_3_0_2_1__1__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__0__Impl_in_rule__Chapter__Group__03891 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1_in_rule__Chapter__Group__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Alternatives_0_in_rule__Chapter__Group__0__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__1__Impl_in_rule__Chapter__Group__13951 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2_in_rule__Chapter__Group__13954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__TitleAssignment_1_in_rule__Chapter__Group__1__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__2__Impl_in_rule__Chapter__Group__24011 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3_in_rule__Chapter__Group__24014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Chapter__Group__2__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group__3__Impl_in_rule__Chapter__Group__34073 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4_in_rule__Chapter__Group__34076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0_in_rule__Chapter__Group__3__Impl4103 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group__4__Impl_in_rule__Chapter__Group__44134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0_in_rule__Chapter__Group__4__Impl4161 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__0__Impl_in_rule__Chapter__Group_0_0__04202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1_in_rule__Chapter__Group_0_0__04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Chapter__Group_0_0__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__1__Impl_in_rule__Chapter__Group_0_0__14264 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2_in_rule__Chapter__Group_0_0__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__NameAssignment_0_0_1_in_rule__Chapter__Group_0_0__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_0_0__2__Impl_in_rule__Chapter__Group_0_0__24324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Chapter__Group_0_0__2__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__0__Impl_in_rule__Chapter__Group_3__04389 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1_in_rule__Chapter__Group_3__04392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_3__0__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_3__1__Impl_in_rule__Chapter__Group_3__14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__ContentsAssignment_3_1_in_rule__Chapter__Group_3__1__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__0__Impl_in_rule__Chapter__Group_4__04509 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1_in_rule__Chapter__Group_4__04512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Chapter__Group_4__0__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__Group_4__1__Impl_in_rule__Chapter__Group_4__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chapter__SubSectionsAssignment_4_1_in_rule__Chapter__Group_4__1__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__04629 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__04632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_0_in_rule__Section__Group__0__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__14689 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__14692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_1_in_rule__Section__Group__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__24749 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__24752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section__Group__2__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__34811 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__34814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0_in_rule__Section__Group__3__Impl4841 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__44872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl4899 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__0__Impl_in_rule__Section__Group_0_0__04940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1_in_rule__Section__Group_0_0__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Section__Group_0_0__0__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__1__Impl_in_rule__Section__Group_0_0__15002 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2_in_rule__Section__Group_0_0__15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_0_0_1_in_rule__Section__Group_0_0__1__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_0_0__2__Impl_in_rule__Section__Group_0_0__25062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section__Group_0_0__2__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__0__Impl_in_rule__Section__Group_3__05127 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1_in_rule__Section__Group_3__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_3__0__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_3__1__Impl_in_rule__Section__Group_3__15186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__ContentsAssignment_3_1_in_rule__Section__Group_3__1__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__05247 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__05250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section__Group_4__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__SubSectionsAssignment_4_1_in_rule__Section__Group_4__1__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group__0__Impl_in_rule__Section2__Group__05367 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section2__Group__1_in_rule__Section2__Group__05370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Alternatives_0_in_rule__Section2__Group__0__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group__1__Impl_in_rule__Section2__Group__15427 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section2__Group__2_in_rule__Section2__Group__15430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__TitleAssignment_1_in_rule__Section2__Group__1__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group__2__Impl_in_rule__Section2__Group__25487 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section2__Group__3_in_rule__Section2__Group__25490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section2__Group__2__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group__3__Impl_in_rule__Section2__Group__35549 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section2__Group__4_in_rule__Section2__Group__35552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_3__0_in_rule__Section2__Group__3__Impl5579 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section2__Group__4__Impl_in_rule__Section2__Group__45610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_4__0_in_rule__Section2__Group__4__Impl5637 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__0__Impl_in_rule__Section2__Group_0_0__05678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__1_in_rule__Section2__Group_0_0__05681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Section2__Group_0_0__0__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__1__Impl_in_rule__Section2__Group_0_0__15740 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__2_in_rule__Section2__Group_0_0__15743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__NameAssignment_0_0_1_in_rule__Section2__Group_0_0__1__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_0_0__2__Impl_in_rule__Section2__Group_0_0__25800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section2__Group_0_0__2__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_3__0__Impl_in_rule__Section2__Group_3__05865 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section2__Group_3__1_in_rule__Section2__Group_3__05868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section2__Group_3__0__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_3__1__Impl_in_rule__Section2__Group_3__15924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__ContentsAssignment_3_1_in_rule__Section2__Group_3__1__Impl5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_4__0__Impl_in_rule__Section2__Group_4__05985 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__Section2__Group_4__1_in_rule__Section2__Group_4__05988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section2__Group_4__0__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__Group_4__1__Impl_in_rule__Section2__Group_4__16044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section2__SubSectionsAssignment_4_1_in_rule__Section2__Group_4__1__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__0__Impl_in_rule__Section3__Group__06105 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group__1_in_rule__Section3__Group__06108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Alternatives_0_in_rule__Section3__Group__0__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__1__Impl_in_rule__Section3__Group__16165 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section3__Group__2_in_rule__Section3__Group__16168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__TitleAssignment_1_in_rule__Section3__Group__1__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__2__Impl_in_rule__Section3__Group__26225 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__3_in_rule__Section3__Group__26228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section3__Group__2__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group__3__Impl_in_rule__Section3__Group__36287 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4_in_rule__Section3__Group__36290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0_in_rule__Section3__Group__3__Impl6317 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group__4__Impl_in_rule__Section3__Group__46348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0_in_rule__Section3__Group__4__Impl6375 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__0__Impl_in_rule__Section3__Group_0_0__06416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1_in_rule__Section3__Group_0_0__06419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Section3__Group_0_0__0__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__1__Impl_in_rule__Section3__Group_0_0__16478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2_in_rule__Section3__Group_0_0__16481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__NameAssignment_0_0_1_in_rule__Section3__Group_0_0__1__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_0_0__2__Impl_in_rule__Section3__Group_0_0__26538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section3__Group_0_0__2__Impl6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__0__Impl_in_rule__Section3__Group_3__06603 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1_in_rule__Section3__Group_3__06606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_3__0__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_3__1__Impl_in_rule__Section3__Group_3__16662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__ContentsAssignment_3_1_in_rule__Section3__Group_3__1__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__0__Impl_in_rule__Section3__Group_4__06723 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1_in_rule__Section3__Group_4__06726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section3__Group_4__0__Impl6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__Group_4__1__Impl_in_rule__Section3__Group_4__16782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section3__SubSectionsAssignment_4_1_in_rule__Section3__Group_4__1__Impl6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__0__Impl_in_rule__Section4__Group__06843 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group__1_in_rule__Section4__Group__06846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Alternatives_0_in_rule__Section4__Group__0__Impl6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__1__Impl_in_rule__Section4__Group__16903 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Section4__Group__2_in_rule__Section4__Group__16906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__TitleAssignment_1_in_rule__Section4__Group__1__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__2__Impl_in_rule__Section4__Group__26963 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group__3_in_rule__Section4__Group__26966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section4__Group__2__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group__3__Impl_in_rule__Section4__Group__37025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0_in_rule__Section4__Group__3__Impl7052 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__0__Impl_in_rule__Section4__Group_0_0__07091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1_in_rule__Section4__Group_0_0__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Section4__Group_0_0__0__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__1__Impl_in_rule__Section4__Group_0_0__17153 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2_in_rule__Section4__Group_0_0__17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__NameAssignment_0_0_1_in_rule__Section4__Group_0_0__1__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_0_0__2__Impl_in_rule__Section4__Group_0_0__27213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Section4__Group_0_0__2__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__0__Impl_in_rule__Section4__Group_3__07278 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1_in_rule__Section4__Group_3__07281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Section4__Group_3__0__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__Group_3__1__Impl_in_rule__Section4__Group_3__17337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section4__ContentsAssignment_3_1_in_rule__Section4__Group_3__1__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__0__Impl_in_rule__TextOrMarkup__Group_0__07398 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1_in_rule__TextOrMarkup__Group_0__07401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_0_in_rule__TextOrMarkup__Group_0__0__Impl7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0__1__Impl_in_rule__TextOrMarkup__Group_0__17458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0_in_rule__TextOrMarkup__Group_0__1__Impl7485 = new BitSet(new long[]{0x00000007BE020002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__0__Impl_in_rule__TextOrMarkup__Group_0_1__07520 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1_in_rule__TextOrMarkup__Group_0_1__07523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_0_in_rule__TextOrMarkup__Group_0_1__0__Impl7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_0_1__1__Impl_in_rule__TextOrMarkup__Group_0_1__17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_0_1_1_in_rule__TextOrMarkup__Group_0_1__1__Impl7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__0__Impl_in_rule__TextOrMarkup__Group_1__07642 = new BitSet(new long[]{0x00000000000180F2L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1_in_rule__TextOrMarkup__Group_1__07645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_0_in_rule__TextOrMarkup__Group_1__0__Impl7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__Group_1__1__Impl_in_rule__TextOrMarkup__Group_1__17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextOrMarkup__ContentsAssignment_1_1_in_rule__TextOrMarkup__Group_1__1__Impl7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__0__Impl_in_rule__Emphasize__Group__07764 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1_in_rule__Emphasize__Group__07767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Emphasize__Group__0__Impl7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__1__Impl_in_rule__Emphasize__Group__17826 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2_in_rule__Emphasize__Group__17829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__1__Impl7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__2__Impl_in_rule__Emphasize__Group__27888 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3_in_rule__Emphasize__Group__27891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__ContentsAssignment_2_in_rule__Emphasize__Group__2__Impl7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__3__Impl_in_rule__Emphasize__Group__37948 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4_in_rule__Emphasize__Group__37951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Emphasize__Group__3__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emphasize__Group__4__Impl_in_rule__Emphasize__Group__48010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Emphasize__Group__4__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__0__Impl_in_rule__Anchor__Group__08079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1_in_rule__Anchor__Group__08082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Anchor__Group__0__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__1__Impl_in_rule__Anchor__Group__18141 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2_in_rule__Anchor__Group__18144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__NameAssignment_1_in_rule__Anchor__Group__1__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anchor__Group__2__Impl_in_rule__Anchor__Group__28201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Anchor__Group__2__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__08266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__08269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Ref__Group__0__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__18328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__18331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__RefAssignment_1_in_rule__Ref__Group__1__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__28388 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__28391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ref__Group__2__Impl8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__38450 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__38453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__3__Impl8481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__48512 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__48515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__ContentsAssignment_4_in_rule__Ref__Group__4__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__58572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__58575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Ref__Group__5__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__68634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Ref__Group__6__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__08707 = new BitSet(new long[]{0x0000000040000160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__08710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OrderedList__Group__0__Impl8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__18769 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2_in_rule__OrderedList__Group__18772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8801 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0_in_rule__OrderedList__Group__1__Impl8813 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__2__Impl_in_rule__OrderedList__Group__28846 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3_in_rule__OrderedList__Group__28849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group__2__Impl8877 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__3__Impl_in_rule__OrderedList__Group__38908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OrderedList__Group__3__Impl8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__0__Impl_in_rule__OrderedList__Group_1__08975 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1_in_rule__OrderedList__Group_1__08978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__OrderedList__Group_1__0__Impl9006 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__OrderedList__Group_1__1__Impl_in_rule__OrderedList__Group_1__19037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_1_1_in_rule__OrderedList__Group_1__1__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__09098 = new BitSet(new long[]{0x0000000040000160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__09101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UnorderedList__Group__0__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__19160 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2_in_rule__UnorderedList__Group__19163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9192 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0_in_rule__UnorderedList__Group__1__Impl9204 = new BitSet(new long[]{0x0000000040000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__2__Impl_in_rule__UnorderedList__Group__29237 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3_in_rule__UnorderedList__Group__29240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group__2__Impl9268 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__3__Impl_in_rule__UnorderedList__Group__39299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UnorderedList__Group__3__Impl9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__0__Impl_in_rule__UnorderedList__Group_1__09366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1_in_rule__UnorderedList__Group_1__09369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__UnorderedList__Group_1__0__Impl9397 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group_1__1__Impl_in_rule__UnorderedList__Group_1__19428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_1_1_in_rule__UnorderedList__Group_1__1__Impl9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__0__Impl_in_rule__Item__Group__09489 = new BitSet(new long[]{0x00000007BE0381F0L});
    public static final BitSet FOLLOW_rule__Item__Group__1_in_rule__Item__Group__09492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Item__Group__0__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__1__Impl_in_rule__Item__Group__19551 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group__2_in_rule__Item__Group__19554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group__1__Impl9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__2__Impl_in_rule__Item__Group__29613 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__Item__Group__3_in_rule__Item__Group__29616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_2_in_rule__Item__Group__2__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group__3__Impl_in_rule__Item__Group__39673 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Item__Group__4_in_rule__Item__Group__39676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0_in_rule__Item__Group__3__Impl9703 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Item__Group__4__Impl_in_rule__Item__Group__49734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Item__Group__4__Impl9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__0__Impl_in_rule__Item__Group_3__09803 = new BitSet(new long[]{0x00000007BE0380F0L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1_in_rule__Item__Group_3__09806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTI_NL_in_rule__Item__Group_3__0__Impl9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_3__1__Impl_in_rule__Item__Group_3__19862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ContentsAssignment_3_1_in_rule__Item__Group_3__1__Impl9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__0__Impl_in_rule__CodeRef__Group__09923 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1_in_rule__CodeRef__Group__09926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CodeRef__Group__0__Impl9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__1__Impl_in_rule__CodeRef__Group__19985 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2_in_rule__CodeRef__Group__19988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__ElementAssignment_1_in_rule__CodeRef__Group__1__Impl10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeRef__Group__2__Impl_in_rule__CodeRef__Group__210045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeRef__Group__2__Impl10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__010110 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__010113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Link__Group__0__Impl10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__110172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__110175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__UrlAssignment_1_in_rule__Link__Group__1__Impl10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__210232 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__210235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Link__Group__2__Impl10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__310294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__310297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__Link__Group__3__Impl10325 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__410356 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__410359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Link__Group__4__Impl10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__510418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Link__Group__6_in_rule__Link__Group__510421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TextAssignment_5_in_rule__Link__Group__5__Impl10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__6__Impl_in_rule__Link__Group__610478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Link__Group__6__Impl10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__0__Impl_in_rule__ImageRef__Group__010551 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1_in_rule__ImageRef__Group__010554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Alternatives_0_in_rule__ImageRef__Group__0__Impl10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__1__Impl_in_rule__ImageRef__Group__110611 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2_in_rule__ImageRef__Group__110614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__PathAssignment_1_in_rule__ImageRef__Group__1__Impl10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__2__Impl_in_rule__ImageRef__Group__210671 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3_in_rule__ImageRef__Group__210674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__2__Impl10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__3__Impl_in_rule__ImageRef__Group__310733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4_in_rule__ImageRef__Group__310736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__3__Impl10764 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__4__Impl_in_rule__ImageRef__Group__410795 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5_in_rule__ImageRef__Group__410798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__4__Impl10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__5__Impl_in_rule__ImageRef__Group__510857 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6_in_rule__ImageRef__Group__510860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__ClazzAssignment_5_in_rule__ImageRef__Group__5__Impl10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__6__Impl_in_rule__ImageRef__Group__610917 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7_in_rule__ImageRef__Group__610920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__6__Impl10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__7__Impl_in_rule__ImageRef__Group__710979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8_in_rule__ImageRef__Group__710982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__7__Impl11010 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__8__Impl_in_rule__ImageRef__Group__811041 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9_in_rule__ImageRef__Group__811044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__8__Impl11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__9__Impl_in_rule__ImageRef__Group__911103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10_in_rule__ImageRef__Group__911106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__StyleAssignment_9_in_rule__ImageRef__Group__9__Impl11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__10__Impl_in_rule__ImageRef__Group__1011163 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11_in_rule__ImageRef__Group__1011166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__10__Impl11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__11__Impl_in_rule__ImageRef__Group__1111225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12_in_rule__ImageRef__Group__1111228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group__11__Impl11256 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__12__Impl_in_rule__ImageRef__Group__1211287 = new BitSet(new long[]{0x00000000000180F0L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13_in_rule__ImageRef__Group__1211290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group__12__Impl11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__13__Impl_in_rule__ImageRef__Group__1311349 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14_in_rule__ImageRef__Group__1311352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__CaptionAssignment_13_in_rule__ImageRef__Group__13__Impl11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group__14__Impl_in_rule__ImageRef__Group__1411409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImageRef__Group__14__Impl11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__0__Impl_in_rule__ImageRef__Group_0_0__011498 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1_in_rule__ImageRef__Group_0_0__011501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ImageRef__Group_0_0__0__Impl11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__1__Impl_in_rule__ImageRef__Group_0_0__111560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2_in_rule__ImageRef__Group_0_0__111563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__1__Impl11591 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__2__Impl_in_rule__ImageRef__Group_0_0__211622 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3_in_rule__ImageRef__Group_0_0__211625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__NameAssignment_0_0_2_in_rule__ImageRef__Group_0_0__2__Impl11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__3__Impl_in_rule__ImageRef__Group_0_0__311682 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4_in_rule__ImageRef__Group_0_0__311685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__ImageRef__Group_0_0__3__Impl11713 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__ImageRef__Group_0_0__4__Impl_in_rule__ImageRef__Group_0_0__411744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImageRef__Group_0_0__4__Impl11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__0__Impl_in_rule__CodeBlock__Group__011813 = new BitSet(new long[]{0x000000000E0181F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1_in_rule__CodeBlock__Group__011816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CodeBlock__Group__0__Impl11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__1__Impl_in_rule__CodeBlock__Group__111875 = new BitSet(new long[]{0x000000000E0181F0L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2_in_rule__CodeBlock__Group__111878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0_in_rule__CodeBlock__Group__1__Impl11905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__2__Impl_in_rule__CodeBlock__Group__211936 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3_in_rule__CodeBlock__Group__211939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Alternatives_2_in_rule__CodeBlock__Group__2__Impl11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group__3__Impl_in_rule__CodeBlock__Group__311996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeBlock__Group__3__Impl12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__0__Impl_in_rule__CodeBlock__Group_1__012063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1_in_rule__CodeBlock__Group_1__012066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__0__Impl12094 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__1__Impl_in_rule__CodeBlock__Group_1__112125 = new BitSet(new long[]{0x0000000000040160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2_in_rule__CodeBlock__Group_1__112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__LanguageAssignment_1_1_in_rule__CodeBlock__Group_1__1__Impl12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__2__Impl_in_rule__CodeBlock__Group_1__212185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3_in_rule__CodeBlock__Group_1__212188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__2__Impl12216 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__3__Impl_in_rule__CodeBlock__Group_1__312247 = new BitSet(new long[]{0x0000000000100160L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4_in_rule__CodeBlock__Group_1__312250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CodeBlock__Group_1__3__Impl12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__4__Impl_in_rule__CodeBlock__Group_1__412309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5_in_rule__CodeBlock__Group_1__412312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANY_WS_in_rule__CodeBlock__Group_1__4__Impl12340 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_1__5__Impl_in_rule__CodeBlock__Group_1__512371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CodeBlock__Group_1__5__Impl12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__0__Impl_in_rule__CodeBlock__Group_2_0__012442 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1_in_rule__CodeBlock__Group_2_0__012445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_0_in_rule__CodeBlock__Group_2_0__0__Impl12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0__1__Impl_in_rule__CodeBlock__Group_2_0__112502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0_in_rule__CodeBlock__Group_2_0__1__Impl12529 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__0__Impl_in_rule__CodeBlock__Group_2_0_1__012564 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1_in_rule__CodeBlock__Group_2_0_1__012567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_0_in_rule__CodeBlock__Group_2_0_1__0__Impl12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_0_1__1__Impl_in_rule__CodeBlock__Group_2_0_1__112624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_0_1_1_in_rule__CodeBlock__Group_2_0_1__1__Impl12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__0__Impl_in_rule__CodeBlock__Group_2_1__012686 = new BitSet(new long[]{0x00000000000181F2L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1_in_rule__CodeBlock__Group_2_1__012689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_0_in_rule__CodeBlock__Group_2_1__0__Impl12716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__Group_2_1__1__Impl_in_rule__CodeBlock__Group_2_1__112746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeBlock__ContentsAssignment_2_1_1_in_rule__CodeBlock__Group_2_1__1__Impl12773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__SectionsAssignment_3_0_0_012813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChapter_in_rule__Document__SectionsAssignment_3_0_0_1_112844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_012875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Document__SectionsAssignment_3_0_1_1_112906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_rule__Document__SectionsAssignment_3_0_2_012937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_rule__Document__SectionsAssignment_3_0_2_1_112968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chapter__NameAssignment_0_0_112999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__TitleAssignment_113030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Chapter__ContentsAssignment_3_113061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Chapter__SubSectionsAssignment_4_113092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_0_0_113123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__TitleAssignment_113154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section__ContentsAssignment_3_113185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection2_in_rule__Section__SubSectionsAssignment_4_113216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section2__NameAssignment_0_0_113247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section2__TitleAssignment_113278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section2__ContentsAssignment_3_113309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection3_in_rule__Section2__SubSectionsAssignment_4_113340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section3__NameAssignment_0_0_113371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__TitleAssignment_113402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section3__ContentsAssignment_3_113433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection4_in_rule__Section3__SubSectionsAssignment_4_113464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section4__NameAssignment_0_0_113495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__TitleAssignment_113526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Section4__ContentsAssignment_3_113557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_013588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_0_1_013619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_0_1_113650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkUp_in_rule__TextOrMarkup__ContentsAssignment_1_013681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextPart_in_rule__TextOrMarkup__ContentsAssignment_1_113712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__TextPart__TextAssignment13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Emphasize__ContentsAssignment_213774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anchor__NameAssignment_113805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefAssignment_113840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Ref__ContentsAssignment_413875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__OrderedList__ItemsAssignment_1_113906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__UnorderedList__ItemsAssignment_1_113937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_213968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextOrMarkup_in_rule__Item__ContentsAssignment_3_113999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CodeRef__ElementAssignment_114034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__UrlAssignment_114069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Link__TextAssignment_514100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImageRef__NameAssignment_0_0_214131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__PathAssignment_114162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__ClazzAssignment_514193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__StyleAssignment_914224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageRef__CaptionAssignment_1314255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeBlock__LanguageAssignment_1_114286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_014317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_014348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_0_1_114379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupInCode_in_rule__CodeBlock__ContentsAssignment_2_1_014410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCode_in_rule__CodeBlock__ContentsAssignment_2_1_114441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeText_in_rule__Code__ContentsAssignment14472 = new BitSet(new long[]{0x0000000000000002L});

}