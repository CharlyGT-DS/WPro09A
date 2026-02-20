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
public class TcCultura implements Serializable{
  
    private int culturaId;
    private String culturaDesc;
    private int estadoId;
    private Date fechaRegistro;
    
    public TcCultura(){
        
    }

    public int getCulturaId() {
        return culturaId;
    }

    public void setCulturaId(int culturaId) {
        this.culturaId = culturaId;
    }

    public String getCulturaDesc() {
        return culturaDesc;
    }

    public void setCulturaDesc(String culturaDesc) {
        this.culturaDesc = culturaDesc;
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
