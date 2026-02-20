/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secretaria;

import HILOS.Historico;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import PERFIL.EJBGestionREDLocal;
import UTILIDADES.FacadeData;
import estructuras.Dta;
import estructuras.GEnericaCincoCampos;
import estructuras.OptionItem;
import estructuras.PefilInab;
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
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import lire042.DocumentoInab;
import lire042.DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle;
import org.primefaces.PrimeFaces;
import solicitante.LIRE042;

/**
 *
 * @author csandoval
 */

@Named (value = "LIRE080")
@ViewScoped
public class LIRE080 implements Serializable{
    
    
    @Inject
    private MHHome mhome;
     
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    @EJB
    private PERFIL.EJBGestionREDLocal ir=null;
    
    @EJB
    private PERFIL.FuncionesRedisLocal fred; 
    
    private String fechaFormateada="";
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Date hoy = new Date();
    private lire042.DocumentoInab doc042 = new DocumentoInab();    
    private lire080.DocumentoInab doc080 = new lire080.DocumentoInab();
    private boolean bot1=false,bot2=true;
    private boolean bot=false;
    
    private List<LIRE080.Elemento> elementos  = new ArrayList<>();
    private List<LIRE080.Elemento> documentos = new ArrayList<>();
    private List<Dta> contactos = new ArrayList<>();
    private List<OptionItem> options = new ArrayList<>();
    private String rutaNombre="";

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }
    
    

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public MHHome getMhome() {
        return mhome;
    }

    public void setMhome(MHHome mhome) {
        this.mhome = mhome;
    }

    public boolean getBot1() {
        return bot1;
    }

    public void setBot1(boolean bot1) {
        this.bot1 = bot1;
    }

    public boolean getBot2() {
        return bot2;
    }

    public void setBot2(boolean bot2) {
        this.bot2 = bot2;
    }        

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public List<OptionItem> getOptions() {
        return options;
    }

    public void setOptions(List<OptionItem> options) {
        this.options = options;
    }
    
        
    public String getFechaFormateada() {
        return fechaFormateada;
    }

    public void setFechaFormateada(String fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
    }

    public DocumentoInab getDoc042() {
        return doc042;
    }

    public void setDoc042(DocumentoInab doc042) {
        this.doc042 = doc042;
    }

    public List<Dta> getContactos() {
        return contactos;
    }

    public void setContactos(List<Dta> contactos) {
        this.contactos = contactos;
    }    
    
    public void agregarElemento() {
        elementos.add(new LIRE080.Elemento(""));
    }

        
    public void eliminarElemento(LIRE042.Elemento elemento) {
        if(elementos.size()>1)
         elementos.remove(elemento);
    }

    public List<Elemento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Elemento> documentos) {
        this.documentos = documentos;
    }
     
      public void activarBoton(){
        this.bot1=true;
        this.bot2=false;  
       
    }
      
     

    
    
    public void llamar(){
         try {
             
                
                // consulta la subregion por el número de gestion
                String sql = UTILIDADES.SQL.consultaSubregionPorGestionID(String.valueOf(this.mhome.getPer().getDocumentoInab().getActual().getGestionId()));                
                Future<GEnericaCincoCampos> cin = fred.registraDatos(sql);
                GEnericaCincoCampos cinco = cin.get();                
                this.mhome.getPer().setCincoCampos(cinco);
                                
                // carga director subregional en datos maestros
                Future<estructuras.PefilInab> pefil = fred.buscaSubREgional(this.mhome.getPer(), cinco.getDato1().toString().replaceAll(".0",""));
                PefilInab pt = pefil.get();
                this.mhome.setPer(pt);
                
                String[] n=this.mhome.getPer().getDocumentoInab().getActual().getUrlDocumento().split("/");
                // consulta de documento xml previo inactivo
                String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.mhome.getPer().getDocumentoInab().getActual().getExpediente(), n[8].replaceAll(".pdf",".xml"));
                System.out.println("consulta existDB: "+xq);
                // obtiene documento xml de produccion de la solcitud
                String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.mhome.getPer().getDocumentoInab().getActual().getExpediente(), n[8].replaceAll(".pdf",".xml"));
                System.out.println("xml almacenado :"+xml);
                this.doc042 = UTILIDADES.FuncionesComunes.fromXml(xml,DocumentoInab.class);
             
             //elementos.add(new LIRE042.Elemento(""));
             this.fechaFormateada = formato.format(hoy);
             System.out.println("Licencia :"+mhome.getPer().getLicencia().getNumero_licencia_poa());
             System.out.println("datos de subregio : "+mhome.getPer().getCincoCampos().getDato1());
             InitialContext ctx = new InitialContext();
             
             // carga los elementos para aprovechamiento forestal
             this.elementos.clear();
             for(Detalle d : doc042.getSolicitudActualizacion().getContenido().getModificaciones().getDetalle()){
                 Elemento el = new Elemento();
                 el.setValor(d.getValue());
                 
                 this.elementos.add(el);
                 
             }
             this.ir =  (EJBGestionREDLocal) ctx.lookup("java:global/WPro09A/EJBGestionRED!PERFIL.EJBGestionREDLocal");
             this.documentos.clear();
            
             String[] vac = this.mhome.getPer().getDoc080().split(",");
             
             for(int c =0; c< vac.length; c++){
                 Elemento ele = new  Elemento();
                 ele.valor = vac[c]; 
                 this.documentos.add(ele);
             }
             Elemento ele = new Elemento();
             ele.setValor("Constancia de Recepción de Documentos");
             this.documentos.add(ele);
             
             
             // consulta contactos por numero de gestion
             sql = UTILIDADES.SQL.notificarPorGestionID(doc042.getIdGestion());
             this.contactos = this.mhome.getApi().convierteObjetoLista(sql, Dta.class,"24.199.121.192");
             
                          
             
             
         } catch (NamingException ex) {
             Logger.getLogger(LIRE042.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InterruptedException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        }
           
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
                    "window.location.href = '/WPro09A/pages/inicio.xhtml?ra=" +mhome.getPer().getTcUsuario().getUsuarioId() +"&rx=a; "+
                "}" +
            "});"
        );
        
        
       this.mhome.getApi().llamaCualquierPagina("/WPro09A/pages/inicio.xhtml?ra="+mhome.getPer().getTcUsuario().getUsuarioId()+"&rx=a';");
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
   
    
    public void generarDocumento080(){ 
        try {
            
            
            // esto es algo que pide la pantalla
            System.out.println("click sobre el bóton");
            GEnericaCincoCampos cinco = new GEnericaCincoCampos();
            cinco.setDato1("1");
            cinco.setDato2("1");
            cinco.setDato3("6");
            System.out.println("GEnerico");
            
            
            // esto se pide para n¿buscar la subregion de la gestion
            String sql = UTILIDADES.SQL.notificarPorGestionID(doc042.getIdGestion());
            List<java.util.LinkedHashMap> lis = (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
                        
            
            // creadocumento 042
            this.doc080 = FacadeData.crea080(this.doc042,lis, cinco, this.elementos, this.documentos, this.mhome.getPer());
            System.out.println("data :"+doc080.getLicencia());
            
            // genera xml para vista previa
            String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(this.doc080);
            // graba el xml
            Future<String> gxml = cargaDoc.grabaXML080(xml, this.doc080);            
            String r = gxml.get();
            
            // setea nombres
            this.rutaNombre= doc080.getConstanciaRecepcion().getVisor().getVista().getRutaPdf();
            String nombrePDF = doc080.getConstanciaRecepcion().getVisor().getVista().getUrlDocumento().replace(".xml",".pdf");
            
            // crea documento en vista preiva en formato pdf
            Future<String> gs = cargaDoc.generarReporte(doc080.getConstanciaRecepcion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), doc080.getExpediente(),xml,"080",doc080.getLicencia());             
            String sp = gs.get();
            System.out.println(sp);       
            
         
            
            PrimeFaces.current().executeInitScript("PF('productDialog').show()");
            
            // TRAZLADA expediente al director subregional
            // cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()),  this.mhome.getPer().getListSubRegional().get(0).getUsuarioId(),5,3);
                  
         
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void generarDocumento080Final(){
         
        try {
            // nombre de archivo temporal
            String n = this.doc080.getConstanciaRecepcion().getVisor().getVista().getUrlDocumento();
            // consulta de documento xml previo inactivo
            String xq = UTILIDADES.Xquery.xmlConsultaDocumento(this.doc080.getExpediente(), n);
            // obtiene documento xml de vista previa
            String xml = this.mhome.getApi().enviarApiMMCoreXMLGet(xq.replaceAll(".pdf",".xml"),this.doc080.getExpediente(), n.replaceAll(".pdf",".xml"));
            // convierte el objecto
            lire080.DocumentoInab temp=  UTILIDADES.FuncionesComunes.fromXml(xml, lire080.DocumentoInab.class);
            // cambia a finalizado el estado del xml
            temp.setEstado("Finalizado");
            // crea nuevamente el xml uno nuevo con el estado finalizado
            Future<String> xmlfin = cargaDoc.creaXML80(mhome.getPer(),"PRO09","P2","080", temp);
            // obtiene el xml final
            String valor = xmlfin.get();      
            // graba xml final
            Future<String> gxml = cargaDoc.grabaXML080(valor, temp);
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
             
             this.rutaNombre= temp.getConstanciaRecepcion().getVisor().getVista().getRutaPdf();
            
            // crea documento en vista preiva en formato pdf
            Future<String> gs = cargaDoc.generarReporte(temp.getConstanciaRecepcion().getVisor().getVista().getUrlDocumento().replaceAll(".xml",".pdf"), temp.getExpediente(),valor,"080",temp.getLicencia());             
            String sp = gs.get();
            System.out.println(sp);      
            
           //TRAZLADA expediente al director subregional
            cargaDoc.trazladaExpedinte(Integer.parseInt(this.mhome.getPer().getTcUsuario().getUsuarioId().toString()),  this.mhome.getPer().getListSubRegional().get(0).getUsuarioId(),5,3);
                  
             
            
        } catch (JAXBException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LIRE080.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
     }// fin del metodo
     
    
    
}
