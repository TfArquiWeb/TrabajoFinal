package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.experiencia;
@Repository
public interface IExperienciaRepository extends JpaRepository<experiencia,Integer>{

}
