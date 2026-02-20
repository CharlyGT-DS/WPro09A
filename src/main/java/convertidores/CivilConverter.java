/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcEstadoCivil;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */

@FacesConverter(value = "civilConverter", forClass = TcEstadoCivil.class)
public class CivilConverter implements Converter<TcEstadoCivil>{

    @Override
    public TcEstadoCivil getAsObject(FacesContext fc, UIComponent uic, String string) {
        
        if(string == null || string.isEmpty()){
            return null;
        }
        
        List<TcEstadoCivil> lista = (List<TcEstadoCivil>) uic.getAttributes().get("listaEstado");
        if(lista != null){
            for(TcEstadoCivil ci : lista){
                
             if(String.valueOf(ci.getEstadoCivilId()).equals(string)){
                return ci;                 
             }                   
            }
        }
        
        
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcEstadoCivil t) {
        if(t==null){
            return "";
        }        
        return String.valueOf(t.getEstadoCivilId());
    }
    
}
