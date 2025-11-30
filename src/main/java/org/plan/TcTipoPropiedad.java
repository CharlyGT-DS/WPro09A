
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
 *         &lt;element ref="{}tipoPropiedadId"/&gt;
 *         &lt;element ref="{}esPropiedad"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}tipoPropiedadDesc"/&gt;
 *         &lt;element ref="{}observaciones"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}grupoId"/&gt;
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
    "tipoPropiedadId",
    "esPropiedad",
    "fechaRegistro",
    "tipoPropiedadDesc",
    "observaciones",
    "estadoId",
    "grupoId"
})
@XmlRootElement(name = "tcTipoPropiedad")
public class TcTipoPropiedad {

    @XmlElement(required = true)
    protected BigInteger tipoPropiedadId;
    @XmlElement(required = true)
    protected BigInteger esPropiedad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String tipoPropiedadDesc;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger grupoId;

    /**
     * Gets the value of the tipoPropiedadId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoPropiedadId() {
        return tipoPropiedadId;
    }

    /**
     * Sets the value of the tipoPropiedadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoPropiedadId(BigInteger value) {
        this.tipoPropiedadId = value;
    }

    /**
     * Gets the value of the esPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEsPropiedad() {
        return esPropiedad;
    }

    /**
     * Sets the value of the esPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEsPropiedad(BigInteger value) {
        this.esPropiedad = value;
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
     * Gets the value of the tipoPropiedadDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPropiedadDesc() {
        return tipoPropiedadDesc;
    }

    /**
     * Sets the value of the tipoPropiedadDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPropiedadDesc(String value) {
        this.tipoPropiedadDesc = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
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
     * Gets the value of the grupoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrupoId() {
        return grupoId;
    }

    /**
     * Sets the value of the grupoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrupoId(BigInteger value) {
        this.grupoId = value;
    }

}
