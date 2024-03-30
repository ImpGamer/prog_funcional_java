package com.imp.progFuncional.interfaceFunc;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcularArea(20,10));
    }
    private static double calcularArea(double ancho,double alto) {
        Operacion operacion = (width,height) -> width*height;
        return operacion.sumar(ancho,alto);
    }
}