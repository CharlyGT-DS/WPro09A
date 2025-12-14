/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import MANEJADORES.MHHome;
import PATRONES.FacadePlan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dta.json.plan.TcCriterioProteccion;
import dta.json.plan.TcTipoBosque;
import dta.json.plan.TcUsoFinca;
import estructuras.RespuestaValidacion;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
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
@Named(value = "caracteristicasFinca")
@ViewScoped
public class CaracteristicasFinca implements Serializable {

    private List<TcUsoFinca> listaUsoFinca = new ArrayList<>();
    private TcUsoFinca usoSeleccionado = new TcUsoFinca();
    private List<TcTipoBosque> listaTipoBosque = new ArrayList<>();
    private TcTipoBosque tipoSeleccionado = new TcTipoBosque();
    private List<TcCriterioProteccion> listaCriterioProteccion = new ArrayList<>();
    private TcCriterioProteccion criterioSeleccionado = new TcCriterioProteccion();
    private double areaHaUso;
    private double porcentajeUso;
    private List<DtUsoFinca> datosDtUsoFinca = new ArrayList<>();

    private double areaBosque;
    private double areaProteccion;
    private double areaProduccion;
    private double areaIntervenir;
    private double areaHaCriterio;
    private double porcentajeCriterio;
    private String tipoBosque;
    private String criterioProteccion;
    private List<DtCriterioProteccion> datosDtCriterioProteccion = new ArrayList<>();

    // este es un api de comunicacion
    @Inject
    private MHHome mhome;

    private Gson gs = new Gson();

    private String datos = "la vista de caracteristicas";

    public List<TcTipoBosque> getListaTipoBosque() {
        return listaTipoBosque;
    }

    public void setListaTipoBosque(List<TcTipoBosque> listaTipoBosque) {
        this.listaTipoBosque = listaTipoBosque;
    }

    public TcTipoBosque getTipoSeleccionado() {
        return tipoSeleccionado;
    }

    public void setTipoSeleccionado(TcTipoBosque tipoSeleccionado) {
        this.tipoSeleccionado = tipoSeleccionado;
    }

    public List<TcCriterioProteccion> getListaCriterioProteccion() {
        return listaCriterioProteccion;
    }

    public void setListaCriterioProteccion(List<TcCriterioProteccion> listaCriterioProteccion) {
        this.listaCriterioProteccion = listaCriterioProteccion;
    }

    public TcCriterioProteccion getCriterioSeleccionado() {
        return criterioSeleccionado;
    }

    public void setCriterioSeleccionado(TcCriterioProteccion criterioSeleccionado) {
        this.criterioSeleccionado = criterioSeleccionado;
    }
    
    

    public List<DtCriterioProteccion> getDatosDtCriterioProteccion() {
        return datosDtCriterioProteccion;
    }

    public void setDatosDtCriterioProteccion(List<DtCriterioProteccion> datosDtCriterioProteccion) {
        this.datosDtCriterioProteccion = datosDtCriterioProteccion;
    }

    public String getTipoBosque() {
        return tipoBosque;
    }

    public void setTipoBosque(String tipoBosque) {
        this.tipoBosque = tipoBosque;
    }

    public String getCriterioProteccion() {
        return criterioProteccion;
    }

    public void setCriterioProteccion(String criterioProteccion) {
        this.criterioProteccion = criterioProteccion;
    }

    public List<TcUsoFinca> getListaUsoFinca() {
        return listaUsoFinca;
    }

    public void setListaUsoFinca(List<TcUsoFinca> listaUsoFinca) {
        this.listaUsoFinca = listaUsoFinca;
    }

    public TcUsoFinca getUsoSeleccionado() {
        return usoSeleccionado;
    }

    public void setUsoSeleccionado(TcUsoFinca usoSeleccionado) {
        this.usoSeleccionado = usoSeleccionado;
    }

    public double getAreaHaUso() {
        return areaHaUso;
    }

    public void setAreaHaUso(double areaHaUso) {
        this.areaHaUso = areaHaUso;
    }

