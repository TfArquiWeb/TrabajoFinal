package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.contador;

public interface IContadorInterfaces {
	public void insert(contador c);
	List<contador>list();
	public void delet(int id);
	List<contador>searchdesc(String descContador);
	List<contador>searchUsu(String nombreUsuario);
}
