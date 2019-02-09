/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
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
@Table(name = "Encabezado")
public class tbEncabezado implements Serializable {

    @Column(name = "Id_terminal")
    private String Id_terminal;
    @Id
    @Column(name = "Id_encabezado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_encabezado;
    @Column(name = "id_tipo")
    private Long id_tipo;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "id_monitor")
    private Long id_monitor;
    @Column(name = "id_posco")
    private Long id_posco;
    @Column(name = "id_variedad")
    private Long id_variedad;
    @Column(name = "Bloque")
    private String Bloque;
    @Column(name = "Cama")
    private int Cama;
    @Column(name = "Linea")
    private int Linea;
    @Column(name = "Cantidad_R")
    private int Cantidad_R;
    @Column(name = "punto_corte")
    private int punto_corte;
    @Column(name = "Plantas")
    private int Plantas;
    @Column(name = "Luz")
    private int Luz;
    @Column(name = "D_Raiz")
    private int D_Raiz;
    @Column(name = "F_Hormona1")
    private String F_Hormona1;
    @Column(name = "C_Hormona1")
    private int C_Hormona1;
    @Column(name = "F_Hormona2")
    private String F_Hormona2;
    @Column(name = "C_Hormona2")
    private int C_Hormona2;
    @Column(name = "F_Hormona3")
    private String F_Hormona3;
    @Column(name = "C_Hormona3")
    private int C_Hormona3;
    @Column(name = "F_Hormona4")
    private String F_Hormona4;
    @Column(name = "C_Hormona4")
    private int C_Hormona4;
    @Column(name = "F_Hormona5")
    private String F_Hormona5;
    @Column(name = "C_Hormona5")
    private int C_Hormona5;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_tipo")
    private tbTipo tipo;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_monitor")
    private tbMonitor monitor;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_posco")
    private tbPostcosecha postcosecha;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_variedad")
    private tbVariedad variedad;
    @ManyToOne(optional = true)
    @JoinColumn(name = "punto_corte")
    private tbPuntoCorte ptoCorte;

    public tbEncabezado() {
    }

