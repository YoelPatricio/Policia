package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SubtipoDelito generated by hbm2java
 */
public class SubtipoDelito  implements java.io.Serializable {


     private Integer idStdelito;
     private int idTdelito;
     private String nombre;
     private Set denuncias = new HashSet(0);

    public SubtipoDelito() {
    }

	
    public SubtipoDelito(int idTdelito, String nombre) {
        this.idTdelito = idTdelito;
        this.nombre = nombre;
    }
    public SubtipoDelito(int idTdelito, String nombre, Set denuncias) {
       this.idTdelito = idTdelito;
       this.nombre = nombre;
       this.denuncias = denuncias;
    }
   
    public Integer getIdStdelito() {
        return this.idStdelito;
    }
    
    public void setIdStdelito(Integer idStdelito) {
        this.idStdelito = idStdelito;
    }
    public int getIdTdelito() {
        return this.idTdelito;
    }
    
    public void setIdTdelito(int idTdelito) {
        this.idTdelito = idTdelito;
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


