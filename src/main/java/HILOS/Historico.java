/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HILOS;

import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import estructuras.HISTORICO.DocumentoInab;
import estructuras.PefilInab;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
public class Historico extends Thread implements Serializable{

  private estructuras.HISTORICO.DocumentoInab his = new DocumentoInab();
  private estructuras.PefilInab per = new PefilInab();
  private Object documentoRegistrar = new Object();
  
  private transient Gson gs = new Gson();
  
  private Jedis JD=null;

    public Jedis getJD() {
        return JD;
    }

    public void setJD(Jedis JD) {
        this.JD = JD;
    }
     
  
    public DocumentoInab getHis() {
        return his;
    }

    public void setHis(DocumentoInab his) {
        this.his = his;
    }

    public PefilInab getPer() {
        return per;
    }

    public void setPer(PefilInab per) {
        this.per = per;
    }

    public Object getDocumentoRegistrar() {
        return documentoRegistrar;
    }

    public void setDocumentoRegistrar(Object documentoRegistrar) {
        this.documentoRegistrar = documentoRegistrar;
    }
          
    
  
  
  
  public void registrarHistorico() throws JAXBException{
      int tipoDoc=1;
      String name =documentoRegistrar.getClass().getCanonicalName();
      if(name.contains("lire080")){
         tipoDoc =2;
      }
      
      if(name.contains("lire079")){
          tipoDoc =3;
          System.out.println("entro a 079");
      }
      
      if(name.contains("lire044")){
          tipoDoc = 44;
          System.out.println("entro a 044");
      }
      
      if(name.contains("lire006")){
          tipoDoc = 6;
          System.out.println("entro a 006");
      }
      
      if(name.contains("lire009")){
          tipoDoc = 9;
          System.out.println("entro a 009");
      }
      
      if(name.contains("lire010")){
          tipoDoc = 10;
          System.out.println("entro a 010");
      }
      
      if(name.contains("lire022")){
          tipoDoc = 22;
          System.out.println("entro a 022");
      }
      
      if(name.contains("lire043")){
          tipoDoc = 43;
          System.out.println("entro a 043");
      }
      
      if(name.contains("lire045")){
          tipoDoc = 45;
          System.out.println("entro a 045");
      }
      
      if(name.contains("lire046")){
          tipoDoc = 46;
          System.out.println("entro a 046");
      }
      
      if(name.contains("lire047")){
          tipoDoc = 47;
          System.out.println("entro a 047");
      }
      
     his =   UTILIDADES.FacadeData.creaHistorioData(this.per,this.documentoRegistrar, tipoDoc);
     
     System.out.println("descripcion: "+his.getActual().getDescripcion());
     estructuras.HISTORICO.DocumentoInab.Historico valorHis = new estructuras.HISTORICO.DocumentoInab.Historico();
     estructuras.HISTORICO.DocumentoInab.Historico.Items lista = new DocumentoInab.Historico.Items();
     estructuras.HISTORICO.DocumentoInab.Historico.Items.Item item = new estructuras.HISTORICO.DocumentoInab.Historico.Items.Item();     
     item = UTILIDADES.FacadeData.agregarItem(his, per);     
     lista.getItem().add(item);
     int total = lista.getItem().size();
     lista.setTotalItems(total);
     his.setVersion(BigDecimal.ONE);
     his.setNombreEsquema("HISTORICO");
     his.setIDUsuario(String.valueOf(this.per.getTcUsuario().getUsuarioId()));
     valorHis.setItems(lista);
     his.setHistorico(valorHis);
     String llave  ="EXP-ITEM-EXPEDIENTE-"+item.getExpediente();
     String llave2 ="EXP-ACTU-"+this.per.getTcUsuario().getUsuarioId();
     String llave3 ="EXP-ACTU-F-"+this.per.getTcUsuario().getUsuarioId();
     
     String jsonItem="",jsonActual, xml="";
         his.getActual().setTipoAccion("En Proceso");
         jsonItem   = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(his); // convierte A XML
         jsonActual =  UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(his); // CONVIERTE A XML 
         xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(his);
         JD.rpush(llave, jsonItem);
         
         if(!(JD.exists(llave2))){          
               JD.lpush(llave2, xml);
               System.out.println("entro para crear :"+llave2);
         }
         
         /*else{
              System.out.println("entro para eliminar :"+llave2);
              long lk = JD.del(llave2);
              System.out.println("eliminao cola :"+lk);
         }*/
       
       
         
         if(JD.exists(llave3)){
             List<String> ls = JD.lrange(llave3,0, JD.llen(llave3));
             int i=0;
             for(String s : ls){
                 
             DocumentoInab his2 = UTILIDADES.FuncionesComunes.fromXml(s, estructuras.HISTORICO.DocumentoInab.class);
                 
             if((his2.getActual().getGestionId() == his.getActual().getGestionId()&&(his2.getActual().getPaso()==his.getActual().getPaso() )   )){
                 i=1;
                 
             }
             }
             if(i==0){
                 JD.lpush(llave3, jsonActual);  
             }
             
         }else{
            JD.lpush(llave3, jsonActual);  
         }
    
  }
  
  
    @Override
    public void run() {
      try {
          registrarHistorico();
      } catch (JAXBException ex) {
          Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
  


    
}
