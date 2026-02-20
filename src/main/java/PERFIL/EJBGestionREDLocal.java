/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package PERFIL;

import javax.ejb.Local;
import redis.clients.jedis.Jedis;

/**
 *
 * @author csandoval
 */
@Local
public interface EJBGestionREDLocal {
    
         public Jedis obtieneConeccionRedis();
         public boolean retornRecursoRedis(Jedis JD);

    
}
