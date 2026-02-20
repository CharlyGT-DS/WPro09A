/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class Punto implements Serializable {
    
   
    @JsonProperty("NO_POLIGONO") 
    private int NO_POLIGONO;
    @JsonProperty("NO") 
    private int NO;
    @JsonProperty("GTM_X") 
    private double GTM_X;
    @JsonProperty("GTM_Y") 
    private double GTM_Y;
    @JsonProperty("ZONA") 
    private double ZONA;
    
    

    public int getNO_POLIGONO() {
        return NO_POLIGONO;
    }

    public void setNO_POLIGONO(int NO_POLIGONO) {
        this.NO_POLIGONO = NO_POLIGONO;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public double getGTM_X() {
        return GTM_X;
    }

    public void setGTM_X(double GTM_X) {
        this.GTM_X = GTM_X;
    }

    public double getGTM_Y() {
        return GTM_Y;
    }

    public void setGTM_Y(double GTM_Y) {
        this.GTM_Y = GTM_Y;
    }

    
    public double getZONA() {
        return ZONA;
    }

    public void setZONA(double ZONA) {
        this.ZONA = ZONA;
    }
  


    
}
