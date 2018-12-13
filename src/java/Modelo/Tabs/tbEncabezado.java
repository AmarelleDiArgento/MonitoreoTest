/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;

/**
 *
 * @author almoreno
 */
public class tbEncabezado implements Serializable {

    private String Id_terminal;
    private Long Id_encabezado;
    private Long id_tipo;
    private String fecha;
    private Long id_monitor;
    private Long id_posco;
    private Long id_variedad;
    private String Bloque;
    private int Cama;
    private int Linea;
    private int Cantidad_R;

    public tbEncabezado(String Id_terminal, Long Id_encabezado, Long id_tipo, String fecha, Long id_monitor, Long id_posco, Long id_variedad, String Bloque, int Cama, int Linea, int Cantidad_R) {
        this.Id_terminal = Id_terminal;
        this.Id_encabezado = Id_encabezado;
        this.id_tipo = id_tipo;
        this.fecha = fecha;
        this.id_monitor = id_monitor;
        this.id_posco = id_posco;
        this.id_variedad = id_variedad;
        this.Bloque = Bloque;
        this.Cama = Cama;
        this.Linea = Linea;
        this.Cantidad_R = Cantidad_R;
    }

    /**
     * @return the Id_terminal
     */
    public String getId_terminal() {
        return Id_terminal;
    }

    /**
     * @param Id_terminal the Id_terminal to set
     */
    public void setId_terminal(String Id_terminal) {
        this.Id_terminal = Id_terminal;
    }

    /**
     * @return the Id_encabezado
     */
    public Long getId_encabezado() {
        return Id_encabezado;
    }

    /**
     * @param Id_encabezado the Id_encabezado to set
     */
    public void setId_encabezado(Long Id_encabezado) {
        this.Id_encabezado = Id_encabezado;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the id_monitor
     */
    public Long getId_monitor() {
        return id_monitor;
    }

    /**
     * @param id_monitor the id_monitor to set
     */
    public void setId_monitor(Long id_monitor) {
        this.id_monitor = id_monitor;
    }

    /**
     * @return the id_posco
     */
    public Long getId_posco() {
        return id_posco;
    }

    /**
     * @param id_posco the id_posco to set
     */
    public void setId_posco(Long id_posco) {
        this.id_posco = id_posco;
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
     * @return the Bloque
     */
    public String getBloque() {
        return Bloque;
    }

    /**
     * @param Bloque the Bloque to set
     */
    public void setBloque(String Bloque) {
        this.Bloque = Bloque;
    }

    /**
     * @return the Cama
     */
    public int getCama() {
        return Cama;
    }

    /**
     * @param Cama the Cama to set
     */
    public void setCama(int Cama) {
        this.Cama = Cama;
    }

    /**
     * @return the Linea
     */
    public int getLinea() {
        return Linea;
    }

    /**
     * @param Linea the Linea to set
     */
    public void setLinea(int Linea) {
        this.Linea = Linea;
    }

    /**
     * @return the Cantidad_R
     */
    public int getCantidad_R() {
        return Cantidad_R;
    }

    /**
     * @param Cantidad_R the Cantidad_R to set
     */
    public void setCantidad_R(int Cantidad_R) {
        this.Cantidad_R = Cantidad_R;
    }

    @Override
    public String toString() {
        return "tbEncabezado{" + "Id_terminal=" + Id_terminal + ", Id_encabezado=" + Id_encabezado + ", id_tipo=" + id_tipo + ", fecha=" + fecha + ", id_monitor=" + id_monitor + ", id_posco=" + id_posco + ", id_variedad=" + id_variedad + ", Bloque=" + Bloque + ", Cama=" + Cama + ", Linea=" + Linea + ", Cantidad_R=" + Cantidad_R + '}';
    }

}
