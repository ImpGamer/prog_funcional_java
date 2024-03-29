package com.imp.progFuncional.Optional;

public class Album {
    private String nombre;
    private String autor;
    private String discografica;

    public Album(String nombre, String autor, String discografica) {
        this.nombre = nombre;
        this.autor = autor;
        this.discografica = discografica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }
}
