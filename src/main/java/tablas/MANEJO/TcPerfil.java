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
public class TcPerfil implements Serializable{
    
    @SerializedName("perfil_id")   
    private Long perfilId;
    @Basic(optional = false)
    @NotNull
    @SerializedName("estado_id")    
    private short estadoId;
    @SerializedName("fecha_registro")   
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "fecha_ult_modif")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltModif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @SerializedName("perfil_desc")   
    private String perfilDesc;
    @Size(max = 255)
    @SerializedName("codigo")    
    private String codigo;

    public Long getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Long perfilId) {
        this.perfilId = perfilId;
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

    public String getPerfilDesc() {
        return perfilDesc;
    }

    public void setPerfilDesc(String perfilDesc) {
        this.perfilDesc = perfilDesc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
