/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import java.io.Serializable;

import estructuras.Licencias;
import estructuras.Observa;
import estructuras.especie_gestion_informe;
import estructuras.repoblacion_informe;
import estructuras.RespuestaSeccionUNO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author csandoval
 */
public class JSON  implements Serializable{
    
    private static SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
    
    
    public static String puntosJson(){
        
        String json="[\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":1,\n" +
            "      \"GTM_X\":770747,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":2,\n" +
            "      \"GTM_X\":770745,\n" +
            "      \"GTM_Y\":1623738,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":3,\n" +
            "      \"GTM_X\":770742,\n" +
            "      \"GTM_Y\":1623722,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":4,\n" +
            "      \"GTM_X\":770743,\n" +
            "      \"GTM_Y\":1623707,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":5,\n" +
            "      \"GTM_X\":770757,\n" +
            "      \"GTM_Y\":1623705,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":6,\n" +
            "      \"GTM_X\":770783,\n" +
            "      \"GTM_Y\":1623705,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":7,\n" +
            "      \"GTM_X\":770800,\n" +
            "      \"GTM_Y\":1623704,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":8,\n" +
            "      \"GTM_X\":770824,\n" +
            "      \"GTM_Y\":1623704,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":9,\n" +
            "      \"GTM_X\":770848,\n" +
            "      \"GTM_Y\":1623704,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":10,\n" +
            "      \"GTM_X\":770848,\n" +
            "      \"GTM_Y\":1623718,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":11,\n" +
            "      \"GTM_X\":770850,\n" +
            "      \"GTM_Y\":1623731,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":12,\n" +
            "      \"GTM_X\":770845,\n" +
            "      \"GTM_Y\":1623739,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":13,\n" +
            "      \"GTM_X\":770849,\n" +
            "      \"GTM_Y\":1623742,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":14,\n" +
            "      \"GTM_X\":770848,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":15,\n" +
            "      \"GTM_X\":770839,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":16,\n" +
            "      \"GTM_X\":770812,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":17,\n" +
            "      \"GTM_X\":770785,\n" +
            "      \"GTM_Y\":1623752,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":18,\n" +
            "      \"GTM_X\":770762,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   },\n" +
            "   {\n" +
            "      \"NO_POLIGONO\":2,\n" +
            "      \"NO\":19,\n" +
            "      \"GTM_X\":770747,\n" +
            "      \"GTM_Y\":1623753,\n" +
            "      \"ZONA\":15.5\n" +
            "   }\n" +
            "]";
        
        
        
        return json;
    }
    
      
    public static String busquedaPorDPI(String dpi){
        
        
        return " {\n" +
        "\"tipoBusquedaId\":1,\n" +
        "\"tituloBusqueda\":\"Ingrese el nombre de la persona\",\n" +
        "\"placeholderBusqueda\":\"Escriba al menos un nombre y un apellido\",\n" +
        "\"filtro\":\""+dpi.trim()+"\"\n" +
        "}";
        
        
    }   
      
    public static String busquedaPorNit(String nit){
        
        return " {\n" +
            "\"tipoBusquedaId\":2,\n" +
            "\"tituloBusqueda\":\"Ingrese el nombre de la persona\",\n" +
            "\"placeholderBusqueda\":\"Escriba al menos un nombre y un apellido\",\n" +
            "\"filtro\":\""+nit.replaceAll("-","")+"\"\n" +
         "}";
        
    }
      
    public static String buscaPersonaPorNombre(String nombre){
        
        return  "{\n" +
                "\"tipoBusquedaId\":3,\n" +
                "\"tituloBusqueda\":\"Ingrese el nombre de la persona\",\n" +
                "\"placeholderBusqueda\":\"Escriba al menos un nombre y un apellido\",\n" +
                "\"filtro\":\""+nombre+"\"\n" +
                "}";

        
    }
    
