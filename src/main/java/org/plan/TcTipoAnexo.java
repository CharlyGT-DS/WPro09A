
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
 *         &lt;element ref="{}tipoAnexoId"/&gt;
 *         &lt;element ref="{}tcGrupoRequisito"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}tipoAnexoDesc"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}usoId"/&gt;
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
    "tipoAnexoId",
    "tcGrupoRequisito",
    "fechaRegistro",
    "tipoAnexoDesc",
    "estadoId",
    "usoId"
})
@XmlRootElement(name = "tcTipoAnexo")
public class TcTipoAnexo {

    @XmlElement(required = true)
    protected BigInteger tipoAnexoId;
    @XmlElement(required = true)
    protected TcGrupoRequisito tcGrupoRequisito;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String tipoAnexoDesc;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger usoId;

    /**
     * Gets the value of the tipoAnexoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoAnexoId() {
        return tipoAnexoId;
    }

    /**
     * Sets the value of the tipoAnexoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoAnexoId(BigInteger value) {
        this.tipoAnexoId = value;
    }

    /**
     * Gets the value of the tcGrupoRequisito property.
     * 
     * @return
     *     possible object is
     *     {@link TcGrupoRequisito }
     *     
     */
    public TcGrupoRequisito getTcGrupoRequisito() {
        return tcGrupoRequisito;
    }

    /**
     * Sets the value of the tcGrupoRequisito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcGrupoRequisito }
     *     
     */
    public void setTcGrupoRequisito(TcGrupoRequisito value) {
        this.tcGrupoRequisito = value;
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
     * Gets the value of the tipoAnexoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAnexoDesc() {
        return tipoAnexoDesc;
    }

    /**
     * Sets the value of the tipoAnexoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAnexoDesc(String value) {
        this.tipoAnexoDesc = value;
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
     * Gets the value of the usoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsoId() {
        return usoId;
    }

    /**
     * Sets the value of the usoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsoId(BigInteger value) {
        this.usoId = value;
    }

}
