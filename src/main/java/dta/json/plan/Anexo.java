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
public class Anexo implements Serializable{
    
    public int anexoGestionId;
    public int estadoId;
    public double size;
    public String ruta;
    public String nombre;
    public String extension;
    public TcTipoAnexo tcTipoAnexo;
    public int turno;
    
}
