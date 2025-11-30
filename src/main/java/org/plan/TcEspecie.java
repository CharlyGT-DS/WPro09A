
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
 *         &lt;element ref="{}personaActualizaId"/&gt;
 *         &lt;element ref="{}codigo"/&gt;
 *         &lt;element ref="{}ecuacion"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}especieDesc"/&gt;
 *         &lt;element ref="{}especieId"/&gt;
 *         &lt;element ref="{}nombreCientifico"/&gt;
 *         &lt;element ref="{}tcTipoEspecie"/&gt;
 *         &lt;element ref="{}aceptaFormula"/&gt;
 *         &lt;element ref="{}ecuacionLatifoliado"/&gt;
 *         &lt;element ref="{}sinonimo"/&gt;
 *         &lt;element ref="{}personaRegistraId"/&gt;
 *         &lt;element ref="{}fechaActualiza"/&gt;
 *         &lt;element ref="{}formula"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}tcTipoMadera"/&gt;
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
    "personaActualizaId",
    "codigo",
    "ecuacion",
    "fechaRegistro",
    "especieDesc",
    "especieId",
    "nombreCientifico",
    "tcTipoEspecie",
    "aceptaFormula",
    "ecuacionLatifoliado",
    "sinonimo",
    "personaRegistraId",
    "fechaActualiza",
    "formula",
    "estadoId",
    "tcTipoMadera"
})
@XmlRootElement(name = "tcEspecie")
public class TcEspecie {

    @XmlElement(required = true)
    protected BigInteger personaActualizaId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String codigo;
    @XmlElement(required = true)
    protected String ecuacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    protected String especieDesc;
    @XmlElement(required = true)
    protected BigInteger especieId;
    @XmlElement(required = true)
    protected String nombreCientifico;
    @XmlElement(required = true)
    protected TcTipoEspecie tcTipoEspecie;
    @XmlElement(required = true)
    protected BigInteger aceptaFormula;
    @XmlElement(required = true)
    protected String ecuacionLatifoliado;
    @XmlElement(required = true)
    protected String sinonimo;
    @XmlElement(required = true)
    protected BigInteger personaRegistraId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualiza;
    @XmlElement(required = true)
    protected String formula;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected TcTipoMadera tcTipoMadera;

    /**
     * Gets the value of the personaActualizaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonaActualizaId() {
        return personaActualizaId;
    }

    /**
     * Sets the value of the personaActualizaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonaActualizaId(BigInteger value) {
        this.personaActualizaId = value;
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
     * Gets the value of the ecuacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcuacion() {
        return ecuacion;
    }

    /**
     * Sets the value of the ecuacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcuacion(String value) {
        this.ecuacion = value;
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
     * Gets the value of the especieDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecieDesc() {
        return especieDesc;
    }

    /**
     * Sets the value of the especieDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecieDesc(String value) {
        this.especieDesc = value;
    }

    /**
     * Gets the value of the especieId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEspecieId() {
        return especieId;
    }

    /**
     * Sets the value of the especieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEspecieId(BigInteger value) {
        this.especieId = value;
    }

    /**
     * Gets the value of the nombreCientifico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Sets the value of the nombreCientifico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCientifico(String value) {
        this.nombreCientifico = value;
    }

    /**
     * Gets the value of the tcTipoEspecie property.
     * 
     * @return
     *     possible object is
     *     {@link TcTipoEspecie }
     *     
     */
    public TcTipoEspecie getTcTipoEspecie() {
        return tcTipoEspecie;
    }

    /**
     * Sets the value of the tcTipoEspecie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTipoEspecie }
     *     
     */
    public void setTcTipoEspecie(TcTipoEspecie value) {
        this.tcTipoEspecie = value;
    }

    /**
     * Gets the value of the aceptaFormula property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAceptaFormula() {
        return aceptaFormula;
    }

    /**
     * Sets the value of the aceptaFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAceptaFormula(BigInteger value) {
        this.aceptaFormula = value;
    }

    /**
     * Gets the value of the ecuacionLatifoliado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcuacionLatifoliado() {
        return ecuacionLatifoliado;
    }

    /**
     * Sets the value of the ecuacionLatifoliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcuacionLatifoliado(String value) {
        this.ecuacionLatifoliado = value;
    }

    /**
     * Gets the value of the sinonimo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinonimo() {
        return sinonimo;
    }

    /**
     * Sets the value of the sinonimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinonimo(String value) {
        this.sinonimo = value;
    }

    /**
     * Gets the value of the personaRegistraId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonaRegistraId() {
        return personaRegistraId;
    }

    /**
     * Sets the value of the personaRegistraId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonaRegistraId(BigInteger value) {
        this.personaRegistraId = value;
    }

    /**
     * Gets the value of the fechaActualiza property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualiza() {
        return fechaActualiza;
    }

    /**
     * Sets the value of the fechaActualiza property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualiza(XMLGregorianCalendar value) {
        this.fechaActualiza = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
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
     * Gets the value of the tcTipoMadera property.
     * 
     * @return
     *     possible object is
     *     {@link TcTipoMadera }
     *     
     */
    public TcTipoMadera getTcTipoMadera() {
        return tcTipoMadera;
    }

    /**
     * Sets the value of the tcTipoMadera property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTipoMadera }
     *     
     */
    public void setTcTipoMadera(TcTipoMadera value) {
        this.tcTipoMadera = value;
    }

}
