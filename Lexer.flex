/* --------------------------Codigo de Usuario----------------------- */
package pythoncompiler;

import java_cup.runtime.*;
import java.io.Reader;


%% //inicio de opciones

/* ------ Seccion de opciones y declaraciones de JFlex -------------- */


%class Lexer

/*
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%line
%column
/*
   Activamos la compatibilidad con Java CUP para analizadores
   sintacticos(parser)
*/
%cup
//Agregamos soporte a unicode
%unicode
%eofval{
    return new Symbol(sym.EOF, new String("Fin de Archivo"));
%eofval}

/*
    Declaraciones

    El codigo entre %{  y %} sera copiado integramente en el
    analizador generado.
*/
%{
    /*  Generamos un java_cup.Symbol para guardar el tipo de token
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Generamos un Symbol para el tipo de token encontrado
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


/*----------------------------------------------INVALID TOKENS-------------------------------------*/
INVALID_CHARACTER       = "á"|"é"|"í"|"ó"|"ú"|"Á"|"É"|"Í"|"Ó"|"Ú"|"ñ"|"Ñ"|"¿"|"ä"|"ë"|"ï"|"ö"|"ü"|"à"|"è"|"ì"|"ò"|"ù"|\\

/*----------------------------------------------TYPES-------------------------------------*/
TYPE_NUM                = "int"|"float"|"double"
TYPE_CHAR               = "char"
TYPE_STRING             = "String"
TYPE_BOOLEAN            = "boolean"

/*----------------------------------------------COMMENTS-------------------------------------*/
COMMENT                 =  {LINE_COMMENT}|{BLOCK_COMMENT}
LINE_COMMENT            = \#[^\n\r]*
BLOCK_COMMENT           = \"\"\"([^\"])* ~ \"\"\"

/*----------------------------------------------MICELLANEOUS-------------------------------------*/
SPACE                   = " "
LINE_FEED               = \n|\r|\r\n
WHITESPACE              = {SPACE}|{LINE_FEED}| [ \t\n]

/*----------------------------------------------IDENTIFIERS-------------------------------------*/
EXP_ALPHA               = [a-zA-Z]
IDENTIFIER              = ({EXP_ALPHA}|"_")({EXP_ALPHA}|{INT}|"_")*
INVALID_IDENTIFIER      = {IDENTIFIER}*{INVALID_CHARACTER}+({IDENTIFIER}|{INVALID_CHARACTER})*



/*----------------------------------------------OPERATORS-------------------------------------*/
ARITH_OP                = "+"|"-"|"*"|"/"|"%"|"**"|"//"
COMP_OP                 = "=="|"!="|"<>"|">"|"<"|">="|"<="
ASSIG_OP                = "="|"+="|"-="|"*="|"/="|"//="|"%="|"**="
BIT_OP                  = "&"|"|"|"^"|"~"|"<<"|">>"
LOGICAL_OP              = "AND"|"OR"|"NOT"
MEMBERSHIP_OP           = "in"|"not in"
IDENTITY_OP             = "is"|"is not"|"isn't"
DELIMITER_OP            = "@"|">>="|"<<="|"&="|"|="

L_PARENTHESIS_OP        = "("
R_PARENTHESIS_OP        = ")"
L_BRACKET_OP            = "["
R_BRACKET_OP            = "]"
L_CURLY_BRACKET_OP      = "{"
R_CURLY_BRACKET_OP      = "}"
LIST_OP                 = ":"
SEPARATOR_OP            = ","
PROPERTY_OP             = "."
SEMICOLON_OP            = ";"
TAB_OP                  = [\t]

OPERATOR               = {ARITH_OP}|{COMP_OP}|{ASSIG_OP}|{BIT_OP}|{LOGICAL_OP}|{MEMBERSHIP_OP}|
                        {IDENTITY_OP}|{DELIMITER_OP}|{L_PARENTHESIS_OP}|{R_PARENTHESIS_OP}|{L_BRACKET_OP}|{R_BRACKET_OP}
                        |{L_CURLY_BRACKET_OP}|{R_CURLY_BRACKET_OP}|{LIST_OP}|{SEPARATOR_OP}|{PROPERTY_OP}|{TAB_OP}|{SEMICOLON_OP}

/*----------------------------------------------KEYWORDS-------------------------------------*/
KEYWORD                 = "and"|"del"|"from"|"not"|"while"|"as"|"elif"|"global"|"or"|"with"|"assert"|"else"|"if"|"pass"|"yield"|"break"|"except"|"import"|"print"|"class"|"exec"|"in"|"raise"|"continue"|"finally"|"is"|"return"|"def"|"for"|"lambda"|"try"|"end"|"input"

/*----------------------------------------------LITERALS-------------------------------------*/
LONG_INT                = {INT}("l"|"L")

INT                     = {DECIMAL_INT}|{OCT_INT}|{HEX_INT}|{BIN_INT}
DECIMAL_INT             = {NON_CERO_DIGIT}{DIGIT}*|"0"
OCT_INT                 = "0"("o" | "O"){OCT_DIGIT}+ |  "0"{OCT_DIGIT}+
HEX_INT                 = "0"("x" | "X"){HEX_DIGIT}+
BIN_INT                 = "0"("b" | "B") {BIN_DIGIT}+
DIGIT                   = [0-9]
NON_CERO_DIGIT          = [1-9]
BIN_DIGIT               = "0"|"1"
OCT_DIGIT               = [0-7]
HEX_DIGIT               = {DIGIT}|[a-f]|[A-F]

FLOAT_NUM               = {POINT_FLOAT}|{EXP_FLOAT}
POINT_FLOAT             = {INT_PART}?{FRACTION_PART}|{INT_PART}"."
EXP_FLOAT               = ({INT_PART}|{POINT_FLOAT}){EXP}
INT_PART                = {DIGIT}+
FRACTION_PART           = "."{DIGIT}+
EXP                     = ("e" | "E")("+" | "-") {DIGIT}+
IMAG_NUM                = ({FLOAT_NUM}|{INT_PART})("j" | "J")

NUM_LIT                 = {LONG_INT}|{INT}|{FLOAT_NUM}|{IMAG_NUM}

STRING_PREFIX           = "r" | "u" | "ur" | "R" | "U" | "UR" | "Ur" | "uR"| "b" | "B" | "br" | "Br" | "bR" | "BR"
STRING_LIT              = \"[^\n\r\"]*\"
INVALID_STR_LIT         = \"+{STRING_LIT} | {STRING_LIT}\"+ | \"[^\n\r\"]*\
CHAR_LIT                = \'[^\']\'
INVALID_CHAR_LIT        = \'[^\']+\' | \'+\'[^\']+\' | \'[^\']+\'\'+
BOOLEAN_LIT             = "True"|"False"


LITERAL                 = {NUM_LIT}|{STRING_PREFIX}?({STRING_LIT}|{CHAR_LIT})|{BOOLEAN_LIT}
INVALID_LITERAL         = {INVALID_STR_LIT} | {INVALID_CHAR_LIT} |{NUM_LIT}({EXP_ALPHA} | {INVALID_CHARACTER} | "_"| (({EXP_ALPHA}|{INVALID_CHARACTER}|"_"){NUM_LIT}))+

%% //fin de opciones

<YYINITIAL> {
    {COMMENT} {/*IGNORE*/}
    {WHITESPACE} {/*IGNORE*/}

    {SEMICOLON_OP}          { return symbol(sym.SEMICOLON_OP); }
    {ARITH_OP}              { return symbol(sym.ARITH_OP); }
    {L_PARENTHESIS_OP}      { return symbol(sym.L_PARENTHESIS_OP); }
    {R_PARENTHESIS_OP}      { return symbol(sym.R_PARENTHESIS_OP); }
    {NUM_LIT}               { return symbol(sym.NUM_LIT, new Integer(yytext())); }




}
[^]                         { return symbol(sym.error);
        System.out.println("*** Error lexico ***\n");
        System.out.println("Caracter ilegal: " + yytext() + " line: " + yyline); }


