/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;


import HILOS.Historico;
import HILOS.TransformarPlan;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import PERFIL.EJBGestionREDLocal;
import com.google.gson.Gson;
import estructuras.GEnericaCincoCampos;
import inab.pro.wpro09.resources.VerificaUsuario;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import lire042.DocumentoInab;
import org.primefaces.PF;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
@Named (value = "lire042")
@ViewScoped
public class LIRE042 implements Serializable{
    
    
    @Inject
    private MHHome mhome;
     
    @Inject
    private CargaDocumentosLocal cargaDoc;
     
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
     
     private Date hoy = new Date();
     
     private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
     
     private List<LIRE042.Elemento> elementos = new ArrayList<>();

     private String fechaFormateada="";
   
     private boolean bot=false;
     
     private int progress;
     
     private boolean bot1=false;
     
     private boolean bot2=true;
     
     private boolean bot4=false;
     
     private String nomXML="";
     
     private String rutaNombre="";
     
     private  DocumentoInab  dInab = new  DocumentoInab();
     
     private String tipoActualizacion="0";

    public String getTipoActualizacion() {
        return tipoActualizacion;
    }

    public void setTipoActualizacion(String tipoActualizacion) {
        this.tipoActualizacion = tipoActualizacion;
    }
     
    private Gson gs = new Gson();

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

  
     public int getProgress() {
        return progress;
     }

     public void setProgress(int progress) {
        this.progress = progress;
     }
          

     public boolean isBot() {
        return bot;
     }

     public void setBot(boolean bot) {
        System.out.println("bot: "+bot);
        this.bot = bot;
     }
     
