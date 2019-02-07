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
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        String datos = "";
        try {
            AdminSql aSql = new AdminSql();
            List<tbCausa> lc = aSql.getCausa().all();

            JsonObject cJ = aSql.getCausa().jFile(lc);
            out.print(cJ.toString());

        } catch (SQLException ex) {
            Logger.getLogger(slCausa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
