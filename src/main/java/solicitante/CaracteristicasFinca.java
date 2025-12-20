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
    
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
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
        this.listaUsoFinca.clear(); 
        String sqlUso = UTILIDADES.SQL.usoFinca();
        List<java.util.LinkedHashMap> listaUsoF = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sqlUso, java.util.LinkedHashMap.class);
        TcUsoFinca temporalUso = null;
        int idUso, idEstadoUso;
        for (java.util.LinkedHashMap c : listaUsoF) {

            try {
                idUso = (int) Double.parseDouble(c.get("uso_finca_id").toString());
                idEstadoUso = (int) Double.parseDouble(c.get("estado_id").toString());
                String codigo = c.get("codigo") != null ? c.get("codigo").toString() : "";
                temporalUso = new TcUsoFinca(idUso, c.get("uso_finca_desc").toString(), codigo ,idEstadoUso, formato.parse(c.get("fecha_registro").toString()));

                this.listaUsoFinca.add(temporalUso);
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        this.listaTipoBosque.clear(); 
        String sqlTipo = UTILIDADES.SQL.tipoBosque();
        List<java.util.LinkedHashMap> listaTipoB = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sqlTipo, java.util.LinkedHashMap.class);
        TcTipoBosque temporalBosque = null;
        int idTipo, idEstadoTipo, ocultar;
        for (java.util.LinkedHashMap c : listaTipoB) {

            try {
                idTipo = (int) Double.parseDouble(c.get("tipo_bosque_id").toString());
                idEstadoTipo = (int) Double.parseDouble(c.get("estado_id").toString());
                ocultar = (int) Double.parseDouble(c.get("ocultar").toString());
                temporalBosque = new TcTipoBosque(idTipo, c.get("tipo_bosque_desc").toString(), idEstadoTipo, formato.parse(c.get("fecha_registro").toString()), ocultar);

                this.listaTipoBosque.add(temporalBosque);
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        this.listaCriterioProteccion.clear(); 
        String sqlCriterio = UTILIDADES.SQL.criterioProteccion();
        List<java.util.LinkedHashMap> listaCriterioP = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sqlCriterio, java.util.LinkedHashMap.class);
        TcCriterioProteccion temporalCriterio = null;
        int idCriterio, idEstadoCriterio;
        for (java.util.LinkedHashMap c : listaCriterioP) {

            try {
                idCriterio = (int) Double.parseDouble(c.get("criterio_proteccion_id").toString());
                idEstadoCriterio = (int) Double.parseDouble(c.get("estado_id").toString());
                temporalCriterio = new TcCriterioProteccion(idCriterio, c.get("criterio_proteccion_desc").toString(), idEstadoCriterio, formato.parse(c.get("fecha_registro").toString()));

                this.listaCriterioProteccion.add(temporalCriterio);
            } catch (ParseException ex) {
                Logger.getLogger(Resumen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
//        Type tipoListaUso = new TypeToken<List<TcUsoFinca>>() {
//        }.getType();
//        listaUsoFinca = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonUSOFinca, tipoListaUso);

//        Type tipoListaTipo = new TypeToken<List<TcTipoBosque>>() {
//        }.getType();
//        listaTipoBosque = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonTipoBosque, tipoListaTipo);
//
//        Type tipoListaCriterio = new TypeToken<List<TcCriterioProteccion>>() {
//        }.getType();
//        listaCriterioProteccion = this.gs.fromJson(UTILIDADES.UtilidadesCarga.jsonCriterioProteccion, tipoListaCriterio);
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
        RespuestaValidacion res = FacadePlan.verificaAreas(
                new String[]{"Area ingreso", "Área de protección"}, areaHaCriterio, areaProteccion);
        if (!res.isResultado()) {
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, res.toString(), res.toString()));
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
        } else {
            DtCriterioProteccion datoC = new DtCriterioProteccion();
            datoC.setCreterioProteccion(criterioSeleccionado.getCriterioProteccionDesc());
            datoC.setAreaHaCriterio(areaHaCriterio);
            

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

            if (this.areaProteccion > 0) {

        // 1️⃣ Debe existir desglose
        if (datosDtCriterioProteccion == null || datosDtCriterioProteccion.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "Debe ingresar el desglose del Área de Protección",
                            "Debe ingresar el desglose del Área de Protección"
                    )
            );
            return; // ⛔ NO continúa
        }

        // 2️⃣ Sumar el desglose
        double totalDesgloseProteccion = datosDtCriterioProteccion.stream()
                .mapToDouble(a -> a.getAreaHaCriterio())
                .sum();

        // 3️⃣ Comparar contra el campo principal
        if (Double.compare(totalDesgloseProteccion, this.areaProteccion) != 0) {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "El total del desglose de Área de Protección no coincide con el área ingresada",
                            "Total desglose: " + totalDesgloseProteccion
                                    + " | Área Protección: " + this.areaProteccion
                    )
            );
            return; 
        }
    }
           
        RespuestaValidacion res = FacadePlan.verificaAreas(
                new String[]{"Área con bosque", "Área de producción", "Área a intervenir"}, areaBosque, areaProduccion, areaIntervenir);

        if (!res.isResultado()) {

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            res.getDescripcion(),
                            res.getDescripcion()
                    )
            );
        } else {

         
            System.out.println("area es: " + this.areaBosque);
            System.out.println("area es: " + this.areaProteccion);
            System.out.println("area es: " + this.areaProduccion);
            System.out.println("area es: " + this.areaIntervenir);
            System.out.println("area es: " + this.tipoSeleccionado);
            System.out.println("area es: " + this.criterioSeleccionado);
            System.out.println("area es: " + this.areaHaCriterio);
            FacesContext.getCurrentInstance().addMessage(
                null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Los datos se guardaron correctamente.", "Exito"));
        }
    }

}
