
package lire081;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asociados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asociados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vista"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Html" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                   &lt;element name="Figura" type="{}ContenedorSvg"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RutaPdf" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PasoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PasoActual" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="IP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Firmantes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Firma" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
     * Gets the value of the vista property.
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
     * Sets the value of the vista property.
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
     * Gets the value of the firmantes property.
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
     * Sets the value of the firmantes property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Firma" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
        @XmlAttribute(name = "Total")
        protected Integer total;

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
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
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
         *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="NombreQuienFirma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "idUsuario",
            "nombreQuienFirma"
        })
        public static class Firma {

            @XmlElement(name = "IdUsuario")
            protected int idUsuario;
            @XmlElement(name = "NombreQuienFirma", required = true)
            protected String nombreQuienFirma;

            /**
             * Gets the value of the idUsuario property.
             * 
             */
            public int getIdUsuario() {
                return idUsuario;
            }

            /**
             * Sets the value of the idUsuario property.
             * 
             */
            public void setIdUsuario(int value) {
                this.idUsuario = value;
            }

            /**
             * Gets the value of the nombreQuienFirma property.
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
             * Sets the value of the nombreQuienFirma property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Html" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *         &lt;element name="Figura" type="{}ContenedorSvg"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="UrlDocumento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RutaPdf" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PasoSiguiente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PasoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PasoActual" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="IP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
        @XmlElement(name = "Pdf", required = true)
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
         * Gets the value of the html property.
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
         * Sets the value of the html property.
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
         * Gets the value of the pdf property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getPdf() {
            return pdf;
        }

        /**
         * Sets the value of the pdf property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setPdf(byte[] value) {
            this.pdf = value;
        }

        /**
         * Gets the value of the figura property.
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
         * Sets the value of the figura property.
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
         * Gets the value of the rutaPdf property.
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
         * Sets the value of the rutaPdf property.
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
         * Gets the value of the pasoAnterior property.
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
         * Sets the value of the pasoAnterior property.
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
         * Gets the value of the pasoActual property.
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
         * Sets the value of the pasoActual property.
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
         * Gets the value of the ip property.
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
         * Sets the value of the ip property.
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
