package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.tipomoneda;
import java.util.List;
import java.util.Optional;

public interface ITipomonedaInterfaces {
	public void insert(tipomoneda t);
	List<tipomoneda>list();

	public void delete(int id);

	public Optional<tipomoneda> listarId(int id);

	List<tipomoneda> search(String tipodemoneda);
}
