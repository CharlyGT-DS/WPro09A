
package lire081;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="ProvidenciaTraslado"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Encabezado"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaEncabesado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Asunto"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Regente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *                             &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DireccionFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DepartamentoFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MunicipioFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Providencia"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NombreJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NombreTenico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
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
 *                 &lt;attribute name="TipoDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="NombreEsquema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Estado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Orden" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Paso" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdGestion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "providenciaTraslado"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab  implements Serializable{

    @XmlElement(name = "ProvidenciaTraslado", required = true)
    protected DocumentoInab.ProvidenciaTraslado providenciaTraslado;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "NombreEsquema", required = true)
    protected String nombreEsquema;
    @XmlAttribute(name = "Estado", required = true)
    protected String estado;
    @XmlAttribute(name = "Orden", required = true)
    protected String orden;
    @XmlAttribute(name = "Proceso")
    protected String proceso;
    @XmlAttribute(name = "Paso", required = true)
    protected String paso;
    @XmlAttribute(name = "IdGestion", required = true)
    protected String idGestion;
    @XmlAttribute(name = "Expediente", required = true)
    protected String expediente;
    @XmlAttribute(name = "Licencia", required = true)
    protected String licencia;

    /**
     * Gets the value of the providenciaTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.ProvidenciaTraslado }
     *     
     */
    public DocumentoInab.ProvidenciaTraslado getProvidenciaTraslado() {
        return providenciaTraslado;
    }

    /**
     * Sets the value of the providenciaTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.ProvidenciaTraslado }
     *     
     */
    public void setProvidenciaTraslado(DocumentoInab.ProvidenciaTraslado value) {
        this.providenciaTraslado = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdGestion() {
        return idGestion;
    }

    /**
     * Sets the value of the idGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdGestion(String value) {
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
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaEncabesado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Asunto"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Regente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
     *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DireccionFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DepartamentoFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MunicipioFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Providencia"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NombreJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NombreTenico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
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
     *       &lt;attribute name="TipoDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
        "asunto",
        "providencia",
        "firma",
        "visor"
    })
    public static class ProvidenciaTraslado implements Serializable{

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.ProvidenciaTraslado.Encabezado encabezado;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.ProvidenciaTraslado.Asunto asunto;
        @XmlElement(name = "Providencia", required = true)
        protected DocumentoInab.ProvidenciaTraslado.Providencia providencia;
        @XmlElement(name = "Firma")
        protected DocumentoInab.ProvidenciaTraslado.Firma firma;
        @XmlElement(name = "Visor", required = true)
        protected Asociados visor;
        @XmlAttribute(name = "ID", required = true)
        protected String id;
        @XmlAttribute(name = "FechaDocumento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlAttribute(name = "TipoDocumento", required = true)
        protected int tipoDocumento;

        /**
         * Gets the value of the encabezado property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Encabezado }
         *     
         */
        public DocumentoInab.ProvidenciaTraslado.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Sets the value of the encabezado property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.ProvidenciaTraslado.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Gets the value of the asunto property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Asunto }
         *     
         */
        public DocumentoInab.ProvidenciaTraslado.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Sets the value of the asunto property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.ProvidenciaTraslado.Asunto value) {
            this.asunto = value;
        }

        /**
         * Gets the value of the providencia property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Providencia }
         *     
         */
        public DocumentoInab.ProvidenciaTraslado.Providencia getProvidencia() {
            return providencia;
        }

        /**
         * Sets the value of the providencia property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Providencia }
         *     
         */
        public void setProvidencia(DocumentoInab.ProvidenciaTraslado.Providencia value) {
            this.providencia = value;
        }

        /**
         * Gets the value of the firma property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Firma }
         *     
         */
        public DocumentoInab.ProvidenciaTraslado.Firma getFirma() {
            return firma;
        }

        /**
         * Sets the value of the firma property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ProvidenciaTraslado.Firma }
         *     
         */
        public void setFirma(DocumentoInab.ProvidenciaTraslado.Firma value) {
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
         */
        public int getTipoDocumento() {
            return tipoDocumento;
        }

        /**
         * Sets the value of the tipoDocumento property.
         * 
         */
        public void setTipoDocumento(int value) {
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
         *         &lt;element name="Regente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
         *         &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DireccionFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DepartamentoFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MunicipioFinca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "regente",
            "titular",
            "licencia",
            "direccionFinca",
            "departamentoFinca",
            "municipioFinca"
        })
        public static class Asunto {

            @XmlElement(name = "Regente")
            protected String regente;
            @XmlElement(name = "Titular", required = true)
            protected String titular;
            @XmlElement(name = "Licencia", required = true)
            protected String licencia;
            @XmlElement(name = "DireccionFinca", required = true)
            protected String direccionFinca;
            @XmlElement(name = "DepartamentoFinca", required = true)
            protected String departamentoFinca;
            @XmlElement(name = "MunicipioFinca", required = true)
            protected String municipioFinca;

            /**
             * Gets the value of the regente property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegente() {
                return regente;
            }

            /**
             * Sets the value of the regente property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegente(String value) {
                this.regente = value;
            }

            /**
             * Gets the value of the titular property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitular() {
                return titular;
            }

            /**
             * Sets the value of the titular property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitular(String value) {
                this.titular = value;
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
             * Gets the value of the direccionFinca property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionFinca() {
                return direccionFinca;
            }

            /**
             * Sets the value of the direccionFinca property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionFinca(String value) {
                this.direccionFinca = value;
            }

            /**
             * Gets the value of the departamentoFinca property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamentoFinca() {
                return departamentoFinca;
            }

            /**
             * Sets the value of the departamentoFinca property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamentoFinca(String value) {
                this.departamentoFinca = value;
            }

            /**
             * Gets the value of the municipioFinca property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipioFinca() {
                return municipioFinca;
            }

            /**
             * Sets the value of the municipioFinca property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipioFinca(String value) {
                this.municipioFinca = value;
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
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaEncabesado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
            "numeroExpediente",
            "direccionSubregional",
            "municipio",
            "departamento",
            "fechaEncabesado"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroExpediente", required = true)
            protected String numeroExpediente;
            @XmlElement(name = "DireccionSubregional", required = true)
            protected String direccionSubregional;
            @XmlElement(name = "Municipio", required = true)
            protected String municipio;
            @XmlElement(name = "Departamento", required = true)
            protected String departamento;
            @XmlElement(name = "FechaEncabesado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabesado;

            /**
             * Gets the value of the numeroExpediente property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExpediente() {
                return numeroExpediente;
            }

            /**
             * Sets the value of the numeroExpediente property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExpediente(String value) {
                this.numeroExpediente = value;
            }

            /**
             * Gets the value of the direccionSubregional property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionSubregional() {
                return direccionSubregional;
            }

            /**
             * Sets the value of the direccionSubregional property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionSubregional(String value) {
                this.direccionSubregional = value;
            }

            /**
             * Gets the value of the municipio property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipio() {
                return municipio;
            }

            /**
             * Sets the value of the municipio property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipio(String value) {
                this.municipio = value;
            }

            /**
             * Gets the value of the departamento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamento() {
                return departamento;
            }

            /**
             * Sets the value of the departamento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamento(String value) {
                this.departamento = value;
            }

            /**
             * Gets the value of the fechaEncabesado property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaEncabesado() {
                return fechaEncabesado;
            }

            /**
             * Sets the value of the fechaEncabesado property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaEncabesado(XMLGregorianCalendar value) {
                this.fechaEncabesado = value;
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
         *         &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NombreJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NombreTenico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "numeroProvidencia",
            "nombreJuridico",
            "nombreTenico",
            "numeroFolios",
            "nombreDirectorSubregional"
        })
        public static class Providencia {

            @XmlElement(name = "NumeroProvidencia", required = true)
            protected String numeroProvidencia;
            @XmlElement(name = "NombreJuridico", required = true)
            protected String nombreJuridico;
            @XmlElement(name = "NombreTenico", required = true)
            protected String nombreTenico;
            @XmlElement(name = "NumeroFolios")
            protected int numeroFolios;
            @XmlElement(name = "NombreDirectorSubregional", required = true)
            protected String nombreDirectorSubregional;

            /**
             * Gets the value of the numeroProvidencia property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroProvidencia() {
                return numeroProvidencia;
            }

            /**
             * Sets the value of the numeroProvidencia property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroProvidencia(String value) {
                this.numeroProvidencia = value;
            }

            /**
             * Gets the value of the nombreJuridico property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreJuridico() {
                return nombreJuridico;
            }

            /**
             * Sets the value of the nombreJuridico property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreJuridico(String value) {
                this.nombreJuridico = value;
            }

            /**
             * Gets the value of the nombreTenico property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreTenico() {
                return nombreTenico;
            }

            /**
             * Sets the value of the nombreTenico property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreTenico(String value) {
                this.nombreTenico = value;
            }

            /**
             * Gets the value of the numeroFolios property.
             * 
             */
            public int getNumeroFolios() {
                return numeroFolios;
            }

            /**
             * Sets the value of the numeroFolios property.
             * 
             */
            public void setNumeroFolios(int value) {
                this.numeroFolios = value;
            }

            /**
             * Gets the value of the nombreDirectorSubregional property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreDirectorSubregional() {
                return nombreDirectorSubregional;
            }

            /**
             * Sets the value of the nombreDirectorSubregional property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreDirectorSubregional(String value) {
                this.nombreDirectorSubregional = value;
            }

        }

    }

}
