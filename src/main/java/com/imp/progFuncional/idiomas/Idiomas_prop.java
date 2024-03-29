package com.imp.progFuncional.idiomas;

import java.util.Locale;
import java.util.ResourceBundle;

public class Idiomas_prop {
    public static void main(String[] args) {
        String pais = "ES";
        String idioma = "en";
        //Le pasamos como parametro el idioma y pais
        Locale localidad = new Locale(idioma,pais);
        //Como parametro le pasamos la inicial de los archivos que contienen los mensajes y la localidad
        ResourceBundle mensajes = ResourceBundle.getBundle("lang",localidad);

        System.out.println(mensajes.getString("user.setting"));
    }
}
