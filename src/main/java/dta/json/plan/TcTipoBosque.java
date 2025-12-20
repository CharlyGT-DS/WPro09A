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
public class TcTipoBosque implements Serializable{
    
    public int tipoBosqueId;
    public String tipoBosqueDesc;
    public int estadoId;
    public Date fechaRegistro;
    public int ocultar;

    public TcTipoBosque() {
    }

    public TcTipoBosque(int tipoBosqueId, String tipoBosqueDesc, int estadoId, Date fechaRegistro, int ocultar) {
        this.tipoBosqueId = tipoBosqueId;
        this.tipoBosqueDesc = tipoBosqueDesc;
        this.estadoId = estadoId;
        this.fechaRegistro = fechaRegistro;
        this.ocultar = ocultar;
    }

    
    
    public int getTipoBosqueId() {
        return tipoBosqueId;
    }

    public void setTipoBosqueId(int tipoBosqueId) {
        this.tipoBosqueId = tipoBosqueId;
    }

    public String getTipoBosqueDesc() {
        return tipoBosqueDesc;
    }

    public void setTipoBosqueDesc(String tipoBosqueDesc) {
        this.tipoBosqueDesc = tipoBosqueDesc;
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

    public int getOcultar() {
        return ocultar;
    }

    public void setOcultar(int ocultar) {
        this.ocultar = ocultar;
    }
    
}
