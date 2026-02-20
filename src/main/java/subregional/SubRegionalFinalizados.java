/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subregional;

import secretaria.*;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import estructuras.HISTORICO.DocumentoInab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBException;
import redis.clients.jedis.Jedis;
import solicitante.FinalizadosSolicitante;

/**
 *
 * @author csandoval
 */


@Named (value = "subRegionalFinalizados")
@ViewScoped
public class SubRegionalFinalizados implements Serializable{
    
    
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    @Inject
    private MHHome mhome;
   
    private List<estructuras.HISTORICO.DocumentoInab> lista = new ArrayList<>();
    
    private transient estructuras.HISTORICO.DocumentoInab seleccionado = new DocumentoInab();

    public List<DocumentoInab> getLista() {
        return lista;
    }

    public void setLista(List<DocumentoInab> lista) {
        this.lista = lista;
    }

    public DocumentoInab getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(DocumentoInab seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
     public void llamarVistaEditar(){
        System.out.println("expediente: "+this.seleccionado.getActual().getExpediente());
                
        
        if(this.seleccionado.getActual().getExpediente().length()>0){
            this.mhome.getPer().setDocumentoInab(this.seleccionado);
            this.mhome.getApi().llamaCualquierPagina("/WPro09/secretaria/li-re-079-editar.xhtml");
        }
        
       
    }
    
    
     public void cargarDatos(){
        
       Jedis JD =  cargaDoc.obtieneRedis();
       String llave = "EXP-ACTU-F-"+this.mhome.getPer().getTcUsuario().getUsuarioId();
       
       long l = JD.llen(llave);
       List<String> s = JD.lrange(llave, 0, l);
       this.lista.clear();
       for (String t : s){
           try {
               estructuras.HISTORICO.DocumentoInab act = new DocumentoInab();
               
               act = UTILIDADES.FuncionesComunes.fromXml(t,  estructuras.HISTORICO.DocumentoInab.class);                      
               this.lista.add(act);
           } catch (JAXBException ex) {
               Logger.getLogger(FinalizadosSolicitante.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       JD.close();
       JD=null;
        
    }
    
    
    
    
}
