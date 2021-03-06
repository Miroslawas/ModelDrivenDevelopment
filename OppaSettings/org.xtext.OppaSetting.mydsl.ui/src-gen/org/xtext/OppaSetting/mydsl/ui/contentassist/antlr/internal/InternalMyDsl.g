/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.OppaSetting.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.OppaSetting.mydsl.services.MyDslGrammarAccess;

}

@parser::members {
 
 	private MyDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleSettingsModel
entryRuleSettingsModel 
:
{ before(grammarAccess.getSettingsModelRule()); }
	 ruleSettingsModel
{ after(grammarAccess.getSettingsModelRule()); } 
	 EOF 
;

// Rule SettingsModel
ruleSettingsModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSettingsModelAccess().getGroup()); }
(rule__SettingsModel__Group__0)
{ after(grammarAccess.getSettingsModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSection
entryRuleSection 
:
{ before(grammarAccess.getSectionRule()); }
	 ruleSection
{ after(grammarAccess.getSectionRule()); } 
	 EOF 
;

// Rule Section
ruleSection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSectionAccess().getGroup()); }
(rule__Section__Group__0)
{ after(grammarAccess.getSectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getGroup()); }
(rule__Feature__Group__0)
{ after(grammarAccess.getFeatureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getTypeKeyword()); }

	'Type' 

{ after(grammarAccess.getTypeAccess().getTypeKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__SettingsModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SettingsModel__Group__0__Impl
	rule__SettingsModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SettingsModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSettingsModelAccess().getSettingsModelAction_0()); }
(

)
{ after(grammarAccess.getSettingsModelAccess().getSettingsModelAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SettingsModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SettingsModel__Group__1__Impl
	rule__SettingsModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SettingsModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSettingsModelAccess().getSettingsModelKeyword_1()); }

	'SettingsModel \n\t{\n\t\t' 

{ after(grammarAccess.getSettingsModelAccess().getSettingsModelKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SettingsModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SettingsModel__Group__2__Impl
	rule__SettingsModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SettingsModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); }
(rule__SettingsModel__SectionsAssignment_2)
{ after(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); }
)
(
{ before(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); }
(rule__SettingsModel__SectionsAssignment_2)*
{ after(grammarAccess.getSettingsModelAccess().getSectionsAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SettingsModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SettingsModel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SettingsModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSettingsModelAccess().getRightCurlyBracketLineFeedLfKeyword_3()); }

	'}\n' 

{ after(grammarAccess.getSettingsModelAccess().getRightCurlyBracketLineFeedLfKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Section__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group__0__Impl
	rule__Section__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getSectionAction_0()); }
(

)
{ after(grammarAccess.getSectionAccess().getSectionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group__1__Impl
	rule__Section__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getSectionNameKeyword_1()); }

	'Section\n\t\t\t{\n\t\t\t\t name= ' 

{ after(grammarAccess.getSectionAccess().getSectionNameKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group__2__Impl
	rule__Section__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getNameAssignment_2()); }
(rule__Section__NameAssignment_2)
{ after(grammarAccess.getSectionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group__3__Impl
	rule__Section__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getGroup_3()); }
(rule__Section__Group_3__0)?
{ after(grammarAccess.getSectionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getRightCurlyBracketSpaceLineFeedLfKeyword_4()); }

	'} \n' 

{ after(grammarAccess.getSectionAccess().getRightCurlyBracketSpaceLineFeedLfKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Section__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group_3__0__Impl
	rule__Section__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0()); }

	'\n\t\t\t\t ' 

{ after(grammarAccess.getSectionAccess().getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Section__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Section__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Section__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getFeaturesAssignment_3_1()); }
(rule__Section__FeaturesAssignment_3_1)
{ after(grammarAccess.getSectionAccess().getFeaturesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getFeatureAction_0()); }
(

)
{ after(grammarAccess.getFeatureAccess().getFeatureAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); }

	'Feature\n\t\t\t\t\t' 

{ after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameKeyword_2()); }

	'{\n\t\t\t\t\t\t name= ' 

{ after(grammarAccess.getFeatureAccess().getNameKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__3__Impl
	rule__Feature__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameAssignment_3()); }
(rule__Feature__NameAssignment_3)
{ after(grammarAccess.getFeatureAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__4__Impl
	rule__Feature__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__5__Impl
	rule__Feature__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_5()); }
(rule__Feature__Group_5__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__6__Impl
	rule__Feature__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_6()); }
(rule__Feature__Group_6__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__7__Impl
	rule__Feature__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_7()); }
(rule__Feature__Group_7__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__8__Impl
	rule__Feature__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_8()); }
(rule__Feature__Group_8__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__9__Impl
	rule__Feature__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_9()); }
(rule__Feature__Group_9__0)?
{ after(grammarAccess.getFeatureAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10()); }

	'}' 

