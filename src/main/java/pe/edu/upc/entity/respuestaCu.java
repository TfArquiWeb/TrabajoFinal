package pe.edu.upc.entity;

public class respuestaCu {
    private String Curriculum;
    private String cantidad;
    public respuestaCu() {
        super();
        // TODO Auto-generated constructor stub
    }
    public respuestaCu(String curriculum, String cantidad) {
        Curriculum = curriculum;
        this.cantidad = cantidad;
    }

    public String getCurriculum() { return Curriculum;
    }
    public void setCurriculum(String curriculum) { Curriculum = curriculum;
    }
    public String getCantidad() { return cantidad;
    }
    public void setCantidad(String cantidad) { this.cantidad = cantidad;
    }
}
