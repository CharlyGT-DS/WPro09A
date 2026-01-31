//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.30 a las 01:25:47 PM CST 
//


package lire022;

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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CedulaNotificacion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contenido">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NoPersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PersonaRecibe" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cedulaNotificacion"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab {

    @XmlElement(name = "CedulaNotificacion", required = true)
    protected DocumentoInab.CedulaNotificacion cedulaNotificacion;
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
     * Obtiene el valor de la propiedad cedulaNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.CedulaNotificacion }
     *     
     */
    public DocumentoInab.CedulaNotificacion getCedulaNotificacion() {
        return cedulaNotificacion;
    }

    /**
     * Define el valor de la propiedad cedulaNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.CedulaNotificacion }
     *     
     */
    public void setCedulaNotificacion(DocumentoInab.CedulaNotificacion value) {
        this.cedulaNotificacion = value;
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
     *         &lt;element name="Contenido">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NoPersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PersonaRecibe" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "contenido",
        "firma",
        "visor"
    })
    public static class CedulaNotificacion {

        @XmlElement(name = "Contenido", required = true)
        protected DocumentoInab.CedulaNotificacion.Contenido contenido;
        @XmlElement(name = "Firma")
        protected DocumentoInab.CedulaNotificacion.Firma firma;
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
         * Obtiene el valor de la propiedad contenido.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.CedulaNotificacion.Contenido }
         *     
         */
        public DocumentoInab.CedulaNotificacion.Contenido getContenido() {
            return contenido;
        }

        /**
         * Define el valor de la propiedad contenido.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.CedulaNotificacion.Contenido }
         *     
         */
        public void setContenido(DocumentoInab.CedulaNotificacion.Contenido value) {
            this.contenido = value;
        }

        /**
         * Obtiene el valor de la propiedad firma.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.CedulaNotificacion.Firma }
         *     
         */
        public DocumentoInab.CedulaNotificacion.Firma getFirma() {
            return firma;
        }

        /**
         * Define el valor de la propiedad firma.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.CedulaNotificacion.Firma }
         *     
         */
        public void setFirma(DocumentoInab.CedulaNotificacion.Firma value) {
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
         *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="DireccionSubregional" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NoPersonaNotificada" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PersonaRecibe" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "municipio",
            "departamento",
            "fecha",
            "direccionSubregional",
            "personaNotificada",
            "tipoPersona",
            "noPersonaNotificada",
            "personaRecibe",
            "observaciones"
        })
        public static class Contenido {

            @XmlElement(name = "Municipio", required = true)
            protected String municipio;
            @XmlElement(name = "Departamento", required = true)
            protected String departamento;
            @XmlElement(name = "Fecha", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fecha;
            @XmlElement(name = "DireccionSubregional", required = true)
            protected String direccionSubregional;
            @XmlElement(name = "PersonaNotificada", required = true)
            protected String personaNotificada;
            @XmlElement(name = "TipoPersona", required = true)
            protected String tipoPersona;
            @XmlElement(name = "NoPersonaNotificada", required = true)
            protected String noPersonaNotificada;
            @XmlElement(name = "PersonaRecibe", required = true)
            protected String personaRecibe;
            @XmlElement(name = "Observaciones")
            protected String observaciones;

            /**
             * Obtiene el valor de la propiedad municipio.
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
             * Define el valor de la propiedad municipio.
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
             * Obtiene el valor de la propiedad departamento.
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
             * Define el valor de la propiedad departamento.
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
             * Obtiene el valor de la propiedad fecha.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFecha() {
                return fecha;
            }

            /**
             * Define el valor de la propiedad fecha.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFecha(XMLGregorianCalendar value) {
                this.fecha = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionSubregional.
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
             * Define el valor de la propiedad direccionSubregional.
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
             * Obtiene el valor de la propiedad personaNotificada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonaNotificada() {
                return personaNotificada;
            }

            /**
             * Define el valor de la propiedad personaNotificada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonaNotificada(String value) {
                this.personaNotificada = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoPersona.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoPersona() {
                return tipoPersona;
            }

            /**
             * Define el valor de la propiedad tipoPersona.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoPersona(String value) {
                this.tipoPersona = value;
            }

            /**
             * Obtiene el valor de la propiedad noPersonaNotificada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoPersonaNotificada() {
                return noPersonaNotificada;
            }

            /**
             * Define el valor de la propiedad noPersonaNotificada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoPersonaNotificada(String value) {
                this.noPersonaNotificada = value;
            }

            /**
             * Obtiene el valor de la propiedad personaRecibe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonaRecibe() {
                return personaRecibe;
            }

            /**
             * Define el valor de la propiedad personaRecibe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonaRecibe(String value) {
                this.personaRecibe = value;
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
