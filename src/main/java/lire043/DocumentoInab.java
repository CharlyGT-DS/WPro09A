//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.27 a las 05:57:07 PM CST 
//


package lire043;

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
 *         &lt;element name="DictamenTecnicoModificacion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Encabezado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroDictamen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Propietarios">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Propietario" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="OrdenPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TotalPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EvaluacionModificacion">
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
 *                   &lt;element name="DecisionDictamen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Decision" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="OrdenDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TotalDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
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
 *                 &lt;attribute name="ValidarDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "dictamenTecnicoModificacion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "DictamenTecnicoModificacion", required = true)
    protected DocumentoInab.DictamenTecnicoModificacion dictamenTecnicoModificacion;
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
     * Obtiene el valor de la propiedad dictamenTecnicoModificacion.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.DictamenTecnicoModificacion }
     *     
     */
    public DocumentoInab.DictamenTecnicoModificacion getDictamenTecnicoModificacion() {
        return dictamenTecnicoModificacion;
    }

    /**
     * Define el valor de la propiedad dictamenTecnicoModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.DictamenTecnicoModificacion }
     *     
     */
    public void setDictamenTecnicoModificacion(DocumentoInab.DictamenTecnicoModificacion value) {
        this.dictamenTecnicoModificacion = value;
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
     *                   &lt;element name="NumeroDictamen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Propietarios">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Propietario" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="OrdenPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TotalPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EvaluacionModificacion">
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
     *         &lt;element name="DecisionDictamen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Decision" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="OrdenDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TotalDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
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
     *       &lt;attribute name="ValidarDocumento" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "evaluacionModificacion",
        "decisionDictamen",
        "firma",
        "visor"
    })
    public static class DictamenTecnicoModificacion {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.DictamenTecnicoModificacion.Encabezado encabezado;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.DictamenTecnicoModificacion.Asunto asunto;
        @XmlElement(name = "EvaluacionModificacion", required = true)
        protected DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion evaluacionModificacion;
        @XmlElement(name = "DecisionDictamen", required = true)
        protected DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen decisionDictamen;
        @XmlElement(name = "Firma")
        protected DocumentoInab.DictamenTecnicoModificacion.Firma firma;
        @XmlElement(name = "Visor", required = true)
        protected Asociados visor;
        @XmlAttribute(name = "ID", required = true)
        protected String id;
        @XmlAttribute(name = "FechaDocumento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlAttribute(name = "TipoDocumento")
        protected Integer tipoDocumento;
        @XmlAttribute(name = "ValidarDocumento", required = true)
        protected boolean validarDocumento;

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Encabezado }
         *     
         */
        public DocumentoInab.DictamenTecnicoModificacion.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.DictamenTecnicoModificacion.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Asunto }
         *     
         */
        public DocumentoInab.DictamenTecnicoModificacion.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.DictamenTecnicoModificacion.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad evaluacionModificacion.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion }
         *     
         */
        public DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion getEvaluacionModificacion() {
            return evaluacionModificacion;
        }

        /**
         * Define el valor de la propiedad evaluacionModificacion.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion }
         *     
         */
        public void setEvaluacionModificacion(DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion value) {
            this.evaluacionModificacion = value;
        }

        /**
         * Obtiene el valor de la propiedad decisionDictamen.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen }
         *     
         */
        public DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen getDecisionDictamen() {
            return decisionDictamen;
        }

        /**
         * Define el valor de la propiedad decisionDictamen.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen }
         *     
         */
        public void setDecisionDictamen(DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen value) {
            this.decisionDictamen = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Firma }
         *     
         */
        public DocumentoInab.DictamenTecnicoModificacion.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenTecnicoModificacion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.DictamenTecnicoModificacion.Firma value) {
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
         * Obtiene el valor de la propiedad validarDocumento.
         * 
         */
        public boolean isValidarDocumento() {
            return validarDocumento;
        }

        /**
         * Define el valor de la propiedad validarDocumento.
         * 
         */
        public void setValidarDocumento(boolean value) {
            this.validarDocumento = value;
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
         *         &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Propietarios">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Propietario" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="OrdenPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TotalPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "nombreFinca",
            "nombreComunidad",
            "municipioAsunto",
            "departamentoAsunto",
            "propietarios",
            "numeroExpediente",
            "numeroLicencia",
            "numeroPlanOperativo"
        })
        public static class Asunto {

            @XmlElement(name = "NombreFinca", required = true)
            protected String nombreFinca;
            @XmlElement(name = "NombreComunidad", required = true)
            protected String nombreComunidad;
            @XmlElement(name = "MunicipioAsunto", required = true)
            protected String municipioAsunto;
            @XmlElement(name = "DepartamentoAsunto", required = true)
            protected String departamentoAsunto;
            @XmlElement(name = "Propietarios", required = true)
            protected DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios propietarios;
            @XmlElement(name = "NumeroExpediente", required = true)
            protected String numeroExpediente;
            @XmlElement(name = "NumeroLicencia", required = true)
            protected String numeroLicencia;
            @XmlElement(name = "NumeroPlanOperativo", required = true)
            protected String numeroPlanOperativo;

            /**
             * Obtiene el valor de la propiedad nombreFinca.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreFinca() {
                return nombreFinca;
            }

            /**
             * Define el valor de la propiedad nombreFinca.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreFinca(String value) {
                this.nombreFinca = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreComunidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreComunidad() {
                return nombreComunidad;
            }

            /**
             * Define el valor de la propiedad nombreComunidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreComunidad(String value) {
                this.nombreComunidad = value;
            }

            /**
             * Obtiene el valor de la propiedad municipioAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipioAsunto() {
                return municipioAsunto;
            }

            /**
             * Define el valor de la propiedad municipioAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipioAsunto(String value) {
                this.municipioAsunto = value;
            }

            /**
             * Obtiene el valor de la propiedad departamentoAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamentoAsunto() {
                return departamentoAsunto;
            }

            /**
             * Define el valor de la propiedad departamentoAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamentoAsunto(String value) {
                this.departamentoAsunto = value;
            }

            /**
             * Obtiene el valor de la propiedad propietarios.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios }
             *     
             */
            public DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios getPropietarios() {
                return propietarios;
            }

            /**
             * Define el valor de la propiedad propietarios.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios }
             *     
             */
            public void setPropietarios(DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios value) {
                this.propietarios = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroExpediente.
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
             * Define el valor de la propiedad numeroExpediente.
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
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Propietario" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="OrdenPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TotalPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "propietario"
            })
            public static class Propietarios {

                @XmlElement(name = "Propietario", required = true)
                protected List<DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario> propietario;
                @XmlAttribute(name = "TotalPropietarios")
                protected Integer totalPropietarios;

                /**
                 * Gets the value of the propietario property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the propietario property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPropietario().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario }
                 * 
                 * 
                 */
                public List<DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario> getPropietario() {
                    if (propietario == null) {
                        propietario = new ArrayList<DocumentoInab.DictamenTecnicoModificacion.Asunto.Propietarios.Propietario>();
                    }
                    return this.propietario;
                }

                /**
                 * Obtiene el valor de la propiedad totalPropietarios.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTotalPropietarios() {
                    return totalPropietarios;
                }

                /**
                 * Define el valor de la propiedad totalPropietarios.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTotalPropietarios(Integer value) {
                    this.totalPropietarios = value;
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
                 *       &lt;attribute name="OrdenPropietarios" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                public static class Propietario {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "OrdenPropietarios")
                    protected Integer ordenPropietarios;

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
                     * Obtiene el valor de la propiedad ordenPropietarios.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getOrdenPropietarios() {
                        return ordenPropietarios;
                    }

                    /**
                     * Define el valor de la propiedad ordenPropietarios.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setOrdenPropietarios(Integer value) {
                        this.ordenPropietarios = value;
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
         *         &lt;element name="Decision" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="OrdenDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TotalDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "decision"
        })
        public static class DecisionDictamen {

            @XmlElement(name = "Decision", required = true)
            protected List<DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision> decision;
            @XmlAttribute(name = "TotalDecisiones")
            protected Integer totalDecisiones;

            /**
             * Gets the value of the decision property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the decision property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDecision().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision }
             * 
             * 
             */
            public List<DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision> getDecision() {
                if (decision == null) {
                    decision = new ArrayList<DocumentoInab.DictamenTecnicoModificacion.DecisionDictamen.Decision>();
                }
                return this.decision;
            }

            /**
             * Obtiene el valor de la propiedad totalDecisiones.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotalDecisiones() {
                return totalDecisiones;
            }

            /**
             * Define el valor de la propiedad totalDecisiones.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalDecisiones(Integer value) {
                this.totalDecisiones = value;
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
             *       &lt;attribute name="OrdenDecisiones" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Decision {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "OrdenDecisiones")
                protected Integer ordenDecisiones;

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
                 * Obtiene el valor de la propiedad ordenDecisiones.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrdenDecisiones() {
                    return ordenDecisiones;
                }

                /**
                 * Define el valor de la propiedad ordenDecisiones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenDecisiones(Integer value) {
                    this.ordenDecisiones = value;
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
         *         &lt;element name="NumeroDictamen" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "numeroDictamen",
            "municipioEncabezado",
            "departamentoEncabezado",
            "fechaEncabezado",
            "directorSubregional",
            "direccionSede"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroDictamen", required = true)
            protected String numeroDictamen;
            @XmlElement(name = "MunicipioEncabezado", required = true)
            protected String municipioEncabezado;
            @XmlElement(name = "DepartamentoEncabezado", required = true)
            protected String departamentoEncabezado;
            @XmlElement(name = "FechaEncabezado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabezado;
            @XmlElement(name = "DirectorSubregional", required = true)
            protected String directorSubregional;
            @XmlElement(name = "DireccionSede", required = true)
            protected String direccionSede;

            /**
             * Obtiene el valor de la propiedad numeroDictamen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroDictamen() {
                return numeroDictamen;
            }

            /**
             * Define el valor de la propiedad numeroDictamen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroDictamen(String value) {
                this.numeroDictamen = value;
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
        public static class EvaluacionModificacion {

            @XmlElement(name = "Conclusion", required = true)
            protected List<DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion> conclusion;
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
             * {@link DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion }
             * 
             * 
             */
            public List<DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion> getConclusion() {
                if (conclusion == null) {
                    conclusion = new ArrayList<DocumentoInab.DictamenTecnicoModificacion.EvaluacionModificacion.Conclusion>();
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
