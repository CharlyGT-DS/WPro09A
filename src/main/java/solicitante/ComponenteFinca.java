/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import MANEJADORES.MHHome;
import dta.json.plan.Finca;
import dta.json.plan.TcDepartamento;
import dta.json.plan.TcFinca;
import dta.json.plan.TcMunicipio;
import dta.json.plan.TcTipoPropiedad;
import estructuras.GEnericaCincoCampos;
import estructuras.ModeloDocumento;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;

/**
 *
 * @author csandoval
 */
@Named(value = "componenteFinca")
@ViewScoped
public class ComponenteFinca implements Serializable{
    
    @Inject
    private MHHome mhome;
    
    @Inject
    private PlanManejo planManejo;
    
    private TcFinca tcFinca=new TcFinca();
    
    private List<Finca> listaFincas = new ArrayList<>();
    
    private List<TcTipoPropiedad> tcTipo = new ArrayList<>();
    
    private List<TcDepartamento> listaDepartamentos = new ArrayList<>();
    
    private List<TcTipoPropiedad> listaTiposPropiedad = new ArrayList<>();
    
    private TcDepartamento departamento = new TcDepartamento();
    
    private List<TcMunicipio> listaMunicipios = new ArrayList<>();
    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    private TcMunicipio municipioSelect = new TcMunicipio();
    
    private TcTipoPropiedad tipoPropiedad = new TcTipoPropiedad();
    
    private boolean notarioVer=true,departamentoVer=true,municipioVer=true, numeroVer=true,folio=false, numeroFinca=false;
    
    private List<ModeloDocumento> lisModelo = new ArrayList<>();
    
    private String gestion_id;
    
    private List<ModeloDocumento> listaDocumento = new ArrayList<>();

    public List<ModeloDocumento> getListaDocumento() {
        return listaDocumento;
    }

    public void setListaDocumento(List<ModeloDocumento> listaDocumento) {
        this.listaDocumento = listaDocumento;
    }
    
    

    public boolean isNumeroVer() {
        return numeroVer;
    }

    public void setNumeroVer(boolean numeroVer) {
        this.numeroVer = numeroVer;
    }

    public boolean isFolio() {
        return folio;
    }

    public void setFolio(boolean folio) {
        this.folio = folio;
    }
    
    
    public List<ModeloDocumento> getLisModelo() {
        return lisModelo;
    }

    public void setLisModelo(List<ModeloDocumento> lisModelo) {
        this.lisModelo = lisModelo;
    }        

    public TcTipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(TcTipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
        

    public TcDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(TcDepartamento departamento) {
        this.departamento = departamento;
    }

    public List<TcMunicipio> getListaMunicipios() {
        return listaMunicipios;
    }

    public void setListaMunicipios(List<TcMunicipio> listaMunicipios) {
        this.listaMunicipios = listaMunicipios;
    }
        

    public List<Finca> getListaFincas() {
        return listaFincas;
    }

    public void setListaFincas(List<Finca> listaFincas) {
        this.listaFincas = listaFincas;
    }

    public List<TcTipoPropiedad> getTcTipo() {
        return tcTipo;
    }

    public void setTcTipo(List<TcTipoPropiedad> tcTipo) {
        this.tcTipo = tcTipo;
    }

    public List<TcDepartamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<TcDepartamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }    

    public TcFinca getTcFinca() {
        return tcFinca;
    }

    public void setTcFinca(TcFinca tcFinca) {
        this.tcFinca = tcFinca;
    }

    public TcMunicipio getMunicipioSelect() {
        return municipioSelect;
    }

    public void setMunicipioSelect(TcMunicipio municipioSelect) {
        this.municipioSelect = municipioSelect;
    }

    public List<TcTipoPropiedad> getListaTiposPropiedad() {
        return listaTiposPropiedad;
    }

    public void setListaTiposPropiedad(List<TcTipoPropiedad> listaTiposPropiedad) {
        this.listaTiposPropiedad = listaTiposPropiedad;
    }

    public boolean isNumeroFinca() {
        return numeroFinca;
    }

    public void setNumeroFinca(boolean numeroFinca) {
        this.numeroFinca = numeroFinca;
    }
        

    public String getGestion_id() {
    if (this.gestion_id == null) {
            FacesContext ctx = FacesContext.getCurrentInstance();
            UIComponent cc = UIComponent.getCurrentComponent(ctx);
            this.gestion_id = (String) cc.getAttributes().get("gestion_id");
            System.out.println("gestion_id=" + this.gestion_id);
        this.gestion_id = (String) cc.getAttributes().get("gestion_id");
       }
       return this.gestion_id;
    }

    public void setGestion_id(String id) {
        this.gestion_id = id;
    }

    public boolean isNotarioVer() {
        return notarioVer;
    }

    public void setNotarioVer(boolean notarioVer) {
        this.notarioVer = notarioVer;
    }

    public boolean isDepartamentoVer() {
        return departamentoVer;
    }

    public void setDepartamentoVer(boolean departamentoVer) {
        this.departamentoVer = departamentoVer;
    }

    public boolean isMunicipioVer() {
        return municipioVer;
    }

    public void setMunicipioVer(boolean municipioVer) {
        this.municipioVer = municipioVer;
    }

    
    
