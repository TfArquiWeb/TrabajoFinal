package pe.edu.upc.serviceinterfeaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.contador;

public interface IContadorInterfaces {
	public boolean insert(contador c);
	List<contador>list();
	public void delet(int id);
	Optional<contador> listarId(int id);
	List<contador>searchdesc(String descContador);
	List<contador>searchUsu(String nombreUsuario);
}
