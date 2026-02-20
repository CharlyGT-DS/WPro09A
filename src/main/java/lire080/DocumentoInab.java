
package lire080;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="ConstanciaRecepcion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Encabezado"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DirecionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NumeroDeRecepcion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="LicenciaSubsiguiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Generales"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="NumeroDeFoliosEntregados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="Nombres"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Notificacion"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DireccionDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Aprovechamiento"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Items"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="DescricionGestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Documentos"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Documento" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Firma" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Visor" type="{}Asociados"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="FechaDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="NombreEsquema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Estado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Orden" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Proceso" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Paso" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdGestion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Expediente" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Licencia" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "constanciaRecepcion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab implements  Serializable{

    @XmlElement(name = "ConstanciaRecepcion", required = true)
    protected DocumentoInab.ConstanciaRecepcion constanciaRecepcion;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "NombreEsquema", required = true)
    protected String nombreEsquema;
    @XmlAttribute(name = "Estado", required = true)
    protected String estado;
    @XmlAttribute(name = "Orden", required = true)
    protected String orden;
    @XmlAttribute(name = "Proceso", required = true)
    protected String proceso;
    @XmlAttribute(name = "Paso", required = true)
    protected String paso;
    @XmlAttribute(name = "IdGestion", required = true)
    protected int idGestion;
    @XmlAttribute(name = "Expediente", required = true)
    protected String expediente;
    @XmlAttribute(name = "Licencia", required = true)
    protected String licencia;

    /**
     * Gets the value of the constanciaRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.ConstanciaRecepcion }
     *     
     */
    public DocumentoInab.ConstanciaRecepcion getConstanciaRecepcion() {
        return constanciaRecepcion;
    }

    /**
     * Sets the value of the constanciaRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.ConstanciaRecepcion }
     *     
     */
    public void setConstanciaRecepcion(DocumentoInab.ConstanciaRecepcion value) {
        this.constanciaRecepcion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the nombreEsquema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEsquema() {
        return nombreEsquema;
    }

    /**
     * Sets the value of the nombreEsquema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEsquema(String value) {
        this.nombreEsquema = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrden(String value) {
        this.orden = value;
    }

    /**
     * Gets the value of the proceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceso(String value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the paso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaso() {
        return paso;
    }

    /**
     * Sets the value of the paso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaso(String value) {
        this.paso = value;
    }

    /**
     * Gets the value of the idGestion property.
     * 
     */
    public int getIdGestion() {
        return idGestion;
    }

    /**
     * Sets the value of the idGestion property.
     * 
     */
    public void setIdGestion(int value) {
        this.idGestion = value;
    }

    /**
     * Gets the value of the expediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     * Sets the value of the expediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediente(String value) {
        this.expediente = value;
    }

    /**
     * Gets the value of the licencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencia() {
        return licencia;
    }

    /**
     * Sets the value of the licencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencia(String value) {
        this.licencia = value;
    }


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
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DirecionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NumeroDeRecepcion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="LicenciaSubsiguiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Generales"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="NumeroDeFoliosEntregados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="Nombres"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Notificacion"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DireccionDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Aprovechamiento"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Items"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Item" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="DescricionGestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Documentos"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Documento" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Firma" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Visor" type="{}Asociados"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="FechaDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encabezado",
        "generales",
        "notificacion",
        "aprovechamiento",
        "documentos",
        "firma",
        "visor"
    })
    public static class ConstanciaRecepcion {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.ConstanciaRecepcion.Encabezado encabezado;
        @XmlElement(name = "Generales", required = true)
        protected DocumentoInab.ConstanciaRecepcion.Generales generales;
        @XmlElement(name = "Notificacion", required = true)
        protected DocumentoInab.ConstanciaRecepcion.Notificacion notificacion;
        @XmlElement(name = "Aprovechamiento", required = true)
        protected DocumentoInab.ConstanciaRecepcion.Aprovechamiento aprovechamiento;
        @XmlElement(name = "Documentos", required = true)
        protected DocumentoInab.ConstanciaRecepcion.Documentos documentos;
        @XmlElement(name = "Firma")
        protected DocumentoInab.ConstanciaRecepcion.Firma firma;
        @XmlElement(name = "Visor", required = true)
        protected Asociados visor;
        @XmlAttribute(name = "ID", required = true)
        protected String id;
        @XmlAttribute(name = "FechaDocumento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlAttribute(name = "TipoDocumento")
        protected Integer tipoDocumento;

        /**
         * Gets the value of the encabezado property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Encabezado }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Sets the value of the encabezado property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.ConstanciaRecepcion.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Gets the value of the generales property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Generales }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Generales getGenerales() {
            return generales;
        }

        /**
         * Sets the value of the generales property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Generales }
         *     
         */
        public void setGenerales(DocumentoInab.ConstanciaRecepcion.Generales value) {
            this.generales = value;
        }

        /**
         * Gets the value of the notificacion property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Notificacion }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Notificacion getNotificacion() {
            return notificacion;
        }

        /**
         * Sets the value of the notificacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Notificacion }
         *     
         */
        public void setNotificacion(DocumentoInab.ConstanciaRecepcion.Notificacion value) {
            this.notificacion = value;
        }

        /**
         * Gets the value of the aprovechamiento property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Aprovechamiento }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Aprovechamiento getAprovechamiento() {
            return aprovechamiento;
        }

        /**
         * Sets the value of the aprovechamiento property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Aprovechamiento }
         *     
         */
        public void setAprovechamiento(DocumentoInab.ConstanciaRecepcion.Aprovechamiento value) {
            this.aprovechamiento = value;
        }

        /**
         * Gets the value of the documentos property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Documentos }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Documentos getDocumentos() {
            return documentos;
        }

        /**
         * Sets the value of the documentos property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Documentos }
         *     
         */
        public void setDocumentos(DocumentoInab.ConstanciaRecepcion.Documentos value) {
            this.documentos = value;
        }

        /**
         * Gets the value of the firma property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Firma }
         *     
         */
        public DocumentoInab.ConstanciaRecepcion.Firma getFirma() {
            return firma;
        }

        /**
         * Sets the value of the firma property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ConstanciaRecepcion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.ConstanciaRecepcion.Firma value) {
            this.firma = value;
        }

        /**
         * Gets the value of the visor property.
         * 
         * @return
         *     possible object is
         *     {@link Asociados }
         *     
         */
        public Asociados getVisor() {
            return visor;
        }

        /**
         * Sets the value of the visor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Asociados }
         *     
         */
        public void setVisor(Asociados value) {
            this.visor = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the fechaDocumento property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaDocumento() {
            return fechaDocumento;
        }

        /**
         * Sets the value of the fechaDocumento property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaDocumento(XMLGregorianCalendar value) {
            this.fechaDocumento = value;
        }

        /**
         * Gets the value of the tipoDocumento property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTipoDocumento() {
            return tipoDocumento;
        }

        /**
         * Sets the value of the tipoDocumento property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTipoDocumento(Integer value) {
            this.tipoDocumento = value;
        }


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
         *         &lt;element name="Items"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="DescricionGestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "items"
        })
        public static class Aprovechamiento {

            @XmlElement(name = "Items", required = true)
            protected DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items items;

            /**
             * Gets the value of the items property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items }
             *     
             */
            public DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items getItems() {
                return items;
            }

            /**
             * Sets the value of the items property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items }
             *     
             */
            public void setItems(DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items value) {
                this.items = value;
            }


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
             *         &lt;element name="Item" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="DescricionGestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "item"
            })
            public static class Items {

                @XmlElement(name = "Item", required = true)
                protected List<DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item> item;

                /**
                 * Gets the value of the item property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item }
                 * 
                 * 
                 */
                public List<DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item> getItem() {
                    if (item == null) {
                        item = new ArrayList<DocumentoInab.ConstanciaRecepcion.Aprovechamiento.Items.Item>();
                    }
                    return this.item;
                }


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
                 *         &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="DescricionGestion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "cod",
                    "descricionGestion"
                })
                public static class Item {

                    @XmlElement(name = "Cod")
                    protected int cod;
                    @XmlElement(name = "DescricionGestion", required = true)
                    protected String descricionGestion;

                    /**
                     * Gets the value of the cod property.
                     * 
                     */
                    public int getCod() {
                        return cod;
                    }

                    /**
                     * Sets the value of the cod property.
                     * 
                     */
                    public void setCod(int value) {
                        this.cod = value;
                    }

                    /**
                     * Gets the value of the descricionGestion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescricionGestion() {
                        return descricionGestion;
                    }

                    /**
                     * Sets the value of the descricionGestion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescricionGestion(String value) {
                        this.descricionGestion = value;
                    }

                }

            }

        }


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
         *         &lt;element name="Documento" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "documento"
        })
        public static class Documentos {

            @XmlElement(name = "Documento", required = true)
            protected List<DocumentoInab.ConstanciaRecepcion.Documentos.Documento> documento;
            @XmlAttribute(name = "Total")
            protected Integer total;

            /**
             * Gets the value of the documento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the documento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocumento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentoInab.ConstanciaRecepcion.Documentos.Documento }
             * 
             * 
             */
            public List<DocumentoInab.ConstanciaRecepcion.Documentos.Documento> getDocumento() {
                if (documento == null) {
                    documento = new ArrayList<DocumentoInab.ConstanciaRecepcion.Documentos.Documento>();
                }
                return this.documento;
            }

            /**
             * Gets the value of the total property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotal() {
                return total;
            }

            /**
             * Sets the value of the total property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotal(Integer value) {
                this.total = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Documento {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Orden")
                protected Integer orden;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the orden property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrden() {
                    return orden;
                }

                /**
                 * Sets the value of the orden property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrden(Integer value) {
                    this.orden = value;
                }

            }

        }


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
         *         &lt;element name="DirecionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NumeroDeRecepcion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="LicenciaSubsiguiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "direcionSubregional",
            "numeroDeRecepcion",
            "licencia",
            "licenciaSubsiguiente"
        })
        public static class Encabezado {

            @XmlElement(name = "DirecionSubregional", required = true)
            protected String direcionSubregional;
            @XmlElement(name = "NumeroDeRecepcion")
            protected int numeroDeRecepcion;
            @XmlElement(name = "Licencia", required = true)
            protected String licencia;
            @XmlElement(name = "LicenciaSubsiguiente", required = true)
            protected String licenciaSubsiguiente;

            /**
             * Gets the value of the direcionSubregional property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirecionSubregional() {
                return direcionSubregional;
            }

            /**
             * Sets the value of the direcionSubregional property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirecionSubregional(String value) {
                this.direcionSubregional = value;
            }

            /**
             * Gets the value of the numeroDeRecepcion property.
             * 
             */
            public int getNumeroDeRecepcion() {
                return numeroDeRecepcion;
            }

            /**
             * Sets the value of the numeroDeRecepcion property.
             * 
             */
            public void setNumeroDeRecepcion(int value) {
                this.numeroDeRecepcion = value;
            }

            /**
             * Gets the value of the licencia property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicencia() {
                return licencia;
            }

            /**
             * Sets the value of the licencia property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicencia(String value) {
                this.licencia = value;
            }

            /**
             * Gets the value of the licenciaSubsiguiente property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicenciaSubsiguiente() {
                return licenciaSubsiguiente;
            }

            /**
             * Sets the value of the licenciaSubsiguiente property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicenciaSubsiguiente(String value) {
                this.licenciaSubsiguiente = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Firma {

            @XmlAttribute(name = "SHA")
            protected String sha;
            @XmlAttribute(name = "FechaFirma")
            protected String fechaFirma;

            /**
             * Gets the value of the sha property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSHA() {
                return sha;
            }

            /**
             * Sets the value of the sha property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSHA(String value) {
                this.sha = value;
            }

            /**
             * Gets the value of the fechaFirma property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaFirma() {
                return fechaFirma;
            }

            /**
             * Sets the value of the fechaFirma property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaFirma(String value) {
                this.fechaFirma = value;
            }

        }


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
         *         &lt;element name="Lugar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="NumeroDeFoliosEntregados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="Nombres"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "lugar",
            "fechaDocumento",
            "numeroDeFoliosEntregados",
            "nombres"
        })
        public static class Generales {

            @XmlElement(name = "Lugar", required = true)
            protected String lugar;
            @XmlElement(name = "FechaDocumento", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaDocumento;
            @XmlElement(name = "NumeroDeFoliosEntregados")
            protected int numeroDeFoliosEntregados;
            @XmlElement(name = "Nombres", required = true)
            protected DocumentoInab.ConstanciaRecepcion.Generales.Nombres nombres;

            /**
             * Gets the value of the lugar property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLugar() {
                return lugar;
            }

            /**
             * Sets the value of the lugar property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLugar(String value) {
                this.lugar = value;
            }

            /**
             * Gets the value of the fechaDocumento property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaDocumento() {
                return fechaDocumento;
            }

            /**
             * Sets the value of the fechaDocumento property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaDocumento(XMLGregorianCalendar value) {
                this.fechaDocumento = value;
            }

            /**
             * Gets the value of the numeroDeFoliosEntregados property.
             * 
             */
            public int getNumeroDeFoliosEntregados() {
                return numeroDeFoliosEntregados;
            }

            /**
             * Sets the value of the numeroDeFoliosEntregados property.
             * 
             */
            public void setNumeroDeFoliosEntregados(int value) {
                this.numeroDeFoliosEntregados = value;
            }

            /**
             * Gets the value of the nombres property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.ConstanciaRecepcion.Generales.Nombres }
             *     
             */
            public DocumentoInab.ConstanciaRecepcion.Generales.Nombres getNombres() {
                return nombres;
            }

            /**
             * Sets the value of the nombres property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.ConstanciaRecepcion.Generales.Nombres }
             *     
             */
            public void setNombres(DocumentoInab.ConstanciaRecepcion.Generales.Nombres value) {
                this.nombres = value;
            }


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
             *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
                "nombre"
            })
            public static class Nombres {

                @XmlElement(name = "Nombre", required = true)
                protected List<String> nombre;

                /**
                 * Gets the value of the nombre property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nombre property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNombre().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getNombre() {
                    if (nombre == null) {
                        nombre = new ArrayList<String>();
                    }
                    return this.nombre;
                }

            }

        }


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
         *         &lt;element name="DireccionDomiciliar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "direccionDomiciliar",
            "telefono",
            "celular",
            "correoElectronico"
        })
        public static class Notificacion {

            @XmlElement(name = "DireccionDomiciliar", required = true)
            protected String direccionDomiciliar;
            @XmlElement(name = "Telefono", required = true)
            protected String telefono;
            @XmlElement(name = "Celular", required = true)
            protected String celular;
            @XmlElement(name = "CorreoElectronico", required = true)
            protected String correoElectronico;

            /**
             * Gets the value of the direccionDomiciliar property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionDomiciliar() {
                return direccionDomiciliar;
            }

            /**
             * Sets the value of the direccionDomiciliar property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionDomiciliar(String value) {
                this.direccionDomiciliar = value;
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
             * Gets the value of the celular property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCelular() {
                return celular;
            }

            /**
             * Sets the value of the celular property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCelular(String value) {
                this.celular = value;
            }

            /**
             * Gets the value of the correoElectronico property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorreoElectronico() {
                return correoElectronico;
            }

            /**
             * Sets the value of the correoElectronico property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorreoElectronico(String value) {
                this.correoElectronico = value;
            }

        }

    }

}
