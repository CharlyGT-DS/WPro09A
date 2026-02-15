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
public class TcRegion implements Serializable{

    private int regionId;
    private String regionDesc;
    private String alias;
    private int estadoId;
    private Date fechaRegistro;
    private int codigo;
    private TcMunicipio tcMunicipio;
    private String direccion;
    private int regionReferenciaId;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionDesc() {
        return regionDesc;
    }

    public void setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TcMunicipio getTcMunicipio() {
        return tcMunicipio;
    }

    public void setTcMunicipio(TcMunicipio tcMunicipio) {
        this.tcMunicipio = tcMunicipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getRegionReferenciaId() {
        return regionReferenciaId;
    }

    public void setRegionReferenciaId(int regionReferenciaId) {
        this.regionReferenciaId = regionReferenciaId;
    }
    
    
    
    
}
