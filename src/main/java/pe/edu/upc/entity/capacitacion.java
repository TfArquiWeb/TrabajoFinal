package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capacitacion")
public class capacitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descCapacitacion", nullable = false, length = 45)
	private String descCapacitacion;

	public capacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public capacitacion(Long id, String descCapacitacion) {
		super();
		this.id = id;
		this.descCapacitacion = descCapacitacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescCapacitacion() {
		return descCapacitacion;
	}

	public void setDescCapacitacion(String descCapacitacion) {
		this.descCapacitacion = descCapacitacion;
	}
	
}
