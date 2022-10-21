package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.empresario;
import pe.edu.upc.repository.IEmpresarioRepository;
import pe.edu.upc.serviceinterfeaces.IEmpresarioInterfaces;
@Service
public class EmpresarioImpl implements IEmpresarioInterfaces{
	@Autowired
	private IEmpresarioRepository eR;
	@Override
	public void insert(empresario e) {
		// TODO Auto-generated method stub
		eR.save(e);
	}

	@Override
	public List<empresario> list() {
		// TODO Auto-generated method stub
		return eR.findAll();
	}

}
