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
public class TcFinca implements Serializable{
    
    private int fincaId;
    private String fincaDesc;
    private String direccion;
    private double gtmX;
    private double gtmY;
    private String norte;
    private String sur;
    private String este;
    private String oeste;
    private double area;
    private double areaDocumento;
    private String notario;
    private String numeroDocumento;
    private int folio;
    private Object libro;
    private TcMunicipio tcMunicipio;
    private TcMunicipioEmite tcMunicipioEmite;
    private TcTipoPropiedad tcTipoPropiedad;
    private int estadoId;
    private Date fechaRegistro;
    private Object tcLibro;
    private int personaModificaId;
    private Object fechaUltimaModif;

    public int getFincaId() {
        return fincaId;
    }

    public void setFincaId(int fincaId) {
        this.fincaId = fincaId;
    }

    public String getFincaDesc() {
        return fincaDesc;
    }

    public void setFincaDesc(String fincaDesc) {
        this.fincaDesc = fincaDesc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getGtmX() {
        return gtmX;
    }

    public void setGtmX(double gtmX) {
        this.gtmX = gtmX;
    }

    public double getGtmY() {
        return gtmY;
    }

    public void setGtmY(double gtmY) {
        this.gtmY = gtmY;
    }

    public String getNorte() {
        return norte;
    }

    public void setNorte(String norte) {
        this.norte = norte;
    }

    public String getSur() {
        return sur;
    }

    public void setSur(String sur) {
        this.sur = sur;
    }

    public String getEste() {
        return este;
    }

    public void setEste(String este) {
        this.este = este;
    }

    public String getOeste() {
        return oeste;
    }

    public void setOeste(String oeste) {
        this.oeste = oeste;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAreaDocumento() {
        return areaDocumento;
    }

    public void setAreaDocumento(double areaDocumento) {
        this.areaDocumento = areaDocumento;
    }

    public String getNotario() {
        return notario;
    }

    public void setNotario(String notario) {
        this.notario = notario;
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

    public TcMunicipio getTcMunicipio() {
        return tcMunicipio;
    }

    public void setTcMunicipio(TcMunicipio tcMunicipio) {
        this.tcMunicipio = tcMunicipio;
    }

    public TcMunicipioEmite getTcMunicipioEmite() {
        return tcMunicipioEmite;
    }

    public void setTcMunicipioEmite(TcMunicipioEmite tcMunicipioEmite) {
        this.tcMunicipioEmite = tcMunicipioEmite;
    }

    public TcTipoPropiedad getTcTipoPropiedad() {
        return tcTipoPropiedad;
    }

    public void setTcTipoPropiedad(TcTipoPropiedad tcTipoPropiedad) {
        this.tcTipoPropiedad = tcTipoPropiedad;
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

    public Object getTcLibro() {
        return tcLibro;
    }

    public void setTcLibro(Object tcLibro) {
        this.tcLibro = tcLibro;
    }

    public int getPersonaModificaId() {
        return personaModificaId;
    }

    public void setPersonaModificaId(int personaModificaId) {
        this.personaModificaId = personaModificaId;
    }

    public Object getFechaUltimaModif() {
        return fechaUltimaModif;
    }

    public void setFechaUltimaModif(Object fechaUltimaModif) {
        this.fechaUltimaModif = fechaUltimaModif;
    }
    
    
    
    
    
}
