package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Capacitacion;

import java.util.List;

@Repository
public interface ICapacitacionRepository extends JpaRepository<Capacitacion,Integer>{
    @Query("from Capacitacion c where c.descCapacitacion like %:descCapacitacion")
    List<Capacitacion> BuscarNombre(@Param("descCapacitacion")String descCapacitacion);
}
