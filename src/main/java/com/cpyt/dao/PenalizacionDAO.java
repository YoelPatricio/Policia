/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpyt.dao;

import static com.cpyt.dao.GenericDAO.sessionFactory;
import static com.cpyt.dao.PersonaDenunciaDAO.sessionFactory;
import com.cpyt.entity.Delito;
import com.cpyt.entity.Denuncia;
import com.cpyt.entity.Persona;
import com.cpyt.entity.PersonaProceso;
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
public class PenalizacionDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    
    
    
    
    public List<Object> getPersonaProceso(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select pp.id_perpro,p.dni,p.apel_nomb,de.nombre,pp.fiscal,pp.sentencia,concat(pp.n_tiempo,' ',pp.tiempo),pp.fecha_libe "
                + " from persona_proceso pp inner join persona_denuncia pd on pd.id_perden=pp.id_perden"
                + " inner join denuncia d on pd.id_denun=d.id_denun "
                + " inner join delito de on d.id_deli=de.id_deli "
                + " inner join persona p on pd.id_perso=p.id_perso "
                + " where p.apel_nomb like ? "
                + " or p.dni like ? "
                + " or de.nombre like ?"
                + " or pp.fiscal like ? "
                + " or pp.sentencia like ? ");
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
