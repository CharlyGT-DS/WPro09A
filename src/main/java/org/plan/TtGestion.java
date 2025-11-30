
package org.plan;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{}nug"/&gt;
 *         &lt;element ref="{}ttRepresentanteGestion"/&gt;
 *         &lt;element ref="{}tcSubregion"/&gt;
 *         &lt;element ref="{}tcPersonaCrea"/&gt;
 *         &lt;element ref="{}fechaAceptacion"/&gt;
 *         &lt;element ref="{}fechaAnulacion"/&gt;
 *         &lt;element ref="{}uso"/&gt;
 *         &lt;element ref="{}ttEstadisticoGestion"/&gt;
 *         &lt;element ref="{}estadoId"/&gt;
 *         &lt;element ref="{}codigoClase"/&gt;
 *         &lt;element ref="{}area"/&gt;
 *         &lt;element ref="{}pasoId"/&gt;
 *         &lt;element ref="{}especies"/&gt;
 *         &lt;element ref="{}tcTipoGestion"/&gt;
 *         &lt;element ref="{}personas"/&gt;
 *         &lt;element ref="{}categoriaProfesionId"/&gt;
 *         &lt;element ref="{}ttResumenGestion"/&gt;
 *         &lt;element ref="{}ttInventarioGestion"/&gt;
 *         &lt;element ref="{}ttPlanificacionGestion"/&gt;
 *         &lt;element ref="{}notificaciones"/&gt;
 *         &lt;element ref="{}criterio"/&gt;
 *         &lt;element ref="{}observaciones"/&gt;
 *         &lt;element ref="{}tcTipoBosque"/&gt;
 *         &lt;element ref="{}anio"/&gt;
 *         &lt;element ref="{}ttProteccionGestion"/&gt;
 *         &lt;element ref="{}numero"/&gt;
 *         &lt;element ref="{}expediente"/&gt;
 *         &lt;element ref="{}anexo"/&gt;
 *         &lt;element ref="{}ttBiofisicaGestion"/&gt;
 *         &lt;element ref="{}tcPlanTipoGestion"/&gt;
 *         &lt;element ref="{}rodal"/&gt;
 *         &lt;element ref="{}ttRepoblacionGestion"/&gt;
 *         &lt;element ref="{}representantes"/&gt;
 *         &lt;element ref="{}tieneRepresentante"/&gt;
 *         &lt;element ref="{}cronograma"/&gt;
 *         &lt;element ref="{}ultimoPanel"/&gt;
 *         &lt;element ref="{}gestionId"/&gt;
 *         &lt;element ref="{}fincas"/&gt;
 *         &lt;element ref="{}fechaRegistro"/&gt;
 *         &lt;element ref="{}fechaVencimiento"/&gt;
 *         &lt;element ref="{}rodalesRepoblacion"/&gt;
 *         &lt;element ref="{}sistemaRepoblacion"/&gt;
 *         &lt;element ref="{}tcElaborador"/&gt;
 *         &lt;element ref="{}observacionesCronograma"/&gt;
 *         &lt;element ref="{}ttDivisionAreaGestion"/&gt;
 *         &lt;element ref="{}expedienteVacId"/&gt;
 *         &lt;element ref="{}fechaCierre"/&gt;
 *         &lt;element ref="{}ttTipoPropietarioGestion"/&gt;
 *         &lt;element ref="{}personaAnulaId"/&gt;
 *         &lt;element ref="{}informes"/&gt;
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
    "nug",
    "ttRepresentanteGestion",
    "tcSubregion",
    "tcPersonaCrea",
    "fechaAceptacion",
    "fechaAnulacion",
    "uso",
    "ttEstadisticoGestion",
    "estadoId",
    "codigoClase",
    "area",
    "pasoId",
    "especies",
    "tcTipoGestion",
    "personas",
    "categoriaProfesionId",
    "ttResumenGestion",
    "ttInventarioGestion",
    "ttPlanificacionGestion",
    "notificaciones",
    "criterio",
    "observaciones",
    "tcTipoBosque",
    "anio",
    "ttProteccionGestion",
    "numero",
    "expediente",
    "anexo",
    "ttBiofisicaGestion",
    "tcPlanTipoGestion",
    "rodal",
    "ttRepoblacionGestion",
    "representantes",
    "tieneRepresentante",
    "cronograma",
    "ultimoPanel",
    "gestionId",
    "fincas",
    "fechaRegistro",
    "fechaVencimiento",
    "rodalesRepoblacion",
    "sistemaRepoblacion",
    "tcElaborador",
    "observacionesCronograma",
    "ttDivisionAreaGestion",
    "expedienteVacId",
    "fechaCierre",
    "ttTipoPropietarioGestion",
    "personaAnulaId",
    "informes"
})
@XmlRootElement(name = "ttGestion")
public class TtGestion {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String nug;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ttRepresentanteGestion;
    @XmlElement(required = true)
    protected TcSubregion tcSubregion;
    @XmlElement(required = true)
    protected TcPersonaCrea tcPersonaCrea;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAceptacion;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String fechaAnulacion;
    @XmlElement(required = true)
    protected Uso uso;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ttEstadisticoGestion;
    @XmlElement(required = true)
    protected BigInteger estadoId;
    @XmlElement(required = true)
    protected CodigoClase codigoClase;
    @XmlElement(required = true)
    protected BigDecimal area;
    @XmlElement(required = true)
    protected BigInteger pasoId;
    @XmlElement(required = true)
    protected Especies especies;
    @XmlElement(required = true)
    protected TcTipoGestion tcTipoGestion;
    @XmlElement(required = true)
    protected Personas personas;
    @XmlElement(required = true)
    protected BigInteger categoriaProfesionId;
    @XmlElement(required = true)
    protected TtResumenGestion ttResumenGestion;
    @XmlElement(required = true)
    protected TtInventarioGestion ttInventarioGestion;
    @XmlElement(required = true)
    protected TtPlanificacionGestion ttPlanificacionGestion;
    @XmlElement(required = true)
    protected Notificaciones notificaciones;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String criterio;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected TcTipoBosque tcTipoBosque;
    @XmlElement(required = true)
    protected BigInteger anio;
    @XmlElement(required = true)
    protected TtProteccionGestion ttProteccionGestion;
    @XmlElement(required = true)
    protected BigInteger numero;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String expediente;
    @XmlElement(required = true)
    protected Anexo anexo;
    @XmlElement(required = true)
    protected TtBiofisicaGestion ttBiofisicaGestion;
    @XmlElement(required = true)
    protected TcPlanTipoGestion tcPlanTipoGestion;
    @XmlElement(required = true)
    protected Rodal rodal;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ttRepoblacionGestion;
    @XmlElement(required = true)
    protected Representantes representantes;
    @XmlElement(required = true)
    protected BigInteger tieneRepresentante;
    @XmlElement(required = true)
    protected String cronograma;
    @XmlElement(required = true)
    protected BigInteger ultimoPanel;
    @XmlElement(required = true)
    protected BigInteger gestionId;
    @XmlElement(required = true)
    protected Fincas fincas;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fechaVencimiento;
    @XmlElement(required = true)
    protected RodalesRepoblacion rodalesRepoblacion;
    @XmlElement(required = true)
    protected SistemaRepoblacion sistemaRepoblacion;
    @XmlElement(required = true)
    protected TcElaborador tcElaborador;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String observacionesCronograma;
    @XmlElement(required = true)
    protected TtDivisionAreaGestion ttDivisionAreaGestion;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String expedienteVacId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCierre;
    @XmlElement(required = true)
    protected TtTipoPropietarioGestion ttTipoPropietarioGestion;
    @XmlElement(required = true)
    protected BigInteger personaAnulaId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String informes;

