/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author WINDOWS
 */
@Named(value="medidasProteccion")
@ViewScoped
public class MedidasProteccion implements  Serializable{
    
    private String txtAreaUno,txtAreaDos,txtAreaTres,txtAreaCuatro,
            txtAreaCinco,txtAreaSeis,txtAreaSiete,txtAreaOcho,txtAreaNueve;
    
    

    public String getTxtAreaUno() {
        return txtAreaUno;
    }

    public void setTxtAreaUno(String txtAreaUno) {
        this.txtAreaUno = txtAreaUno;
    }

    public String getTxtAreaDos() {
        return txtAreaDos;
    }

    public void setTxtAreaDos(String txtAreaDos) {
        this.txtAreaDos = txtAreaDos;
    }

    public String getTxtAreaTres() {
        return txtAreaTres;
    }

    public void setTxtAreaTres(String txtAreaTres) {
        this.txtAreaTres = txtAreaTres;
    }

    public String getTxtAreaCuatro() {
        return txtAreaCuatro;
    }

    public void setTxtAreaCuatro(String txtAreaCuatro) {
        this.txtAreaCuatro = txtAreaCuatro;
    }

    public String getTxtAreaCinco() {
        return txtAreaCinco;
    }

    public void setTxtAreaCinco(String txtAreaCinco) {
        this.txtAreaCinco = txtAreaCinco;
    }

    public String getTxtAreaSeis() {
        return txtAreaSeis;
    }

    public void setTxtAreaSeis(String txtAreaSeis) {
        this.txtAreaSeis = txtAreaSeis;
    }

    public String getTxtAreaSiete() {
        return txtAreaSiete;
    }

    public void setTxtAreaSiete(String txtAreaSiete) {
        this.txtAreaSiete = txtAreaSiete;
    }

    public String getTxtAreaOcho() {
        return txtAreaOcho;
    }

    public void setTxtAreaOcho(String txtAreaOcho) {
        this.txtAreaOcho = txtAreaOcho;
    }

    public String getTxtAreaNueve() {
        return txtAreaNueve;
    }

    public void setTxtAreaNueve(String txtAreaNueve) {
        this.txtAreaNueve = txtAreaNueve;
    }
    
    
    public void grabar(){
        System.out.println("-------------Se ejecuto el metod-------------------");
        
        System.out.println("graba dato 1: "+this.txtAreaUno);
        System.out.println("graba dato 1: "+this.txtAreaDos);
        System.out.println("graba dato 1: "+this.txtAreaTres);
        System.out.println("graba dato 1: "+this.txtAreaCuatro);
        
    }
    
    
    
}
