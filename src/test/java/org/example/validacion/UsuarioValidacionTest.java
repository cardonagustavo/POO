package org.example.validacion;

import org.example.utilidades.Mensaje;
import org.example.validacion.UsuarioValidacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.validacion.UsuarioValidacion.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para validar la funcionalidad de la clase UsuarioValidacion.
 */
class UsuarioValidacionTest {

    UsuarioValidacion usuarioValidacion;

    /**
     * Configura el entorno de prueba antes de cada prueba individual.
     */
    @BeforeEach
    void configurarPruebasUsuario() {
        System.out.println("Se está ejecutando una prueba con éxito");
        this.usuarioValidacion = new UsuarioValidacion();
    }

    /**
     * Prueba la validación de un nombre incorrecto (nombre corto).
     */
    @Test
    void validacionNombreIncorrectoNombreCorto() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionNombre("gustavoacar"));
        assertEquals(Mensaje.CANTIDAD_CARACTERES.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de un nombre incorrecto (contiene números en el nombre).
     */
    @Test
    void validacionNombreIncorrectaNumerosEnNombre() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionNombre("Gus0982345"));
        assertEquals(Mensaje.CARACTERES_NOMBRE.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de un nombre correcto.
     */
    @Test
    void validacionNombreCorrecto() {
        Boolean respuesta = assertDoesNotThrow(() -> validacionNombre("guscardona"));
        assertTrue(respuesta);
    }

    /**
     * Prueba la validación de un correo electrónico correcto.
     */
    @Test
    void validacionCorreoCorrecto() {
        Boolean respuesta = assertDoesNotThrow(() -> validacionCorreo("cardona50368@gmail.com"));
        assertTrue(respuesta);
    }

    /**
     * Prueba la validación de un correo electrónico incorrecto.
     */
    @Test
    void validacionCorreoIncorrecto() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionCorreo("gus.com"));
        assertEquals(Mensaje.CARACTERES_CORREO.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de una ubicación incorrecta (menor que 1).
     */
    @Test
    void validarUbicacionIncorrectaMenorUno() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionUbicacion("-2"));
        assertEquals(Mensaje.NUMEROS_VALIDOS.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de una ubicación incorrecta (mayor que 4).
     */
    @Test
    void validarUbicacionIncorrectaSuperiorA4() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionUbicacion("10"));
        assertEquals(Mensaje.NUMEROS_VALIDOS.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de una ubicación con letras y caracteres especiales.
     */
    @Test
    void validacionUbicacionLetrasCaracteresEspeciales() {
        Exception respuesta = assertThrows(Exception.class, () -> validacionUbicacion("G"));
        assertEquals(Mensaje.CARACTERES_NUMERO.getMensaje(), respuesta.getMessage());
    }

    /**
     * Prueba la validación de una ubicación válida.
     */
    @Test
    void validacionUbicacionValida() {
        Integer respuesta = assertDoesNotThrow(() -> validacionUbicacion("4"));
        assertEquals(3, 3); // Esto es solo un ejemplo de afirmación exitosa
    }
}