    public void agregaDocumento(){
 
        System.out.println("tipo propiedad: "+this.tipoPropiedad.getTipoPropiedadDesc());
        
        if(this.tipoPropiedad.getTipoPropiedadDesc().contains("Acta Notarial")){
             notarioVer=true;   
             numeroVer=false;
             folio=false;
             numeroFinca=false;
             departamentoVer=true;
             municipioVer=true;
            
            
        }
        if(this.tipoPropiedad.getTipoPropiedadDesc().contains("Testimonio")){
             notarioVer=true;   
             numeroVer=true;
             folio=false;
             numeroFinca=false;
             departamentoVer=true;
             municipioVer=true;
            
            
        }
        if(this.tipoPropiedad.getTipoPropiedadDesc().contains("Certificaci")){            
            notarioVer=false;    
            numeroVer=false;
            folio=true;
            numeroFinca=true;
            departamentoVer=false;
            municipioVer=false;
        }
        
    
        
        
    }
    private boolean inicializado = false;
    
    public void initComponent(ComponentSystemEvent event) {
    if (inicializado) {
        return; // ❗ se corre UNA sola vez
    }
             System.out.println(">>> COMPONENTE QUE LLEGÓ: " + event.getComponent().getClass().getName());

    inicializado = true;

    FacesContext fc = FacesContext.getCurrentInstance();
    ELContext el = fc.getELContext();

    // ⬅️ JSF retorna un Object → hay que castear
    UIComponent cc = (UIComponent) fc.getApplication()
            .getELResolver()
            .getValue(el, null, "cc");

    if (cc == null) {
        System.out.println("CC es NULL!!");
        return;
    }

    String gestionId = (String) cc.getAttributes().get("gestion_id");

    this.gestion_id = gestionId;
    cargaDatosFinca( this.gestion_id );
   }
    
    /*
    public void init(String gestion_id){
           
            this.gestion_id =gestion_id;
            System.out.println("gestion_id=" + this.gestion_id);
        System.out.println("postConstrct :"+this.gestion_id);
        cargaDatosFinca(this.gestion_id);
    }
    */
    
    public void cargaDatosFinca(String gestion_id){
       
        System.out.println("componente finca : "+gestion_id);        
        estructuras.PefilInab perfilInab = mhome.getPer();
        this.listaFincas = perfilInab.getPplanM().getData().get(0).getFincas();
        this.tcFinca =  perfilInab.getPplanM().getData().get(0).getFincas().get(0).getTcFinca();
        this.listaTiposPropiedad.clear();
        
        System.out.println("listaDepartamentos :"+this.planManejo.getListaDepartamentos().size());
        
        this.listaDepartamentos =this.planManejo.getListaDepartamentos();
        this.tipoPropiedad = perfilInab.getPplanM().getData().get(0).getFincas().get(0).getTcFinca().getTcTipoPropiedad();
        
        String sql = UTILIDADES.SQL.tiposPropiedad();
        System.out.println(sql);
        List<java.util.LinkedHashMap> lista = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class);
        
      
        System.out.println("antes del for");
       try{
        for(LinkedHashMap cin : lista){  
            try {
                TcTipoPropiedad tpro = new TcTipoPropiedad();
                
                double id = Double.parseDouble(cin.get("grupo_id").toString());
                int grupo_id = (int) id;
                double e_id = Double.parseDouble(cin.get("estado_id").toString());
                int es_id = (int)e_id;
                double es_pro = Double.parseDouble(cin.get("es_propiedad").toString());
                int espro_id = (int) es_pro;
                double tip = Double.parseDouble(cin.get("tipo_propiedad_id").toString());
                int tip_id = (int) tip;
                
                tpro.setGrupoId(grupo_id);
                tpro.setEstadoId(es_id);
                tpro.setEsPropiedad(espro_id);
                tpro.setObservaciones(cin.get("observaciones").toString());
                tpro.setFechaRegistro(formato.parse(cin.get("fecha_registro").toString()));
                tpro.setTipoPropiedadId(tip_id);
                tpro.setTipoPropiedadDesc(cin.get("tipo_propiedad_desc").toString());
                System.out.println("carga un item nuevo ");
                
                this.listaTiposPropiedad.add(tpro);
            } catch (ParseException ex) {
                System.out.println("error: "+ex.getMessage());
                Logger.getLogger(ComponenteFinca.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
       }catch(Exception est){
           System.out.println("error 222 :"+est.getMessage());
       }
        
       // carga el centro de la finca
       try{
       sql = UTILIDADES.SQL.consultaCentroFinca(gestion_id);
       GEnericaCincoCampos genCinco = (GEnericaCincoCampos)  this.mhome.getApi().repuestaApi(new GEnericaCincoCampos(),"JSON", sql);
       
       if(!(genCinco.getDato1()==null)){
           System.out.println("entro");
           tcFinca.setGtmY(Double.parseDouble(genCinco.getDato2().toString()));
           tcFinca.setGtmX(Double.parseDouble(genCinco.getDato1().toString()));
           PrimeFaces.current().ajax().update("baseT");
       
       }else{
           System.out.println("no entro");
       }      
       }catch(Exception es){
           System.out.println("error 22222222 :"+es.getMessage());
       }
        
        
    }// fin del metodo carga datos
    
      public void cargaMunicipios(){
        System.out.println("carga municipios :"+this.departamento.getDepartamentoId());
        int id=this.departamento.getDepartamentoId();
        

        this.listaMunicipios.clear();
      
        System.out.println("id del depto :"+id);
        String sql = UTILIDADES.SQL.todosLosMunicipiosPorIdDepartamento(id);
        System.out.println(sql);
        List<java.util.LinkedHashMap> listaMuni = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql,java.util.LinkedHashMap.class);
        
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
                Logger.getLogger(ComponenteFinca.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
       
        
    }
    
}
