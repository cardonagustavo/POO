import org.example.utilidades.Mensaje;
import org.example.validacion.ReservaValidacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.example.validacion.ReservaValidacion.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para validar la funcionalidad de la clase ReservaValidacion.
 */
class ReservaValidacionTest {

    ReservaValidacion reservaValidacion = new ReservaValidacion();

    /**
     * Configura el entorno de prueba antes de cada prueba individual.
     */
    @BeforeEach
    void configurarPruebaReserva() {
        this.reservaValidacion = new ReservaValidacion();
    }

    /**
     * Prueba la validación del formato de fecha incorrecto.
     */
    @Test
    void validacionFormatoFechaIncorrecta() {
        Exception resultado = assertThrows(Exception.class, () -> validacionFecha("2013/28/34"));
        assertEquals(Mensaje.FORMATO_FECHA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación del formato de fecha correcto.
     */
    @Test
    void validacionFormatoFechaCorrecta() {
        LocalDate resultado = assertDoesNotThrow(() -> validacionFecha("07/12/2022"));
        assertEquals("2022-12-07", resultado.toString());
    }

    /**
     * Prueba la validación de la cantidad de personas incorrecta (0 personas).
     */
    @Test
    void validacionCantidadDePersonasIncorrecta() {
        Exception resultado = assertThrows(Exception.class, () -> validacionCantidadDePersonas(0));
        assertEquals(Mensaje.CANTIDAD_PERSONAS_RRESERVA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de la cantidad de personas incorrecta (más de 4 personas).
     */
    @Test
    void validacionCantidadDePersonasIncorrecta2() {
        Exception resultado = assertThrows(Exception.class, () -> validacionCantidadDePersonas(10));
        assertEquals(Mensaje.CANTIDAD_PERSONAS_RRESERVA.getMensaje(), resultado.getMessage());
    }

    /**
     * Prueba la validación de la cantidad de personas correcta (4 personas).
     */
    @Test
    void validacionCantidadCorrectaDePersonas() {
        Boolean resultado = assertDoesNotThrow(() -> validacionCantidadDePersonas(4));
        assertTrue(resultado);
    }
}
