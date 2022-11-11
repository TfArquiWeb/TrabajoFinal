package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.Curriculum;

import java.util.List;
import java.util.Optional;

public interface ICurriculumService {

    public boolean insertar(Curriculum curriculum);

    public void eliminar(int idCurriculum);

    List<Curriculum> listar();

    List<Curriculum> buscarCapacitacion(String descCurriculum);

    List<Curriculum> buscarExperiencia(String descExperiencia);
    List<Curriculum> buscarHabilidad(String descHabilidad);

}
