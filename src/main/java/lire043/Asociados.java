//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.27 a las 05:57:07 PM CST 
//


package lire043;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Asociados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Asociados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vista">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Html" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                   &lt;element name="Figura" type="{}ContenedorSvg"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RutaPdf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PasoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PasoActual" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Firmantes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Firma" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TotalFirmantes" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "Asociados", propOrder = {
    "vista",
    "firmantes"
})
public class Asociados {

    @XmlElement(name = "Vista", required = true)
    protected Asociados.Vista vista;
    @XmlElement(name = "Firmantes", required = true)
    protected Asociados.Firmantes firmantes;

    /**
     * Obtiene el valor de la propiedad vista.
     * 
     * @return
     *     possible object is
     *     {@link Asociados.Vista }
     *     
     */
    public Asociados.Vista getVista() {
        return vista;
    }

    /**
     * Define el valor de la propiedad vista.
     * 
     * @param value
     *     allowed object is
     *     {@link Asociados.Vista }
     *     
     */
    public void setVista(Asociados.Vista value) {
        this.vista = value;
    }

    /**
     * Obtiene el valor de la propiedad firmantes.
     * 
     * @return
     *     possible object is
     *     {@link Asociados.Firmantes }
     *     
     */
    public Asociados.Firmantes getFirmantes() {
        return firmantes;
    }

    /**
     * Define el valor de la propiedad firmantes.
     * 
     * @param value
     *     allowed object is
     *     {@link Asociados.Firmantes }
     *     
     */
    public void setFirmantes(Asociados.Firmantes value) {
        this.firmantes = value;
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
     *         &lt;element name="Firma" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TotalFirmantes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firma"
    })
    public static class Firmantes {

        @XmlElement(name = "Firma", required = true)
        protected List<Asociados.Firmantes.Firma> firma;
        @XmlAttribute(name = "TotalFirmantes")
        protected Integer totalFirmantes;

        /**
         * Gets the value of the firma property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firma property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFirma().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Asociados.Firmantes.Firma }
         * 
         * 
         */
        public List<Asociados.Firmantes.Firma> getFirma() {
            if (firma == null) {
                firma = new ArrayList<Asociados.Firmantes.Firma>();
            }
            return this.firma;
        }

        /**
         * Obtiene el valor de la propiedad totalFirmantes.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotalFirmantes() {
            return totalFirmantes;
        }

        /**
         * Define el valor de la propiedad totalFirmantes.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotalFirmantes(Integer value) {
            this.totalFirmantes = value;
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
         *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "idUsuario",
            "nombreQuienFirma"
        })
        public static class Firma {

            @XmlElement(name = "IdUsuario")
            protected int idUsuario;
            @XmlElement(name = "NombreQuienFirma", required = true)
            protected String nombreQuienFirma;

            /**
             * Obtiene el valor de la propiedad idUsuario.
             * 
             */
            public int getIdUsuario() {
                return idUsuario;
            }

            /**
             * Define el valor de la propiedad idUsuario.
             * 
             */
            public void setIdUsuario(int value) {
                this.idUsuario = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreQuienFirma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreQuienFirma() {
                return nombreQuienFirma;
            }

            /**
             * Define el valor de la propiedad nombreQuienFirma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreQuienFirma(String value) {
                this.nombreQuienFirma = value;
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
     *         &lt;element name="Html" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *         &lt;element name="Figura" type="{}ContenedorSvg"/>
     *       &lt;/sequence>
     *       &lt;attribute name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RutaPdf" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PasoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PasoActual" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IP" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "html",
        "pdf",
        "figura"
    })
    public static class Vista {

        @XmlElement(name = "Html", required = true)
        protected String html;
        @XmlElement(name = "PDF", required = true)
        protected byte[] pdf;
        @XmlElement(name = "Figura", required = true)
        protected ContenedorSvg figura;
        @XmlAttribute(name = "UrlDocumento")
        protected String urlDocumento;
        @XmlAttribute(name = "RutaPdf")
        protected String rutaPdf;
        @XmlAttribute(name = "PasoSiguiente")
        protected String pasoSiguiente;
        @XmlAttribute(name = "PasoAnterior")
        protected String pasoAnterior;
        @XmlAttribute(name = "PasoActual")
        protected String pasoActual;
        @XmlAttribute(name = "IP")
        protected String ip;

        /**
         * Obtiene el valor de la propiedad html.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHtml() {
            return html;
        }

        /**
         * Define el valor de la propiedad html.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHtml(String value) {
            this.html = value;
        }

        /**
         * Obtiene el valor de la propiedad pdf.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getPDF() {
            return pdf;
        }

        /**
         * Define el valor de la propiedad pdf.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setPDF(byte[] value) {
            this.pdf = value;
        }

        /**
         * Obtiene el valor de la propiedad figura.
         * 
         * @return
         *     possible object is
         *     {@link ContenedorSvg }
         *     
         */
        public ContenedorSvg getFigura() {
            return figura;
        }

        /**
         * Define el valor de la propiedad figura.
         * 
         * @param value
         *     allowed object is
         *     {@link ContenedorSvg }
         *     
         */
        public void setFigura(ContenedorSvg value) {
            this.figura = value;
        }

        /**
         * Obtiene el valor de la propiedad urlDocumento.
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
         * Define el valor de la propiedad urlDocumento.
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
         * Obtiene el valor de la propiedad rutaPdf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRutaPdf() {
            return rutaPdf;
        }

        /**
         * Define el valor de la propiedad rutaPdf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRutaPdf(String value) {
            this.rutaPdf = value;
        }

        /**
         * Obtiene el valor de la propiedad pasoSiguiente.
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
         * Define el valor de la propiedad pasoSiguiente.
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
         * Obtiene el valor de la propiedad pasoAnterior.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasoAnterior() {
            return pasoAnterior;
        }

        /**
         * Define el valor de la propiedad pasoAnterior.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasoAnterior(String value) {
            this.pasoAnterior = value;
        }

        /**
         * Obtiene el valor de la propiedad pasoActual.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasoActual() {
            return pasoActual;
        }

        /**
         * Define el valor de la propiedad pasoActual.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasoActual(String value) {
            this.pasoActual = value;
        }

        /**
         * Obtiene el valor de la propiedad ip.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIP() {
            return ip;
        }

        /**
         * Define el valor de la propiedad ip.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIP(String value) {
            this.ip = value;
        }

    }

}
