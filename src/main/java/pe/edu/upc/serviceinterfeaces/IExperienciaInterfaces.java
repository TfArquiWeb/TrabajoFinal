package pe.edu.upc.serviceinterfeaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.experiencia;

public interface IExperienciaInterfaces {
	public void insert(experiencia e);
	List<experiencia> list();
	public void delete(int id);
	public Optional<experiencia> listarId(int id);
	List<experiencia> buscardescExperiencia(String descExperiencia);
}