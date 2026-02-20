
package org.plan;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}fuste"/&gt;
 *         &lt;element ref="{}tcTratamientoSilvicultural"/&gt;
 *         &lt;element ref="{}volumen"/&gt;
 *         &lt;element ref="{}volr"/&gt;
 *         &lt;element ref="{}arbolrExtraer"/&gt;
 *         &lt;element ref="{}volrExtraer"/&gt;
 *         &lt;element ref="{}areaBasal"/&gt;
 *         &lt;element ref="{}abr"/&gt;
 *         &lt;element ref="{}conteoArbol"/&gt;
 *         &lt;element ref="{}pintervenir"/&gt;
 *         &lt;element ref="{}diametricaEspecieId"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}tcClaseDiametrica"/&gt;
 *         &lt;element ref="{}abrExtraer"/&gt;
 *         &lt;element ref="{}arbolr"/&gt;
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
    "fuste",
    "tcTratamientoSilvicultural",
    "volumen",
    "volr",
    "arbolrExtraer",
    "volrExtraer",
    "areaBasal",
    "abr",
    "conteoArbol",
    "pintervenir",
    "diametricaEspecieId",
    "estadoId",
    "tcClaseDiametrica",
    "abrExtraer",
    "arbolr"
})
@XmlRootElement(name = "distribucion")
public class Distribucion {

    @XmlElement(required = true)
    protected String fuste;
    @XmlElement(required = true)
    protected TcTratamientoSilvicultural tcTratamientoSilvicultural;
    @XmlElement(required = true)
    protected BigDecimal volumen;
    @XmlElement(required = true)
    protected BigDecimal volr;
    @XmlElement(required = true)
    protected BigInteger arbolrExtraer;
    @XmlElement(required = true)
    protected BigDecimal volrExtraer;
    @XmlElement(required = true)
    protected BigDecimal areaBasal;
    @XmlElement(required = true)
    protected BigDecimal abr;
    @XmlElement(required = true)
    protected BigInteger conteoArbol;
    @XmlElement(required = true)
    protected BigDecimal pintervenir;
    @XmlElement(required = true)
    protected BigInteger diametricaEspecieId;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected TcClaseDiametrica tcClaseDiametrica;
    @XmlElement(required = true)
    protected BigDecimal abrExtraer;
    @XmlElement(required = true)
    protected BigInteger arbolr;

    /**
     * Gets the value of the fuste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuste() {
        return fuste;
    }

    /**
     * Sets the value of the fuste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuste(String value) {
        this.fuste = value;
    }

    /**
     * Gets the value of the tcTratamientoSilvicultural property.
     * 
     * @return
     *     possible object is
     *     {@link TcTratamientoSilvicultural }
     *     
     */
    public TcTratamientoSilvicultural getTcTratamientoSilvicultural() {
        return tcTratamientoSilvicultural;
    }

    /**
     * Sets the value of the tcTratamientoSilvicultural property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTratamientoSilvicultural }
     *     
     */
    public void setTcTratamientoSilvicultural(TcTratamientoSilvicultural value) {
        this.tcTratamientoSilvicultural = value;
    }

    /**
     * Gets the value of the volumen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumen() {
        return volumen;
    }

    /**
     * Sets the value of the volumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumen(BigDecimal value) {
        this.volumen = value;
    }

    /**
     * Gets the value of the volr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolr() {
        return volr;
    }

    /**
     * Sets the value of the volr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolr(BigDecimal value) {
        this.volr = value;
    }

    /**
     * Gets the value of the arbolrExtraer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArbolrExtraer() {
        return arbolrExtraer;
    }

    /**
     * Sets the value of the arbolrExtraer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArbolrExtraer(BigInteger value) {
        this.arbolrExtraer = value;
    }

    /**
     * Gets the value of the volrExtraer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolrExtraer() {
        return volrExtraer;
    }

    /**
     * Sets the value of the volrExtraer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolrExtraer(BigDecimal value) {
        this.volrExtraer = value;
    }

    /**
     * Gets the value of the areaBasal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaBasal() {
        return areaBasal;
    }

    /**
     * Sets the value of the areaBasal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaBasal(BigDecimal value) {
        this.areaBasal = value;
    }

    /**
     * Gets the value of the abr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbr() {
        return abr;
    }

    /**
     * Sets the value of the abr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbr(BigDecimal value) {
        this.abr = value;
    }

    /**
     * Gets the value of the conteoArbol property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConteoArbol() {
        return conteoArbol;
    }

    /**
     * Sets the value of the conteoArbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConteoArbol(BigInteger value) {
        this.conteoArbol = value;
    }

    /**
     * Gets the value of the pintervenir property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPintervenir() {
        return pintervenir;
    }

    /**
     * Sets the value of the pintervenir property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPintervenir(BigDecimal value) {
        this.pintervenir = value;
    }

    /**
     * Gets the value of the diametricaEspecieId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiametricaEspecieId() {
        return diametricaEspecieId;
    }

    /**
     * Sets the value of the diametricaEspecieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiametricaEspecieId(BigInteger value) {
        this.diametricaEspecieId = value;
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
     * Gets the value of the tcClaseDiametrica property.
     * 
     * @return
     *     possible object is
     *     {@link TcClaseDiametrica }
     *     
     */
    public TcClaseDiametrica getTcClaseDiametrica() {
        return tcClaseDiametrica;
    }

    /**
     * Sets the value of the tcClaseDiametrica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcClaseDiametrica }
     *     
     */
    public void setTcClaseDiametrica(TcClaseDiametrica value) {
        this.tcClaseDiametrica = value;
    }

    /**
     * Gets the value of the abrExtraer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbrExtraer() {
        return abrExtraer;
    }

    /**
     * Sets the value of the abrExtraer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAbrExtraer(BigDecimal value) {
        this.abrExtraer = value;
    }

    /**
     * Gets the value of the arbolr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArbolr() {
        return arbolr;
    }

    /**
     * Sets the value of the arbolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArbolr(BigInteger value) {
        this.arbolr = value;
    }

}
