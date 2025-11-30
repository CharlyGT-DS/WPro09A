/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import dta.json.plan.TcPersona;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author csandoval
 */
public class RespuestaPersonas implements Serializable{
    
    private String status;
    private String message;
    private ArrayList<TcPersona> data = new ArrayList<>();
    private Object singleValue;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<TcPersona> getData() {
        return data;
    }

    public void setData(ArrayList<TcPersona> data) {
        this.data = data;
    }

    public Object getSingleValue() {
        return singleValue;
    }

    public void setSingleValue(Object singleValue) {
        this.singleValue = singleValue;
    }
    
    
    
}
