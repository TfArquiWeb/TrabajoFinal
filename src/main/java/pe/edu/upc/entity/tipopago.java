package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipopago")
public class tipopago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipopago",length = 35,nullable = false)
	private String Tipopago;
	public tipopago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tipopago(Long id, String tipopago) {
		super();
		this.id = id;
		this.Tipopago = tipopago;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipopago() {
		return Tipopago;
	}
	public void setTipopago(String tipopago) {
		Tipopago = tipopago;
	}
	
}
