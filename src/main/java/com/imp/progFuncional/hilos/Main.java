package com.imp.progFuncional.hilos;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        //Manera de crear un hilo
        Scraping scraping = new Scraping();
        //Si trabajamos con muchos hilos, podemos setearles prioridad para indicar cual se debe priorizar
        scraping.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Inicio de hilos");
        //Metodo .sleep() que duerme al hilo por una cantidad de microsegundos, y luego ejecuta el hilo
        Thread.sleep(1000*2);
        scraping.start();
        //No va a esperar a que el hilo termine, se ejecuta en paralelo a el
        if(scraping.isDaemon()) {
            System.out.println("Hilo finalizado");
        }
    }
}
