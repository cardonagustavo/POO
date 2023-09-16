package org.example.validacion;

import static org.example.utilidades.Caracteres.*;
import static org.example.utilidades.ExpresionesRegulares.*;
import org.example.utilidades.Mensaje;

/**
 * Esta clase proporciona métodos de validación relacionados con los locales.
 */
public class LocalValidacion {

    /**
     * Valida un nombre de local.
     *
     * @param nombre El nombre del local a validar.
     * @return `true` si el nombre cumple con las validaciones, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el nombre no cumple con las validaciones.
     */
    public static Boolean validarNombre(String nombre) throws Exception {
        if (!maximoCaracteres(nombre, 30)) {
            throw new Exception(Mensaje.CANTIDAD_CARACTERES.getMensaje());
        } else if (regExp(nombre, "^[ a-zA-Z0-9._%+-]$")) {
            throw new Exception(Mensaje.CARACTERES_NOMBRE.getMensaje());
        }
        return true;
    }

    /**
     * Valida un número de NIT (Número de Identificación Tributaria) de un local.
     *
     * @param nit El número de NIT a validar.
     * @return `true` si el NIT cumple con las validaciones, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el NIT no cumple con las validaciones.
     */
    public static Boolean validacionNit(String nit) throws Exception {
        if (nit.length() != 10) {
            throw new Exception(Mensaje.CARACTERES_NIT.getMensaje());
        }
        return true;
    }
}
