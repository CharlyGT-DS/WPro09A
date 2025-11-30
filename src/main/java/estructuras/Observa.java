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
public class Observa implements Serializable{
    
    private int    id =0;
    private String dto="";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getDto() {
        return dto;
    }

    public void setDto(String dto) {
        this.dto = dto;
    }
    
    
    
}
