
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
 *         &lt;element ref="{}subregionReferenciaId"/&gt;
 *         &lt;element ref="{}codigo"/&gt;
 *         &lt;element ref="{}tcSubregional"/&gt;
 *         &lt;element ref="{}subregionId"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}direccion"/&gt;
 *         &lt;element ref="{}subregionDesc"/&gt;
 *         &lt;element ref="{}alias"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}tcMunicipio"/&gt;
 *         &lt;element ref="{}telefono"/&gt;
 *         &lt;element ref="{}tcRegion"/&gt;
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
    "subregionReferenciaId",
    "codigo",
    "tcSubregional",
    "subregionId",
    "fechaRegistro",
    "direccion",
    "subregionDesc",
    "alias",
    "estadoId",
    "tcMunicipio",
    "telefono",
    "tcRegion"
})
@XmlRootElement(name = "tcSubregion")
public class TcSubregion {

    @XmlElement(required = true)
    protected BigInteger subregionReferenciaId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String codigo;
    @XmlElement(required = true)
    protected TcSubregional tcSubregional;
    @XmlElement(required = true)
    protected BigInteger subregionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String subregionDesc;
    @XmlElement(required = true)
    protected String alias;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected TcMunicipio tcMunicipio;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String telefono;
    @XmlElement(required = true)
    protected TcRegion tcRegion;

    /**
     * Gets the value of the subregionReferenciaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubregionReferenciaId() {
        return subregionReferenciaId;
    }

    /**
     * Sets the value of the subregionReferenciaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubregionReferenciaId(BigInteger value) {
        this.subregionReferenciaId = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the tcSubregional property.
     * 
     * @return
     *     possible object is
     *     {@link TcSubregional }
     *     
     */
    public TcSubregional getTcSubregional() {
        return tcSubregional;
    }

    /**
     * Sets the value of the tcSubregional property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSubregional }
     *     
     */
    public void setTcSubregional(TcSubregional value) {
        this.tcSubregional = value;
    }

    /**
     * Gets the value of the subregionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubregionId() {
        return subregionId;
    }

    /**
     * Sets the value of the subregionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubregionId(BigInteger value) {
        this.subregionId = value;
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
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the subregionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubregionDesc() {
        return subregionDesc;
    }

    /**
     * Sets the value of the subregionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubregionDesc(String value) {
        this.subregionDesc = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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
     * Gets the value of the tcMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link TcMunicipio }
     *     
     */
    public TcMunicipio getTcMunicipio() {
        return tcMunicipio;
    }

    /**
     * Sets the value of the tcMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMunicipio }
     *     
     */
    public void setTcMunicipio(TcMunicipio value) {
        this.tcMunicipio = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the tcRegion property.
     * 
     * @return
     *     possible object is
     *     {@link TcRegion }
     *     
     */
    public TcRegion getTcRegion() {
        return tcRegion;
    }

    /**
     * Sets the value of the tcRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcRegion }
     *     
     */
    public void setTcRegion(TcRegion value) {
        this.tcRegion = value;
    }

}
