
package org.plan;

import java.io.Serializable;
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
 *         &lt;element ref="{}justificacion"/&gt;
 *         &lt;element ref="{}ampliacionRonda"/&gt;
 *         &lt;element ref="{}areaCritica"/&gt;
 *         &lt;element ref="{}combustible"/&gt;
 *         &lt;element ref="{}controlPlaga"/&gt;
 *         &lt;element ref="{}cortafuego"/&gt;
 *         &lt;element ref="{}justificacionPf"/&gt;
 *         &lt;element ref="{}monitoreoPlaga"/&gt;
 *         &lt;element ref="{}proteccionGestionId"/&gt;
 *         &lt;element ref="{}respuestaIf"/&gt;
 *         &lt;element ref="{}rondaCortafuego"/&gt;
 *         &lt;element ref="{}rutaEscape"/&gt;
 *         &lt;element ref="{}vigilancia"/&gt;
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
@XmlRootElement(name = "ttProteccionGestion")
public class TtProteccionGestion {

    @XmlElementRefs({
        @XmlElementRef(name = "justificacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ampliacionRonda", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaCritica", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "combustible", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "controlPlaga", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cortafuego", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "justificacionPf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "monitoreoPlaga", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proteccionGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "respuestaIf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rondaCortafuego", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rutaEscape", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vigilancia", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
