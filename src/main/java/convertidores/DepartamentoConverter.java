/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcDepartamento;
import dta.json.plan.TcOcupacion;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author csandoval
 */

@FacesConverter(value = "departamentoConverter",forClass = TcDepartamento.class)
public class DepartamentoConverter implements Converter<TcDepartamento>{

    @Override
    public TcDepartamento getAsObject(FacesContext fc, UIComponent uic, String string) {
     
        if(string==null || string.isEmpty()){
            return null;
        }
        
        // Recuperamos la lista que ya está en el atributo del componente
        @SuppressWarnings("unchecked")
        List<TcDepartamento> lista = (List<TcDepartamento>) uic.getAttributes().get("listaDepartamentos");
        
          if (lista != null) {
            for (TcDepartamento oc : lista) {
                if (String.valueOf(oc.getDepartamentoId()).equals(string)) {
                    return oc;
                }
            }
        }

        return null; // si no se encuentra
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcDepartamento t) {
        
        if(t==null){
            return "";
        }
        return String.valueOf(t.getDepartamentoId());
        
    }
    
    
}
