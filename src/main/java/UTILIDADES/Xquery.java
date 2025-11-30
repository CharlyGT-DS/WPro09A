/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import java.io.Serializable;

/**
 *
 * @author csandoval
 */
public class Xquery implements Serializable{
    
     public static String xmlConsultaDocumento(String core, String index) {

        System.out.println("data =" + core +"/"+index);
     
        
        return "xquery version \"3.1\"; " +
       "declare option exist:output \"wrap=no\"; " +
       "let $c := doc(\"/db/" + core + "/" + index + "\")/DocumentoInab " +
       "return " +
       "if (empty($c)) then " +
       "<data>El archivo no existe en la base</data> " +
       "else " +
       "$c";
        
    }
    
}
