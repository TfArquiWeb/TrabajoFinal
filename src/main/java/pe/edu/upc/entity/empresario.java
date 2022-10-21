package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "empresario")
public class empresario {
	@Column(name = "razonsocialEmpresario", nullable = false, length = 45)
	private String razonsocialEmpresario;
	
	@Column(name = "rucEmpresario", nullable = false, length = 45)
	private int rucEmpresario;
	
	@Column(name = "rubroEmpresario", nullable = false, length = 45)
	private String rubroEmpresario;
	
	@Column(name = "descEmpresario", nullable = false, length = 45)
	private String descEmpresario;		
	
	@Column(name = "usue", nullable = false, length = 45)
	private usuario usue;

	public empresario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empresario(String razonsocialEmpresario, int rucEmpresario, String rubroEmpresario, String descEmpresario,
			usuario usue) {
		super();
		this.razonsocialEmpresario = razonsocialEmpresario;
		this.rucEmpresario = rucEmpresario;
		this.rubroEmpresario = rubroEmpresario;
		this.descEmpresario = descEmpresario;
		this.usue = usue;
	}

	public String getRazonsocialEmpresario() {
		return razonsocialEmpresario;
	}

	public void setRazonsocialEmpresario(String razonsocialEmpresario) {
		this.razonsocialEmpresario = razonsocialEmpresario;
	}

	public int getRucEmpresario() {
		return rucEmpresario;
	}

	public void setRucEmpresario(int rucEmpresario) {
		this.rucEmpresario = rucEmpresario;
	}

	public String getRubroEmpresario() {
		return rubroEmpresario;
	}

	public void setRubroEmpresario(String rubroEmpresario) {
		this.rubroEmpresario = rubroEmpresario;
	}

	public String getDescEmpresario() {
		return descEmpresario;
	}

	public void setDescEmpresario(String descEmpresario) {
		this.descEmpresario = descEmpresario;
	}

	public usuario getUsue() {
		return usue;
	}

	public void setUsue(usuario usue) {
		this.usue = usue;
	}
	
	
}
