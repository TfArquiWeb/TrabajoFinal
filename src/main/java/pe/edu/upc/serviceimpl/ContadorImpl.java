package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.contador;
import pe.edu.upc.repository.IContadorRepository;
import pe.edu.upc.serviceinterfeaces.IContadorInterfaces;
@Service
public class ContadorImpl implements IContadorInterfaces {

	@Autowired
	private IContadorRepository coR;

	@Override
	public void insert(contador co) {
		// TODO Auto-generated method stub
		coR.save(co);
	}

	@Override
	public List<contador> list() {
		// TODO Auto-generated method stub
		return coR.findAll();
	}



}
