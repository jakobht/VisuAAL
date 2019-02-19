// Generated from uppaal.g4 by ANTLR 4.6

package parsers.Declaration.ANTLRGenerated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uppaalParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36, T__36 = 37, T__37 = 38,
            T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
            T__45 = 46, T__46 = 47, T__47 = 48, T__48 = 49, T__49 = 50, T__50 = 51, T__51 = 52,
            T__52 = 53, T__53 = 54, T__54 = 55, T__55 = 56, T__56 = 57, T__57 = 58, T__58 = 59,
            T__59 = 60, T__60 = 61, T__61 = 62, T__62 = 63, T__63 = 64, T__64 = 65, T__65 = 66,
            T__66 = 67, T__67 = 68, T__68 = 69, T__69 = 70, T__70 = 71, T__71 = 72, T__72 = 73,
            T__73 = 74, T__74 = 75, T__75 = 76, T__76 = 77, ID = 78, NAT = 79, FLOAT = 80, WS = 81,
            BLOCK_COMMENT = 82, LINE_COMMENT = 83, PATH = 84;
    public static final int
            RULE_xta = 0, RULE_declaration = 1, RULE_importDecl = 2, RULE_prototype = 3,
            RULE_instantiation = 4, RULE_systemBlock = 5, RULE_system = 6, RULE_parameterList = 7,
            RULE_parameter = 8, RULE_functionDecl = 9, RULE_procDecl = 10, RULE_procBody = 11,
            RULE_states = 12, RULE_stateDecl = 13, RULE_commit = 14, RULE_urgent = 15,
            RULE_stateList = 16, RULE_init = 17, RULE_transitions = 18, RULE_transition = 19,
            RULE_transitionOpt = 20, RULE_transitionBody = 21, RULE_guard = 22, RULE_sync = 23,
            RULE_assign = 24, RULE_typeDecl = 25, RULE_typeIdList = 26, RULE_variableDecl = 27,
            RULE_declId = 28, RULE_initialiser = 29, RULE_fieldInit = 30, RULE_arrayDecl = 31,
            RULE_type = 32, RULE_fieldDecl = 33, RULE_fieldDeclId = 34, RULE_prefix = 35,
            RULE_range = 36, RULE_block = 37, RULE_statement = 38, RULE_caseExpr = 39,
            RULE_exprList = 40, RULE_expression = 41, RULE_argList = 42, RULE_assignOp = 43,
            RULE_unaryOp = 44, RULE_rel = 45, RULE_binIntOp = 46, RULE_binBoolOp = 47;
    public static final String[] ruleNames = {
            "xta", "declaration", "importDecl", "prototype", "instantiation", "systemBlock",
            "system", "parameterList", "parameter", "functionDecl", "procDecl", "procBody",
            "states", "stateDecl", "commit", "urgent", "stateList", "init", "transitions",
            "transition", "transitionOpt", "transitionBody", "guard", "sync", "assign",
            "typeDecl", "typeIdList", "variableDecl", "declId", "initialiser", "fieldInit",
            "arrayDecl", "type", "fieldDecl", "fieldDeclId", "prefix", "range", "block",
            "statement", "caseExpr", "exprList", "expression", "argList", "assignOp",
            "unaryOp", "rel", "binIntOp", "binBoolOp"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u028f\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2" +
                    "\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4x\n\4" +
                    "\r\4\16\4y\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\7\7\7\u0096\n\7\f\7\16" +
                    "\7\u0099\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13" +
                    "\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\5\t\u00b1" +
                    "\n\t\3\t\3\t\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\7\n\u00bb\n\n\f\n\16\n\u00be" +
                    "\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r" +
                    "\7\r\u00cf\n\r\f\r\16\r\u00d2\13\r\3\r\3\r\5\r\u00d6\n\r\3\r\5\r\u00d9" +
                    "\n\r\3\r\3\r\5\r\u00dd\n\r\3\16\3\16\3\16\3\16\7\16\u00e3\n\16\f\16\16" +
                    "\16\u00e6\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\20" +
                    "\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00fc\n\22\f\22" +
                    "\16\22\u00ff\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0109" +
                    "\n\24\f\24\16\24\u010c\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3" +
                    "\26\3\26\3\26\5\26\u0119\n\26\3\27\3\27\5\27\u011d\n\27\3\27\5\27\u0120" +
                    "\n\27\3\27\5\27\u0123\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31" +
                    "\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u0139\n\33" +
                    "\f\33\16\33\u013c\13\33\3\33\3\33\3\34\3\34\7\34\u0142\n\34\f\34\16\34" +
                    "\u0145\13\34\3\35\3\35\3\35\3\35\7\35\u014b\n\35\f\35\16\35\u014e\13\35" +
                    "\3\35\3\35\3\36\3\36\7\36\u0154\n\36\f\36\16\36\u0157\13\36\3\36\3\36" +
                    "\5\36\u015b\n\36\3\36\3\36\7\36\u015f\n\36\f\36\16\36\u0162\13\36\3\36" +
                    "\3\36\5\36\u0166\n\36\5\36\u0168\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u016f" +
                    "\n\37\f\37\16\37\u0172\13\37\3\37\3\37\5\37\u0176\n\37\3 \3 \5 \u017a" +
                    "\n \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0185\n\"\3\"\3\"\3\"\3\"\6\"\u018b" +
                    "\n\"\r\"\16\"\u018c\3\"\3\"\5\"\u0191\n\"\3#\3#\3#\3#\7#\u0197\n#\f#\16" +
                    "#\u019a\13#\3#\3#\3$\3$\7$\u01a0\n$\f$\16$\u01a3\13$\3%\5%\u01a6\n%\3" +
                    "%\5%\u01a9\n%\3%\5%\u01ac\n%\3%\5%\u01af\n%\5%\u01b1\n%\3&\3&\3&\3&\3" +
                    "&\3&\3\'\3\'\3\'\7\'\u01bc\n\'\f\'\16\'\u01bf\13\'\3\'\7\'\u01c2\n\'\f" +
                    "\'\16\'\u01c5\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3" +
                    "(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3" +
                    "(\3(\3(\3(\3(\3(\3(\5(\u01f5\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u0201" +
                    "\n(\r(\16(\u0202\3(\3(\3(\3(\3(\3(\3(\3(\5(\u020d\n(\3)\3)\3)\3)\7)\u0213" +
                    "\n)\f)\16)\u0216\13)\3)\3)\3)\7)\u021b\n)\f)\16)\u021e\13)\5)\u0220\n" +
                    ")\3*\3*\3*\7*\u0225\n*\f*\16*\u0228\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+" +
                    "\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+" +
                    "\3+\3+\3+\3+\3+\5+\u0250\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+" +
                    "\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+" +
                    "\u0276\n+\f+\16+\u0279\13+\3,\3,\3,\7,\u027e\n,\f,\16,\u0281\13,\5,\u0283" +
                    "\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\2\3T\62\2\4\6\b\n\f\16" +
                    "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2" +
                    "\t\3\2\r\16\3\2\31\32\5\2\b\b\13\13\67@\5\2\26\26\31\31AA\4\2\16\16BF" +
                    "\6\2\17\17\26\26AAGM\3\2NO\u02bb\2e\3\2\2\2\4o\3\2\2\2\6q\3\2\2\2\b~\3" +
                    "\2\2\2\n\u0092\3\2\2\2\f\u0097\3\2\2\2\16\u009c\3\2\2\2\20\u00a7\3\2\2" +
                    "\2\22\u00b4\3\2\2\2\24\u00bf\3\2\2\2\26\u00c4\3\2\2\2\30\u00d0\3\2\2\2" +
                    "\32\u00de\3\2\2\2\34\u00e9\3\2\2\2\36\u00f0\3\2\2\2 \u00f4\3\2\2\2\"\u00f8" +
                    "\3\2\2\2$\u0100\3\2\2\2&\u0104\3\2\2\2(\u010f\3\2\2\2*\u0118\3\2\2\2," +
                    "\u011a\3\2\2\2.\u0126\3\2\2\2\60\u012a\3\2\2\2\62\u012f\3\2\2\2\64\u0133" +
                    "\3\2\2\2\66\u013f\3\2\2\28\u0146\3\2\2\2:\u0167\3\2\2\2<\u0175\3\2\2\2" +
                    ">\u0179\3\2\2\2@\u017d\3\2\2\2B\u0190\3\2\2\2D\u0192\3\2\2\2F\u019d\3" +
                    "\2\2\2H\u01b0\3\2\2\2J\u01b2\3\2\2\2L\u01b8\3\2\2\2N\u020c\3\2\2\2P\u021f" +
                    "\3\2\2\2R\u0221\3\2\2\2T\u024f\3\2\2\2V\u0282\3\2\2\2X\u0284\3\2\2\2Z" +
                    "\u0286\3\2\2\2\\\u0288\3\2\2\2^\u028a\3\2\2\2`\u028c\3\2\2\2bd\5\4\3\2" +
                    "cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\2\2\3" +
                    "i\3\3\2\2\2jp\5\24\13\2kp\58\35\2lp\5\64\33\2mp\5\26\f\2np\5\6\4\2oj\3" +
                    "\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\5\3\2\2\2qr\7\3\2\2rs" +
                    "\7\4\2\2st\7V\2\2tu\7\4\2\2uw\7\5\2\2vx\5\b\5\2wv\3\2\2\2xy\3\2\2\2yw" +
                    "\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\6\2\2|}\7\7\2\2}\7\3\2\2\2~\177\5B\"" +
                    "\2\177\u0080\7P\2\2\u0080\u0081\5\20\t\2\u0081\t\3\2\2\2\u0082\u0083\7" +
                    "P\2\2\u0083\u0084\7\b\2\2\u0084\u0085\7P\2\2\u0085\u0086\7\t\2\2\u0086" +
                    "\u0087\5V,\2\u0087\u0088\7\n\2\2\u0088\u0089\7\7\2\2\u0089\u0093\3\2\2" +
                    "\2\u008a\u008b\7P\2\2\u008b\u008c\7\13\2\2\u008c\u008d\7P\2\2\u008d\u008e" +
                    "\7\t\2\2\u008e\u008f\5V,\2\u008f\u0090\7\n\2\2\u0090\u0091\7\7\2\2\u0091" +
                    "\u0093\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u008a\3\2\2\2\u0093\13\3\2\2" +
                    "\2\u0094\u0096\5\n\6\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095" +
                    "\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a" +
                    "\u009b\5\16\b\2\u009b\r\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u00a2\7P\2\2" +
                    "\u009e\u009f\t\2\2\2\u009f\u00a1\7P\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4" +
                    "\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4" +
                    "\u00a2\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\17\3\2\2\2\u00a7\u00b0\7\t\2" +
                    "\2\u00a8\u00ad\5\22\n\2\u00a9\u00aa\7\r\2\2\u00aa\u00ac\5\22\n\2\u00ab" +
                    "\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2" +
                    "\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0" +
                    "\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\n\2\2\u00b3\21\3\2\2" +
                    "\2\u00b4\u00b6\5B\"\2\u00b5\u00b7\7\17\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7" +
                    "\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\7P\2\2\u00b9\u00bb\5@!\2\u00ba" +
                    "\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2" +
                    "\2\2\u00bd\23\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5B\"\2\u00c0\u00c1" +
                    "\7P\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\5L\'\2\u00c3\25\3\2\2\2\u00c4" +
                    "\u00c5\7\20\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\7" +
                    "\5\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\6\2\2\u00ca\27\3\2\2\2\u00cb" +
                    "\u00cf\5\24\13\2\u00cc\u00cf\58\35\2\u00cd\u00cf\5\64\33\2\u00ce\u00cb" +
                    "\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0" +
                    "\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2" +
                    "\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d6\5\36\20\2\u00d5\u00d4\3\2\2\2\u00d5" +
                    "\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\5 \21\2\u00d8\u00d7\3\2" +
                    "\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5$\23\2\u00db" +
                    "\u00dd\5&\24\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\31\3\2\2" +
                    "\2\u00de\u00df\7\21\2\2\u00df\u00e4\5\34\17\2\u00e0\u00e1\7\r\2\2\u00e1" +
                    "\u00e3\5\34\17\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3" +
                    "\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7" +
                    "\u00e8\7\7\2\2\u00e8\33\3\2\2\2\u00e9\u00ee\7P\2\2\u00ea\u00eb\7\5\2\2" +
                    "\u00eb\u00ec\5T+\2\u00ec\u00ed\7\6\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea" +
                    "\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1" +
                    "\u00f2\5\"\22\2\u00f2\u00f3\7\7\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7\23" +
                    "\2\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\7\7\2\2\u00f7!\3\2\2\2\u00f8\u00fd" +
                    "\7P\2\2\u00f9\u00fa\7\r\2\2\u00fa\u00fc\7P\2\2\u00fb\u00f9\3\2\2\2\u00fc" +
                    "\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe#\3\2\2\2" +
                    "\u00ff\u00fd\3\2\2\2\u0100\u0101\7\24\2\2\u0101\u0102\7P\2\2\u0102\u0103" +
                    "\7\7\2\2\u0103%\3\2\2\2\u0104\u0105\7\25\2\2\u0105\u010a\5(\25\2\u0106" +
                    "\u0107\7\r\2\2\u0107\u0109\5*\26\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2" +
                    "\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c" +
                    "\u010a\3\2\2\2\u010d\u010e\7\7\2\2\u010e\'\3\2\2\2\u010f\u0110\7P\2\2" +
                    "\u0110\u0111\7\26\2\2\u0111\u0112\7P\2\2\u0112\u0113\5,\27\2\u0113)\3" +
                    "\2\2\2\u0114\u0119\5(\25\2\u0115\u0116\7\26\2\2\u0116\u0117\7P\2\2\u0117" +
                    "\u0119\5,\27\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0119+\3\2\2\2" +
                    "\u011a\u011c\7\5\2\2\u011b\u011d\5.\30\2\u011c\u011b\3\2\2\2\u011c\u011d" +
                    "\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\5\60\31\2\u011f\u011e\3\2\2\2" +
                    "\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0123\5\62\32\2\u0122\u0121" +
                    "\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7\6\2\2\u0125" +
                    "-\3\2\2\2\u0126\u0127\7\27\2\2\u0127\u0128\5T+\2\u0128\u0129\7\7\2\2\u0129" +
                    "/\3\2\2\2\u012a\u012b\7\30\2\2\u012b\u012c\5T+\2\u012c\u012d\t\3\2\2\u012d" +
                    "\u012e\7\7\2\2\u012e\61\3\2\2\2\u012f\u0130\7\33\2\2\u0130\u0131\5R*\2" +
                    "\u0131\u0132\7\7\2\2\u0132\63\3\2\2\2\u0133\u0134\7\34\2\2\u0134\u0135" +
                    "\5B\"\2\u0135\u013a\5\66\34\2\u0136\u0137\7\r\2\2\u0137\u0139\5\66\34" +
                    "\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b" +
                    "\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\7\2\2\u013e" +
                    "\65\3\2\2\2\u013f\u0143\7P\2\2\u0140\u0142\5@!\2\u0141\u0140\3\2\2\2\u0142" +
                    "\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\67\3\2\2" +
                    "\2\u0145\u0143\3\2\2\2\u0146\u0147\5B\"\2\u0147\u014c\5:\36\2\u0148\u0149" +
                    "\7\r\2\2\u0149\u014b\5:\36\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c" +
                    "\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2" +
                    "\2\2\u014f\u0150\7\7\2\2\u01509\3\2\2\2\u0151\u0155\7P\2\2\u0152\u0154" +
                    "\5@!\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155" +
                    "\u0156\3\2\2\2\u0156\u015a\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\b" +
                    "\2\2\u0159\u015b\5<\37\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b" +
                    "\u0168\3\2\2\2\u015c\u0160\7P\2\2\u015d\u015f\5@!\2\u015e\u015d\3\2\2" +
                    "\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0165" +
                    "\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\13\2\2\u0164\u0166\5<\37\2" +
                    "\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0151" +
                    "\3\2\2\2\u0167\u015c\3\2\2\2\u0168;\3\2\2\2\u0169\u0176\5T+\2\u016a\u016b" +
                    "\7\5\2\2\u016b\u0170\5> \2\u016c\u016d\7\r\2\2\u016d\u016f\5> \2\u016e" +
                    "\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2" +
                    "\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\6\2\2\u0174" +
                    "\u0176\3\2\2\2\u0175\u0169\3\2\2\2\u0175\u016a\3\2\2\2\u0176=\3\2\2\2" +
                    "\u0177\u0178\7P\2\2\u0178\u017a\7\35\2\2\u0179\u0177\3\2\2\2\u0179\u017a" +
                    "\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5<\37\2\u017c?\3\2\2\2\u017d" +
                    "\u017e\7\36\2\2\u017e\u017f\5T+\2\u017f\u0180\7\37\2\2\u0180A\3\2\2\2" +
                    "\u0181\u0182\5H%\2\u0182\u0184\7P\2\2\u0183\u0185\5J&\2\u0184\u0183\3" +
                    "\2\2\2\u0184\u0185\3\2\2\2\u0185\u0191\3\2\2\2\u0186\u0187\5H%\2\u0187" +
                    "\u0188\7 \2\2\u0188\u018a\7\5\2\2\u0189\u018b\5D#\2\u018a\u0189\3\2\2" +
                    "\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e" +
                    "\3\2\2\2\u018e\u018f\7\6\2\2\u018f\u0191\3\2\2\2\u0190\u0181\3\2\2\2\u0190" +
                    "\u0186\3\2\2\2\u0191C\3\2\2\2\u0192\u0193\5B\"\2\u0193\u0198\5F$\2\u0194" +
                    "\u0195\7\r\2\2\u0195\u0197\5F$\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2" +
                    "\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198" +
                    "\3\2\2\2\u019b\u019c\7\7\2\2\u019cE\3\2\2\2\u019d\u01a1\7P\2\2\u019e\u01a0" +
                    "\5@!\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1" +
                    "\u01a2\3\2\2\2\u01a2G\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\7\23\2\2" +
                    "\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9" +
                    "\7!\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b1\3\2\2\2\u01aa" +
                    "\u01ac\7\"\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b1\3\2" +
                    "\2\2\u01ad\u01af\7#\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af" +
                    "\u01b1\3\2\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ae\3\2" +
                    "\2\2\u01b1I\3\2\2\2\u01b2\u01b3\7\36\2\2\u01b3\u01b4\5T+\2\u01b4\u01b5" +
                    "\7\r\2\2\u01b5\u01b6\5T+\2\u01b6\u01b7\7\37\2\2\u01b7K\3\2\2\2\u01b8\u01bd" +
                    "\7\5\2\2\u01b9\u01bc\58\35\2\u01ba\u01bc\5\64\33\2\u01bb\u01b9\3\2\2\2" +
                    "\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be" +
                    "\3\2\2\2\u01be\u01c3\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\5N(\2\u01c1" +
                    "\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2" +
                    "\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7\6\2\2\u01c7" +
                    "M\3\2\2\2\u01c8\u020d\5L\'\2\u01c9\u020d\7\7\2\2\u01ca\u01cb\5T+\2\u01cb" +
                    "\u01cc\7\7\2\2\u01cc\u020d\3\2\2\2\u01cd\u01ce\7$\2\2\u01ce\u01cf\7\t" +
                    "\2\2\u01cf\u01d0\5R*\2\u01d0\u01d1\7\7\2\2\u01d1\u01d2\5R*\2\u01d2\u01d3" +
                    "\7\7\2\2\u01d3\u01d4\5R*\2\u01d4\u01d5\7\n\2\2\u01d5\u01d6\5N(\2\u01d6" +
                    "\u020d\3\2\2\2\u01d7\u01d8\7$\2\2\u01d8\u01d9\7\t\2\2\u01d9\u01da\7P\2" +
                    "\2\u01da\u01db\7\35\2\2\u01db\u01dc\5B\"\2\u01dc\u01dd\7\n\2\2\u01dd\u01de" +
                    "\5N(\2\u01de\u020d\3\2\2\2\u01df\u01e0\7%\2\2\u01e0\u01e1\7\t\2\2\u01e1" +
                    "\u01e2\5R*\2\u01e2\u01e3\7\n\2\2\u01e3\u01e4\5N(\2\u01e4\u020d\3\2\2\2" +
                    "\u01e5\u01e6\7&\2\2\u01e6\u01e7\5N(\2\u01e7\u01e8\7%\2\2\u01e8\u01e9\7" +
                    "\t\2\2\u01e9\u01ea\5R*\2\u01ea\u01eb\7\n\2\2\u01eb\u01ec\7\7\2\2\u01ec" +
                    "\u020d\3\2\2\2\u01ed\u01ee\7\'\2\2\u01ee\u01ef\7\t\2\2\u01ef\u01f0\5R" +
                    "*\2\u01f0\u01f1\7\n\2\2\u01f1\u01f4\5N(\2\u01f2\u01f3\7(\2\2\u01f3\u01f5" +
                    "\5N(\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u020d\3\2\2\2\u01f6" +
                    "\u01f7\7)\2\2\u01f7\u020d\7\7\2\2\u01f8\u01f9\7*\2\2\u01f9\u020d\7\7\2" +
                    "\2\u01fa\u01fb\7+\2\2\u01fb\u01fc\7\t\2\2\u01fc\u01fd\5R*\2\u01fd\u01fe" +
                    "\7\n\2\2\u01fe\u0200\7\5\2\2\u01ff\u0201\5P)\2\u0200\u01ff\3\2\2\2\u0201" +
                    "\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2" +
                    "\2\2\u0204\u0205\7\6\2\2\u0205\u020d\3\2\2\2\u0206\u0207\7,\2\2\u0207" +
                    "\u020d\7\7\2\2\u0208\u0209\7,\2\2\u0209\u020a\5T+\2\u020a\u020b\7\7\2" +
                    "\2\u020b\u020d\3\2\2\2\u020c\u01c8\3\2\2\2\u020c\u01c9\3\2\2\2\u020c\u01ca" +
                    "\3\2\2\2\u020c\u01cd\3\2\2\2\u020c\u01d7\3\2\2\2\u020c\u01df\3\2\2\2\u020c" +
                    "\u01e5\3\2\2\2\u020c\u01ed\3\2\2\2\u020c\u01f6\3\2\2\2\u020c\u01f8\3\2" +
                    "\2\2\u020c\u01fa\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0208\3\2\2\2\u020d" +
                    "O\3\2\2\2\u020e\u020f\7-\2\2\u020f\u0210\5T+\2\u0210\u0214\7\35\2\2\u0211" +
                    "\u0213\5N(\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2" +
                    "\2\u0214\u0215\3\2\2\2\u0215\u0220\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218" +
                    "\7.\2\2\u0218\u021c\7\35\2\2\u0219\u021b\5N(\2\u021a\u0219\3\2\2\2\u021b" +
                    "\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0220\3\2" +
                    "\2\2\u021e\u021c\3\2\2\2\u021f\u020e\3\2\2\2\u021f\u0217\3\2\2\2\u0220" +
                    "Q\3\2\2\2\u0221\u0226\5T+\2\u0222\u0223\7\r\2\2\u0223\u0225\5T+\2\u0224" +
                    "\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2" +
                    "\2\2\u0227S\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\b+\1\2\u022a\u0250" +
                    "\7P\2\2\u022b\u0250\7Q\2\2\u022c\u0250\7R\2\2\u022d\u0250\7/\2\2\u022e" +
                    "\u0250\7\60\2\2\u022f\u0230\7P\2\2\u0230\u0231\7\t\2\2\u0231\u0232\5V" +
                    ",\2\u0232\u0233\7\n\2\2\u0233\u0250\3\2\2\2\u0234\u0235\7\t\2\2\u0235" +
                    "\u0236\5T+\2\u0236\u0237\7\n\2\2\u0237\u0250\3\2\2\2\u0238\u0239\7\61" +
                    "\2\2\u0239\u0250\5T+\17\u023a\u023b\7\62\2\2\u023b\u0250\5T+\r\u023c\u023d" +
                    "\5Z.\2\u023d\u023e\5T+\13\u023e\u0250\3\2\2\2\u023f\u0240\7\65\2\2\u0240" +
                    "\u0241\7\t\2\2\u0241\u0242\7P\2\2\u0242\u0243\7\35\2\2\u0243\u0244\5B" +
                    "\"\2\u0244\u0245\7\n\2\2\u0245\u0246\5T+\4\u0246\u0250\3\2\2\2\u0247\u0248" +
                    "\7\66\2\2\u0248\u0249\7\t\2\2\u0249\u024a\7P\2\2\u024a\u024b\7\35\2\2" +
                    "\u024b\u024c\5B\"\2\u024c\u024d\7\n\2\2\u024d\u024e\5T+\3\u024e\u0250" +
                    "\3\2\2\2\u024f\u0229\3\2\2\2\u024f\u022b\3\2\2\2\u024f\u022c\3\2\2\2\u024f" +
                    "\u022d\3\2\2\2\u024f\u022e\3\2\2\2\u024f\u022f\3\2\2\2\u024f\u0234\3\2" +
                    "\2\2\u024f\u0238\3\2\2\2\u024f\u023a\3\2\2\2\u024f\u023c\3\2\2\2\u024f" +
                    "\u023f\3\2\2\2\u024f\u0247\3\2\2\2\u0250\u0277\3\2\2\2\u0251\u0252\f\f" +
                    "\2\2\u0252\u0253\5X-\2\u0253\u0254\5T+\r\u0254\u0276\3\2\2\2\u0255\u0256" +
                    "\f\n\2\2\u0256\u0257\5\\/\2\u0257\u0258\5T+\13\u0258\u0276\3\2\2\2\u0259" +
                    "\u025a\f\t\2\2\u025a\u025b\5^\60\2\u025b\u025c\5T+\n\u025c\u0276\3\2\2" +
                    "\2\u025d\u025e\f\b\2\2\u025e\u025f\5`\61\2\u025f\u0260\5T+\t\u0260\u0276" +
                    "\3\2\2\2\u0261\u0262\f\7\2\2\u0262\u0263\7\32\2\2\u0263\u0264\5T+\2\u0264" +
                    "\u0265\7\35\2\2\u0265\u0266\5T+\b\u0266\u0276\3\2\2\2\u0267\u0268\f\22" +
                    "\2\2\u0268\u0269\7\36\2\2\u0269\u026a\5T+\2\u026a\u026b\7\37\2\2\u026b" +
                    "\u0276\3\2\2\2\u026c\u026d\f\20\2\2\u026d\u0276\7\61\2\2\u026e\u026f\f" +
                    "\16\2\2\u026f\u0276\7\62\2\2\u0270\u0271\f\6\2\2\u0271\u0272\7\63\2\2" +
                    "\u0272\u0276\7P\2\2\u0273\u0274\f\5\2\2\u0274\u0276\7\64\2\2\u0275\u0251" +
                    "\3\2\2\2\u0275\u0255\3\2\2\2\u0275\u0259\3\2\2\2\u0275\u025d\3\2\2\2\u0275" +
                    "\u0261\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u026c\3\2\2\2\u0275\u026e\3\2" +
                    "\2\2\u0275\u0270\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0279\3\2\2\2\u0277" +
                    "\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278U\3\2\2\2\u0279\u0277\3\2\2\2" +
                    "\u027a\u027f\5T+\2\u027b\u027c\7\r\2\2\u027c\u027e\5T+\2\u027d\u027b\3" +
                    "\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280" +
                    "\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u027a\3\2\2\2\u0282\u0283\3\2" +
                    "\2\2\u0283W\3\2\2\2\u0284\u0285\t\4\2\2\u0285Y\3\2\2\2\u0286\u0287\t\5" +
                    "\2\2\u0287[\3\2\2\2\u0288\u0289\t\6\2\2\u0289]\3\2\2\2\u028a\u028b\t\7" +
                    "\2\2\u028b_\3\2\2\2\u028c\u028d\t\b\2\2\u028da\3\2\2\2=eoy\u0092\u0097" +
                    "\u00a2\u00ad\u00b0\u00b6\u00bc\u00ce\u00d0\u00d5\u00d8\u00dc\u00e4\u00ee" +
                    "\u00fd\u010a\u0118\u011c\u011f\u0122\u013a\u0143\u014c\u0155\u015a\u0160" +
                    "\u0165\u0167\u0170\u0175\u0179\u0184\u018c\u0190\u0198\u01a1\u01a5\u01a8" +
                    "\u01ab\u01ae\u01b0\u01bb\u01bd\u01c3\u01f4\u0202\u020c\u0214\u021c\u021f" +
                    "\u0226\u024f\u0275\u0277\u027f\u0282";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'import'", "'\"'", "'{'", "'}'", "';'", "'='", "'('", "')'", "':='",
            "'system'", "','", "'<'", "'&'", "'process'", "'state'", "'commit'", "'urgent'",
            "'init'", "'trans'", "'-'", "'guard'", "'sync'", "'!'", "'?'", "'assign'",
            "'typedef'", "':'", "'['", "']'", "'struct'", "'broadcast'", "'const'",
            "'meta'", "'for'", "'while'", "'do'", "'if'", "'else'", "'break'", "'continue'",
            "'switch'", "'return'", "'case'", "'default'", "'true'", "'false'", "'++'",
            "'--'", "'.'", "'''", "'exists'", "'forall'", "'+='", "'-='", "'*='",
            "'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'<='",
            "'=='", "'!='", "'>='", "'>'", "'*'", "'/'", "'%'", "'|'", "'^'", "'<<'",
            "'>>'", "'&&'", "'||'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, "ID", "NAT", "FLOAT", "WS", "BLOCK_COMMENT",
            "LINE_COMMENT", "PATH"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public uppaalParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "uppaal.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final XtaContext xta() throws RecognitionException {
        XtaContext _localctx = new XtaContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_xta);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__13) | (1L << T__16) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la == ID) {
                    {
                        {
                            setState(96);
                            declaration();
                        }
                    }
                    setState(101);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(102);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_declaration);
        try {
            setState(109);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(104);
                    functionDecl();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(105);
                    variableDecl();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(106);
                    typeDecl();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(107);
                    procDecl();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(108);
                    importDecl();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ImportDeclContext importDecl() throws RecognitionException {
        ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_importDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(111);
                match(T__0);
                setState(112);
                match(T__1);
                setState(113);
                match(PATH);
                setState(114);
                match(T__1);
                setState(115);
                match(T__2);
                setState(117);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(116);
                            prototype();
                        }
                    }
                    setState(119);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__29 - 17)) | (1L << (T__30 - 17)) | (1L << (T__31 - 17)) | (1L << (T__32 - 17)) | (1L << (ID - 17)))) != 0));
                setState(121);
                match(T__3);
                setState(122);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrototypeContext prototype() throws RecognitionException {
        PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_prototype);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                type();
                setState(125);
                match(ID);
                setState(126);
                parameterList();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InstantiationContext instantiation() throws RecognitionException {
        InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_instantiation);
        try {
            setState(144);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(128);
                    match(ID);
                    setState(129);
                    match(T__5);
                    setState(130);
                    match(ID);
                    setState(131);
                    match(T__6);
                    setState(132);
                    argList();
                    setState(133);
                    match(T__7);
                    setState(134);
                    match(T__4);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(136);
                    match(ID);
                    setState(137);
                    match(T__8);
                    setState(138);
                    match(ID);
                    setState(139);
                    match(T__6);
                    setState(140);
                    argList();
                    setState(141);
                    match(T__7);
                    setState(142);
                    match(T__4);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SystemBlockContext systemBlock() throws RecognitionException {
        SystemBlockContext _localctx = new SystemBlockContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_systemBlock);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(146);
                            instantiation();
                        }
                    }
                    setState(151);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(152);
                system();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SystemContext system() throws RecognitionException {
        SystemContext _localctx = new SystemContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_system);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(154);
                match(T__9);
                setState(155);
                match(ID);
                setState(160);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10 || _la == T__11) {
                    {
                        {
                            setState(156);
                            _la = _input.LA(1);
                            if (!(_la == T__10 || _la == T__11)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(157);
                            match(ID);
                        }
                    }
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(163);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParameterListContext parameterList() throws RecognitionException {
        ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_parameterList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                match(T__6);
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__29 - 17)) | (1L << (T__30 - 17)) | (1L << (T__31 - 17)) | (1L << (T__32 - 17)) | (1L << (ID - 17)))) != 0)) {
                    {
                        setState(166);
                        parameter();
                        setState(171);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__10) {
                            {
                                {
                                    setState(167);
                                    match(T__10);
                                    setState(168);
                                    parameter();
                                }
                            }
                            setState(173);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(176);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParameterContext parameter() throws RecognitionException {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_parameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(178);
                type();
                setState(180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__12) {
                    {
                        setState(179);
                        match(T__12);
                    }
                }

                setState(182);
                match(ID);
                setState(186);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__27) {
                    {
                        {
                            setState(183);
                            arrayDecl();
                        }
                    }
                    setState(188);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionDeclContext functionDecl() throws RecognitionException {
        FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_functionDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                type();
                setState(190);
                match(ID);
                setState(191);
                parameterList();
                setState(192);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ProcDeclContext procDecl() throws RecognitionException {
        ProcDeclContext _localctx = new ProcDeclContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_procDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                match(T__13);
                setState(195);
                match(ID);
                setState(196);
                parameterList();
                setState(197);
                match(T__2);
                setState(198);
                procBody();
                setState(199);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ProcBodyContext procBody() throws RecognitionException {
        ProcBodyContext _localctx = new ProcBodyContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_procBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__25 - 17)) | (1L << (T__29 - 17)) | (1L << (T__30 - 17)) | (1L << (T__31 - 17)) | (1L << (T__32 - 17)) | (1L << (ID - 17)))) != 0)) {
                    {
                        setState(204);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                            case 1: {
                                setState(201);
                                functionDecl();
                            }
                            break;
                            case 2: {
                                setState(202);
                                variableDecl();
                            }
                            break;
                            case 3: {
                                setState(203);
                                typeDecl();
                            }
                            break;
                        }
                    }
                    setState(208);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(209);
                states();
                setState(211);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__15) {
                    {
                        setState(210);
                        commit();
                    }
                }

                setState(214);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__16) {
                    {
                        setState(213);
                        urgent();
                    }
                }

                setState(216);
                init();
                setState(218);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__18) {
                    {
                        setState(217);
                        transitions();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatesContext states() throws RecognitionException {
        StatesContext _localctx = new StatesContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_states);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(220);
                match(T__14);
                setState(221);
                stateDecl();
                setState(226);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(222);
                            match(T__10);
                            setState(223);
                            stateDecl();
                        }
                    }
                    setState(228);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(229);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StateDeclContext stateDecl() throws RecognitionException {
        StateDeclContext _localctx = new StateDeclContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_stateDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                match(ID);
                setState(236);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(232);
                        match(T__2);
                        setState(233);
                        expression(0);
                        setState(234);
                        match(T__3);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CommitContext commit() throws RecognitionException {
        CommitContext _localctx = new CommitContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_commit);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(T__15);
                setState(239);
                stateList();
                setState(240);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final UrgentContext urgent() throws RecognitionException {
        UrgentContext _localctx = new UrgentContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_urgent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                match(T__16);
                setState(243);
                stateList();
                setState(244);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StateListContext stateList() throws RecognitionException {
        StateListContext _localctx = new StateListContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_stateList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(246);
                match(ID);
                setState(251);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(247);
                            match(T__10);
                            setState(248);
                            match(ID);
                        }
                    }
                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InitContext init() throws RecognitionException {
        InitContext _localctx = new InitContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_init);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(T__17);
                setState(255);
                match(ID);
                setState(256);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TransitionsContext transitions() throws RecognitionException {
        TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_transitions);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                match(T__18);
                setState(259);
                transition();
                setState(264);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(260);
                            match(T__10);
                            setState(261);
                            transitionOpt();
                        }
                    }
                    setState(266);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(267);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TransitionContext transition() throws RecognitionException {
        TransitionContext _localctx = new TransitionContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_transition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(269);
                match(ID);
                setState(270);
                match(T__19);
                setState(271);
                match(ID);
                setState(272);
                transitionBody();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TransitionOptContext transitionOpt() throws RecognitionException {
        TransitionOptContext _localctx = new TransitionOptContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_transitionOpt);
        try {
            setState(278);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(274);
                    transition();
                }
                break;
                case T__19:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(275);
                    match(T__19);
                    setState(276);
                    match(ID);
                    setState(277);
                    transitionBody();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TransitionBodyContext transitionBody() throws RecognitionException {
        TransitionBodyContext _localctx = new TransitionBodyContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_transitionBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(280);
                match(T__2);
                setState(282);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__20) {
                    {
                        setState(281);
                        guard();
                    }
                }

                setState(285);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__21) {
                    {
                        setState(284);
                        sync();
                    }
                }

                setState(288);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__24) {
                    {
                        setState(287);
                        assign();
                    }
                }

                setState(290);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GuardContext guard() throws RecognitionException {
        GuardContext _localctx = new GuardContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_guard);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(292);
                match(T__20);
                setState(293);
                expression(0);
                setState(294);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SyncContext sync() throws RecognitionException {
        SyncContext _localctx = new SyncContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_sync);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(296);
                match(T__21);
                setState(297);
                expression(0);
                setState(298);
                _la = _input.LA(1);
                if (!(_la == T__22 || _la == T__23)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(299);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssignContext assign() throws RecognitionException {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_assign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(301);
                match(T__24);
                setState(302);
                exprList();
                setState(303);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeDeclContext typeDecl() throws RecognitionException {
        TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_typeDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                match(T__25);
                setState(306);
                type();
                setState(307);
                typeIdList();
                setState(312);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(308);
                            match(T__10);
                            setState(309);
                            typeIdList();
                        }
                    }
                    setState(314);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(315);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeIdListContext typeIdList() throws RecognitionException {
        TypeIdListContext _localctx = new TypeIdListContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_typeIdList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(317);
                match(ID);
                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__27) {
                    {
                        {
                            setState(318);
                            arrayDecl();
                        }
                    }
                    setState(323);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDeclContext variableDecl() throws RecognitionException {
        VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_variableDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(324);
                type();
                setState(325);
                declId();
                setState(330);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(326);
                            match(T__10);
                            setState(327);
                            declId();
                        }
                    }
                    setState(332);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(333);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclIdContext declId() throws RecognitionException {
        DeclIdContext _localctx = new DeclIdContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_declId);
        int _la;
        try {
            setState(357);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(335);
                    match(ID);
                    setState(339);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__27) {
                        {
                            {
                                setState(336);
                                arrayDecl();
                            }
                        }
                        setState(341);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(344);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__5) {
                        {
                            setState(342);
                            match(T__5);
                            setState(343);
                            initialiser();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(346);
                    match(ID);
                    setState(350);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__27) {
                        {
                            {
                                setState(347);
                                arrayDecl();
                            }
                        }
                        setState(352);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(355);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__8) {
                        {
                            setState(353);
                            match(T__8);
                            setState(354);
                            initialiser();
                        }
                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final InitialiserContext initialiser() throws RecognitionException {
        InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_initialiser);
        int _la;
        try {
            setState(371);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__6:
                case T__19:
                case T__22:
                case T__44:
                case T__45:
                case T__46:
                case T__47:
                case T__50:
                case T__51:
                case T__62:
                case ID:
                case NAT:
                case FLOAT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(359);
                    expression(0);
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(360);
                    match(T__2);
                    setState(361);
                    fieldInit();
                    setState(366);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__10) {
                        {
                            {
                                setState(362);
                                match(T__10);
                                setState(363);
                                fieldInit();
                            }
                        }
                        setState(368);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(369);
                    match(T__3);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldInitContext fieldInit() throws RecognitionException {
        FieldInitContext _localctx = new FieldInitContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_fieldInit);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(375);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                    case 1: {
                        setState(373);
                        match(ID);
                        setState(374);
                        match(T__26);
                    }
                    break;
                }
                setState(377);
                initialiser();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArrayDeclContext arrayDecl() throws RecognitionException {
        ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_arrayDecl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(379);
                match(T__27);
                setState(380);
                expression(0);
                setState(381);
                match(T__28);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_type);
        int _la;
        try {
            setState(398);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(383);
                    prefix();
                    setState(384);
                    match(ID);
                    setState(386);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__27) {
                        {
                            setState(385);
                            range();
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(388);
                    prefix();
                    setState(389);
                    match(T__29);
                    setState(390);
                    match(T__2);
                    setState(392);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(391);
                                fieldDecl();
                            }
                        }
                        setState(394);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__29 - 17)) | (1L << (T__30 - 17)) | (1L << (T__31 - 17)) | (1L << (T__32 - 17)) | (1L << (ID - 17)))) != 0));
                    setState(396);
                    match(T__3);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldDeclContext fieldDecl() throws RecognitionException {
        FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_fieldDecl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(400);
                type();
                setState(401);
                fieldDeclId();
                setState(406);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(402);
                            match(T__10);
                            setState(403);
                            fieldDeclId();
                        }
                    }
                    setState(408);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(409);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldDeclIdContext fieldDeclId() throws RecognitionException {
        FieldDeclIdContext _localctx = new FieldDeclIdContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_fieldDeclId);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(411);
                match(ID);
                setState(415);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__27) {
                    {
                        {
                            setState(412);
                            arrayDecl();
                        }
                    }
                    setState(417);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrefixContext prefix() throws RecognitionException {
        PrefixContext _localctx = new PrefixContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_prefix);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(430);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                    case 1: {
                        setState(419);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__16) {
                            {
                                setState(418);
                                match(T__16);
                            }
                        }

                        setState(422);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__30) {
                            {
                                setState(421);
                                match(T__30);
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(425);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__31) {
                            {
                                setState(424);
                                match(T__31);
                            }
                        }

                    }
                    break;
                    case 3: {
                        setState(428);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == T__32) {
                            {
                                setState(427);
                                match(T__32);
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RangeContext range() throws RecognitionException {
        RangeContext _localctx = new RangeContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_range);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(432);
                match(T__27);
                setState(433);
                expression(0);
                setState(434);
                match(T__10);
                setState(435);
                expression(0);
                setState(436);
                match(T__28);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_block);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(438);
                match(T__2);
                setState(443);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(441);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case T__16:
                                case T__29:
                                case T__30:
                                case T__31:
                                case T__32:
                                case ID: {
                                    setState(439);
                                    variableDecl();
                                }
                                break;
                                case T__25: {
                                    setState(440);
                                    typeDecl();
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }
                    setState(445);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                }
                setState(449);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__19) | (1L << T__22) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__62))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (ID - 78)) | (1L << (NAT - 78)) | (1L << (FLOAT - 78)))) != 0)) {
                    {
                        {
                            setState(446);
                            statement();
                        }
                    }
                    setState(451);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(452);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_statement);
        int _la;
        try {
            setState(522);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(454);
                    block();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(455);
                    match(T__4);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(456);
                    expression(0);
                    setState(457);
                    match(T__4);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(459);
                    match(T__33);
                    setState(460);
                    match(T__6);
                    setState(461);
                    exprList();
                    setState(462);
                    match(T__4);
                    setState(463);
                    exprList();
                    setState(464);
                    match(T__4);
                    setState(465);
                    exprList();
                    setState(466);
                    match(T__7);
                    setState(467);
                    statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(469);
                    match(T__33);
                    setState(470);
                    match(T__6);
                    setState(471);
                    match(ID);
                    setState(472);
                    match(T__26);
                    setState(473);
                    type();
                    setState(474);
                    match(T__7);
                    setState(475);
                    statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(477);
                    match(T__34);
                    setState(478);
                    match(T__6);
                    setState(479);
                    exprList();
                    setState(480);
                    match(T__7);
                    setState(481);
                    statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(483);
                    match(T__35);
                    setState(484);
                    statement();
                    setState(485);
                    match(T__34);
                    setState(486);
                    match(T__6);
                    setState(487);
                    exprList();
                    setState(488);
                    match(T__7);
                    setState(489);
                    match(T__4);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(491);
                    match(T__36);
                    setState(492);
                    match(T__6);
                    setState(493);
                    exprList();
                    setState(494);
                    match(T__7);
                    setState(495);
                    statement();
                    setState(498);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                        case 1: {
                            setState(496);
                            match(T__37);
                            setState(497);
                            statement();
                        }
                        break;
                    }
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(500);
                    match(T__38);
                    setState(501);
                    match(T__4);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(502);
                    match(T__39);
                    setState(503);
                    match(T__4);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(504);
                    match(T__40);
                    setState(505);
                    match(T__6);
                    setState(506);
                    exprList();
                    setState(507);
                    match(T__7);
                    setState(508);
                    match(T__2);
                    setState(510);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(509);
                                caseExpr();
                            }
                        }
                        setState(512);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == T__42 || _la == T__43);
                    setState(514);
                    match(T__3);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(516);
                    match(T__41);
                    setState(517);
                    match(T__4);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(518);
                    match(T__41);
                    setState(519);
                    expression(0);
                    setState(520);
                    match(T__4);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CaseExprContext caseExpr() throws RecognitionException {
        CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_caseExpr);
        int _la;
        try {
            setState(541);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__42:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(524);
                    match(T__42);
                    setState(525);
                    expression(0);
                    setState(526);
                    match(T__26);
                    setState(530);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__19) | (1L << T__22) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__62))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (ID - 78)) | (1L << (NAT - 78)) | (1L << (FLOAT - 78)))) != 0)) {
                        {
                            {
                                setState(527);
                                statement();
                            }
                        }
                        setState(532);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case T__43:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(533);
                    match(T__43);
                    setState(534);
                    match(T__26);
                    setState(538);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__19) | (1L << T__22) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__62))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (ID - 78)) | (1L << (NAT - 78)) | (1L << (FLOAT - 78)))) != 0)) {
                        {
                            {
                                setState(535);
                                statement();
                            }
                        }
                        setState(540);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprListContext exprList() throws RecognitionException {
        ExprListContext _localctx = new ExprListContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_exprList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(543);
                expression(0);
                setState(548);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__10) {
                    {
                        {
                            setState(544);
                            match(T__10);
                            setState(545);
                            expression(0);
                        }
                    }
                    setState(550);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 82;
        enterRecursionRule(_localctx, 82, RULE_expression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(589);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
                    case 1: {
                        setState(552);
                        match(ID);
                    }
                    break;
                    case 2: {
                        setState(553);
                        match(NAT);
                    }
                    break;
                    case 3: {
                        setState(554);
                        match(FLOAT);
                    }
                    break;
                    case 4: {
                        setState(555);
                        match(T__44);
                    }
                    break;
                    case 5: {
                        setState(556);
                        match(T__45);
                    }
                    break;
                    case 6: {
                        setState(557);
                        match(ID);
                        setState(558);
                        match(T__6);
                        setState(559);
                        argList();
                        setState(560);
                        match(T__7);
                    }
                    break;
                    case 7: {
                        setState(562);
                        match(T__6);
                        setState(563);
                        expression(0);
                        setState(564);
                        match(T__7);
                    }
                    break;
                    case 8: {
                        setState(566);
                        match(T__46);
                        setState(567);
                        expression(13);
                    }
                    break;
                    case 9: {
                        setState(568);
                        match(T__47);
                        setState(569);
                        expression(11);
                    }
                    break;
                    case 10: {
                        setState(570);
                        unaryOp();
                        setState(571);
                        expression(9);
                    }
                    break;
                    case 11: {
                        setState(573);
                        match(T__50);
                        setState(574);
                        match(T__6);
                        setState(575);
                        match(ID);
                        setState(576);
                        match(T__26);
                        setState(577);
                        type();
                        setState(578);
                        match(T__7);
                        setState(579);
                        expression(2);
                    }
                    break;
                    case 12: {
                        setState(581);
                        match(T__51);
                        setState(582);
                        match(T__6);
                        setState(583);
                        match(ID);
                        setState(584);
                        match(T__26);
                        setState(585);
                        type();
                        setState(586);
                        match(T__7);
                        setState(587);
                        expression(1);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(629);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(627);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                                case 1: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(591);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(592);
                                    assignOp();
                                    setState(593);
                                    expression(11);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(595);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(596);
                                    rel();
                                    setState(597);
                                    expression(9);
                                }
                                break;
                                case 3: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(599);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(600);
                                    binIntOp();
                                    setState(601);
                                    expression(8);
                                }
                                break;
                                case 4: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(603);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(604);
                                    binBoolOp();
                                    setState(605);
                                    expression(7);
                                }
                                break;
                                case 5: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(607);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(608);
                                    match(T__23);
                                    setState(609);
                                    expression(0);
                                    setState(610);
                                    match(T__26);
                                    setState(611);
                                    expression(6);
                                }
                                break;
                                case 6: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(613);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(614);
                                    match(T__27);
                                    setState(615);
                                    expression(0);
                                    setState(616);
                                    match(T__28);
                                }
                                break;
                                case 7: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(618);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(619);
                                    match(T__46);
                                }
                                break;
                                case 8: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(620);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(621);
                                    match(T__47);
                                }
                                break;
                                case 9: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(622);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(623);
                                    match(T__48);
                                    setState(624);
                                    match(ID);
                                }
                                break;
                                case 10: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(625);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(626);
                                    match(T__49);
                                }
                                break;
                            }
                        }
                    }
                    setState(631);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final ArgListContext argList() throws RecognitionException {
        ArgListContext _localctx = new ArgListContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_argList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(640);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__19) | (1L << T__22) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__62))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (ID - 78)) | (1L << (NAT - 78)) | (1L << (FLOAT - 78)))) != 0)) {
                    {
                        setState(632);
                        expression(0);
                        setState(637);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__10) {
                            {
                                {
                                    setState(633);
                                    match(T__10);
                                    setState(634);
                                    expression(0);
                                }
                            }
                            setState(639);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssignOpContext assignOp() throws RecognitionException {
        AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_assignOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(642);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final UnaryOpContext unaryOp() throws RecognitionException {
        UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_unaryOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(644);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__22) | (1L << T__62))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RelContext rel() throws RecognitionException {
        RelContext _localctx = new RelContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_rel);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(646);
                _la = _input.LA(1);
                if (!(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__63 - 12)) | (1L << (T__64 - 12)) | (1L << (T__65 - 12)) | (1L << (T__66 - 12)) | (1L << (T__67 - 12)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BinIntOpContext binIntOp() throws RecognitionException {
        BinIntOpContext _localctx = new BinIntOpContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_binIntOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(648);
                _la = _input.LA(1);
                if (!(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__19 - 13)) | (1L << (T__62 - 13)) | (1L << (T__68 - 13)) | (1L << (T__69 - 13)) | (1L << (T__70 - 13)) | (1L << (T__71 - 13)) | (1L << (T__72 - 13)) | (1L << (T__73 - 13)) | (1L << (T__74 - 13)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BinBoolOpContext binBoolOp() throws RecognitionException {
        BinBoolOpContext _localctx = new BinBoolOpContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_binBoolOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(650);
                _la = _input.LA(1);
                if (!(_la == T__75 || _la == T__76)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 41:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 10);
            case 1:
                return precpred(_ctx, 8);
            case 2:
                return precpred(_ctx, 7);
            case 3:
                return precpred(_ctx, 6);
            case 4:
                return precpred(_ctx, 5);
            case 5:
                return precpred(_ctx, 16);
            case 6:
                return precpred(_ctx, 14);
            case 7:
                return precpred(_ctx, 12);
            case 8:
                return precpred(_ctx, 4);
            case 9:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static class XtaContext extends ParserRuleContext {
        public XtaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(uppaalParser.EOF, 0);
        }

        public List<DeclarationContext> declaration() {
            return getRuleContexts(DeclarationContext.class);
        }

        public DeclarationContext declaration(int i) {
            return getRuleContext(DeclarationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_xta;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterXta(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitXta(this);
        }
    }

    public static class DeclarationContext extends ParserRuleContext {
        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctionDeclContext functionDecl() {
            return getRuleContext(FunctionDeclContext.class, 0);
        }

        public VariableDeclContext variableDecl() {
            return getRuleContext(VariableDeclContext.class, 0);
        }

        public TypeDeclContext typeDecl() {
            return getRuleContext(TypeDeclContext.class, 0);
        }

        public ProcDeclContext procDecl() {
            return getRuleContext(ProcDeclContext.class, 0);
        }

        public ImportDeclContext importDecl() {
            return getRuleContext(ImportDeclContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitDeclaration(this);
        }
    }

    public static class ImportDeclContext extends ParserRuleContext {
        public ImportDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PATH() {
            return getToken(uppaalParser.PATH, 0);
        }

        public List<PrototypeContext> prototype() {
            return getRuleContexts(PrototypeContext.class);
        }

        public PrototypeContext prototype(int i) {
            return getRuleContext(PrototypeContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterImportDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitImportDecl(this);
        }
    }

    public static class PrototypeContext extends ParserRuleContext {
        public PrototypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prototype;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterPrototype(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitPrototype(this);
        }
    }

    public static class InstantiationContext extends ParserRuleContext {
        public InstantiationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(uppaalParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(uppaalParser.ID, i);
        }

        public ArgListContext argList() {
            return getRuleContext(ArgListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_instantiation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterInstantiation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitInstantiation(this);
        }
    }

    public static class SystemBlockContext extends ParserRuleContext {
        public SystemBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public SystemContext system() {
            return getRuleContext(SystemContext.class, 0);
        }

        public List<InstantiationContext> instantiation() {
            return getRuleContexts(InstantiationContext.class);
        }

        public InstantiationContext instantiation(int i) {
            return getRuleContext(InstantiationContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_systemBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterSystemBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitSystemBlock(this);
        }
    }

    public static class SystemContext extends ParserRuleContext {
        public SystemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(uppaalParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(uppaalParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_system;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterSystem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitSystem(this);
        }
    }

    public static class ParameterListContext extends ParserRuleContext {
        public ParameterListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ParameterContext> parameter() {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i) {
            return getRuleContext(ParameterContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterParameterList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitParameterList(this);
        }
    }

    public static class ParameterContext extends ParserRuleContext {
        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public List<ArrayDeclContext> arrayDecl() {
            return getRuleContexts(ArrayDeclContext.class);
        }

        public ArrayDeclContext arrayDecl(int i) {
            return getRuleContext(ArrayDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitParameter(this);
        }
    }

    public static class FunctionDeclContext extends ParserRuleContext {
        public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterFunctionDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitFunctionDecl(this);
        }
    }

    public static class ProcDeclContext extends ParserRuleContext {
        public ProcDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public ParameterListContext parameterList() {
            return getRuleContext(ParameterListContext.class, 0);
        }

        public ProcBodyContext procBody() {
            return getRuleContext(ProcBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_procDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterProcDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitProcDecl(this);
        }
    }

    public static class ProcBodyContext extends ParserRuleContext {
        public ProcBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatesContext states() {
            return getRuleContext(StatesContext.class, 0);
        }

        public InitContext init() {
            return getRuleContext(InitContext.class, 0);
        }

        public List<FunctionDeclContext> functionDecl() {
            return getRuleContexts(FunctionDeclContext.class);
        }

        public FunctionDeclContext functionDecl(int i) {
            return getRuleContext(FunctionDeclContext.class, i);
        }

        public List<VariableDeclContext> variableDecl() {
            return getRuleContexts(VariableDeclContext.class);
        }

        public VariableDeclContext variableDecl(int i) {
            return getRuleContext(VariableDeclContext.class, i);
        }

        public List<TypeDeclContext> typeDecl() {
            return getRuleContexts(TypeDeclContext.class);
        }

        public TypeDeclContext typeDecl(int i) {
            return getRuleContext(TypeDeclContext.class, i);
        }

        public CommitContext commit() {
            return getRuleContext(CommitContext.class, 0);
        }

        public UrgentContext urgent() {
            return getRuleContext(UrgentContext.class, 0);
        }

        public TransitionsContext transitions() {
            return getRuleContext(TransitionsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_procBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterProcBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitProcBody(this);
        }
    }

    public static class StatesContext extends ParserRuleContext {
        public StatesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StateDeclContext> stateDecl() {
            return getRuleContexts(StateDeclContext.class);
        }

        public StateDeclContext stateDecl(int i) {
            return getRuleContext(StateDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_states;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterStates(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitStates(this);
        }
    }

    public static class StateDeclContext extends ParserRuleContext {
        public StateDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stateDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterStateDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitStateDecl(this);
        }
    }

    public static class CommitContext extends ParserRuleContext {
        public CommitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StateListContext stateList() {
            return getRuleContext(StateListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_commit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterCommit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitCommit(this);
        }
    }

    public static class UrgentContext extends ParserRuleContext {
        public UrgentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StateListContext stateList() {
            return getRuleContext(StateListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_urgent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterUrgent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitUrgent(this);
        }
    }

    public static class StateListContext extends ParserRuleContext {
        public StateListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(uppaalParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(uppaalParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stateList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterStateList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitStateList(this);
        }
    }

    public static class InitContext extends ParserRuleContext {
        public InitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_init;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterInit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitInit(this);
        }
    }

    public static class TransitionsContext extends ParserRuleContext {
        public TransitionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TransitionContext transition() {
            return getRuleContext(TransitionContext.class, 0);
        }

        public List<TransitionOptContext> transitionOpt() {
            return getRuleContexts(TransitionOptContext.class);
        }

        public TransitionOptContext transitionOpt(int i) {
            return getRuleContext(TransitionOptContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transitions;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTransitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTransitions(this);
        }
    }

    public static class TransitionContext extends ParserRuleContext {
        public TransitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(uppaalParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(uppaalParser.ID, i);
        }

        public TransitionBodyContext transitionBody() {
            return getRuleContext(TransitionBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTransition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTransition(this);
        }
    }

    public static class TransitionOptContext extends ParserRuleContext {
        public TransitionOptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TransitionContext transition() {
            return getRuleContext(TransitionContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public TransitionBodyContext transitionBody() {
            return getRuleContext(TransitionBodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transitionOpt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTransitionOpt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTransitionOpt(this);
        }
    }

    public static class TransitionBodyContext extends ParserRuleContext {
        public TransitionBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public GuardContext guard() {
            return getRuleContext(GuardContext.class, 0);
        }

        public SyncContext sync() {
            return getRuleContext(SyncContext.class, 0);
        }

        public AssignContext assign() {
            return getRuleContext(AssignContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_transitionBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTransitionBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTransitionBody(this);
        }
    }

    public static class GuardContext extends ParserRuleContext {
        public GuardContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_guard;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterGuard(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitGuard(this);
        }
    }

    public static class SyncContext extends ParserRuleContext {
        public SyncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sync;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterSync(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitSync(this);
        }
    }

    public static class AssignContext extends ParserRuleContext {
        public AssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprListContext exprList() {
            return getRuleContext(ExprListContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitAssign(this);
        }
    }

    public static class TypeDeclContext extends ParserRuleContext {
        public TypeDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<TypeIdListContext> typeIdList() {
            return getRuleContexts(TypeIdListContext.class);
        }

        public TypeIdListContext typeIdList(int i) {
            return getRuleContext(TypeIdListContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTypeDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTypeDecl(this);
        }
    }

    public static class TypeIdListContext extends ParserRuleContext {
        public TypeIdListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public List<ArrayDeclContext> arrayDecl() {
            return getRuleContexts(ArrayDeclContext.class);
        }

        public ArrayDeclContext arrayDecl(int i) {
            return getRuleContext(ArrayDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeIdList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterTypeIdList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitTypeIdList(this);
        }
    }

    public static class VariableDeclContext extends ParserRuleContext {
        public VariableDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<DeclIdContext> declId() {
            return getRuleContexts(DeclIdContext.class);
        }

        public DeclIdContext declId(int i) {
            return getRuleContext(DeclIdContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterVariableDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitVariableDecl(this);
        }
    }

    public static class DeclIdContext extends ParserRuleContext {
        public DeclIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public List<ArrayDeclContext> arrayDecl() {
            return getRuleContexts(ArrayDeclContext.class);
        }

        public ArrayDeclContext arrayDecl(int i) {
            return getRuleContext(ArrayDeclContext.class, i);
        }

        public InitialiserContext initialiser() {
            return getRuleContext(InitialiserContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterDeclId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitDeclId(this);
        }
    }

    public static class InitialiserContext extends ParserRuleContext {
        public InitialiserContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<FieldInitContext> fieldInit() {
            return getRuleContexts(FieldInitContext.class);
        }

        public FieldInitContext fieldInit(int i) {
            return getRuleContext(FieldInitContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_initialiser;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterInitialiser(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitInitialiser(this);
        }
    }

    public static class FieldInitContext extends ParserRuleContext {
        public FieldInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public InitialiserContext initialiser() {
            return getRuleContext(InitialiserContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldInit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterFieldInit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitFieldInit(this);
        }
    }

    public static class ArrayDeclContext extends ParserRuleContext {
        public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterArrayDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitArrayDecl(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrefixContext prefix() {
            return getRuleContext(PrefixContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public RangeContext range() {
            return getRuleContext(RangeContext.class, 0);
        }

        public List<FieldDeclContext> fieldDecl() {
            return getRuleContexts(FieldDeclContext.class);
        }

        public FieldDeclContext fieldDecl(int i) {
            return getRuleContext(FieldDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitType(this);
        }
    }

    public static class FieldDeclContext extends ParserRuleContext {
        public FieldDeclContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<FieldDeclIdContext> fieldDeclId() {
            return getRuleContexts(FieldDeclIdContext.class);
        }

        public FieldDeclIdContext fieldDeclId(int i) {
            return getRuleContext(FieldDeclIdContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDecl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterFieldDecl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitFieldDecl(this);
        }
    }

    public static class FieldDeclIdContext extends ParserRuleContext {
        public FieldDeclIdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public List<ArrayDeclContext> arrayDecl() {
            return getRuleContexts(ArrayDeclContext.class);
        }

        public ArrayDeclContext arrayDecl(int i) {
            return getRuleContext(ArrayDeclContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldDeclId;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterFieldDeclId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitFieldDeclId(this);
        }
    }

    public static class PrefixContext extends ParserRuleContext {
        public PrefixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prefix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterPrefix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitPrefix(this);
        }
    }

    public static class RangeContext extends ParserRuleContext {
        public RangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_range;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterRange(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitRange(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableDeclContext> variableDecl() {
            return getRuleContexts(VariableDeclContext.class);
        }

        public VariableDeclContext variableDecl(int i) {
            return getRuleContext(VariableDeclContext.class, i);
        }

        public List<TypeDeclContext> typeDecl() {
            return getRuleContexts(TypeDeclContext.class);
        }

        public TypeDeclContext typeDecl(int i) {
            return getRuleContext(TypeDeclContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitBlock(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<ExprListContext> exprList() {
            return getRuleContexts(ExprListContext.class);
        }

        public ExprListContext exprList(int i) {
            return getRuleContext(ExprListContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<CaseExprContext> caseExpr() {
            return getRuleContexts(CaseExprContext.class);
        }

        public CaseExprContext caseExpr(int i) {
            return getRuleContext(CaseExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitStatement(this);
        }
    }

    public static class CaseExprContext extends ParserRuleContext {
        public CaseExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_caseExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterCaseExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitCaseExpr(this);
        }
    }

    public static class ExprListContext extends ParserRuleContext {
        public ExprListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exprList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterExprList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitExprList(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(uppaalParser.ID, 0);
        }

        public TerminalNode NAT() {
            return getToken(uppaalParser.NAT, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(uppaalParser.FLOAT, 0);
        }

        public ArgListContext argList() {
            return getRuleContext(ArgListContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public UnaryOpContext unaryOp() {
            return getRuleContext(UnaryOpContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public AssignOpContext assignOp() {
            return getRuleContext(AssignOpContext.class, 0);
        }

        public RelContext rel() {
            return getRuleContext(RelContext.class, 0);
        }

        public BinIntOpContext binIntOp() {
            return getRuleContext(BinIntOpContext.class, 0);
        }

        public BinBoolOpContext binBoolOp() {
            return getRuleContext(BinBoolOpContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitExpression(this);
        }
    }

    public static class ArgListContext extends ParserRuleContext {
        public ArgListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterArgList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitArgList(this);
        }
    }

    public static class AssignOpContext extends ParserRuleContext {
        public AssignOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterAssignOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitAssignOp(this);
        }
    }

    public static class UnaryOpContext extends ParserRuleContext {
        public UnaryOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unaryOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterUnaryOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitUnaryOp(this);
        }
    }

    public static class RelContext extends ParserRuleContext {
        public RelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterRel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitRel(this);
        }
    }

    public static class BinIntOpContext extends ParserRuleContext {
        public BinIntOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_binIntOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterBinIntOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitBinIntOp(this);
        }
    }

    public static class BinBoolOpContext extends ParserRuleContext {
        public BinBoolOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_binBoolOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).enterBinBoolOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof uppaalListener) ((uppaalListener) listener).exitBinBoolOp(this);
        }
    }
}