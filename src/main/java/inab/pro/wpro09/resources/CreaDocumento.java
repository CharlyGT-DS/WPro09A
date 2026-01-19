/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inab.pro.wpro09.resources;

import estructuras.GEnericaCincoCampos;
import estructuras.RespuestaSeccionUNO;
import estructuras.RespuestaTareaRegional;
import estructuras.RespuestaTareaUsuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import juridico.LIRE044;
import lire042.Asociados;
import lire042.Asociados.Firmantes.Firma;
import lire042.DocumentoInab;
import lire080.DocumentoInab.ConstanciaRecepcion.Generales.Nombres;
import secretaria.LIRE080;
import secretaria.LIRE079;
import solicitante.LIRE042;
import solicitante.LIRE042.Elemento;

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
     public lire044.DocumentoInab creaDoc44(RespuestaSeccionUNO ru, estructuras.PefilInab per, List<LIRE044.Elemento> antecedentes, List<LIRE044.Elemento> fundamentos,List<LIRE044.Elemento> analisis){
        
        // atributos del documento 044 no master (DcoumentoInab)
        lire044.DocumentoInab doc44 = new lire044.DocumentoInab();
        doc44.setVersion(BigDecimal.ONE);
        doc44.setExpediente("LI-RE-044.xsd");
        doc44.setEstado("Activo");
        doc44.setOrden("1");
        doc44.setProceso("PROC9");
        doc44.setPaso("PASO5");
        doc44.setIdGestion(per.getLicencia().getGestion_id());
        doc44.setExpediente(per.getLicencia().getExpediente());
        doc44.setLicencia(ru.getNumero_licencia_poa());
        doc44.setNombreEsquema("LI-RE-044.xsd");
        
        
        // nodo secundario (DictamenJuridicoModificacion)
        lire044.DocumentoInab.DictamenJuridicoModificacion SAC = new lire044.DocumentoInab.DictamenJuridicoModificacion();
        SAC.setID(UTILIDADES.FuncionesComunes.md5(String.valueOf(per.getLicencia().getGestion_id()))); // md5 del idGestion
        SAC.setFechaDocumento(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));        
        SAC.setTipoDocumento(Integer.valueOf("9001"));
        
        // nodo encabezado
        lire044.DocumentoInab.DictamenJuridicoModificacion.Encabezado en = new lire044.DocumentoInab.DictamenJuridicoModificacion.Encabezado();
         en.setMunicipioEncabezado(per.getTcSubregion().getDireccion() + " - " + per.getTcSubregion().getSubregionDesc() + " - " + per.getTcSubregion().getAlias());
         en.setDepartamentoEncabezado("SOLICITUD DE MODIFICACIÓN DEL PLAN DE MANEJO FORESTAL");
         en.setFechaEncabezado(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
         en.setDirectorSubregional("sugregional");
         en.setDireccionSede("direccion sede");

        // nodo Asunto
        lire044.DocumentoInab.DictamenJuridicoModificacion.Asunto as = new lire044.DocumentoInab.DictamenJuridicoModificacion.Asunto();
        as.setNumeroResolucion(per.getLicencia().getNumero_licencia_poa());
        as.setNumeroPlanOperativo("consulta donde esta en la base");
        as.setNumeroExpediente(per.getLicencia().getExpediente());
        
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
        int total_analisis = antecedentes.size();
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
        
//        con.setModificaciones(mod);// carga modificaciones
        
        // nodo visor
        
        // primera firma quien elabora documento
        lire044.Asociados.Firmantes.Firma firma1 = new lire044.Asociados.Firmantes.Firma();
        Long id= per.getTcUsuario().getUsuarioId();
        int idUsuario = Integer.parseInt(String.valueOf(id));
        firma1.setIdUsuario(idUsuario);
        firma1.setNombreQuienFirma(per.getTcUsuario().getUsuarioDesc());
        
        // segunda firma titular / regente
        lire044.Asociados.Firmantes.Firma firma2 = new lire044.Asociados.Firmantes.Firma();   
        
        firma2.setNombreQuienFirma("test firma1");
        firma2.setIdUsuario(1); // pendiente este id
        
        lire044.Asociados.Firmantes firmas = new lire044.Asociados.Firmantes();  
        firmas.getFirma().add(firma1);
        firmas.getFirma().add(firma2);
        firmas.setTotalFirmantes(firmas.getTotalFirmantes());
        
        lire044.Asociados asoc = new lire044.Asociados();
        
        asoc.setFirmantes(firmas);
        SAC.setEncabezado(en);    // carga general
        SAC.setAsunto(as);  // carga contenido
        SAC.setVisor(asoc);// carga los asociados        
        doc44.setDictamenJuridicoModificacion(SAC);
        
        //String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(doc48);        
        
        return  doc44;
    }
}
