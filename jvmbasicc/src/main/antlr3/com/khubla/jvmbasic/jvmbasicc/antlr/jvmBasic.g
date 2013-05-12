grammar jvmBasic;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
options {
    backtrack=true;
    output=AST; 	
    ASTLabelType=CommonTree;
    k=1; 
}

tokens {
 RETURN='RETURN';
 PRINT='PRINT';
 GOTO = 'GOTO';
 GOSUB = 'GOSUB';
 IF = 'IF';
 NEXT = 'NEXT';
 THEN = 'THEN';
 REM = 'REM';
 CHR = 'CHR$';
 MID = 'MID$';
 LEFT='LEFT$';
 RIGHT='RIGHT$';
 STR ='STR$';
 LPAREN = '(';
 RPAREN = ')';
 PLUS = '+';
 MINUS = '-';
 TIMES = '*';
 DIV = '/';
 CLEAR = 'CLEAR'; 
 GTE = '>=';
 LTE = '<=';
 GT = '>';
 LT = '<';
 EQ = '=';
 NEQ= '< >';
 COMMA = ',';
 LIST = 'LIST';
 RUN = 'RUN';
 END = 'END';
 LET = 'LET';
 EQ = '=';
 FOR = 'FOR';
 TO = 'TO';
 STEP = 'STEP';
 INPUT = 'INPUT';
 SEMICOLON = ';';
 DIM = 'DIM';
 SQR = 'SQR';
 COLON = ':';
 TEXT = 'TEXT';
 HGR = 'HGR';
 HGR2 = 'HGR2';
 LEN = 'LEN';
 CALL = 'CALL';
 ASC = 'ASC';
 HPLOT = 'HPLOT';
 VPLOT = 'VPLOT';
 PRNUMBER = 'PR#';
 INNUMBER = 'IN#'; 
 VTAB = 'VTAB';
 HTAB = 'HTAB';
 HOME = 'HOME';
 ON = 'ON';
 PDL = 'PDL';
 PLOT = 'PLOT';
 PEEK =  'PEEK';
 POKE = 'POKE';
 INTF = 'INT';
 STOP= 'STOP';
 HIMEM = 'HIMEM';
 LOMEM = 'LOMEM';
 FLASH = 'FLASH';
 INVERSE =  'INVERSE';
 NORMAL = 'NORMAL';
 ONERR = 'ONERR';
 SPC = 'SPC';
 FRE = 'FRE';
 POS = 'POS';
 USR = 'USR';
 TRACE = 'TRACE';
 NOTRACE = 'NOTRACE';
 AND = 'AND';
 OR = 'OR';
 DATA = 'DATA';
 WAIT = 'WAIT';
 READ = 'READ';
 XDRAW = 'XDRAW';
 DRAW = 'DRAW';
 AT = 'AT';
 DEF = 'DEF';
 FN = 'FN';
 VAL = 'VAL';
 TAB = 'TAB';
 SPEED = 'SPEED';
 ROT = 'ROT';
 SCALE = 'SCALE';
 COLOR = 'COLOR';
 HCOLOR = 'HCOLOR';
 HLIN = 'HLIN';
 VLIN = 'VLIN';
 SCRN = 'SCRN';
 POP = 'POP';
 SHLOAD = 'SHLOAD'; 
 SIN = 'SIN';
 COS = 'COS';
 TAN = 'TAN';
 ATN = 'ATN';
 RND = 'RND';
 SGN = 'SGN';
 EXP = 'EXP';
 LOG = 'LOG';
 ABS = 'ABS';
 STORE = 'STORE';
 RECALL = 'RECALL';
 GET = 'GET';
 EXPONENT='^';
 AMPERSAND = '&';
 GR = 'GR';
 NOT = 'NOT';
 RESTORE = 'RESTORE';
 SAVE='SAVE';
 LOAD = 'LOAD';
 QUESTION = '?';
 INCLUDE = 'INCLUDE';
}

