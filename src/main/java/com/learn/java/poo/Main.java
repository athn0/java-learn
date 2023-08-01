package com.learn.java.poo;
import com.learn.java.AutoPojo;

import static com.learn.java.Result.Show;
public class Main {

    public static void main(String[] args) {
        Usuario us1 = new Usuario(34392,"antoniod45","#######");
        Usuario us2 = new Usuario(34392,"antoniod45","#######");
        Usuario us4 = new Usuario(90743,"fedo03","#######");
        Usuario us3 = us1;
        Usuario.setConectados(20);
        // comparacion de instancia
        Show(us1 == us3); /* son equivalentes*/ Show(us1.equals(us3));

        Show(us1.equals(us2));

        // variable compartida en los objetos
        // var statico 'conectados' se comparte entre todas las instancias
        Show(us1.getConectados() + " " + us4.getConectados());

        Usuario.setConectados(30);
        Show(us1.getConectados() + " " + us4.getConectados());

        Show(us1);Show(us2);Show(us3);Show(us4);

        // Usos de ENUM

        AutoPojo auto = new AutoPojo(us1.getId(),"mazda");
        auto.setColor(Color.AZUL.toString());
        Show(auto);

        Moto m = new Moto("XCS-DEA","susuki",Color.ROJO, TipoMoto.ELECTRIC);
        Show(m);
        Show(m.getTipoMoto().getColor());

        // Interfaz con metodo default
        Imprimible im = new Imprimible() {};
        Show(im.imprimir());

        // Interfaz con sobrescritura
        im = new Imprimible() {
            @Override
            public String imprimir() {
                return Imprimible.super.imprimir() + ", impresion agregada";
            }
        };
        Show(im.imprimir());
        // Metodo estatico de una interfaz
        Imprimible.imprimir(im);
        // Constante estatico en un interfaz
        Show(Imprimible.TEXTO_DEFAULT);
    }
}
