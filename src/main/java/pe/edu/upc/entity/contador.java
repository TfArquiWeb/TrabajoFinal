package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contador")
public class contador {

	@Column(name = "descContador", nullable = false, length = 45)
	private String descContador;
	
	@Column(name = "linkedinContador", nullable = false, length = 45)
	private String linkedinContador;
	
	@Column(name = "usu", nullable = false, length = 45)
	private usuario usu;

	public contador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public contador(String descContador, String linkedinContador, usuario usu) {
		super();
		this.descContador = descContador;
		this.linkedinContador = linkedinContador;
		this.usu = usu;
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

	public usuario getUsu() {
		return usu;
	}

	public void setUsu(usuario usu) {
		this.usu = usu;
	}
	
}
