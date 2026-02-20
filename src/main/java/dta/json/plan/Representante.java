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
public class Representante implements Serializable{
    
    private int personaGestionId;
    private int estadoId;
    private Date fechaRegistro;
    private TcPersona tcPersona;
    private int representanteLegal;
    private int soloRepresenta;
    private Object expediente;

    public int getPersonaGestionId() {
        return personaGestionId;
    }

    public void setPersonaGestionId(int personaGestionId) {
        this.personaGestionId = personaGestionId;
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

    public int getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(int representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public int getSoloRepresenta() {
        return soloRepresenta;
    }

    public void setSoloRepresenta(int soloRepresenta) {
        this.soloRepresenta = soloRepresenta;
    }

    public Object getExpediente() {
        return expediente;
    }

    public void setExpediente(Object expediente) {
        this.expediente = expediente;
    }
    
    
    
}
