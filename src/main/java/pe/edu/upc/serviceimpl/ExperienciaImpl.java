package pe.edu.upc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Capacitacion;
import pe.edu.upc.entity.experiencia;
import pe.edu.upc.repository.IExperienciaRepository;
import pe.edu.upc.serviceinterfeaces.IExperienciaInterfaces;
@Service
public class ExperienciaImpl implements IExperienciaInterfaces{
	@Autowired
	private IExperienciaRepository eR;
	@Override
	public void insert(experiencia e) {
		// TODO Auto-generated method stub
		eR.save(e);
	}

	@Override
	public List<experiencia> list() {
		// TODO Auto-generated method stub
		return eR.findAll();
	}

	@Override
	public void eliminar(int id) {eR.deleteById(id);}
	@Override
	public List<experiencia> buscardescExperiencia(String descExperiencia) {return eR.buscardescExperiencia(descExperiencia);}

}
