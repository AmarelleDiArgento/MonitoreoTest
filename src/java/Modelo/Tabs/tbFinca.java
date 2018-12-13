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
public class tbFinca implements Serializable{
    
    private Long id_finca;
    private String codigo_finca;
    private String nombre_finca;

    public tbFinca(Long id_finca, String codigo_finca, String nombre_finca) {
        this.id_finca = id_finca;
        this.codigo_finca = codigo_finca;
        this.nombre_finca = nombre_finca;
    }

    /**
     * @return the id_finca
     */
    public Long getId_finca() {
        return id_finca;
    }

    /**
     * @param id_finca the id_finca to set
     */
    public void setId_finca(Long id_finca) {
        this.id_finca = id_finca;
    }

    /**
     * @return the codigo_finca
     */
    public String getCodigo_finca() {
        return codigo_finca;
    }

    /**
     * @param codigo_finca the codigo_finca to set
     */
    public void setCodigo_finca(String codigo_finca) {
        this.codigo_finca = codigo_finca;
    }

    /**
     * @return the nombre_finca
     */
    public String getNombre_finca() {
        return nombre_finca;
    }

    /**
     * @param nombre_finca the nombre_finca to set
     */
    public void setNombre_finca(String nombre_finca) {
        this.nombre_finca = nombre_finca;
    }

    @Override
    public String toString() {
        return "tbFinca{" + "id_finca=" + id_finca + ", codigo_finca=" + codigo_finca + ", nombre_finca=" + nombre_finca + '}';
    }
    
    
    
}
