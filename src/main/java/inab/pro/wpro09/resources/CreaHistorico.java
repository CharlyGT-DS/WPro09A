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
         
         if(tipoDoc==44){
        lire044.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire044.DocumentoInab.class);
        
        
        // CARGA actual documento 044
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 044 (Actualización al PLAN MF) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getDictamenJuridicoModificacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getDictamenJuridicoModificacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==6){
        lire006.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire006.DocumentoInab.class);
        
        
        // CARGA actual documento 006
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 006 (Dictamen Juridico Enmiendas) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getDictamenJuridicoEnmiendas().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getDictamenJuridicoEnmiendas().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==9){
        lire009.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire009.DocumentoInab.class);
        
        
        // CARGA actual documento 009
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 009 (Oficio Enmiendas) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getOficioEnmiendas().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getOficioEnmiendas().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==10){
        lire010.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire010.DocumentoInab.class);
        
        
        // CARGA actual documento 010
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 010 (Oficio Entrega Enmiendas) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getOficioEntregaEnmiendas().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getOficioEntregaEnmiendas().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==22){
        lire022.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire022.DocumentoInab.class);
        
        
        // CARGA actual documento 022
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 022 (Cedula de Notificacion) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getCedulaNotificacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getCedulaNotificacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==43){
        lire043.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire043.DocumentoInab.class);
        
        
        // CARGA actual documento 043
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 043 (Dictamen Tecnico Modificacion) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getDictamenTecnicoModificacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getDictamenTecnicoModificacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==45){
        lire045.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire045.DocumentoInab.class);
        
        
        // CARGA actual documento 045
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 045 (Oficio Aprobacion Modificacion) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getOficioAprobacionModificacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getOficioAprobacionModificacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==46){
        lire046.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire046.DocumentoInab.class);
        
        
        // CARGA actual documento 046
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 046 (Oficio Denegacion Modificacion) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getOficioDenegacionModificacion().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getOficioDenegacionModificacion().getVisor().getVista().getRutaPdf();
        actual.setUrlDocumento(urlDoc);
        actual.setTipoAccion("Creado");
        actual.setPersonalizado(per.getTcPersona().getPersonaDesc());
        r.setActual(actual);// carga el actual
        }
         
         if(tipoDoc==47){
        lire047.DocumentoInab doc =  UTILIDADES.FuncionesComunes.convierteObjeto(documento, lire047.DocumentoInab.class);
        
        
        // CARGA actual documento 047
        actual.setIdUsuarioActual(Integer.parseInt(String.valueOf(per.getTcUsuario().getUsuarioId())));
        actual.setIdUsuarioAnterior(0);
        actual.setIdUsuarioHistorico(0);
        actual.setEstado(1);
        actual.setEsquema(doc.getNombreEsquema());
        actual.setPaso(doc.getPaso());        
        actual.setExpediente(doc.getExpediente());
        actual.setDescripcion("Se creo la Solicitud 044 (Actualización al PLAN MF) por:"+per.getTcUsuario().getUsuarioDesc());
        actual.setFecha(doc.getResolucionModificacionPlan().getFechaDocumento());
        actual.setLicencia(doc.getLicencia());
        actual.setGestionId(doc.getIdGestion());
        actual.setPersonalizado("P1");
        actual.setProceso(doc.getProceso());
        String urlDoc = doc.getResolucionModificacionPlan().getVisor().getVista().getRutaPdf();
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
