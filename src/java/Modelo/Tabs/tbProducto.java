/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
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

    public tbProducto() {
    }

    public tbProducto(Long id_producto, String codigo_producto, String nombre_producto) {
        this.id_producto = id_producto;
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
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

    @Override
    public String toString() {
        return "tbProducto{" + "id_producto=" + id_producto + ", codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto + '}';
    }

}
