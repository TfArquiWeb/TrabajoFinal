package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.tipomoneda;
import pe.edu.upc.entity.tipopago;

import java.util.List;

@Repository
public interface ITipoPagoRepository extends JpaRepository<tipopago,Integer>{
    @Query("from tipopago tp where tp.Tipopago like %:TipoPago")
    List<tipopago> buscarNombre(@Param("TipoPago") String TipoPago);
}
