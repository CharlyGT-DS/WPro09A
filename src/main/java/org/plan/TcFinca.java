
package org.plan;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}norte"/&gt;
 *         &lt;element ref="{}area"/&gt;
 *         &lt;element ref="{}fincaId"/&gt;
 *         &lt;element ref="{}libro"/&gt;
 *         &lt;element ref="{}tcTipoPropiedad"/&gt;
 *         &lt;element ref="{}personaModificaId"/&gt;
 *         &lt;element ref="{}oeste"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}fechaUltimaModif"/&gt;
 *         &lt;element ref="{}direccion"/&gt;
 *         &lt;element ref="{}gtmX"/&gt;
 *         &lt;element ref="{}gtmY"/&gt;
 *         &lt;element ref="{}notario"/&gt;
 *         &lt;element ref="{}fincaDesc"/&gt;
 *         &lt;element ref="{}este"/&gt;
 *         &lt;element ref="{}sur"/&gt;
 *         &lt;element ref="{}tcLibro"/&gt;
 *         &lt;element ref="{}tcMunicipioEmite"/&gt;
 *         &lt;element ref="{}folio"/&gt;
 *         &lt;element ref="{}areaDocumento"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}numeroDocumento"/&gt;
 *         &lt;element ref="{}tcMunicipio"/&gt;
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
    "norte",
    "area",
    "fincaId",
    "libro",
    "tcTipoPropiedad",
    "personaModificaId",
    "oeste",
    "fechaRegistro",
    "fechaUltimaModif",
    "direccion",
    "gtmX",
    "gtmY",
    "notario",
    "fincaDesc",
    "este",
    "sur",
    "tcLibro",
    "tcMunicipioEmite",
    "folio",
    "areaDocumento",
    "estadoId",
    "numeroDocumento",
    "tcMunicipio"
})
@XmlRootElement(name = "tcFinca")
public class TcFinca {

    @XmlElement(required = true)
    protected String norte;
    @XmlElement(required = true)
    protected BigDecimal area;
    @XmlElement(required = true)
    protected BigInteger fincaId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String libro;
    @XmlElement(required = true)
    protected TcTipoPropiedad tcTipoPropiedad;
    @XmlElement(required = true)
    protected BigInteger personaModificaId;
    @XmlElement(required = true)
    protected String oeste;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fechaUltimaModif;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected BigDecimal gtmX;
    @XmlElement(required = true)
    protected BigDecimal gtmY;
    @XmlElement(required = true)
    protected String notario;
    @XmlElement(required = true)
    protected String fincaDesc;
    @XmlElement(required = true)
    protected String este;
    @XmlElement(required = true)
    protected String sur;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tcLibro;
    @XmlElement(required = true)
    protected TcMunicipioEmite tcMunicipioEmite;
    @XmlElement(required = true)
    protected BigInteger folio;
    @XmlElement(required = true)
    protected BigDecimal areaDocumento;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger numeroDocumento;
    @XmlElement(required = true)
    protected TcMunicipio tcMunicipio;

    /**
     * Gets the value of the norte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNorte() {
        return norte;
    }

    /**
     * Sets the value of the norte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorte(String value) {
        this.norte = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the fincaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFincaId() {
        return fincaId;
    }

    /**
     * Sets the value of the fincaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFincaId(BigInteger value) {
        this.fincaId = value;
    }

    /**
     * Gets the value of the libro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibro() {
        return libro;
    }

    /**
     * Sets the value of the libro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibro(String value) {
        this.libro = value;
    }

    /**
     * Gets the value of the tcTipoPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link TcTipoPropiedad }
     *     
     */
    public TcTipoPropiedad getTcTipoPropiedad() {
        return tcTipoPropiedad;
    }

    /**
     * Sets the value of the tcTipoPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTipoPropiedad }
     *     
     */
    public void setTcTipoPropiedad(TcTipoPropiedad value) {
        this.tcTipoPropiedad = value;
    }

    /**
     * Gets the value of the personaModificaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonaModificaId() {
        return personaModificaId;
    }

    /**
     * Sets the value of the personaModificaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonaModificaId(BigInteger value) {
        this.personaModificaId = value;
    }

    /**
     * Gets the value of the oeste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOeste() {
        return oeste;
    }

    /**
     * Sets the value of the oeste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOeste(String value) {
        this.oeste = value;
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
     * Gets the value of the fechaUltimaModif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaModif() {
        return fechaUltimaModif;
    }

    /**
     * Sets the value of the fechaUltimaModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaModif(String value) {
        this.fechaUltimaModif = value;
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
     * Gets the value of the gtmX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGtmX() {
        return gtmX;
    }

    /**
     * Sets the value of the gtmX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGtmX(BigDecimal value) {
        this.gtmX = value;
    }

    /**
     * Gets the value of the gtmY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGtmY() {
        return gtmY;
    }

    /**
     * Sets the value of the gtmY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGtmY(BigDecimal value) {
        this.gtmY = value;
    }

    /**
     * Gets the value of the notario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotario() {
        return notario;
    }

    /**
     * Sets the value of the notario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotario(String value) {
        this.notario = value;
    }

    /**
     * Gets the value of the fincaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFincaDesc() {
        return fincaDesc;
    }

    /**
     * Sets the value of the fincaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFincaDesc(String value) {
        this.fincaDesc = value;
    }

    /**
     * Gets the value of the este property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEste() {
        return este;
    }

    /**
     * Sets the value of the este property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEste(String value) {
        this.este = value;
    }

    /**
     * Gets the value of the sur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSur() {
        return sur;
    }

    /**
     * Sets the value of the sur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSur(String value) {
        this.sur = value;
    }

    /**
     * Gets the value of the tcLibro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcLibro() {
        return tcLibro;
    }

    /**
     * Sets the value of the tcLibro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcLibro(String value) {
        this.tcLibro = value;
    }

    /**
     * Gets the value of the tcMunicipioEmite property.
     * 
     * @return
     *     possible object is
     *     {@link TcMunicipioEmite }
     *     
     */
    public TcMunicipioEmite getTcMunicipioEmite() {
        return tcMunicipioEmite;
    }

    /**
     * Sets the value of the tcMunicipioEmite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMunicipioEmite }
     *     
     */
    public void setTcMunicipioEmite(TcMunicipioEmite value) {
        this.tcMunicipioEmite = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFolio(BigInteger value) {
        this.folio = value;
    }

    /**
     * Gets the value of the areaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaDocumento() {
        return areaDocumento;
    }

    /**
     * Sets the value of the areaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaDocumento(BigDecimal value) {
        this.areaDocumento = value;
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
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDocumento(BigInteger value) {
        this.numeroDocumento = value;
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

}
