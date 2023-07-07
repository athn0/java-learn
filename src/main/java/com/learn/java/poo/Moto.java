package com.learn.java.poo;

public class Moto {
    private int id;
    private int codigo;
    private String nombre;
    private String marca;
    private int velocidad;
    private Color color;
    private TipoMoto tipoMoto;
    private static int lastId;

    public Moto() {
        this.id = ++lastId;
    }

    public Moto(int codigo, String nombre, String marca, int velocidad) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Moto(String nombre, String marca, Color color, TipoMoto tipoMoto) {
        this();
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.tipoMoto = tipoMoto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Moto.lastId = lastId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", color=" + color +
                ", tipoMoto=" + tipoMoto +
                '}';
    }
}
