/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;

/**
 *
 * @author almoreno
 */
public class tbPostcosecha implements Serializable {

    private Long id_poscosecha;
    private Long id_finca;

    private String codigo_poscosecha;
    private String nombre_poscosecha;

    public tbPostcosecha(Long id_poscosecha, Long id_finca, String codigo_poscosecha, String nombre_poscosecha) {
        this.id_poscosecha = id_poscosecha;
        this.id_finca = id_finca;
        this.codigo_poscosecha = codigo_poscosecha;
        this.nombre_poscosecha = nombre_poscosecha;
    }

    /**
     * @return the id_poscosecha
     */
    public Long getId_poscosecha() {
        return id_poscosecha;
    }

    /**
     * @param id_poscosecha the id_poscosecha to set
     */
    public void setId_poscosecha(Long id_poscosecha) {
        this.id_poscosecha = id_poscosecha;
    }

    /**
     * @return the id_poscosecha
     */
    public Long getId_finca() {
        return id_finca;
    }

    /**
     * @param id_finca the id_poscosecha to set
     */
    public void setId_finca(Long id_finca) {
        this.id_finca = id_finca;
    }

    /**
     * @return the codigo_poscosecha
     */
    public String getCodigo_poscosecha() {
        return codigo_poscosecha;
    }

    /**
     * @param codigo_poscosecha the codigo_poscosecha to set
     */
    public void setCodigo_poscosecha(String codigo_poscosecha) {
        this.codigo_poscosecha = codigo_poscosecha;
    }

    /**
     * @return the nombre_poscosecha
     */
    public String getNombre_poscosecha() {
        return nombre_poscosecha;
    }

    /**
     * @param nombre_poscosecha the nombre_poscosecha to set
     */
    public void setNombre_poscosecha(String nombre_poscosecha) {
        this.nombre_poscosecha = nombre_poscosecha;
    }

    @Override
    public String toString() {
        return "tbPoscosecha{" + "id_poscosecha=" + id_poscosecha + ", codigo_poscosecha=" + codigo_poscosecha + ", nombre_poscosecha=" + nombre_poscosecha + '}';
    }

}
