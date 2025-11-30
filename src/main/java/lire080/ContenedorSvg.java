
package lire080;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContenedorSvg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContenedorSvg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContenedorSvg", propOrder = {
    "imagen"
})
public class ContenedorSvg {

    @XmlElement(name = "Imagen", required = true)
    protected Object imagen;

    /**
     * Gets the value of the imagen property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImagen(Object value) {
        this.imagen = value;
    }

}
