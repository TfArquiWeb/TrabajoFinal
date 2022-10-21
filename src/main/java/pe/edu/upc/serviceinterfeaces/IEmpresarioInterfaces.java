package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.empresario;

public interface IEmpresarioInterfaces {
	public void insert(empresario e);
	List<empresario>list();
}
