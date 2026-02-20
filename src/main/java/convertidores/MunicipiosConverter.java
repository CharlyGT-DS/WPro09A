/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcMunicipio;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */

@FacesConverter(value = "municipiosConverter", forClass = TcMunicipio.class)
public class MunicipiosConverter implements Converter<TcMunicipio>{

    @Override
    public TcMunicipio getAsObject(FacesContext fc, UIComponent uic, String string) {
     
        if(string==null||string.isEmpty()){
            return null;
        }
        
        // obtener la lista
        List<TcMunicipio> lista = (List<TcMunicipio>) uic.getAttributes().get("listaMunicipios");
        if(lista != null){
            
            for(TcMunicipio oc: lista){
               if(String.valueOf(oc.getMunicipioId()).equals(string)){
                   return oc;
               }                
            }            
        }
        
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcMunicipio t) {
        
        if(t==null){
            return "";
        }
        
        return String.valueOf(t.getMunicipioId());
     
    }
    
}
