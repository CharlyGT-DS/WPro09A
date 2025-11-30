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
import secretaria.LIRE080;
import solicitante.LIRE042;
import secretaria.LIRE079;

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
    
    public static lire042.DocumentoInab crea042(RespuestaSeccionUNO ru, estructuras.PefilInab per,List<LIRE042.Elemento> elementos){       
        CreaDocumento crea = new CreaDocumento();        
        return crea.creaDoc(ru, per,elementos);
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
