package com.learn.java.poo;

public enum TipoMoto {
    SCOOTER("Scooter",Color.ROJO,9),
    MOTOCROSS("Scooter",Color.AZUL,5),
    SUPERMOTARD("Scooter",Color.GRIS,7),
    CHOPPER("Scooter",Color.ROJO,4),
    ELECTRIC("Scooter",Color.NEGRO,2);

    private final String tipo;
    private final Color color;
    private final int num;
    TipoMoto(String tipo, Color color, int num) {
        this.color = color;
        this.tipo = tipo;
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public Color getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }
}
