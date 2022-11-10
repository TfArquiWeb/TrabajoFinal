package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.entity.contador;
import pe.edu.upc.repository.IContadorRepository;
import pe.edu.upc.serviceinterfeaces.IContadorInterfaces;

@RestController
public class ContadorImpl implements IContadorInterfaces{

	@Autowired
	private IContadorRepository cR;
	
	@Override
	@Transactional
	public boolean insert(contador c) {
		// TODO Auto-generated method stub
		contador objcontador = cR.save(c);
		if (objcontador==null) {
			return false;
		}else
		{
			return true;
		}
	}

	@Override
	public List<contador> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}

	@Override
	@Transactional
	public void delet(int id) {
		// TODO Auto-generated method stub
		cR.deleteById(id);
	}
	
	@Override
	public Optional<contador> listarId(int id) {
		// TODO Auto-generated method stub
		return cR.findById(id);
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
