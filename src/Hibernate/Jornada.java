package Hibernate;
// Generated 15-abr-2016 11:59:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Jornada generated by hbm2java
 */
public class Jornada  implements java.io.Serializable {


     private Integer idJornada;
     private int año;
     private Set datoses = new HashSet(0);

    public Jornada() {
    }

    public Jornada(Integer idJornada, int año,Set datoses) {
        this.idJornada = idJornada;
        this.año = año;
        this.datoses = datoses;
    }

    public Integer getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Integer idJornada) {
        this.idJornada = idJornada;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Set getDatoses() {
        return datoses;
    }

    public void setDatoses(Set datoses) {
        this.datoses = datoses;
    }

    


}

