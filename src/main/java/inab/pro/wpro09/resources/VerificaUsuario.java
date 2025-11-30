/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inab.pro.wpro09.resources;

import EJB.DBaseLocal;
import estructuras.GenericoDos;
import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import estructuras.RespuestaSeccionUNO;
import estructuras.RespuestaWSLicencias;
import estructuras.TransporteInab;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;

/**
 *
 * @author csandoval
 * Clase de servicio
 */

@Stateless
public class VerificaUsuario implements Serializable{
    
    
    private DBaseLocal api;
    private transient Gson gs = new Gson();
    
    public VerificaUsuario(){
        try{
            InitialContext ctx = new InitialContext();
            this.api =  (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
        
        }catch(Exception es){
            System.out.println("Error en el api :"+es.getMessage()); 
        }
    }
    
    
    public GenericoDos catalogoUsuarioPorId(String idUsuario){
              
      
      String sql= UTILIDADES.SQL.catalogoUsuarioPorId(idUsuario);
      GenericoDos perfilUsuario = new GenericoDos();
      perfilUsuario = (GenericoDos)  this.api.repuestaApi(perfilUsuario, "JSON", sql);
     
      return  perfilUsuario;
    }
    
    public GenericoDos buscaLicencia(String lic){
        
        String sql= UTILIDADES.SQL.buscarLicencia(lic);
        GenericoDos licenciaGestionID = new GenericoDos();
        licenciaGestionID = (GenericoDos)  this.api.repuestaApi(licenciaGestionID, "JSON", sql);
        return licenciaGestionID;
    }
    
    public RespuestaSeccionUNO datosLicencias(String gestionId){
        
        String json = UTILIDADES.JSON.seccionUno(gestionId);
         RespuestaSeccionUNO secUno= new RespuestaSeccionUNO();
        json =  this.api.envarApiMMFNuevo(json,"http://24.199.121.192/GeneraXMLDatosProd/resources/javaee8/informe_seccion1");
        
        RespuestaWSLicencias rs =  this.gs.fromJson(json, estructuras.RespuestaWSLicencias.class);
        String carga="";
        if(rs.isResultado()){ 
            System.out.println("aqui esta la licencia :"+rs.getCarga_salida());
            carga = rs.getCarga_salida();            
            secUno = this.gs.fromJson(carga, RespuestaSeccionUNO.class);            
        }else{
            
            FacesContext.getCurrentInstance().addMessage(null, 
                    this.api.creaMensajeError("No Existe esa Licencia con la GestionID: "+gestionId));
        }
        return secUno;
    }
    
    public String ejecutarPostBackOffice(String url, String token, String jsonRequest){
         String responseBody="";
         MediaType mediaType = MediaType.parse("application/json");
         RequestBody body = RequestBody.create(mediaType, jsonRequest);
         
          OkHttpClient client = new OkHttpClient();
          // Crear request POST
           Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization","Bearer "+token)
                .post(body)
                .build();
          
         try {
               
                Response response = client.newCall(request).execute();
                  if (response.isSuccessful() && response.body() != null) {
                // Leer el body en una variable String
                 responseBody = new String(response.body().bytes(), StandardCharsets.UTF_8);
                // responseBody = response.body().string();
                 System.out.println("Respuesta:\n" + responseBody);
                
                // Ahora responseBody contiene todo el contenido de la respuesta
                } else {
                    System.out.println("Error en la petición: " + response.code());
                }

         } catch (IOException e) {
            e.printStackTrace();
         }

        
        
         return responseBody;
    }
    
    public String obtienePlan(int gestionId, String token){
        
          String responseBody="";
         OkHttpClient client = new OkHttpClient();

        String url = "http://localhost:8081/gestion/"+gestionId+"/cronograma";

        // Crear request GET
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization","Bearer "+token)
                .get()
                .build();

        try {
               
                Response response = client.newCall(request).execute();
                
                 
                 
            if (response.isSuccessful() && response.body() != null) {
                // Leer el body en una variable String
                 responseBody = new String(response.body().bytes(), StandardCharsets.UTF_8);
                // responseBody = response.body().string();
                 System.out.println("Respuesta:\n" + responseBody);
                
                // Ahora responseBody contiene todo el contenido de la respuesta
            } else {
                System.out.println("Error en la petición: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        return responseBody;

        
    }
    
    
    
}
