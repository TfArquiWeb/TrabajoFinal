package pe.edu.upc.serviceinterfeaces;

import java.util.List;

import pe.edu.upc.entity.tipopago;

public interface ITipoPagoInterfaces {
	public void insert(tipopago tp);
	List<tipopago>list();

	public void delete(int id);

	List<tipopago> search(String TipoPago);
}
