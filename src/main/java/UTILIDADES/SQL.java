/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import estructuras.HISTORICO.DocumentoInab.Historico.Items.Item;
import java.io.Serializable;
import lire042.DocumentoInab.SolicitudActualizacion.Contenido.Modificaciones.Detalle;

/**
 *
 * @author csandoval
 */




public class SQL implements Serializable{
    
    
    public static String listaTipoCobertura(){
        return "select * from manejo2.tc_tipo_cobertura limit 200";
    }
    
    public static String listaTratamientoSilvicultura(){
        
        return "select * from manejo2.tc_tratamiento_silvicultural limit 200";
    }
            
            
      public static String todosClaseDesarrollo(){          
          return "  select clase_desarrollo_id clasedesarrolloid, clase_desarrollo_desc clasedesarrollodesc,\n" +
"  codigo_clase codigoclase, estado_id estadoid, fecha_registro fecharegistro, ocultar ocultar   from tc_clase_desarrollo where ocultar =0 limit 500";
      }
    
      public static String llamaJuridicoPorId(int id, int subregion, int idPerfil){

      return "  select tu.usuario_id dato1,tu.usuario dato2,tu.usuario_desc dato3,CONCAT(tsr.alias,' ',tsr.subregion_desc,', ' ,tmun.municipio_desc,', ',tdep.departamento_desc) dato4 , \n" +
"                 tpp.perfil_desc dato5 \n" +
"                 from manejo2.tc_usuario tu \n" +
"                 inner join manejo2.tc_usuario_perfil_sistema tups ON tu.usuario_id=tups.usuario_id \n" +
"                 inner join manejo2.tc_persona tp ON tu.usuario_id=tp.usuario_id \n" +
"                 inner join manejo2.tc_usuario_subregion tus ON tp.persona_id=tus.persona_id \n" +
"                 inner join manejo2.tc_subregion tsr ON tus.subregion_id=tsr.subregion_id \n" +
"                 inner join manejo2.tc_municipio tmun ON tsr.municipio_id=tmun.municipio_id \n" +
"                 inner join  manejo2.tc_departamento tdep ON  tmun.departamento_id=tdep.departamento_id \n" +
"                 inner join manejo2.tc_perfil tpp on tups.perfil_id = tpp.perfil_id\n" +
"                 Where tu.estado_id=1 \n" +
"                 and tups.perfil_id="+idPerfil +" \n" +
"                 and tus.subregion_id="+subregion +" \n" +
"                 and tu.usuario_id="+id + " \n "
                + "limit 1" ;
    }
     
    public static String busquedaUsuarioPorId(int id){
        
        return " select * from manejo2.tc_usuario where usuario_id ="+id;
    }
    
    public static String especiesFormula(){
        
        return "select nombre_cientifico dato, ecuacion valor from manejo2.tc_especie  limit 2000";
    }
    
    public static String listaTipoInventario(){
        
        return "select * from tc_tipo_inventario";
    }

    public static String origenCalculos(){
     return "select * from tc_origen_calculo";
    }
    
    public static String medidasProteccionGestionId(String gestion_id){
        return "select area_critica dato1, combustible dato2, control_plaga dato3, cortafuego dato4,justificacion dato5, justificacion_pf dato6, monitoreo_plaga dato7, respuesta_if dato8, vigilancia dato9  from tt_proteccion_gestion where gestion_id="+gestion_id;
    }

    public static String criterioProteccion(){
        return"select * from tc_criterio_proteccion limit 50;";
    }
    
    public static String tipoBosque(){
        return"select * from tc_tipo_bosque limit 50;";
    }
    
    public static String usoFinca(){
        return"select * from tc_uso_finca limit 50;";
    }
    
    public static String sistemaCorta(){
        return "select * from tc_sistema_corta limit 20;";
    }
    
    public static String todasLasGarantias(){
        
        return "select * from tc_tipo_garantia limit 200";
    }
    
    public static String consultaCentroFinca(String id_gestion){
        
        return "select latitud dato1, longitud dato2 from manejo2.geolocalizacion where id_gestion = "+id_gestion+" order by 1 desc limit 1 ";
    }
    
    public static String actualizaTablaCentroGeopolizacion(int id_gestion, double latitud, double longitud){
        return "update manejo2.geolocalizacion set latitud ='"+latitud+"' , longitud ='"+longitud+"' where id_gestion ="+id_gestion;
    }
    
