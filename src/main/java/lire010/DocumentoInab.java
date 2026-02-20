//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.30 a las 04:29:33 PM CST 
//


package lire010;

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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OficioEntregaEnmiendas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Encabezado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SubregionEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Asunto">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroOficioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroExpedienteAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Correcciones">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Correccion" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="OrdenCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TotalCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CierreOficio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Solicitantes">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Solicitante" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TotalSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Firma" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Visor" type="{}Asociados"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FechaDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="NombreEsquema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Estado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Orden" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Proceso" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Paso" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdGestion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Expediente" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Licencia" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oficioEntregaEnmiendas"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "OficioEntregaEnmiendas", required = true)
    protected DocumentoInab.OficioEntregaEnmiendas oficioEntregaEnmiendas;
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
     * Obtiene el valor de la propiedad oficioEntregaEnmiendas.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.OficioEntregaEnmiendas }
     *     
     */
    public DocumentoInab.OficioEntregaEnmiendas getOficioEntregaEnmiendas() {
        return oficioEntregaEnmiendas;
    }

    /**
     * Define el valor de la propiedad oficioEntregaEnmiendas.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.OficioEntregaEnmiendas }
     *     
     */
    public void setOficioEntregaEnmiendas(DocumentoInab.OficioEntregaEnmiendas value) {
        this.oficioEntregaEnmiendas = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
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
     * Define el valor de la propiedad version.
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
     * Obtiene el valor de la propiedad nombreEsquema.
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
     * Define el valor de la propiedad nombreEsquema.
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
     * Obtiene el valor de la propiedad estado.
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
     * Define el valor de la propiedad estado.
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
     * Obtiene el valor de la propiedad orden.
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
     * Define el valor de la propiedad orden.
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
     * Obtiene el valor de la propiedad proceso.
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
     * Define el valor de la propiedad proceso.
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
     * Obtiene el valor de la propiedad paso.
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
     * Define el valor de la propiedad paso.
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
     * Obtiene el valor de la propiedad idGestion.
     * 
     */
    public int getIdGestion() {
        return idGestion;
    }

    /**
     * Define el valor de la propiedad idGestion.
     * 
     */
    public void setIdGestion(int value) {
        this.idGestion = value;
    }

    /**
     * Obtiene el valor de la propiedad expediente.
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
     * Define el valor de la propiedad expediente.
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
     * Obtiene el valor de la propiedad licencia.
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
     * Define el valor de la propiedad licencia.
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Encabezado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SubregionEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Asunto">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroOficioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroExpedienteAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Correcciones">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Correccion" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="OrdenCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TotalCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CierreOficio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Solicitantes">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Solicitante" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TotalSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Firma" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Visor" type="{}Asociados"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FechaDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "encabezado",
        "asunto",
        "cierreOficio",
        "firma",
        "visor"
    })
    public static class OficioEntregaEnmiendas {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.OficioEntregaEnmiendas.Encabezado encabezado;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.OficioEntregaEnmiendas.Asunto asunto;
        @XmlElement(name = "CierreOficio", required = true)
        protected DocumentoInab.OficioEntregaEnmiendas.CierreOficio cierreOficio;
        @XmlElement(name = "Firma")
        protected DocumentoInab.OficioEntregaEnmiendas.Firma firma;
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
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Encabezado }
         *     
         */
        public DocumentoInab.OficioEntregaEnmiendas.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.OficioEntregaEnmiendas.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Asunto }
         *     
         */
        public DocumentoInab.OficioEntregaEnmiendas.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.OficioEntregaEnmiendas.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad cierreOficio.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.CierreOficio }
         *     
         */
        public DocumentoInab.OficioEntregaEnmiendas.CierreOficio getCierreOficio() {
            return cierreOficio;
        }

        /**
         * Define el valor de la propiedad cierreOficio.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.CierreOficio }
         *     
         */
        public void setCierreOficio(DocumentoInab.OficioEntregaEnmiendas.CierreOficio value) {
            this.cierreOficio = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Firma }
         *     
         */
        public DocumentoInab.OficioEntregaEnmiendas.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioEntregaEnmiendas.Firma }
         *     
         */
        public void setFirma(DocumentoInab.OficioEntregaEnmiendas.Firma value) {
            this.firma = value;
        }

        /**
         * Obtiene el valor de la propiedad visor.
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
         * Define el valor de la propiedad visor.
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
         * Obtiene el valor de la propiedad id.
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
         * Define el valor de la propiedad id.
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
         * Obtiene el valor de la propiedad fechaDocumento.
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
         * Define el valor de la propiedad fechaDocumento.
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
         * Obtiene el valor de la propiedad tipoDocumento.
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
         * Define el valor de la propiedad tipoDocumento.
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NumeroOficioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroExpedienteAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Correcciones">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Correccion" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="OrdenCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TotalCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numeroOficioAsunto",
            "numeroExpedienteAsunto",
            "correcciones"
        })
        public static class Asunto {

            @XmlElement(name = "NumeroOficioAsunto", required = true)
            protected String numeroOficioAsunto;
            @XmlElement(name = "NumeroExpedienteAsunto", required = true)
            protected String numeroExpedienteAsunto;
            @XmlElement(name = "Correcciones", required = true)
            protected DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones correcciones;

            /**
             * Obtiene el valor de la propiedad numeroOficioAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOficioAsunto() {
                return numeroOficioAsunto;
            }

            /**
             * Define el valor de la propiedad numeroOficioAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOficioAsunto(String value) {
                this.numeroOficioAsunto = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroExpedienteAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExpedienteAsunto() {
                return numeroExpedienteAsunto;
            }

            /**
             * Define el valor de la propiedad numeroExpedienteAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExpedienteAsunto(String value) {
                this.numeroExpedienteAsunto = value;
            }

            /**
             * Obtiene el valor de la propiedad correcciones.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones }
             *     
             */
            public DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones getCorrecciones() {
                return correcciones;
            }

            /**
             * Define el valor de la propiedad correcciones.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones }
             *     
             */
            public void setCorrecciones(DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones value) {
                this.correcciones = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Correccion" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="OrdenCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TotalCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "correccion"
            })
            public static class Correcciones {

                @XmlElement(name = "Correccion", required = true)
                protected List<DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion> correccion;
                @XmlAttribute(name = "TotalCorrecciones")
                protected Integer totalCorrecciones;

                /**
                 * Gets the value of the correccion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the correccion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCorreccion().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion }
                 * 
                 * 
                 */
                public List<DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion> getCorreccion() {
                    if (correccion == null) {
                        correccion = new ArrayList<DocumentoInab.OficioEntregaEnmiendas.Asunto.Correcciones.Correccion>();
                    }
                    return this.correccion;
                }

                /**
                 * Obtiene el valor de la propiedad totalCorrecciones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTotalCorrecciones() {
                    return totalCorrecciones;
                }

                /**
                 * Define el valor de la propiedad totalCorrecciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTotalCorrecciones(Integer value) {
                    this.totalCorrecciones = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="OrdenCorrecciones" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Correccion {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "OrdenCorrecciones")
                    protected Integer ordenCorrecciones;

                    /**
                     * Obtiene el valor de la propiedad value.
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
                     * Define el valor de la propiedad value.
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
                     * Obtiene el valor de la propiedad ordenCorrecciones.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getOrdenCorrecciones() {
                        return ordenCorrecciones;
                    }

                    /**
                     * Define el valor de la propiedad ordenCorrecciones.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setOrdenCorrecciones(Integer value) {
                        this.ordenCorrecciones = value;
                    }

                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Solicitantes">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Solicitante" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TotalSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "solicitantes",
            "observaciones"
        })
        public static class CierreOficio {

            @XmlElement(name = "Solicitantes", required = true)
            protected DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes solicitantes;
            @XmlElement(name = "Observaciones")
            protected String observaciones;

            /**
             * Obtiene el valor de la propiedad solicitantes.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes }
             *     
             */
            public DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes getSolicitantes() {
                return solicitantes;
            }

            /**
             * Define el valor de la propiedad solicitantes.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes }
             *     
             */
            public void setSolicitantes(DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes value) {
                this.solicitantes = value;
            }

            /**
             * Obtiene el valor de la propiedad observaciones.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObservaciones() {
                return observaciones;
            }

            /**
             * Define el valor de la propiedad observaciones.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObservaciones(String value) {
                this.observaciones = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Solicitante" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TotalSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "solicitante"
            })
            public static class Solicitantes {

                @XmlElement(name = "Solicitante", required = true)
                protected List<DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante> solicitante;
                @XmlAttribute(name = "TotalSolicitantes")
                protected Integer totalSolicitantes;

                /**
                 * Gets the value of the solicitante property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the solicitante property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSolicitante().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante }
                 * 
                 * 
                 */
                public List<DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante> getSolicitante() {
                    if (solicitante == null) {
                        solicitante = new ArrayList<DocumentoInab.OficioEntregaEnmiendas.CierreOficio.Solicitantes.Solicitante>();
                    }
                    return this.solicitante;
                }

                /**
                 * Obtiene el valor de la propiedad totalSolicitantes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTotalSolicitantes() {
                    return totalSolicitantes;
                }

                /**
                 * Define el valor de la propiedad totalSolicitantes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTotalSolicitantes(Integer value) {
                    this.totalSolicitantes = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Solicitante {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "OrdenSolicitantes")
                    protected Integer ordenSolicitantes;

                    /**
                     * Obtiene el valor de la propiedad value.
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
                     * Define el valor de la propiedad value.
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
                     * Obtiene el valor de la propiedad ordenSolicitantes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getOrdenSolicitantes() {
                        return ordenSolicitantes;
                    }

                    /**
                     * Define el valor de la propiedad ordenSolicitantes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setOrdenSolicitantes(Integer value) {
                        this.ordenSolicitantes = value;
                    }

                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SubregionEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fechaEncabezado",
            "directorSubregional",
            "subregionEncabezado"
        })
        public static class Encabezado {

            @XmlElement(name = "FechaEncabezado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabezado;
            @XmlElement(name = "DirectorSubregional", required = true)
            protected String directorSubregional;
            @XmlElement(name = "SubregionEncabezado", required = true)
            protected String subregionEncabezado;

            /**
             * Obtiene el valor de la propiedad fechaEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaEncabezado() {
                return fechaEncabezado;
            }

            /**
             * Define el valor de la propiedad fechaEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaEncabezado(XMLGregorianCalendar value) {
                this.fechaEncabezado = value;
            }

            /**
             * Obtiene el valor de la propiedad directorSubregional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectorSubregional() {
                return directorSubregional;
            }

            /**
             * Define el valor de la propiedad directorSubregional.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectorSubregional(String value) {
                this.directorSubregional = value;
            }

            /**
             * Obtiene el valor de la propiedad subregionEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubregionEncabezado() {
                return subregionEncabezado;
            }

            /**
             * Define el valor de la propiedad subregionEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubregionEncabezado(String value) {
                this.subregionEncabezado = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="SHA" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
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
             * Obtiene el valor de la propiedad sha.
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
             * Define el valor de la propiedad sha.
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
             * Obtiene el valor de la propiedad fechaFirma.
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
             * Define el valor de la propiedad fechaFirma.
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

    }

}
