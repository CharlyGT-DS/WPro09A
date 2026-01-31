package juridico;

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
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.xml.bind.JAXBException;
import lire006.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

/**
 * Dictamen Jurídico de Enmiendas - LI-RE-006
 */
@Named(value = "lire006")
@ViewScoped
public class LIRE006 implements Serializable {

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
    private String noDictamen;
    private String direccion = "";
    private String[] partesDireccion;
    private String subRegion;
    private String sede;            // Si no lo recibes explícito, asignamos subRegion
    private String municipio;
    private String departamento;
    private String nombreDirectorSub = "";

    // ====== Datos que integran el documento ======
    private String noProvidencia;
    private String expediente;
    private String licencia;
    private String solicitante;
    private String finca;
    private String ubicacionFinca;
    private String representanteLegal;
    private String tipoLicencia;
    

    // ====== Secciones dinámicas ======
    private List<Elemento> enmiendas = new ArrayList<>();
    private List<Elemento> conclusiones = new ArrayList<>();

    // ====== Ruta para visor (vista previa / final) ======
    private String nomXML = "";
    private String rutaNombre = "";

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
            Logger.getLogger(LIRE006.class.getName()).log(Level.WARNING, "No se pudo leer el parámetro 'tipo'", ex);
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
            this.noProvidencia = "Pro.45454545455";
            this.departamento = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc();
            this.municipio = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc();
            this.subRegion = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                             mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getSubregionDesc();
            this.direccion = this.municipio +", "+ this.departamento +", "+ this.subRegion;
            this.nombreDirectorSub = this.mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcSubregional().getPersonaDesc();
            this.solicitante = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc();
            this.finca = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getFincaDesc();
            this.ubicacionFinca = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getDireccion() + ", " +
                                  this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getMunicipioDesc() + ", " +
                                  this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getTcDepartamento().getDepartamentoDesc();
            this.licencia = "LI-RE-006-2026";
            this.expediente = this.mhome.getPer().getPplanM().getData().get(0).getExpediente();
            this.representanteLegal = this.mhome.getPer().getPplanM().getData().get(0).getRepresentantes().get(0).getTcPersona().getPersonaDesc();
            this.tipoLicencia = this.mhome.getPer().getPplanM().getData().get(0).getTcTipoGestion().getTcModulo().getModuloDesc();


            // ====== Valores por defecto / precarga de "Datos que integran el documento" ======
            // Sustituye por lo que corresponda en tu servicio
  

