package pe.edu.upc.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Curriculum")
public class Curriculum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurriculum;
    @ManyToOne
    @JoinColumn(name = "descCapacitacion", nullable = false)
    private Capacitacion capacitacion;

    @ManyToOne
    @JoinColumn(name = "descExperiencia", nullable = false)
    private experiencia experiencia;

    @ManyToOne
    @JoinColumn(name = "descHabilidad", nullable = false)
    private habilidad habilidad;

    public Curriculum(int idCurriculum, Capacitacion capacitacion, experiencia experiencia, habilidad habilidad) {
        this.idCurriculum = idCurriculum;
        this.capacitacion = capacitacion;
        this.experiencia = experiencia;
        this.habilidad = habilidad;
    }

    public Curriculum() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getIdCurriculum() {
        return idCurriculum;
    }

    public void setIdCurriculum(int idCurriculum) {
        this.idCurriculum = idCurriculum;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }
    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public experiencia getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public habilidad getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(habilidad habilidad) {
        this.habilidad = habilidad;
    }




}
