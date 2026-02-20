
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
 *         &lt;element ref="{}areaMuestreada"/&gt;
 *         &lt;element ref="{}data"/&gt;
 *         &lt;element ref="{}fechaAsignacion"/&gt;
 *         &lt;element ref="{}formula"/&gt;
 *         &lt;element ref="{}tamanioParcela"/&gt;
 *         &lt;element ref="{}tcTipoInventario"/&gt;
 *         &lt;element ref="{}analisisDescriptivo"/&gt;
 *         &lt;element ref="{}brinzal"/&gt;
 *         &lt;element ref="{}compensaPendiente"/&gt;
 *         &lt;element ref="{}descripcionCausa"/&gt;
 *         &lt;element ref="{}descripcionDanio"/&gt;
 *         &lt;element ref="{}diametro"/&gt;
 *         &lt;element ref="{}intensidadMuestreo"/&gt;
 *         &lt;element ref="{}inventarioGestionId"/&gt;
 *         &lt;element ref="{}latizal"/&gt;
 *         &lt;element ref="{}obsRegeneracion"/&gt;
 *         &lt;element ref="{}regresion"/&gt;
 *         &lt;element ref="{}tcFormaParcela"/&gt;
 *         &lt;element ref="{}tcOrigenCalculo"/&gt;
 *         &lt;element ref="{}tcTipoMuestreo"/&gt;
 *         &lt;element ref="{}totalRodales"/&gt;
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
@XmlRootElement(name = "ttInventarioGestion")
public class TtInventarioGestion {

    @XmlElementRefs({
        @XmlElementRef(name = "areaMuestreada", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "data", type = Data.class, required = false),
        @XmlElementRef(name = "fechaAsignacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formula", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tamanioParcela", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcTipoInventario", type = TcTipoInventario.class, required = false),
        @XmlElementRef(name = "analisisDescriptivo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brinzal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "compensaPendiente", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "descripcionCausa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "descripcionDanio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diametro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "intensidadMuestreo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inventarioGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "latizal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "obsRegeneracion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "regresion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcFormaParcela", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcOrigenCalculo", type = TcOrigenCalculo.class, required = false),
        @XmlElementRef(name = "tcTipoMuestreo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalRodales", type = JAXBElement.class, required = false)
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
     * {@link Data }
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link TcTipoInventario }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcOrigenCalculo }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
