/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author WINDOWS
 */

@ViewScoped
@Named("anexos")
public class Anexos implements Serializable {

    private List<DocumentoSolicitante> documentos;
    private DocumentoSolicitante documentoSeleccionado;

    @PostConstruct
    public void init() {
        documentos = new ArrayList<>();
        documentos.add(new DocumentoSolicitante("Documento 1"));
        documentos.add(new DocumentoSolicitante("Documento 2"));
    }

    public void seleccionarDocumento(ActionEvent event) {
        documentoSeleccionado = (DocumentoSolicitante)
                event.getComponent().getAttributes().get("doc");
    }

    public void subirArchivo(FileUploadEvent event) {
        if (documentoSeleccionado == null) {
            return;
        }

        documentoSeleccionado.setArchivo(event.getFile().getContent());
        documentoSeleccionado.setNombreArchivo(event.getFile().getFileName());
    }

    public void verArchivo(DocumentoSolicitante doc) {
        // lógica para ver o descargar
    }
    
    public void prepararDialog(ActionEvent event) {
    documentoSeleccionado = (DocumentoSolicitante)
            event.getComponent().getAttributes().get("doc");

    PrimeFaces.current().ajax().update("frmAnexos:dlgUpload");
    PrimeFaces.current().executeScript("PF('dlgUpload').show()");
}

    // getters / setters
    public List<DocumentoSolicitante> getDocumentos() {
        return documentos;
    }

    public DocumentoSolicitante getDocumentoSeleccionado() {
        return documentoSeleccionado;
    }
}