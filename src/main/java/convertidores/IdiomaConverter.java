/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcIdioma;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */

@FacesConverter(value = "idiomaConverter",forClass = TcIdioma.class)
public class IdiomaConverter implements Converter<TcIdioma>{

    @Override
    public TcIdioma getAsObject(FacesContext fc, UIComponent uic, String string) {
    
        if(string==null || string.isEmpty()){
            return null;
        }
        
        // obtenemos la lista
        @SuppressWarnings("unchecked")
        List<TcIdioma> lista = (List<TcIdioma>) uic.getAttributes().get("listaIdio");
        
        if(lista !=null){
            
            for(TcIdioma oc : lista){
                
                if(String.valueOf(oc.getIdiomaId()).equals(string)){
                    return oc;
                }
                
            }
            
            
        }
        
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcIdioma t) {
       if(t==null){
           return "";
       }           
       return String.valueOf(t.getIdiomaId());
    }
    
}
