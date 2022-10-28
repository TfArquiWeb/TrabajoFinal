package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.tipomoneda;
import pe.edu.upc.repository.ITipoMonedaRepository;
import pe.edu.upc.serviceinterfeaces.ITipomonedaInterfaces;
@Service
public class TipomonedaImpl implements ITipomonedaInterfaces{
	@Autowired
	private ITipoMonedaRepository tR;
	@Override
	public void insert(tipomoneda t) {
		// TODO Auto-generated method stub
		tR.save(t);
	}

	@Override
	public List<tipomoneda> list() {
		// TODO Auto-generated method stub
		return tR.findAll();
	}

	@Override
	public void delete(int idTipoMoneda) {
		// TODO Auto-generated method stub
		tR.deleteById(idTipoMoneda);
	}

	@Override
	public List<tipomoneda> search(String tipodemoneda){
		return tR.buscarNombre(tipodemoneda);
	}
}
