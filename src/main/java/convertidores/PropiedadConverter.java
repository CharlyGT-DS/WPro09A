/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcSexo;
import dta.json.plan.TcTipoPropiedad;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */
 
@FacesConverter(value = "tiposPropiedadConverter", forClass = dta.json.plan.TcTipoPropiedad.class)
public class PropiedadConverter implements  Converter<TcTipoPropiedad>{

    @Override
    public TcTipoPropiedad getAsObject(FacesContext fc, UIComponent uic, String string) {
      
        if(string == null  || string.isEmpty()){
            return null;
        }
        
         List<dta.json.plan.TcTipoPropiedad> lista = (List<dta.json.plan.TcTipoPropiedad>) uic.getAttributes().get("listaTiposPropiedad");
        
        if(lista!=null){
            
            for(TcTipoPropiedad oc : lista){
              
                if(String.valueOf(oc.getTipoPropiedadId()).equals(string)){
                    return oc;
                }
            }
        }
        
        return null;
        
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcTipoPropiedad t) {
      
        
        if(t==null){
            
            return "";
        }
        
        return String.valueOf(t.getTipoPropiedadId());
        
    }
    
    
    
    
    
}
