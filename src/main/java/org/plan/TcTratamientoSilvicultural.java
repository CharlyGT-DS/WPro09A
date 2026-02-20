
package org.plan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}tratamientoSilviculturalId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}ocultar"/&gt;
 *         &lt;element ref="{}tratamientoSilviculturalDesc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tratamientoSilviculturalId",
    "fechaRegistro",
    "estadoId",
    "ocultar",
    "tratamientoSilviculturalDesc"
})
@XmlRootElement(name = "tcTratamientoSilvicultural")
public class TcTratamientoSilvicultural {

    @XmlElement(required = true)
    protected BigInteger tratamientoSilviculturalId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger ocultar;
    @XmlElement(required = true)
    protected String tratamientoSilviculturalDesc;

    /**
     * Gets the value of the tratamientoSilviculturalId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTratamientoSilviculturalId() {
        return tratamientoSilviculturalId;
    }

    /**
     * Sets the value of the tratamientoSilviculturalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTratamientoSilviculturalId(BigInteger value) {
        this.tratamientoSilviculturalId = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the estadoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEstadoId() {
        return estadoId;
    }

    /**
     * Sets the value of the estadoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEstadoId(BigInteger value) {
        this.estadoId = value;
    }

    /**
     * Gets the value of the ocultar property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOcultar() {
        return ocultar;
    }

    /**
     * Sets the value of the ocultar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOcultar(BigInteger value) {
        this.ocultar = value;
    }

    /**
     * Gets the value of the tratamientoSilviculturalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTratamientoSilviculturalDesc() {
        return tratamientoSilviculturalDesc;
    }

    /**
     * Sets the value of the tratamientoSilviculturalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTratamientoSilviculturalDesc(String value) {
        this.tratamientoSilviculturalDesc = value;
    }

}
