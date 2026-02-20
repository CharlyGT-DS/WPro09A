/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcSistemaCorta;
import javax.faces.convert.FacesConverter;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


/**
 *
 * @author WINDOWS
 */
@FacesConverter(value = "sistemaCortaConverter", forClass = dta.json.plan.TcSistemaCorta.class)
public class SistemaCortaConverter implements Converter{
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcSistemaCorta> lista = (List<TcSistemaCorta>) uic.getAttributes().get("listaSistemaCorta");

        if (lista != null) {
            for (TcSistemaCorta sis : lista) {
                if (String.valueOf(sis.getSistemaCortaId()).equals(value)) {
                    return sis;
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
        if (value instanceof TcSistemaCorta) {
            TcSistemaCorta sis = (TcSistemaCorta) value;
            return String.valueOf(sis.getSistemaCortaId());
        }

        return "";

    }
}
