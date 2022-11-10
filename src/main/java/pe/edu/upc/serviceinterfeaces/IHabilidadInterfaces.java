package pe.edu.upc.serviceinterfeaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.habilidad;

public interface IHabilidadInterfaces {
	public void insert(habilidad h);
	List<habilidad>list();
	public void eliminar(int id);
	public Optional<habilidad> listarId(int id);
	List<habilidad> buscardescHabilidad(String descHabilidad);
}
