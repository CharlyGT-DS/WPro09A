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
public class TcSexo  implements Serializable{
    
    private int sexoId;
    private String sexoDesc;
    private int estadoId;
    private Date fechaRegistro;

    public int getSexoId() {
        return sexoId;
    }

    public void setSexoId(int sexoId) {
        this.sexoId = sexoId;
    }

    public String getSexoDesc() {
        return sexoDesc;
    }

    public void setSexoDesc(String sexoDesc) {
        this.sexoDesc = sexoDesc;
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
