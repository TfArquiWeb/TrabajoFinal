package pe.edu.upc.entity;

import javax.persistence.*;
@Entity
@Table(name = "Capacitacion")
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descCapacitacion",length = 45,nullable = false)
    private String descCapacitacion;

    public Capacitacion() {
    }

    public Capacitacion(int id, String descCapacitacion) {
        this.id = id;
        this.descCapacitacion = descCapacitacion;
    }

    public int getIdCapacitacion() {
        return id;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.id = idCapacitacion;
    }

    public String getDescCapacitacion() {
        return descCapacitacion;
    }

    public void setDescCapacitacion(String descCapacitacion) {
        this.descCapacitacion = descCapacitacion;
    }

}
