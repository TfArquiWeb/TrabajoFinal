package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.tipomoneda;
@Repository
public interface ITipoMonedaRepository extends JpaRepository<tipomoneda,Integer>{

}
