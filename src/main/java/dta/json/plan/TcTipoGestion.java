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
public class TcTipoGestion implements Serializable{
    
    public int tipoGestionId;
    public String tipoGestionDesc;
    public TcModulo tcModulo;
    public String codigo;
    public int estadoId;
    public Date fechaRegistro;
    
}
