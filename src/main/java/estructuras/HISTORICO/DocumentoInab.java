/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.HISTORICO;



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
 *         &lt;element name="Historico"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Items"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="FechaEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                                       &lt;element name="EstadoItem"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="INGRESADO"/&gt;
 *                                             &lt;enumeration value="PENDIENTE"/&gt;
 *                                             &lt;enumeration value="FINLIZADO"/&gt;
 *                                             &lt;enumeration value="CERRADO"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Creador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="PerfilCreador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="EstadoRegistro"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="EDITABLE"/&gt;
 *                                             &lt;enumeration value="NO EDITABLE"/&gt;
 *                                             &lt;enumeration value="CANCELADO"/&gt;
 *                                             &lt;enumeration value="FINALIZADO"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="TipoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                                     &lt;attribute name="OrdenRedis" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Actual" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="TipoAccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="idUsuarioActual" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *                 &lt;attribute name="idUsuarioAnterior" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="idUsuarioHistorico" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="Esquema" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Personalizado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1.0" /&gt;
 *       &lt;attribute name="NombreEsquema" type="{http://www.w3.org/2001/XMLSchema}string" default="Historico" /&gt;
 *       &lt;attribute name="ID_Usuario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Opcional" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "historico",
    "actual"
})
@XmlRootElement(name = "DocumentoInab")
public class DocumentoInab  implements Serializable{

    @XmlElement(name = "Historico", required = true)
    protected DocumentoInab.Historico historico = new Historico();
    @XmlElement(name = "Actual")
    protected DocumentoInab.Actual actual = new Actual();
    @XmlAttribute(name = "Version")
    protected BigDecimal version;
    @XmlAttribute(name = "NombreEsquema")
    protected String nombreEsquema;
    @XmlAttribute(name = "ID_Usuario")
    protected String idUsuario;
    @XmlAttribute(name = "Opcional")
    protected String opcional;

    /**
     * Gets the value of the historico property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.Historico }
     *     
     */
    public DocumentoInab.Historico getHistorico() {
        return historico;
    }

