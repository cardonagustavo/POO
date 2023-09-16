package org.example.validacion;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.validacion.LocalValidacion.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para validar la funcionalidad de la clase LocalValidacion.
 */
class LocalValidacionTest {

    LocalValidacion localValidacion = new LocalValidacion();

    /**
     * Configura el entorno de prueba antes de cada prueba individual.
     */
    @BeforeEach
    void configurarPruebaLocal() {
        this.localValidacion = new LocalValidacion();
    }

    /**
     * Prueba la validación de un NIT con menos de diez dígitos.
     */
    @Test
    void validarNitMenorDiezDigitos() {
        Exception resultado = assertThrows(Exception.class, () -> validacionNit("234567890"));
        assertEquals(Mensaje.CARACTERES_NIT.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de un NIT con más de diez dígitos.
     */
    @Test
    void validarNitMayorDiezDigitos() {
        Exception resultado = assertThrows(Exception.class, () -> validacionNit("0987654321234567890"));
        assertEquals(Mensaje.CARACTERES_NIT.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de un NIT válido con exactamente diez dígitos.
     */
    @Test
    void validarNitValido() {
        Boolean resultado = assertDoesNotThrow(() -> validacionNit("9000121465"));
        assertTrue(resultado);
    }

    /**
     * Prueba la validación de un nombre con más de treinta letras.
     */
    @Test
    void validarNombreConMasDeTreintaLetras() {
        Exception resultado = assertThrows(Exception.class, () -> validarNombre("lkjhgfdcvbnjuytredsxfghyuikmnbvcderth"));
        assertEquals(Mensaje.CANTIDAD_CARACTERES.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de un nombre válido con menos de treinta letras.
     */
    @Test
    void validarNombreValido() {
        Boolean resultado = assertDoesNotThrow(() -> validarNombre("Gustavo Cardona"));
        assertTrue(resultado);
    }
}
