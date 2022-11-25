package pe.edu.upc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.contador;

@Repository
public interface IContadorRepository extends JpaRepository<contador, Integer>{
	@Query("from contador c where c.descContador like %:descContador%")
    List<contador> Buscardesc(@Param("descContador")String descContador);

    @Query("from contador c where c.usuario.nombreUsuario like %:nombreUsuario")
    List<contador> BuscarUsuario(@Param("nombreUsuario")String nombreUsuario);
    
    @Query(value="Select * from contador order by id desc",nativeQuery = true)
    List<contador>ordenarDesc();
    
    @Query(value="select u.nombre_usuario,count(c.id)from contador c inner join usuario u on c.usuario=u.id group by u.nombre_usuario  order by u.nombre_usuario asc",nativeQuery = true)
	List<String[]>cantidadContadores();
}

