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
public class RespuestaRedis implements Serializable{
    
    private boolean resultado=false;
    private String  descripcion_proceso="";
    
   

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getDescripcion_proceso() {
        return descripcion_proceso;
    }

    public void setDescripcion_proceso(String descripcion_proceso) {
        this.descripcion_proceso = descripcion_proceso;
    }

  
    
}