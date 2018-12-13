/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Implementar;

import Modelo.Interfaz.Causa;
import Modelo.Tabs.tbCausa;
import Servicios.Mensajes.Mensajero;
import Servicios.Mensajes.Msj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almoreno
 */
public class CausaImp extends Mensajero implements Causa {

    Connection con;

    final String Insert = "EXEC [MonitoreoHtml].[dbo].[SP_insCausa] ?,?,?";
    final String Update = "EXEC [MonitoreoHtml].[dbo].[SP_updCausa] ?,?,?";
    final String Delete = "EXEC [MonitoreoHtml].[dbo].[SP_delCausa] ?";
    final String One = "EXEC [MonitoreoHtml].[dbo].[SP_oneCausa] ?;";
    final String All = "EXEC [MonitoreoHtml].[dbo].[SP_allCausa];";

    public CausaImp(Connection con) {
        this.con = con;
    }

    @Override
    public Msj insert(tbCausa o) {
        PreparedStatement stat = null;
        try {
            stat = con.prepareCall(Insert);
            stat.setLong(1, o.getId_causa());
            stat.setString(2, o.getCodigo_causa());
            stat.setString(3, o.getNombre_causa());
            if (stat.executeUpdate() == 0) {
                m = Error();
            } else {
                m = InsertOk("");
            }
        } catch (SQLException ex) {
            m = Error(ex);
        } finally {
            try {
                StatClose(stat);
            } catch (SQLException ex) {
                m = Error(ex);
            }
        }
        return m;
    }

    @Override
    public Msj update(tbCausa o) {
        PreparedStatement stat = null;
        try {
            stat = con.prepareCall(Update);
            stat.setLong(1, o.getId_causa());
            stat.setString(2, o.getCodigo_causa());
            stat.setString(3, o.getNombre_causa());
            if (stat.executeUpdate() == 0) {
                m = Error();
            } else {
                m = UpdateOk(o.getNombre_causa());
            }
        } catch (SQLException ex) {
            m = Error(ex);
        } finally {
            try {
                StatClose(stat);
            } catch (SQLException ex) {
                m = Error(ex);
            }
        }
        return m;
    }

    @Override
    public Msj delete(Long id) {
        tbCausa c = one(id);
        if (c != null) {
            PreparedStatement stat = null;
            try {
                stat = con.prepareCall(Delete);
                stat.setLong(1, id);
                if (stat.executeUpdate() == 0) {
                    m = Error();
                } else {
                    m = DeleteOk(c.getNombre_causa());
                }

            } catch (SQLException ex) {
                m = Error(ex);
            } finally {
                try {
                    StatClose(stat);
                } catch (SQLException ex) {
                    m = Error(ex);
                }

            }
        } else {
            m = notFound(id);
        }
        return m;
    }

    @Override
    public tbCausa bringOff(ResultSet rs) throws SQLException {

        Long id_causa = rs.getLong("id_causa");
        String codigo_causa = rs.getString("Codigo_causa");
        String nombre_causa = rs.getString("Nombre_causa");
        tbCausa c = new tbCausa(id_causa, codigo_causa, nombre_causa);
        return c;
    }

    @Override
    public tbCausa one(Long id) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        tbCausa c = null;
        try {
            stat = con.prepareCall(One);
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                c = bringOff(rs);
            } else {
                m = notFound(id);
            }
        } catch (SQLException ex) {
            m = Error(ex);
        } finally {
            try {
                StatClose(stat, rs);
            } catch (SQLException ex) {
                m = Error(ex);
            }
        }
        return c;
    }

    @Override
    public List<tbCausa> all() {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<tbCausa> cl = new ArrayList<>();
        try {
            stat = con.prepareCall(All);
            rs = stat.executeQuery();
            while (rs.next()) {
                cl.add(bringOff(rs));
            }
        } catch (SQLException ex) {
            m = Error(ex);
        } finally {
            try {
                StatClose(stat, rs);
            } catch (SQLException ex) {
                m = Error(ex);
            }
        }
        return cl;

    }

}
