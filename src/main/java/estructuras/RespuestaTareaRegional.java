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
public class RespuestaTareaRegional implements Serializable {
    @SerializedName("usuario_id")
    private int usuarioId;

    @SerializedName("subregion")
    private String subregion;

    @SerializedName("usuario")
    private String usuario;

    @SerializedName("usuario_desc")
    private String usuarioDesc;

    // Constructor
    public RespuestaTareaRegional() {
    }

    public RespuestaTareaRegional(int usuarioId, String subregion, String usuario, String usuarioDesc) {
        this.usuarioId = usuarioId;
        this.subregion = subregion;
        this.usuario = usuario;
        this.usuarioDesc = usuarioDesc;
    }

    // Getters y Setters
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
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

    @Override
    public String toString() {
        return "RespuestaTareaRegional{" +
                "usuarioId=" + usuarioId +
                ", subregion='" + subregion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", usuarioDesc='" + usuarioDesc + '\'' +
                '}';
    }
}