    /**
     * Sets the value of the historico property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.Historico }
     *     
     */
    public void setHistorico(DocumentoInab.Historico value) {
        this.historico = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoInab.Actual }
     *     
     */
    public DocumentoInab.Actual getActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoInab.Actual }
     *     
     */
    public void setActual(DocumentoInab.Actual value) {
        this.actual = value;
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
        if (version == null) {
            return new BigDecimal("1.0");
        } else {
            return version;
        }
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
        if (nombreEsquema == null) {
            return "Historico";
        } else {
            return nombreEsquema;
        }
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
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the opcional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcional() {
        return opcional;
    }

    /**
     * Sets the value of the opcional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcional(String value) {
        this.opcional = value;
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
     *         &lt;element name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="TipoAccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="idUsuarioActual" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *       &lt;attribute name="idUsuarioAnterior" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="idUsuarioHistorico" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="Esquema" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Personalizado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlRootElement(name = "Actual")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "licencia",
        "gestionId",
        "descripcion",
        "estado",
        "proceso",
        "paso",
        "pasoSiguiente",
        "fecha",
        "tipoAccion",
        "urlDocumento"
    })
    public static class Actual implements Serializable{

        @XmlElement(name = "Licencia", required = true)
        protected String licencia="";
        @XmlElement(name = "GestionId", defaultValue = "0")
        protected int gestionId;
        @XmlElement(name = "Descripcion", required = true)
        protected String descripcion;
        @XmlElement(name = "Estado", defaultValue = "0")
        protected int estado;
        @XmlElement(name = "Proceso", required = true)
        protected String proceso;
        @XmlElement(name = "Paso", required = true)
        protected String paso;
        @XmlElement(name = "PasoSiguiente", required = true)
        protected String pasoSiguiente;
        @XmlElement(name = "Fecha", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecha;
        @XmlElement(name = "TipoAccion")
        protected String tipoAccion;
        @XmlElement(name = "UrlDocumento", required = true)
        protected String urlDocumento;
        @XmlAttribute(name = "idUsuarioActual")
        protected Integer idUsuarioActual;
        @XmlAttribute(name = "idUsuarioAnterior")
        protected Integer idUsuarioAnterior;
        @XmlAttribute(name = "idUsuarioHistorico", required = true)
        protected int idUsuarioHistorico;
        @XmlAttribute(name = "Esquema")
        protected String esquema;
        @XmlAttribute(name = "Expediente")
        protected String expediente="";
        @XmlAttribute(name = "Personalizado")
        protected String personalizado;

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
         * Gets the value of the gestionId property.
         * 
         */
        public int getGestionId() {
            return gestionId;
        }

        /**
         * Sets the value of the gestionId property.
         * 
         */
        public void setGestionId(int value) {
            this.gestionId = value;
        }

        /**
         * Gets the value of the descripcion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Sets the value of the descripcion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Gets the value of the estado property.
         * 
         */
        public int getEstado() {
            return estado;
        }

        /**
         * Sets the value of the estado property.
         * 
         */
        public void setEstado(int value) {
            this.estado = value;
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
         * Gets the value of the pasoSiguiente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasoSiguiente() {
            return pasoSiguiente;
        }

        /**
         * Sets the value of the pasoSiguiente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasoSiguiente(String value) {
            this.pasoSiguiente = value;
        }

        /**
         * Gets the value of the fecha property.
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
         * Sets the value of the fecha property.
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
         * Gets the value of the tipoAccion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoAccion() {
            return tipoAccion;
        }

        /**
         * Sets the value of the tipoAccion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoAccion(String value) {
            this.tipoAccion = value;
        }

        /**
         * Gets the value of the urlDocumento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrlDocumento() {
            return urlDocumento;
        }

        /**
         * Sets the value of the urlDocumento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrlDocumento(String value) {
            this.urlDocumento = value;
        }

        /**
         * Gets the value of the idUsuarioActual property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getIdUsuarioActual() {
            if (idUsuarioActual == null) {
                return  0;
            } else {
                return idUsuarioActual;
            }
        }

        /**
         * Sets the value of the idUsuarioActual property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIdUsuarioActual(Integer value) {
            this.idUsuarioActual = value;
        }

        /**
         * Gets the value of the idUsuarioAnterior property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIdUsuarioAnterior() {
            return idUsuarioAnterior;
        }

        /**
         * Sets the value of the idUsuarioAnterior property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIdUsuarioAnterior(Integer value) {
            this.idUsuarioAnterior = value;
        }

        /**
         * Gets the value of the idUsuarioHistorico property.
         * 
         */
        public int getIdUsuarioHistorico() {
            return idUsuarioHistorico;
        }

        /**
         * Sets the value of the idUsuarioHistorico property.
         * 
         */
        public void setIdUsuarioHistorico(int value) {
            this.idUsuarioHistorico = value;
        }

        /**
         * Gets the value of the esquema property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEsquema() {
            return esquema;
        }

        /**
         * Sets the value of the esquema property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEsquema(String value) {
            this.esquema = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Items"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="FechaEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                             &lt;element name="EstadoItem"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="INGRESADO"/&gt;
     *                                   &lt;enumeration value="PENDIENTE"/&gt;
     *                                   &lt;enumeration value="FINLIZADO"/&gt;
     *                                   &lt;enumeration value="CERRADO"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Creador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="PerfilCreador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="EstadoRegistro"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="EDITABLE"/&gt;
     *                                   &lt;enumeration value="NO EDITABLE"/&gt;
     *                                   &lt;enumeration value="CANCELADO"/&gt;
     *                                   &lt;enumeration value="FINALIZADO"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="TipoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *                           &lt;attribute name="OrdenRedis" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
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
        "items"
    })
    public static class Historico implements Serializable{

        @XmlElement(name = "Items", required = true)
        protected DocumentoInab.Historico.Items items;

        /**
         * Gets the value of the items property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentoInab.Historico.Items }
         *     
         */
        public DocumentoInab.Historico.Items getItems() {
            return items;
        }

        /**
         * Sets the value of the items property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentoInab.Historico.Items }
         *     
         */
        public void setItems(DocumentoInab.Historico.Items value) {
            this.items = value;
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
         *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="FechaEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *                   &lt;element name="EstadoItem"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="INGRESADO"/&gt;
         *                         &lt;enumeration value="PENDIENTE"/&gt;
         *                         &lt;enumeration value="FINLIZADO"/&gt;
         *                         &lt;enumeration value="CERRADO"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Creador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="PerfilCreador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="EstadoRegistro"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="EDITABLE"/&gt;
         *                         &lt;enumeration value="NO EDITABLE"/&gt;
         *                         &lt;enumeration value="CANCELADO"/&gt;
         *                         &lt;enumeration value="FINALIZADO"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="TipoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
         *                 &lt;attribute name="OrdenRedis" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
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
        public static class Items  implements Serializable{

            @XmlElement(name = "Item")
            protected List<DocumentoInab.Historico.Items.Item> item;
            @XmlAttribute(name = "TotalItems")
            protected Integer totalItems;

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
             * {@link DocumentoInab.Historico.Items.Item }
             * 
             * 
             */
            public List<DocumentoInab.Historico.Items.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<DocumentoInab.Historico.Items.Item>();
                }
                return this.item;
            }

            /**
             * Gets the value of the totalItems property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public int getTotalItems() {
                if (totalItems == null) {
                    return  0;
                } else {
                    return totalItems;
                }
            }

            /**
             * Sets the value of the totalItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotalItems(Integer value) {
                this.totalItems = value;
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
             *         &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Licencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="FechaEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
             *         &lt;element name="EstadoItem"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="INGRESADO"/&gt;
             *               &lt;enumeration value="PENDIENTE"/&gt;
             *               &lt;enumeration value="FINLIZADO"/&gt;
             *               &lt;enumeration value="CERRADO"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Creador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="PerfilCreador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="EstadoRegistro"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="EDITABLE"/&gt;
             *               &lt;enumeration value="NO EDITABLE"/&gt;
             *               &lt;enumeration value="CANCELADO"/&gt;
             *               &lt;enumeration value="FINALIZADO"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="TipoItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="GestionId" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
             *       &lt;attribute name="OrdenRedis" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "expediente",
                "licencia",
                "proceso",
                "paso",
                "documento",
                "descripcion",
                "fechaEvento",
                "estadoItem",
                "creador",
                "perfilCreador",
                "estadoRegistro"
            })
            public static class Item  implements Serializable{

                @XmlElement(name = "Expediente")
                protected String expediente;
                @XmlElement(name = "Licencia")
                protected String licencia;
                @XmlElement(name = "Proceso")
                protected String proceso;
                @XmlElement(name = "Paso")
                protected String paso;
                @XmlElement(name = "Documento")
                protected String documento;
                @XmlElement(name = "Descripcion", required = true)
                protected String descripcion;
                @XmlElement(name = "FechaEvento", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar fechaEvento;
                @XmlElement(name = "EstadoItem", required = true)
                protected String estadoItem;
                @XmlElement(name = "Creador", required = true)
                protected String creador;
                @XmlElement(name = "PerfilCreador", required = true)
                protected String perfilCreador;
                @XmlElement(name = "EstadoRegistro", required = true)
                protected String estadoRegistro;
                @XmlAttribute(name = "TipoItem", required = true)
                protected String tipoItem;
                @XmlAttribute(name = "GestionId")
                protected Integer gestionId;
                @XmlAttribute(name = "OrdenRedis")
                protected Integer ordenRedis;

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
                 * Gets the value of the documento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumento() {
                    return documento;
                }

                /**
                 * Sets the value of the documento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumento(String value) {
                    this.documento = value;
                }

                /**
                 * Gets the value of the descripcion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescripcion() {
                    return descripcion;
                }

                /**
                 * Sets the value of the descripcion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescripcion(String value) {
                    this.descripcion = value;
                }

                /**
                 * Gets the value of the fechaEvento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaEvento() {
                    return fechaEvento;
                }

                /**
                 * Sets the value of the fechaEvento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaEvento(XMLGregorianCalendar value) {
                    this.fechaEvento = value;
                }

                /**
                 * Gets the value of the estadoItem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEstadoItem() {
                    return estadoItem;
                }

                /**
                 * Sets the value of the estadoItem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEstadoItem(String value) {
                    this.estadoItem = value;
                }

                /**
                 * Gets the value of the creador property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreador() {
                    return creador;
                }

                /**
                 * Sets the value of the creador property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreador(String value) {
                    this.creador = value;
                }

                /**
                 * Gets the value of the perfilCreador property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerfilCreador() {
                    return perfilCreador;
                }

                /**
                 * Sets the value of the perfilCreador property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerfilCreador(String value) {
                    this.perfilCreador = value;
                }

                /**
                 * Gets the value of the estadoRegistro property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEstadoRegistro() {
                    return estadoRegistro;
                }

                /**
                 * Sets the value of the estadoRegistro property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEstadoRegistro(String value) {
                    this.estadoRegistro = value;
                }

                /**
                 * Gets the value of the tipoItem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoItem() {
                    return tipoItem;
                }

                /**
                 * Sets the value of the tipoItem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoItem(String value) {
                    this.tipoItem = value;
                }

                /**
                 * Gets the value of the gestionId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getGestionId() {
                    if (gestionId == null) {
                        return  0;
                    } else {
                        return gestionId;
                    }
                }

                /**
                 * Sets the value of the gestionId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setGestionId(Integer value) {
                    this.gestionId = value;
                }

                /**
                 * Gets the value of the ordenRedis property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public int getOrdenRedis() {
                    if (ordenRedis == null) {
                        return  0;
                    } else {
                        return ordenRedis;
                    }
                }

                /**
                 * Sets the value of the ordenRedis property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOrdenRedis(Integer value) {
                    this.ordenRedis = value;
                }

            }

        }

    } 

}
