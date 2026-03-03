
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import estructuras.HISTORICO.DocumentoInab;
import estructuras.HISTORICO.DocumentoInab.Actual;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBException;
import redis.clients.jedis.Jedis;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author csandoval
 */
@Named("mover")
@ViewScoped
public class Mover implements Serializable{

    private DocumentoInab tareaActual = new DocumentoInab();
    
    @Inject
    private MHHome mhome;
    
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    private int idUsuarioHistorico;

    public DocumentoInab getTareaActual() {
        return tareaActual;
    }

    public void setTareaActual(DocumentoInab tareaActual) {
        this.tareaActual = tareaActual;
    }

    
    
    private int idUsuarioSiguiente;
    
    private int idUsuarioActual;

    public int getIdUsuarioSiguiente() {
        return idUsuarioSiguiente;
    }

    public void setIdUsuarioSiguiente(int idUsuarioSiguiente) {
        this.idUsuarioSiguiente = idUsuarioSiguiente;
    }

    public int getIdUsuarioActual() {
        return idUsuarioActual;
    }

    public void setIdUsuarioActual(int idUsuarioActual) {
        this.idUsuarioActual = idUsuarioActual;
    }

    public int getIdUsuarioHistorico() {
        return idUsuarioHistorico;
    }

    public void setIdUsuarioHistorico(int idUsuarioHistorico) {
        this.idUsuarioHistorico = idUsuarioHistorico;
    }
    
    
    
    
    public void mover(){
        Jedis JD =  cargaDoc.obtieneRedis();
        DocumentoInab.Actual act = new Actual();
        
        act.setDescripcion("SE creo una solcitud");
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
        act.setPersonalizado("c:/pdf/plan.pdf");
        act.setIdUsuarioActual(1239);// usario solicitante elaborador     
       
        
        String llave ="EXP-ACTU-"+this.idUsuarioActual;
        
        List<String> lista = JD.lrange(llave,0,-1);
        String xml="";
        DocumentoInab dat = new DocumentoInab();
        for(String s : lista){
            
            try {
                DocumentoInab temp = UTILIDADES.FuncionesComunes.fromXml(s,DocumentoInab.class);
                
                if(temp.getActual().getIdUsuarioHistorico()==this.idUsuarioHistorico){
                    dat = temp;
                }} catch (JAXBException ex) {
                Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
        
        
 
        // 306 es la secretaria
        this.tareaActual = this.mhome.getApi().moverTarea(dat,dat.getActual(), this.idUsuarioSiguiente);
        
        System.out.println("El id anterio :"+tareaActual.getActual().getIdUsuarioAnterior());
        System.out.println("El id actual  :"+tareaActual.getActual().getIdUsuarioActual());
        
           FacesContext.getCurrentInstance().
                addMessage("Exito",this.mhome.getApi().creaMensajeError("anterior: "+tareaActual.getActual().getIdUsuarioAnterior()+" actual "+tareaActual.getActual().getIdUsuarioActual()));
                    

        
    }
    
    

    
}