    public static String notasRobadas(RespuestaSeccionUNO ros, int idUsuario){
        
        return "{\n" +
            "    \"resultado\":true,\n" +
            "    \"descripcion\":\"Seccion5\",\n" +
            "    \"proceso\":\"ObtenerNotas\",\n" +
            "     \"parametros\":[\"ObtenerNotas\"],\n" +
            "    \"carga_util\":\"{  \\\"gestion\\\":"+ros.getGestion_id()+",   \\\"licencia\\\":\\\""+ros.getNumero_licencia_poa()+"\\\",       \\\"turno\\\":"+ros.getNumero_informe()+",    \\\"tipo_nota\\\":3,  \\\"idusuario\\\":"+idUsuario+"}\",\n" +
            "    \"carga_salida\":\"\"\n" +
        "}";
        
        
        
    }
    
    public static String datanombramiento067(int gestion_id,String licencia, int turno) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Nombramiento 067\",\n"
                + "    \"proceso\":\"getNombramiento067\",\n"
                + "    \"parametros\":[\"getNombramiento067\"],\n"
                +"      \"carga_util\":\"{\\\"gestion\\\":"+gestion_id+",   \\\"licencia\\\":\\\""+licencia+"\\\",       \\\"turno\\\":"+turno+"}\","
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    public static String jsonPuntoGis(){
        return "{\n" +
"    \"resultado\": true,\n" +
"    \"descripcion\": \"poligono cargado\",\n" +
"    \"info\": \"FINCA DE CARLOS SANDOVAL\",\n" +
"    \"punto\": {\n" +
"        \"latitud\": \"14.60199023487578\",\n" +
"        \"longitud\": \"-90.50273937852219\"\n" +
"    }\n" +
"}";
        
    }
    
