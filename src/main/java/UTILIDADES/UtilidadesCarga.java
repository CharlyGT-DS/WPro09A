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
}
