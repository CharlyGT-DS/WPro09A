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
public class TcPais implements Serializable{
    
    private int paisId;
    private String paisDesc;
    private int estadoId;
    private Date fechaRegistro;

    public int getPaisId() {
        return paisId;
    }

    public void setPaisId(int paisId) {
        this.paisId = paisId;
    }

    public String getPaisDesc() {
        return paisDesc;
    }

    public void setPaisDesc(String paisDesc) {
        this.paisDesc = paisDesc;
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
    

