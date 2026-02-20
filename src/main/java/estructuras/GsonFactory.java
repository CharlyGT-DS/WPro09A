/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import com.google.gson.*;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author csandoval
 */
public class GsonFactory {
    
     public static Gson createGsonWithXMLGregorianCalendar(String dateFormat) {
        return new GsonBuilder()
               .registerTypeAdapter(XMLGregorianCalendar.class,
    (JsonDeserializer<XMLGregorianCalendar>) (json, typeOfT, context) -> {
        try {
            if (json.isJsonPrimitive()) {
                // Caso: viene como "2025-08-12 10:45:00"
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = sdf.parse(json.getAsString());
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(date);
                return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            } else if (json.isJsonObject()) {
                // Caso: viene como { "year": ..., "month": ..., "day": ... }
                JsonObject obj = json.getAsJsonObject();
                int year = obj.get("year").getAsInt();
                int month = obj.get("month").getAsInt();
                int day = obj.get("day").getAsInt();
                GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
                return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            } else {
                throw new JsonParseException("Formato de fecha no soportado: " + json);
            }
        } catch (Exception e) {
            throw new JsonParseException(e);
        }
    })
                .create();
    }
    
}
