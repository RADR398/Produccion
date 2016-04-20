/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Hibernate.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Panda
 */
public class DAO {
    
    public static boolean SaveOrUpdate(Producto p){
    
        try{
            Session session = NewHibernateUtil.sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(p);
            tx.commit();
            
            session.flush();
            session.close();
        }catch(Exception e){
            
            return false;
            
        }
        return true;
    }
    
    public static String InventarioActual(){
    
        String consulta = "select year(curdate())";
        Session session = NewHibernateUtil.sessionFactory.openSession();
        SQLQuery queryConsulta = session.createSQLQuery(String.format(consulta));
        String fecha = queryConsulta.uniqueResult().toString();
        
        SQLQuery query = session.createSQLQuery("select count(*) "
                + "from Jornada "
                + "where Año=year(curdate())");
        int value = Integer.parseInt(query.uniqueResult().toString());
        
        if( value == 0){
        
            Jornada j = new Jornada(Integer.parseInt(fecha));
            session.save(j);
        
        }
        session.close();
        
        return fecha;
    
    }
    
    public static void SaveOrUpdate(DatosGenerales dg)
    {
        
        Session session = NewHibernateUtil.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(dg);
        tx.commit();
        session.flush();
        session.close();
    
    }
    
    
    
    
}
