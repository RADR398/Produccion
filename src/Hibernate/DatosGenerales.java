package Hibernate;
// Generated 04-18-2016 10:44:33 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DatosGenerales generated by hbm2java
 */
public class DatosGenerales  implements java.io.Serializable {


     private Integer idDatosGenerales;
     private Jornada jornada;
     private Producto producto;
     private Float costoContratacion;
     private Float costoDespido;
     private Float costoSubcontratacion;
     private Float stockSeguridad;
     private Float inversionInicial;
     private Float numeroTrabajadores;
     private Float costoHoraNormal;
     private Float costoHoraExtra;
     private Float horasRequeridas;
     private Float materiales;
     private Float costoMantenimiento;
     private Set datosMeses = new HashSet(0);

    public DatosGenerales() {
    }

	
    public DatosGenerales(Jornada jornada, Producto producto) {
        this.jornada = jornada;
        this.producto = producto;
    }
    public DatosGenerales(Jornada jornada, Producto producto, Float costoContratacion, Float costoDespido, Float costoSubcontratacion, Float stockSeguridad, Float inversionInicial, Float numeroTrabajadores, Float costoHoraNormal, Float costoHoraExtra, Float horasRequeridas, Float materiales, Float costoMantenimiento, Set datosMeses) {
       this.jornada = jornada;
       this.producto = producto;
       this.costoContratacion = costoContratacion;
       this.costoDespido = costoDespido;
       this.costoSubcontratacion = costoSubcontratacion;
       this.stockSeguridad = stockSeguridad;
       this.inversionInicial = inversionInicial;
       this.numeroTrabajadores = numeroTrabajadores;
       this.costoHoraNormal = costoHoraNormal;
       this.costoHoraExtra = costoHoraExtra;
       this.horasRequeridas = horasRequeridas;
       this.materiales = materiales;
       this.costoMantenimiento = costoMantenimiento;
       this.datosMeses = datosMeses;
    }
   
    public Integer getIdDatosGenerales() {
        return this.idDatosGenerales;
    }
    
    public void setIdDatosGenerales(Integer idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }
    public Jornada getJornada() {
        return this.jornada;
    }
    
    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Float getCostoContratacion() {
        return this.costoContratacion;
    }
    
    public void setCostoContratacion(Float costoContratacion) {
        this.costoContratacion = costoContratacion;
    }
    public Float getCostoDespido() {
        return this.costoDespido;
    }
    
    public void setCostoDespido(Float costoDespido) {
        this.costoDespido = costoDespido;
    }
    public Float getCostoSubcontratacion() {
        return this.costoSubcontratacion;
    }
    
    public void setCostoSubcontratacion(Float costoSubcontratacion) {
        this.costoSubcontratacion = costoSubcontratacion;
    }
    public Float getStockSeguridad() {
        return this.stockSeguridad;
    }
    
    public void setStockSeguridad(Float stockSeguridad) {
        this.stockSeguridad = stockSeguridad;
    }
    public Float getInversionInicial() {
        return this.inversionInicial;
    }
    
    public void setInversionInicial(Float inversionInicial) {
        this.inversionInicial = inversionInicial;
    }
    public Float getNumeroTrabajadores() {
        return this.numeroTrabajadores;
    }
    
    public void setNumeroTrabajadores(Float numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
    public Float getCostoHoraNormal() {
        return this.costoHoraNormal;
    }
    
    public void setCostoHoraNormal(Float costoHoraNormal) {
        this.costoHoraNormal = costoHoraNormal;
    }
    public Float getCostoHoraExtra() {
        return this.costoHoraExtra;
    }
    
    public void setCostoHoraExtra(Float costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }
    public Float getHorasRequeridas() {
        return this.horasRequeridas;
    }
    
    public void setHorasRequeridas(Float horasRequeridas) {
        this.horasRequeridas = horasRequeridas;
    }
    public Float getMateriales() {
        return this.materiales;
    }
    
    public void setMateriales(Float materiales) {
        this.materiales = materiales;
    }
    public Float getCostoMantenimiento() {
        return this.costoMantenimiento;
    }
    
    public void setCostoMantenimiento(Float costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }
    public Set getDatosMeses() {
        return this.datosMeses;
    }
    
    public void setDatosMeses(Set datosMeses) {
        this.datosMeses = datosMeses;
    }




}

