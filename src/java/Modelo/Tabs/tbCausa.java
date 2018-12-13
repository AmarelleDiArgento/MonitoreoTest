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
public class tbCausa implements Serializable{
    
    private Long id_causa;
    private String codigo_causa;
    private String nombre_causa;

    public tbCausa(Long id_causa, String codigo_causa, String nombre_causa) {
        this.id_causa = id_causa;
        this.codigo_causa = codigo_causa;
        this.nombre_causa = nombre_causa;
    }

    /**
     * @return the id_causa
     */
    public Long getId_causa() {
        return id_causa;
    }

    /**
     * @param id_causa the id_causa to set
     */
    public void setId_causa(Long id_causa) {
        this.id_causa = id_causa;
    }

    /**
     * @return the codigo_causa
     */
    public String getCodigo_causa() {
        return codigo_causa;
    }

    /**
     * @param codigo_causa the codigo_causa to set
     */
    public void setCodigo_causa(String codigo_causa) {
        this.codigo_causa = codigo_causa;
    }

    /**
     * @return the nombre_causa
     */
    public String getNombre_causa() {
        return nombre_causa;
    }

    /**
     * @param nombre_causa the nombre_causa to set
     */
    public void setNombre_causa(String nombre_causa) {
        this.nombre_causa = nombre_causa;
    }

    @Override
    public String toString() {
        return "tbCausas{" + "id_causa=" + id_causa + ", codigo_causa=" + codigo_causa + ", nombre_causa=" + nombre_causa + '}';
    }
    
}
