package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Curriculum;


@Repository
public interface ICurriculumRepository extends JpaRepository<Curriculum, Integer> {

    @Query("from Curriculum c where c.capacitacion.descCapacitacion like %:descCapacitacion%")
    List<Curriculum> buscarCapacitacion(@Param("descCapacitacion") String descCapacitacion);

    @Query("from Curriculum c where c.experiencia.descExperiencia like %:descExperiencia%")
    List<Curriculum> buscarExperiencia(@Param("descExperiencia") String descExperiencia);


    @Query("from Curriculum c where c.idCurriculum like %:idCurriculum%")
    List<Curriculum> buscarVehiculo(@Param("idCurriculum") String idCurriculum);

}