
package lire079;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lire079 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lire079
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
     * Create an instance of {@link DocumentoInab.NotificacionRequisitos }
     * 
     */
    public DocumentoInab.NotificacionRequisitos createDocumentoInabNotificacionRequisitos() {
        return new DocumentoInab.NotificacionRequisitos();
    }

    /**
     * Create an instance of {@link DocumentoInab.NotificacionRequisitos.Items }
     * 
     */
    public DocumentoInab.NotificacionRequisitos.Items createDocumentoInabNotificacionRequisitosItems() {
        return new DocumentoInab.NotificacionRequisitos.Items();
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
     * Create an instance of {@link DocumentoInab.NotificacionRequisitos.Contenido }
     * 
     */
    public DocumentoInab.NotificacionRequisitos.Contenido createDocumentoInabNotificacionRequisitosContenido() {
        return new DocumentoInab.NotificacionRequisitos.Contenido();
    }

    /**
     * Create an instance of {@link DocumentoInab.NotificacionRequisitos.Firma }
     * 
     */
    public DocumentoInab.NotificacionRequisitos.Firma createDocumentoInabNotificacionRequisitosFirma() {
        return new DocumentoInab.NotificacionRequisitos.Firma();
    }

    /**
     * Create an instance of {@link DocumentoInab.NotificacionRequisitos.Items.Item }
     * 
     */
    public DocumentoInab.NotificacionRequisitos.Items.Item createDocumentoInabNotificacionRequisitosItemsItem() {
        return new DocumentoInab.NotificacionRequisitos.Items.Item();
    }

}
