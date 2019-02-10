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

}
