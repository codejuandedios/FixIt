package com.example.fixit;

public class UsuarioPerfil {
    //Atributos de la clase
    private static int carne;
    private static String nombre;
    private static String apellido;
    private static String email;
    private String password;
    private int id_rol;
    private int estado;

    //Constructor que recibe todos los parametros de usuario
    public UsuarioPerfil(int carne, String nombre, String apellido, String email, String password, int id_rol, int estado){
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.id_rol = id_rol;
        this.estado = estado;
    }

    //Constructor sin parametros
    public UsuarioPerfil() {

    }

    //Metodos gets y sets

    public static int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdRol() {
        return id_rol;
    }

    public void setIdRol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
