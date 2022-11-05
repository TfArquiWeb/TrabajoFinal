package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<usuario, Integer> {
    @Query("from usuario u where u.nombreUsuario like %:nombreUsuario")
    List<usuario> BuscarNonbre(@Param("nombreUsuario")String nombreUsuario);

}
