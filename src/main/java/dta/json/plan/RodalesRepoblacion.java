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
public class RodalesRepoblacion implements Serializable{
    
    public int rodalRepoblacionId;
    public int estadoId;
    public Date fechaRegistro;
    public int turno;
    public int correlativo;
    public int anioPlantacion;
    public double area;
    public boolean obligatorio;
    public ArrayList<Repoblacion> repoblacion;
    
}
