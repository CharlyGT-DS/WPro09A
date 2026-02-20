/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import org.plan.Uso;

/**
 *
 * @author csandoval
 */
public class Datum implements Serializable{
    
    private int gestionId;
    private double area;
    private TcPersonaCrea tcPersonaCrea;
    private Date fechaRegistro;
    private TcElaborador tcElaborador;
    private TcTipoGestion tcTipoGestion;
    private TcPlanTipoGestion tcPlanTipoGestion;
    private String expediente;
    private Date fechaAceptacion;
    private TcTipoBosque tcTipoBosque;
    private String cronograma;
    private int ultimoPanel;
    private int anio;
    private int numero;
    private int tieneRepresentante;
    private Object observacionesCronograma;
    private TcSubregion tcSubregion;
    private int estadoId;
    private Date fechaCierre;
    private int personaAnulaId;
    private Object fechaAnulacion;
    private Object observaciones;
    private int categoriaProfesionId;
    private int pasoId;
    private String fechaVencimiento;
    private Object expedienteVacId;
    private ArrayList<Persona> personas;
    private ArrayList<Representante> representantes;
    private Object ttRepresentanteGestion;
    private TtDivisionAreaGestion ttDivisionAreaGestion;
    private TtBiofisicaGestion ttBiofisicaGestion;
    private TtInventarioGestion ttInventarioGestion;
    private TtPlanificacionGestion ttPlanificacionGestion;
    private Object ttRepoblacionGestion;
    private TtProteccionGestion ttProteccionGestion;
    private TtTipoPropietarioGestion ttTipoPropietarioGestion;
    private ArrayList<Notificacione> notificaciones;
    private ArrayList<Finca> fincas;
    private ArrayList<Uso> uso;
    private ArrayList<Object> criterio;
    private ArrayList<Anexo> anexo;
    private ArrayList<Especy> especies;
    private ArrayList<Rodal> rodal;
    private ArrayList<CodigoClase> codigoClase;
    private Object ttEstadisticoGestion;
    private ArrayList<SistemaRepoblacion> sistemaRepoblacion;
    private TtResumenGestion ttResumenGestion;
    private Object informes;
    private ArrayList<RodalesRepoblacion> rodalesRepoblacion;
    private String nug;

    public Datum() {
    }

    public Datum(int gestionId, double area, TcPersonaCrea tcPersonaCrea, Date fechaRegistro, TcElaborador tcElaborador, TcTipoGestion tcTipoGestion, TcPlanTipoGestion tcPlanTipoGestion, String expediente, Date fechaAceptacion, TcTipoBosque tcTipoBosque, String cronograma, int ultimoPanel, int anio, int numero, int tieneRepresentante, Object observacionesCronograma, TcSubregion tcSubregion, int estadoId, Date fechaCierre, int personaAnulaId, Object fechaAnulacion, Object observaciones, int categoriaProfesionId, int pasoId, String fechaVencimiento, Object expedienteVacId, ArrayList<Persona> personas, ArrayList<Representante> representantes, Object ttRepresentanteGestion, TtDivisionAreaGestion ttDivisionAreaGestion, TtBiofisicaGestion ttBiofisicaGestion, TtInventarioGestion ttInventarioGestion, TtPlanificacionGestion ttPlanificacionGestion, Object ttRepoblacionGestion, TtProteccionGestion ttProteccionGestion, TtTipoPropietarioGestion ttTipoPropietarioGestion, ArrayList<Notificacione> notificaciones, ArrayList<Finca> fincas, ArrayList<Uso> uso, ArrayList<Object> criterio, ArrayList<Anexo> anexo, ArrayList<Especy> especies, ArrayList<Rodal> rodal, ArrayList<CodigoClase> codigoClase, Object ttEstadisticoGestion, ArrayList<SistemaRepoblacion> sistemaRepoblacion, TtResumenGestion ttResumenGestion, Object informes, ArrayList<RodalesRepoblacion> rodalesRepoblacion, String nug) {
        this.gestionId = gestionId;
        this.area = area;
        this.tcPersonaCrea = tcPersonaCrea;
        this.fechaRegistro = fechaRegistro;
        this.tcElaborador = tcElaborador;
        this.tcTipoGestion = tcTipoGestion;
        this.tcPlanTipoGestion = tcPlanTipoGestion;
        this.expediente = expediente;
        this.fechaAceptacion = fechaAceptacion;
        this.tcTipoBosque = tcTipoBosque;
        this.cronograma = cronograma;
        this.ultimoPanel = ultimoPanel;
        this.anio = anio;
        this.numero = numero;
        this.tieneRepresentante = tieneRepresentante;
        this.observacionesCronograma = observacionesCronograma;
        this.tcSubregion = tcSubregion;
        this.estadoId = estadoId;
        this.fechaCierre = fechaCierre;
        this.personaAnulaId = personaAnulaId;
        this.fechaAnulacion = fechaAnulacion;
        this.observaciones = observaciones;
        this.categoriaProfesionId = categoriaProfesionId;
        this.pasoId = pasoId;
        this.fechaVencimiento = fechaVencimiento;
        this.expedienteVacId = expedienteVacId;
        this.personas = personas;
        this.representantes = representantes;
        this.ttRepresentanteGestion = ttRepresentanteGestion;
        this.ttDivisionAreaGestion = ttDivisionAreaGestion;
        this.ttBiofisicaGestion = ttBiofisicaGestion;
        this.ttInventarioGestion = ttInventarioGestion;
        this.ttPlanificacionGestion = ttPlanificacionGestion;
        this.ttRepoblacionGestion = ttRepoblacionGestion;
        this.ttProteccionGestion = ttProteccionGestion;
        this.ttTipoPropietarioGestion = ttTipoPropietarioGestion;
        this.notificaciones = notificaciones;
        this.fincas = fincas;
        this.uso = uso;
        this.criterio = criterio;
        this.anexo = anexo;
        this.especies = especies;
        this.rodal = rodal;
        this.codigoClase = codigoClase;
        this.ttEstadisticoGestion = ttEstadisticoGestion;
        this.sistemaRepoblacion = sistemaRepoblacion;
        this.ttResumenGestion = ttResumenGestion;
        this.informes = informes;
        this.rodalesRepoblacion = rodalesRepoblacion;
        this.nug = nug;
    }

    
    
