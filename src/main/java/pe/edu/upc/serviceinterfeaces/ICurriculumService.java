package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.Curriculum;
import pe.edu.upc.entity.contador;
import pe.edu.upc.entity.respuestaCu;

import java.util.List;
import java.util.Optional;

public interface ICurriculumService {

    public boolean insert(Curriculum c);
    public void delete(int id);
    List<Curriculum> list();
    Optional<Curriculum> listarId(int id);

    List<Curriculum> searchdescCapacitacion(String descCurriculum);
    List<Curriculum>searchdescExperiencia(String descExperiencia);
    List<Curriculum> searchdescHabilidad(String descHabilidad);

    List<Curriculum> searchCapacitacion(String descCurriculum);
    List<Curriculum>searchExperiencia(String descExperiencia);
    List<Curriculum> searchHabilidad(String descHabilidad);
    List<Curriculum>ordenarDesc();
    List<respuestaCu>cantidadCurriculum();
}
