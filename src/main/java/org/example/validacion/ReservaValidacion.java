package org.example.validacion;

import org.example.utilidades.Mensaje;
import java.time.LocalDate;
import static org.example.utilidades.ExpresionesRegulares.regExp;
import static org.example.utilidades.Fecha.formatearFecha;

/**
 * Esta clase proporciona métodos de validación relacionados con las reservas.
 */
public class ReservaValidacion {

    /**
     * Valida la cantidad de personas en una reserva.
     *
     * @param cantidadPersonas La cantidad de personas en la reserva a validar.
     * @return `true` si la cantidad de personas es válida (entre 1 y 4), de lo contrario lanza una excepción con un mensaje de error.
     * @throws Exception Si la cantidad de personas no es válida.
     */
    public static Boolean validacionCantidadDePersonas(Integer cantidadPersonas) throws Exception {
        if (cantidadPersonas <= 0 || cantidadPersonas > 4) {
            throw new Exception(Mensaje.CANTIDAD_PERSONAS_RRESERVA.getMensaje());
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
}
