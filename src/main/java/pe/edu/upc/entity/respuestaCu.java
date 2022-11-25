package pe.edu.upc.entity;

public class respuestaCu {

    private String capacitacion;
    private String cantidad;
    public respuestaCu() {
        super();
        // TODO Auto-generated constructor stub
    }
    public respuestaCu(String capacitacion, String cantidad) {
        super();
        this.capacitacion = capacitacion;
        this.cantidad = cantidad;
    }

    public String getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
