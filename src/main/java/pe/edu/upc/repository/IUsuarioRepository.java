package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<usuario, Integer> {

}
