/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;


import java.io.StringReader;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;

import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;




/**
 *
 * @author csandoval
 */
public class FuncionesComunes {
    
      // Municipios máximos por departamento (INE Guatemala)
    private static final int[] MUNICIPIOS_POR_DEPARTAMENTO = {
        0, 17, 8, 16, 16, 13, 14, 19, 8, 24, 21, 9, 30, 32, 21, 8,
        17, 14, 5, 11, 30, 17, 8, 17 // hasta depto 22
    };
    
     public static boolean validarCUI(String cui) {
        // Debe tener exactamente 13 dígitos
        if (cui == null || !cui.matches("\\d{13}")) {
            return false;
        }

        // Extraer datos
        int depto = Integer.parseInt(cui.substring(9, 11));   // posiciones 10-11
        int muni  = Integer.parseInt(cui.substring(11, 13));  // posiciones 12-13

        // Validar departamento y municipio
        if (depto == 0 || depto > 22) {
            return false;
        }
        if (muni == 0 || muni > MUNICIPIOS_POR_DEPARTAMENTO[depto]) {
            return false;
        }

        // Validar dígito verificador (9° dígito)
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            int num = Character.getNumericValue(cui.charAt(i));
            suma += num * (9 - i);
        }

        int resto = suma % 11;
        int verificador = 11 - resto;
        if (verificador == 10) verificador = 0;
        if (verificador == 11) verificador = 1;

        int digitoReal = Character.getNumericValue(cui.charAt(8));

        return verificador == digitoReal;
    }

    
    
    public static boolean validarNIT(String nit) {
        // Limpiar formato (quitar guiones o espacios)
        nit = nit.replace("-", "").trim().toUpperCase();

        // El último caracter es el dígito verificador
        char digitoVerificador = nit.charAt(nit.length() - 1);
        String numeroBase = nit.substring(0, nit.length() - 1);

        int factor = numeroBase.length() + 1;
        int suma = 0;

        for (int i = 0; i < numeroBase.length(); i++) {
            int num = Character.getNumericValue(numeroBase.charAt(i));
            suma += num * (factor - i);
        }

        int modulo = (11 - (suma % 11)) % 11;

        char esperado;
        if (modulo == 10) {
            esperado = 'K';
        } else {
            esperado = Character.forDigit(modulo, 10);
        }

        return digitoVerificador == esperado;
    }
    
   
    
    /*
    public static void enviaPdfBinario(String expediente, String nombrePDF,String rutaConNombre){
        String exp = expediente.replaceAll(".","-");
        String nomPDF = nombrePDF.replaceAll(".pdf","");
        try {
            Database database = new org.exist.xmldb.DatabaseImpl(); 
            database.setProperty("create-database", "true");
            DatabaseManager.registerDatabase(database);
            
            // Conectarse
            String uri = "xmldb:exist://http://24.199.121.192:8082/exist/rest/db/"+exp+"/"+nomPDF;
            String user = "inab";
            String password = "Inab2025$";
            
            Collection col = DatabaseManager.getCollection(uri, user, password);
            
            if (col != null) {
                System.out.println("Conectado a eXist-db");
                Resource res = col.createResource(nombrePDF, "BinaryResource");
                FileInputStream fis = new FileInputStream(rutaConNombre);
                res.setContent(fis);
                col.storeResource(res);
                fis.close();
                
                col.close();
            } else {
                System.out.println("No se pudo conectar.");
            }
        } catch (XMLDBException ex) {
            Logger.getLogger(FuncionesComunes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FuncionesComunes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FuncionesComunes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    */  
    
    private static Date getDateExpiration(int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.HOUR, hours);
		return calendar.getTime();
	}
    
  
    
    
    public static String cifrar(String texto, String semilla) {
		String result = "";
		try {
			byte[] key = semilla.getBytes("UTF-8");
			key = Arrays.copyOf(key, 16);
			SecretKeySpec aesKey = new SecretKeySpec(key, "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(texto.getBytes());
			byte[] tmpByte = Base64.encodeBase64(encrypted);
			result = new String(tmpByte);
		} catch (Exception e) {
			result = "";
		}
		return result;
	}
    
    
    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }
        try {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static <T> T fromXml(String xml, Class<T> clazz) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        return clazz.cast(unmarshaller.unmarshal(reader));
    }
    
    public static <T> T convierteObjeto(Object ob, Class<T> clazz){                
        return clazz.cast(ob);
    }
    
    public static String convierteObjetoAXMLString(Object obj){
         String xmlComoString="";
        try {
            // Crear el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(obj.getClass());
            
            // Crear el marshaller
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            // Usar StringWriter para capturar la salida
            StringWriter sw = new StringWriter();
            marshaller.marshal(obj, sw);

            // Obtener el XML como String
            xmlComoString = sw.toString();
            
        } catch (JAXBException ex) {
            Logger.getLogger(FuncionesComunes.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        
        return  xmlComoString;       
    }
    
    
    
    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());

            // Convertimos los bytes a hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al calcular MD5", e);
        }
    }
    
}
