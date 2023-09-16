package org.example.modelos;

import static org.example.validacion.ReservaValidacion.*;
import java.time.LocalDate;

/**
 * Esta clase representa un objeto de reserva con atributos específicos.
 */
public class Reserva {
    private Integer id;
    private Integer usuario;
    private Integer oferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer cantidadPersonas;

    /**
     * Constructor vacío de Reserva.
     */
    public Reserva() {
    }

    /**
     * Constructor de Reserva con parámetros.
     *
     * @param id              El ID de la reserva.
     * @param usuario         El ID del usuario asociado a la reserva.
     * @param oferta          El ID de la oferta asociada a la reserva.
     * @param costoTotal      El costo total de la reserva.
     * @param fechaReserva    La fecha de la reserva.
     * @param cantidadPersonas La cantidad de personas para la reserva.
     */
    public Reserva(Integer id, Integer usuario, Integer oferta, Double costoTotal, LocalDate fechaReserva, Integer cantidadPersonas) {
        this.id = id;
        this.usuario = usuario;
        this.oferta = oferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;
    }

    /**
     * Obtiene el ID de la reserva.
     *
     * @return El ID de la reserva.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el ID de la reserva.
     *
     * @param id El ID de la reserva a establecer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el ID del usuario asociado a la reserva.
     *
     * @return El ID del usuario asociado a la reserva.
     */
    public Integer getIdUsuario() {
        return usuario;
    }

    /**
     * Establece el ID del usuario asociado a la reserva.
     *
     * @param idUsuario El ID del usuario a establecer.
     */
    public void setIdUsuario(Integer idUsuario) {
        this.usuario = idUsuario;
    }

    /**
     * Obtiene el ID de la oferta asociada a la reserva.
     *
     * @return El ID de la oferta asociada a la reserva.
     */
    public Integer getIdOferta() {
        return oferta;
    }

    /**
     * Establece el ID de la oferta asociada a la reserva.
     *
     * @param idOferta El ID de la oferta a establecer.
     */
    public void setIdOferta(Integer idOferta) {
        this.oferta = idOferta;
    }

    /**
     * Obtiene el costo total de la reserva.
     *
     * @return El costo total de la reserva.
     */
    public Double getCostoTotal() {
        return costoTotal;
    }

    /**
     * Establece el costo total de la reserva.
     *
     * @param costoTotal El costo total de la reserva a establecer.
     */
    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    /**
     * Obtiene la fecha de la reserva.
     *
     * @return La fecha de la reserva.
     */
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece la fecha de la reserva con validación.
     *
     * @param fechaReserva La fecha de la reserva en formato String a establecer.
     */
    public void setFechaReserva(String fechaReserva) {
        try {
            LocalDate nuevaFecha = validacionFecha(fechaReserva);
            this.fechaReserva = nuevaFecha;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene la cantidad de personas para la reserva.
     *
     * @return La cantidad de personas para la reserva.
     */
    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    /**
     * Establece la cantidad de personas para la reserva con validación.
     *
     * @param cantidadPersonas La cantidad de personas para la reserva a establecer.
     */
    public void setCantidadPersonas(Integer cantidadPersonas) {
        try {
            validacionCantidadDePersonas(cantidadPersonas);
            this.cantidadPersonas = cantidadPersonas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", oferta=" + oferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                ", cantidadPersonas=" + cantidadPersonas +
                '}';
    }
}
