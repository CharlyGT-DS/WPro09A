/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANEJADORES;


import EJB.DBaseLocal;
import PERFIL.CargaDocumentosLocal;
import com.google.gson.Gson;
import estructuras.GEnericaCincoCampos;
import estructuras.PefilInab;
import estructuras.RespuestaSeccionUNO;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.el.ELContext;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import redis.clients.jedis.Jedis;
import tablas.MANEJO.TcPerfil;
import tablas.MANEJO.TcUsuario;

/**
 *
 * @author csandoval
 */

@Named("mHHome")
@SessionScoped
public class MHHome implements Serializable{
    
    @EJB
    private PERFIL.FuncionesRedisLocal fred; 
    private DBaseLocal api;    
    private String ra="";
    private String rx="";
    private transient FacesContext facesContext =null;
    private transient InitialContext ctx =null;
    private estructuras.PefilInab per = new PefilInab();
    private transient Gson gson = new Gson();
    private int entrada; 
    private RespuestaSeccionUNO  ru = new RespuestaSeccionUNO();
    private String sql="";

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
        
    public RespuestaSeccionUNO getRu() {
        return ru;
    }

    public void setRu(RespuestaSeccionUNO ru) {
        this.ru = ru;
    }
        
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRx() {
        return rx;
    }

    public void setRx(String rx) {
        this.rx = rx;
    }

    public PefilInab getPer() {
        return per;
    }

    public void setPer(PefilInab per) {
        this.per = per;
    }
        
        @PostConstruct
        public void init(){
                        
            try {
                InitialContext ctx = new InitialContext();
                this.api =  (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
                carga2();
            } catch (NamingException ex) {
                Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        
        
        public void carga2(){
              per = new estructuras.PefilInab();
              
                try{
                    

                  // busqueda del componente por JNDI
                  ctx = new InitialContext();
                  this.api =  (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
                  
                           // usuario origen
                           sql=  UTILIDADES.SQL.busquedaUsuarioPorId(1150);
                           this.per.setTcUsuario((TcUsuario) this.api.repuestaApi(new tablas.MANEJO.TcUsuario(),"JSON",sql));
                           
                           // busca el perfil por subregion por id
                           sql = UTILIDADES.SQL.llamaJuridicoPorId(1150);
                           this.per.setCincoCampos((GEnericaCincoCampos) this.api.repuestaApi(new estructuras.GEnericaCincoCampos(),"JSON",sql));
                           System.out.println("dato 5 ="+ this.per.getCincoCampos().getDato5().toString());
                           tablas.MANEJO.TcPerfil temPerfil = new tablas.MANEJO.TcPerfil();
                           temPerfil.setPerfilDesc(this.per.getCincoCampos().getDato5().toString());
                           this.per.setTcPerfil(temPerfil);
                           
                           // subregional el destino
                             sql=  UTILIDADES.SQL.busquedaUsuarioPorId(142);
                             TcUsuario tmpU = (TcUsuario) this.api.repuestaApi(new tablas.MANEJO.TcUsuario(),"JSON",sql);
                             this.per.getListaTcUsuario().add(tmpU);
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                    
            } catch (NamingException ex) {
                Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
        public void carga(){
            
            Map<String, String> params=null;
            String json="";
            per = new estructuras.PefilInab();
            try {
                
                
                  facesContext = FacesContext.getCurrentInstance();
                  ELContext elContext = facesContext.getELContext();
                  ExternalContext externalContext = facesContext.getExternalContext();
                  params = externalContext.getRequestParameterMap();

                  // busqueda del componente por JNDI
                  ctx = new InitialContext();
                  this.api =  (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
                
              
                  
                  if(ctx==null)
                  ctx = new InitialContext();
                  this.api = (DBaseLocal) ctx.lookup("java:global/ComponenteCero-2.0/DBase!EJB.DBaseLocal");
                    
                
                
                if (this.ra != null && this.rx != null) {
                    this.ra = params.get("ra");
                    this.rx = params.get("rx");
                    
                    if((this.rx.length()>=4)&&(this.ra.length()>=4)){
                        
                     byte[] decodedBytes = Base64.getDecoder().decode(this.rx);
                     this.rx = new String(decodedBytes, StandardCharsets.UTF_8);
                     decodedBytes = Base64.getDecoder().decode(this.ra);
                     this.ra = new String(decodedBytes, StandardCharsets.UTF_8);
                         
                    }
                    
                    if(this.ra==null)
                        this.ra="0";
                    if(this.rx==null)
                        this.rx="";
                   
                    Future<estructuras.PefilInab> tpp =  fred.buscaUsuarioConectado(this.ra, this.per);
                    this.per =  tpp.get();
                   
                     
                    if(this.rx!=""){
                     
                     
                      try {
                          
                         // Future<estructuras.PefilInab> tper=  fred.buscarUsuarioSubRegion(this.ra,per);
                         // this.per = tper.get();
                         // Future<estructuras.PefilInab> tper2 =   fred.buscaTecnicos(this.per);
                         // this.per = tper2.get();
                         // Future<estructuras.PefilInab> tper3 =   fred.buscaRegional(this.per);
                         // this.per = tper3.get();
                         // Future<estructuras.PefilInab> tper4 =   fred.buscaSubREgional(this.per);
                         // this.per = tper4.get();
                          Future<estructuras.PefilInab> tper5 =   fred.buscaLicencias(this.ra,this.per);
                          this.per = tper5.get();
                          
                           Future<estructuras.PefilInab> tper6 = fred.buscaUsuario(ra, per);
                           this.per = tper6.get();
                           
                          
                           
                          
                          System.out.println(":::IINICIO-JSON:::");
                          System.out.println(gson.toJson(this.per));
                          System.out.println(":::FIN-JSON:::");
                          
                          
                      } catch (InterruptedException ex) {
                          Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
                      } catch (ExecutionException ex) {
                          Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
                      }
                    
                    }
                    
                }
                if(this.ra.length()==0 || this.rx.length()==0){
                    
                    this.api.llamaCualquierPagina("/WPro09/auth/error.xhtml");
                    
                }
                
                System.out.println("RA :"+ra);
                System.out.println("RX :"+rx);
                String llaveSes = "SES-USU-" + rx.toUpperCase() + "-ID-" + ra;
                System.out.println(llaveSes);
                if(fred.verifica(llaveSes).compareTo("{}")==0){// insertar por que no existe esa sesion                    
                    fred.insertaPerfil(llaveSes,json);                    
                    
                }
                
                
            } catch (NamingException ex) {
                Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(MHHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        public void cerrarSesion(){         
            try{
             this.api.cerrarSesion("/WPro09/");
            }catch(Exception es){
             
                    this.api.llamarPagina("/WPro09/");
                    System.out.println("Error al cerrar sesión :"+es.getMessage());
                
                
            }
        }

    public DBaseLocal getApi() {
        return api;
    }

    

    
}
