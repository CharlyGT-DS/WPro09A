/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subregional;

import secretaria.*;
import MANEJADORES.MHHome;
import PERFIL.CargaDocumentosLocal;
import estructuras.GEnericaCincoCampos;
import estructuras.HISTORICO.DocumentoInab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
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

@Named (value = "subRegionalEntrada")
@ViewScoped
public class SubRegionalEntrada implements Serializable{
    
    @Inject
    private CargaDocumentosLocal cargaDoc;
    
    @Inject
    private MHHome mhome;
    
    private List<estructuras.HISTORICO.DocumentoInab> listaEntrada = new ArrayList<>();
    
    private transient estructuras.HISTORICO.DocumentoInab seleccionadoEntrada = new DocumentoInab();
    
    private boolean c1=false,c2=false,c3=false,c4=false,c5=false;
    
    private String doc080 ="";
    
    private String boton="Incumplimiento";
    
    private List<java.util.LinkedHashMap> listaArchivos = new ArrayList<>();
    
    private List<GEnericaCincoCampos> tmplistaArchivos = new ArrayList<>();

    public List<GEnericaCincoCampos> getTmplistaArchivos() {
        return tmplistaArchivos;
    }

    public void setTmplistaArchivos(List<GEnericaCincoCampos> tmplistaArchivos) {
        this.tmplistaArchivos = tmplistaArchivos;
    }
    
    

    public List<LinkedHashMap> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(List<LinkedHashMap> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }
    
    

    public boolean isC1() {
        return c1;
    }

    public void setC1(boolean c1) {
        this.c1 = c1;
    }

    public boolean isC2() {
        return c2;
    }

    public void setC2(boolean c2) {
        this.c2 = c2;
    }

    public boolean isC3() {
        return c3;
    }

    public void setC3(boolean c3) {
        this.c3 = c3;
    }

    public boolean isC4() {
        return c4;
    }

    public void setC4(boolean c4) {
        this.c4 = c4;
    }

    public boolean isC5() {
        return c5;
    }

    public void setC5(boolean c5) {
        this.c5 = c5;
    }
    
    private boolean activar=true;

    public boolean isActivar() {
        return activar;
    }

    public void setActivar(boolean activar) {
        this.activar = activar;
    }

    public String getDoc080() {
        return doc080;
    }

    public void setDoc080(String doc080) {
        this.doc080 = doc080;
    }
    

    public List<DocumentoInab> getListaEntrada() {
        return listaEntrada;
    }

    public void setListaEntrada(List<DocumentoInab> listaEntrada) {
        this.listaEntrada = listaEntrada;
    }

    public DocumentoInab getSeleccionadoEntrada() {
        return seleccionadoEntrada;
    }

    public void setSeleccionadoEntrada(DocumentoInab seleccionadoEntrada) {
        this.seleccionadoEntrada = seleccionadoEntrada;
    }

    
    public void verificaBoton(){
        
        if(this.c1&&this.c2&&this.c3&&this.c4&&this.c5){
            this.activar=false;
            this.boton="Cumplimiento";
            PrimeFaces.current().ajax().update(":form:tpu");
        }else{
             this.boton="Incumplimiento";
             PrimeFaces.current().ajax().update(":form:tpu");
        }
        
        this.mhome.getPer().setDocumentoInab(this.seleccionadoEntrada);
    }
    
