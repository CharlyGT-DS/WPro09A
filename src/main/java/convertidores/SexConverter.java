/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcSexo;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */


@FacesConverter(value = "sexConverter", forClass = dta.json.plan.TcSexo.class)
public class SexConverter  implements Converter<TcSexo>{

    @Override
    public TcSexo getAsObject(FacesContext fc, UIComponent uic, String string) {
     
        if(string == null  || string.isEmpty()){
            return null;
        }
        
        List<dta.json.plan.TcSexo> lista = (List<dta.json.plan.TcSexo>) uic.getAttributes().get("listaSexo");
        
        if(lista!=null){
            
            for(TcSexo oc : lista){
              
                if(String.valueOf(oc.getSexoId()).equals(string)){
                    return oc;
                }
            }
        }
        
        return null;
 
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcSexo t) {
       
        if(t == null){
            return "";
        }
        
        return String.valueOf(t.getSexoId());
        
    }
    
    
}
