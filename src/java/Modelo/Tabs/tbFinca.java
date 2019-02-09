/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Fincas")
public class tbFinca implements Serializable {

    @Id
    @Column(name = "Id_finca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_finca;
    @Id
    @Column(name = "Id_postcosecha")
    private Long Id_postcosecha;
    @Column(name = "codigo_finca")
    private String codigo_finca;
    @Column(name = "Nombre_finca")
    private String nombre_finca;

    @ManyToOne(optional = true)
    @JoinColumn(name = "Id_postcosecha")
    private tbPostcosecha postcosecha;

    public tbFinca() {
    }

    public tbFinca(Long id_finca, Long Id_postcosecha, String codigo_finca, String nombre_finca, tbPostcosecha postcosecha) {
        this.id_finca = id_finca;
        this.Id_postcosecha = Id_postcosecha;
        this.codigo_finca = codigo_finca;
        this.nombre_finca = nombre_finca;
        this.postcosecha = postcosecha;
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
     * @return the Id_postcosecha
     */
    public Long getId_postcosecha() {
        return Id_postcosecha;
    }

    /**
     * @param Id_postcosecha the Id_postcosecha to set
     */
    public void setId_postcosecha(Long Id_postcosecha) {
        this.Id_postcosecha = Id_postcosecha;
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

    /**
     * @return the postcosecha
     */
    public tbPostcosecha getPostcosecha() {
        return postcosecha;
    }

    /**
     * @param postcosecha the postcosecha to set
     */
    public void setPostcosecha(tbPostcosecha postcosecha) {
        this.postcosecha = postcosecha;
    }

    @Override
    public String toString() {
        return "tbFinca{" + "id_finca=" + id_finca + ", Id_postcosecha=" + Id_postcosecha + ", codigo_finca=" + codigo_finca + ", nombre_finca=" + nombre_finca + ", postcosecha=" + postcosecha + '}';
    }

}