@header {
    package com.khubla.jvmbasic.jvmbasicc.antlr;
} 

@lexer::header {
    package com.khubla.jvmbasic.jvmbasicc.antlr;
} 

	 

// a program is a collection of lines
prog : line + ;

// a line starts with an INT and ends with a CR or a COLON
line : linenumber^  amprstmt (COLON amprstmt?)* (CR | EOF)!;
amperoper: AMPERSAND;
linenumber: NUMBER;
amprstmt: amperoper? statement^;
statement : LOAD | SAVE | RESTORE | TRACE| NOTRACE | FLASH | INVERSE| GR| NORMAL | SHLOAD | RETURN | CLEAR | RUN | END^ | STOP | TEXT | HOME | HGR | HGR2 |amptstmt| popstmt | liststmt| storestmt| getstmt | recallstmt |instmt| prstmt |onerrstmt| hlinstmt|vlinstmt|colorstmt| speedstmt |scalestmt|rotstmt| hcolorstmt| himemstmt| lomemstmt | printstmt1 |pokestmt | plotstmt| ongotostmt |ongosubstmt| ifstmt | comment |nextstmt| forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt |readstmt| hplotstmt | vplotstmt | vtabstmnt| htabstmnt|waitstmt |datastmt| xdrawstmt | drawstmt |defstmt| letstmt | includestmt;
vardecl	: var ( LPAREN exprlist RPAREN)*;
printstmt1: (PRINT | QUESTION)^ printlist?;
printlist : expression (COMMA^ | SEMICOLON^)? printlist*;	 
getstmt : GET exprlist;
letstmt : LET^? variableassignment;
variableassignment : vardecl EQ^ exprlist; 	 
relop :lte | gte | neq | EQ | GT | LT ;
gte : GTE | (GT EQ) | (EQ GT);
lte : LTE | (LT EQ) | (EQ LT);
neq : NEQ;
ifstmt : IF^ expression THEN? statement;
forstmt : FOR^  vardecl EQ expression TO expression (STEP expression)? ;
nextstmt : NEXT^ varlist?;
inputstmt : INPUT^ (stringliteral (COMMA| SEMICOLON))? varlist; 
readstmt: READ^ varlist;   
dimstmt : DIM^ varlist;
gotostmt: GOTO^ linenumber;
gosubstmt: GOSUB^ linenumber;
pokestmt: POKE expression COMMA expression;
comment: REM^ (options {greedy=false;} : (~(CR)))*;
callstmt: CALL^ exprlist;
hplotstmt: HPLOT^ (expression COMMA expression)? (TO expression COMMA expression)*;
vplotstmt: VPLOT^ (expression COMMA expression)? (TO expression COMMA expression)*;
plotstmt: PLOT expression COMMA expression;
ongotostmt : ON expression GOTO linenumber (COMMA linenumber)*;
ongosubstmt : ON expression GOSUB linenumber (COMMA linenumber)*;
vtabstmnt : VTAB^ expression;
htabstmnt : HTAB^ expression;
himemstmt: HIMEM^ COLON expression;
lomemstmt: LOMEM^ COLON expression;
datastmt: DATA^ expression (COMMA expression?)*;
waitstmt: WAIT^ expression COMMA expression (COMMA expression)?;
xdrawstmt: XDRAW^ expression (AT expression COMMA expression)?;
drawstmt: DRAW^ expression (AT expression COMMA expression)?;
defstmt: DEF FN var LPAREN var RPAREN EQ expression;
tabstmt: TAB^ LPAREN expression RPAREN;
speedstmt: SPEED^ EQ expression;
rotstmt: ROT^ EQ expression;
scalestmt: SCALE^ EQ expression;
colorstmt: COLOR^ EQ expression;
hcolorstmt: HCOLOR^ EQ expression;
hlinstmt: HLIN^ expression COMMA expression AT expression;
vlinstmt: VLIN^ expression COMMA expression AT expression;
onerrstmt: ONERR GOTO linenumber;
prstmt: PRNUMBER^ NUMBER;
instmt: INNUMBER^ NUMBER;
storestmt: STORE vardecl;
recallstmt: RECALL vardecl;
liststmt: LIST^ expression?;
popstmt	: POP^ (expression COMMA expression)?;
amptstmt: AMPERSAND^ expression;
includestmt : INCLUDE^ expression;	
	 
