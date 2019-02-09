/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author almoreno
 */
public class Enlace {

    public Connection conectar() throws SQLException {
        Connection cn = null;
        String url = "jdbc:sqlserver://10.50.1.145\\Mercedes;databaseName=MonitoreoHtml";
        String user = "Inventarios";
        String password = "Inventarios2016*";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url, user, password);
            if(cn.isValid(0)){
                System.out.println("!Conexion Exitosa!");
            }else{
                System.out.println("!Error de conexion!");
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de conexión: " + ex);
        }
        return cn;
    }

}
