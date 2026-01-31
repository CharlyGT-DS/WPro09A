/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author csandoval
 */
public class TtGestion implements Serializable{
    
    public int gestionId;
    public double area;
    public TcPersonaCrea tcPersonaCrea;
    public Date fechaRegistro;
    public TcElaborador tcElaborador;
    public TcTipoGestion tcTipoGestion;
    public TcPlanTipoGestion tcPlanTipoGestion;
    public String expediente;
    public Date fechaAceptacion;
    public TcTipoBosque tcTipoBosque;
    public String cronograma;
    public int ultimoPanel;
    public int anio;
    public int numero;
    public int tieneRepresentante;
    public Object observacionesCronograma;
    public TcSubregion tcSubregion;
    public int estadoId;
    public Date fechaCierre;
    public int personaAnulaId;
    public Object fechaAnulacion;
    public Object observaciones;
    public int categoriaProfesionId;
    public int pasoId;
    public String fechaVencimiento;
    public Object expedienteVacId;
    public Object personas;
    public Object representantes;
    public Object ttRepresentanteGestion;
    public Object ttDivisionAreaGestion;
    public Object ttBiofisicaGestion;
    public Object ttInventarioGestion;
    public Object ttPlanificacionGestion;
    public Object ttRepoblacionGestion;
    public Object ttProteccionGestion;
    public Object ttTipoPropietarioGestion;
    public Object notificaciones;
    public Object fincas;
    public Object uso;
    public Object criterio;
    public Object anexo;
    public Object especies;
    public Object rodal;
    public Object codigoClase;
    public Object ttEstadisticoGestion;
    public Object sistemaRepoblacion;
    public Object ttResumenGestion;
    public Object informes;
    public Object rodalesRepoblacion;
    public String nug;
    
}
