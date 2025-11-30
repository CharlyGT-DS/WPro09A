/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secretaria;

import HILOS.Historico;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import UTILIDADES.FacadeData;
import estructuras.GEnericaCincoCampos;
import estructuras.PefilInab;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBException;
import lire079.DocumentoInab;
import org.primefaces.PrimeFaces;


/**
 *
 * @author csandoval
 */

@Named (value = "LIRE079")
@ViewScoped
public class LIRE079 implements Serializable{
    
    @Inject
    private MHHome mhome;
     
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
    
    @EJB
    private PERFIL.FuncionesRedisLocal fred; 
    
    private boolean bot=false;
    
    private String fechaFormateada="";
    private Date hoy = new Date();
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private List<LIRE079.Elemento> documentos = new ArrayList<>();
    private lire042.DocumentoInab doc042 = new lire042.DocumentoInab();   
    private lire079.DocumentoInab doc079 = new DocumentoInab();
    private Set<String> unicos;
    private boolean bot1=false;
    private boolean bot2=true;
    private String rutaNombre="";

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }
    
    

    public boolean isBot1() {
        return bot1;
    }

    public void setBot1(boolean bot1) {
        this.bot1 = bot1;
    }

    public boolean isBot2() {
        return bot2;
    }

    public void setBot2(boolean bot2) {
        this.bot2 = bot2;
    }

    
    private String[] docuSelect;

    public String getFechaFormateada() {
        return fechaFormateada;
    }

    public void setFechaFormateada(String fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
    }

    public DocumentoInab getDoc079() {
        return doc079;
    }

    public void setDoc079(DocumentoInab doc079) {
        this.doc079 = doc079;
    }

    public lire042.DocumentoInab getDoc042() {
        return doc042;
    }

    public void setDoc042(lire042.DocumentoInab doc042) {
        this.doc042 = doc042;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public List<LIRE079.Elemento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<LIRE079.Elemento> documentos) {
        this.documentos = documentos;
    }
    
    public void activarBoton(){
        
        this.bot1=true;
        this.bot2=false;  
       
    }
      
     public void desactivaAmbosBotones(){
        this.bot1=true;
        this.bot2=true;   
        
            PrimeFaces.current().executeScript(
            "Swal.fire({" +
                "title: 'Se envio el expediente al Director Subregional'," +
                "text: 'Serás redirigido al inicio'," +
                "icon: 'warning'," +
                "showCancelButton: true," +
                "confirmButtonText: 'Ir ahora'," +
               
            "}).then((result) => {" +
                "if (result.isConfirmed) {" +
                    "window.location.href = '/WPro09/pages/inicio.xhtml?ra=" +mhome.getPer().getTcUsuario().getUsuarioId() +"&rx=a; "+
                "}" +
            "});"
        );
        
        
       this.mhome.getApi().llamaCualquierPagina("/WPro09/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
    }
    
    
     public void llamar(){
        try {
            
            // quita los valores no seleccionados osea los no presentados
            this.docuSelect = this.mhome.getPer().getDoc080().split(",");
            this.documentos.clear();
          
            for(int c=0; c < this.docuSelect.length; c++){
                Elemento ele = new Elemento();
                ele.setValor(this.docuSelect[c]);
                this.documentos.add(ele);
            }
            PrimeFaces.current().ajax().update(":form:res");
            
            
            
            
            
            this.fechaFormateada = formato.format(hoy);
            // consulta la subregion por el número de gestion
            String sql = UTILIDADES.SQL.consultaSubregionPorGestionID(String.valueOf(this.mhome.getPer().getDocumentoInab().getActual().getGestionId()));
            Future<GEnericaCincoCampos> cin = fred.registraDatos(sql);
            GEnericaCincoCampos cinco = cin.get();
            this.mhome.getPer().setCincoCampos(cinco);
            
            // carga director subregional en datos maestros
            Future<estructuras.PefilInab> pefil = fred.buscaSubREgional(this.mhome.getPer(), cinco.getDato1().toString().replaceAll(".0",""));
            PefilInab pt = pefil.get();
            this.mhome.setPer(pt);
            
            // carga datos de usuario por subregion
            Future<estructuras.PefilInab> pefi2 = fred.buscarUsuarioSubRegion(String.valueOf(pt.getListSubRegional().get(0).getUsuarioId()), pt);
            PefilInab pt2 = pefil.get();
            this.mhome.setPer(pt2);
                
            //busca usuario
            Future<estructuras.PefilInab> tper6 = fred.buscaUsuario(String.valueOf(pt2.getListSubRegional().get(0).getUsuarioId()), pt2);
            PefilInab pt3 = tper6.get();
            this.mhome.setPer(pt3);
            
            
            String[] n=this.mhome.getPer().getDocumentoInab().getActual().getUrlDocumento().split("/");
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.mhome.getPer().getDocumentoInab().getActual().getExpediente(), n[8].replaceAll(".pdf",".xml"));
            System.out.println("consulta existDB: "+xq);
            // obtiene documento xml de produccion de la solcitud
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.mhome.getPer().getDocumentoInab().getActual().getExpediente(), n[8].replaceAll(".pdf",".xml"));
            System.out.println("xml almacenado :"+xml);
            this.doc042 = UTILIDADES.FuncionesComunes.fromXml(xml,lire042.DocumentoInab.class);
            
           
         
              
            
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE079.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE079.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE079.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
     }
     
     public void generarDocumento079(){
         
        try {
           System.out.println("llego al 079");
            // creadocumento 079
            this.doc079 = FacadeData.crea079(this.doc042, this.documentos, this.mhome.getPer());
            System.out.println("data :"+doc079.getLicencia());   
            
            // genera xml para vista previa
            String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(this.doc079);
            
            // graba el xml
            Future<String> gxml = cargaDoc.grabaXML079(xml, this.doc079);            
            String r = gxml.get();
            
             // setea nombres
            this.rutaNombre= doc079.getNotificacionRequisitos().getVisor().getVista().getRutaPdf();
            String nombrePDF = doc079.getNotificacionRequisitos().getVisor().getVista().getUrlDocumento().replace(".xml",".pdf");
            
            // crea documento en vista preiva en formato pdf
            Future<String> gs = cargaDoc.generarReporte(doc079.getNotificacionRequisitos().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), doc079.getExpediente(),xml,"079",doc079.getLicencia());             
            String sp = gs.get();
            System.out.println(sp);    
            
            
            
            PrimeFaces.current().executeInitScript("PF('productDialog').show();");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE079.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE079.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
         
         
         
     }
     
     public void generarDocumento079Final(){
         
         
            try {
            // nombre de archivo temporal
            String n = this.doc079.getNotificacionRequisitos().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.doc079.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.doc079.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            lire079.DocumentoInab temp=  UTILIDADES.FuncionesComunes.fromXml(xml, lire079.DocumentoInab.class);
            // cambia a finalizado el estado del xml
            temp.setEstado("Finalizado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML79(mhome.getPer(),"PRO09","P2","079", temp);
            // obtiene el xml final
            String valor = xmlfin.get();      
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML079(valor, temp);
            // obteine respuesta
            String r = gxml.get();
            // desaciva boton generar documento
            this.bot2=true; 
            
             // regstra en el historico en segundo plano
             Historico hiloHistorico = new Historico();
             hiloHistorico.setPer(this.mhome.getPer());
             hiloHistorico.setDocumentoRegistrar(temp); // registra documento 080 con estado finalizado
             hiloHistorico.setJD(cargaDoc.obtieneRedis());             
             hiloHistorico.start();// dispara en segundo plano registra historico para finalizados
             
             this.rutaNombre= temp.getNotificacionRequisitos().getVisor().getVista().getRutaPdf();
            
            // crea documento en vista preiva en formato pdf
            Future<String> gs = cargaDoc.generarReporte(temp.getNotificacionRequisitos().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), temp.getExpediente(),valor,"079",temp.getLicencia());             
            String sp = gs.get();
            System.out.println(sp);      
            
            String sql = UTILIDADES.SQL.consultaSolicitanteporIdGestionyPaso(temp.getIdGestion(), 1);
            GEnericaCincoCampos cinco = (GEnericaCincoCampos) this.mhome.getApi().repuestaApi(new GEnericaCincoCampos(),"JSON", sql);
            
            
           //TRAZLADA expediente al  solicitante
             cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()),Integer.parseInt(cinco.getDato2().toString().replaceAll(".0","")),3,3);
                  
             
            
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
     }
     
     
     
      //Clase auxiliar para representar un elemento
    public static class Elemento implements Serializable{
        private String valor;

        public Elemento(){
            
        }
        
        public Elemento(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }
    
   
    
    
}
