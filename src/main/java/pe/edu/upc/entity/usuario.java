package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dniUsuario")
	private String dniUsuario;
	
	@Column(name = "nombreUsuario")
	private String nombreUsuario;


	public usuario() {
		super();
	}

	public usuario(Long id, String dniUsuario, String nombreUsuario, String apellidoUsuario, String numeroUsuario,
			String correoUsuario, String fotoUsuario) {
		super();
		this.id = id;
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	
}
