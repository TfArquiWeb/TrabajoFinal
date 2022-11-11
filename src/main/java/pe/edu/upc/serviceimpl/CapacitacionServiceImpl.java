package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.repository.ICapacitacionRepository;
import pe.edu.upc.serviceinterfeaces.ICapacitacionService;

import java.util.List;
@Service
public class CapacitacionServiceImpl implements ICapacitacionService {
    @Autowired
    private ICapacitacionRepository cR;
    @Override
    public void insert(Capacitacion capacitacion) {
        cR.save(capacitacion);
    }

    @Override
    public List<Capacitacion> list() {return cR.findAll();}

    @Override
    public void delete(int id) {cR.deleteById(id);}
    @Override
    public List<Capacitacion> buscar(String descCapacitacion) {return cR.buscardescCapacitacion(descCapacitacion);}
}
