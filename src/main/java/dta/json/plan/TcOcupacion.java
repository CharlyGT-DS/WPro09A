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
public class TcOcupacion implements Serializable{
    
    private int ocupacionId=0;
    private String ocupacionDesc="";
    private int estadoId=0;
    private Date fechaRegistro;
    
    public TcOcupacion(){
        
    }

    public int getOcupacionId() {
        return ocupacionId;
    }

    public void setOcupacionId(int ocupacionId) {
        this.ocupacionId = ocupacionId;
    }

    public String getOcupacionDesc() {
        return ocupacionDesc;
    }

    public void setOcupacionDesc(String ocupacionDesc) {
        this.ocupacionDesc = ocupacionDesc;
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
