package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.capacitacion;
import pe.edu.upc.repository.ICapacitacionRepository;
import pe.edu.upc.serviceinterfeaces.ICapacitacionInterfaces;
@Service
public class CapacitacionImpl implements ICapacitacionInterfaces{
	@Autowired
	private ICapacitacionRepository cR;
	@Override
	public void insert(capacitacion c) {
		// TODO Auto-generated method stub
		cR.save(c);
	}

	@Override
	public List<capacitacion> list() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}

}
