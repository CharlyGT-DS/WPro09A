
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
 *         &lt;element ref="{}densidadInicial"/&gt;
 *         &lt;element ref="{}tcEspecie"/&gt;
 *         &lt;element ref="{}tcSistemaRepoblacion"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}especieRecuperacionId"/&gt;
 *         &lt;element ref="{}tcMetodoSiembra"/&gt;
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
    "densidadInicial",
    "tcEspecie",
    "tcSistemaRepoblacion",
    "estadoId",
    "especieRecuperacionId",
    "tcMetodoSiembra"
})
@XmlRootElement(name = "repoblacion")
public class Repoblacion {

    @XmlElement(required = true)
    protected BigDecimal densidadInicial;
    @XmlElement(required = true)
    protected TcEspecie tcEspecie;
    @XmlElement(required = true)
    protected TcSistemaRepoblacion tcSistemaRepoblacion;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger especieRecuperacionId;
    @XmlElement(required = true)
    protected TcMetodoSiembra tcMetodoSiembra;

    /**
     * Gets the value of the densidadInicial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDensidadInicial() {
        return densidadInicial;
    }

    /**
     * Sets the value of the densidadInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDensidadInicial(BigDecimal value) {
        this.densidadInicial = value;
    }

    /**
     * Gets the value of the tcEspecie property.
     * 
     * @return
     *     possible object is
     *     {@link TcEspecie }
     *     
     */
    public TcEspecie getTcEspecie() {
        return tcEspecie;
    }

    /**
     * Sets the value of the tcEspecie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcEspecie }
     *     
     */
    public void setTcEspecie(TcEspecie value) {
        this.tcEspecie = value;
    }

    /**
     * Gets the value of the tcSistemaRepoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link TcSistemaRepoblacion }
     *     
     */
    public TcSistemaRepoblacion getTcSistemaRepoblacion() {
        return tcSistemaRepoblacion;
    }

    /**
     * Sets the value of the tcSistemaRepoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSistemaRepoblacion }
     *     
     */
    public void setTcSistemaRepoblacion(TcSistemaRepoblacion value) {
        this.tcSistemaRepoblacion = value;
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
     * Gets the value of the especieRecuperacionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEspecieRecuperacionId() {
        return especieRecuperacionId;
    }

    /**
     * Sets the value of the especieRecuperacionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEspecieRecuperacionId(BigInteger value) {
        this.especieRecuperacionId = value;
    }

    /**
     * Gets the value of the tcMetodoSiembra property.
     * 
     * @return
     *     possible object is
     *     {@link TcMetodoSiembra }
     *     
     */
    public TcMetodoSiembra getTcMetodoSiembra() {
        return tcMetodoSiembra;
    }

    /**
     * Sets the value of the tcMetodoSiembra property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcMetodoSiembra }
     *     
     */
    public void setTcMetodoSiembra(TcMetodoSiembra value) {
        this.tcMetodoSiembra = value;
    }

}
