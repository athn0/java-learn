package com.learn.java.optional;

import static com.learn.java.Result.Show;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.learn.java.AutoPojo;

public class Main {

    public static void main(String[] args) {

        // -- Problemas con objetos null
        String peok;
        AutoPojo auto = new AutoPojo(1, "toyota");

        // -- Propiedades nulas pueden mostrarse sin errores
        peok = auto.getColor();
        Show(auto.getMatricula());

        // -- Cuando se hace referecia a un objeto nulo y se opera extrayendo su
        // propiedad muestra un NullPointerException
        AutoPojo auto2 = null;

        try {
            Show(auto2.getColor());
        } catch (Exception e) {
            Show(e.getMessage());
        }

        // -- Ejemplo real

        List<Nota> notas = new ArrayList<>();
        notas.add(new Nota("matematica", 7));
        notas.add(new Nota("fisica", 8));
        notas.add(new Nota("ingles", 4));
        notas.add(new Nota("lenguaje", 3));
        notas.add(new Nota("ciencia", 6));

        //--- Se quiere filtrar solo las notas aprovadas (mayores de 8)
        Nota notaAprobada = buscarNotaSobresaliente(notas);
        //--- En caso el filtro no obtiene resultados, el objeto notaAprobada sera null y dara error
        try {
            Show(notaAprobada.getValor() + "\n" + notaAprobada.getAsignatura());
        } catch (Exception e) {
            Show(e.getMessage());
        }
        
        //-- Solucion comun
        if (buscarNotaSobresaliente(notas) != null) {
            Show(notaAprobada.getValor() + "\n" + notaAprobada.getAsignatura());
        }

        //-- Solucion Optional
        Optional<Nota> oNota = Optional.ofNullable(notaAprobada);

        if (oNota.isPresent()) {
            Show(oNota.get().getAsignatura() + "\n" + oNota.get().getValor());
        }
       
    }

    public static Nota buscarNotaSobresaliente(List<Nota> notas) {
        Nota nota = null;
        for (Nota unaNota : notas) {
            if (unaNota.getValor() >= 9) {
                nota = unaNota;
            }
        }
        return nota;
    }
}
