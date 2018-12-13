/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Interfaz;

/**
 *
 * @author almoreno
 */
public interface Administrador {

    Causa getCausa();

    DetParametro getDetParametro();

    Encabezado getEncabezado();

    Finca getFinca();

    Inf_Monitoreo getInf_Monitoreo();

    Monitor getMonitor();

    Parametro getParametro();

    Postcosecha getPostcosecha();

    Producto getProducto();

    PuntoCorte getPuntoCorte();

    Tipo getTipo();

    Variedad getVariedad();

}
