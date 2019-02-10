/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Productos")
public class tbProducto implements Serializable {

    @Id
    @Column(name = "Id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    @Column(name = "Codigo_prod")
    private String codigo_producto;
    @Column(name = "Nombre_prod")
    private String nombre_producto;

    @OneToMany(mappedBy = "producto")
    private Set<tbVariedad> variedades;

    @OneToMany(mappedBy = "producto")
    private Set<tbTipo> tipo;

    public tbProducto() {
    }

    public tbProducto(String codigo_producto, String nombre_producto, Set<tbVariedad> variedades, Set<tbTipo> tipo) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.variedades = variedades;
        this.tipo = tipo;
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
     * @return the codigo_producto
     */
    public String getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the variedades
     */
    public Set<tbVariedad> getVariedades() {
        return variedades;
    }

    /**
     * @param variedades the variedades to set
     */
    public void setVariedades(Set<tbVariedad> variedades) {
        this.variedades = variedades;
    }

    /**
     * @return the tipo
     */
    public Set<tbTipo> getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Set<tbTipo> tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tbProducto{" + "id_producto=" + id_producto + ", codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto + '}';
    }

}
