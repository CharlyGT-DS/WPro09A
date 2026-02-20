package solicitante;

import HILOS.Historico;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import inab.pro.wpro09.resources.VerificaUsuario;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.xml.bind.JAXBException;
import lire010.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

/**
 * Dictamen Jurídico de Enmiendas - LI-RE-010
 */
@Named(value = "lire010")
@ViewScoped
public class LIRE010 implements Serializable {

    // ====== Inyección de servicios existentes en tu app ======
    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;

    @EJB
    private EJBGestionREDLocal ir;

    // ====== Utilidades ======
    private final Gson gs = new Gson();
    private final Date hoy = new Date();
    private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private  DocumentoInab  dInab = new  DocumentoInab();

    // ====== Estado UI / flags de botones ======
    private boolean bot = false;     // Toggle para mostrar "datos" (sección oculta)
    private boolean bot1 = false;    // Vista previa habilitada/deshabilitada
    private boolean bot2 = true;     // Generar Documento habilitado/deshabilitado
    private boolean bot4 = false;    // Usado para bloquear edición tras vista previa

    // ====== Encabezado / parámetros ======
    private String fechaFormateada = "";
    private boolean validezDocumento;    // APROBAR/DENEGAR
    private String tipoActualizacion = "0";

    // ====== Campos principales ======
    
    private String direccion = "";
    private String subRegion;
    private String sede;            // Si no lo recibes explícito, asignamos subRegion
    private String municipio;
    private String departamento;
    private String nombreDirectorSub = "";

    // ====== Datos que integran el documento ======

    private String expediente;
    private String noOficioPrev;
    private String solicitante;

    // ====== Secciones dinámicas ======
    private List<Elemento> correcciones = new ArrayList<>();
    
