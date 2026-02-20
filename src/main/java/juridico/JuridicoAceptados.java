/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juridico;

import secretaria.*;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import estructuras.GEnericaCincoCampos;
import estructuras.HISTORICO.DocumentoInab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBException;
import org.primefaces.PrimeFaces;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */

@Named (value = "juridicoAceptados")
@ViewScoped
public class JuridicoAceptados implements Serializable{
    
    @Inject
    private MHHome mhome;
     
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
     @EJB
    private PERFIL.FuncionesRedisLocal fred; 
    
    private List<estructuras.HISTORICO.DocumentoInab> listaAceptada = new ArrayList<>();
    
    private transient estructuras.HISTORICO.DocumentoInab seleccionadoAceptada = new DocumentoInab();

    public List<DocumentoInab> getListaAceptada() {
        return listaAceptada;
    }

    public void setListaAceptada(List<DocumentoInab> listaAceptada) {
        this.listaAceptada = listaAceptada;
    }

    public DocumentoInab getSeleccionadoAceptada() {
        return seleccionadoAceptada;
    }

    public void setSeleccionadoAceptada(DocumentoInab seleccionadoAceptada) {
        this.seleccionadoAceptada = seleccionadoAceptada;
    }

    
    
    private String tx="";

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }
    
    public void cargarDatos(){
        
       Jedis JD =  cargaDoc.obtieneRedis();
       String llave = "EXP-ACTU-A-"+this.mhome.getPer().getTcUsuario().getUsuarioId();
       System.out.println("data "+llave);
       long l = JD.llen(llave);
       System.out.println("total :"+l);
       List<String> s = JD.lrange(llave, 0, l);
       this.listaAceptada.clear();
       for (String t : s){
           try {
               estructuras.HISTORICO.DocumentoInab act = new DocumentoInab();
               
               act = UTILIDADES.FuncionesComunes.fromXml(t,  estructuras.HISTORICO.DocumentoInab.class);
               act.getActual().setTipoAccion("Aceptado");
               this.listaAceptada.add(act);
           } catch (JAXBException ex) {
               Logger.getLogger(SecretariaEntrada.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       JD.close();
       JD=null;
        
    }
    
    
    public void ira080(){
        
        this.mhome.getPer().setDocumentoInab(this.seleccionadoAceptada);
        
        this.mhome.getApi().llamaCualquierPagina("/WPro09/secretaria/li-re-080.xhtml");
    }
    
    public void trazlado(){
             
        try {
            String sql = UTILIDADES.SQL.consultaSubregionPorGestionID(String.valueOf(this.seleccionadoAceptada.getHistorico().getItems().getItem().get(0).getGestionId()));
            Future<GEnericaCincoCampos> cin = fred.registraDatos(sql);
            GEnericaCincoCampos cinco = cin.get();
            
            Future<estructuras.PefilInab> tper4 =   fred.buscaSubREgional(this.mhome.getPer(),cinco.getDato1().toString());
            this.mhome.setPer(tper4.get());
            
            
            int idUsuarioSiguiente = this.mhome.getPer().getListSubRegional().get(0).getUsuarioId();
            System.out.println("id_usuario subregional  (DESTINO):"+idUsuarioSiguiente);
            System.out.println("id_usuario SECRETARIA  (ORIGEN):"+this.mhome.getPer().getTcUsuario().getUsuarioId().toString());
            
            this.cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()), idUsuarioSiguiente,5,3);
            
            this.listaAceptada.remove(this.seleccionadoAceptada);
            
            
            PrimeFaces.current().executeScript(
                    "Swal.fire({" +
                            "title: 'Se trazlado al Director(a) Subregional'," +
                            "text: 'Serás redirigido al inicio'," +
                            "icon: 'warning'," +
                            "showCancelButton: true," +
                            "confirmButtonText: 'Ir ahora'," +
                            "cancelButtonText: 'Cancelar'" +
                            "}).then((result) => {" +
                            "if (result.isConfirmed) {" +
                            "window.location.href = '/WPro09/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';" +
                                    "}" +
                                    "});"
            );
        } catch (InterruptedException ex) {
            Logger.getLogger(JuridicoAceptados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(JuridicoAceptados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }// fin del metodo de trazlado
    
    
    
    
    
}
