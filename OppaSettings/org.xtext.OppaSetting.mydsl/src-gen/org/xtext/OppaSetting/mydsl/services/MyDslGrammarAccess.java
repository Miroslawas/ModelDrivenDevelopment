/*
* generated by Xtext
*/

package org.xtext.OppaSetting.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SettingsModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SettingsModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSettingsModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSettingsModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionsSectionParserRuleCall_2_0 = (RuleCall)cSectionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketLineFeedLfKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SettingsModel:
		//
		//	{SettingsModel} "SettingsModel \n\t{\n\t\t" sections+=Section+ "}\n";
		public ParserRule getRule() { return rule; }

		//{SettingsModel} "SettingsModel \n\t{\n\t\t" sections+=Section+ "}\n"
		public Group getGroup() { return cGroup; }

		//{SettingsModel}
		public Action getSettingsModelAction_0() { return cSettingsModelAction_0; }

		//"SettingsModel \n\t{\n\t\t"
		public Keyword getSettingsModelKeyword_1() { return cSettingsModelKeyword_1; }

		//sections+=Section+
		public Assignment getSectionsAssignment_2() { return cSectionsAssignment_2; }

		//Section
		public RuleCall getSectionsSectionParserRuleCall_2_0() { return cSectionsSectionParserRuleCall_2_0; }

		//"}\n"
		public Keyword getRightCurlyBracketLineFeedLfKeyword_3() { return cRightCurlyBracketLineFeedLfKeyword_3; }
	}

	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSectionNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFeaturesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_1_0 = (RuleCall)cFeaturesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketSpaceLineFeedLfKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Section:
		//
		//	{Section} "Section\n\t\t\t{\n\t\t\t\t name= " name=EString ("\n\t\t\t\t " features+=Feature)? "} \n";
		public ParserRule getRule() { return rule; }

		//{Section} "Section\n\t\t\t{\n\t\t\t\t name= " name=EString ("\n\t\t\t\t " features+=Feature)? "} \n"
		public Group getGroup() { return cGroup; }

		//{Section}
		public Action getSectionAction_0() { return cSectionAction_0; }

		//"Section\n\t\t\t{\n\t\t\t\t name= "
		public Keyword getSectionNameKeyword_1() { return cSectionNameKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//("\n\t\t\t\t " features+=Feature)?
		public Group getGroup_3() { return cGroup_3; }

		//"\n\t\t\t\t "
		public Keyword getLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0() { return cLineFeedLfCharacterTabulationCharacterTabulationCharacterTabulationCharacterTabulationSpaceKeyword_3_0; }

		//features+=Feature
		public Assignment getFeaturesAssignment_3_1() { return cFeaturesAssignment_3_1; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_1_0() { return cFeaturesFeatureParserRuleCall_3_1_0; }

		//"} \n"
		public Keyword getRightCurlyBracketSpaceLineFeedLfKeyword_4() { return cRightCurlyBracketSpaceLineFeedLfKeyword_4; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFeatureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFeatureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cIdKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cIdAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cIdEStringParserRuleCall_5_1_0 = (RuleCall)cIdAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDescriptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDescriptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_6_1_0 = (RuleCall)cDescriptionAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cTypeKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cTypeAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cTypeTypeParserRuleCall_7_1_0 = (RuleCall)cTypeAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cExcludesKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cExcludesAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cExcludesFeatureCrossReference_8_2_0 = (CrossReference)cExcludesAssignment_8_2.eContents().get(0);
		private final RuleCall cExcludesFeatureEStringParserRuleCall_8_2_0_1 = (RuleCall)cExcludesFeatureCrossReference_8_2_0.eContents().get(1);
		private final Group cGroup_8_3 = (Group)cGroup_8.eContents().get(3);
		private final Keyword cCommaKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Assignment cExcludesAssignment_8_3_1 = (Assignment)cGroup_8_3.eContents().get(1);
		private final CrossReference cExcludesFeatureCrossReference_8_3_1_0 = (CrossReference)cExcludesAssignment_8_3_1.eContents().get(0);
		private final RuleCall cExcludesFeatureEStringParserRuleCall_8_3_1_0_1 = (RuleCall)cExcludesFeatureCrossReference_8_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_8_4 = (Keyword)cGroup_8.eContents().get(4);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cDependsKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cDependsAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cDependsFeatureCrossReference_9_2_0 = (CrossReference)cDependsAssignment_9_2.eContents().get(0);
		private final RuleCall cDependsFeatureEStringParserRuleCall_9_2_0_1 = (RuleCall)cDependsFeatureCrossReference_9_2_0.eContents().get(1);
		private final Group cGroup_9_3 = (Group)cGroup_9.eContents().get(3);
		private final Keyword cCommaKeyword_9_3_0 = (Keyword)cGroup_9_3.eContents().get(0);
		private final Assignment cDependsAssignment_9_3_1 = (Assignment)cGroup_9_3.eContents().get(1);
		private final CrossReference cDependsFeatureCrossReference_9_3_1_0 = (CrossReference)cDependsAssignment_9_3_1.eContents().get(0);
		private final RuleCall cDependsFeatureEStringParserRuleCall_9_3_1_0_1 = (RuleCall)cDependsFeatureCrossReference_9_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_9_4 = (Keyword)cGroup_9.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Feature:
		//
		//	{Feature} "Feature\n\t\t\t\t\t" "{\n\t\t\t\t\t\t name= " name=EString "{" ("id" id=EString)? ("description"
		//
		//	description=EString)? ("type" type=Type)? ("excludes" "(" excludes+=[Feature|EString] (","
		//
		//	excludes+=[Feature|EString])* ")")? ("depends" "(" depends+=[Feature|EString] ("," depends+=[Feature|EString])* ")")?
		//
		//	"}";
		public ParserRule getRule() { return rule; }

		//{Feature} "Feature\n\t\t\t\t\t" "{\n\t\t\t\t\t\t name= " name=EString "{" ("id" id=EString)? ("description"
		//
		//description=EString)? ("type" type=Type)? ("excludes" "(" excludes+=[Feature|EString] (","
		//
		//excludes+=[Feature|EString])* ")")? ("depends" "(" depends+=[Feature|EString] ("," depends+=[Feature|EString])* ")")?
		//
		//"}"
		public Group getGroup() { return cGroup; }

		//{Feature}
		public Action getFeatureAction_0() { return cFeatureAction_0; }

		//"Feature\n\t\t\t\t\t"
		public Keyword getFeatureKeyword_1() { return cFeatureKeyword_1; }

		//"{\n\t\t\t\t\t\t name= "
		public Keyword getNameKeyword_2() { return cNameKeyword_2; }

		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//("id" id=EString)?
		public Group getGroup_5() { return cGroup_5; }

		//"id"
		public Keyword getIdKeyword_5_0() { return cIdKeyword_5_0; }

		//id=EString
		public Assignment getIdAssignment_5_1() { return cIdAssignment_5_1; }

		//EString
		public RuleCall getIdEStringParserRuleCall_5_1_0() { return cIdEStringParserRuleCall_5_1_0; }

		//("description" description=EString)?
		public Group getGroup_6() { return cGroup_6; }

		//"description"
		public Keyword getDescriptionKeyword_6_0() { return cDescriptionKeyword_6_0; }

		//description=EString
		public Assignment getDescriptionAssignment_6_1() { return cDescriptionAssignment_6_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_6_1_0() { return cDescriptionEStringParserRuleCall_6_1_0; }

		//("type" type=Type)?
		public Group getGroup_7() { return cGroup_7; }

		//"type"
		public Keyword getTypeKeyword_7_0() { return cTypeKeyword_7_0; }

		//type=Type
		public Assignment getTypeAssignment_7_1() { return cTypeAssignment_7_1; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_7_1_0() { return cTypeTypeParserRuleCall_7_1_0; }

		//("excludes" "(" excludes+=[Feature|EString] ("," excludes+=[Feature|EString])* ")")?
		public Group getGroup_8() { return cGroup_8; }

		//"excludes"
		public Keyword getExcludesKeyword_8_0() { return cExcludesKeyword_8_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_8_1() { return cLeftParenthesisKeyword_8_1; }

		//excludes+=[Feature|EString]
		public Assignment getExcludesAssignment_8_2() { return cExcludesAssignment_8_2; }

		//[Feature|EString]
		public CrossReference getExcludesFeatureCrossReference_8_2_0() { return cExcludesFeatureCrossReference_8_2_0; }

		//EString
		public RuleCall getExcludesFeatureEStringParserRuleCall_8_2_0_1() { return cExcludesFeatureEStringParserRuleCall_8_2_0_1; }

		//("," excludes+=[Feature|EString])*
		public Group getGroup_8_3() { return cGroup_8_3; }

		//","
		public Keyword getCommaKeyword_8_3_0() { return cCommaKeyword_8_3_0; }

		//excludes+=[Feature|EString]
		public Assignment getExcludesAssignment_8_3_1() { return cExcludesAssignment_8_3_1; }

		//[Feature|EString]
		public CrossReference getExcludesFeatureCrossReference_8_3_1_0() { return cExcludesFeatureCrossReference_8_3_1_0; }

		//EString
		public RuleCall getExcludesFeatureEStringParserRuleCall_8_3_1_0_1() { return cExcludesFeatureEStringParserRuleCall_8_3_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_8_4() { return cRightParenthesisKeyword_8_4; }

		//("depends" "(" depends+=[Feature|EString] ("," depends+=[Feature|EString])* ")")?
		public Group getGroup_9() { return cGroup_9; }

		//"depends"
		public Keyword getDependsKeyword_9_0() { return cDependsKeyword_9_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_9_1() { return cLeftParenthesisKeyword_9_1; }

		//depends+=[Feature|EString]
		public Assignment getDependsAssignment_9_2() { return cDependsAssignment_9_2; }

		//[Feature|EString]
		public CrossReference getDependsFeatureCrossReference_9_2_0() { return cDependsFeatureCrossReference_9_2_0; }

		//EString
		public RuleCall getDependsFeatureEStringParserRuleCall_9_2_0_1() { return cDependsFeatureEStringParserRuleCall_9_2_0_1; }

		//("," depends+=[Feature|EString])*
		public Group getGroup_9_3() { return cGroup_9_3; }

		//","
		public Keyword getCommaKeyword_9_3_0() { return cCommaKeyword_9_3_0; }

		//depends+=[Feature|EString]
		public Assignment getDependsAssignment_9_3_1() { return cDependsAssignment_9_3_1; }

		//[Feature|EString]
		public CrossReference getDependsFeatureCrossReference_9_3_1_0() { return cDependsFeatureCrossReference_9_3_1_0; }

		//EString
		public RuleCall getDependsFeatureEStringParserRuleCall_9_3_1_0_1() { return cDependsFeatureEStringParserRuleCall_9_3_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_9_4() { return cRightParenthesisKeyword_9_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Keyword cTypeKeyword = (Keyword)rule.eContents().get(1);
		
		/// * TODO: implement this rule and an appropriate IValueConverter * / Type:
		//
		//	"Type";
		public ParserRule getRule() { return rule; }

		//"Type"
		public Keyword getTypeKeyword() { return cTypeKeyword; }
	}
	
	
	private SettingsModelElements pSettingsModel;
	private SectionElements pSection;
	private EStringElements pEString;
	private FeatureElements pFeature;
	private TypeElements pType;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.OppaSetting.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SettingsModel:
	//
	//	{SettingsModel} "SettingsModel \n\t{\n\t\t" sections+=Section+ "}\n";
	public SettingsModelElements getSettingsModelAccess() {
		return (pSettingsModel != null) ? pSettingsModel : (pSettingsModel = new SettingsModelElements());
	}
	
	public ParserRule getSettingsModelRule() {
		return getSettingsModelAccess().getRule();
	}

	//Section:
	//
	//	{Section} "Section\n\t\t\t{\n\t\t\t\t name= " name=EString ("\n\t\t\t\t " features+=Feature)? "} \n";
	public SectionElements getSectionAccess() {
		return (pSection != null) ? pSection : (pSection = new SectionElements());
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}

	//EString returns ecore::EString:
	//
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//Feature:
	//
	//	{Feature} "Feature\n\t\t\t\t\t" "{\n\t\t\t\t\t\t name= " name=EString "{" ("id" id=EString)? ("description"
	//
	//	description=EString)? ("type" type=Type)? ("excludes" "(" excludes+=[Feature|EString] (","
	//
	//	excludes+=[Feature|EString])* ")")? ("depends" "(" depends+=[Feature|EString] ("," depends+=[Feature|EString])* ")")?
	//
	//	"}";
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	/// * TODO: implement this rule and an appropriate IValueConverter * / Type:
	//
	//	"Type";
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
