
package estructuras.HISTORICO;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the estructuras.HISTORICA package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: estructuras.HISTORICA
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
     * Create an instance of {@link DocumentoInab.Historico }
     * 
     */
    public DocumentoInab.Historico createDocumentoInabHistorico() {
        return new DocumentoInab.Historico();
    }

    /**
     * Create an instance of {@link DocumentoInab.Historico.Items }
     * 
     */
    public DocumentoInab.Historico.Items createDocumentoInabHistoricoItems() {
        return new DocumentoInab.Historico.Items();
    }

    /**
     * Create an instance of {@link DocumentoInab.Actual }
     * 
     */
    public DocumentoInab.Actual createDocumentoInabActual() {
        return new DocumentoInab.Actual();
    }

    /**
     * Create an instance of {@link DocumentoInab.Historico.Items.Item }
     * 
     */
    public DocumentoInab.Historico.Items.Item createDocumentoInabHistoricoItemsItem() {
        return new DocumentoInab.Historico.Items.Item();
    }

}
