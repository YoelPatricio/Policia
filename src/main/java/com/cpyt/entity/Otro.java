package com.cpyt.entity;
// Generated 27/06/2018 03:08:19 AM by Hibernate Tools 4.3.1



/**
 * Otro generated by hbm2java
 */
public class Otro  implements java.io.Serializable {


     private Integer idOtro;
     private Operativo operativo;
     private String nombre;
     private String descripcion;

    public Otro() {
    }

    public Otro(Operativo operativo, String nombre, String descripcion) {
       this.operativo = operativo;
       this.nombre = nombre;
       this.descripcion = descripcion;
    }
   
    public Integer getIdOtro() {
        return this.idOtro;
    }
    
    public void setIdOtro(Integer idOtro) {
        this.idOtro = idOtro;
    }
    public Operativo getOperativo() {
        return this.operativo;
    }
    
    public void setOperativo(Operativo operativo) {
        this.operativo = operativo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


