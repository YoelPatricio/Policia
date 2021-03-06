package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * VehiculoIncautado generated by hbm2java
 */
public class VehiculoIncautado  implements java.io.Serializable {


     private Integer idVehincau;
     private Operativo operativo;
     private Vehiculo vehiculo;
     private String placa;
     private String descripcion;
     private String estado;
     private String tipo;
     private Set papeletas = new HashSet(0);
     private Set<Papeleta> papeletaList;

    public VehiculoIncautado() {
    }

	
    public VehiculoIncautado(Operativo operativo, Vehiculo vehiculo, String placa, String descripcion, String estado,String tipo) {
        this.operativo = operativo;
        this.vehiculo = vehiculo;
        this.placa = placa;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public VehiculoIncautado(Operativo operativo, Vehiculo vehiculo, String placa, String descripcion, String estado,String tipo, Set papeletas) {
       this.operativo = operativo;
       this.vehiculo = vehiculo;
       this.placa = placa;
       this.descripcion = descripcion;
       this.estado = estado;
       this.tipo = tipo;
       this.papeletas = papeletas;
    }
   
    public Integer getIdVehincau() {
        return this.idVehincau;
    }
    
    public void setIdVehincau(Integer idVehincau) {
        this.idVehincau = idVehincau;
    }
    public Operativo getOperativo() {
        return this.operativo;
    }
    
    public void setOperativo(Operativo operativo) {
        this.operativo = operativo;
    }
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getPapeletas() {
        return this.papeletas;
    }
    
    public void setPapeletas(Set papeletas) {
        this.papeletas = papeletas;
    }

    public Set<Papeleta> getPapeletaList() {
        return papeletaList;
    }

    public void setPapeletaList(Set<Papeleta> papeletaList) {
        this.papeletaList = papeletaList;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    


}


