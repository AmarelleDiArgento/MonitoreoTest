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
@Table(name = "Causas")
public class tbCausa implements Serializable {

    @Id
    @Column(name = "id_causa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_causa;
    @Column(name = "Codigo_causa")
    private String codigo_causa;
    @Column(name = "Nombre_causa")
    private String nombre_causa;

    @OneToMany(mappedBy = "causa1")
    private Set<tbDetParametro> detParametros1;

    @OneToMany(mappedBy = "causa2")
    private Set<tbDetParametro> detParametros2;

    @OneToMany(mappedBy = "causa3")
    private Set<tbDetParametro> detParametros3;

}
