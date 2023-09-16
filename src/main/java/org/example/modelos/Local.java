package org.example.modelos;

import static org.example.validacion.LocalValidacion.*;

/**
 * Esta clase representa un objeto de local con atributos específicos.
 */
public class Local {
    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;

    /**
     * Constructor vacío de Local.
     */
    public Local() {
    }

    /**
     * Constructor de Local con parámetros.
     *
     * @param id          El ID del local.
     * @param nit         El número de identificación tributaria (NIT) del local.
     * @param nombre      El nombre del local.
     * @param ubicacion   La ubicación del local.
     * @param descripcion La descripción del local.
     */
    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el ID del local.
     *
     * @return El ID del local.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el ID del local.
     *
     * @param id El ID del local a establecer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el número de identificación tributaria (NIT) del local.
     *
     * @return El NIT del local.
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece el NIT del local con validación.
     *
     * @param nit El NIT del local a establecer.
     */
    public void setNit(String nit) {
        try {
            validacionNit(nit);  // Validación del NIT
            this.nit = nit;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene el nombre del local.
     *
     * @return El nombre del local.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del local con validación.
     *
     * @param nombre El nombre del local a establecer.
     */
    public void setNombre(String nombre) {
        try {
            validarNombre(nombre);  // Validación del nombre
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene la ubicación del local.
     *
     * @return La ubicación del local.
     */
    public Integer getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del local.
     *
     * @param ubicacion La ubicación del local a establecer.
     */
    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene la descripción del local.
     *
     * @return La descripción del local.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del local.
     *
     * @param descripcion La descripción del local a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
