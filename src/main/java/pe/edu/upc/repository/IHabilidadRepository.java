package pe.edu.upc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.habilidad;

import java.util.List;

@Repository
public interface IHabilidadRepository extends JpaRepository<habilidad,Integer>{
    @Query("from habilidad h where h.descHabilidad like %:descHabilidad%")
    List<habilidad> buscardescHabilidad(@Param("descHabilidad") String descHabilidad);
}
