package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.empresario;
@Repository
public interface IEmpresarioRepository extends JpaRepository<empresario,Integer>{

}
