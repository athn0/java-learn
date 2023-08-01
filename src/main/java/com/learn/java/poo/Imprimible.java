package com.learn.java.poo;

public interface Imprimible {

    default String imprimir() { // Metodo no requiere implementarse
        return "Impresion por defecto";
    }
    static void imprimir(Imprimible imp){
        System.out.println(imp.imprimir());
    }

    String TEXTO_DEFAULT = "Esto es una impresora";
}
