//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.30 a las 04:09:50 AM CST 
//


package lire047;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="ResolucionModificacionPlan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Encabezado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DireccionSubregionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CuiSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
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
 *                             &lt;element name="NumeroLicenciaAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroPlanOperativoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Considerando">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DireccionSubregionalConsiderando" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroOficioSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaOficio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CierreResolucion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroLicenciaCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NumeroPlanOperativoCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Conclusiones">
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
 *                 &lt;attribute name="ValidarDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "resolucionModificacionPlan"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "ResolucionModificacionPlan", required = true)
    protected DocumentoInab.ResolucionModificacionPlan resolucionModificacionPlan;
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
     * Obtiene el valor de la propiedad resolucionModificacionPlan.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.ResolucionModificacionPlan }
     *     
     */
    public DocumentoInab.ResolucionModificacionPlan getResolucionModificacionPlan() {
        return resolucionModificacionPlan;
    }

    /**
     * Define el valor de la propiedad resolucionModificacionPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.ResolucionModificacionPlan }
     *     
     */
    public void setResolucionModificacionPlan(DocumentoInab.ResolucionModificacionPlan value) {
        this.resolucionModificacionPlan = value;
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
     *                   &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DireccionSubregionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CuiSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
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
     *                   &lt;element name="NumeroLicenciaAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroPlanOperativoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Considerando">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DireccionSubregionalConsiderando" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroOficioSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaOficio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CierreResolucion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroLicenciaCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NumeroPlanOperativoCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Conclusiones">
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
     *       &lt;attribute name="ValidarDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "considerando",
        "cierreResolucion",
        "firma",
        "visor"
    })
    public static class ResolucionModificacionPlan {

        @XmlElement(name = "Encabezado", required = true)
        protected DocumentoInab.ResolucionModificacionPlan.Encabezado encabezado;
        @XmlElement(name = "Solicitantes", required = true)
        protected DocumentoInab.ResolucionModificacionPlan.Solicitantes solicitantes;
        @XmlElement(name = "Asunto", required = true)
        protected DocumentoInab.ResolucionModificacionPlan.Asunto asunto;
        @XmlElement(name = "Considerando", required = true)
        protected DocumentoInab.ResolucionModificacionPlan.Considerando considerando;
        @XmlElement(name = "CierreResolucion", required = true)
        protected DocumentoInab.ResolucionModificacionPlan.CierreResolucion cierreResolucion;
        @XmlElement(name = "Firma")
        protected DocumentoInab.ResolucionModificacionPlan.Firma firma;
        @XmlElement(name = "Visor", required = true)
        protected Asociados visor;
        @XmlAttribute(name = "ID", required = true)
        protected String id;
        @XmlAttribute(name = "FechaDocumento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaDocumento;
        @XmlAttribute(name = "TipoDocumento")
        protected Integer tipoDocumento;
        @XmlAttribute(name = "ValidarDocumento")
        protected Boolean validarDocumento;

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Encabezado }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Encabezado }
         *     
         */
        public void setEncabezado(DocumentoInab.ResolucionModificacionPlan.Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad solicitantes.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Solicitantes }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.Solicitantes getSolicitantes() {
            return solicitantes;
        }

        /**
         * Define el valor de la propiedad solicitantes.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Solicitantes }
         *     
         */
        public void setSolicitantes(DocumentoInab.ResolucionModificacionPlan.Solicitantes value) {
            this.solicitantes = value;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Asunto }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Asunto }
         *     
         */
        public void setAsunto(DocumentoInab.ResolucionModificacionPlan.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad considerando.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Considerando }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.Considerando getConsiderando() {
            return considerando;
        }

        /**
         * Define el valor de la propiedad considerando.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Considerando }
         *     
         */
        public void setConsiderando(DocumentoInab.ResolucionModificacionPlan.Considerando value) {
            this.considerando = value;
        }

        /**
         * Obtiene el valor de la propiedad cierreResolucion.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.CierreResolucion }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.CierreResolucion getCierreResolucion() {
            return cierreResolucion;
        }

        /**
         * Define el valor de la propiedad cierreResolucion.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.CierreResolucion }
         *     
         */
        public void setCierreResolucion(DocumentoInab.ResolucionModificacionPlan.CierreResolucion value) {
            this.cierreResolucion = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Firma }
         *     
         */
        public DocumentoInab.ResolucionModificacionPlan.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.ResolucionModificacionPlan.Firma }
         *     
         */
        public void setFirma(DocumentoInab.ResolucionModificacionPlan.Firma value) {
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
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isValidarDocumento() {
            return validarDocumento;
        }

        /**
         * Define el valor de la propiedad validarDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setValidarDocumento(Boolean value) {
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
         *         &lt;element name="NumeroLicenciaAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroPlanOperativoAsunto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "numeroLicenciaAsunto",
            "numeroPlanOperativoAsunto",
            "numeroExpediente"
        })
        public static class Asunto {

            @XmlElement(name = "NumeroLicenciaAsunto", required = true)
            protected String numeroLicenciaAsunto;
            @XmlElement(name = "NumeroPlanOperativoAsunto", required = true)
            protected String numeroPlanOperativoAsunto;
            @XmlElement(name = "NumeroExpediente", required = true)
            protected String numeroExpediente;

            /**
             * Obtiene el valor de la propiedad numeroLicenciaAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroLicenciaAsunto() {
                return numeroLicenciaAsunto;
            }

            /**
             * Define el valor de la propiedad numeroLicenciaAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroLicenciaAsunto(String value) {
                this.numeroLicenciaAsunto = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroPlanOperativoAsunto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroPlanOperativoAsunto() {
                return numeroPlanOperativoAsunto;
            }

            /**
             * Define el valor de la propiedad numeroPlanOperativoAsunto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroPlanOperativoAsunto(String value) {
                this.numeroPlanOperativoAsunto = value;
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
         *         &lt;element name="NumeroLicenciaCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroPlanOperativoCierre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Conclusiones">
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
            "numeroLicenciaCierre",
            "numeroPlanOperativoCierre",
            "conclusiones",
            "observaciones"
        })
        public static class CierreResolucion {

            @XmlElement(name = "NumeroLicenciaCierre", required = true)
            protected String numeroLicenciaCierre;
            @XmlElement(name = "NumeroPlanOperativoCierre", required = true)
            protected String numeroPlanOperativoCierre;
            @XmlElement(name = "Conclusiones", required = true)
            protected DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones conclusiones;
            @XmlElement(name = "Observaciones")
            protected String observaciones;

            /**
             * Obtiene el valor de la propiedad numeroLicenciaCierre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroLicenciaCierre() {
                return numeroLicenciaCierre;
            }

            /**
             * Define el valor de la propiedad numeroLicenciaCierre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroLicenciaCierre(String value) {
                this.numeroLicenciaCierre = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroPlanOperativoCierre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroPlanOperativoCierre() {
                return numeroPlanOperativoCierre;
            }

            /**
             * Define el valor de la propiedad numeroPlanOperativoCierre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroPlanOperativoCierre(String value) {
                this.numeroPlanOperativoCierre = value;
            }

            /**
             * Obtiene el valor de la propiedad conclusiones.
             * 
             * @return
             *     possible object is
             *     {@link DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones }
             *     
             */
            public DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones getConclusiones() {
                return conclusiones;
            }

            /**
             * Define el valor de la propiedad conclusiones.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones }
             *     
             */
            public void setConclusiones(DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones value) {
                this.conclusiones = value;
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
            public static class Conclusiones {

                @XmlElement(name = "Conclusion", required = true)
                protected List<DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion> conclusion;
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
                 * {@link DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion }
                 * 
                 * 
                 */
                public List<DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion> getConclusion() {
                    if (conclusion == null) {
                        conclusion = new ArrayList<DocumentoInab.ResolucionModificacionPlan.CierreResolucion.Conclusiones.Conclusion>();
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
         *         &lt;element name="NombreTecnicoForestal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DireccionSubregionalConsiderando" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaDictamenTecnico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="NumeroDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaDictamenJuridico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="NombreAsesorJuridico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NombreDirectorSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NumeroOficioSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaOficio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "nombreTecnicoForestal",
            "direccionSubregionalConsiderando",
            "numeroDictamenTecnico",
            "fechaDictamenTecnico",
            "numeroDictamenJuridico",
            "fechaDictamenJuridico",
            "nombreAsesorJuridico",
            "nombreDirectorSubregional",
            "numeroOficioSubregional",
            "fechaOficio"
        })
        public static class Considerando {

            @XmlElement(name = "NombreTecnicoForestal", required = true)
            protected String nombreTecnicoForestal;
            @XmlElement(name = "DireccionSubregionalConsiderando", required = true)
            protected String direccionSubregionalConsiderando;
            @XmlElement(name = "NumeroDictamenTecnico", required = true)
            protected String numeroDictamenTecnico;
            @XmlElement(name = "FechaDictamenTecnico", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaDictamenTecnico;
            @XmlElement(name = "NumeroDictamenJuridico", required = true)
            protected String numeroDictamenJuridico;
            @XmlElement(name = "FechaDictamenJuridico", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaDictamenJuridico;
            @XmlElement(name = "NombreAsesorJuridico", required = true)
            protected String nombreAsesorJuridico;
            @XmlElement(name = "NombreDirectorSubregional", required = true)
            protected String nombreDirectorSubregional;
            @XmlElement(name = "NumeroOficioSubregional", required = true)
            protected String numeroOficioSubregional;
            @XmlElement(name = "FechaOficio", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaOficio;

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
             * Obtiene el valor de la propiedad direccionSubregionalConsiderando.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionSubregionalConsiderando() {
                return direccionSubregionalConsiderando;
            }

            /**
             * Define el valor de la propiedad direccionSubregionalConsiderando.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionSubregionalConsiderando(String value) {
                this.direccionSubregionalConsiderando = value;
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
             * Obtiene el valor de la propiedad nombreDirectorSubregional.
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
             * Define el valor de la propiedad nombreDirectorSubregional.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreDirectorSubregional(String value) {
                this.nombreDirectorSubregional = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroOficioSubregional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOficioSubregional() {
                return numeroOficioSubregional;
            }

            /**
             * Define el valor de la propiedad numeroOficioSubregional.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOficioSubregional(String value) {
                this.numeroOficioSubregional = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaOficio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaOficio() {
                return fechaOficio;
            }

            /**
             * Define el valor de la propiedad fechaOficio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaOficio(XMLGregorianCalendar value) {
                this.fechaOficio = value;
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
         *         &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DireccionSubregionalEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartamentoEncabezado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaEncabezado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "numeroResolucion",
            "direccionSubregionalEncabezado",
            "departamentoEncabezado",
            "fechaEncabezado"
        })
        public static class Encabezado {

            @XmlElement(name = "NumeroResolucion", required = true)
            protected String numeroResolucion;
            @XmlElement(name = "DireccionSubregionalEncabezado", required = true)
            protected String direccionSubregionalEncabezado;
            @XmlElement(name = "DepartamentoEncabezado", required = true)
            protected String departamentoEncabezado;
            @XmlElement(name = "FechaEncabezado", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaEncabezado;

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
             * Obtiene el valor de la propiedad direccionSubregionalEncabezado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionSubregionalEncabezado() {
                return direccionSubregionalEncabezado;
            }

            /**
             * Define el valor de la propiedad direccionSubregionalEncabezado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionSubregionalEncabezado(String value) {
                this.direccionSubregionalEncabezado = value;
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
         *         &lt;element name="Solicitante" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CuiSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
            "content"
        })
        public static class Solicitantes {

            @XmlElementRef(name = "Solicitante", type = JAXBElement.class)
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "TotalSolicitantes")
            protected Integer totalSolicitantes;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link DocumentoInab.ResolucionModificacionPlan.Solicitantes.Solicitante }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
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
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CuiSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="OrdenSolicitantes" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nombreSolicitante",
                "cuiSolicitante"
            })
            public static class Solicitante {

                @XmlElement(name = "NombreSolicitante", required = true)
                protected String nombreSolicitante;
                @XmlElement(name = "CuiSolicitante", required = true)
                protected String cuiSolicitante;
                @XmlAttribute(name = "OrdenSolicitantes")
                protected Integer ordenSolicitantes;

                /**
                 * Obtiene el valor de la propiedad nombreSolicitante.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreSolicitante() {
                    return nombreSolicitante;
                }

                /**
                 * Define el valor de la propiedad nombreSolicitante.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreSolicitante(String value) {
                    this.nombreSolicitante = value;
                }

                /**
                 * Obtiene el valor de la propiedad cuiSolicitante.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCuiSolicitante() {
                    return cuiSolicitante;
                }

                /**
                 * Define el valor de la propiedad cuiSolicitante.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCuiSolicitante(String value) {
                    this.cuiSolicitante = value;
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
