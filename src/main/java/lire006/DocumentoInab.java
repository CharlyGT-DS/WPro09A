//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.29 a las 12:03:46 PM CST 
//


package lire006;

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
 *         &lt;element name="DictamenJuridicoEnmiendas">
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
 *                             &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="Asunto">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="RepresentanteLegalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TipoLicenciaAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MunicipioAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnalisisDocumento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RepresentateLegalAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TipoLicenciaAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ConclusionLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pendientes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Documento" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="OrdenDucumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TotalDocumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CierreDictamen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NombreDelegadoJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dictamenJuridicoEnmiendas"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "DictamenJuridicoEnmiendas", required = true)
    protected DocumentoInab.DictamenJuridicoEnmiendas dictamenJuridicoEnmiendas;
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
     * Obtiene el valor de la propiedad dictamenJuridicoEnmiendas.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.DictamenJuridicoEnmiendas }
     *     
     */
    public DocumentoInab.DictamenJuridicoEnmiendas getDictamenJuridicoEnmiendas() {
        return dictamenJuridicoEnmiendas;
    }

    /**
     * Define el valor de la propiedad dictamenJuridicoEnmiendas.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.DictamenJuridicoEnmiendas }
     *     
     */
    public void setDictamenJuridicoEnmiendas(DocumentoInab.DictamenJuridicoEnmiendas value) {
        this.dictamenJuridicoEnmiendas = value;
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
     *                   &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DireccionSede" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *         &lt;element name="Asunto">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="RepresentanteLegalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TipoLicenciaAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MunicipioAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnalisisDocumento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RepresentateLegalAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TipoLicenciaAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ConclusionLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pendientes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Documento" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="OrdenDucumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TotalDocumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CierreDictamen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NombreDelegadoJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "solicitantes",
        "asunto",
        "antecedentes",
        "analisisDocumento",
        "pendientes",
        "cierreDictamen",
        "firma",
        "visor"
    })
    public static class DictamenJuridicoEnmiendas {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.Encabezado encabezado;
        @XmlElement(name = "Solicitantes", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes solicitantes;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.Asunto asunto;
        @XmlElement(name = "Antecedentes", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes antecedentes;
        @XmlElement(name = "AnalisisDocumento", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento analisisDocumento;
        @XmlElement(name = "Pendientes", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.Pendientes pendientes;
        @XmlElement(name = "CierreDictamen", required = true)
        protected DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen cierreDictamen;
        @XmlElement(name = "Firma")
        protected DocumentoInab.DictamenJuridicoEnmiendas.Firma firma;
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
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Encabezado }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.DictamenJuridicoEnmiendas.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad solicitantes.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes getSolicitantes() {
            return solicitantes;
        }

        /**
         * Define el valor de la propiedad solicitantes.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes }
         *     
         */
        public void setSolicitantes(DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes value) {
            this.solicitantes = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Asunto }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.DictamenJuridicoEnmiendas.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad antecedentes.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes getAntecedentes() {
            return antecedentes;
        }

        /**
         * Define el valor de la propiedad antecedentes.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes }
         *     
         */
        public void setAntecedentes(DocumentoInab.DictamenJuridicoEnmiendas.Antecedentes value) {
            this.antecedentes = value;
        }

        /**
         * Obtiene el valor de la propiedad analisisDocumento.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento getAnalisisDocumento() {
            return analisisDocumento;
        }

        /**
         * Define el valor de la propiedad analisisDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento }
         *     
         */
        public void setAnalisisDocumento(DocumentoInab.DictamenJuridicoEnmiendas.AnalisisDocumento value) {
            this.analisisDocumento = value;
        }

        /**
         * Obtiene el valor de la propiedad pendientes.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Pendientes }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Pendientes getPendientes() {
            return pendientes;
        }

        /**
         * Define el valor de la propiedad pendientes.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Pendientes }
         *     
         */
        public void setPendientes(DocumentoInab.DictamenJuridicoEnmiendas.Pendientes value) {
            this.pendientes = value;
        }

        /**
         * Obtiene el valor de la propiedad cierreDictamen.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen getCierreDictamen() {
            return cierreDictamen;
        }

        /**
         * Define el valor de la propiedad cierreDictamen.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen }
         *     
         */
        public void setCierreDictamen(DocumentoInab.DictamenJuridicoEnmiendas.CierreDictamen value) {
            this.cierreDictamen = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Firma }
         *     
         */
        public DocumentoInab.DictamenJuridicoEnmiendas.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.DictamenJuridicoEnmiendas.Firma }
         *     
         */
        public void setFirma(DocumentoInab.DictamenJuridicoEnmiendas.Firma value) {
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
         *         &lt;element name="RepresentateLegalAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TipoLicenciaAnalisis" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ConclusionLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "representateLegalAnalisis",
            "tipoLicenciaAnalisis",
            "conclusionLegal"
        })
        public static class AnalisisDocumento {

            @XmlElement(name = "RepresentateLegalAnalisis", required = true)
            protected String representateLegalAnalisis;
            @XmlElement(name = "TipoLicenciaAnalisis", required = true)
            protected String tipoLicenciaAnalisis;
            @XmlElement(name = "ConclusionLegal", required = true)
            protected String conclusionLegal;

            /**
             * Obtiene el valor de la propiedad representateLegalAnalisis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRepresentateLegalAnalisis() {
                return representateLegalAnalisis;
            }

            /**
             * Define el valor de la propiedad representateLegalAnalisis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRepresentateLegalAnalisis(String value) {
                this.representateLegalAnalisis = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoLicenciaAnalisis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoLicenciaAnalisis() {
                return tipoLicenciaAnalisis;
            }

            /**
             * Define el valor de la propiedad tipoLicenciaAnalisis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoLicenciaAnalisis(String value) {
                this.tipoLicenciaAnalisis = value;
            }

            /**
             * Obtiene el valor de la propiedad conclusionLegal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConclusionLegal() {
                return conclusionLegal;
            }

            /**
             * Define el valor de la propiedad conclusionLegal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConclusionLegal(String value) {
                this.conclusionLegal = value;
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
         *         &lt;element name="RepresentanteLegalAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TipoLicenciaAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MunicipioAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoAntecedentes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "representanteLegalAntecedentes",
            "tipoLicenciaAntecedentes",
            "municipioAntecedentes",
            "departamentoAntecedentes"
        })
        public static class Antecedentes {

            @XmlElement(name = "RepresentanteLegalAntecedentes", required = true)
            protected String representanteLegalAntecedentes;
            @XmlElement(name = "TipoLicenciaAntecedentes", required = true)
            protected String tipoLicenciaAntecedentes;
            @XmlElement(name = "MunicipioAntecedentes", required = true)
            protected String municipioAntecedentes;
            @XmlElement(name = "DepartamentoAntecedentes", required = true)
            protected String departamentoAntecedentes;

            /**
             * Obtiene el valor de la propiedad representanteLegalAntecedentes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRepresentanteLegalAntecedentes() {
                return representanteLegalAntecedentes;
            }

            /**
             * Define el valor de la propiedad representanteLegalAntecedentes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRepresentanteLegalAntecedentes(String value) {
                this.representanteLegalAntecedentes = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoLicenciaAntecedentes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoLicenciaAntecedentes() {
                return tipoLicenciaAntecedentes;
            }

            /**
             * Define el valor de la propiedad tipoLicenciaAntecedentes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoLicenciaAntecedentes(String value) {
                this.tipoLicenciaAntecedentes = value;
            }

            /**
             * Obtiene el valor de la propiedad municipioAntecedentes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipioAntecedentes() {
                return municipioAntecedentes;
            }

            /**
             * Define el valor de la propiedad municipioAntecedentes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipioAntecedentes(String value) {
                this.municipioAntecedentes = value;
            }

            /**
             * Obtiene el valor de la propiedad departamentoAntecedentes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartamentoAntecedentes() {
                return departamentoAntecedentes;
            }

            /**
             * Define el valor de la propiedad departamentoAntecedentes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartamentoAntecedentes(String value) {
                this.departamentoAntecedentes = value;
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
         *         &lt;element name="NumeroProvidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroLicencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NombreFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NombreComunidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MunicipioAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "numeroProvidencia",
            "numeroExpediente",
            "numeroLicencia",
            "nombreFinca",
            "nombreComunidad",
            "municipioAsunto",
            "departamentoAsunto"
        })
        public static class Asunto {

            @XmlElement(name = "NumeroProvidencia", required = true)
            protected String numeroProvidencia;
            @XmlElement(name = "NumeroExpediente", required = true)
            protected String numeroExpediente;
            @XmlElement(name = "NumeroLicencia", required = true)
            protected String numeroLicencia;
            @XmlElement(name = "NombreFinca", required = true)
            protected String nombreFinca;
            @XmlElement(name = "NombreComunidad", required = true)
            protected String nombreComunidad;
            @XmlElement(name = "MunicipioAsunto", required = true)
            protected String municipioAsunto;
            @XmlElement(name = "DepartamentoAsunto", required = true)
            protected String departamentoAsunto;

            /**
             * Obtiene el valor de la propiedad numeroProvidencia.
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
             * Define el valor de la propiedad numeroProvidencia.
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
         *         &lt;element name="NombreDelegadoJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "nombreDelegadoJuridico",
            "region"
        })
        public static class CierreDictamen {

            @XmlElement(name = "NombreDelegadoJuridico", required = true)
            protected String nombreDelegadoJuridico;
            @XmlElement(name = "Region", required = true)
            protected String region;

            /**
             * Obtiene el valor de la propiedad nombreDelegadoJuridico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreDelegadoJuridico() {
                return nombreDelegadoJuridico;
            }

            /**
             * Define el valor de la propiedad nombreDelegadoJuridico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreDelegadoJuridico(String value) {
                this.nombreDelegadoJuridico = value;
            }

            /**
             * Obtiene el valor de la propiedad region.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * Define el valor de la propiedad region.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegion(String value) {
                this.region = value;
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
         *         &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="DirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MunicipioEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fechaEncabezado",
            "directorSubregional",
            "municipioEncabezado",
            "departamentoEncabezado",
            "direccionSede"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroDictamen", required = true)
            protected String numeroDictamen;
            @XmlElement(name = "FechaEncabezado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabezado;
            @XmlElement(name = "DirectorSubregional", required = true)
            protected String directorSubregional;
            @XmlElement(name = "MunicipioEncabezado", required = true)
            protected String municipioEncabezado;
            @XmlElement(name = "DepartamentoEncabezado", required = true)
            protected String departamentoEncabezado;
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
         *         &lt;element name="Documento" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="OrdenDucumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="TotalDocumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "documento"
        })
        public static class Pendientes {

            @XmlElement(name = "Documento", required = true)
            protected List<DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento> documento;
            @XmlAttribute(name = "TotalDocumentos")
            protected Integer totalDocumentos;

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
             * {@link DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento }
             * 
             * 
             */
            public List<DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento> getDocumento() {
                if (documento == null) {
                    documento = new ArrayList<DocumentoInab.DictamenJuridicoEnmiendas.Pendientes.Documento>();
                }
                return this.documento;
            }

            /**
             * Obtiene el valor de la propiedad totalDocumentos.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotalDocumentos() {
                return totalDocumentos;
            }

            /**
             * Define el valor de la propiedad totalDocumentos.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalDocumentos(Integer value) {
                this.totalDocumentos = value;
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
             *       &lt;attribute name="OrdenDucumentos" type="{http://www.w3.org/2001/XMLSchema}int" />
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
            public static class Documento {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "OrdenDucumentos")
                protected Integer ordenDucumentos;

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
                 * Obtiene el valor de la propiedad ordenDucumentos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOrdenDucumentos() {
                    return ordenDucumentos;
                }

                /**
                 * Define el valor de la propiedad ordenDucumentos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenDucumentos(Integer value) {
                    this.ordenDucumentos = value;
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
            protected List<DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante> solicitante;
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
             * {@link DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante }
             * 
             * 
             */
            public List<DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante> getSolicitante() {
                if (solicitante == null) {
                    solicitante = new ArrayList<DocumentoInab.DictamenJuridicoEnmiendas.Solicitantes.Solicitante>();
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

}
