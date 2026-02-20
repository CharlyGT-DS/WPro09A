/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import HILOS.GrabaPlanRedis;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import com.google.gson.Gson;
import dta.json.plan.Notificacione;
import dta.json.plan.Persona;
import dta.json.plan.Plan;
import dta.json.plan.TcCultura;
import dta.json.plan.TcDepartamento;
import dta.json.plan.TcEstadoCivil;
import dta.json.plan.TcIdioma;
import dta.json.plan.TcMunicipio;
import dta.json.plan.TcOcupacion;
import dta.json.plan.TcPais;
import dta.json.plan.TcPersona;
import dta.json.plan.TcSexo;
import dta.json.plan.TcTipoNotificacion;
import dta.json.plan.TtTipoPropietarioGestion;
import estructuras.GEnericaCincoCampos;
import estructuras.RespuestaPersonas;
import estructuras.TipoEntidad;
import inab.pro.wpro09.resources.VerificaUsuario;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
@Named(value = "planManejo")
@ViewScoped
public class PlanManejo implements Serializable {

    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
    
    private String tipoSolicitante = "";
    private boolean verGeneralSeccionUno;
    private boolean tipoEmpresaVer = true;
    private String tipoEmporesa = "";
    private TtTipoPropietarioGestion tg = new TtTipoPropietarioGestion();
    private Gson gs = new Gson();
    private List<TcOcupacion> listaOcupaciones = new ArrayList<>(); // lista de ocupaciones
    private TcOcupacion ocupacionSelect = new TcOcupacion();        // ocupacion seleccionada
    private List<TcDepartamento> listaDepartamentos = new ArrayList<>();
    private TcDepartamento departamento = new TcDepartamento();
    private List<TcMunicipio> listaMunicipios = new ArrayList<>();
    private TcMunicipio municipioSelect = new TcMunicipio();
    private TcMunicipio municipioSelect2 = new TcMunicipio();
    
    private List<TcIdioma> listaIdio = new ArrayList<>();
    private TcIdioma idiomaSelect = new TcIdioma();
    private List<TcCultura> listaCultura = new ArrayList<>();
    private TcCultura culturaSelect = new TcCultura();
    private dta.json.plan.Persona persona = new Persona();
    private dta.json.plan.Persona persona2 = new Persona();
    private List<dta.json.plan.Persona> lpersona = new ArrayList<>();
    
    private List<TcSexo> listaSexo = new ArrayList<>();
    private TcSexo sexoSelect = new TcSexo(); 
    private List<TcEstadoCivil> listaEstado = new ArrayList<>();
    private TcEstadoCivil civilSelect = new TcEstadoCivil();
    private dta.json.plan.Plan plan = new Plan();
    private String nombreBusqueda="sandoval";    
    private String estadoEtapa="";
    private String indiceAcordion="";    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String tipoAccion="";
    private String datoIngresado="";
    private RespuestaPersonas personas = new RespuestaPersonas();
    private TcPersona personaSelect = new TcPersona();
    private boolean verField=false;
    private boolean verBotMapa = false;
    private String placeHolderData="";
    private String tipoNotificacion ="0";
    private String valorNotificacion="";
    private String json="";
    private String ruta="";

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isVerBotMapa() {
        return verBotMapa;
    }

    public void setVerBotMapa(boolean verBotMapa) {
        this.verBotMapa = verBotMapa;
    }    

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
    
    
    public String getValorNotificacion() {
        return valorNotificacion;
    }

    public void setValorNotificacion(String valorNotificacion) {
        this.valorNotificacion = valorNotificacion;
    }

    public TcMunicipio getMunicipioSelect2() {
        return municipioSelect2;
    }

    public void setMunicipioSelect2(TcMunicipio municipioSelect2) {
        this.municipioSelect2 = municipioSelect2;
    }
        

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
        

    public boolean isVerField() {
        return verField;
    }

    public void setVerField(boolean verField) {
        this.verField = verField;
    }

    public String getPlaceHolderData() {
        return placeHolderData;
    }

    public void setPlaceHolderData(String placeHolderData) {
        this.placeHolderData = placeHolderData;
    }
        
   
    public TcPersona getPersonaSelect() {
        return personaSelect;
    }

    public void setPersonaSelect(TcPersona personaSelect) {
        this.personaSelect = personaSelect;
    }
        

    public String getNombreBusqueda() {
        return nombreBusqueda;
    }