    public static String tiposPropiedad(){
        
        return "select tipo_propiedad_id,es_propiedad,estado_id,fecha_registro,tipo_propiedad_desc, grupo_id, observaciones\n" +
               " from manejo2.tc_tipo_propiedad where grupo_id=1";        
    }
    
    public static String consultaPuntosPorIdGestion(int id_gestion){
        
        return "select id_gestion dato1, correlativo dato2, json_finca dato3, fecha_creacion dato4 from manejo2.geolocalizacion where id_gestion ="+id_gestion+" order by correlativo desc limit 1";
    }
        
    public static String insertaPuntosFinca(int id_gestion,String latitud, String longitud,String json){
        
        return "insert into manejo2.geolocalizacion (\n" +
"    id_gestion,\n" +
"    correlativo,\n" +
"    latitud,\n" +
"    longitud,\n" +
"    json_finca,\n" +
"    fecha_creacion\n" +
")\n" +
"SELECT\n" +
"    "+id_gestion+" AS id_gestion,\n" +
"    COALESCE(MAX(correlativo), 0) %2B 1,\n" +
"    '"+latitud+"',\n" +
"    '"+longitud+"',\n" +
"    '"+json+"',\n" +
"    SYSDATE()\n" +
" FROM manejo2.geolocalizacion\n" +
" WHERE id_gestion = "+id_gestion;
    }
    
    public static String tipoNotificacionPorID(String id){
        
        return "select  tipo_notificacion_desc dato1  ,es_direccion dato2 ,es_obligatorio dato3,maxlength dato4, type dato5 \n" +
               " from manejo2.tc_tipo_notificacion where tipo_notificacion_id="+id;
        
    }
    
    public static String datosPersonaGestionUltimoRegistro(){
        
      return "select (persona_gestion_id %2B 1)  data1, sysdate() data2, (persona_id %2B 1) data3, ''data4 , '' data5 \n" +
             "  from manejo2.tt_persona_gestion order by 1 desc limit 1";
    }
    
    
    public static String todosSexos(){
        
        return "select * from manejo2.tc_sexo";
    }
    
    public static String todosEstados(){
        
        return "select * from manejo2.tc_estado_civil";
    }
    
    public static String todosCuolturas(){
        return "select * from manejo2.tc_cultura";
    }
    
    public static String todosLosIdiomas(){
        
        return "select * from manejo2.tc_idioma where estado_id =1 limit 100 ";
    }
    
    public static String todosLosMunicipiosPorIdDepartamento(int departamento_id){
        
        return "select * from manejo2.tc_municipio where departamento_id ="+departamento_id;
        
    }
    
    public static String todosLosDepatamentos(){
        return "select departamento_id,departamento_desc,estado_id,fecha_registro,pais_id from manejo2.tc_departamento where estado_id = 1 and pais_id =1 and departamento_id>0 limit 30";
    }    
    
    public static String todasLasOcuaciones(){

        return "select * from manejo2.tc_ocupacion where estado_id=1 order by ocupacion_id asc limit 500 ";
    }


    
      public static String obtieneTcUsuarioPorId(String idUsuario, String tabla){
        return "  SELECT DISTINCT  "+tabla+".*\n" +
" FROM manejo.tc_usuario tu\n" +
" JOIN manejo.tc_persona tp ON tp.usuario_id = tu.usuario_id\n" +
" JOIN manejo.tc_usuario_perfil_sistema tup ON tup.usuario_id = tu.usuario_id\n" +
" JOIN manejo.tc_perfil tper ON tper.perfil_id = tup.perfil_id\n" +
" JOIN tc_municipio m ON m.municipio_id = tp.municipio_id\n" +
" JOIN tc_departamento d  ON d.departamento_id= m.departamento_id\n" +
" JOIN tc_subregion_municipio  sub  ON sub.municipio_id = tp.municipio_id\n" +
" JOIN tc_subregion sb ON sb.subregion_id = sub.subregion_id \n" +
" WHERE tu.usuario_id = "+idUsuario+" and tup.estado_id=1 and sb.municipio_id = tp.municipio_id ";
      }
      
