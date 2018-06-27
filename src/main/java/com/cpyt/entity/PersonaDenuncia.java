package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PersonaDenuncia generated by hbm2java
 */
public class PersonaDenuncia  implements java.io.Serializable {


     private Integer idPerden;
     private Denuncia denuncia;
     private Operativo operativo;
     private Persona persona;
     private String situacion;
     private String estado;
     private Set personaProcesos = new HashSet(0);

    public PersonaDenuncia() {
    }

	
    public PersonaDenuncia(Persona persona, String situacion, String estado) {
        this.persona = persona;
        this.situacion = situacion;
        this.estado = estado;
    }
    public PersonaDenuncia(Denuncia denuncia, Operativo operativo, Persona persona, String situacion, String estado, Set personaProcesos) {
       this.denuncia = denuncia;
       this.operativo = operativo;
       this.persona = persona;
       this.situacion = situacion;
       this.estado = estado;
       this.personaProcesos = personaProcesos;
    }
   
    public Integer getIdPerden() {
        return this.idPerden;
    }
    
    public void setIdPerden(Integer idPerden) {
        this.idPerden = idPerden;
    }
    public Denuncia getDenuncia() {
        return this.denuncia;
    }
    
    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }
    public Operativo getOperativo() {
        return this.operativo;
    }
    
    public void setOperativo(Operativo operativo) {
        this.operativo = operativo;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getSituacion() {
        return this.situacion;
    }
    
    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getPersonaProcesos() {
        return this.personaProcesos;
    }
    
    public void setPersonaProcesos(Set personaProcesos) {
        this.personaProcesos = personaProcesos;
    }




}


