/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juridico;

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
import javax.naming.NamingException;
import lire044.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

/**
 *
 * @author WINDOWS
 */
@Named(value = "lire044")
@ViewScoped
public class LIRE044 implements Serializable {

    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;

    @EJB
    private PERFIL.EJBGestionREDLocal ir = null;

    private Gson gs = new Gson();

    private Date hoy = new Date();

    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    private String fechaFormateada = "";
    private boolean bot = false;
    private boolean bot1 = false;
    private boolean bot2 = true;
    private boolean bot4 = false;
    private boolean bot5 = false;
    private boolean bot6 = false;
    private String nomXML = "";
    private String rutaNombre = "";
    private String tipoActualizacion = "0";
    private String noDictamen;
    private String direccion = "";
    private String[] partesDireccion;
    private String subRegion;
    private String municipio;
    private String departamento;
    private String nombreDirectorSub = "";
    private String expediente;
    private String licencia;
    private String planOperativo;
    private List<LIRE044.Elemento> antecedentes = new ArrayList<>();
    private List<LIRE044.Elemento> fundamentos = new ArrayList<>();
    private List<LIRE044.Elemento> analisis = new ArrayList<>();
    private boolean validezDocumento;
    
    private List<LIRE044.Elemento> elementos = new ArrayList<>();

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }
    
    public void agregarElemento() {
        elementos.add(new LIRE044.Elemento(""));
    }

    public void eliminarElemento(LIRE044.Elemento elemento) {
        if(elementos.size()>1)
         elementos.remove(elemento);
    }
    
    private  DocumentoInab  dInab = new  DocumentoInab();

    public DocumentoInab getdInab() {
        return dInab;
    }

    public void setdInab(DocumentoInab dInab) {
        this.dInab = dInab;
    }
    
    

    public String getExpediente() {
        return expediente;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getPlanOperativo() {
        return planOperativo;
    }

    public String getNombreDirectorSub() {
        return nombreDirectorSub;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNoDictamen() {
        return noDictamen;
    }

    public String[] getPartesDireccion() {
        return partesDireccion;
    }

    public void setPartesDireccion(String[] partesDireccion) {
        this.partesDireccion = partesDireccion;
    }

    public String getsSubRegion() {
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
    
    public void setNoDictamen(String noDictamen) {
        this.noDictamen = noDictamen;
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

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
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
    
    

    @PostConstruct
    public void init() {
        String tipo = FacesContext.getCurrentInstance()
            .getExternalContext()
            .getRequestParameterMap()
            .get("tipo");

        if (tipo != null) {
            validezDocumento = Boolean.parseBoolean(tipo);
        }
    }
    
    public String irFormulario(boolean valor) {
        return "li-re-044?faces-redirect=true&tipo=" + valor;
    }

    public void agregarAntecedente() {
        antecedentes.add(new LIRE044.Elemento(""));
    }

    public void eliminarAntecedente(LIRE044.Elemento elemento) {
        if (antecedentes.size() > 1) {
            antecedentes.remove(elemento);
        }
    }

    public void agregarFundamento() {
        fundamentos.add(new LIRE044.Elemento(""));
    }

    public void eliminarFundamento(LIRE044.Elemento elemento) {
        if (fundamentos.size() > 1) {
            fundamentos.remove(elemento);
        }
    }

    public void agregarAnalisis() {
        analisis.add(new LIRE044.Elemento(""));
    }

    public void eliminarAnalisis(LIRE044.Elemento elemento) {
        if (analisis.size() > 1) {
            analisis.remove(elemento);
        }
    }

    public void activarBoton() {
        this.bot1 = true;
        this.bot2 = false;
        this.bot4 = true;// desactiva ingreso para cambiar el texto de la solicitud
        this.bot5 = true;
        this.bot6 = true;
        PF.current().ajax().update(":bot1,:bot2,:bot4,:bot5,:bot6");
    }

    public void activarBotonVistaPrevia() {
        this.bot1 = false;
        this.bot2 = true;
    }

    public void desactivaAmbosBotones() {
        this.bot1 = true;
        this.bot2 = true;

        PrimeFaces.current().executeScript(
                "Swal.fire({"
                + "title: 'Su solicitud fue enviado al INAB',"
                + "text: 'Serás redirigido al inicio',"
                + "icon: 'warning',"
                + "showCancelButton: true,"
                + "confirmButtonText: 'Ir ahora',"
                + "}).then((result) => {"
                + "if (result.isConfirmed) {"
                + "window.location.href = '/WPro09/pages/inicio.xhtml?ra=" + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a; "
                + "}"
                + "});"
        );

        this.mhome.getApi().llamaCualquierPagina("/WPro09/pages/inicio.xhtml?ra=" + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a';");
    }

   

    public void llamar() {
        try {
            this.fechaFormateada = formato.format(hoy);
            this.direccion = this.mhome.getPer().getCincoCampos().getDato4().toString();
            this.partesDireccion = direccion.split("\\s*,\\s*");
            this.subRegion = this.partesDireccion[0];
            this.municipio = this.partesDireccion[1];
            this.departamento = this.partesDireccion[2];
            this.nombreDirectorSub = this.mhome.getPer().getListaTcUsuario().get(0).getUsuarioDesc();
            this.licencia = "LI-RE-0445-2024";
            this.expediente = "EXP-INAB-2023-01872";
            this.planOperativo = "POA-2024-00631";
            
            antecedentes = new ArrayList<>();
            antecedentes.add(new LIRE044.Elemento("Antecedente-11"));
            antecedentes.add(new LIRE044.Elemento("Antecedente-2"));
            
            fundamentos.add(new Elemento(""));
            analisis.add(new Elemento(""));

            System.out.println("licencia :" + mhome.getPer().getLicencia().getNumero_licencia_poa());
            System.out.println("datos de subregion : " + mhome.getPer().getCincoCampos().getDato1());

            Jedis JD = this.ir.obtieneConeccionRedis();
            System.out.println("llave para token: " + "USU-" + mhome.getPer().getTcUsuario().getUsuarioId());
            String token = JD.hget("USU-" + mhome.getPer().getTcUsuario().getUsuarioId(), "token");

            int gestion_id = mhome.getPer().getLicencia().getGestion_id();
            System.out.println("gestion id :" + gestion_id);
            VerificaUsuario ver = new VerificaUsuario();
            String json = ver.obtienePlan(gestion_id, token);

            dta.json.plan.Plan pl = this.gs.fromJson(json, dta.json.plan.Plan.class);

            System.out.println("Valores del Obj dirección: " + pl.getData().get(0).getFincas().get(0).getTcFinca().getDireccion());
            pl.getData().get(0).getPersonas().get(0).getTcPersona().getTcIdioma().getIdiomaDesc();
            JD.set("PLAN-" + mhome.getPer().getTcUsuario().getUsuarioId(), json);

            JD.close();

            this.mhome.getPer().setPplanM(pl);// carga el plan a la session

            InitialContext ctx = new InitialContext();

            this.ir = (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
        } catch (NamingException ex) {
            Logger.getLogger(LIRE044.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Clase auxiliar para representar un elemento
    public static class Elemento implements Serializable {

        private String valor;

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
    
     public void generarDocumento044() {
       // activarBoton();
       
       // creadocumento 044
        Future<lire044.DocumentoInab> dc = cargaDoc.creaDocumento044(mhome.getRu(),mhome.getPer(),this.elementos);
          this.dInab = dc.get();
       
       
    }

    public void generarDocumento044Final() {

    }

}
