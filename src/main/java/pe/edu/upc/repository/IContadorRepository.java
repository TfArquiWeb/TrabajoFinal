package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.contador;
@Repository
public interface IContadorRepository extends JpaRepository<contador,Integer>{

}
