/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import Modelo.Interfaz.Producto;
import java.io.Serializable;

/**
 *
 * @author almoreno
 */
public class tbVariedad implements Serializable {

    private Long id_variedad;
    private Long id_producto;
    private Producto producto;

    private String codigo_variedad;
    private String nombre_variedad;

    public tbVariedad(Long id_variedad, Long id_producto, Producto producto, String codigo_variedad, String nombre_variedad) {
        this.id_variedad = id_variedad;
        this.id_producto = id_producto;
        this.producto = producto;
        this.codigo_variedad = codigo_variedad;
        this.nombre_variedad = nombre_variedad;
    }

    /**
     * @return the id_variedad
     */
    public Long getId_variedad() {
        return id_variedad;
    }

    /**
     * @param id_variedad the id_variedad to set
     */
    public void setId_variedad(Long id_variedad) {
        this.id_variedad = id_variedad;
    }

    /**
     * @return the id_producto
     */
    public Long getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the codigo_variedad
     */
    public String getCodigo_variedad() {
        return codigo_variedad;
    }

    /**
     * @param codigo_variedad the codigo_variedad to set
     */
    public void setCodigo_variedad(String codigo_variedad) {
        this.codigo_variedad = codigo_variedad;
    }

    /**
     * @return the nombre_variedad
     */
    public String getNombre_variedad() {
        return nombre_variedad;
    }

    /**
     * @param nombre_variedad the nombre_variedad to set
     */
    public void setNombre_variedad(String nombre_variedad) {
        this.nombre_variedad = nombre_variedad;
    }



}
