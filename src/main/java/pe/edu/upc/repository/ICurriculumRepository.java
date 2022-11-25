package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.curriculum;

@Repository
public interface ICurriculumRepository extends JpaRepository<curriculum, Integer> {

    @Query("from curriculum c where c.capacitacion.descCapacitacion like %:descCapacitacion%")
    List<curriculum> BuscardescCapacitacion(@Param("descCapacitacion")String descCapacitacion);
    @Query("from curriculum c where c.experiencia.descExperiencia like %:descExperiencia%")
    List<curriculum> BuscardescExperiencia(@Param("descExperiencia") String descExperiencia);
    @Query("from curriculum c where c.habilidad.descHabilidad like %:descHabilidad%")
    List<curriculum> BuscardescHabilidad(@Param("descHabilidad") String descHabilidad);

    @Query("from curriculum c where c.capacitacion.descCapacitacion like %:descCapacitacion%")
    List<curriculum> BuscarCapacitacion(@Param("descCapacitacion") String descCapacitacion);
    @Query("from curriculum c where c.experiencia.descExperiencia like %:descExperiencia%")
    List<curriculum> BuscarExperiencia(@Param("descExperiencia") String descExperiencia);
    @Query("from curriculum c where c.habilidad.descHabilidad like %:descHabilidad%")
    List<curriculum> BuscarHabilidad(@Param("descHabilidad") String descHabilidad);

    @Query(value="Select * from Curriculum order by id desc",nativeQuery = true)
    List<curriculum>ordenarDesc();
    @Query(value="select c.desc_,count(c.id)from Curriculum c order by c.id",nativeQuery = true)
    List<String[]>cantidadCurriculum();



}