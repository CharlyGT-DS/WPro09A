/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import MANEJADORES.MHHome;
import com.gisfaces.event.MapClickEvent;
import com.gisfaces.model.graphic.GraphicsModel;
import com.gisfaces.model.graphic.LineStyle;
import com.gisfaces.model.graphic.PolygonGraphic;
import com.gisfaces.model.map.Coordinate;
import com.gisfaces.utilities.JSFUtilities;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import estructuras.RespuestaInsert;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import solicitante.PlanManejo;

/**
 *
 * @author csandoval
 */

@Named(value = "dataMapa")
@ViewScoped
public class DataMapa implements Serializable {
    
    
    @Inject
    private MHHome home;
    
    private  Map<String,String> requestParams = new HashMap<>();
    private  PolygonGraphic polygon =null;
    private  Gson gs = new Gson();
    private  String json="";
    private  List<Point2D.Double> listaTa = new ArrayList<>(); 
    private  Point2D.Double centro;
    private List<Point2D.Double> puntosGTM= new ArrayList<>();
    private  int zoom=15;
    private GraphicsModel graphicsModel= null;
  
    private List<PuntoUTM> listaPuntosUTM = new ArrayList<>();


    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public GraphicsModel getGraphicsModel() {
        return graphicsModel;
    }

    public void setGraphicsModel(GraphicsModel graphicsModel) {
        this.graphicsModel = graphicsModel;
    }
    
    
     public void loadPostData() {
      
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        if (session != null) {
            this.json = (String) session.getAttribute("json");
            System.out.println("JSON recuperado en AServiceBean: " + this.json);
        } else {
            System.out.println("No hay sesión activa al inicializar AServiceBean");
        }
      

        if (this.json != null && !this.json.isEmpty()) {
            System.out.println("Datos JSON recibidos via POST: " + this.json);
            // Lógica para procesar el JSON
             this.json = json;
             System.out.println(json);
             init();
             procesarJson();
            
        } else {
             System.out.println("No se recibieron datos JSON.");
        }
    }

    public String getJson() {       
        return json;
    }

    public void setJson(String json) {       
        this.json = json;
        System.out.println(json);
        init();
        procesarJson();
    }

    public Point2D.Double getCentro() {
        return centro;
    }

    public void setCentro(Point2D.Double centro) {
        this.centro = centro;
    }
    
    
    
    @PostConstruct
    public void init(){           
      this.polygon = new PolygonGraphic();
      this.graphicsModel = new GraphicsModel();
      this.polygon.setFillColor("#FF0000");
      this.polygon.setFillOpacity(0.25);
      this.polygon.setOutlineStyle(LineStyle.SOLID);
      this.polygon.setOutlineColor("#FF0000");
      System.out.println("inicializo el bean de puntos");
      this.polygon.setFillColor("#FF0000");
      this.polygon.setFillOpacity(0.25);
      this.polygon.setOutlineStyle(LineStyle.SHORTDASHDOT);
      this.polygon.setOutlineColor("#FF0000");
      this.polygon.getAttributes().put("Finca", "Perimetro de la Finca");      
      this.polygon.getAttributes().put("Color de Relleno", polygon.getFillColor());
      this.polygon.getAttributes().put("Ocapcidad", polygon.getFillOpacity());
      this.polygon.getAttributes().put("Color de Linea", polygon.getOutlineColor());
      this.polygon.getAttributes().put("Opacidad de Linea", polygon.getOutlineOpacity());
      this.polygon.getAttributes().put("Tipo de Linea", "LineStyle.SHORTDASHDOT");
      this.polygon.setId("778");
      this.polygon.setType("polygon");
    }
    
    
    public void procesarJson(){        
      double area=0;  
      
       this.listaPuntosUTM.clear();
       this.listaTa.clear();
       this.puntosGTM.clear();
       try{
        Puntos data = new Puntos();
        System.out.println("1");
        Type listType = new TypeToken<List<Punto>>() {}.getType();
        List<Punto> valores = gs.fromJson(this.json, listType);
        data.setPuntos(valores);
        
       
        System.out.println("2");
        Iterator<Punto> it = valores.iterator();
        System.out.println("3");
        
        while(it.hasNext()){
           Punto p = it.next();
           System.out.println("latitud :"+p.getGTM_Y() +" Longitud: "+p.getGTM_X());           
           this.puntosGTM.add(new Point2D.Double(p.getGTM_X(), p.getGTM_Y()) );
          
           PuntoUTM valor =  UTMToLatLon.convierteGTMaUTM(p);
           Point2D.Double pd = new Point2D.Double(valor.getLongitud(), valor.getLatitud());
            this.polygon.getCoordinates().add(new Coordinate(valor.getLatitud(), valor.getLongitud()));
           this.listaPuntosUTM.add(valor);
           this.listaTa.add(pd);
           
          
        }
        System.out.println("4");
        this.graphicsModel.getGraphics().add(this.polygon);
        this.centro = UTMToLatLon.calcularCentroide(this.listaTa); // obtiene centroide
        
        int id_gestion =  home.getPer().getLicencia().getGestion_id();
        
        String sql= UTILIDADES.SQL.actualizaTablaCentroGeopolizacion(id_gestion, this.centro.y, this.centro.x);
        System.out.println("sql update: "+sql);
        RespuestaInsert ri = new RespuestaInsert();
        ri = (RespuestaInsert)  home.getApi().repuestaApi(new RespuestaInsert(),"JSON", sql,"24.199.121.192");
        
        if(ri.fila_afectada>0)
        home.getPer().setCentro(this.centro);
        
        
          area =UTMToLatLon.calcularArea(this.puntosGTM);
          System.out.printf("Área del polígono: %.3f m²%n", area);
        this.zoom = UTMToLatLon.zoom(area);
        double perimetro = UTMToLatLon.calcularPerimetro(this.puntosGTM);
        System.out.println("zoom :"+this.zoom);
        this.polygon.getAttributes().put("Área m²", area);
        this.polygon.getAttributes().put("Zona", 15.5);
        this.polygon.getAttributes().put("Perimetro m", perimetro);
          
        System.out.println("centro  x: "+centro.getX() + " cdntro y:"+centro.getY() );
       }catch(Exception es){
           System.out.println("error es:"+es.getMessage());
       }
        
       
        
        
        
    }
    
    public void doMapClickListener(AjaxBehaviorEvent event)
	{
		MapClickEvent e = (MapClickEvent) event;

		String summary = "Map Click Event";
		String detail = String.format("Latitude='%s', Longitude='%s', Zoom='%s', Scale='%s', XMin='%s', YMin='%s', XMax='%s', YMax='%s', Height='%s', Width='%s', X='%s', Y='%s'", e.getLatitude(), e.getLongitude(), e.getZoom(), e.getScale(), e.getExtent().getXmin(), e.getExtent().getYmin(), e.getExtent().getXmax(), e.getExtent().getYmax(), e.getScreen().getHeight(), e.getScreen().getWidth(), e.getScreen().getX(), e.getScreen().getY());

		System.out.println(String.format("%s: %s", summary, detail));
		JSFUtilities.addInfoMessage(summary, detail);
	}
    
    
    
}
