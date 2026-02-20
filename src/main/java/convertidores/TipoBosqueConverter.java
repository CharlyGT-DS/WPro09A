/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import javax.faces.convert.FacesConverter;
import dta.json.plan.TcTipoBosque;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


/**
 *
 * @author WINDOWS
 */
@FacesConverter(value = "tipoBosqueConverter", forClass = dta.json.plan.TcTipoBosque.class)
public class TipoBosqueConverter implements Converter{
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcTipoBosque> lista = (List<TcTipoBosque>) uic.getAttributes().get("listaTipoBosque");

        if (lista != null) {
            for (TcTipoBosque tipo : lista) {
                if (String.valueOf(tipo.getTipoBosqueId()).equals(value)) {
                    return tipo;
                }
            }
        }

        return null;
    }

  @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {

        if (value == null) {
            return "";
        }

        // 👇 IMPORTANTE: Si ya es String, regresarlo tal cual
        if (value instanceof String) {
            return (String) value;
        }

        // Si es el objeto, devolver su ID
        if (value instanceof TcTipoBosque) {
            TcTipoBosque tipo = (TcTipoBosque) value;
            return String.valueOf(tipo.getTipoBosqueId());
        }

        return "";

    }
}
