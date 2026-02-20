/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HILOS;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
public class GrabaPlanRedis extends Thread implements Serializable {
    
    private Jedis  JD=null;
    private String jsonPlan = "";
    private long   idUsuario;

    public Jedis getJD() {
        return JD;
    }

    public void setJD(Jedis JD) {
        this.JD = JD;
    }

    public String getJsonPlan() {
        return jsonPlan;
    }

    public void setJsonPlan(String jsonPlan) {
        this.jsonPlan = jsonPlan;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    public void registrarPlan() throws JAXBException{        
                                String llave="USU-"+String.valueOf(this.idUsuario);
				Map<String,String> dta = new HashMap<String, String>();
				dta.put("plan",this.jsonPlan);
				JD.hmset(llave,dta);				
				JD.close();        
    }
    
    
     @Override
    public void run() {
      try {
          registrarPlan();
      } catch (JAXBException ex) {
          Logger.getLogger(Historico.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
    
}
