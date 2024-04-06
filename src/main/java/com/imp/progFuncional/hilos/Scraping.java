package com.imp.progFuncional.hilos;

public class Scraping extends Thread{
    @Override
    //Funcion a ejecutar cuando el hilo se ejecute
    public void run() {
        int i=0;

        while(i<20) {
            System.out.println("Ejecutando hilo "+i);
            i++;
        }
    }
}
