package com.imp.progFuncional.lambdas;

public class User {
    private String nombre;
    private String apellido;
    private String email;

    public User(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEmail: "+email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
