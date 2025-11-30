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
public class TcTipoPropietario implements Serializable{
    
    private int    tipoPropietarioId;
    private String tipoPropietarioDesc;
    private int    estadoId;
    private Date   fechaRegistro;

    public int getTipoPropietarioId() {
        return tipoPropietarioId;
    }

    public void setTipoPropietarioId(int tipoPropietarioId) {
        this.tipoPropietarioId = tipoPropietarioId;
    }

    public String getTipoPropietarioDesc() {
        return tipoPropietarioDesc;
    }

    public void setTipoPropietarioDesc(String tipoPropietarioDesc) {
        this.tipoPropietarioDesc = tipoPropietarioDesc;
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
