/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATRONES;

import estructuras.RespuestaValidacion;

/**
 *
 * @author WINDOWS
 */

// nombres de la clases cuando se usan , deben de crear con adjetivos, y si se componen por dos o mas palabras usamos PascalCase   
// esta es la clase facase que es el punto de comunicacion con las clases servidoras
public class FacadePlan {
    
    
    public static RespuestaValidacion verificaArea(double area){
        return VALIDACIONES.ValidacionesNumericas.validarArea(area);
    } 
    
    
    public static RespuestaValidacion verificaAreas(String[] nombresCampos, double... areas) {

        for (int i = 0; i < areas.length; i++) {
            
            // Validación individual
            RespuestaValidacion res = verificaArea(areas[i]);

            // Si falla
            if (!res.isResultado()) {
                res.setDescripcion(nombresCampos[i] + ": " + res.getDescripcion()
                );
                return res;
            }
        }
        // Todas válidas
        return new RespuestaValidacion("0", "Validación correcta", true);
    }
    
    public static RespuestaValidacion verificaDPI(String dpi) {
        return VALIDACIONES.ValidacionesNumericas.validarDPI(dpi);
    }
}
