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
public class TcTipoGarantia implements Serializable{
    
    public int tipoGarantiaId;
    public String tipoGarantiaDesc;
    public int estadoId;
    public Date fechaRegistro;

    // constructor vacio
    public TcTipoGarantia() {
    }
    
    
    // constructor default

    public TcTipoGarantia(int tipoGarantiaId, String tipoGarantiaDesc, int estadoId, Date fechaRegistro) {
        this.tipoGarantiaId = tipoGarantiaId;
        this.tipoGarantiaDesc = tipoGarantiaDesc;
        this.estadoId = estadoId;
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
            
       

    public int getTipoGarantiaId() {
        return tipoGarantiaId;
    }

    public void setTipoGarantiaId(int tipoGarantiaId) {
        this.tipoGarantiaId = tipoGarantiaId;
    }

    public String getTipoGarantiaDesc() {
        return tipoGarantiaDesc;
    }

    public void setTipoGarantiaDesc(String tipoGarantiaDesc) {
        this.tipoGarantiaDesc = tipoGarantiaDesc;
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
