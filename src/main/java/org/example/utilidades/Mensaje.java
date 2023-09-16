package org.example.utilidades;

/**
 * Esta enumeración proporciona mensajes predefinidos para validaciones y comunicaciones de error.
 */
public enum Mensaje {
    CANTIDAD_CARACTERES("Por favor, introduzca la cantidad de caracteres requeridos"),
    CARACTERES_NOMBRE("El nombre no puede contener números ni caracteres especiales"),
    CARACTERES_NUMERO("La ubicación no debe incluir letras ni caracteres especiales"),
    NUMEROS_VALIDOS("Asegúrese de que la dirección esté en el rango de números del 1 al 4"),
    CARACTERES_CORREO("Asegúrese de que el correo electrónico sea válido"),
    CARACTERES_NIT("El campo NIT debe tener exactamente 10 dígitos"),
    FORMATO_FECHA("Por favor, ingrese un formato de fecha válido"),
    FECHAFINAL_VALIDA("La fecha de finalización del evento no puede ser anterior a la fecha de inicio"),
    COSTO_POR_PERSONA("El costo por persona no puede ser un valor negativo"),
    CANTIDAD_PERSONAS_RRESERVA("El número de personas por reserva no puede ser mayor a 4 ni menor a 0");

    private String mensaje;

    /**
     * Constructor de la enumeración Mensaje.
     *
     * @param mensaje El mensaje asociado al valor de la enumeración.
     */
    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Obtiene el mensaje asociado al valor de la enumeración.
     *
     * @return El mensaje correspondiente.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece un nuevo mensaje para el valor de la enumeración.
     *
     * @param mensaje El nuevo mensaje a establecer.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
