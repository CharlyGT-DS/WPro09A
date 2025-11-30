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
public class Uso implements Serializable{
    
    private int usoFincaGestionId;
    private int estadoId;
    private Date fechaRegistro;
    private TcUsoFinca tcUsoFinca;
    private double area;

    public int getUsoFincaGestionId() {
        return usoFincaGestionId;
    }

    public void setUsoFincaGestionId(int usoFincaGestionId) {
        this.usoFincaGestionId = usoFincaGestionId;
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

    public TcUsoFinca getTcUsoFinca() {
        return tcUsoFinca;
    }

    public void setTcUsoFinca(TcUsoFinca tcUsoFinca) {
        this.tcUsoFinca = tcUsoFinca;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
