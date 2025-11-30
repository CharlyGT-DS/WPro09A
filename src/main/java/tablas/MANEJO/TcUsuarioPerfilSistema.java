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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author csandoval
 */
public class TcUsuarioPerfilSistema implements Serializable{
    
    

    @SerializedName("usuario_perfil_sistema_id")
    private Long usuarioPerfilSistemaId;
    @SerializedName("estado_id")
    private short estadoId;
    
    @SerializedName("fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @SerializedName( "fecha_ult_modif")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltModif;
    
    @SerializedName("perfil_id")
    private short perfilId;
    
    @SerializedName("sistema_id")
    private short sistemaId;
     
    @SerializedName("usuario_id")
    private short usuarioId;

    public Long getUsuarioPerfilSistemaId() {
        return usuarioPerfilSistemaId;
    }

    public void setUsuarioPerfilSistemaId(Long usuarioPerfilSistemaId) {
        this.usuarioPerfilSistemaId = usuarioPerfilSistemaId;
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

    public Date getFechaUltModif() {
        return fechaUltModif;
    }

    public void setFechaUltModif(Date fechaUltModif) {
        this.fechaUltModif = fechaUltModif;
    }

    public short getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(short perfilId) {
        this.perfilId = perfilId;
    }

    public short getSistemaId() {
        return sistemaId;
    }

    public void setSistemaId(short sistemaId) {
        this.sistemaId = sistemaId;
    }

    public short getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(short usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    
    
 
}
