package pe.edu.upc.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Empresario")
public class Empresario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresario;

    @Column(name = "razonEmpresario", length = 60, nullable = false)
    private String razonEmpresario;

    @Column(name = "rucEmpresario")
    @JsonSerialize(using = ToStringSerializer.class)
    private int rucEmpresario;

    @Column(name = "rubroEmpresario")
    @JsonSerialize(using = ToStringSerializer.class)
    private String rubroEmpresario;

    @Column(name = "descEmpresario")
    @JsonSerialize(using = ToStringSerializer.class)
    private int descEmpresario;

    @ManyToOne
    @JoinColumn(name = "idEmpresario", nullable = false)
    private Empresario empresario;

    public Vehiculo(int idVehiculo, String licensePlateVehiculo, LocalDate manufacturingDateVehiculo, Propietario propietario) {
        this.idVehiculo = idVehiculo;
        this.licensePlateVehiculo = licensePlateVehiculo;
        this.manufacturingDateVehiculo = manufacturingDateVehiculo;
        this.propietario = propietario;
    }

    public Vehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getLicensePlateVehiculo() {
        return licensePlateVehiculo;
    }

    public void setLicensePlateVehiculo(String licensePlateVehiculo) {
        this.licensePlateVehiculo = licensePlateVehiculo;
    }

    public LocalDate getManufacturingDateVehiculo() {
        return manufacturingDateVehiculo;
    }

    public void setManufacturingDateVehiculo(LocalDate manufacturingDateVehiculo) {
        this.manufacturingDateVehiculo = manufacturingDateVehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}
}
