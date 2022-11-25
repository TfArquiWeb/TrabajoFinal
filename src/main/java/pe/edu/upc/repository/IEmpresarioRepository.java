package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.entity.empresario;

import java.util.List;

public interface IEmpresarioRepository extends JpaRepository<empresario, Integer> {
    @Query("from empresario e where e.descEmpresario like %:descEmpresario%")
    List<empresario> Buscardesc(@Param("descEmpresario")String descEmpresario);


    @Query("from empresario e where e.usuario.nombreUsuario like %:nombreUsuario")
    List<empresario> BuscarUsuario(@Param("nombreUsuario")String nombreUsuario);

    @Query(value="Select * from empresario order by id desc",nativeQuery = true)
    List<empresario>ordenarDesc();

    @Query(value="select u.nombre_usuario,count(e.id)from empresario e inner join usuario u on e.usuario=u.id group by u.nombre_usuario  order by u.nombre_usuario asc",nativeQuery = true)
    List<String[]>cantidadEmpresarios();
}

