/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author csandoval
 */

 public class lista_rodales implements Serializable{
        private int    id=0;
        private int    id_rodal;
        private double area_plan;
        private double area_informe;
        private String ubicacionx;
        private String ubicaciony;
        private int    densidad_plan;
        private int    densidad_informe;
        private String otros;
        private List<especie_gestion_informe> especie_gestion_informe = new ArrayList<>();
        private List<repoblacion_informe> repoblacion_informe = new ArrayList<>();

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId_rodal() {
            return id_rodal;
        }

        public void setId_rodal(int id_rodal) {
            this.id_rodal = id_rodal;
        }

        public double getArea_plan() {
            return area_plan;
        }

        public void setArea_plan(double area_plan) {
            this.area_plan = area_plan;
        }

        public double getArea_informe() {
            return area_informe;
        }

        public void setArea_informe(double area_informe) {
            this.area_informe = area_informe;
        }

        public String getUbicacionx() {
            return ubicacionx;
        }

        public void setUbicacionx(String ubicacionx) {
            this.ubicacionx = ubicacionx;
        }

        public String getUbicaciony() {
            return ubicaciony;
        }

        public void setUbicaciony(String ubicaciony) {
            this.ubicaciony = ubicaciony;
        }

        public int getDensidad_plan() {
            return densidad_plan;
        }

        public void setDensidad_plan(int densidad_plan) {
            this.densidad_plan = densidad_plan;
        }

        public int getDensidad_informe() {
            return densidad_informe;
        }

        public void setDensidad_informe(int densidad_informe) {
            this.densidad_informe = densidad_informe;
        }

        public String getOtros() {
            return otros;
        }

        public void setOtros(String otros) {
            this.otros = otros;
        }

        public List<especie_gestion_informe> getEspecie_gestion_informe() {
            return especie_gestion_informe;
        }

        public void setEspecie_gestion_informe(List<especie_gestion_informe> especie_gestion_informe) {
            this.especie_gestion_informe = especie_gestion_informe;
        }

        public List<repoblacion_informe> getRepoblacion_informe() {
            return repoblacion_informe;
        }

        public void setRepoblacion_informe(List<repoblacion_informe> repoblacion_informe) {
            this.repoblacion_informe = repoblacion_informe;
        }
        
 }