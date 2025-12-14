/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcCriterioProteccion;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author WINDOWS
 */
@FacesConverter(value = "criterioProteccionConverter", forClass = dta.json.plan.TcCriterioProteccion.class)
public class CriterioProteccionConverter implements Converter {
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcCriterioProteccion> lista = (List<TcCriterioProteccion>) uic.getAttributes().get("listaCriterioProteccion");

        if (lista != null) {
            for (TcCriterioProteccion criterio : lista) {
                if (String.valueOf(criterio.getCriterioProteccionId()).equals(value)) {
                    return criterio;
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

        // IMPORTANTE: Si ya es String, regresarlo tal cual
        if (value instanceof String) {
            return (String) value;
        }

        // Si es el objeto, devolver su ID
        if (value instanceof TcCriterioProteccion) {
            TcCriterioProteccion criterio = (TcCriterioProteccion) value;
            return String.valueOf(criterio.getCriterioProteccionId());
        }

        return "";

    }
}
