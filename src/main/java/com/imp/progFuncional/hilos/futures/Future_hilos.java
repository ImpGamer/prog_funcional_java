package com.imp.progFuncional.hilos.futures;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Future_hilos {
    public static void main(String[] args) {
        /*
        * Un hilo con la clase ExecutorService nos permitira ejecutar varios hilos a la vez
        * y condicionar el estado de dicho hilo que queramos, por ejemplo:
        * */
        //Le especificamos la cantidad de hilos con las que trabajermos, en este caso solo 1
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> hilo = executor.submit(new Callable<String>() {
            @Override
            //Se llama a la funcion "call()" cuando se llame a ese hilo
            public String call() throws Exception {
                Thread.sleep(1000);
                return "ok";
            }
        });

        //Condicion que pregunta si el hilo a finalizado
        if(hilo.isDone()) {
            System.out.println("El proceso del hilo: "+hilo.toString()+" ha terminado");
        } else {
            System.out.println("El hilo sigue trabajando");
            //Hacemos que el hilo se cancele, sin importar su estado actual
            hilo.cancel(true);
        }


    }
}
