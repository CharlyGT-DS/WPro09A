package secretaria;

import HILOS.Historico;
import juridico.*;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import dta.json.plan.Plan;
import dta.json.plan.Propietario;
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
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import lire022.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

@Named(value = "lire022")
@ViewScoped
public class LIRE022 implements Serializable {

    // ==================== INYECCIONES ====================
    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;

    @EJB
    private EJBGestionREDLocal ir;

    private final Gson gs = new Gson();

    // ==================== FECHA/FORMATO ====================
    private final Date hoy = new Date();
    private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    // ==================== ESTADO UI ====================
    private boolean bot = false;   // toggle "ver datos ocultos"
    private boolean bot1 = false;  // Vista previa habilitada inicialmente
    private boolean bot2 = true;   // Generar deshabilitado inicialmente
    private boolean bot4 = false;  // bloquear edición (considerandos/por tanto)
    private boolean bot5 = false;  // reservado
    private boolean bot6 = false;  // bloquear edición de conclusiones

    // ==================== DOCUMENTO ====================
    private String fechaFormateada = "";
    private boolean validezDocumento;
    private String nomXML = "";
    private String rutaNombre = ""; // usado por los iframes

    // ==================== DATOS DOCUMENTO ====================
    private String direccion = "";
    private String subRegion;
    private String municipio;
    private String departamento;
    private Date fecha;
    private String personaNotificada;
    private String tipoPersona;
    private String noPersonaNotificada;
    private String personsaRecibe;


    private String OficioSubR;
    private List<Propietario> solicitantes = new ArrayList<>();

    // ==================== BLOQUES DINÁMICOS ====================
    private List<Elemento> conclusiones = new ArrayList<>();

    // ==================== MODELO (si luego conectas XML/PDF) ====================
    private DocumentoInab dInab = new DocumentoInab();

    // ==================== CICLO DE VIDA ====================
    @PostConstruct
    public void init() {
        try {
            // Lee el parámetro ?tipo=true|false
            String tipo = FacesContext.getCurrentInstance()
                    .getExternalContext()
                    .getRequestParameterMap()
                    .get("tipo");

            if (tipo != null) {
                validezDocumento = Boolean.parseBoolean(tipo);
            }
        } catch (Exception ignore) {
        }

        this.fechaFormateada = formato.format(hoy);

        // Inicializa listas
        if (conclusiones.isEmpty()) {
            conclusiones.add(new Elemento(""));
        }
    }

    // ==================== NAVEGACIÓN ====================
    public String irFormulario047(boolean valor) {
        // En Java es &, no &amp;
        return "li-re-047?faces-redirect=true&tipo=" + valor;
    }

    // Alias por compatibilidad
    public String irFormulario(boolean valor) { return irFormulario047(valor); }

