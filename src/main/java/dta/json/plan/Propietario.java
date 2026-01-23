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
public class Propietario implements Serializable{
    
    private int propietarioFincaId;
    private int estadoId;
    private Date fechaRegistro;
    private TcPersona tcPersona;

    public int getPropietarioFincaId() {
        return propietarioFincaId;
    }

    public void setPropietarioFincaId(int propietarioFincaId) {
        this.propietarioFincaId = propietarioFincaId;
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

    public TcPersona getTcPersona() {
        return tcPersona;
    }

    public void setTcPersona(TcPersona tcPersona) {
        this.tcPersona = tcPersona;
    }
    
    
    
    
}
