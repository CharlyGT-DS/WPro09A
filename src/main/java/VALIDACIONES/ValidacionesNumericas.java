/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VALIDACIONES;

import estructuras.RespuestaValidacion;

/**
 *
 * @author WINDOWS
 */
// este es una clase Servidora
public class ValidacionesNumericas {

    // los nombres de los metodos son acciones por lo que se usan nombre como verbos
    // la nomentlatura es camel case.  los parametros que reciben las acciones se llmana arguntos
    public static estructuras.RespuestaValidacion validarArea(double area) {
        if (area <= 0) {
            return new RespuestaValidacion("001", "El área no puede ser cero o negativa", false);
        }

        // Siempre devolver algo si es válido
        return new RespuestaValidacion("000", "Área válida", true);
    }
}
