package com.imp.progFuncional.lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScrapping {
    public static void main(String[] args) {
        String contenidoHTML = getWebContent("https://ed.team");
        List<String> tags = getTags(contenidoHTML,"h1");
        tags.forEach(System.out::println);

        long totalMundos = tags.stream().filter(tag -> tag.equals("Mundo")).count();
        System.out.println("Total Mundos: "+totalMundos);

        //Recorrera la lista y si encuentra un elemento con el valor "Mundo" imprimira que existe
        if(tags.stream().anyMatch(tag -> tag.equals("Mundo"))) {
            System.out.println("Se ha encontrado un 'Mundo'");
        }

        //Uso de .map() dentro de un .stream()
        /*
        * Un .map() es una funcion que funcionara como un forEach, es decir recorrera toda la lista o arreglo, pero
        * .map() es capaz de modificar un valor dentro de esta lista y retornarlo ya modificado
        * */
        //Los elementos de la lista "tags" le cambiamos el valor de la etiqueta HTML a <strong> y lo almacenamos en
        //una nueva lista
        List<String> listaMod = tags.stream().map(tag -> "<strong>"+tag+"</strong>").toList();
        listaMod.forEach(System.out::println);

    }

    private static List<String> getTags(String texto,String typeTag) {
        List<String> tags = new ArrayList<>();
        //Expresion regular que me encuentra todo texto encerrado entre etiquetas <b></b>
        String regexB = "<"+typeTag+">([^<>]*)</"+typeTag+">";
        //Clase para compilar una expresion regular (regex)
        Pattern pattern = Pattern.compile(regexB);
        //Le pasaremos el texto, y el objeto "pattern" al poseer la expresion regular, buscara de ese texto las coincidencias del regex
        //Posterior las almacenara y devolvera un objeto "Matcher" que es una lista de los resultados.
        Matcher result = pattern.matcher(texto);

        /*Mediante este ciclo while, recorreremos todos los resultados encontrados y los imprimiremos*/
        while (result.find()) {
            String aux = result.group();
            Integer size = typeTag.length()+2;
            aux = aux.substring(size,aux.length() - size - 1);
            tags.add(aux);
            System.out.println(aux);
        }

        return tags;
    }
    private static String getWebContent(String link) {
        StringBuffer resultado = new StringBuffer();
        try {
            URL url = new URL(link);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String linea;
            while((linea = reader.readLine()) != null) {
                resultado.append(linea);
            }

        }catch (Exception e) {
            System.err.println("Se a provocado un error al tratar de cargar la pagina web: "+e.getMessage());
        }

        return resultado.toString();
    }

}
