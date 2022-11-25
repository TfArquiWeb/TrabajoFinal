package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.entity.usuario;
import pe.edu.upc.repository.IUsuarioRepository;
import pe.edu.upc.serviceinterfeaces.IUsuarioIntefaces;

@Service
public class UsuarioImpl implements IUsuarioIntefaces{
	@Autowired
	private IUsuarioRepository uR;
	@Override
	public void insert(usuario u) {
		// TODO Auto-generated method stub

		uR.save(u);
	}

	@Override
	public List<usuario> list() {
		// TODO Auto-generated method stub
		return uR.findAll();
	}	

	@Override
	public List<usuario> search(String nombreUsuario) {
		return uR.BuscarNonbre(nombreUsuario);
	}

	@Override
	public Optional<usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return uR.findById(id);
	}

	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub
		uR.deleteById(id);
	}

}

