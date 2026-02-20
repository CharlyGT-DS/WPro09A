/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PERFIL;

import estructuras.GEnericaCincoCampos;
import java.util.concurrent.Future;
import javax.ejb.Local;

/**
 *
 * @author csandoval
 */
@Local
public interface FuncionesRedisLocal {
    
     public String verifica(String llaveSes);
     public Future<String> insertaPerfil(String llave,String json);
     public Future<estructuras.PefilInab> buscarUsuarioSubRegion(String idUsuario,estructuras.PefilInab per);
     public Future<estructuras.PefilInab> buscaTecnicos( estructuras.PefilInab per, int idSubregion );
     public Future<estructuras.PefilInab> buscaRegional(estructuras.PefilInab per);
     public Future<estructuras.PefilInab> buscaSubREgional(estructuras.PefilInab per);
     public Future<estructuras.PefilInab> buscaLicencias(String idUsuario,estructuras.PefilInab per);
     public Future<estructuras.PefilInab> buscaUsuario(String idUsuario,estructuras.PefilInab per);
     public Future<estructuras.PefilInab> buscaSubREgional(estructuras.PefilInab per,String idSubregion);
     public Future<GEnericaCincoCampos> registraDatos(String sql);
     public Future<estructuras.PefilInab> buscaSecretariasSubRegional(estructuras.PefilInab per,String idSubregion);
     public Future<estructuras.PefilInab> buscaUsuarioConectado(String idUsuario,estructuras.PefilInab per);
     
     
     
}
