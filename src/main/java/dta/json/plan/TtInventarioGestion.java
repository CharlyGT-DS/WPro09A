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
public class TtInventarioGestion implements Serializable{
    
    public int inventarioGestionId;
    public Date fechaAsignacion;
    public TcOrigenCalculo tcOrigenCalculo;
    public TcTipoInventario tcTipoInventario;
    public int totalRodales;
    public double diametro;
    public double areaMuestreada;
    public double intensidadMuestreo;
    public double tamanioParcela;
    public Object tcFormaParcela;
    public Object tcTipoMuestreo;
    public int compensaPendiente;
    public String data;
    public String regresion;
    public String analisisDescriptivo;
    public Object latizal;
    public String brinzal;
    public Object obsRegeneracion;
    public Object formula;
    public Object descripcionCausa;
    public Object descripcionDanio;
    
}
