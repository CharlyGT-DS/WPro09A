package solicitante;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Named("anexos")
public class Anexos implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<DocumentoSolicitante> documentos;
    private DocumentoSolicitante documentoSeleccionado;
    private DocumentoSolicitante documentoParaPrevisualizar;

    @PostConstruct
    public void init() {
        documentos = new ArrayList<>();
        documentos.add(new DocumentoSolicitante("Documento 1"));
        documentos.add(new DocumentoSolicitante("Documento 2"));
    }

    public void subirArchivo(FileUploadEvent event) {

        if (documentoSeleccionado == null) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Advertencia", "No se ha seleccionado un documento"));
            return;
        }

        try {
            documentoSeleccionado.setArchivo(event.getFile().getContent());
            documentoSeleccionado.setNombreArchivo(event.getFile().getFileName());
            documentoSeleccionado.setTipoArchivo(event.getFile().getContentType());

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Éxito", "Archivo subido correctamente"));

            PrimeFaces.current().executeScript("PF('dlgUpload').hide()");

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Error", "No se pudo subir el archivo"));
            e.printStackTrace();
        }
    }

    public void previsualizarArchivo(ActionEvent event) {
        documentoParaPrevisualizar = (DocumentoSolicitante) event.getComponent().getAttributes().get("doc");

        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getSessionMap()
                .put("anexos", this);

        PrimeFaces.current().executeScript("PF('dlgPreview').show()");
    }

    /* PREPARAR DIALOG DE SUBIDA */
    public void prepararDialog(ActionEvent event) {

        documentoSeleccionado
                = (DocumentoSolicitante) event.getComponent()
                        .getAttributes()
                        .get("doc");

        PrimeFaces.current().ajax().update("frmAnexos:dlgUpload");
        PrimeFaces.current().executeScript("PF('dlgUpload').show()");
    }

    public boolean tieneArchivo(DocumentoSolicitante doc) {
        return doc != null
                && doc.getArchivo() != null
                && doc.getArchivo().length > 0;
    }

    public boolean esImagen() {
        return documentoParaPrevisualizar != null
                && documentoParaPrevisualizar.getTipoArchivo() != null
                && documentoParaPrevisualizar.getTipoArchivo().startsWith("image/");
    }

    public boolean esPDF() {
        return documentoParaPrevisualizar != null
                && documentoParaPrevisualizar.getTipoArchivo() != null
                && "application/pdf".equals(documentoParaPrevisualizar.getTipoArchivo());
    }

    public List<DocumentoSolicitante> getDocumentos() {
        return documentos;
    }

    public DocumentoSolicitante getDocumentoSeleccionado() {
        return documentoSeleccionado;
    }

    public DocumentoSolicitante getDocumentoParaPrevisualizar() {
        return documentoParaPrevisualizar;
    }

    public void setDocumentoParaPrevisualizar(DocumentoSolicitante documentoParaPrevisualizar) {
        this.documentoParaPrevisualizar = documentoParaPrevisualizar;
    }
}
