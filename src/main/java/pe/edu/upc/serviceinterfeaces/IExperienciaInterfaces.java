package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.experiencia;

public interface IExperienciaInterfaces {
	public void insert(experiencia e);
	List<experiencia>list();

	public void delete(int id);

	List<experiencia>search(String descExperiencia);
}