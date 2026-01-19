/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package PERFIL;

import EJB.DBaseLocal;
import MANEJADORES.MHHome;
import com.google.gson.Gson;
import estructuras.GEnericaCincoCampos;
import estructuras.HISTORICO.DocumentoInab;
import estructuras.PefilInab;
import estructuras.RespuestaInsert;
import estructuras.RespuestaSeccionUNO;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import juridico.LIRE044;
import lire042.Asociados;
import redis.clients.jedis.Jedis;
import solicitante.LIRE042;

/**
 *
 * @author csandoval
 */
@Stateless
public class CargaDocumentos implements CargaDocumentosLocal, Serializable {  

    
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
    
    private DBaseLocal api;
    
    private transient Gson gs = new Gson();
    
     @Inject
     private MHHome mhome;
    
    
    
    public CargaDocumentos(){        
        try {
            InitialContext ctx = new InitialContext();
            this.api = (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
            
            this.ir =  (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
            
        } catch (NamingException ex) {
            Logger.getLogger(CargaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    @Override
    public Jedis obtieneRedis(){
        return ir.obtieneConeccionRedis();
    }
    
    @Asynchronous
    @Override
    public Future<lire042.DocumentoInab> creaDocumento042(RespuestaSeccionUNO ru, PefilInab per, List<LIRE042.Elemento> elementos) {
      String xml="";
      lire042.DocumentoInab doc42= UTILIDADES.FacadeData.crea042(ru,per,elementos);                      
      return  CompletableFuture.completedFuture(doc42);
    }
    
     @Asynchronous
     @Override
     public Future<String> creaXML42(PefilInab per,String proceso, String paso, String documento,lire042.DocumentoInab doc42){
        Jedis JD =  ir.obtieneConeccionRedis();
        String xml="";
        //long l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        long l =1;
        if(doc42.getEstado().compareTo("Finalizado")==0){            
            l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        }

        String id= doc42.getSolicitudActualizacion().getID();
        
        String nombrePDF="PRO-09-P-"+paso+"-DOC-"+l+"-"+id;
        
        lire042.Asociados.Vista vista = new Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc42.getLicencia()+"/documentos/"+doc42.getNombreEsquema().replaceAll(".xsd","")+"/"+nombrePDF+".pdf");                
        vista.setUrlDocumento(nombrePDF+".xml");
        Asociados as = new Asociados();        
        as = doc42.getSolicitudActualizacion().getVisor();      
        as.setVista(vista);
        doc42.getSolicitudActualizacion().setVisor(as);        
        xml=UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc42);        
        ir.retornRecursoRedis(JD);         
        
     return CompletableFuture.completedFuture(xml);
     }

    @Asynchronous
    @Override
    public Future<String> grabaXML42(String xml,lire042.DocumentoInab doc48) {
        String r="";
        
        String index = doc48.getSolicitudActualizacion().getVisor().getVista().getUrlDocumento();
        String core = doc48.getExpediente();        
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);
    }
    
      @Asynchronous
    @Override
    public Future<String> grabaXML079(String xml,lire079.DocumentoInab doc079) {
        String r="";
        
        String index = doc079.getNotificacionRequisitos().getVisor().getVista().getUrlDocumento();
        String core = doc079.getExpediente();
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);
    }
    
    @Asynchronous
    @Override
    public Future<String> grabaXML080(String xml,lire080.DocumentoInab doc080) {
        String r="";
        
        String index = doc080.getConstanciaRecepcion().getVisor().getVista().getUrlDocumento();
        String core = doc080.getExpediente();
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);
    }
    
