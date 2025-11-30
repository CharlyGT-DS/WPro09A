/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class TtTipoPropietarioGestion implements Serializable{
    
    private int tipoPropietarioGestionId;
    private TcTipoPropietario tcTipoPropietario;
    private TcTipoEntidad tcTipoEntidad;
    private Object razonSocial;
    private Object nombreComercial;
    private Object nitEntidad;
    private int categoriaProfesionId;

    public int getTipoPropietarioGestionId() {
        return tipoPropietarioGestionId;
    }

    public void setTipoPropietarioGestionId(int tipoPropietarioGestionId) {
        this.tipoPropietarioGestionId = tipoPropietarioGestionId;
    }

    public TcTipoPropietario getTcTipoPropietario() {
        return tcTipoPropietario;
    }

    public void setTcTipoPropietario(TcTipoPropietario tcTipoPropietario) {
        this.tcTipoPropietario = tcTipoPropietario;
    }

    public TcTipoEntidad getTcTipoEntidad() {
        return tcTipoEntidad;
    }

    public void setTcTipoEntidad(TcTipoEntidad tcTipoEntidad) {
        this.tcTipoEntidad = tcTipoEntidad;
    }

    public Object getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(Object razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Object getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(Object nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Object getNitEntidad() {
        return nitEntidad;
    }

    public void setNitEntidad(Object nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public int getCategoriaProfesionId() {
        return categoriaProfesionId;
    }

    public void setCategoriaProfesionId(int categoriaProfesionId) {
        this.categoriaProfesionId = categoriaProfesionId;
    }
    
    
    
}
