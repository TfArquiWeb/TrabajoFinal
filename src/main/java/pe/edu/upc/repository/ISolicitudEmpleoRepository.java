package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.solicitudempleo;

@Repository
public interface ISolicitudEmpleoRepository extends JpaRepository<solicitudempleo,Integer>{

}
