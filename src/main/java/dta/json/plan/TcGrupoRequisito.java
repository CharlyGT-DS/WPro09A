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
public class TcGrupoRequisito implements Serializable{
    
    public int grupoRequisitoId;
    public String grupoRequisitoDesc;
    public int estadoId;
    public Date fechaRegistro;
    public int obligatorio;
    public Object tooltip;
    
}
