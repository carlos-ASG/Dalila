package com.dalila.compiler.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.dalila.compiler.lexer.Tokens;

import com.dalila.compiler.lexer.Lexer;

public class LerxerService {
    public static String AnalizarCodigo(String path){
        String resultado = "";
        try {
            Reader lector = new BufferedReader(new FileReader(path));
            Lexer lexer = new Lexer(lector);
            
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    break;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += lexer.lexeme + " Simbolo no definido\n";
                        break;
                        case Identificador:
                        case Def:
                        case parentecis_a:
                        case parentecis_c:
                        case llave_a:
                        case llave_c:
                        case constante:
                        case DosPuntos:
                        case Numero:
                        case Unit:
                        case PuntoYComa:
                            resultado += lexer.lexeme + ": es un " + tokens + "\n";
                        break;
                        case Int:
                            resultado += lexer.lexeme + ": es un " + tokens + "\n";
                            break;
                        case Igual:
                            resultado += lexer.lexeme + ": es un " + tokens + "\n";
                            break;
                        case saltoLinea:
                            resultado += "\\n" + ": es un " + tokens + "\n";
                        break;
                
                    default:
                        resultado += "Token: " + tokens + "/n";
                        break;
                }
            }
            return resultado;
        } catch (FileNotFoundException e) {
        }catch(IOException ex){}
        return path;
    }
}
