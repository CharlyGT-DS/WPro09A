
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
 *         &lt;element ref="{}sigla"/&gt;
 *         &lt;element ref="{}fechaNacimiento"/&gt;
 *         &lt;element ref="{}tcPuesto"/&gt;
 *         &lt;element ref="{}tcSexo"/&gt;
 *         &lt;element ref="{}correo"/&gt;
 *         &lt;element ref="{}passwordTmp"/&gt;
 *         &lt;element ref="{}nit"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}confirmado"/&gt;
 *         &lt;element ref="{}tcUsuario"/&gt;
 *         &lt;element ref="{}telefono"/&gt;
 *         &lt;element ref="{}tcCultura"/&gt;
 *         &lt;element ref="{}tmpFoto"/&gt;
 *         &lt;element ref="{}fechaVencimiento"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}tcUsuarioSubregion"/&gt;
 *         &lt;element ref="{}direccion"/&gt;
 *         &lt;element ref="{}tcIdioma"/&gt;
 *         &lt;element ref="{}foto"/&gt;
 *         &lt;element ref="{}rf"/&gt;
 *         &lt;element ref="{}personaDesc"/&gt;
 *         &lt;element ref="{}cui"/&gt;
 *         &lt;element ref="{}fechaUltModif"/&gt;
 *         &lt;element ref="{}usuario"/&gt;
 *         &lt;element ref="{}tcMunicipio"/&gt;
 *         &lt;element ref="{}rfn"/&gt;
 *         &lt;element ref="{}tcEstadoCivil"/&gt;
 *         &lt;element ref="{}personaId"/&gt;
 *         &lt;element ref="{}rutaFoto"/&gt;
 *         &lt;element ref="{}tcOcupacion"/&gt;
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
    "sigla",
    "fechaNacimiento",
    "tcPuesto",
    "tcSexo",
    "correo",
    "passwordTmp",
    "nit",
    "estadoId",
    "confirmado",
    "tcUsuario",
    "telefono",
    "tcCultura",
    "tmpFoto",
    "fechaVencimiento",
    "fechaRegistro",
    "tcUsuarioSubregion",
    "direccion",
    "tcIdioma",
    "foto",
    "rf",
    "personaDesc",
    "cui",
    "fechaUltModif",
    "usuario",
    "tcMunicipio",
    "rfn",
    "tcEstadoCivil",
    "personaId",
    "rutaFoto",
    "tcOcupacion"
})
@XmlRootElement(name = "tcPersonaCrea")
public class TcPersonaCrea {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sigla;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(required = true)
    protected TcPuesto tcPuesto;
    @XmlElement(required = true)
    protected TcSexo tcSexo;
    @XmlElement(required = true)
    protected String correo;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String passwordTmp;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String nit;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected BigInteger confirmado;
    @XmlElement(required = true)
    protected TcUsuario tcUsuario;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String telefono;
    @XmlElement(required = true)
    protected TcCultura tcCultura;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tmpFoto;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fechaVencimiento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tcUsuarioSubregion;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected TcIdioma tcIdioma;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String foto;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String rf;
    @XmlElement(required = true)
    protected String personaDesc;
    @XmlElement(required = true)
    protected BigInteger cui;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fechaUltModif;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String usuario;
    @XmlElement(required = true)
    protected TcMunicipio tcMunicipio;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String rfn;
    @XmlElement(required = true)
    protected TcEstadoCivil tcEstadoCivil;
    @XmlElement(required = true)
    protected BigInteger personaId;
    @XmlElement(required = true)
    protected String rutaFoto;
    @XmlElement(required = true)
    protected TcOcupacion tcOcupacion;

    /**
     * Gets the value of the sigla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Sets the value of the sigla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the tcPuesto property.
     * 
     * @return
     *     possible object is
     *     {@link TcPuesto }
     *     
     */
    public TcPuesto getTcPuesto() {
        return tcPuesto;
    }

    /**
     * Sets the value of the tcPuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcPuesto }
     *     
     */
    public void setTcPuesto(TcPuesto value) {
        this.tcPuesto = value;
    }

    /**
     * Gets the value of the tcSexo property.
     * 
     * @return
     *     possible object is
     *     {@link TcSexo }
     *     
     */
    public TcSexo getTcSexo() {
        return tcSexo;
    }

