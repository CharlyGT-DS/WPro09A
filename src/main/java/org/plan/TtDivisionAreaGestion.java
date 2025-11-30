
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
 *         &lt;element ref="{}areaBosque"/&gt;
 *         &lt;element ref="{}areaFuera"/&gt;
 *         &lt;element ref="{}areaIntervenirBosque"/&gt;
 *         &lt;element ref="{}areaIntervenirFuera"/&gt;
 *         &lt;element ref="{}areaProduccion"/&gt;
 *         &lt;element ref="{}areaProteccionBosque"/&gt;
 *         &lt;element ref="{}areaProteccionFuera"/&gt;
 *         &lt;element ref="{}divisionAreaGestionId"/&gt;
 *         &lt;element ref="{}fueraBosque"/&gt;
 *         &lt;element ref="{}ttGestion"/&gt;
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
@XmlRootElement(name = "ttDivisionAreaGestion")
public class TtDivisionAreaGestion {

    @XmlElementRefs({
        @XmlElementRef(name = "areaBosque", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaFuera", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaIntervenirBosque", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaIntervenirFuera", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaProduccion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaProteccionBosque", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaProteccionFuera", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "divisionAreaGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fueraBosque", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttGestion", type = TtGestion.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link TtGestion }
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
