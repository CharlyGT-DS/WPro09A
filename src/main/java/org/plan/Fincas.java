
package org.plan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}folio"/&gt;
 *         &lt;element ref="{}libro"/&gt;
 *         &lt;element ref="{}notario"/&gt;
 *         &lt;element ref="{}numeroDocumento"/&gt;
 *         &lt;element ref="{}tcLibro"/&gt;
 *         &lt;element ref="{}tcMunicipioEmite"/&gt;
 *         &lt;element ref="{}tcTipoPropiedad"/&gt;
 *         &lt;element ref="{}fechaEmision"/&gt;
 *         &lt;element ref="{}fincaGestionId"/&gt;
 *         &lt;element ref="{}propietarios"/&gt;
 *         &lt;element ref="{}tcFinca"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "fincas")
public class Fincas {

    @XmlElementRefs({
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "folio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "libro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notario", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numeroDocumento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcLibro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcMunicipioEmite", type = TcMunicipioEmite.class, required = false),
        @XmlElementRef(name = "tcTipoPropiedad", type = TcTipoPropiedad.class, required = false),
        @XmlElementRef(name = "fechaEmision", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fincaGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "propietarios", type = Propietarios.class, required = false),
        @XmlElementRef(name = "tcFinca", type = TcFinca.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcMunicipioEmite }
     * {@link TcTipoPropiedad }
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Propietarios }
     * {@link TcFinca }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
