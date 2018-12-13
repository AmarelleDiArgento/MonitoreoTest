/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;

/**
 *
 * @author almoreno
 */
public class tbParametroTipo implements  Serializable{
    
    private Long id_param_tipo;
   private Long  id_tipo;
   private int id_param;
   private String validar;

    public tbParametroTipo(Long id_param_tipo, Long id_tipo, int id_param, String validar) {
        this.id_param_tipo = id_param_tipo;
        this.id_tipo = id_tipo;
        this.id_param = id_param;
        this.validar = validar;
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

    @Override
    public String toString() {
        return "tbParametroTipo{" + "id_param_tipo=" + id_param_tipo + ", id_tipo=" + id_tipo + ", id_param=" + id_param + ", validar=" + validar + '}';
    }
   
    
}
