/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablas.MANEJO;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author csandoval
 */
public class TcSubregion implements Serializable{
    


    @SerializedName("subregion_id")    
    private Long subregionId;
    @SerializedName("codigo")   
    private int codigo;    
    @SerializedName("direccion")
    private String direccion;
    @SerializedName("estado_id")
    private short estadoId;
    @SerializedName("fecha_registro")
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @SerializedName("subregion_desc")
    private String subregionDesc;
    @SerializedName("municipio_id")
    private int municipioID;
    @SerializedName("region_id")
    private int regionId;
    @SerializedName("alias")
    private String alias;
    @SerializedName("telefono")
    private String telefono;

    public Long getSubregionId() {
        return subregionId;
    }

    public void setSubregionId(Long subregionId) {
        this.subregionId = subregionId;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getSubregionDesc() {
        return subregionDesc;
    }

    public void setSubregionDesc(String subregionDesc) {
        this.subregionDesc = subregionDesc;
    }

    public int getMunicipioID() {
        return municipioID;
    }

    public void setMunicipioID(int municipioID) {
        this.municipioID = municipioID;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

            
   
    
    
}
