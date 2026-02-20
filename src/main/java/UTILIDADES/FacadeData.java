/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import estructuras.GEnericaCincoCampos;
import estructuras.GenericoDos;
import estructuras.RespuestaSeccionUNO;
import estructuras.RespuestaTareaRegional;
import estructuras.RespuestaTareaUsuario;
import inab.pro.wpro09.resources.CreaDocumento;
import inab.pro.wpro09.resources.CreaHistorico;
import inab.pro.wpro09.resources.VerificaUsuario;
import java.util.List;
import juridico.LIRE006;
import juridico.LIRE044;
import juridico.LIRE047;
import secretaria.LIRE080;
import solicitante.LIRE042;
import secretaria.LIRE079;
import solicitante.LIRE010;
import subregional.LIRE009;
import subregional.LIRE045;
import subregional.LIRE046;
import tecnico.LIRE043;

/**
 *
 * @author csandoval
 * clase intermediaria
 */
public class FacadeData {
        
    public static GenericoDos buscaLicenciaAF(String lic){
         VerificaUsuario ver = new VerificaUsuario();
         return ver.buscaLicencia(lic);
    }
        
    public static GenericoDos  verificaUsuarioPorID(String idUsuario){
         VerificaUsuario ver = new VerificaUsuario();
         return ver.catalogoUsuarioPorId(idUsuario);
    }
    
    public static RespuestaSeccionUNO jsonLicencia(String gestionID){        
         VerificaUsuario ver = new VerificaUsuario();
         return ver.datosLicencias(gestionID);
    }
    
    public static lire006.DocumentoInab crea006(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE006.Elemento> enmiendas, String noDictamen){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc006(ru, per, enmiendas, noDictamen); 
    }
    
    public static lire009.DocumentoInab crea009(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE009.Elemento> enmiendas, String noOficio){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc009(ru, per, enmiendas, noOficio); 
    }
    
    public static lire010.DocumentoInab crea010(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE010.Elemento> correcciones){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc10(ru, per, correcciones);
    }
    
    public static lire022.DocumentoInab crea022(RespuestaSeccionUNO ru, estructuras.PefilInab per){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc22(ru, per);
    }
    
    public static lire042.DocumentoInab crea042(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE042.Elemento> elementos){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc(ru, per,elementos);
    }
    
    public static lire043.DocumentoInab crea043(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE043.Elemento> conclusiones,List<LIRE043.Elemento> decisiones, boolean validarDocumento, String noDictamen){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc43(ru, per, conclusiones, decisiones, validarDocumento, noDictamen); 
    }
    
    public static lire044.DocumentoInab crea044(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE044.Elemento> antecedentes,List<LIRE044.Elemento> fundamentos,List<LIRE044.Elemento> analisis, boolean validarDocumento, String noDictamen){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc44(ru, per, antecedentes, fundamentos, analisis, validarDocumento, noDictamen); 
    }
    
    public static lire045.DocumentoInab crea045(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE045.Elemento> razones, String noOficio){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc45(ru, per, razones, noOficio); 
    }
    
    public static lire046.DocumentoInab crea046(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE046.Elemento> razones, String noOficio){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc46(ru, per, razones, noOficio); 
    }
    
    public static lire047.DocumentoInab crea047(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE047.Elemento> conclusiones, String noResolucion, boolean validarDocumento){       
        CreaDocumento crea = new CreaDocumento();          
        return crea.creaDoc47(ru, per, conclusiones, noResolucion, validarDocumento); 
    }
    
    // para registrar historico 
    public static estructuras.HISTORICO.DocumentoInab creaHistorioData(estructuras.PefilInab per, Object documento, int tipoDoc){
        CreaHistorico chis = new CreaHistorico();
        return chis.agregaHistorico(per,documento, tipoDoc);
    }
    
    public static estructuras.HISTORICO.DocumentoInab.Historico.Items.Item agregarItem (estructuras.HISTORICO.DocumentoInab actual, estructuras.PefilInab per){
        CreaHistorico chis = new CreaHistorico(); 
        return chis.creaRegistroItem(actual, per);
    }
    
    public static lire079.DocumentoInab crea079(lire042.DocumentoInab doc042,List<LIRE079.Elemento> documentos, estructuras.PefilInab per){
            CreaDocumento crea = new CreaDocumento();  
           return  crea.creaDoc79(doc042, documentos, per);        
    }    
    
    public static lire080.DocumentoInab crea080(lire042.DocumentoInab doc042, List<java.util.LinkedHashMap> contactos ,GEnericaCincoCampos cinco,
            List<LIRE080.Elemento> elementos,List<LIRE080.Elemento> documentos, estructuras.PefilInab per){
            CreaDocumento crea = new CreaDocumento();  
           return  crea.creaDoc80(doc042, contactos, cinco, elementos, documentos, per);        
    }
    
      public static lire081.DocumentoInab crea081(lire042.DocumentoInab doc042 ,GEnericaCincoCampos cinco, estructuras.PefilInab per, String tec,String jur, String numeroProvidenia){
            CreaDocumento crea = new CreaDocumento();  
           return  crea.creaDoc81(doc042, cinco, per, tec, jur, numeroProvidenia );        
     }
    
    
    
}
