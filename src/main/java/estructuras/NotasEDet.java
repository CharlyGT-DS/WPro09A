/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class NotasEDet implements Serializable,Cloneable{
    
    
    private int    id;
    private int    idtabla=0;
    private int    numero_nota=0;    
    private String producto;
    private int    especie_id=0;
    private double volumen=0;
    private double volumen2=0;

    public NotasEDet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public int getIdtabla() {
        return idtabla;
    }

    public void setIdtabla(int idtabla) {
        this.idtabla = idtabla;
    }

    public int getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        this.numero_nota = numero_nota;
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

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen2() {
        return volumen2;
    }

    public void setVolumen2(double volumen2) {
        this.volumen2 = volumen2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
    
}
