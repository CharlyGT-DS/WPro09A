
package lire042;

import javax.xml.bind.annotation.XmlRegistry;
import lire042.DocumentoInab;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lire048 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lire048
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoInab }
     * 
     */
    public DocumentoInab createDocumentoInab() {
        return new DocumentoInab();
    }

    /**
     * Create an instance of {@link Asociados }
     * 
     */
    public Asociados createAsociados() {
        return new Asociados();
    }

    /**
     * Create an instance of {@link Asociados.Firmantes }
     * 
     */
    public Asociados.Firmantes createAsociadosFirmantes() {
        return new Asociados.Firmantes();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion }
     * 
     */
    public DocumentoInab.SolicitudActualizacion createDocumentoInabSolicitudActualizacion() {
        return new DocumentoInab.SolicitudActualizacion();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion.Contenido }
     * 
     */
    public DocumentoInab.SolicitudActualizacion.Contenido createDocumentoInabSolicitudActualizacionContenido() {
        return new DocumentoInab.SolicitudActualizacion.Contenido();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones }
     * 
     */
    public DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones createDocumentoInabSolicitudActualizacionContenidoModificaciones() {
        return new DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones();
    }

    /**
     * Create an instance of {@link ContenedorSvg }
     * 
     */
    public ContenedorSvg createContenedorSvg() {
        return new ContenedorSvg();
    }

    /**
     * Create an instance of {@link Asociados.Vista }
     * 
     */
    public Asociados.Vista createAsociadosVista() {
        return new Asociados.Vista();
    }

    /**
     * Create an instance of {@link Asociados.Firmantes.Firma }
     * 
     */
    public Asociados.Firmantes.Firma createAsociadosFirmantesFirma() {
        return new Asociados.Firmantes.Firma();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion.General }
     * 
     */
    public DocumentoInab.SolicitudActualizacion.General createDocumentoInabSolicitudActualizacionGeneral() {
        return new DocumentoInab.SolicitudActualizacion.General();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion.Firma }
     * 
     */
    public DocumentoInab.SolicitudActualizacion.Firma createDocumentoInabSolicitudActualizacionFirma() {
        return new DocumentoInab.SolicitudActualizacion.Firma();
    }

    /**
     * Create an instance of {@link DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle }
     * 
     */
    public DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle createDocumentoInabSolicitudActualizacionContenidoModificacionesDetalle() {
        return new DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle();
    }

}
