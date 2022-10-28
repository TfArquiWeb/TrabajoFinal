package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.tipomoneda;

import java.util.List;

@Repository
public interface ITipoMonedaRepository extends JpaRepository<tipomoneda,Integer>{
    @Query("from tipomoneda t where t.tipode_moneda like %:tipode_moneda")
    List<tipomoneda> buscarNombre(@Param("tipode_moneda")String tipode_moneda);
}
