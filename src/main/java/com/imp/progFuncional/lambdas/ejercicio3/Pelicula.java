package com.imp.progFuncional.lambdas.ejercicio3;

import java.time.LocalDate;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private String director;
    private LocalDate estreno;
    private boolean chord;

    public Pelicula(String titulo, String director, LocalDate estreno) {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }
    @Override
    public String toString() {
        return "\nTitulo:"+titulo+"\nDirector: "+director+"\nEstreno: "+estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getEstreno() {
        return estreno;
    }

    public void setEstreno(LocalDate estreno) {
        this.estreno = estreno;
    }

    public boolean isChord() {
        return chord;
    }

    public void setChord(boolean chord) {
        this.chord = chord;
    }
}
