package com.imp.progFuncional.lambdas.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestAlumno {
    /*Mediante programacion funcional realizar las siguientes operaciones con la lista:
    * Listar todos los alumnos
    * Obtener e imprimir a todos los alumnos que inicien con L o G
    * Imprimir el numero de alumnos registrados
    * Imprimir el alumno con menor edad
    * Imprimir el alumno con mayor edad
    * Listar los alumnos en donde el nombre del curso inscrito termine con S
    * Listar alumnos que tienen un curso que contiene la A
    * Listar alumno donde el tamano de su nombre supere los 5 caracteres
    * Mostrar alumno con el ID mas bajo
    */
    private static List<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {
        iniciarLista();
        System.out.println(alumnoMenorID());
    }
    static void iniciarLista() {
        alumnos.add(new Alumno(1,"David","2894019491","Romero","SpringBoot API-REST",15,18));
        alumnos.add(new Alumno(2,"Jose","2901940192","Martinez","Python desde cero",11,21));
        alumnos.add(new Alumno(3,"Angel","9204788213","Rodriguez","Microservicios",2,23));
        alumnos.add(new Alumno(4,"Raul","9204814212","Alexis","JavaScript web",10,33));
        alumnos.add(new Alumno(5,"Pablo","0046372123","Jimenez","MicroControladores",(float)7.5,17));
        alumnos.add(new Alumno(6,"Geminis","9947367421","Perez","Java principiante",9,20));
        alumnos.add(new Alumno(7,"Mario","0493829913","Hero","Fundamentos de AWS",3,30));
    }
    static void listarAlumnos() {
        System.out.println("Lista de Alumnos");
        alumnos.forEach(System.out::println);
    }
    static void alumnosConInicial(char ini1,char ini2) {
        System.out.println("Alumnos que inicien con: "+ini1+" o "+ini2);
        //FILTRA de acuerdo a la condicion y lo almacena dentro del arreglo "alumnos"
        alumnos.stream()
                .filter(a -> a.getNombre().charAt(0) == ini1 || a.getNombre().charAt(0) == ini2)
                .forEach(System.out::println);
    }
    static String cantAlumnosRegistrados() {
       return "Cantidad de alumnos registrados: "+alumnos.stream().count();
    }
    static String alumnoMenorEdad() {
        //return "Alumno con menor edad: "+alumnos.stream().min((a1,a2) -> a1.getEdad() - a2.getEdad());
        return "Alumno con menor edad: "+alumnos.stream().min(Comparator.comparingInt(Alumno::getEdad));
    }
    static String alumnoMayorEdad() {
        return "Alumno con mayor edad: "+alumnos.stream().max(Comparator.comparingInt(Alumno::getEdad));
    }
    static Optional<Alumno> primerAlumno() {
        return alumnos.stream().findFirst();
    }
    static void alumnosCursoFinal(String termina) {
        System.out.println("Alumnos en donde el curso inscrito termina en: "+termina);
        alumnos.stream()
                .filter(a -> a.getNombreCurso().endsWith(termina))
                .forEach(System.out::println);
    }
    static void cursoContiene(String letra) {
        alumnos.stream()
                .filter(a -> a.getNombreCurso().contains(letra))
                .forEach(System.out::println);
    }
    static void alumnoLongNombre(int size) {
        alumnos.stream()
                .filter(a -> a.getNombre().length() > size)
                .forEach(System.out::println);
    }
    static String alumnoMenorID() {
        return "Alumno con menor ID: "+alumnos.stream().min(Comparator.comparingInt(Alumno::getId));
    }
}