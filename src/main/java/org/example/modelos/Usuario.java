package org.example.modelos;

import static org.example.validacion.UsuarioValidacion.*;

/**
 * Esta clase representa un objeto de usuario con atributos específicos.
 */
public class Usuario {
    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    /**
     * Constructor vacío de Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor de Usuario con parámetros.
     *
     * @param id         El ID del usuario.
     * @param documento  El documento del usuario.
     * @param nombres    El nombre del usuario.
     * @param correo     El correo electrónico del usuario.
     * @param ubicacion  La ubicación del usuario.
     */
    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el ID del usuario.
     *
     * @return El ID del usuario.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id El ID del usuario a establecer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el documento del usuario.
     *
     * @return El documento del usuario.
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento del usuario.
     *
     * @param documento El documento del usuario a establecer.
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece el nombre del usuario con validación.
     *
     * @param nombres El nombre del usuario a establecer.
     */
    public void setNombres(String nombres) {
        try {
            validacionNombre(nombres);  // Validación del nombre
            this.nombres = nombres;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return El correo electrónico del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario con validación.
     *
     * @param correo El correo electrónico del usuario a establecer.
     */
    public void setCorreo(String correo) {
        try {
            validacionCorreo(correo);  // Validación del correo
            this.correo = correo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene la ubicación del usuario.
     *
     * @return La ubicación del usuario.
     */
    public Integer getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del usuario con validación.
     *
     * @param ubicacion La ubicación del usuario a establecer.
     */
    public void setUbicacion(String ubicacion) {
        try {
            this.ubicacion = validacionUbicacion(ubicacion);  // Validación de la ubicación
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }
}
