package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.capacitacion;
@Repository
public interface ICapacitacionRepository extends JpaRepository<capacitacion,Integer>{
	
}
