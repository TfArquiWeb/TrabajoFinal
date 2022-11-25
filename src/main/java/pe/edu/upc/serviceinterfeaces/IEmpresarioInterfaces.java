package pe.edu.upc.serviceinterfeaces;

import pe.edu.upc.entity.empresario;
import pe.edu.upc.entity.respuestaEMP;

import java.util.List;
import java.util.Optional;

public interface IEmpresarioInterfaces {
    public boolean insert(empresario c);
    List<empresario> list();
    public void delet(int id);
    Optional<empresario> listarId(int id);
    List<empresario>searchdesc(String descEmpresario);
    List<empresario>searchUsu(String nombreUsuario);
    List<empresario>ordenarDesc();
    List<respuestaEMP>cantidadEmpresarios();
}