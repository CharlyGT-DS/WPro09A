
package lire042;

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
 *         &lt;element name="SolicitudActualizacion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="General"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TituloDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="NombreSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DireccionSedeInab" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Contenido"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Modificaciones"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Detalle" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="TotalModificaciones" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Firma" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Sha" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "solicitudActualizacion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab implements Cloneable, Serializable{

    @XmlElement(name = "SolicitudActualizacion", required = true)
    protected DocumentoInab.SolicitudActualizacion solicitudActualizacion;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    /**
     * Gets the value of the solicitudActualizacion property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.SolicitudActualizacion }
     *     
     */
    public DocumentoInab.SolicitudActualizacion getSolicitudActualizacion() {
        return solicitudActualizacion;
    }

    /**
     * Sets the value of the solicitudActualizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.SolicitudActualizacion }
     *     
     */
    public void setSolicitudActualizacion(DocumentoInab.SolicitudActualizacion value) {
        this.solicitudActualizacion = value;
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
     *         &lt;element name="General"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TituloDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="NombreSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DireccionSedeInab" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Contenido"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Modificaciones"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Detalle" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="TotalModificaciones" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Firma" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Sha" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "general",
        "contenido",
        "firma",
        "visor"
    })
    public static class SolicitudActualizacion implements Serializable{

        @XmlElement(name = "General", required = true)
        protected DocumentoInab.SolicitudActualizacion.General general;
        @XmlElement(name = "Contenido", required = true)
        protected DocumentoInab.SolicitudActualizacion.Contenido contenido;
        @XmlElement(name = "Firma")
        protected DocumentoInab.SolicitudActualizacion.Firma firma;
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
         * Gets the value of the general property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.SolicitudActualizacion.General }
         *     
         */
        public DocumentoInab.SolicitudActualizacion.General getGeneral() {
            return general;
        }

        /**
         * Sets the value of the general property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.SolicitudActualizacion.General }
         *     
         */
        public void setGeneral(DocumentoInab.SolicitudActualizacion.General value) {
            this.general = value;
        }

        /**
         * Gets the value of the contenido property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.SolicitudActualizacion.Contenido }
         *     
         */
        public DocumentoInab.SolicitudActualizacion.Contenido getContenido() {
            return contenido;
        }

        /**
         * Sets the value of the contenido property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.SolicitudActualizacion.Contenido }
         *     
         */
        public void setContenido(DocumentoInab.SolicitudActualizacion.Contenido value) {
            this.contenido = value;
        }

        /**
         * Gets the value of the firma property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.SolicitudActualizacion.Firma }
         *     
         */
        public DocumentoInab.SolicitudActualizacion.Firma getFirma() {
            return firma;
        }

        /**
         * Sets the value of the firma property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.SolicitudActualizacion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.SolicitudActualizacion.Firma value) {
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
         *         &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Modificaciones"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Detalle" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="TotalModificaciones" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
            "licencia",
            "resolucion",
            "expediente",
            "modificaciones"
        })
        public static class Contenido  implements Serializable{

            @XmlElement(name = "Licencia", required = true)
            protected String licencia;
            @XmlElement(name = "Resolucion", required = true)
            protected String resolucion;
            @XmlElement(name = "Expediente", required = true)
            protected String expediente;
            @XmlElement(name = "Modificaciones", required = true)
            protected DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones modificaciones;

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
             * Gets the value of the modificaciones property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones }
             *     
             */
            public DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones getModificaciones() {
                return modificaciones;
            }

            /**
             * Sets the value of the modificaciones property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones }
             *     
             */
            public void setModificaciones(DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones value) {
                this.modificaciones = value;
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
             *         &lt;element name="Detalle" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="Orden" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="TotalModificaciones" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "detalle"
            })
            public static class Modificaciones implements Serializable{

                @XmlElement(name = "Detalle", required = true)
                protected List<DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle> detalle;
                @XmlAttribute(name = "TotalModificaciones")
                protected Integer totalModificaciones;

                /**
                 * Gets the value of the detalle property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the detalle property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDetalle().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle }
                 * 
                 * 
                 */
                public List<DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle> getDetalle() {
                    if (detalle == null) {
                        detalle = new ArrayList<DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle>();
                    }
                    return this.detalle;
                }

                /**
                 * Gets the value of the totalModificaciones property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTotalModificaciones() {
                    return totalModificaciones;
                }

                /**
                 * Sets the value of the totalModificaciones property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTotalModificaciones(Integer value) {
                    this.totalModificaciones = value;
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
                public static class Detalle {

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Sha" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

            @XmlAttribute(name = "Sha")
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
            public String getSha() {
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
            public void setSha(String value) {
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
         *         &lt;element name="TituloDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="NombreSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DireccionSedeInab" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "tituloDocumento",
            "fechaSolicitud",
            "nombreSubregional",
            "direccionSedeInab"
        })
        public static class General implements Serializable{

            @XmlElement(name = "TituloDocumento", required = true)
            protected String tituloDocumento;
            @XmlElement(name = "FechaSolicitud", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaSolicitud;
            @XmlElement(name = "NombreSubregional", required = true)
            protected String nombreSubregional;
            @XmlElement(name = "DireccionSedeInab", required = true)
            protected String direccionSedeInab;

            /**
             * Gets the value of the tituloDocumento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTituloDocumento() {
                return tituloDocumento;
            }

            /**
             * Sets the value of the tituloDocumento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTituloDocumento(String value) {
                this.tituloDocumento = value;
            }

            /**
             * Gets the value of the fechaSolicitud property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaSolicitud() {
                return fechaSolicitud;
            }

            /**
             * Sets the value of the fechaSolicitud property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaSolicitud(XMLGregorianCalendar value) {
                this.fechaSolicitud = value;
            }

            /**
             * Gets the value of the nombreSubregional property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreSubregional() {
                return nombreSubregional;
            }

            /**
             * Sets the value of the nombreSubregional property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreSubregional(String value) {
                this.nombreSubregional = value;
            }

            /**
             * Gets the value of the direccionSedeInab property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionSedeInab() {
                return direccionSedeInab;
            }

            /**
             * Sets the value of the direccionSedeInab property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionSedeInab(String value) {
                this.direccionSedeInab = value;
            }

        }

    }

}
