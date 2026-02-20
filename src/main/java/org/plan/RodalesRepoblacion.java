
package org.plan;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}area"/&gt;
 *         &lt;element ref="{}correlativo"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}obligatorio"/&gt;
 *         &lt;element ref="{}turno"/&gt;
 *         &lt;element ref="{}anioPlantacion"/&gt;
 *         &lt;element ref="{}repoblacion"/&gt;
 *         &lt;element ref="{}rodalRepoblacionId"/&gt;
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
@XmlRootElement(name = "rodalesRepoblacion")
public class RodalesRepoblacion {

    @XmlElementRefs({
        @XmlElementRef(name = "area", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "correlativo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "obligatorio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "turno", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anioPlantacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "repoblacion", type = Repoblacion.class, required = false),
        @XmlElementRef(name = "rodalRepoblacionId", type = JAXBElement.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Repoblacion }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
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
