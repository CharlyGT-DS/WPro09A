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
public class TcTipoEntidad implements Serializable{
    
    private double tipoEntidadId;
    private String tipoEntidadDesc;
    private double estadoId;
    private Date fechaRegistro;

    public double getTipoEntidadId() {
        return tipoEntidadId;
    }

    public void setTipoEntidadId(double tipoEntidadId) {
        this.tipoEntidadId = tipoEntidadId;
    }

    public String getTipoEntidadDesc() {
        return tipoEntidadDesc;
    }

    public void setTipoEntidadDesc(String tipoEntidadDesc) {
        this.tipoEntidadDesc = tipoEntidadDesc;
    }

    public double getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(double estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
 
    
    
    
}
