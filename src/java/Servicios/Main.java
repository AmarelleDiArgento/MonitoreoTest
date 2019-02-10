/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelo.Tabs.tbCausa;
import Modelo.Tabs.tbEncabezado;
import Modelo.Tabs.tbParametro;
import Modelo.Tabs.tbParametroTipo;
import Modelo.Tabs.tbProducto;
import Modelo.Tabs.tbTipo;
import Modelo.Tabs.tbVariedad;
import java.util.List;

/**
 *
 * @author almoreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionMonitoreo con = new SessionMonitoreo();
        List<tbEncabezado> tipos = con.getSession().createQuery("from tbEncabezado").list();
        System.out.println("Resutados: " + tipos.size());
        for (tbEncabezado c : tipos) {
            System.out.println(c.toString());

        }
        // TODO code application logic here
    }

}
