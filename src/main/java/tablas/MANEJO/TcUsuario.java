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
public class TcUsuario implements Serializable{
    
    @SerializedName("usuario_id")
    private Long usuarioId;
    @SerializedName("clave_usuario")
    private String claveUsuario="";
    @SerializedName("correo")
    private String correo="";
    @SerializedName("estado_id")
    private short estadoId=0;
    @SerializedName("fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @SerializedName("requiere_cambio_clave")
    private short requiereCambioClave;
    @SerializedName("usuario")
    private String usuario;
    @SerializedName("usuario_desc")
    @Column(name = "usuario_desc")
    private String usuarioDesc;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public short getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(short estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public short getRequiereCambioClave() {
        return requiereCambioClave;
    }

    public void setRequiereCambioClave(short requiereCambioClave) {
        this.requiereCambioClave = requiereCambioClave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioDesc() {
        return usuarioDesc;
    }

    public void setUsuarioDesc(String usuarioDesc) {
        this.usuarioDesc = usuarioDesc;
    }
    
    
    
   
    
}
