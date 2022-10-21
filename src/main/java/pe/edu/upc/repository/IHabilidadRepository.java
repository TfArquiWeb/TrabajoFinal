package pe.edu.upc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.habilidad;

@Repository
public interface IHabilidadRepository extends JpaRepository<habilidad,Integer>{

}