    public int getGestionId() {
        return gestionId;
    }

    public void setGestionId(int gestionId) {
        this.gestionId = gestionId;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public TcPersonaCrea getTcPersonaCrea() {
        return tcPersonaCrea;
    }

    public void setTcPersonaCrea(TcPersonaCrea tcPersonaCrea) {
        this.tcPersonaCrea = tcPersonaCrea;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public TcElaborador getTcElaborador() {
        return tcElaborador;
    }

    public void setTcElaborador(TcElaborador tcElaborador) {
        this.tcElaborador = tcElaborador;
    }

    public TcTipoGestion getTcTipoGestion() {
        return tcTipoGestion;
    }

    public void setTcTipoGestion(TcTipoGestion tcTipoGestion) {
        this.tcTipoGestion = tcTipoGestion;
    }

    public TcPlanTipoGestion getTcPlanTipoGestion() {
        return tcPlanTipoGestion;
    }

    public void setTcPlanTipoGestion(TcPlanTipoGestion tcPlanTipoGestion) {
        this.tcPlanTipoGestion = tcPlanTipoGestion;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public Date getFechaAceptacion() {
        return fechaAceptacion;
    }

    public void setFechaAceptacion(Date fechaAceptacion) {
        this.fechaAceptacion = fechaAceptacion;
    }

    public TcTipoBosque getTcTipoBosque() {
        return tcTipoBosque;
    }

    public void setTcTipoBosque(TcTipoBosque tcTipoBosque) {
        this.tcTipoBosque = tcTipoBosque;
    }

    public String getCronograma() {
        return cronograma;
    }

    public void setCronograma(String cronograma) {
        this.cronograma = cronograma;
    }

    public int getUltimoPanel() {
        return ultimoPanel;
    }

    public void setUltimoPanel(int ultimoPanel) {
        this.ultimoPanel = ultimoPanel;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTieneRepresentante() {
        return tieneRepresentante;
    }

    public void setTieneRepresentante(int tieneRepresentante) {
        this.tieneRepresentante = tieneRepresentante;
    }

    public Object getObservacionesCronograma() {
        return observacionesCronograma;
    }

    public void setObservacionesCronograma(Object observacionesCronograma) {
        this.observacionesCronograma = observacionesCronograma;
    }

    public TcSubregion getTcSubregion() {
        return tcSubregion;
    }

    public void setTcSubregion(TcSubregion tcSubregion) {
        this.tcSubregion = tcSubregion;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getPersonaAnulaId() {
        return personaAnulaId;
    }

    public void setPersonaAnulaId(int personaAnulaId) {
        this.personaAnulaId = personaAnulaId;
    }

    public Object getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Object fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public Object getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Object observaciones) {
        this.observaciones = observaciones;
    }

    public int getCategoriaProfesionId() {
        return categoriaProfesionId;
    }

    public void setCategoriaProfesionId(int categoriaProfesionId) {
        this.categoriaProfesionId = categoriaProfesionId;
    }

    public int getPasoId() {
        return pasoId;
    }

    public void setPasoId(int pasoId) {
        this.pasoId = pasoId;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Object getExpedienteVacId() {
        return expedienteVacId;
    }

    public void setExpedienteVacId(Object expedienteVacId) {
        this.expedienteVacId = expedienteVacId;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Representante> getRepresentantes() {
        return representantes;
    }

    public void setRepresentantes(ArrayList<Representante> representantes) {
        this.representantes = representantes;
    }

    public Object getTtRepresentanteGestion() {
        return ttRepresentanteGestion;
    }

    public void setTtRepresentanteGestion(Object ttRepresentanteGestion) {
        this.ttRepresentanteGestion = ttRepresentanteGestion;
    }

    public TtDivisionAreaGestion getTtDivisionAreaGestion() {
        return ttDivisionAreaGestion;
    }

    public void setTtDivisionAreaGestion(TtDivisionAreaGestion ttDivisionAreaGestion) {
        this.ttDivisionAreaGestion = ttDivisionAreaGestion;
    }

    public TtBiofisicaGestion getTtBiofisicaGestion() {
        return ttBiofisicaGestion;
    }

    public void setTtBiofisicaGestion(TtBiofisicaGestion ttBiofisicaGestion) {
        this.ttBiofisicaGestion = ttBiofisicaGestion;
    }

    public TtInventarioGestion getTtInventarioGestion() {
        return ttInventarioGestion;
    }

    public void setTtInventarioGestion(TtInventarioGestion ttInventarioGestion) {
        this.ttInventarioGestion = ttInventarioGestion;
    }

    public TtPlanificacionGestion getTtPlanificacionGestion() {
        return ttPlanificacionGestion;
    }

    public void setTtPlanificacionGestion(TtPlanificacionGestion ttPlanificacionGestion) {
        this.ttPlanificacionGestion = ttPlanificacionGestion;
    }

    public Object getTtRepoblacionGestion() {
        return ttRepoblacionGestion;
    }

    public void setTtRepoblacionGestion(Object ttRepoblacionGestion) {
        this.ttRepoblacionGestion = ttRepoblacionGestion;
    }

    public TtProteccionGestion getTtProteccionGestion() {
        return ttProteccionGestion;
    }

    public void setTtProteccionGestion(TtProteccionGestion ttProteccionGestion) {
        this.ttProteccionGestion = ttProteccionGestion;
    }

    public TtTipoPropietarioGestion getTtTipoPropietarioGestion() {
        return ttTipoPropietarioGestion;
    }

    public void setTtTipoPropietarioGestion(TtTipoPropietarioGestion ttTipoPropietarioGestion) {
        this.ttTipoPropietarioGestion = ttTipoPropietarioGestion;
    }

    public ArrayList<Notificacione> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList<Notificacione> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public ArrayList<Finca> getFincas() {
        return fincas;
    }

    public void setFincas(ArrayList<Finca> fincas) {
        this.fincas = fincas;
    }

    public ArrayList<Uso> getUso() {
        return uso;
    }

    public void setUso(ArrayList<Uso> uso) {
        this.uso = uso;
    }

    public ArrayList<Object> getCriterio() {
        return criterio;
    }

    public void setCriterio(ArrayList<Object> criterio) {
        this.criterio = criterio;
    }

    public ArrayList<Anexo> getAnexo() {
        return anexo;
    }

    public void setAnexo(ArrayList<Anexo> anexo) {
        this.anexo = anexo;
    }

    public ArrayList<Especy> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Especy> especies) {
        this.especies = especies;
    }

    public ArrayList<Rodal> getRodal() {
        return rodal;
    }

    public void setRodal(ArrayList<Rodal> rodal) {
        this.rodal = rodal;
    }

    public ArrayList<CodigoClase> getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(ArrayList<CodigoClase> codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Object getTtEstadisticoGestion() {
        return ttEstadisticoGestion;
    }

    public void setTtEstadisticoGestion(Object ttEstadisticoGestion) {
        this.ttEstadisticoGestion = ttEstadisticoGestion;
    }

    public ArrayList<SistemaRepoblacion> getSistemaRepoblacion() {
        return sistemaRepoblacion;
    }

    public void setSistemaRepoblacion(ArrayList<SistemaRepoblacion> sistemaRepoblacion) {
        this.sistemaRepoblacion = sistemaRepoblacion;
    }

    public TtResumenGestion getTtResumenGestion() {
        return ttResumenGestion;
    }

    public void setTtResumenGestion(TtResumenGestion ttResumenGestion) {
        this.ttResumenGestion = ttResumenGestion;
    }

    public Object getInformes() {
        return informes;
    }

    public void setInformes(Object informes) {
        this.informes = informes;
    }

    public ArrayList<RodalesRepoblacion> getRodalesRepoblacion() {
        return rodalesRepoblacion;
    }

    public void setRodalesRepoblacion(ArrayList<RodalesRepoblacion> rodalesRepoblacion) {
        this.rodalesRepoblacion = rodalesRepoblacion;
    }

    public String getNug() {
        return nug;
    }

    public void setNug(String nug) {
        this.nug = nug;
    }

       
    
}
