/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnico;

import HILOS.Historico;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import dta.json.plan.Propietario;
import dta.json.plan.TcUsuario;
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
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import lire043.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;


/**
 *
 * @author WINDOWS
 */
@Named(value = "lire043")
@ViewScoped
public class LIRE043 implements Serializable {

    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;

    @EJB
    private PERFIL.EJBGestionREDLocal ir = null;

    private Gson gs = new Gson();

    private Date hoy = new Date();

    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private  DocumentoInab  dInab = new  DocumentoInab();

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
    private String subRegion;
    private String Sede;
    private String municipio;
    private String departamento;
    private String nombreDirectorSub = "";
    private String expediente;
    private String propietario;
    private String nombreFinca;
    private String ubicacionFinca;
    private String licencia;
    private String planOperativo;
    private List<LIRE043.Elemento> conclusiones = new ArrayList<>();
    private List<LIRE043.Elemento> decisiones = new ArrayList<>();
    private List<Propietario> propietarios = new ArrayList<>();
 
    private boolean validezDocumento;

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    
    

    public String getExpediente() {
        return expediente;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNombreFinca() {
        return nombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public String getUbicacionFinca() {
        return ubicacionFinca;
    }

    public void setUbicacionFinca(String ubicacionFinca) {
        this.ubicacionFinca = ubicacionFinca;
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

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
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

    public List<Elemento> getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(List<Elemento> conclusiones) {
        this.conclusiones = conclusiones;
    }

    public List<Elemento> getDecisiones() {
        return decisiones;
    }

    public void setDecisiones(List<Elemento> decisiones) {
        this.decisiones = decisiones;
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
        return "li-re-043?faces-redirect=true&tipo=" + valor;
    }

    public void agregarDecision() {
        decisiones.add(new LIRE043.Elemento(""));
    }

    public void eliminarDecision(LIRE043.Elemento elemento) {
        if (decisiones.size() > 1) {
            decisiones.remove(elemento);
        }
    }
    
    public void agregarConclusion() {
        conclusiones.add(new LIRE043.Elemento(""));
    }

    public void eliminarConclusion(LIRE043.Elemento elemento) {
        if (conclusiones.size() > 1) {
            conclusiones.remove(elemento);
        }
    }

    public void activarBoton() {
        this.bot1 = true;
        this.bot2 = false;
        this.bot4 = true;// desactiva ingreso para cambiar el texto de la solicitud
        this.bot5 = true;
        PF.current().ajax().update(":bot1,:bot2,:bot4,:bot5");
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
                + "window.location.href = '/WPro09A/pages/inicio.xhtml?ra=" + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a; "
                + "}"
                + "});"
        );

        this.mhome.getApi().llamaCualquierPagina("/WPro09A/pages/inicio.xhtml?ra=" + mhome.getPer().getTcUsuario().getUsuarioId() + "&rx=a';");
    }

    public void llamar() {
        try {
            
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
            this.fechaFormateada = formato.format(hoy);
            this.departamento = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getTcDepartamento().getDepartamentoDesc();
            this.municipio = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcMunicipio().getMunicipioDesc();
            this.subRegion = mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getAlias() + " " + 
                             mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getSubregionDesc();
            this.direccion = this.municipio +", "+ this.departamento +", "+ this.subRegion;
            this.nombreDirectorSub = this.mhome.getPer().getPplanM().getData().get(0).getTcSubregion().getTcSubregional().getPersonaDesc();
            this.propietario = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getPropietarios().get(0).getTcPersona().getPersonaDesc();
            this.nombreFinca = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getFincaDesc();
            this.ubicacionFinca = this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getDireccion() + ", " +
                                  this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getMunicipioDesc() + ", " +
                                  this.mhome.getPer().getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcMunicipio().getTcDepartamento().getDepartamentoDesc();
            this.licencia = "LI-RE-043-2024";
            this.expediente = this.mhome.getPer().getPplanM().getData().get(0).getExpediente();
            this.planOperativo = "POA-2024-00631";
            
            decisiones.add(new LIRE043.Elemento(""));
            conclusiones.add(new LIRE043.Elemento(""));
      
            

            this.ir = (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
        } catch (NamingException ex) {
            Logger.getLogger(LIRE043.class.getName()).log(Level.SEVERE, null, ex);
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
    
     public void generarDocumento043() {
        try {
            // creadocumento 043
            Future<lire043.DocumentoInab> of = cargaDoc.creaDocumento043(mhome.getRu(),mhome.getPer(),this.conclusiones,this.decisiones,this.validezDocumento,this.noDictamen);
            
            this.dInab = of.get();
            //crea xml 
             Future<String> xml = cargaDoc.creaXML43(mhome.getPer(),"PRO09","P4","043", dInab);
             
             String valor = xml.get();
             // graba el xml
             Future<String> gxml = cargaDoc.grabaXML43(valor, dInab);
             
             String r = gxml.get();
             
             // setea nombres
             this.nomXML = dInab.getDictamenTecnicoModificacion().getVisor().getVista().getRutaPdf();
             // String xq=UTILIDADES.Xquery.xmlConsultaDocumento(dInab.getExpediente(), nomXML);
             
             this.rutaNombre = this.nomXML;
               
             
             // crea documento en vista preiva
             Future<String> gs = cargaDoc.generarReporte(dInab.getDictamenTecnicoModificacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"043",dInab.getLicencia());             
             String sp = gs.get();
             System.out.println(sp);                                       
             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(LIRE043.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void generarDocumento043Final() {

        try {
            // nombre de archivo temporal
            String n = this.dInab.getDictamenTecnicoModificacion().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.dInab.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.dInab.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            DocumentoInab temp =  UTILIDADES.FuncionesComunes.fromXml(xml, DocumentoInab.class);
            // cambia a Generado el estado del xml
            temp.setEstado("Generado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML43(mhome.getPer(),"PRO09","P4","043", temp);
            // obtiene el xml final
            String valor = xmlfin.get();
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML43(valor, temp);
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
             Future<String> gs = cargaDoc.generarReporte(dInab.getDictamenTecnicoModificacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),r,"043",dInab.getLicencia());             
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
            Logger.getLogger(LIRE043.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE043.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE043.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
