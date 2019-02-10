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
@Table(name = "PuntosCorte")
public class tbPuntoCorte implements Serializable {

    @Id
    @Column(name = "id_pcorte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pCorte;
    @Column(name = "Codigo_pcorte")
    private String codigo_pCorte;
    @Column(name = "nombre_pcorte")
    private String nombre_pCorte;

    @OneToMany(mappedBy = "ptoCorte")
    private Set<tbEncabezado> encabezado;

    public tbPuntoCorte() {
    }

    public tbPuntoCorte(Long id_pCorte, String codigo_pCorte, String nombre_pCorte) {
        this.id_pCorte = id_pCorte;
        this.codigo_pCorte = codigo_pCorte;
        this.nombre_pCorte = nombre_pCorte;
    }

    /**
     * @return the id_pCorte
     */
    public Long getId_pCorte() {
        return id_pCorte;
    }

    /**
     * @param id_pCorte the id_pCorte to set
     */
    public void setId_pCorte(Long id_pCorte) {
        this.id_pCorte = id_pCorte;
    }

    /**
     * @return the codigo_pCorte
     */
    public String getCodigo_pCorte() {
        return codigo_pCorte;
    }

    /**
     * @param codigo_pCorte the codigo_pCorte to set
     */
    public void setCodigo_pCorte(String codigo_pCorte) {
        this.codigo_pCorte = codigo_pCorte;
    }

    /**
     * @return the nombre_pCorte
     */
    public String getNombre_pCorte() {
        return nombre_pCorte;
    }

    /**
     * @param nombre_pCorte the nombre_pCorte to set
     */
    public void setNombre_pCorte(String nombre_pCorte) {
        this.nombre_pCorte = nombre_pCorte;
    }

    @Override
    public String toString() {
        return "tbPCorte{" + "id_pCorte=" + id_pCorte + ", codigo_pCorte=" + codigo_pCorte + ", nombre_pCorte=" + nombre_pCorte + '}';
    }

}
