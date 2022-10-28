package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.usuario;
@Repository
public interface IUsuarioRepository extends JpaRepository<usuario, Integer> {
	@Query("from usuario u where u.nombreUsuario like %:nombreUsuario")
    List<usuario> BuscarNombre(@Param("nombreUsuario")String nombreUsuario);
}
