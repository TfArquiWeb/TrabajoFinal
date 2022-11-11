package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.experiencia;

import java.util.List;

@Repository
public interface IExperienciaRepository extends JpaRepository<experiencia,Integer>{
    @Query("from experiencia e where e.descExperiencia like %:descExperiencia%")
    List<experiencia> buscardescExperiencia(@Param("descExperiencia")String descExperiencia);
}
