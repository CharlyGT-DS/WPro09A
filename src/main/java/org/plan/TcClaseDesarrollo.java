
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
 *         &lt;element ref="{}claseDesarrolloId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}claseDesarrolloDesc"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}ocultar"/&gt;
 *         &lt;element ref="{}codigoClase"/&gt;
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
    "claseDesarrolloId",
    "fechaRegistro",
    "claseDesarrolloDesc",
    "estadoId",
    "ocultar",
    "codigoClase"
})
@XmlRootElement(name = "tcClaseDesarrollo")
public class TcClaseDesarrollo {

    @XmlElement(required = true)
    protected BigInteger claseDesarrolloId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String claseDesarrolloDesc;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger ocultar;
    @XmlElement(required = true)
    protected CodigoClase codigoClase;

    /**
     * Gets the value of the claseDesarrolloId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClaseDesarrolloId() {
        return claseDesarrolloId;
    }

    /**
     * Sets the value of the claseDesarrolloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClaseDesarrolloId(BigInteger value) {
        this.claseDesarrolloId = value;
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
     * Gets the value of the claseDesarrolloDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseDesarrolloDesc() {
        return claseDesarrolloDesc;
    }

    /**
     * Sets the value of the claseDesarrolloDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseDesarrolloDesc(String value) {
        this.claseDesarrolloDesc = value;
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
     * Gets the value of the codigoClase property.
     * 
     * @return
     *     possible object is
     *     {@link CodigoClase }
     *     
     */
    public CodigoClase getCodigoClase() {
        return codigoClase;
    }

    /**
     * Sets the value of the codigoClase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoClase }
     *     
     */
    public void setCodigoClase(CodigoClase value) {
        this.codigoClase = value;
    }

}
