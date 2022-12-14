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
	private int id;
	
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

	public contador(int id, String descContador, String linkedinContador, pe.edu.upc.entity.usuario usuario) {
		super();
		this.id = id;
		this.descContador = descContador;
		this.linkedinContador = linkedinContador;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
