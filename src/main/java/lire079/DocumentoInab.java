
package lire079;

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
 *         &lt;element name="NotificacionRequisitos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contenido"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaNotificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Personalizado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Items"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" maxOccurs="unbounded"&gt;
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
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
    "notificacionRequisitos"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "NotificacionRequisitos", required = true)
    protected DocumentoInab.NotificacionRequisitos notificacionRequisitos;
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
     * Gets the value of the notificacionRequisitos property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.NotificacionRequisitos }
     *     
     */
    public DocumentoInab.NotificacionRequisitos getNotificacionRequisitos() {
        return notificacionRequisitos;
    }

    /**
     * Sets the value of the notificacionRequisitos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.NotificacionRequisitos }
     *     
     */
    public void setNotificacionRequisitos(DocumentoInab.NotificacionRequisitos value) {
        this.notificacionRequisitos = value;
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
     *         &lt;element name="Contenido"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaNotificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Personalizado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Items"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
        "contenido",
        "items",
        "firma",
        "visor"
    })
    public static class NotificacionRequisitos {

        @XmlElement(name = "Contenido", required = true)
        protected DocumentoInab.NotificacionRequisitos.Contenido contenido;
        @XmlElement(name = "Items", required = true)
        protected DocumentoInab.NotificacionRequisitos.Items items;
        @XmlElement(name = "Firma")
        protected DocumentoInab.NotificacionRequisitos.Firma firma;
        @XmlElement(name = "Visor", required = true)
        protected Asociados visor;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "FechaDocumento")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlAttribute(name = "TipoDocumento")
        protected Integer tipoDocumento;

        /**
         * Gets the value of the contenido property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.NotificacionRequisitos.Contenido }
         *     
         */
        public DocumentoInab.NotificacionRequisitos.Contenido getContenido() {
            return contenido;
        }

        /**
         * Sets the value of the contenido property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.NotificacionRequisitos.Contenido }
         *     
         */
        public void setContenido(DocumentoInab.NotificacionRequisitos.Contenido value) {
            this.contenido = value;
        }

        /**
         * Gets the value of the items property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.NotificacionRequisitos.Items }
         *     
         */
        public DocumentoInab.NotificacionRequisitos.Items getItems() {
            return items;
        }

        /**
         * Sets the value of the items property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.NotificacionRequisitos.Items }
         *     
         */
        public void setItems(DocumentoInab.NotificacionRequisitos.Items value) {
            this.items = value;
        }

        /**
         * Gets the value of the firma property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.NotificacionRequisitos.Firma }
         *     
         */
        public DocumentoInab.NotificacionRequisitos.Firma getFirma() {
            return firma;
        }

        /**
         * Sets the value of the firma property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.NotificacionRequisitos.Firma }
         *     
         */
        public void setFirma(DocumentoInab.NotificacionRequisitos.Firma value) {
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
         *         &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaNotificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Personalizado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "direccionSubregional",
            "fechaNotificacion",
            "licencia",
            "resolucion",
            "expediente",
            "personalizado"
        })
        public static class Contenido {

            @XmlElement(name = "DireccionSubregional", required = true)
            protected String direccionSubregional;
            @XmlElement(name = "FechaNotificacion", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaNotificacion;
            @XmlElement(name = "Licencia", required = true)
            protected String licencia;
            @XmlElement(name = "Resolucion", required = true)
            protected String resolucion;
            @XmlElement(name = "Expediente", required = true)
            protected String expediente;
            @XmlElement(name = "Personalizado", required = true)
            protected String personalizado;

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
             * Gets the value of the fechaNotificacion property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaNotificacion() {
                return fechaNotificacion;
            }

            /**
             * Sets the value of the fechaNotificacion property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaNotificacion(XMLGregorianCalendar value) {
                this.fechaNotificacion = value;
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
             * Gets the value of the resolucion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResolucion() {
                return resolucion;
            }

            /**
             * Sets the value of the resolucion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResolucion(String value) {
                this.resolucion = value;
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
             * Gets the value of the personalizado property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonalizado() {
                return personalizado;
            }

            /**
             * Sets the value of the personalizado property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonalizado(String value) {
                this.personalizado = value;
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
         *         &lt;element name="Item" maxOccurs="unbounded"&gt;
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
            "item"
        })
        public static class Items {

            @XmlElement(name = "Item", required = true)
            protected List<DocumentoInab.NotificacionRequisitos.Items.Item> item;
            @XmlAttribute(name = "Total")
            protected Integer total;

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
             * {@link DocumentoInab.NotificacionRequisitos.Items.Item }
             * 
             * 
             */
            public List<DocumentoInab.NotificacionRequisitos.Items.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<DocumentoInab.NotificacionRequisitos.Items.Item>();
                }
                return this.item;
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
            public static class Item {

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

    }

}
