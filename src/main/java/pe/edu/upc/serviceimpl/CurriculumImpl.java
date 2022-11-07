package pe.edu.upc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.repository.ICurriculumRepository;
import pe.edu.upc.serviceinterfeaces.ICurriculumService;
import pe.edu.upc.entity.Curriculum;

import java.util.List;
import java.util.Optional;

@RestController
public class CurriculumImpl implements ICurriculumService {

    @Autowired
    private ICurriculumRepository dCurriculum;

    @Override
    @Transactional
    public boolean insertar(Curriculum vehiculo) {
        Curriculum objCurriculum = dCurriculum.save(vehiculo);
        if (objCurriculum == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idCurriculum) {

        dCurriculum.deleteById(idCurriculum);

    }

    @Override
    public Optional<Curriculum> listarId(int idCurriculum) {

        return dCurriculum.findById(idCurriculum);
    }

    @Override
    public List<Curriculum> listar() {
        return dCurriculum.findAll();
    }

    @Override
    public List<Curriculum> buscarCapacitacion(String descCurriculum) {
        return dCurriculum.buscarCapacitacion(descCurriculum);
    }

    @Override
    public List<Curriculum> buscarExperiencia(String descExperiencia) {
        return dCurriculum.buscarExperiencia(descExperiencia);
    }

}
