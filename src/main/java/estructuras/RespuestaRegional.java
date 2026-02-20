package estructuras;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class RespuestaRegional implements Serializable {
    @SerializedName("director_regional_usuario_id")
    private int usuarioId=0;

    @SerializedName("director_regional_subregion")
    private String subregion="";

    @SerializedName("director_regional_usuario")
    private String usuario="";

    @SerializedName("director_regional_usuario_desc")
    private String usuarioDesc="";

    // Constructor
    public RespuestaRegional() {
    }

    public RespuestaRegional(int usuarioId, String subregion, String usuario, String usuarioDesc) {
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
        return "RespuestaRegional{" +
                "usuarioId=" + usuarioId +
                ", subregion='" + subregion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", usuarioDesc='" + usuarioDesc + '\'' +
                '}';
    }
}
