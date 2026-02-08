/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;


import dta.json.plan.Plan;
import estructuras.HISTORICO.DocumentoInab;
import estructuras.Licencias;
import estructuras.RespuestaTareaRegional;
import estructuras.RespuestaTareaSubRegion;
import estructuras.RespuestaTareaUsuario;
import estructuras.RespuestaWSLicencias;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tablas.MANEJO.TcPerfil;
import tablas.MANEJO.TcPersona;
import tablas.MANEJO.TcSubregion;
import tablas.MANEJO.TcUsuario;
import tablas.MANEJO.TcUsuarioPerfilSistema;
/**
 *
 * @author csandoval
 */
public class PefilInabOriginal implements Serializable {
    
    private tablas.MANEJO.TcUsuario tcUsuario = new TcUsuario();
    private tablas.MANEJO.TcPersona tcPersona = new TcPersona();
    private tablas.MANEJO.TcUsuarioPerfilSistema tcUsarioPerfilSistema = new TcUsuarioPerfilSistema();
    private tablas.MANEJO.TcSubregion tcSubregion = new TcSubregion();
    private tablas.MANEJO.TcPerfil tcPerfil = new TcPerfil();
    private tablas.MANEJO.TcPerfil tcPerfilConectado = new TcPerfil();
    private estructuras.GEnericaCincoCampos cincoCampos = new GEnericaCincoCampos();
    private estructuras.HISTORICO.DocumentoInab documentoInab = new DocumentoInab();
    private String doc080 = "";
    private dta.json.plan.Plan pplanM = new Plan();
    private int hombres=0;
    private int mujeres=0;
    private  Point2D.Double centro;
    
    private List<tablas.MANEJO.TcUsuario> listaTcUsuario = new ArrayList();

    public List<TcUsuario> getListaTcUsuario() {
        return listaTcUsuario;
    }

    public void setListaTcUsuario(List<TcUsuario> listaTcUsuario) {
        this.listaTcUsuario = listaTcUsuario;
    }
    
    

    public Point2D.Double getCentro() {
        return centro;
    }

    public void setCentro(Point2D.Double centro) {
        this.centro = centro;
    }
    
    

    public int getHombres() {
        return hombres;
    }

    public void setHombres(int hombres) {
        if(hombres==0){
          this.hombres =0;  
        }else{
          this.hombres =this.hombres + hombres;
        }
    }

    public int getMujeres() {
        return mujeres;
    }

    public void setMujeres(int mujeres) {
        if(mujeres==0){
         this.mujeres=0;
        }else{
          this.mujeres =  this.mujeres + mujeres;
        }
    }
    
    
    
    
    // listado de tecnicos
    private List<RespuestaTareaUsuario> listTecnicos     = new ArrayList<RespuestaTareaUsuario>();
    private RespuestaTareaUsuario tecnicoActual = new RespuestaTareaUsuario();
    
    // listado de secretarias
    private List<RespuestaTareaUsuario> listSecretarias  = new ArrayList<RespuestaTareaUsuario>();
    private RespuestaTareaUsuario secretariaActual = new RespuestaTareaUsuario();
    
    // listado de subregional
    private List<RespuestaTareaRegional> listSubRegional = new ArrayList<RespuestaTareaRegional>();
    private RespuestaTareaRegional subregionalActual = new RespuestaTareaRegional();
    
    // listado de regional
    private List<RespuestaTareaRegional> listRegional    = new ArrayList<RespuestaTareaRegional>();
    private RespuestaTareaRegional regionalActual = new RespuestaTareaRegional();
     
    // listado de juridico
    private List<RespuestaTareaRegional> listJuridico    = new ArrayList<RespuestaTareaRegional>();
    private RespuestaTareaRegional juridicoActual = new RespuestaTareaRegional();
    
    
    // listado de licencias 
    private List<estructuras.Licencias> licencias = new ArrayList<>();
    
    //liencia actual
    private estructuras.Licencias licencia = new Licencias();
    
    
    // repuesta generica diferentes servicios web
    private estructuras.RespuestaWSLicencias rsLicencias = new RespuestaWSLicencias();
    
    // obtjeto para conocer usuario a que subregion pertenece
    private RespuestaTareaSubRegion resUsIdSubRegion = new RespuestaTareaSubRegion();
    
    //cantidad de tareas en la bandeja por usario
    private long cantidadBandeja=0;
    
     public long getCantidadBandeja() {
        return cantidadBandeja;
    }

    public void setCantidadBandeja(long cantidadBandeja) {
        this.cantidadBandeja = cantidadBandeja;
    }    

    public TcUsuario getTcUsuario() {
        return tcUsuario;
    }

    public void setTcUsuario(TcUsuario tcUsuario) {
        this.tcUsuario = tcUsuario;
    }

    public TcPersona getTcPersona() {
        return tcPersona;
    }

