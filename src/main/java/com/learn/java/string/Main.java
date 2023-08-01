package com.learn.java.strings;

import static com.learn.java.Result.Show;
import java.util.Arrays;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        Show("============================================");
        Show("      Los strings son inmutables");
        Show("============================================");
        String nombre = "Hello World!";
        String ape;
        String trama = "123123530-Debito-9894223-español";

        /* Concatenaciones */

        Show(nombre + nombre.length());
        Show(nombre.concat(" ").concat(trama));
        Show(nombre.concat(" trama ".concat(trama)));

        Show("============================================");
        //-- compara en el orden nnumerico de la tabla unicode
        System.out.println("compareTo() : " + nombre.compareTo("Hello World!"));

        //-- Devuelve un caracter especificando la posicion
        System.out.println("charAt() : " + nombre.charAt(2));

        Show("              split()");

        //-- Split separa texto segun el separador especificado
        //--- aslist: metodo que convierte array a objeto arraylist
        Arrays.asList(trama.split("-")).forEach(s -> Show(s));
        ;

        //-- Uso del metodo transform que recibe una funcion lambda
        //--- este objeto objFuncion es equivalente a un lambda

        Function<String, String> objFuncion = new Function<>() {
            @Override
            public String apply(String d) {
                return d.concat("interfaz anonima");
            }
        };

        String transform = nombre.transform(objFuncion);
        System.out.println("transform() : " + nombre.transform(objFuncion));

        //--- codigo simplificado

        System.out.println("transform() : " + nombre.transform(s -> s.concat("funcion lambda")));

        String msj = "Juan".transform(x -> x.equals("Juan")) ? "Usuario valido" : "no existe usuario";
        System.out.println("transform() : " + msj);

        System.out.println("replace() : " + "abraham".replace("a", "e"));

        //-- instancia un string mutable
        StringBuilder sbuilder = new StringBuilder("string_builder");
        //-- concatenacion en stringbuilder
        sbuilder.append(" ").append(nombre).append(" ").append(trama);
        System.out.println("StringBuilder : " + sbuilder);

        String valida = "     ";
        String valida2 = "";
        msj = (valida.isBlank() ? "contiene espacios" : valida);
        System.out.println("isBlank() : " + msj);

        msj = valida2.isEmpty() ? "esta vacio" : valida;
        System.out.println("isEmpty() : " + msj);

        // retorna el indice del primer char encontrado
        System.out.println("indexOf() : " + nombre.indexOf("o"));

        // retorna el indice del ultimo char encontrado
        System.out.println("lastIndexOf() : " + nombre.lastIndexOf("o"));

        // busca si se encuentra en la variable
        System.out.println("contains() : " + nombre.contains("zr"));

        // convertir a array

        for (char c : nombre.toCharArray()) {
            System.out.print(c + " ");
        }
    }


}
