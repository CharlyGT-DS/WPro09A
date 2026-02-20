/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERFIL;

import estructuras.RespuestaTareaSubRegion;
import estructuras.RespuestaWSLicencias;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import redis.clients.jedis.Jedis;
import EJB.DBaseLocal;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import estructuras.GEnericaCincoCampos;
import estructuras.PefilInab;
import estructuras.RespuestaRegional;
import estructuras.RespuestaTareaRegional;
import estructuras.RespuestaTareaUsuario;
import java.lang.reflect.Type;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author csandoval
 */
@Stateless
@Named
public class FuncionesRedis implements Serializable, FuncionesRedisLocal{
    
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
  
    private DBaseLocal api;
    
    private Gson gson = new Gson();
    
    // constructor de la clase
    public FuncionesRedis(){
        try {
            InitialContext ctx = new InitialContext();
            this.api = (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
            
            this.ir =  (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
            
                   
            
        } catch (NamingException ex) {
            Logger.getLogger(FuncionesRedis.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    @Override
    public String verifica(String llaveSes){        
        System.out.println("llave perfil: "+llaveSes);
        Jedis JD =  ir.obtieneConeccionRedis();
        String json ="";
        
        if(JD.exists(llaveSes)){
        Map<String, String> datos = JD.hgetAll(llaveSes);
        json = datos.get("JSON-COMPLETO");
        ir.retornRecursoRedis(JD);   
        if(json ==null)
            json="{}";
        }else{
            json="{}";
        }
        return json;
    }

    @Override
    @Asynchronous
    public Future<String> insertaPerfil(String llave,String json) {
          String r="",envoltorio="";
          Jedis JD =  ir.obtieneConeccionRedis();          
          Map<String,String> tabla = new HashMap<>();
          tabla.put("JSON-COMPLETO", json);
          r= JD.hmset(llave,tabla);
          envoltorio="{\"resultado\":"+r+"}";
          ir.retornRecursoRedis(JD);
          return CompletableFuture.completedFuture(envoltorio);
    }
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscarUsuarioSubRegion(String idUsuario, estructuras.PefilInab per){
        try{
        String  json = UTILIDADES.JSON.consultaSubregionPorUsuario(idUsuario);
            String res = this.api.envarApiMMFNuevo(json,"http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");            
            RespuestaWSLicencias SubRegionUsuario = this.gson.fromJson(res, RespuestaWSLicencias.class);
            System.out.println("------------------------------------");
            System.out.println(SubRegionUsuario.getCarga_salida());
            System.out.println("------------------------------------");
            RespuestaTareaSubRegion subUsu = new RespuestaTareaSubRegion();
                subUsu =    this.gson.fromJson(SubRegionUsuario.getCarga_salida(), RespuestaTareaSubRegion.class);
            System.out.println("usuario_id :"+subUsu.getUsuarioId());
            per.setResUsIdSubRegion(subUsu);// carga el usario, perfil y subregion
        }catch(Exception es){
            System.out.println("data: "+es.getMessage());
        }
        
        
        return CompletableFuture.completedFuture(per);
    }
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaTecnicos( estructuras.PefilInab per, int idSubregion ){
        
           //obtiene los tecnicos de la subregion del usario conectado
            String   json = UTILIDADES.JSON.consultaTecnticosPorSubregion("getTecnicosPorSubregion",  idSubregion);
            System.out.println("tecnicos: "+json);
            
            String   res = this.api.envarApiMMFNuevo(json,"http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");   
            RespuestaWSLicencias SubRegionTecnicos = this.gson.fromJson(res, RespuestaWSLicencias.class);
            Type listType = new TypeToken<List<RespuestaTareaUsuario>>(){}.getType();
            per.setListTecnicos(this.gson.fromJson(SubRegionTecnicos.getCarga_salida(), listType));// carga la lista de técnicos                
         return CompletableFuture.completedFuture(per);
    }
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaRegional(estructuras.PefilInab per){
        
         //obtiene el de director regional del usuario conectado  solo existe un regional por cada subregion
          String  json = UTILIDADES.JSON.consultaTecnticosPorSubregion("getDirectorRegionalPorSubregion", 31);
          System.out.println("Json Jonatan **************  " + json);
          String  res = this.api.envarApiMMFNuevo(json, "http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");
            RespuestaWSLicencias diretoresRegionales =this.gson.fromJson(res, RespuestaWSLicencias.class);
             if (diretoresRegionales != null) {
                //RespuestaTareaRegional Regional = gson.fromJson(res.getCarga_salida(), RespuestaTareaRegional.class);
                RespuestaRegional Regional = gson.fromJson(diretoresRegionales.getCarga_salida(), RespuestaRegional.class);

                RespuestaTareaRegional rtr = new RespuestaTareaRegional();
                rtr.setSubregion(Regional.getSubregion());
                rtr.setUsuario(Regional.getUsuario());
                rtr.setUsuarioDesc(Regional.getUsuarioDesc());
                rtr.setUsuarioId(Regional.getUsuarioId());
                per.getListRegional().add(rtr);                            
             }
        
         return CompletableFuture.completedFuture(per);
    }
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaSubREgional(estructuras.PefilInab per){
        
             String  json = UTILIDADES.JSON.consultaTecnticosPorSubregion("getDirectorSubregionalPorSubregion", 31);
             String  res = this.api.envarApiMMFNuevo(json, "http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");
             RespuestaWSLicencias directorSubregionales =this.gson.fromJson(res, RespuestaWSLicencias.class);
             
             if (directorSubregionales != null) {
             RespuestaTareaRegional   subRegional = gson.fromJson(directorSubregionales.getCarga_salida(), RespuestaTareaRegional.class);

                RespuestaTareaRegional rtrs = new RespuestaTareaRegional();
                rtrs.setSubregion(subRegional.getSubregion());
                rtrs.setUsuario(subRegional.getUsuario());
                rtrs.setUsuarioDesc(subRegional.getUsuarioDesc());
                rtrs.setUsuarioId(subRegional.getUsuarioId());
                per.getListSubRegional().add(rtrs);
            }
        
        
        return CompletableFuture.completedFuture(per);
    }
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaLicencias(String idUsuario,estructuras.PefilInab per){
    
       String json = UTILIDADES.JSON.inicio(idUsuario, per.getResUsIdSubRegion().getPerfilId());
       System.out.println("licencias : "+json);
       String  res = this.api.envarApiMMFNuevo(json, "http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");
                RespuestaWSLicencias licenciasWS =this.gson.fromJson(res, RespuestaWSLicencias.class);
                if(licenciasWS.isResultado()){ // verifica que traiga licencias
                   Type listTypes = new TypeToken<List<estructuras.Licencias>>() {}.getType();
                   per.setLicencias(gson.fromJson(licenciasWS.getCarga_salida(), listTypes));// carga todas las licencias en caso sea un titular o elaborador que tenga licencias                   
                }        
         return CompletableFuture.completedFuture(per);
    }
    
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaUsuarioConectado(String idUsuario,estructuras.PefilInab per){
        
           String sql =UTILIDADES.SQL.obtieneTcUsuarioPorId(idUsuario,"tu"); //tc_usario
            System.out.println("esto debe correr 1:"+sql);
            tablas.MANEJO.TcUsuario tu =  (tablas.MANEJO.TcUsuario) this.api.repuestaApi( new tablas.MANEJO.TcUsuario(),"JSON", sql,"24.199.121.192");            
            per.setTcUsuario(tu);
            
            sql = UTILIDADES.SQL.obtieneTcUsuarioPorId(idUsuario,"tper"); // tc_perfil
            System.out.println("esto debe correr 2:"+sql);
            tablas.MANEJO.TcPerfil tper = (tablas.MANEJO.TcPerfil) this.api.repuestaApi(new tablas.MANEJO.TcPerfil(),"JSON",sql,"24.199.121.192"); 
            per.setTcPerfilConectado(tper);
        
         return CompletableFuture.completedFuture(per);
    }
    
    
    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaUsuario(String idUsuario,estructuras.PefilInab per){
            String sql="";
            /*
            String sql =UTILIDADES.SQL.obtieneTcUsuarioPorId(String.valueOf(per.getTcUsuario().getUsuarioId()),"tu"); //tc_usario
            System.out.println("esto debe correr 1:"+sql);
            tablas.MANEJO.TcUsuario tu =  (tablas.MANEJO.TcUsuario) this.api.repuestaApi( new tablas.MANEJO.TcUsuario(),"JSON", sql);            
            per.setTcUsuario(tu);
            */
        
            sql = UTILIDADES.SQL.obtieneTcUsuarioPorId(idUsuario,"tper"); // tc_perfil
            System.out.println("esto debe correr 2:"+sql);
            tablas.MANEJO.TcPerfil tper = (tablas.MANEJO.TcPerfil) this.api.repuestaApi(new tablas.MANEJO.TcPerfil(),"JSON",sql,"24.199.121.192"); 
            per.setTcPerfil(tper);
            
            sql =UTILIDADES.SQL.obtieneTcUsuarioPorId(idUsuario,"tp"); // tc_persona
            tablas.MANEJO.TcPersona tp = (tablas.MANEJO.TcPersona) this.api.repuestaApi(new tablas.MANEJO.TcPersona(),"JSON",sql,"24.199.121.192"); 
            per.setTcPersona(tp);
            
            sql = UTILIDADES.SQL.obtieneTcUsuarioPorId(idUsuario,"sb");
            tablas.MANEJO.TcSubregion sb = (tablas.MANEJO.TcSubregion)  this.api.repuestaApi(new tablas.MANEJO.TcSubregion(),"JSON",sql,"24.199.121.192"); 
            per.setTcSubregion(sb);
            
            return CompletableFuture.completedFuture(per);
    }

    @Override
    @Asynchronous
    public Future<estructuras.PefilInab> buscaSubREgional(estructuras.PefilInab per,String idSubregion){
        
             String  json = UTILIDADES.JSON.consultaTecnticosPorSubregion("getDirectorSubregionalPorSubregion", Integer.parseInt(idSubregion.replaceAll(".0", "")));
             String  res = this.api.envarApiMMFNuevo(json, "http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");
             RespuestaWSLicencias directorSubregionales =this.gson.fromJson(res, RespuestaWSLicencias.class);
             
             if (directorSubregionales != null) {
             RespuestaTareaRegional   subRegional = gson.fromJson(directorSubregionales.getCarga_salida(), RespuestaTareaRegional.class);

                RespuestaTareaRegional rtrs = new RespuestaTareaRegional();
                rtrs.setSubregion(subRegional.getSubregion());
                rtrs.setUsuario(subRegional.getUsuario());
                rtrs.setUsuarioDesc(subRegional.getUsuarioDesc());
                rtrs.setUsuarioId(subRegional.getUsuarioId());
                rtrs.setUsuarioId(subRegional.getUsuarioId());
                per.getListSubRegional().add(rtrs);
            }
        
        
        return CompletableFuture.completedFuture(per);
    }
    
    @Override
    @Asynchronous
    public Future<GEnericaCincoCampos> registraDatos(String sql){          
         GEnericaCincoCampos cinco =  (GEnericaCincoCampos) this.api.repuestaApi(new GEnericaCincoCampos(),"JSON", sql,"24.199.121.192");             
         
         return  CompletableFuture.completedFuture(cinco);
    }

    @Override
    public Future<PefilInab> buscaSecretariasSubRegional(PefilInab per, String idSubregion) {

             String  json = UTILIDADES.JSON.consultaTecnticosPorSubregion("getSecretariasPorSubregion", Integer.parseInt(idSubregion));
             String  res = this.api.envarApiMMFNuevo(json, "http://24.199.121.192/GeneraXMLProd/resources/javaee8/consultaDatos");
             RespuestaWSLicencias directorSubregionales =this.gson.fromJson(res, RespuestaWSLicencias.class);
             Type listType = new TypeToken<List<RespuestaTareaUsuario>>() {}.getType();
             if (directorSubregionales != null) {
             List<RespuestaTareaUsuario>   subSecretarias = gson.fromJson(directorSubregionales.getCarga_salida(), listType);

                for(RespuestaTareaUsuario s : subSecretarias){
                    RespuestaTareaUsuario rtrs = new RespuestaTareaUsuario();
                    rtrs.setSubregion(s.getSubregion());
                    rtrs.setUsuario(s.getUsuario());
                    rtrs.setUsuarioDesc(s.getUsuarioDesc());
                    rtrs.setUsuarioId(s.getUsuarioId());                
                    per.getListSecretarias().add(rtrs);
                }
                
            }
        
        
        return CompletableFuture.completedFuture(per);                        
    }
    
    
    
    
}// fin de la clase