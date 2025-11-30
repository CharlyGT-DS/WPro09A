
package org.plan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{}tcPerfil"/&gt;
 *         &lt;element ref="{}usuarioDesc"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}correo"/&gt;
 *         &lt;element ref="{}requiereCambioClave"/&gt;
 *         &lt;element ref="{}usuario"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}usuarioId"/&gt;
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
    "tcPerfil",
    "usuarioDesc",
    "fechaRegistro",
    "correo",
    "requiereCambioClave",
    "usuario",
    "estadoId",
    "usuarioId"
})
@XmlRootElement(name = "tcUsuario")
public class TcUsuario {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tcPerfil;
    @XmlElement(required = true)
    protected String usuarioDesc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String correo;
    @XmlElement(required = true)
    protected BigInteger requiereCambioClave;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String usuario;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger usuarioId;

    /**
     * Gets the value of the tcPerfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcPerfil() {
        return tcPerfil;
    }

    /**
     * Sets the value of the tcPerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcPerfil(String value) {
        this.tcPerfil = value;
    }

    /**
     * Gets the value of the usuarioDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioDesc() {
        return usuarioDesc;
    }

    /**
     * Sets the value of the usuarioDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioDesc(String value) {
        this.usuarioDesc = value;
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
     * Gets the value of the correo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Gets the value of the requiereCambioClave property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequiereCambioClave() {
        return requiereCambioClave;
    }

    /**
     * Sets the value of the requiereCambioClave property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequiereCambioClave(BigInteger value) {
        this.requiereCambioClave = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
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
     * Gets the value of the usuarioId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsuarioId() {
        return usuarioId;
    }

    /**
     * Sets the value of the usuarioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsuarioId(BigInteger value) {
        this.usuarioId = value;
    }

}