    public void aceptar(){
        
        try {
            String llaveOrigen ="EXP-ACTU-"+mhome.getPer().getTcUsuario().getUsuarioId();
            String llaveAceptado="EXP-ACTU-A-"+mhome.getPer().getTcUsuario().getUsuarioId();
            Jedis JD =  cargaDoc.obtieneRedis();
            long l = JD.llen(llaveOrigen);
            List<String> lis = JD.lrange(llaveOrigen, 0, l);
            String xml = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(this.seleccionadoEntrada);
            
            // mueve a cola aceptados
            JD.lpush(llaveAceptado, xml);
            
            // elimina de cola entrada
            JD.lrem(llaveOrigen, 0, xml);
            //elimina de la lista de la tabla
            this.listaEntrada.remove(this.seleccionadoEntrada);
            // actualiza la tabla
            
            //MODIFICA ESTADO del paso anteior
            String sql = UTILIDADES.SQL.consultaDetalle2(seleccionadoEntrada, Integer.parseInt(this.mhome.getRa()));
            GEnericaCincoCampos cinco = (GEnericaCincoCampos) mhome.getApi().repuestaApi(new GEnericaCincoCampos(), "JSON",sql,"24.199.121.192");
            
            String llave ="EXP-ACTU-F-"+cinco.getDato5().toString().replaceAll(".0", "");
            String xmlR = JD.lindex(llave,0);
            
            DocumentoInab temp = UTILIDADES.FuncionesComunes.fromXml(xmlR, estructuras.HISTORICO.DocumentoInab.class);
            temp.getActual().setTipoAccion("Bloqueado");
            String tmpXML = UTILIDADES.FuncionesComunes.convierteObjetoAXMLString(temp);
            
            JD.lrem(llave, 0, xmlR);
            JD.lpush(llave, tmpXML);
            
            //PrimeFaces.current().ajax().update(":form:basicDT");

            
        } catch (JAXBException ex) {
            Logger.getLogger(SubRegionalEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void generacionDocumentos(){
        
       
         int tp=0;
         if(this.c1==true){           
           this.doc080 = this.listaArchivos.get(0).get("data2").toString()+",";
         }else{
            tp=1;
         }
         if(this.c2==true){
           this.doc080 =this.doc080+this.listaArchivos.get(1).get("data2").toString()+",";
         }else{
           tp=1;
         }
         if(this.c3==true){
            this.doc080 =this.doc080+this.listaArchivos.get(2).get("data2").toString()+",";
         }else{
           tp=1;
         }
         if(this.c4==true){
           this.doc080 =this.doc080+this.listaArchivos.get(3).get("data2").toString()+",";
         }else{
            tp=1;
         }
         if(this.c5==true){
           this.doc080 =this.doc080+this.listaArchivos.get(4).get("data2").toString()+","; 
         }else{
            tp=1; 
         }
         
         if(tp==0){
             this.boton="Cumplimiento";
         }else{
             this.boton="Incumplimiento";
         }
        
          System.out.println(tp);
          System.out.println("--------------");
          System.out.println(doc080);
          
        
        if(this.boton.compareTo("Cumplimiento")==0){
            this.mhome.getPer().setDoc080(doc080);
            aceptar();
            this.mhome.getApi().llamaCualquierPagina("/WPro09/secretaria/li-re-080.xhtml");
        }else{
            //this.mhome.getPer().setDoc080(tp);            
            this.mhome.getApi().llamaCualquierPagina("/WPro09/secretaria/li-re-079.xhtml");
        }
        
        
    }
    
    
     public void cargarDatos(){
        
       Jedis JD =  cargaDoc.obtieneRedis();
       String llave = "EXP-ACTU-"+this.mhome.getPer().getTcUsuario().getUsuarioId();
       System.out.println("data "+llave);
       long l = JD.llen(llave);
       System.out.println("total :"+l);
       List<String> s = JD.lrange(llave, 0, l);
       this.listaEntrada.clear();
       List<estructuras.HISTORICO.DocumentoInab> listaTmp = new ArrayList<>();
       listaTmp.clear();
       
       String sql=UTILIDADES.SQL.archivosPorEscenario(1);
       System.out.println(sql);
       this.listaArchivos =  (List<java.util.LinkedHashMap>) this.mhome.getApi().convierteObjetoLista(sql, java.util.LinkedHashMap.class,"24.199.121.192");
       
       for(java.util.LinkedHashMap t : this.listaArchivos){
           GEnericaCincoCampos cin = new GEnericaCincoCampos();           
           cin.setDato1(t.get("data1").toString());
           cin.setDato2(t.get("data2").toString());
          
           this.tmplistaArchivos.add(cin);           
       }
       

       for (String t : s){
           try {
               estructuras.HISTORICO.DocumentoInab act = new DocumentoInab();
               
               act = UTILIDADES.FuncionesComunes.fromXml(t,  estructuras.HISTORICO.DocumentoInab.class); 
              
               listaTmp.add(act);
           } catch (JAXBException ex) {
               Logger.getLogger(SubRegionalEntrada.class.getName()).log(Level.SEVERE, null, ex);
           }
       }// fin del ciclo
       
       // filtra para que solo se pmuestren gestiones diferentes
       Collection<estructuras.HISTORICO.DocumentoInab> filtrados = listaTmp.stream()
               .collect(Collectors.toMap(d -> d.getActual().getLicencia()+"|"+ d.getActual().getGestionId(),
               d -> d,
               (existente, repetido) -> existente)).values();
       
       filtrados.forEach(d ->
             this.listaEntrada.add(d)
        );
       
       
       JD.close();
       JD=null;
        
    }
    
    
    
    
}
