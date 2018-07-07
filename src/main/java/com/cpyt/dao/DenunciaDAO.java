/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpyt.dao;

import static com.cpyt.dao.GenericDAO.sessionFactory;
import com.cpyt.entity.Delito;
import com.cpyt.entity.Denuncia;
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
public class DenunciaDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
    public List<Object> getDenunciasList(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select d.id_denun,del.nombre as nombre1,td.nombre as nombre2,std.nombre as nombre3,sdd.nombre as nombre4,"
                + " m.nombre as nombre5,d.fech_regis,d.hora_regis,d.fech_hecho,d.hora_hecho,"
                + " d.afectado,d.direccion"
                + " from denuncia d "
                + " left join delito del on d.id_deli=del.id_deli "
                + " left join tipo_delito td on d.id_tdelito=td.id_tdeli "
                + " left join subtipo_delito std on d.id_stdelito=std.id_stdelito "
                + " left join subdetalle_delito sdd on d.id_sddelito=sdd.id_sddelito "
                + " left join modalidad m on d.id_moda=m.id_moda "
                + " where cast(d.id_denun as CHARACTER) like ?"
                + " or del.nombre like ?"
                + " or td.nombre like ?"
                + " or std.nombre like ?"
                + " or sdd.nombre like ?"
                + " or m.nombre like ?"
                + " or cast(d.fech_regis as CHARACTER) like ?"
                + " or cast(d.fech_hecho as CHARACTER) like ?"
                + " or d.afectado like ?"
                + " or d.direccion like ?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, "%"+cadena+"%");
        query.setParameter(7, "%"+cadena+"%");
        query.setParameter(8, "%"+cadena+"%");
        query.setParameter(9, "%"+cadena+"%");
        List results = query.list();
        return results;
    }
    
    public List<Denuncia> getDenunciasList_(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Denuncia where cast(idDenun as string) like ?"
                + " or delito.nombre like ?"
                + " or tipoDelito.nombre like ?"
                + " or subtipoDelito.nombre like ?"
                //+ " or subdetalleDelito.nombre like ?"
                //+ " or modalidad.nombre like ?"
                + " or cast(fechRegis as string) like ?"
                + " or cast(fechHecho as string) like ?"
                + " or afectado like ?"
                + " or direccion like ?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, "%"+cadena+"%");
        query.setParameter(7, "%"+cadena+"%");
        //query.setParameter(8, "%"+cadena+"%");
        //query.setParameter(9, "%"+cadena+"%");
        List results = query.list();
        return results;
    }
    
    public static void main(String[] args) {
        
        DenunciaDAO d = new DenunciaDAO();
        
        try {
           List<Object> den = d.getDenunciasList("Deli"); 
            Denuncia de = (Denuncia)den.get(0);
            String namedelito=de.getDelito().getNombre();
           int a = 0;
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    
}
