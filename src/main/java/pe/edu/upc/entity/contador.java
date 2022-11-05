package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contador")
public class contador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcontador;
	
	@Column(name = "descContador", nullable = false, length = 45)
	private String descContador;
	
	@Column(name = "linkedinContador", nullable = false, length = 45)
	private String linkedinContador;
	
	@ManyToOne
	@JoinColumn(name = "usuario", nullable = false)
	private usuario usuario;

	public contador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public contador(Long idcontador, String descContador, String linkedinContador, pe.edu.upc.entity.usuario usuario) {
		super();
		this.idcontador = idcontador;
		this.descContador = descContador;
		this.linkedinContador = linkedinContador;
		this.usuario = usuario;
	}

	public Long getId() {
		return idcontador;
	}

	public void setId(Long idcontador) {
		this.idcontador = idcontador;
	}

	public String getDescContador() {
		return descContador;
	}

	public void setDescContador(String descContador) {
		this.descContador = descContador;
	}

	public String getLinkedinContador() {
		return linkedinContador;
	}

	public void setLinkedinContador(String linkedinContador) {
		this.linkedinContador = linkedinContador;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
