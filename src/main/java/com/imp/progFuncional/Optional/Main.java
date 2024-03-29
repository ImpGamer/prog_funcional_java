package com.imp.progFuncional.Optional;

import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    /* Podriamos decir que la clase Optional<> es un valor null, pero con esteroides, ya que en caso
    de que este objeto Optional se encuentre vacio o sin ningun valor no solatara una excepcion como lo hace
    el valor "null" y podremos controlar de mejor manera este tipo de errores
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del album que desea buscar: ");
        String nameAlbum = entrada.nextLine();

        //En el caso que retorne un valor vacio, lanzara una excepcion

        Optional<Album> albumExis = getAlbum(nameAlbum);
        if(albumExis.isPresent()) {
            System.out.println("El album "+nameAlbum+" si se encuentra en la lista");
            return;
        }
        System.out.println("El album "+nameAlbum+" NO se encuentra en la lista");
    }
    private static Optional<Album> getAlbum(String nombre) {
        HashMap<String,Album> listaAlbumes = new HashMap<>();
        listaAlbumes.put("Thriller",new Album("Thriller","Michael Jackson","Epic Records"));
        listaAlbumes.put("Pasadena",new Album("Pasadena","Guns N Roses","Sony"));
        listaAlbumes.put("CanAnimal",new Album("Cancion Animal","Soda Stereo","Popart Discos"));

        //Le indicaremos que es un objeto vacio de tipo Optional
        Optional<Album> album = Optional.empty();
        //Si dentro de nuestra existe, a nuestro objeto Optional (Album) le asignaremos ese valor
        if(listaAlbumes.containsKey(nombre)) {
            album = Optional.of(listaAlbumes.get(nombre));
        }
        return album;
    }
}
