/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import MANEJADORES.MHHome;
import PATRONES.FacadePlan;
import com.google.gson.Gson;
import dta.json.plan.TcCriterioProteccion;
import dta.json.plan.TcTipoBosque;
import dta.json.plan.TcUsoFinca;
import estructuras.RespuestaValidacion;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

    private double areaTotalFinca = 0.43;
    private double areaIntervenirUso;
    private double areaRestanteUso;
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

    public double getAreaTotalFinca() {
        return areaTotalFinca;
    }

    public void setAreaTotalFinca(double areaTotalFinca) {
        this.areaTotalFinca = areaTotalFinca;
    }

    public double getAreaIntervenirUso() {
        return areaIntervenirUso;
    }

    public void setAreaIntervenirUso(double areaIntervenirUso) {
        this.areaIntervenirUso = areaIntervenirUso;
    }

    public double getAreaRestanteUso() {
        return areaRestanteUso;
    }

    public void setAreaRestanteUso(double areaRestanteUso) {
        this.areaRestanteUso = areaRestanteUso;
    }

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
        this.areaRestanteUso = this.areaTotalFinca;
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
                temporalUso = new TcUsoFinca(idUso, c.get("uso_finca_desc").toString(), codigo, idEstadoUso, formato.parse(c.get("fecha_registro").toString()));

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
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, res.getDescripcion(), res.toString()));
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
            return;
        } else {

            //calcula el total del dt
            BigDecimal totalActual = datosDtUsoFinca.stream()
                    .map(d -> BigDecimal.valueOf(d.getAreaHaUso()))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            // Total incluyendo el nuevo valor
            BigDecimal totalNuevo = totalActual.add(BigDecimal.valueOf(areaHaUso));
            BigDecimal areaTotal = BigDecimal.valueOf(areaTotalFinca);

            //valida que el total del dt no es mayor al total de la finca 
            if (totalNuevo.compareTo(areaTotal) > 0) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "El área total de los usos no debe ser mayor al total de la finca",
                        "Error"));
                return;
            } else {// Agrega la fila al dt
                DtUsoFinca dato = new DtUsoFinca();
                dato.setAreaHaUso(areaHaUso);
                dato.setUsoFinca(usoSeleccionado.getUsoFincaDesc());

                // Agregar registro
                datosDtUsoFinca.add(dato);

                this.areaIntervenirUso = totalNuevo.doubleValue();
                this.areaRestanteUso = this.areaTotalFinca - totalNuevo.doubleValue();

                // Recalcular 
                for (DtUsoFinca d : datosDtUsoFinca) {

                    BigDecimal areaUso = BigDecimal.valueOf(d.getAreaHaUso());

                    BigDecimal porcentaje = areaUso
                            .multiply(BigDecimal.valueOf(100))
                            .divide(totalNuevo, 2, RoundingMode.HALF_UP);

                    d.setPorcentajeUso(porcentaje.doubleValue());
                }

                // RESETEAR CAMPOS
                areaHaUso = 0;            // para el inputNumber
                usoSeleccionado = null;   // para el selectOneMenu
            }
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

        this.areaRestanteUso = (this.areaTotalFinca - total);
        this.areaIntervenirUso = total;

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

        System.out.println("==== se ejecuto el metodo ag sc2 ****************************************** ====");

        RespuestaValidacion res = FacadePlan.verificaAreas(
                new String[]{"Area del criterio de proteccion", "Área de protección"},
                areaHaCriterio,
                areaProteccion
        );

        if (!res.isResultado()) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            res.getDescripcion(),
                            res.getDescripcion()
                    )
            );
            PrimeFaces.current().ajax().update(":form:tabw:incrustado:horror");
            return;
        } else {

            //calcula el total del dt
            BigDecimal totalActual = datosDtCriterioProteccion.stream()
                    .map(d -> BigDecimal.valueOf(d.getAreaHaCriterio()))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            // Total incluyendo el nuevo valor
            BigDecimal totalNuevo = totalActual.add(BigDecimal.valueOf(areaHaCriterio));
            BigDecimal areaTotal = BigDecimal.valueOf(areaProteccion);

            //valida que el total del dt no es mayor al total de la finca 
            if (totalNuevo.compareTo(areaTotal) > 0) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "El área total de los criterios no debe ser mayor al área de proteccion ingresada",
                        "Error"));
                return;
            } else {

                //Crear y agregar registro
                DtCriterioProteccion datoC = new DtCriterioProteccion();
                datoC.setCreterioProteccion(criterioSeleccionado.getCriterioProteccionDesc());
                datoC.setAreaHaCriterio(areaHaCriterio);
                datosDtCriterioProteccion.add(datoC);

                //Calcular total con BigDecimal
                BigDecimal total = datosDtCriterioProteccion.stream()
                        .map(d -> BigDecimal.valueOf(d.getAreaHaCriterio()))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

                //Recalcular porcentajes con BigDecimal
                for (DtCriterioProteccion d : datosDtCriterioProteccion) {

                    BigDecimal area = BigDecimal.valueOf(d.getAreaHaCriterio());

                    BigDecimal porcentaje = area
                            .multiply(BigDecimal.valueOf(100))
                            .divide(total, 2, RoundingMode.HALF_UP);

                    d.setPorcentajeCriterio(porcentaje.doubleValue());
                }

                //Limpiar campos
                areaHaCriterio = 0;
                criterioSeleccionado = null;
            }

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

        //Validación de Área de Protección
        if (this.areaProteccion > 0) {

            // Debe existir al menos un criterio
            if (datosDtCriterioProteccion == null || datosDtCriterioProteccion.isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(
                                FacesMessage.SEVERITY_ERROR,
                                "¡Área de protección ingresada!",
                                "Debe ingresar el desglose del Área de Protección"
                        )
                );
                return;
            }

            //Sumar criterios con BigDecimal
            BigDecimal totalDesgloseProteccion = datosDtCriterioProteccion.stream()
                    .map(d -> BigDecimal.valueOf(d.getAreaHaCriterio()))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal areaProteccionBD = BigDecimal.valueOf(this.areaProteccion);

            //Comparación EXACTA (igualdad)
            if (totalDesgloseProteccion.compareTo(areaProteccionBD) != 0) {
                FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(
                                FacesMessage.SEVERITY_ERROR,
                                "Total de los criterios de protección no coincide con el área de protección ingresada",
                                "Total criterios: " + totalDesgloseProteccion.doubleValue()
                                + " | Área Protección: " + areaProteccionBD.doubleValue()
                        )
                );
                return;
            }
        }

        //Validación de áreas generales
        RespuestaValidacion res = FacadePlan.verificaAreas(
                new String[]{"Área con bosque", "Área de producción", "Área a intervenir"},
                areaBosque,
                areaProduccion,
                areaIntervenir
        );

        if (!res.isResultado()) {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            res.getDescripcion(),
                            res.getDescripcion()
                    )
            );
            return;
        }

        System.out.println("area bosque: " + this.areaBosque);
        System.out.println("area protección: " + this.areaProteccion);
        System.out.println("area producción: " + this.areaProduccion);
        System.out.println("area intervenir: " + this.areaIntervenir);
        System.out.println("tipo seleccionado: " + this.tipoSeleccionado);
        System.out.println("criterio seleccionado: " + this.criterioSeleccionado);
        System.out.println("area criterio: " + this.areaHaCriterio);

        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(
                        FacesMessage.SEVERITY_INFO,
                        "Éxito",
                        "Los datos se guardaron correctamente."
                )
        );
    }

}