    public void setTcPersona(TcPersona tcPersona) {
        this.tcPersona = tcPersona;
    }

    public TcUsuarioPerfilSistema getTcUsarioPerfilSistema() {
        return tcUsarioPerfilSistema;
    }

    public void setTcUsarioPerfilSistema(TcUsuarioPerfilSistema tcUsarioPerfilSistema) {
        this.tcUsarioPerfilSistema = tcUsarioPerfilSistema;
    }

    public TcSubregion getTcSubregion() {
        return tcSubregion;
    }

    public void setTcSubregion(TcSubregion tcSubregion) {
        this.tcSubregion = tcSubregion;
    }

    public List<RespuestaTareaUsuario> getListTecnicos() {
        return listTecnicos;
    }

    public void setListTecnicos(List<RespuestaTareaUsuario> listTecnicos) {
        this.listTecnicos = listTecnicos;
    }

    public RespuestaTareaUsuario getTecnicoActual() {
        return tecnicoActual;
    }

    public void setTecnicoActual(RespuestaTareaUsuario tecnicoActual) {
        this.tecnicoActual = tecnicoActual;
    }

    public List<RespuestaTareaUsuario> getListSecretarias() {
        return listSecretarias;
    }

    public void setListSecretarias(List<RespuestaTareaUsuario> listSecretarias) {
        this.listSecretarias = listSecretarias;
    }

    public RespuestaTareaUsuario getSecretariaActual() {
        return secretariaActual;
    }

    public void setSecretariaActual(RespuestaTareaUsuario secretariaActual) {
        this.secretariaActual = secretariaActual;
    }

    public List<RespuestaTareaRegional> getListSubRegional() {
        return listSubRegional;
    }

    public void setListSubRegional(List<RespuestaTareaRegional> listSubRegional) {
        this.listSubRegional = listSubRegional;
    }

    public RespuestaTareaRegional getSubregionalActual() {
        return subregionalActual;
    }

    public void setSubregionalActual(RespuestaTareaRegional subregionalActual) {
        this.subregionalActual = subregionalActual;
    }

    public List<RespuestaTareaRegional> getListRegional() {
        return listRegional;
    }

    public void setListRegional(List<RespuestaTareaRegional> listRegional) {
        this.listRegional = listRegional;
    }

    public RespuestaTareaRegional getRegionalActual() {
        return regionalActual;
    }

    public void setRegionalActual(RespuestaTareaRegional regionalActual) {
        this.regionalActual = regionalActual;
    }

    public List<RespuestaTareaRegional> getListJuridico() {
        return listJuridico;
    }

    public void setListJuridico(List<RespuestaTareaRegional> listJuridico) {
        this.listJuridico = listJuridico;
    }

    public RespuestaTareaRegional getJuridicoActual() {
        return juridicoActual;
    }

    public void setJuridicoActual(RespuestaTareaRegional juridicoActual) {
        this.juridicoActual = juridicoActual;
    }

    public List<Licencias> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencias> licencias) {
        this.licencias = licencias;
    }

    public Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencias licencia) {
        this.licencia = licencia;
    }

    public RespuestaWSLicencias getRsLicencias() {
        return rsLicencias;
    }

    public void setRsLicencias(RespuestaWSLicencias rsLicencias) {
        this.rsLicencias = rsLicencias;
    }

    public RespuestaTareaSubRegion getResUsIdSubRegion() {
        return resUsIdSubRegion;
    }

    public void setResUsIdSubRegion(RespuestaTareaSubRegion resUsIdSubRegion) {
        this.resUsIdSubRegion = resUsIdSubRegion;
    }

    public TcPerfil getTcPerfil() {
        return tcPerfil;
    }

    public void setTcPerfil(TcPerfil tcPerfil) {
        this.tcPerfil = tcPerfil;
    }

    public GEnericaCincoCampos getCincoCampos() {
        return cincoCampos;
    }

    public void setCincoCampos(GEnericaCincoCampos cincoCampos) {
        this.cincoCampos = cincoCampos;
    }

    public TcPerfil getTcPerfilConectado() {
        return tcPerfilConectado;
    }

    public void setTcPerfilConectado(TcPerfil tcPerfilConectado) {
        this.tcPerfilConectado = tcPerfilConectado;
    }

    public DocumentoInab getDocumentoInab() {
        return documentoInab;
    }

    public void setDocumentoInab(DocumentoInab documentoInab) {
        this.documentoInab = documentoInab;
    }

    public String getDoc080() {
        return doc080;
    }

    public void setDoc080(String doc080) {
        this.doc080 = doc080;
    }

    public Plan getPplanM() {
        return pplanM;
    }

    public void setPplanM(Plan pplanM) {
        this.pplanM = pplanM;
    }

    
    
    public PefilInabOriginal(){
        
        
    }
    
    
    
    
    
    
}