    public static String obtenerMunicipiosDeps(){
        
        return "{\n" +
            "    \"resultado\":true,\n" +
            "    \"descripcion\":\"prueba\",\n" +
            "    \"proceso\":\"getListaDeptosMunis\",\n" +
            "    \"parametros\":[\"getListaDeptosMunis\"],\n" +
            "    \"carga_salida\":\"\"\n" +
            "}";
    }
    public static String obtenerNotasCompletas(RespuestaSeccionUNO ros, String tipos) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"getNotasPorInforme\",\n"
                + "     \"parametros\":[\"getNotasPorInforme\",\"" + ros.getGestion_id() + "\",\"" + ros.getNumero_licencia_poa() + "\",\"" + ros.getTurno_reportado() + "\",\"" + tipos + "\"],\n"
                + "    \"carga_util\":\"\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String obtenerVolumnesAutorizados(RespuestaSeccionUNO ros, int idUsuario) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion2\",\n"
                + "    \"proceso\":\"getDescripcionVolumenes\",\n"
                + "     \"parametros\":[\"getDescripcionVolumenes\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",       \\\"turno\\\":" + ros.getTurno_reportado() + ",\\\"idusuario\\\":" + idUsuario + "}\"    \n"
                + "}";
    }

    public static String obtenerRangoNotasPorGestion(RespuestaSeccionUNO ros) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"getRangoNotas\",\n"
                + "     \"parametros\":[\"getRangoNotas\"," + ros.getGestion_id() + "],\n"
                + "    \"carga_util\":\"\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String insertarActualizarRodal(RespuestaSeccionUNO ros, estructuras.lista_rodales rod, int idUsuario) {

        String repoblacion = " ";
        String esp = " ";
        for (repoblacion_informe s : rod.getRepoblacion_informe()) {
            repoblacion = repoblacion + "," + s.getRepoblacion_id();
        }
        String rep = repoblacion.substring(1);

        for (especie_gestion_informe t : rod.getEspecie_gestion_informe()) {
            esp = esp + "," + t.getEspecie_id();
        }
        String especie = esp.substring(1);

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion3\",\n"
                + "    \"proceso\":\"InsertarRodales\",\n"
                + "     \"parametros\":[\"InsertarRodales\"],\n"
                + "    \"carga_util\":\"{    \\\"gestion\\\":" + ros.getGestion_id() + ",    \\\"licencia\\\": \\\"" + ros.getNumero_licencia_poa() + "\\\",    \\\"turno\\\":" + ros.getTurno_reportado() + ",    \\\"idusuario\\\":" + idUsuario + ",    \\\"rodal\\\": {        \\\"id\\\":" + rod.getId() + ",        \\\"id_rodal\\\":" + rod.getId_rodal() + ",        \\\"area_informe\\\":" + rod.getArea_informe() + ",        \\\"ubicacionx\\\": \\\"" + rod.getUbicacionx() + "\\\",        \\\"ubicaciony\\\": \\\"" + rod.getUbicaciony() + "\\\",        \\\"densidad_informe\\\":" + rod.getDensidad_informe() + ",        \\\"otros\\\": \\\"" + rod.getOtros() + "\\\",        \\\"repoblacion_informe\\\": \\\"" + rep + "\\\",        \\\"especie_gestion_informe\\\": \\\"" + especie + "\\\"    }}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String obtenerRodales(estructuras.RespuestaSeccionUNO ros, int idUsuario) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion3\",\n"
                + "    \"proceso\":\"getRodalesGestion\",\n"
                + "     \"parametros\":[\"getRodalesGestion\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",       \\\"turno\\\":" + ros.getTurno_reportado() + ",\\\"idusuario\\\":" + idUsuario + "}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String eliminarTexto(estructuras.Observa ob) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"EliminarTexto\",\n"
                + "    \"proceso\":\"EliminarTexto\",\n"
                + "    \"parametros\":[\"EliminarTexto\",\"" + ob.getId() + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String consultaTextos(estructuras.RespuestaSeccionUNO ros, int idUsuario, int tipoTexto) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"ObtenerTextos\",\n"
                + "     \"parametros\":[\"ObtenerTextos\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",       \\\"turno\\\":" + ros.getTurno_reportado() + ",    \\\"tipo_texto\\\":" + tipoTexto + ", \\\"idusuario\\\":" + idUsuario + "}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String insertaTextoObserva(estructuras.RespuestaSeccionUNO ros, Observa ob, int idUsuario, int tipoTexto, Integer tipoProteccion) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"InsertarTextos\",\n"
                + "     \"parametros\":[\"InsertarTextos\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",       \\\"turno\\\":" + ros.getTurno_reportado() + ",    \\\"tipo_texto\\\":" + tipoTexto + ",\\\"textos\\\":{\\\"id\\\":" + ob.getId() + ",\\\"tipo_texto\\\":" + tipoTexto + ",\\\"tipo_proteccion\\\":" + tipoProteccion + ",\\\"texto\\\":\\\"" + ob.getDto() + "\\\"} , \\\"idusuario\\\":" + idUsuario + "}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String obtieneNotasExtraviadas(RespuestaSeccionUNO ros, int idUsuario) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion5\",\n"
                + "    \"proceso\":\"ObtenerNotas\",\n"
                + "     \"parametros\":[\"ObtenerNotas\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",\\\"turno\\\":" + ros.getTurno_reportado() + ",\\\"tipo_nota\\\":3,  \\\"idusuario\\\":" + idUsuario + "}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String eliminarNotaPorID(int id) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"EliminarNota\",\n"
                + "    \"proceso\":\"EliminarNota\",\n"
                + "    \"parametros\":[\"EliminarNota\",\"" + id + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    public static String insertaNotaUtilizada(estructuras.NotaInformeFinal notaI, RespuestaSeccionUNO ros, int idUsuario, int utilizada) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"InsertarNotas\",\n"
                + "     \"parametros\":[\"InsertarNotas\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\", \\\"turno\\\": " + ros.getTurno_reportado() + ",    \\\"tipo_nota\\\":" + utilizada + ",\\\"notas\\\":{\\\"id\\\":" + notaI.getId() + ",  \\\"tipo_nota\\\":" + utilizada + " ,\\\"numero_nota\\\":" + notaI.getNumero_nota() + "  ,\\\"fecha\\\":\\\"" + formato.format(notaI.getFecha()) + "\\\",\\\"producto\\\":\\\" " + notaI.getProducto() + "  \\\",\\\"especie_id\\\":" + notaI.getEspecie_id() + ",\\\"volumen\\\":\\\" " + notaI.getVolumen() + "  \\\",\\\"destino\\\":\\\"" + notaI.getDestino() + "\\\",\\\"codigo_depmuni\\\":" + notaI.getCodigo_depmuni() + ",\\\"municipio_departamento_desc\\\":\\\"" + notaI.getMunicipio_departamento_desc() + "\\\",\\\"motivo_extravio\\\":\\\" " + notaI.getMotivo_extravio() + "\\\"}  , \\\"idusuario\\\":" + idUsuario + " }\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";

    }

    public static String consultaNotasPorGestionID(RespuestaSeccionUNO ros, int turno, int tipo, int idUsuario) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"ObtenerNotas\",\n"
                + "     \"parametros\":[\"ObtenerNotas\"],\n"
                + "    \"carga_util\":\"{  \\\"gestion\\\":" + ros.getGestion_id() + ",   \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",\\\"turno\\\":" + turno + ",\\\"tipo_nota\\\":" + tipo + ",  \\\"idusuario\\\":" + idUsuario + "}\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    public static String seccionUno(String gestion_id) {

        return "{\n" +
