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
public class ServicioPolicialDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    
    
    
    
    public List<Object> getServicioPolicial(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select s.id_serpo,s.id_denun,p.apel_nomb,s.condicion,s.costo,s.num_boucher,s.fech_soli "
                + " from servicio_policial s inner join persona p on s.id_perso=p.id_perso"
                + " where cast(s.id_serpo as CHARACTER) like ? "
                + " or cast(s.id_denun as CHARACTER) like ? "
                + " or cast(p.apel_nomb as CHARACTER) like ?"
                + " or s.condicion like ? "
                + " or s.costo like ? "
                + " or s.num_boucher like ? "
                + " or cast(s.fech_soli as CHARACTER) like ?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, "%"+cadena+"%");
        
        
        return query.list();
        
    }
    
   
    public static void main(String[] args) {
        
       
        
        
        
    }
    
}
