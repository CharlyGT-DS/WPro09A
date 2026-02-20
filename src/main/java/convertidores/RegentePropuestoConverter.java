/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcRegentePropuesto;

import javax.faces.convert.FacesConverter;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


/**
 *
 * @author WINDOWS
 */
@FacesConverter(value = "regentePropuestoConverter", forClass = dta.json.plan.TcRegentePropuesto.class)
public class RegentePropuestoConverter implements Converter{
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcRegentePropuesto> lista = (List<TcRegentePropuesto>) uic.getAttributes().get("listaRegentePorpuesto");

        if (lista != null) {
            for (TcRegentePropuesto regente : lista) {
                if (String.valueOf(regente.getNit()).equals(value)) {
                    return regente;
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
        if (value instanceof TcRegentePropuesto) {
            TcRegentePropuesto regente = (TcRegentePropuesto) value;
            return String.valueOf(regente.getNit());
        }

        return "";

    }
}
