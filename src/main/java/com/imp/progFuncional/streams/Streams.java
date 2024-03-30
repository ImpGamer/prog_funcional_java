package com.imp.progFuncional.streams;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        String[] lenguajes = {"Java","PHP","JavaScript","Swift","Python","Kotlin"};

        Arrays.stream(lenguajes).sorted().forEach(System.out::println);
    }
}
