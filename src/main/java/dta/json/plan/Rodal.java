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
public class Rodal implements Serializable{
    
    public int rodalGestionId;
    public int estadoId;
    public Date fechaRegistro;
    public int correlativo;
    public double area;
    public double areaMuestreada;
    public int edad;
    public double incremento;
    public double pendientePromedio;
    public TcClaseDesarrollo tcClaseDesarrollo;
    public int tamanioParcela;
    public int turno;
    public int totalParcelas;
    public int anio;
    public TcTipoCobertura tcTipoCobertura;
    public double alturaPromedio;
    public double dapPromedio;
    public int conteoArbol;
    public int arbolh;
    public double abh;
    public double volh;
    public int arbolr;
    public double abr;
    public double volr;
    public int cantidadEspecie;
    public int remanente;
    public int anioRepoblacion;
    public double areaGarantia;
    public Object foto;
    public Object imgRodal;
    public double gtmX;
    public double gtmY;
    public boolean valorMadera;
    public ArrayList<Especy> especies;
    public ArrayList<Object> parcelas;
    public ArrayList<Object> brinzal;
    public ArrayList<Object> latizal;
    public ArrayList<Object> productos;
    public Object ttEstadisticoRodal;
    public ArrayList<Object> repoblacion;
    public Object ttEvaluacionCampo;
    public Object ubicacion;
    
}
