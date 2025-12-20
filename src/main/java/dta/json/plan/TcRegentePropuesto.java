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
public class TcRegentePropuesto implements Serializable{
    private int categoriaProfesion;
    private int municipioId;
    private String nit;
    private String noCedula;
    private String noColegiado;
    private String noRegistro;
    private String nombre;
    private String profesion;
    private int profesionId;
    private int profesionalId;

    public int getCategoriaProfesion() {
        return categoriaProfesion;
    }

    public void setCategoriaProfesion(int categoriaProfesion) {
        this.categoriaProfesion = categoriaProfesion;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNoCedula() {
        return noCedula;
    }

    public void setNoCedula(String noCedula) {
        this.noCedula = noCedula;
    }

    public String getNoColegiado() {
        return noColegiado;
    }

    public void setNoColegiado(String noColegiado) {
        this.noColegiado = noColegiado;
    }

    public String getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(String noRegistro) {
        this.noRegistro = noRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getProfesionId() {
        return profesionId;
    }

    public void setProfesionId(int profesionId) {
        this.profesionId = profesionId;
    }

    public int getProfesionalId() {
        return profesionalId;
    }

    public void setProfesionalId(int profesionalId) {
        this.profesionalId = profesionalId;
    }
    
    

}
