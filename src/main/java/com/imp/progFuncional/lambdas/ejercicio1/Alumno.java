package com.imp.progFuncional.lambdas.ejercicio1;

public class Alumno {
    private int id;
    private String nombre;
    private String cedula;
    private String apellidos;
    private String nombreCurso;
    private float nota;
    private int edad;
    public Alumno() {}

    public Alumno(int id, String nombre, String cedula, String apellidos, String nombreCurso, float nota, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.edad = edad;
    }
    public String toString() {
        return "[ID: "+id+" Nombre: "+nombre+" Cedula: "+cedula+" Apellidos: "+apellidos+" Curso Inscrito: "+nombreCurso+
                " Nota obtenida: "+nota+" Edad: "+edad+"]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