    // ====== Ruta para visor (vista previa / final) ======
    private String rutaNombre = "";
    private String nomXML = "";
    // ====== Ciclo de vida ======
    @PostConstruct
    public void init() {
        try {
            // Lee parámetro 'tipo' (?tipo=true/false) para APROBAR/DENEGAR
            String tipo = FacesContext.getCurrentInstance()
                    .getExternalContext()
                    .getRequestParameterMap()
                    .get("tipo");
            if (tipo != null) {
                validezDocumento = Boolean.parseBoolean(tipo);
            }
        } catch (Exception ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.WARNING, "No se pudo leer el parámetro 'tipo'", ex);
        }
    }

    /**
     * Carga de datos al ingresar a la vista (ligado a f:viewAction)
     */
    public void llamar() {
        try {
            
            Jedis JD = this.ir.obtieneConeccionRedis();
            String token = JD.hget("USU-" + mhome.getPer().getTcUsuario().getUsuarioId(), "token");

            int gestion_id = mhome.getPer().getLicencia().getGestion_id();
            VerificaUsuario ver = new VerificaUsuario();
            String json = ver.obtienePlan(gestion_id, token);

            dta.json.plan.Plan pl = this.gs.fromJson(json, dta.json.plan.Plan.class);

            pl.getData().get(0).getPersonas().get(0).getTcPersona().getTcIdioma().getIdiomaDesc();
            JD.set("PLAN-" + mhome.getPer().getTcUsuario().getUsuarioId(), json);

            JD.close();
            
            this.mhome.getPer().setPplanM(pl);// carga el plan a la session

            InitialContext ctx = new InitialContext();
            this.fechaFormateada = formato.format(hoy);

            this.departamento = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc();
            this.municipio = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc();
            this.subRegion = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                             mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getSubregionDesc();
            this.direccion = this.municipio +", "+ this.departamento +", "+ this.subRegion;
            this.nombreDirectorSub = this.mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcSubregional().getPersonaDesc();
            this.noOficioPrev = "OF-E-45454848484";
            this.expediente = this.mhome.getPer().getPplanM().getData().get(0).getExpediente();


            // Inicializa listas con un elemento vacío para la UI
            if (correcciones.isEmpty()) {
                correcciones.add(new Elemento(""));
            }
        

        } catch (Exception ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.SEVERE, "Error en llamar()", ex);
        }
    }

    // ====== Acciones UI ======
    public void agregarCorrecciones() {
        correcciones.add(new Elemento(""));
    }

    public void eliminarCorrecciones(Elemento e) {
        if (correcciones.size() > 1) {
            correcciones.remove(e);
        }
    }

    public void activarBoton() {
        this.bot1 = true;
        this.bot2 = false;
        this.bot4 = true; // Bloquea edición si así lo manejas
        // Si quieres refrescar puntualmente desde servidor:
        PF.current().ajax().update("form010");
    }

    public void activarBotonVistaPrevia() {
        this.bot1 = false;
        this.bot2 = true;
        PF.current().ajax().update("form010");
    }

    public void desactivaAmbosBotones() {
        this.bot1 = true;
        this.bot2 = true;
        /** mensaje correcto
            PrimeFaces.current().executeScript(
                "Swal.fire({"
                + "title: 'Su solicitud fue enviada al INAB',"
                + "text: 'Serás redirigido al inicio',"
                + "icon: 'success',"
                + "confirmButtonText: 'Ir ahora'"
                + "}).then((result)=>{ if(result.isConfirmed){ window.location.href='/WPro09/pages/inicio.xhtml?ra="
                + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a'; } });"
        );
        */
        PrimeFaces.current().executeScript(
                "Swal.fire({"
                + "title:'Resolución registrada',"
                + "text:'Será redirigido al inicio',"
                + "icon:'success'"
                + "});"
        );
    }

    public void generarDocumento010() {
        try {
            // creadocumento 010
            Future<lire010.DocumentoInab> dc = cargaDoc.creaDocumento010(mhome.getRu(),mhome.getPer(),this.correcciones);
            
            this.dInab = dc.get();
            //crea xml 
             Future<String> xml = cargaDoc.creaXML10(mhome.getPer(),"PRO09","P8","010", dInab);
             
             String valor = xml.get();
             // graba el xml
             Future<String> gxml = cargaDoc.grabaXML10(valor, dInab);
             
            String r = gxml.get();
            
            System.out.println("Este es el xml = "+ r);

             // setea nombres
             this.nomXML = dInab.getOficioEntregaEnmiendas().getVisor().getVista().getRutaPdf();
             // String xq=UTILIDADES.Xquery.xmlConsultaDocumento(dInab.getExpediente(), nomXML);

             this.rutaNombre = this.nomXML;
             
             // crea documento en vista preiva
             Future<String> gs = cargaDoc.generarReporte(dInab.getOficioEntregaEnmiendas().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"010",dInab.getLicencia());             
             
             String sp = gs.get();
             System.out.println(gs);
             System.out.println(sp);                                       
             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarDocumento010Final() {
        try {
            // nombre de archivo temporal
            String n = this.dInab.getOficioEntregaEnmiendas().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.dInab.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.dInab.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            DocumentoInab temp =  UTILIDADES.FuncionesComunes.fromXml(xml, DocumentoInab.class);
            // cambia a Generado el estado del xml
            temp.setEstado("Generado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML10(mhome.getPer(),"PRO09","P8","010", temp);
            // obtiene el xml final
            String valor = xmlfin.get();
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML10(valor, temp);
            // obteine respuesta
            String r = gxml.get();
            // desaciva boton generar documento
            this.bot2=true;
            // registra en el historico en segundo plano
            Historico hiloHistorico = new Historico();
            hiloHistorico.setPer(this.mhome.getPer());
            hiloHistorico.setDocumentoRegistrar(temp); // registra documento 044 con estado finalizado
            hiloHistorico.start();// dispara en segundo plano registra historico para finalizados
            
            // crea documento en final
             Future<String> gs = cargaDoc.generarReporte(dInab.getOficioEntregaEnmiendas().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"010",dInab.getLicencia());             
             String sp = gs.get();
             System.out.println(sp);               
             
             
//             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
//            
//            String sql= UTILIDADES.SQL.insertaGestion(temp);
//            
//            estructuras.RespuestaInsert ri = (estructuras.RespuestaInsert) mhome.getApi().repuestaApi(new estructuras.RespuestaInsert(),
//                    "JSON", sql);
//            
//            if(ri.fila_afectada>0){// verifica la insernción en la tabla de control
//                
//                DocumentoInab c=  UTILIDADES.FuncionesComunes.fromXml(valor,DocumentoInab.class);
//                this.rutaNombre = c.getDictamenJuridicoModificacion().getVisor().getVista().getRutaPdf();
//                
//                sql  =   UTILIDADES.SQL.insertaGestionDetalle(c,this.rutaNombre,mhome.getPer());
//                ri = (estructuras.RespuestaInsert) mhome.getApi().repuestaApi(new estructuras.RespuestaInsert(),
//                        "JSON", sql);
//                
//                if(ri.fila_afectada>0){
//                    Future<String> gs = cargaDoc.generarReporte(c.getDictamenJuridicoModificacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),valor,"042",dInab.getLicencia());
//                    String sp = gs.get();
//                    System.out.println(sp);
//                }
//                
//            }
            
//            GEnericaCincoCampos cinco = this.mhome.getPer().getCincoCampos();
//            System.out.println("Esto es el subregional : "+cinco.getDato1());
//            
            
//            System.out.println("secretaria 1 :"+ this.mhome.getPer().getListSecretarias().get(0).getUsuarioDesc());
//            
//            cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()),  this.mhome.getPer().getListSecretarias().get(0).getUsuarioId(),3,2);
//            
            // inicializa
            //this.mhome.getApi().llamaCualquierPagina("/WPro09A/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE010.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // ====== Clase auxiliar para secciones dinámicas ======
    public static class Elemento implements Serializable {

        private String valor;

        public Elemento() {
        }

        public Elemento(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }

    // ====== Getters / Setters ======

    public String getNoOficioPrev() {
        return noOficioPrev;
    }

    public void setNoOficioPrev(String noOficioPrev) {
        this.noOficioPrev = noOficioPrev;
    }
    
    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public boolean isBot1() {
        return bot1;
    }

    public void setBot1(boolean bot1) {
        this.bot1 = bot1;
    }

    public boolean isBot2() {
        return bot2;
    }

    public void setBot2(boolean bot2) {
        this.bot2 = bot2;
    }

    public boolean isBot4() {
        return bot4;
    }

    public void setBot4(boolean bot4) {
        this.bot4 = bot4;
    }

    public String getFechaFormateada() {
        return fechaFormateada;
    }

    public void setFechaFormateada(String fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
    }

    public boolean isValidezDocumento() {
        return validezDocumento;
    }

    public void setValidezDocumento(boolean validezDocumento) {
        this.validezDocumento = validezDocumento;
    }

    public String getTipoActualizacion() {
        return tipoActualizacion;
    }

    public void setTipoActualizacion(String tipoActualizacion) {
        this.tipoActualizacion = tipoActualizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombreDirectorSub() {
        return nombreDirectorSub;
    }

    public void setNombreDirectorSub(String nombreDirectorSub) {
        this.nombreDirectorSub = nombreDirectorSub;
    }


    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }


    public List<Elemento> getCorrecciones() {
        return correcciones;
    }

    public void setCorrecciones(List<Elemento> correcciones) {
        this.correcciones = correcciones;
    }

  

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }

}
