package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.solicitudempleo;
import pe.edu.upc.repository.ISolicitudEmpleoRepository;
import pe.edu.upc.serviceinterfeaces.ISolicitudEmpleoInterfaces;
@Service
public class SolicitudEmpleoImpl implements ISolicitudEmpleoInterfaces {

	@Autowired
	private ISolicitudEmpleoRepository sR;

	@Override
	public void insert(solicitudempleo s) {
		// TODO Auto-generated method stub
		sR.save(s);
	}

	@Override
	public List<solicitudempleo> list() {
		// TODO Auto-generated method stub
		return sR.findAll();
	}

}
