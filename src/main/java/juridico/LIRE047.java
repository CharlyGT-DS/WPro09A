package juridico;

import MANEJADORES.MHHome;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import dta.json.plan.Plan;
import inab.pro.wpro09.resources.VerificaUsuario;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import lire044.DocumentoInab; // cámbialo a lire047.DocumentoInab cuando tengas el modelo propio
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

@Named(value = "lire047")
@ViewScoped
public class LIRE047 implements Serializable {

    // ==================== INYECCIONES ====================
    @Inject
    private MHHome mhome;

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
    private boolean bot6 = false;  // bloquear edición de RESUELVE

    // ==================== DOCUMENTO ====================
    private String fechaFormateada = "";
    private String noResolucion;
    private boolean validezDocumento;
    private String rutaNombre = ""; // usado por los iframes

    // ==================== DATOS DOCUMENTO ====================
    private String direccion = "";
    private String[] partesDireccion;
    private String subRegion;
    private String municipio;
    private String departamento;
    private String sede;
    private String departamentoSede;
    private String licencia;
    private String expediente;
    private String planOperativo;
    private String solicitud;
    private String dpi;

    // ==================== BLOQUES DINÁMICOS ====================
    private List<Elemento> considerando = new ArrayList<>();
    private List<Elemento> porTantoLista = new ArrayList<>();
    private List<Elemento> resuelve = new ArrayList<>();

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
        if (considerando.isEmpty()) considerando.add(new Elemento(""));
        if (porTantoLista.isEmpty()) porTantoLista.add(new Elemento(""));
        if (resuelve.isEmpty()) {
            String texto = validezDocumento
                    ? "SE RESUELVE APROBAR la modificación del Plan de Manejo Forestal."
                    : "SE RESUELVE DENEGAR la modificación del Plan de Manejo Forestal.";
            resuelve.add(new Elemento(texto));
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
            this.fechaFormateada = formato.format(hoy);

            // Dirección desde sesión (si existe): "Subregion, Municipio, Departamento"
            this.direccion = String.valueOf(this.mhome.getPer().getCincoCampos().getDato4());
            if (this.direccion != null && this.direccion.contains(",")) {
                this.partesDireccion = direccion.split("\\s*,\\s*");
                if (partesDireccion.length >= 3) {
                    this.subRegion = partesDireccion[0];
                    this.municipio = partesDireccion[1];
                    this.departamento = partesDireccion[2];
                }
            }

            // Defaults razonables si algo viene nulo
            if (this.sede == null || this.sede.isEmpty()) this.sede = this.subRegion;
            if (this.departamentoSede == null || this.departamentoSede.isEmpty()) this.departamentoSede = this.departamento;
            if (this.licencia == null || this.licencia.isEmpty()) this.licencia = "LI-RE-047-2026";
            if (this.expediente == null || this.expediente.isEmpty()) this.expediente = "EXP-INAB-047-2026";
            if (this.planOperativo == null || this.planOperativo.isEmpty()) this.planOperativo = "POA-047-2026";
            if (this.solicitud == null) this.solicitud = "Solicitud de Resolución de Modificación";
            if (this.dpi == null) this.dpi = "0000000000000";

            // --- Redis / Token / Servicio remoto (fail-soft) ----
            String token = null;
            try (Jedis jd = this.ir.obtieneConeccionRedis()) {
                String key = "USU-" + mhome.getPer().getTcUsuario().getUsuarioId();
                token = jd.hget(key, "token");
            } catch (Exception e) {
                Logger.getLogger(LIRE047.class.getName()).log(Level.WARNING, "No se pudo obtener token Redis", e);
            }

            if (token != null && !token.isEmpty()) {
                try {
                    int gestionId = mhome.getPer().getLicencia().getGestion_id();
                    VerificaUsuario ver = new VerificaUsuario();
                    String json = ver.obtienePlan(gestionId, token);
                    Plan pl = this.gs.fromJson(json, Plan.class);
                    this.mhome.getPer().setPplanM(pl);
                } catch (Exception exCall) {
                    Logger.getLogger(LIRE047.class.getName()).log(Level.WARNING,
                            "No fue posible obtener el Plan desde el servicio remoto (se continúa con defaults).", exCall);
                }
            }

            // (Opcional) Lookup de EJB si hiciera falta además de @EJB
            try {
                InitialContext ctx = new InitialContext();
                this.ir = (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
            } catch (NamingException ignore) {
                // si falla el lookup, seguimos con la inyección @EJB
            }

        } catch (Exception ex) {
            Logger.getLogger(LIRE047.class.getName()).log(Level.SEVERE, "Error general en llamar()", ex);
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

    // ==================== CONSIDERANDO ====================
    public void agregarConsiderando() {
        considerando.add(new Elemento(""));
    }

    public void eliminarConsiderando(Elemento e) {
        if (considerando.size() > 1) {
            considerando.remove(e);
        }
    }

    // ==================== POR TANTO ====================
    public void agregarPorTanto() {
        porTantoLista.add(new Elemento(""));
    }

    public void eliminarPorTanto(Elemento e) {
        if (porTantoLista.size() > 1) {
            porTantoLista.remove(e);
        }
    }

    // ==================== RESUELVE ====================
    public void agregarResuelve() {
        resuelve.add(new Elemento(""));
    }

    public void eliminarResuelve(Elemento e) {
        if (resuelve.size() > 1) {
            resuelve.remove(e);
        }
    }

    // ==================== BOTONES / ACCIONES ====================
    public void activarBoton() {
        this.bot1 = true;   // deshabilita "Vista Previa"
        this.bot2 = false;  // habilita "Generar Documento"
        this.bot4 = true;   // bloquea edición de textos
        this.bot5 = true;
        this.bot6 = true;   // bloquea RESUELVE
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
    public void generarDocumento047VistaPrevia() {
        boolean ok = true;

        if (!isNotBlank(noResolucion)) {
            addMsg(FacesMessage.SEVERITY_WARN, "Falta dato", "Ingrese el número de Resolución.");
            ok = false;
        }
        if (!hasAtLeastOneFilled(considerando)) {
            addMsg(FacesMessage.SEVERITY_WARN, "Falta CONSIDERANDO", "Agregue al menos un CONSIDERANDO y que no esté vacío.");
            ok = false;
        }
        if (!hasAtLeastOneFilled(porTantoLista)) {
            addMsg(FacesMessage.SEVERITY_WARN, "Falta POR TANTO", "Agregue al menos un POR TANTO y que no esté vacío.");
            ok = false;
        }
        if (!hasAtLeastOneFilled(resuelve)) {
            addMsg(FacesMessage.SEVERITY_WARN, "Falta RESUELVE", "Agregue al menos un RESUELVE y que no esté vacío.");
            ok = false;
        }

        if (!ok) {
            PF.current().ajax().update("form047:msg");
            return;
        }

        // TODO: Genera tu documento real, setea rutaNombre
        // this.rutaNombre = "<ruta del PDF generado>";

        PrimeFaces.current().executeInitScript("PF('productDialog').show();");

        // Si quieres bloquear edición justo después de Vista Previa:
        // activarBoton();
    }

    public void generarDocumento047Final() {
        // TODO: Cambiar estado a "Generado", grabar histórico, etc.
        this.bot2 = true;
    }

    // ==================== GETTERS/SETTERS ====================

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

    public String getNoResolucion() {
        return noResolucion;
    }

    public void setNoResolucion(String noResolucion) {
        this.noResolucion = noResolucion;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDepartamentoSede() {
        return departamentoSede;
    }

    public void setDepartamentoSede(String departamentoSede) {
        this.departamentoSede = departamentoSede;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getPlanOperativo() {
        return planOperativo;
    }

    public void setPlanOperativo(String planOperativo) {
        this.planOperativo = planOperativo;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public List<Elemento> getConsiderando() {
        return considerando;
    }

    public void setConsiderando(List<Elemento> considerando) {
        this.considerando = considerando;
    }

    public List<Elemento> getPorTantoLista() {
        return porTantoLista;
    }

    public void setPorTantoLista(List<Elemento> porTantoLista) {
        this.porTantoLista = porTantoLista;
    }

    public List<Elemento> getResuelve() {
        return resuelve;
    }

    public void setResuelve(List<Elemento> resuelve) {
        this.resuelve = resuelve;
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