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
import juridico.LIRE006;
import juridico.LIRE044;
import juridico.LIRE047;
import redis.clients.jedis.Jedis;
import solicitante.LIRE010;
import solicitante.LIRE042;
import subregional.LIRE009;
import subregional.LIRE045;
import subregional.LIRE046;
import tecnico.LIRE043;

/**
 *
 * @author csandoval
 */
@Local
public interface CargaDocumentosLocal {
    
    public Future<lire006.DocumentoInab> creaDocumento006(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE006.Elemento> enmiesdas, String noDictamen);

    public Future<lire009.DocumentoInab> creaDocumento009(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE009.Elemento> enmiesdas, String noOficio);
    
    public Future<lire010.DocumentoInab> creaDocumento010(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE010.Elemento> correcciones);
    
    public Future<lire022.DocumentoInab> creaDocumento022(RespuestaSeccionUNO ru, estructuras.PefilInab per);
    
    public Future<lire042.DocumentoInab> creaDocumento042(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE042.Elemento> elementos);

    public Future<lire043.DocumentoInab> creaDocumento043(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE043.Elemento> conclusiones, List<LIRE043.Elemento> decisiones, boolean validarDocumento, String noDictamen);
    
    public Future<lire044.DocumentoInab> creaDocumento044(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE044.Elemento> antecedentes, List<LIRE044.Elemento> fundamentos, List<LIRE044.Elemento> analisis, boolean validarDocumento, String noDictamen);

    public Future<lire045.DocumentoInab> creaDocumento045(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE045.Elemento> razones, String noOficio);

    public Future<lire046.DocumentoInab> creaDocumento046(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE046.Elemento> razones, String noOficio);
    
    public Future<lire047.DocumentoInab> creaDocumento047(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE047.Elemento> conclusiones, String noResolucion, boolean validarDocumento);
    
    public Future<String> creaXML006(PefilInab per, String proceso, String paso, String documento, lire006.DocumentoInab doc006);
    
    public Future<String> creaXML009(PefilInab per, String proceso, String paso, String documento, lire009.DocumentoInab doc009);
    
    public Future<String> creaXML10(PefilInab per, String proceso, String paso, String documento, lire010.DocumentoInab doc10);
    
    public Future<String> creaXML22(PefilInab per, String proceso, String paso, String documento, lire022.DocumentoInab doc22);
    
    public Future<String> creaXML42(PefilInab per, String proceso, String paso, String documento, lire042.DocumentoInab doc42);

    public Future<String> creaXML44(PefilInab per, String proceso, String paso, String documento, lire044.DocumentoInab doc44);
    
    public Future<String> creaXML43(PefilInab per, String proceso, String paso, String documento, lire043.DocumentoInab doc43);

    public Future<String> creaXML45(PefilInab per, String proceso, String paso, String documento, lire045.DocumentoInab doc45);
    
    public Future<String> creaXML46(PefilInab per, String proceso, String paso, String documento, lire046.DocumentoInab doc46);
    
    public Future<String> creaXML47(PefilInab per, String proceso, String paso, String documento, lire047.DocumentoInab doc47);

    public Future<String> creaXML79(PefilInab per, String proceso, String paso, String documento, lire079.DocumentoInab doc79);

    public Future<String> creaXML80(PefilInab per, String proceso, String paso, String documento, lire080.DocumentoInab doc80);

    public Future<String> creaXML81(PefilInab per, String proceso, String paso, String documento, lire081.DocumentoInab doc81);

    public Future<String> grabaXML006(String xml, lire006.DocumentoInab doc006);
    
    public Future<String> grabaXML009(String xml, lire009.DocumentoInab doc009);
    
    public Future<String> grabaXML10(String xml, lire010.DocumentoInab doc10);
    
    public Future<String> grabaXML22(String xml, lire022.DocumentoInab doc22);
    
    public Future<String> grabaXML42(String xml, lire042.DocumentoInab doc42);

    public Future<String> grabaXML43(String xml, lire043.DocumentoInab doc43);
    
    public Future<String> grabaXML44(String xml, lire044.DocumentoInab doc44);

    public Future<String> grabaXML45(String xml, lire045.DocumentoInab doc45);
    
    public Future<String> grabaXML46(String xml, lire046.DocumentoInab doc46);
    
    public Future<String> grabaXML47(String xml, lire047.DocumentoInab doc47);

    public Future<String> generarReporte(String index, String core, String param, String plantilla, String licencia);

    public Jedis obtieneRedis();

    public Future<String> grabaXML42Final(String xml, lire042.DocumentoInab doc48, String index);

    public void trazladaExpedinte(int idUsarioActual, int idUsuarioSiguiente, int tipo, int paso);

    public Future<String> grabaXML079(String xml, lire079.DocumentoInab doc079);

    public Future<String> grabaXML080(String xml, lire080.DocumentoInab doc080);

    public Future<String> grabaXML081(String xml, lire081.DocumentoInab doc081);

    public long ejecutarCadaMinuto();

    public Future<String> grabaPLANPorUsuarioID(String json, String expediente, long idUsuario);

}
