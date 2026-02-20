/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import dta.json.plan.TcDepartamento;
import dta.json.plan.TcMunicipio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author csandoval
 */
public class ModeloDocumento implements Serializable{
    
    private Date     fechaEmision;
    private String   nombreNotario;
    private TcDepartamento departamento;
    private TcMunicipio    municipio;
    private String   numeroEscritura;
    private String   numeroFinca;
    private String   numeroFolio;
    private String   numeroLibro;
    private List<String> de = new ArrayList<>();

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNombreNotario() {
        return nombreNotario;
    }

    public void setNombreNotario(String nombreNotario) {
        this.nombreNotario = nombreNotario;
    }

    public TcDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(TcDepartamento departamento) {
        this.departamento = departamento;
    }

    public TcMunicipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(TcMunicipio municipio) {
        this.municipio = municipio;
    }

    public String getNumeroEscritura() {
        return numeroEscritura;
    }

    public void setNumeroEscritura(String numeroEscritura) {
        this.numeroEscritura = numeroEscritura;
    }

    public String getNumeroFinca() {
        return numeroFinca;
    }

    public void setNumeroFinca(String numeroFinca) {
        this.numeroFinca = numeroFinca;
    }

    public String getNumeroFolio() {
        return numeroFolio;
    }

    public void setNumeroFolio(String numeroFolio) {
        this.numeroFolio = numeroFolio;
    }

    public String getNumeroLibro() {
        return numeroLibro;
    }

    public void setNumeroLibro(String numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    public List<String> getDe() {
        return de;
    }

    public void setDe(List<String> de) {
        this.de = de;
    }
    
    
    
    
    
            
    
    
    
}
