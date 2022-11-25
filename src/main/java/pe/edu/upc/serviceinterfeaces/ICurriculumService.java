package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.curriculum;
import pe.edu.upc.entity.respuestaCu;

import java.util.List;
import java.util.Optional;

public interface ICurriculumService {

    public boolean insert(curriculum c);
    public void delete(int id);
    List<curriculum> list();
    Optional<curriculum> listarId(int id);

    List<curriculum> searchdescCapacitacion(String descCurriculum);
    List<curriculum>searchdescExperiencia(String descExperiencia);
    List<curriculum> searchdescHabilidad(String descHabilidad);

    List<curriculum> searchCapacitacion(String descCurriculum);
    List<curriculum>searchExperiencia(String descExperiencia);
    List<curriculum> searchHabilidad(String descHabilidad);
    List<curriculum>ordenarDesc();
    List<respuestaCu>cantidadCurriculum();
}
