package juridico;

import MANEJADORES.MHHome;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;

/**
 * Dictamen Jurídico de Enmiendas - LI-RE-006
 */
@Named(value = "lire006")
@ViewScoped
public class lire006 implements Serializable {

    // ====== Inyección de servicios existentes en tu app ======
    @Inject
    private MHHome mhome;

    @EJB
    private EJBGestionREDLocal ir;

    // ====== Utilidades ======
    private final Gson gs = new Gson();
    private final Date hoy = new Date();
    private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

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

    // ====== Secciones dinámicas ======
    private List<Elemento> antecedentes = new ArrayList<>();
    private List<Elemento> fundamentos = new ArrayList<>();
    private List<Elemento> analisis = new ArrayList<>();
    private List<Elemento> conclusiones = new ArrayList<>();

    // ====== Ruta para visor (vista previa / final) ======
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
            Logger.getLogger(lire006.class.getName()).log(Level.WARNING, "No se pudo leer el parámetro 'tipo'", ex);
        }
    }

    /**
     * Carga de datos al ingresar a la vista (ligado a f:viewAction)
     */
    public void llamar() {
        try {
            this.fechaFormateada = formato.format(hoy);

            // Dirección completa "Subregión, Municipio, Departamento"
            this.direccion = String.valueOf(this.mhome.getPer().getCincoCampos().getDato4());
            this.partesDireccion = direccion.split("\\s*,\\s*");

            this.subRegion = (partesDireccion.length > 0) ? partesDireccion[0] : "";
            this.municipio = (partesDireccion.length > 1) ? partesDireccion[1] : "";
            this.departamento = (partesDireccion.length > 2) ? partesDireccion[2] : "";
            this.sede = this.subRegion; // Si tienes una sede distinta, asigna aquí.

            // Nombres visibles
            this.nombreDirectorSub = this.mhome.getPer().getListaTcUsuario().get(0).getUsuarioDesc();

            // ====== Valores por defecto / precarga de "Datos que integran el documento" ======
            // Sustituye por lo que corresponda en tu servicio
            this.noProvidencia = (this.noProvidencia == null) ? "PROV-2026-0001" : this.noProvidencia;
            this.expediente    = (this.expediente == null)    ? "EXP-2026-01234" : this.expediente;
            this.licencia      = (this.licencia == null)      ? "LIC-2026-00099" : this.licencia;
            this.solicitante   = (this.solicitante == null)   ? "Nombre del Solicitante" : this.solicitante;
            this.finca         = (this.finca == null)         ? "Finca Ejemplo" : this.finca;
            this.ubicacionFinca= (this.ubicacionFinca == null)? "Ubicación completa de la finca" : this.ubicacionFinca;

            // Inicializa listas con un elemento vacío para la UI
            if (antecedentes.isEmpty()) antecedentes.add(new Elemento(""));
            if (fundamentos.isEmpty())  fundamentos.add(new Elemento(""));
            if (analisis.isEmpty())     analisis.add(new Elemento(""));
            if (conclusiones.isEmpty()) conclusiones.add(new Elemento(""));

        } catch (Exception ex) {
            Logger.getLogger(lire006.class.getName()).log(Level.SEVERE, "Error en llamar()", ex);
        }
    }

    // ====== Acciones UI ======

    public void agregarAntecedente() { antecedentes.add(new Elemento("")); }
    public void eliminarAntecedente(Elemento e) {
        if (antecedentes.size() > 1) antecedentes.remove(e);
    }

    public void agregarFundamento() { fundamentos.add(new Elemento("")); }
    public void eliminarFundamento(Elemento e) {
        if (fundamentos.size() > 1) fundamentos.remove(e);
    }

    public void agregarAnalisis() { analisis.add(new Elemento("")); }
    public void eliminarAnalisis(Elemento e) {
        if (analisis.size() > 1) analisis.remove(e);
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
        PrimeFaces.current().executeScript(
            "Swal.fire({"
            + "title: 'Su solicitud fue enviada al INAB',"
            + "text: 'Serás redirigido al inicio',"
            + "icon: 'success',"
            + "confirmButtonText: 'Ir ahora'"
            + "}).then((result)=>{ if(result.isConfirmed){ window.location.href='/WPro09/pages/inicio.xhtml?ra="
            + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a'; } });"
        );
    }

    public void generarDocumento006() {
        // TODO: Genera el reporte de vista previa y asigna la ruta
        // this.rutaNombre = "ruta/archivo/previa.pdf";
        System.out.println("Vista previa: validez=" + validezDocumento
                + " | subRegion=" + subRegion
                + " | municipio=" + municipio
                + " | departamento=" + departamento);
    }

    public void generarDocumento006Final() {
        // TODO: Genera el reporte final y asigna la ruta
        // this.rutaNombre = "ruta/archivo/final.pdf";
        System.out.println("Documento FINAL generado");
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

    public List<Elemento> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(List<Elemento> antecedentes) {
        this.antecedentes = antecedentes;
    }

    public List<Elemento> getFundamentos() {
        return fundamentos;
    }

    public void setFundamentos(List<Elemento> fundamentos) {
        this.fundamentos = fundamentos;
    }

    public List<Elemento> getAnalisis() {
        return analisis;
    }

    public void setAnalisis(List<Elemento> analisis) {
        this.analisis = analisis;
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