
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
 *         &lt;element ref="{}abh"/&gt;
 *         &lt;element ref="{}abr"/&gt;
 *         &lt;element ref="{}abrExtraer"/&gt;
 *         &lt;element ref="{}alturaPromedio"/&gt;
 *         &lt;element ref="{}arbolh"/&gt;
 *         &lt;element ref="{}arbolr"/&gt;
 *         &lt;element ref="{}arbolrExtraer"/&gt;
 *         &lt;element ref="{}conteoArbol"/&gt;
 *         &lt;element ref="{}dapPromedio"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}fuste"/&gt;
 *         &lt;element ref="{}tcEspecie"/&gt;
 *         &lt;element ref="{}tcTipoInventario"/&gt;
 *         &lt;element ref="{}tcTratamientoSilvicultural"/&gt;
 *         &lt;element ref="{}volh"/&gt;
 *         &lt;element ref="{}volr"/&gt;
 *         &lt;element ref="{}volrExtraer"/&gt;
 *         &lt;element ref="{}abResidual"/&gt;
 *         &lt;element ref="{}arbolResidual"/&gt;
 *         &lt;element ref="{}arboles"/&gt;
 *         &lt;element ref="{}distribucion"/&gt;
 *         &lt;element ref="{}especieGestionId"/&gt;
 *         &lt;element ref="{}especieRodalId"/&gt;
 *         &lt;element ref="{}lenia"/&gt;
 *         &lt;element ref="{}mostrarPFuste"/&gt;
 *         &lt;element ref="{}mostrarPGeneral"/&gt;
 *         &lt;element ref="{}no"/&gt;
 *         &lt;element ref="{}parcela"/&gt;
 *         &lt;element ref="{}porcentaje"/&gt;
 *         &lt;element ref="{}ptroza"/&gt;
 *         &lt;element ref="{}sumaAb"/&gt;
 *         &lt;element ref="{}sumaAltura"/&gt;
 *         &lt;element ref="{}sumaDap"/&gt;
 *         &lt;element ref="{}sumaVolumen"/&gt;
 *         &lt;element ref="{}troza"/&gt;
 *         &lt;element ref="{}ttEspecieEvaluada"/&gt;
 *         &lt;element ref="{}volResidual"/&gt;
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
@XmlRootElement(name = "especies")
public class Especies {

    @XmlElementRefs({
        @XmlElementRef(name = "abh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abrExtraer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alturaPromedio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolrExtraer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "conteoArbol", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dapPromedio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fuste", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcEspecie", type = TcEspecie.class, required = false),
        @XmlElementRef(name = "tcTipoInventario", type = TcTipoInventario.class, required = false),
        @XmlElementRef(name = "tcTratamientoSilvicultural", type = TcTratamientoSilvicultural.class, required = false),
        @XmlElementRef(name = "volh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volrExtraer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abResidual", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolResidual", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arboles", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "distribucion", type = Distribucion.class, required = false),
        @XmlElementRef(name = "especieGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "especieRodalId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lenia", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mostrarPFuste", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mostrarPGeneral", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "no", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "parcela", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "porcentaje", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ptroza", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sumaAb", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sumaAltura", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sumaDap", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sumaVolumen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "troza", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttEspecieEvaluada", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volResidual", type = JAXBElement.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcEspecie }
     * {@link TcTipoInventario }
     * {@link TcTratamientoSilvicultural }
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Distribucion }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
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
