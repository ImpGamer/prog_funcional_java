package com.imp.progFuncional.Times;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempos {
    /*Para controlar fechas, horas o ambas se utilizan estas clases, tambien existen mas pero esas las podremos ver en
    sitaciones especificas
    * */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2020, Month.MARCH,30);
        LocalTime hora = LocalTime.of(12,30);

        LocalDateTime fechaHora = LocalDateTime.of(fecha,hora);
        //Me retorna un nuevo objeto "LocalDateTime" con la funcion realizada
        fechaHora = fechaHora.minusHours(1);

        //Le especificamos que sera 1 dia
        Period duracion = Period.ofDays(1);
        //Le estamos diciendo que restara 1 dia a la fecha
        fechaHora = fechaHora.minus(duracion);
        System.out.println(fechaHora);

        //Clase para formatear de una manera mas lejible objetos "LocalDateTime" ya que formatea hora y fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //Le pasamos el objeto "LocalDateTime" a la funcion "format()" del objeto DateTimeFormatter
        System.out.println(formatter.format(fechaHora));
    }
}
