


import MANEJADORES.MHHome;
import estructuras.HISTORICO.DocumentoInab;
import java.io.Serializable;
import java.util.Date;
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
        
       
        
        
        //act = UTILIDADES.FuncionesComunes.fromXml(this.xmlActual,  estructuras.HISTORICO.DocumentoInab.Actual.class);
        act = new DocumentoInab.Actual();
        act.setDescripcion("SE creo una solcitud ******");
        act.setUrlDocumento("c:/pdf/solicitud.pdf");
        act.setEsquema("LI-RE-042");
        act.setProceso("LI-PR-009");
        act.setEstado(1);
        act.setGestionId(2193);
        act.setPasoSiguiente("PASO-2");
        act.setPaso("PASO-1");
        act.setExpediente("21-1603-41-1.1.1-2024");
        act.setLicencia("21-1603-41-1.1.1-2024-1");
        act.setFecha(UTILIDADES.FuncionesComunes.toXMLGregorianCalendar(new Date()));
        act.setPersonalizado("c:/pdf/plan.xml");
        act.setIdUsuarioActual(Integer.parseInt(this.idUsuarioActual));// usario solicitante elaborador
        //graba en la cola del usuario actual por su id
        mhome.getApi().grabaHistorico(act);
        FacesContext.getCurrentInstance().
                addMessage(null,this.mhome.getApi().creaMensajeError("Se creo la tarea con el usuario id: "+this.idUsuarioActual));
        
        
    }
    
    
    
    
    
}