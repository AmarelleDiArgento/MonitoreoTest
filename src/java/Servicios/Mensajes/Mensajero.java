/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios.Mensajes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author freyd
 */
public abstract class Mensajero {

    public Msj m = new Msj();

    public Msj Error() {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, hago debió salir mal");
        m.setDetalles("por favor verifica la información ingresada");
        return m;
    }

    public Msj notFound(Long Id) {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, hago debió salir mal");
        m.setDetalles("por favor verifica la información ingresada \n ID: " + Id + ", no se encuentra.");
        return m;
    }

    public Msj notFound(String Id) {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, hago debió salir mal");
        m.setDetalles("por favor verifica la información ingresada \n ID: " + Id + ", no se encuentra.");
        return m;
    }

    public Msj Error(SQLException ex) {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, hago debió salir mal");
        m.setDetalles("!ERROR¡ SQL \n Error: " + ex.getMessage() + ". \n Detalles" + ex);
        return m;
    }
    
    public Msj Error(Exception ex) {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, hago debió salir mal");
        m.setDetalles("!ERROR¡ \n Error: " + ex.getMessage() + ". \n Detalles" + ex);
        return m;
    }

    public Msj NotAccess() {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, No debes entrar ahí");
        m.setDetalles("No tienes permisos para ingresar a esta area");
        return m;
    }

    public Msj NotSession() {
        m.setTipo("Error");
        m.setMsj("'¡Ups!, No has iniciado sesión");
        m.setDetalles("Debes iniciar sesion para poder acceder a esta area");
        return m;
    }

    public Msj InsertOk(String nombre) {
        m.setTipo("Ok");
        m.setMsj("Registro exitoso");
        m.setDetalles(nombre + ", se ha ingresado satisfactoriamente");
        return m;
    }

    public Msj UpdateOk(String nombre) {
        m.setTipo("Ok");
        m.setMsj("Actualizacion exitosa");
        m.setDetalles(nombre + ", se ha modificado satisfactoriamente");
        return m;
    }

    public Msj DeleteOk(String nombre) {
        m.setTipo("Ok");
        m.setMsj("Elimiando exitosa");
        m.setDetalles(nombre + ", se ha eliminado satisfactoriamente");
        return m;
    }

    public void StatClose(PreparedStatement stat) throws SQLException {
        if (stat != null) {
            stat.close();
        }
    }

    public void StatClose(PreparedStatement stat, ResultSet rs) throws SQLException {
        if (stat != null) {
            stat.close();
        }

        if (rs != null) {
            rs.close();
        }
    }

}
