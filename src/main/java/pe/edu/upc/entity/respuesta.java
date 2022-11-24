package pe.edu.upc.entity;

public class respuesta {
	private String usuario;
	private String cantidad;
	public respuesta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public respuesta(String usuario, String cantidad) {
		super();
		this.usuario = usuario;
		this.cantidad = cantidad;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
}
