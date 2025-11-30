/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

/**
 *
 * @author csandoval
 */

import MANEJADORES.MHHome;
import estructuras.RespuestaInsert;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.model.file.UploadedFiles;



@Named(value = "fileUploadView" )
@RequestScoped
public class FileUploadView {
    
    private UploadedFile file;
    private UploadedFiles files;
    private String dropZoneText = "Drop zone p:inputTextarea demo.";
    
   
    @Inject
    private MHHome home;

    
     public void upload() {
        if (file != null) {
            System.out.println("carga de archivo ");
            FacesMessage message = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
     
    public void handleFileUpload(FileUploadEvent event) {
        System.out.println("aqui carga ::::: "+ event.getFile().getFileName() + " is uploaded.");
        Integer gestion_id = (Integer) event.getComponent().getAttributes().get("gestion_id");
        System.out.println("gestion_id :"+gestion_id);
        String json = LeerArchivoExcel.handleFileUpload(event);
        
        String sql = UTILIDADES.SQL.insertaPuntosFinca(gestion_id,"","",json);        
        System.out.println("sql geolocalizacion :"+sql);
        RespuestaInsert inserta = (RespuestaInsert)   home.getApi().repuestaApi(new RespuestaInsert(), "JSON", sql);                
        if(inserta.fila_afectada>0){
             FacesMessage message = new FacesMessage("Satisfactorio", event.getFile().getFileName() + " es subido el archivo.");
             FacesContext.getCurrentInstance().addMessage(null, message);
             
        }
       
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedFiles getFiles() {
        return files;
    }

    public void setFiles(UploadedFiles files) {
        this.files = files;
    }

    
    
    
}
