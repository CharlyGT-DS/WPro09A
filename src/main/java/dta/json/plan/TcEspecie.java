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
public class TcEspecie implements Serializable{
    
    public int especieId;
    public String especieDesc;
    public String nombreCientifico;
    public Object ecuacion;
    public Object formula;
    public String codigo;
    public Object sinonimo;
    public int estadoId;
    public int aceptaFormula;
    public Date fechaRegistro;
    public Object tcTipoEspecie;
    public Object tcTipoMadera;
    public int personaRegistraId;
    public int personaActualizaId;
    public Date fechaActualiza;
    public String ecuacionLatifoliado;
    
}
