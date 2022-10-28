package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.tipomoneda;

public interface ITipomonedaInterfaces {
	public void insert(tipomoneda t);
	List<tipomoneda>list();

	public void delete(int id);

	List<tipomoneda> search(String tipodemoneda);
}