      public static String obtieneMenuPrincipalPorIdUsuario(String idUsuario){ //cambio hoy 
          
          return " select e.nombre_corto nombre, d.url_menu valor , e.icono icono  \n" +
"  from manejo2.tc_usuario a, \n" +
"  manejo2.tc_persona b, manejo2.tc_usuario_perfil_sistema c,\n" +
"  manejo.tc_menu_perfil_sistema d,\n" +
"  manejo.tc_menu e\n" +
"  where a.usuario_id='"+idUsuario+"' and b.usuario_id=a.usuario_id and c.usuario_id= b.usuario_id\n" +
"  and c.usuario_id = a.usuario_id and c.sistema_id=3 and c.estado_id=1 \n" +
"  and c.perfil_id = d.perfil_id and d.codigo_pantalla=5000\n" +
"  and e.menu_id = d.menu_id limit 500 ";
      }
    
      
      
      public static String catalogoUsuarioPorId(String idUsuario){
          
          return " select DISTINCT   tper.perfil_desc dato, tup.perfil_id valor from manejo.tc_usuario tu, manejo.tc_persona tp, manejo.tc_usuario_perfil_sistema tup, manejo.tc_perfil tper \n" +
                 " where tu.usuario_id= tp.usuario_id and  tup.usuario_id=tu.usuario_id\n" +
                 " and  tper.perfil_id = tup.perfil_id  and tu.usuario_id="+idUsuario;
      }
      
      
      public static String buscarLicencia(String lic){
          
          return " select DISTINCT t.gestion_id dato,s.numero_resolucion valor\n" +
                 " from tt_seguimiento_tarea s,\n" +
                 " tt_tarea t \n" +
                 " where s.numero_resolucion='"+lic.trim()+"'\n" +
                 " and t.tarea_id=s.tarea_id";
          
      }
      
      public static String insertaGestion(lire042.DocumentoInab docInab){
          
          int pasos=0,paso_actual=0;
          if(docInab.getProceso().compareTo("PROC9")==0){
              pasos= 12;
          }
          
          if(docInab.getPaso().compareTo("PASO1")==0){
              paso_actual=1;
          }
          
          String md5 = UTILIDADES.FuncionesComunes.md5(String.valueOf(docInab.getIdGestion()));
          
          return " insert into manejo2.control_procesos_wf (gestion_id,"
               + " licencia,proceso,fecha_modificacion,estado,total_pasos,paso_actual,"
               + " sha,paso1,paso2,paso3,paso4,paso5,paso6,paso7,paso8,"
               + " paso9,paso10,paso11,paso12,paso13,paso14,paso15,paso16,"
               + " descripcion,personalizado1,personalizado2)"
               + " values ("+docInab.getIdGestion()+",'"+docInab.getLicencia()+"',"
               + " '"+docInab.getProceso()+"',sysdate(),1,"+pasos+","+paso_actual+","
               + " '"+md5+"','"+paso_actual+"','0','0','0','0','0','0','0','0','0','0','0','0','0'"
               + " ,'0','0','"+docInab.getNombreEsquema()+"','','') ";
          
      }
      
