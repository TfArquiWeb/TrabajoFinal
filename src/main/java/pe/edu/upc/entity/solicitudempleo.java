package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "solicitudempleo")
public class solicitudempleo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fechaSE", nullable = false, length = 45)
	private String fechaSE;
	
	@Column(name = "estadoSE", nullable = false, length = 45)
	private String estadoSE;
	
	@Column(name = "usus", nullable = false, length = 45)
	private usuario usus;

	public solicitudempleo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public solicitudempleo(Long id, String fechaSE, String estadoSE, usuario usus) {
		super();
		this.id = id;
		this.fechaSE = fechaSE;
		this.estadoSE = estadoSE;
		this.usus = usus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaSE() {
		return fechaSE;
	}

	public void setFechaSE(String fechaSE) {
		this.fechaSE = fechaSE;
	}

	public String getEstadoSE() {
		return estadoSE;
	}

	public void setEstadoSE(String estadoSE) {
		this.estadoSE = estadoSE;
	}

	public usuario getUsus() {
		return usus;
	}

	public void setUsus(usuario usus) {
		this.usus = usus;
	}
	
	
}
