/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILIDADES;

import java.io.Serializable;

/**
 *
 * @author WINDOWS
 */
public class UtilidadesCarga implements Serializable{
    
    public static String jsonUSOFinca ="[\n" +
"      {\n" +
"         \"usoFincaId\":1,\n" +
"         \"usoFincaDesc\":\"Forestal\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:26:29.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":2,\n" +
"         \"usoFincaDesc\":\"Agricultura\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:26:37.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":3,\n" +
"         \"usoFincaDesc\":\"Ganadería\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:26:46.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":4,\n" +
"         \"usoFincaDesc\":\"Agroforestal\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:26:57.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":5,\n" +
"         \"usoFincaDesc\":\"Área de humedales\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":6,\n" +
"         \"usoFincaDesc\":\"Área limpia\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":7,\n" +
"         \"usoFincaDesc\":\"Otros\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":8,\n" +
"         \"usoFincaDesc\":\"Matorrales\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":9,\n" +
"         \"usoFincaDesc\":\"Construcción\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":10,\n" +
"         \"usoFincaDesc\":\"Plantación voluntaria\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      },\n" +
"      {\n" +
"         \"usoFincaId\":11,\n" +
"         \"usoFincaDesc\":\"Plantación obligatoria\",\n" +
"         \"codigo\":null,\n" +
"         \"estadoId\":1,\n" +
"         \"fechaRegistro\":\"2018-09-20T10:27:06.000-06:00\"\n" +
"      }\n" +
"   ]";
    
    public static String jsonTipoBosque="[\n" +
"   {\n" +
"      \"tipoBosqueId\":1,\n" +
"      \"tipoBosqueDesc\":\"Coníferas\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-10-15T10:01:20.000-06:00\",\n" +
"      \"ocultar\":0\n" +
"   },\n" +
"   {\n" +
"      \"tipoBosqueId\":2,\n" +
"      \"tipoBosqueDesc\":\"Mixtos\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-05-13T14:19:46.000-06:00\",\n" +
"      \"ocultar\":0\n" +
"   },\n" +
"   {\n" +
"      \"tipoBosqueId\":3,\n" +
"      \"tipoBosqueDesc\":\"Latifoliado\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-05-13T14:19:46.000-06:00\",\n" +
"      \"ocultar\":1\n" +
"   },\n" +
"   {\n" +
"      \"tipoBosqueId\":4,\n" +
"      \"tipoBosqueDesc\":\"Manglar\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-05-13T14:19:46.000-06:00\",\n" +
"      \"ocultar\":1\n" +
"   }\n" +
"]";
    
    public static String jsonCriterioProteccion="[\n" +
"   {\n" +
"      \"criterioProteccionId\":1,\n" +
"      \"criterioProteccionDesc\":\"Pendiente\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:25:59.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":2,\n" +
"      \"criterioProteccionDesc\":\"Profundidad\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:26:06.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":3,\n" +
"      \"criterioProteccionDesc\":\"Pedregosidad\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:26:17.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":4,\n" +
"      \"criterioProteccionDesc\":\"Anegamiento\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:26:30.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":5,\n" +
"      \"criterioProteccionDesc\":\"Bosque de galería\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:26:32.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":6,\n" +
"      \"criterioProteccionDesc\":\"Especies protegidas\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:26:49.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":7,\n" +
"      \"criterioProteccionDesc\":\"Nacimiento de agua\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-20T16:27:10.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":8,\n" +
"      \"criterioProteccionDesc\":\"Río\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-02-25T16:27:48.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":9,\n" +
"      \"criterioProteccionDesc\":\"Otros\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-02-25T16:28:00.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"criterioProteccionId\":10,\n" +
"      \"criterioProteccionDesc\":\"Paso de agua de invierno\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-02-25T16:28:00.000-06:00\"\n" +
"   }\n" +
"]";
    
    public static String jsonSistemaCorta="[\n" +
"   {\n" +
"      \"sistemaCortaId\":1,\n" +
"      \"sistemaCortaDesc\":\"Policíclico\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-27T16:01:00.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"sistemaCortaId\":2,\n" +
"      \"sistemaCortaDesc\":\"Monocíclico\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-27T16:01:06.000-06:00\"\n" +
"   }\n" +
"]";
    