      public static String insertaGestionDetalle(lire042.DocumentoInab docInab, String rutaNombre,estructuras.PefilInab per){
          String s="";
          for (Detalle d: docInab.getSolicitudActualizacion().getContenido().getModificaciones().getDetalle()){
              s = s +"|"+d.getValue();
          }
          if(s==null)
              s="";
          return "  insert into manejo2.control_procesos_wf_detalle (gestion_id,licencia,estado,urlDocumento,"
               + "  idUsuarioActual,idUsuarioSiguiente,idUsuarioAnterior,descripcion,"
               + "  expediente,perfil,nombreUsuarioCreo,personalizado,pasoActual) values "
               + "  ("+docInab.getIdGestion()+",'"+docInab.getLicencia()+"',1,'"+rutaNombre+"',"               
               + "  "+per.getTcUsuario().getUsuarioId()+",0,0,'"+s+"','"+docInab.getExpediente()+"',"
               + " '"+per.getTcPerfilConectado().getPerfilDesc()+"','"+per.getTcUsuario().getUsuarioDesc()+"','"+docInab.getProceso()+"',"
               + " "+docInab.getPaso().replaceAll("PASO","")+")";
          
      }
      
      
       public static String insertaGestionDetalle080(lire080.DocumentoInab docInab, String rutaNombre,estructuras.PefilInab per){
        
         
          return "  insert into manejo2.control_procesos_wf_detalle (gestion_id,licencia,estado,urlDocumento,"
               + "  idUsuarioActual,idUsuarioSiguiente,idUsuarioAnterior,descripcion,"
               + "  expediente,perfil,nombreUsuarioCreo,personalizado,pasoActual) values "
               + "  ("+docInab.getIdGestion()+",'"+docInab.getLicencia()+"',1,'"+rutaNombre+"',"               
               + "  "+per.getTcUsuario().getUsuarioId()+","+per.getListSubRegional().get(0).getUsuarioId()+",0,'','"+docInab.getExpediente()+"',"
               + " '"+per.getTcPerfilConectado().getPerfilDesc()+"','"+per.getTcUsuario().getUsuarioDesc()+"','"+docInab.getProceso()+"',"
               + " "+(Integer.parseInt(docInab.getPaso().replaceAll("PASO","")+1))+")";
          
      }
      
            
      public static String consultaGestionIniciada(int idGestion, String licencia, String proceso){          
          return " select gestion_id dato, licencia valor from manejo2.control_procesos_wf "
               + " where gestion_id ="+idGestion+" and upper(proceso) ='"+proceso.toUpperCase()+"' "
               + " and licencia ='"+licencia+"'  limit 1 ";
      }
      
      public static String consultaDetalle(estructuras.HISTORICO.DocumentoInab doc,int idUsuarioActual){
          
          return " select urlDocumento data1,idUsuarioActual dato2,nombreUsuarioCreo dato3,pasoActual dato4,"
                  + " perfil dato5 " +
                 " from manejo2.control_procesos_wf_detalle "
               + " where gestion_id="+doc.getActual().getGestionId()+" and "
               + " licencia ='"+doc.getActual().getLicencia()+"' and "
               + " personalizado='"+doc.getActual().getProceso()+"'  "
               + " order by pasoActual desc limit 1";                    
      }
      
      public static String consultaDetalle2(estructuras.HISTORICO.DocumentoInab doc,int idUsuarioActual){
          
          return " select urlDocumento data1,idUsuarioActual dato2,nombreUsuarioCreo dato3,pasoActual dato4,"
                  + " idUsuarioAnterior dato5 " +
                 " from manejo2.control_procesos_wf_detalle "
               + " where gestion_id="+doc.getActual().getGestionId()+" and "
               + " licencia ='"+doc.getActual().getLicencia()+"' and "
               + " personalizado='"+doc.getActual().getProceso()+"' and  idUsuarioActual="+idUsuarioActual
               + " order by pasoActual desc limit 1";                    
      }
      
      
      
      public static String consultaSubregionPorGestionID(String gestionId){
          
         return " select DISTINCT ts.subregion_id dato1, ts.alias dato2,d.departamento_desc dato3,ts.region_id dato4 , ts.subregion_desc dato5\n" +
                " from \n" +
                " tc_municipio m, \n" +
                " tc_departamento d, \n" +
                " tt_finca_gestion g,\n" +
                " tc_subregion_municipio tm,\n" +
                " tc_subregion ts\n" +
                " where m.municipio_id=g.municipio_emite_id and d.departamento_id= m.departamento_id\n" +
                " and g.gestion_id="+gestionId+" and tm.municipio_id = g.municipio_emite_id and tm.estado_id=1\n" +
                " and ts.subregion_id=tm.subregion_id and ts.estado_id =1; ";
          
          
      }
      
