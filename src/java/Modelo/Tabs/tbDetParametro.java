/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabs;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Det_Param")
public class tbDetParametro implements Serializable {

    @Column(name = "id_terminal")
    private String id_terminal;
    @Id
    @Column(name = "id_detalle")
    private Long id_detalle;
    @Id
    @Column(name = "id_encabezado")
    private Long id_encabezado;
    @Column(name = "Valor1")
    private int Valor1;
    @Column(name = "Valor2")
    private int Valor2;
    @Column(name = "Valor3")
    private int Valor3;
    @Column(name = "Valor4")
    private int Valor4;
    @Column(name = "Valor5")
    private int Valor5;
    @Column(name = "Valor6")
    private int Valor6;
    @Column(name = "Valor7")
    private int Valor7;
    @Column(name = "Valor8")
    private int Valor8;
    @Column(name = "Valor9")
    private int Valor9;
    @Column(name = "Valor0")
    private int Valor0;
    @Column(name = "cantidad")
    private int cantidad;
    @Id
    @Column(name = "id_causa1")
    private int id_causa1;
    @Id
    @Column(name = "id_causa2")
    private int id_causa2;
    @Id
    @Column(name = "id_causa3")
    private int id_causa3;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_encabezado")
    private tbEncabezado encabezado;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_causa1")
    private tbCausa causa1;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_causa2")
    private tbCausa causa2;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_causa3")
    private tbCausa causa3;

    public tbDetParametro() {
    }

    public tbDetParametro(String id_terminal, Long id_detalle, Long id_encabezado, int Valor1, int Valor2, int Valor3, int Valor4, int Valor5, int Valor6, int Valor7, int Valor8, int Valor9, int Valor0, int cantidad, int id_causa1, int id_causa2, int id_causa3, tbEncabezado encabezado, tbCausa causa1, tbCausa causa2, tbCausa causa3) {
        this.id_terminal = id_terminal;
        this.id_detalle = id_detalle;
        this.id_encabezado = id_encabezado;
        this.Valor1 = Valor1;
        this.Valor2 = Valor2;
        this.Valor3 = Valor3;
        this.Valor4 = Valor4;
        this.Valor5 = Valor5;
        this.Valor6 = Valor6;
        this.Valor7 = Valor7;
        this.Valor8 = Valor8;
        this.Valor9 = Valor9;
        this.Valor0 = Valor0;
        this.cantidad = cantidad;
        this.id_causa1 = id_causa1;
        this.id_causa2 = id_causa2;
        this.id_causa3 = id_causa3;
        this.encabezado = encabezado;
        this.causa1 = causa1;
        this.causa2 = causa2;
        this.causa3 = causa3;
    }

    /**
     * @return the id_terminal
     */
    public String getId_terminal() {
        return id_terminal;
    }

    /**
     * @param id_terminal the id_terminal to set
     */
    public void setId_terminal(String id_terminal) {
        this.id_terminal = id_terminal;
    }

    /**
     * @return the id_detalle
     */
    public Long getId_detalle() {
        return id_detalle;
    }

    /**
     * @param id_detalle the id_detalle to set
     */
    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    /**
     * @return the id_encabezado
     */
    public Long getId_encabezado() {
        return id_encabezado;
    }

    /**
     * @param id_encabezado the id_encabezado to set
     */
    public void setId_encabezado(Long id_encabezado) {
        this.id_encabezado = id_encabezado;
    }

    /**
     * @return the Valor1
     */
    public int getValor1() {
        return Valor1;
    }

    /**
     * @param Valor1 the Valor1 to set
     */
    public void setValor1(int Valor1) {
        this.Valor1 = Valor1;
    }

    /**
     * @return the Valor2
     */
    public int getValor2() {
        return Valor2;
    }

    /**
     * @param Valor2 the Valor2 to set
     */
    public void setValor2(int Valor2) {
        this.Valor2 = Valor2;
    }

    /**
     * @return the Valor3
     */
    public int getValor3() {
        return Valor3;
    }

    /**
     * @param Valor3 the Valor3 to set
     */
    public void setValor3(int Valor3) {
        this.Valor3 = Valor3;
    }

    /**
     * @return the Valor4
     */
    public int getValor4() {
        return Valor4;
    }

