
package com.cpyt.dao;


import com.cpyt.entity.Delito;
import com.cpyt.entity.Operativo;
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
    
    public Integer ultimoID(String id,String entidad){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select max("+id+") from "+entidad);
        List results = query.list();
        Integer ultimoID =  (Integer) results.get(0);
        return ultimoID;
    }
    
    public List<Object> list(String entidad) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from "+entidad+" where isDeleted=?");
        query.setParameter(0, 0);
        List results = query.list();
        return results;
    }
    
    public List<Object> getComboList(String tabla,String pkID, String columnItem,String where) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select "+pkID+","+columnItem+" from "+tabla +" "+ where);
        
        List results = query.list();
        return results;
    }
    
    public Integer getIdItemSeleccionado(String pkId,String tabla,String equalsColumn,String valueColumn,String aditionalWhere) {

        Session session = sessionFactory.openSession();
        String sql = "select "+pkId+" from "+tabla+" where "+equalsColumn+"='"+valueColumn+"' "+aditionalWhere;
        Query query = session.createSQLQuery(sql.toString());
        List results = query.list();
        Integer id=0;
        
        if(results.size()>0){
         id= (Integer) results.get(0);
        }
        return id;
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
        
        /* //INSERT PARA PROCESO DE DENUNCIA
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
        
        
        /* //INSERT PARA PROCESO DE SERVICIO POLICIAL
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
        */
        
        
        // PROCESO DE OPERATIVO
        /*Operativo ope = new Operativo();
        
        ope.setTipoOpera("Transito");
        ope.setDireccion("El porvenir");
        ope.setDescripcion("Operativo realizado por sospechas etc etc");
        ope.setFechRegis(new Date());
        ope.setHoraRegis("23:25");
        ope.setFechHecho(new Date());
        ope.setHoraHecho("22:05");
        
        VehiculoIncautado vi = new VehiculoIncautado();
        Vehiculo ve = new Vehiculo();
        ve.setIdVehi(1);
        vi.setVehiculo(ve);
        vi.setPlaca("DSF-5487");
        vi.setDescripcion("Vehiculo sospechoso color negro");
        vi.setEstado("DETENIDO");
        
        VehiculoIncautado vi2 = new VehiculoIncautado();
        Vehiculo ve2 = new Vehiculo();
        ve2.setIdVehi(2);
        vi2.setVehiculo(ve);
        vi2.setPlaca("ABC-2222");
        vi2.setDescripcion("2Vehiculo sospechoso color BLANCO");
        vi2.setEstado("DEPOSITO");
        Papeleta pa = new Papeleta();
        pa.setTipoPape("LEVE");
        pa.setStipoPape("L01");
        pa.setMonto(258L);
        HashSet<Papeleta> hpa = new HashSet<Papeleta>();
        hpa.add(pa);
        vi2.setPapeletaList(hpa);
        
        HashSet<VehiculoIncautado> hvi = new HashSet<VehiculoIncautado>();
        hvi.add(vi);
        hvi.add(vi2);
        
        ope.setVehiculoIncautadoList(hvi);
        
        ArmaIncautada ai = new ArmaIncautada();
        Arma ar = new Arma();
        ar.setIdArma(1);
        ai.setArma(ar);
        ai.setSerie("65df6d");
        ai.setDescripcion("Arma automatica");
        
        HashSet<ArmaIncautada> hai = new HashSet<ArmaIncautada>();
        hai.add(ai);
        
        ope.setArmaIncautadaList(hai);
        
        Droga dr = new Droga();
        dr.setTipoDroga("PVC");
        dr.setQuetesDroga(20);
        dr.setKgDroga(2);
        dr.setDescripcion("Desc droga");
        
        Droga dr2 = new Droga();
        dr2.setTipoDroga("marihuana");
        dr2.setQuetesDroga(100);
        dr2.setKgDroga(1);
        dr2.setDescripcion("Desc droga2");
        
        HashSet<Droga> hdr = new HashSet<Droga>();
        hdr.add(dr);
        hdr.add(dr2);
        
        ope.setDrogaList(hdr);
        
        PersonaDenuncia pd = new PersonaDenuncia();
        Persona per = new Persona();
        per.setIdPerso(3);
        pd.setPersona(per);
        pd.setSituacion("Situacion p3");
        pd.setEstado("Estado p3");
        
        PersonaDenuncia pd2 = new PersonaDenuncia();
        Persona per2 = new Persona();
        per2.setIdPerso(4);
        pd2.setPersona(per);
        pd2.setSituacion("Situacion p4");
        pd2.setEstado("Estado p4");
        
        HashSet<PersonaDenuncia> hpd = new HashSet<PersonaDenuncia>();
        hpd.add(pd);
        hpd.add(pd2);
        
        ope.setPersonaDenunciaList(hpd);
        
        
        g.insert(ope);
        */
        
        
        List<Object> sad = g.getComboList("delito", "id_deli", "nombre", "");
        Object[] s = new Object[]{};
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
        }
    }
}
