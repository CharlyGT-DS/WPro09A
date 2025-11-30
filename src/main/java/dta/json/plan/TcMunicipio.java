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
public class TcMunicipio implements Serializable{
    
    private int municipioId=0;
    private String municipioDesc="";
    private int estadoId=0;
    private Date fechaRegistro;
    private TcDepartamento tcDepartamento = new TcDepartamento();
    private int codigo=0;
    
    public TcMunicipio(){
        
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public String getMunicipioDesc() {
        return municipioDesc;
    }

    public void setMunicipioDesc(String municipioDesc) {
        this.municipioDesc = municipioDesc;
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

    public TcDepartamento getTcDepartamento() {
        return tcDepartamento;
    }

    public void setTcDepartamento(TcDepartamento tcDepartamento) {
        this.tcDepartamento = tcDepartamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
