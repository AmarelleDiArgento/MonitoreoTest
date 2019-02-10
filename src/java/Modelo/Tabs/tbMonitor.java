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
@Table(name = "Monitores")
public class tbMonitor implements Serializable {

    @Id
    @Column(name = "Id_Monitor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_monitor;
    @Column(name = "Codigo_monitor")
    private String codigo_monitor;
    @Column(name = "Nombre_monitor")
    private String nombre_monitor;

    @OneToMany(mappedBy = "monitor")
    private Set<tbEncabezado> encabezado;

    public tbMonitor() {
    }

    public tbMonitor(Long id_monitor, String codigo_monitor, String nombre_monitor) {
        this.id_monitor = id_monitor;
        this.codigo_monitor = codigo_monitor;
        this.nombre_monitor = nombre_monitor;
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
     * @return the codigo_monitor
     */
    public String getCodigo_monitor() {
        return codigo_monitor;
    }

    /**
     * @param codigo_monitor the codigo_monitor to set
     */
    public void setCodigo_monitor(String codigo_monitor) {
        this.codigo_monitor = codigo_monitor;
    }

    /**
     * @return the nombre_monitor
     */
    public String getNombre_monitor() {
        return nombre_monitor;
    }

    /**
     * @param nombre_monitor the nombre_monitor to set
     */
    public void setNombre_monitor(String nombre_monitor) {
        this.nombre_monitor = nombre_monitor;
    }

    @Override
    public String toString() {
        return "tbMonitor{" + "id_monitor=" + id_monitor + ", codigo_monitor=" + codigo_monitor + ", nombre_monitor=" + nombre_monitor + '}';
    }

}
