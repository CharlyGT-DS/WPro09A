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
public class GEnericaCincoCampos  implements Serializable{
    
    private Object dato1=null;
    private Object dato2=null;
    private Object dato3=null;
    private Object dato4=null;
    private Object dato5=null;

    public Object getDato1() {
        return dato1;
    }

    public void setDato1(Object dato1) {
        this.dato1 = dato1;
    }

    public Object getDato2() {
        return dato2;
    }

    public void setDato2(Object dato2) {
        this.dato2 = dato2;
    }

    public Object getDato3() {
        return dato3;
    }

    public void setDato3(Object dato3) {
        this.dato3 = dato3;
    }

    public Object getDato4() {
        return dato4;
    }

    public void setDato4(Object dato4) {
        this.dato4 = dato4;
    }

    public Object getDato5() {
        return dato5;
    }

    public void setDato5(Object dato5) {
        this.dato5 = dato5;
    }

    @Override
    public String toString() {
        if(this.dato1.equals(null)&&this.dato2.equals(null)&&this.dato3.equals(null)&&dato4.equals(null)&&dato5.equals(null)){
         return "0";
        }else{
         return "1";
        }
    }
    
    
    
    
}
