// Generated from c:\Users\lucas\Documents\Programacao\Oberon-Scala\Backup\src\main\antlr4\Oberon.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OberonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, INT=57, REAL=58, SHORTINT=59, 
		LONGINT=60, LONGREAL=61, TRUE=62, FALSE=63, Id=64, WS=65, COMMENT=66, 
		LINE_COMMENT=67;
	public static final int
		RULE_compilationUnit = 0, RULE_declarations = 1, RULE_userTypeDeclaration = 2, 
		RULE_constant = 3, RULE_varDeclaration = 4, RULE_procedure = 5, RULE_formals = 6, 
		RULE_arguments = 7, RULE_formalArg = 8, RULE_block = 9, RULE_expression = 10, 
		RULE_statement = 11, RULE_designator = 12, RULE_caseAlternative = 13, 
		RULE_elseIfStmt = 14, RULE_intValue = 15, RULE_realValue = 16, RULE_shortValue = 17, 
		RULE_longValue = 18, RULE_longRealValue = 19, RULE_boolValue = 20, RULE_oberonType = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "declarations", "userTypeDeclaration", "constant", 
			"varDeclaration", "procedure", "formals", "arguments", "formalArg", "block", 
			"expression", "statement", "designator", "caseAlternative", "elseIfStmt", 
			"intValue", "realValue", "shortValue", "longValue", "longRealValue", 
			"boolValue", "oberonType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MODULE'", "';'", "'END'", "'.'", "'TYPE'", "'CONST'", "'VAR'", 
			"'='", "'ARRAY'", "'OF'", "'RECORD'", "','", "':'", "'PROCEDURE'", "'('", 
			"')'", "'BEGIN'", "'['", "']'", "'#'", "'<'", "'<='", "'>'", "'>='", 
			"'*'", "'/'", "'&&'", "'+'", "'-'", "'||'", "':='", "'readInt'", "'write'", 
			"'IF'", "'THEN'", "'ELSE'", "'ELSIF'", "'WHILE'", "'DO'", "'REPEAT'", 
			"'UNTIL'", "'FOR'", "'TO'", "'IN'", "'..'", "'LOOP'", "'RETURN'", "'CASE'", 
			"'|'", "'EXIT'", "'INTEGER'", "'REAL'", "'SHORTINT'", "'LONGINT'", "'LONGREAL'", 
			"'BOOLEAN'", null, null, null, null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "REAL", 
			"SHORTINT", "LONGINT", "LONGREAL", "TRUE", "FALSE", "Id", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "Oberon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OberonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public Token name;
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(OberonParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(OberonParser.Id, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			((CompilationUnitContext)_localctx).name = match(Id);
			setState(46);
			match(T__1);
			setState(47);
			declarations();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(48);
				block();
				}
			}

			setState(51);
			match(T__2);
			setState(52);
			match(Id);
			setState(53);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<UserTypeDeclarationContext> userTypeDeclaration() {
			return getRuleContexts(UserTypeDeclarationContext.class);
		}
		public UserTypeDeclarationContext userTypeDeclaration(int i) {
			return getRuleContext(UserTypeDeclarationContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(55);
				match(T__4);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					userTypeDeclaration();
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Id );
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(63);
				match(T__5);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					constant();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Id );
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(71);
				match(T__6);
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					varDeclaration();
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Id );
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(79);
				procedure();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserTypeDeclarationContext extends ParserRuleContext {
		public UserTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userTypeDeclaration; }
	 
		public UserTypeDeclarationContext() { }
		public void copyFrom(UserTypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecordTypeDeclarationContext extends UserTypeDeclarationContext {
		public Token nameType;
		public VarDeclarationContext varDeclaration;
		public List<VarDeclarationContext> vars = new ArrayList<VarDeclarationContext>();
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public RecordTypeDeclarationContext(UserTypeDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayTypeDeclarationContext extends UserTypeDeclarationContext {
		public Token nameType;
		public Token length;
		public OberonTypeContext vartype;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public TerminalNode INT() { return getToken(OberonParser.INT, 0); }
		public OberonTypeContext oberonType() {
			return getRuleContext(OberonTypeContext.class,0);
		}
		public ArrayTypeDeclarationContext(UserTypeDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final UserTypeDeclarationContext userTypeDeclaration() throws RecognitionException {
		UserTypeDeclarationContext _localctx = new UserTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_userTypeDeclaration);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((ArrayTypeDeclarationContext)_localctx).nameType = match(Id);
				setState(86);
				match(T__7);
				{
				setState(87);
				match(T__8);
				setState(88);
				((ArrayTypeDeclarationContext)_localctx).length = match(INT);
				setState(89);
				match(T__9);
				setState(90);
				((ArrayTypeDeclarationContext)_localctx).vartype = oberonType();
				}
				}
				break;
			case 2:
				_localctx = new RecordTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((RecordTypeDeclarationContext)_localctx).nameType = match(Id);
				setState(92);
				match(T__7);
				{
				setState(93);
				match(T__10);
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					((RecordTypeDeclarationContext)_localctx).varDeclaration = varDeclaration();
					((RecordTypeDeclarationContext)_localctx).vars.add(((RecordTypeDeclarationContext)_localctx).varDeclaration);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Id );
				setState(99);
				match(T__2);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token constName;
		public ExpressionContext exp;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((ConstantContext)_localctx).constName = match(Id);
			setState(104);
			match(T__7);
			setState(105);
			((ConstantContext)_localctx).exp = expression(0);
			setState(106);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token Id;
		public List<Token> vars = new ArrayList<Token>();
		public OberonTypeContext varType;
		public OberonTypeContext oberonType() {
			return getRuleContext(OberonTypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(OberonParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(OberonParser.Id, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			((VarDeclarationContext)_localctx).Id = match(Id);
			((VarDeclarationContext)_localctx).vars.add(((VarDeclarationContext)_localctx).Id);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(109);
				match(T__11);
				setState(110);
				((VarDeclarationContext)_localctx).Id = match(Id);
				((VarDeclarationContext)_localctx).vars.add(((VarDeclarationContext)_localctx).Id);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(116);
			match(T__12);
			setState(117);
			((VarDeclarationContext)_localctx).varType = oberonType();
			setState(118);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public Token name;
		public OberonTypeContext procedureType;
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(OberonParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(OberonParser.Id, i);
		}
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public OberonTypeContext oberonType() {
			return getRuleContext(OberonTypeContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__13);
			setState(121);
			((ProcedureContext)_localctx).name = match(Id);
			setState(122);
			match(T__14);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(123);
				formals();
				}
			}

			setState(126);
			match(T__15);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(127);
				match(T__12);
				setState(128);
				((ProcedureContext)_localctx).procedureType = oberonType();
				}
			}

			setState(131);
			match(T__1);
			setState(132);
			declarations();
			setState(133);
			block();
			setState(134);
			match(Id);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalsContext extends ParserRuleContext {
		public List<FormalArgContext> formalArg() {
			return getRuleContexts(FormalArgContext.class);
		}
		public FormalArgContext formalArg(int i) {
			return getRuleContext(FormalArgContext.class,i);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			formalArg();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(137);
				match(T__11);
				setState(138);
				formalArg();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expression(0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(145);
				match(T__11);
				setState(146);
				expression(0);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalArgContext extends ParserRuleContext {
		public Token Id;
		public List<Token> args = new ArrayList<Token>();
		public OberonTypeContext argType;
		public OberonTypeContext oberonType() {
			return getRuleContext(OberonTypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(OberonParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(OberonParser.Id, i);
		}
		public FormalArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalArg; }
	}

	public final FormalArgContext formalArg() throws RecognitionException {
		FormalArgContext _localctx = new FormalArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			((FormalArgContext)_localctx).Id = match(Id);
			((FormalArgContext)_localctx).args.add(((FormalArgContext)_localctx).Id);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(153);
				match(T__11);
				setState(154);
				((FormalArgContext)_localctx).Id = match(Id);
				((FormalArgContext)_localctx).args.add(((FormalArgContext)_localctx).Id);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(160);
			match(T__12);
			setState(161);
			((FormalArgContext)_localctx).argType = oberonType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__16);
			setState(164);
			statement(0);
			setState(165);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LongIntValueContext extends ExpressionContext {
		public LongValueContext longValue() {
			return getRuleContext(LongValueContext.class,0);
		}
		public LongIntValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VariableContext extends ExpressionContext {
		public Token name;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token opr;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerValueContext extends ExpressionContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public IntegerValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BracketsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleValueContext extends ExpressionContext {
		public LongRealValueContext longRealValue() {
			return getRuleContext(LongRealValueContext.class,0);
		}
		public DoubleValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token opr;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArraySubscriptContext extends ExpressionContext {
		public ExpressionContext arrayBase;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArraySubscriptContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanValueContext extends ExpressionContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public BooleanValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FloatValueContext extends ExpressionContext {
		public RealValueContext realValue() {
			return getRuleContext(RealValueContext.class,0);
		}
		public FloatValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ShortIntValueContext extends ExpressionContext {
		public ShortValueContext shortValue() {
			return getRuleContext(ShortValueContext.class,0);
		}
		public ShortIntValueContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExpressionContext {
		public Token name;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FieldAccessContext extends ExpressionContext {
		public ExpressionContext exp;
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public FieldAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token opr;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(T__14);
				setState(169);
				expression(0);
				setState(170);
				match(T__15);
				}
				break;
			case 2:
				{
				_localctx = new IntegerValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				intValue();
				}
				break;
			case 3:
				{
				_localctx = new FloatValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				realValue();
				}
				break;
			case 4:
				{
				_localctx = new ShortIntValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				shortValue();
				}
				break;
			case 5:
				{
				_localctx = new LongIntValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				longValue();
				}
				break;
			case 6:
				{
				_localctx = new DoubleValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				longRealValue();
				}
				break;
			case 7:
				{
				_localctx = new BooleanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				boolValue();
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				((VariableContext)_localctx).name = match(Id);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				((FunctionCallContext)_localctx).name = match(Id);
				setState(180);
				match(T__14);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (INT - 15)) | (1L << (REAL - 15)) | (1L << (SHORTINT - 15)) | (1L << (LONGINT - 15)) | (1L << (LONGREAL - 15)) | (1L << (TRUE - 15)) | (1L << (FALSE - 15)) | (1L << (Id - 15)))) != 0)) {
					{
					setState(181);
					arguments();
					}
				}

				setState(184);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new RelExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						((RelExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((RelExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((RelExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						((MultExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((MultExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((MultExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(194);
						((AddExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((AddExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((AddExpressionContext)_localctx).right = expression(2);
						}
						break;
					case 4:
						{
						_localctx = new FieldAccessContext(new ExpressionContext(_parentctx, _parentState));
						((FieldAccessContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						match(T__3);
						setState(198);
						((FieldAccessContext)_localctx).name = match(Id);
						}
						break;
					case 5:
						{
						_localctx = new ArraySubscriptContext(new ExpressionContext(_parentctx, _parentState));
						((ArraySubscriptContext)_localctx).arrayBase = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						match(T__17);
						setState(201);
						((ArraySubscriptContext)_localctx).index = expression(0);
						setState(202);
						match(T__18);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopStmtContext extends StatementContext {
		public StatementContext stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReadIntStmtContext extends StatementContext {
		public Token var;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ReadIntStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfElseStmtContext extends StatementContext {
		public ExpressionContext cond;
		public StatementContext thenStmt;
		public StatementContext elseStmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SequenceStmtContext extends StatementContext {
		public List<StatementContext> stmt = new ArrayList<StatementContext>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CaseStmtContext extends StatementContext {
		public ExpressionContext exp;
		public CaseAlternativeContext caseAlternative;
		public List<CaseAlternativeContext> cases = new ArrayList<CaseAlternativeContext>();
		public StatementContext elseStmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CaseAlternativeContext> caseAlternative() {
			return getRuleContexts(CaseAlternativeContext.class);
		}
		public CaseAlternativeContext caseAlternative(int i) {
			return getRuleContext(CaseAlternativeContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EAssignmentStmtContext extends StatementContext {
		public DesignatorContext des;
		public ExpressionContext exp;
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EAssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForRangeStmtContext extends StatementContext {
		public Token var;
		public ExpressionContext min;
		public ExpressionContext max;
		public StatementContext stmt;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForRangeStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ProcedureCallContext extends StatementContext {
		public Token name;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ProcedureCallContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StatementContext {
		public ExpressionContext cond;
		public StatementContext stmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExitStmtContext extends StatementContext {
		public ExitStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RepeatUntilStmtContext extends StatementContext {
		public StatementContext stmt;
		public ExpressionContext cond;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatUntilStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WriteStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentStmtContext extends StatementContext {
		public Token var;
		public ExpressionContext exp;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStmtContext extends StatementContext {
		public StatementContext init;
		public ExpressionContext condition;
		public StatementContext stmt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StatementContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfElseIfStmtContext extends StatementContext {
		public ExpressionContext cond;
		public StatementContext thenStmt;
		public ElseIfStmtContext elseIfStmt;
		public List<ElseIfStmtContext> elsifs = new ArrayList<ElseIfStmtContext>();
		public StatementContext elseStmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public IfElseIfStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				((AssignmentStmtContext)_localctx).var = match(Id);
				setState(211);
				match(T__30);
				setState(212);
				((AssignmentStmtContext)_localctx).exp = expression(0);
				}
				break;
			case 2:
				{
				_localctx = new EAssignmentStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				((EAssignmentStmtContext)_localctx).des = designator();
				setState(214);
				match(T__30);
				setState(215);
				((EAssignmentStmtContext)_localctx).exp = expression(0);
				}
				break;
			case 3:
				{
				_localctx = new ReadIntStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__31);
				setState(218);
				match(T__14);
				setState(219);
				((ReadIntStmtContext)_localctx).var = match(Id);
				setState(220);
				match(T__15);
				}
				break;
			case 4:
				{
				_localctx = new WriteStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__32);
				setState(222);
				match(T__14);
				setState(223);
				expression(0);
				setState(224);
				match(T__15);
				}
				break;
			case 5:
				{
				_localctx = new ProcedureCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				((ProcedureCallContext)_localctx).name = match(Id);
				setState(227);
				match(T__14);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (INT - 15)) | (1L << (REAL - 15)) | (1L << (SHORTINT - 15)) | (1L << (LONGINT - 15)) | (1L << (LONGREAL - 15)) | (1L << (TRUE - 15)) | (1L << (FALSE - 15)) | (1L << (Id - 15)))) != 0)) {
					{
					setState(228);
					arguments();
					}
				}

				setState(231);
				match(T__15);
				}
				break;
			case 6:
				{
				_localctx = new IfElseStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(T__33);
				setState(233);
				((IfElseStmtContext)_localctx).cond = expression(0);
				setState(234);
				match(T__34);
				setState(235);
				((IfElseStmtContext)_localctx).thenStmt = statement(0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(236);
					match(T__35);
					setState(237);
					((IfElseStmtContext)_localctx).elseStmt = statement(0);
					}
				}

				setState(240);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new IfElseIfStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(T__33);
				setState(243);
				((IfElseIfStmtContext)_localctx).cond = expression(0);
				setState(244);
				match(T__34);
				setState(245);
				((IfElseIfStmtContext)_localctx).thenStmt = statement(0);
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					match(T__36);
					setState(247);
					((IfElseIfStmtContext)_localctx).elseIfStmt = elseIfStmt();
					((IfElseIfStmtContext)_localctx).elsifs.add(((IfElseIfStmtContext)_localctx).elseIfStmt);
					}
					}
					setState(250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__36 );
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(252);
					match(T__35);
					setState(253);
					((IfElseIfStmtContext)_localctx).elseStmt = statement(0);
					}
				}

				setState(256);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new WhileStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(T__37);
				setState(259);
				((WhileStmtContext)_localctx).cond = expression(0);
				setState(260);
				match(T__38);
				setState(261);
				((WhileStmtContext)_localctx).stmt = statement(0);
				setState(262);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new RepeatUntilStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__39);
				setState(265);
				((RepeatUntilStmtContext)_localctx).stmt = statement(0);
				setState(266);
				match(T__40);
				setState(267);
				((RepeatUntilStmtContext)_localctx).cond = expression(0);
				}
				break;
			case 10:
				{
				_localctx = new ForStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(T__41);
				setState(270);
				((ForStmtContext)_localctx).init = statement(0);
				setState(271);
				match(T__42);
				setState(272);
				((ForStmtContext)_localctx).condition = expression(0);
				setState(273);
				match(T__38);
				setState(274);
				((ForStmtContext)_localctx).stmt = statement(0);
				setState(275);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new ForRangeStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(T__41);
				setState(278);
				((ForRangeStmtContext)_localctx).var = match(Id);
				setState(279);
				match(T__43);
				setState(280);
				((ForRangeStmtContext)_localctx).min = expression(0);
				setState(281);
				match(T__44);
				setState(282);
				((ForRangeStmtContext)_localctx).max = expression(0);
				setState(283);
				match(T__38);
				setState(284);
				((ForRangeStmtContext)_localctx).stmt = statement(0);
				setState(285);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new LoopStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__45);
				setState(288);
				((LoopStmtContext)_localctx).stmt = statement(0);
				setState(289);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new ReturnStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(T__46);
				setState(292);
				((ReturnStmtContext)_localctx).exp = expression(0);
				}
				break;
			case 14:
				{
				_localctx = new CaseStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(T__47);
				setState(294);
				((CaseStmtContext)_localctx).exp = expression(0);
				setState(295);
				match(T__9);
				setState(296);
				((CaseStmtContext)_localctx).caseAlternative = caseAlternative();
				((CaseStmtContext)_localctx).cases.add(((CaseStmtContext)_localctx).caseAlternative);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__48) {
					{
					{
					setState(297);
					match(T__48);
					setState(298);
					((CaseStmtContext)_localctx).caseAlternative = caseAlternative();
					((CaseStmtContext)_localctx).cases.add(((CaseStmtContext)_localctx).caseAlternative);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(304);
					match(T__35);
					setState(305);
					((CaseStmtContext)_localctx).elseStmt = statement(0);
					}
				}

				setState(308);
				match(T__2);
				}
				break;
			case 15:
				{
				_localctx = new ExitStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(T__49);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SequenceStmtContext(new StatementContext(_parentctx, _parentState));
					((SequenceStmtContext)_localctx).stmt.add(_prevctx);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(313);
					if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
					setState(316); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(314);
							match(T__1);
							setState(315);
							((SequenceStmtContext)_localctx).statement = statement(0);
							((SequenceStmtContext)_localctx).stmt.add(((SequenceStmtContext)_localctx).statement);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(318); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecordAssignmentContext extends DesignatorContext {
		public ExpressionContext record;
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public RecordAssignmentContext(DesignatorContext ctx) { copyFrom(ctx); }
	}
	public static class VarAssignmentContext extends DesignatorContext {
		public Token var;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public VarAssignmentContext(DesignatorContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAssignmentContext extends DesignatorContext {
		public ExpressionContext array;
		public ExpressionContext elem;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAssignmentContext(DesignatorContext ctx) { copyFrom(ctx); }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_designator);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new VarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((VarAssignmentContext)_localctx).var = match(Id);
				}
				break;
			case 2:
				_localctx = new ArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((ArrayAssignmentContext)_localctx).array = expression(0);
				setState(327);
				match(T__17);
				setState(328);
				((ArrayAssignmentContext)_localctx).elem = expression(0);
				setState(329);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new RecordAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				((RecordAssignmentContext)_localctx).record = expression(0);
				setState(332);
				match(T__3);
				setState(333);
				((RecordAssignmentContext)_localctx).name = match(Id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseAlternativeContext extends ParserRuleContext {
		public CaseAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseAlternative; }
	 
		public CaseAlternativeContext() { }
		public void copyFrom(CaseAlternativeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeCaseContext extends CaseAlternativeContext {
		public ExpressionContext min;
		public ExpressionContext max;
		public StatementContext stmt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public RangeCaseContext(CaseAlternativeContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleCaseContext extends CaseAlternativeContext {
		public ExpressionContext cond;
		public StatementContext stmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleCaseContext(CaseAlternativeContext ctx) { copyFrom(ctx); }
	}

	public final CaseAlternativeContext caseAlternative() throws RecognitionException {
		CaseAlternativeContext _localctx = new CaseAlternativeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseAlternative);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new SimpleCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				((SimpleCaseContext)_localctx).cond = expression(0);
				setState(338);
				match(T__12);
				setState(339);
				((SimpleCaseContext)_localctx).stmt = statement(0);
				}
				break;
			case 2:
				_localctx = new RangeCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				((RangeCaseContext)_localctx).min = expression(0);
				setState(342);
				match(T__44);
				setState(343);
				((RangeCaseContext)_localctx).max = expression(0);
				setState(344);
				match(T__12);
				setState(345);
				((RangeCaseContext)_localctx).stmt = statement(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStmtContext extends ParserRuleContext {
		public ExpressionContext cond;
		public StatementContext stmt;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((ElseIfStmtContext)_localctx).cond = expression(0);
			setState(350);
			match(T__34);
			setState(351);
			((ElseIfStmtContext)_localctx).stmt = statement(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OberonParser.INT, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealValueContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(OberonParser.REAL, 0); }
		public RealValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realValue; }
	}

	public final RealValueContext realValue() throws RecognitionException {
		RealValueContext _localctx = new RealValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_realValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortValueContext extends ParserRuleContext {
		public TerminalNode SHORTINT() { return getToken(OberonParser.SHORTINT, 0); }
		public ShortValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortValue; }
	}

	public final ShortValueContext shortValue() throws RecognitionException {
		ShortValueContext _localctx = new ShortValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shortValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(SHORTINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongValueContext extends ParserRuleContext {
		public TerminalNode LONGINT() { return getToken(OberonParser.LONGINT, 0); }
		public LongValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longValue; }
	}

	public final LongValueContext longValue() throws RecognitionException {
		LongValueContext _localctx = new LongValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_longValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LONGINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongRealValueContext extends ParserRuleContext {
		public TerminalNode LONGREAL() { return getToken(OberonParser.LONGREAL, 0); }
		public LongRealValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longRealValue; }
	}

	public final LongRealValueContext longRealValue() throws RecognitionException {
		LongRealValueContext _localctx = new LongRealValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_longRealValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LONGREAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OberonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OberonParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OberonTypeContext extends ParserRuleContext {
		public OberonTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oberonType; }
	 
		public OberonTypeContext() { }
		public void copyFrom(OberonTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerTypeContext extends OberonTypeContext {
		public IntegerTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class LongTypeContext extends OberonTypeContext {
		public LongTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ShortTypeContext extends OberonTypeContext {
		public ShortTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class LongRealTypeContext extends OberonTypeContext {
		public LongRealTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanTypeContext extends OberonTypeContext {
		public BooleanTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class RealTypeContext extends OberonTypeContext {
		public RealTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ReferenceTypeContext extends OberonTypeContext {
		public Token name;
		public TerminalNode Id() { return getToken(OberonParser.Id, 0); }
		public ReferenceTypeContext(OberonTypeContext ctx) { copyFrom(ctx); }
	}

	public final OberonTypeContext oberonType() throws RecognitionException {
		OberonTypeContext _localctx = new OberonTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_oberonType);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new ShortTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new LongTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new LongRealTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				match(T__55);
				}
				break;
			case Id:
				_localctx = new ReferenceTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				((ReferenceTypeContext)_localctx).name = match(Id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\64\n\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3<\n\3\r\3\16\3=\5\3@\n\3\3\3\3"+
		"\3\6\3D\n\3\r\3\16\3E\5\3H\n\3\3\3\3\3\6\3L\n\3\r\3\16\3M\5\3P\n\3\3\3"+
		"\7\3S\n\3\f\3\16\3V\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4b"+
		"\n\4\r\4\16\4c\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6r\n"+
		"\6\f\6\16\6u\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\177\n\7\3\7\3\7"+
		"\3\7\5\7\u0084\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16"+
		"\b\u0091\13\b\3\t\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\n\3\n\3"+
		"\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n"+
		"\f\3\f\5\f\u00bc\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e8"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f1\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\6\r\u00fb\n\r\r\r\16\r\u00fc\3\r\3\r\5\r\u0101\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r\3\r\3\r\5\r\u0135"+
		"\n\r\3\r\3\r\3\r\5\r\u013a\n\r\3\r\3\r\3\r\6\r\u013f\n\r\r\r\16\r\u0140"+
		"\7\r\u0143\n\r\f\r\16\r\u0146\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0152\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u015e\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0177\n\27\3\27\2\4\26\30\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\6\4\2\n\n\26\32\3\2\33\35\3\2\36 \3\2@A\2\u019f\2.\3\2\2"+
		"\2\4?\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\nn\3\2\2\2\fz\3\2\2\2\16\u008a\3\2"+
		"\2\2\20\u0092\3\2\2\2\22\u009a\3\2\2\2\24\u00a5\3\2\2\2\26\u00bb\3\2\2"+
		"\2\30\u0139\3\2\2\2\32\u0151\3\2\2\2\34\u015d\3\2\2\2\36\u015f\3\2\2\2"+
		" \u0163\3\2\2\2\"\u0165\3\2\2\2$\u0167\3\2\2\2&\u0169\3\2\2\2(\u016b\3"+
		"\2\2\2*\u016d\3\2\2\2,\u0176\3\2\2\2./\7\3\2\2/\60\7B\2\2\60\61\7\4\2"+
		"\2\61\63\5\4\3\2\62\64\5\24\13\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2"+
		"\2\2\65\66\7\5\2\2\66\67\7B\2\2\678\7\6\2\28\3\3\2\2\29;\7\7\2\2:<\5\6"+
		"\4\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?9\3\2\2\2?@\3\2"+
		"\2\2@G\3\2\2\2AC\7\b\2\2BD\5\b\5\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GA\3\2\2\2GH\3\2\2\2HO\3\2\2\2IK\7\t\2\2JL\5\n\6\2KJ\3\2"+
		"\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OI\3\2\2\2OP\3\2\2\2PT\3\2"+
		"\2\2QS\5\f\7\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3"+
		"\2\2\2WX\7B\2\2XY\7\n\2\2YZ\7\13\2\2Z[\7;\2\2[\\\7\f\2\2\\h\5,\27\2]^"+
		"\7B\2\2^_\7\n\2\2_a\7\r\2\2`b\5\n\6\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2de\3\2\2\2ef\7\5\2\2fh\3\2\2\2gW\3\2\2\2g]\3\2\2\2h\7\3\2\2\2"+
		"ij\7B\2\2jk\7\n\2\2kl\5\26\f\2lm\7\4\2\2m\t\3\2\2\2ns\7B\2\2op\7\16\2"+
		"\2pr\7B\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\7\17\2\2wx\5,\27\2xy\7\4\2\2y\13\3\2\2\2z{\7\20\2\2{|\7B\2\2|~\7"+
		"\21\2\2}\177\5\16\b\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083"+
		"\7\22\2\2\u0081\u0082\7\17\2\2\u0082\u0084\5,\27\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087"+
		"\5\4\3\2\u0087\u0088\5\24\13\2\u0088\u0089\7B\2\2\u0089\r\3\2\2\2\u008a"+
		"\u008f\5\22\n\2\u008b\u008c\7\16\2\2\u008c\u008e\5\22\n\2\u008d\u008b"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\17\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0097\5\26\f\2\u0093\u0094\7\16"+
		"\2\2\u0094\u0096\5\26\f\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\21\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u009a\u009f\7B\2\2\u009b\u009c\7\16\2\2\u009c\u009e\7B\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\5"+
		",\27\2\u00a4\23\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\5\30\r\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\b\f\1\2\u00aa\u00ab\7\21\2"+
		"\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\7\22\2\2\u00ad\u00bc\3\2\2\2\u00ae"+
		"\u00bc\5 \21\2\u00af\u00bc\5\"\22\2\u00b0\u00bc\5$\23\2\u00b1\u00bc\5"+
		"&\24\2\u00b2\u00bc\5(\25\2\u00b3\u00bc\5*\26\2\u00b4\u00bc\7B\2\2\u00b5"+
		"\u00b6\7B\2\2\u00b6\u00b8\7\21\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\22\2\2\u00bb"+
		"\u00a9\3\2\2\2\u00bb\u00ae\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b0\3\2"+
		"\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb"+
		"\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bc\u00d0\3\2\2\2\u00bd\u00be\f\5"+
		"\2\2\u00be\u00bf\t\2\2\2\u00bf\u00cf\5\26\f\6\u00c0\u00c1\f\4\2\2\u00c1"+
		"\u00c2\t\3\2\2\u00c2\u00cf\5\26\f\5\u00c3\u00c4\f\3\2\2\u00c4\u00c5\t"+
		"\4\2\2\u00c5\u00cf\5\26\f\4\u00c6\u00c7\f\7\2\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00cf\7B\2\2\u00c9\u00ca\f\6\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\5\26"+
		"\f\2\u00cc\u00cd\7\25\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00bd\3\2\2\2\u00ce"+
		"\u00c0\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c9\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\27\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\r\1\2\u00d4\u00d5\7B\2\2"+
		"\u00d5\u00d6\7!\2\2\u00d6\u013a\5\26\f\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9"+
		"\7!\2\2\u00d9\u00da\5\26\f\2\u00da\u013a\3\2\2\2\u00db\u00dc\7\"\2\2\u00dc"+
		"\u00dd\7\21\2\2\u00dd\u00de\7B\2\2\u00de\u013a\7\22\2\2\u00df\u00e0\7"+
		"#\2\2\u00e0\u00e1\7\21\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7\22\2\2\u00e3"+
		"\u013a\3\2\2\2\u00e4\u00e5\7B\2\2\u00e5\u00e7\7\21\2\2\u00e6\u00e8\5\20"+
		"\t\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u013a\7\22\2\2\u00ea\u00eb\7$\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7"+
		"%\2\2\u00ed\u00f0\5\30\r\2\u00ee\u00ef\7&\2\2\u00ef\u00f1\5\30\r\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\5"+
		"\2\2\u00f3\u013a\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6\5\26\f\2\u00f6"+
		"\u00f7\7%\2\2\u00f7\u00fa\5\30\r\2\u00f8\u00f9\7\'\2\2\u00f9\u00fb\5\36"+
		"\20\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff\u0101\5\30"+
		"\r\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7\5\2\2\u0103\u013a\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106\5\26"+
		"\f\2\u0106\u0107\7)\2\2\u0107\u0108\5\30\r\2\u0108\u0109\7\5\2\2\u0109"+
		"\u013a\3\2\2\2\u010a\u010b\7*\2\2\u010b\u010c\5\30\r\2\u010c\u010d\7+"+
		"\2\2\u010d\u010e\5\26\f\2\u010e\u013a\3\2\2\2\u010f\u0110\7,\2\2\u0110"+
		"\u0111\5\30\r\2\u0111\u0112\7-\2\2\u0112\u0113\5\26\f\2\u0113\u0114\7"+
		")\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7\5\2\2\u0116\u013a\3\2\2\2\u0117"+
		"\u0118\7,\2\2\u0118\u0119\7B\2\2\u0119\u011a\7.\2\2\u011a\u011b\5\26\f"+
		"\2\u011b\u011c\7/\2\2\u011c\u011d\5\26\f\2\u011d\u011e\7)\2\2\u011e\u011f"+
		"\5\30\r\2\u011f\u0120\7\5\2\2\u0120\u013a\3\2\2\2\u0121\u0122\7\60\2\2"+
		"\u0122\u0123\5\30\r\2\u0123\u0124\7\5\2\2\u0124\u013a\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126\u013a\5\26\f\2\u0127\u0128\7\62\2\2\u0128\u0129\5\26\f"+
		"\2\u0129\u012a\7\f\2\2\u012a\u012f\5\34\17\2\u012b\u012c\7\63\2\2\u012c"+
		"\u012e\5\34\17\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\7&\2\2\u0133\u0135\5\30\r\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\5\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u013a\7\64\2\2\u0139\u00d3\3\2\2\2\u0139\u00d7\3\2\2\2\u0139\u00db\3"+
		"\2\2\2\u0139\u00df\3\2\2\2\u0139\u00e4\3\2\2\2\u0139\u00ea\3\2\2\2\u0139"+
		"\u00f4\3\2\2\2\u0139\u0104\3\2\2\2\u0139\u010a\3\2\2\2\u0139\u010f\3\2"+
		"\2\2\u0139\u0117\3\2\2\2\u0139\u0121\3\2\2\2\u0139\u0125\3\2\2\2\u0139"+
		"\u0127\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u0144\3\2\2\2\u013b\u013e\f\20"+
		"\2\2\u013c\u013d\7\4\2\2\u013d\u013f\5\30\r\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u013b\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\31\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0152\7B\2\2"+
		"\u0148\u0149\5\26\f\2\u0149\u014a\7\24\2\2\u014a\u014b\5\26\f\2\u014b"+
		"\u014c\7\25\2\2\u014c\u0152\3\2\2\2\u014d\u014e\5\26\f\2\u014e\u014f\7"+
		"\6\2\2\u014f\u0150\7B\2\2\u0150\u0152\3\2\2\2\u0151\u0147\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u014d\3\2\2\2\u0152\33\3\2\2\2\u0153\u0154\5\26\f"+
		"\2\u0154\u0155\7\17\2\2\u0155\u0156\5\30\r\2\u0156\u015e\3\2\2\2\u0157"+
		"\u0158\5\26\f\2\u0158\u0159\7/\2\2\u0159\u015a\5\26\f\2\u015a\u015b\7"+
		"\17\2\2\u015b\u015c\5\30\r\2\u015c\u015e\3\2\2\2\u015d\u0153\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015e\35\3\2\2\2\u015f\u0160\5\26\f\2\u0160\u0161\7%\2"+
		"\2\u0161\u0162\5\30\r\2\u0162\37\3\2\2\2\u0163\u0164\7;\2\2\u0164!\3\2"+
		"\2\2\u0165\u0166\7<\2\2\u0166#\3\2\2\2\u0167\u0168\7=\2\2\u0168%\3\2\2"+
		"\2\u0169\u016a\7>\2\2\u016a\'\3\2\2\2\u016b\u016c\7?\2\2\u016c)\3\2\2"+
		"\2\u016d\u016e\t\5\2\2\u016e+\3\2\2\2\u016f\u0177\7\65\2\2\u0170\u0177"+
		"\7\66\2\2\u0171\u0177\7\67\2\2\u0172\u0177\78\2\2\u0173\u0177\79\2\2\u0174"+
		"\u0177\7:\2\2\u0175\u0177\7B\2\2\u0176\u016f\3\2\2\2\u0176\u0170\3\2\2"+
		"\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0175\3\2\2\2\u0177-\3\2\2\2\"\63=?EGMOTcgs~\u0083\u008f"+
		"\u0097\u009f\u00b8\u00bb\u00ce\u00d0\u00e7\u00f0\u00fc\u0100\u012f\u0134"+
		"\u0139\u0140\u0144\u0151\u015d\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}