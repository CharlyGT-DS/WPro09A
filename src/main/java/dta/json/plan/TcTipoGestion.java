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
public class TcTipoGestion implements Serializable{
    
    private int tipoGestionId;
    private String tipoGestionDesc;
    private TcModulo tcModulo;
    private String codigo;
    private int estadoId;
    private Date fechaRegistro;

    public int getTipoGestionId() {
        return tipoGestionId;
    }

    public void setTipoGestionId(int tipoGestionId) {
        this.tipoGestionId = tipoGestionId;
    }

    public String getTipoGestionDesc() {
        return tipoGestionDesc;
    }

    public void setTipoGestionDesc(String tipoGestionDesc) {
        this.tipoGestionDesc = tipoGestionDesc;
    }

    public TcModulo getTcModulo() {
        return tcModulo;
    }

    public void setTcModulo(TcModulo tcModulo) {
        this.tcModulo = tcModulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
