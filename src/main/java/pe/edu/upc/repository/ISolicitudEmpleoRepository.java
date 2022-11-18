package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.solicitudempleo;

import java.util.List;

@Repository
public interface ISolicitudEmpleoRepository extends JpaRepository<solicitudempleo,Integer> {
    @Query("from solicitudempleo se where se.estadoSE  like %:estadoSE%")
    List<solicitudempleo> Buscarestado(@Param("estadoSE")String estadoSE);

    @Query(value="Select * from contador order by id desc",nativeQuery = true)
    List<solicitudempleo> Ordenardesc();


}
