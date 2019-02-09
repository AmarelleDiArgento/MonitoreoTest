/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Variedades")
public class tbVariedad implements Serializable {

    @Id
    @Column(name = "id_variedad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_variedad;
    @Column(name = "Codigo_varied")
    private String codigo_variedad;
    @Column(name = "Nombre")
    private String nombre_variedad;

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private tbProducto producto;

    public tbVariedad() {
    }

    public tbVariedad(String codigo_variedad, String nombre_variedad, tbProducto producto) {
        this.codigo_variedad = codigo_variedad;
        this.nombre_variedad = nombre_variedad;
        this.producto = producto;
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

    /**
     * @return the producto
     */
    public tbProducto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(tbProducto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "tbVariedad{" + "id_variedad=" + id_variedad + ", codigo_variedad=" + codigo_variedad + ", nombre_variedad=" + nombre_variedad + ", producto=" + producto + '}';
    }

}
