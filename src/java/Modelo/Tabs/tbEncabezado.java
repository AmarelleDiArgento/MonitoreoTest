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

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_tipo")
    private tbTipo tipo;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_monitor")
    private tbMonitor monitor;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_posco")
    private tbPostcosecha postcosecha;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_variedad")
    private tbVariedad variedad;

    @Column(name = "Bloque")
    private String Bloque;
    @Column(name = "Cama")
    private int Cama;
    @Column(name = "Linea")
    private int Linea;
    @Column(name = "Cantidad_R")
    private int Cantidad_R;

    @ManyToOne(optional = true)
    @JoinColumn(name = "punto_corte")
    private tbPuntoCorte ptoCorte;

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

    public tbEncabezado() {
    }

    public tbEncabezado(Long Id_encabezado, tbTipo tipo, String fecha, tbMonitor monitor, tbPostcosecha postcosecha, tbVariedad variedad, String Bloque, int Cama, int Linea, int Cantidad_R, tbPuntoCorte ptoCorte, int Plantas, int Luz, int D_Raiz, String F_Hormona1, int C_Hormona1, String F_Hormona2, int C_Hormona2, String F_Hormona3, int C_Hormona3, String F_Hormona4, int C_Hormona4, String F_Hormona5, int C_Hormona5) {
        this.Id_encabezado = Id_encabezado;
        this.tipo = tipo;
        this.fecha = fecha;
        this.monitor = monitor;
        this.postcosecha = postcosecha;
        this.variedad = variedad;
        this.Bloque = Bloque;
        this.Cama = Cama;
        this.Linea = Linea;
        this.Cantidad_R = Cantidad_R;
        this.ptoCorte = ptoCorte;
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

    @Override
    public String toString() {
        return "tbEncabezado{" + "Id_terminal=" + Id_terminal + ", Id_encabezado=" + Id_encabezado + ", tipo=" + tipo + ", fecha=" + fecha + ", monitor=" + monitor + ", postcosecha=" + postcosecha + ", variedad=" + variedad + ", Bloque=" + Bloque + ", Cama=" + Cama + ", Linea=" + Linea + ", Cantidad_R=" + Cantidad_R + ", ptoCorte=" + ptoCorte + ", Plantas=" + Plantas + ", Luz=" + Luz + ", D_Raiz=" + D_Raiz + ", F_Hormona1=" + F_Hormona1 + ", C_Hormona1=" + C_Hormona1 + ", F_Hormona2=" + F_Hormona2 + ", C_Hormona2=" + C_Hormona2 + ", F_Hormona3=" + F_Hormona3 + ", C_Hormona3=" + C_Hormona3 + ", F_Hormona4=" + F_Hormona4 + ", C_Hormona4=" + C_Hormona4 + ", F_Hormona5=" + F_Hormona5 + ", C_Hormona5=" + C_Hormona5 + '}';
    }

}
