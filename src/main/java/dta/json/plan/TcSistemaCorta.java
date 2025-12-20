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
public class TcSistemaCorta implements Serializable{
    
    private int sistemaCortaId;
    private String sistemaCortaDesc;
    private int estadoId;
    private Date fechaRegistro;

    public TcSistemaCorta() {
    }

    public TcSistemaCorta(int sistemaCortaId, String sistemaCortaDesc, int estadoId, Date fechaRegistro) {
        this.sistemaCortaId = sistemaCortaId;
        this.sistemaCortaDesc = sistemaCortaDesc;
        this.estadoId = estadoId;
        this.fechaRegistro = fechaRegistro;
    }
    
    public int getSistemaCortaId() {
        return sistemaCortaId;
    }

    public void setSistemaCortaId(int sistemaCortaId) {
        this.sistemaCortaId = sistemaCortaId;
    }

    public String getSistemaCortaDesc() {
        return sistemaCortaDesc;
    }

    public void setSistemaCortaDesc(String sistemaCortaDesc) {
        this.sistemaCortaDesc = sistemaCortaDesc;
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
