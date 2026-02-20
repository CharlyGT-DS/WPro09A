/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import dta.json.plan.TcTipoFiador;
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
@FacesConverter(value = "tipoFiadorConverter", forClass = dta.json.plan.TcTipoFiador.class)
public class TipoFiadorConverter implements Converter{
    
     @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcTipoFiador> lista = (List<TcTipoFiador>) uic.getAttributes().get("listaTipofiador");

        if (lista != null) {
            for (TcTipoFiador tipo : lista) {
                if (String.valueOf(tipo.getTipoFiadorId()).equals(value)) {
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
        if (value instanceof TcTipoFiador) {
            TcTipoFiador tipo = (TcTipoFiador) value;
            return String.valueOf(tipo.getTipoFiadorId());
        }

        return "";

    }
}
