package org.example.validacion;

import static org.example.utilidades.ExpresionesRegulares.*;
import org.example.utilidades.Mensaje;
import static org.example.utilidades.Caracteres.*;

/**
 * Esta clase proporciona métodos de validación relacionados con los usuarios.
 */
public class UsuarioValidacion {

    /**
     * Valida el nombre de un usuario.
     *
     * @param nombre El nombre del usuario a validar.
     * @return `true` si el nombre cumple con las validaciones, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el nombre no cumple con las validaciones.
     */
    public static Boolean validacionNombre(String nombre) throws Exception {
        if (!maximoCaracteres(nombre, 10)) {
            throw new Exception(Mensaje.CANTIDAD_CARACTERES.getMensaje());
        } else if (!regExp(nombre, "^[ a-zA-Z]+$")) {
            throw new Exception(Mensaje.CARACTERES_NOMBRE.getMensaje());
        }
        return true;
    }

    /**
     * Valida y convierte una cadena de texto en una ubicación (número) válida.
     *
     * @param ubicacion La cadena de texto que representa la ubicación a validar y convertir.
     * @return El número de ubicación válido.
     * @throws Exception Si la cadena de texto no cumple con las validaciones o el número de ubicación está fuera del rango válido.
     */
    public static Integer validacionUbicacion(String ubicacion) throws Exception {
        if (!regExp(ubicacion, "^[+-]?[0-9]*\\.?[0-9]+$")) {
            throw new Exception(Mensaje.CARACTERES_NUMERO.getMensaje());
        }
        int ubicacionInt = Integer.parseInt(ubicacion);
        if (ubicacionInt < 1 || ubicacionInt > 4) {
            throw new Exception(Mensaje.NUMEROS_VALIDOS.getMensaje());
        }
        return ubicacionInt;
    }

    /**
     * Valida el correo electrónico de un usuario.
     *
     * @param correo El correo electrónico del usuario a validar.
     * @return `true` si el correo electrónico cumple con las validaciones, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el correo electrónico no cumple con las validaciones.
     */
    public static Boolean validacionCorreo(String correo) throws Exception {
        if (!regExp(correo, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new Exception(Mensaje.CARACTERES_CORREO.getMensaje());
        }
        return true;
    }
}
