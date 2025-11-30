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
public class TcRegente implements Serializable{
    
    public int personaId;
    public String personaDesc;
    public long cui;
    public Date fechaVencimiento;
    public TcMunicipio tcMunicipio;
    public String direccion;
    public String telefono;
    public String correo;
    public Object foto;
    public String rutaFoto;
    public TcUsuario tcUsuario;
    public Date fechaNacimiento;
    public TcCultura tcCultura;
    public TcIdioma tcIdioma;
    public TcEstadoCivil tcEstadoCivil;
    public TcSexo tcSexo;
    public int estadoId;
    public Date fechaRegistro;
    public int confirmado;
    public Object passwordTmp;
    public String nit;
    public Object fechaUltModif;
    public TcOcupacion tcOcupacion;
    public Object tcPuesto;
    public String sigla;
    public String rfn;
    public String rf;
    public Object tcUsuarioSubregion;
    public Object usuario;
    public Object tmpFoto;
    
}
