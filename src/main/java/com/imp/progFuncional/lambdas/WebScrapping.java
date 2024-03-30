package com.imp.progFuncional.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScrapping {
    public static void main(String[] args) {
        final String textoEjemplo = "Hola <b>Mundo</b>, soy <b>Lucas</b>";
        List<String> tags = getBoldTags(textoEjemplo);
        long totalMundos = tags.stream().filter(tag -> tag.equals("Mundo")).count();
        System.out.println("Total Mundos: "+totalMundos);
    }

    private static List<String> getBoldTags(String texto) {
        List<String> tags = new ArrayList<>();
        //Expresion regular que me encuentra todo texto encerrado entre etiquetas <b></b>
        String regexB = "<b>(\\S+)</b>";
        //Clase para compilar una expresion regular (regex)
        Pattern pattern = Pattern.compile(regexB);
        //Le pasaremos el texto, y el objeto "pattern" al poseer la expresion regular, buscara de ese texto las coincidencias del regex
        //Posterior las almacenara y devolvera un objeto "Matcher" que es una lista de los resultados.
        Matcher result = pattern.matcher(texto);

        /*Mediante este ciclo while, recorreremos todos los resultados encontrados y los imprimiremos*/
        while (result.find()) {
            String aux = result.group();
            aux = aux.substring(3,aux.length()-4);
            tags.add(aux);
            System.out.println(aux);
        }

        return tags;
    }
}
