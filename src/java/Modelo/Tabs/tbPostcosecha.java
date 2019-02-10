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
@Table(name = "Postcosechas")
public class tbPostcosecha implements Serializable {

    @Id
    @Column(name = "id_posco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_poscosecha;
    @Column(name = "codigo_posco")
    private String codigo_poscosecha;
    @Column(name = "nombre_posco")
    private String nombre_poscosecha;

    @OneToMany(mappedBy = "postcosecha")
    private Set<tbEncabezado> encabezado;

    public tbPostcosecha() {
    }

    public tbPostcosecha(Long id_poscosecha, String codigo_poscosecha, String nombre_poscosecha) {
        this.id_poscosecha = id_poscosecha;
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
        return "tbPostcosecha{" + "id_poscosecha=" + id_poscosecha + ", codigo_poscosecha=" + codigo_poscosecha + ", nombre_poscosecha=" + nombre_poscosecha + '}';
    }

}
