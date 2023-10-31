/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dalila.compiler.lexer;

import java.io.File;

/**
 *
 * @author carsu
 */
public class Generador {
    public static void main(String[] args) {
        String ruta = "src/main/java/com/dalila/compiler/lexer/Lexer.flex";
        generarLexer(ruta);
    }
    
    private static void generarLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
    }
    
}
