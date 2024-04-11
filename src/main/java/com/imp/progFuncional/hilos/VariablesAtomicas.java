package com.imp.progFuncional.hilos;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class VariablesAtomicas {
    private static AtomicInteger contador = new AtomicInteger(0);

    public static void main(String[] args) {
        String[] lenguajes = {"Java","C#","Python","JavaScript","C","Visual Basic"};
        /*
        * Al trabajar con concurrencia y mismas variables, estamos compartiendo esta variable con los diferentes
        * hilos o procesos, por lo que esta variable puede llegar a agarrar el resultado del hilo que termine
        * primero o proceso con quien se encuentra, sin embargo yo no deseo que esa variable se comparta con todos los hilos
        * quiero que sea de un hilo en especifico o que solamente un proceso la use, eso se logra a travez de las
        * variables atomicas.
        *  */

        for(int i=0;i<100;i++) {
            contador.set(0);
            Arrays.stream(lenguajes).parallel().forEach(lenguaje -> {
                contador.incrementAndGet();
            });
            System.out.println(contador);
        }

    }
}
