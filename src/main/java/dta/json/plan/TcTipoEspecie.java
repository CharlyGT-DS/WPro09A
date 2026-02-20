/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.util.Date;

/**
 *
 * @author csandoval
 */
public class TcTipoEspecie {
    
    private int tipoEspecieId;
    private String tipoEspecieDesc;
    private int estadoId;
    private Date fechaRegistro;

    public int getTipoEspecieId() {
        return tipoEspecieId;
    }

    public void setTipoEspecieId(int tipoEspecieId) {
        this.tipoEspecieId = tipoEspecieId;
    }

    public String getTipoEspecieDesc() {
        return tipoEspecieDesc;
    }

    public void setTipoEspecieDesc(String tipoEspecieDesc) {
        this.tipoEspecieDesc = tipoEspecieDesc;
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
