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
public class TtResumenGestion implements Serializable{
    
   private int resumenGestionId;
   private TcSistemaCorta tcSistemaCorta;
   private TcTipoGarantia tcTipoGarantia;
   private int noTurnos;
   private int edadRotacion;
   private int anios;
   private int aniosSolicitado;
   private int meses;
   private String nombreFiador;
   private long dpiFiador;
   private int categoriaProfesionId;
   private TcRegente tcRegente;
   private int tipoFiadorId;
   private Object nombreEmpresa;
   private Object rnf;

    public int getResumenGestionId() {
        return resumenGestionId;
    }

    public void setResumenGestionId(int resumenGestionId) {
        this.resumenGestionId = resumenGestionId;
    }

    public TcSistemaCorta getTcSistemaCorta() {
        return tcSistemaCorta;
    }

    public void setTcSistemaCorta(TcSistemaCorta tcSistemaCorta) {
        this.tcSistemaCorta = tcSistemaCorta;
    }

    public TcTipoGarantia getTcTipoGarantia() {
        return tcTipoGarantia;
    }

    public void setTcTipoGarantia(TcTipoGarantia tcTipoGarantia) {
        this.tcTipoGarantia = tcTipoGarantia;
    }

    public int getNoTurnos() {
        return noTurnos;
    }

    public void setNoTurnos(int noTurnos) {
        this.noTurnos = noTurnos;
    }

    public int getEdadRotacion() {
        return edadRotacion;
    }

    public void setEdadRotacion(int edadRotacion) {
        this.edadRotacion = edadRotacion;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getAniosSolicitado() {
        return aniosSolicitado;
    }

    public void setAniosSolicitado(int aniosSolicitado) {
        this.aniosSolicitado = aniosSolicitado;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String getNombreFiador() {
        return nombreFiador;
    }

    public void setNombreFiador(String nombreFiador) {
        this.nombreFiador = nombreFiador;
    }

    public long getDpiFiador() {
        return dpiFiador;
    }

    public void setDpiFiador(long dpiFiador) {
        this.dpiFiador = dpiFiador;
    }

    public int getCategoriaProfesionId() {
        return categoriaProfesionId;
    }

    public void setCategoriaProfesionId(int categoriaProfesionId) {
        this.categoriaProfesionId = categoriaProfesionId;
    }

    public TcRegente getTcRegente() {
        return tcRegente;
    }

    public void setTcRegente(TcRegente tcRegente) {
        this.tcRegente = tcRegente;
    }

    public int getTipoFiadorId() {
        return tipoFiadorId;
    }

    public void setTipoFiadorId(int tipoFiadorId) {
        this.tipoFiadorId = tipoFiadorId;
    }

    public Object getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(Object nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Object getRnf() {
        return rnf;
    }

    public void setRnf(Object rnf) {
        this.rnf = rnf;
    }
    
   
}
