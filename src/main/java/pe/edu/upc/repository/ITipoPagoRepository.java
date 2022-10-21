package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.tipopago;

@Repository
public interface ITipoPagoRepository extends JpaRepository<tipopago,Integer>{

}
