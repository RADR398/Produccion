package Hibernate;
// Generated 15-abr-2016 11:59:02 by Hibernate Tools 4.3.1



/**
 * Datosmes generated by hbm2java
 */
public class Datosmes  implements java.io.Serializable {


     private Integer idDatosMes;
     private Datos datos;
     private Mes mes;
     private int demanda;
     private int diasHabiles;

    public Datosmes() {
    }

    public Datosmes(Datos datos, Mes mes, int demanda, int diasHabiles) {
       this.datos = datos;
       this.mes = mes;
       this.demanda = demanda;
       this.diasHabiles = diasHabiles;
    }
   
    public Integer getIdDatosMes() {
        return this.idDatosMes;
    }
    
    public void setIdDatosMes(Integer idDatosMes) {
        this.idDatosMes = idDatosMes;
    }
    public Datos getDatos() {
        return this.datos;
    }
    
    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    public Mes getMes() {
        return this.mes;
    }
    
    public void setMes(Mes mes) {
        this.mes = mes;
    }
    public int getDemanda() {
        return this.demanda;
    }
    
    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }
    public int getDiasHabiles() {
        return this.diasHabiles;
    }
    
    public void setDiasHabiles(int diasHabiles) {
        this.diasHabiles = diasHabiles;
    }




}

