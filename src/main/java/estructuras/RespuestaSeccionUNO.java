/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author csandoval
 */
public class RespuestaSeccionUNO implements Serializable{
    
    private String expediente;
    private int    tipo_licencia;
    private String tipo_licencia_desc;
    private String numero_licencia_poa;
    private int    gestion_id;
    private int    subregion_id;
    private List<Titulares> titulares = new ArrayList<>();
    private int    numero_informe;
    private Date   fecha_autorizaion;
    private int    turno_reportado;
    private String regente;
  
    
    
    // clase interna
    public class Titulares implements Serializable{
        
       
            private int    tipo_propietario_id;
            private String persona_desc="";
            private int    representante_legal=0;
            private int    solo_representa=0;
            private String nombre_comercial="";
            private String razon_social="";

        public int getTipo_propietario_id() {
            return tipo_propietario_id;
        }

        public void setTipo_propietario_id(int tipo_propietario_id) {
            this.tipo_propietario_id = tipo_propietario_id;
        }

        public String getPersona_desc() {
            return persona_desc;
        }

        public void setPersona_desc(String persona_desc) {
            this.persona_desc = persona_desc;
        }

        public int getRepresentante_legal() {
            return representante_legal;
        }

        public void setRepresentante_legal(int representante_legal) {
            this.representante_legal = representante_legal;
        }

        public int getSolo_representa() {
            return solo_representa;
        }

        public void setSolo_representa(int solo_representa) {
            this.solo_representa = solo_representa;
        }

        public String getNombre_comercial() {
            return nombre_comercial;
        }

        public void setNombre_comercial(String nombre_comercial) {
            this.nombre_comercial = nombre_comercial;
        }

        public String getRazon_social() {
            return razon_social;
        }

        public void setRazon_social(String razon_social) {
            this.razon_social = razon_social;
        }

            
            
            
        }// fin de la sub-clase interna

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public int getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(int tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    public String getTipo_licencia_desc() {
        return tipo_licencia_desc;
    }

    public void setTipo_licencia_desc(String tipo_licencia_desc) {
        this.tipo_licencia_desc = tipo_licencia_desc;
    }

    public String getNumero_licencia_poa() {
        return numero_licencia_poa;
    }

    public void setNumero_licencia_poa(String numero_licencia_poa) {
        this.numero_licencia_poa = numero_licencia_poa;
    }

    public int getGestion_id() {
        return gestion_id;
    }

    public void setGestion_id(int gestion_id) {
        this.gestion_id = gestion_id;
    }

    public int getSubregion_id() {
        return subregion_id;
    }

    public void setSubregion_id(int subregion_id) {
        this.subregion_id = subregion_id;
    }

    public List<Titulares> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<Titulares> titulares) {
        this.titulares = titulares;
    }

    public int getNumero_informe() {
        return numero_informe;
    }

    public void setNumero_informe(int numero_informe) {
        this.numero_informe = numero_informe;
    }

    public Date getFecha_autorizaion() {
        return fecha_autorizaion;
    }

    public void setFecha_autorizaion(Date fecha_autorizaion) {
        this.fecha_autorizaion = fecha_autorizaion;
    }

    public int getTurno_reportado() {
        return turno_reportado;
    }

    public void setTurno_reportado(int turno_reportado) {
        this.turno_reportado = turno_reportado;
    }

    public String getRegente() {
        return regente;
    }

    public void setRegente(String regente) {
        this.regente = regente;
    }

      
    
    
}
