package com.imp.progFuncional.lambdas.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestVehiculo {
    /**
     * Listar los kilometros de cada vehiculo y
     * multiplicarlo por 2
     * Listas los kilometros de todos los vehiculos
     * Listar los vehiculos solo con modelos AUDI
     * Ordenar los vehiculos por la cantidad de kilometros
     * Listar todos los modelos sin que se repitan
     * Listar los vehiculos con mas de 20,000 km
     * Agrupar a los vehiculos por modelo
     * Sumar los kilometros de los vehiculos
     * Listar 2 vehiculos con kilometros menores o iguales a 100,000
     */
    private static List<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        iniciarLista();
        lessOrSameThan(100000);
    }
    static void iniciarLista() {
        vehiculos.add(new Vehiculo("1222A02",Modelo.HONDA,10000));
        vehiculos.add(new Vehiculo("1223A02",Modelo.BMW,2000));
        vehiculos.add(new Vehiculo("1242A03",Modelo.CITROEN,500000));
        vehiculos.add(new Vehiculo("3222B12",Modelo.OPEL,3220));
        vehiculos.add(new Vehiculo("315BA03",Modelo.AUDI,900010));
        vehiculos.add(new Vehiculo("1673A92",Modelo.HONDA,4800));
        vehiculos.add(new Vehiculo("1222A02",Modelo.AUDI,10000));
    }
    static void kilometersx2() {
        System.out.println("Listado de kilometros x2");
        /* A cada vehiculo su atributo kilometro le aplicara una operacion, en este caso un *2,
        el .map() sirve para agarrar una lista como entrada y mandar otra lista como salida, de esta
        manera por cada valor de kilometro que se le aplica la multiplicacion la recolectaremos y guardaremos
        en la lista "kilometros"
        * */
        List<Integer> kilometros = vehiculos.stream()
                .map(vehiculo -> vehiculo.getKilometros()*2)
                .toList();
        kilometros.forEach(System.out::println);
    }
    static void kilometroVehiculo() {
        vehiculos.forEach(v -> System.out.println("Vehiculo con matricula: "+v.getMatricula()+
                " kilometros recorridos: "+v.getKilometros()));
    }
    static void soloAURI() {
        vehiculos.stream()
                .filter(v -> v.getModelo() == Modelo.AUDI)
                .forEach(System.out::println);
    }
    static void orderKilometers() {
        System.out.println("Kilometros de menor a mayor");
        //Funcion .sorted() para ordenar valores
        List<Vehiculo> ordenados = vehiculos.stream()
                .sorted(Comparator.comparingInt(Vehiculo::getKilometros))
                .toList();
        ordenados.forEach(System.out::println);
    }
    static void allModelsNoRepeat() {
        //Funcion .distinct() para validar si un dato ya fue almacenado, si es asi lo descartara
        List<Modelo> modelos = vehiculos.stream()
                .map(Vehiculo::getModelo).distinct()
                .toList();
        modelos.forEach(System.out::println);
    }
    static void kilometersMayusThan(int mayus) {
        System.out.println("Vehiculos con kilometros mayores a: "+mayus);
        vehiculos.stream()
                .filter(v -> v.getKilometros() > mayus)
                .forEach(System.out::println);
    }
    static void listarPorModelo(Modelo modelo) {
        System.out.println("Coches con el modelo: "+modelo);
        vehiculos.stream()
                .filter(v -> v.getModelo().equals(modelo))
                .forEach(System.out::println);
    }
    static void totalKilometers() {
        long total = vehiculos.stream().mapToInt(Vehiculo::getKilometros).sum();
        System.out.println("Kilometros totales: "+total);
    }
    static void lessOrSameThan(int cant) {
        vehiculos.stream()
                .filter(v -> v.getKilometros() <= cant)
                .forEach(System.out::println);
    }
}