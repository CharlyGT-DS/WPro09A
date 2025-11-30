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
public class TcPlanTipoGestion implements Serializable{
    
    private int planTipoGestionId;
    private String planTipoGestionDesc;
    private double areaMinima;
    private double areaMaxima;
    private int estadoId;
    private Date fechaRegistro;

    public int getPlanTipoGestionId() {
        return planTipoGestionId;
    }

    public void setPlanTipoGestionId(int planTipoGestionId) {
        this.planTipoGestionId = planTipoGestionId;
    }

    public String getPlanTipoGestionDesc() {
        return planTipoGestionDesc;
    }

    public void setPlanTipoGestionDesc(String planTipoGestionDesc) {
        this.planTipoGestionDesc = planTipoGestionDesc;
    }

    public double getAreaMinima() {
        return areaMinima;
    }

    public void setAreaMinima(double areaMinima) {
        this.areaMinima = areaMinima;
    }

    public double getAreaMaxima() {
        return areaMaxima;
    }

    public void setAreaMaxima(double areaMaxima) {
        this.areaMaxima = areaMaxima;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
}