    public double getPorcentajeUso() {
        return porcentajeUso;
    }

    public void setPorcentajeUso(double porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public List<DtUsoFinca> getDatosDtUsoFinca() {
        return datosDtUsoFinca;
    }

    public void setDatosDtUsoFinca(List<DtUsoFinca> datosDtUsoFinca) {
        this.datosDtUsoFinca = datosDtUsoFinca;
    }

    public double getAreaBosque() {
        return areaBosque;
    }

    public void setAreaBosque(double areaBosque) {
        this.areaBosque = areaBosque;
    }

    public double getAreaProteccion() {
        return areaProteccion;
    }

    public void setAreaProteccion(double areaProteccion) {
        this.areaProteccion = areaProteccion;
    }

    public double getAreaProduccion() {
        return areaProduccion;
    }

    public void setAreaProduccion(double areaProduccion) {
        this.areaProduccion = areaProduccion;
    }

    public double getAreaIntervenir() {
        return areaIntervenir;
    }

    public void setAreaIntervenir(double areaIntervenir) {
        this.areaIntervenir = areaIntervenir;
    }

    public double getAreaHaCriterio() {
        return areaHaCriterio;
    }

    public void setAreaHaCriterio(double areaHaCriterio) {
        this.areaHaCriterio = areaHaCriterio;
    }

    public double getPorcentajeCriterio() {
        return porcentajeCriterio;
    }

    public void setPorcentajeCriterio(double porcentajeCriterio) {
        this.porcentajeCriterio = porcentajeCriterio;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    // se ejecuta luego de crearce la vista , solo se ejecuta una vez
    @PostConstruct
    public void init() {
        // cargan todos los datos de la finca  
        Type tipoListaUso = new TypeToken<List<TcUsoFinca>>() {}.getType();
        listaUsoFinca = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonUSOFinca, tipoListaUso);
        
        Type tipoListaTipo = new TypeToken<List<TcTipoBosque>>() {}.getType();
        listaTipoBosque = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonTipoBosque, tipoListaTipo);
        
        Type tipoListaCriterio = new TypeToken<List<TcCriterioProteccion>>() {}.getType();
        listaCriterioProteccion = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonCriterioProteccion, tipoListaCriterio);
    }
    
    

    // Seccion uno V. CARACTERÍSTICAS DE LA FINCA ----------------------------------------
    public void agregarDatoUso() {
        System.out.println("==== se ejecuto el metodo ag****************************************** ====");
        RespuestaValidacion res = FacadePlan.verificaArea(this.areaHaUso);

        if (!(res.isResultado())) {
            System.out.println("entro al if de error");
            System.out.println(res.toString());

            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, res.toString(), res.toString()));
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
        } else {// Agrega la fila al dt
            DtUsoFinca dato = new DtUsoFinca();
            dato.setAreaHaUso(areaHaUso);
            dato.setUsoFinca(usoSeleccionado.getUsoFincaDesc());

            // Agregar registro
            datosDtUsoFinca.add(dato);

            // cacular el nuevo total
            double total = 0;
            for (DtUsoFinca d : datosDtUsoFinca) {
                total += d.getAreaHaUso();
            }

            // Recalcular 
            for (DtUsoFinca d : datosDtUsoFinca) {
                double porcentaje = (d.getAreaHaUso() * 100) / total;
                porcentaje = Math.round(porcentaje * 100.0) / 100.0;
                d.setPorcentajeUso(porcentaje);
            }
            
            // RESETEAR CAMPOS
            areaHaUso = 0;            // para el inputNumber
            usoSeleccionado = null;   // para el selectOneMenu


        }
    }

    public void eliminarDatoUso(DtUsoFinca dato) {
        System.out.println("==== se ejecuto el metodo ****************************************** ====");
        datosDtUsoFinca.remove(dato);

        // Recalcular después de eliminar
        double total = 0;
        for (DtUsoFinca d : datosDtUsoFinca) {
            total += d.getAreaHaUso();
        }

        for (DtUsoFinca d : datosDtUsoFinca) {
            double porcentaje = (d.getAreaHaUso() * 100) / total;
            d.setPorcentajeUso(porcentaje);
        }
    }

    public double getTotalAreaUso() {
        double totalAreaUso = 0;
        for (DtUsoFinca d : datosDtUsoFinca) {
            totalAreaUso += d.getAreaHaUso();
        }
        return totalAreaUso;
    }

    public double getTotalPorcentajeUso() {
        double total = 0;
        for (DtUsoFinca d : datosDtUsoFinca) {
            total += d.getPorcentajeUso();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    public void guardarSecUno() {

        System.out.println("==== se ejecuto el metodo ****************************************** ====");
        if (datosDtUsoFinca == null || datosDtUsoFinca.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe agregar al menos un registro a la tabla", "Error"));
            return; // no guarda
        }

        // aqui se guarda
        datosDtUsoFinca.forEach(uso -> {
            System.out.println("Uso: " + uso.getUsoFinca());
            System.out.println("Área: " + uso.getAreaHaUso());
            System.out.println("Porcentaje: " + uso.getPorcentajeUso());
        });
        
        FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Los datos se guardaron correctamente.", "Exito"));

    }

    // seccion dos 5.2.1 DIVISIÓN CON BÓSQUE -----------------------------------------------------
    public void agregarDatoCriterio() {
        System.out.println("==== se ejecuto el metodo ag sc2****************************************** ====");
        RespuestaValidacion res = FacadePlan.verificaArea(this.areaHaCriterio);
        if (!(res.isResultado())) {
            System.out.println("entro al if de error");
            System.out.println(res.toString());

            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, res.toString(), res.toString()));
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
        }else {
        DtCriterioProteccion datoC = new DtCriterioProteccion();
        datoC.setAreaHaCriterio(areaHaCriterio);
        datoC.setCreterioProteccion(criterioProteccion);

        // Agregar registro
        datosDtCriterioProteccion.add(datoC);

        // cacular el nuevo total
        double total = 0;
        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            total += d.getAreaHaCriterio();
        }

        // Recalcular 
        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            double porcentaje = (d.getAreaHaCriterio() * 100) / total;
            porcentaje = Math.round(porcentaje * 100.0) / 100.0;
            d.setPorcentajeCriterio(porcentaje);
        }

        // Limpiar campos
        areaHaCriterio = 0;
        criterioProteccion = null;
        
        }
    }

    public void eliminarDatoCriterio(DtCriterioProteccion datoC) {
        System.out.println("==== se ejecuto el metodo ****************************************** ====");
        datosDtCriterioProteccion.remove(datoC);

        // Recalcular después de eliminar
        double total = 0;
        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            total += d.getAreaHaCriterio();
        }

        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            double porcentaje = (d.getAreaHaCriterio() * 100) / total;
            d.setPorcentajeCriterio(porcentaje);
        }
    }

    public double getTotalAreaCriterio() {
        double totalAreaCriterio = 0;
        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            totalAreaCriterio += d.getAreaHaCriterio();
        }
        return totalAreaCriterio;
    }

    public double getTotalPorcentajeCriterio() {
        double totalPorcentajeCriterio = 0;
        for (DtCriterioProteccion d : datosDtCriterioProteccion) {
            totalPorcentajeCriterio += d.getPorcentajeCriterio();
        }
        return Math.round(totalPorcentajeCriterio * 100.0) / 100.0;
    }

    public void guardarSecDos() {
        System.out.println("==== se ejecuto el metodo ****************************************** ====");
        System.out.println("area es: " + this.areaBosque);
        System.out.println("area es: " + this.areaProteccion);
        System.out.println("area es: " + this.areaProduccion);
        System.out.println("area es: " + this.areaIntervenir);
        System.out.println("area es: " + this.tipoSeleccionado);
        System.out.println("area es: " + this.criterioSeleccionado);
        System.out.println("area es: " + this.areaHaCriterio);

    }

}
