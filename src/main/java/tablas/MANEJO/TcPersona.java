/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablas.MANEJO;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author csandoval
 */
public class TcPersona implements Serializable{
    
    @SerializedName("persona_id")
    private Long personaId;
    @Basic(optional = false)
    @NotNull
    @SerializedName("confirmado")   
    private short confirmado;
    @Size(max = 150)
    @SerializedName("correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @SerializedName("cui") 
    private long cui;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @SerializedName("direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @SerializedName("estado_id")  
    private short estadoId;
    @Basic(optional = false)
    @NotNull
    @SerializedName("fecha_nacimiento")
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @SerializedName("fecha_registro")
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @SerializedName("fecha_ult_modif")

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltModif;
    @SerializedName("fecha_vencimiento")
 
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Size(max = 255)
    @SerializedName("nit")

    private String nit;
    @Size(max = 250)
    @SerializedName("password_tmp")
 
    private String passwordTmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @SerializedName("persona_desc")
  
    private String personaDesc;
    @Size(max = 50)
    @SerializedName("rfn")
 
    private String rfn;
    @Size(max = 20)
    @SerializedName("sigla")

    private String sigla;
    @Size(max = 20)
    @SerializedName("telefono")
   
    private String telefono;
    @Size(max = 50)
    @SerializedName("rf")
  
    private String rf;
    @Size(max = 255)
    @SerializedName("ruta_foto")

    private String rutaFoto;

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public short getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(short confirmado) {
        this.confirmado = confirmado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCui() {
        return cui;
    }

    public void setCui(long cui) {
        this.cui = cui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(short estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaUltModif() {
        return fechaUltModif;
    }

    public void setFechaUltModif(Date fechaUltModif) {
        this.fechaUltModif = fechaUltModif;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPasswordTmp() {
        return passwordTmp;
    }

    public void setPasswordTmp(String passwordTmp) {
        this.passwordTmp = passwordTmp;
    }

    public String getPersonaDesc() {
        return personaDesc;
    }

    public void setPersonaDesc(String personaDesc) {
        this.personaDesc = personaDesc;
    }

    public String getRfn() {
        return rfn;
    }

    public void setRfn(String rfn) {
        this.rfn = rfn;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRf() {
        return rf;
    }

    public void setRf(String rf) {
        this.rf = rf;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
    
    
    
}
