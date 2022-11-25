package pe.edu.upc.entity;

import javax.persistence.*;

@Entity
@Table(name="empresario")
public class empresario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "razonEmpresario", nullable = false, length = 45)
    private String razonEmpresario;

    @Column(name = "rucEmpresario", nullable = false, length = 45)
    private String rucEmpresario;

    @Column(name = "rubroEmpresario", nullable = false, length = 45)
    private String rubroEmpresario;

    @Column(name = "descEmpresario", nullable = false, length = 45)
    private String descEmpresario;

    @ManyToOne
    @JoinColumn(name = "usuario", nullable = false)
    private usuario usuario;

    public empresario() {
        super();
        // TODO Auto-generated constructor stub
    }

    public empresario(int id, String razonEmpresario, String rucEmpresario, String rubroEmpresario, String descEmpresario, pe.edu.upc.entity.usuario usuario) {
        this.id = id;
        this.razonEmpresario = razonEmpresario;
        this.rucEmpresario = rucEmpresario;
        this.rubroEmpresario = rubroEmpresario;
        this.descEmpresario = descEmpresario;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonEmpresario() {
        return razonEmpresario;
    }

    public void setRazonEmpresario(String razonEmpresario) {
        this.razonEmpresario = razonEmpresario;
    }

    public String getRucEmpresario() {
        return rucEmpresario;
    }

    public void setRucEmpresario(String rucEmpresario) {
        this.rucEmpresario = rucEmpresario;
    }

    public String getRubroEmpresario() {
        return rubroEmpresario;
    }

    public void setRubroEmpresario(String rubroEmpresario) {
        this.rubroEmpresario = rubroEmpresario;
    }

    public String getDescEmpresario() {
        return descEmpresario;
    }

    public void setDescEmpresario(String descEmpresario) {
        this.descEmpresario = descEmpresario;
    }

    public pe.edu.upc.entity.usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(pe.edu.upc.entity.usuario usuario) {
        this.usuario = usuario;
    }
}