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
	private Long id;
	@Column(name = "descExperiencia", nullable = false, length = 45)
	private String descExperiencia;
	public experiencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public experiencia(Long id, String descExperiencia) {
		super();
		this.id = id;
		this.descExperiencia = descExperiencia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescExperiencia() {
		return descExperiencia;
	}
	public void setDescExperiencia(String descExperiencia) {
		this.descExperiencia = descExperiencia;
	}
	
}
