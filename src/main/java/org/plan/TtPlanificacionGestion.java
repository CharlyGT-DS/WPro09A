
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
 *         &lt;element ref="{}formula"/&gt;
 *         &lt;element ref="{}incremento"/&gt;
 *         &lt;element ref="{}justificacion"/&gt;
 *         &lt;element ref="{}actividadAprovechamiento"/&gt;
 *         &lt;element ref="{}areaCompromiso"/&gt;
 *         &lt;element ref="{}areaExistente"/&gt;
 *         &lt;element ref="{}areaExtraer"/&gt;
 *         &lt;element ref="{}areaIntervenir"/&gt;
 *         &lt;element ref="{}cap"/&gt;
 *         &lt;element ref="{}carbon"/&gt;
 *         &lt;element ref="{}establecimiento"/&gt;
 *         &lt;element ref="{}hayReforestacion"/&gt;
 *         &lt;element ref="{}justificacionEspecie"/&gt;
 *         &lt;element ref="{}masaForestal"/&gt;
 *         &lt;element ref="{}planificacionGestionId"/&gt;
 *         &lt;element ref="{}postAprovechamiento"/&gt;
 *         &lt;element ref="{}tcCriterioCorta"/&gt;
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
@XmlRootElement(name = "ttPlanificacionGestion")
public class TtPlanificacionGestion {

    @XmlElementRefs({
        @XmlElementRef(name = "formula", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "incremento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "justificacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "actividadAprovechamiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaCompromiso", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaExistente", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaExtraer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaIntervenir", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cap", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "carbon", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "establecimiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hayReforestacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "justificacionEspecie", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "masaForestal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "planificacionGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postAprovechamiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcCriterioCorta", type = TcCriterioCorta.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcCriterioCorta }
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
