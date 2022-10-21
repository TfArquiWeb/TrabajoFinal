package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.solicitudempleo;

public interface ISolicitudEmpleoInterfaces {
	public void insert(solicitudempleo s);
	List<solicitudempleo>list();
}