    /**
     * Gets the value of the nug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNug() {
        return nug;
    }

    /**
     * Sets the value of the nug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNug(String value) {
        this.nug = value;
    }

    /**
     * Gets the value of the ttRepresentanteGestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtRepresentanteGestion() {
        return ttRepresentanteGestion;
    }

    /**
     * Sets the value of the ttRepresentanteGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtRepresentanteGestion(String value) {
        this.ttRepresentanteGestion = value;
    }

    /**
     * Gets the value of the tcSubregion property.
     * 
     * @return
     *     possible object is
     *     {@link TcSubregion }
     *     
     */
    public TcSubregion getTcSubregion() {
        return tcSubregion;
    }

    /**
     * Sets the value of the tcSubregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSubregion }
     *     
     */
    public void setTcSubregion(TcSubregion value) {
        this.tcSubregion = value;
    }

    /**
     * Gets the value of the tcPersonaCrea property.
     * 
     * @return
     *     possible object is
     *     {@link TcPersonaCrea }
     *     
     */
    public TcPersonaCrea getTcPersonaCrea() {
        return tcPersonaCrea;
    }

    /**
     * Sets the value of the tcPersonaCrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcPersonaCrea }
     *     
     */
    public void setTcPersonaCrea(TcPersonaCrea value) {
        this.tcPersonaCrea = value;
    }

