/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Hibernate.Producto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Panda
 */
public class DAO {
    
    public static boolean GuardarOrUpdate(Producto p){
    
        try{
            Session session = NewHibernateUtil.sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(p);
            tx.commit();
            
            session.flush();
            session.close();
        }catch(Exception e){
            
            return false;
            
        }
        return true;
    }
}
