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
public class Notificacione implements Serializable{
    
    private int notificacionGestionId;
    private Date fechaAsignacion;
    private TcTipoNotificacion tcTipoNotificacion;
    private TcMunicipio tcMunicipio;
    private int estadoId;
    private String notificacionGestionDesc;

    public int getNotificacionGestionId() {
        return notificacionGestionId;
    }

    public void setNotificacionGestionId(int notificacionGestionId) {
        this.notificacionGestionId = notificacionGestionId;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public TcTipoNotificacion getTcTipoNotificacion() {
        return tcTipoNotificacion;
    }

    public void setTcTipoNotificacion(TcTipoNotificacion tcTipoNotificacion) {
        this.tcTipoNotificacion = tcTipoNotificacion;
    }

    public TcMunicipio getTcMunicipio() {
        return tcMunicipio;
    }

    public void setTcMunicipio(TcMunicipio tcMunicipio) {
        this.tcMunicipio = tcMunicipio;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public String getNotificacionGestionDesc() {
        return notificacionGestionDesc;
    }

    public void setNotificacionGestionDesc(String notificacionGestionDesc) {
        this.notificacionGestionDesc = notificacionGestionDesc;
    }
    
    
    
}