    /**
     * Gets the value of the fechaAceptacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAceptacion() {
        return fechaAceptacion;
    }

    /**
     * Sets the value of the fechaAceptacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAceptacion(XMLGregorianCalendar value) {
        this.fechaAceptacion = value;
    }

    /**
     * Gets the value of the fechaAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAnulacion() {
        return fechaAnulacion;
    }

    /**
     * Sets the value of the fechaAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAnulacion(String value) {
        this.fechaAnulacion = value;
    }

    /**
     * Gets the value of the uso property.
     * 
     * @return
     *     possible object is
     *     {@link Uso }
     *     
     */
    public Uso getUso() {
        return uso;
    }

    /**
     * Sets the value of the uso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uso }
     *     
     */
    public void setUso(Uso value) {
        this.uso = value;
    }

    /**
     * Gets the value of the ttEstadisticoGestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtEstadisticoGestion() {
        return ttEstadisticoGestion;
    }

    /**
     * Sets the value of the ttEstadisticoGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtEstadisticoGestion(String value) {
        this.ttEstadisticoGestion = value;
    }

    /**
     * Gets the value of the estadoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEstadoId() {
        return estadoId;
    }

    /**
     * Sets the value of the estadoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEstadoId(BigInteger value) {
        this.estadoId = value;
    }

    /**
     * Gets the value of the codigoClase property.
     * 
     * @return
     *     possible object is
     *     {@link CodigoClase }
     *     
     */
    public CodigoClase getCodigoClase() {
        return codigoClase;
    }

