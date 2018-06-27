package com.cpyt.entity;
// Generated 27/06/2018 03:08:19 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Denuncia generated by hbm2java
 */
public class Denuncia  implements java.io.Serializable {


     private Integer idDenun;
     private Delito delito;
     private Modalidad modalidad;
     private SubdetalleDelito subdetalleDelito;
     private SubtipoDelito subtipoDelito;
     private TipoDelito tipoDelito;
     private Date fechRegis;
     private String horaRegis;
     private Date fechHecho;
     private String horaHecho;
     private String afectado;
     private String direccion;
     private String descripcion;
     private Set servicioPolicials = new HashSet(0);
     private Set personaDenuncias = new HashSet(0);

    public Denuncia() {
    }

	
    public Denuncia(Delito delito, Date fechRegis, String horaRegis, Date fechHecho, String horaHecho, String afectado, String direccion, String descripcion) {
        this.delito = delito;
        this.fechRegis = fechRegis;
        this.horaRegis = horaRegis;
        this.fechHecho = fechHecho;
        this.horaHecho = horaHecho;
        this.afectado = afectado;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }
    public Denuncia(Delito delito, Modalidad modalidad, SubdetalleDelito subdetalleDelito, SubtipoDelito subtipoDelito, TipoDelito tipoDelito, Date fechRegis, String horaRegis, Date fechHecho, String horaHecho, String afectado, String direccion, String descripcion, Set servicioPolicials, Set personaDenuncias) {
       this.delito = delito;
       this.modalidad = modalidad;
       this.subdetalleDelito = subdetalleDelito;
       this.subtipoDelito = subtipoDelito;
       this.tipoDelito = tipoDelito;
       this.fechRegis = fechRegis;
       this.horaRegis = horaRegis;
       this.fechHecho = fechHecho;
       this.horaHecho = horaHecho;
       this.afectado = afectado;
       this.direccion = direccion;
       this.descripcion = descripcion;
       this.servicioPolicials = servicioPolicials;
       this.personaDenuncias = personaDenuncias;
    }
   
    public Integer getIdDenun() {
        return this.idDenun;
    }
    
    public void setIdDenun(Integer idDenun) {
        this.idDenun = idDenun;
    }
    public Delito getDelito() {
        return this.delito;
    }
    
    public void setDelito(Delito delito) {
        this.delito = delito;
    }
    public Modalidad getModalidad() {
        return this.modalidad;
    }
    
    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    public SubdetalleDelito getSubdetalleDelito() {
        return this.subdetalleDelito;
    }
    
    public void setSubdetalleDelito(SubdetalleDelito subdetalleDelito) {
        this.subdetalleDelito = subdetalleDelito;
    }
    public SubtipoDelito getSubtipoDelito() {
        return this.subtipoDelito;
    }
    
    public void setSubtipoDelito(SubtipoDelito subtipoDelito) {
        this.subtipoDelito = subtipoDelito;
    }
    public TipoDelito getTipoDelito() {
        return this.tipoDelito;
    }
    
    public void setTipoDelito(TipoDelito tipoDelito) {
        this.tipoDelito = tipoDelito;
    }
    public Date getFechRegis() {
        return this.fechRegis;
    }
    
    public void setFechRegis(Date fechRegis) {
        this.fechRegis = fechRegis;
    }
    public String getHoraRegis() {
        return this.horaRegis;
    }
    
    public void setHoraRegis(String horaRegis) {
        this.horaRegis = horaRegis;
    }
    public Date getFechHecho() {
        return this.fechHecho;
    }
    
    public void setFechHecho(Date fechHecho) {
        this.fechHecho = fechHecho;
    }
    public String getHoraHecho() {
        return this.horaHecho;
    }
    
    public void setHoraHecho(String horaHecho) {
        this.horaHecho = horaHecho;
    }
    public String getAfectado() {
        return this.afectado;
    }
    
    public void setAfectado(String afectado) {
        this.afectado = afectado;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getServicioPolicials() {
        return this.servicioPolicials;
    }
    
    public void setServicioPolicials(Set servicioPolicials) {
        this.servicioPolicials = servicioPolicials;
    }
    public Set getPersonaDenuncias() {
        return this.personaDenuncias;
    }
    
    public void setPersonaDenuncias(Set personaDenuncias) {
        this.personaDenuncias = personaDenuncias;
    }




}


