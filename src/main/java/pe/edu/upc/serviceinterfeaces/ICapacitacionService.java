package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Capacitacion;

import java.util.List;
import java.util.Optional;

public interface ICapacitacionService {
    public void insert(Capacitacion capacitacion);
    List<Capacitacion> list();
    public void delete(int id);
    public Optional<Capacitacion> listarId(int id);
    List<Capacitacion> buscardescCapacitacion(String descCapacitacion);
}
