/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author almoreno
 */
public class JsonFile {

    final String ruta = "C:\\Users\\almoreno\\Code\\MonitoreoTest\\web\\JSON\\";

    public void JsonConGson(String archivo, JsonObject Contenido) {

        try {
            JsonObject gson = new JsonObject();

            try (FileWriter fileWriter = new FileWriter(ruta + archivo + ".json")) {
                fileWriter.write(Contenido.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(JsonFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
