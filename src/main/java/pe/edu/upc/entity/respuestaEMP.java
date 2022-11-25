package pe.edu.upc.entity;

public class respuestaEMP {
    private String usuario;
    private String cantidad;
    public respuestaEMP() {
        super();
        // TODO Auto-generated constructor stub
    }
    public respuestaEMP(String usuario, String cantidad) {
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
