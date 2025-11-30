/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import mapas.Punto;
import mapas.Puntos;
import org.apache.poi.ss.usermodel.*;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author csandoval
 */
public class LeerArchivoExcel implements Serializable{
    
    
    
    public static String handleFileUpload(FileUploadEvent event) {
        UploadedFile file = event.getFile();
        
        Gson gs = new Gson();
        mapas.Puntos puntos = new Puntos();
        
       

        if (file != null) {
            try (InputStream input = file.getInputStream();
                 Workbook workbook = WorkbookFactory.create(input)) {

                Sheet sheet = workbook.getSheetAt(0); // primera hoja
                mapas.Punto punto=null;
                int bandera=0;
                for (Row row : sheet) {
                  
                   
                    int i=-1;
                    StringBuilder fila = new StringBuilder();
                    for (Cell cell : row) {
                         i=i+1;
                        if(i==0)
                        punto = new Punto();
                        
                       
                        System.out.println("indice ="+i);
                        double valor=0;
                        switch (cell.getCellType()) {
                            case STRING:
                                fila.append(cell.getStringCellValue());
                                break;
                            case NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    fila.append(cell.getDateCellValue());
                                } else {
                                    
                                    if(i==0){
                                        if(cell.getNumericCellValue()==1.0){
                                            bandera =1;
                                        }
                                        if(cell.getNumericCellValue()>1.0){
                                            bandera=0;
                                        }                                        
                                    }
                                    
                                    if((i==2)){
                                    fila.append(cell.getNumericCellValue());
                                    valor =  cell.getNumericCellValue();
                                    punto.setGTM_X(valor);
                                    }
                                    if((i==3)){
                                    fila.append(cell.getNumericCellValue());
                                    valor =  cell.getNumericCellValue();
                                    punto.setGTM_Y(valor);
                                    }
                                 
                                }
                                break;
                            case BOOLEAN:
                                fila.append(cell.getBooleanCellValue());
                                break;
                            case FORMULA:
                                fila.append(cell.getCellFormula());
                                break;
                            default:
                                fila.append("");
                        }
                        if(i==1){
                            
                        }
                        if(i==2){
                            
                        }
                        if(i==3){
                            
                        }
                        if(i==4){
                            i=0;
                              if(bandera==1)
                              puntos.getPuntos().add(punto);
                        }
                        fila.append(" | ");
                    }
                    System.out.println(fila);
                    
                }

                System.out.println("Archivo leído: " + file.getFileName());
                

            } catch (IOException e) {
                System.out.println("Error Archivo leído: " + e.getMessage());
                e.printStackTrace();
            }
        }
        
       return  gs.toJson(puntos.getPuntos());
    }
}
