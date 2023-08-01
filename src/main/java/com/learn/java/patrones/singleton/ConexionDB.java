package com.learn.java.patrones.singleton;

public class ConexionDB {

    // constructor debe ser privado
    private ConexionDB() {
        System.out.println("onectando al motor de base de datos");
    }

    // devolver siempre la unica instancia
    public static ConexionDB getInstancia() {
        if (ConexionDB.instancia == null) {
            ConexionDB.instancia = new ConexionDB();
        }
        return ConexionDB.instancia;
    }

    private static ConexionDB instancia;

}
