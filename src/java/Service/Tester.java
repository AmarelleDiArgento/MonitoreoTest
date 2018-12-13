/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Implementar.AdminSql;
import Modelo.Tabs.tbCausa;
import Servicios.Mensajes.Mensajero;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author almoreno
 */
public class Tester extends Mensajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tester t = new Tester();
        t.probarIn();
    }

    public Tester() {
    }

    public void probarOn() {
        try {
            AdminSql aSql = new AdminSql();

            Long ID = Long.valueOf(400);
            tbCausa c = aSql.getCausa().one(ID);
            if (c!=null){
            System.out.println(c.toString());
                
            }else{
                m=notFound(ID);
            }
        } catch (SQLException ex) {
            m=Error(ex);
        }
        System.out.println(m.toString());
    }

    public void probarLi() {

        try {
            AdminSql aSql = new AdminSql();
            List<tbCausa> cl = aSql.getCausa().all();
            for (tbCausa c : cl) {
                System.out.println(c.toString());
            }
        } catch (SQLException ex) {
            m=Error(ex);
        }
        System.out.println(m.toString());
    }
     public void probarIn() {

        try {
            AdminSql aSql = new AdminSql();
            Long ID = Long.valueOf(44);
            String Cod = "44";
            String Nombre = "DAÑO DE MINADOR";
            tbCausa c = new tbCausa(ID, Cod, Nombre);
            m = aSql.getCausa().insert(c);
        } catch (SQLException ex) {
            m=Error(ex);
        }
        System.out.println(m.toString());
    } 
        public void probarUp() {

        try {
            AdminSql aSql = new AdminSql();
            Long ID = Long.valueOf(44);
            String Cod = "44";
            String Nombre = "DAÑO DE MINADOR";
            tbCausa c = new tbCausa(ID, Cod, Nombre);
            m = aSql.getCausa().update(c);
        } catch (SQLException ex) {
            m=Error(ex);
        }
        System.out.println(m.toString());
    } 
        public void probarDe() {

        try {
            AdminSql aSql = new AdminSql();
            Long ID = Long.valueOf(44);
            m = aSql.getCausa().delete(ID);
        } catch (SQLException ex) {
            m=Error(ex);
        }
        System.out.println(m.toString());
    } 
}