    // ==================== CARGA DE DATOS ====================
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
            this.personaNotificada = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc();
            this.noPersonaNotificada = "CUI: "  + String.valueOf(this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getCui());
            this.personsaRecibe = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc();
            this.tipoPersona = "Propietario";        

        } catch (Exception ex) {
            Logger.getLogger(LIRE022.class.getName()).log(Level.SEVERE, "Error general en llamar()", ex);
        }
    }

    // ==================== VALIDACIONES Y AYUDANTES ====================
    private boolean isNotBlank(String s) {
        return s != null && !s.trim().isEmpty();
    }

    private boolean hasAtLeastOneFilled(List<Elemento> lista) {
        if (lista == null || lista.isEmpty()) return false;
        for (Elemento e : lista) {
            if (e != null && isNotBlank(e.getValor())) return true;
        }
        return false;
    }

    private void addMsg(FacesMessage.Severity sev, String summary, String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(sev, summary, detail));
    }

    // ==================== conclusiones ====================
    public void agregarConclusiones() {
        conclusiones.add(new Elemento(""));
    }

    public void eliminarConclusiones(Elemento e) {
        if (conclusiones.size() > 1) {
            conclusiones.remove(e);
        }
    }

    // ==================== BOTONES / ACCIONES ====================
    public void activarBoton() {
        this.bot1 = true;   // deshabilita "Vista Previa"
        this.bot2 = false;  // habilita "Generar Documento"
        this.bot4 = true;   // bloquea edición de textos
        this.bot5 = true;
        this.bot6 = true;   // bloquea conclusiones
        PF.current().ajax().update("form047");
    }

    public void desactivaAmbosBotones() {
        this.bot1 = true;
        this.bot2 = true;

        PrimeFaces.current().executeScript(
                "Swal.fire({"
                + "title:'Resolución registrada',"
                + "text:'Será redirigido al inicio',"
                + "icon:'success'"
                + "});"
        );
    }

    // ---- Vista Previa con validación de todos los bloques
    public void generarDocumento022() {
        try {
            // creadocumento 046
            Future<lire022.DocumentoInab> dc = cargaDoc.creaDocumento022(mhome.getRu(),mhome.getPer());
            
            this.dInab = dc.get();
            //crea xml 
             Future<String> xml = cargaDoc.creaXML22(mhome.getPer(),"PRO09","P12","022", dInab);
             
             String valor = xml.get();
             // graba el xml
             Future<String> gxml = cargaDoc.grabaXML22(valor, dInab);
             
            String r = gxml.get();
            
            System.out.println("Este es el xml = "+ r);

             // setea nombres
             this.nomXML = dInab.getCedulaNotificacion().getVisor().getVista().getRutaPdf();
             // String xq=UTILIDADES.Xquery.xmlConsultaDocumento(dInab.getExpediente(), nomXML);

             this.rutaNombre = this.nomXML;
             
             // crea documento en vista preiva
             Future<String> gs = cargaDoc.generarReporte(dInab.getCedulaNotificacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"022",dInab.getLicencia());             
             
             String sp = gs.get();
             System.out.println(gs);
             System.out.println(sp);                                       
             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LIRE044.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarDocumento022Final() {
        try {
            // nombre de archivo temporal
            String n = this.dInab.getCedulaNotificacion().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.dInab.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.dInab.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            DocumentoInab temp =  UTILIDADES.FuncionesComunes.fromXml(xml, DocumentoInab.class);
            // cambia a Generado el estado del xml
            temp.setEstado("Generado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML22(mhome.getPer(),"PRO09","P12","022", temp);
            // obtiene el xml final
            String valor = xmlfin.get();
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML22(valor, temp);
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
             Future<String> gs = cargaDoc.generarReporte(dInab.getCedulaNotificacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"022",dInab.getLicencia());             
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
            Logger.getLogger(LIRE022.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE022.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE022.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // ==================== GETTERS/SETTERS ====================
    
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPersonaNotificada() {
        return personaNotificada;
    }

    public void setPersonaNotificada(String personaNotificada) {
        this.personaNotificada = personaNotificada;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNoPersonaNotificada() {
        return noPersonaNotificada;
    }

    public void setNoPersonaNotificada(String noPersonaNotificada) {
        this.noPersonaNotificada = noPersonaNotificada;
    }

    public String getPersonsaRecibe() {
        return personsaRecibe;
    }

    public void setPersonsaRecibe(String personsaRecibe) {
        this.personsaRecibe = personsaRecibe;
    }
    
    

    public List<Propietario> getSolicitantes() {
        return solicitantes;
    }

    public void setSolicitantes(List<Propietario> solicitantes) {
        this.solicitantes = solicitantes;
    }
    
    public String getOficioSubR() {
        return OficioSubR;
    }

    public void setOficioSubR(String OficioSubR) {
        this.OficioSubR = OficioSubR;
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

    public boolean isBot5() {
        return bot5;
    }

    public void setBot5(boolean bot5) {
        this.bot5 = bot5;
    }

    public boolean isBot6() {
        return bot6;
    }

    public void setBot6(boolean bot6) {
        this.bot6 = bot6;
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

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
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

    public List<Elemento> getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(List<Elemento> conclusiones) {
        this.conclusiones = conclusiones;
    }

    public DocumentoInab getdInab() {
        return dInab;
    }

    public void setdInab(DocumentoInab dInab) {
        this.dInab = dInab;
    }
    

    // ==================== CLASE AUXILIAR ====================
    public static class Elemento implements Serializable {
        private String valor;

        public Elemento() {}
        public Elemento(String valor) { this.valor = valor; }

        public String getValor() { return valor; }
        public void setValor(String valor) { this.valor = valor; }
    }
}