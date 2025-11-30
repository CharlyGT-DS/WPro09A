/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author csandoval
 */
public class Finca implements Serializable{
    
    private int fincaGestionId;
    private int estadoId;
    private Date fechaRegistro;
    private TcFinca tcFinca;
    private Date fechaEmision;
    private String notario;
    private TcMunicipioEmite tcMunicipioEmite;
    private String numeroDocumento;
    private int folio;
    private Object libro;
    private TcTipoPropiedad tcTipoPropiedad;
    private Object tcLibro;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Object> documentos;

    public int getFincaGestionId() {
        return fincaGestionId;
    }

    public void setFincaGestionId(int fincaGestionId) {
        this.fincaGestionId = fincaGestionId;
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

    public TcFinca getTcFinca() {
        return tcFinca;
    }

    public void setTcFinca(TcFinca tcFinca) {
        this.tcFinca = tcFinca;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNotario() {
        return notario;
    }

    public void setNotario(String notario) {
        this.notario = notario;
    }

    public TcMunicipioEmite getTcMunicipioEmite() {
        return tcMunicipioEmite;
    }

    public void setTcMunicipioEmite(TcMunicipioEmite tcMunicipioEmite) {
        this.tcMunicipioEmite = tcMunicipioEmite;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Object getLibro() {
        return libro;
    }

    public void setLibro(Object libro) {
        this.libro = libro;
    }

    public TcTipoPropiedad getTcTipoPropiedad() {
        return tcTipoPropiedad;
    }

    public void setTcTipoPropiedad(TcTipoPropiedad tcTipoPropiedad) {
        this.tcTipoPropiedad = tcTipoPropiedad;
    }

    public Object getTcLibro() {
        return tcLibro;
    }

    public void setTcLibro(Object tcLibro) {
        this.tcLibro = tcLibro;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public ArrayList<Object> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<Object> documentos) {
        this.documentos = documentos;
    }
    
    
    
}
