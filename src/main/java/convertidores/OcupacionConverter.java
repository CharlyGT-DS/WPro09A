/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

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

@FacesConverter(value = "ocupacionConverter", forClass = TcOcupacion.class)
public class OcupacionConverter implements Converter<TcOcupacion> {

    @Override
    public TcOcupacion getAsObject(FacesContext fc, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        
        
        // Recuperamos la lista que ya está en el atributo del componente
        @SuppressWarnings("unchecked")
        List<TcOcupacion> lista = (List<TcOcupacion>) component.getAttributes().get("listaOcupaciones");
        
         if (lista != null) {
            for (TcOcupacion oc : lista) {
                if (String.valueOf(oc.getOcupacionId()).equals(value)) {
                    return oc;
                }
            }
        }

        return null; // si no se encuentra
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, TcOcupacion value) {
        
        if (value == null) {
            return "";
        }
        return String.valueOf(value.getOcupacionId());
        
    }
    
}
