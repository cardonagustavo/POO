package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase proporciona utilidades para realizar coincidencias de expresiones regulares en cadenas de texto.
 */
public class ExpresionesRegulares {

    /**
     * Realiza una coincidencia de expresión regular en una cadena de texto.
     *
     * @param nombre  La cadena de texto en la que se realizará la coincidencia.
     * @param regExp  La expresión regular a utilizar para la coincidencia.
     * @return `true` si la cadena coincide con la expresión regular, `false` en caso contrario.
     */
    public static Boolean regExp(String nombre, String regExp) {
        Pattern patron = Pattern.compile(regExp);
        Matcher validacion = patron.matcher(nombre);
        return validacion.matches();
    }
}
