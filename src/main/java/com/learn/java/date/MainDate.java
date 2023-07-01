package com.learn.java.date;

import static com.learn.java.Result.Show;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        Show("Fecha completa : ".concat(fecha.toString()));

        Show("Fecha con formato : ".concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));
        Show("Fecha con formato : ".concat(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a").format(fecha)));

        Show("Fecha numerica en milisegundos : " + fecha.getTime());

        // perzonalizar una fecha
        Calendar cal = Calendar.getInstance();
        cal.set(2019,10,04,14,45,03);

        // --  forma mas estructurada
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DAY_OF_MONTH,5);

        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 32);
        cal.set(Calendar.SECOND, 58);

        Date fechaPerz = cal.getTime();

        Show("Fecha construida : ".concat(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a").format(fechaPerz)));

        // Converion String a Date
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaFormat;
        try {
            fechaFormat = df.parse("03/12/2023");
            Show("Fecha parseada : ".concat(fechaFormat.toString()));
            Show("Fecha parseada : ".concat(df.format(fechaFormat)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Comparar fecha si es mayor o menor

        if (fechaPerz.after(fecha)) {
            Show("La fecha construida "
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fechaPerz))
                    .concat(" es posterior a la fecha ")
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));
        } else if (fechaPerz.before(fecha)){
            Show("La fecha construida "
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fechaPerz))
                    .concat(" es anterior a la fecha ")
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));

        }

        if (fechaPerz.compareTo(fecha) > 0) {
            Show("La fecha construida "
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fechaPerz))
                    .concat(" es posterior a la fecha ")
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));
        } else if (fechaPerz.compareTo(fecha) < 0) {
            Show("La fecha construida "
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fechaPerz))
                    .concat(" es anterior a la fecha ")
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));
        } else if (fechaPerz.compareTo(fecha) == 0) {
            Show("La fecha construida "
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fechaPerz))
                    .concat(" es igual a la fecha ")
                    .concat(new SimpleDateFormat("dd/MM/yyyy").format(fecha)));
        }

        Show(fechaPerz.compareTo(fecha));
    }
}
