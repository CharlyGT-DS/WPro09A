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
public class repoblacion_informe implements Serializable{
    
    private int    repoblacion_id;
    private String repoblacion_desc;

    public int getRepoblacion_id() {
        return repoblacion_id;
    }

    public void setRepoblacion_id(int repoblacion_id) {
        this.repoblacion_id = repoblacion_id;
    }

    public String getRepoblacion_desc() {
        return repoblacion_desc;
    }

    public void setRepoblacion_desc(String repoblacion_desc) {
        this.repoblacion_desc = repoblacion_desc;
    }
    
    
    
}
