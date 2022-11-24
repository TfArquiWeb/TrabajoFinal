package pe.edu.upc.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Curriculum")
public class Curriculum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "descCapacitacion", nullable = false)
    private Capacitacion capacitacion;

    @ManyToOne
    @JoinColumn(name = "descExperiencia", nullable = false)
    private experiencia experiencia;

    @ManyToOne
    @JoinColumn(name = "descHabilidad", nullable = false)
    private habilidad habilidad;





    

    public Curriculum() {
    }

    public Curriculum(int id, Capacitacion capacitacion, pe.edu.upc.entity.experiencia experiencia, pe.edu.upc.entity.habilidad habilidad) {

        this.id = id;
        this.capacitacion = capacitacion;
        this.experiencia = experiencia;
        this.habilidad = habilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public pe.edu.upc.entity.experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(pe.edu.upc.entity.experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public pe.edu.upc.entity.habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(pe.edu.upc.entity.habilidad habilidad) {
        this.habilidad = habilidad;
    }
}

