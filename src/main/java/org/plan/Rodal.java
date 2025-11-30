
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
 *         &lt;element ref="{}alturaPromedio"/&gt;
 *         &lt;element ref="{}anio"/&gt;
 *         &lt;element ref="{}arbolh"/&gt;
 *         &lt;element ref="{}arbolr"/&gt;
 *         &lt;element ref="{}area"/&gt;
 *         &lt;element ref="{}areaMuestreada"/&gt;
 *         &lt;element ref="{}conteoArbol"/&gt;
 *         &lt;element ref="{}correlativo"/&gt;
 *         &lt;element ref="{}dapPromedio"/&gt;
 *         &lt;element ref="{}especies"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}foto"/&gt;
 *         &lt;element ref="{}gtmX"/&gt;
 *         &lt;element ref="{}gtmY"/&gt;
 *         &lt;element ref="{}incremento"/&gt;
 *         &lt;element ref="{}tamanioParcela"/&gt;
 *         &lt;element ref="{}tcClaseDesarrollo"/&gt;
 *         &lt;element ref="{}turno"/&gt;
 *         &lt;element ref="{}volh"/&gt;
 *         &lt;element ref="{}volr"/&gt;
 *         &lt;element ref="{}anioRepoblacion"/&gt;
 *         &lt;element ref="{}areaGarantia"/&gt;
 *         &lt;element ref="{}cantidadEspecie"/&gt;
 *         &lt;element ref="{}edad"/&gt;
 *         &lt;element ref="{}imgRodal"/&gt;
 *         &lt;element ref="{}pendientePromedio"/&gt;
 *         &lt;element ref="{}remanente"/&gt;
 *         &lt;element ref="{}rodalGestionId"/&gt;
 *         &lt;element ref="{}tcTipoCobertura"/&gt;
 *         &lt;element ref="{}totalParcelas"/&gt;
 *         &lt;element ref="{}ttEstadisticoRodal"/&gt;
 *         &lt;element ref="{}ttEvaluacionCampo"/&gt;
 *         &lt;element ref="{}ubicacion"/&gt;
 *         &lt;element ref="{}valorMadera"/&gt;
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
@XmlRootElement(name = "rodal")
public class Rodal {

    @XmlElementRefs({
        @XmlElementRef(name = "abh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alturaPromedio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arbolr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "area", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaMuestreada", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "conteoArbol", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "correlativo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dapPromedio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "especies", type = Especies.class, required = false),
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "foto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gtmX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gtmY", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "incremento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tamanioParcela", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcClaseDesarrollo", type = TcClaseDesarrollo.class, required = false),
        @XmlElementRef(name = "turno", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volr", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anioRepoblacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaGarantia", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cantidadEspecie", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "edad", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imgRodal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pendientePromedio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remanente", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rodalGestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcTipoCobertura", type = TcTipoCobertura.class, required = false),
        @XmlElementRef(name = "totalParcelas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttEstadisticoRodal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttEvaluacionCampo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ubicacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "valorMadera", type = JAXBElement.class, required = false)
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
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link Especies }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link TcClaseDesarrollo }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link TcTipoCobertura }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
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
