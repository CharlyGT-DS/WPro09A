/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HILOS;

import com.gisfaces.utilities.json.JSONArray;
import estructuras.PefilInab;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import org.primefaces.shaded.json.JSONObject;
import org.primefaces.shaded.json.JSONTokener;
import redis.clients.jedis.Jedis;
import org.json.XML;
import org.plan.PlanEditado;



/**
 *
 * @author csandoval
 */
public class TransformarPlan extends Thread implements Serializable {
    
    private estructuras.PefilInab per = new PefilInab();
    private Jedis JD=null;
    private String json= "";
    private String xml;
    private org.plan.PlanEditado planEditado = new PlanEditado();

    public PlanEditado getPlanEditado() {
        return planEditado;
    }

    public void setPlanEditado(PlanEditado planEditado) {
        this.planEditado = planEditado;
    }
     
    public PefilInab getPer() {
        return per;
    }

    public void setPer(PefilInab per) {
        this.per = per;
    }

    public Jedis getJD() {
        return JD;
    }

    public void setJD(Jedis JD) {
        this.JD = JD;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
     
    
    @Override
    public void run(){
        
         try {
             // 2) Parsear de forma flexible (puede devolver JSONObject o JSONArray)
             Object parsed = new JSONTokener(this.json).nextValue();
             JSONObject wrapper;
             
             if (parsed instanceof JSONObject) {
                 wrapper = (JSONObject) parsed;
             } else if (parsed instanceof JSONArray) {
                 // si el root es un array lo envolvemos con un tag <root> ... </root>
                 wrapper = new JSONObject();
                 wrapper.put("root", (JSONArray) parsed);
             } else {
                 // valor primitivo -> lo guardamos en un nodo value
                 wrapper = new JSONObject();
                 wrapper.put("value", parsed);
             }
             
             // 3) Convertir a XML (org.json.XML)
             this.xml = XML.toString(wrapper);

             // añadir declaracion XML (opcional)
             this.xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <plan_editado>" + this.xml +"</plan_editado>";

             this.planEditado =   UTILIDADES.FuncionesComunes.fromXml(this.xml, org.plan.PlanEditado.class);
             
             
             
         } catch (JAXBException ex) {
             Logger.getLogger(TransformarPlan.class.getName()).log(Level.SEVERE, null, ex);
         }
          
        
        
    }
    
    
}
