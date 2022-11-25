package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Curriculum;
import pe.edu.upc.entity.contador;

@Repository
public interface ICurriculumRepository extends JpaRepository<Curriculum, Integer> {

    @Query("from Curriculum c where c.capacitacion.descCapacitacion like %:descCapacitacion%")
    List<Curriculum> BuscardescCapacitacion(@Param("descCapacitacion")String descCapacitacion);
    @Query("from Curriculum c where c.experiencia.descExperiencia like %:descExperiencia%")
    List<Curriculum> BuscardescExperiencia(@Param("descExperiencia") String descExperiencia);
    @Query("from Curriculum c where c.habilidad.descHabilidad like %:descHabilidad%")
    List<Curriculum> BuscardescHabilidad(@Param("descHabilidad") String descHabilidad);

    @Query("from Curriculum c where c.capacitacion.descCapacitacion like %:descCapacitacion%")
    List<Curriculum> BuscarCapacitacion(@Param("descCapacitacion") String descCapacitacion);
    @Query("from Curriculum c where c.experiencia.descExperiencia like %:descExperiencia%")
    List<Curriculum> BuscarExperiencia(@Param("descExperiencia") String descExperiencia);
    @Query("from Curriculum c where c.habilidad.descHabilidad like %:descHabilidad%")
    List<Curriculum> BuscarHabilidad(@Param("descHabilidad") String descHabilidad);

    @Query(value="Select * from Curriculum order by id desc",nativeQuery = true)
    List<Curriculum>ordenarDesc();
    @Query(value="select c.desc_,count(c.id)from Curriculum c order by c.id",nativeQuery = true)
    List<String[]>cantidadCurriculum();



}