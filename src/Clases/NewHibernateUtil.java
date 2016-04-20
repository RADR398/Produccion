/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Gerald Aburto Urroz
 */
public class NewHibernateUtil {

    public static SessionFactory sessionFactory;
    public static Connection conn;

    public static boolean getSessionFactory(String usuario, String contraseña) {
    
        try {
//           
           
            Configuration c = new Configuration();
            String direccion ="/Hibernate/hibernate.cfg.xml";
            
            c.configure(direccion);
            
            c.setProperty("hibernate.connection.username", usuario);
            c.setProperty("hibernate.connection.password", contraseña);
            sessionFactory= (SessionFactory)c.buildSessionFactory();
            
            getConnection(usuario, contraseña);
            
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lo sentimos puede que exista un error en la conexion\n"
                    + "o un error en la contraseña","Error de Entrada",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
     public static Connection getConnection(String usuario,String contraseña) {
   
    
        try{
        String url = "jdbc:mysql://localhost:3306/Inventario?zeroDateTimeBehavior=convertToNull";
        Class.forName ("com.mysql.jdbc.Driver").newInstance ();
        conn = DriverManager.getConnection (url, usuario, contraseña);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){

        }
        return conn;
        }
}