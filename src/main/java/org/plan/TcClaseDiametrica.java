
package org.plan;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}claseDiametricaDesc"/&gt;
 *         &lt;element ref="{}minimo"/&gt;
 *         &lt;element ref="{}marcaClase"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}claseDiametricaId"/&gt;
 *         &lt;element ref="{}maximo"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
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
    "claseDiametricaDesc",
    "minimo",
    "marcaClase",
    "fechaRegistro",
    "claseDiametricaId",
    "maximo",
    "estadoId"
})
@XmlRootElement(name = "tcClaseDiametrica")
public class TcClaseDiametrica {

    @XmlElement(required = true)
    protected String claseDiametricaDesc;
    @XmlElement(required = true)
    protected BigDecimal minimo;
    @XmlElement(required = true)
    protected BigDecimal marcaClase;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected BigInteger claseDiametricaId;
    @XmlElement(required = true)
    protected BigDecimal maximo;
    @XmlElement(required = true)
    protected BigInteger estadoId;

    /**
     * Gets the value of the claseDiametricaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaseDiametricaDesc() {
        return claseDiametricaDesc;
    }

    /**
     * Sets the value of the claseDiametricaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaseDiametricaDesc(String value) {
        this.claseDiametricaDesc = value;
    }

    /**
     * Gets the value of the minimo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimo() {
        return minimo;
    }

    /**
     * Sets the value of the minimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimo(BigDecimal value) {
        this.minimo = value;
    }

    /**
     * Gets the value of the marcaClase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarcaClase() {
        return marcaClase;
    }

    /**
     * Sets the value of the marcaClase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarcaClase(BigDecimal value) {
        this.marcaClase = value;
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
     * Gets the value of the claseDiametricaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClaseDiametricaId() {
        return claseDiametricaId;
    }

    /**
     * Sets the value of the claseDiametricaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClaseDiametricaId(BigInteger value) {
        this.claseDiametricaId = value;
    }

    /**
     * Gets the value of the maximo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximo() {
        return maximo;
    }

    /**
     * Sets the value of the maximo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximo(BigDecimal value) {
        this.maximo = value;
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

}