    /**
     * Sets the value of the tcSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSexo }
     *     
     */
    public void setTcSexo(TcSexo value) {
        this.tcSexo = value;
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
     * Gets the value of the passwordTmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordTmp() {
        return passwordTmp;
    }

    /**
     * Sets the value of the passwordTmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordTmp(String value) {
        this.passwordTmp = value;
    }

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
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
     * Gets the value of the confirmado property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfirmado() {
        return confirmado;
    }

    /**
     * Sets the value of the confirmado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfirmado(BigInteger value) {
        this.confirmado = value;
    }

    /**
     * Gets the value of the tcUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link TcUsuario }
     *     
     */
    public TcUsuario getTcUsuario() {
        return tcUsuario;
    }

    /**
     * Sets the value of the tcUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcUsuario }
     *     
     */
    public void setTcUsuario(TcUsuario value) {
        this.tcUsuario = value;
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
     * Gets the value of the tcCultura property.
     * 
     * @return
     *     possible object is
     *     {@link TcCultura }
     *     
     */
    public TcCultura getTcCultura() {
        return tcCultura;
    }

    /**
     * Sets the value of the tcCultura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCultura }
     *     
     */
    public void setTcCultura(TcCultura value) {
        this.tcCultura = value;
    }

    /**
     * Gets the value of the tmpFoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpFoto() {
        return tmpFoto;
    }

    /**
     * Sets the value of the tmpFoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpFoto(String value) {
        this.tmpFoto = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
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
     * Gets the value of the tcUsuarioSubregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcUsuarioSubregion() {
        return tcUsuarioSubregion;
    }

    /**
     * Sets the value of the tcUsuarioSubregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcUsuarioSubregion(String value) {
        this.tcUsuarioSubregion = value;
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
     * Gets the value of the tcIdioma property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdioma }
     *     
     */
    public TcIdioma getTcIdioma() {
        return tcIdioma;
    }

    /**
     * Sets the value of the tcIdioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdioma }
     *     
     */
    public void setTcIdioma(TcIdioma value) {
        this.tcIdioma = value;
    }

    /**
     * Gets the value of the foto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Sets the value of the foto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Gets the value of the rf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRf() {
        return rf;
    }

    /**
     * Sets the value of the rf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRf(String value) {
        this.rf = value;
    }

    /**
     * Gets the value of the personaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaDesc() {
        return personaDesc;
    }

    /**
     * Sets the value of the personaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaDesc(String value) {
        this.personaDesc = value;
    }

    /**
     * Gets the value of the cui property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCui() {
        return cui;
    }

    /**
     * Sets the value of the cui property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCui(BigInteger value) {
        this.cui = value;
    }

    /**
     * Gets the value of the fechaUltModif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltModif() {
        return fechaUltModif;
    }

    /**
     * Sets the value of the fechaUltModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltModif(String value) {
        this.fechaUltModif = value;
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
     * Gets the value of the rfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfn() {
        return rfn;
    }

    /**
     * Sets the value of the rfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfn(String value) {
        this.rfn = value;
    }

    /**
     * Gets the value of the tcEstadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link TcEstadoCivil }
     *     
     */
    public TcEstadoCivil getTcEstadoCivil() {
        return tcEstadoCivil;
    }

    /**
     * Sets the value of the tcEstadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcEstadoCivil }
     *     
     */
    public void setTcEstadoCivil(TcEstadoCivil value) {
        this.tcEstadoCivil = value;
    }

    /**
     * Gets the value of the personaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonaId(BigInteger value) {
        this.personaId = value;
    }

    /**
     * Gets the value of the rutaFoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaFoto() {
        return rutaFoto;
    }

    /**
     * Sets the value of the rutaFoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaFoto(String value) {
        this.rutaFoto = value;
    }

    /**
     * Gets the value of the tcOcupacion property.
     * 
     * @return
     *     possible object is
     *     {@link TcOcupacion }
     *     
     */
    public TcOcupacion getTcOcupacion() {
        return tcOcupacion;
    }

    /**
     * Sets the value of the tcOcupacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcOcupacion }
     *     
     */
    public void setTcOcupacion(TcOcupacion value) {
        this.tcOcupacion = value;
    }

}
