package pe.edu.upc.serviceinterfeaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Empresario;

public interface IEmpresarioService {
    public boolean insertar(Empresario empresario);

    public void eliminar(int id);

    Optional<Empresario> listarId(int id);

    List<Empresario> listar();

    List<Empresario> buscarUsuario(String nombreUsuario);

    List<Empresario> buscarEmpresario(String razonEmpresario);

    List<Empresario> findByRucEmpresario(int rucEmpresario);
}
