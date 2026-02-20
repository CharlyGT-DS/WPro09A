//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.01.30 a las 01:25:47 PM CST 
//


package lire022;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.modelo.LI_RE_022 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.modelo.LI_RE_022
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
     * Create an instance of {@link DocumentoInab.CedulaNotificacion }
     * 
     */
    public DocumentoInab.CedulaNotificacion createDocumentoInabCedulaNotificacion() {
        return new DocumentoInab.CedulaNotificacion();
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
     * Create an instance of {@link DocumentoInab.CedulaNotificacion.Contenido }
     * 
     */
    public DocumentoInab.CedulaNotificacion.Contenido createDocumentoInabCedulaNotificacionContenido() {
        return new DocumentoInab.CedulaNotificacion.Contenido();
    }

    /**
     * Create an instance of {@link DocumentoInab.CedulaNotificacion.Firma }
     * 
     */
    public DocumentoInab.CedulaNotificacion.Firma createDocumentoInabCedulaNotificacionFirma() {
        return new DocumentoInab.CedulaNotificacion.Firma();
    }

}
