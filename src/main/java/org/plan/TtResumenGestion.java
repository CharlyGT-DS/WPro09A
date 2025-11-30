
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
 *         &lt;element ref="{}categoriaProfesionId"/&gt;
 *         &lt;element ref="{}anios"/&gt;
 *         &lt;element ref="{}aniosSolicitado"/&gt;
 *         &lt;element ref="{}dpiFiador"/&gt;
 *         &lt;element ref="{}edadRotacion"/&gt;
 *         &lt;element ref="{}meses"/&gt;
 *         &lt;element ref="{}noTurnos"/&gt;
 *         &lt;element ref="{}nombreEmpresa"/&gt;
 *         &lt;element ref="{}nombreFiador"/&gt;
 *         &lt;element ref="{}resumenGestionId"/&gt;
 *         &lt;element ref="{}rnf"/&gt;
 *         &lt;element ref="{}tcRegente"/&gt;
 *         &lt;element ref="{}tcSistemaCorta"/&gt;
 *         &lt;element ref="{}tcTipoGarantia"/&gt;
 *         &lt;element ref="{}tipoFiadorId"/&gt;
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
@XmlRootElement(name = "ttResumenGestion")
public class TtResumenGestion {

    @XmlElementRefs({
        @XmlElementRef(name = "categoriaProfesionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aniosSolicitado", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dpiFiador", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "edadRotacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "meses", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "noTurnos", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nombreEmpresa", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nombreFiador", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resumenGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rnf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcRegente", type = TcRegente.class, required = false),
        @XmlElementRef(name = "tcSistemaCorta", type = TcSistemaCorta.class, required = false),
        @XmlElementRef(name = "tcTipoGarantia", type = TcTipoGarantia.class, required = false),
        @XmlElementRef(name = "tipoFiadorId", type = JAXBElement.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcRegente }
     * {@link TcSistemaCorta }
     * {@link TcTipoGarantia }
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
