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
	
	@Column(name = "dniUsuario",nullable = false, length = 45)
	private String dniUsuario;
	
	@Column(name = "nombreUsuario",nullable = false, length = 45)
	private String nombreUsuario;

	@Column(name = "apellidoUsuario",nullable = false, length = 45)
	private String apellidoUsuario;
	
	@Column(name = "numeroUsuario",nullable = false, length = 45)
	private String numeroUsuario;
	
	@Column(name = "correoUsuario",nullable = false, length = 45)
	private String correoUsuario;
	
	@Column(name = "fotoUsuario",nullable = false, length = 45)
	private String fotoUsuario;

	public usuario() {
		super();
	}	

	public usuario(Long id, String dniUsuario, String nombreUsuario, String apellidoUsuario, String numeroUsuario,
			String correoUsuario, String fotoUsuario) {
		super();
		this.id = id;
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.numeroUsuario = numeroUsuario;
		this.correoUsuario = correoUsuario;
		this.fotoUsuario = fotoUsuario;
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

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	
}
