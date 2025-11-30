
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
 *         &lt;element ref="{}planTipoGestionId"/&gt;
 *         &lt;element ref="{}areaMaxima"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}areaMinima"/&gt;
 *         &lt;element ref="{}planTipoGestionDesc"/&gt;
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
    "planTipoGestionId",
    "areaMaxima",
    "fechaRegistro",
    "areaMinima",
    "planTipoGestionDesc",
    "estadoId"
})
@XmlRootElement(name = "tcPlanTipoGestion")
public class TcPlanTipoGestion {

    @XmlElement(required = true)
    protected BigInteger planTipoGestionId;
    @XmlElement(required = true)
    protected BigDecimal areaMaxima;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected BigDecimal areaMinima;
    @XmlElement(required = true)
    protected String planTipoGestionDesc;
    @XmlElement(required = true)
    protected BigInteger estadoId;

    /**
     * Gets the value of the planTipoGestionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlanTipoGestionId() {
        return planTipoGestionId;
    }

    /**
     * Sets the value of the planTipoGestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlanTipoGestionId(BigInteger value) {
        this.planTipoGestionId = value;
    }

    /**
     * Gets the value of the areaMaxima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaMaxima() {
        return areaMaxima;
    }

    /**
     * Sets the value of the areaMaxima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaMaxima(BigDecimal value) {
        this.areaMaxima = value;
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
     * Gets the value of the areaMinima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaMinima() {
        return areaMinima;
    }

    /**
     * Sets the value of the areaMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaMinima(BigDecimal value) {
        this.areaMinima = value;
    }

    /**
     * Gets the value of the planTipoGestionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTipoGestionDesc() {
        return planTipoGestionDesc;
    }

    /**
     * Sets the value of the planTipoGestionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTipoGestionDesc(String value) {
        this.planTipoGestionDesc = value;
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