    public tbEncabezado(String Id_terminal, Long Id_encabezado, Long id_tipo, String fecha, Long id_monitor, Long id_posco, Long id_variedad, String Bloque, int Cama, int Linea, int Cantidad_R, int punto_corte, int Plantas, int Luz, int D_Raiz, String F_Hormona1, int C_Hormona1, String F_Hormona2, int C_Hormona2, String F_Hormona3, int C_Hormona3, String F_Hormona4, int C_Hormona4, String F_Hormona5, int C_Hormona5, tbTipo tipo, tbMonitor monitor, tbPostcosecha postcosecha, tbVariedad variedad, tbPuntoCorte ptoCorte) {
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
        this.punto_corte = punto_corte;
        this.Plantas = Plantas;
        this.Luz = Luz;
        this.D_Raiz = D_Raiz;
        this.F_Hormona1 = F_Hormona1;
        this.C_Hormona1 = C_Hormona1;
        this.F_Hormona2 = F_Hormona2;
        this.C_Hormona2 = C_Hormona2;
        this.F_Hormona3 = F_Hormona3;
        this.C_Hormona3 = C_Hormona3;
        this.F_Hormona4 = F_Hormona4;
        this.C_Hormona4 = C_Hormona4;
        this.F_Hormona5 = F_Hormona5;
        this.C_Hormona5 = C_Hormona5;
        this.tipo = tipo;
        this.monitor = monitor;
        this.postcosecha = postcosecha;
        this.variedad = variedad;
        this.ptoCorte = ptoCorte;
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

    /**
     * @return the punto_corte
     */
    public int getPunto_corte() {
        return punto_corte;
    }

    /**
     * @param punto_corte the punto_corte to set
     */
    public void setPunto_corte(int punto_corte) {
        this.punto_corte = punto_corte;
    }

    /**
     * @return the Plantas
     */
    public int getPlantas() {
        return Plantas;
    }

    /**
     * @param Plantas the Plantas to set
     */
    public void setPlantas(int Plantas) {
        this.Plantas = Plantas;
    }

    /**
     * @return the Luz
     */
    public int getLuz() {
        return Luz;
    }

    /**
     * @param Luz the Luz to set
     */
    public void setLuz(int Luz) {
        this.Luz = Luz;
    }

    /**
     * @return the D_Raiz
     */
    public int getD_Raiz() {
        return D_Raiz;
    }

    /**
     * @param D_Raiz the D_Raiz to set
     */
    public void setD_Raiz(int D_Raiz) {
        this.D_Raiz = D_Raiz;
    }

    /**
     * @return the F_Hormona1
     */
    public String getF_Hormona1() {
        return F_Hormona1;
    }

    /**
     * @param F_Hormona1 the F_Hormona1 to set
     */
    public void setF_Hormona1(String F_Hormona1) {
        this.F_Hormona1 = F_Hormona1;
    }

    /**
     * @return the C_Hormona1
     */
    public int getC_Hormona1() {
        return C_Hormona1;
    }

    /**
     * @param C_Hormona1 the C_Hormona1 to set
     */
    public void setC_Hormona1(int C_Hormona1) {
        this.C_Hormona1 = C_Hormona1;
    }

    /**
     * @return the F_Hormona2
     */
    public String getF_Hormona2() {
        return F_Hormona2;
    }

    /**
     * @param F_Hormona2 the F_Hormona2 to set
     */
    public void setF_Hormona2(String F_Hormona2) {
        this.F_Hormona2 = F_Hormona2;
    }

    /**
     * @return the C_Hormona2
     */
    public int getC_Hormona2() {
        return C_Hormona2;
    }

    /**
     * @param C_Hormona2 the C_Hormona2 to set
     */
    public void setC_Hormona2(int C_Hormona2) {
        this.C_Hormona2 = C_Hormona2;
    }

    /**
     * @return the F_Hormona3
     */
    public String getF_Hormona3() {
        return F_Hormona3;
    }

    /**
     * @param F_Hormona3 the F_Hormona3 to set
     */
    public void setF_Hormona3(String F_Hormona3) {
        this.F_Hormona3 = F_Hormona3;
    }

    /**
     * @return the C_Hormona3
     */
    public int getC_Hormona3() {
        return C_Hormona3;
    }

    /**
     * @param C_Hormona3 the C_Hormona3 to set
     */
    public void setC_Hormona3(int C_Hormona3) {
        this.C_Hormona3 = C_Hormona3;
    }

    /**
     * @return the F_Hormona4
     */
    public String getF_Hormona4() {
        return F_Hormona4;
    }

    /**
     * @param F_Hormona4 the F_Hormona4 to set
     */
    public void setF_Hormona4(String F_Hormona4) {
        this.F_Hormona4 = F_Hormona4;
    }

    /**
     * @return the C_Hormona4
     */
    public int getC_Hormona4() {
        return C_Hormona4;
    }

    /**
     * @param C_Hormona4 the C_Hormona4 to set
     */
    public void setC_Hormona4(int C_Hormona4) {
        this.C_Hormona4 = C_Hormona4;
    }

    /**
     * @return the F_Hormona5
     */
    public String getF_Hormona5() {
        return F_Hormona5;
    }

    /**
     * @param F_Hormona5 the F_Hormona5 to set
     */
    public void setF_Hormona5(String F_Hormona5) {
        this.F_Hormona5 = F_Hormona5;
    }

    /**
     * @return the C_Hormona5
     */
    public int getC_Hormona5() {
        return C_Hormona5;
    }

    /**
     * @param C_Hormona5 the C_Hormona5 to set
     */
    public void setC_Hormona5(int C_Hormona5) {
        this.C_Hormona5 = C_Hormona5;
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

    /**
     * @return the monitor
     */
    public tbMonitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(tbMonitor monitor) {
        this.monitor = monitor;
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

    /**
     * @return the variedad
     */
    public tbVariedad getVariedad() {
        return variedad;
    }

    /**
     * @param variedad the variedad to set
     */
    public void setVariedad(tbVariedad variedad) {
        this.variedad = variedad;
    }

    /**
     * @return the ptoCorte
     */
    public tbPuntoCorte getPtoCorte() {
        return ptoCorte;
    }

    /**
     * @param ptoCorte the ptoCorte to set
     */
    public void setPtoCorte(tbPuntoCorte ptoCorte) {
        this.ptoCorte = ptoCorte;
    }

    @Override
    public String toString() {
        return "tbEncabezado{" + "Id_terminal=" + Id_terminal + ", Id_encabezado=" + Id_encabezado + ", id_tipo=" + id_tipo + ", fecha=" + fecha + ", id_monitor=" + id_monitor + ", id_posco=" + id_posco + ", id_variedad=" + id_variedad + ", Bloque=" + Bloque + ", Cama=" + Cama + ", Linea=" + Linea + ", Cantidad_R=" + Cantidad_R + ", punto_corte=" + punto_corte + ", Plantas=" + Plantas + ", Luz=" + Luz + ", D_Raiz=" + D_Raiz + ", F_Hormona1=" + F_Hormona1 + ", C_Hormona1=" + C_Hormona1 + ", F_Hormona2=" + F_Hormona2 + ", C_Hormona2=" + C_Hormona2 + ", F_Hormona3=" + F_Hormona3 + ", C_Hormona3=" + C_Hormona3 + ", F_Hormona4=" + F_Hormona4 + ", C_Hormona4=" + C_Hormona4 + ", F_Hormona5=" + F_Hormona5 + ", C_Hormona5=" + C_Hormona5 + ", tipo=" + tipo + ", monitor=" + monitor + ", postcosecha=" + postcosecha + ", variedad=" + variedad + ", ptoCorte=" + ptoCorte + '}';
    }

}
