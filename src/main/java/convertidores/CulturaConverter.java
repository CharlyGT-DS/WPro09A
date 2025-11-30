/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcCultura;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */

@FacesConverter(value = "culturaConverter", forClass = TcCultura.class )
public class CulturaConverter implements Converter<TcCultura>{

    @Override
    public TcCultura getAsObject(FacesContext fc, UIComponent uic, String string) {
        
       if(string == null || string.isEmpty()){
           return null;
       }
       
       // atributo lista
       List<TcCultura> lista = ( List<TcCultura>) uic.getAttributes().get("listaCultura");
       
       if(lista != null){
           for(TcCultura oc: lista){
             if(String.valueOf(oc.getCulturaId()).equals(string)){
                return oc;                  
             }
           }
       }
       return null; 
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcCultura t) {
  
        if(t==null){
            return "";
        }
        
        return String.valueOf(t.getCulturaId());
    }
    
}
