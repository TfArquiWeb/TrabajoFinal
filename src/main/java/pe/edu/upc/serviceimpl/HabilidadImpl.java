package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.habilidad;
import pe.edu.upc.repository.IHabilidadRepository;
import pe.edu.upc.serviceinterfeaces.IHabilidadInterfaces;
@Service
public class HabilidadImpl implements IHabilidadInterfaces{
	@Autowired
	private IHabilidadRepository hR;
	@Override
	public void insert(habilidad h) {
		// TODO Auto-generated method stub
		hR.save(h);
	}

	@Override
	public List<habilidad> list() {
		// TODO Auto-generated method stub
		return hR.findAll();
	}

	@Override
	public void eliminar(int id) { hR.deleteById(id);}

	@Override
	public Optional<habilidad> listarId(int id) {return hR.findById(id);}

	@Override
	public List<habilidad> buscardescHabilidad(String descHabilidad) {return hR.buscardescHabilidad(descHabilidad);}

}
