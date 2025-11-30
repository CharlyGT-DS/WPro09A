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
public class Repoblacion implements Serializable{
    
    private int especieRecuperacionId;
    private int estadoId;
    private TcEspecie tcEspecie;
    private TcMetodoSiembra tcMetodoSiembra;
    private TcSistemaRepoblacion tcSistemaRepoblacion;
    private double densidadInicial;

    public int getEspecieRecuperacionId() {
        return especieRecuperacionId;
    }

    public void setEspecieRecuperacionId(int especieRecuperacionId) {
        this.especieRecuperacionId = especieRecuperacionId;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public TcEspecie getTcEspecie() {
        return tcEspecie;
    }

    public void setTcEspecie(TcEspecie tcEspecie) {
        this.tcEspecie = tcEspecie;
    }

    public TcMetodoSiembra getTcMetodoSiembra() {
        return tcMetodoSiembra;
    }

    public void setTcMetodoSiembra(TcMetodoSiembra tcMetodoSiembra) {
        this.tcMetodoSiembra = tcMetodoSiembra;
    }

    public TcSistemaRepoblacion getTcSistemaRepoblacion() {
        return tcSistemaRepoblacion;
    }

    public void setTcSistemaRepoblacion(TcSistemaRepoblacion tcSistemaRepoblacion) {
        this.tcSistemaRepoblacion = tcSistemaRepoblacion;
    }

    public double getDensidadInicial() {
        return densidadInicial;
    }

    public void setDensidadInicial(double densidadInicial) {
        this.densidadInicial = densidadInicial;
    }
    
    
    
}