    public static String jsonTipoGarantia="[\n" +
"   {\n" +
"      \"tipoGarantiaId\":1,\n" +
"      \"tipoGarantiaDesc\":\"Garantía Fiduciaria\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-27T16:01:30.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":2,\n" +
"      \"tipoGarantiaDesc\":\"Póliza de Fianza\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-09-27T16:01:35.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":3,\n" +
"      \"tipoGarantiaDesc\":\"Garantía Hipotecaria\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-10-10T15:16:01.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":4,\n" +
"      \"tipoGarantiaDesc\":\"Bonos del Estado\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-10-10T15:16:12.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":5,\n" +
"      \"tipoGarantiaDesc\":\"Plantación Forestal Voluntaria\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-10-10T15:16:58.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":6,\n" +
"      \"tipoGarantiaDesc\":\"Depósito Monetario\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2018-12-18T10:44:04.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":7,\n" +
"      \"tipoGarantiaDesc\":\"Documento Privado con Auténtica de Firma de Compromiso Unilateral y Garantía de Fiador en Forma Unilateral\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-09-23T14:35:16.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":8,\n" +
"      \"tipoGarantiaDesc\":\"Plantaciones Voluntarias Propiedad de Terceros, Inscritas en el Registro Nacional Forestal\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-09-23T14:35:16.000-06:00\"\n" +
"   },\n" +
"   {\n" +
"      \"tipoGarantiaId\":9,\n" +
"      \"tipoGarantiaDesc\":\"Contrato con Personas Jurídicas que se Dediquen a la Repoblación Forestal, Inscritas en el Registro Nacional Forestal en la categoría de Empresas Forestales y subcategoría de Repobladoras Forestales\",\n" +
"      \"estadoId\":1,\n" +
"      \"fechaRegistro\":\"2019-09-23T14:35:16.000-06:00\"\n" +
"   }\n" +
"]";
    public static String jsonTipoFiador="[\n" +
"   {\n" +
"      \"tipoFiadorId\":0,\n" +
"      \"nombreEmpresa\":\"Individual\",\n" +
"      \"rnf\":null\n" +
"   },\n" +
"   {\n" +
"      \"tipoFiadorId\":1,\n" +
"      \"nombreEmpresa\":\"Empresa\",\n" +
"      \"rnf\":null\n" +
"   }\n" +
"]";
    public static String jsonRegentePropuesto="[\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"8465320\",\n" +
"      \"noCedula\":\"3436870111301\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1005\",\n" +
"      \"nombre\":\"Tildo Florentin Samayoa Hernández\",\n" +
"      \"profesion\":\"Técnicos Universitarios con especialidad en silvicultura o manejo de bosque\",\n" +
"      \"profesionId\":5,\n" +
"      \"profesionalId\":8689\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1190031-8\",\n" +
"      \"noCedula\":\"2230780931412\",\n" +
"      \"noColegiado\":\"5529\",\n" +
"      \"noRegistro\":\"RF-1006\",\n" +
"      \"nombre\":\"Heber René Quezada Elías\",\n" +
"      \"profesion\":\"Otra\",\n" +
"      \"profesionId\":8,\n" +
"      \"profesionalId\":7603\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"8438315\",\n" +
"      \"noCedula\":\"2181431091412\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1007\",\n" +
"      \"nombre\":\"Jorge Augusto Quezada Elias\",\n" +
"      \"profesion\":\"Perito Agrónomo\",\n" +
"      \"profesionId\":3,\n" +
"      \"profesionalId\":1238\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"\",\n" +
"      \"noCedula\":\"2362328192001\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1016\",\n" +
"      \"nombre\":\"Byron Alfredo Pazos Guerra\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":2952\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"15913589\",\n" +
"      \"noCedula\":\"2328578062001\",\n" +
"      \"noColegiado\":\"4051\",\n" +
"      \"noRegistro\":\"RF-1017\",\n" +
"      \"nombre\":\"Axel Manrique Calderón Palma\",\n" +
"      \"profesion\":\"Otra\",\n" +
"      \"profesionId\":8,\n" +
"      \"profesionalId\":2284\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"358807-6\",\n" +
"      \"noCedula\":\"2609980280101\",\n" +
"      \"noColegiado\":\"1660\",\n" +
"      \"noRegistro\":\"RF-1020\",\n" +
"      \"nombre\":\"Luis Vicente  Gálvez Alburez\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":2669\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"15390233\",\n" +
"      \"noCedula\":\"2277099262101\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1023\",\n" +
"      \"nombre\":\"Juan Carlos  Morales Escobar\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":2054\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"6795633\",\n" +
"      \"noCedula\":\"1801698901703\",\n" +
"      \"noColegiado\":\"3683\",\n" +
"      \"noRegistro\":\"RF-1025\",\n" +
"      \"nombre\":\"Juan Jose Romero Zetina\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":6521\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"499698-4\",\n" +
"      \"noCedula\":\"2510586890101\",\n" +
"      \"noColegiado\":\"1601\",\n" +
"      \"noRegistro\":\"RF-1037\",\n" +
"      \"nombre\":\"AXEL LIONEL SOLÓRZANO MENDIZABAL\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"14997614\",\n" +
"      \"noCedula\":\"2365796140407\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1040\",\n" +
"      \"nombre\":\"José Anibal  Garcia Sitan\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":990\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"343550-4\",\n" +
"      \"noCedula\":\"1921510100101\",\n" +
"      \"noColegiado\":\"328\",\n" +
"      \"noRegistro\":\"RF-1042\",\n" +
"      \"nombre\":\"RODRIGO BELTRANENA ORIVE\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"4444426\",\n" +
"      \"noCedula\":\"1786451410901\",\n" +
"      \"noColegiado\":\"1555\",\n" +
"      \"noRegistro\":\"RF-1049\",\n" +
"      \"nombre\":\"Minor Obdulio García Divas\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":170\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"525709-3\",\n" +
"      \"noCedula\":\"2424790222001\",\n" +
"      \"noColegiado\":\"1149\",\n" +
"      \"noRegistro\":\"RF-1064\",\n" +
"      \"nombre\":\"WALTER IRENE ROBLEDO HERNÁNDEZ\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1971550571202\",\n" +
"      \"noCedula\":\"1971550571202\",\n" +
"      \"noColegiado\":\"600\",\n" +
"      \"noRegistro\":\"RF-1065\",\n" +
"      \"nombre\":\"Amed Gelimero Bautista Mendez\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":6943\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5320658\",\n" +
"      \"noCedula\":\"1619034282001\",\n" +
"      \"noColegiado\":\"937\",\n" +
"      \"noRegistro\":\"RF-1066\",\n" +
"      \"nombre\":\"Fernando Alcides Enríquez Flores\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":732\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"8338868\",\n" +
"      \"noCedula\":\"2353400650114\",\n" +
"      \"noColegiado\":\"5084\",\n" +
"      \"noRegistro\":\"RF-1067\",\n" +
"      \"nombre\":\"Luis Francisco Hilton Guardado\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":2193\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"168985-1\",\n" +
"      \"noCedula\":\"2223679111603\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1081\",\n" +
"      \"nombre\":\"René Alfonso  Crúz Cabrera\",\n" +
"      \"profesion\":\"Perito Agrónomo\",\n" +
"      \"profesionId\":3,\n" +
"      \"profesionalId\":1261\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5007615\",\n" +
"      \"noCedula\":\"2451929560101\",\n" +
"      \"noColegiado\":\"1048\",\n" +
"      \"noRegistro\":\"RF-1089\",\n" +
"      \"nombre\":\"Manuel Enrique Aragón Castillo\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":36\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"58927-6\",\n" +
"      \"noCedula\":\"2535156880101\",\n" +
"      \"noColegiado\":\"2279\",\n" +
"      \"noRegistro\":\"RF-1091\",\n" +
"      \"nombre\":\"MANUEL AMADO RODAS\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"6281192\",\n" +
"      \"noCedula\":\"1797122251301\",\n" +
"      \"noColegiado\":\"1207\",\n" +
"      \"noRegistro\":\"RF-1094\",\n" +
"      \"nombre\":\"Edgar Rene Ramirez Recinos\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":724\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1644609-7\",\n" +
"      \"noCedula\":\"1622424840601\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1097\",\n" +
"      \"nombre\":\"CARLOS ISAÍAS SIGÜINA MARROQUÍN\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"17891965\",\n" +
"      \"noCedula\":\"2462156900501\",\n" +
"      \"noColegiado\":\"4674\",\n" +
"      \"noRegistro\":\"RF-1098\",\n" +
"      \"nombre\":\"Gilberto Damian López Solis\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":5285\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1245398-6\",\n" +
"      \"noCedula\":\"2513014511001\",\n" +
"      \"noColegiado\":\"2492\",\n" +
"      \"noRegistro\":\"RF-1114\",\n" +
"      \"nombre\":\"JOSÉ GILBERTO CIFUENTES BARRIENTOS\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"7431821\",\n" +
"      \"noCedula\":\"1847806670207\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1115\",\n" +
"      \"nombre\":\"Eber Maximiliano  Morales Balcárcel\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":6374\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"16145232\",\n" +
"      \"noCedula\":\"1745938561301\",\n" +
"      \"noColegiado\":\"2129\",\n" +
"      \"noRegistro\":\"RF-1119\",\n" +
"      \"nombre\":\"Francisco Abel Palacios\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":2830\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"11974818\",\n" +
"      \"noCedula\":\"1825204631214\",\n" +
"      \"noColegiado\":\"1962\",\n" +
"      \"noRegistro\":\"RF-1122\",\n" +
"      \"nombre\":\"Hector  Leonel Paz  Kroell\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":8272\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"852582K\",\n" +
"      \"noCedula\":\"1621961210101\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1124\",\n" +
"      \"nombre\":\"Rubén Arturo Roca León\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":1250\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1503603-0\",\n" +
"      \"noCedula\":\"2436609281712\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1136\",\n" +
"      \"nombre\":\"HÉCTOR CUCUL POP\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"3556727\",\n" +
"      \"noCedula\":\"2578459330101\",\n" +
"      \"noColegiado\":\"881\",\n" +
"      \"noRegistro\":\"RF-1143\",\n" +
"      \"nombre\":\"Juan Antonio Paz Quezada\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":11898\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1585566K\",\n" +
"      \"noCedula\":\"1985541091331\",\n" +
"      \"noColegiado\":\"4268\",\n" +
"      \"noRegistro\":\"RF-1152\",\n" +
"      \"nombre\":\"Jerónimo Marvin Tomás López\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":6925\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5369169\",\n" +
"      \"noCedula\":\"2759903110901\",\n" +
"      \"noColegiado\":\"1490\",\n" +
"      \"noRegistro\":\"RF-1157\",\n" +
"      \"nombre\":\"Juan Oscar  Quiñonez Herrera\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":2274\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"190637-2\",\n" +
"      \"noCedula\":\"1835628600110\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1160\",\n" +
"      \"nombre\":\"Gustavo Adolfo  Avendaño García\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":1212\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5264197\",\n" +
"      \"noCedula\":\"2210456270101\",\n" +
"      \"noColegiado\":\"428\",\n" +
"      \"noRegistro\":\"RF-1179\",\n" +
"      \"nombre\":\"Luis Roberto  Estrada Nicol\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":485\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1507445-5\",\n" +
"      \"noCedula\":\"2238773011601\",\n" +
"      \"noColegiado\":\"2309\",\n" +
"      \"noRegistro\":\"RF-1181\",\n" +
"      \"nombre\":\"Yefri Alexander  Palala Leal\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":1152\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5851459\",\n" +
"      \"noCedula\":\"2512013091603\",\n" +
"      \"noColegiado\":\"1713\",\n" +
"      \"noRegistro\":\"RF-1184\",\n" +
"      \"nombre\":\"Edgar Enrique Hun Cal\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":480\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"16041399\",\n" +
"      \"noCedula\":\"1684142601703\",\n" +
"      \"noColegiado\":\"3255\",\n" +
"      \"noRegistro\":\"RF-1186\",\n" +
"      \"nombre\":\"Marvin Javier  Mazá Guerra\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":1060\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"6812236\",\n" +
"      \"noCedula\":\"1971703231708\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1187\",\n" +
"      \"nombre\":\"Justo Francisco Hoil Amador\",\n" +
"      \"profesion\":\"Técnicos Universitarios con especialidad en silvicultura o manejo de bosque\",\n" +
"      \"profesionId\":5,\n" +
"      \"profesionalId\":2241\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1265384-5\",\n" +
"      \"noCedula\":\"2251815170404\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1192\",\n" +
"      \"nombre\":\"WERNER LEONEL GOMEZ HERRERA\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1665665-2\",\n" +
"      \"noCedula\":\"1922914401301\",\n" +
"      \"noColegiado\":\"3225\",\n" +
"      \"noRegistro\":\"RF-1201\",\n" +
"      \"nombre\":\"DANY RUSSINY VASQUEZ GOMEZ\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"661934-7\",\n" +
"      \"noCedula\":\"1914876271202\",\n" +
"      \"noColegiado\":\"1593\",\n" +
"      \"noRegistro\":\"RF-1204\",\n" +
"      \"nombre\":\"RENE ISRRAEL GARCIA RAMOS\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"16499832\",\n" +
"      \"noCedula\":\"2590767671712\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1206\",\n" +
"      \"nombre\":\"Erick Rolando  Menéndez Cantoral\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":7748\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"12544051\",\n" +
"      \"noCedula\":\"1993079971601\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1208\",\n" +
"      \"nombre\":\"Gustavo Adolfo Castro Vega\",\n" +
"      \"profesion\":\"Otra\",\n" +
"      \"profesionId\":8,\n" +
"      \"profesionalId\":7628\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"13412264\",\n" +
"      \"noCedula\":\"2452692071703\",\n" +
"      \"noColegiado\":\"6743\",\n" +
"      \"noRegistro\":\"RF-1222\",\n" +
"      \"nombre\":\"Melvin Geovanny Hernández González\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":6169\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"487773k\",\n" +
"      \"noCedula\":\"2518183491601\",\n" +
"      \"noColegiado\":\"1131\",\n" +
"      \"noRegistro\":\"RF-1225\",\n" +
"      \"nombre\":\"Hugo Moisés Morán Botzoc\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":487\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"4770773\",\n" +
"      \"noCedula\":\"2752975430114\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1231\",\n" +
"      \"nombre\":\"Edwin Alberto  Rodas Rosales\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":10251\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"15312917\",\n" +
"      \"noCedula\":\"2197106351301\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1235\",\n" +
"      \"nombre\":\"Fredy Adilio  Villatoro Recinos\",\n" +
"      \"profesion\":\"Técnicos Universitarios con especialidad en silvicultura o manejo de bosque\",\n" +
"      \"profesionId\":5,\n" +
"      \"profesionalId\":3587\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1502990-5\",\n" +
"      \"noCedula\":\"1672282851304\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1243\",\n" +
"      \"nombre\":\"EVERARDO WALBERTO DE LEON CARBAJAL\",\n" +
"      \"profesion\":\"Otra\",\n" +
"      \"profesionId\":8,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1243970-3\",\n" +
"      \"noCedula\":\"2546866560101\",\n" +
"      \"noColegiado\":\"2347\",\n" +
"      \"noRegistro\":\"RF-1244\",\n" +
"      \"nombre\":\"FRANCISCO ALFREDO FIGUEROA SANTIAGO\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"9977457\",\n" +
"      \"noCedula\":\"2608622581703\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1246\",\n" +
"      \"nombre\":\"Juan José Herrera Alvarado\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":7540\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"154938-3\",\n" +
"      \"noCedula\":\"1627388031309\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1247\",\n" +
"      \"nombre\":\"SANTIAGO ORDÓÑEZ PÉREZ\",\n" +
"      \"profesion\":\"Otra\",\n" +
"      \"profesionId\":8,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5280818\",\n" +
"      \"noCedula\":\"1828167100207\",\n" +
"      \"noColegiado\":\"1423\",\n" +
"      \"noRegistro\":\"RF-1250\",\n" +
"      \"nombre\":\"Josué Iván Morales Dardon\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":7121\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"871526-2\",\n" +
"      \"noCedula\":\"2608740350701\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1251\",\n" +
"      \"nombre\":\"MARVIN ANTONIO CHAVAJAY CHAVAJAY\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"142327-8\",\n" +
"      \"noCedula\":\"1999434780406\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1254\",\n" +
"      \"nombre\":\"SERGIO LEONEL VAQUIAX CASTILLO\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"5292735\",\n" +
"      \"noCedula\":\"1705927820413\",\n" +
"      \"noColegiado\":\"1007\",\n" +
"      \"noRegistro\":\"RF-1258\",\n" +
"      \"nombre\":\"Carlos Antonio Barrera Arenales\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":7268\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"2405862-9\",\n" +
"      \"noCedula\":\"1687938222011\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1259\",\n" +
"      \"nombre\":\"ELGIN DE JESUS DE PAZ CERON\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"12040975\",\n" +
"      \"noCedula\":\"1579456771301\",\n" +
"      \"noColegiado\":\"2355\",\n" +
"      \"noRegistro\":\"RF-1261\",\n" +
"      \"nombre\":\"Edwin Ottoniel Sosa Gómez\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":7767\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"3206777\",\n" +
"      \"noCedula\":\"2316340560101\",\n" +
"      \"noColegiado\":\"1323\",\n" +
"      \"noRegistro\":\"RF-1264\",\n" +
"      \"nombre\":\"Luis Fernando Pereira Rodas\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":5489\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"997858-5\",\n" +
"      \"noCedula\":\"2443535490103\",\n" +
"      \"noColegiado\":\"4052\",\n" +
"      \"noRegistro\":\"RF-1266\",\n" +
"      \"nombre\":\"FRANCISCO VINICIO GUZMAN HERRERA\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"269712-2\",\n" +
"      \"noCedula\":\"2517254480915\",\n" +
"      \"noColegiado\":\"1064\",\n" +
"      \"noRegistro\":\"RF-1267\",\n" +
"      \"nombre\":\"Daniel Absalón López Reyes\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":2544\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"7908024\",\n" +
"      \"noCedula\":\"2262098301209\",\n" +
"      \"noColegiado\":\"1269\",\n" +
"      \"noRegistro\":\"RF-1269\",\n" +
"      \"nombre\":\"Angel Iván  Yoc Gómez\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":2221\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"18006507\",\n" +
"      \"noCedula\":\"2262814181703\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1278\",\n" +
"      \"nombre\":\"Ronaldo Fabian Maza Cruz\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":1698\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"\",\n" +
"      \"noCedula\":\"2760785350101\",\n" +
"      \"noColegiado\":\"1486\",\n" +
"      \"noRegistro\":\"RF-1282\",\n" +
"      \"nombre\":\"Byron Alfredo Pedroza Copper\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":6421\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"13285211\",\n" +
"      \"noCedula\":\"1695088110306\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1283\",\n" +
"      \"nombre\":\"Porfirio Concobá Sebaquijay\",\n" +
"      \"profesion\":\"Dasonomo\",\n" +
"      \"profesionId\":4,\n" +
"      \"profesionalId\":1189\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"674412-5\",\n" +
"      \"noCedula\":\"1912656910114\",\n" +
"      \"noColegiado\":\"1357\",\n" +
"      \"noRegistro\":\"RF-1287\",\n" +
"      \"nombre\":\"VINICIO EUGENIO PÉREZ Y PÉREZ\",\n" +
"      \"profesion\":\"Ingeniero Agrónomo\",\n" +
"      \"profesionId\":1,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"16686292\",\n" +
"      \"noCedula\":\"1763943461301\",\n" +
"      \"noColegiado\":\"4116\",\n" +
"      \"noRegistro\":\"RF-1293\",\n" +
"      \"nombre\":\"Erick Olivio  López Gómez\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":8003\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"2\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"19527535\",\n" +
"      \"noCedula\":\"1907068481301\",\n" +
"      \"noColegiado\":\"3752\",\n" +
"      \"noRegistro\":\"RF-1309\",\n" +
"      \"nombre\":\"Carlos Fernando Maldonado Argueta\",\n" +
"      \"profesion\":\"Ingeniero Forestal\",\n" +
"      \"profesionId\":2,\n" +
"      \"profesionalId\":1614\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"1002429-8\",\n" +
"      \"noCedula\":\"2529481571202\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1318\",\n" +
"      \"nombre\":\"ROBINS OCTAVIO LOPEZ GONZALEZ\",\n" +
"      \"profesion\":\"Perito Forestal\",\n" +
"      \"profesionId\":6,\n" +
"      \"profesionalId\":0\n" +
"   },\n" +
"   {\n" +
"      \"categoriaProfesion\":\"1\",\n" +
"      \"municipioId\":0,\n" +
"      \"nit\":\"2110336-4\",\n" +
"      \"noCedula\":\"2252173171203\",\n" +
"      \"noColegiado\":\"0\",\n" +
"      \"noRegistro\":\"RF-1331\",\n" +
"      \"nombre\":\"Fredy Neptali Ramírez Cardona\",\n" +
"      \"profesion\":\"Perito Agrónomo\",\n" +
"      \"profesionId\":3,\n" +
"      \"profesionalId\":5197\n" +
"   }\n" +
"]";
}

