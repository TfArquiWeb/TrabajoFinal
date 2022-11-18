package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.Curriculum;
import pe.edu.upc.entity.contador;

import java.util.List;
import java.util.Optional;

public interface ICurriculumService {

    public void insert(Curriculum curriculum);
    public void delete(int idCurriculum);
    List<Curriculum> list();
    public Optional<Curriculum> listarId(int idCurriculum);
    List<Curriculum> buscarCapacitacion(String descCurriculum);
    List<Curriculum>buscarExperiencia(String descExperiencia);
    List<Curriculum> buscarHabilidad(String descHabilidad);
}
