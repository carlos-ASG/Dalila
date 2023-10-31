/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dalila.compiler.lexer;

/**
 *
 * @author carsu
 */
public enum Tokens {
    ERROR,
    Numero,
    Identificador,
        //Operadores aritmeticos
    Division,
    Igual,
    Suma,
    Resta,
    Residuo,
    Multiplicacion,
        //Palrabras reservadas
    If,
    Else,
    While,
    Switch,
    And,
    Or,
    Def,
    Variable,
    constante,
    Class,
        //Tipos de datos
    Int,
    string,
    Float,
    Double,
    Boleano,
    None,
    Unit,
    //Return
    Return,
    // puntuacion
    DosPuntos,
    PuntoYComa,
    llave_a,
    llave_c,
    parentecis_a,
    parentecis_c,
    saltoLinea,
    //Operadores Relaciones
    MayorIgualQue,
    MenorIgualQue,
    MayorQue,
    MenorQue,
    IgualA,
}