{ after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__Feature__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_5__0__Impl
	rule__Feature__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIdKeyword_5_0()); }

	'id' 

{ after(grammarAccess.getFeatureAccess().getIdKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIdAssignment_5_1()); }
(rule__Feature__IdAssignment_5_1)
{ after(grammarAccess.getFeatureAccess().getIdAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_6__0__Impl
	rule__Feature__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getFeatureAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDescriptionAssignment_6_1()); }
(rule__Feature__DescriptionAssignment_6_1)
{ after(grammarAccess.getFeatureAccess().getDescriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_7__0__Impl
	rule__Feature__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeKeyword_7_0()); }

	'type' 

{ after(grammarAccess.getFeatureAccess().getTypeKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeAssignment_7_1()); }
(rule__Feature__TypeAssignment_7_1)
{ after(grammarAccess.getFeatureAccess().getTypeAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8__0__Impl
	rule__Feature__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getExcludesKeyword_8_0()); }

	'excludes' 

{ after(grammarAccess.getFeatureAccess().getExcludesKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8__1__Impl
	rule__Feature__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_8_1()); }

	'(' 

{ after(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8__2__Impl
	rule__Feature__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getExcludesAssignment_8_2()); }
(rule__Feature__ExcludesAssignment_8_2)
{ after(grammarAccess.getFeatureAccess().getExcludesAssignment_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8__3__Impl
	rule__Feature__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_8_3()); }
(rule__Feature__Group_8_3__0)*
{ after(grammarAccess.getFeatureAccess().getGroup_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_8_4()); }

	')' 

{ after(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Feature__Group_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8_3__0__Impl
	rule__Feature__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getCommaKeyword_8_3_0()); }

	',' 

{ after(grammarAccess.getFeatureAccess().getCommaKeyword_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getExcludesAssignment_8_3_1()); }
(rule__Feature__ExcludesAssignment_8_3_1)
{ after(grammarAccess.getFeatureAccess().getExcludesAssignment_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Feature__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9__0__Impl
	rule__Feature__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDependsKeyword_9_0()); }

	'depends' 

{ after(grammarAccess.getFeatureAccess().getDependsKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9__1__Impl
	rule__Feature__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_9_1()); }

	'(' 

{ after(grammarAccess.getFeatureAccess().getLeftParenthesisKeyword_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9__2__Impl
	rule__Feature__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDependsAssignment_9_2()); }
(rule__Feature__DependsAssignment_9_2)
{ after(grammarAccess.getFeatureAccess().getDependsAssignment_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9__3__Impl
	rule__Feature__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_9_3()); }
(rule__Feature__Group_9_3__0)*
{ after(grammarAccess.getFeatureAccess().getGroup_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_9_4()); }

	')' 

{ after(grammarAccess.getFeatureAccess().getRightParenthesisKeyword_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Feature__Group_9_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9_3__0__Impl
	rule__Feature__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getCommaKeyword_9_3_0()); }

	',' 

{ after(grammarAccess.getFeatureAccess().getCommaKeyword_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_9_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_9_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDependsAssignment_9_3_1()); }
(rule__Feature__DependsAssignment_9_3_1)
{ after(grammarAccess.getFeatureAccess().getDependsAssignment_9_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__SettingsModel__SectionsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSettingsModelAccess().getSectionsSectionParserRuleCall_2_0()); }
	ruleSection{ after(grammarAccess.getSettingsModelAccess().getSectionsSectionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Section__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); }
	ruleEString{ after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Section__FeaturesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSectionAccess().getFeaturesFeatureParserRuleCall_3_1_0()); }
	ruleFeature{ after(grammarAccess.getSectionAccess().getFeaturesFeatureParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_3_0()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__IdAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getIdEStringParserRuleCall_5_1_0()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getIdEStringParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DescriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_6_1_0()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_7_1_0()); }
	ruleType{ after(grammarAccess.getFeatureAccess().getTypeTypeParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ExcludesAssignment_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_2_0()); }
(
{ before(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_2_0_1()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_2_0_1()); }
)
{ after(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ExcludesAssignment_8_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_3_1_0()); }
(
{ before(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_3_1_0_1()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getExcludesFeatureEStringParserRuleCall_8_3_1_0_1()); }
)
{ after(grammarAccess.getFeatureAccess().getExcludesFeatureCrossReference_8_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DependsAssignment_9_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_2_0()); }
(
{ before(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_2_0_1()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_2_0_1()); }
)
{ after(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DependsAssignment_9_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_3_1_0()); }
(
{ before(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_3_1_0_1()); }
	ruleEString{ after(grammarAccess.getFeatureAccess().getDependsFeatureEStringParserRuleCall_9_3_1_0_1()); }
)
{ after(grammarAccess.getFeatureAccess().getDependsFeatureCrossReference_9_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


