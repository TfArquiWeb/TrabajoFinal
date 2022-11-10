package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "habilidad")
public class habilidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "descHabilidad", nullable = false, length = 45)
	private String descHabilidad;
	public habilidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public habilidad(int id, String descHabilidad) {
		super();
		this.id = id;
		this.descHabilidad = descHabilidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescHabilidad() {
		return descHabilidad;
	}
	public void setDescHabilidad(String descHabilidad) {
		this.descHabilidad = descHabilidad;
	}
	
}
