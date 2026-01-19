//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.18 a las 12:13:33 AM CST 
//


package lire044;

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
 *         &lt;element name="DictamenJuridicoModificacion">
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
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Antecedentes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Antecedente" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="OrdenAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TotalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FundamentoLegal">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Fundamento" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="OrdenFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TotalFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnalisisDocumento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Analisis" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="OrdenAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TotalAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
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
    "dictamenJuridicoModificacion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "DictamenJuridicoModificacion", required = true)
    protected DocumentoInab.DictamenJuridicoModificacion dictamenJuridicoModificacion;
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
     * Obtiene el valor de la propiedad dictamenJuridicoModificacion.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.DictamenJuridicoModificacion }
     *     
     */
    public DocumentoInab.DictamenJuridicoModificacion getDictamenJuridicoModificacion() {
        return dictamenJuridicoModificacion;
    }

    /**
     * Define el valor de la propiedad dictamenJuridicoModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.DictamenJuridicoModificacion }
     *     
     */
    public void setDictamenJuridicoModificacion(DocumentoInab.DictamenJuridicoModificacion value) {
        this.dictamenJuridicoModificacion = value;
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
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroPlanOperativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Antecedentes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Antecedente" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="OrdenAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TotalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FundamentoLegal">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Fundamento" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="OrdenFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TotalFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnalisisDocumento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Analisis" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="OrdenAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TotalAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        "antecedentes",
        "fundamentoLegal",
        "analisisDocumento",
        "firma",
        "visor"
    })
    public static class DictamenJuridicoModificacion {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.DictamenJuridicoModificacion.Encabezado encabezado;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.DictamenJuridicoModificacion.Asunto asunto;
        @XmlElement(name = "Antecedentes", required = true)
        protected DocumentoInab.DictamenJuridicoModificacion.Antecedentes antecedentes;
        @XmlElement(name = "FundamentoLegal", required = true)
        protected DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal fundamentoLegal;
        @XmlElement(name = "AnalisisDocumento", required = true)
        protected DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento analisisDocumento;
        @XmlElement(name = "Firma")
        protected DocumentoInab.DictamenJuridicoModificacion.Firma firma;
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
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Encabezado }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.DictamenJuridicoModificacion.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Asunto }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.DictamenJuridicoModificacion.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad antecedentes.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Antecedentes }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.Antecedentes getAntecedentes() {
            return antecedentes;
        }

        /**
         * Define el valor de la propiedad antecedentes.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Antecedentes }
         *     
         */
        public void setAntecedentes(DocumentoInab.DictamenJuridicoModificacion.Antecedentes value) {
            this.antecedentes = value;
        }

        /**
         * Obtiene el valor de la propiedad fundamentoLegal.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal getFundamentoLegal() {
            return fundamentoLegal;
        }

        /**
         * Define el valor de la propiedad fundamentoLegal.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal }
         *     
         */
        public void setFundamentoLegal(DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal value) {
            this.fundamentoLegal = value;
        }

        /**
         * Obtiene el valor de la propiedad analisisDocumento.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento getAnalisisDocumento() {
            return analisisDocumento;
        }

        /**
         * Define el valor de la propiedad analisisDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento }
         *     
         */
        public void setAnalisisDocumento(DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento value) {
            this.analisisDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Firma }
         *     
         */
        public DocumentoInab.DictamenJuridicoModificacion.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoModificacion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.DictamenJuridicoModificacion.Firma value) {
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
         *         &lt;element name="Analisis" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="OrdenAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TotalAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "analisis"
        })
        public static class AnalisisDocumento {

            @XmlElement(name = "Analisis", required = true)
            protected List<DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis> analisis;
            @XmlAttribute(name = "TotalAnalisis")
            protected Integer totalAnalisis;

            /**
             * Gets the value of the analisis property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the analisis property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAnalisis().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis }
             * 
             * 
             */
            public List<DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis> getAnalisis() {
                if (analisis == null) {
                    analisis = new ArrayList<DocumentoInab.DictamenJuridicoModificacion.AnalisisDocumento.Analisis>();
                }
                return this.analisis;
            }

            /**
             * Obtiene el valor de la propiedad totalAnalisis.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotalAnalisis() {
                return totalAnalisis;
            }

            /**
             * Define el valor de la propiedad totalAnalisis.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalAnalisis(Integer value) {
                this.totalAnalisis = value;
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
             *       &lt;attribute name="OrdenAnalisis" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Analisis {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "OrdenAnalisis")
                protected Integer ordenAnalisis;

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
                 * Obtiene el valor de la propiedad ordenAnalisis.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrdenAnalisis() {
                    return ordenAnalisis;
                }

                /**
                 * Define el valor de la propiedad ordenAnalisis.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenAnalisis(Integer value) {
                    this.ordenAnalisis = value;
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
         *         &lt;element name="Antecedente" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="OrdenAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TotalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "antecedente"
        })
        public static class Antecedentes {

            @XmlElement(name = "Antecedente", required = true)
            protected List<DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente> antecedente;
            @XmlAttribute(name = "TotalAntecedentes")
            protected Integer totalAntecedentes;

            /**
             * Gets the value of the antecedente property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the antecedente property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAntecedente().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente }
             * 
             * 
             */
            public List<DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente> getAntecedente() {
                if (antecedente == null) {
                    antecedente = new ArrayList<DocumentoInab.DictamenJuridicoModificacion.Antecedentes.Antecedente>();
                }
                return this.antecedente;
            }

            /**
             * Obtiene el valor de la propiedad totalAntecedentes.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotalAntecedentes() {
                return totalAntecedentes;
            }

            /**
             * Define el valor de la propiedad totalAntecedentes.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalAntecedentes(Integer value) {
                this.totalAntecedentes = value;
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
             *       &lt;attribute name="OrdenAntecedentes" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Antecedente {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "OrdenAntecedentes")
                protected Integer ordenAntecedentes;

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
                 * Obtiene el valor de la propiedad ordenAntecedentes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrdenAntecedentes() {
                    return ordenAntecedentes;
                }

                /**
                 * Define el valor de la propiedad ordenAntecedentes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenAntecedentes(Integer value) {
                    this.ordenAntecedentes = value;
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
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "numeroExpediente",
            "numeroResolucion",
            "numeroPlanOperativo"
        })
        public static class Asunto {

            @XmlElement(name = "NumeroExpediente", required = true)
            protected String numeroExpediente;
            @XmlElement(name = "NumeroResolucion", required = true)
            protected String numeroResolucion;
            @XmlElement(name = "NumeroPlanOperativo", required = true)
            protected String numeroPlanOperativo;

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
             * Obtiene el valor de la propiedad numeroResolucion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroResolucion() {
                return numeroResolucion;
            }

            /**
             * Define el valor de la propiedad numeroResolucion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroResolucion(String value) {
                this.numeroResolucion = value;
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
         *         &lt;element name="Fundamento" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="OrdenFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TotalFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fundamento"
        })
        public static class FundamentoLegal {

            @XmlElement(name = "Fundamento", required = true)
            protected List<DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento> fundamento;
            @XmlAttribute(name = "TotalFundamentos")
            protected Integer totalFundamentos;

            /**
             * Gets the value of the fundamento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fundamento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFundamento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento }
             * 
             * 
             */
            public List<DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento> getFundamento() {
                if (fundamento == null) {
                    fundamento = new ArrayList<DocumentoInab.DictamenJuridicoModificacion.FundamentoLegal.Fundamento>();
                }
                return this.fundamento;
            }

            /**
             * Obtiene el valor de la propiedad totalFundamentos.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotalFundamentos() {
                return totalFundamentos;
            }

            /**
             * Define el valor de la propiedad totalFundamentos.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalFundamentos(Integer value) {
                this.totalFundamentos = value;
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
             *       &lt;attribute name="OrdenFundamentos" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Fundamento {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "OrdenFundamentos")
                protected Integer ordenFundamentos;

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
                 * Obtiene el valor de la propiedad ordenFundamentos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrdenFundamentos() {
                    return ordenFundamentos;
                }

                /**
                 * Define el valor de la propiedad ordenFundamentos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenFundamentos(Integer value) {
                    this.ordenFundamentos = value;
                }

            }

        }

    }

}
