/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Implementar;

import Modelo.Interfaz.Administrador;
import Modelo.Interfaz.Causa;
import Modelo.Interfaz.DetParametro;
import Modelo.Interfaz.Encabezado;
import Modelo.Interfaz.Finca;
import Modelo.Interfaz.Inf_Monitoreo;
import Modelo.Interfaz.Monitor;
import Modelo.Interfaz.Parametro;
import Modelo.Interfaz.Postcosecha;
import Modelo.Interfaz.Producto;
import Modelo.Interfaz.PuntoCorte;
import Modelo.Interfaz.Tipo;
import Modelo.Interfaz.Variedad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author almoreno
 */
public class AdminSql implements Administrador {

    private Connection cn = null;
    private DataSource pool = null;

    public AdminSql() throws SQLException {
        String url = "jdbc:sqlserver://10.50.1.145\\Mercedes;databaseName=MonitoreoHtml";
        String user = "Inventarios";
        String password = "Inventarios2016*";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(url, user, password);
            if (cn.isValid(0)) {
                System.out.println("!Conexion Exitosa!");
            } else {
                System.out.println("!Error de conexion!");

            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de conexión: " + ex);
        }

    }

    public AdminSql(DataSource ds) throws SQLException {
        this.pool = ds;
        this.cn = pool.getConnection();

    }

    Causa cau=null;
    
    @Override
    public Causa getCausa() {
        if (cau==null){
            cau = new CausaImp(cn);
        }
        return cau;
    }

    @Override
    public DetParametro getDetParametro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Encabezado getEncabezado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Finca getFinca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inf_Monitoreo getInf_Monitoreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Monitor getMonitor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Parametro getParametro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Postcosecha getPostcosecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto getProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PuntoCorte getPuntoCorte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Variedad getVariedad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
