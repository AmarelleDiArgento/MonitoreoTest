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
@Table(name = "Parametros_tipo")
public class tbParametroTipo implements Serializable {

    @Id
    @Column(name = "id_param_tipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_param_tipo;
    @Id
    @Column(name = "id_tipo")
    private Long id_tipo;
    @Id
    @Column(name = "id_param")
    private int id_param;
    @Column(name = "Validar")
    private String validar;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_param")
    private tbParametro parametro;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_tipo")
    private tbTipo tipo;

    public tbParametroTipo() {
    }

    public tbParametroTipo(Long id_param_tipo, Long id_tipo, int id_param, String validar, tbParametro parametro, tbTipo tipo) {
        this.id_param_tipo = id_param_tipo;
        this.id_tipo = id_tipo;
        this.id_param = id_param;
        this.validar = validar;
        this.parametro = parametro;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tbParametroTipo{" + "id_param_tipo=" + getId_param_tipo() + ", id_tipo=" + getId_tipo() + ", id_param=" + getId_param() + ", validar=" + getValidar() + ", parametro=" + getParametro() + ", tipo=" + getTipo() + '}';
    }

    /**
     * @return the id_param_tipo
     */
    public Long getId_param_tipo() {
        return id_param_tipo;
    }

    /**
     * @param id_param_tipo the id_param_tipo to set
     */
    public void setId_param_tipo(Long id_param_tipo) {
        this.id_param_tipo = id_param_tipo;
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
     * @return the id_param
     */
    public int getId_param() {
        return id_param;
    }

    /**
     * @param id_param the id_param to set
     */
    public void setId_param(int id_param) {
        this.id_param = id_param;
    }

    /**
     * @return the validar
     */
    public String getValidar() {
        return validar;
    }

    /**
     * @param validar the validar to set
     */
    public void setValidar(String validar) {
        this.validar = validar;
    }

    /**
     * @return the parametro
     */
    public tbParametro getParametro() {
        return parametro;
    }

    /**
     * @param parametro the parametro to set
     */
    public void setParametro(tbParametro parametro) {
        this.parametro = parametro;
    }

    /**
     * @return the tipo
     */
    public tbTipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(tbTipo tipo) {
        this.tipo = tipo;
    }

}
