package pe.edu.upc.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Empresario")
public class Empresario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresario;

    @Column(name = "razonEmpresario", length = 60, nullable = false)
    private String razonEmpresario;

    @Column(name = "rucEmpresario", length = 12, nullable = false)
    private int rucEmpresario;

    @Column(name = "rubroEmpresario", length = 100, nullable = false)
    private String rubroEmpresario;

    @Column(name = "descEmpresario", length = 100, nullable = false)
    private String descEmpresario;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private usuario usuario;

    public Empresario(int idEmpresario, String razonEmpresario, int rucEmpresario, String rubroEmpresario, String descEmpresario, usuario usuario) {
        this.idEmpresario = idEmpresario;
        this.razonEmpresario = razonEmpresario;
        this.rucEmpresario = rucEmpresario;
        this.rubroEmpresario = rubroEmpresario;
        this.descEmpresario= descEmpresario;
        this.usuario=usuario;
    }

    public Empresario() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getIdEmpresario() {
        return idEmpresario;
    }

    public void setIdEmpresario(int idEmpresario) {
        this.idEmpresario = idEmpresario;
    }

    public String getRazonEmpresario() {
        return razonEmpresario;
    }

    public void setRazonEmpresario(String razonEmpresario) {this.razonEmpresario = razonEmpresario;}

    public int getRucEmpresario() {
        return rucEmpresario;
    }

    public void setRucEmpresario(int rucEmpresario) {this.rucEmpresario = rucEmpresario;}
    public String getRubroEmpresario() {return razonEmpresario;}

    public void setRubroEmpresario(String razonEmpresario) {this.razonEmpresario = razonEmpresario;}

    public String getDescEmpresario() {return descEmpresario;}

    public void setDescEmpresario(String descEmpresario) {this.descEmpresario = descEmpresario;}

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

}

