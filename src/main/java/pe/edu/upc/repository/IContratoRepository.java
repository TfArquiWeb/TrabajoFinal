package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Contrato;

import java.util.List;
@Repository
public interface IContratoRepository extends JpaRepository<Contrato,Integer> {
    /*@Query("from Contrato c where c.usuario.nombreUsuario like %:nombreUsuario");*/
    List<Contrato> findByUsuario(@Param("nombreUsuario") String nombreUsuario);

   // @Query("from Contrato c where c.tipomoneda.TipodeMoneda like %:TipodeMoneda%");
   // List<Contrato>  BuscarTipodeMoneda(@Param("TipodeMoneda") String TipodeMoneda);
}