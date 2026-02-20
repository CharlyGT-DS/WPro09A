/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package EJB;

import estructuras.HISTORICO.DocumentoInab;
import estructuras.RespuestaRedis;
import java.util.List;
import java.util.Set;
import javax.ejb.Local;


/**
 *
 * @author csandoval
 */
@Local
public interface DBaseLocal { 
   public Object repuestaApi(Object clase,String tipo, String sql, String host);
    public <T> T[] respuestaApiVector(Class<T[]> clase, String tipo, String sql, String host);
    public <T> List<T> convierteObjetoLista(String sql, Class<T> classOfT, String host);
    public void cerrarSesion(String rutaLogin);
    public void llamarPagina(String  nombre);
    public String verificaEJB(String dato);
    public javax.faces.application.FacesMessage creaMensajeError(String mensaje);
    public String autenticaINAB(String json);
    public String envarApiMMFNuevo(String json, String url);
    public String asignarRutaYnombrePdf(String proceso,int idUsuario,int idGestion,
    String paso,String numeroEsquema);
    public String enviarApiMMCoreXML(String xml, int tipo, String core, String index);
    public String enviarApiMMCoreXMLGet(String param,String core, String index);
    public String enviarApiMMCoreXMLBusquedaParcial(String param,String core, String index);
    public void llamaCualquierPagina(String ruta);
    public List<estructuras.HISTORICO.DocumentoInab.Actual> obtieneExpediente (int idUsuario, int estado );  
    public boolean moverExpediente(int idGestion,int idUsuarioActual, int idUsuarioSiguiente, String motivo);
    public boolean  actualizarTarea(DocumentoInab.Actual tarea, int idUsuarioActual);
    public Set<String> llaves(String patron);
    public RespuestaRedis mueveCola (DocumentoInab.Actual tarea,int idUsuarioActual, int idUsuarioSiguiente, String motivo);
    public List<DocumentoInab.Actual> escaneoCola(int tipoBusqueda,String idGestion, 
           String idUsuarioActual,String licencia ,String fecha);
    public void grabaHistorico(DocumentoInab.Actual tarea);
    public String enviarApiMMCoreXMLGetDoc(String param, String core);
    public String enviarApiMMCoreXMLGetDocIndividual(String url, String param);
    public  long bandejadeEntrada(long idUsuarioActual);
    public String enviarApiMMCoreJSON(String param, int tipo, String core, String index);
}
