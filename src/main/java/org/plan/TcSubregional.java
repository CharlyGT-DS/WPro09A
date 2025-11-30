
package org.plan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}confirmado"/&gt;
 *         &lt;element ref="{}correo"/&gt;
 *         &lt;element ref="{}cui"/&gt;
 *         &lt;element ref="{}direccion"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}fechaNacimiento"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}fechaUltModif"/&gt;
 *         &lt;element ref="{}fechaVencimiento"/&gt;
 *         &lt;element ref="{}foto"/&gt;
 *         &lt;element ref="{}nit"/&gt;
 *         &lt;element ref="{}passwordTmp"/&gt;
 *         &lt;element ref="{}personaDesc"/&gt;
 *         &lt;element ref="{}personaId"/&gt;
 *         &lt;element ref="{}rf"/&gt;
 *         &lt;element ref="{}rfn"/&gt;
 *         &lt;element ref="{}rutaFoto"/&gt;
 *         &lt;element ref="{}sigla"/&gt;
 *         &lt;element ref="{}tcCultura"/&gt;
 *         &lt;element ref="{}tcEstadoCivil"/&gt;
 *         &lt;element ref="{}tcIdioma"/&gt;
 *         &lt;element ref="{}tcMunicipio"/&gt;
 *         &lt;element ref="{}tcOcupacion"/&gt;
 *         &lt;element ref="{}tcPuesto"/&gt;
 *         &lt;element ref="{}tcSexo"/&gt;
 *         &lt;element ref="{}tcUsuario"/&gt;
 *         &lt;element ref="{}tcUsuarioSubregion"/&gt;
 *         &lt;element ref="{}telefono"/&gt;
 *         &lt;element ref="{}tmpFoto"/&gt;
 *         &lt;element ref="{}usuario"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "tcSubregional")
public class TcSubregional {

    @XmlElementRefs({
        @XmlElementRef(name = "confirmado", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "correo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cui", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "direccion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaNacimiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaUltModif", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaVencimiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "foto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "passwordTmp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personaDesc", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personaId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rfn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rutaFoto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sigla", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tcCultura", type = TcCultura.class, required = false),
        @XmlElementRef(name = "tcEstadoCivil", type = TcEstadoCivil.class, required = false),
        @XmlElementRef(name = "tcIdioma", type = TcIdioma.class, required = false),
        @XmlElementRef(name = "tcMunicipio", type = TcMunicipio.class, required = false),
        @XmlElementRef(name = "tcOcupacion", type = TcOcupacion.class, required = false),
        @XmlElementRef(name = "tcPuesto", type = TcPuesto.class, required = false),
        @XmlElementRef(name = "tcSexo", type = TcSexo.class, required = false),
        @XmlElementRef(name = "tcUsuario", type = TcUsuario.class, required = false),
        @XmlElementRef(name = "tcUsuarioSubregion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "telefono", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tmpFoto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "usuario", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

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
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TcCultura }
     * {@link TcEstadoCivil }
     * {@link TcIdioma }
     * {@link TcMunicipio }
     * {@link TcOcupacion }
     * {@link TcPuesto }
     * {@link TcSexo }
     * {@link TcUsuario }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
