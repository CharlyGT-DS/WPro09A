/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class Licencias implements Serializable{
    
    @SerializedName("expediente")
    private String expediente="";
    @SerializedName("tipo_licencia")
    private int tipo_licencia=0;
    @SerializedName("tipo_licencia_desc")
    private String tipo_licencia_desc="";
    @SerializedName("numero_licencia_poa")
    private String numero_licencia_poa="";
    @SerializedName("gestion_id")
    private int gestion_id=0;
    @SerializedName("subregion_id")
    private int subregion_id=0;
    @SerializedName("subregion_alias")
    private String subregion_alias="";
    @SerializedName("perfil_id")
    private int perfil_id=0;
    @SerializedName("perfil_desc")
    private String perfil_desc="";

    public Licencias(String expediente, int tipo_licencia, String tipo_licencia_desc, String numero_licencia_poa, int gestion_id, int subregion_id, String subregion_alias, int perfil_id, String perfil_desc) {
        this.expediente = expediente;
        this.tipo_licencia = tipo_licencia;
        this.tipo_licencia_desc = tipo_licencia_desc;
        this.numero_licencia_poa = numero_licencia_poa;
        this.gestion_id = gestion_id;
        this.subregion_id = subregion_id;
        this.subregion_alias = subregion_alias;
        this.perfil_id = perfil_id;
        this.perfil_desc = perfil_desc;
    }

    public Licencias() {
    }
    
    
    

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public int getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(int tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    public String getTipo_licencia_desc() {
        return tipo_licencia_desc;
    }

    public void setTipo_licencia_desc(String tipo_licencia_desc) {
        this.tipo_licencia_desc = tipo_licencia_desc;
    }

    public String getNumero_licencia_poa() {
        return numero_licencia_poa;
    }

    public void setNumero_licencia_poa(String numero_licencia_poa) {
        this.numero_licencia_poa = numero_licencia_poa;
    }

    public int getGestion_id() {
        return gestion_id;
    }

    public void setGestion_id(int gestion_id) {
        this.gestion_id = gestion_id;
    }

    public int getSubregion_id() {
        return subregion_id;
    }

    public void setSubregion_id(int subregion_id) {
        this.subregion_id = subregion_id;
    }

    public String getSubregion_alias() {
        return subregion_alias;
    }

    public void setSubregion_alias(String subregion_alias) {
        this.subregion_alias = subregion_alias;
    }

    public int getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(int perfil_id) {
        this.perfil_id = perfil_id;
    }

    public String getPerfil_desc() {
        return perfil_desc;
    }

    public void setPerfil_desc(String perfil_desc) {
        this.perfil_desc = perfil_desc;
    }
    
    
    

  
    
    
    
}
