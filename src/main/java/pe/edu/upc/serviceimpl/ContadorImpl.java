package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.contador;
import pe.edu.upc.repository.IContadorRepository;
import pe.edu.upc.serviceinterfeaces.IContadorInterfaces;
@Service
public class ContadorImpl implements IContadorInterfaces{

	@Autowired
	private IContadorRepository cR;
	@Override
	public void insert(contador c) {
		// TODO Auto-generated method stub
		cR.save(c);
	}

	@Override
	public List<contador> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}

	@Override
	public void delet(int idcontador) {
		// TODO Auto-generated method stub
		cR.deleteById(idcontador);
	}

	@Override
	public List<contador> searchdesc(String descContador) {
		// TODO Auto-generated method stub
		return cR.Buscardesc(descContador);
	}

	@Override
	public List<contador> searchUsu(String nombreUsuario) {
		// TODO Auto-generated method stub
		return cR.BuscarUsuario(nombreUsuario);
	}

}
