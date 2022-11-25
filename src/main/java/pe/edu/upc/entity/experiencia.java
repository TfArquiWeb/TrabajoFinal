package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experiencia")
public class experiencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "descExperiencia", length = 45, nullable = false)
	private String descExperiencia;
	public experiencia() {
	}
	public experiencia(int id, String descExperiencia) {
		this.id = id;
		this.descExperiencia = descExperiencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescExperiencia() { return descExperiencia;}
	public void setDescExperiencia(String descExperiencia) {
		this.descExperiencia = descExperiencia;
	}
	
}
