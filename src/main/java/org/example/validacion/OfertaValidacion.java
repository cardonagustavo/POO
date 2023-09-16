package org.example.validacion;

import static org.example.utilidades.ExpresionesRegulares.*;
import static org.example.utilidades.Fecha.*;
import org.example.modelos.Local;
import org.example.utilidades.Mensaje;
import java.time.LocalDate;
import static org.example.utilidades.Caracteres.*;

/**
 * Esta clase proporciona métodos de validación relacionados con las ofertas.
 */
public class OfertaValidacion {

    /**
     * Valida el título de una oferta.
     *
     * @param titulo El título de la oferta a validar.
     * @return `true` si el título cumple con las validaciones, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el título no cumple con las validaciones.
     */
    public static Boolean validacionTitulo(String titulo) throws Exception {
        if (!maximoCaracteres(titulo, 20)) {
            throw new Exception(Mensaje.CANTIDAD_CARACTERES.getMensaje());
        } else if (regExp(titulo, "^[ a-zA-Z0-9._%+-]$")) {
            throw new Exception(Mensaje.CARACTERES_NOMBRE.getMensaje());
        }
        return true;
    }

    /**
     * Valida si la fecha de finalización de una oferta es posterior a la fecha de inicio.
     *
     * @param fechaInicio La fecha de inicio de la oferta.
     * @param fechaFin    La fecha de finalización de la oferta.
     * @return `true` si la fecha de finalización es posterior a la fecha de inicio, de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si la fecha de finalización no es válida.
     */
    public static Boolean validacionFechaFinValida(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensaje.FECHAFINAL_VALIDA.getMensaje());
        }
        return true;
    }

    /**
     * Valida y formatea una cadena de texto que representa una fecha en formato "dd/MM/yyyy".
     *
     * @param fecha La cadena de texto que representa la fecha a validar y formatear.
     * @return Un objeto LocalDate representando la fecha formateada.
     * @throws Exception Si la cadena de texto no cumple con el formato de fecha válido.
     */
    public static LocalDate validacionFecha(String fecha) throws Exception {
        if (!regExp(fecha, "^[0-3][0-9]+/[0-1][0-9]+/[2][0][2-9][0-9]$")) {
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        LocalDate nuevaFecha = formatearFecha(fecha);
        return nuevaFecha;
    }

    /**
     * Valida el costo por persona de una oferta.
     *
     * @param costo El costo por persona a validar.
     * @return `true` si el costo por persona es válido (mayor que cero), de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si el costo por persona no es válido.
     */
    public static Boolean validacionCostoPersona(Double costo) throws Exception {
        if (costo <= 0) {
            throw new Exception(Mensaje.COSTO_POR_PERSONA.getMensaje());
        }
        return true;
    }
}
