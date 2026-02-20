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
public class TcPersona implements Serializable{
    
    private int personaId;
    private String personaDesc;
    private long cui;
    private Date fechaVencimiento;
    private TcMunicipio tcMunicipio = new TcMunicipio();
    private String direccion;
    private String telefono;
    private String correo;
    private Object foto;
    private String rutaFoto;
    private TcUsuario tcUsuario = new TcUsuario();
    private Date fechaNacimiento;
    private TcCultura tcCultura = new TcCultura();
    private TcIdioma tcIdioma = new TcIdioma();
    private TcEstadoCivil tcEstadoCivil= new TcEstadoCivil();
    private TcSexo tcSexo= new TcSexo();
    private int estadoId;
    private Date fechaRegistro;
    private int confirmado;
    private Object passwordTmp;
    private String nit="";
    private Object fechaUltModif;
    private TcOcupacion tcOcupacion = new TcOcupacion();
    private Object tcPuesto;
    private Object sigla;
    private Object rfn;
    private Object rf;
    private Object tcUsuarioSubregion;
    private Object usuario;
    private Object tmpFoto;
    
    public TcPersona(){
        
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getPersonaDesc() {
        return personaDesc;
    }

    public void setPersonaDesc(String personaDesc) {
        this.personaDesc = personaDesc;
    }

    public long getCui() {
        return cui;
    }

    public void setCui(long cui) {
        this.cui = cui;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public TcMunicipio getTcMunicipio() {
        return tcMunicipio;
    }

    public void setTcMunicipio(TcMunicipio tcMunicipio) {
        this.tcMunicipio = tcMunicipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Object getFoto() {
        return foto;
    }

    public void setFoto(Object foto) {
        this.foto = foto;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public TcUsuario getTcUsuario() {
        return tcUsuario;
    }

    public void setTcUsuario(TcUsuario tcUsuario) {
        this.tcUsuario = tcUsuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TcCultura getTcCultura() {
        return tcCultura;
    }

    public void setTcCultura(TcCultura tcCultura) {
        this.tcCultura = tcCultura;
    }

    public TcIdioma getTcIdioma() {
        return tcIdioma;
    }

    public void setTcIdioma(TcIdioma tcIdioma) {
        this.tcIdioma = tcIdioma;
    }

    public TcEstadoCivil getTcEstadoCivil() {
        return tcEstadoCivil;
    }

    public void setTcEstadoCivil(TcEstadoCivil tcEstadoCivil) {
        this.tcEstadoCivil = tcEstadoCivil;
    }

    public TcSexo getTcSexo() {
        return tcSexo;
    }

    public void setTcSexo(TcSexo tcSexo) {
        this.tcSexo = tcSexo;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(int confirmado) {
        this.confirmado = confirmado;
    }

    public Object getPasswordTmp() {
        return passwordTmp;
    }

    public void setPasswordTmp(Object passwordTmp) {
        this.passwordTmp = passwordTmp;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Object getFechaUltModif() {
        return fechaUltModif;
    }

    public void setFechaUltModif(Object fechaUltModif) {
        this.fechaUltModif = fechaUltModif;
    }

    public TcOcupacion getTcOcupacion() {
        return tcOcupacion;
    }

    public void setTcOcupacion(TcOcupacion tcOcupacion) {
        this.tcOcupacion = tcOcupacion;
    }

    public Object getTcPuesto() {
        return tcPuesto;
    }

    public void setTcPuesto(Object tcPuesto) {
        this.tcPuesto = tcPuesto;
    }

    public Object getSigla() {
        return sigla;
    }

    public void setSigla(Object sigla) {
        this.sigla = sigla;
    }

    public Object getRfn() {
        return rfn;
    }

    public void setRfn(Object rfn) {
        this.rfn = rfn;
    }

    public Object getRf() {
        return rf;
    }

    public void setRf(Object rf) {
        this.rf = rf;
    }

    public Object getTcUsuarioSubregion() {
        return tcUsuarioSubregion;
    }

    public void setTcUsuarioSubregion(Object tcUsuarioSubregion) {
        this.tcUsuarioSubregion = tcUsuarioSubregion;
    }

    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }

    public Object getTmpFoto() {
        return tmpFoto;
    }

    public void setTmpFoto(Object tmpFoto) {
        this.tmpFoto = tmpFoto;
    }
    
    
    
}
