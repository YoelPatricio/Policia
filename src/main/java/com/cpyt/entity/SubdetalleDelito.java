package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SubdetalleDelito generated by hbm2java
 */
public class SubdetalleDelito  implements java.io.Serializable {


     private Integer idSddelito;
     private int idStdelito;
     private String nombre;
     private Set denuncias = new HashSet(0);

    public SubdetalleDelito() {
    }

	
    public SubdetalleDelito(int idStdelito, String nombre) {
        this.idStdelito = idStdelito;
        this.nombre = nombre;
    }
    public SubdetalleDelito(int idStdelito, String nombre, Set denuncias) {
       this.idStdelito = idStdelito;
       this.nombre = nombre;
       this.denuncias = denuncias;
    }
   
    public Integer getIdSddelito() {
        return this.idSddelito;
    }
    
    public void setIdSddelito(Integer idSddelito) {
        this.idSddelito = idSddelito;
    }
    public int getIdStdelito() {
        return this.idStdelito;
    }
    
    public void setIdStdelito(int idStdelito) {
        this.idStdelito = idStdelito;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getDenuncias() {
        return this.denuncias;
    }
    
    public void setDenuncias(Set denuncias) {
        this.denuncias = denuncias;
    }




}


