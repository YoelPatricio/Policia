/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpyt.dao;

import static com.cpyt.dao.GenericDAO.sessionFactory;
import com.cpyt.entity.Delito;
import com.cpyt.entity.Denuncia;
import com.cpyt.entity.Persona;
import com.cpyt.entity.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Yoel
 */
public class UsuarioDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    
    
    
    
    public Usuario getUserInSession() {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Usuario where sesion = 1");
        
        List results = query.list();
        
        if(results.size()>0){
         return (Usuario) results.get(0);
        }
        return null;
    }
    
    public Usuario consultarUsuario(String usuario,String password) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Usuario where usuario = ? and password = ?");
        
        List results = query.list();
        
        if(results.size()>0){
         return (Usuario) results.get(0);
        }
        return null;
    }
    
    public void updateUsuariosSinSession() {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update usuario set sesion=0");       
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
    public void setUsuarioEnSession(Integer id) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update usuario set sesion=1 where = ?");  
        query.setParameter(0,id);
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
   
    public static void main(String[] args) {
        
       
        
        
        
    }
    
}