"    \"resultado\":true,\n" +
"    \"descripcion\":\"prueba\",\n" +
"    \"proceso\":\"getDatos_Licencia\",\n" +
"    \"parametros\":[\"getDatos_Licencia\",\""+gestion_id+"\"],\n" +
"    \"carga_salida\":\"\"\n" +
"}";
        
        /*
        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"prueba\",\n"
                + "    \"proceso\":\"InformeSeccion1\",\n"
                + "    \"parametros\":[\"getInforme_seccion1\",\"" + gestion_id + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
        
        */
    }

    public static String creaSolicitud(estructuras.RespuestaSeccionUNO ros, String tpi1, String tpi2, Date fechaIni, Date fechaFin, int idUsuario) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
        return " {\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"prueba\",\n"
                + "    \"proceso\":\"Nombramiento\",\n"
                + "     \"parametros\":[\"crearInforme\"],\n"
                + "    \"carga_util\":\"{    \\\"expediente\\\":\\\"" + ros.getExpediente() + "\\\",    \\\"gestion\\\":" + ros.getGestion_id() + ",    \\\"tipo_licencia\\\":" + ros.getTipo_licencia() + ",    \\\"licencia\\\":\\\"" + ros.getNumero_licencia_poa() + "\\\",\\\"redimiento_madera_aserrada\\\":0,    \\\"tipo_sierra\\\":0,    \\\"sierra_secundaria\\\":0,    \\\"rendimiento_carbon\\\":0,    \\\"carbon_factor\\\":0.0,    \\\"carbon_resolucion\\\":\\\"\\\",    \\\"tipo_informe\\\": " + tpi1 + ", \\\"tipo_informe2\\\":" + tpi2 + ",   \\\"fecha_inicio\\\":\\\"" + formato.format(fechaIni) + "\\\",    \\\"fecha_final\\\":\\\"" + formato.format(fechaFin) + "\\\",    \\\"idusuario\\\": " + idUsuario + " }\",\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    public static String inicio(int idUsuario) {
        return "{\n"
                + "    \"resultado\": false,\n"
                + "    \"descripcion\": \"\",\n"
                + "    \"proceso\": \"nombramiento\",\n"
                + "    \"parametros\": [\n"
                + "        \"getLicenciasMonitoreoPorUsuarioPerfil\",\n"
                + "        "+idUsuario+",\n"
                + "        2\n"
                + "    ],\n"
                + "    \"carga_salida\": \"\"\n"
                + "}";
    }
    
    
     public static String inicio(String idUsuario, int perfil) {
        return "{\n"
                + "    \"resultado\": false,\n"
                + "    \"descripcion\": \"\",\n"
                + "    \"proceso\": \"nombramiento\",\n"
                + "    \"parametros\": [\n"
                + "        \"getLicenciasMonitoreoPorUsuarioPerfil\",\n"
                + "        "+idUsuario+",\n"
                + "        "+perfil+"\n"
                + "    ],\n"
                + "    \"carga_salida\": \"\"\n"
                + "}";
    }

    public static String obtenerEspeciesPorGestionID(int gestion_ID) {

        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Seccion4\",\n"
                + "    \"proceso\":\"ObtenerNotas\",\n"
                + "    \"parametros\":[\"getEspecieGestion\",\"" + gestion_ID + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    /**
     * *
     *
     * @param idUsur
     * @return
     */
    public static String consultaEtapa(String idUsur) {
        return "{\n"
                + "    \"idEmpleado\":" + idUsur
                + ",\n "
                + " \"proceso\":\"PRO-07\"\n"
                + "}";
    }

    /**
     * *
     *
     * @param idUser
     * @return
     */
    public static String consultaSubregionPorUsuario(String idUser) {
        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"Consulta\",\n"
                + "    \"proceso\":\"Datos\",\n"
                + "    \"parametros\":[\"getDatosSubregionUsuario\",\"" + idUser + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }
    

    /**
     * *
     *
     * @param idSubregion
     * @return
     */
    public static String consultaTecnticosPorSubregion(String puesto, int idSubregion) {
        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"prueba\",\n"
                + "    \"proceso\":\"Oficio\",\n"
                + "    \"parametros\":[\"" + puesto + "\",\"" + idSubregion + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }
    
     /**
     * *
     *
     * @param idSubregion
     * @return
     */
    public static String consultaSecretariasPorSubregion(String puesto, int idSubregion) {
        return "{\n"
                + "    \"resultado\":true,\n"
                + "    \"descripcion\":\"prueba\",\n"
                + "    \"proceso\":\"Oficio\",\n"
                + "    \"parametros\":[\"" + puesto + "\",\"" + idSubregion + "\"],\n"
                + "    \"carga_salida\":\"\"\n"
                + "}";
    }

    /**
     * *
     *
     * @param idUserActual
     * @param idUserSiguiente
     * @param userActual
     * @param userSiguiente
     * @param proceso
     * @param perfilOrigen
     * @param perfilDestino
     * @param sha1
     * @param motivo
     * @param estado
     * @return
     */
    public static String siguientePaso(String idUserActual, String idUserSiguiente, String userActual, String userSiguiente, String proceso, String perfilOrigen, String perfilDestino, String sha1, String motivo, String estado) {
        return "{\n"
                + "   \"idUsuarioActual\":" + idUserActual + ",\n"
                + "   \"idUsuarioSiguiente\":" + idUserSiguiente + ",\n"
                + "   \"usuarioActual\": \"" + userActual + "\",\n"
                + "   \"usuarioSiguiente\":\"" + userSiguiente + "\",\n"
                + "   \"proceso\":\"" + proceso + "\",\n"
                + "   \"usuarioAutentico\":\"" + userActual + "\",\n"
                + "   \"perfilDestino\":\"" + perfilDestino + "\",\n"
                + "   \"perfilOrigen\":\"" + perfilOrigen + "\",\n"
                + "   \"sha1\":\"" + sha1 + "\",\n"
                + "   \"motivo\":\"" + motivo + "\",\n"
                + "   \"estado\":" + estado + "\n"
                + "}";
    }
    
    public static String buscarSecretriasSubregion(String idSubregion){
        
        return " {\n" +
                "  \"resultado\":true,\n" +
                "  \"descripcion\":\"prueba\",\n" +
                "  \"proceso\":\"Oficio\",\n" +
                "  \"parametros\":[\"getSecretariasPorSubregion\","+idSubregion+"],\n" +
                "  \"carga_salida\":\"\"\n" +
                "}";
    }
    
}
