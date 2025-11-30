
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
 *         &lt;element ref="{}ocupacionId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}ocupacionDesc"/&gt;
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
    "ocupacionId",
    "fechaRegistro",
    "estadoId",
    "ocupacionDesc"
})
@XmlRootElement(name = "tcOcupacion")
public class TcOcupacion {

    @XmlElement(required = true)
    protected BigInteger ocupacionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected String ocupacionDesc;

    /**
     * Gets the value of the ocupacionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOcupacionId() {
        return ocupacionId;
    }

    /**
     * Sets the value of the ocupacionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOcupacionId(BigInteger value) {
        this.ocupacionId = value;
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
     * Gets the value of the ocupacionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcupacionDesc() {
        return ocupacionDesc;
    }

    /**
     * Sets the value of the ocupacionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcupacionDesc(String value) {
        this.ocupacionDesc = value;
    }

}
