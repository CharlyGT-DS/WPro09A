/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author csandoval
 */
public class ComunicarConReporteador implements  Serializable{
    
    
    public static String envioPostGenerarPDF(String index,String core, String xml, String plantilla,String licencia){
        String resultado="";
         try {
            // URL del endpoint donde quieres enviar el POST
            URL url = new URL("http://24.199.121.192/Report/reporte10.jsp");

            // Crear conexión
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            conn.setDoOutput(true);

            // Parámetros del formulario
            String parametros = "index=" + URLEncoder.encode(index, StandardCharsets.UTF_8.toString())
                               + "&core=" + URLEncoder.encode(core, StandardCharsets.UTF_8.toString())
                               + "&xml=" + URLEncoder.encode(xml, StandardCharsets.UTF_8.toString())
                               + "&plantilla=" + URLEncoder.encode(plantilla, StandardCharsets.UTF_8.toString())
                               + "&licencia=" + URLEncoder.encode(licencia, StandardCharsets.UTF_8.toString());
            System.out.println("parametros :"+parametros);
            // Enviar parámetros
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = parametros.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Leer respuesta
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder respuesta = new StringBuilder();
                String linea;
                while ((linea = br.readLine()) != null) {
                    respuesta.append(linea.trim());
                }
                System.out.println("Respuesta del servidor: " + respuesta.toString());
                resultado = respuesta.toString();
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    
    
}
