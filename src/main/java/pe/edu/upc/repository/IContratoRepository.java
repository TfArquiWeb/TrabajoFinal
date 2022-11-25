package pe.edu.upc.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Contrato;

import java.util.List;
@Repository
public interface IContratoRepository extends JpaRepository<Contrato,Integer> {
    //@Query("from contrato c where c.usuario.nombreusuario like %:nombreusuario")

    List<Contrato> findByUsuario(@Param("nombreUsuario") String nombreUsuario);
    //@Query("from contrato c where c.tipomoneda.TipodeMoneda like %:TipodeMoneda%")

   List<Contrato> findByTipodeMoneda(@Param("TipodeMoneda") String TipodeMoneda);

   //@Query("from contrato c where c.tipopago.tipopago like %:tipopago")
   List<Contrato> findByTipopago(@Param("tipopago") String tipopago);
}