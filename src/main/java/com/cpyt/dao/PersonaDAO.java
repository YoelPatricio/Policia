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
public class PersonaDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    public List<Object> getPersonasList(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select p.id_perso,p.dni,p.apel_nomb,p.nivel_grado,p.ocupacion, "
                + "p.tipo_perso,pe.nombre"
                + " from persona p "
                + " left join usuario u on p.id_perso=u.id_perso "
                + " left join perfil pe on u.id_perfil=pe.id_perfil "
                + " where p.dni like ?"
                + " or p.apel_nomb like ?"
                + " or p.nivel_grado like ?"
                + " or p.ocupacion like ?"
                + " or p.tipo_perso like ?"
                + " or pe.nombre like ? ");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        List results = query.list();
        return results;
    }
    
    public List<Object> getUsuarios(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select u.id_usua,p.apel_nomb, "
                + "pe.nombre,u.usuario"
                + " from usuario u "
                + " inner join persona p on p.id_perso=u.id_perso "
                + " left join perfil pe on u.id_perfil=pe.id_perfil "
                + " where p.apel_nomb like ?"
                + " or pe.nombre like ?"
                + " or u.usuario like ?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        List results = query.list();
        return results;
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        
        
    }
    
}
