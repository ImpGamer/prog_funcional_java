package com.imp.progFuncional.lambdas.ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class TestPelicula {
    /*
     * Obtener un sublistado con las peliculas estrenadas en el siglo XXI (apartir del 2000)
     * Titulos dirigidos por "Steven Spielbierg"
     * Obtener un listado de las peliculas ordenados alfabeticamente
     * Mostrar el estreno mas reciente
     */
    private static List<Pelicula> peliculas = new ArrayList<>();

    public static void main(String[] args) {
        inicializarLista();
        mostRecientMovie();
    }
    static void inicializarLista() {
        peliculas.add(new Pelicula("E.T","Steven Spielberg", LocalDate.of(1982,12,9)));
        peliculas.add(new Pelicula("Avatar","James Cameron", LocalDate.of(2009,12,17)));
        peliculas.add(new Pelicula("Salvar al soldado Ryan","Steven Spielberg", LocalDate.of(1998,9,4)));
        peliculas.add(new Pelicula("Origen","Christoper Nolan", LocalDate.of(2010,7,23)));
        peliculas.add(new Pelicula("L.A Confidential","Curtis Harson", LocalDate.of(1997,9,19)));
    }
    static void thisCentury() {
        System.out.println("Peliculas estrenadas despues del 2000:");
        peliculas.stream()
                .filter(p -> p.getEstreno().getYear() >= 2000)
                .forEach(System.out::println);
    }
    static void moviesDirector(String director) {
        System.out.println("Peliculas dirigidas por: "+director);
        peliculas.stream()
                .filter(p -> p.getDirector().equals(director))
                .forEach(System.out::println);
    }
    static void alfabeticOrdered() {
        System.out.println("Peliculas ordenadas alfabeticamente (por titulo):");
        List<String> ordenadaAlfabeticamente = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted(String::compareTo)
                .toList();
        ordenadaAlfabeticamente.forEach(System.out::println);
    }
    static void mostRecientMovie() {
        Optional<Pelicula> peliculaConFechaMasReciente = peliculas.stream()
                .max(Comparator.comparing(Pelicula::getEstreno));

        Pelicula masReciente = peliculaConFechaMasReciente.orElse(null);
        System.out.println("Pelicula mas reciente\n "+masReciente);
    }

}
