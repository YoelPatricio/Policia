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
    
    public Persona consultarPersona(String dni) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Persona where dni = ?");
        query.setParameter(0, dni);
        List results = query.list();
        
        Persona per = new Persona();
        if(results.size()>0){
         return per = (Persona) results.get(0);
        }
        return null;
    }
    
    
    
    public Denuncia getDenunciaPorId(Integer id) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Denuncia where idDenun = ?");
        query.setParameter(0, id);
        List results = query.list();
        
        Denuncia denun = new Denuncia();
        if(results.size()>0){
         return denun = (Denuncia) results.get(0);
        }
        return null;
    }
    
    public Persona consultarPersonaPorId(Integer id) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Persona where idPerso = ?");
        query.setParameter(0, id);
        List results = query.list();
        
        Persona per = new Persona();
        if(results.size()>0){
         return per = (Persona) results.get(0);
        }
        return null;
    }
    
    public List<Object> getDenunciasReporte(String idDelito,String idTipoDelito,String idSubTiDel,String idSudDetDel,String idModa,String desde,String hasta) {

        Session session = sessionFactory.openSession();
        String sql = "select d.id_denun,del.nombre as nombre1,td.nombre as nombre2,std.nombre as nombre3,sdd.nombre as nombre4,"
                + " m.nombre as nombre5,d.fech_hecho "
                + " from denuncia d "
                + " left join delito del on d.id_deli=del.id_deli "
                + " left join tipo_delito td on d.id_tdelito=td.id_tdeli "
                + " left join subtipo_delito std on d.id_stdelito=std.id_stdelito "
                + " left join subdetalle_delito sdd on d.id_sddelito=sdd.id_sddelito "
                + " left join modalidad m on d.id_moda=m.id_moda "
                + " where 1=1 ";
        
        if(!idDelito.equalsIgnoreCase("0")){
            sql = sql + " and d.id_deli="+idDelito;
        }
        
        if(!idTipoDelito.equalsIgnoreCase("0")){
            sql = sql + " and d.id_tdelito="+idTipoDelito;
        }
        
        if(!idSubTiDel.equalsIgnoreCase("0")){
            sql = sql + " and d.id_stdelito="+idSubTiDel;
        }
        if(!idSudDetDel.equalsIgnoreCase("0")){
            sql = sql + " and d.id_sddelito="+idSudDetDel;
        }
        if(!idModa.equalsIgnoreCase("0")){
            sql = sql + " and d.id_moda="+idModa;
        }
        
        if(desde!=null && hasta!=null){
            sql=sql+"and d.fech_hecho BETWEEN DATE_FORMAT('"+desde+"',\"%Y-%m-%d\") AND DATE_FORMAT('"+hasta+"',\"%Y-%m-%d\") ";
        }
        
        
        
        Query query = session.createSQLQuery(sql);

        
        List results = query.list();
        return results;
    }
    
    public List<Object> getDenunciasAfectado(String afectado,String desde,String hasta) {

        Session session = sessionFactory.openSession();
        String sql = "select d.id_denun,d.afectado,d.fech_hecho "
                + " from denuncia d "
                + " where 1=1 ";
        
        if(!afectado.equalsIgnoreCase("TODOS")){
            sql = sql + " and d.afectado='"+afectado+"'";
        }
        
        
        if(desde!=null && hasta!=null){
            sql=sql+"and d.fech_hecho BETWEEN DATE_FORMAT('"+desde+"',\"%Y-%m-%d\") AND DATE_FORMAT('"+hasta+"',\"%Y-%m-%d\") ";
        }
        
        
        
        Query query = session.createSQLQuery(sql);

        
        List results = query.list();
        return results;
    }
    
    public List<Object> getPersonasEnDenuncia(String cadena) {

        Session session = sessionFactory.openSession();
       
        
        Query query = session.createSQLQuery("select pd.id_perden,p.dni,p.apel_nomb,pd.situacion,pd.estado "
                + " from persona_denuncia pd "
                + " inner join persona p on pd.id_perso=p.id_perso "
                + " where p.dni like ? or p.apel_nomb like ?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        
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
