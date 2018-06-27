package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vehiculo generated by hbm2java
 */
public class Vehiculo  implements java.io.Serializable {


     private Integer idVehi;
     private String marca;
     private String modelo;
     private int anio;
     private String tipoVehi;
     private Set vehiculoIncautados = new HashSet(0);

    public Vehiculo() {
    }

	
    public Vehiculo(String marca, String modelo, int anio, String tipoVehi) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoVehi = tipoVehi;
    }
    public Vehiculo(String marca, String modelo, int anio, String tipoVehi, Set vehiculoIncautados) {
       this.marca = marca;
       this.modelo = modelo;
       this.anio = anio;
       this.tipoVehi = tipoVehi;
       this.vehiculoIncautados = vehiculoIncautados;
    }
   
    public Integer getIdVehi() {
        return this.idVehi;
    }
    
    public void setIdVehi(Integer idVehi) {
        this.idVehi = idVehi;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return this.anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getTipoVehi() {
        return this.tipoVehi;
    }
    
    public void setTipoVehi(String tipoVehi) {
        this.tipoVehi = tipoVehi;
    }
    public Set getVehiculoIncautados() {
        return this.vehiculoIncautados;
    }
    
    public void setVehiculoIncautados(Set vehiculoIncautados) {
        this.vehiculoIncautados = vehiculoIncautados;
    }




}

