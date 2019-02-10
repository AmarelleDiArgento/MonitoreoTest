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
@Table(name = "Parametros")
public class tbParametro implements Serializable {

    @Id
    @Column(name = "id_param")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_parametro;
    @Column(name = "Codigo_param")
    private String codigo_parametro;
    @Column(name = "Nombre_param")
    private String nombre_parametro;
    @Column(name = "Tipo_Dato")
    private String tipo_dato;

    @OneToMany(mappedBy = "parametro")
    private Set<tbParametroTipo> parametrosTipo;

    public tbParametro() {
    }

    public tbParametro(String codigo_parametro, String nombre_parametro, String tipo_dato, Set<tbParametroTipo> parametrosTipo) {
        this.codigo_parametro = codigo_parametro;
        this.nombre_parametro = nombre_parametro;
        this.tipo_dato = tipo_dato;
        this.parametrosTipo = parametrosTipo;
    }

    /**
     * @return the id_parametro
     */
    public Long getId_parametro() {
        return id_parametro;
    }

    /**
     * @param id_parametro the id_parametro to set
     */
    public void setId_parametro(Long id_parametro) {
        this.id_parametro = id_parametro;
    }

    /**
     * @return the codigo_parametro
     */
    public String getCodigo_parametro() {
        return codigo_parametro;
    }

    /**
     * @param codigo_parametro the codigo_parametro to set
     */
    public void setCodigo_parametro(String codigo_parametro) {
        this.codigo_parametro = codigo_parametro;
    }

    /**
     * @return the nombre_parametro
     */
    public String getNombre_parametro() {
        return nombre_parametro;
    }

    /**
     * @param nombre_parametro the nombre_parametro to set
     */
    public void setNombre_parametro(String nombre_parametro) {
        this.nombre_parametro = nombre_parametro;
    }

    /**
     * @return the tipo_dato
     */
    public String getTipo_dato() {
        return tipo_dato;
    }

    /**
     * @param tipo_dato the tipo_dato to set
     */
    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    /**
     * @return the parametrosTipo
     */
    public Set<tbParametroTipo> getParametrosTipo() {
        return parametrosTipo;
    }

    /**
     * @param parametrosTipo the parametrosTipo to set
     */
    public void setParametrosTipo(Set<tbParametroTipo> parametrosTipo) {
        this.parametrosTipo = parametrosTipo;
    }

    @Override
    public String toString() {
        return "tbParametro{" + "id_parametro=" + id_parametro + ", codigo_parametro=" + codigo_parametro + ", nombre_parametro=" + nombre_parametro + ", tipo_dato=" + tipo_dato + '}';
    }

}
