/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author csandoval
 */
public class Puntos {
    
    private List<Punto> puntos    = new ArrayList<>();
    
    private List<PuntoUTM> puntosUTM = new ArrayList<>();
    
    private RespuestaPuntoUTM medio = new RespuestaPuntoUTM();

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }

    public RespuestaPuntoUTM getMedio() {
        return medio;
    }

    public void setMedio(RespuestaPuntoUTM medio) {
        this.medio = medio;
    }

    public List<PuntoUTM> getPuntosUTM() {
        return puntosUTM;
    }

    public void setPuntosUTM(List<PuntoUTM> puntosUTM) {
        this.puntosUTM = puntosUTM;
    }

    
    
    
}
