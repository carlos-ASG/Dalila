package com.dalila.compiler.lexer;
import static com.dalila.compiler.lexer.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
float {lexeme=yytext(); return Float;}
double {lexeme=yytext(); return Double;}
bool {lexeme=yytext(); return Boleano;}
int {lexeme=yytext(); return Int;}
string {lexeme=yytext(); return string;}
unit {lexeme=yytext(); return Unit;}
none {lexeme=yytext(); return None;}
def {lexeme=yytext(); return Def;}
return {lexeme=yytext(); return Return;}
class {lexeme=yytext(); return Class;}
swtich {lexeme=yytext(); return Switch;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
while {lexeme=yytext(); return While;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"%" {return Residuo;}
"==" {return Igual;}
">" {return Suma;}
"<" {return Resta;}
">=" {return Multiplicacion;}
"<=" {return Division;}
"and" {return And;}
"or" {return Or;}
({L} | _)({L}|{D})* {lexeme=yytext(); return Identificador;}
((- | ""){D}+((.{D}+) | "")) {lexeme=yytext(); return Numero;}
 . {return ERROR;}
