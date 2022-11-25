package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.entity.respuestaCu;
import pe.edu.upc.repository.ICurriculumRepository;
import pe.edu.upc.serviceinterfeaces.ICurriculumService;
import pe.edu.upc.entity.curriculum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CurriculumImpl implements ICurriculumService {

    @Autowired
    private ICurriculumRepository dCurriculum;

    @Override
    @Transactional
    public boolean insert(curriculum c) {
    // TODO Auto-generated method stub
        curriculum objcurriculum = dCurriculum.save(c);
		if (objcurriculum==null) {
        return false;
    }else
    {
        return true;
    }
}
    @Override
    @Transactional
    public void delete(int id) { dCurriculum.deleteById(id);}
    @Override
    public List<curriculum> list() {
        return dCurriculum.findAll();
    }

    @Override
    public Optional<curriculum> listarId(int id) {
        return dCurriculum.findById(id);
    }

    public List<curriculum> searchdescCapacitacion(String descCapacitacion) {
        // TODO Auto-generated method stub
        return dCurriculum.BuscardescCapacitacion(descCapacitacion);
    }
    public List<curriculum> searchdescExperiencia(String descExperiencia) {
        // TODO Auto-generated method stub
        return dCurriculum.BuscardescExperiencia(descExperiencia);
    }
    public List<curriculum> searchdescHabilidad(String descHabilidad) {
        // TODO Auto-generated method stub
        return dCurriculum.BuscardescHabilidad(descHabilidad);
    }

    @Override
    public List<curriculum> searchCapacitacion(String descCapacitacion) {
        return dCurriculum.BuscarCapacitacion(descCapacitacion);
    }
    @Override
    public List<curriculum> searchExperiencia(String descExperiencia) {
        return dCurriculum.BuscarExperiencia(descExperiencia);
    }
    @Override
    public List<curriculum> searchHabilidad(String descHabilidad) {
        return dCurriculum.BuscarHabilidad(descHabilidad);
    }

    @Override
    public List<curriculum> ordenarDesc() {
        // TODO Auto-generated method stub
        return dCurriculum.ordenarDesc();
    }

    @Override
    public List<respuestaCu> cantidadCurriculum() {
        List<respuestaCu>lista=new ArrayList<>();
        dCurriculum.cantidadCurriculum().forEach(y->{
                respuestaCu r=new respuestaCu();
                r.setCapacitacion(y[0]);
                r.setCantidad(y[1]);
                lista.add(r);
        }
        );
        // TODO Auto-generated method stub
        return lista;
    }
}
