/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author csandoval
 */
public class NotaInformeFinal implements Serializable{
    
    private int    id;
    private int    tipo_nota;
    private int    numero_nota;
    private Date   fecha;
    private String producto="";
    private int    especie_id;
    private String especie_desc;
    private double volumen;
    private String destino="";
    private int    codigo_depmuni;
    private String municipio_departamento_desc;
    private String motivo_extravio="";
    private double volumen2;
    private List<estructuras.NotasEDet> detalle = new ArrayList<estructuras.NotasEDet>();
    
    

    public List<NotasEDet> getDetalle() {
        return  this.detalle;
    }

    public void setDetalle(NotasEDet detalle) {
        this.detalle.add(detalle);
    }

    public double getVolumen2() {
        return volumen2;
    }

    public void setVolumen2(double volumen2) {
        this.volumen2 = volumen2;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_nota() {
        return tipo_nota;
    }

    public void setTipo_nota(int tipo_nota) {
        this.tipo_nota = tipo_nota;
    }

    public int getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        this.numero_nota = numero_nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getEspecie_id() {
        return especie_id;
    }

    public void setEspecie_id(int especie_id) {
        this.especie_id = especie_id;
    }

    public String getEspecie_desc() {
        return especie_desc;
    }

    public void setEspecie_desc(String especie_desc) {
        this.especie_desc = especie_desc;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCodigo_depmuni() {
        return codigo_depmuni;
    }

    public void setCodigo_depmuni(int codigo_depmuni) {
        this.codigo_depmuni = codigo_depmuni;
    }

    public String getMunicipio_departamento_desc() {
        return municipio_departamento_desc;
    }

    public void setMunicipio_departamento_desc(String municipio_departamento_desc) {
        this.municipio_departamento_desc = municipio_departamento_desc;
    }

    public String getMotivo_extravio() {
        return motivo_extravio;
    }

    public void setMotivo_extravio(String motivo_extravio) {
        this.motivo_extravio = motivo_extravio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
