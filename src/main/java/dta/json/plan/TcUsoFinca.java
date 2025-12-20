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
public class TcUsoFinca implements Serializable {

    private int usoFincaId;
    private String usoFincaDesc;
    private String codigo;
    private int estadoId;
    private Date fechaRegistro;

    public TcUsoFinca() {
    }

    public TcUsoFinca(int usoFincaId, String usoFincaDesc, String codigo, int estadoId, Date fechaRegistro) {
        this.usoFincaId = usoFincaId;
        this.usoFincaDesc = usoFincaDesc;
        this.codigo = codigo;
        this.estadoId = estadoId;
        this.fechaRegistro = fechaRegistro;
    }

    
    
    public int getUsoFincaId() {
        return usoFincaId;
    }

    public void setUsoFincaId(int usoFincaId) {
        this.usoFincaId = usoFincaId;
    }

    public String getUsoFincaDesc() {
        return usoFincaDesc;
    }

    public void setUsoFincaDesc(String usoFincaDesc) {
        this.usoFincaDesc = usoFincaDesc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

}
