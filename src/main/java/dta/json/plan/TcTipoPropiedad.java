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
public class TcTipoPropiedad implements Serializable{
    
    private int tipoPropiedadId;
    private String tipoPropiedadDesc;
    private int estadoId;
    private Date fechaRegistro;
    private int esPropiedad;
    private int grupoId;
    private String observaciones;

    public int getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    public void setTipoPropiedadId(int tipoPropiedadId) {
        this.tipoPropiedadId = tipoPropiedadId;
    }

    public String getTipoPropiedadDesc() {
        return tipoPropiedadDesc;
    }

    public void setTipoPropiedadDesc(String tipoPropiedadDesc) {
        this.tipoPropiedadDesc = tipoPropiedadDesc;
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

    public int getEsPropiedad() {
        return esPropiedad;
    }

    public void setEsPropiedad(int esPropiedad) {
        this.esPropiedad = esPropiedad;
    }

    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    

    
}
