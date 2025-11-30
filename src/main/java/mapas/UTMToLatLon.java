/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

/**
 *
 * @author csandoval
 */

import java.awt.geom.Point2D;
import java.util.List;
import org.locationtech.proj4j.CRSFactory;
import org.locationtech.proj4j.CoordinateReferenceSystem;
import org.locationtech.proj4j.CoordinateTransform;
import org.locationtech.proj4j.CoordinateTransformFactory;
import org.locationtech.proj4j.ProjCoordinate;

public class UTMToLatLon {
    
   
   public static PuntoUTM convierteGTMaUTM(Punto pto){
       
       PuntoUTM putm = new PuntoUTM();
        // Coordenadas UTM (Ejemplo: Guatemala, zona 15N)
        double northing  = pto.getGTM_Y(); // latitud
        double  easting = pto.getGTM_X(); // longitud
 
        // Crear fábrica de sistemas de referencia
        CRSFactory crsFactory = new CRSFactory();

        // Sistema de coordenadas origen (UTM zona 15N - WGS84)
        CoordinateReferenceSystem utm15n = crsFactory.createFromName("EPSG:32615");
       
         // Sistema de coordenadas destino (geográficas WGS84)
        CoordinateReferenceSystem wgs84 = crsFactory.createFromName("EPSG:4326");

        // Crear transformador
        CoordinateTransformFactory ctFactory = new CoordinateTransformFactory();
        CoordinateTransform transform = ctFactory.createTransform(utm15n, wgs84);

        // Coordenadas de entrada y salida
        ProjCoordinate src = new ProjCoordinate(easting, northing);
        ProjCoordinate dest = new ProjCoordinate();

          // Transformar de UTM → Lat/Lon
        transform.transform(src, dest);

        // Mostrar resultados
        System.out.printf("UTM Zone: 15N%n");
        System.out.printf("Easting (X):", easting);
        System.out.printf("Northing (Y):", northing);
        System.out.printf("Latitud: %.8f%n", dest.y);
        System.out.printf("Longitud: %.8f%n", dest.x);
       
       putm.setLatitud(dest.y);
       putm.setLongitud(dest.x);
        
       return putm;
   } 
    
    public static Point2D.Double calcularCentroide(List<Point2D.Double> puntos) {
        double area = 0;
        double cx = 0;
        double cy = 0;
        int n = puntos.size();

        for (int i = 0; i < n; i++) {
            Point2D.Double p1 = puntos.get(i);
            Point2D.Double p2 = puntos.get((i + 1) % n); // siguiente punto, con cierre

            double factor = (p1.x * p2.y - p2.x * p1.y);
            area += factor;
            cx += (p1.x + p2.x) * factor;
            cy += (p1.y + p2.y) * factor;
        }

        area *= 0.5;
        cx /= (6 * area);
        cy /= (6 * area);

        return new Point2D.Double(cx, cy);
    }// calcular centroide
    
     public static double calcularArea(List<Point2D.Double> puntos) {
        int n = puntos.size();
        if (n < 3) return 0; // No hay área con menos de 3 puntos

        double suma = 0;

        for (int i = 0; i < n; i++) {
            Point2D.Double p1 = puntos.get(i);
            Point2D.Double p2 = puntos.get((i + 1) % n); // Conecta último con primero
            suma += (p1.x * p2.y) - (p2.x * p1.y);
        }

        return Math.abs(suma) / 2.0;
    }
     
    public static int zoom(double area){
        int zoom =15;
        if(area<=6000){
           zoom=18;
        }
        if((area>6000) && (area<10000)){
            zoom=17;
        }
        if((area>10000)&&(area<20000)){
            zoom =16;
        }
        if(area>20000){
            zoom=15;
        }
        
        
        return zoom;
    }
    
    
    public static double calcularPerimetro(List<Point2D.Double> puntos) {
        double perimetro = 0.0;
        int n = puntos.size();
        if (n < 2) return 0.0;

        for (int i = 0; i < n - 1; i++) {
            Point2D.Double p1 = puntos.get(i);
            Point2D.Double p2 = puntos.get(i + 1);
            perimetro += p1.distance(p2);
        }

        // Si el polígono no está cerrado, conectar último con primero
        Point2D.Double pInicio = puntos.get(0);
        Point2D.Double pFin = puntos.get(n - 1);
        if (!pInicio.equals(pFin)) {
            perimetro += pFin.distance(pInicio);
        }

        return perimetro;
    }
   
    
    
    
}