    /**
     * Sets the value of the codigoClase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoClase }
     *     
     */
    public void setCodigoClase(CodigoClase value) {
        this.codigoClase = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the pasoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPasoId() {
        return pasoId;
    }

    /**
     * Sets the value of the pasoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPasoId(BigInteger value) {
        this.pasoId = value;
    }

    /**
     * Gets the value of the especies property.
     * 
     * @return
     *     possible object is
     *     {@link Especies }
     *     
     */
    public Especies getEspecies() {
        return especies;
    }

    /**
     * Sets the value of the especies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Especies }
     *     
     */
    public void setEspecies(Especies value) {
        this.especies = value;
    }

    /**
     * Gets the value of the tcTipoGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TcTipoGestion }
     *     
     */
    public TcTipoGestion getTcTipoGestion() {
        return tcTipoGestion;
    }

    /**
     * Sets the value of the tcTipoGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTipoGestion }
     *     
     */
    public void setTcTipoGestion(TcTipoGestion value) {
        this.tcTipoGestion = value;
    }

    /**
     * Gets the value of the personas property.
     * 
     * @return
     *     possible object is
     *     {@link Personas }
     *     
     */
    public Personas getPersonas() {
        return personas;
    }

    /**
     * Sets the value of the personas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Personas }
     *     
     */
    public void setPersonas(Personas value) {
        this.personas = value;
    }

    /**
     * Gets the value of the categoriaProfesionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoriaProfesionId() {
        return categoriaProfesionId;
    }

    /**
     * Sets the value of the categoriaProfesionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoriaProfesionId(BigInteger value) {
        this.categoriaProfesionId = value;
    }

    /**
     * Gets the value of the ttResumenGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtResumenGestion }
     *     
     */
    public TtResumenGestion getTtResumenGestion() {
        return ttResumenGestion;
    }

    /**
     * Sets the value of the ttResumenGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtResumenGestion }
     *     
     */
    public void setTtResumenGestion(TtResumenGestion value) {
        this.ttResumenGestion = value;
    }

    /**
     * Gets the value of the ttInventarioGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtInventarioGestion }
     *     
     */
    public TtInventarioGestion getTtInventarioGestion() {
        return ttInventarioGestion;
    }

    /**
     * Sets the value of the ttInventarioGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtInventarioGestion }
     *     
     */
    public void setTtInventarioGestion(TtInventarioGestion value) {
        this.ttInventarioGestion = value;
    }

    /**
     * Gets the value of the ttPlanificacionGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtPlanificacionGestion }
     *     
     */
    public TtPlanificacionGestion getTtPlanificacionGestion() {
        return ttPlanificacionGestion;
    }

    /**
     * Sets the value of the ttPlanificacionGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtPlanificacionGestion }
     *     
     */
    public void setTtPlanificacionGestion(TtPlanificacionGestion value) {
        this.ttPlanificacionGestion = value;
    }

    /**
     * Gets the value of the notificaciones property.
     * 
     * @return
     *     possible object is
     *     {@link Notificaciones }
     *     
     */
    public Notificaciones getNotificaciones() {
        return notificaciones;
    }

    /**
     * Sets the value of the notificaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notificaciones }
     *     
     */
    public void setNotificaciones(Notificaciones value) {
        this.notificaciones = value;
    }

    /**
     * Gets the value of the criterio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * Sets the value of the criterio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterio(String value) {
        this.criterio = value;
    }

    /**
     * Gets the value of the observaciones property.
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
     * Sets the value of the observaciones property.
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
     * Gets the value of the tcTipoBosque property.
     * 
     * @return
     *     possible object is
     *     {@link TcTipoBosque }
     *     
     */
    public TcTipoBosque getTcTipoBosque() {
        return tcTipoBosque;
    }

    /**
     * Sets the value of the tcTipoBosque property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcTipoBosque }
     *     
     */
    public void setTcTipoBosque(TcTipoBosque value) {
        this.tcTipoBosque = value;
    }

    /**
     * Gets the value of the anio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnio() {
        return anio;
    }

    /**
     * Sets the value of the anio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnio(BigInteger value) {
        this.anio = value;
    }

    /**
     * Gets the value of the ttProteccionGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtProteccionGestion }
     *     
     */
    public TtProteccionGestion getTtProteccionGestion() {
        return ttProteccionGestion;
    }

    /**
     * Sets the value of the ttProteccionGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtProteccionGestion }
     *     
     */
    public void setTtProteccionGestion(TtProteccionGestion value) {
        this.ttProteccionGestion = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumero(BigInteger value) {
        this.numero = value;
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
     * Gets the value of the anexo property.
     * 
     * @return
     *     possible object is
     *     {@link Anexo }
     *     
     */
    public Anexo getAnexo() {
        return anexo;
    }

    /**
     * Sets the value of the anexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anexo }
     *     
     */
    public void setAnexo(Anexo value) {
        this.anexo = value;
    }

    /**
     * Gets the value of the ttBiofisicaGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtBiofisicaGestion }
     *     
     */
    public TtBiofisicaGestion getTtBiofisicaGestion() {
        return ttBiofisicaGestion;
    }

    /**
     * Sets the value of the ttBiofisicaGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtBiofisicaGestion }
     *     
     */
    public void setTtBiofisicaGestion(TtBiofisicaGestion value) {
        this.ttBiofisicaGestion = value;
    }

    /**
     * Gets the value of the tcPlanTipoGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TcPlanTipoGestion }
     *     
     */
    public TcPlanTipoGestion getTcPlanTipoGestion() {
        return tcPlanTipoGestion;
    }

    /**
     * Sets the value of the tcPlanTipoGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcPlanTipoGestion }
     *     
     */
    public void setTcPlanTipoGestion(TcPlanTipoGestion value) {
        this.tcPlanTipoGestion = value;
    }

    /**
     * Gets the value of the rodal property.
     * 
     * @return
     *     possible object is
     *     {@link Rodal }
     *     
     */
    public Rodal getRodal() {
        return rodal;
    }

    /**
     * Sets the value of the rodal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rodal }
     *     
     */
    public void setRodal(Rodal value) {
        this.rodal = value;
    }

    /**
     * Gets the value of the ttRepoblacionGestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtRepoblacionGestion() {
        return ttRepoblacionGestion;
    }

    /**
     * Sets the value of the ttRepoblacionGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtRepoblacionGestion(String value) {
        this.ttRepoblacionGestion = value;
    }

    /**
     * Gets the value of the representantes property.
     * 
     * @return
     *     possible object is
     *     {@link Representantes }
     *     
     */
    public Representantes getRepresentantes() {
        return representantes;
    }

    /**
     * Sets the value of the representantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Representantes }
     *     
     */
    public void setRepresentantes(Representantes value) {
        this.representantes = value;
    }

    /**
     * Gets the value of the tieneRepresentante property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTieneRepresentante() {
        return tieneRepresentante;
    }

    /**
     * Sets the value of the tieneRepresentante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTieneRepresentante(BigInteger value) {
        this.tieneRepresentante = value;
    }

    /**
     * Gets the value of the cronograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCronograma() {
        return cronograma;
    }

    /**
     * Sets the value of the cronograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCronograma(String value) {
        this.cronograma = value;
    }

    /**
     * Gets the value of the ultimoPanel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUltimoPanel() {
        return ultimoPanel;
    }

    /**
     * Sets the value of the ultimoPanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUltimoPanel(BigInteger value) {
        this.ultimoPanel = value;
    }

    /**
     * Gets the value of the gestionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGestionId() {
        return gestionId;
    }

    /**
     * Sets the value of the gestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGestionId(BigInteger value) {
        this.gestionId = value;
    }

    /**
     * Gets the value of the fincas property.
     * 
     * @return
     *     possible object is
     *     {@link Fincas }
     *     
     */
    public Fincas getFincas() {
        return fincas;
    }

    /**
     * Sets the value of the fincas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fincas }
     *     
     */
    public void setFincas(Fincas value) {
        this.fincas = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the rodalesRepoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link RodalesRepoblacion }
     *     
     */
    public RodalesRepoblacion getRodalesRepoblacion() {
        return rodalesRepoblacion;
    }

    /**
     * Sets the value of the rodalesRepoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodalesRepoblacion }
     *     
     */
    public void setRodalesRepoblacion(RodalesRepoblacion value) {
        this.rodalesRepoblacion = value;
    }

    /**
     * Gets the value of the sistemaRepoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link SistemaRepoblacion }
     *     
     */
    public SistemaRepoblacion getSistemaRepoblacion() {
        return sistemaRepoblacion;
    }

    /**
     * Sets the value of the sistemaRepoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaRepoblacion }
     *     
     */
    public void setSistemaRepoblacion(SistemaRepoblacion value) {
        this.sistemaRepoblacion = value;
    }

    /**
     * Gets the value of the tcElaborador property.
     * 
     * @return
     *     possible object is
     *     {@link TcElaborador }
     *     
     */
    public TcElaborador getTcElaborador() {
        return tcElaborador;
    }

    /**
     * Sets the value of the tcElaborador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcElaborador }
     *     
     */
    public void setTcElaborador(TcElaborador value) {
        this.tcElaborador = value;
    }

    /**
     * Gets the value of the observacionesCronograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesCronograma() {
        return observacionesCronograma;
    }

    /**
     * Sets the value of the observacionesCronograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesCronograma(String value) {
        this.observacionesCronograma = value;
    }

    /**
     * Gets the value of the ttDivisionAreaGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtDivisionAreaGestion }
     *     
     */
    public TtDivisionAreaGestion getTtDivisionAreaGestion() {
        return ttDivisionAreaGestion;
    }

    /**
     * Sets the value of the ttDivisionAreaGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtDivisionAreaGestion }
     *     
     */
    public void setTtDivisionAreaGestion(TtDivisionAreaGestion value) {
        this.ttDivisionAreaGestion = value;
    }

    /**
     * Gets the value of the expedienteVacId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpedienteVacId() {
        return expedienteVacId;
    }

    /**
     * Sets the value of the expedienteVacId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpedienteVacId(String value) {
        this.expedienteVacId = value;
    }

    /**
     * Gets the value of the fechaCierre property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Sets the value of the fechaCierre property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCierre(XMLGregorianCalendar value) {
        this.fechaCierre = value;
    }

    /**
     * Gets the value of the ttTipoPropietarioGestion property.
     * 
     * @return
     *     possible object is
     *     {@link TtTipoPropietarioGestion }
     *     
     */
    public TtTipoPropietarioGestion getTtTipoPropietarioGestion() {
        return ttTipoPropietarioGestion;
    }

    /**
     * Sets the value of the ttTipoPropietarioGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtTipoPropietarioGestion }
     *     
     */
    public void setTtTipoPropietarioGestion(TtTipoPropietarioGestion value) {
        this.ttTipoPropietarioGestion = value;
    }

    /**
     * Gets the value of the personaAnulaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonaAnulaId() {
        return personaAnulaId;
    }

    /**
     * Sets the value of the personaAnulaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonaAnulaId(BigInteger value) {
        this.personaAnulaId = value;
    }

    /**
     * Gets the value of the informes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformes() {
        return informes;
    }

    /**
     * Sets the value of the informes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformes(String value) {
        this.informes = value;
    }

}
