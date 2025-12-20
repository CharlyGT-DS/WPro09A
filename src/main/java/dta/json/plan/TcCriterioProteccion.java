/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author WINDOWS
 */
public class TcCriterioProteccion implements Serializable{
    
    private int criterioProteccionId;
    private String criterioProteccionDesc;
    private int estadoId;
    private Date fechaRegistro;

    public TcCriterioProteccion() {
    }

    public TcCriterioProteccion(int criterioProteccionId, String criterioProteccionDesc, int estadoId, Date fechaRegistro) {
        this.criterioProteccionId = criterioProteccionId;
        this.criterioProteccionDesc = criterioProteccionDesc;
        this.estadoId = estadoId;
        this.fechaRegistro = fechaRegistro;
    }

    public int getCriterioProteccionId() {
        return criterioProteccionId;
    }

    public void setCriterioProteccionId(int criterioProteccionId) {
        this.criterioProteccionId = criterioProteccionId;
    }

    public String getCriterioProteccionDesc() {
        return criterioProteccionDesc;
    }

    public void setCriterioProteccionDesc(String criterioProteccionDesc) {
        this.criterioProteccionDesc = criterioProteccionDesc;
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
