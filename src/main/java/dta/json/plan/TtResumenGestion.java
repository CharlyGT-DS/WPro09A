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
    
    public int resumenGestionId;
    public TcSistemaCorta tcSistemaCorta;
    public TcTipoGarantia tcTipoGarantia;
    public int noTurnos;
    public int edadRotacion;
    public int anios;
    public int aniosSolicitado;
    public int meses;
    public String nombreFiador;
    public long dpiFiador;
    public int categoriaProfesionId;
    public TcRegente tcRegente;
    public int tipoFiadorId;
    public Object nombreEmpresa;
    public Object rnf;
    
}
