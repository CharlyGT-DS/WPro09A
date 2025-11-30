/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inab.pro.wpro09.resources;

import estructuras.HISTORICO.DocumentoInab;
import java.io.Serializable;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
public class CreaHistorico implements Serializable{
    
    
    public estructuras.HISTORICO.DocumentoInab agregaHistorico(estructuras.PefilInab per, Object documento, int tipoDoc){
        
        estructuras.HISTORICO.DocumentoInab r = new estructuras.HISTORICO.DocumentoInab(); // root documento
        estructuras.HISTORICO.DocumentoInab.Actual actual = new DocumentoInab.Actual();        
        
        if(tipoDoc==1){
        lire042.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire042.DocumentoInab.class);
        
        
        // CARGA actual documento 042
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 042 (Actualización al PLAN MF) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getSolicitudActualizacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getSolicitudActualizacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
        
        if(tipoDoc==2){
             lire080.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire080.DocumentoInab.class);               
            // CARGA actual documento 080
            actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
            actual.setIdUsuarioAnterior(0);
            actual.setIdUsuarioHistorico(0);
            actual.setEstado(1);
            actual.setEsquema(doc.getNombreEsquema());
            actual.setPaso(doc.getPaso());        
            actual.setExpediente(doc.getExpediente());
            actual.setDescripcion("Se creo la Recepción de documentos 080 (Actualización al PLAN MF) por:"+per.getTcUsuario().getUsuarioDesc());
            actual.setFecha(doc.getConstanciaRecepcion().getFechaDocumento());
            actual.setLicencia(doc.getLicencia());
            actual.setGestionId(doc.getIdGestion());
            actual.setPersonalizado("P2");
            actual.setProceso(doc.getProceso());
            String urlDoc = doc.getConstanciaRecepcion().getVisor().getVista().getRutaPdf();
            actual.setUrlDocumento(urlDoc);
            actual.setTipoAccion("Creado");
            actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
            r.setActual(actual);// carga el actual 
            
            
        }
        
         if(tipoDoc==3){
             lire079.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire079.DocumentoInab.class);               
            // CARGA actual documento 079
            actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
            actual.setIdUsuarioAnterior(0);
            actual.setIdUsuarioHistorico(0);
            actual.setEstado(1);
            actual.setEsquema(doc.getNombreEsquema());
            actual.setPaso(doc.getPaso());        
            actual.setExpediente(doc.getExpediente());
            actual.setDescripcion("Se creo la Recepción Incumplimiento 079 (Actualización al PLAN MF) por:"+per.getTcUsuario().getUsuarioDesc());
            actual.setFecha(doc.getNotificacionRequisitos().getFechaDocumento());
            actual.setLicencia(doc.getLicencia());
            actual.setGestionId(doc.getIdGestion());
            actual.setPersonalizado("P2");
            actual.setProceso(doc.getProceso());
            String urlDoc = doc.getNotificacionRequisitos().getVisor().getVista().getRutaPdf();
            actual.setUrlDocumento(urlDoc);
            actual.setTipoAccion("Creado");
            actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
            r.setActual(actual);// carga el actual 
            
            
        }
        
        
        return r;
    }
    
    
    public estructuras.HISTORICO.DocumentoInab.Historico.Items.Item creaRegistroItem( estructuras.HISTORICO.DocumentoInab actual, estructuras.PefilInab per){
        estructuras.HISTORICO.DocumentoInab.Historico.Items.Item item = new DocumentoInab.Historico.Items.Item();
        
        
        item.setCreador(per.getTcUsuario().getUsuarioDesc());
        item.setDescripcion(actual.getActual().getDescripcion());
        item.setDocumento(actual.getActual().getUrlDocumento());
        item.setEstadoItem("Finalizado");
        item.setExpediente(actual.getActual().getExpediente());
        item.setFechaEvento(actual.getActual().getFecha());
        item.setProceso(actual.getActual().getProceso());
        item.setGestionId(actual.getActual().getGestionId());
        item.setPaso(actual.getActual().getPaso());
        item.setLicencia(actual.getActual().getLicencia());
        item.setEstadoRegistro(actual.getActual().getUrlDocumento());
        item.setPerfilCreador(per.getTcPerfil().getPerfilDesc());
        item.setEstadoItem("1");
        
        
        
        return item;
    }
    
}
