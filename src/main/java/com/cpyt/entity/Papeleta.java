package com.cpyt.entity;
// Generated 27/06/2018 04:50:00 AM by Hibernate Tools 4.3.1



/**
 * Papeleta generated by hbm2java
 */
public class Papeleta  implements java.io.Serializable {


     private Integer idPape;
     private VehiculoIncautado vehiculoIncautado;
     private String tipoPape;
     private String stipoPape;
     private long monto;

    public Papeleta() {
    }

    public Papeleta(VehiculoIncautado vehiculoIncautado, String tipoPape, String stipoPape, long monto) {
       this.vehiculoIncautado = vehiculoIncautado;
       this.tipoPape = tipoPape;
       this.stipoPape = stipoPape;
       this.monto = monto;
    }
   
    public Integer getIdPape() {
        return this.idPape;
    }
    
    public void setIdPape(Integer idPape) {
        this.idPape = idPape;
    }
    public VehiculoIncautado getVehiculoIncautado() {
        return this.vehiculoIncautado;
    }
    
    public void setVehiculoIncautado(VehiculoIncautado vehiculoIncautado) {
        this.vehiculoIncautado = vehiculoIncautado;
    }
    public String getTipoPape() {
        return this.tipoPape;
    }
    
    public void setTipoPape(String tipoPape) {
        this.tipoPape = tipoPape;
    }
    public String getStipoPape() {
        return this.stipoPape;
    }
    
    public void setStipoPape(String stipoPape) {
        this.stipoPape = stipoPape;
    }
    public long getMonto() {
        return this.monto;
    }
    
    public void setMonto(long monto) {
        this.monto = monto;
    }




}


