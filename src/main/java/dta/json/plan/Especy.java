/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author csandoval
 */
public class Especy implements Serializable{
    
    public int especieGestionId;
    public int estadoId;
    public Date fechaRegistro;
    public TcEspecie tcEspecie;
    public int no;
    public int especieRodalId;
    public TcTipoInventario tcTipoInventario;
    public TcTratamientoSilvicultural tcTratamientoSilvicultural;
    public double sumaAltura;
    public double sumaDap;
    public double sumaVolumen;
    public double sumaAb;
    public int conteoArbol;
    public int arboles;
    public double alturaPromedio;
    public double dapPromedio;
    public int arbolh;
    public double abh;
    public double volh;
    public int arbolr;
    public double abr;
    public double volr;
    public int arbolrExtraer;
    public double abrExtraer;
    public double volrExtraer;
    public int arbolResidual;
    public double abResidual;
    public double volResidual;
    public int parcela;
    public double porcentaje;
    public int mostrarPGeneral;
    public int mostrarPFuste;
    public double ptroza;
    public double troza;
    public double lenia;
    public Object fuste;
    public ArrayList<Distribucion> distribucion;
    public Object ttEspecieEvaluada;
    
}
