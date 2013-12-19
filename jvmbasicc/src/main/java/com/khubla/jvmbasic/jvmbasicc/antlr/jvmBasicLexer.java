// Generated from com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g4 by ANTLR 4.1
package com.khubla.jvmbasic.jvmbasicc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jvmBasicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, PERCENT=2, RETURN=3, PRINT=4, GOTO=5, GOSUB=6, IF=7, NEXT=8, 
		THEN=9, REM=10, CHR=11, MID=12, LEFT=13, RIGHT=14, STR=15, LPAREN=16, 
		RPAREN=17, PLUS=18, MINUS=19, TIMES=20, DIV=21, CLEAR=22, GTE=23, LTE=24, 
		GT=25, LT=26, NEQ=27, COMMA=28, LIST=29, RUN=30, END=31, LET=32, EQ=33, 
		FOR=34, TO=35, STEP=36, INPUT=37, SEMICOLON=38, DIM=39, SQR=40, COLON=41, 
		TEXT=42, HGR=43, HGR2=44, LEN=45, CALL=46, ASC=47, HPLOT=48, VPLOT=49, 
		PRNUMBER=50, INNUMBER=51, VTAB=52, HTAB=53, HOME=54, ON=55, PDL=56, PLOT=57, 
		PEEK=58, POKE=59, INTF=60, STOP=61, HIMEM=62, LOMEM=63, FLASH=64, INVERSE=65, 
		NORMAL=66, ONERR=67, SPC=68, FRE=69, POS=70, USR=71, TRACE=72, NOTRACE=73, 
		AND=74, OR=75, DATA=76, WAIT=77, READ=78, XDRAW=79, DRAW=80, AT=81, DEF=82, 
		FN=83, VAL=84, TAB=85, SPEED=86, ROT=87, SCALE=88, COLOR=89, HCOLOR=90, 
		HLIN=91, VLIN=92, SCRN=93, POP=94, SHLOAD=95, SIN=96, COS=97, TAN=98, 
		ATN=99, RND=100, SGN=101, EXP=102, LOG=103, ABS=104, STORE=105, RECALL=106, 
		GET=107, EXPONENT=108, AMPERSAND=109, GR=110, NOT=111, RESTORE=112, SAVE=113, 
		LOAD=114, QUESTION=115, INCLUDE=116, STRINGLITERAL=117, LETTERS=118, NUMBER=119, 
		FLOAT=120, CR=121, WS=122;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'$'", "'%'", "'RETURN'", "'PRINT'", "'GOTO'", "'GOSUB'", "'IF'", "'NEXT'", 
		"'THEN'", "'REM'", "'CHR$'", "'MID$'", "'LEFT$'", "'RIGHT$'", "'STR$'", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'CLEAR'", "'>: '", "'<: '", 
		"'>'", "'<'", "'< >'", "','", "'LIST'", "'RUN'", "'END'", "'LET'", "'='", 
		"'FOR'", "'TO'", "'STEP'", "'INPUT'", "';'", "'DIM'", "'SQR'", "':'", 
		"'TEXT'", "'HGR'", "'HGR2'", "'LEN'", "'CALL'", "'ASC'", "'HPLOT'", "'VPLOT'", 
		"'PR#'", "'IN#'", "'VTAB'", "'HTAB'", "'HOME'", "'ON'", "'PDL'", "'PLOT'", 
		"'PEEK'", "'POKE'", "'INT'", "'STOP'", "'HIMEM'", "'LOMEM'", "'FLASH'", 
		"'INVERSE'", "'NORMAL'", "'ONERR'", "'SPC'", "'FRE'", "'POS'", "'USR'", 
		"'TRACE'", "'NOTRACE'", "'AND'", "'OR'", "'DATA'", "'WAIT'", "'READ'", 
		"'XDRAW'", "'DRAW'", "'AT'", "'DEF'", "'FN'", "'VAL'", "'TAB'", "'SPEED'", 
		"'ROT'", "'SCALE'", "'COLOR'", "'HCOLOR'", "'HLIN'", "'VLIN'", "'SCRN'", 
		"'POP'", "'SHLOAD'", "'SIN'", "'COS'", "'TAN'", "'ATN'", "'RND'", "'SGN'", 
		"'EXP'", "'LOG'", "'ABS'", "'STORE'", "'RECALL'", "'GET'", "'^'", "'&'", 
		"'GR'", "'NOT'", "'RESTORE'", "'SAVE'", "'LOAD'", "'?'", "'INCLUDE'", 
		"STRINGLITERAL", "LETTERS", "NUMBER", "FLOAT", "CR", "WS"
	};
	public static final String[] ruleNames = {
		"DOLLAR", "PERCENT", "RETURN", "PRINT", "GOTO", "GOSUB", "IF", "NEXT", 
		"THEN", "REM", "CHR", "MID", "LEFT", "RIGHT", "STR", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "TIMES", "DIV", "CLEAR", "GTE", "LTE", "GT", "LT", "NEQ", 
		"COMMA", "LIST", "RUN", "END", "LET", "EQ", "FOR", "TO", "STEP", "INPUT", 
		"SEMICOLON", "DIM", "SQR", "COLON", "TEXT", "HGR", "HGR2", "LEN", "CALL", 
		"ASC", "HPLOT", "VPLOT", "PRNUMBER", "INNUMBER", "VTAB", "HTAB", "HOME", 
		"ON", "PDL", "PLOT", "PEEK", "POKE", "INTF", "STOP", "HIMEM", "LOMEM", 
		"FLASH", "INVERSE", "NORMAL", "ONERR", "SPC", "FRE", "POS", "USR", "TRACE", 
		"NOTRACE", "AND", "OR", "DATA", "WAIT", "READ", "XDRAW", "DRAW", "AT", 
		"DEF", "FN", "VAL", "TAB", "SPEED", "ROT", "SCALE", "COLOR", "HCOLOR", 
		"HLIN", "VLIN", "SCRN", "POP", "SHLOAD", "SIN", "COS", "TAN", "ATN", "RND", 
		"SGN", "EXP", "LOG", "ABS", "STORE", "RECALL", "GET", "EXPONENT", "AMPERSAND", 
		"GR", "NOT", "RESTORE", "SAVE", "LOAD", "QUESTION", "INCLUDE", "STRINGLITERAL", 
		"LETTERS", "NUMBER", "FLOAT", "CR", "WS"
	};


	public jvmBasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jvmBasic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 121: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2|\u0338\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>"+
		"\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F"+
		"\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O"+
		"\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3U\3U"+
		"\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3"+
		"b\3b\3c\3c\3c\3c\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3h\3"+
		"h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3"+
		"l\3m\3m\3n\3n\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3"+
		"r\3r\3s\3s\3s\3s\3s\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3v\3v\7v\u0300\nv\f"+
		"v\16v\u0303\13v\3v\3v\3w\6w\u0308\nw\rw\16w\u0309\3x\6x\u030d\nx\rx\16"+
		"x\u030e\3x\3x\7x\u0313\nx\fx\16x\u0316\13x\3y\7y\u0319\ny\fy\16y\u031c"+
		"\13y\3y\3y\6y\u0320\ny\ry\16y\u0321\3y\3y\7y\u0326\ny\fy\16y\u0329\13"+
		"y\3z\3z\3z\3z\3z\5z\u0330\nz\3{\6{\u0333\n{\r{\16{\u0334\3{\3{\2|\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1"+
		"-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1"+
		"C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177"+
		"A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\1\u008bG\1\u008dH\1\u008f"+
		"I\1\u0091J\1\u0093K\1\u0095L\1\u0097M\1\u0099N\1\u009bO\1\u009dP\1\u009f"+
		"Q\1\u00a1R\1\u00a3S\1\u00a5T\1\u00a7U\1\u00a9V\1\u00abW\1\u00adX\1\u00af"+
		"Y\1\u00b1Z\1\u00b3[\1\u00b5\\\1\u00b7]\1\u00b9^\1\u00bb_\1\u00bd`\1\u00bf"+
		"a\1\u00c1b\1\u00c3c\1\u00c5d\1\u00c7e\1\u00c9f\1\u00cbg\1\u00cdh\1\u00cf"+
		"i\1\u00d1j\1\u00d3k\1\u00d5l\1\u00d7m\1\u00d9n\1\u00dbo\1\u00ddp\1\u00df"+
		"q\1\u00e1r\1\u00e3s\1\u00e5t\1\u00e7u\1\u00e9v\1\u00ebw\1\u00edx\1\u00ef"+
		"y\1\u00f1z\1\u00f3{\1\u00f5|\2\3\2\7\4\2$$^^\4\2C\\c|\4\2GGgg\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\u0341\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\3\u00f7\3\2\2\2\5\u00f9\3\2\2\2\7\u00fb\3\2\2\2\t\u0102\3\2\2\2\13"+
		"\u0108\3\2\2\2\r\u010d\3\2\2\2\17\u0113\3\2\2\2\21\u0116\3\2\2\2\23\u011b"+
		"\3\2\2\2\25\u0120\3\2\2\2\27\u0124\3\2\2\2\31\u0129\3\2\2\2\33\u012e\3"+
		"\2\2\2\35\u0134\3\2\2\2\37\u013b\3\2\2\2!\u0140\3\2\2\2#\u0142\3\2\2\2"+
		"%\u0144\3\2\2\2\'\u0146\3\2\2\2)\u0148\3\2\2\2+\u014a\3\2\2\2-\u014c\3"+
		"\2\2\2/\u0152\3\2\2\2\61\u0156\3\2\2\2\63\u015a\3\2\2\2\65\u015c\3\2\2"+
		"\2\67\u015e\3\2\2\29\u0162\3\2\2\2;\u0164\3\2\2\2=\u0169\3\2\2\2?\u016d"+
		"\3\2\2\2A\u0171\3\2\2\2C\u0175\3\2\2\2E\u0177\3\2\2\2G\u017b\3\2\2\2I"+
		"\u017e\3\2\2\2K\u0183\3\2\2\2M\u0189\3\2\2\2O\u018b\3\2\2\2Q\u018f\3\2"+
		"\2\2S\u0193\3\2\2\2U\u0195\3\2\2\2W\u019a\3\2\2\2Y\u019e\3\2\2\2[\u01a3"+
		"\3\2\2\2]\u01a7\3\2\2\2_\u01ac\3\2\2\2a\u01b0\3\2\2\2c\u01b6\3\2\2\2e"+
		"\u01bc\3\2\2\2g\u01c0\3\2\2\2i\u01c4\3\2\2\2k\u01c9\3\2\2\2m\u01ce\3\2"+
		"\2\2o\u01d3\3\2\2\2q\u01d6\3\2\2\2s\u01da\3\2\2\2u\u01df\3\2\2\2w\u01e4"+
		"\3\2\2\2y\u01e9\3\2\2\2{\u01ed\3\2\2\2}\u01f2\3\2\2\2\177\u01f8\3\2\2"+
		"\2\u0081\u01fe\3\2\2\2\u0083\u0204\3\2\2\2\u0085\u020c\3\2\2\2\u0087\u0213"+
		"\3\2\2\2\u0089\u0219\3\2\2\2\u008b\u021d\3\2\2\2\u008d\u0221\3\2\2\2\u008f"+
		"\u0225\3\2\2\2\u0091\u0229\3\2\2\2\u0093\u022f\3\2\2\2\u0095\u0237\3\2"+
		"\2\2\u0097\u023b\3\2\2\2\u0099\u023e\3\2\2\2\u009b\u0243\3\2\2\2\u009d"+
		"\u0248\3\2\2\2\u009f\u024d\3\2\2\2\u00a1\u0253\3\2\2\2\u00a3\u0258\3\2"+
		"\2\2\u00a5\u025b\3\2\2\2\u00a7\u025f\3\2\2\2\u00a9\u0262\3\2\2\2\u00ab"+
		"\u0266\3\2\2\2\u00ad\u026a\3\2\2\2\u00af\u0270\3\2\2\2\u00b1\u0274\3\2"+
		"\2\2\u00b3\u027a\3\2\2\2\u00b5\u0280\3\2\2\2\u00b7\u0287\3\2\2\2\u00b9"+
		"\u028c\3\2\2\2\u00bb\u0291\3\2\2\2\u00bd\u0296\3\2\2\2\u00bf\u029a\3\2"+
		"\2\2\u00c1\u02a1\3\2\2\2\u00c3\u02a5\3\2\2\2\u00c5\u02a9\3\2\2\2\u00c7"+
		"\u02ad\3\2\2\2\u00c9\u02b1\3\2\2\2\u00cb\u02b5\3\2\2\2\u00cd\u02b9\3\2"+
		"\2\2\u00cf\u02bd\3\2\2\2\u00d1\u02c1\3\2\2\2\u00d3\u02c5\3\2\2\2\u00d5"+
		"\u02cb\3\2\2\2\u00d7\u02d2\3\2\2\2\u00d9\u02d6\3\2\2\2\u00db\u02d8\3\2"+
		"\2\2\u00dd\u02da\3\2\2\2\u00df\u02dd\3\2\2\2\u00e1\u02e1\3\2\2\2\u00e3"+
		"\u02e9\3\2\2\2\u00e5\u02ee\3\2\2\2\u00e7\u02f3\3\2\2\2\u00e9\u02f5\3\2"+
		"\2\2\u00eb\u02fd\3\2\2\2\u00ed\u0307\3\2\2\2\u00ef\u030c\3\2\2\2\u00f1"+
		"\u031a\3\2\2\2\u00f3\u032f\3\2\2\2\u00f5\u0332\3\2\2\2\u00f7\u00f8\7&"+
		"\2\2\u00f8\4\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa\6\3\2\2\2\u00fb\u00fc\7"+
		"T\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100"+
		"\7T\2\2\u0100\u0101\7P\2\2\u0101\b\3\2\2\2\u0102\u0103\7R\2\2\u0103\u0104"+
		"\7T\2\2\u0104\u0105\7K\2\2\u0105\u0106\7P\2\2\u0106\u0107\7V\2\2\u0107"+
		"\n\3\2\2\2\u0108\u0109\7I\2\2\u0109\u010a\7Q\2\2\u010a\u010b\7V\2\2\u010b"+
		"\u010c\7Q\2\2\u010c\f\3\2\2\2\u010d\u010e\7I\2\2\u010e\u010f\7Q\2\2\u010f"+
		"\u0110\7U\2\2\u0110\u0111\7W\2\2\u0111\u0112\7D\2\2\u0112\16\3\2\2\2\u0113"+
		"\u0114\7K\2\2\u0114\u0115\7H\2\2\u0115\20\3\2\2\2\u0116\u0117\7P\2\2\u0117"+
		"\u0118\7G\2\2\u0118\u0119\7Z\2\2\u0119\u011a\7V\2\2\u011a\22\3\2\2\2\u011b"+
		"\u011c\7V\2\2\u011c\u011d\7J\2\2\u011d\u011e\7G\2\2\u011e\u011f\7P\2\2"+
		"\u011f\24\3\2\2\2\u0120\u0121\7T\2\2\u0121\u0122\7G\2\2\u0122\u0123\7"+
		"O\2\2\u0123\26\3\2\2\2\u0124\u0125\7E\2\2\u0125\u0126\7J\2\2\u0126\u0127"+
		"\7T\2\2\u0127\u0128\7&\2\2\u0128\30\3\2\2\2\u0129\u012a\7O\2\2\u012a\u012b"+
		"\7K\2\2\u012b\u012c\7F\2\2\u012c\u012d\7&\2\2\u012d\32\3\2\2\2\u012e\u012f"+
		"\7N\2\2\u012f\u0130\7G\2\2\u0130\u0131\7H\2\2\u0131\u0132\7V\2\2\u0132"+
		"\u0133\7&\2\2\u0133\34\3\2\2\2\u0134\u0135\7T\2\2\u0135\u0136\7K\2\2\u0136"+
		"\u0137\7I\2\2\u0137\u0138\7J\2\2\u0138\u0139\7V\2\2\u0139\u013a\7&\2\2"+
		"\u013a\36\3\2\2\2\u013b\u013c\7U\2\2\u013c\u013d\7V\2\2\u013d\u013e\7"+
		"T\2\2\u013e\u013f\7&\2\2\u013f \3\2\2\2\u0140\u0141\7*\2\2\u0141\"\3\2"+
		"\2\2\u0142\u0143\7+\2\2\u0143$\3\2\2\2\u0144\u0145\7-\2\2\u0145&\3\2\2"+
		"\2\u0146\u0147\7/\2\2\u0147(\3\2\2\2\u0148\u0149\7,\2\2\u0149*\3\2\2\2"+
		"\u014a\u014b\7\61\2\2\u014b,\3\2\2\2\u014c\u014d\7E\2\2\u014d\u014e\7"+
		"N\2\2\u014e\u014f\7G\2\2\u014f\u0150\7C\2\2\u0150\u0151\7T\2\2\u0151."+
		"\3\2\2\2\u0152\u0153\7@\2\2\u0153\u0154\7<\2\2\u0154\u0155\7\"\2\2\u0155"+
		"\60\3\2\2\2\u0156\u0157\7>\2\2\u0157\u0158\7<\2\2\u0158\u0159\7\"\2\2"+
		"\u0159\62\3\2\2\2\u015a\u015b\7@\2\2\u015b\64\3\2\2\2\u015c\u015d\7>\2"+
		"\2\u015d\66\3\2\2\2\u015e\u015f\7>\2\2\u015f\u0160\7\"\2\2\u0160\u0161"+
		"\7@\2\2\u01618\3\2\2\2\u0162\u0163\7.\2\2\u0163:\3\2\2\2\u0164\u0165\7"+
		"N\2\2\u0165\u0166\7K\2\2\u0166\u0167\7U\2\2\u0167\u0168\7V\2\2\u0168<"+
		"\3\2\2\2\u0169\u016a\7T\2\2\u016a\u016b\7W\2\2\u016b\u016c\7P\2\2\u016c"+
		">\3\2\2\2\u016d\u016e\7G\2\2\u016e\u016f\7P\2\2\u016f\u0170\7F\2\2\u0170"+
		"@\3\2\2\2\u0171\u0172\7N\2\2\u0172\u0173\7G\2\2\u0173\u0174\7V\2\2\u0174"+
		"B\3\2\2\2\u0175\u0176\7?\2\2\u0176D\3\2\2\2\u0177\u0178\7H\2\2\u0178\u0179"+
		"\7Q\2\2\u0179\u017a\7T\2\2\u017aF\3\2\2\2\u017b\u017c\7V\2\2\u017c\u017d"+
		"\7Q\2\2\u017dH\3\2\2\2\u017e\u017f\7U\2\2\u017f\u0180\7V\2\2\u0180\u0181"+
		"\7G\2\2\u0181\u0182\7R\2\2\u0182J\3\2\2\2\u0183\u0184\7K\2\2\u0184\u0185"+
		"\7P\2\2\u0185\u0186\7R\2\2\u0186\u0187\7W\2\2\u0187\u0188\7V\2\2\u0188"+
		"L\3\2\2\2\u0189\u018a\7=\2\2\u018aN\3\2\2\2\u018b\u018c\7F\2\2\u018c\u018d"+
		"\7K\2\2\u018d\u018e\7O\2\2\u018eP\3\2\2\2\u018f\u0190\7U\2\2\u0190\u0191"+
		"\7S\2\2\u0191\u0192\7T\2\2\u0192R\3\2\2\2\u0193\u0194\7<\2\2\u0194T\3"+
		"\2\2\2\u0195\u0196\7V\2\2\u0196\u0197\7G\2\2\u0197\u0198\7Z\2\2\u0198"+
		"\u0199\7V\2\2\u0199V\3\2\2\2\u019a\u019b\7J\2\2\u019b\u019c\7I\2\2\u019c"+
		"\u019d\7T\2\2\u019dX\3\2\2\2\u019e\u019f\7J\2\2\u019f\u01a0\7I\2\2\u01a0"+
		"\u01a1\7T\2\2\u01a1\u01a2\7\64\2\2\u01a2Z\3\2\2\2\u01a3\u01a4\7N\2\2\u01a4"+
		"\u01a5\7G\2\2\u01a5\u01a6\7P\2\2\u01a6\\\3\2\2\2\u01a7\u01a8\7E\2\2\u01a8"+
		"\u01a9\7C\2\2\u01a9\u01aa\7N\2\2\u01aa\u01ab\7N\2\2\u01ab^\3\2\2\2\u01ac"+
		"\u01ad\7C\2\2\u01ad\u01ae\7U\2\2\u01ae\u01af\7E\2\2\u01af`\3\2\2\2\u01b0"+
		"\u01b1\7J\2\2\u01b1\u01b2\7R\2\2\u01b2\u01b3\7N\2\2\u01b3\u01b4\7Q\2\2"+
		"\u01b4\u01b5\7V\2\2\u01b5b\3\2\2\2\u01b6\u01b7\7X\2\2\u01b7\u01b8\7R\2"+
		"\2\u01b8\u01b9\7N\2\2\u01b9\u01ba\7Q\2\2\u01ba\u01bb\7V\2\2\u01bbd\3\2"+
		"\2\2\u01bc\u01bd\7R\2\2\u01bd\u01be\7T\2\2\u01be\u01bf\7%\2\2\u01bff\3"+
		"\2\2\2\u01c0\u01c1\7K\2\2\u01c1\u01c2\7P\2\2\u01c2\u01c3\7%\2\2\u01c3"+
		"h\3\2\2\2\u01c4\u01c5\7X\2\2\u01c5\u01c6\7V\2\2\u01c6\u01c7\7C\2\2\u01c7"+
		"\u01c8\7D\2\2\u01c8j\3\2\2\2\u01c9\u01ca\7J\2\2\u01ca\u01cb\7V\2\2\u01cb"+
		"\u01cc\7C\2\2\u01cc\u01cd\7D\2\2\u01cdl\3\2\2\2\u01ce\u01cf\7J\2\2\u01cf"+
		"\u01d0\7Q\2\2\u01d0\u01d1\7O\2\2\u01d1\u01d2\7G\2\2\u01d2n\3\2\2\2\u01d3"+
		"\u01d4\7Q\2\2\u01d4\u01d5\7P\2\2\u01d5p\3\2\2\2\u01d6\u01d7\7R\2\2\u01d7"+
		"\u01d8\7F\2\2\u01d8\u01d9\7N\2\2\u01d9r\3\2\2\2\u01da\u01db\7R\2\2\u01db"+
		"\u01dc\7N\2\2\u01dc\u01dd\7Q\2\2\u01dd\u01de\7V\2\2\u01det\3\2\2\2\u01df"+
		"\u01e0\7R\2\2\u01e0\u01e1\7G\2\2\u01e1\u01e2\7G\2\2\u01e2\u01e3\7M\2\2"+
		"\u01e3v\3\2\2\2\u01e4\u01e5\7R\2\2\u01e5\u01e6\7Q\2\2\u01e6\u01e7\7M\2"+
		"\2\u01e7\u01e8\7G\2\2\u01e8x\3\2\2\2\u01e9\u01ea\7K\2\2\u01ea\u01eb\7"+
		"P\2\2\u01eb\u01ec\7V\2\2\u01ecz\3\2\2\2\u01ed\u01ee\7U\2\2\u01ee\u01ef"+
		"\7V\2\2\u01ef\u01f0\7Q\2\2\u01f0\u01f1\7R\2\2\u01f1|\3\2\2\2\u01f2\u01f3"+
		"\7J\2\2\u01f3\u01f4\7K\2\2\u01f4\u01f5\7O\2\2\u01f5\u01f6\7G\2\2\u01f6"+
		"\u01f7\7O\2\2\u01f7~\3\2\2\2\u01f8\u01f9\7N\2\2\u01f9\u01fa\7Q\2\2\u01fa"+
		"\u01fb\7O\2\2\u01fb\u01fc\7G\2\2\u01fc\u01fd\7O\2\2\u01fd\u0080\3\2\2"+
		"\2\u01fe\u01ff\7H\2\2\u01ff\u0200\7N\2\2\u0200\u0201\7C\2\2\u0201\u0202"+
		"\7U\2\2\u0202\u0203\7J\2\2\u0203\u0082\3\2\2\2\u0204\u0205\7K\2\2\u0205"+
		"\u0206\7P\2\2\u0206\u0207\7X\2\2\u0207\u0208\7G\2\2\u0208\u0209\7T\2\2"+
		"\u0209\u020a\7U\2\2\u020a\u020b\7G\2\2\u020b\u0084\3\2\2\2\u020c\u020d"+
		"\7P\2\2\u020d\u020e\7Q\2\2\u020e\u020f\7T\2\2\u020f\u0210\7O\2\2\u0210"+
		"\u0211\7C\2\2\u0211\u0212\7N\2\2\u0212\u0086\3\2\2\2\u0213\u0214\7Q\2"+
		"\2\u0214\u0215\7P\2\2\u0215\u0216\7G\2\2\u0216\u0217\7T\2\2\u0217\u0218"+
		"\7T\2\2\u0218\u0088\3\2\2\2\u0219\u021a\7U\2\2\u021a\u021b\7R\2\2\u021b"+
		"\u021c\7E\2\2\u021c\u008a\3\2\2\2\u021d\u021e\7H\2\2\u021e\u021f\7T\2"+
		"\2\u021f\u0220\7G\2\2\u0220\u008c\3\2\2\2\u0221\u0222\7R\2\2\u0222\u0223"+
		"\7Q\2\2\u0223\u0224\7U\2\2\u0224\u008e\3\2\2\2\u0225\u0226\7W\2\2\u0226"+
		"\u0227\7U\2\2\u0227\u0228\7T\2\2\u0228\u0090\3\2\2\2\u0229\u022a\7V\2"+
		"\2\u022a\u022b\7T\2\2\u022b\u022c\7C\2\2\u022c\u022d\7E\2\2\u022d\u022e"+
		"\7G\2\2\u022e\u0092\3\2\2\2\u022f\u0230\7P\2\2\u0230\u0231\7Q\2\2\u0231"+
		"\u0232\7V\2\2\u0232\u0233\7T\2\2\u0233\u0234\7C\2\2\u0234\u0235\7E\2\2"+
		"\u0235\u0236\7G\2\2\u0236\u0094\3\2\2\2\u0237\u0238\7C\2\2\u0238\u0239"+
		"\7P\2\2\u0239\u023a\7F\2\2\u023a\u0096\3\2\2\2\u023b\u023c\7Q\2\2\u023c"+
		"\u023d\7T\2\2\u023d\u0098\3\2\2\2\u023e\u023f\7F\2\2\u023f\u0240\7C\2"+
		"\2\u0240\u0241\7V\2\2\u0241\u0242\7C\2\2\u0242\u009a\3\2\2\2\u0243\u0244"+
		"\7Y\2\2\u0244\u0245\7C\2\2\u0245\u0246\7K\2\2\u0246\u0247\7V\2\2\u0247"+
		"\u009c\3\2\2\2\u0248\u0249\7T\2\2\u0249\u024a\7G\2\2\u024a\u024b\7C\2"+
		"\2\u024b\u024c\7F\2\2\u024c\u009e\3\2\2\2\u024d\u024e\7Z\2\2\u024e\u024f"+
		"\7F\2\2\u024f\u0250\7T\2\2\u0250\u0251\7C\2\2\u0251\u0252\7Y\2\2\u0252"+
		"\u00a0\3\2\2\2\u0253\u0254\7F\2\2\u0254\u0255\7T\2\2\u0255\u0256\7C\2"+
		"\2\u0256\u0257\7Y\2\2\u0257\u00a2\3\2\2\2\u0258\u0259\7C\2\2\u0259\u025a"+
		"\7V\2\2\u025a\u00a4\3\2\2\2\u025b\u025c\7F\2\2\u025c\u025d\7G\2\2\u025d"+
		"\u025e\7H\2\2\u025e\u00a6\3\2\2\2\u025f\u0260\7H\2\2\u0260\u0261\7P\2"+
		"\2\u0261\u00a8\3\2\2\2\u0262\u0263\7X\2\2\u0263\u0264\7C\2\2\u0264\u0265"+
		"\7N\2\2\u0265\u00aa\3\2\2\2\u0266\u0267\7V\2\2\u0267\u0268\7C\2\2\u0268"+
		"\u0269\7D\2\2\u0269\u00ac\3\2\2\2\u026a\u026b\7U\2\2\u026b\u026c\7R\2"+
		"\2\u026c\u026d\7G\2\2\u026d\u026e\7G\2\2\u026e\u026f\7F\2\2\u026f\u00ae"+
		"\3\2\2\2\u0270\u0271\7T\2\2\u0271\u0272\7Q\2\2\u0272\u0273\7V\2\2\u0273"+
		"\u00b0\3\2\2\2\u0274\u0275\7U\2\2\u0275\u0276\7E\2\2\u0276\u0277\7C\2"+
		"\2\u0277\u0278\7N\2\2\u0278\u0279\7G\2\2\u0279\u00b2\3\2\2\2\u027a\u027b"+
		"\7E\2\2\u027b\u027c\7Q\2\2\u027c\u027d\7N\2\2\u027d\u027e\7Q\2\2\u027e"+
		"\u027f\7T\2\2\u027f\u00b4\3\2\2\2\u0280\u0281\7J\2\2\u0281\u0282\7E\2"+
		"\2\u0282\u0283\7Q\2\2\u0283\u0284\7N\2\2\u0284\u0285\7Q\2\2\u0285\u0286"+
		"\7T\2\2\u0286\u00b6\3\2\2\2\u0287\u0288\7J\2\2\u0288\u0289\7N\2\2\u0289"+
		"\u028a\7K\2\2\u028a\u028b\7P\2\2\u028b\u00b8\3\2\2\2\u028c\u028d\7X\2"+
		"\2\u028d\u028e\7N\2\2\u028e\u028f\7K\2\2\u028f\u0290\7P\2\2\u0290\u00ba"+
		"\3\2\2\2\u0291\u0292\7U\2\2\u0292\u0293\7E\2\2\u0293\u0294\7T\2\2\u0294"+
		"\u0295\7P\2\2\u0295\u00bc\3\2\2\2\u0296\u0297\7R\2\2\u0297\u0298\7Q\2"+
		"\2\u0298\u0299\7R\2\2\u0299\u00be\3\2\2\2\u029a\u029b\7U\2\2\u029b\u029c"+
		"\7J\2\2\u029c\u029d\7N\2\2\u029d\u029e\7Q\2\2\u029e\u029f\7C\2\2\u029f"+
		"\u02a0\7F\2\2\u02a0\u00c0\3\2\2\2\u02a1\u02a2\7U\2\2\u02a2\u02a3\7K\2"+
		"\2\u02a3\u02a4\7P\2\2\u02a4\u00c2\3\2\2\2\u02a5\u02a6\7E\2\2\u02a6\u02a7"+
		"\7Q\2\2\u02a7\u02a8\7U\2\2\u02a8\u00c4\3\2\2\2\u02a9\u02aa\7V\2\2\u02aa"+
		"\u02ab\7C\2\2\u02ab\u02ac\7P\2\2\u02ac\u00c6\3\2\2\2\u02ad\u02ae\7C\2"+
		"\2\u02ae\u02af\7V\2\2\u02af\u02b0\7P\2\2\u02b0\u00c8\3\2\2\2\u02b1\u02b2"+
		"\7T\2\2\u02b2\u02b3\7P\2\2\u02b3\u02b4\7F\2\2\u02b4\u00ca\3\2\2\2\u02b5"+
		"\u02b6\7U\2\2\u02b6\u02b7\7I\2\2\u02b7\u02b8\7P\2\2\u02b8\u00cc\3\2\2"+
		"\2\u02b9\u02ba\7G\2\2\u02ba\u02bb\7Z\2\2\u02bb\u02bc\7R\2\2\u02bc\u00ce"+
		"\3\2\2\2\u02bd\u02be\7N\2\2\u02be\u02bf\7Q\2\2\u02bf\u02c0\7I\2\2\u02c0"+
		"\u00d0\3\2\2\2\u02c1\u02c2\7C\2\2\u02c2\u02c3\7D\2\2\u02c3\u02c4\7U\2"+
		"\2\u02c4\u00d2\3\2\2\2\u02c5\u02c6\7U\2\2\u02c6\u02c7\7V\2\2\u02c7\u02c8"+
		"\7Q\2\2\u02c8\u02c9\7T\2\2\u02c9\u02ca\7G\2\2\u02ca\u00d4\3\2\2\2\u02cb"+
		"\u02cc\7T\2\2\u02cc\u02cd\7G\2\2\u02cd\u02ce\7E\2\2\u02ce\u02cf\7C\2\2"+
		"\u02cf\u02d0\7N\2\2\u02d0\u02d1\7N\2\2\u02d1\u00d6\3\2\2\2\u02d2\u02d3"+
		"\7I\2\2\u02d3\u02d4\7G\2\2\u02d4\u02d5\7V\2\2\u02d5\u00d8\3\2\2\2\u02d6"+
		"\u02d7\7`\2\2\u02d7\u00da\3\2\2\2\u02d8\u02d9\7(\2\2\u02d9\u00dc\3\2\2"+
		"\2\u02da\u02db\7I\2\2\u02db\u02dc\7T\2\2\u02dc\u00de\3\2\2\2\u02dd\u02de"+
		"\7P\2\2\u02de\u02df\7Q\2\2\u02df\u02e0\7V\2\2\u02e0\u00e0\3\2\2\2\u02e1"+
		"\u02e2\7T\2\2\u02e2\u02e3\7G\2\2\u02e3\u02e4\7U\2\2\u02e4\u02e5\7V\2\2"+
		"\u02e5\u02e6\7Q\2\2\u02e6\u02e7\7T\2\2\u02e7\u02e8\7G\2\2\u02e8\u00e2"+
		"\3\2\2\2\u02e9\u02ea\7U\2\2\u02ea\u02eb\7C\2\2\u02eb\u02ec\7X\2\2\u02ec"+
		"\u02ed\7G\2\2\u02ed\u00e4\3\2\2\2\u02ee\u02ef\7N\2\2\u02ef\u02f0\7Q\2"+
		"\2\u02f0\u02f1\7C\2\2\u02f1\u02f2\7F\2\2\u02f2\u00e6\3\2\2\2\u02f3\u02f4"+
		"\7A\2\2\u02f4\u00e8\3\2\2\2\u02f5\u02f6\7K\2\2\u02f6\u02f7\7P\2\2\u02f7"+
		"\u02f8\7E\2\2\u02f8\u02f9\7N\2\2\u02f9\u02fa\7W\2\2\u02fa\u02fb\7F\2\2"+
		"\u02fb\u02fc\7G\2\2\u02fc\u00ea\3\2\2\2\u02fd\u0301\7$\2\2\u02fe\u0300"+
		"\n\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\7$"+
		"\2\2\u0305\u00ec\3\2\2\2\u0306\u0308\t\3\2\2\u0307\u0306\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u00ee\3\2"+
		"\2\2\u030b\u030d\4\62;\2\u030c\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0314\3\2\2\2\u0310\u0311\t\4"+
		"\2\2\u0311\u0313\5\u00efx\2\u0312\u0310\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u00f0\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u0319\4\62;\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031d\u031f\7\60\2\2\u031e\u0320\4\62;\2\u031f\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0327\3\2"+
		"\2\2\u0323\u0324\t\4\2\2\u0324\u0326\5\u00efx\2\u0325\u0323\3\2\2\2\u0326"+
		"\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u00f2\3\2"+
		"\2\2\u0329\u0327\3\2\2\2\u032a\u0330\t\5\2\2\u032b\u032c\7\17\2\2\u032c"+
		"\u0330\7\f\2\2\u032d\u032e\7\f\2\2\u032e\u0330\7\17\2\2\u032f\u032a\3"+
		"\2\2\2\u032f\u032b\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u00f4\3\2\2\2\u0331"+
		"\u0333\t\6\2\2\u0332\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\b{\2\2\u0337"+
		"\u00f6\3\2\2\2\f\2\u0301\u0309\u030e\u0314\u031a\u0321\u0327\u032f\u0334";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}