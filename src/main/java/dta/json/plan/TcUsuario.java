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
public class TcUsuario implements Serializable{
    
    private int usuarioId;
    private String usuarioDesc;
    private String usuario;
    private String correo;
    private int estadoId;
    private Date fechaRegistro;
    private int requiereCambioClave;
    private Object tcPerfil;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getRequiereCambioClave() {
        return requiereCambioClave;
    }

    public void setRequiereCambioClave(int requiereCambioClave) {
        this.requiereCambioClave = requiereCambioClave;
    }

    public Object getTcPerfil() {
        return tcPerfil;
    }

    public void setTcPerfil(Object tcPerfil) {
        this.tcPerfil = tcPerfil;
    }
    
    
}