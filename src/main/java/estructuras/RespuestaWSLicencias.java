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
public class RespuestaWSLicencias implements Serializable {
    
    private static final long serialVersionUID = -46908433673499254L;

    private boolean resultado=false;
    private String  descripcion;
    private String  proceso;
    private String  carga_salida;

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getCarga_salida() {
        return carga_salida;
    }

    public void setCarga_salida(String carga_salida) {
        this.carga_salida = carga_salida;
    }
    
    
    
}
