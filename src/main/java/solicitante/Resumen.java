/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import MANEJADORES.MHHome;
import PATRONES.FacadePlan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dta.json.plan.TcRegentePropuesto;
import dta.json.plan.TcSistemaCorta;
import dta.json.plan.TcTipoFiador;
import dta.json.plan.TcTipoGarantia;
import estructuras.RespuestaValidacion;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;

/**
 *
 * @author WINDOWS
 */
@Named(value = "resumen")
@ViewScoped
public class Resumen implements Serializable {
    
     // inversion del control, iyectado el recurso
    @Inject
    private MHHome mhome;
    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    private Gson gs = new Gson();

    private List<TcTipoGarantia> listaTipoGarantia = new ArrayList<>();
    private TcTipoGarantia tipoGarantiaSeleccionado = new TcTipoGarantia();
    private List<TcSistemaCorta> listaSistemaCorta = new ArrayList<>();
    private TcSistemaCorta sistemaSeleccionado = new TcSistemaCorta();
    private List<TcTipoFiador> listaTipofiador = new ArrayList<>();
    private TcTipoFiador tipoFiadorSeleccionado = new TcTipoFiador();
    private List<TcRegentePropuesto> listaRegentePorpuesto = new ArrayList<>();
    private TcRegentePropuesto RegenteSeleccionado = new TcRegentePropuesto();

    private double vigenciaPlan;
    private double tiempoEjecucion;
    private double edadRotacion;
    private double numeroTurnos;
    private String nombreRepresentante;
    private String dpiRepresentante;
    private double cortaAnual;
    private double incrementeAnual;

    

    public List<TcTipoGarantia> getListaTipoGarantia() {
        return listaTipoGarantia;
    }

    public void setListaTipoGarantia(List<TcTipoGarantia> listaTipoGarantia) {
        this.listaTipoGarantia = listaTipoGarantia;
    }

    public TcTipoGarantia getTipoGarantiaSeleccionado() {
        return tipoGarantiaSeleccionado;
    }

    public void setTipoGarantiaSeleccionado(TcTipoGarantia tipoGarantiaSeleccionado) {
        this.tipoGarantiaSeleccionado = tipoGarantiaSeleccionado;
    }

    public List<TcSistemaCorta> getListaSistemaCorta() {
        return listaSistemaCorta;
    }

    public void setListaSistemaCorta(List<TcSistemaCorta> listaSistemaCorta) {
        this.listaSistemaCorta = listaSistemaCorta;
    }

    public TcSistemaCorta getSistemaSeleccionado() {
        return sistemaSeleccionado;
    }

    public void setSistemaSeleccionado(TcSistemaCorta sistemaSeleccionado) {
        this.sistemaSeleccionado = sistemaSeleccionado;
    }

    public List<TcTipoFiador> getListaTipofiador() {
        return listaTipofiador;
    }

    public void setListaTipofiador(List<TcTipoFiador> listaTipofiador) {
        this.listaTipofiador = listaTipofiador;
    }

    public TcTipoFiador getTipoFiadorSeleccionado() {
        return tipoFiadorSeleccionado;
    }

    public void setTipoFiadorSeleccionado(TcTipoFiador tipoFiadorSeleccionado) {
        this.tipoFiadorSeleccionado = tipoFiadorSeleccionado;
    }

    public List<TcRegentePropuesto> getListaRegentePorpuesto() {
        return listaRegentePorpuesto;
    }

    public void setListaRegentePorpuesto(List<TcRegentePropuesto> listaRegentePorpuesto) {
        this.listaRegentePorpuesto = listaRegentePorpuesto;
    }

    public TcRegentePropuesto getRegenteSeleccionado() {
        return RegenteSeleccionado;
    }

    public void setRegenteSeleccionado(TcRegentePropuesto RegenteSeleccionado) {
        this.RegenteSeleccionado = RegenteSeleccionado;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getDpiRepresentante() {
        return dpiRepresentante;
    }

    public void setDpiRepresentante(String dpiRepresentante) {
        this.dpiRepresentante = dpiRepresentante;
    }

    public double getCortaAnual() {
        return cortaAnual;
    }

    public void setCortaAnual(double cortaAnual) {
        this.cortaAnual = cortaAnual;
    }

    public double getIncrementeAnual() {
        return incrementeAnual;
    }

    public void setIncrementeAnual(double incrementeAnual) {
        this.incrementeAnual = incrementeAnual;
    }

    public double getVigenciaPlan() {
        return vigenciaPlan;
    }

    public void setVigenciaPlan(double vigenciaPlan) {
        this.vigenciaPlan = vigenciaPlan;
    }

    public double getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(double tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public double getEdadRotacion() {
        return edadRotacion;
    }

    public void setEdadRotacion(double edadRotacion) {
        this.edadRotacion = edadRotacion;
    }

    public double getNumeroTurnos() {
        return numeroTurnos;
    }

    public void setNumeroTurnos(double numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }

    
    @PostConstruct
    public void init() { 
        // carga de todos las garantias
        this.listaTipoGarantia.clear(); // limpio la lista 
        String sql = UTILIDADES.SQL.todasLasGarantias();
        List<java.util.LinkedHashMap> listaTipoG = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class);
        TcTipoGarantia temporal = null;
        int idg, ide;
        for (java.util.LinkedHashMap c : listaTipoG) {

            try {
                idg = (int) Double.parseDouble(c.get("tipo_garantia_id").toString());
                ide = (int) Double.parseDouble(c.get("estado_id").toString());
                temporal = new TcTipoGarantia(idg, c.get("tipo_garantia_desc").toString(), ide, formato.parse(c.get("fecha_registro").toString()));

                this.listaTipoGarantia.add(temporal);
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        this.listaSistemaCorta.clear();
        String sqlS = UTILIDADES.SQL.sistemaCorta();
        List<java.util.LinkedHashMap> listasSistemaC = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sqlS, java.util.LinkedHashMap.class);
        TcSistemaCorta temporarSistemaC = null;
        int idSistema, idEstado;
        
        for (java.util.LinkedHashMap c : listasSistemaC){
            try{
                idSistema = (int) Double.parseDouble(c.get("sistema_corta_id").toString());
                idEstado = (int) Double.parseDouble(c.get("estado_id").toString());
                temporarSistemaC = new TcSistemaCorta(idSistema, c.get("sistema_corta_desc").toString(), idEstado, formato.parse(c.get("fecha_registro").toString()));
                
                this.listaSistemaCorta.add(temporarSistemaC);
            }catch (ParseException ex){
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Type tipoListaFiador = new TypeToken<List<TcTipoFiador>>() {
        }.getType();
        listaTipofiador = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonTipoFiador, tipoListaFiador);

        Type tipoListaRegente = new TypeToken<List<TcRegentePropuesto>>() {
        }.getType();
        listaRegentePorpuesto = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonRegentePropuesto, tipoListaRegente);

    }

    public void guardar() {
        System.out.println("==== se ejecuto el metodo ag****************************************** ====");
        RespuestaValidacion res = FacadePlan.verificaDPI(this.dpiRepresentante);
        if (!(res.isResultado())) {
            System.out.println("entro al if de error");
            System.out.println(res.toString());

            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, res.toString(), res.toString()));
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
        } else {
            System.out.println("tipo garantia: " + this.tipoGarantiaSeleccionado);
            System.out.println("tipo garantia: " + this.tipoFiadorSeleccionado);
            System.out.println("tipo garantia: " + this.RegenteSeleccionado);
            System.out.println("tipo garantia: " + this.sistemaSeleccionado);

        }

    }

}
