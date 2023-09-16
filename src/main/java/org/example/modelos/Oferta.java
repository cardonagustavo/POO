package org.example.modelos;

import static org.example.validacion.OfertaValidacion.*;

import java.time.LocalDate;

/**
 * Esta clase representa un objeto de oferta con atributos específicos.
 */
public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPorPersona;

    /**
     * Constructor vacío de Oferta.
     */
    public Oferta() {
    }

    /**
     * Constructor de Oferta con parámetros.
     *
     * @param id              El ID de la oferta.
     * @param titulo          El título de la oferta.
     * @param descripcion     La descripción de la oferta.
     * @param fechaInicio     La fecha de inicio de la oferta.
     * @param fechaFin        La fecha de finalización de la oferta.
     * @param costoPorPersona El costo por persona de la oferta.
     */
    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPorPersona) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPorPersona = costoPorPersona;
    }

    /**
     * Obtiene el ID de la oferta.
     *
     * @return El ID de la oferta.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el ID de la oferta.
     *
     * @param id El ID de la oferta a establecer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el título de la oferta.
     *
     * @return El título de la oferta.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la oferta con validación.
     *
     * @param titulo El título de la oferta a establecer.
     */
    public void setTitulo(String titulo) {
        try {
            validacionTitulo(titulo);  // Validación del título
            this.titulo = titulo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene la descripción de la oferta.
     *
     * @return La descripción de la oferta.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la oferta.
     *
     * @param descripcion La descripción de la oferta a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha de inicio de la oferta.
     *
     * @return La fecha de inicio de la oferta.
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio de la oferta con validación.
     *
     * @param fechaInicio La fecha de inicio de la oferta en formato String.
     */
    public void setFechaInicio(String fechaInicio) {
        try {
            this.fechaInicio = validacionFecha(fechaInicio);  // Validación de la fecha de inicio
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene la fecha de finalización de la oferta.
     *
     * @return La fecha de finalización de la oferta.
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de finalización de la oferta con validación.
     *
     * @param fechaFin La fecha de finalización de la oferta en formato String.
     */
    public void setFechaFin(String fechaFin) {
        try {
            LocalDate nuevaFecha = validacionFecha(fechaFin);
            validacionFechaFinValida(this.fechaInicio, nuevaFecha);  // Validación de la fecha de finalización
            this.fechaFin = nuevaFecha;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene el costo por persona de la oferta.
     *
     * @return El costo por persona de la oferta.
     */
    public Double getCostoPersona() {
        return costoPorPersona;
    }

    /**
     * Establece el costo por persona de la oferta con validación.
     *
     * @param costoPersona El costo por persona de la oferta a establecer.
     */
    public void setCostoPersona(Double costoPersona) {
        try {
            validacionCostoPersona(costoPersona);  // Validación del costo por persona
            this.costoPorPersona = costoPersona;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPorPersona=" + costoPorPersona +
                '}';
    }
}
