package com.imp.progFuncional.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpresionesLambdas {
    public static void main(String[] args) {
        /*Modo tradicional para imprimir datos dentro de un ArrayList (forEach) pero con la programacion
        * funcional podemos simplificar mucho esto y aplicarlo de manera mas practica*/
        for(Integer numero: Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
            System.out.print(numero);
        }

        System.out.println("\nCon lambdas: "
        +"\n--------------------------------------------------------------");
        //Imprimir una lista con expresiones lambda
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
                //numero -> System.out.print(numero+" ")

                /*Manera simplificada para imprimir cada elemento de la lista, de esta manera le estamos diciendo:
                * System.out => Para referenciarnos que sera una salida de dato
                * :: => para referenciarle un metodo de esa clase
                * println => Para imprimir cada elemento de la lista*/
                System.out::println
        );

        ArrayList<Integer> menorLista = new ArrayList<>();
        //Filtrar los numeros mayores a 5 y agregarlos a la lista "menorLista"
        //Programacion tradicional
        for(Integer numero: Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
            if(numero > 5) {
                menorLista.add(numero);
            }
        }
        System.out.println("Lista con numeros mayor a 5:");
        menorLista.forEach(System.out::print);

        //!Streams
        /*Un stream es un flujo de datos que nos permitira sacar datos mediante varios metodos propios del stream*/
        ArrayList<Integer> mayores = Stream.of(1,2,3,4,5,6,7,8,9,10)
                //Filtro para obtener los numeros mayores a 5 y se usa una expresion lambda
                .filter(x -> x> 5)
                /*Una vez filtrado los datos y condicion de .filter() los va a recolectar y almacenar dentro
                * de una nueva ArrayList que posteriormente los depositara dentro del ArrayList declarado por
                * nosotros (en este caso "mayores")*/
                .collect(Collectors.toCollection(ArrayList::new));

                mayores.forEach(System.out::println);
    }
}
