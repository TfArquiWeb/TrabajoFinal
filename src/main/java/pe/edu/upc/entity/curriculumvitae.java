package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "curriculumvitae")
public class curriculumvitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "habilidad", nullable = false, length = 45)
	private habilidad habilidad;
	
	@Column(name = "experiencia", nullable = false, length = 45)
	private experiencia experiencia;
	
	@Column(name = "capacitacion", nullable = false, length = 45)
	private capacitacion capacitacion;

	public curriculumvitae() {
		super();
		// TODO Auto-generated constructor stub
	}

	public curriculumvitae(Long id, pe.edu.upc.entity.habilidad habilidad, pe.edu.upc.entity.experiencia experiencia,
			pe.edu.upc.entity.capacitacion capacitacion) {
		super();
		this.id = id;
		this.habilidad = habilidad;
		this.experiencia = experiencia;
		this.capacitacion = capacitacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public habilidad getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(habilidad habilidad) {
		this.habilidad = habilidad;
	}

	public experiencia getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(experiencia experiencia) {
		this.experiencia = experiencia;
	}

	public capacitacion getCapacitacion() {
		return capacitacion;
	}

	public void setCapacitacion(capacitacion capacitacion) {
		this.capacitacion = capacitacion;
	}
	
	
}
