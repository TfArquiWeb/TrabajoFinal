package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tipomoneda")
public class tipomoneda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipomoneda;
	@Column(name = "TipodeMoneda", nullable = false, length = 45)
	private String TipodeMoneda;
	public tipomoneda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tipomoneda(Long id, String tipodeMoneda) {
		super();
		this.idtipomoneda = id;
		TipodeMoneda = tipodeMoneda;
	}
	public Long getId() {
		return idtipomoneda;
	}
	public void setId(Long id) {
		this.idtipomoneda = id;
	}
	public String getTipodeMoneda() {
		return TipodeMoneda;
	}
	public void setTipodeMoneda(String tipodeMoneda) {
		TipodeMoneda = tipodeMoneda;
	}
	
}
