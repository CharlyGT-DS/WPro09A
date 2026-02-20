/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class TtPlanificacionGestion implements Serializable{
    
    public int planificacionGestionId;
    public TcCriterioCorta tcCriterioCorta;
    public double cap;
    public String formula;
    public String justificacion;
    public String actividadAprovechamiento;
    public String masaForestal;
    public String justificacionEspecie;
    public String establecimiento;
    public Object postAprovechamiento;
    public double areaExtraer;
    public double areaIntervenir;
    public double areaExistente;
    public double areaCompromiso;
    public double incremento;
    public double carbon;
    public int hayReforestacion;
    
    
}