    /**
     * @param Valor4 the Valor4 to set
     */
    public void setValor4(int Valor4) {
        this.Valor4 = Valor4;
    }

    /**
     * @return the Valor5
     */
    public int getValor5() {
        return Valor5;
    }

    /**
     * @param Valor5 the Valor5 to set
     */
    public void setValor5(int Valor5) {
        this.Valor5 = Valor5;
    }

    /**
     * @return the Valor6
     */
    public int getValor6() {
        return Valor6;
    }

    /**
     * @param Valor6 the Valor6 to set
     */
    public void setValor6(int Valor6) {
        this.Valor6 = Valor6;
    }

    /**
     * @return the Valor7
     */
    public int getValor7() {
        return Valor7;
    }

    /**
     * @param Valor7 the Valor7 to set
     */
    public void setValor7(int Valor7) {
        this.Valor7 = Valor7;
    }

    /**
     * @return the Valor8
     */
    public int getValor8() {
        return Valor8;
    }

    /**
     * @param Valor8 the Valor8 to set
     */
    public void setValor8(int Valor8) {
        this.Valor8 = Valor8;
    }

    /**
     * @return the Valor9
     */
    public int getValor9() {
        return Valor9;
    }

    /**
     * @param Valor9 the Valor9 to set
     */
    public void setValor9(int Valor9) {
        this.Valor9 = Valor9;
    }

    /**
     * @return the Valor0
     */
    public int getValor0() {
        return Valor0;
    }

    /**
     * @param Valor0 the Valor0 to set
     */
    public void setValor0(int Valor0) {
        this.Valor0 = Valor0;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the id_causa1
     */
    public int getId_causa1() {
        return id_causa1;
    }

    /**
     * @param id_causa1 the id_causa1 to set
     */
    public void setId_causa1(int id_causa1) {
        this.id_causa1 = id_causa1;
    }

    /**
     * @return the id_causa2
     */
    public int getId_causa2() {
        return id_causa2;
    }

    /**
     * @param id_causa2 the id_causa2 to set
     */
    public void setId_causa2(int id_causa2) {
        this.id_causa2 = id_causa2;
    }

    /**
     * @return the id_causa3
     */
    public int getId_causa3() {
        return id_causa3;
    }

    /**
     * @param id_causa3 the id_causa3 to set
     */
    public void setId_causa3(int id_causa3) {
        this.id_causa3 = id_causa3;
    }

    /**
     * @return the encabezado
     */
    public tbEncabezado getEncabezado() {
        return encabezado;
    }

    /**
     * @param encabezado the encabezado to set
     */
    public void setEncabezado(tbEncabezado encabezado) {
        this.encabezado = encabezado;
    }

    /**
     * @return the causa1
     */
    public tbCausa getCausa1() {
        return causa1;
    }

    /**
     * @param causa1 the causa1 to set
     */
    public void setCausa1(tbCausa causa1) {
        this.causa1 = causa1;
    }

    /**
     * @return the causa2
     */
    public tbCausa getCausa2() {
        return causa2;
    }

    /**
     * @param causa2 the causa2 to set
     */
    public void setCausa2(tbCausa causa2) {
        this.causa2 = causa2;
    }

    /**
     * @return the causa3
     */
    public tbCausa getCausa3() {
        return causa3;
    }

    /**
     * @param causa3 the causa3 to set
     */
    public void setCausa3(tbCausa causa3) {
        this.causa3 = causa3;
    }

    @Override
    public String toString() {
        return "tbDetParametro{" + "id_terminal=" + id_terminal + ", id_detalle=" + id_detalle + ", id_encabezado=" + id_encabezado + ", Valor1=" + Valor1 + ", Valor2=" + Valor2 + ", Valor3=" + Valor3 + ", Valor4=" + Valor4 + ", Valor5=" + Valor5 + ", Valor6=" + Valor6 + ", Valor7=" + Valor7 + ", Valor8=" + Valor8 + ", Valor9=" + Valor9 + ", Valor0=" + Valor0 + ", cantidad=" + cantidad + ", id_causa1=" + id_causa1 + ", id_causa2=" + id_causa2 + ", id_causa3=" + id_causa3 + ", encabezado=" + encabezado + ", causa1=" + causa1 + ", causa2=" + causa2 + ", causa3=" + causa3 + '}';
    }

}
