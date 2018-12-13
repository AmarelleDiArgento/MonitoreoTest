/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Implementar.AdminSql;
import Modelo.Tabs.tbCausa;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author almoreno
 */
public class slCausa extends HttpServlet {

    @Resource(name = "Pool")
    private DataSource pool;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json"); 
        PrintWriter out = resp.getWriter();
        
        String datos = "";
        try {
            AdminSql aSql = new AdminSql();
            List<tbCausa> lc = aSql.getCausa().all();

            JsonObject cJ = new JsonObject();
            JsonArray caJ = new JsonArray();

            for (tbCausa c : lc) {
                JsonObject item = new JsonObject();

                item.addProperty("id", c.getId_causa());
                item.addProperty("codigo", c.getCodigo_causa());
                item.addProperty("nombre", c.getNombre_causa());
                caJ.add(item);
            }
            cJ.add("causas", caJ);
            out.print(cJ.toString());
        } catch (SQLException ex) {
            Logger.getLogger(slCausa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
