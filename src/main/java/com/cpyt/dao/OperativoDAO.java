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
import com.cpyt.entity.ServicioPolicial;
import com.cpyt.entity.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Yoel
 */
public class OperativoDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    
    
    
    
    public List<Object> getOperativo(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select id_opera,tipo_opera,direccion,fech_hecho,hora_hecho,descripcion "
                + " from operativo"
                + " where cast(id_opera as CHARACTER) like ? "
                + " or tipo_opera like ? "
                + " or direccion like ? "
                + " or hora_hecho like ? "
                + " or descripcion like ? "
                + " or cast(fech_hecho as CHARACTER) like ?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        
        
        
        return query.list();
        
    }
    
   
    public static void main(String[] args) {
        
       
        
        
        
    }
    
}