    public List<LIRE042.Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<LIRE042.Elemento> elementos) {
        this.elementos = elementos;
    }

    public void agregarElemento() {
        elementos.add(new LIRE042.Elemento(""));
    }

    public void eliminarElemento(LIRE042.Elemento elemento) {
        if(elementos.size()>1)
         elementos.remove(elemento);
    }

    public DocumentoInab getdInab() {
        return dInab;
    }

    public void setdInab(DocumentoInab dInab) {
        this.dInab = dInab;
    }

    public String getRutaNombre() {
       
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }
    
    public void activarBoton(){
        this.bot1=true;
        this.bot2=false;      
        this.bot4=true;// desactiva ingreso para cambiar el texto de la solicitud
        PF.current().ajax().update(":bot1,:bot2,:bot4");
    }
    
    public void activarBotonVistaPrevia(){
        this.bot1=false;
        this.bot2=true;        
    }
    
    public void desactivaAmbosBotones(){
        this.bot1=true;
        this.bot2=true;   
        
            PrimeFaces.current().executeScript(
            "Swal.fire({" +
                "title: 'Su solicitud fue enviado al INAB'," +
                "text: 'Serás redirigido al inicio'," +
                "icon: 'warning'," +
                "showCancelButton: true," +
                "confirmButtonText: 'Ir ahora'," +
               
            "}).then((result) => {" +
                "if (result.isConfirmed) {" +
                    "window.location.href = '/WPro09A/pages/inicio.xhtml?ra=" +mhome.getPer().getTcUsuario().getUsuarioId() +"&rx=a; "+
                "}" +
            "});"
        );
        
        
       this.mhome.getApi().llamaCualquierPagina("/WPro09A/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
    }

    public boolean isBot4() {
        return bot4;
    }

    public void setBot4(boolean bot4) {
        this.bot4 = bot4;
    }
    
    public void ver(){
        System.out.println("data ----- ");
    }
    
     public void generarDocumento042Final(){
         try {
             // nombre de archivo temporal
             String n = this.dInab.getSolicitudActualizacion().getVisor().getVista().getUrlDocumento();
             // consulta de documento xml previo inactivo
             String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.dInab.getExpediente(), n);
             // obtiene documento xml de vista previa
             String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.dInab.getExpediente(), n.replaceAll(".pdf",".xml"));
             // convierte el objecto
             DocumentoInab temp=  UTILIDADES.FuncionesComunes.fromXml(xml, DocumentoInab.class);
             // cambia a finalizado el estado del xml
             temp.setEstado("Finalizado");
             // crea nuevamente el xml uno nuevo con el estado finalizado
             Future<String> xmlfin = cargaDoc.creaXML42(mhome.getPer(),"PRO09","P1","042", temp);
             // obtiene el xml final
             String valor = xmlfin.get();
             // graba xml final
             Future<String> gxml = cargaDoc.grabaXML42(valor, temp);
             // obteine respuesta
             String r = gxml.get();
             // desaciva boton generar documento
             this.bot2=true; 
             // regstra en el historico en segundo plano
             Historico hiloHistorico = new Historico();
             hiloHistorico.setPer(this.mhome.getPer());
             hiloHistorico.setDocumentoRegistrar(temp); // registra documento 042 con estado finalizado
             hiloHistorico.setJD(cargaDoc.obtieneRedis());             
             hiloHistorico.start();// dispara en segundo plano registra historico para finalizados
             
             String sql= UTILIDADES.SQL.insertaGestion(temp);
             
             estructuras.RespuestaInsert ri = (estructuras.RespuestaInsert) mhome.getApi().repuestaApi(new estructuras.RespuestaInsert(),"JSON", sql,"24.199.121.192");
             
             if(ri.fila_afectada>0){// verifica la insernción en la tabla de control                                                  
                 
             DocumentoInab c=  UTILIDADES.FuncionesComunes.fromXml(valor,DocumentoInab.class);
             this.rutaNombre = c.getSolicitudActualizacion().getVisor().getVista().getRutaPdf();
                 
              sql  =   UTILIDADES.SQL.insertaGestionDetalle(c,this.rutaNombre,mhome.getPer());
               ri = (estructuras.RespuestaInsert) mhome.getApi().repuestaApi(new estructuras.RespuestaInsert(),
                     "JSON", sql,"24.199.121.192");
               
              if(ri.fila_afectada>0){
                  Future<String> gs = cargaDoc.generarReporte(c.getSolicitudActualizacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),valor,"042",dInab.getLicencia());             
                  String sp = gs.get();
                  System.out.println(sp);
              }
                 
             }
             
             GEnericaCincoCampos cinco = this.mhome.getPer().getCincoCampos();
             System.out.println("Esto es el subregional : "+cinco.getDato1());
             
             
             System.out.println("secretaria 1 :"+ this.mhome.getPer().getListSecretarias().get(0).getUsuarioDesc());
             
             cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()),  this.mhome.getPer().getListSecretarias().get(0).getUsuarioId(),3,2);
             
             // inicializa 
             //this.mhome.getApi().llamaCualquierPagina("/WPro09/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
             
             
             
         } catch (JAXBException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InterruptedException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ExecutionException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
    
     public void generarDocumento042(){
        
        
         try {
             // creadocumento 042
             Future<lire042.DocumentoInab> dc = cargaDoc.creaDocumento042(mhome.getRu(),mhome.getPer(),this.elementos);
             
             this.dInab = dc.get();
             //crea xml 
             Future<String> xml = cargaDoc.creaXML42(mhome.getPer(),"PRO09","P1","042", dInab);
             
             String valor = xml.get();
             // graba el xml
             Future<String> gxml = cargaDoc.grabaXML42(valor, dInab);
             
             String r = gxml.get();
             
             // setea nombres
             this.nomXML = dInab.getSolicitudActualizacion().getVisor().getVista().getRutaPdf();
             // String xq=UTILIDADES.Xquery.xmlConsultaDocumento(dInab.getExpediente(), nomXML);
             
             this.rutaNombre = this.nomXML;
               
             
             // crea documento en vista preiva
             Future<String> gs = cargaDoc.generarReporte(dInab.getSolicitudActualizacion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), dInab.getExpediente(),valor,"042",dInab.getLicencia());             
             String sp = gs.get();
             System.out.println(sp);                                       
             PrimeFaces.current().executeInitScript("PF('productDialog').show()");
             
         } catch (InterruptedException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ExecutionException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }

     

     public String getFechaFormateada() {
        return fechaFormateada;
     }

     public void setFechaFormateada(String fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
     }

     
   
    
      public void llamar(){
         try {
             elementos.add(new LIRE042.Elemento(""));
             this.fechaFormateada = formato.format(hoy);
             System.out.println("Licencia :"+mhome.getPer().getLicencia().getNumero_licencia_poa());
             System.out.println("datos de subregion : "+mhome.getPer().getCincoCampos().getDato1());
             
             Jedis JD =  this.ir.obtieneConeccionRedis();
             System.out.println("llave para token: "+"USU-"+mhome.getPer().getTcUsuario().getUsuarioId());
             String token = JD.hget("USU-"+mhome.getPer().getTcUsuario().getUsuarioId(),"token");
             
             int gestion_id = mhome.getPer().getLicencia().getGestion_id();
             System.out.println("gestion id :"+gestion_id);
             VerificaUsuario ver = new VerificaUsuario();
             String json = ver.obtienePlan(gestion_id, token);              
            
             dta.json.plan.Plan pl = this.gs.fromJson(json, dta.json.plan.Plan.class);
             
             System.out.println("Valores del Obj dirección: "+pl.getData().get(0).getFincas().get(0).getTcFinca().getDireccion());
             pl.getData().get(0).getPersonas().get(0).getTcPersona().getTcIdioma().getIdiomaDesc();
             JD.set("PLAN-"+mhome.getPer().getTcUsuario().getUsuarioId(), json);
             
             JD.close();
            
             this.mhome.getPer().setPplanM(pl);// carga el plan a la session
             
             InitialContext ctx = new InitialContext();
             
             this.ir =  (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
         } catch (NamingException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         }
           
      }
      
      
      //Clase auxiliar para representar un elemento
    public static class Elemento implements Serializable{
        private String valor;

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
    
    
     public void handleFileUpload(FileUploadEvent event) {
         
         
         
         
         
         
        FacesMessage msg = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
        
        
        
        
    }
    
}
