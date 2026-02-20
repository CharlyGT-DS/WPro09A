
import MANEJADORES.MHHome;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author csandoval
 */
@Named(value = "insertar")
@ViewScoped
public class Insertar implements Serializable{
    
    private String idUsuarioActual;
    private String idUsuarioSiguiente;
    private String proceso;
    private String paso;
    private String xmlActual;
    
    @Inject
    private MHHome mhome;

    public String getIdUsuarioActual() {
        return idUsuarioActual;
    }

    public void setIdUsuarioActual(String idUsuarioActual) {
        this.idUsuarioActual = idUsuarioActual;
    }

    public String getIdUsuarioSiguiente() {
        return idUsuarioSiguiente;
    }

    public void setIdUsuarioSiguiente(String idUsuarioSiguiente) {
        this.idUsuarioSiguiente = idUsuarioSiguiente;
    }

    

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }

    public String getXmlActual() {
        return xmlActual;
    }

    public void setXmlActual(String xmlActual) {
        this.xmlActual = xmlActual;
    }
    
    public void grabar(){
        
        estructuras.HISTORICO.DocumentoInab.Actual act;
        try {
            act = UTILIDADES.FuncionesComunes.fromXml(this.xmlActual,  estructuras.HISTORICO.DocumentoInab.Actual.class);
            //graba en la cola del usuario actual por su id
            mhome.getApi().grabaHistorico(act);
            
          FacesContext.getCurrentInstance().
                addMessage(null,this.mhome.getApi().creaMensajeError("Se creo la tarea con el usuario id: "+this.idUsuarioActual));
                    

        } catch (JAXBException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
}
