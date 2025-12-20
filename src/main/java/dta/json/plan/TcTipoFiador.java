/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;

/**
 *
 * @author WINDOWS
 */
public class TcTipoFiador implements Serializable{
    private int tipoFiadorId;
    private String nombreEmpresa;
    private String rnf;

    public int getTipoFiadorId() {
        return tipoFiadorId;
    }

    public void setTipoFiadorId(int tipoFiadorId) {
        this.tipoFiadorId = tipoFiadorId;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRnf() {
        return rnf;
    }

    public void setRnf(String rnf) {
        this.rnf = rnf;
    }

    
}
