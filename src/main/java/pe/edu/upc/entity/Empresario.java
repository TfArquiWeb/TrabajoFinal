package pe.edu.upc.entity;


import javax.persistence.*;

@Entity
@Table(name = "Empresario")
public class Empresario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ide;

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

    public Empresario(int ide, String razonEmpresario, int rucEmpresario, String rubroEmpresario, String descEmpresario, usuario usuario) {
        this.ide = ide;
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
        return ide;
    }

    public void setIdEmpresario(int ide) {
        this.ide = ide;
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

