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
public class TcRegion implements Serializable{

    public int regionId;
    public String regionDesc;
    public String alias;
    public int estadoId;
    public Date fechaRegistro;
    public int codigo;
    public TcMunicipio tcMunicipio;
    public String direccion;
    public int regionReferenciaId;
    
    
}
