/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package PERFIL;

import estructuras.PefilInab;
import estructuras.RespuestaSeccionUNO;
import java.util.List;
import java.util.concurrent.Future;
import javax.ejb.Local;
import juridico.LIRE044;
import redis.clients.jedis.Jedis;
import solicitante.LIRE042;

/**
 *
 * @author csandoval
 */
@Local
public interface CargaDocumentosLocal {
    
      public Future<lire042.DocumentoInab> creaDocumento042(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE042.Elemento> elementos);
      
      public Future<lire042.DocumentoInab> creaDocumento044(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE044.Elemento> elementos);
    
      public Future<String> creaXML42(PefilInab per,String proceso, String paso, String documento,lire042.DocumentoInab doc42);
      
      public Future<String> creaXML44(PefilInab per,String proceso, String paso, String documento,lire044.DocumentoInab doc44);
      
      public Future<String> creaXML79(PefilInab per, String proceso, String paso, String documento, lire079.DocumentoInab doc79);
      
      public Future<String> creaXML80(PefilInab per,String proceso, String paso, String documento,lire080.DocumentoInab doc80);
      
      public Future<String> creaXML81(PefilInab per,String proceso, String paso, String documento,lire081.DocumentoInab doc81);
      
      public Future<String> grabaXML42(String xml,lire042.DocumentoInab doc42);
      
      public Future<String> generarReporte(String index, String core, String param, String plantilla, String licencia);
      
      public Jedis obtieneRedis();
      
      public Future<String> grabaXML42Final(String xml,lire042.DocumentoInab doc48,String index);
      
      public void trazladaExpedinte(int idUsarioActual,int idUsuarioSiguiente, int tipo, int paso );
      
      public Future<String> grabaXML079(String xml,lire079.DocumentoInab doc079);
      
      public Future<String> grabaXML080(String xml,lire080.DocumentoInab doc080);
      
      public Future<String> grabaXML081(String xml,lire081.DocumentoInab doc081);
      
      public long ejecutarCadaMinuto();
      
      public Future<String> grabaPLANPorUsuarioID(String json,String expediente,long idUsuario);
      
}
