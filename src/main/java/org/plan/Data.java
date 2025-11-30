
package org.plan;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}anexo"/&gt;
 *         &lt;element ref="{}anio"/&gt;
 *         &lt;element ref="{}area"/&gt;
 *         &lt;element ref="{}categoriaProfesionId"/&gt;
 *         &lt;element ref="{}codigoClase"/&gt;
 *         &lt;element ref="{}cronograma"/&gt;
 *         &lt;element ref="{}especies"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}expediente"/&gt;
 *         &lt;element ref="{}expedienteVacId"/&gt;
 *         &lt;element ref="{}fechaAceptacion"/&gt;
 *         &lt;element ref="{}fechaAnulacion"/&gt;
 *         &lt;element ref="{}fechaCierre"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}fechaVencimiento"/&gt;
 *         &lt;element ref="{}fincas"/&gt;
 *         &lt;element ref="{}gestionId"/&gt;
 *         &lt;element ref="{}informes"/&gt;
 *         &lt;element ref="{}notificaciones"/&gt;
 *         &lt;element ref="{}nug"/&gt;
 *         &lt;element ref="{}numero"/&gt;
 *         &lt;element ref="{}observaciones"/&gt;
 *         &lt;element ref="{}observacionesCronograma"/&gt;
 *         &lt;element ref="{}pasoId"/&gt;
 *         &lt;element ref="{}personaAnulaId"/&gt;
 *         &lt;element ref="{}personas"/&gt;
 *         &lt;element ref="{}representantes"/&gt;
 *         &lt;element ref="{}rodal"/&gt;
 *         &lt;element ref="{}rodalesRepoblacion"/&gt;
 *         &lt;element ref="{}sistemaRepoblacion"/&gt;
 *         &lt;element ref="{}tcElaborador"/&gt;
 *         &lt;element ref="{}tcPersonaCrea"/&gt;
 *         &lt;element ref="{}tcPlanTipoGestion"/&gt;
 *         &lt;element ref="{}tcSubregion"/&gt;
 *         &lt;element ref="{}tcTipoBosque"/&gt;
 *         &lt;element ref="{}tcTipoGestion"/&gt;
 *         &lt;element ref="{}tieneRepresentante"/&gt;
 *         &lt;element ref="{}ttBiofisicaGestion"/&gt;
 *         &lt;element ref="{}ttDivisionAreaGestion"/&gt;
 *         &lt;element ref="{}ttEstadisticoGestion"/&gt;
 *         &lt;element ref="{}ttInventarioGestion"/&gt;
 *         &lt;element ref="{}ttPlanificacionGestion"/&gt;
 *         &lt;element ref="{}ttProteccionGestion"/&gt;
 *         &lt;element ref="{}ttRepoblacionGestion"/&gt;
 *         &lt;element ref="{}ttRepresentanteGestion"/&gt;
 *         &lt;element ref="{}ttResumenGestion"/&gt;
 *         &lt;element ref="{}ttTipoPropietarioGestion"/&gt;
 *         &lt;element ref="{}ultimoPanel"/&gt;
 *         &lt;element ref="{}uso"/&gt;
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
@XmlRootElement(name = "data")
public class Data {

    @XmlElementRefs({
        @XmlElementRef(name = "anexo", type = Anexo.class, required = false),
        @XmlElementRef(name = "anio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "area", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "categoriaProfesionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codigoClase", type = CodigoClase.class, required = false),
        @XmlElementRef(name = "cronograma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "especies", type = Especies.class, required = false),
        @XmlElementRef(name = "estadoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "expediente", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "expedienteVacId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaAceptacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaAnulacion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaCierre", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaRegistro", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaVencimiento", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fincas", type = Fincas.class, required = false),
        @XmlElementRef(name = "gestionId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "informes", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notificaciones", type = Notificaciones.class, required = false),
        @XmlElementRef(name = "nug", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numero", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "observaciones", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "observacionesCronograma", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pasoId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personaAnulaId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personas", type = Personas.class, required = false),
        @XmlElementRef(name = "representantes", type = Representantes.class, required = false),
        @XmlElementRef(name = "rodal", type = Rodal.class, required = false),
        @XmlElementRef(name = "rodalesRepoblacion", type = RodalesRepoblacion.class, required = false),
        @XmlElementRef(name = "sistemaRepoblacion", type = SistemaRepoblacion.class, required = false),
        @XmlElementRef(name = "tcElaborador", type = TcElaborador.class, required = false),
        @XmlElementRef(name = "tcPersonaCrea", type = TcPersonaCrea.class, required = false),
        @XmlElementRef(name = "tcPlanTipoGestion", type = TcPlanTipoGestion.class, required = false),
        @XmlElementRef(name = "tcSubregion", type = TcSubregion.class, required = false),
        @XmlElementRef(name = "tcTipoBosque", type = TcTipoBosque.class, required = false),
        @XmlElementRef(name = "tcTipoGestion", type = TcTipoGestion.class, required = false),
        @XmlElementRef(name = "tieneRepresentante", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttBiofisicaGestion", type = TtBiofisicaGestion.class, required = false),
        @XmlElementRef(name = "ttDivisionAreaGestion", type = TtDivisionAreaGestion.class, required = false),
        @XmlElementRef(name = "ttEstadisticoGestion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttInventarioGestion", type = TtInventarioGestion.class, required = false),
        @XmlElementRef(name = "ttPlanificacionGestion", type = TtPlanificacionGestion.class, required = false),
        @XmlElementRef(name = "ttProteccionGestion", type = TtProteccionGestion.class, required = false),
        @XmlElementRef(name = "ttRepoblacionGestion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttRepresentanteGestion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttResumenGestion", type = TtResumenGestion.class, required = false),
        @XmlElementRef(name = "ttTipoPropietarioGestion", type = TtTipoPropietarioGestion.class, required = false),
        @XmlElementRef(name = "ultimoPanel", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uso", type = Uso.class, required = false)
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
     * {@link Anexo }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link CodigoClase }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Especies }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Fincas }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Notificaciones }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Personas }
     * {@link Representantes }
     * {@link Rodal }
     * {@link RodalesRepoblacion }
     * {@link SistemaRepoblacion }
     * {@link TcElaborador }
     * {@link TcPersonaCrea }
     * {@link TcPlanTipoGestion }
     * {@link TcSubregion }
     * {@link TcTipoBosque }
     * {@link TcTipoGestion }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link TtBiofisicaGestion }
     * {@link TtDivisionAreaGestion }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TtInventarioGestion }
     * {@link TtPlanificacionGestion }
     * {@link TtProteccionGestion }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link TtResumenGestion }
     * {@link TtTipoPropietarioGestion }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Uso }
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
