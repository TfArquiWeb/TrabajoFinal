package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescCapacitacion() {
        return descCapacitacion;
    }
    public void setDescCapacitacion(String descCapacitacion) {
        this.descCapacitacion = descCapacitacion;
    }

}
