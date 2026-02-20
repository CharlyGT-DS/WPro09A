/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import estructuras.HISTORICO.DocumentoInab;

/**
 *
 * @author csandoval
 */
public class TransporteInab {
    
    private DocumentoInab  docu = new DocumentoInab();
    private boolean resultado;
    private String  descripcion="";
    private String  error;

    public DocumentoInab getDocu() {
        return docu;
    }

    public void setDocu(DocumentoInab docu) {
        this.docu = docu;
    }

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    
    
    
    
}
