/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcTipoGarantia;
import javax.faces.convert.FacesConverter;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


/**
 *
 * @author WINDOWS
 */
@FacesConverter(value = "tipoGarantiaConverter", forClass = dta.json.plan.TcTipoGarantia.class)
public class TipoGarantiaConverter implements Converter{
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcTipoGarantia> lista = (List<TcTipoGarantia>) uic.getAttributes().get("listaTipoGarantia");

        if (lista != null) {
            for (TcTipoGarantia tipo : lista) {
                if (String.valueOf(tipo.getTipoGarantiaId()).equals(value)) {
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
        if (value instanceof TcTipoGarantia) {
            TcTipoGarantia tipo = (TcTipoGarantia) value;
            return String.valueOf(tipo.getTipoGarantiaId());
        }

        return "";

    }
}