    @Asynchronous
    @Override
    public Future<String> grabaXML081(String xml,lire081.DocumentoInab doc081) {
        String r="";
        
        String index = doc081.getProvidenciaTraslado().getVisor().getVista().getUrlDocumento();
        String core = doc081.getExpediente();
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);
    }
    
     @Asynchronous
    @Override
    public Future<String> grabaXML42Final(String xml,lire042.DocumentoInab doc48, String index) {
        String r="";
        
        
        String core = doc48.getExpediente();        
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);
    }

    @Asynchronous
    @Override
    public Future<String> generarReporte(String index, String core, String xml, String plantilla, String licencia) {
        String r="";
        r= UTILIDADES.ComunicarConReporteador.envioPostGenerarPDF(index, core, xml, plantilla, licencia);        
        return CompletableFuture.completedFuture(r);
    }
    
    
    @Asynchronous
    @Override 
    public void trazladaExpedinte(int idUsuarioActual,int idUsuarioSiguiente, int tipo , int paso){
        String tp="";
        if(tipo==3){
            tp="";
        }
        if(tipo==5){
           tp="A-";   
        }
        
        try {
            
            String llaveDestino ="EXP-ACTU-"+idUsuarioSiguiente; //destino
            String llaveOrigen  ="EXP-ACTU-"+tp+idUsuarioActual; // origen
            
            System.out.println("detino :"+llaveDestino);
            System.out.println("origen :"+llaveOrigen);
            
            Jedis JD =  ir.obtieneConeccionRedis();
            // copiar cola a los nuevos usuarios
            String ok = JD.rpoplpush(llaveOrigen, llaveDestino);
            System.out.println("OK :"+ok);
          
                if(JD.exists("EXP-ACTU-"+idUsuarioActual)){
                  JD.del("EXP-ACTU-"+idUsuarioActual);
                }
            
            
            // obtiene datos
            String datos =  JD.lindex(llaveDestino, 0);
            System.out.println("-------------------> "+datos);
            estructuras.HISTORICO.DocumentoInab doc = UTILIDADES.FuncionesComunes.fromXml(datos, estructuras.HISTORICO.DocumentoInab.class);
            // actualizar mysql cabecera
            String sql="";
            RespuestaInsert ri = new RespuestaInsert();
            if(ok!=null){
                // actualiza cabecera del workflow
                sql = UTILIDADES.SQL.actualizaTablaWorkFlow(doc, paso);
                System.out.println("SQL :"+ sql);
                ri = (RespuestaInsert)  this.api.repuestaApi(new RespuestaInsert(),"JSON", sql);
                if(ri.fila_afectada>0){
                    // consulta ultimo registro del detalle
                    sql = UTILIDADES.SQL.consultaDetalle(doc,idUsuarioSiguiente);
                    estructuras.GEnericaCincoCampos cinco    = (estructuras.GEnericaCincoCampos) this.api.
                            repuestaApi(new GEnericaCincoCampos(),"JSON", sql);
                    // inserta el siguiente paso
                    sql = UTILIDADES.SQL.insertaGestionDetalleGeneral(doc, idUsuarioSiguiente, cinco);
                    ri = (RespuestaInsert) this.api.repuestaApi(new RespuestaInsert(),"JSON", sql);
                    // actualiza finalizados  preparando para el bloqueo
                    if(ri.fila_afectada>0){
                         String llaveF = "EXP-ACTU-F-"+idUsuarioActual;
                        if(JD.exists(llaveF)){
                            String xmlFinalizado = JD.lindex(llaveF, 0);
                            doc =  UTILIDADES.FuncionesComunes.fromXml(xmlFinalizado, new DocumentoInab().getClass());
                            doc.getActual().setTipoAccion("Trazladado");
                            xmlFinalizado = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc);
                            // actualiza el estado del registro de finalizados
                            JD.lset(llaveF,0, xmlFinalizado);    
                        }
                    }
                    
                }// if de fila afectada
                
            }// fin del if ok
            
            
            ir.retornRecursoRedis(JD);    
        } catch (JAXBException ex) {
            Logger.getLogger(CargaDocumentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public Future<String> creaXML79(PefilInab per, String proceso, String paso, String documento, lire079.DocumentoInab doc79) {
        Jedis JD =  ir.obtieneConeccionRedis();
        String xml="";
        //long l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        long l =1;
        if(doc79.getEstado().compareTo("Finalizado")==0){            
            l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        }

        String id= doc79.getNotificacionRequisitos().getID();
        
        String nombrePDF="PRO-09-P-"+paso+"-DOC-"+l+"-"+id;
        
        lire079.Asociados.Vista vista = new lire079.Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc79.getLicencia()+"/documentos/"+doc79.getNombreEsquema().replace(".xsd", "")+"/"+nombrePDF+".pdf");                
        vista.setUrlDocumento(nombrePDF+".xml");
        lire079.Asociados as = new lire079.Asociados();        
        as = doc79.getNotificacionRequisitos().getVisor();
        as.setVista(vista);
        doc79.getNotificacionRequisitos().setVisor(as);        
        xml=UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc79);        
        ir.retornRecursoRedis(JD);                
      return CompletableFuture.completedFuture(xml);
    }

    @Override
    public Future<String> creaXML80(PefilInab per, String proceso, String paso, String documento, lire080.DocumentoInab doc80) {
        Jedis JD =  ir.obtieneConeccionRedis();
        String xml="";
        //long l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        long l =1;
        if(doc80.getEstado().compareTo("Finalizado")==0){            
            l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        }

        String id= doc80.getConstanciaRecepcion().getID();
        
        String nombrePDF="PRO-09-P-"+paso+"-DOC-"+l+"-"+id;
        
        lire080.Asociados.Vista vista = new lire080.Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc80.getLicencia()+"/documentos/"+doc80.getNombreEsquema().replace(".xsd", "")+"/"+nombrePDF+".pdf");                
        vista.setUrlDocumento(nombrePDF+".xml");
        lire080.Asociados as = new lire080.Asociados();        
        as = doc80.getConstanciaRecepcion().getVisor();
        as.setVista(vista);
        doc80.getConstanciaRecepcion().setVisor(as);        
        xml=UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc80);        
        ir.retornRecursoRedis(JD);                
      return CompletableFuture.completedFuture(xml);
    }
    
     @Override
    public Future<String> creaXML81(PefilInab per, String proceso, String paso, String documento, lire081.DocumentoInab doc81) {
        Jedis JD =  ir.obtieneConeccionRedis();
        String xml="";
        //long l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        long l =1;
        if(doc81.getEstado().compareTo("Finalizado")==0){            
            l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        }

        String id= doc81.getProvidenciaTraslado().getID();
        
        String nombrePDF="PRO-09-P-"+paso+"-DOC-"+l+"-"+id;
        
        lire081.Asociados.Vista vista = new lire081.Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc81.getLicencia()+"/documentos/"+doc81.getNombreEsquema().replace(".xsd", "")+"/"+nombrePDF+".pdf");                
        vista.setUrlDocumento(nombrePDF+".xml");
        lire081.Asociados as = new lire081.Asociados();        
        as = doc81.getProvidenciaTraslado().getVisor();
        as.setVista(vista);
        doc81.getProvidenciaTraslado().setVisor(as);        
        xml=UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc81);        
        ir.retornRecursoRedis(JD);                
      return CompletableFuture.completedFuture(xml);
    }


    
    @Override
    public long ejecutarCadaMinuto() {
        System.out.println("Ejecución automática cada minuto: " + new java.util.Date());
        Jedis JD =  ir.obtieneConeccionRedis();
          long l=0;
        int cc = Integer.parseInt(this.mhome.getRa());
        String llave="EXP-ACTU-"+cc;                
        if(JD.exists(llave)){            
          l =  JD.llen(llave);                                
        }else{            
            return 0;
        }
        
        ir.retornRecursoRedis(JD);
        return l;
    }

    @Override
    public Future<String> grabaPLANPorUsuarioID(String json,String expediente,long idUsuario) {
      
         String r="";        
         String index = "USU-"+idUsuario+".json";
         String core = expediente+"/plan";        
         r = this.api.enviarApiMMCoreJSON(json,1,core,index);        
        
         return CompletableFuture.completedFuture(r);
    }

    @Override
    public Future<String> creaXML44(PefilInab per, String proceso, String paso, String documento, lire044.DocumentoInab doc44) {
       
        Jedis JD =  ir.obtieneConeccionRedis();
        String xml="";
        //long l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        long l =1;
        if(doc44.getEstado().compareTo("Finalizado")==0){            
            l = JD.incrBy("D-"+proceso+"-"+paso+"-"+documento, 1);
        }
        
        String id= doc44.getDictamenJuridicoModificacion().getID();
        
        String nombrePDF="PRO-09-P-"+paso+"-DOC-"+l+"-"+id;
        
        lire044.Asociados.Vista vista = new lire044.Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc44.getLicencia()+"/documentos/"+doc44.getNombreEsquema().replaceAll(".xsd","")+"/"+nombrePDF+".pdf");                
        vista.setUrlDocumento(nombrePDF+".xml");
        lire044.Asociados as = new lire044.Asociados();        
        as = doc44.getDictamenJuridicoModificacion().getVisor();      
        as.setVista(vista);
        doc44.getDictamenJuridicoModificacion().setVisor(as);        
        xml=UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc44);        
        ir.retornRecursoRedis(JD);         
        
       
        return CompletableFuture.completedFuture(xml);
    }

    @Override
    public Future<lire044.DocumentoInab> creaDocumento044(RespuestaSeccionUNO ru, PefilInab per, List<LIRE044.Elemento> antecedentes, List<LIRE044.Elemento> fundamentos, List<LIRE044.Elemento> analisis) {
        String xml = "";
        lire044.DocumentoInab doc44 = UTILIDADES.FacadeData.crea044(ru, per, antecedentes, fundamentos, analisis);
        return CompletableFuture.completedFuture(doc44);
    }

    @Override
    public Future<String> grabaXML44(String xml, lire044.DocumentoInab doc44) {
    String r="";
        
        String index = doc44.getDictamenJuridicoModificacion().getVisor().getVista().getUrlDocumento();
        String core = doc44.getExpediente();        
        r = this.api.enviarApiMMCoreXML(xml,1,core,index);        
        
        return CompletableFuture.completedFuture(r);    
    }
  
    
    
    
}
