/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@FacesConverter(value = "xmlGregorianCalendarConverter")
public class XMLGregorianCalendarConverter implements Converter<XMLGregorianCalendar> {

    private static final String PATTERN = "dd/MM/yyyy";

    @Override
    public XMLGregorianCalendar getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) return null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
            Date date = sdf.parse(value);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            throw new ConverterException(new FacesMessage("Error al convertir la fecha"));
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, XMLGregorianCalendar value) {
        if (value == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        return sdf.format(value.toGregorianCalendar().getTime());
    }
}
