
package convertidores;

import dta.json.plan.TcUsoFinca;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;





@FacesConverter(value = "fincaUsoConverter", forClass = dta.json.plan.TcUsoFinca.class)
public class FincaUsoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.trim().isEmpty()) {
            return null;
        }

        List<TcUsoFinca> lista = (List<TcUsoFinca>) uic.getAttributes().get("listausoFinca");

        if (lista != null) {
            for (TcUsoFinca uso : lista) {
                if (String.valueOf(uso.getUsoFincaId()).equals(value)) {
                    return uso;
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
        if (value instanceof TcUsoFinca) {
            TcUsoFinca uso = (TcUsoFinca) value;
            return String.valueOf(uso.getUsoFincaId());
        }

        return "";

    }
}
