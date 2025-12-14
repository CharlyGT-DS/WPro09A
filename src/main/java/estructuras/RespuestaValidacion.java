/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.io.Serializable;

/**
 *
 * @author WINDOWS
 */
public class RespuestaValidacion implements Serializable{
    
    private String codigo;
    private String descripcion;
    private boolean resultado;

    // constructor default 0 constructo vacio
    public RespuestaValidacion() {
    }

    public RespuestaValidacion(String codigo, String descripcion, boolean resultado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.resultado = resultado;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {        
        return "Código :"+this.codigo+ " Descripción : ["+this.descripcion +"] Resultado : "+this.resultado;        
    }
    
    
    
    
    
    
}
