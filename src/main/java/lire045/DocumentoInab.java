//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.24 a las 12:59:05 PM CST 
//


package lire045;

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
 *         &lt;element name="OficioAprobacionModificacion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Encabezado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroOficio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DirectorRegionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="ConclusionesOficio">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Conclusion" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="OrdenConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TotalConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DirectorRegionalCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Observasiones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oficioAprobacionModificacion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "OficioAprobacionModificacion", required = true)
    protected DocumentoInab.OficioAprobacionModificacion oficioAprobacionModificacion;
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
     * Obtiene el valor de la propiedad oficioAprobacionModificacion.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.OficioAprobacionModificacion }
     *     
     */
    public DocumentoInab.OficioAprobacionModificacion getOficioAprobacionModificacion() {
        return oficioAprobacionModificacion;
    }

    /**
     * Define el valor de la propiedad oficioAprobacionModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.OficioAprobacionModificacion }
     *     
     */
    public void setOficioAprobacionModificacion(DocumentoInab.OficioAprobacionModificacion value) {
        this.oficioAprobacionModificacion = value;
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
     *                   &lt;element name="NumeroOficio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DirectorRegionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="ConclusionesOficio">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Conclusion" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="OrdenConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TotalConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DirectorRegionalCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Observasiones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class OficioAprobacionModificacion {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.OficioAprobacionModificacion.Encabezado encabezado;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.OficioAprobacionModificacion.Asunto asunto;
        @XmlElement(name = "CierreOficio", required = true)
        protected DocumentoInab.OficioAprobacionModificacion.CierreOficio cierreOficio;
        @XmlElement(name = "Firma")
        protected DocumentoInab.OficioAprobacionModificacion.Firma firma;
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
         *     {@link DocumentoInab.OficioAprobacionModificacion.Encabezado }
         *     
         */
        public DocumentoInab.OficioAprobacionModificacion.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.OficioAprobacionModificacion.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.Asunto }
         *     
         */
        public DocumentoInab.OficioAprobacionModificacion.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.OficioAprobacionModificacion.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad cierreOficio.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.CierreOficio }
         *     
         */
        public DocumentoInab.OficioAprobacionModificacion.CierreOficio getCierreOficio() {
            return cierreOficio;
        }

        /**
         * Define el valor de la propiedad cierreOficio.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.CierreOficio }
         *     
         */
        public void setCierreOficio(DocumentoInab.OficioAprobacionModificacion.CierreOficio value) {
            this.cierreOficio = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.Firma }
         *     
         */
        public DocumentoInab.OficioAprobacionModificacion.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.OficioAprobacionModificacion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.OficioAprobacionModificacion.Firma value) {
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
         *         &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fechaSolicitud",
            "numeroLicencia",
            "solicitantes",
            "numeroPlanOperativo",
            "numeroDictamenJuridico",
            "fechaDictamenJuridico",
            "nombreAsesorJuridico",
            "numeroDictamenTecnico",
            "fechaDictamenTecnico",
            "nombreTecnicoForestal"
        })
        public static class Asunto {

            @XmlElement(name = "FechaSolicitud", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaSolicitud;
            @XmlElement(name = "NumeroLicencia", required = true)
            protected String numeroLicencia;
            @XmlElement(name = "Solicitantes", required = true)
            protected DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes solicitantes;
            @XmlElement(name = "NumeroPlanOperativo", required = true)
            protected String numeroPlanOperativo;
            @XmlElement(name = "NumeroDictamenJuridico", required = true)
            protected String numeroDictamenJuridico;
            @XmlElement(name = "FechaDictamenJuridico", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaDictamenJuridico;
            @XmlElement(name = "NombreAsesorJuridico", required = true)
            protected String nombreAsesorJuridico;
            @XmlElement(name = "NumeroDictamenTecnico", required = true)
            protected String numeroDictamenTecnico;
            @XmlElement(name = "FechaDictamenTecnico", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaDictamenTecnico;
            @XmlElement(name = "NombreTecnicoForestal", required = true)
            protected String nombreTecnicoForestal;

            /**
             * Obtiene el valor de la propiedad fechaSolicitud.
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
             * Define el valor de la propiedad fechaSolicitud.
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
             * Obtiene el valor de la propiedad numeroLicencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroLicencia() {
                return numeroLicencia;
            }

            /**
             * Define el valor de la propiedad numeroLicencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroLicencia(String value) {
                this.numeroLicencia = value;
            }

            /**
             * Obtiene el valor de la propiedad solicitantes.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes }
             *     
             */
            public DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes getSolicitantes() {
                return solicitantes;
            }

            /**
             * Define el valor de la propiedad solicitantes.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes }
             *     
             */
            public void setSolicitantes(DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes value) {
                this.solicitantes = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroPlanOperativo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroPlanOperativo() {
                return numeroPlanOperativo;
            }

            /**
             * Define el valor de la propiedad numeroPlanOperativo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroPlanOperativo(String value) {
                this.numeroPlanOperativo = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroDictamenJuridico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroDictamenJuridico() {
                return numeroDictamenJuridico;
            }

            /**
             * Define el valor de la propiedad numeroDictamenJuridico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroDictamenJuridico(String value) {
                this.numeroDictamenJuridico = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaDictamenJuridico.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaDictamenJuridico() {
                return fechaDictamenJuridico;
            }

            /**
             * Define el valor de la propiedad fechaDictamenJuridico.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaDictamenJuridico(XMLGregorianCalendar value) {
                this.fechaDictamenJuridico = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAsesorJuridico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAsesorJuridico() {
                return nombreAsesorJuridico;
            }

            /**
             * Define el valor de la propiedad nombreAsesorJuridico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAsesorJuridico(String value) {
                this.nombreAsesorJuridico = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroDictamenTecnico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroDictamenTecnico() {
                return numeroDictamenTecnico;
            }

            /**
             * Define el valor de la propiedad numeroDictamenTecnico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroDictamenTecnico(String value) {
                this.numeroDictamenTecnico = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaDictamenTecnico.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaDictamenTecnico() {
                return fechaDictamenTecnico;
            }

            /**
             * Define el valor de la propiedad fechaDictamenTecnico.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaDictamenTecnico(XMLGregorianCalendar value) {
                this.fechaDictamenTecnico = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreTecnicoForestal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreTecnicoForestal() {
                return nombreTecnicoForestal;
            }

            /**
             * Define el valor de la propiedad nombreTecnicoForestal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreTecnicoForestal(String value) {
                this.nombreTecnicoForestal = value;
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
                protected List<DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante> solicitante;
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
                 * {@link DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante }
                 * 
                 * 
                 */
                public List<DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante> getSolicitante() {
                    if (solicitante == null) {
                        solicitante = new ArrayList<DocumentoInab.OficioAprobacionModificacion.Asunto.Solicitantes.Solicitante>();
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
         *         &lt;element name="ConclusionesOficio">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Conclusion" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="OrdenConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TotalConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DirectorRegionalCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroFolios" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Observasiones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "conclusionesOficio",
            "directorRegionalCierre",
            "numeroFolios",
            "observasiones"
        })
        public static class CierreOficio {

            @XmlElement(name = "ConclusionesOficio", required = true)
            protected DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio conclusionesOficio;
            @XmlElement(name = "DirectorRegionalCierre", required = true)
            protected String directorRegionalCierre;
            @XmlElement(name = "NumeroFolios")
            protected int numeroFolios;
            @XmlElement(name = "Observasiones")
            protected String observasiones;

            /**
             * Obtiene el valor de la propiedad conclusionesOficio.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio }
             *     
             */
            public DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio getConclusionesOficio() {
                return conclusionesOficio;
            }

            /**
             * Define el valor de la propiedad conclusionesOficio.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio }
             *     
             */
            public void setConclusionesOficio(DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio value) {
                this.conclusionesOficio = value;
            }

            /**
             * Obtiene el valor de la propiedad directorRegionalCierre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectorRegionalCierre() {
                return directorRegionalCierre;
            }

            /**
             * Define el valor de la propiedad directorRegionalCierre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectorRegionalCierre(String value) {
                this.directorRegionalCierre = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroFolios.
             * 
             */
            public int getNumeroFolios() {
                return numeroFolios;
            }

            /**
             * Define el valor de la propiedad numeroFolios.
             * 
             */
            public void setNumeroFolios(int value) {
                this.numeroFolios = value;
            }

            /**
             * Obtiene el valor de la propiedad observasiones.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObservasiones() {
                return observasiones;
            }

            /**
             * Define el valor de la propiedad observasiones.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObservasiones(String value) {
                this.observasiones = value;
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
             *         &lt;element name="Conclusion" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="OrdenConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TotalConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conclusion"
            })
            public static class ConclusionesOficio {

                @XmlElement(name = "Conclusion", required = true)
                protected List<DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion> conclusion;
                @XmlAttribute(name = "TotalConclusiones")
                protected Integer totalConclusiones;

                /**
                 * Gets the value of the conclusion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conclusion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConclusion().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion }
                 * 
                 * 
                 */
                public List<DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion> getConclusion() {
                    if (conclusion == null) {
                        conclusion = new ArrayList<DocumentoInab.OficioAprobacionModificacion.CierreOficio.ConclusionesOficio.Conclusion>();
                    }
                    return this.conclusion;
                }

                /**
                 * Obtiene el valor de la propiedad totalConclusiones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTotalConclusiones() {
                    return totalConclusiones;
                }

                /**
                 * Define el valor de la propiedad totalConclusiones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTotalConclusiones(Integer value) {
                    this.totalConclusiones = value;
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
                 *       &lt;attribute name="OrdenConclusiones" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                public static class Conclusion {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "OrdenConclusiones")
                    protected Integer ordenConclusiones;

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
                     * Obtiene el valor de la propiedad ordenConclusiones.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getOrdenConclusiones() {
                        return ordenConclusiones;
                    }

                    /**
                     * Define el valor de la propiedad ordenConclusiones.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setOrdenConclusiones(Integer value) {
                        this.ordenConclusiones = value;
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
         *         &lt;element name="NumeroOficio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DirectorRegionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "numeroOficio",
            "fechaEncabezado",
            "municipioEncabezado",
            "departamentoEncabezado",
            "direccionSede",
            "directorRegionalEncabezado"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroOficio", required = true)
            protected String numeroOficio;
            @XmlElement(name = "FechaEncabezado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabezado;
            @XmlElement(name = "MunicipioEncabezado", required = true)
            protected String municipioEncabezado;
            @XmlElement(name = "DepartamentoEncabezado", required = true)
            protected String departamentoEncabezado;
            @XmlElement(name = "DireccionSede", required = true)
            protected String direccionSede;
            @XmlElement(name = "DirectorRegionalEncabezado", required = true)
            protected String directorRegionalEncabezado;

            /**
             * Obtiene el valor de la propiedad numeroOficio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOficio() {
                return numeroOficio;
            }

            /**
             * Define el valor de la propiedad numeroOficio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOficio(String value) {
                this.numeroOficio = value;
            }

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
             * Obtiene el valor de la propiedad municipioEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipioEncabezado() {
                return municipioEncabezado;
            }

            /**
             * Define el valor de la propiedad municipioEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipioEncabezado(String value) {
                this.municipioEncabezado = value;
            }

            /**
             * Obtiene el valor de la propiedad departamentoEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamentoEncabezado() {
                return departamentoEncabezado;
            }

            /**
             * Define el valor de la propiedad departamentoEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamentoEncabezado(String value) {
                this.departamentoEncabezado = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionSede.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionSede() {
                return direccionSede;
            }

            /**
             * Define el valor de la propiedad direccionSede.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionSede(String value) {
                this.direccionSede = value;
            }

            /**
             * Obtiene el valor de la propiedad directorRegionalEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectorRegionalEncabezado() {
                return directorRegionalEncabezado;
            }

            /**
             * Define el valor de la propiedad directorRegionalEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectorRegionalEncabezado(String value) {
                this.directorRegionalEncabezado = value;
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
