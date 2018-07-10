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
public class PersonaDenunciaDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    
    
    
    
    public List<Object> getPersonaDenuncia(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select pd.id_perden,p.dni,p.apel_nomb,de.nombre,pd.situacion,pd.estado "
                + " from persona_denuncia pd inner join persona p on pd.id_perso=p.id_perso"
                + " inner join denuncia d on pd.id_denun=d.id_denun "
                + " inner join delito de on d.id_deli=de.id_deli "
                + " where (p.apel_nomb like ? "
                + " or p.dni like ? "
                + " or de.nombre like ?"
                + " or pd.situacion like ? "
                + " or pd.estado like ? ) "
                + " and pd.situacion='DENUNCIADO'");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        
        
        return query.list();
        
    }
    
   
    public static void main(String[] args) {
        
       
        
        
        
    }
    
}
