
package com.cpyt.dao;



import com.cpyt.entity.Delito;
import com.cpyt.entity.Denuncia;
import com.cpyt.entity.Persona;
import com.cpyt.entity.PersonaDenuncia;
import com.cpyt.entity.ServicioPolicial;
import com.cpyt.entity.SubtipoDelito;
import com.cpyt.entity.TipoDelito;
import com.cpyt.entity.Usuario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GenericDAO {
    
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public void insert(Object o) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
        session.close();
    }

    public void update(Object o) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
    }

    public void delete(Object o) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
        
    }
    
    public Integer generarID(String id,String entidad){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select max("+id+") from "+entidad);
        List results = query.list();
        Integer ultimoID =  (Integer) results.get(0);
        Integer siguienteID=1;
        if(ultimoID!=null){
            siguienteID = ultimoID + 1;
        }
        
        return siguienteID;
    }
    
    public List<Object> list(String entidad) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from "+entidad+" where isDeleted=?");
        query.setParameter(0, 0);
        List results = query.list();
        return results;
    }
    
    public void delete(String tabla, String campoID,Integer id) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update "+tabla+" set is_deleted=1 where "+campoID+"=?");
       
        query.setParameter(0, id); 
       
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
    public static List<Object> getAfluenciaClientes(int limit) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select dni_cli,nomb_cli,count(*) as cantidad from boleto " +
                    " where esta_bol=0 " +
                    " group by dni_cli " +
                    " order by cantidad desc ";
                    
        
                    if(limit!=-1){
                        sql=sql+" limit ?";
                    }
                    
        Query query = session.createSQLQuery(sql);
   
        if(limit!=-1){
            query.setParameter(0, limit);
                    
        }         

        List results = query.list();

        return results;

    }   
    
    public static void main(String[] args) {
        GenericDAO g = new GenericDAO();
        
        /* INSERT PARA PROCESO DE DENUNCIA
        Denuncia den = new Denuncia();
        
        Delito de = new Delito();
        de.setIdDeli(1);
        
        TipoDelito td = new TipoDelito();
        td.setIdTdeli(1);
        
        SubtipoDelito std = new SubtipoDelito();
        std.setIdStdelito(1);
        
        den.setDelito(de);
        den.setTipoDelito(td);
        den.setSubtipoDelito(std);
        den.setFechRegis(new Date());
        den.setHoraRegis("20:50");
        den.setFechHecho(new Date());
        den.setHoraHecho("18:00");
        den.setAfectado("TRANSEUNTE");
        den.setDireccion("San mateo");
        den.setDescripcion("Robo a mano armada");
        
        Persona p1 = new Persona();
        p1.setIdPerso(1);
        
        Persona p3 = new Persona();
        p3.setIdPerso(3);
        
        Persona p4 = new Persona();
        p4.setIdPerso(4);
        
        HashSet<PersonaDenuncia> pd = new HashSet<PersonaDenuncia>();
        pd.add(new PersonaDenuncia(p1, "DENUNCIANTE Y VICTIMA", ""));
        pd.add(new PersonaDenuncia(p3, "REDACTOR", ""));
        pd.add(new PersonaDenuncia(p4, "DENUNCIADO", "DETENIDO"));
        den.setPersonaDenunciaList(pd);
        
        g.insert(den);
        */
        
        ServicioPolicial sp = new ServicioPolicial();
        
        Denuncia d = new Denuncia();
        d.setIdDenun(1);
        
        Persona p = new Persona();
        p.setIdPerso(1);
        
        Usuario u = new Usuario();
        u.setIdUsua(1);
        sp.setDenuncia(d);
        sp.setPersona(p);
        sp.setUsuario(u);
        sp.setCondicion("PAGADO");
        sp.setCosto(25L);
        sp.setNumBoucher("241546564");
        sp.setFechSoli(new Date());
        sp.setHoraSoli("12:58");
        
        g.insert(sp);
        
        
        
    }
}