    public void setNombreBusqueda(String nombreBusqueda) {
        this.nombreBusqueda = nombreBusqueda;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    
    public List<TcSexo> getListaSexo() {
        return listaSexo;
    }

    public void setListaSexo(List<TcSexo> listaSexo) {
        this.listaSexo = listaSexo;
    }

    public TcSexo getSexoSelect() {
        return sexoSelect;
    }

    public void setSexoSelect(TcSexo sexoSelect) {
        this.sexoSelect = sexoSelect;
    }
    
    public List<TcDepartamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<TcDepartamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public TcDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(TcDepartamento departamento) {
        this.departamento = departamento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }   

    public List<TcIdioma> getListaIdio() {
        return listaIdio;
    }

    public void setListaIdio(List<TcIdioma> listaIdio) {
        this.listaIdio = listaIdio;
    }

    public TcIdioma getIdiomaSelect() {
        return idiomaSelect;
    }

    public void setIdiomaSelect(TcIdioma idiomaSelect) {
        this.idiomaSelect = idiomaSelect;
    }

    public List<TcCultura> getListaCultura() {
        return listaCultura;
    }

    public void setListaCultura(List<TcCultura> listaCultura) {
        this.listaCultura = listaCultura;
    }

    public TcCultura getCulturaSelect() {
        return culturaSelect;
    }

    public void setCulturaSelect(TcCultura culturaSelect) {
        this.culturaSelect = culturaSelect;
    }

    public List<TcEstadoCivil> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(List<TcEstadoCivil> listaEstado) {
        this.listaEstado = listaEstado;
    }

    public TcEstadoCivil getCivilSelect() {
        return civilSelect;
    }

    public void setCivilSelect(TcEstadoCivil civilSelect) {
        this.civilSelect = civilSelect;
    }    

    public List<TcMunicipio> getListaMunicipios() {
        return listaMunicipios;
    }

    public void setListaMunicipios(List<TcMunicipio> listaMunicipios) {
        this.listaMunicipios = listaMunicipios;
    }

    public TcMunicipio getMunicipioSelect() {
        return municipioSelect;
    }

    public void setMunicipioSelect(TcMunicipio municipioSelect) {
        this.municipioSelect = municipioSelect;
    }


    public TcOcupacion getOcupacionSelect() {
        return ocupacionSelect;
    }

    public void setOcupacionSelect(TcOcupacion ocupacionSelect) {
        this.ocupacionSelect = ocupacionSelect;
    }

    public String getIndiceAcordion() {
        return indiceAcordion;
    }

    public void setIndiceAcordion(String indiceAcordion) {
        this.indiceAcordion = indiceAcordion;
    }
    
    
    public List<TcOcupacion> getListaOcupaciones() {
        return listaOcupaciones;
    }

    public void setListaOcupaciones(List<TcOcupacion> listaOcupaciones) {
        this.listaOcupaciones = listaOcupaciones;
    }

    public Persona getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    public List<Persona> getLpersona() {
        return lpersona;
    }

    public void setLpersona(List<Persona> lpersona) {
        this.lpersona = lpersona;
    }
    

    public TtTipoPropietarioGestion getTg() {
        return tg;
    }

    public void setTg(TtTipoPropietarioGestion tg) {
        this.tg = tg;
    }

    public String getDatoIngresado() {
        return datoIngresado;
    }

    public void setDatoIngresado(String datoIngresado) {
        this.datoIngresado = datoIngresado;
    }

    public RespuestaPersonas getPersonas() {
        return personas;
    }

    public void setPersonas(RespuestaPersonas personas) {
        this.personas = personas;
    }
    
    

    public boolean isTipoEmpresaVer() {
        return tipoEmpresaVer;
    }

    public void setTipoEmpresaVer(boolean tipoEmpresaVer) {
        this.tipoEmpresaVer = tipoEmpresaVer;
    }

    public String getTipoEmporesa() {
        return tipoEmporesa;
    }

    public void setTipoEmporesa(String tipoEmporesa) {
        this.tipoEmporesa = tipoEmporesa;
    }

    public boolean isVerGeneralSeccionUno() {
        return verGeneralSeccionUno;
    }

    public void setVerGeneralSeccionUno(boolean verGeneralSeccionUno) {
        this.verGeneralSeccionUno = verGeneralSeccionUno;
    }

    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    public void setTipoSolicitante(String tipoSolicitante) {
        this.tipoSolicitante = tipoSolicitante;
    }

    public MHHome getMhome() {
        return mhome;
    }

    public void setMhome(MHHome mhome) {
        this.mhome = mhome;
    }
    
    public void muestraBotonMapa(){
        this.verBotMapa=true; 
    }
    
    public void eliminarElemento(Notificacione elemento) {
        System.out.println(elemento.getNotificacionGestionDesc() +"  "+elemento.getTcTipoNotificacion().getTipoNotificacionId());
        if(!(elemento.getTcTipoNotificacion().getTipoNotificacionId()==1)){
        if(this.mhome.getPer().getPplanM().getData().get(0).getNotificaciones().size()>1)
         this.mhome.getPer().getPplanM().getData().get(0).getNotificaciones().remove(elemento);
         PrimeFaces.current().ajax().update(":form:tabw:acc:nof");
        }else{
            FacesContext.getCurrentInstance().addMessage("Error", this.mhome.getApi().creaMensajeError("No puede quitaar una dirección"));
            
        }
    }
    
    public void agregarElemento() {
        
        this.plan.getData().get(0).getNotificaciones().add(new Notificacione());
        
    }
    
   
    public void datosPoligono(){
      /*
    HttpClient client = HttpClient.newHttpClient();
    String appBTargetUrl = "http://localhost:6060/GISPruebas/faces/view/template/AService.xhtml";
    
    // El JSON que quieres enviar
    String jsonToSend = UTILIDADES.JSON.puntosJson();

    // Formatea los datos como si fuera un formulario HTML: "nombre_parametro=valor_codificado"
    String formBody = "json=" + URLEncoder.encode(jsonToSend, StandardCharsets.UTF_8);

    try {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(appBTargetUrl))
                // Especifica el tipo de contenido como formulario URL-encoded
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(formBody))
                .build();

        // Esta llamada POST se hace server-to-server.
        // No abre un diálogo. Simplemente envía los datos y obtiene la respuesta HTML.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        // ¡PROBLEMA! Esto ejecuta la página en el servidor y te devuelve el HTML renderizado.
        // No abre la página en el navegador del usuario dentro de un p:dialog.
        String htmlResultante = response.body();
        // Ahora, abre el diálogo pasando el ID como GET a la página JSF
        openPDialog("a1");
        
        
        // Tendrías que mostrar este HTML de alguna manera en tu p:dialog local.

    } catch (Exception e) {
        e.printStackTrace();
    }
         */
      
       String sql = UTILIDADES.SQL.consultaPuntosPorIdGestion(mhome.getPer().getLicencia().getGestion_id());
           
       GEnericaCincoCampos genCinco = (GEnericaCincoCampos) this.mhome.getApi().repuestaApi(new GEnericaCincoCampos(),"JSON", sql,"24.199.121.192");
        this.json= "["+genCinco.getDato3().toString()+"]";
      
        //Guardamos el JSON en sesión
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
        session.setAttribute("json",this.json);

        // Establecemos la ruta del include (solo después de tener datos)
        this.ruta = "/view/template/AService.xhtml";

        System.out.println("JSON guardado en sesión: " + this.json);
       
     
      
    }
    
   
    private void openPDialog(String txId) {
        // Esta es la URL de la página JSF, que ahora espera un parámetro GET "jsonTxId"
        String dialogUrl = "http://localhost:6060/GISPruebas/faces/view/template/AService.xhtml";
        System.out.println("entro a llamar {la página ");
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("closable",true);
        options.put("width", 800);
        options.put("height", 600);
        
        // Usar Dialog Framework para cargar la URL en un iframe
        PrimeFaces.current().dialog().openDynamic(dialogUrl, options, null);
    }

    public void verCampos(){
        
      
        if(this.tipoNotificacion.compareTo("1")==0){
            this.placeHolderData="Diección Domiciliar";
        }
        if(this.tipoNotificacion.compareTo("2")==0){
            this.placeHolderData="Ditección Oficina";
        }         
        
        if(this.tipoNotificacion.compareTo("3")==0){
            this.placeHolderData="Teléfono";
        }
        if(this.tipoNotificacion.compareTo("4")==0){
             this.placeHolderData="Celular";
            
        }
        if(this.tipoNotificacion.compareTo("5")==0){
             this.placeHolderData="CorreoElectronico";
        }
        this.verField=true;
   
    }
    
    public void agregarNotificacion(){
     try{
          System.out.println("aqui ");
         if(this.municipioSelect2==null){
             this.municipioSelect2 = new TcMunicipio();
             System.out.println("el municipio va nulo");
         }
          System.out.println("aqui 0");
        Notificacione noti =new Notificacione();
        
        int ultimo = this.mhome.getPer().getPplanM().getData().get(0).getNotificaciones().size()-1;
        
        Notificacione no = this.mhome.getPer().getPplanM().getData().get(0).getNotificaciones().get(ultimo);
     
        noti.setNotificacionGestionId(no.getNotificacionGestionId()+1);
        noti.setFechaAsignacion(new Date());
        
        // carga la consulta
        String sql = UTILIDADES.SQL.tipoNotificacionPorID(this.tipoNotificacion);
      
        // api
        GEnericaCincoCampos tp = (GEnericaCincoCampos)  this.mhome.getApi().repuestaApi(new GEnericaCincoCampos(), "JSON", sql,"24.199.121.192");       
      
        // carga el tipo de notificacion
        TcTipoNotificacion v = new TcTipoNotificacion();
    
        double d2,d3,d4;
        d2=Double.parseDouble(tp.getDato2().toString());
        d3=Double.parseDouble(tp.getDato3().toString());
        d4=Double.parseDouble(tp.getDato4().toString());
        
        v.setTipoNotificacionId(Integer.parseInt(this.tipoNotificacion.toString()));
        v.setTipoNotificacionDesc(tp.getDato1().toString());
        v.setFechaRegistro(formato.parse("2018-09-10 07:53:19"));
        v.setEsDireccion((int)d2);
        v.setEsObligatorio((int)d3);
        v.setMaxlength((int)d4);
        v.setType(tp.getDato5().toString()); 
        System.out.println("aqui 1");
    
        this.municipioSelect2.setEstadoId(1);
       
        if(!(this.departamento == null))
        this.municipioSelect2.setTcDepartamento(this.departamento);
       
        noti.setTcTipoNotificacion(v);
        if(!(this.municipioSelect2==null))
        noti.setTcMunicipio(this.municipioSelect2);
      
        noti.setEstadoId(1);
     
        noti.setNotificacionGestionDesc(this.valorNotificacion);
        
        this.mhome.getPer().getPplanM().getData().get(0).getNotificaciones().add(noti);
        // grabar el plan en ExistDB
        
        this.valorNotificacion="";
        
        System.out.println("ingresa para agregar nueva notificcacion");
        
     }catch(Exception es){
         System.out.println("Error: "+es.getMessage());
     }
        
    }
    
    public void agregaPersona(){
        // agrega la persona al plan
        
        System.out.println("nombre seleccionado :"+this.personaSelect.getPersonaDesc());
        
        dta.json.plan.Persona nuevaPersona = new Persona();
        nuevaPersona.setEstadoId(1);
        nuevaPersona.setTcPersona(this.personaSelect);
        nuevaPersona.setSoloRepresenta(0);
        nuevaPersona.setRepresentanteLegal(0);
        nuevaPersona.setExpediente(this.mhome.getPer().getPplanM().getData().get(0).getExpediente());
        nuevaPersona.setFechaRegistro(new Date());
        System.out.println("agregara una nuevapersona");
        
          String sql = UTILIDADES.SQL.datosPersonaGestionUltimoRegistro();
                
                List<java.util.LinkedHashMap> lista = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
                GEnericaCincoCampos gen =null;
                for(java.util.LinkedHashMap s: lista){
                    
                    gen = new GEnericaCincoCampos();
                    gen.setDato1(s.get("data1").toString());
                    gen.setDato2(s.get("data2").toString());
                    gen.setDato3(s.get("data3").toString());
                }
                
                System.out.println("data1 :"+gen.getDato1().toString());
                int id = Integer.parseInt(gen.getDato1().toString().replaceAll(".0",""));
        
        
        nuevaPersona.setPersonaGestionId(id);
        System.out.println("id:  "+id);
        
        
        this.mhome.getPer().getPplanM().getData().get(0).getPersonas().add(nuevaPersona);
        PrimeFaces.current().ajax().update("form:tabw:acc:basicDT");
        
           cargaValoredDefault();
        
        PrimeFaces.current().ajax().update("form:tabw:acc:datosHombreMuje");
        this.personaSelect = new TcPersona();
    }
    
    public void quitarPersona(){
        
        System.out.println("dato:   para quitar :"+this.persona.getTcPersona().getPersonaDesc());
        
        this.mhome.getPer().getPplanM().getData().get(0).getPersonas().remove(this.persona);
        
        cargaValoredDefault();
        
         PrimeFaces.current().ajax().update(":form:tabw:acc:basicDT");
        
         PrimeFaces.current().ajax().update("form:tabw:acc:datosHombreMuje");
        
    }

    public void verSeccionUno() {

        if (this.tipoSolicitante.compareTo("2") == 0) {
            this.verGeneralSeccionUno = true;
        } else {
            this.verGeneralSeccionUno = false;
        }

    }

    public void verNombreComercial() {

        if (this.tipoEmporesa.compareTo("1") == 0) {
            this.tipoEmpresaVer = true;
        } else {
            this.tipoEmpresaVer = false;
        }

    }
    
    public void actualizarPlaceHolder(){
        this.datoIngresado="";
        
        if(this.nombreBusqueda.compareTo("1")==0){
            
            this.tipoAccion="Ingrese DPI";
         
        }
        if(this.nombreBusqueda.compareTo("2")==0){
            
             this.tipoAccion="Ingrese NIT";
             
           
             
        }
        if(this.nombreBusqueda.compareTo("3")==0){
            
              this.tipoAccion="Ingrese Nombre y un Apellido";
            
        }
        
    }
    
    // agregar representante
    public void agregaRepresenante(dta.json.plan.Persona per){
        
        System.out.println("--> "+per.getTcPersona().getPersonaDesc());
        if(this.lpersona.size()==0){
              
            if(this.mhome.getPer().getPplanM().getData().get(0).getPersonas().remove(per)){
                  per.setRepresentanteLegal(1);
                  this.mhome.getPer().getPplanM().getData().get(0).getPersonas().add(per);
            }
           
        this.lpersona.add(this.persona2); 
        PrimeFaces.current().ajax().update(":form:tabw:acc:repre");
        }
        
    }
    
    // quitar representante
    public void quitarRepresentanteFin(dta.json.plan.Persona per){
        
                System.out.println("es para eliminar");
                this.lpersona.clear();
                
               if(this.mhome.getPer().getPplanM().getData().get(0).getPersonas().remove(per)){
                   per.setRepresentanteLegal(0);
                   this.mhome.getPer().getPplanM().getData().get(0).getPersonas().add(per);
               }
                
                PrimeFaces.current().ajax().update(":form:tabw:acc:repre");        
           
           
    }
    
    public void procesaGrabaPlan(){
        try {
            plan = grabar(this.mhome.getPer().getPplanM());
            // convierte plan
            String json = this.gs.toJson(plan);
            
            Jedis JD = this.ir.obtieneConeccionRedis();
            HILOS.GrabaPlanRedis graPla = new GrabaPlanRedis();
            graPla.setJD(JD);
            graPla.setJsonPlan(json);
            graPla.setIdUsuario(this.mhome.getPer().getTcUsuario().getUsuarioId());
            graPla.start();
            
            Future<String> r = cargaDoc.grabaPLANPorUsuarioID(json,plan.getData().get(0).getExpediente(), this.mhome.getPer().getTcUsuario().getUsuarioId());
            String xml = r.get();
            
            
            
            PrimeFaces.current().executeScript(
                "Swal.fire({" +
                    "title: '¿Se grabó la sección?'," +
                    "text: 'Has actualizado el Plan de Manejo LI-RE-105'," +
                    "icon: 'warning'," +
                    "confirmButtonText: 'Aceptar'" +

                "});"
            );
            
            PrimeFaces.current().executeInitScript("PF('npersona').hide();");
            
            PrimeFaces.current().ajax().update("form:tabw:acc:basicDT");
                                                
           
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void buscarPersona(){
        
         if(this.nombreBusqueda.compareTo("2")==0){
            if(!(UTILIDADES.FuncionesComunes.validarNIT(this.datoIngresado))){
                
              FacesContext.getCurrentInstance().
                addMessage(null,this.mhome.getApi().creaMensajeError("Error el valor ingresado no es un NIT"));
                
            }else{
                
                VerificaUsuario ver = new VerificaUsuario();

                String json = UTILIDADES.JSON.busquedaPorNit(this.datoIngresado);


                Jedis JD = this.ir.obtieneConeccionRedis();

                long idUsuario = this.mhome.getPer().getTcUsuario().getUsuarioId();

                String token = JD.hget("USU-"+idUsuario,"token");

                String jsonr = ver.ejecutarPostBackOffice("http://localhost:8081/persona/busqueda", token, json);

                System.out.println("personas: "+jsonr);

                this.ir.retornRecursoRedis(JD);

                this.personas = this.gs.fromJson(jsonr, estructuras.RespuestaPersonas.class);
                
                
            }
          
         }
         
         if(this.nombreBusqueda.compareTo("1")==0){
            if(!(UTILIDADES.FuncionesComunes.validarCUI(this.datoIngresado))){
                
               FacesContext.getCurrentInstance().
                addMessage(null, this.mhome.getApi().creaMensajeError("Error el valor ingresado no es un DPI"));
                
            }else{
                
                VerificaUsuario ver = new VerificaUsuario();

                String json = UTILIDADES.JSON.busquedaPorDPI(this.datoIngresado);


                Jedis JD = this.ir.obtieneConeccionRedis();

                long idUsuario = this.mhome.getPer().getTcUsuario().getUsuarioId();

                String token = JD.hget("USU-"+idUsuario,"token");

                String jsonr = ver.ejecutarPostBackOffice("http://localhost:8081/persona/busqueda", token, json);

                System.out.println("personas: "+jsonr);

                this.ir.retornRecursoRedis(JD);

                this.personas = this.gs.fromJson(jsonr, estructuras.RespuestaPersonas.class);
                
                
            }
            
         }
            
          if(this.nombreBusqueda.compareTo("3")==0){
        
                VerificaUsuario ver = new VerificaUsuario();

                String json = UTILIDADES.JSON.buscaPersonaPorNombre(this.datoIngresado);


                Jedis JD = this.ir.obtieneConeccionRedis();

                long idUsuario = this.mhome.getPer().getTcUsuario().getUsuarioId();

                String token = JD.hget("USU-"+idUsuario,"token");

                String jsonr = ver.ejecutarPostBackOffice("http://localhost:8081/persona/busqueda", token, json);

                System.out.println("personas: "+jsonr);

                this.ir.retornRecursoRedis(JD);

                this.personas = this.gs.fromJson(jsonr, estructuras.RespuestaPersonas.class);
        
          }
       
        
    }
    
    public void cargaCatalogos(int tipo, Persona per){
        if(tipo==1)
        this.persona = new Persona();
        
        this.listaOcupaciones.clear();
        this.listaDepartamentos.clear();
        this.listaMunicipios.clear();
        this.listaCultura.clear();
        this.listaEstado.clear();
        this.listaSexo.clear();
        
        if(tipo==2){
        String ss = this.gs.toJson(per);
        System.out.println(ss);
        this.persona2 = this.gs.fromJson(ss,Persona.class);
        System.out.println("nombre: "+this.persona2.getTcPersona().getPersonaDesc());
        }
        // busca ocupaciones metodo polimorfico
        String sql = UTILIDADES.SQL.todasLasOcuaciones();
        List<java.util.LinkedHashMap> lis = (List<java.util.LinkedHashMap>) this.getMhome().getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
         
        
        for(java.util.LinkedHashMap s : lis){
            try {
                TcOcupacion tc =new TcOcupacion();
                
                tc.setEstadoId(Integer.parseInt(s.get("estado_id").toString().replaceAll(".0","")));
                tc.setFechaRegistro(formato.parse(s.get("fecha_registro").toString()));
                tc.setOcupacionDesc(s.get("ocupacion_desc").toString());
                tc.setOcupacionId(Integer.parseInt(s.get("ocupacion_id").toString().replaceAll(".0","").replaceAll("","0")));
                if(tc.getOcupacionDesc().compareTo(this.persona2.getTcPersona().getTcOcupacion().getOcupacionDesc())!=0){
                      this.listaOcupaciones.add(tc);
                }else{
                      this.listaOcupaciones.add(0,tc);
                }
              
                
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }// fin de la carga de ocupaciones
        
     
        
       
        
        // busca departamentos metodo polimorfico
        sql = UTILIDADES.SQL.todosLosDepatamentos();
        List<java.util.LinkedHashMap> liDep = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
         
        for(java.util.LinkedHashMap d : liDep){
           
            try {
                String valor ="";
                double val=0;
                 
                 valor = d.get("departamento_id").toString().trim();
                 try{
                
                 val = Double.parseDouble(valor);
                 
                 }catch(java.lang.NumberFormatException et){
                     val=10;
                 }
                TcDepartamento depa = new TcDepartamento();
                depa.setDepartamentoDesc(d.get("departamento_desc").toString());
                depa.setEstadoId(1);
                TcPais tp = new TcPais();
                tp.setEstadoId(1);
                tp.setPaisId(1);
                depa.setTcPais(tp);
                depa.setFechaRegistro(formato.parse(d.get("fecha_registro").toString()));
               
                depa.setDepartamentoId((int)val);
                  
                
                this.listaDepartamentos.add(depa);
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }// fin de carga de departamentos
         this.listaIdio.clear();
        sql = UTILIDADES.SQL.todosLosIdiomas();
        
        List<java.util.LinkedHashMap> listaIdiomas = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
        
        for (java.util.LinkedHashMap id : listaIdiomas){
            
            try {
               
                TcIdioma idoma = new TcIdioma();
                idoma.setEstadoId(1);
                double idt =Double.parseDouble(id.get("idioma_id").toString());
                idoma.setIdiomaId((int)idt);
                
                idoma.setFechaRegistro(formato.parse(id.get("fecha_registro").toString()));
                idoma.setIdiomaDesc(id.get("idioma_desc").toString());
                
                if(tipo==2){
                  
                        if(idoma.getIdiomaDesc().compareTo(this.persona2.getTcPersona().getTcIdioma().getIdiomaDesc())!=0){
                           this.listaIdio.add(idoma);
                        }else{
                           this.listaIdio.add(0, idoma);
                        }
                }else{
                    System.out.println("ioma : 4");
                   
                   //     if(idoma.getIdiomaDesc().compareTo(this.persona.getTcPersona().getTcIdioma().getIdiomaDesc())!=0){
                           this.listaIdio.add(idoma);
                   //     }else{
                   //        this.listaIdio.add(0, idoma);
                   //     }
                    
                    
                     }
                
                
                
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
       
      
        
        
        sql = UTILIDADES.SQL.todosCuolturas();
        List<java.util.LinkedHashMap> listaCultura = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
        for(java.util.LinkedHashMap cul : listaCultura){
            try {
                TcCultura cultu = new TcCultura();
                cultu.setEstadoId(1);
                cultu.setCulturaDesc(cul.get("cultura_desc").toString());
                double id = Double.parseDouble(cul.get("cultura_id").toString());
                cultu.setCulturaId((int)id);
                cultu.setFechaRegistro(formato.parse(cul.get("fecha_registro").toString()));
                this.listaCultura.add(cultu);
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }            
            
        }
        
        sql = UTILIDADES.SQL.todosEstados();
        List<java.util.LinkedHashMap> listaEstados = this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
        for(java.util.LinkedHashMap es : listaEstados){
            try {
                TcEstadoCivil civil = new TcEstadoCivil();
                civil.setEstadoId(1);
                civil.setEstadoCivilDesc(es.get("estado_civil_desc").toString());
                civil.setFechaRegistro(formato.parse(es.get("fecha_registro").toString()));
                double id = Double.parseDouble(es.get("estado_civil_id").toString());
                civil.setEstadoCivilId((int) id);
                this.listaEstado.add(civil);
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                        
        }
        
        sql = UTILIDADES.SQL.todosSexos();
        List<java.util.LinkedHashMap> lsex = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
        
        for(java.util.LinkedHashMap s : lsex){
            
            try {
                TcSexo te = new TcSexo();
                te.setEstadoId(1);
                te.setFechaRegistro(formato.parse(s.get("fecha_registro").toString()));
                te.setSexoDesc(s.get("sexo_desc").toString());
                double ids = Double.parseDouble(s.get("sexo_id").toString());
                te.setSexoId((int)ids);
                
                this.listaSexo.add(te);
                
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }// fin del metodo de catalogos
    
    public void cargaDepartamentos(){
        
         // busca departamentos metodo polimorfico
        String sql = UTILIDADES.SQL.todosLosDepatamentos();
        List<java.util.LinkedHashMap> liDep = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
         
        for(java.util.LinkedHashMap d : liDep){
           
            try {
                String valor ="";
                double val=0;
                 
                 valor = d.get("departamento_id").toString().trim();
                 try{
                
                 val = Double.parseDouble(valor);
                 
                 }catch(java.lang.NumberFormatException et){
                     val=10;
                 }
                TcDepartamento depa = new TcDepartamento();
                depa.setDepartamentoDesc(d.get("departamento_desc").toString());
                depa.setEstadoId(1);
                TcPais tp = new TcPais();
                tp.setEstadoId(1);
                tp.setPaisId(1);
                depa.setTcPais(tp);
                depa.setFechaRegistro(formato.parse(d.get("fecha_registro").toString()));
               
                depa.setDepartamentoId((int)val);
                  
                
                this.listaDepartamentos.add(depa);
            } catch (ParseException ex) {
                System.out.println("error deps: "+ex.getMessage());
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
    }
    
    public void cargaMunicipios(){
        System.out.println("carga municipios :"+this.departamento.getDepartamentoId());
        int id=0;

        try{
     
        this.listaMunicipios.clear();
        System.out.println("uno");
    
        if(this.departamento.equals(null)){
            id= this.persona.getTcPersona().getTcMunicipio().getTcDepartamento().getDepartamentoId();
            System.out.println("dos");     
        }else{
             id = this.departamento.getDepartamentoId();
             System.out.println("tres");
        }
      
        }catch(Exception es){
            System.out.println("data :"+es.getMessage());
        }
        
        System.out.println("cuatro");
        
        System.out.println("id del depto :"+id);
        String sql = UTILIDADES.SQL.todosLosMunicipiosPorIdDepartamento(id);
        System.out.println(sql);
        List<java.util.LinkedHashMap> listaMuni = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
        
        for(java.util.LinkedHashMap m : listaMuni){
            
            try {
                TcMunicipio mu = new TcMunicipio();                
                mu.setCodigo((int)Double.parseDouble(m.get("codigo").toString()));
                mu.setEstadoId(1);
                mu.setFechaRegistro(formato.parse(m.get("fecha_registro").toString()));
                mu.setMunicipioDesc(m.get("municipio_desc").toString());
                mu.setTcDepartamento(this.departamento);
                mu.setMunicipioId(id);
                this.listaMunicipios.add(mu);                                
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
       
        
    }
    
    public void validarDatosFormularioGrabar( int bandera){
        int valor=0;
        
        
        if(!(UTILIDADES.FuncionesComunes.validarCUI(String.valueOf(this.persona.getTcPersona().getCui())))){
             FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error","El CUI no es Valido"));
         valor=1;
            
        }
        
        if(!(UTILIDADES.FuncionesComunes.validarNIT(this.persona.getTcPersona().getNit()))){
              FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error","El NIT es Invalido"));
        
             valor=1;
        }
        
        if(bandera==1){
        if(valor==0){
            
            try {
                this.municipioSelect.setTcDepartamento(this.departamento);
                this.persona.getTcPersona().setTcMunicipio(this.municipioSelect);
                this.persona.getTcPersona().setTcCultura(this.culturaSelect);
                String sql = UTILIDADES.SQL.datosPersonaGestionUltimoRegistro();
                
                List<java.util.LinkedHashMap> lista = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class,"24.199.121.192");
                GEnericaCincoCampos gen =null;
                for(java.util.LinkedHashMap s: lista){
                    
                    gen = new GEnericaCincoCampos();
                    gen.setDato1(s.get("data1").toString());
                    gen.setDato2(s.get("data2").toString());
                    gen.setDato3(s.get("data3").toString());
                }
                
                System.out.println("data1 :"+gen.getDato1().toString());
                int id = Integer.parseInt(gen.getDato1().toString().replaceAll(".0",""));
                System.out.println(id);
                this.persona.setPersonaGestionId(id);
                this.persona.setEstadoId(1);
                this.persona.setFechaRegistro(formato.parse(gen.getDato2().toString()));
                double id2 = Double.parseDouble(gen.getDato3().toString().replaceAll(".0",""));
                this.persona.getTcPersona().setPersonaId((int)id2);           
                this.persona.setSoloRepresenta(0);
                this.persona.setRepresentanteLegal(0);
                
                if(bandera==1){
                this.mhome.getPer().getPplanM().getData().get(0).getPersonas().add(this.persona); // graba la nueva persona en el plan en la sesion
                // graba el plan en la base de datos
                
                this.estadoEtapa="1-2";
                procesaGrabaPlan();
                }
                
                
                
                
                System.out.println(this.gs.toJson(this.persona));
                
            } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
            
           }
        }
        
        
        if(bandera==2){
   
           
            int id= this.persona2.getPersonaGestionId();
            System.out.println("id a eliminar : "+id);
            Iterator<Persona> it = this.mhome.getPer().getPplanM().getData().get(0).getPersonas().iterator();
            while(it.hasNext()){
              Persona pt = it.next();
              if(pt.getPersonaGestionId() == id ){
                  it.remove();// elimina             
                  System.out.println("SE ELIMINO   ");
              }
            }
            
            System.out.println("json: del cambio de persona :"+this.gs.toJson(this.persona2));
           
        
          this.mhome.getPer().getPplanM().getData().get(0).getPersonas().add(this.persona2);
          
          String ss = this.gs.toJson(this.persona2);
          this.persona= this.gs.fromJson(ss,Persona.class);
          PrimeFaces.current().ajax().update(":form:tabw:acc:basicDT");
          
        }
        
        PrimeFaces.current().ajax().update("PF('editar').hide();");

        
    }// fin del metodo
    
    
    //modifica seccion uno plan general tipo de propietario
    public dta.json.plan.Plan grabar(dta.json.plan.Plan plan) {
        
      

        TtTipoPropietarioGestion tpGes = new TtTipoPropietarioGestion();
        
       

        tpGes = plan.getData().get(0).getTtTipoPropietarioGestion();
        
        System.out.println("tipo-entidad: "+tpGes.getTcTipoEntidad().getTipoEntidadDesc());
        
        try {
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(!(this.tg.getRazonSocial().toString().isEmpty())){//juridica
          
                tpGes.setRazonSocial(this.tg.getRazonSocial());
                tpGes.setNitEntidad((this.tg.getNitEntidad().equals(null))?"":this.tg.getNitEntidad());
                tpGes.setNombreComercial((this.tg.getNombreComercial().equals(null))?"":this.tg.getNombreComercial());
                tpGes.getTcTipoPropietario().setTipoPropietarioId(2);
                tpGes.getTcTipoPropietario().setTipoPropietarioDesc("Jurídica");
                tpGes.getTcTipoPropietario().setFechaRegistro(formato.parse("2018-09-06 09:30:03"));
                TipoEntidad tipo = TipoEntidad.fromCodigo(Integer.parseInt(this.tipoEmporesa));
                
                tpGes.getTcTipoEntidad().setTipoEntidadDesc(tipo.getDescripcion());
                tpGes.getTcTipoEntidad().setTipoEntidadId(Double.parseDouble(this.tipoEmporesa+".0"));
                tpGes.getTcTipoEntidad().setEstadoId(1.0);
                
                
                
           
          }else{ // individual
             
             tpGes.getTcTipoPropietario().setTipoPropietarioDesc("Individual");
             tpGes.getTcTipoPropietario().setFechaRegistro(formato.parse("2018-09-06 09:29:57"));
             tpGes.getTcTipoPropietario().setTipoPropietarioId(1);
             tpGes.setRazonSocial(this.tg.getRazonSocial());
             tpGes.setNitEntidad((this.tg.getNitEntidad().equals(null))?"":this.tg.getNitEntidad());
             tpGes.setNombreComercial((this.tg.getNombreComercial().equals(null))?"":this.tg.getNombreComercial());
             tpGes.getTcTipoEntidad().setTipoEntidadDesc("");
             tpGes.getTcTipoEntidad().setTipoEntidadId(Double.parseDouble("0.0"));
             tpGes.getTcTipoEntidad().setEstadoId(0.0);
                
            
          }
           plan.getData().get(0).setTtTipoPropietarioGestion(tpGes);
         } catch (ParseException ex) {
                Logger.getLogger(PlanManejo.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return plan;
    }
    
    public void cargaValoredDefault(){
        
      cargaDepartamentos();
      this.departamento.setDepartamentoId(1);
      cargaMunicipios();
      
      this.valorNotificacion="";
      try{
          this.mhome.getPer().setHombres(0);
          this.mhome.getPer().setMujeres(0);
            
          Iterator<Persona> itp =  this.mhome.getPer().getPplanM().getData().get(0).getPersonas().iterator();
       
          while(itp.hasNext()){
           
           Persona pers = itp.next();
           if(pers.getTcPersona().getTcSexo().getSexoId()==1){ //femenino
                this.mhome.getPer().setMujeres(1);
                System.out.println("mujeres *");
           }else{ //masculino
                this.mhome.getPer().setHombres(1);   
                System.out.println("hombres +");
           }
           
          }
          
          PrimeFaces.current().ajax().update(":form:datosHombreMuje");
        }catch(Exception es){
            
        }
        
    }
    

}// find e la clase
