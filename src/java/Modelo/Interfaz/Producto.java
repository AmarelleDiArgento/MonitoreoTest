/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Interfaz;

import Modelo.DAO;
import Modelo.Tabs.tbProducto;
import java.sql.ResultSet;

/**
 *
 * @author almoreno
 */
public interface Producto extends DAO<ResultSet, tbProducto,Long>{
    
}
