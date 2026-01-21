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
public class TcSubregion implements Serializable{
    
    private int subregionId;
    private String subregionDesc;
    private String alias;
    private int estadoId;
    private Date fechaRegistro;
    private int codigo;
    private TcMunicipio tcMunicipio;
    private TcRegion tcRegion;
    private String direccion;
    private Object telefono;
    private TcSubregional tcSubregional;
    private int subregionReferenciaId;

    public int getSubregionId() {
        return subregionId;
    }

    public void setSubregionId(int subregionId) {
        this.subregionId = subregionId;
    }

    public String getSubregionDesc() {
        return subregionDesc;
    }

    public void setSubregionDesc(String subregionDesc) {
        this.subregionDesc = subregionDesc;
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

    public TcRegion getTcRegion() {
        return tcRegion;
    }

    public void setTcRegion(TcRegion tcRegion) {
        this.tcRegion = tcRegion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Object getTelefono() {
        return telefono;
    }

    public void setTelefono(Object telefono) {
        this.telefono = telefono;
    }

    public TcSubregional getTcSubregional() {
        return tcSubregional;
    }

    public void setTcSubregional(TcSubregional tcSubregional) {
        this.tcSubregional = tcSubregional;
    }

    public int getSubregionReferenciaId() {
        return subregionReferenciaId;
    }

    public void setSubregionReferenciaId(int subregionReferenciaId) {
        this.subregionReferenciaId = subregionReferenciaId;
    }
    
    
}
