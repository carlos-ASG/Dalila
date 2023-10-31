package com.dalila.compiler.lexer;
import static com.dalila.compiler.lexer.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
if |
else |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
({L} | _)({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
