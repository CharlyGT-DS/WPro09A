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
@Named(value="biofisicas")
@ViewScoped
public class Biofisicas implements  Serializable{
    
    private String txtAreaUno,txtAreaDos,txtAreaTres,txtAreaCuatro;

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
    
    
    public void grabar(){
        System.out.println("-------------Se ejecuto el metod-------------------");
        
        System.out.println("graba dato 1: "+this.txtAreaUno);
        System.out.println("graba dato 1: "+this.txtAreaDos);
        System.out.println("graba dato 1: "+this.txtAreaTres);
        System.out.println("graba dato 1: "+this.txtAreaCuatro);
        
    }
    
    
    
}
