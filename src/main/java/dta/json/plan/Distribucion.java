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
public class Distribucion implements Serializable{
    
    public int diametricaEspecieId;
    public int estadoId;
    public TcClaseDiametrica tcClaseDiametrica;
    public TcTratamientoSilvicultural tcTratamientoSilvicultural;
    public int arbolr;
    public double abr;
    public double volr;
    public int arbolrExtraer;
    public double abrExtraer;
    public double volrExtraer;
    public int conteoArbol;
    public double volumen;
    public double areaBasal;
    public double pintervenir;
    public String fuste;
}
