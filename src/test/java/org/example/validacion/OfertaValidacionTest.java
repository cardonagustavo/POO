package org.example.validacion;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.example.validacion.OfertaValidacion.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para validar la funcionalidad de la clase OfertaValidacion.
 */
class OfertaValidacionTest {

    OfertaValidacion ofertaValidacion = new OfertaValidacion();

    /**
     * Configura el entorno de prueba antes de cada prueba individual.
     */
    @BeforeEach
    void configurarPruebaOferta() {
        this.ofertaValidacion = new OfertaValidacion();
    }

    /**
     * Prueba la validación de un título con más de veinte caracteres.
     */
    @Test
    void validacionTituloConMasDeVeinteLetras() {
        Exception resultado = assertThrows(Exception.class, () -> validacionTitulo("poiuytrewqasdfghjklmnbvcxzaqwertyuio"));
        assertEquals(Mensaje.CANTIDAD_CARACTERES.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de un título correcto.
     */
    @Test
    void validacionTituloCorrecto() {
        Boolean resultado = assertDoesNotThrow(() -> validacionTitulo("El Industrial"));
        assertTrue(resultado);
    }

    /**
     * Prueba la validación del formato de fecha incorrecto.
     */
    @Test
    void validacionFormatoFechaIncorrecto() {
        Exception resultado = assertThrows(Exception.class, () -> validacionFecha("2022/06/10"));
        assertEquals(Mensaje.FORMATO_FECHA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación del formato de fecha correcto.
     */
    @Test
    void validacioFormatoFechaCorrecto() {
        LocalDate resultado = assertDoesNotThrow(() -> validacionFecha("01/10/2022"));
        assertEquals("2022-10-01", resultado.toString());
    }

    /**
     * Prueba la validación de la fecha de finalización correcta.
     */
    @Test
    void validacionFechaFinCorrecta() {
        LocalDate fechaInicio = LocalDate.of(2022, 5, 2);
        LocalDate fechaFin = LocalDate.of(2023, 5, 10);
        Boolean resultado = assertDoesNotThrow(() -> validacionFechaFinValida(fechaInicio, fechaFin));
        assertTrue(resultado);
    }

    /**
     * Prueba la validación de la fecha de finalización incorrecta.
     */
    @Test
    void validacionFechaFinIncorrecta() {
        LocalDate fechaInicio = LocalDate.of(2023, 8, 15);
        LocalDate fechaFin = LocalDate.of(2023, 8, 1);
        Exception resultado = assertThrows(Exception.class, () -> validacionFechaFinValida(fechaInicio, fechaFin));
        assertEquals(Mensaje.FECHAFINAL_VALIDA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación del costo por persona incorrecto.
     */
    @Test
    void validacionCostoPersonaIncorrecta() {
        Exception resultado = assertThrows(Exception.class, () -> validacionCostoPersona(-01.0));
        assertEquals(Mensaje.COSTO_POR_PERSONA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación del costo por persona válido.
     */
    @Test
    void validacionCostoPersonaValido() {
        Boolean resultado = assertDoesNotThrow(() -> validacionCostoPersona(100.000));
        assertTrue(resultado);
    }
}
