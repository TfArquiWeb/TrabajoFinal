package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.tipomoneda;

import java.util.List;

@Repository
public interface ITipoMonedaRepository extends JpaRepository<tipomoneda,Integer>{
    @Query("from tipomoneda t where t.TipodeMoneda like %:TipodeMoneda")
    List<tipomoneda> buscarNombre(@Param("TipodeMoneda") String TipodeMoneda);
}