      public static String actualizaTablaWorkFlow( estructuras.HISTORICO.DocumentoInab doc, int paso){
          String s="",p="";
          s = " update manejo2.control_procesos_wf set paso_actual="+paso +
                 ""; 
          if(paso==2){
              
              p="paso2=1,paso3=0,paso4=0,paso5=0,paso6=0,paso7=0,paso8=0,paso9=0,paso10=0,paso11=0,paso12=0";
          }
          if(paso==3){
              p="paso2=1,paso3=1,paso4=0,paso5=0,paso6=0,paso7=0,paso8=0,paso9=0,paso10=0,paso11=0,paso12=0";
          }
          
          
           s = s +","+p+","+
                 " personalizado1= sysdate() where gestion_id="+doc.getActual().getGestionId() +
                 " and licencia ='"+doc.getActual().getLicencia()+"' and estado=1 " +
                 " and paso_actual ="+(paso-1)+""+
                 " and proceso='"+doc.getActual().getProceso()+"'";
          
          return s;
      }
      
      
      public static String insertaGestionDetalleGeneral(estructuras.HISTORICO.DocumentoInab doc, int idUsuarioActual, estructuras.GEnericaCincoCampos cinco){
          
    return "  insert into manejo2.control_procesos_wf_detalle (gestion_id,licencia,estado,urlDocumento,"
         + "  idUsuarioActual,idUsuarioSiguiente,idUsuarioAnterior,descripcion,  "
         + "  expediente,perfil,nombreUsuarioCreo,personalizado,pasoActual) values"
         + "  ("+doc.getActual().getGestionId()+",'"+doc.getActual().getLicencia()+"',1,"
         + "   '"+doc.getActual().getUrlDocumento()+"',"+idUsuarioActual+",0,"+cinco.getDato2()+",'Trazlado',"
         + "   '"+doc.getActual().getExpediente()+"','"+cinco.getDato5()+"','"+cinco.getDato3()+"',"
         + "  '"+doc.getActual().getProceso()+"',"+(Integer.parseInt(cinco.getDato4().toString().replaceAll(".0",""))+1)+") "; 
            
          
          
          
      } 
      
      public static String consultaSolicitanteporIdGestionyPaso(int idGestion, int paso){
          
          return " select urlDocumento dato1, idUsuarioActual dato2, control_procesos_wf_detalle dato3,"
                  + " descripcion dato4, personalizado dato5 " +
                    " from manejo2.control_procesos_wf_detalle"
                  + " where pasoActual="+paso+" and gestion_id ="+idGestion+" order by 1 asc limit 1  ";
      }
      
      public static String notificarPorGestionID(int gestion_id){
          
          return "  select notificacion_gestion_id dato , notificacion_gestion_desc valor " +
                 "  from manejo2.tt_notificacion_gestion where gestion_id ="+gestion_id +" order by 1 asc";
          
          
      }
      
      public static String buscaJuridicosPorSubregion(String subregion_id){
          
          return "select tu.usuario_id dato1,tu.usuario dato2,tu.usuario_desc dato3,CONCAT(tsr.alias,' ',tsr.subregion_desc,', ' ,tmun.municipio_desc,', ',tdep.departamento_desc) dato4 , tp.correo dato5 " +
                 "from manejo2.tc_usuario tu " +
                 "inner join manejo2.tc_usuario_perfil_sistema tups ON tu.usuario_id=tups.usuario_id " +
                 "inner join manejo2.tc_persona tp ON tu.usuario_id=tp.usuario_id " +
                 "inner join manejo2.tc_usuario_subregion tus ON tp.persona_id=tus.persona_id " +
                 "inner join manejo2.tc_subregion tsr ON tus.subregion_id=tsr.subregion_id " +
                 "inner join manejo2.tc_municipio tmun ON tsr.municipio_id=tmun.municipio_id " +
                 "inner join  manejo2.tc_departamento tdep ON  tmun.departamento_id=tdep.departamento_id " +
                 "Where tu.estado_id=1 " +
                 "and tups.perfil_id=6 " +
                 "and tus.subregion_id="+subregion_id;          
      }
      
      public static String fincaPorGestionID (String gestion_id){
          
          return " select f.direccion dato1, f.finca_desc dato2, muni.municipio_desc dato3, dep.departamento_desc dato4, f.finca_id  dato5 " +
                 " from manejo2.tt_finca_gestion fg, manejo2.tc_finca f, manejo2.tc_municipio muni  ,manejo2.tc_departamento dep " +
                 " where fg.gestion_id = "+gestion_id+" and fg.finca_id = f.finca_id and muni.municipio_id = fg.municipio_emite_id and muni.departamento_id = dep.departamento_id";          
      }
      
      public static String archivosPorEscenario(int escenario){
          
          return " select catalogo_archivos_id data1,nombre data2,fecha data3,  escenario data4, escenario data5 from manejo2.catalogo_archivos where estado=1 and escenario ="+escenario;
      }
       
}