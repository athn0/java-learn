package com.learn.java.poo;

public class Usuario {
    private int id;
    private int codigo;
    private String nombre;
    private String clave;
    private static int conectados;
    private static int ultimoId;
    public Usuario() {
        this.id = ++ultimoId; // auto incremento
    }
    public Usuario(int codigo, String nombre, String clave) {
        this();
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", conectados=" + conectados +
                '}';
    }
    public static int getConectados() {
        return Usuario.conectados;
    }

     public static void setConectados(int conectados) {
            Usuario.conectados = conectados;
     }

}
