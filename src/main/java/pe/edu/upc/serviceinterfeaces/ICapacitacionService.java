package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Capacitacion;

import java.util.List;

public interface ICapacitacionService {
    public void insert(Capacitacion capacitacion);
    List<Capacitacion> list();

    public void delete(int id);

    List<Capacitacion>search(String descCapacitacion);
}
