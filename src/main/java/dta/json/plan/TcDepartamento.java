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
public class TcDepartamento implements Serializable{
    
    private int departamentoId=0;
    private String departamentoDesc="";
    private int estadoId;
    private Date fechaRegistro;
    private TcPais tcPais = new TcPais();
    
    public TcDepartamento(){
        
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamentoDesc() {
        return departamentoDesc;
    }

    public void setDepartamentoDesc(String departamentoDesc) {
        this.departamentoDesc = departamentoDesc;
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

    public TcPais getTcPais() {
        return tcPais;
    }

    public void setTcPais(TcPais tcPais) {
        this.tcPais = tcPais;
    }
    
    
    
}
