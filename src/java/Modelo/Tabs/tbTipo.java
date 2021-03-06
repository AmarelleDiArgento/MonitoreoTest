/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "tipos")
public class tbTipo implements Serializable {

    @Id
    @Column(name = "id_tipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;
    @Column(name = "Codigo_tipo")
    private String Codigo_tipo;
    @Column(name = "Nombre_tipo")
    private String Nombre_tipo;

    @Column(name = "Cantidad")
    private String Cantidad;
    @Column(name = "Causas")
    private String Causas;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_producto")
    private tbProducto producto;

    @OneToMany(mappedBy = "tipo")
    private List<tbParametroTipo> parametrosTipo;

    @OneToMany(mappedBy = "tipo")
    private Set<tbEncabezado> encabezado;

    public tbTipo() {
    }

    public tbTipo(String Codigo_tipo, String Nombre_tipo, String Cantidad, String Causas, tbProducto producto, List<tbParametroTipo> parametrosTipo) {
        this.Codigo_tipo = Codigo_tipo;
        this.Nombre_tipo = Nombre_tipo;
        this.Cantidad = Cantidad;
        this.Causas = Causas;
        this.producto = producto;
        this.parametrosTipo = parametrosTipo;
    }

    @Override
    public String toString() {
        return "tbTipo{" + "id_tipo=" + id_tipo + ", Codigo_tipo=" + Codigo_tipo + ", Nombre_tipo=" + Nombre_tipo + ", Cantidad=" + Cantidad + ", Causas=" + Causas + ", producto=" + producto + '}';
    }

    /**
     * @return the id_tipo
     */
    public Long getId_tipo() {
        return id_tipo;
    }

    /**
     * @param id_tipo the id_tipo to set
     */
    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    /**
     * @return the Codigo_tipo
     */
    public String getCodigo_tipo() {
        return Codigo_tipo;
    }

    /**
     * @param Codigo_tipo the Codigo_tipo to set
     */
    public void setCodigo_tipo(String Codigo_tipo) {
        this.Codigo_tipo = Codigo_tipo;
    }

    /**
     * @return the Nombre_tipo
     */
    public String getNombre_tipo() {
        return Nombre_tipo;
    }

    /**
     * @param Nombre_tipo the Nombre_tipo to set
     */
    public void setNombre_tipo(String Nombre_tipo) {
        this.Nombre_tipo = Nombre_tipo;
    }

    /**
     * @return the Cantidad
     */
    public String getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Causas
     */
    public String getCausas() {
        return Causas;
    }

    /**
     * @param Causas the Causas to set
     */
    public void setCausas(String Causas) {
        this.Causas = Causas;
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

    /**
     * @return the parametrosTipo
     */
    public List<tbParametroTipo> getParametrosTipo() {
        return parametrosTipo;
    }

    /**
     * @param parametrosTipo the parametrosTipo to set
     */
    public void setParametrosTipo(List<tbParametroTipo> parametrosTipo) {
        this.parametrosTipo = parametrosTipo;
    }

}