// expressions and such
func : vardecl | stringliteral | NUMBER | FLOAT | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc| scrnfunc  | midfunc | pdlfunc | peekfunc | intfunc | spcfunc | frefunc | posfunc | usrfunc |leftfunc | valfunc | rightfunc|fnfunc|sinfunc | cosfunc |tanfunc|atnfunc|rndfunc|sgnfunc|expfunc|logfunc|absfunc | (LPAREN expression RPAREN);
signExpression : NOT? ((PLUS|MINUS))* func;
exponentExpression : signExpression (EXPONENT signExpression)*;
multiplyingExpression  : exponentExpression ((TIMES|DIV)^ exponentExpression)*;
addingExpression : multiplyingExpression ((PLUS|MINUS)^ multiplyingExpression)*;
relationalExpression  : addingExpression ((relop^) addingExpression)*;
expression: relationalExpression ((AND|OR) relationalExpression^)*;

// lists
var: varname^ varsuffix?;
varname	: LETTERS (LETTERS |DIGIT)*;
varsuffix:('$' | '%');	 
varlist : vardecl (COMMA! vardecl^)*;
exprlist : expression (COMMA! expression^)*;

//floating point number
fragment stringliteral: STRINGLITERAL;

//fragment exponentliteral: ('+' | '-')?	('E' INTEGERS);
// functions
sqrfunc : SQR^ LPAREN expression RPAREN;
chrfunc	: CHR^ LPAREN expression RPAREN;
lenfunc : LEN^ LPAREN expression RPAREN;
ascfunc : ASC^ LPAREN expression RPAREN;	
midfunc : MID^ LPAREN expression COMMA expression COMMA expression RPAREN;
pdlfunc : PDL^ LPAREN expression RPAREN;
peekfunc: PEEK^ LPAREN expression RPAREN;
intfunc	: INTF^ LPAREN expression RPAREN;
spcfunc:  SPC^ LPAREN expression RPAREN;
frefunc : FRE^ LPAREN expression RPAREN;
posfunc:  POS^ LPAREN expression RPAREN;
usrfunc:  USR^ LPAREN expression RPAREN;
leftfunc: LEFT^ LPAREN expression COMMA expression RPAREN;
rightfunc: RIGHT^ LPAREN expression COMMA expression RPAREN;
strfunc	: STR^ LPAREN expression RPAREN;	
fnfunc: FN^ var LPAREN expression RPAREN;
valfunc: VAL^ LPAREN expression RPAREN;
scrnfunc: SCRN^ LPAREN expression COMMA expression RPAREN;
sinfunc : SIN^ LPAREN expression RPAREN;
cosfunc : COS^ LPAREN expression RPAREN;
tanfunc : TAN^ LPAREN expression RPAREN;
atnfunc : ATN^ LPAREN expression RPAREN;
rndfunc : RND^ LPAREN expression RPAREN;
sgnfunc : SGN^ LPAREN expression RPAREN;
expfunc : EXP^ LPAREN expression RPAREN;
logfunc : LOG^ LPAREN expression RPAREN;
absfunc : ABS^ LPAREN expression RPAREN;

STRINGLITERAL: '"' ( ~('"'|'\\'))* '"' ;
LETTERS	:('a'..'z' |'A'..'Z' )+;
fragment DIGIT  : ('0'..'9');
NUMBER	: DIGIT+;
FLOAT	: DIGIT* '.' DIGIT+;
CR    :     ('\r' |'\n' | '\r\n'| '\n\r');
WS      :     (' ')+ {$channel=HIDDEN;};

    