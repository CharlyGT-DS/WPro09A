/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inab.pro.wpro09.resources;

import dta.json.plan.Propietario;
import estructuras.GEnericaCincoCampos;
import estructuras.RespuestaSeccionUNO;
import estructuras.RespuestaTareaRegional;
import estructuras.RespuestaTareaUsuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import juridico.LIRE006;
import juridico.LIRE044;
import juridico.LIRE047;
import lire042.Asociados;
import lire042.Asociados.Firmantes.Firma;
import lire042.DocumentoInab;
import lire080.DocumentoInab.ConstanciaRecepcion.Generales.Nombres;
import secretaria.LIRE080;
import secretaria.LIRE079;
import solicitante.LIRE010;
import solicitante.LIRE042;
import solicitante.LIRE042.Elemento;
import subregional.LIRE009;
import subregional.LIRE045;
import subregional.LIRE046;
import tecnico.LIRE043;

/**
 *
 * @author csandoval
 */
public class CreaDocumento implements Serializable{
    
    
    
    public lire079.DocumentoInab creaDoc79(lire042.DocumentoInab doc042,List<LIRE079.Elemento> documentos, estructuras.PefilInab per){
      
        lire079.DocumentoInab doc079 = new lire079.DocumentoInab();
        lire079.DocumentoInab.NotificacionRequisitos noti = new lire079.DocumentoInab.NotificacionRequisitos();      
        lire079.DocumentoInab.NotificacionRequisitos.Contenido contenido = new lire079.DocumentoInab.NotificacionRequisitos.Contenido();
        lire079.DocumentoInab.NotificacionRequisitos.Items items = new lire079.DocumentoInab.NotificacionRequisitos.Items();
        
        //atributos nodo principal
        doc079.setEstado("Activo");
        doc079.setExpediente(doc042.getExpediente());
        doc079.setLicencia(doc042.getLicencia());
        doc079.setIdGestion(doc042.getIdGestion());
        doc079.setNombreEsquema("LI-RE-079.xsd");
        doc079.setOrden("1");
        doc079.setProceso("PROC9");
        doc079.setPaso("PASO2");
        doc079.setVersion(BigDecimal.ONE);
     
        
        // notificacion atributos
        noti.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        noti.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(doc042.getIdGestion())));
        noti.setTipoDocumento(1);
        
        // contenido
        contenido.setDireccionSubregional(doc042.getSolicitudActualizacion().getGeneral().getDireccionSedeInab());
        contenido.setExpediente(doc042.getExpediente());
        contenido.setLicencia(doc042.getLicencia());
        contenido.setFechaNotificacion(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        contenido.setResolucion("consultar");

        
        // items
        
        items.setTotal(documentos.size());
        
        int i=1;
        for(LIRE079.Elemento s : documentos){
             lire079.DocumentoInab.NotificacionRequisitos.Items.Item item = new lire079.DocumentoInab.NotificacionRequisitos.Items.Item();
             item.setOrden(i);
             item.setValue(s.getValor());
             i=i+1;
             items.getItem().add(item);
        }
        
  
        
        lire079.Asociados asoc = new lire079.Asociados();
        
        lire079.Asociados.Vista vista = new lire079.Asociados.Vista();
        vista.setRutaPdf("/home/server/pdf/licencia/"+doc042.getLicencia()+"/documentos/"+doc079.getNombreEsquema().replaceAll(".xsd","")+"/PRO-09-P-P2-DOC-1-"+noti.getID()+".pdf");
        vista.setUrlDocumento("PRO-09-P-P2-DOC-1-"+noti.getID()+".xml");
        vista.setPasoSiguiente("PASO3");
        vista.setPasoActual("PASO2");
        vista.setPasoAnterior("PASO1");
        vista.setIP("24.199.121.192");
        
   
        
        lire079.Asociados.Firmantes firmas = new lire079.Asociados.Firmantes();
        firmas.setTotal(1);
        lire079.Asociados.Firmantes.Firma firma = new lire079.Asociados.Firmantes.Firma();
        firma.setIdUsuario(Integer.parseInt(per.getTcUsuario().getUsuarioId().toString()));
        firma.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // se agrega la firma
        firmas.getFirma().add(firma);
         
        // se agrega vista y firmas
        asoc.setFirmantes(firmas);
        asoc.setVista(vista);
        
    
        
        // noti se agrega asoc el visor
        noti.setVisor(asoc);
        // se agrega contenido
        noti.setContenido(contenido);
        // se aregan items
        noti.setItems(items);
        // se agrega a documetno 079
        doc079.setNotificacionRequisitos(noti);
   
        
        
      return doc079;    
    }
    
     public lire081.DocumentoInab creaDoc81(lire042.DocumentoInab doc042 ,GEnericaCincoCampos cinco, estructuras.PefilInab per,
                                            String tec,String jur,
                                            String numeroProvidenia){
         
         lire081.DocumentoInab doc081 = new lire081.DocumentoInab();
         lire081.DocumentoInab.ProvidenciaTraslado.Providencia provi = new lire081.DocumentoInab.ProvidenciaTraslado.Providencia();
         lire081.DocumentoInab.ProvidenciaTraslado.Encabezado enabezado = new lire081.DocumentoInab.ProvidenciaTraslado.Encabezado();
         lire081.DocumentoInab.ProvidenciaTraslado.Asunto asunto = new lire081.DocumentoInab.ProvidenciaTraslado.Asunto();
          lire081.DocumentoInab.ProvidenciaTraslado tprov = new lire081.DocumentoInab.ProvidenciaTraslado();
         
         doc081.setEstado("Activo");
         doc081.setExpediente(doc042.getExpediente());
         doc081.setIdGestion(String.valueOf(doc042.getIdGestion()));
         doc081.setLicencia(doc042.getLicencia());
         doc081.setNombreEsquema("LI-RE-081.xsd");
         doc081.setOrden("1");
         doc081.setPaso("PASO3");
         doc081.setProceso("PROC9");
         doc081.setVersion(BigDecimal.ONE);
         
         System.out.println("paso atributos");
         // providencia
         tprov.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(doc042.getIdGestion())));
         tprov.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
         tprov.setTipoDocumento(1);
         
           System.out.println("paso rpovidencia");
         
         // encabezado
         enabezado.setDepartamento(cinco.getDato4().toString());
         enabezado.setMunicipio(cinco.getDato3().toString());
         enabezado.setDireccionSubregional(doc042.getSolicitudActualizacion().getGeneral().getDireccionSedeInab());
         enabezado.setNumeroExpediente(doc042.getExpediente());
         tprov.setEncabezado(enabezado);
         
             System.out.println("paso encabezado");
         //asunto
         asunto.setDepartamentoFinca(cinco.getDato4().toString());
         asunto.setDireccionFinca(cinco.getDato1().toString());
         asunto.setMunicipioFinca(cinco.getDato3().toString());
         asunto.setLicencia(doc042.getLicencia());
         asunto.setTitular(doc042.getSolicitudActualizacion().getVisor().getFirmantes().getFirma().get(1).getNombreQuienFirma());
         tprov.setAsunto(asunto);
         
             System.out.println("paso asunto");
         
         //providencia
         provi.setNombreDirectorSubregional(per.getListSubRegional().get(0).getUsuarioDesc());
         provi.setNombreJuridico(jur);
         provi.setNombreTenico(tec);
         provi.setNumeroFolios(3);
         provi.setNumeroProvidencia(String.valueOf(numeroProvidenia));
         
          lire081.Asociados asoc = new lire081.Asociados();
          
              System.out.println("paso providencia completa");
          
          // vista
          lire081.Asociados.Vista vista = new lire081.Asociados.Vista();
          vista.setPasoActual("PASO3");
          vista.setPasoAnterior("PASO2");
          vista.setPasoSiguiente("APSO4");
          vista.setRutaPdf("/home/server/pdf/licencia/"+doc042.getLicencia()+"/documentos/"+doc081.getNombreEsquema().replaceAll(".xsd","")+"/PRO-09-P-P3-DOC-1-"+tprov.getID()+".pdf");
          vista.setUrlDocumento("PRO-09-P-P3-DOC-1-"+tprov.getID()+".xml");
         
              System.out.println("paso vista");
          
          asoc.setVista(vista);
           lire081.Asociados.Firmantes firmantes = new lire081.Asociados.Firmantes();
           lire081.Asociados.Firmantes.Firma firma = new lire081.Asociados.Firmantes.Firma();
           firma.setIdUsuario(Integer.parseInt(per.getTcUsuario().getUsuarioId().toString()));
           firma.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
           
           firmantes.setTotal(1);
           firmantes.getFirma().add(firma);
           asoc.setFirmantes(firmantes);
          
          // firmantes
          
          
         tprov.setVisor(asoc);
         tprov.setProvidencia(provi);
         doc081.setProvidenciaTraslado(tprov);
         
         
         
         
         
         
         
         
         return doc081;
     }
    
    public lire080.DocumentoInab creaDoc80(lire042.DocumentoInab doc042, List<java.util.LinkedHashMap> contactos ,GEnericaCincoCampos cinco,
            List<LIRE080.Elemento> elementos,List<LIRE080.Elemento> documentos, estructuras.PefilInab per){
        
        lire080.DocumentoInab doc080 = new lire080.DocumentoInab();
          
                // seteando atributos generales
                doc080.setEstado("Activo");
                doc080.setNombreEsquema("LI-RE-080.xsd");
                doc080.setExpediente(doc042.getExpediente());
                doc080.setIdGestion(doc042.getIdGestion());
                doc080.setOrden("1");
                doc080.setVersion(BigDecimal.ONE);
                doc080.setLicencia(doc042.getLicencia());
                doc080.setPaso("PASO2");
                doc080.setProceso("PROC9");
                
                lire080.DocumentoInab.ConstanciaRecepcion  constancia = new lire080.DocumentoInab.ConstanciaRecepcion();
                // atributos
                constancia.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(doc042.getIdGestion())));
                Date fechaDocumento = new Date();
                constancia.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(fechaDocumento));
                constancia.setTipoDocumento(1);
                
                //objeto cinco
                //es el obtjeto que contiene todo los datos adicionales que se pide en la pantalla
                //dato1 licenciasubsiguiente
                //dato2 numero de recepcion
                //dato3 numero de folios
                
                //encabezado
                lire080.DocumentoInab.ConstanciaRecepcion.Encabezado encabezado = new lire080.DocumentoInab.ConstanciaRecepcion.Encabezado();
                encabezado.setDirecionSubregional(doc042.getSolicitudActualizacion().getGeneral().getDireccionSedeInab());
                encabezado.setLicencia(doc042.getLicencia());
                encabezado.setLicenciaSubsiguiente(cinco.getDato1().toString());
                encabezado.setNumeroDeRecepcion(Integer.parseInt(cinco.getDato2().toString().replaceAll(".0","")));
                constancia.setEncabezado(encabezado);// carga encabezado
                
                
                //GEnerales
                lire080.DocumentoInab.ConstanciaRecepcion.Generales generales = new lire080.DocumentoInab.ConstanciaRecepcion.Generales();
                generales.setLugar(doc042.getSolicitudActualizacion().getGeneral().getDireccionSedeInab());
                generales.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(fechaDocumento));
                generales.setNumeroDeFoliosEntregados(Integer.parseInt(cinco.getDato3().toString().replaceAll(".0","")));
               
               
                // carga todos los nombres de quienes solicitan
                Nombres n =new Nombres();
                for(Firma s: doc042.getSolicitudActualizacion().getVisor().getFirmantes().getFirma()){                    
                    n.getNombre().add(s.getNombreQuienFirma());
                }                                             
                generales.setNombres(n);
                constancia.setGenerales(generales);//carga generales
                 
                                System.out.println("crea   n1");

                // carga los datos de notificacion
                lire080.DocumentoInab.ConstanciaRecepcion.Notificacion noti = new lire080.DocumentoInab.ConstanciaRecepcion.Notificacion();                
                
                noti.setDireccionDomiciliar(contactos.get(0).get("valor").toString());
                noti.setTelefono(contactos.get(1).get("valor").toString());
                
                                 System.out.println("crea   n1.4");

                noti.setCelular(contactos.get(2).get("valor").toString());
                noti.setCorreoElectronico(contactos.get(3).get("valor").toString());
                constancia.setNotificacion(noti);// carga notificacion
                                
                //aprovechamiento
                lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento aprove = new lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento();
                lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items items = new lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items();
                 System.out.println("crea   n1.5");
                int i=1;
                for(LIRE080.Elemento  es: elementos){
                    lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item item = new lire080.DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item();
                    item.setCod(i);
                    item.setDescricionGestion(es.getValor());                    
                    i=i+1;
                    items.getItem().add(item);
                }
                aprove.setItems(items);
                constancia.setAprovechamiento(aprove);// carga aprovechamiento
                  System.out.println("crea   n2");
                //documentos
                lire080.DocumentoInab.ConstanciaRecepcion.Documentos docus = new lire080.DocumentoInab.ConstanciaRecepcion.Documentos();
                
                int total = documentos.size()+1;
                docus.setTotal(total);
                lire080.DocumentoInab.ConstanciaRecepcion.Documentos.Documento tempDoc =null;
                
                
                int id =1;
                 docus.getDocumento().clear();
                for(LIRE080.Elemento dc : documentos){
                    tempDoc = new lire080.DocumentoInab.ConstanciaRecepcion.Documentos.Documento();
                    
                    tempDoc.setOrden(id);
                    tempDoc.setValue(dc.getValor());
                    id=id+1;
                    docus.getDocumento().add(tempDoc);
                }              
               
                
                constancia.setDocumentos(docus);// carga documentos
                
                
                // vista
                lire080.Asociados.Vista vista = new lire080.Asociados.Vista();
                
                vista.setPasoSiguiente("PASO3");
                vista.setPasoActual("PASO2");
                vista.setPasoAnterior("PASO1");
                String rutaPDF="/home/server/pdf/licencia/"+doc042.getLicencia()+"/documentos/"+doc080.getNombreEsquema().replaceAll(".xsd","")+"/PRO-09-P-P2-DOC-1-"+constancia.getID()+".pdf";
                vista.setRutaPdf(rutaPDF);
                String urlDocumento = "PRO-09-P-P2-DOC-1-"+constancia.getID()+".xml";
                vista.setUrlDocumento(urlDocumento);
                 
                // firmantes                
                lire080.Asociados.Firmantes firmantes = new lire080.Asociados.Firmantes();                
                firmantes.setTotal(1);
                lire080.Asociados.Firmantes.Firma firma = new lire080.Asociados.Firmantes.Firma();
                firma.setIdUsuario(Integer.parseInt(per.getTcUsuario().getUsuarioId().toString()));
                firma.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());                
                firmantes.getFirma().add(firma);
                lire080.Asociados asoc = new lire080.Asociados();
                
                asoc.setFirmantes(firmantes);
                asoc.setVista(vista);
                constancia.setVisor(asoc);
                doc080.setConstanciaRecepcion(constancia);// carga todos los datos al roo principal
                        
        
        return doc080;
    }
    
    public lire042.DocumentoInab creaDoc(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE042.Elemento> elementos){
        
        // atributos del documento 048 no master (DcoumentoInab)
        lire042.DocumentoInab doc42 = new DocumentoInab();
        doc42.setVersion(BigDecimal.ONE);
        doc42.setExpediente("LI-RE-048.xsd");
        doc42.setEstado("Activo");
        doc42.setOrden("1");
        doc42.setProceso("PROC9");
        doc42.setPaso("PASO1");
        doc42.setIdGestion(per.getLicencia().getGestion_id());
        doc42.setExpediente(per.getLicencia().getExpediente());
        doc42.setLicencia(ru.getNumero_licencia_poa());
        doc42.setNombreEsquema("LI-RE-042.xsd");
        
        
        // nodo secundario (SolicitudActualizacion)
        lire042.DocumentoInab.SolicitudActualizacion SAC = new DocumentoInab.SolicitudActualizacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        
        // nodo General
        lire042.DocumentoInab.SolicitudActualizacion.General gen = new DocumentoInab.SolicitudActualizacion.General();
        gen.setTituloDocumento("SOLICITUD DE MODIFICACIÓN DEL PLAN DE MANEJO FORESTAL");
        gen.setFechaSolicitud(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        gen.setNombreSubregional(per.getListSubRegional().get(0).getUsuarioDesc());
        gen.setDireccionSedeInab(per.getTcSubregion().getDireccion() +" - "+per.getTcSubregion().getSubregionDesc()+" - "+per.getTcSubregion().getAlias());
        
        // nodo Contenido
        lire042.DocumentoInab.SolicitudActualizacion.Contenido con = new DocumentoInab.SolicitudActualizacion.Contenido();
        con.setLicencia(per.getLicencia().getNumero_licencia_poa());
        con.setResolucion("consulta donde esta en la base");
        con.setExpediente(per.getLicencia().getExpediente());
        
        // nodo modifiaciones carga todos los detalles
        int total_modificaciones = elementos.size();
        lire042.DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones mod = new DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones();
        mod.setTotalModificaciones(total_modificaciones);
        int i=1;
        for(Elemento el : elementos){
            lire042.DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle de = new DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle();
            de.setOrden(i);
            de.setValue(el.getValor());
            mod.getDetalle().add(de);
            i=i+1;            
        }
        
        con.setModificaciones(mod);// carga modificaciones
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire042.Asociados.Firmantes.Firma firma1 = new Asociados.Firmantes.Firma();
        Long id= per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIDUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire042.Asociados.Firmantes.Firma firma2 = new Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(ru.getTitulares().get(0).getPersona_desc());
        firma2.setIDUsuario(ru.getTitulares().get(0).getTipo_propietario_id()); // pendiente este id
        
        lire042.Asociados.Firmantes firmas = new lire042.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotal(firmas.getTotal());
        
        lire042.Asociados asoc = new Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setGeneral(gen);    // carga general
        SAC.setContenido(con);  // carga contenido
        SAC.setVisor(asoc);// carga los asociados        
        doc42.setSolicitudActualizacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc42;
    }
    
    public lire009.DocumentoInab creaDoc009(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE009.Elemento> enmiendas, String noOficio){
        
        // atributos del documento 046 no master (DcoumentoInab)
        lire009.DocumentoInab doc009 = new lire009.DocumentoInab();
        doc009.setVersion(new BigDecimal("1.0"));
        doc009.setNombreEsquema("LI-RE-009.xsd");
        doc009.setEstado("Activo");
        doc009.setOrden("1");
        doc009.setProceso("PROC9");
        doc009.setPaso("PASO6");
        doc009.setIdGestion(per.getLicencia().getGestion_id());
        doc009.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc009.setLicencia("LI-RE-009-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire009.DocumentoInab.OficioEnmiendas SAC = new lire009.DocumentoInab.OficioEnmiendas();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        // nodo encabezado
        lire009.DocumentoInab.OficioEnmiendas.Encabezado en = new lire009.DocumentoInab.OficioEnmiendas.Encabezado();
        en.setNumeroOficio(noOficio);
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        //lista de SOLICITANTES en el encabezado
        ArrayList<Propietario> solicitantes = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_solicitantes = solicitantes.size();
        lire009.DocumentoInab.OficioEnmiendas.Encabezado.Solicitantes sol = new lire009.DocumentoInab.OficioEnmiendas.Encabezado.Solicitantes();
        sol.setTotalSolicitantes(total_solicitantes);
        int s=1;
        for(Propietario el : solicitantes){
            lire009.DocumentoInab.OficioEnmiendas.Encabezado.Solicitantes.Solicitante  solD = new lire009.DocumentoInab.OficioEnmiendas.Encabezado.Solicitantes.Solicitante();
            solD.setOrdenSolicitantes(s);
            solD.setValue(el.getTcPersona().getPersonaDesc());
            sol.getSolicitante().add(solD);
            s=s+1;            
        }
        en.setSolicitantes(sol);
        en.setNombreElaborador("Persona que elabora");
        
        // nodo Asunto
        lire009.DocumentoInab.OficioEnmiendas.Asunto as = new lire009.DocumentoInab.OficioEnmiendas.Asunto();
        as.setNumeroLicencia("LI-RE-009-2026");
        as.setNumeroExpediente("po-2026045");
        as.setNombreTecnicoForestal("Luis Ortega");
        as.setNombreDelegadoJuridico("Pedro Lopez");
       
        
        //nodo Cierre Oficio
        lire009.DocumentoInab.OficioEnmiendas.CierreOficio ci = new lire009.DocumentoInab.OficioEnmiendas.CierreOficio();
        // conclusiones - detalles
        int total_enmiendas = enmiendas.size();
        lire009.DocumentoInab.OficioEnmiendas.CierreOficio.Enmiendas cns = new lire009.DocumentoInab.OficioEnmiendas.CierreOficio.Enmiendas();
        cns.setTotalEnmiendas(total_enmiendas);
        int c=1;
        for(LIRE009.Elemento el : enmiendas){
            lire009.DocumentoInab.OficioEnmiendas.CierreOficio.Enmiendas.Enmienda cn = new lire009.DocumentoInab.OficioEnmiendas.CierreOficio.Enmiendas.Enmienda();
            cn.setOrdenEnmiendas(c);
            cn.setValue(el.getValor());
            cns.getEnmienda().add(cn);
            c=c+1;            
        }
        ci.setEnmiendas(cns);
        ci.setDirectorSubregional(per.getListaTcUsuario().get(0).getUsuarioDesc());
        ci.setObservaciones("");
        
        
//        con.setModificaciones(mod);// carga modificaciones
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire009.Asociados.Firmantes.Firma firma1 = new lire009.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire009.Asociados.Firmantes.Firma firma2 = new lire009.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire009.Asociados.Firmantes firmas = new lire009.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire009.Asociados asoc = new lire009.Asociados();
        asoc.setFirmantes(firmas);
        
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setAsunto(as);  // carga asunto
        SAC.setCierreOficio(ci); // carga cierre oficio
        SAC.setVisor(asoc);// carga los asociados        
        doc009.setOficioEnmiendas(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc009;
    }
    
    public lire006.DocumentoInab creaDoc006(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE006.Elemento> enmiendas, String noDictamen){
        
        // atributos del documento 006 no master (DcoumentoInab)
        lire006.DocumentoInab doc006 = new lire006.DocumentoInab();
        doc006.setVersion(new BigDecimal("1.0"));
        doc006.setNombreEsquema("LI-RE-006.xsd");
        doc006.setEstado("Activo");
        doc006.setOrden("1");
        doc006.setProceso("PROC9");
        doc006.setPaso("PASO6");
        doc006.setIdGestion(per.getLicencia().getGestion_id());
        doc006.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc006.setLicencia("LI-RE-006-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire006.DocumentoInab.DictamenJuridicoEnmiendas SAC = new lire006.DocumentoInab.DictamenJuridicoEnmiendas();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        // nodo encabezado
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.Encabezado en = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Encabezado();
        en.setNumeroDictamen(noDictamen);
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setDirectorSubregional(per.getListaTcUsuario().get(0).getUsuarioDesc());
        en.setMunicipioEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc());
        en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        en.setDireccionSede(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                            per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        
        
        //lista de SOLICITANTES - nodo solicitantes
        ArrayList<Propietario> solicitantes = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_solicitantes = solicitantes.size();
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes sol = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes();
        sol.setTotalSolicitantes(total_solicitantes);
        int s=1;
        for(Propietario el : solicitantes){
            lire006.DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante  solD = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante();
            solD.setOrdenSolicitantes(s);
            solD.setValue(el.getTcPersona().getPersonaDesc());
            sol.getSolicitante().add(solD);
            s=s+1;            
        }
        
        // nodo Asunto
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.Asunto as = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Asunto();
        as.setNumeroProvidencia("prov-787878");
        as.setNumeroExpediente("po-2026045");
        as.setNumeroLicencia("LI-RE-006-2026");
        as.setNombreFinca(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getFincaDesc());
        as.setNombreComunidad(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getDireccion());
        as.setMunicipioAsunto(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getMunicipioDesc());
        as.setDepartamentoAsunto(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        
        // nodo antecedentes
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes an = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes();
        an.setRepresentanteLegalAntecedentes(per.getPplanM().getData().get(0).getRepresentantes().get(0).getTcPersona().getPersonaDesc());
        an.setTipoLicenciaAntecedentes(per.getPplanM().getData().get(0).getTcTipoGestion().getTcModulo().getModuloDesc());
        an.setMunicipioAntecedentes(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getMunicipioDesc());
        an.setDepartamentoAntecedentes(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        

        // nodo analisis
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento anl = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento();
        anl.setRepresentateLegalAnalisis(per.getPplanM().getData().get(0).getRepresentantes().get(0).getTcPersona().getPersonaDesc());
        anl.setTipoLicenciaAnalisis(per.getPplanM().getData().get(0).getTcTipoGestion().getTcModulo().getModuloDesc());
        anl.setConclusionLegal("Procedente");
        
        // nodo pendientes - detalles
        int total_enmiendas= enmiendas.size();
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.Pendientes pen = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Pendientes();
        pen.setTotalDocumentos(total_enmiendas);
        int i=1;
        for(LIRE006.Elemento el : enmiendas){
            lire006.DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento penD = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento();
            penD.setOrdenDucumentos(i);
            penD.setValue(el.getValor());
            pen.getDocumento().add(penD);
            i=i+1;            
        }

        // nodo cierre 
        lire006.DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen ci = new lire006.DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen();
        ci.setNombreDelegadoJuridico("Juan perez");
        ci.setRegion(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                            per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire006.Asociados.Firmantes.Firma firma1 = new lire006.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire006.Asociados.Firmantes.Firma firma2 = new lire006.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire006.Asociados.Firmantes firmas = new lire006.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire006.Asociados asoc = new lire006.Asociados();
        asoc.setFirmantes(firmas);
        
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setSolicitantes(sol);
        SAC.setAsunto(as);  // carga asunto
        SAC.setAntecedentes(an);
        SAC.setAnalisisDocumento(anl);
        SAC.setPendientes(pen);
        SAC.setCierreDictamen(ci); // carga cierre oficio
        SAC.setVisor(asoc);// carga los asociados        
        doc006.setDictamenJuridicoEnmiendas(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc006;
    }
    
    public lire010.DocumentoInab creaDoc10(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE010.Elemento> correcciones){
        
        // atributos del documento 010 no master (DcoumentoInab)
        lire010.DocumentoInab doc10 = new lire010.DocumentoInab();
        doc10.setVersion(new BigDecimal("1.0"));
        doc10.setExpediente("LI-RE-010.xsd");
        doc10.setEstado("Activo");
        doc10.setOrden("1");
        doc10.setProceso("PROC9");
        doc10.setPaso("PASO8");
        doc10.setIdGestion(per.getLicencia().getGestion_id());
        doc10.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc10.setLicencia("LIC-010-2026");
        doc10.setNombreEsquema("LI-RE-010.xsd");
        
        
        // nodo secundario (SolicitudActualizacion)
        lire010.DocumentoInab.OficioEntregaEnmiendas SAC = new lire010.DocumentoInab.OficioEntregaEnmiendas();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        
        // nodo encabezado
        lire010.DocumentoInab.OficioEntregaEnmiendas.Encabezado en = new lire010.DocumentoInab.OficioEntregaEnmiendas.Encabezado();
        en.setDirectorSubregional(per.getListaTcUsuario().get(0).getUsuarioDesc());
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setSubregionEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        
        // nodo asunto
        lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto as = new lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto();
        as.setNumeroOficioAsunto("OF-E-2012445");
        as.setNumeroExpedienteAsunto(per.getPplanM().getData().get(0).getExpediente());
        // nodo modifiaciones carga todos los detalles
        int total_correcciones = correcciones.size();
        lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones cor = new lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones();
        cor.setTotalCorrecciones(total_correcciones);
        int i=1;
        for(LIRE010.Elemento el : correcciones){
            lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion corD = new lire010.DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion();
            corD.setOrdenCorrecciones(i);
            corD.setValue(el.getValor());
            cor.getCorreccion().add(corD);
            i=i+1;            
        }
        as.setCorrecciones(cor);
        
        // nodo cierre oficio
        lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio ci = new lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio();
        //lista de SOLICITANTES - nodo solicitantes
        ArrayList<Propietario> solicitantes = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_solicitantes = solicitantes.size();
        lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes sol = new lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes();
        sol.setTotalSolicitantes(total_solicitantes);
        int s=1;
        for(Propietario el : solicitantes){
            lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante  solD = new lire010.DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante();
            solD.setOrdenSolicitantes(s);
            solD.setValue(el.getTcPersona().getPersonaDesc());
            sol.getSolicitante().add(solD);
            s=s+1;            
        }
        ci.setSolicitantes(sol);
        ci.setObservaciones("");
                
 
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire010.Asociados.Firmantes.Firma firma1 = new lire010.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire010.Asociados.Firmantes.Firma firma2 = new lire010.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire010.Asociados.Firmantes firmas = new lire010.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire010.Asociados asoc = new lire010.Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setEncabezado(en); // carga el encabezado
        SAC.setAsunto(as); // carga el asunto 
        SAC.setCierreOficio(ci); // caraga el nodo cierre
        SAC.setVisor(asoc);// carga los asociados        
        doc10.setOficioEntregaEnmiendas(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc10;
    }
    
    public lire022.DocumentoInab creaDoc22(RespuestaSeccionUNO ru, estructuras.PefilInab per){
        
        // atributos del documento 010 no master (DcoumentoInab)
        lire022.DocumentoInab doc22 = new lire022.DocumentoInab();
        doc22.setVersion(new BigDecimal("1.0"));
        doc22.setEstado("Activo");
        doc22.setOrden("1");
        doc22.setProceso("PROC9");
        doc22.setPaso("PASO12");
        doc22.setIdGestion(per.getLicencia().getGestion_id());
        doc22.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc22.setLicencia("LIC-022-2026");
        doc22.setNombreEsquema("LI-RE-022.xsd");
        
        
        // nodo secundario 
        lire022.DocumentoInab.CedulaNotificacion SAC = new lire022.DocumentoInab.CedulaNotificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        
        // nodo encabezado
        lire022.DocumentoInab.CedulaNotificacion.Contenido con = new lire022.DocumentoInab.CedulaNotificacion.Contenido();
        con.setMunicipio(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc());
        con.setDepartamento(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        con.setFecha(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        con.setDireccionSubregional(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        con.setPersonaNotificada(per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc());
        con.setTipoPersona("Propietario");
        con.setNoPersonaNotificada(String.valueOf(per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getCui()));
        con.setPersonaRecibe(per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc());
        con.setObservaciones("");
      
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire022.Asociados.Firmantes.Firma firma1 = new lire022.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire022.Asociados.Firmantes.Firma firma2 = new lire022.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire022.Asociados.Firmantes firmas = new lire022.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire022.Asociados asoc = new lire022.Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setContenido(con); // caraga el nodo contenido
        SAC.setVisor(asoc);// carga los asociados        
        doc22.setCedulaNotificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc22;
    }
    
    public lire043.DocumentoInab creaDoc43(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE043.Elemento> conclusiones,List<LIRE043.Elemento> decisiones, boolean validarDocumento, String noDictamen){
        
        // atributos del documento 043 no master (DcoumentoInab)
        lire043.DocumentoInab doc43 = new lire043.DocumentoInab();
        doc43.setVersion(new BigDecimal("1.0"));
        doc43.setNombreEsquema("LI-RE-043.xsd");
        doc43.setEstado("Activo");
        doc43.setOrden("1");
        doc43.setProceso("PROC9");
        doc43.setPaso("PASO4");
        doc43.setIdGestion(per.getLicencia().getGestion_id());
        doc43.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc43.setLicencia("LI-RE-043-2024");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire043.DocumentoInab.DictamenTecnicoModificacion SAC = new lire043.DocumentoInab.DictamenTecnicoModificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        SAC.setValidarDocumento(validarDocumento);
        
        // nodo encabezado
        lire043.DocumentoInab.DictamenTecnicoModificacion.Encabezado en = new lire043.DocumentoInab.DictamenTecnicoModificacion.Encabezado();
        en.setNumeroDictamen(noDictamen);
        en.setMunicipioEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc());
        en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setDirectorSubregional(per.getPplanM().getData().get(0).getTcSubregion().getTcSubregional().getPersonaDesc());
        en.setDireccionSede(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());

        // nodo Asunto
        lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto as = new lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto();
        as.setNombreFinca(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getFincaDesc());
        as.setNombreComunidad(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getDireccion());
        as.setMunicipioAsunto(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getMunicipioDesc());
        as.setDepartamentoAsunto(per.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        //lista de propietarios en el asusnto
        ArrayList<Propietario> propietarios = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_propietarios = propietarios.size();
        lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios pro = new lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios();
        pro.setTotalPropietarios(total_propietarios);
        int s=1;
        for(Propietario el : propietarios){
            lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario proD = new lire043.DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario();
            proD.setOrdenPropietarios(s);
            proD.setValue(el.getTcPersona().getPersonaDesc());
            pro.getPropietario().add(proD);
            s=s+1;            
        }
        
        
        
        as.setPropietarios(pro);
        as.setNumeroLicencia("LI-RE-043-2024");
        as.setNumeroPlanOperativo("po-454494949");
        as.setNumeroExpediente(per.getPplanM().getData().get(0).getExpediente());
        
        // nodo conclusiones - detalles
        int total_conclusiones = conclusiones.size();
        lire043.DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion con = new lire043.DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion();
        con.setTotalConclusiones(total_conclusiones);
        int i=1;
        for(LIRE043.Elemento el : conclusiones){
            lire043.DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion conD = new lire043.DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion();
            conD.setOrdenConclusiones(i);
            conD.setValue(el.getValor());
            con.getConclusion().add(conD);
            i=i+1;            
        }
        
        // nodo decisiones- detalles
        int total_decisiones = decisiones.size();
        lire043.DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen de = new lire043.DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen();
        de.setTotalDecisiones(total_decisiones);
        int f=1;
        for(LIRE043.Elemento el : decisiones){
            lire043.DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision deD = new lire043.DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision();
            deD.setOrdenDecisiones(f);
            deD.setValue(el.getValor());
            de.getDecision().add(deD);
            f=f+1;            
        }
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire043.Asociados.Firmantes.Firma firma1 = new lire043.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire043.Asociados.Firmantes.Firma firma2 = new lire043.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire043.Asociados.Firmantes firmas = new lire043.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire043.Asociados asoc = new lire043.Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setAsunto(as);  // carga asunto
        SAC.setEvaluacionModificacion(con); // caraga coclusiones
        SAC.setDecisionDictamen(de); // carga decisiones
        SAC.setVisor(asoc);// carga los asociados        
        doc43.setDictamenTecnicoModificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc43;
    }
    
     public lire044.DocumentoInab creaDoc44(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE044.Elemento> antecedentes, List<LIRE044.Elemento> fundamentos,List<LIRE044.Elemento> analisis, boolean validarDocumento, String noDictamen){
        
        // atributos del documento 044 no master (DcoumentoInab)
        lire044.DocumentoInab doc44 = new lire044.DocumentoInab();
        doc44.setVersion(new BigDecimal("1.0"));
        doc44.setNombreEsquema("LI-RE-044.xsd");
        doc44.setEstado("Activo");
        doc44.setOrden("1");
        doc44.setProceso("PROC9");
        doc44.setPaso("PASO5");
        doc44.setIdGestion(per.getLicencia().getGestion_id());
        doc44.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc44.setLicencia("LI-RE-044-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire044.DocumentoInab.DictamenJuridicoModificacion SAC = new lire044.DocumentoInab.DictamenJuridicoModificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        SAC.setValidarDocumento(validarDocumento);
        
        // nodo encabezado
        lire044.DocumentoInab.DictamenJuridicoModificacion.Encabezado en = new lire044.DocumentoInab.DictamenJuridicoModificacion.Encabezado();
        en.setNumeroDictamen(noDictamen);
        en.setMunicipioEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc());
        en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setDirectorSubregional(per.getPplanM().getData().get(0).getTcSubregion().getTcSubregional().getPersonaDesc());
        en.setDireccionSede(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());

        // nodo Asunto
        lire044.DocumentoInab.DictamenJuridicoModificacion.Asunto as = new lire044.DocumentoInab.DictamenJuridicoModificacion.Asunto();
        as.setNumeroLicencia("LI-RE-044-2026");
        as.setNumeroPlanOperativo("po-454494949");
        as.setNumeroExpediente(per.getPplanM().getData().get(0).getExpediente());
        
        // nodo antecedentes - detalles
        int total_antecedentes = antecedentes.size();
        lire044.DocumentoInab.DictamenJuridicoModificacion.Antecedentes an = new lire044.DocumentoInab.DictamenJuridicoModificacion.Antecedentes();
        an.setTotalAntecedentes(total_antecedentes);
        int i=1;
        for(LIRE044.Elemento el : antecedentes){
            lire044.DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente anD = new lire044.DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente();
            anD.setOrdenAntecedentes(i);
            anD.setValue(el.getValor());
            an.getAntecedente().add(anD);
            i=i+1;            
        }
        
        // nodo fundamento legal - detalles
        int total_fundamentos = fundamentos.size();
        lire044.DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal fun = new lire044.DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal();
        fun.setTotalFundamentos(total_fundamentos);
        int f=1;
        for(LIRE044.Elemento el : fundamentos){
            lire044.DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento funD = new lire044.DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento();
            funD.setOrdenFundamentos(f);
            funD.setValue(el.getValor());
            fun.getFundamento().add(funD);
            f=f+1;            
        }
        
        // nodo analisis - detalles
        int total_analisis = analisis.size();
        lire044.DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento anl = new lire044.DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento();
        anl.setTotalAnalisis(total_analisis);
        int a=1;
        for(LIRE044.Elemento el : analisis){
            lire044.DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis anlD = new lire044.DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis();
            anlD.setOrdenAnalisis(a);
            anlD.setValue(el.getValor());
            anl.getAnalisis().add(anlD);
            a=a+1;            
        }
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire044.Asociados.Firmantes.Firma firma1 = new lire044.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire044.Asociados.Firmantes.Firma firma2 = new lire044.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire044.Asociados.Firmantes firmas = new lire044.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire044.Asociados asoc = new lire044.Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setAsunto(as);  // carga asunto
        SAC.setAntecedentes(an); // caraga antecedentes
        SAC.setFundamentoLegal(fun); // carga fundamento legal 
        SAC.setAnalisisDocumento(anl); // carga analisis
        SAC.setVisor(asoc);// carga los asociados        
        doc44.setDictamenJuridicoModificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc44;
    }
     
     public lire045.DocumentoInab creaDoc45(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE045.Elemento> razones, String noOficio){
        
        // atributos del documento 045 (DocumentoInab)
        lire045.DocumentoInab doc45 = new lire045.DocumentoInab();
        doc45.setVersion(new BigDecimal("1.0"));
        doc45.setNombreEsquema("LI-RE-045.xsd");
        doc45.setEstado("Activo");
        doc45.setOrden("1");
        doc45.setProceso("PROC9");
        doc45.setPaso("PASO6");
        doc45.setIdGestion(per.getLicencia().getGestion_id());
        doc45.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc45.setLicencia("LI-RE-045-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire045.DocumentoInab.OficioAprobacionModificacion SAC = new lire045.DocumentoInab.OficioAprobacionModificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        // nodo encabezado
        lire045.DocumentoInab.OficioAprobacionModificacion.Encabezado en = new lire045.DocumentoInab.OficioAprobacionModificacion.Encabezado();
        en.setNumeroOficio(noOficio);
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setMunicipioEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc());
        en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        en.setDireccionSede(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        en.setDirectorRegionalEncabezado(per.getListaTcUsuario().get(0).getUsuarioDesc());

        // nodo Asunto
        lire045.DocumentoInab.OficioAprobacionModificacion.Asunto as = new lire045.DocumentoInab.OficioAprobacionModificacion.Asunto();
        as.setFechaSolicitud(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        as.setNumeroLicencia("LI-RE-045-2026");
        //lista de solicitantes en el asusnto
        ArrayList<Propietario> propietarios = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_solicitantes = propietarios.size();
        lire045.DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes sol = new lire045.DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes();
        sol.setTotalSolicitantes(total_solicitantes);
        int s=1;
        for(Propietario el : propietarios){
            lire045.DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante  solD = new lire045.DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante();
            solD.setOrdenSolicitantes(s);
            solD.setValue(el.getTcPersona().getPersonaDesc());
            sol.getSolicitante().add(solD);
            s=s+1;            
        }
        as.setSolicitantes(sol);
        as.setNumeroPlanOperativo("po-2026045");
        as.setNumeroDictamenJuridico("DJ-7412");
        as.setFechaDictamenJuridico(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        as.setNombreAsesorJuridico("Luis lopez");
        as.setNumeroDictamenTecnico("DT-963258");
        as.setFechaDictamenTecnico(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        as.setNombreTecnicoForestal("Pedro Lopez");
        
        //nodo Cierre Oficio
        lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio ci = new lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio();
        // conclusiones - detalles
        int total_razones = razones.size();
        lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio cns = new lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio();
        cns.setTotalConclusiones(total_razones);
        int c=1;
        for(LIRE045.Elemento el : razones){
            lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion cn = new lire045.DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion();
            cn.setOrdenConclusiones(c);
            cn.setValue(el.getValor());
            cns.getConclusion().add(cn);
            c=c+1;            
        }
        ci.setConclusionesOficio(cns);
        ci.setDirectorRegionalCierre(per.getListaTcUsuario().get(0).getUsuarioDesc());
        ci.setNumeroFolios(5);
        ci.setObservasiones("");
        
        
//        con.setModificaciones(mod);// carga modificaciones
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire045.Asociados.Firmantes.Firma firma1 = new lire045.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire045.Asociados.Firmantes.Firma firma2 = new lire045.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire045.Asociados.Firmantes firmas = new lire045.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire045.Asociados asoc = new lire045.Asociados();
        asoc.setFirmantes(firmas);
        
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setAsunto(as);  // carga asunto
        SAC.setCierreOficio(ci); // carga cierre oficio
        SAC.setVisor(asoc);// carga los asociados        
        doc45.setOficioAprobacionModificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc45;
    }
     
     public lire046.DocumentoInab creaDoc46(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE046.Elemento> razones, String noOficio){
        
        // atributos del documento 046 no master (DcoumentoInab)
        lire046.DocumentoInab doc46 = new lire046.DocumentoInab();
        doc46.setVersion(new BigDecimal("1.0"));
        doc46.setNombreEsquema("LI-RE-046.xsd");
        doc46.setEstado("Activo");
        doc46.setOrden("1");
        doc46.setProceso("PROC9");
        doc46.setPaso("PASO6");
        doc46.setIdGestion(per.getLicencia().getGestion_id());
        doc46.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc46.setLicencia("LI-RE-046-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire046.DocumentoInab.OficioDenegacionModificacion SAC = new lire046.DocumentoInab.OficioDenegacionModificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        // nodo encabezado
        lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado en = new lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado();
        en.setNumeroOficio(noOficio);
        en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
        //lista de TITULARES en el encabezado
        ArrayList<Propietario> titulares = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_titulares = titulares.size();
        lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado.Titulares sol = new lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado.Titulares();
        sol.setTotalTitulares(total_titulares);
        int s=1;
        for(Propietario el : titulares){
            lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado.Titulares.Titular  solD = new lire046.DocumentoInab.OficioDenegacionModificacion.Encabezado.Titulares.Titular();
            solD.setOrdenTitulares(s);
            solD.setValue(el.getTcPersona().getPersonaDesc());
            sol.getTitular().add(solD);
            s=s+1;            
        }
        en.setTitulares(sol);
        en.setNumeroLicenciaEncabezado("LI-RE-046-2026");
        
        // nodo Asunto
        lire046.DocumentoInab.OficioDenegacionModificacion.Asunto as = new lire046.DocumentoInab.OficioDenegacionModificacion.Asunto();
        as.setNumeroLicenciaAsunto("LI-RE-045-2026");
        as.setNumeroPlanOperativo("po-2026045");
       
        
        //nodo Cierre Oficio
        lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio ci = new lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio();
        // conclusiones - detalles
        int total_razones = razones.size();
        lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio.Conclusiones cns = new lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio.Conclusiones();
        cns.setTotalConclusiones(total_razones);
        int c=1;
        for(LIRE046.Elemento el : razones){
            lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio.Conclusiones.Conclusion cn = new lire046.DocumentoInab.OficioDenegacionModificacion.CierreOficio.Conclusiones.Conclusion();
            cn.setOrdenConclusiones(c);
            cn.setValue(el.getValor());
            cns.getConclusion().add(cn);
            c=c+1;            
        }
        ci.setConclusiones(cns);
        ci.setDirectorSubregional(per.getListaTcUsuario().get(0).getUsuarioDesc());
        ci.setObservaciones("");
        
        
//        con.setModificaciones(mod);// carga modificaciones
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire046.Asociados.Firmantes.Firma firma1 = new lire046.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire046.Asociados.Firmantes.Firma firma2 = new lire046.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire046.Asociados.Firmantes firmas = new lire046.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire046.Asociados asoc = new lire046.Asociados();
        asoc.setFirmantes(firmas);
        
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setAsunto(as);  // carga asunto
        SAC.setCierreOficio(ci); // carga cierre oficio
        SAC.setVisor(asoc);// carga los asociados        
        doc46.setOficioDenegacionModificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc46;
    }
     
     public lire047.DocumentoInab creaDoc47(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE047.Elemento> conclusiones, String noResolucion, boolean validarDocumento){
        
        // atributos del documento 046 no master (DcoumentoInab)
        lire047.DocumentoInab doc47 = new lire047.DocumentoInab();
        doc47.setVersion(new BigDecimal("1.0"));
        doc47.setNombreEsquema("LI-RE-047.xsd");
        doc47.setEstado("Activo");
        doc47.setOrden("1");
        doc47.setProceso("PROC9");
        doc47.setPaso("PASO11");
        doc47.setIdGestion(per.getLicencia().getGestion_id());
        doc47.setExpediente(per.getPplanM().getData().get(0).getExpediente());
        doc47.setLicencia("LI-RE-047-2026");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire047.DocumentoInab.ResolucionModificacionPlan SAC = new lire047.DocumentoInab.ResolucionModificacionPlan();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        SAC.setValidarDocumento(validarDocumento);
        
        // nodo encabezado
        lire047.DocumentoInab.ResolucionModificacionPlan.Encabezado en = new lire047.DocumentoInab.ResolucionModificacionPlan.Encabezado();
         en.setNumeroResolucion(noResolucion);
         en.setDepartamentoEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc());
         en.setDireccionSubregionalEncabezado(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
         en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
         
        //lista de solicitanes - nodo solicitantes
        ArrayList<Propietario> solicitates = per.getPplanM().getData().get(0).getFincas().get(0).getPropietarios();
        int total_solicitantes = solicitates.size();
        lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes sol = new lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes();
        sol.setTotalSolicitantes(total_solicitantes);
        int s=1;
        // QName del elemento Solicitante
        QName qNameSolicitante = new QName("", "Solicitante");
         for (Propietario el : solicitates) {
             lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes.Solicitante solD = new lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes.Solicitante();
             solD.setOrdenSolicitantes(s);
             solD.setNombreSolicitante(el.getTcPersona().getPersonaDesc());
             solD.setCuiSolicitante(String.valueOf(el.getTcPersona().getCui()));
             // Envolver en JAXBElement (OBLIGATORIO por @XmlElementRef)
             JAXBElement<lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes.Solicitante> solicitanteElement = new JAXBElement<>(
                     qNameSolicitante,
                     lire047.DocumentoInab.ResolucionModificacionPlan.Solicitantes.Solicitante.class,
                     solD
             );
             sol.getContent().add(solicitanteElement);
             s = s + 1;
         }
        
        // nodo Asunto
        lire047.DocumentoInab.ResolucionModificacionPlan.Asunto as = new lire047.DocumentoInab.ResolucionModificacionPlan.Asunto();
        as.setNumeroLicenciaAsunto("LI-RE-047-2026");
        as.setNumeroPlanOperativoAsunto("po-2026045");
        as.setNumeroExpediente(per.getPplanM().getData().get(0).getExpediente());
       
        // nodo condiderando
        lire047.DocumentoInab.ResolucionModificacionPlan.Considerando con = new lire047.DocumentoInab.ResolucionModificacionPlan.Considerando();
        con.setNombreTecnicoForestal("tecnico foresta");
        con.setDireccionSubregionalConsiderando(per.getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                                                    per.getPplanM().getData().get(0).getTcSubregion().getSubregionDesc());
        con.setNumeroDictamenTecnico("DT-12654");
        con.setFechaDictamenTecnico(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        con.setNumeroDictamenJuridico("DJ-7896325");
        con.setFechaDictamenJuridico(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        con.setNombreAsesorJuridico("Juan Perex");
        con.setNombreDirectorSubregional(per.getListaTcUsuario().get(0).getUsuarioDesc());
        con.setNumeroOficioSubregional("OSB-7891");
        con.setFechaOficio(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        
        
        //nodo Cierre Oficio
        lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion ci = new lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion();
        ci.setNumeroLicenciaCierre("LI-RE-047-2026");
        ci.setNumeroPlanOperativoCierre("PO-787878787");
        // conclusiones - detalles
        int total_conclusiones = conclusiones.size();
        lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones cns = new lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones();
        cns.setTotalConclusiones(total_conclusiones);
        int c=1;
        for(LIRE047.Elemento el : conclusiones){
            lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion cn = new lire047.DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion();
            cn.setOrdenConclusiones(c);
            cn.setValue(el.getValor());
            cns.getConclusion().add(cn);
            c=c+1;            
        }
        ci.setConclusiones(cns);
        ci.setObservaciones("");
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire047.Asociados.Firmantes.Firma firma1 = new lire047.Asociados.Firmantes.Firma();
        Long id = per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire047.Asociados.Firmantes.Firma firma2 = new lire047.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaDesc());
        firma2.setIdUsuario(per.getPplanM().getData().get(0).getTtResumenGestion().getTcRegente().getPersonaId()); // pendiente este id
        
        lire047.Asociados.Firmantes firmas = new lire047.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire047.Asociados asoc = new lire047.Asociados();
        asoc.setFirmantes(firmas);
        
        SAC.setEncabezado(en);    // carga encabezado
        SAC.setSolicitantes(sol);
        SAC.setAsunto(as);  // carga asunto
        SAC.setConsiderando(con);
        SAC.setCierreResolucion(ci); // carga cierre oficio
        SAC.setVisor(asoc);// carga los asociados        
        doc47.setResolucionModificacionPlan(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc47;
    }
}
