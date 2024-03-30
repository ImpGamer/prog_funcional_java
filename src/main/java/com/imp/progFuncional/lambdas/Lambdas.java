package com.imp.progFuncional.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<User> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new User("Jose","Ramirez","jose@gmail.com"));
        listaUsuarios.add(new User("Alonso","Aurelio","alonso@gmail.com"));
        listaUsuarios.add(new User("Mario","Fernandez","mario@gmail.com"));

        //listaUsuarios.forEach(System.out::println);
        listaUsuarios.forEach((user) -> {
            if(user.getEmail().length() > 15) {
                System.out.println("El email del usuario " + user.getNombre() + " es demasiado largo");
            }
        });

        listaUsuarios.sort((User userA,User userB) -> userA.getEmail().compareTo(userB.getEmail()));
        listaUsuarios.forEach(System.out::println);
    }


}