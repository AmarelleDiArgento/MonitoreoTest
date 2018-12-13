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
public class tbParametro implements Serializable{
    
    private Long id_parametro;
    private String codigo_parametro;
    private String nombre_parametro;
    private String tipo_dato;

    public tbParametro(Long id_parametro, String codigo_parametro, String nombre_parametro, String tipo_dato) {
        this.id_parametro = id_parametro;
        this.codigo_parametro = codigo_parametro;
        this.nombre_parametro = nombre_parametro;
        this.tipo_dato = tipo_dato;
    }

    public Long getId_parametro() {
        return id_parametro;
    }

    public void setId_parametro(Long id_parametro) {
        this.id_parametro = id_parametro;
    }

    public String getCodigo_parametro() {
        return codigo_parametro;
    }

    public void setCodigo_parametro(String codigo_parametro) {
        this.codigo_parametro = codigo_parametro;
    }

    public String getNombre_parametro() {
        return nombre_parametro;
    }

    public void setNombre_parametro(String nombre_parametro) {
        this.nombre_parametro = nombre_parametro;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    @Override
    public String toString() {
        return "tbParametro{" + "id_parametro=" + id_parametro + ", codigo_parametro=" + codigo_parametro + ", nombre_parametro=" + nombre_parametro + ", tipo_dato=" + tipo_dato + '}';
    }
    
    
}
