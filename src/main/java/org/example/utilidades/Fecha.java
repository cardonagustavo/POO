package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase proporciona utilidades para formatear y manipular fechas.
 */
public class Fecha {

    /**
     * Formatea una cadena de texto que representa una fecha en un objeto LocalDate.
     *
     * @param fecha La cadena de texto que representa la fecha en el formato "dd/MM/yyyy".
     * @return Un objeto LocalDate representando la fecha formateada.
     */
    public static LocalDate formatearFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nuevaFecha = LocalDate.parse(fecha, formatter);
        return nuevaFecha;
    }
}
