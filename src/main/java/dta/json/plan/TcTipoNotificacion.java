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
public class TcTipoNotificacion implements Serializable{
    
    private int tipoNotificacionId;
    private String tipoNotificacionDesc;
    private int esDireccion;
    private int esObligatorio;
    private String type;
    private int maxlength;
    private int estadoId;
    private Date fechaRegistro;

    public TcTipoNotificacion() {
    }
    
    

    public int getTipoNotificacionId() {
        return tipoNotificacionId;
    }

    public void setTipoNotificacionId(int tipoNotificacionId) {
        this.tipoNotificacionId = tipoNotificacionId;
    }

    public String getTipoNotificacionDesc() {
        return tipoNotificacionDesc;
    }

    public void setTipoNotificacionDesc(String tipoNotificacionDesc) {
        this.tipoNotificacionDesc = tipoNotificacionDesc;
    }

    public int getEsDireccion() {
        return esDireccion;
    }

    public void setEsDireccion(int esDireccion) {
        this.esDireccion = esDireccion;
    }

    public int getEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(int esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(int maxlength) {
        this.maxlength = maxlength;
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
