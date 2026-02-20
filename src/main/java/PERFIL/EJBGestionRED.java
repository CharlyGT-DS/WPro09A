/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package PERFIL;

import javax.annotation.PreDestroy;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 *
 * @author csandoval
 */
@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class EJBGestionRED implements EJBGestionREDLocal {

     private  JedisPoolConfig poolConfig = null;
     private  JedisPool jedisPool = null;
     
     
     public EJBGestionRED(){
         
         poolConfig = buildPoolConfig();
         jedisPool  =  new JedisPool(poolConfig, "127.0.0.1",6379,2000);
         System.out.println("SE cargo la REdis ");
     }
     
     private JedisPoolConfig buildPoolConfig() {
          
     final JedisPoolConfig poolConfig = new JedisPoolConfig();
              poolConfig.setMaxTotal(150); // Aumenta el total de conexiones permitidas
              poolConfig.setMaxIdle(100);
              poolConfig.setMinIdle(20);
              poolConfig.setBlockWhenExhausted(true); // Espera si no hay conexiones
              poolConfig.setMaxWaitMillis(5000); // Espera 5s antes de fallar
        return poolConfig;
   }
     
     
    @PreDestroy
    public void destruir(){
        
        jedisPool.close();
        jedisPool=null;
        
    }

    @Override
    @Lock(LockType.READ)
    public Jedis obtieneConeccionRedis() {
         if(jedisPool==null){
            jedisPool  =  new JedisPool(poolConfig, "127.0.0.1",6379,2000);
        }
        return   jedisPool.getResource();
    }

    @Override
    @Lock(LockType.READ)
    public boolean retornRecursoRedis(Jedis JD) {
         try{
               if(JD!=null){

                      JD.close();
                      JD=null;
            
               }else{
                 return false;  
               }
        }catch(Exception et){
            System.out.println("Regreso al pool :"+et.getMessage());
            return false;
        }
     return true;
    }
    
    
}
