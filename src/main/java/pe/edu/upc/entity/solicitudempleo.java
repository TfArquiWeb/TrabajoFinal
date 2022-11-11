package pe.edu.upc.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="solicitudempleo") // puede que cambiar por el de la BD si esta mal
public class solicitudempleo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fechaSE")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaSE;

    @Column(name = "estadoSE", nullable = false, length = 45)
    private String estadoSE;

    //@ManyToOne
    //@JoinColumn(name = "empresario", nullable = false)
    //private empresario empresario;

    @ManyToOne
    @JoinColumn(name = "contador", nullable = false)
    private contador contador;

    public solicitudempleo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public solicitudempleo(int id, LocalDate descContador, String estadoSE, /*pe.edu.upc.entity.Empresario Empresario,*/ pe.edu.upc.entity.contador contador) {
        super();
        this.id = id;
        this.fechaSE = fechaSE;
        this.estadoSE = estadoSE;
        //this.Empresario = Empresario;
        this.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaSE() {
        return fechaSE;
    }

    public void setFechaSE(LocalDate fechaSE) {
        this.fechaSE = fechaSE;
    }

    public String getEstadoSE() {
        return estadoSE;
    }

    public void setEstadoSE(String estadoSE) {
        this.estadoSE = estadoSE;
    }

    //public Empresario getEmpresario() {
    //    return Empresario;
    //}

    //public void setEmpresario(Empresario Empresario) {
    //    this.Empresario = Empresario;
    //}

    public contador getContador() {
        return contador;
    }

    public void setContador(contador contador) {
        this.contador = contador;
    }
}
