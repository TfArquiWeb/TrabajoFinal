package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entity.Empresario;

import java.util.List;

@Repository
public interface IEmpresarioRepository extends JpaRepository<Empresario,Integer> {
    @Query("from Empresario e where e.usuario.dniUsuario like %:nombreUsuario%")
    List<Empresario> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Empresario e where e.razonEmpresario like %:razonEmpresario%")
    List<Empresario> buscarEmpresario(@Param("razonEmpresario") String razonEmpresario);

    List<Empresario> findByRuc(int rucEmpresario);
}



