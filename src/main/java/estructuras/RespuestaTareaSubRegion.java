/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author luis
 */
public class RespuestaTareaSubRegion implements Serializable{
    @SerializedName("usuario_id")
    private int usuarioId=0;

    @SerializedName("usuario_desc")
    private String usuarioDesc="";

    @SerializedName("usuario")
    private String usuario="";

    @SerializedName("subregion_id")
    private int subregionId=0;

    @SerializedName("subregion_desc")
    private String subregionDesc="";

    @SerializedName("alias")
    private String alias="";

    @SerializedName("municipio_id")
    private int municipioId=0;

    @SerializedName("municipio_desc")
    private String municipioDesc="";

    @SerializedName("departamento_id")
    private int departamentoId=0;

    @SerializedName("departamento_desc")
    private String departamentoDesc="";

    @SerializedName("perfil_id")
    private int perfilId=0;

    @SerializedName("perfil_desc")
    private String perfilDesc="";
    
    
    public RespuestaTareaSubRegion(){
        
    }

    // Constructor
    public RespuestaTareaSubRegion(int usuarioId, String usuarioDesc, String usuario, int subregionId, String subregionDesc,
                   String alias, int municipioId, String municipioDesc, int departamentoId,
                   String departamentoDesc, int perfilId, String perfilDesc) {
        this.usuarioId = usuarioId;
        this.usuarioDesc = usuarioDesc;
        this.usuario = usuario;
        this.subregionId = subregionId;
        this.subregionDesc = subregionDesc;
        this.alias = alias;
        this.municipioId = municipioId;
        this.municipioDesc = municipioDesc;
        this.departamentoId = departamentoId;
        this.departamentoDesc = departamentoDesc;
        this.perfilId = perfilId;
        this.perfilDesc = perfilDesc;
    }

    // Getters y Setters
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioDesc() {
        return usuarioDesc;
    }

    public void setUsuarioDesc(String usuarioDesc) {
        this.usuarioDesc = usuarioDesc;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSubregionId() {
        return subregionId;
    }

    public void setSubregionId(int subregionId) {
        this.subregionId = subregionId;
    }

    public String getSubregionDesc() {
        return subregionDesc;
    }

    public void setSubregionDesc(String subregionDesc) {
        this.subregionDesc = subregionDesc;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public String getMunicipioDesc() {
        return municipioDesc;
    }

    public void setMunicipioDesc(String municipioDesc) {
        this.municipioDesc = municipioDesc;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamentoDesc() {
        return departamentoDesc;
    }

    public void setDepartamentoDesc(String departamentoDesc) {
        this.departamentoDesc = departamentoDesc;
    }

    public int getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    public String getPerfilDesc() {
        return perfilDesc;
    }

    public void setPerfilDesc(String perfilDesc) {
        this.perfilDesc = perfilDesc;
    }

    // Método toString
    @Override
public String toString() {
    return "RespuestaTareaSubRegion{" +
            "usuarioId=" + usuarioId +
            ", usuarioDesc='" + usuarioDesc + '\'' +
            ", usuario='" + usuario + '\'' +
            ", subregionId=" + subregionId +
            ", subregionDesc='" + subregionDesc + '\'' +
            ", alias='" + alias + '\'' +
            ", municipioId=" + municipioId +
            ", municipioDesc='" + municipioDesc + '\'' +
            ", departamentoId=" + departamentoId +
            ", departamentoDesc='" + departamentoDesc + '\'' +
            ", perfilId=" + perfilId +
            ", perfilDesc='" + perfilDesc + '\'' +
            '}';
}

}

