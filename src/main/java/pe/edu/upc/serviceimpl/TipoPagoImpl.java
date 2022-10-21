package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.tipopago;
import pe.edu.upc.repository.ITipoPagoRepository;
import pe.edu.upc.serviceinterfeaces.ITipoPagoInterfaces;
@Service
public class TipoPagoImpl implements ITipoPagoInterfaces{
	@Autowired
	private ITipoPagoRepository tpR;
	@Override
	public void insert(tipopago tp) {
		// TODO Auto-generated method stub
		tpR.save(tp);
	}

	@Override
	public List<tipopago> list() {
		// TODO Auto-generated method stub
		return tpR.findAll();
	}

}
