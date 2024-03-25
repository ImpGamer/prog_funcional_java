package com.imp.progFuncional.lambdas.ejercicio2;

public class Vehiculo {
    private String matricula;
    private Modelo modelo;
    private int kilometros;

    public Vehiculo(String matricula, Modelo modelo, int kilometros) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }
    public Vehiculo(){}
    public String toString() {
        return "\nMatricula: "+matricula+"\nModelo: "+modelo+"\nKilometros: "+kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
