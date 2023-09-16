package org.example.utilidades;

/**
 * Esta clase proporciona utilidades para verificar la longitud mínima y máxima de cadenas de caracteres.
 */
public class Caracteres {

    /**
     * Verifica si una cadena de caracteres tiene al menos la longitud mínima especificada.
     *
     * @param nombre     La cadena de caracteres a verificar.
     * @param caracteres El número mínimo de caracteres permitidos.
     * @return `true` si la cadena cumple con la longitud mínima, `false` en caso contrario.
     */
    public static Boolean minimoCaracteres(String nombre, Integer caracteres) {
        return nombre.length() >= caracteres;
    }

    /**
     * Verifica si una cadena de caracteres no excede la longitud máxima especificada.
     *
     * @param campo     La cadena de caracteres a verificar.
     * @param caracteres El número máximo de caracteres permitidos.
     * @return `true` si la cadena no excede la longitud máxima, `false` en caso contrario.
     */
    public static Boolean maximoCaracteres(String campo, Integer caracteres) {
        return campo.length() <= caracteres;
    }
}