            // Inicializa listas con un elemento vacío para la UI
            if (enmiendas.isEmpty())     enmiendas.add(new Elemento(""));
            if (conclusiones.isEmpty()) conclusiones.add(new Elemento(""));

        } catch (Exception ex) {
            Logger.getLogger(LIRE006.class.getName()).log(Level.SEVERE, "Error en llamar()", ex);
        }
    }

    // ====== Acciones UI ======
    public void agregarEnmiendas() { enmiendas.add(new Elemento("")); }
    public void eliminarEnmiendas(Elemento e) {
        if (enmiendas.size() > 1) enmiendas.remove(e);
    }

    public void agregarConclusion() { conclusiones.add(new Elemento("")); }
    public void eliminarConclusion(Elemento e) {
        if (conclusiones.size() > 1) conclusiones.remove(e);
    }

    public void activarBoton() {
        this.bot1 = true;
        this.bot2 = false;
        this.bot4 = true; // Bloquea edición si así lo manejas
        // Si quieres refrescar puntualmente desde servidor:
        PF.current().ajax().update("form006");
    }

    public void activarBotonVistaPrevia() {
        this.bot1 = false;
        this.bot2 = true;
        PF.current().ajax().update("form006");
    }

    public void desactivaAmbosBotones() {
        this.bot1 = true;
        this.bot2 = true;
//        PrimeFaces.current().executeScript(
//            "Swal.fire({"
//            + "title: 'Su solicitud fue enviada al INAB',"
//            + "text: 'Serás redirigido al inicio',"
//            + "icon: 'success',"
//            + "confirmButtonText: 'Ir ahora'"
//            + "}).then((result)=>{ if(result.isConfirmed){ window.location.href='/WPro09/pages/inicio.xhtml?ra="
//            + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a'; } });"
//        );
    }

    public void generarDocumento006() {
         try {
            // creadocumento 046
            Future<lire006.DocumentoInab> dc = cargaDoc.creaDocumento006(mhome.getRu(),mhome.getPer(),this.enmiendas, this.noDictamen);
            
            this.dInab = dc.get();
            //crea xml 
             Future<String> xml = cargaDoc.creaXML006(mhome.getPer(),"PRO09","P6","006", dInab);
             
             String valor = xml.get();
             // graba el xml
             Future<String> gxml = cargaDoc.grabaXML006(valor, dInab);
             
            String r = gxml.get();
            
            System.out.println("Este es el xml = "+ r);

             // setea nombres
             this.nomXML = dInab.getDictamenJuridicoEnmiendas().getVisor().getVista().getRutaPdf();
             // String xq=UTILIDADES.Xquery.xmlConsultaDocumento(dInab.getExpediente(), nomXML);

             this.rutaNombre = this.nomXML;
             
             // crea documento en vista preiva
             Future<String> gs = cargaDoc.generarReporte(dInab.getDictamenJuridicoEnmiendas().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"006",dInab.getLicencia());             
             
             String sp = gs.get();
             System.out.println(gs);
             System.out.println(sp);                                       
             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LIRE044.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarDocumento006Final() {
        try {
            // nombre de archivo temporal
            String n = this.dInab.getDictamenJuridicoEnmiendas().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.dInab.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.dInab.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            DocumentoInab temp =  UTILIDADES.FuncionesComunes.fromXml(xml, DocumentoInab.class);
            // cambia a Generado el estado del xml
            temp.setEstado("Generado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML006(mhome.getPer(),"PRO09","P6","006", temp);
            // obtiene el xml final
            String valor = xmlfin.get();
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML006(valor, temp);
            // obteine respuesta
            String r = gxml.get();
            // desaciva boton generar documento
            this.bot2=true;
            // registra en el historico en segundo plano
            Historico hiloHistorico = new Historico();
            hiloHistorico.setPer(this.mhome.getPer());
            hiloHistorico.setDocumentoRegistrar(temp); // registra documento 006 con estado finalizado
            hiloHistorico.start();// dispara en segundo plano registra historico para finalizados
            
            // crea documento en final
             Future<String> gs = cargaDoc.generarReporte(dInab.getDictamenJuridicoEnmiendas().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"006",dInab.getLicencia());             
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
            //this.mhome.getApi().llamaCualquierPagina("/WPro09/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE006.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE006.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE006.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // ====== Clase auxiliar para secciones dinámicas ======
    public static class Elemento implements Serializable {
        private String valor;
        public Elemento() {}
        public Elemento(String valor) { this.valor = valor; }
        public String getValor() { return valor; }
        public void setValor(String valor) { this.valor = valor; }
    }

    // ====== Getters / Setters ======

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
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

    public String getNoDictamen() {
        return noDictamen;
    }

    public void setNoDictamen(String noDictamen) {
        this.noDictamen = noDictamen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] getPartesDireccion() {
        return partesDireccion;
    }

    public void setPartesDireccion(String[] partesDireccion) {
        this.partesDireccion = partesDireccion;
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

    public String getNoProvidencia() {
        return noProvidencia;
    }

    public void setNoProvidencia(String noProvidencia) {
        this.noProvidencia = noProvidencia;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getFinca() {
        return finca;
    }

    public void setFinca(String finca) {
        this.finca = finca;
    }

    public String getUbicacionFinca() {
        return ubicacionFinca;
    }

    public void setUbicacionFinca(String ubicacionFinca) {
        this.ubicacionFinca = ubicacionFinca;
    }

    public List<Elemento> getEnmiendas() {
        return enmiendas;
    }

    public void setEnmiendas(List<Elemento> enmiendas) {
        this.enmiendas = enmiendas;
    }

    public List<Elemento> getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(List<Elemento> conclusiones) {
        this.conclusiones = conclusiones;
    }

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }

}