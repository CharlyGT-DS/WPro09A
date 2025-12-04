/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

/**
 *
 * @author WINDOWS
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UsoSuelo implements Serializable {

    // LISTA PARA EL DATATABLE
    private List<Item> lista;

    // TOTALES
    private double totalArea;
    private double totalPorcentaje;

    // ===== MODELO INTERNO =====
    public static class Item {

        private String uso;
        private double area;
        private double porcentaje;

        public Item(String uso, double area, double porcentaje) {
            this.uso = uso;
            this.area = area;
            this.porcentaje = porcentaje;
        }

        public String getUso() {
            return uso;
        }

        public double getArea() {
            return area;
        }

        public double getPorcentaje() {
            return porcentaje;
        }
    }
    // ==========================

    @PostConstruct
    public void init() {
        lista = new ArrayList<>();

        // DATOS DE PRUEBA SOLO PARA VISTA
        lista.add(new Item("Agricultura", 12.50, 40));
        lista.add(new Item("Bosque", 10.00, 32));
        lista.add(new Item("Ganadería", 8.75, 28));

        recalcularTotales();
    }

    public void eliminar(Item item) {
        lista.remove(item);
        recalcularTotales();
    }

    private void recalcularTotales() {
        totalArea = 0;
        totalPorcentaje = 0;

        for (Item i : lista) {
            totalArea += i.area;
            totalPorcentaje += i.porcentaje;
        }
    }

    // ===== GETTERS PARA LA VISTA =====

    public List<Item> getLista() {
        return lista;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getTotalPorcentaje() {
        return totalPorcentaje;
    }
}

